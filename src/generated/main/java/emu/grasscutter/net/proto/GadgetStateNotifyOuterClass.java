// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetStateNotify.proto

package emu.grasscutter.net.proto;

public final class GadgetStateNotifyOuterClass {
  private GadgetStateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetStateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetStateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadgetState = 9;</code>
     * @return The gadgetState.
     */
    int getGadgetState();

    /**
     * <code>uint32 gadgetEntityId = 7;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>bool isEnableInteract = 15;</code>
     * @return The isEnableInteract.
     */
    boolean getIsEnableInteract();
  }
  /**
   * Protobuf type {@code GadgetStateNotify}
   */
  public static final class GadgetStateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetStateNotify)
      GadgetStateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetStateNotify.newBuilder() to construct.
    private GadgetStateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetStateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetStateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.internal_static_GadgetStateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.internal_static_GadgetStateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.class, emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code GadgetStateNotify.AKFEDCCGIJI}
     */
    public enum AKFEDCCGIJI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 887;</code>
       */
      PEPPOHPHJOJ(1, 887),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final AKFEDCCGIJI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 887;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 887;
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
      public static AKFEDCCGIJI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AKFEDCCGIJI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 887: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AKFEDCCGIJI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AKFEDCCGIJI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AKFEDCCGIJI>() {
              public AKFEDCCGIJI findValueByNumber(int number) {
                return AKFEDCCGIJI.forNumber(number);
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
        return emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final AKFEDCCGIJI[] VALUES = getStaticValuesArray();
      private static AKFEDCCGIJI[] getStaticValuesArray() {
        return new AKFEDCCGIJI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static AKFEDCCGIJI valueOf(
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

      private AKFEDCCGIJI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GadgetStateNotify.AKFEDCCGIJI)
    }

    public static final int GADGETSTATE_FIELD_NUMBER = 9;
    private int gadgetState_ = 0;
    /**
     * <code>uint32 gadgetState = 9;</code>
     * @return The gadgetState.
     */
    @java.lang.Override
    public int getGadgetState() {
      return gadgetState_;
    }

    public static final int GADGETENTITYID_FIELD_NUMBER = 7;
    private int gadgetEntityId_ = 0;
    /**
     * <code>uint32 gadgetEntityId = 7;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int ISENABLEINTERACT_FIELD_NUMBER = 15;
    private boolean isEnableInteract_ = false;
    /**
     * <code>bool isEnableInteract = 15;</code>
     * @return The isEnableInteract.
     */
    @java.lang.Override
    public boolean getIsEnableInteract() {
      return isEnableInteract_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(7, gadgetEntityId_);
      }
      if (gadgetState_ != 0) {
        output.writeUInt32(9, gadgetState_);
      }
      if (isEnableInteract_ != false) {
        output.writeBool(15, isEnableInteract_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gadgetEntityId_);
      }
      if (gadgetState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, gadgetState_);
      }
      if (isEnableInteract_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isEnableInteract_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify other = (emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify) obj;

      if (getGadgetState()
          != other.getGadgetState()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getIsEnableInteract()
          != other.getIsEnableInteract()) return false;
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
      hash = (37 * hash) + GADGETSTATE_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetState();
      hash = (37 * hash) + GADGETENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + ISENABLEINTERACT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnableInteract());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify prototype) {
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
     * Protobuf type {@code GadgetStateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetStateNotify)
        emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.internal_static_GadgetStateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.internal_static_GadgetStateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.class, emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.newBuilder()
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
        gadgetState_ = 0;
        gadgetEntityId_ = 0;
        isEnableInteract_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.internal_static_GadgetStateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify build() {
        emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify buildPartial() {
        emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify result = new emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.gadgetState_ = gadgetState_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.gadgetEntityId_ = gadgetEntityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isEnableInteract_ = isEnableInteract_;
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
        if (other instanceof emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify other) {
        if (other == emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify.getDefaultInstance()) return this;
        if (other.getGadgetState() != 0) {
          setGadgetState(other.getGadgetState());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getIsEnableInteract() != false) {
          setIsEnableInteract(other.getIsEnableInteract());
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
                gadgetEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 72: {
                gadgetState_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 120: {
                isEnableInteract_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 120
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

      private int gadgetState_ ;
      /**
       * <code>uint32 gadgetState = 9;</code>
       * @return The gadgetState.
       */
      @java.lang.Override
      public int getGadgetState() {
        return gadgetState_;
      }
      /**
       * <code>uint32 gadgetState = 9;</code>
       * @param value The gadgetState to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetState(int value) {
        
        gadgetState_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetState = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gadgetState_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadgetEntityId = 7;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadgetEntityId = 7;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetEntityId = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private boolean isEnableInteract_ ;
      /**
       * <code>bool isEnableInteract = 15;</code>
       * @return The isEnableInteract.
       */
      @java.lang.Override
      public boolean getIsEnableInteract() {
        return isEnableInteract_;
      }
      /**
       * <code>bool isEnableInteract = 15;</code>
       * @param value The isEnableInteract to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnableInteract(boolean value) {
        
        isEnableInteract_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool isEnableInteract = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnableInteract() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isEnableInteract_ = false;
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


      // @@protoc_insertion_point(builder_scope:GadgetStateNotify)
    }

    // @@protoc_insertion_point(class_scope:GadgetStateNotify)
    private static final emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify();
    }

    public static emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetStateNotify>
        PARSER = new com.google.protobuf.AbstractParser<GadgetStateNotify>() {
      @java.lang.Override
      public GadgetStateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GadgetStateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetStateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetStateNotifyOuterClass.GadgetStateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetStateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetStateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GadgetStateNotify.proto\"\253\001\n\021GadgetStat" +
      "eNotify\022\023\n\013gadgetState\030\t \001(\r\022\026\n\016gadgetEn" +
      "tityId\030\007 \001(\r\022\030\n\020isEnableInteract\030\017 \001(\010\"O" +
      "\n\013AKFEDCCGIJI\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\367" +
      "\006\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GadgetStateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetStateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetStateNotify_descriptor,
        new java.lang.String[] { "GadgetState", "GadgetEntityId", "IsEnableInteract", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
