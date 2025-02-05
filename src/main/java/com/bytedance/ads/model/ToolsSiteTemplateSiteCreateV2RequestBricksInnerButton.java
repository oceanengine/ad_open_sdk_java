/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2BricksButtonEventType;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonLinkEvent;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonPhoneEvent;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton {
  public static final String SERIALIZED_NAME_APPOINT_EVENT = "appoint_event";
  @SerializedName(SERIALIZED_NAME_APPOINT_EVENT)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent appointEvent = null;

  public static final String SERIALIZED_NAME_BG_IMAGE_URL = "bg_image_url";
  @SerializedName(SERIALIZED_NAME_BG_IMAGE_URL)
  private String bgImageUrl = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_EVENT = "download_event";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_EVENT)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent downloadEvent = null;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private ToolsSiteTemplateSiteCreateV2BricksButtonEventType eventType = null;

  public static final String SERIALIZED_NAME_LINK_EVENT = "link_event";
  @SerializedName(SERIALIZED_NAME_LINK_EVENT)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonLinkEvent linkEvent = null;

  public static final String SERIALIZED_NAME_PHONE_EVENT = "phone_event";
  @SerializedName(SERIALIZED_NAME_PHONE_EVENT)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonPhoneEvent phoneEvent = null;

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton() {
  }

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton appointEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent appointEvent) {
    
    this.appointEvent = appointEvent;
    return this;
  }

   /**
   * Get appointEvent
   * @return appointEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent getAppointEvent() {
    return appointEvent;
  }


  public void setAppointEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent appointEvent) {
    this.appointEvent = appointEvent;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton bgImageUrl(String bgImageUrl) {
    
    this.bgImageUrl = bgImageUrl;
    return this;
  }

   /**
   * linkEvent自定义图片链接
   * @return bgImageUrl
  **/
  @javax.annotation.Nullable
  public String getBgImageUrl() {
    return bgImageUrl;
  }


  public void setBgImageUrl(String bgImageUrl) {
    this.bgImageUrl = bgImageUrl;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton downloadEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent downloadEvent) {
    
    this.downloadEvent = downloadEvent;
    return this;
  }

   /**
   * Get downloadEvent
   * @return downloadEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent getDownloadEvent() {
    return downloadEvent;
  }


  public void setDownloadEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent downloadEvent) {
    this.downloadEvent = downloadEvent;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton eventType(ToolsSiteTemplateSiteCreateV2BricksButtonEventType eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nonnull
  public ToolsSiteTemplateSiteCreateV2BricksButtonEventType getEventType() {
    return eventType;
  }


  public void setEventType(ToolsSiteTemplateSiteCreateV2BricksButtonEventType eventType) {
    this.eventType = eventType;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton linkEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonLinkEvent linkEvent) {
    
    this.linkEvent = linkEvent;
    return this;
  }

   /**
   * Get linkEvent
   * @return linkEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonLinkEvent getLinkEvent() {
    return linkEvent;
  }


  public void setLinkEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonLinkEvent linkEvent) {
    this.linkEvent = linkEvent;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton phoneEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonPhoneEvent phoneEvent) {
    
    this.phoneEvent = phoneEvent;
    return this;
  }

   /**
   * Get phoneEvent
   * @return phoneEvent
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonPhoneEvent getPhoneEvent() {
    return phoneEvent;
  }


  public void setPhoneEvent(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonPhoneEvent phoneEvent) {
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
    ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton toolsSiteTemplateSiteCreateV2RequestBricksInnerButton = (ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton) o;
    return Objects.equals(this.appointEvent, toolsSiteTemplateSiteCreateV2RequestBricksInnerButton.appointEvent) &&
        Objects.equals(this.bgImageUrl, toolsSiteTemplateSiteCreateV2RequestBricksInnerButton.bgImageUrl) &&
        Objects.equals(this.downloadEvent, toolsSiteTemplateSiteCreateV2RequestBricksInnerButton.downloadEvent) &&
        Objects.equals(this.eventType, toolsSiteTemplateSiteCreateV2RequestBricksInnerButton.eventType) &&
        Objects.equals(this.linkEvent, toolsSiteTemplateSiteCreateV2RequestBricksInnerButton.linkEvent) &&
        Objects.equals(this.phoneEvent, toolsSiteTemplateSiteCreateV2RequestBricksInnerButton.phoneEvent);
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
    sb.append("class ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton {\n");
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
       if (!ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton
  */
  public static ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButton to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

