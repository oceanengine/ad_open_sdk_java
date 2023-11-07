/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
 * SubscribeAccountsAddV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class SubscribeAccountsAddV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_CORE_USER_ID = "core_user_id";
  @SerializedName(SERIALIZED_NAME_CORE_USER_ID)
  private Long coreUserId = null;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = null;

  public static final String SERIALIZED_NAME_SUBSCRIBE_TASK_ID = "subscribe_task_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_TASK_ID)
  private Long subscribeTaskId = null;

  public SubscribeAccountsAddV30Request() {
  }

  public SubscribeAccountsAddV30Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public SubscribeAccountsAddV30Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public SubscribeAccountsAddV30Request appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nonnull
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public SubscribeAccountsAddV30Request coreUserId(Long coreUserId) {
    
    this.coreUserId = coreUserId;
    return this;
  }

   /**
   * 
   * @return coreUserId
  **/
  @javax.annotation.Nonnull
  public Long getCoreUserId() {
    return coreUserId;
  }


  public void setCoreUserId(Long coreUserId) {
    this.coreUserId = coreUserId;
  }


  public SubscribeAccountsAddV30Request events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public SubscribeAccountsAddV30Request addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * 
   * @return events
  **/
  @javax.annotation.Nullable
  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public SubscribeAccountsAddV30Request subscribeTaskId(Long subscribeTaskId) {
    
    this.subscribeTaskId = subscribeTaskId;
    return this;
  }

   /**
   * 
   * @return subscribeTaskId
  **/
  @javax.annotation.Nonnull
  public Long getSubscribeTaskId() {
    return subscribeTaskId;
  }


  public void setSubscribeTaskId(Long subscribeTaskId) {
    this.subscribeTaskId = subscribeTaskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscribeAccountsAddV30Request subscribeAccountsAddV30Request = (SubscribeAccountsAddV30Request) o;
    return Objects.equals(this.advertiserIds, subscribeAccountsAddV30Request.advertiserIds) &&
        Objects.equals(this.appId, subscribeAccountsAddV30Request.appId) &&
        Objects.equals(this.coreUserId, subscribeAccountsAddV30Request.coreUserId) &&
        Objects.equals(this.events, subscribeAccountsAddV30Request.events) &&
        Objects.equals(this.subscribeTaskId, subscribeAccountsAddV30Request.subscribeTaskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, appId, coreUserId, events, subscribeTaskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscribeAccountsAddV30Request {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    coreUserId: ").append(toIndentedString(coreUserId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    subscribeTaskId: ").append(toIndentedString(subscribeTaskId)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("app_id");
    openapiFields.add("core_user_id");
    openapiFields.add("events");
    openapiFields.add("subscribe_task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("core_user_id");
    openapiRequiredFields.add("subscribe_task_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscribeAccountsAddV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscribeAccountsAddV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscribeAccountsAddV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscribeAccountsAddV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscribeAccountsAddV30Request>() {
           @Override
           public void write(JsonWriter out, SubscribeAccountsAddV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscribeAccountsAddV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscribeAccountsAddV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscribeAccountsAddV30Request
  * @throws IOException if the JSON string is invalid with respect to SubscribeAccountsAddV30Request
  */
  public static SubscribeAccountsAddV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscribeAccountsAddV30Request.class);
  }

 /**
  * Convert an instance of SubscribeAccountsAddV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

