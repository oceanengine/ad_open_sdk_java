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
import com.bytedance.ads.model.AnalyticsAttributionV30RequestContext;
import com.bytedance.ads.model.AnalyticsAttributionV30RequestProperties;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * AnalyticsAttributionV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class AnalyticsAttributionV30Request {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_ATTRIBUTE_LABEL = "attribute_label";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_LABEL)
  private String attributeLabel = null;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private Long bizType = null;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private AnalyticsAttributionV30RequestContext context = null;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private AnalyticsAttributionV30RequestProperties properties = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp = null;

  public AnalyticsAttributionV30Request() {
  }

  public AnalyticsAttributionV30Request appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 开发者申请的应用APP_ID
   * @return appId
  **/
  @javax.annotation.Nullable
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public AnalyticsAttributionV30Request attributeLabel(String attributeLabel) {
    
    this.attributeLabel = attributeLabel;
    return this;
  }

   /**
   * 当前场景只支持convert，勿传其他值
   * @return attributeLabel
  **/
  @javax.annotation.Nullable
  public String getAttributeLabel() {
    return attributeLabel;
  }


  public void setAttributeLabel(String attributeLabel) {
    this.attributeLabel = attributeLabel;
  }


  public AnalyticsAttributionV30Request bizType(Long bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 当前场景只支持4，勿传其他值
   * @return bizType
  **/
  @javax.annotation.Nullable
  public Long getBizType() {
    return bizType;
  }


  public void setBizType(Long bizType) {
    this.bizType = bizType;
  }


  public AnalyticsAttributionV30Request context(AnalyticsAttributionV30RequestContext context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  public AnalyticsAttributionV30RequestContext getContext() {
    return context;
  }


  public void setContext(AnalyticsAttributionV30RequestContext context) {
    this.context = context;
  }


  public AnalyticsAttributionV30Request eventType(String eventType) {
    
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


  public AnalyticsAttributionV30Request properties(AnalyticsAttributionV30RequestProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  public AnalyticsAttributionV30RequestProperties getProperties() {
    return properties;
  }


  public void setProperties(AnalyticsAttributionV30RequestProperties properties) {
    this.properties = properties;
  }


  public AnalyticsAttributionV30Request source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 广告主标识，自定义值，用于标识数据来源，例如：tb
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public AnalyticsAttributionV30Request timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 订单时间；这里timestamp指订单发生的时间，而不是数据上报时间，必须上报秒级时间戳；且回传超过1天的下单会返回错误
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAttributionV30Request analyticsAttributionV30Request = (AnalyticsAttributionV30Request) o;
    return Objects.equals(this.appId, analyticsAttributionV30Request.appId) &&
        Objects.equals(this.attributeLabel, analyticsAttributionV30Request.attributeLabel) &&
        Objects.equals(this.bizType, analyticsAttributionV30Request.bizType) &&
        Objects.equals(this.context, analyticsAttributionV30Request.context) &&
        Objects.equals(this.eventType, analyticsAttributionV30Request.eventType) &&
        Objects.equals(this.properties, analyticsAttributionV30Request.properties) &&
        Objects.equals(this.source, analyticsAttributionV30Request.source) &&
        Objects.equals(this.timestamp, analyticsAttributionV30Request.timestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, attributeLabel, bizType, context, eventType, properties, source, timestamp);
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
    sb.append("class AnalyticsAttributionV30Request {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    attributeLabel: ").append(toIndentedString(attributeLabel)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("attribute_label");
    openapiFields.add("biz_type");
    openapiFields.add("context");
    openapiFields.add("event_type");
    openapiFields.add("properties");
    openapiFields.add("source");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticsAttributionV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticsAttributionV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticsAttributionV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticsAttributionV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticsAttributionV30Request>() {
           @Override
           public void write(JsonWriter out, AnalyticsAttributionV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyticsAttributionV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyticsAttributionV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticsAttributionV30Request
  * @throws IOException if the JSON string is invalid with respect to AnalyticsAttributionV30Request
  */
  public static AnalyticsAttributionV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticsAttributionV30Request.class);
  }

 /**
  * Convert an instance of AnalyticsAttributionV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

