/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
 * ReportLiveRoomProductGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class ReportLiveRoomProductGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Object fields = null;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORY = "product_category";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORY)
  private String productCategory = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_PICTURE = "product_picture";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PICTURE)
  private String productPicture = null;

  public static final String SERIALIZED_NAME_PRODUCT_URL = "product_url";
  @SerializedName(SERIALIZED_NAME_PRODUCT_URL)
  private String productUrl = null;

  public ReportLiveRoomProductGetV2ResponseDataListInner() {
  }

  public ReportLiveRoomProductGetV2ResponseDataListInner fields(Object fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * 
   * @return fields
  **/
  @javax.annotation.Nullable
  public Object getFields() {
    return fields;
  }


  public void setFields(Object fields) {
    this.fields = fields;
  }


  public ReportLiveRoomProductGetV2ResponseDataListInner productCategory(String productCategory) {
    
    this.productCategory = productCategory;
    return this;
  }

   /**
   * 
   * @return productCategory
  **/
  @javax.annotation.Nullable
  public String getProductCategory() {
    return productCategory;
  }


  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }


  public ReportLiveRoomProductGetV2ResponseDataListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public ReportLiveRoomProductGetV2ResponseDataListInner productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public ReportLiveRoomProductGetV2ResponseDataListInner productPicture(String productPicture) {
    
    this.productPicture = productPicture;
    return this;
  }

   /**
   * 
   * @return productPicture
  **/
  @javax.annotation.Nullable
  public String getProductPicture() {
    return productPicture;
  }


  public void setProductPicture(String productPicture) {
    this.productPicture = productPicture;
  }


  public ReportLiveRoomProductGetV2ResponseDataListInner productUrl(String productUrl) {
    
    this.productUrl = productUrl;
    return this;
  }

   /**
   * 
   * @return productUrl
  **/
  @javax.annotation.Nullable
  public String getProductUrl() {
    return productUrl;
  }


  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportLiveRoomProductGetV2ResponseDataListInner reportLiveRoomProductGetV2ResponseDataListInner = (ReportLiveRoomProductGetV2ResponseDataListInner) o;
    return Objects.equals(this.fields, reportLiveRoomProductGetV2ResponseDataListInner.fields) &&
        Objects.equals(this.productCategory, reportLiveRoomProductGetV2ResponseDataListInner.productCategory) &&
        Objects.equals(this.productId, reportLiveRoomProductGetV2ResponseDataListInner.productId) &&
        Objects.equals(this.productName, reportLiveRoomProductGetV2ResponseDataListInner.productName) &&
        Objects.equals(this.productPicture, reportLiveRoomProductGetV2ResponseDataListInner.productPicture) &&
        Objects.equals(this.productUrl, reportLiveRoomProductGetV2ResponseDataListInner.productUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, productCategory, productId, productName, productPicture, productUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportLiveRoomProductGetV2ResponseDataListInner {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPicture: ").append(toIndentedString(productPicture)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
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
    openapiFields.add("fields");
    openapiFields.add("product_category");
    openapiFields.add("product_id");
    openapiFields.add("product_name");
    openapiFields.add("product_picture");
    openapiFields.add("product_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportLiveRoomProductGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportLiveRoomProductGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportLiveRoomProductGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportLiveRoomProductGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportLiveRoomProductGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportLiveRoomProductGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportLiveRoomProductGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportLiveRoomProductGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportLiveRoomProductGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportLiveRoomProductGetV2ResponseDataListInner
  */
  public static ReportLiveRoomProductGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportLiveRoomProductGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportLiveRoomProductGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

