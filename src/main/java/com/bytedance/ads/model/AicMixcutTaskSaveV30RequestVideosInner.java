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
 * AicMixcutTaskSaveV30RequestVideosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class AicMixcutTaskSaveV30RequestVideosInner {
  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_NAME = "video_name";
  @SerializedName(SERIALIZED_NAME_VIDEO_NAME)
  private String videoName = null;

  public AicMixcutTaskSaveV30RequestVideosInner() {
  }

  public AicMixcutTaskSaveV30RequestVideosInner videoId(String videoId) {
    
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


  public AicMixcutTaskSaveV30RequestVideosInner videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * 视频名称（支持中英文、数字、特殊字符，默认剔除html标签，字数限制：50，不传入默认以原视频的名称保存）
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
    AicMixcutTaskSaveV30RequestVideosInner aicMixcutTaskSaveV30RequestVideosInner = (AicMixcutTaskSaveV30RequestVideosInner) o;
    return Objects.equals(this.videoId, aicMixcutTaskSaveV30RequestVideosInner.videoId) &&
        Objects.equals(this.videoName, aicMixcutTaskSaveV30RequestVideosInner.videoName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, videoName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicMixcutTaskSaveV30RequestVideosInner {\n");
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
       if (!AicMixcutTaskSaveV30RequestVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMixcutTaskSaveV30RequestVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMixcutTaskSaveV30RequestVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMixcutTaskSaveV30RequestVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMixcutTaskSaveV30RequestVideosInner>() {
           @Override
           public void write(JsonWriter out, AicMixcutTaskSaveV30RequestVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMixcutTaskSaveV30RequestVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMixcutTaskSaveV30RequestVideosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMixcutTaskSaveV30RequestVideosInner
  * @throws IOException if the JSON string is invalid with respect to AicMixcutTaskSaveV30RequestVideosInner
  */
  public static AicMixcutTaskSaveV30RequestVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMixcutTaskSaveV30RequestVideosInner.class);
  }

 /**
  * Convert an instance of AicMixcutTaskSaveV30RequestVideosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

