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
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventAndroidLink;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventIosLink;
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
 * downloadEvent事件行为描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent {
  public static final String SERIALIZED_NAME_ANDROID_LINK = "android_link";
  @SerializedName(SERIALIZED_NAME_ANDROID_LINK)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventAndroidLink androidLink = null;

  public static final String SERIALIZED_NAME_IOS_LINK = "ios_link";
  @SerializedName(SERIALIZED_NAME_IOS_LINK)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventIosLink iosLink = null;

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent() {
  }

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent androidLink(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventAndroidLink androidLink) {
    
    this.androidLink = androidLink;
    return this;
  }

   /**
   * Get androidLink
   * @return androidLink
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventAndroidLink getAndroidLink() {
    return androidLink;
  }


  public void setAndroidLink(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventAndroidLink androidLink) {
    this.androidLink = androidLink;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent iosLink(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventIosLink iosLink) {
    
    this.iosLink = iosLink;
    return this;
  }

   /**
   * Get iosLink
   * @return iosLink
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventIosLink getIosLink() {
    return iosLink;
  }


  public void setIosLink(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEventIosLink iosLink) {
    this.iosLink = iosLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent toolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent = (ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent) o;
    return Objects.equals(this.androidLink, toolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent.androidLink) &&
        Objects.equals(this.iosLink, toolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent.iosLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidLink, iosLink);
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
    sb.append("class ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent {\n");
    sb.append("    androidLink: ").append(toIndentedString(androidLink)).append("\n");
    sb.append("    iosLink: ").append(toIndentedString(iosLink)).append("\n");
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
    openapiFields.add("android_link");
    openapiFields.add("ios_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent
  */
  public static ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonDownloadEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

