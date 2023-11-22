// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Slaghterhouse.proto

package com.example.assignment.Protobuf;

/**
 * Protobuf type {@code org.example.ProductListResponse}
 */
public  final class ProductListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.ProductListResponse)
        ProductListResponseOrBuilder {
  // Use ProductListResponse.newBuilder() to construct.
  private ProductListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductListResponse() {
    products_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProductListResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              products_ = new java.util.ArrayList<ProductResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            products_.add(
                input.readMessage(ProductResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Slaghterhouse.internal_static_org_example_ProductListResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Slaghterhouse.internal_static_org_example_ProductListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ProductListResponse.class, ProductListResponse.Builder.class);
  }

  public static final int PRODUCTS_FIELD_NUMBER = 1;
  private java.util.List<ProductResponse> products_;
  /**
   * <code>repeated .org.example.ProductResponse products = 1;</code>
   */
  public java.util.List<ProductResponse> getProductsList() {
    return products_;
  }
  /**
   * <code>repeated .org.example.ProductResponse products = 1;</code>
   */
  public java.util.List<? extends ProductResponseOrBuilder>
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <code>repeated .org.example.ProductResponse products = 1;</code>
   */
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <code>repeated .org.example.ProductResponse products = 1;</code>
   */
  public ProductResponse getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <code>repeated .org.example.ProductResponse products = 1;</code>
   */
  public ProductResponseOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
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
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(1, products_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, products_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ProductListResponse)) {
      return super.equals(obj);
    }
    ProductListResponse other = (ProductListResponse) obj;

    boolean result = true;
    result = result && getProductsList()
        .equals(other.getProductsList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ProductListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProductListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProductListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProductListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProductListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProductListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProductListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProductListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProductListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ProductListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProductListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProductListResponse parseFrom(
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
  public static Builder newBuilder(ProductListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.example.ProductListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.ProductListResponse)
          ProductListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Slaghterhouse.internal_static_org_example_ProductListResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Slaghterhouse.internal_static_org_example_ProductListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProductListResponse.class, ProductListResponse.Builder.class);
    }

    // Construct using org.example.ProductListResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProductsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Slaghterhouse.internal_static_org_example_ProductListResponse_descriptor;
    }

    public ProductListResponse getDefaultInstanceForType() {
      return ProductListResponse.getDefaultInstance();
    }

    public ProductListResponse build() {
      ProductListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ProductListResponse buildPartial() {
      ProductListResponse result = new ProductListResponse(this);
      int from_bitField0_ = bitField0_;
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
      }
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
      if (other instanceof ProductListResponse) {
        return mergeFrom((ProductListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ProductListResponse other) {
      if (other == ProductListResponse.getDefaultInstance()) return this;
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
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
      ProductListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ProductListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ProductResponse> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        products_ = new java.util.ArrayList<ProductResponse>(products_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            ProductResponse, ProductResponse.Builder, ProductResponseOrBuilder> productsBuilder_;

    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public java.util.List<ProductResponse> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public ProductResponse getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder setProducts(
        int index, ProductResponse value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder setProducts(
        int index, ProductResponse.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder addProducts(ProductResponse value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder addProducts(
        int index, ProductResponse value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder addProducts(
        ProductResponse.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder addProducts(
        int index, ProductResponse.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder addAllProducts(
        Iterable<? extends ProductResponse> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public ProductResponse.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public ProductResponseOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public java.util.List<? extends ProductResponseOrBuilder>
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public ProductResponse.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          ProductResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public ProductResponse.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, ProductResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.ProductResponse products = 1;</code>
     */
    public java.util.List<ProductResponse.Builder>
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
            ProductResponse, ProductResponse.Builder, ProductResponseOrBuilder>
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                ProductResponse, ProductResponse.Builder, ProductResponseOrBuilder>(
                products_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.example.ProductListResponse)
  }

  // @@protoc_insertion_point(class_scope:org.example.ProductListResponse)
  private static final ProductListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ProductListResponse();
  }

  public static ProductListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ProductListResponse>() {
    public ProductListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductListResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ProductListResponse> getParserForType() {
    return PARSER;
  }

  public ProductListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

