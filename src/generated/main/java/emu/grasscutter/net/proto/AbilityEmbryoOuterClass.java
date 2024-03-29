// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityEmbryo.proto

package emu.grasscutter.net.proto;

public final class AbilityEmbryoOuterClass {
  private AbilityEmbryoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityEmbryoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityEmbryo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 abilityId = 1;</code>
     * @return The abilityId.
     */
    int getAbilityId();

    /**
     * <code>fixed32 abilityNameHash = 2;</code>
     * @return The abilityNameHash.
     */
    int getAbilityNameHash();

    /**
     * <code>fixed32 abilityOverrideNameHash = 3;</code>
     * @return The abilityOverrideNameHash.
     */
    int getAbilityOverrideNameHash();
  }
  /**
   * Protobuf type {@code AbilityEmbryo}
   */
  public static final class AbilityEmbryo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityEmbryo)
      AbilityEmbryoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityEmbryo.newBuilder() to construct.
    private AbilityEmbryo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityEmbryo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityEmbryo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.class, emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.Builder.class);
    }

    public static final int ABILITYID_FIELD_NUMBER = 1;
    private int abilityId_ = 0;
    /**
     * <code>uint32 abilityId = 1;</code>
     * @return The abilityId.
     */
    @java.lang.Override
    public int getAbilityId() {
      return abilityId_;
    }

    public static final int ABILITYNAMEHASH_FIELD_NUMBER = 2;
    private int abilityNameHash_ = 0;
    /**
     * <code>fixed32 abilityNameHash = 2;</code>
     * @return The abilityNameHash.
     */
    @java.lang.Override
    public int getAbilityNameHash() {
      return abilityNameHash_;
    }

    public static final int ABILITYOVERRIDENAMEHASH_FIELD_NUMBER = 3;
    private int abilityOverrideNameHash_ = 0;
    /**
     * <code>fixed32 abilityOverrideNameHash = 3;</code>
     * @return The abilityOverrideNameHash.
     */
    @java.lang.Override
    public int getAbilityOverrideNameHash() {
      return abilityOverrideNameHash_;
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
      if (abilityId_ != 0) {
        output.writeUInt32(1, abilityId_);
      }
      if (abilityNameHash_ != 0) {
        output.writeFixed32(2, abilityNameHash_);
      }
      if (abilityOverrideNameHash_ != 0) {
        output.writeFixed32(3, abilityOverrideNameHash_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (abilityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, abilityId_);
      }
      if (abilityNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, abilityNameHash_);
      }
      if (abilityOverrideNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, abilityOverrideNameHash_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo other = (emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo) obj;

      if (getAbilityId()
          != other.getAbilityId()) return false;
      if (getAbilityNameHash()
          != other.getAbilityNameHash()) return false;
      if (getAbilityOverrideNameHash()
          != other.getAbilityOverrideNameHash()) return false;
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
      hash = (37 * hash) + ABILITYID_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityId();
      hash = (37 * hash) + ABILITYNAMEHASH_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityNameHash();
      hash = (37 * hash) + ABILITYOVERRIDENAMEHASH_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityOverrideNameHash();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo prototype) {
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
     * Protobuf type {@code AbilityEmbryo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityEmbryo)
        emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.class, emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.newBuilder()
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
        abilityId_ = 0;
        abilityNameHash_ = 0;
        abilityOverrideNameHash_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo build() {
        emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo buildPartial() {
        emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo result = new emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.abilityId_ = abilityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.abilityNameHash_ = abilityNameHash_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.abilityOverrideNameHash_ = abilityOverrideNameHash_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo other) {
        if (other == emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance()) return this;
        if (other.getAbilityId() != 0) {
          setAbilityId(other.getAbilityId());
        }
        if (other.getAbilityNameHash() != 0) {
          setAbilityNameHash(other.getAbilityNameHash());
        }
        if (other.getAbilityOverrideNameHash() != 0) {
          setAbilityOverrideNameHash(other.getAbilityOverrideNameHash());
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
              case 8: {
                abilityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 21: {
                abilityNameHash_ = input.readFixed32();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
              case 29: {
                abilityOverrideNameHash_ = input.readFixed32();
                bitField0_ |= 0x00000004;
                break;
              } // case 29
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

      private int abilityId_ ;
      /**
       * <code>uint32 abilityId = 1;</code>
       * @return The abilityId.
       */
      @java.lang.Override
      public int getAbilityId() {
        return abilityId_;
      }
      /**
       * <code>uint32 abilityId = 1;</code>
       * @param value The abilityId to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityId(int value) {
        
        abilityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 abilityId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        abilityId_ = 0;
        onChanged();
        return this;
      }

      private int abilityNameHash_ ;
      /**
       * <code>fixed32 abilityNameHash = 2;</code>
       * @return The abilityNameHash.
       */
      @java.lang.Override
      public int getAbilityNameHash() {
        return abilityNameHash_;
      }
      /**
       * <code>fixed32 abilityNameHash = 2;</code>
       * @param value The abilityNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityNameHash(int value) {
        
        abilityNameHash_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 abilityNameHash = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityNameHash() {
        bitField0_ = (bitField0_ & ~0x00000002);
        abilityNameHash_ = 0;
        onChanged();
        return this;
      }

      private int abilityOverrideNameHash_ ;
      /**
       * <code>fixed32 abilityOverrideNameHash = 3;</code>
       * @return The abilityOverrideNameHash.
       */
      @java.lang.Override
      public int getAbilityOverrideNameHash() {
        return abilityOverrideNameHash_;
      }
      /**
       * <code>fixed32 abilityOverrideNameHash = 3;</code>
       * @param value The abilityOverrideNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityOverrideNameHash(int value) {
        
        abilityOverrideNameHash_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 abilityOverrideNameHash = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityOverrideNameHash() {
        bitField0_ = (bitField0_ & ~0x00000004);
        abilityOverrideNameHash_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityEmbryo)
    }

    // @@protoc_insertion_point(class_scope:AbilityEmbryo)
    private static final emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo();
    }

    public static emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityEmbryo>
        PARSER = new com.google.protobuf.AbstractParser<AbilityEmbryo>() {
      @java.lang.Override
      public AbilityEmbryo parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityEmbryo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityEmbryo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityEmbryoOuterClass.AbilityEmbryo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityEmbryo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityEmbryo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023AbilityEmbryo.proto\"\\\n\rAbilityEmbryo\022\021" +
      "\n\tabilityId\030\001 \001(\r\022\027\n\017abilityNameHash\030\002 \001" +
      "(\007\022\037\n\027abilityOverrideNameHash\030\003 \001(\007B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityEmbryo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityEmbryo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityEmbryo_descriptor,
        new java.lang.String[] { "AbilityId", "AbilityNameHash", "AbilityOverrideNameHash", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
