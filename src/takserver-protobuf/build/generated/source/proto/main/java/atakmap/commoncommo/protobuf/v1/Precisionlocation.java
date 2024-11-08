// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: precisionlocation.proto

package atakmap.commoncommo.protobuf.v1;

public final class Precisionlocation {
  private Precisionlocation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PrecisionLocationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:atakmap.commoncommo.protobuf.v1.PrecisionLocation)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>optional string geopointsrc = 1;</code>
     */
    java.lang.String getGeopointsrc();
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>optional string geopointsrc = 1;</code>
     */
    com.google.protobuf.ByteString
        getGeopointsrcBytes();

    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>optional string altsrc = 2;</code>
     */
    java.lang.String getAltsrc();
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>optional string altsrc = 2;</code>
     */
    com.google.protobuf.ByteString
        getAltsrcBytes();
  }
  /**
   * <pre>
   * All items are required unless otherwise noted!
   * "required" means if they are missing on send, the conversion
   * to the message format will be rejected and fall back to opaque
   * XML representation
   * </pre>
   *
   * Protobuf type {@code atakmap.commoncommo.protobuf.v1.PrecisionLocation}
   */
  public  static final class PrecisionLocation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:atakmap.commoncommo.protobuf.v1.PrecisionLocation)
      PrecisionLocationOrBuilder {
    // Use PrecisionLocation.newBuilder() to construct.
    private PrecisionLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PrecisionLocation() {
      geopointsrc_ = "";
      altsrc_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private PrecisionLocation(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              geopointsrc_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              altsrc_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return atakmap.commoncommo.protobuf.v1.Precisionlocation.internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return atakmap.commoncommo.protobuf.v1.Precisionlocation.internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation.class, atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation.Builder.class);
    }

    public static final int GEOPOINTSRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object geopointsrc_;
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>optional string geopointsrc = 1;</code>
     */
    public java.lang.String getGeopointsrc() {
      java.lang.Object ref = geopointsrc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        geopointsrc_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>optional string geopointsrc = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGeopointsrcBytes() {
      java.lang.Object ref = geopointsrc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        geopointsrc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALTSRC_FIELD_NUMBER = 2;
    private volatile java.lang.Object altsrc_;
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>optional string altsrc = 2;</code>
     */
    public java.lang.String getAltsrc() {
      java.lang.Object ref = altsrc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        altsrc_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>optional string altsrc = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAltsrcBytes() {
      java.lang.Object ref = altsrc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        altsrc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getGeopointsrcBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, geopointsrc_);
      }
      if (!getAltsrcBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, altsrc_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getGeopointsrcBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, geopointsrc_);
      }
      if (!getAltsrcBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, altsrc_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation)) {
        return super.equals(obj);
      }
      atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation other = (atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation) obj;

      boolean result = true;
      result = result && getGeopointsrc()
          .equals(other.getGeopointsrc());
      result = result && getAltsrc()
          .equals(other.getAltsrc());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + GEOPOINTSRC_FIELD_NUMBER;
      hash = (53 * hash) + getGeopointsrc().hashCode();
      hash = (37 * hash) + ALTSRC_FIELD_NUMBER;
      hash = (53 * hash) + getAltsrc().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * All items are required unless otherwise noted!
     * "required" means if they are missing on send, the conversion
     * to the message format will be rejected and fall back to opaque
     * XML representation
     * </pre>
     *
     * Protobuf type {@code atakmap.commoncommo.protobuf.v1.PrecisionLocation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:atakmap.commoncommo.protobuf.v1.PrecisionLocation)
        atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return atakmap.commoncommo.protobuf.v1.Precisionlocation.internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return atakmap.commoncommo.protobuf.v1.Precisionlocation.internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation.class, atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation.Builder.class);
      }

      // Construct using atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation.newBuilder()
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
      public Builder clear() {
        super.clear();
        geopointsrc_ = "";

        altsrc_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return atakmap.commoncommo.protobuf.v1.Precisionlocation.internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_descriptor;
      }

      public atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation getDefaultInstanceForType() {
        return atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation.getDefaultInstance();
      }

      public atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation build() {
        atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation buildPartial() {
        atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation result = new atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation(this);
        result.geopointsrc_ = geopointsrc_;
        result.altsrc_ = altsrc_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation) {
          return mergeFrom((atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation other) {
        if (other == atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation.getDefaultInstance()) return this;
        if (!other.getGeopointsrc().isEmpty()) {
          geopointsrc_ = other.geopointsrc_;
          onChanged();
        }
        if (!other.getAltsrc().isEmpty()) {
          altsrc_ = other.altsrc_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object geopointsrc_ = "";
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>optional string geopointsrc = 1;</code>
       */
      public java.lang.String getGeopointsrc() {
        java.lang.Object ref = geopointsrc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          geopointsrc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>optional string geopointsrc = 1;</code>
       */
      public com.google.protobuf.ByteString
          getGeopointsrcBytes() {
        java.lang.Object ref = geopointsrc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          geopointsrc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>optional string geopointsrc = 1;</code>
       */
      public Builder setGeopointsrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        geopointsrc_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>optional string geopointsrc = 1;</code>
       */
      public Builder clearGeopointsrc() {
        
        geopointsrc_ = getDefaultInstance().getGeopointsrc();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>optional string geopointsrc = 1;</code>
       */
      public Builder setGeopointsrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        geopointsrc_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object altsrc_ = "";
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>optional string altsrc = 2;</code>
       */
      public java.lang.String getAltsrc() {
        java.lang.Object ref = altsrc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          altsrc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>optional string altsrc = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAltsrcBytes() {
        java.lang.Object ref = altsrc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          altsrc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>optional string altsrc = 2;</code>
       */
      public Builder setAltsrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        altsrc_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>optional string altsrc = 2;</code>
       */
      public Builder clearAltsrc() {
        
        altsrc_ = getDefaultInstance().getAltsrc();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>optional string altsrc = 2;</code>
       */
      public Builder setAltsrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        altsrc_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:atakmap.commoncommo.protobuf.v1.PrecisionLocation)
    }

    // @@protoc_insertion_point(class_scope:atakmap.commoncommo.protobuf.v1.PrecisionLocation)
    private static final atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation();
    }

    public static atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PrecisionLocation>
        PARSER = new com.google.protobuf.AbstractParser<PrecisionLocation>() {
      public PrecisionLocation parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new PrecisionLocation(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PrecisionLocation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PrecisionLocation> getParserForType() {
      return PARSER;
    }

    public atakmap.commoncommo.protobuf.v1.Precisionlocation.PrecisionLocation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027precisionlocation.proto\022\037atakmap.commo" +
      "ncommo.protobuf.v1\"8\n\021PrecisionLocation\022" +
      "\023\n\013geopointsrc\030\001 \001(\t\022\016\n\006altsrc\030\002 \001(\tb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_atakmap_commoncommo_protobuf_v1_PrecisionLocation_descriptor,
        new java.lang.String[] { "Geopointsrc", "Altsrc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
