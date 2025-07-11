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
import com.bytedance.ads.model.EventManagerEventsCreateV2TrackTypes;
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
 * EventManagerEventsCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EventManagerEventsCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId = null;

  public static final String SERIALIZED_NAME_TRACK_TYPES = "track_types";
  @SerializedName(SERIALIZED_NAME_TRACK_TYPES)
  private List<EventManagerEventsCreateV2TrackTypes> trackTypes = null;

  public EventManagerEventsCreateV2Request() {
  }

  public EventManagerEventsCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID 
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


  public EventManagerEventsCreateV2Request assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 资产ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return assetId
  **/
  @javax.annotation.Nonnull
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public EventManagerEventsCreateV2Request eventId(Long eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * 事件ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return eventId
  **/
  @javax.annotation.Nonnull
  public Long getEventId() {
    return eventId;
  }


  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }


  public EventManagerEventsCreateV2Request trackTypes(List<EventManagerEventsCreateV2TrackTypes> trackTypes) {
    
    this.trackTypes = trackTypes;
    return this;
  }

  public EventManagerEventsCreateV2Request addTrackTypesItem(EventManagerEventsCreateV2TrackTypes trackTypesItem) {
    if (this.trackTypes == null) {
      this.trackTypes = new ArrayList<>();
    }
    this.trackTypes.add(trackTypesItem);
    return this;
  }

   /**
   * 事件回传方式列表，允许值：&#x60;JSSDK&#x60; JS埋码 、&#x60;EXTERNAL_API&#x60; API回传 、&#x60;XPATH&#x60; XPath圈选
   * @return trackTypes
  **/
  @javax.annotation.Nonnull
  public List<EventManagerEventsCreateV2TrackTypes> getTrackTypes() {
    return trackTypes;
  }


  public void setTrackTypes(List<EventManagerEventsCreateV2TrackTypes> trackTypes) {
    this.trackTypes = trackTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerEventsCreateV2Request eventManagerEventsCreateV2Request = (EventManagerEventsCreateV2Request) o;
    return Objects.equals(this.advertiserId, eventManagerEventsCreateV2Request.advertiserId) &&
        Objects.equals(this.assetId, eventManagerEventsCreateV2Request.assetId) &&
        Objects.equals(this.eventId, eventManagerEventsCreateV2Request.eventId) &&
        Objects.equals(this.trackTypes, eventManagerEventsCreateV2Request.trackTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, assetId, eventId, trackTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerEventsCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    trackTypes: ").append(toIndentedString(trackTypes)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("event_id");
    openapiFields.add("track_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("asset_id");
    openapiRequiredFields.add("event_id");
    openapiRequiredFields.add("track_types");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerEventsCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerEventsCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerEventsCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerEventsCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerEventsCreateV2Request>() {
           @Override
           public void write(JsonWriter out, EventManagerEventsCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerEventsCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerEventsCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerEventsCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to EventManagerEventsCreateV2Request
  */
  public static EventManagerEventsCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerEventsCreateV2Request.class);
  }

 /**
  * Convert an instance of EventManagerEventsCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

