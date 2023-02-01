// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtDoSkillSuccNotify.proto

package emu.grasscutter.net.proto;

public final class EvtDoSkillSuccNotifyOuterClass {
  private EvtDoSkillSuccNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtDoSkillSuccNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtDoSkillSuccNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skillId = 13;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>uint32 casterId = 2;</code>
     * @return The casterId.
     */
    int getCasterId();

    /**
     * <code>.Vector forward = 14;</code>
     * @return Whether the forward field is set.
     */
    boolean hasForward();
    /**
     * <code>.Vector forward = 14;</code>
     * @return The forward.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getForward();
    /**
     * <code>.Vector forward = 14;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getForwardOrBuilder();
  }
  /**
   * Protobuf type {@code EvtDoSkillSuccNotify}
   */
  public static final class EvtDoSkillSuccNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtDoSkillSuccNotify)
      EvtDoSkillSuccNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtDoSkillSuccNotify.newBuilder() to construct.
    private EvtDoSkillSuccNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtDoSkillSuccNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtDoSkillSuccNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.class, emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code EvtDoSkillSuccNotify.AFPNPDBLIDO}
     */
    public enum AFPNPDBLIDO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 398;</code>
       */
      PEPPOHPHJOJ(1, 398),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final AFPNPDBLIDO DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final AFPNPDBLIDO EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 398;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 398;
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
      public static AFPNPDBLIDO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AFPNPDBLIDO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 398: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AFPNPDBLIDO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AFPNPDBLIDO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AFPNPDBLIDO>() {
              public AFPNPDBLIDO findValueByNumber(int number) {
                return AFPNPDBLIDO.forNumber(number);
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
        return emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final AFPNPDBLIDO[] VALUES = getStaticValuesArray();
      private static AFPNPDBLIDO[] getStaticValuesArray() {
        return new AFPNPDBLIDO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static AFPNPDBLIDO valueOf(
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

      private AFPNPDBLIDO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EvtDoSkillSuccNotify.AFPNPDBLIDO)
    }

    public static final int SKILLID_FIELD_NUMBER = 13;
    private int skillId_ = 0;
    /**
     * <code>uint32 skillId = 13;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int FORWARDTYPE_FIELD_NUMBER = 5;
    private int forwardType_ = 0;
    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forwardType = 5;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int CASTERID_FIELD_NUMBER = 2;
    private int casterId_ = 0;
    /**
     * <code>uint32 casterId = 2;</code>
     * @return The casterId.
     */
    @java.lang.Override
    public int getCasterId() {
      return casterId_;
    }

    public static final int FORWARD_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector forward_;
    /**
     * <code>.Vector forward = 14;</code>
     * @return Whether the forward field is set.
     */
    @java.lang.Override
    public boolean hasForward() {
      return forward_ != null;
    }
    /**
     * <code>.Vector forward = 14;</code>
     * @return The forward.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getForward() {
      return forward_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : forward_;
    }
    /**
     * <code>.Vector forward = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getForwardOrBuilder() {
      return forward_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : forward_;
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
      if (casterId_ != 0) {
        output.writeUInt32(2, casterId_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(5, forwardType_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(13, skillId_);
      }
      if (forward_ != null) {
        output.writeMessage(14, getForward());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (casterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, casterId_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, forwardType_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, skillId_);
      }
      if (forward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getForward());
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify other = (emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (forwardType_ != other.forwardType_) return false;
      if (getCasterId()
          != other.getCasterId()) return false;
      if (hasForward() != other.hasForward()) return false;
      if (hasForward()) {
        if (!getForward()
            .equals(other.getForward())) return false;
      }
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
      hash = (37 * hash) + SKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + FORWARDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (37 * hash) + CASTERID_FIELD_NUMBER;
      hash = (53 * hash) + getCasterId();
      if (hasForward()) {
        hash = (37 * hash) + FORWARD_FIELD_NUMBER;
        hash = (53 * hash) + getForward().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify prototype) {
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
     * Protobuf type {@code EvtDoSkillSuccNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtDoSkillSuccNotify)
        emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.class, emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.newBuilder()
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
        skillId_ = 0;
        forwardType_ = 0;
        casterId_ = 0;
        forward_ = null;
        if (forwardBuilder_ != null) {
          forwardBuilder_.dispose();
          forwardBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.internal_static_EvtDoSkillSuccNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify build() {
        emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify buildPartial() {
        emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify result = new emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skillId_ = skillId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.forwardType_ = forwardType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.casterId_ = casterId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.forward_ = forwardBuilder_ == null
              ? forward_
              : forwardBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify other) {
        if (other == emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.getCasterId() != 0) {
          setCasterId(other.getCasterId());
        }
        if (other.hasForward()) {
          mergeForward(other.getForward());
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
              case 16: {
                casterId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 40: {
                forwardType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 104: {
                skillId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
              case 114: {
                input.readMessage(
                    getForwardFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
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

      private int skillId_ ;
      /**
       * <code>uint32 skillId = 13;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skillId = 13;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skillId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skillId_ = 0;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        forwardType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int casterId_ ;
      /**
       * <code>uint32 casterId = 2;</code>
       * @return The casterId.
       */
      @java.lang.Override
      public int getCasterId() {
        return casterId_;
      }
      /**
       * <code>uint32 casterId = 2;</code>
       * @param value The casterId to set.
       * @return This builder for chaining.
       */
      public Builder setCasterId(int value) {
        
        casterId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 casterId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCasterId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        casterId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector forward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> forwardBuilder_;
      /**
       * <code>.Vector forward = 14;</code>
       * @return Whether the forward field is set.
       */
      public boolean hasForward() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>.Vector forward = 14;</code>
       * @return The forward.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getForward() {
        if (forwardBuilder_ == null) {
          return forward_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : forward_;
        } else {
          return forwardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector forward = 14;</code>
       */
      public Builder setForward(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (forwardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          forward_ = value;
        } else {
          forwardBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector forward = 14;</code>
       */
      public Builder setForward(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (forwardBuilder_ == null) {
          forward_ = builderForValue.build();
        } else {
          forwardBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector forward = 14;</code>
       */
      public Builder mergeForward(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (forwardBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            forward_ != null &&
            forward_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getForwardBuilder().mergeFrom(value);
          } else {
            forward_ = value;
          }
        } else {
          forwardBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector forward = 14;</code>
       */
      public Builder clearForward() {
        bitField0_ = (bitField0_ & ~0x00000008);
        forward_ = null;
        if (forwardBuilder_ != null) {
          forwardBuilder_.dispose();
          forwardBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector forward = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getForwardBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getForwardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector forward = 14;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getForwardOrBuilder() {
        if (forwardBuilder_ != null) {
          return forwardBuilder_.getMessageOrBuilder();
        } else {
          return forward_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : forward_;
        }
      }
      /**
       * <code>.Vector forward = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getForwardFieldBuilder() {
        if (forwardBuilder_ == null) {
          forwardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getForward(),
                  getParentForChildren(),
                  isClean());
          forward_ = null;
        }
        return forwardBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtDoSkillSuccNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtDoSkillSuccNotify)
    private static final emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify();
    }

    public static emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtDoSkillSuccNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtDoSkillSuccNotify>() {
      @java.lang.Override
      public EvtDoSkillSuccNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtDoSkillSuccNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtDoSkillSuccNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtDoSkillSuccNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtDoSkillSuccNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EvtDoSkillSuccNotify.proto\032\021ForwardTyp" +
      "e.proto\032\014Vector.proto\"\330\001\n\024EvtDoSkillSucc" +
      "Notify\022\017\n\007skillId\030\r \001(\r\022!\n\013forwardType\030\005" +
      " \001(\0162\014.ForwardType\022\020\n\010casterId\030\002 \001(\r\022\030\n\007" +
      "forward\030\016 \001(\0132\007.Vector\"`\n\013AFPNPDBLIDO\022\010\n" +
      "\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\216\003\022\017\n\013DCDNILFDFLB" +
      "\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtDoSkillSuccNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtDoSkillSuccNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtDoSkillSuccNotify_descriptor,
        new java.lang.String[] { "SkillId", "ForwardType", "CasterId", "Forward", });
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}