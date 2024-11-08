// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: group.proto

package atakmap.commoncommo.protobuf.v1;

public final class GroupOuterClass {
  private GroupOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:atakmap.commoncommo.protobuf.v1.Group)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>optional string role = 2;</code>
     */
    java.lang.String getRole();
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>optional string role = 2;</code>
     */
    com.google.protobuf.ByteString
        getRoleBytes();
  }
  /**
   * <pre>
   * All items are required unless otherwise noted!
   * "required" means if they are missing on send, the conversion
   * to the message format will be rejected and fall back to opaque
   * XML representation
   * </pre>
   *
   * Protobuf type {@code atakmap.commoncommo.protobuf.v1.Group}
   */
  public  static final class Group extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:atakmap.commoncommo.protobuf.v1.Group)
      GroupOrBuilder {
    // Use Group.newBuilder() to construct.
    private Group(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Group() {
      name_ = "";
      role_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Group(
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

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              role_ = s;
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
      return atakmap.commoncommo.protobuf.v1.GroupOuterClass.internal_static_atakmap_commoncommo_protobuf_v1_Group_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return atakmap.commoncommo.protobuf.v1.GroupOuterClass.internal_static_atakmap_commoncommo_protobuf_v1_Group_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group.class, atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROLE_FIELD_NUMBER = 2;
    private volatile java.lang.Object role_;
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>optional string role = 2;</code>
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>optional string role = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        role_ = b;
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getRoleBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, role_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getRoleBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, role_);
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
      if (!(obj instanceof atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group)) {
        return super.equals(obj);
      }
      atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group other = (atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && getRole()
          .equals(other.getRole());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + ROLE_FIELD_NUMBER;
      hash = (53 * hash) + getRole().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parseFrom(
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
    public static Builder newBuilder(atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group prototype) {
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
     * Protobuf type {@code atakmap.commoncommo.protobuf.v1.Group}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:atakmap.commoncommo.protobuf.v1.Group)
        atakmap.commoncommo.protobuf.v1.GroupOuterClass.GroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return atakmap.commoncommo.protobuf.v1.GroupOuterClass.internal_static_atakmap_commoncommo_protobuf_v1_Group_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return atakmap.commoncommo.protobuf.v1.GroupOuterClass.internal_static_atakmap_commoncommo_protobuf_v1_Group_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group.class, atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group.Builder.class);
      }

      // Construct using atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group.newBuilder()
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
        name_ = "";

        role_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return atakmap.commoncommo.protobuf.v1.GroupOuterClass.internal_static_atakmap_commoncommo_protobuf_v1_Group_descriptor;
      }

      public atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group getDefaultInstanceForType() {
        return atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group.getDefaultInstance();
      }

      public atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group build() {
        atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group buildPartial() {
        atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group result = new atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group(this);
        result.name_ = name_;
        result.role_ = role_;
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
        if (other instanceof atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group) {
          return mergeFrom((atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group other) {
        if (other == atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getRole().isEmpty()) {
          role_ = other.role_;
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
        atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object role_ = "";
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>optional string role = 2;</code>
       */
      public java.lang.String getRole() {
        java.lang.Object ref = role_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          role_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>optional string role = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRoleBytes() {
        java.lang.Object ref = role_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          role_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>optional string role = 2;</code>
       */
      public Builder setRole(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        role_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>optional string role = 2;</code>
       */
      public Builder clearRole() {
        
        role_ = getDefaultInstance().getRole();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>optional string role = 2;</code>
       */
      public Builder setRoleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        role_ = value;
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


      // @@protoc_insertion_point(builder_scope:atakmap.commoncommo.protobuf.v1.Group)
    }

    // @@protoc_insertion_point(class_scope:atakmap.commoncommo.protobuf.v1.Group)
    private static final atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group();
    }

    public static atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Group>
        PARSER = new com.google.protobuf.AbstractParser<Group>() {
      public Group parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Group(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Group> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Group> getParserForType() {
      return PARSER;
    }

    public atakmap.commoncommo.protobuf.v1.GroupOuterClass.Group getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_atakmap_commoncommo_protobuf_v1_Group_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_atakmap_commoncommo_protobuf_v1_Group_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013group.proto\022\037atakmap.commoncommo.proto" +
      "buf.v1\"#\n\005Group\022\014\n\004name\030\001 \001(\t\022\014\n\004role\030\002 " +
      "\001(\tb\006proto3"
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
    internal_static_atakmap_commoncommo_protobuf_v1_Group_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_atakmap_commoncommo_protobuf_v1_Group_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_atakmap_commoncommo_protobuf_v1_Group_descriptor,
        new java.lang.String[] { "Name", "Role", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
