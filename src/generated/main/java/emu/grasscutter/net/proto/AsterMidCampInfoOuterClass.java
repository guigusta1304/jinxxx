// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AsterMidCampInfo.proto

package emu.grasscutter.net.proto;

public final class AsterMidCampInfoOuterClass {
  private AsterMidCampInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AsterMidCampInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AsterMidCampInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 10;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 10;</code>
     * @return The pos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 10;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>uint32 campId = 14;</code>
     * @return The campId.
     */
    int getCampId();
  }
  /**
   * Protobuf type {@code AsterMidCampInfo}
   */
  public static final class AsterMidCampInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AsterMidCampInfo)
      AsterMidCampInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AsterMidCampInfo.newBuilder() to construct.
    private AsterMidCampInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AsterMidCampInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AsterMidCampInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.internal_static_AsterMidCampInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.internal_static_AsterMidCampInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo.class, emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 10;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 10;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 10;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }

    public static final int CAMPID_FIELD_NUMBER = 14;
    private int campId_ = 0;
    /**
     * <code>uint32 campId = 14;</code>
     * @return The campId.
     */
    @java.lang.Override
    public int getCampId() {
      return campId_;
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
      if (pos_ != null) {
        output.writeMessage(10, getPos());
      }
      if (campId_ != 0) {
        output.writeUInt32(14, campId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getPos());
      }
      if (campId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, campId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo other = (emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getCampId()
          != other.getCampId()) return false;
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
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + CAMPID_FIELD_NUMBER;
      hash = (53 * hash) + getCampId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo prototype) {
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
     * Protobuf type {@code AsterMidCampInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AsterMidCampInfo)
        emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.internal_static_AsterMidCampInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.internal_static_AsterMidCampInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo.class, emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo.newBuilder()
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
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        campId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.internal_static_AsterMidCampInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo build() {
        emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo buildPartial() {
        emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo result = new emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pos_ = posBuilder_ == null
              ? pos_
              : posBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.campId_ = campId_;
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
        if (other instanceof emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo other) {
        if (other == emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getCampId() != 0) {
          setCampId(other.getCampId());
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
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 82
              case 112: {
                campId_ = input.readUInt32();
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 10;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.Vector pos = 10;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
        } else {
          posBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            pos_ != null &&
            pos_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPosBuilder().mergeFrom(value);
          } else {
            pos_ = value;
          }
        } else {
          posBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private int campId_ ;
      /**
       * <code>uint32 campId = 14;</code>
       * @return The campId.
       */
      @java.lang.Override
      public int getCampId() {
        return campId_;
      }
      /**
       * <code>uint32 campId = 14;</code>
       * @param value The campId to set.
       * @return This builder for chaining.
       */
      public Builder setCampId(int value) {
        
        campId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 campId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        campId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AsterMidCampInfo)
    }

    // @@protoc_insertion_point(class_scope:AsterMidCampInfo)
    private static final emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo();
    }

    public static emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AsterMidCampInfo>
        PARSER = new com.google.protobuf.AbstractParser<AsterMidCampInfo>() {
      @java.lang.Override
      public AsterMidCampInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<AsterMidCampInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AsterMidCampInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AsterMidCampInfoOuterClass.AsterMidCampInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AsterMidCampInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AsterMidCampInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AsterMidCampInfo.proto\032\014Vector.proto\"8" +
      "\n\020AsterMidCampInfo\022\024\n\003pos\030\n \001(\0132\007.Vector" +
      "\022\016\n\006campId\030\016 \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AsterMidCampInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AsterMidCampInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AsterMidCampInfo_descriptor,
        new java.lang.String[] { "Pos", "CampId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
