/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DpaClueProductDeleteV2RequestStoreIdAndOuterId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * DpaClueProductDeleteV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class DpaClueProductDeleteV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_STORE_ID_AND_OUTER_ID = "store_id_and_outer_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID_AND_OUTER_ID)
  private DpaClueProductDeleteV2RequestStoreIdAndOuterId storeIdAndOuterId = null;

  public DpaClueProductDeleteV2Request() {
  }

  public DpaClueProductDeleteV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DpaClueProductDeleteV2Request productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public DpaClueProductDeleteV2Request addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 通过巨量商品ID删除
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }


  public DpaClueProductDeleteV2Request storeIdAndOuterId(DpaClueProductDeleteV2RequestStoreIdAndOuterId storeIdAndOuterId) {
    
    this.storeIdAndOuterId = storeIdAndOuterId;
    return this;
  }

   /**
   * Get storeIdAndOuterId
   * @return storeIdAndOuterId
  **/
  @javax.annotation.Nullable
  public DpaClueProductDeleteV2RequestStoreIdAndOuterId getStoreIdAndOuterId() {
    return storeIdAndOuterId;
  }


  public void setStoreIdAndOuterId(DpaClueProductDeleteV2RequestStoreIdAndOuterId storeIdAndOuterId) {
    this.storeIdAndOuterId = storeIdAndOuterId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaClueProductDeleteV2Request dpaClueProductDeleteV2Request = (DpaClueProductDeleteV2Request) o;
    return Objects.equals(this.advertiserId, dpaClueProductDeleteV2Request.advertiserId) &&
        Objects.equals(this.productIds, dpaClueProductDeleteV2Request.productIds) &&
        Objects.equals(this.storeIdAndOuterId, dpaClueProductDeleteV2Request.storeIdAndOuterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, productIds, storeIdAndOuterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaClueProductDeleteV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    storeIdAndOuterId: ").append(toIndentedString(storeIdAndOuterId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("product_ids");
    openapiFields.add("store_id_and_outer_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaClueProductDeleteV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductDeleteV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductDeleteV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductDeleteV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductDeleteV2Request>() {
           @Override
           public void write(JsonWriter out, DpaClueProductDeleteV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductDeleteV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductDeleteV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductDeleteV2Request
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductDeleteV2Request
  */
  public static DpaClueProductDeleteV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductDeleteV2Request.class);
  }

 /**
  * Convert an instance of DpaClueProductDeleteV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

