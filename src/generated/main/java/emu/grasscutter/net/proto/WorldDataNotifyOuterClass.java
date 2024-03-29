// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldDataNotify.proto

package emu.grasscutter.net.proto;

public final class WorldDataNotifyOuterClass {
  private WorldDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    int getWorldPropMapCount();
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    boolean containsWorldPropMap(
        int key);
    /**
     * Use {@link #getWorldPropMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
    getWorldPropMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
    getWorldPropMapMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    /* nullable */
emu.grasscutter.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.PropValueOuterClass.PropValue defaultValue);
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    emu.grasscutter.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code WorldDataNotify}
   */
  public static final class WorldDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldDataNotify)
      WorldDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldDataNotify.newBuilder() to construct.
    private WorldDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetWorldPropMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.class, emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code WorldDataNotify.HGHHBKAGAAH}
     */
    public enum HGHHBKAGAAH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 3244;</code>
       */
      PEPPOHPHJOJ(1, 3244),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HGHHBKAGAAH DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final HGHHBKAGAAH EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 3244;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 3244;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static HGHHBKAGAAH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HGHHBKAGAAH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 3244: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HGHHBKAGAAH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HGHHBKAGAAH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HGHHBKAGAAH>() {
              public HGHHBKAGAAH findValueByNumber(int number) {
                return HGHHBKAGAAH.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final HGHHBKAGAAH[] VALUES = getStaticValuesArray();
      private static HGHHBKAGAAH[] getStaticValuesArray() {
        return new HGHHBKAGAAH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static HGHHBKAGAAH valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private HGHHBKAGAAH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:WorldDataNotify.HGHHBKAGAAH)
    }

    public static final int WORLDPROPMAP_FIELD_NUMBER = 3;
    private static final class WorldPropMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>newDefaultInstance(
                  emu.grasscutter.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_WorldPropMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.PropValueOuterClass.PropValue.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> worldPropMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
    internalGetWorldPropMap() {
      if (worldPropMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            WorldPropMapDefaultEntryHolder.defaultEntry);
      }
      return worldPropMap_;
    }
    public int getWorldPropMapCount() {
      return internalGetWorldPropMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    @java.lang.Override
    public boolean containsWorldPropMap(
        int key) {
      
      return internalGetWorldPropMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getWorldPropMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getWorldPropMap() {
      return getWorldPropMapMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getWorldPropMapMap() {
      return internalGetWorldPropMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.grasscutter.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.PropValueOuterClass.PropValue defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
          internalGetWorldPropMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
          internalGetWorldPropMap().getMap();
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
          internalGetWorldPropMap(),
          WorldPropMapDefaultEntryHolder.defaultEntry,
          3);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> entry
           : internalGetWorldPropMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
        worldPropMap__ = WorldPropMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, worldPropMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify other = (emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify) obj;

      if (!internalGetWorldPropMap().equals(
          other.internalGetWorldPropMap())) return false;
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
      if (!internalGetWorldPropMap().getMap().isEmpty()) {
        hash = (37 * hash) + WORLDPROPMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetWorldPropMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify prototype) {
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
     * Protobuf type {@code WorldDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldDataNotify)
        emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetWorldPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMutableWorldPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.class, emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.newBuilder()
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
        internalGetMutableWorldPropMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify build() {
        emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify buildPartial() {
        emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify result = new emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.worldPropMap_ = internalGetWorldPropMap();
          result.worldPropMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify other) {
        if (other == emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.getDefaultInstance()) return this;
        internalGetMutableWorldPropMap().mergeFrom(
            other.internalGetWorldPropMap());
        bitField0_ |= 0x00000001;
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
                com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
                worldPropMap__ = input.readMessage(
                    WorldPropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableWorldPropMap().getMutableMap().put(
                    worldPropMap__.getKey(), worldPropMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 26
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
          java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> worldPropMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
          internalGetWorldPropMap() {
        if (worldPropMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              WorldPropMapDefaultEntryHolder.defaultEntry);
        }
        return worldPropMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
          internalGetMutableWorldPropMap() {
        if (worldPropMap_ == null) {
          worldPropMap_ = com.google.protobuf.MapField.newMapField(
              WorldPropMapDefaultEntryHolder.defaultEntry);
        }
        if (!worldPropMap_.isMutable()) {
          worldPropMap_ = worldPropMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return worldPropMap_;
      }
      public int getWorldPropMapCount() {
        return internalGetWorldPropMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
       */
      @java.lang.Override
      public boolean containsWorldPropMap(
          int key) {
        
        return internalGetWorldPropMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getWorldPropMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getWorldPropMap() {
        return getWorldPropMapMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getWorldPropMapMap() {
        return internalGetWorldPropMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.grasscutter.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrDefault(
          int key,
          /* nullable */
emu.grasscutter.net.proto.PropValueOuterClass.PropValue defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
            internalGetWorldPropMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> map =
            internalGetWorldPropMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearWorldPropMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableWorldPropMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
       */
      public Builder removeWorldPropMap(
          int key) {
        
        internalGetMutableWorldPropMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue>
          getMutableWorldPropMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableWorldPropMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
       */
      public Builder putWorldPropMap(
          int key,
          emu.grasscutter.net.proto.PropValueOuterClass.PropValue value) {
        
        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableWorldPropMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; worldPropMap = 3;</code>
       */
      public Builder putAllWorldPropMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.PropValueOuterClass.PropValue> values) {
        internalGetMutableWorldPropMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:WorldDataNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldDataNotify)
    private static final emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify();
    }

    public static emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldDataNotify>() {
      @java.lang.Override
      public WorldDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WorldDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldDataNotifyOuterClass.WorldDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldDataNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldDataNotify_WorldPropMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldDataNotify_WorldPropMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025WorldDataNotify.proto\032\017PropValue.proto" +
      "\"\356\001\n\017WorldDataNotify\0228\n\014worldPropMap\030\003 \003" +
      "(\0132\".WorldDataNotify.WorldPropMapEntry\032?" +
      "\n\021WorldPropMapEntry\022\013\n\003key\030\001 \001(\r\022\031\n\005valu" +
      "e\030\002 \001(\0132\n.PropValue:\0028\001\"`\n\013HGHHBKAGAAH\022\010" +
      "\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\254\031\022\017\n\013DCDNILFDFL" +
      "B\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020" +
      "\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PropValueOuterClass.getDescriptor(),
        });
    internal_static_WorldDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldDataNotify_descriptor,
        new java.lang.String[] { "WorldPropMap", });
    internal_static_WorldDataNotify_WorldPropMapEntry_descriptor =
      internal_static_WorldDataNotify_descriptor.getNestedTypes().get(0);
    internal_static_WorldDataNotify_WorldPropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldDataNotify_WorldPropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.PropValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
