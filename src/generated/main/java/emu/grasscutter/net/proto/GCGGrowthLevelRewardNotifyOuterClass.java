// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGGrowthLevelRewardNotify.proto

package emu.grasscutter.net.proto;

public final class GCGGrowthLevelRewardNotifyOuterClass {
  private GCGGrowthLevelRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGGrowthLevelRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGGrowthLevelRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
     * @return Whether the oaemlknkeio field is set.
     */
    boolean hasOaemlknkeio();
    /**
     * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
     * @return The oaemlknkeio.
     */
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getOaemlknkeio();
    /**
     * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
     */
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getOaemlknkeioOrBuilder();
  }
  /**
   * <pre>
   *enum BOGLAPKFCMG {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 7570;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code GCGGrowthLevelRewardNotify}
   */
  public static final class GCGGrowthLevelRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGGrowthLevelRewardNotify)
      GCGGrowthLevelRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGGrowthLevelRewardNotify.newBuilder() to construct.
    private GCGGrowthLevelRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGGrowthLevelRewardNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGGrowthLevelRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGGrowthLevelRewardNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 82: {
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder subBuilder = null;
              if (oaemlknkeio_ != null) {
                subBuilder = oaemlknkeio_.toBuilder();
              }
              oaemlknkeio_ = input.readMessage(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(oaemlknkeio_);
                oaemlknkeio_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.class, emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.Builder.class);
    }

    public static final int OAEMLKNKEIO_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData oaemlknkeio_;
    /**
     * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
     * @return Whether the oaemlknkeio field is set.
     */
    @java.lang.Override
    public boolean hasOaemlknkeio() {
      return oaemlknkeio_ != null;
    }
    /**
     * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
     * @return The oaemlknkeio.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getOaemlknkeio() {
      return oaemlknkeio_ == null ? emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : oaemlknkeio_;
    }
    /**
     * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getOaemlknkeioOrBuilder() {
      return getOaemlknkeio();
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
      if (oaemlknkeio_ != null) {
        output.writeMessage(10, getOaemlknkeio());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oaemlknkeio_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getOaemlknkeio());
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify other = (emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify) obj;

      if (hasOaemlknkeio() != other.hasOaemlknkeio()) return false;
      if (hasOaemlknkeio()) {
        if (!getOaemlknkeio()
            .equals(other.getOaemlknkeio())) return false;
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
      if (hasOaemlknkeio()) {
        hash = (37 * hash) + OAEMLKNKEIO_FIELD_NUMBER;
        hash = (53 * hash) + getOaemlknkeio().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify prototype) {
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
     * <pre>
     *enum BOGLAPKFCMG {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 7570;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code GCGGrowthLevelRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGGrowthLevelRewardNotify)
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.class, emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (oaemlknkeioBuilder_ == null) {
          oaemlknkeio_ = null;
        } else {
          oaemlknkeio_ = null;
          oaemlknkeioBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.internal_static_GCGGrowthLevelRewardNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify build() {
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify buildPartial() {
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify result = new emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify(this);
        if (oaemlknkeioBuilder_ == null) {
          result.oaemlknkeio_ = oaemlknkeio_;
        } else {
          result.oaemlknkeio_ = oaemlknkeioBuilder_.build();
        }
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify other) {
        if (other == emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify.getDefaultInstance()) return this;
        if (other.hasOaemlknkeio()) {
          mergeOaemlknkeio(other.getOaemlknkeio());
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
        emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData oaemlknkeio_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> oaemlknkeioBuilder_;
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       * @return Whether the oaemlknkeio field is set.
       */
      public boolean hasOaemlknkeio() {
        return oaemlknkeioBuilder_ != null || oaemlknkeio_ != null;
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       * @return The oaemlknkeio.
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getOaemlknkeio() {
        if (oaemlknkeioBuilder_ == null) {
          return oaemlknkeio_ == null ? emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : oaemlknkeio_;
        } else {
          return oaemlknkeioBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       */
      public Builder setOaemlknkeio(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (oaemlknkeioBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oaemlknkeio_ = value;
          onChanged();
        } else {
          oaemlknkeioBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       */
      public Builder setOaemlknkeio(
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder builderForValue) {
        if (oaemlknkeioBuilder_ == null) {
          oaemlknkeio_ = builderForValue.build();
          onChanged();
        } else {
          oaemlknkeioBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       */
      public Builder mergeOaemlknkeio(emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (oaemlknkeioBuilder_ == null) {
          if (oaemlknkeio_ != null) {
            oaemlknkeio_ =
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.newBuilder(oaemlknkeio_).mergeFrom(value).buildPartial();
          } else {
            oaemlknkeio_ = value;
          }
          onChanged();
        } else {
          oaemlknkeioBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       */
      public Builder clearOaemlknkeio() {
        if (oaemlknkeioBuilder_ == null) {
          oaemlknkeio_ = null;
          onChanged();
        } else {
          oaemlknkeio_ = null;
          oaemlknkeioBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder getOaemlknkeioBuilder() {
        
        onChanged();
        return getOaemlknkeioFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       */
      public emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getOaemlknkeioOrBuilder() {
        if (oaemlknkeioBuilder_ != null) {
          return oaemlknkeioBuilder_.getMessageOrBuilder();
        } else {
          return oaemlknkeio_ == null ?
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : oaemlknkeio_;
        }
      }
      /**
       * <code>.GCGTCTavernChallengeData oaemlknkeio = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> 
          getOaemlknkeioFieldBuilder() {
        if (oaemlknkeioBuilder_ == null) {
          oaemlknkeioBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder>(
                  getOaemlknkeio(),
                  getParentForChildren(),
                  isClean());
          oaemlknkeio_ = null;
        }
        return oaemlknkeioBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGGrowthLevelRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGGrowthLevelRewardNotify)
    private static final emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify();
    }

    public static emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGGrowthLevelRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGGrowthLevelRewardNotify>() {
      @java.lang.Override
      public GCGGrowthLevelRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGGrowthLevelRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGGrowthLevelRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGGrowthLevelRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGGrowthLevelRewardNotifyOuterClass.GCGGrowthLevelRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGGrowthLevelRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GCGGrowthLevelRewardNotify.proto\032\036GCGT" +
      "CTavernChallengeData.proto\"L\n\032GCGGrowthL" +
      "evelRewardNotify\022.\n\013oaemlknkeio\030\n \001(\0132\031." +
      "GCGTCTavernChallengeDataB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.getDescriptor(),
        });
    internal_static_GCGGrowthLevelRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGGrowthLevelRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGGrowthLevelRewardNotify_descriptor,
        new java.lang.String[] { "Oaemlknkeio", });
    emu.grasscutter.net.proto.GCGTCTavernChallengeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}