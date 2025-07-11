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
 * 橙子落地页信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EventManagerAssetsCreateV2RequestSiteAsset {
  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Long siteId = null;

  public static final String SERIALIZED_NAME_SITE_NAME = "site_name";
  @SerializedName(SERIALIZED_NAME_SITE_NAME)
  private String siteName = null;

  public EventManagerAssetsCreateV2RequestSiteAsset() {
  }

  public EventManagerAssetsCreateV2RequestSiteAsset siteId(Long siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 橙子建站站点id，橙子落地页必填
   * @return siteId
  **/
  @javax.annotation.Nullable
  public Long getSiteId() {
    return siteId;
  }


  public void setSiteId(Long siteId) {
    this.siteId = siteId;
  }


  public EventManagerAssetsCreateV2RequestSiteAsset siteName(String siteName) {
    
    this.siteName = siteName;
    return this;
  }

   /**
   * 橙子建站站点名称，橙子落地页必填
   * @return siteName
  **/
  @javax.annotation.Nullable
  public String getSiteName() {
    return siteName;
  }


  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAssetsCreateV2RequestSiteAsset eventManagerAssetsCreateV2RequestSiteAsset = (EventManagerAssetsCreateV2RequestSiteAsset) o;
    return Objects.equals(this.siteId, eventManagerAssetsCreateV2RequestSiteAsset.siteId) &&
        Objects.equals(this.siteName, eventManagerAssetsCreateV2RequestSiteAsset.siteName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, siteName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerAssetsCreateV2RequestSiteAsset {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
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
    openapiFields.add("site_id");
    openapiFields.add("site_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAssetsCreateV2RequestSiteAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAssetsCreateV2RequestSiteAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAssetsCreateV2RequestSiteAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAssetsCreateV2RequestSiteAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAssetsCreateV2RequestSiteAsset>() {
           @Override
           public void write(JsonWriter out, EventManagerAssetsCreateV2RequestSiteAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAssetsCreateV2RequestSiteAsset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAssetsCreateV2RequestSiteAsset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAssetsCreateV2RequestSiteAsset
  * @throws IOException if the JSON string is invalid with respect to EventManagerAssetsCreateV2RequestSiteAsset
  */
  public static EventManagerAssetsCreateV2RequestSiteAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAssetsCreateV2RequestSiteAsset.class);
  }

 /**
  * Convert an instance of EventManagerAssetsCreateV2RequestSiteAsset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

