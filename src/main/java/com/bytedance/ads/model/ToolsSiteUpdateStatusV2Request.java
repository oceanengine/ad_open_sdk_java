/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
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
 * ToolsSiteUpdateStatusV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsSiteUpdateStatusV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_SITE_IDS = "site_ids";
  @SerializedName(SERIALIZED_NAME_SITE_IDS)
  private List<String> siteIds = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public ToolsSiteUpdateStatusV2Request() {
  }

  public ToolsSiteUpdateStatusV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id， 传的这个advertiser_id的数字的范围：1 &lt;&#x3D; advertiser_id &lt;&#x3D; MAX_INT64
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsSiteUpdateStatusV2Request siteIds(List<String> siteIds) {
    
    this.siteIds = siteIds;
    return this;
  }

  public ToolsSiteUpdateStatusV2Request addSiteIdsItem(String siteIdsItem) {
    if (this.siteIds == null) {
      this.siteIds = new ArrayList<>();
    }
    this.siteIds.add(siteIdsItem);
    return this;
  }

   /**
   * 橙子建站站点id列表 ：1 &lt;&#x3D; 长度 &lt;&#x3D; 20
   * @return siteIds
  **/
  @javax.annotation.Nonnull
  public List<String> getSiteIds() {
    return siteIds;
  }


  public void setSiteIds(List<String> siteIds) {
    this.siteIds = siteIds;
  }


  public ToolsSiteUpdateStatusV2Request status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 站点操作状态
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateStatusV2Request toolsSiteUpdateStatusV2Request = (ToolsSiteUpdateStatusV2Request) o;
    return Objects.equals(this.advertiserId, toolsSiteUpdateStatusV2Request.advertiserId) &&
        Objects.equals(this.siteIds, toolsSiteUpdateStatusV2Request.siteIds) &&
        Objects.equals(this.status, toolsSiteUpdateStatusV2Request.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, siteIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateStatusV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    siteIds: ").append(toIndentedString(siteIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("site_ids");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("site_ids");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateStatusV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateStatusV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateStatusV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateStatusV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateStatusV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateStatusV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateStatusV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateStatusV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateStatusV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateStatusV2Request
  */
  public static ToolsSiteUpdateStatusV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateStatusV2Request.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateStatusV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

