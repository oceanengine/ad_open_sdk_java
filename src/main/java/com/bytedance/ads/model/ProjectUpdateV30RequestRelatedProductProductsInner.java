/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ProjectUpdateV30RequestRelatedProductProductsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ProjectUpdateV30RequestRelatedProductProductsInner {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_UNIQUE_PRODUCT_ID = "unique_product_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PRODUCT_ID)
  private Long uniqueProductId = null;

  public ProjectUpdateV30RequestRelatedProductProductsInner() {
  }

  public ProjectUpdateV30RequestRelatedProductProductsInner productId(String productId) {
    
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


  public ProjectUpdateV30RequestRelatedProductProductsInner productPlatformId(Long productPlatformId) {
    
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


  public ProjectUpdateV30RequestRelatedProductProductsInner uniqueProductId(Long uniqueProductId) {
    
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
    ProjectUpdateV30RequestRelatedProductProductsInner projectUpdateV30RequestRelatedProductProductsInner = (ProjectUpdateV30RequestRelatedProductProductsInner) o;
    return Objects.equals(this.productId, projectUpdateV30RequestRelatedProductProductsInner.productId) &&
        Objects.equals(this.productPlatformId, projectUpdateV30RequestRelatedProductProductsInner.productPlatformId) &&
        Objects.equals(this.uniqueProductId, projectUpdateV30RequestRelatedProductProductsInner.uniqueProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productPlatformId, uniqueProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateV30RequestRelatedProductProductsInner {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
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
    openapiFields.add("unique_product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUpdateV30RequestRelatedProductProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUpdateV30RequestRelatedProductProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUpdateV30RequestRelatedProductProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUpdateV30RequestRelatedProductProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUpdateV30RequestRelatedProductProductsInner>() {
           @Override
           public void write(JsonWriter out, ProjectUpdateV30RequestRelatedProductProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUpdateV30RequestRelatedProductProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectUpdateV30RequestRelatedProductProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectUpdateV30RequestRelatedProductProductsInner
  * @throws IOException if the JSON string is invalid with respect to ProjectUpdateV30RequestRelatedProductProductsInner
  */
  public static ProjectUpdateV30RequestRelatedProductProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUpdateV30RequestRelatedProductProductsInner.class);
  }

 /**
  * Convert an instance of ProjectUpdateV30RequestRelatedProductProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

