// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AiSkillCdInfo.proto

package emu.grasscutter.net.proto;

public final class AiSkillCdInfoOuterClass {
  private AiSkillCdInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AiSkillCdInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AiSkillCdInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    int getSkillCdMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    boolean containsSkillCdMap(
        int key);
    /**
     * Use {@link #getSkillCdMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSkillCdMap();
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSkillCdMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    int getSkillCdMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    int getSkillCdMapOrThrow(
        int key);

    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    int getSkillGroupCdMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    boolean containsSkillGroupCdMap(
        int key);
    /**
     * Use {@link #getSkillGroupCdMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSkillGroupCdMap();
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getSkillGroupCdMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    int getSkillGroupCdMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    int getSkillGroupCdMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code AiSkillCdInfo}
   */
  public static final class AiSkillCdInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AiSkillCdInfo)
      AiSkillCdInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AiSkillCdInfo.newBuilder() to construct.
    private AiSkillCdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AiSkillCdInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AiSkillCdInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.internal_static_AiSkillCdInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 14:
          return internalGetSkillCdMap();
        case 3:
          return internalGetSkillGroupCdMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.internal_static_AiSkillCdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.class, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.Builder.class);
    }

    public static final int SKILLCDMAP_FIELD_NUMBER = 14;
    private static final class SkillCdMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.internal_static_AiSkillCdInfo_SkillCdMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> skillCdMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetSkillCdMap() {
      if (skillCdMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SkillCdMapDefaultEntryHolder.defaultEntry);
      }
      return skillCdMap_;
    }
    public int getSkillCdMapCount() {
      return internalGetSkillCdMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    @java.lang.Override
    public boolean containsSkillCdMap(
        int key) {
      
      return internalGetSkillCdMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSkillCdMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillCdMap() {
      return getSkillCdMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillCdMapMap() {
      return internalGetSkillCdMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    @java.lang.Override
    public int getSkillCdMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSkillCdMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
     */
    @java.lang.Override
    public int getSkillCdMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSkillCdMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int SKILLGROUPCDMAP_FIELD_NUMBER = 3;
    private static final class SkillGroupCdMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.internal_static_AiSkillCdInfo_SkillGroupCdMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> skillGroupCdMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetSkillGroupCdMap() {
      if (skillGroupCdMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SkillGroupCdMapDefaultEntryHolder.defaultEntry);
      }
      return skillGroupCdMap_;
    }
    public int getSkillGroupCdMapCount() {
      return internalGetSkillGroupCdMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    @java.lang.Override
    public boolean containsSkillGroupCdMap(
        int key) {
      
      return internalGetSkillGroupCdMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSkillGroupCdMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillGroupCdMap() {
      return getSkillGroupCdMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillGroupCdMapMap() {
      return internalGetSkillGroupCdMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    @java.lang.Override
    public int getSkillGroupCdMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSkillGroupCdMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
     */
    @java.lang.Override
    public int getSkillGroupCdMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetSkillGroupCdMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSkillGroupCdMap(),
          SkillGroupCdMapDefaultEntryHolder.defaultEntry,
          3);
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSkillCdMap(),
          SkillCdMapDefaultEntryHolder.defaultEntry,
          14);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetSkillGroupCdMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        skillGroupCdMap__ = SkillGroupCdMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, skillGroupCdMap__);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetSkillCdMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        skillCdMap__ = SkillCdMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(14, skillCdMap__);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo other = (emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo) obj;

      if (!internalGetSkillCdMap().equals(
          other.internalGetSkillCdMap())) return false;
      if (!internalGetSkillGroupCdMap().equals(
          other.internalGetSkillGroupCdMap())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (!internalGetSkillCdMap().getMap().isEmpty()) {
        hash = (37 * hash) + SKILLCDMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSkillCdMap().hashCode();
      }
      if (!internalGetSkillGroupCdMap().getMap().isEmpty()) {
        hash = (37 * hash) + SKILLGROUPCDMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSkillGroupCdMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AiSkillCdInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AiSkillCdInfo)
        emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.internal_static_AiSkillCdInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 14:
            return internalGetSkillCdMap();
          case 3:
            return internalGetSkillGroupCdMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 14:
            return internalGetMutableSkillCdMap();
          case 3:
            return internalGetMutableSkillGroupCdMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.internal_static_AiSkillCdInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.class, emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        internalGetMutableSkillCdMap().clear();
        internalGetMutableSkillGroupCdMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.internal_static_AiSkillCdInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo build() {
        emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo buildPartial() {
        emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo result = new emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skillCdMap_ = internalGetSkillCdMap();
          result.skillCdMap_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.skillGroupCdMap_ = internalGetSkillGroupCdMap();
          result.skillGroupCdMap_.makeImmutable();
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo other) {
        if (other == emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo.getDefaultInstance()) return this;
        internalGetMutableSkillCdMap().mergeFrom(
            other.internalGetSkillCdMap());
        bitField0_ |= 0x00000001;
        internalGetMutableSkillGroupCdMap().mergeFrom(
            other.internalGetSkillGroupCdMap());
        bitField0_ |= 0x00000002;
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 26: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                skillGroupCdMap__ = input.readMessage(
                    SkillGroupCdMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableSkillGroupCdMap().getMutableMap().put(
                    skillGroupCdMap__.getKey(), skillGroupCdMap__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 26
              case 114: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                skillCdMap__ = input.readMessage(
                    SkillCdMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableSkillCdMap().getMutableMap().put(
                    skillCdMap__.getKey(), skillCdMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 114
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> skillCdMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetSkillCdMap() {
        if (skillCdMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SkillCdMapDefaultEntryHolder.defaultEntry);
        }
        return skillCdMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutableSkillCdMap() {
        if (skillCdMap_ == null) {
          skillCdMap_ = com.google.protobuf.MapField.newMapField(
              SkillCdMapDefaultEntryHolder.defaultEntry);
        }
        if (!skillCdMap_.isMutable()) {
          skillCdMap_ = skillCdMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return skillCdMap_;
      }
      public int getSkillCdMapCount() {
        return internalGetSkillCdMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
       */
      @java.lang.Override
      public boolean containsSkillCdMap(
          int key) {
        
        return internalGetSkillCdMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSkillCdMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillCdMap() {
        return getSkillCdMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillCdMapMap() {
        return internalGetSkillCdMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
       */
      @java.lang.Override
      public int getSkillCdMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSkillCdMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
       */
      @java.lang.Override
      public int getSkillCdMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSkillCdMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearSkillCdMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableSkillCdMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
       */
      public Builder removeSkillCdMap(
          int key) {
        
        internalGetMutableSkillCdMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutableSkillCdMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableSkillCdMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
       */
      public Builder putSkillCdMap(
          int key,
          int value) {
        
        
        internalGetMutableSkillCdMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillCdMap = 14;</code>
       */
      public Builder putAllSkillCdMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableSkillCdMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> skillGroupCdMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetSkillGroupCdMap() {
        if (skillGroupCdMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SkillGroupCdMapDefaultEntryHolder.defaultEntry);
        }
        return skillGroupCdMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutableSkillGroupCdMap() {
        if (skillGroupCdMap_ == null) {
          skillGroupCdMap_ = com.google.protobuf.MapField.newMapField(
              SkillGroupCdMapDefaultEntryHolder.defaultEntry);
        }
        if (!skillGroupCdMap_.isMutable()) {
          skillGroupCdMap_ = skillGroupCdMap_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return skillGroupCdMap_;
      }
      public int getSkillGroupCdMapCount() {
        return internalGetSkillGroupCdMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
       */
      @java.lang.Override
      public boolean containsSkillGroupCdMap(
          int key) {
        
        return internalGetSkillGroupCdMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSkillGroupCdMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillGroupCdMap() {
        return getSkillGroupCdMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getSkillGroupCdMapMap() {
        return internalGetSkillGroupCdMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
       */
      @java.lang.Override
      public int getSkillGroupCdMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSkillGroupCdMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
       */
      @java.lang.Override
      public int getSkillGroupCdMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetSkillGroupCdMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearSkillGroupCdMap() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableSkillGroupCdMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
       */
      public Builder removeSkillGroupCdMap(
          int key) {
        
        internalGetMutableSkillGroupCdMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutableSkillGroupCdMap() {
        bitField0_ |= 0x00000002;
        return internalGetMutableSkillGroupCdMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
       */
      public Builder putSkillGroupCdMap(
          int key,
          int value) {
        
        
        internalGetMutableSkillGroupCdMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; skillGroupCdMap = 3;</code>
       */
      public Builder putAllSkillGroupCdMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableSkillGroupCdMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:AiSkillCdInfo)
    }

    // @@protoc_insertion_point(class_scope:AiSkillCdInfo)
    private static final emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo();
    }

    public static emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AiSkillCdInfo>
        PARSER = new com.google.protobuf.AbstractParser<AiSkillCdInfo>() {
      @java.lang.Override
      public AiSkillCdInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<AiSkillCdInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AiSkillCdInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AiSkillCdInfoOuterClass.AiSkillCdInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AiSkillCdInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AiSkillCdInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AiSkillCdInfo_SkillCdMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AiSkillCdInfo_SkillCdMapEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AiSkillCdInfo_SkillGroupCdMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AiSkillCdInfo_SkillGroupCdMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023AiSkillCdInfo.proto\"\354\001\n\rAiSkillCdInfo\022" +
      "2\n\nskillCdMap\030\016 \003(\0132\036.AiSkillCdInfo.Skil" +
      "lCdMapEntry\022<\n\017skillGroupCdMap\030\003 \003(\0132#.A" +
      "iSkillCdInfo.SkillGroupCdMapEntry\0321\n\017Ski" +
      "llCdMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r" +
      ":\0028\001\0326\n\024SkillGroupCdMapEntry\022\013\n\003key\030\001 \001(" +
      "\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AiSkillCdInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AiSkillCdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AiSkillCdInfo_descriptor,
        new java.lang.String[] { "SkillCdMap", "SkillGroupCdMap", });
    internal_static_AiSkillCdInfo_SkillCdMapEntry_descriptor =
      internal_static_AiSkillCdInfo_descriptor.getNestedTypes().get(0);
    internal_static_AiSkillCdInfo_SkillCdMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AiSkillCdInfo_SkillCdMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_AiSkillCdInfo_SkillGroupCdMapEntry_descriptor =
      internal_static_AiSkillCdInfo_descriptor.getNestedTypes().get(1);
    internal_static_AiSkillCdInfo_SkillGroupCdMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AiSkillCdInfo_SkillGroupCdMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
