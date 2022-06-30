/**
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { CsvData, MappedThing, Mapping, MappingType, MappingVal } from "../types";

const FIXED_CSV_TABLE = 'CSVTable';
const DCID_PROP = 'dcid';
const SVOBS_TYPE = 'StatVarObservation';
const PLACE_TYPE = 'Place';

function initNode(idx: number, type: string): Array<string> {
  var pvs = Array<string>();
  pvs.push('Node: E:' + FIXED_CSV_TABLE + '->E' + idx.toString());
  pvs.push('typeOf: dcs:' + type);  
  return pvs;
}

function getColPV(prop: string, col: string): string {
  return prop + ': C:' + FIXED_CSV_TABLE + '->' + col;
}

function getEntPV(prop: string, idx: number): string {
  return prop + ': E:' + FIXED_CSV_TABLE + '->E' + idx.toString();
}

/**
 * Generates the tmcf file given the correct mappings.
 * ASSUMES: checkMappings() returns success on |mappings|
 * 
 * @param mappings
 * @returns
 */
export function generateTMCF(mappings: Mapping): string {
  var commonPVs = Array<string>();
  var colHdrProp:MappedThing = null;
  var tmcfNodes = Array<Array<string>>();
  var idx = 0;

  // Do one pass over the mappings building the common PVs in all TMCF nodes.
  // Everything other than COLUMN_HEADER mappings get repeated in every node.
  mappings.forEach((mval: MappingVal, mthing: MappedThing) => {
    if (mval.type == MappingType.CONSTANT) {
      // Constants are references.
      commonPVs.push(mthing + ': dcid:' + mval.constant);
    } else if (mval.type == MappingType.COLUMN) {
      if (mthing == MappedThing.PLACE) {
        if (mval.placeProperty == DCID_PROP) {
          // Place with DCID property can be a column ref.
          commonPVs.push(getColPV(mthing, mval.column.id));
        } else {
          // For place with non-DCID property, we should introduce a place node,
          // and use entity reference.
          var node = initNode(idx, PLACE_TYPE);
          node.push(getColPV(mval.placeProperty, mval.column.id));
          tmcfNodes.push(node);
          commonPVs.push(getEntPV(mthing, idx));

          idx++;
        }
      } else {
        // For non-place types, column directly contains the corresponding values.
        commonPVs.push(getColPV(mthing, mval.column.id));
      }
    } else if (mval.type == MappingType.COLUMN_HEADER) {
      // Remember which mapped thing has the column header for next pass.
      // Validation has ensured there can be no more than one.
      colHdrProp = mthing;
    }
  });

  // Track the beginning of SVObs nodes.
  var beginObsIdx = idx;

  if (colHdrProp != null) {
    // Build one node per header entry.
    mappings.get(colHdrProp).headers.forEach((hdr) => {
      var node = initNode(idx, SVOBS_TYPE);
      // Each column contains numerical values of SVObs.
      node.push(getColPV(MappedThing.VALUE, hdr.id));
      node.push(colHdrProp + ': dcid:' + hdr.id);
      tmcfNodes.push(node);
      idx++;
    });
  } else {
    // There is only one node in this case.
    tmcfNodes.push(initNode(idx, SVOBS_TYPE));
    idx++;
  }

  // Add the common PVs to Obs TMCF nodes.
  for (let i = beginObsIdx; i < idx; i++) {
    tmcfNodes[i] = tmcfNodes[i].concat(commonPVs);
  }
  
  // Build newline delimited strings.
  var nodeStrings = Array<string>();
  tmcfNodes.forEach((pvs) => {
    nodeStrings.push(pvs.join("\n"));
    nodeStrings.push("");
  });
  return nodeStrings.join("\n");
}