/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus;
import com.bytedance.ads.model.EventManagerEventConfigsGetV2DataEventConfigsTrackTypes;
import com.bytedance.ads.model.EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration;
import com.bytedance.ads.model.EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerPropertiesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * EventManagerEventConfigsGetV2ResponseDataEventConfigsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class EventManagerEventConfigsGetV2ResponseDataEventConfigsInner {
  public static final String SERIALIZED_NAME_ATTRIBUTION_CONFIGURATION = "attribution_configuration";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTION_CONFIGURATION)
  private EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration attributionConfiguration = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEBUGGING_STATUS = "debugging_status";
  @SerializedName(SERIALIZED_NAME_DEBUGGING_STATUS)
  private EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus debuggingStatus = null;

  public static final String SERIALIZED_NAME_EVENT_CN_NAME = "event_cn_name";
  @SerializedName(SERIALIZED_NAME_EVENT_CN_NAME)
  private String eventCnName = null;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId = null;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerPropertiesInner> properties = null;

  public static final String SERIALIZED_NAME_TRACK_TYPES = "track_types";
  @SerializedName(SERIALIZED_NAME_TRACK_TYPES)
  private List<EventManagerEventConfigsGetV2DataEventConfigsTrackTypes> trackTypes = null;

  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner() {
  }

  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner attributionConfiguration(EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration attributionConfiguration) {
    
    this.attributionConfiguration = attributionConfiguration;
    return this;
  }

   /**
   * Get attributionConfiguration
   * @return attributionConfiguration
  **/
  @javax.annotation.Nullable
  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration getAttributionConfiguration() {
    return attributionConfiguration;
  }


  public void setAttributionConfiguration(EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerAttributionConfiguration attributionConfiguration) {
    this.attributionConfiguration = attributionConfiguration;
  }


  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 事件创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner debuggingStatus(EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus debuggingStatus) {
    
    this.debuggingStatus = debuggingStatus;
    return this;
  }

   /**
   * Get debuggingStatus
   * @return debuggingStatus
  **/
  @javax.annotation.Nullable
  public EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus getDebuggingStatus() {
    return debuggingStatus;
  }


  public void setDebuggingStatus(EventManagerEventConfigsGetV2DataEventConfigsDebuggingStatus debuggingStatus) {
    this.debuggingStatus = debuggingStatus;
  }


  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner eventCnName(String eventCnName) {
    
    this.eventCnName = eventCnName;
    return this;
  }

   /**
   * 事件中文名称
   * @return eventCnName
  **/
  @javax.annotation.Nullable
  public String getEventCnName() {
    return eventCnName;
  }


  public void setEventCnName(String eventCnName) {
    this.eventCnName = eventCnName;
  }


  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner eventId(Long eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * 事件ID
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }


  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }


  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * 事件类型
   * @return eventType
  **/
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner properties(List<EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerPropertiesInner> properties) {
    
    this.properties = properties;
    return this;
  }

  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner addPropertiesItem(EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerPropertiesInner propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * 事件的附加属性
   * @return properties
  **/
  @javax.annotation.Nullable
  public List<EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerPropertiesInner> getProperties() {
    return properties;
  }


  public void setProperties(List<EventManagerEventConfigsGetV2ResponseDataEventConfigsInnerPropertiesInner> properties) {
    this.properties = properties;
  }


  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner trackTypes(List<EventManagerEventConfigsGetV2DataEventConfigsTrackTypes> trackTypes) {
    
    this.trackTypes = trackTypes;
    return this;
  }

  public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner addTrackTypesItem(EventManagerEventConfigsGetV2DataEventConfigsTrackTypes trackTypesItem) {
    if (this.trackTypes == null) {
      this.trackTypes = new ArrayList<>();
    }
    this.trackTypes.add(trackTypesItem);
    return this;
  }

   /**
   * 事件回传方式列表，允许值:落地页支持:&#x60;JSSDK&#x60; JS埋码 、&#x60;EXTERNAL_API&#x60; API回传、&#x60;XPATH&#x60; XPath圈选应用支持：&#x60;APPLICATION_API&#x60; 应用API、&#x60;APPLICATION_SDK&#x60; 应用SDK、快应用支持：&#x60;QUICK_APP_API&#x60; 快应用API
   * @return trackTypes
  **/
  @javax.annotation.Nullable
  public List<EventManagerEventConfigsGetV2DataEventConfigsTrackTypes> getTrackTypes() {
    return trackTypes;
  }


  public void setTrackTypes(List<EventManagerEventConfigsGetV2DataEventConfigsTrackTypes> trackTypes) {
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
    EventManagerEventConfigsGetV2ResponseDataEventConfigsInner eventManagerEventConfigsGetV2ResponseDataEventConfigsInner = (EventManagerEventConfigsGetV2ResponseDataEventConfigsInner) o;
    return Objects.equals(this.attributionConfiguration, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.attributionConfiguration) &&
        Objects.equals(this.createTime, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.createTime) &&
        Objects.equals(this.debuggingStatus, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.debuggingStatus) &&
        Objects.equals(this.eventCnName, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.eventCnName) &&
        Objects.equals(this.eventId, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.eventId) &&
        Objects.equals(this.eventType, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.eventType) &&
        Objects.equals(this.properties, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.properties) &&
        Objects.equals(this.trackTypes, eventManagerEventConfigsGetV2ResponseDataEventConfigsInner.trackTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionConfiguration, createTime, debuggingStatus, eventCnName, eventId, eventType, properties, trackTypes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerEventConfigsGetV2ResponseDataEventConfigsInner {\n");
    sb.append("    attributionConfiguration: ").append(toIndentedString(attributionConfiguration)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    debuggingStatus: ").append(toIndentedString(debuggingStatus)).append("\n");
    sb.append("    eventCnName: ").append(toIndentedString(eventCnName)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("attribution_configuration");
    openapiFields.add("create_time");
    openapiFields.add("debugging_status");
    openapiFields.add("event_cn_name");
    openapiFields.add("event_id");
    openapiFields.add("event_type");
    openapiFields.add("properties");
    openapiFields.add("track_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerEventConfigsGetV2ResponseDataEventConfigsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerEventConfigsGetV2ResponseDataEventConfigsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerEventConfigsGetV2ResponseDataEventConfigsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerEventConfigsGetV2ResponseDataEventConfigsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerEventConfigsGetV2ResponseDataEventConfigsInner>() {
           @Override
           public void write(JsonWriter out, EventManagerEventConfigsGetV2ResponseDataEventConfigsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerEventConfigsGetV2ResponseDataEventConfigsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerEventConfigsGetV2ResponseDataEventConfigsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerEventConfigsGetV2ResponseDataEventConfigsInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerEventConfigsGetV2ResponseDataEventConfigsInner
  */
  public static EventManagerEventConfigsGetV2ResponseDataEventConfigsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerEventConfigsGetV2ResponseDataEventConfigsInner.class);
  }

 /**
  * Convert an instance of EventManagerEventConfigsGetV2ResponseDataEventConfigsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

