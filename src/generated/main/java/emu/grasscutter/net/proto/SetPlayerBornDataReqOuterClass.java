// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerBornDataReq.proto

package emu.grasscutter.net.proto;

public final class SetPlayerBornDataReqOuterClass {
  private SetPlayerBornDataReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerBornDataReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerBornDataReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string nickName = 10;</code>
     * @return The nickName.
     */
    java.lang.String getNickName();
    /**
     * <code>string nickName = 10;</code>
     * @return The bytes for nickName.
     */
    com.google.protobuf.ByteString
        getNickNameBytes();

    /**
     * <code>uint32 avatarId = 15;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * Protobuf type {@code SetPlayerBornDataReq}
   */
  public static final class SetPlayerBornDataReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerBornDataReq)
      SetPlayerBornDataReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerBornDataReq.newBuilder() to construct.
    private SetPlayerBornDataReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerBornDataReq() {
      nickName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerBornDataReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.internal_static_SetPlayerBornDataReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.internal_static_SetPlayerBornDataReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.class, emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SetPlayerBornDataReq.JJMALAPLECC}
     */
    public enum JJMALAPLECC
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 169;</code>
       */
      PEPPOHPHJOJ(1, 169),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final JJMALAPLECC DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final JJMALAPLECC EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 169;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 169;
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
      public static JJMALAPLECC valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static JJMALAPLECC forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 169: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<JJMALAPLECC>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          JJMALAPLECC> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JJMALAPLECC>() {
              public JJMALAPLECC findValueByNumber(int number) {
                return JJMALAPLECC.forNumber(number);
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
        return emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final JJMALAPLECC[] VALUES = getStaticValuesArray();
      private static JJMALAPLECC[] getStaticValuesArray() {
        return new JJMALAPLECC[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static JJMALAPLECC valueOf(
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

      private JJMALAPLECC(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SetPlayerBornDataReq.JJMALAPLECC)
    }

    public static final int NICKNAME_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nickName_ = "";
    /**
     * <code>string nickName = 10;</code>
     * @return The nickName.
     */
    @java.lang.Override
    public java.lang.String getNickName() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickName_ = s;
        return s;
      }
    }
    /**
     * <code>string nickName = 10;</code>
     * @return The bytes for nickName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNickNameBytes() {
      java.lang.Object ref = nickName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AVATARID_FIELD_NUMBER = 15;
    private int avatarId_ = 0;
    /**
     * <code>uint32 avatarId = 15;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 10, nickName_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(15, avatarId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, nickName_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, avatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq other = (emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq) obj;

      if (!getNickName()
          .equals(other.getNickName())) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickName().hashCode();
      hash = (37 * hash) + AVATARID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq prototype) {
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
     * Protobuf type {@code SetPlayerBornDataReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerBornDataReq)
        emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.internal_static_SetPlayerBornDataReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.internal_static_SetPlayerBornDataReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.class, emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.newBuilder()
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
        nickName_ = "";
        avatarId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.internal_static_SetPlayerBornDataReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq build() {
        emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq buildPartial() {
        emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq result = new emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nickName_ = nickName_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq other) {
        if (other == emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq.getDefaultInstance()) return this;
        if (!other.getNickName().isEmpty()) {
          nickName_ = other.nickName_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
              case 82: {
                nickName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 82
              case 120: {
                avatarId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private java.lang.Object nickName_ = "";
      /**
       * <code>string nickName = 10;</code>
       * @return The nickName.
       */
      public java.lang.String getNickName() {
        java.lang.Object ref = nickName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickName = 10;</code>
       * @return The bytes for nickName.
       */
      public com.google.protobuf.ByteString
          getNickNameBytes() {
        java.lang.Object ref = nickName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickName = 10;</code>
       * @param value The nickName to set.
       * @return This builder for chaining.
       */
      public Builder setNickName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nickName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string nickName = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickName() {
        nickName_ = getDefaultInstance().getNickName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string nickName = 10;</code>
       * @param value The bytes for nickName to set.
       * @return This builder for chaining.
       */
      public Builder setNickNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        nickName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatarId = 15;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatarId = 15;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatarId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetPlayerBornDataReq)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerBornDataReq)
    private static final emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq();
    }

    public static emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerBornDataReq>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerBornDataReq>() {
      @java.lang.Override
      public SetPlayerBornDataReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetPlayerBornDataReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerBornDataReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetPlayerBornDataReqOuterClass.SetPlayerBornDataReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerBornDataReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerBornDataReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SetPlayerBornDataReq.proto\"\234\001\n\024SetPlay" +
      "erBornDataReq\022\020\n\010nickName\030\n \001(\t\022\020\n\010avata" +
      "rId\030\017 \001(\r\"`\n\013JJMALAPLECC\022\010\n\004NONE\020\000\022\020\n\013PE" +
      "PPOHPHJOJ\020\251\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLM" +
      "POEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetPlayerBornDataReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerBornDataReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerBornDataReq_descriptor,
        new java.lang.String[] { "NickName", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
