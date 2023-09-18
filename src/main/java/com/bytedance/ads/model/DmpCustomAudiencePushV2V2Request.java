/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
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
 * DmpCustomAudiencePushV2V2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class DmpCustomAudiencePushV2V2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_ID = "custom_audience_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_ID)
  private Long customAudienceId = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_IDS = "target_advertiser_ids";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_IDS)
  private List<Long> targetAdvertiserIds = null;

  public DmpCustomAudiencePushV2V2Request() {
  }

  public DmpCustomAudiencePushV2V2Request advertiserId(Long advertiserId) {
    
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


  public DmpCustomAudiencePushV2V2Request customAudienceId(Long customAudienceId) {
    
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return customAudienceId
  **/
  @javax.annotation.Nonnull
  public Long getCustomAudienceId() {
    return customAudienceId;
  }


  public void setCustomAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
  }


  public DmpCustomAudiencePushV2V2Request targetAdvertiserIds(List<Long> targetAdvertiserIds) {
    
    this.targetAdvertiserIds = targetAdvertiserIds;
    return this;
  }

  public DmpCustomAudiencePushV2V2Request addTargetAdvertiserIdsItem(Long targetAdvertiserIdsItem) {
    if (this.targetAdvertiserIds == null) {
      this.targetAdvertiserIds = new ArrayList<>();
    }
    this.targetAdvertiserIds.add(targetAdvertiserIdsItem);
    return this;
  }

   /**
   * 
   * @return targetAdvertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getTargetAdvertiserIds() {
    return targetAdvertiserIds;
  }


  public void setTargetAdvertiserIds(List<Long> targetAdvertiserIds) {
    this.targetAdvertiserIds = targetAdvertiserIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpCustomAudiencePushV2V2Request dmpCustomAudiencePushV2V2Request = (DmpCustomAudiencePushV2V2Request) o;
    return Objects.equals(this.advertiserId, dmpCustomAudiencePushV2V2Request.advertiserId) &&
        Objects.equals(this.customAudienceId, dmpCustomAudiencePushV2V2Request.customAudienceId) &&
        Objects.equals(this.targetAdvertiserIds, dmpCustomAudiencePushV2V2Request.targetAdvertiserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, customAudienceId, targetAdvertiserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpCustomAudiencePushV2V2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    targetAdvertiserIds: ").append(toIndentedString(targetAdvertiserIds)).append("\n");
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
    openapiFields.add("custom_audience_id");
    openapiFields.add("target_advertiser_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("custom_audience_id");
    openapiRequiredFields.add("target_advertiser_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpCustomAudiencePushV2V2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpCustomAudiencePushV2V2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpCustomAudiencePushV2V2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpCustomAudiencePushV2V2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpCustomAudiencePushV2V2Request>() {
           @Override
           public void write(JsonWriter out, DmpCustomAudiencePushV2V2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpCustomAudiencePushV2V2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpCustomAudiencePushV2V2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpCustomAudiencePushV2V2Request
  * @throws IOException if the JSON string is invalid with respect to DmpCustomAudiencePushV2V2Request
  */
  public static DmpCustomAudiencePushV2V2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpCustomAudiencePushV2V2Request.class);
  }

 /**
  * Convert an instance of DmpCustomAudiencePushV2V2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
