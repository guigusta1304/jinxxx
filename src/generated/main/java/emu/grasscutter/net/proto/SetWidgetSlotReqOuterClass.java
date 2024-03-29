// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetWidgetSlotReq.proto

package emu.grasscutter.net.proto;

public final class SetWidgetSlotReqOuterClass {
  private SetWidgetSlotReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetWidgetSlotReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetWidgetSlotReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @return A list containing the tagList.
     */
    java.util.List<emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList();
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @return The count of tagList.
     */
    int getTagListCount();
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @param index The index of the element to return.
     * @return The tagList at the given index.
     */
    emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTagList(int index);
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @return A list containing the enum numeric values on the wire for tagList.
     */
    java.util.List<java.lang.Integer>
    getTagListValueList();
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tagList at the given index.
     */
    int getTagListValue(int index);

    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @return The enum numeric value on the wire for op.
     */
    int getOpValue();
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @return The op.
     */
    emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp getOp();

    /**
     * <code>uint32 materialId = 4;</code>
     * @return The materialId.
     */
    int getMaterialId();
  }
  /**
   * Protobuf type {@code SetWidgetSlotReq}
   */
  public static final class SetWidgetSlotReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetWidgetSlotReq)
      SetWidgetSlotReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetWidgetSlotReq.newBuilder() to construct.
    private SetWidgetSlotReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetWidgetSlotReq() {
      tagList_ = java.util.Collections.emptyList();
      op_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetWidgetSlotReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.internal_static_SetWidgetSlotReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.internal_static_SetWidgetSlotReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.class, emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SetWidgetSlotReq.GHKMOLPEJPE}
     */
    public enum GHKMOLPEJPE
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4299;</code>
       */
      PEPPOHPHJOJ(1, 4299),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GHKMOLPEJPE DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final GHKMOLPEJPE EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4299;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4299;
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
      public static GHKMOLPEJPE valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GHKMOLPEJPE forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4299: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GHKMOLPEJPE>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GHKMOLPEJPE> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GHKMOLPEJPE>() {
              public GHKMOLPEJPE findValueByNumber(int number) {
                return GHKMOLPEJPE.forNumber(number);
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
        return emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final GHKMOLPEJPE[] VALUES = getStaticValuesArray();
      private static GHKMOLPEJPE[] getStaticValuesArray() {
        return new GHKMOLPEJPE[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static GHKMOLPEJPE valueOf(
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

      private GHKMOLPEJPE(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetWidgetSlotReq.GHKMOLPEJPE)
    }

    public static final int TAGLIST_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private java.util.List<java.lang.Integer> tagList_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> tagList_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag>() {
              public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag convert(java.lang.Integer from) {
                emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag result = emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.forNumber(from);
                return result == null ? emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @return A list containing the tagList.
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag>(tagList_, tagList_converter_);
    }
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @return The count of tagList.
     */
    @java.lang.Override
    public int getTagListCount() {
      return tagList_.size();
    }
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @param index The index of the element to return.
     * @return The tagList at the given index.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTagList(int index) {
      return tagList_converter_.convert(tagList_.get(index));
    }
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @return A list containing the enum numeric values on the wire for tagList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getTagListValueList() {
      return tagList_;
    }
    /**
     * <code>repeated .WidgetSlotTag tagList = 13;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tagList at the given index.
     */
    @java.lang.Override
    public int getTagListValue(int index) {
      return tagList_.get(index);
    }
    private int tagListMemoizedSerializedSize;

    public static final int OP_FIELD_NUMBER = 3;
    private int op_ = 0;
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.WidgetSlotOp op = 3;</code>
     * @return The op.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
      emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp result = emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.forNumber(op_);
      return result == null ? emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
    }

    public static final int MATERIALID_FIELD_NUMBER = 4;
    private int materialId_ = 0;
    /**
     * <code>uint32 materialId = 4;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
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
      if (op_ != emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
        output.writeEnum(3, op_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(4, materialId_);
      }
      if (getTagListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(tagListMemoizedSerializedSize);
      }
      for (int i = 0; i < tagList_.size(); i++) {
        output.writeEnumNoTag(tagList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (op_ != emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, op_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, materialId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tagList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(tagList_.get(i));
        }
        size += dataSize;
        if (!getTagListList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }tagListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq other = (emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq) obj;

      if (!tagList_.equals(other.tagList_)) return false;
      if (op_ != other.op_) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
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
      if (getTagListCount() > 0) {
        hash = (37 * hash) + TAGLIST_FIELD_NUMBER;
        hash = (53 * hash) + tagList_.hashCode();
      }
      hash = (37 * hash) + OP_FIELD_NUMBER;
      hash = (53 * hash) + op_;
      hash = (37 * hash) + MATERIALID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq prototype) {
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
     * Protobuf type {@code SetWidgetSlotReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetWidgetSlotReq)
        emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.internal_static_SetWidgetSlotReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.internal_static_SetWidgetSlotReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.class, emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.newBuilder()
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
        tagList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        op_ = 0;
        materialId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.internal_static_SetWidgetSlotReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq build() {
        emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq buildPartial() {
        emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq result = new emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tagList_ = java.util.Collections.unmodifiableList(tagList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tagList_ = tagList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.op_ = op_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.materialId_ = materialId_;
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
        if (other instanceof emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq other) {
        if (other == emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq.getDefaultInstance()) return this;
        if (!other.tagList_.isEmpty()) {
          if (tagList_.isEmpty()) {
            tagList_ = other.tagList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagListIsMutable();
            tagList_.addAll(other.tagList_);
          }
          onChanged();
        }
        if (other.op_ != 0) {
          setOpValue(other.getOpValue());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
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
              case 24: {
                op_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 32: {
                materialId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 104: {
                int tmpRaw = input.readEnum();
                ensureTagListIsMutable();
                tagList_.add(tmpRaw);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while(input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureTagListIsMutable();
                  tagList_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
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

      private java.util.List<java.lang.Integer> tagList_ =
        java.util.Collections.emptyList();
      private void ensureTagListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          tagList_ = new java.util.ArrayList<java.lang.Integer>(tagList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @return A list containing the tagList.
       */
      public java.util.List<emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList() {
        return new com.google.protobuf.Internal.ListAdapter<
            java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag>(tagList_, tagList_converter_);
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @return The count of tagList.
       */
      public int getTagListCount() {
        return tagList_.size();
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param index The index of the element to return.
       * @return The tagList at the given index.
       */
      public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTagList(int index) {
        return tagList_converter_.convert(tagList_.get(index));
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param index The index to set the value at.
       * @param value The tagList to set.
       * @return This builder for chaining.
       */
      public Builder setTagList(
          int index, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagListIsMutable();
        tagList_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param value The tagList to add.
       * @return This builder for chaining.
       */
      public Builder addTagList(emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagListIsMutable();
        tagList_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param values The tagList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTagList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> values) {
        ensureTagListIsMutable();
        for (emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag value : values) {
          tagList_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearTagList() {
        tagList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @return A list containing the enum numeric values on the wire for tagList.
       */
      public java.util.List<java.lang.Integer>
      getTagListValueList() {
        return java.util.Collections.unmodifiableList(tagList_);
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of tagList at the given index.
       */
      public int getTagListValue(int index) {
        return tagList_.get(index);
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param index The index to set the value at.
       * @param value The enum numeric value on the wire for tagList to set.
       * @return This builder for chaining.
       */
      public Builder setTagListValue(
          int index, int value) {
        ensureTagListIsMutable();
        tagList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param value The enum numeric value on the wire for tagList to add.
       * @return This builder for chaining.
       */
      public Builder addTagListValue(int value) {
        ensureTagListIsMutable();
        tagList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tagList = 13;</code>
       * @param values The enum numeric values on the wire for tagList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTagListValue(
          java.lang.Iterable<java.lang.Integer> values) {
        ensureTagListIsMutable();
        for (int value : values) {
          tagList_.add(value);
        }
        onChanged();
        return this;
      }

      private int op_ = 0;
      /**
       * <code>.WidgetSlotOp op = 3;</code>
       * @return The enum numeric value on the wire for op.
       */
      @java.lang.Override public int getOpValue() {
        return op_;
      }
      /**
       * <code>.WidgetSlotOp op = 3;</code>
       * @param value The enum numeric value on the wire for op to set.
       * @return This builder for chaining.
       */
      public Builder setOpValue(int value) {
        op_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotOp op = 3;</code>
       * @return The op.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
        emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp result = emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.forNumber(op_);
        return result == null ? emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetSlotOp op = 3;</code>
       * @param value The op to set.
       * @return This builder for chaining.
       */
      public Builder setOp(emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        op_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotOp op = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        op_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 materialId = 4;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 materialId = 4;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 materialId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        materialId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetWidgetSlotReq)
    }

    // @@protoc_insertion_point(class_scope:SetWidgetSlotReq)
    private static final emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq();
    }

    public static emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetWidgetSlotReq>
        PARSER = new com.google.protobuf.AbstractParser<SetWidgetSlotReq>() {
      @java.lang.Override
      public SetWidgetSlotReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetWidgetSlotReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetWidgetSlotReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetWidgetSlotReqOuterClass.SetWidgetSlotReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetWidgetSlotReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetWidgetSlotReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SetWidgetSlotReq.proto\032\022WidgetSlotOp.p" +
      "roto\032\023WidgetSlotTag.proto\"\304\001\n\020SetWidgetS" +
      "lotReq\022\037\n\007tagList\030\r \003(\0162\016.WidgetSlotTag\022" +
      "\031\n\002op\030\003 \001(\0162\r.WidgetSlotOp\022\022\n\nmaterialId" +
      "\030\004 \001(\r\"`\n\013GHKMOLPEJPE\022\010\n\004NONE\020\000\022\020\n\013PEPPO" +
      "HPHJOJ\020\313!\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOE" +
      "A\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WidgetSlotOpOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.WidgetSlotTagOuterClass.getDescriptor(),
        });
    internal_static_SetWidgetSlotReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetWidgetSlotReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetWidgetSlotReq_descriptor,
        new java.lang.String[] { "TagList", "Op", "MaterialId", });
    emu.grasscutter.net.proto.WidgetSlotOpOuterClass.getDescriptor();
    emu.grasscutter.net.proto.WidgetSlotTagOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
