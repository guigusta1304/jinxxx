// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntityDisappearNotify.proto

package emu.grasscutter.net.proto;

public final class SceneEntityDisappearNotifyOuterClass {
  private SceneEntityDisappearNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityDisappearNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityDisappearNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 entityList = 13;</code>
     * @return A list containing the entityList.
     */
    java.util.List<java.lang.Integer> getEntityListList();
    /**
     * <code>repeated uint32 entityList = 13;</code>
     * @return The count of entityList.
     */
    int getEntityListCount();
    /**
     * <code>repeated uint32 entityList = 13;</code>
     * @param index The index of the element to return.
     * @return The entityList at the given index.
     */
    int getEntityList(int index);

    /**
     * <code>uint32 param = 10;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>.VisionType disappearType = 7;</code>
     * @return The enum numeric value on the wire for disappearType.
     */
    int getDisappearTypeValue();
    /**
     * <code>.VisionType disappearType = 7;</code>
     * @return The disappearType.
     */
    emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType getDisappearType();
  }
  /**
   * Protobuf type {@code SceneEntityDisappearNotify}
   */
  public static final class SceneEntityDisappearNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntityDisappearNotify)
      SceneEntityDisappearNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntityDisappearNotify.newBuilder() to construct.
    private SceneEntityDisappearNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityDisappearNotify() {
      entityList_ = emptyIntList();
      disappearType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntityDisappearNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.internal_static_SceneEntityDisappearNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.internal_static_SceneEntityDisappearNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.class, emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code SceneEntityDisappearNotify.JBIJGLIONLH}
     */
    public enum JBIJGLIONLH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 280;</code>
       */
      PEPPOHPHJOJ(1, 280),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final JBIJGLIONLH DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 280;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 280;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


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
      public static JBIJGLIONLH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static JBIJGLIONLH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 280: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<JBIJGLIONLH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          JBIJGLIONLH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JBIJGLIONLH>() {
              public JBIJGLIONLH findValueByNumber(int number) {
                return JBIJGLIONLH.forNumber(number);
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
        return emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final JBIJGLIONLH[] VALUES = getStaticValuesArray();
      private static JBIJGLIONLH[] getStaticValuesArray() {
        return new JBIJGLIONLH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static JBIJGLIONLH valueOf(
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

      private JBIJGLIONLH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SceneEntityDisappearNotify.JBIJGLIONLH)
    }

    public static final int ENTITYLIST_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList entityList_;
    /**
     * <code>repeated uint32 entityList = 13;</code>
     * @return A list containing the entityList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEntityListList() {
      return entityList_;
    }
    /**
     * <code>repeated uint32 entityList = 13;</code>
     * @return The count of entityList.
     */
    public int getEntityListCount() {
      return entityList_.size();
    }
    /**
     * <code>repeated uint32 entityList = 13;</code>
     * @param index The index of the element to return.
     * @return The entityList at the given index.
     */
    public int getEntityList(int index) {
      return entityList_.getInt(index);
    }
    private int entityListMemoizedSerializedSize = -1;

    public static final int PARAM_FIELD_NUMBER = 10;
    private int param_ = 0;
    /**
     * <code>uint32 param = 10;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int DISAPPEARTYPE_FIELD_NUMBER = 7;
    private int disappearType_ = 0;
    /**
     * <code>.VisionType disappearType = 7;</code>
     * @return The enum numeric value on the wire for disappearType.
     */
    @java.lang.Override public int getDisappearTypeValue() {
      return disappearType_;
    }
    /**
     * <code>.VisionType disappearType = 7;</code>
     * @return The disappearType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType getDisappearType() {
      emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType result = emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType.forNumber(disappearType_);
      return result == null ? emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
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
      getSerializedSize();
      if (disappearType_ != emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        output.writeEnum(7, disappearType_);
      }
      if (param_ != 0) {
        output.writeUInt32(10, param_);
      }
      if (getEntityListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(entityListMemoizedSerializedSize);
      }
      for (int i = 0; i < entityList_.size(); i++) {
        output.writeUInt32NoTag(entityList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (disappearType_ != emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, disappearType_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, param_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < entityList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(entityList_.getInt(i));
        }
        size += dataSize;
        if (!getEntityListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        entityListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify other = (emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify) obj;

      if (!getEntityListList()
          .equals(other.getEntityListList())) return false;
      if (getParam()
          != other.getParam()) return false;
      if (disappearType_ != other.disappearType_) return false;
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
      if (getEntityListCount() > 0) {
        hash = (37 * hash) + ENTITYLIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityListList().hashCode();
      }
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + DISAPPEARTYPE_FIELD_NUMBER;
      hash = (53 * hash) + disappearType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify prototype) {
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
     * Protobuf type {@code SceneEntityDisappearNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityDisappearNotify)
        emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.internal_static_SceneEntityDisappearNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.internal_static_SceneEntityDisappearNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.class, emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.newBuilder()
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
        entityList_ = emptyIntList();
        param_ = 0;
        disappearType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.internal_static_SceneEntityDisappearNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify build() {
        emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify buildPartial() {
        emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify result = new emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entityList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityList_ = entityList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.param_ = param_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.disappearType_ = disappearType_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify other) {
        if (other == emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify.getDefaultInstance()) return this;
        if (!other.entityList_.isEmpty()) {
          if (entityList_.isEmpty()) {
            entityList_ = other.entityList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityListIsMutable();
            entityList_.addAll(other.entityList_);
          }
          onChanged();
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.disappearType_ != 0) {
          setDisappearTypeValue(other.getDisappearTypeValue());
        }
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
              case 56: {
                disappearType_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 80: {
                param_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 104: {
                int v = input.readUInt32();
                ensureEntityListIsMutable();
                entityList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureEntityListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  entityList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 106
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

      private com.google.protobuf.Internal.IntList entityList_ = emptyIntList();
      private void ensureEntityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityList_ = mutableCopy(entityList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 entityList = 13;</code>
       * @return A list containing the entityList.
       */
      public java.util.List<java.lang.Integer>
          getEntityListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(entityList_) : entityList_;
      }
      /**
       * <code>repeated uint32 entityList = 13;</code>
       * @return The count of entityList.
       */
      public int getEntityListCount() {
        return entityList_.size();
      }
      /**
       * <code>repeated uint32 entityList = 13;</code>
       * @param index The index of the element to return.
       * @return The entityList at the given index.
       */
      public int getEntityList(int index) {
        return entityList_.getInt(index);
      }
      /**
       * <code>repeated uint32 entityList = 13;</code>
       * @param index The index to set the value at.
       * @param value The entityList to set.
       * @return This builder for chaining.
       */
      public Builder setEntityList(
          int index, int value) {
        
        ensureEntityListIsMutable();
        entityList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entityList = 13;</code>
       * @param value The entityList to add.
       * @return This builder for chaining.
       */
      public Builder addEntityList(int value) {
        
        ensureEntityListIsMutable();
        entityList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entityList = 13;</code>
       * @param values The entityList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEntityList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEntityListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entityList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entityList = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityList() {
        entityList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 10;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 10;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000002);
        param_ = 0;
        onChanged();
        return this;
      }

      private int disappearType_ = 0;
      /**
       * <code>.VisionType disappearType = 7;</code>
       * @return The enum numeric value on the wire for disappearType.
       */
      @java.lang.Override public int getDisappearTypeValue() {
        return disappearType_;
      }
      /**
       * <code>.VisionType disappearType = 7;</code>
       * @param value The enum numeric value on the wire for disappearType to set.
       * @return This builder for chaining.
       */
      public Builder setDisappearTypeValue(int value) {
        disappearType_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType disappearType = 7;</code>
       * @return The disappearType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType getDisappearType() {
        emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType result = emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType.forNumber(disappearType_);
        return result == null ? emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.VisionType disappearType = 7;</code>
       * @param value The disappearType to set.
       * @return This builder for chaining.
       */
      public Builder setDisappearType(emu.grasscutter.net.proto.VisionTypeOuterClass.VisionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        disappearType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType disappearType = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDisappearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        disappearType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneEntityDisappearNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityDisappearNotify)
    private static final emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify();
    }

    public static emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityDisappearNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityDisappearNotify>() {
      @java.lang.Override
      public SceneEntityDisappearNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneEntityDisappearNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntityDisappearNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneEntityDisappearNotifyOuterClass.SceneEntityDisappearNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityDisappearNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntityDisappearNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n SceneEntityDisappearNotify.proto\032\020Visi" +
      "onType.proto\"\264\001\n\032SceneEntityDisappearNot" +
      "ify\022\022\n\nentityList\030\r \003(\r\022\r\n\005param\030\n \001(\r\022\"" +
      "\n\rdisappearType\030\007 \001(\0162\013.VisionType\"O\n\013JB" +
      "IJGLIONLH\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\230\002\022\017\n" +
      "\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VisionTypeOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityDisappearNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityDisappearNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntityDisappearNotify_descriptor,
        new java.lang.String[] { "EntityList", "Param", "DisappearType", });
    emu.grasscutter.net.proto.VisionTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}