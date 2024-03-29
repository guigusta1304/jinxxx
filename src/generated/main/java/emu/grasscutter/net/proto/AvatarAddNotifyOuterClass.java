// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarAddNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarAddNotifyOuterClass {
  private AvatarAddNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarAddNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarAddNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarInfo avatar = 8;</code>
     * @return Whether the avatar field is set.
     */
    boolean hasAvatar();
    /**
     * <code>.AvatarInfo avatar = 8;</code>
     * @return The avatar.
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatar();
    /**
     * <code>.AvatarInfo avatar = 8;</code>
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder();

    /**
     * <code>bool isInTeam = 14;</code>
     * @return The isInTeam.
     */
    boolean getIsInTeam();
  }
  /**
   * Protobuf type {@code AvatarAddNotify}
   */
  public static final class AvatarAddNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarAddNotify)
      AvatarAddNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarAddNotify.newBuilder() to construct.
    private AvatarAddNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarAddNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarAddNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.class, emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarAddNotify.APNKIMFCJIH}
     */
    public enum APNKIMFCJIH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1661;</code>
       */
      PEPPOHPHJOJ(1, 1661),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final APNKIMFCJIH DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1661;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1661;
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
      public static APNKIMFCJIH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static APNKIMFCJIH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1661: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<APNKIMFCJIH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          APNKIMFCJIH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<APNKIMFCJIH>() {
              public APNKIMFCJIH findValueByNumber(int number) {
                return APNKIMFCJIH.forNumber(number);
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
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final APNKIMFCJIH[] VALUES = getStaticValuesArray();
      private static APNKIMFCJIH[] getStaticValuesArray() {
        return new APNKIMFCJIH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static APNKIMFCJIH valueOf(
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

      private APNKIMFCJIH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarAddNotify.APNKIMFCJIH)
    }

    public static final int AVATAR_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatar_;
    /**
     * <code>.AvatarInfo avatar = 8;</code>
     * @return Whether the avatar field is set.
     */
    @java.lang.Override
    public boolean hasAvatar() {
      return avatar_ != null;
    }
    /**
     * <code>.AvatarInfo avatar = 8;</code>
     * @return The avatar.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatar() {
      return avatar_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatar_;
    }
    /**
     * <code>.AvatarInfo avatar = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder() {
      return avatar_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatar_;
    }

    public static final int ISINTEAM_FIELD_NUMBER = 14;
    private boolean isInTeam_ = false;
    /**
     * <code>bool isInTeam = 14;</code>
     * @return The isInTeam.
     */
    @java.lang.Override
    public boolean getIsInTeam() {
      return isInTeam_;
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
      if (avatar_ != null) {
        output.writeMessage(8, getAvatar());
      }
      if (isInTeam_ != false) {
        output.writeBool(14, isInTeam_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatar_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getAvatar());
      }
      if (isInTeam_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isInTeam_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify other = (emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify) obj;

      if (hasAvatar() != other.hasAvatar()) return false;
      if (hasAvatar()) {
        if (!getAvatar()
            .equals(other.getAvatar())) return false;
      }
      if (getIsInTeam()
          != other.getIsInTeam()) return false;
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
      if (hasAvatar()) {
        hash = (37 * hash) + AVATAR_FIELD_NUMBER;
        hash = (53 * hash) + getAvatar().hashCode();
      }
      hash = (37 * hash) + ISINTEAM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInTeam());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify prototype) {
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
     * Protobuf type {@code AvatarAddNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarAddNotify)
        emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.class, emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.newBuilder()
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
        avatar_ = null;
        if (avatarBuilder_ != null) {
          avatarBuilder_.dispose();
          avatarBuilder_ = null;
        }
        isInTeam_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify build() {
        emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify result = new emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatar_ = avatarBuilder_ == null
              ? avatar_
              : avatarBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isInTeam_ = isInTeam_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.getDefaultInstance()) return this;
        if (other.hasAvatar()) {
          mergeAvatar(other.getAvatar());
        }
        if (other.getIsInTeam() != false) {
          setIsInTeam(other.getIsInTeam());
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
              case 66: {
                input.readMessage(
                    getAvatarFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 66
              case 112: {
                isInTeam_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatar_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> avatarBuilder_;
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       * @return Whether the avatar field is set.
       */
      public boolean hasAvatar() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       * @return The avatar.
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatar() {
        if (avatarBuilder_ == null) {
          return avatar_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatar_;
        } else {
          return avatarBuilder_.getMessage();
        }
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       */
      public Builder setAvatar(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatar_ = value;
        } else {
          avatarBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       */
      public Builder setAvatar(
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder builderForValue) {
        if (avatarBuilder_ == null) {
          avatar_ = builderForValue.build();
        } else {
          avatarBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       */
      public Builder mergeAvatar(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            avatar_ != null &&
            avatar_ != emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance()) {
            getAvatarBuilder().mergeFrom(value);
          } else {
            avatar_ = value;
          }
        } else {
          avatarBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       */
      public Builder clearAvatar() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatar_ = null;
        if (avatarBuilder_ != null) {
          avatarBuilder_.dispose();
          avatarBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder getAvatarBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getAvatarFieldBuilder().getBuilder();
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder() {
        if (avatarBuilder_ != null) {
          return avatarBuilder_.getMessageOrBuilder();
        } else {
          return avatar_ == null ?
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatar_;
        }
      }
      /**
       * <code>.AvatarInfo avatar = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> 
          getAvatarFieldBuilder() {
        if (avatarBuilder_ == null) {
          avatarBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder>(
                  getAvatar(),
                  getParentForChildren(),
                  isClean());
          avatar_ = null;
        }
        return avatarBuilder_;
      }

      private boolean isInTeam_ ;
      /**
       * <code>bool isInTeam = 14;</code>
       * @return The isInTeam.
       */
      @java.lang.Override
      public boolean getIsInTeam() {
        return isInTeam_;
      }
      /**
       * <code>bool isInTeam = 14;</code>
       * @param value The isInTeam to set.
       * @return This builder for chaining.
       */
      public Builder setIsInTeam(boolean value) {
        
        isInTeam_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isInTeam = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInTeam() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isInTeam_ = false;
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


      // @@protoc_insertion_point(builder_scope:AvatarAddNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarAddNotify)
    private static final emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify();
    }

    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarAddNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarAddNotify>() {
      @java.lang.Override
      public AvatarAddNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarAddNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarAddNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarAddNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarAddNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AvatarAddNotify.proto\032\020AvatarInfo.prot" +
      "o\"\221\001\n\017AvatarAddNotify\022\033\n\006avatar\030\010 \001(\0132\013." +
      "AvatarInfo\022\020\n\010isInTeam\030\016 \001(\010\"O\n\013APNKIMFC" +
      "JIH\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\375\014\022\017\n\013DCDNI" +
      "LFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarAddNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarAddNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarAddNotify_descriptor,
        new java.lang.String[] { "Avatar", "IsInTeam", });
    emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
