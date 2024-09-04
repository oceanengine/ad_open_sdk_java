/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdUpdateStatusV2OptStatus;
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
 * AdUpdateStatusV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class AdUpdateStatusV2Request {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private AdUpdateStatusV2OptStatus optStatus = null;

  public AdUpdateStatusV2Request() {
  }

  public AdUpdateStatusV2Request adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public AdUpdateStatusV2Request addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public AdUpdateStatusV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdUpdateStatusV2Request optStatus(AdUpdateStatusV2OptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nonnull
  public AdUpdateStatusV2OptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(AdUpdateStatusV2OptStatus optStatus) {
    this.optStatus = optStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdUpdateStatusV2Request adUpdateStatusV2Request = (AdUpdateStatusV2Request) o;
    return Objects.equals(this.adIds, adUpdateStatusV2Request.adIds) &&
        Objects.equals(this.advertiserId, adUpdateStatusV2Request.advertiserId) &&
        Objects.equals(this.optStatus, adUpdateStatusV2Request.optStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, advertiserId, optStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUpdateStatusV2Request {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("advertiser_id");
    openapiFields.add("opt_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_ids");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("opt_status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdUpdateStatusV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdUpdateStatusV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdUpdateStatusV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdUpdateStatusV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdUpdateStatusV2Request>() {
           @Override
           public void write(JsonWriter out, AdUpdateStatusV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdUpdateStatusV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdUpdateStatusV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdUpdateStatusV2Request
  * @throws IOException if the JSON string is invalid with respect to AdUpdateStatusV2Request
  */
  public static AdUpdateStatusV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdUpdateStatusV2Request.class);
  }

 /**
  * Convert an instance of AdUpdateStatusV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

