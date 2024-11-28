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
 * StardeliveryTaskUnshareV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class StardeliveryTaskUnshareV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ID = "star_task_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ID)
  private Long starTaskId = null;

  public StardeliveryTaskUnshareV30Request() {
  }

  public StardeliveryTaskUnshareV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StardeliveryTaskUnshareV30Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public StardeliveryTaskUnshareV30Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 取消共享账号范围，一次最多操作50个
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public StardeliveryTaskUnshareV30Request starTaskId(Long starTaskId) {
    
    this.starTaskId = starTaskId;
    return this;
  }

   /**
   * 任务ID
   * @return starTaskId
  **/
  @javax.annotation.Nonnull
  public Long getStarTaskId() {
    return starTaskId;
  }


  public void setStarTaskId(Long starTaskId) {
    this.starTaskId = starTaskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskUnshareV30Request stardeliveryTaskUnshareV30Request = (StardeliveryTaskUnshareV30Request) o;
    return Objects.equals(this.advertiserId, stardeliveryTaskUnshareV30Request.advertiserId) &&
        Objects.equals(this.advertiserIds, stardeliveryTaskUnshareV30Request.advertiserIds) &&
        Objects.equals(this.starTaskId, stardeliveryTaskUnshareV30Request.starTaskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, advertiserIds, starTaskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskUnshareV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    starTaskId: ").append(toIndentedString(starTaskId)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("star_task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("star_task_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskUnshareV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskUnshareV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskUnshareV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskUnshareV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskUnshareV30Request>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskUnshareV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskUnshareV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskUnshareV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskUnshareV30Request
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskUnshareV30Request
  */
  public static StardeliveryTaskUnshareV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskUnshareV30Request.class);
  }

 /**
  * Convert an instance of StardeliveryTaskUnshareV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

