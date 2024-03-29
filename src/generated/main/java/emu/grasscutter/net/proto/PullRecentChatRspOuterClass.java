// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PullRecentChatRsp.proto

package emu.grasscutter.net.proto;

public final class PullRecentChatRspOuterClass {
  private PullRecentChatRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PullRecentChatRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PullRecentChatRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo> 
        getChatInfoList();
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo(int index);
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    int getChatInfoCount();
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder> 
        getChatInfoOrBuilderList();
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code PullRecentChatRsp}
   */
  public static final class PullRecentChatRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PullRecentChatRsp)
      PullRecentChatRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PullRecentChatRsp.newBuilder() to construct.
    private PullRecentChatRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PullRecentChatRsp() {
      chatInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PullRecentChatRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.class, emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code PullRecentChatRsp.JIGIFODBEAL}
     */
    public enum JIGIFODBEAL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 5012;</code>
       */
      PEPPOHPHJOJ(1, 5012),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final JIGIFODBEAL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 5012;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 5012;
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
      public static JIGIFODBEAL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static JIGIFODBEAL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 5012: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<JIGIFODBEAL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          JIGIFODBEAL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JIGIFODBEAL>() {
              public JIGIFODBEAL findValueByNumber(int number) {
                return JIGIFODBEAL.forNumber(number);
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
        return emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final JIGIFODBEAL[] VALUES = getStaticValuesArray();
      private static JIGIFODBEAL[] getStaticValuesArray() {
        return new JIGIFODBEAL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static JIGIFODBEAL valueOf(
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

      private JIGIFODBEAL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PullRecentChatRsp.JIGIFODBEAL)
    }

    public static final int CHATINFO_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo> chatInfo_;
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo> getChatInfoList() {
      return chatInfo_;
    }
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder> 
        getChatInfoOrBuilderList() {
      return chatInfo_;
    }
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    @java.lang.Override
    public int getChatInfoCount() {
      return chatInfo_.size();
    }
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo(int index) {
      return chatInfo_.get(index);
    }
    /**
     * <code>repeated .ChatInfo chatInfo = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(
        int index) {
      return chatInfo_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      for (int i = 0; i < chatInfo_.size(); i++) {
        output.writeMessage(6, chatInfo_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < chatInfo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, chatInfo_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp other = (emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp) obj;

      if (!getChatInfoList()
          .equals(other.getChatInfoList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getChatInfoCount() > 0) {
        hash = (37 * hash) + CHATINFO_FIELD_NUMBER;
        hash = (53 * hash) + getChatInfoList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp prototype) {
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
     * Protobuf type {@code PullRecentChatRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PullRecentChatRsp)
        emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.class, emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.newBuilder()
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
        if (chatInfoBuilder_ == null) {
          chatInfo_ = java.util.Collections.emptyList();
        } else {
          chatInfo_ = null;
          chatInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PullRecentChatRspOuterClass.internal_static_PullRecentChatRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp build() {
        emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp buildPartial() {
        emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp result = new emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp result) {
        if (chatInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            chatInfo_ = java.util.Collections.unmodifiableList(chatInfo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.chatInfo_ = chatInfo_;
        } else {
          result.chatInfo_ = chatInfoBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp) {
          return mergeFrom((emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp other) {
        if (other == emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp.getDefaultInstance()) return this;
        if (chatInfoBuilder_ == null) {
          if (!other.chatInfo_.isEmpty()) {
            if (chatInfo_.isEmpty()) {
              chatInfo_ = other.chatInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureChatInfoIsMutable();
              chatInfo_.addAll(other.chatInfo_);
            }
            onChanged();
          }
        } else {
          if (!other.chatInfo_.isEmpty()) {
            if (chatInfoBuilder_.isEmpty()) {
              chatInfoBuilder_.dispose();
              chatInfoBuilder_ = null;
              chatInfo_ = other.chatInfo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              chatInfoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChatInfoFieldBuilder() : null;
            } else {
              chatInfoBuilder_.addAllMessages(other.chatInfo_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 50: {
                emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo m =
                    input.readMessage(
                        emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.parser(),
                        extensionRegistry);
                if (chatInfoBuilder_ == null) {
                  ensureChatInfoIsMutable();
                  chatInfo_.add(m);
                } else {
                  chatInfoBuilder_.addMessage(m);
                }
                break;
              } // case 50
              case 96: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private java.util.List<emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo> chatInfo_ =
        java.util.Collections.emptyList();
      private void ensureChatInfoIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          chatInfo_ = new java.util.ArrayList<emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo>(chatInfo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder> chatInfoBuilder_;

      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo> getChatInfoList() {
        if (chatInfoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(chatInfo_);
        } else {
          return chatInfoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public int getChatInfoCount() {
        if (chatInfoBuilder_ == null) {
          return chatInfo_.size();
        } else {
          return chatInfoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo(int index) {
        if (chatInfoBuilder_ == null) {
          return chatInfo_.get(index);
        } else {
          return chatInfoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder setChatInfo(
          int index, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChatInfoIsMutable();
          chatInfo_.set(index, value);
          onChanged();
        } else {
          chatInfoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder setChatInfo(
          int index, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.set(index, builderForValue.build());
          onChanged();
        } else {
          chatInfoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder addChatInfo(emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChatInfoIsMutable();
          chatInfo_.add(value);
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder addChatInfo(
          int index, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChatInfoIsMutable();
          chatInfo_.add(index, value);
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder addChatInfo(
          emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.add(builderForValue.build());
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder addChatInfo(
          int index, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.add(index, builderForValue.build());
          onChanged();
        } else {
          chatInfoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder addAllChatInfo(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo> values) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, chatInfo_);
          onChanged();
        } else {
          chatInfoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder clearChatInfo() {
        if (chatInfoBuilder_ == null) {
          chatInfo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          chatInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public Builder removeChatInfo(int index) {
        if (chatInfoBuilder_ == null) {
          ensureChatInfoIsMutable();
          chatInfo_.remove(index);
          onChanged();
        } else {
          chatInfoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder(
          int index) {
        return getChatInfoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder(
          int index) {
        if (chatInfoBuilder_ == null) {
          return chatInfo_.get(index);  } else {
          return chatInfoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder> 
           getChatInfoOrBuilderList() {
        if (chatInfoBuilder_ != null) {
          return chatInfoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(chatInfo_);
        }
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder addChatInfoBuilder() {
        return getChatInfoFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder addChatInfoBuilder(
          int index) {
        return getChatInfoFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ChatInfo chatInfo = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder> 
           getChatInfoBuilderList() {
        return getChatInfoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder> 
          getChatInfoFieldBuilder() {
        if (chatInfoBuilder_ == null) {
          chatInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfo.Builder, emu.grasscutter.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder>(
                  chatInfo_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          chatInfo_ = null;
        }
        return chatInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PullRecentChatRsp)
    }

    // @@protoc_insertion_point(class_scope:PullRecentChatRsp)
    private static final emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp();
    }

    public static emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PullRecentChatRsp>
        PARSER = new com.google.protobuf.AbstractParser<PullRecentChatRsp>() {
      @java.lang.Override
      public PullRecentChatRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PullRecentChatRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PullRecentChatRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PullRecentChatRspOuterClass.PullRecentChatRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PullRecentChatRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PullRecentChatRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PullRecentChatRsp.proto\032\016ChatInfo.prot" +
      "o\"\222\001\n\021PullRecentChatRsp\022\033\n\010chatInfo\030\006 \003(" +
      "\0132\t.ChatInfo\022\017\n\007retcode\030\014 \001(\005\"O\n\013JIGIFOD" +
      "BEAL\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\224\'\022\017\n\013DCDN" +
      "ILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ChatInfoOuterClass.getDescriptor(),
        });
    internal_static_PullRecentChatRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PullRecentChatRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PullRecentChatRsp_descriptor,
        new java.lang.String[] { "ChatInfo", "Retcode", });
    emu.grasscutter.net.proto.ChatInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
