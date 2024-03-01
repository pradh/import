// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LogLocation.proto

package org.datacommons.proto;

public final class LogLocation {
  private LogLocation() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface LocationOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:org.datacommons.proto.Location)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Name of the file. Could be a full path or not. Typically, this is
     * an MCF file or CSV.
     * </pre>
     *
     * <code>optional string file = 1;</code>
     *
     * @return Whether the file field is set.
     */
    boolean hasFile();
    /**
     *
     *
     * <pre>
     * Name of the file. Could be a full path or not. Typically, this is
     * an MCF file or CSV.
     * </pre>
     *
     * <code>optional string file = 1;</code>
     *
     * @return The file.
     */
    java.lang.String getFile();
    /**
     *
     *
     * <pre>
     * Name of the file. Could be a full path or not. Typically, this is
     * an MCF file or CSV.
     * </pre>
     *
     * <code>optional string file = 1;</code>
     *
     * @return The bytes for file.
     */
    com.google.protobuf.ByteString getFileBytes();

    /**
     *
     *
     * <pre>
     * Line number in file, starting from 1.  Matches the row number in
     * CSV (since we do not handle newlines in values).
     * </pre>
     *
     * <code>optional int64 line_number = 2;</code>
     *
     * @return Whether the lineNumber field is set.
     */
    boolean hasLineNumber();
    /**
     *
     *
     * <pre>
     * Line number in file, starting from 1.  Matches the row number in
     * CSV (since we do not handle newlines in values).
     * </pre>
     *
     * <code>optional int64 line_number = 2;</code>
     *
     * @return The lineNumber.
     */
    long getLineNumber();
  }
  /** Protobuf type {@code org.datacommons.proto.Location} */
  public static final class Location extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:org.datacommons.proto.Location)
      LocationOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Location.newBuilder() to construct.
    private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Location() {
      file_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new Location();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Location(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                file_ = bs;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                lineNumber_ = input.readInt64();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return org.datacommons.proto.LogLocation
          .internal_static_org_datacommons_proto_Location_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.datacommons.proto.LogLocation
          .internal_static_org_datacommons_proto_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.datacommons.proto.LogLocation.Location.class,
              org.datacommons.proto.LogLocation.Location.Builder.class);
    }

    private int bitField0_;
    public static final int FILE_FIELD_NUMBER = 1;
    private volatile java.lang.Object file_;
    /**
     *
     *
     * <pre>
     * Name of the file. Could be a full path or not. Typically, this is
     * an MCF file or CSV.
     * </pre>
     *
     * <code>optional string file = 1;</code>
     *
     * @return Whether the file field is set.
     */
    @java.lang.Override
    public boolean hasFile() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Name of the file. Could be a full path or not. Typically, this is
     * an MCF file or CSV.
     * </pre>
     *
     * <code>optional string file = 1;</code>
     *
     * @return The file.
     */
    @java.lang.Override
    public java.lang.String getFile() {
      java.lang.Object ref = file_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          file_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the file. Could be a full path or not. Typically, this is
     * an MCF file or CSV.
     * </pre>
     *
     * <code>optional string file = 1;</code>
     *
     * @return The bytes for file.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFileBytes() {
      java.lang.Object ref = file_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        file_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LINE_NUMBER_FIELD_NUMBER = 2;
    private long lineNumber_;
    /**
     *
     *
     * <pre>
     * Line number in file, starting from 1.  Matches the row number in
     * CSV (since we do not handle newlines in values).
     * </pre>
     *
     * <code>optional int64 line_number = 2;</code>
     *
     * @return Whether the lineNumber field is set.
     */
    @java.lang.Override
    public boolean hasLineNumber() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Line number in file, starting from 1.  Matches the row number in
     * CSV (since we do not handle newlines in values).
     * </pre>
     *
     * <code>optional int64 line_number = 2;</code>
     *
     * @return The lineNumber.
     */
    @java.lang.Override
    public long getLineNumber() {
      return lineNumber_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, file_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(2, lineNumber_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, file_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, lineNumber_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof org.datacommons.proto.LogLocation.Location)) {
        return super.equals(obj);
      }
      org.datacommons.proto.LogLocation.Location other =
          (org.datacommons.proto.LogLocation.Location) obj;

      if (hasFile() != other.hasFile()) return false;
      if (hasFile()) {
        if (!getFile().equals(other.getFile())) return false;
      }
      if (hasLineNumber() != other.hasLineNumber()) return false;
      if (hasLineNumber()) {
        if (getLineNumber() != other.getLineNumber()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasFile()) {
        hash = (37 * hash) + FILE_FIELD_NUMBER;
        hash = (53 * hash) + getFile().hashCode();
      }
      if (hasLineNumber()) {
        hash = (37 * hash) + LINE_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLineNumber());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static org.datacommons.proto.LogLocation.Location parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static org.datacommons.proto.LogLocation.Location parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static org.datacommons.proto.LogLocation.Location parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(org.datacommons.proto.LogLocation.Location prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /** Protobuf type {@code org.datacommons.proto.Location} */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:org.datacommons.proto.Location)
        org.datacommons.proto.LogLocation.LocationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return org.datacommons.proto.LogLocation
            .internal_static_org_datacommons_proto_Location_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.datacommons.proto.LogLocation
            .internal_static_org_datacommons_proto_Location_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.datacommons.proto.LogLocation.Location.class,
                org.datacommons.proto.LogLocation.Location.Builder.class);
      }

      // Construct using org.datacommons.proto.LogLocation.Location.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        file_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        lineNumber_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return org.datacommons.proto.LogLocation
            .internal_static_org_datacommons_proto_Location_descriptor;
      }

      @java.lang.Override
      public org.datacommons.proto.LogLocation.Location getDefaultInstanceForType() {
        return org.datacommons.proto.LogLocation.Location.getDefaultInstance();
      }

      @java.lang.Override
      public org.datacommons.proto.LogLocation.Location build() {
        org.datacommons.proto.LogLocation.Location result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.datacommons.proto.LogLocation.Location buildPartial() {
        org.datacommons.proto.LogLocation.Location result =
            new org.datacommons.proto.LogLocation.Location(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.file_ = file_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.lineNumber_ = lineNumber_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.datacommons.proto.LogLocation.Location) {
          return mergeFrom((org.datacommons.proto.LogLocation.Location) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.datacommons.proto.LogLocation.Location other) {
        if (other == org.datacommons.proto.LogLocation.Location.getDefaultInstance()) return this;
        if (other.hasFile()) {
          bitField0_ |= 0x00000001;
          file_ = other.file_;
          onChanged();
        }
        if (other.hasLineNumber()) {
          setLineNumber(other.getLineNumber());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.datacommons.proto.LogLocation.Location parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.datacommons.proto.LogLocation.Location) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object file_ = "";
      /**
       *
       *
       * <pre>
       * Name of the file. Could be a full path or not. Typically, this is
       * an MCF file or CSV.
       * </pre>
       *
       * <code>optional string file = 1;</code>
       *
       * @return Whether the file field is set.
       */
      public boolean hasFile() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       *
       *
       * <pre>
       * Name of the file. Could be a full path or not. Typically, this is
       * an MCF file or CSV.
       * </pre>
       *
       * <code>optional string file = 1;</code>
       *
       * @return The file.
       */
      public java.lang.String getFile() {
        java.lang.Object ref = file_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            file_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the file. Could be a full path or not. Typically, this is
       * an MCF file or CSV.
       * </pre>
       *
       * <code>optional string file = 1;</code>
       *
       * @return The bytes for file.
       */
      public com.google.protobuf.ByteString getFileBytes() {
        java.lang.Object ref = file_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          file_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the file. Could be a full path or not. Typically, this is
       * an MCF file or CSV.
       * </pre>
       *
       * <code>optional string file = 1;</code>
       *
       * @param value The file to set.
       * @return This builder for chaining.
       */
      public Builder setFile(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        file_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the file. Could be a full path or not. Typically, this is
       * an MCF file or CSV.
       * </pre>
       *
       * <code>optional string file = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearFile() {
        bitField0_ = (bitField0_ & ~0x00000001);
        file_ = getDefaultInstance().getFile();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the file. Could be a full path or not. Typically, this is
       * an MCF file or CSV.
       * </pre>
       *
       * <code>optional string file = 1;</code>
       *
       * @param value The bytes for file to set.
       * @return This builder for chaining.
       */
      public Builder setFileBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        file_ = value;
        onChanged();
        return this;
      }

      private long lineNumber_;
      /**
       *
       *
       * <pre>
       * Line number in file, starting from 1.  Matches the row number in
       * CSV (since we do not handle newlines in values).
       * </pre>
       *
       * <code>optional int64 line_number = 2;</code>
       *
       * @return Whether the lineNumber field is set.
       */
      @java.lang.Override
      public boolean hasLineNumber() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       *
       *
       * <pre>
       * Line number in file, starting from 1.  Matches the row number in
       * CSV (since we do not handle newlines in values).
       * </pre>
       *
       * <code>optional int64 line_number = 2;</code>
       *
       * @return The lineNumber.
       */
      @java.lang.Override
      public long getLineNumber() {
        return lineNumber_;
      }
      /**
       *
       *
       * <pre>
       * Line number in file, starting from 1.  Matches the row number in
       * CSV (since we do not handle newlines in values).
       * </pre>
       *
       * <code>optional int64 line_number = 2;</code>
       *
       * @param value The lineNumber to set.
       * @return This builder for chaining.
       */
      public Builder setLineNumber(long value) {
        bitField0_ |= 0x00000002;
        lineNumber_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Line number in file, starting from 1.  Matches the row number in
       * CSV (since we do not handle newlines in values).
       * </pre>
       *
       * <code>optional int64 line_number = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearLineNumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lineNumber_ = 0L;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:org.datacommons.proto.Location)
    }

    // @@protoc_insertion_point(class_scope:org.datacommons.proto.Location)
    private static final org.datacommons.proto.LogLocation.Location DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.datacommons.proto.LogLocation.Location();
    }

    public static org.datacommons.proto.LogLocation.Location getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Location> PARSER =
        new com.google.protobuf.AbstractParser<Location>() {
          @java.lang.Override
          public Location parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Location(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Location> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Location> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.datacommons.proto.LogLocation.Location getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_org_datacommons_proto_Location_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_datacommons_proto_Location_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\021LogLocation.proto\022\025org.datacommons.pro"
          + "to\"-\n\010Location\022\014\n\004file\030\001 \001(\t\022\023\n\013line_num"
          + "ber\030\002 \001(\003"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_org_datacommons_proto_Location_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_org_datacommons_proto_Location_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_org_datacommons_proto_Location_descriptor,
            new java.lang.String[] {
              "File", "LineNumber",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
