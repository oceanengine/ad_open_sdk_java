/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectListV30DataListRelatedProductProductSetting;
import com.bytedance.ads.model.ProjectListV30ResponseDataListInnerRelatedProductProductsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ProjectListV30ResponseDataListInnerRelatedProduct {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_PRODUCT_SETTING = "product_setting";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SETTING)
  private ProjectListV30DataListRelatedProductProductSetting productSetting = null;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ProjectListV30ResponseDataListInnerRelatedProductProductsInner> products = null;

  public static final String SERIALIZED_NAME_UNIQUE_PRODUCT_ID = "unique_product_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PRODUCT_ID)
  private Long uniqueProductId = null;

  public ProjectListV30ResponseDataListInnerRelatedProduct() {
  }

  public ProjectListV30ResponseDataListInnerRelatedProduct productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public ProjectListV30ResponseDataListInnerRelatedProduct productPlatformId(Long productPlatformId) {
    
    this.productPlatformId = productPlatformId;
    return this;
  }

   /**
   * 
   * @return productPlatformId
  **/
  @javax.annotation.Nullable
  public Long getProductPlatformId() {
    return productPlatformId;
  }


  public void setProductPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
  }


  public ProjectListV30ResponseDataListInnerRelatedProduct productSetting(ProjectListV30DataListRelatedProductProductSetting productSetting) {
    
    this.productSetting = productSetting;
    return this;
  }

   /**
   * Get productSetting
   * @return productSetting
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListRelatedProductProductSetting getProductSetting() {
    return productSetting;
  }


  public void setProductSetting(ProjectListV30DataListRelatedProductProductSetting productSetting) {
    this.productSetting = productSetting;
  }


  public ProjectListV30ResponseDataListInnerRelatedProduct products(List<ProjectListV30ResponseDataListInnerRelatedProductProductsInner> products) {
    
    this.products = products;
    return this;
  }

  public ProjectListV30ResponseDataListInnerRelatedProduct addProductsItem(ProjectListV30ResponseDataListInnerRelatedProductProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * 
   * @return products
  **/
  @javax.annotation.Nullable
  public List<ProjectListV30ResponseDataListInnerRelatedProductProductsInner> getProducts() {
    return products;
  }


  public void setProducts(List<ProjectListV30ResponseDataListInnerRelatedProductProductsInner> products) {
    this.products = products;
  }


  public ProjectListV30ResponseDataListInnerRelatedProduct uniqueProductId(Long uniqueProductId) {
    
    this.uniqueProductId = uniqueProductId;
    return this;
  }

   /**
   * 
   * @return uniqueProductId
  **/
  @javax.annotation.Nullable
  public Long getUniqueProductId() {
    return uniqueProductId;
  }


  public void setUniqueProductId(Long uniqueProductId) {
    this.uniqueProductId = uniqueProductId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectListV30ResponseDataListInnerRelatedProduct projectListV30ResponseDataListInnerRelatedProduct = (ProjectListV30ResponseDataListInnerRelatedProduct) o;
    return Objects.equals(this.productId, projectListV30ResponseDataListInnerRelatedProduct.productId) &&
        Objects.equals(this.productPlatformId, projectListV30ResponseDataListInnerRelatedProduct.productPlatformId) &&
        Objects.equals(this.productSetting, projectListV30ResponseDataListInnerRelatedProduct.productSetting) &&
        Objects.equals(this.products, projectListV30ResponseDataListInnerRelatedProduct.products) &&
        Objects.equals(this.uniqueProductId, projectListV30ResponseDataListInnerRelatedProduct.uniqueProductId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productPlatformId, productSetting, products, uniqueProductId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectListV30ResponseDataListInnerRelatedProduct {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
    sb.append("    productSetting: ").append(toIndentedString(productSetting)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    uniqueProductId: ").append(toIndentedString(uniqueProductId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("product_id");
    openapiFields.add("product_platform_id");
    openapiFields.add("product_setting");
    openapiFields.add("products");
    openapiFields.add("unique_product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectListV30ResponseDataListInnerRelatedProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerRelatedProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerRelatedProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerRelatedProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerRelatedProduct>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerRelatedProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerRelatedProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerRelatedProduct given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerRelatedProduct
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerRelatedProduct
  */
  public static ProjectListV30ResponseDataListInnerRelatedProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerRelatedProduct.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerRelatedProduct to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

