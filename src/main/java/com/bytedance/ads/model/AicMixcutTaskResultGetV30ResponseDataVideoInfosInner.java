/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
 * AicMixcutTaskResultGetV30ResponseDataVideoInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AicMixcutTaskResultGetV30ResponseDataVideoInfosInner {
  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_NAME = "video_name";
  @SerializedName(SERIALIZED_NAME_VIDEO_NAME)
  private String videoName = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public AicMixcutTaskResultGetV30ResponseDataVideoInfosInner() {
  }

  public AicMixcutTaskResultGetV30ResponseDataVideoInfosInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频ID，可以调用推送的 MAPI 推送到对应的广告账号。
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public AicMixcutTaskResultGetV30ResponseDataVideoInfosInner videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * 视频名称
   * @return videoName
  **/
  @javax.annotation.Nullable
  public String getVideoName() {
    return videoName;
  }


  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public AicMixcutTaskResultGetV30ResponseDataVideoInfosInner videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频预览链接，可利用此链接批量下载视频
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicMixcutTaskResultGetV30ResponseDataVideoInfosInner aicMixcutTaskResultGetV30ResponseDataVideoInfosInner = (AicMixcutTaskResultGetV30ResponseDataVideoInfosInner) o;
    return Objects.equals(this.videoId, aicMixcutTaskResultGetV30ResponseDataVideoInfosInner.videoId) &&
        Objects.equals(this.videoName, aicMixcutTaskResultGetV30ResponseDataVideoInfosInner.videoName) &&
        Objects.equals(this.videoUrl, aicMixcutTaskResultGetV30ResponseDataVideoInfosInner.videoUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, videoName, videoUrl);
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
    sb.append("class AicMixcutTaskResultGetV30ResponseDataVideoInfosInner {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicMixcutTaskResultGetV30ResponseDataVideoInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMixcutTaskResultGetV30ResponseDataVideoInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMixcutTaskResultGetV30ResponseDataVideoInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMixcutTaskResultGetV30ResponseDataVideoInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMixcutTaskResultGetV30ResponseDataVideoInfosInner>() {
           @Override
           public void write(JsonWriter out, AicMixcutTaskResultGetV30ResponseDataVideoInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMixcutTaskResultGetV30ResponseDataVideoInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMixcutTaskResultGetV30ResponseDataVideoInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMixcutTaskResultGetV30ResponseDataVideoInfosInner
  * @throws IOException if the JSON string is invalid with respect to AicMixcutTaskResultGetV30ResponseDataVideoInfosInner
  */
  public static AicMixcutTaskResultGetV30ResponseDataVideoInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMixcutTaskResultGetV30ResponseDataVideoInfosInner.class);
  }

 /**
  * Convert an instance of AicMixcutTaskResultGetV30ResponseDataVideoInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

