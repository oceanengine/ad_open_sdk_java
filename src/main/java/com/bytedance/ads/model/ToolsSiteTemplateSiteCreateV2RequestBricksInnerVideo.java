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
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoLocalVideo;
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoOnlineVideo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * 视频组件描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo {
  public static final String SERIALIZED_NAME_LOCAL_VIDEO = "local_video";
  @SerializedName(SERIALIZED_NAME_LOCAL_VIDEO)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoLocalVideo localVideo = null;

  public static final String SERIALIZED_NAME_ONLINE_VIDEO = "online_video";
  @SerializedName(SERIALIZED_NAME_ONLINE_VIDEO)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoOnlineVideo onlineVideo = null;

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo() {
  }

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo localVideo(ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoLocalVideo localVideo) {
    
    this.localVideo = localVideo;
    return this;
  }

   /**
   * Get localVideo
   * @return localVideo
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoLocalVideo getLocalVideo() {
    return localVideo;
  }


  public void setLocalVideo(ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoLocalVideo localVideo) {
    this.localVideo = localVideo;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo onlineVideo(ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoOnlineVideo onlineVideo) {
    
    this.onlineVideo = onlineVideo;
    return this;
  }

   /**
   * Get onlineVideo
   * @return onlineVideo
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoOnlineVideo getOnlineVideo() {
    return onlineVideo;
  }


  public void setOnlineVideo(ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideoOnlineVideo onlineVideo) {
    this.onlineVideo = onlineVideo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo toolsSiteTemplateSiteCreateV2RequestBricksInnerVideo = (ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo) o;
    return Objects.equals(this.localVideo, toolsSiteTemplateSiteCreateV2RequestBricksInnerVideo.localVideo) &&
        Objects.equals(this.onlineVideo, toolsSiteTemplateSiteCreateV2RequestBricksInnerVideo.onlineVideo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localVideo, onlineVideo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo {\n");
    sb.append("    localVideo: ").append(toIndentedString(localVideo)).append("\n");
    sb.append("    onlineVideo: ").append(toIndentedString(onlineVideo)).append("\n");
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
    openapiFields.add("local_video");
    openapiFields.add("online_video");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo
  */
  public static ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

