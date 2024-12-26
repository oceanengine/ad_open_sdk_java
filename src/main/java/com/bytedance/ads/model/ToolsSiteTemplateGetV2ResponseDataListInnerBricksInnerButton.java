/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2DataListBricksButtonEventType;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonAppointEvent;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonDownloadEvent;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent;
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
 * 按钮组件描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton {
  public static final String SERIALIZED_NAME_APPOINT_EVENT = "appoint_event";
  @SerializedName(SERIALIZED_NAME_APPOINT_EVENT)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonAppointEvent appointEvent = null;

  public static final String SERIALIZED_NAME_BG_IMAGE_URL = "bg_image_url";
  @SerializedName(SERIALIZED_NAME_BG_IMAGE_URL)
  private String bgImageUrl = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_EVENT = "download_event";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_EVENT)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonDownloadEvent downloadEvent = null;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private ToolsSiteTemplateGetV2DataListBricksButtonEventType eventType = null;

  public static final String SERIALIZED_NAME_LINK_EVENT = "link_event";
  @SerializedName(SERIALIZED_NAME_LINK_EVENT)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent linkEvent = null;

  public static final String SERIALIZED_NAME_PHONE_EVENT = "phone_event";
  @SerializedName(SERIALIZED_NAME_PHONE_EVENT)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent phoneEvent = null;

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton() {
  }

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton appointEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonAppointEvent appointEvent) {
    
    this.appointEvent = appointEvent;
    return this;
  }

   /**
   * Get appointEvent
   * @return appointEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonAppointEvent getAppointEvent() {
    return appointEvent;
  }


  public void setAppointEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonAppointEvent appointEvent) {
    this.appointEvent = appointEvent;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton bgImageUrl(String bgImageUrl) {
    
    this.bgImageUrl = bgImageUrl;
    return this;
  }

   /**
   * linkEvent事件自定义图片链接
   * @return bgImageUrl
  **/
  @javax.annotation.Nullable
  public String getBgImageUrl() {
    return bgImageUrl;
  }


  public void setBgImageUrl(String bgImageUrl) {
    this.bgImageUrl = bgImageUrl;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton downloadEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonDownloadEvent downloadEvent) {
    
    this.downloadEvent = downloadEvent;
    return this;
  }

   /**
   * Get downloadEvent
   * @return downloadEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonDownloadEvent getDownloadEvent() {
    return downloadEvent;
  }


  public void setDownloadEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonDownloadEvent downloadEvent) {
    this.downloadEvent = downloadEvent;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton eventType(ToolsSiteTemplateGetV2DataListBricksButtonEventType eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2DataListBricksButtonEventType getEventType() {
    return eventType;
  }


  public void setEventType(ToolsSiteTemplateGetV2DataListBricksButtonEventType eventType) {
    this.eventType = eventType;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton linkEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent linkEvent) {
    
    this.linkEvent = linkEvent;
    return this;
  }

   /**
   * Get linkEvent
   * @return linkEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent getLinkEvent() {
    return linkEvent;
  }


  public void setLinkEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonLinkEvent linkEvent) {
    this.linkEvent = linkEvent;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton phoneEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent phoneEvent) {
    
    this.phoneEvent = phoneEvent;
    return this;
  }

   /**
   * Get phoneEvent
   * @return phoneEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent getPhoneEvent() {
    return phoneEvent;
  }


  public void setPhoneEvent(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButtonPhoneEvent phoneEvent) {
    this.phoneEvent = phoneEvent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton = (ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton) o;
    return Objects.equals(this.appointEvent, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.appointEvent) &&
        Objects.equals(this.bgImageUrl, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.bgImageUrl) &&
        Objects.equals(this.downloadEvent, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.downloadEvent) &&
        Objects.equals(this.eventType, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.eventType) &&
        Objects.equals(this.linkEvent, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.linkEvent) &&
        Objects.equals(this.phoneEvent, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.phoneEvent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointEvent, bgImageUrl, downloadEvent, eventType, linkEvent, phoneEvent);
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
    sb.append("class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton {\n");
    sb.append("    appointEvent: ").append(toIndentedString(appointEvent)).append("\n");
    sb.append("    bgImageUrl: ").append(toIndentedString(bgImageUrl)).append("\n");
    sb.append("    downloadEvent: ").append(toIndentedString(downloadEvent)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    linkEvent: ").append(toIndentedString(linkEvent)).append("\n");
    sb.append("    phoneEvent: ").append(toIndentedString(phoneEvent)).append("\n");
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
    openapiFields.add("appoint_event");
    openapiFields.add("bg_image_url");
    openapiFields.add("download_event");
    openapiFields.add("event_type");
    openapiFields.add("link_event");
    openapiFields.add("phone_event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton
  */
  public static ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

