// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamChainEnterDungeonReq.proto

package emu.grasscutter.net.proto;

public final class TeamChainEnterDungeonReqOuterClass {
  private TeamChainEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamChainEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamChainEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool gocbaipjdlk = 11;</code>
     * @return The gocbaipjdlk.
     */
    boolean getGocbaipjdlk();
  }
  /**
   * <pre>
   *enum LCMGICGLAFM {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 21856;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code TeamChainEnterDungeonReq}
   */
  public static final class TeamChainEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamChainEnterDungeonReq)
      TeamChainEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamChainEnterDungeonReq.newBuilder() to construct.
    private TeamChainEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamChainEnterDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamChainEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeamChainEnterDungeonReq(
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
            case 88: {

              gocbaipjdlk_ = input.readBool();
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
      return emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.class, emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.Builder.class);
    }

    public static final int GOCBAIPJDLK_FIELD_NUMBER = 11;
    private boolean gocbaipjdlk_;
    /**
     * <code>bool gocbaipjdlk = 11;</code>
     * @return The gocbaipjdlk.
     */
    @java.lang.Override
    public boolean getGocbaipjdlk() {
      return gocbaipjdlk_;
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
      if (gocbaipjdlk_ != false) {
        output.writeBool(11, gocbaipjdlk_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gocbaipjdlk_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, gocbaipjdlk_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq other = (emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq) obj;

      if (getGocbaipjdlk()
          != other.getGocbaipjdlk()) return false;
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
      hash = (37 * hash) + GOCBAIPJDLK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGocbaipjdlk());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq prototype) {
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
     *enum LCMGICGLAFM {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 21856;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code TeamChainEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamChainEnterDungeonReq)
        emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.class, emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.newBuilder()
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
        gocbaipjdlk_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq build() {
        emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq buildPartial() {
        emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq result = new emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq(this);
        result.gocbaipjdlk_ = gocbaipjdlk_;
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
        if (other instanceof emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq other) {
        if (other == emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.getDefaultInstance()) return this;
        if (other.getGocbaipjdlk() != false) {
          setGocbaipjdlk(other.getGocbaipjdlk());
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
        emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean gocbaipjdlk_ ;
      /**
       * <code>bool gocbaipjdlk = 11;</code>
       * @return The gocbaipjdlk.
       */
      @java.lang.Override
      public boolean getGocbaipjdlk() {
        return gocbaipjdlk_;
      }
      /**
       * <code>bool gocbaipjdlk = 11;</code>
       * @param value The gocbaipjdlk to set.
       * @return This builder for chaining.
       */
      public Builder setGocbaipjdlk(boolean value) {
        
        gocbaipjdlk_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool gocbaipjdlk = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGocbaipjdlk() {
        
        gocbaipjdlk_ = false;
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


      // @@protoc_insertion_point(builder_scope:TeamChainEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:TeamChainEnterDungeonReq)
    private static final emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq();
    }

    public static emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamChainEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<TeamChainEnterDungeonReq>() {
      @java.lang.Override
      public TeamChainEnterDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamChainEnterDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeamChainEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamChainEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamChainEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamChainEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036TeamChainEnterDungeonReq.proto\"/\n\030Team" +
      "ChainEnterDungeonReq\022\023\n\013gocbaipjdlk\030\013 \001(" +
      "\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TeamChainEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamChainEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamChainEnterDungeonReq_descriptor,
        new java.lang.String[] { "Gocbaipjdlk", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}