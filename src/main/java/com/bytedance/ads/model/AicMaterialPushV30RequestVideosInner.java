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
 * AicMaterialPushV30RequestVideosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class AicMaterialPushV30RequestVideosInner {
  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_NAME = "video_name";
  @SerializedName(SERIALIZED_NAME_VIDEO_NAME)
  private String videoName = null;

  public AicMaterialPushV30RequestVideosInner() {
  }

  public AicMaterialPushV30RequestVideosInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频id
   * @return videoId
  **/
  @javax.annotation.Nonnull
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public AicMaterialPushV30RequestVideosInner videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * 推送的视频名称，支持中英文、数字、特殊字符，默认剔除html标签，字数限制：50
   * @return videoName
  **/
  @javax.annotation.Nullable
  public String getVideoName() {
    return videoName;
  }


  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicMaterialPushV30RequestVideosInner aicMaterialPushV30RequestVideosInner = (AicMaterialPushV30RequestVideosInner) o;
    return Objects.equals(this.videoId, aicMaterialPushV30RequestVideosInner.videoId) &&
        Objects.equals(this.videoName, aicMaterialPushV30RequestVideosInner.videoName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, videoName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicMaterialPushV30RequestVideosInner {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
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
    openapiFields.add("video_id");
    openapiFields.add("video_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("video_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicMaterialPushV30RequestVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMaterialPushV30RequestVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMaterialPushV30RequestVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMaterialPushV30RequestVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMaterialPushV30RequestVideosInner>() {
           @Override
           public void write(JsonWriter out, AicMaterialPushV30RequestVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMaterialPushV30RequestVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMaterialPushV30RequestVideosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMaterialPushV30RequestVideosInner
  * @throws IOException if the JSON string is invalid with respect to AicMaterialPushV30RequestVideosInner
  */
  public static AicMaterialPushV30RequestVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMaterialPushV30RequestVideosInner.class);
  }

 /**
  * Convert an instance of AicMaterialPushV30RequestVideosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

