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

import {
  Column,
  CsvData,
  MappedThing,
  Mapping,
  MappingType,
  MappingVal,
  Observation,
  RowObservations,
} from "../types";

// Helper maps used while generating observaitons.
interface ObsGenMaps {
  // Column Index -> mapping thing found in header for VALUE.
  valCol2Hdr: Map<number, MappedThing>;
  // Mapped thing -> column index (for non-VALUE)
  thing2Col: Map<MappedThing, number>;
  // Mapped thing -> constant value (for non-VALUE)
  thing2Const: Map<MappedThing, string>;
}

/**
 * Given a mapping and CSV Data computes the observations for every row
 * corresponding to |rowsForDisplay|.
 * ASSUMES: checkMappings() returns success on |mappings|
 */
export function generateRowObservations(
  mappings: Mapping,
  csvData: CsvData
): RowObservations {
  // Compute ObsGenMaps first.
  const obsGenMaps: ObsGenMaps = {
    valCol2Hdr: new Map<number, MappedThing>(),
    thing2Col: new Map<MappedThing, number>(),
    thing2Const: new Map<MappedThing, string>(),
  };
  for (const mthing of Array.from(mappings.keys())) {
    const mval: MappingVal = mappings.get(mthing);
    if (mval.type === MappingType.COLUMN_HEADER) {
      for (const hdr of mval.headers) {
        obsGenMaps.valCol2Hdr.set(hdr.columnIdx, mthing);
      }
    } else if (mval.type == MappingType.COLUMN) {
      if (mthing == MappedThing.VALUE) {
        obsGenMaps.valCol2Hdr.set(mval.column.columnIdx, mthing);
      } else {
        obsGenMaps.thing2Col.set(mthing, mval.column.columnIdx);
      }
    } else if (mval.type == MappingType.CONSTANT) {
      obsGenMaps.thing2Const.set(mthing, mval.constant);
    }
  }

  const rowObs: RowObservations = new Map();
  for (const idx of Array.from(csvData.rowsForDisplay.keys())) {
    const row = csvData.rowsForDisplay.get(idx);
    const obs = generateObservationsInRow(
      row,
      csvData.orderedColumns,
      obsGenMaps
    );
    if (obs.length > 0) {
      rowObs.set(idx, obs);
    }
  }
  return rowObs;
}

/**
 * Given an Observation that was returned from generateRowObservations(), returns
 * a human-readable string.
 */
export function observationToString(obs: Observation): string {
  const sv = obs.get(MappedThing.STAT_VAR);
  const place = obs.get(MappedThing.PLACE);
  const date = obs.get(MappedThing.DATE);
  const val = obs.get(MappedThing.VALUE);
  let outStr = `Value of ${sv} for ${place} in ${date} is ${val}`;
  if (obs.has(MappedThing.UNIT)) {
    outStr += ` ${obs.get(MappedThing.UNIT)}`;
  }
  return outStr;
}

function generateObservationsInRow(
  row: Array<string>,
  header: Array<Column>,
  obsGenMaps: ObsGenMaps
): Array<Observation> {
  const obsList = new Array<Observation>();
  for (const valColIdx of Array.from(obsGenMaps.valCol2Hdr.keys())) {
    const hdrThing = obsGenMaps.valCol2Hdr.get(valColIdx);
    const obs: Observation = new Map();
    // TODO: Consider if we want to do some cleaning and checking for non-numeric value.
    if (row[valColIdx] != null && row[valColIdx] !== "") {
      obs.set(MappedThing.VALUE, row[valColIdx]);
    }
    // If this is a COLUMN_HEADER case, get the corresponding header value.
    if (hdrThing !== MappedThing.VALUE) {
      obs.set(hdrThing, header[valColIdx].header);
    }
    for (const mthing of Array.from(obsGenMaps.thing2Col.keys())) {
      const colIdx = obsGenMaps.thing2Col.get(mthing);
      if (row[colIdx] != null && row[colIdx] !== "") {
        obs.set(mthing, row[colIdx]);
      }
    }
    for (const mthing of Array.from(obsGenMaps.thing2Const.keys())) {
      obs.set(mthing, obsGenMaps.thing2Const.get(mthing));
    }
    if (hasRequiredProps(obs)) {
      obsList.push(obs);
    }
  }
  return obsList;
}

function hasRequiredProps(obs: Observation): boolean {
  for (const mthing of [
    MappedThing.PLACE,
    MappedThing.STAT_VAR,
    MappedThing.DATE,
    MappedThing.VALUE,
  ]) {
    if (!obs.has(mthing)) {
      return false;
    }
  }
  return true;
}
