// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteFireworksChallengeInfo.proto

package emu.grasscutter.net.proto;

public final class LanternRiteFireworksChallengeInfoOuterClass {
  private LanternRiteFireworksChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteFireworksChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteFireworksChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isFullScore = 11;</code>
     * @return The isFullScore.
     */
    boolean getIsFullScore();

    /**
     * <code>uint32 bestScore = 14;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 challengeId = 15;</code>
     * @return The challengeId.
     */
    int getChallengeId();
  }
  /**
   * Protobuf type {@code LanternRiteFireworksChallengeInfo}
   */
  public static final class LanternRiteFireworksChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteFireworksChallengeInfo)
      LanternRiteFireworksChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteFireworksChallengeInfo.newBuilder() to construct.
    private LanternRiteFireworksChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteFireworksChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteFireworksChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.class, emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.Builder.class);
    }

    public static final int ISFULLSCORE_FIELD_NUMBER = 11;
    private boolean isFullScore_ = false;
    /**
     * <code>bool isFullScore = 11;</code>
     * @return The isFullScore.
     */
    @java.lang.Override
    public boolean getIsFullScore() {
      return isFullScore_;
    }

    public static final int BESTSCORE_FIELD_NUMBER = 14;
    private int bestScore_ = 0;
    /**
     * <code>uint32 bestScore = 14;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int CHALLENGEID_FIELD_NUMBER = 15;
    private int challengeId_ = 0;
    /**
     * <code>uint32 challengeId = 15;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
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
      if (isFullScore_ != false) {
        output.writeBool(11, isFullScore_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(14, bestScore_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(15, challengeId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFullScore_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isFullScore_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, bestScore_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, challengeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo other = (emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo) obj;

      if (getIsFullScore()
          != other.getIsFullScore()) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
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
      hash = (37 * hash) + ISFULLSCORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFullScore());
      hash = (37 * hash) + BESTSCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + CHALLENGEID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo prototype) {
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
     * Protobuf type {@code LanternRiteFireworksChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteFireworksChallengeInfo)
        emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.class, emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.newBuilder()
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
        isFullScore_ = false;
        bestScore_ = 0;
        challengeId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo build() {
        emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo buildPartial() {
        emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo result = new emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isFullScore_ = isFullScore_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.bestScore_ = bestScore_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.challengeId_ = challengeId_;
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
        if (other instanceof emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo) {
          return mergeFrom((emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo other) {
        if (other == emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo.getDefaultInstance()) return this;
        if (other.getIsFullScore() != false) {
          setIsFullScore(other.getIsFullScore());
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
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
              case 88: {
                isFullScore_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 112: {
                bestScore_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
              case 120: {
                challengeId_ = input.readUInt32();
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

      private boolean isFullScore_ ;
      /**
       * <code>bool isFullScore = 11;</code>
       * @return The isFullScore.
       */
      @java.lang.Override
      public boolean getIsFullScore() {
        return isFullScore_;
      }
      /**
       * <code>bool isFullScore = 11;</code>
       * @param value The isFullScore to set.
       * @return This builder for chaining.
       */
      public Builder setIsFullScore(boolean value) {
        
        isFullScore_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool isFullScore = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFullScore() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFullScore_ = false;
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 bestScore = 14;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 bestScore = 14;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bestScore = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challengeId = 15;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challengeId = 15;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challengeId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        challengeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteFireworksChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteFireworksChallengeInfo)
    private static final emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo();
    }

    public static emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteFireworksChallengeInfo>() {
      @java.lang.Override
      public LanternRiteFireworksChallengeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LanternRiteFireworksChallengeInfoOuterClass.LanternRiteFireworksChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteFireworksChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'LanternRiteFireworksChallengeInfo.prot" +
      "o\"`\n!LanternRiteFireworksChallengeInfo\022\023" +
      "\n\013isFullScore\030\013 \001(\010\022\021\n\tbestScore\030\016 \001(\r\022\023" +
      "\n\013challengeId\030\017 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteFireworksChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteFireworksChallengeInfo_descriptor,
        new java.lang.String[] { "IsFullScore", "BestScore", "ChallengeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
