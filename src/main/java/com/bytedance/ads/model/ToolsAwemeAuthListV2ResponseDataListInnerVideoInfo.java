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
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListVideoInfoImageMode;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo {
  public static final String SERIALIZED_NAME_AWEME_PLAY_URL = "aweme_play_url";
  @SerializedName(SERIALIZED_NAME_AWEME_PLAY_URL)
  private String awemePlayUrl = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private ToolsAwemeAuthListV2DataListVideoInfoImageMode imageMode = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_MID = "mid";
  @SerializedName(SERIALIZED_NAME_MID)
  private Long mid = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_URL = "video_cover_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_URL)
  private String videoCoverUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo() {
  }

  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo awemePlayUrl(String awemePlayUrl) {
    
    this.awemePlayUrl = awemePlayUrl;
    return this;
  }

   /**
   * 视频播放链接
   * @return awemePlayUrl
  **/
  @javax.annotation.Nullable
  public String getAwemePlayUrl() {
    return awemePlayUrl;
  }


  public void setAwemePlayUrl(String awemePlayUrl) {
    this.awemePlayUrl = awemePlayUrl;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 视频时长，单位为秒
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo imageMode(ToolsAwemeAuthListV2DataListVideoInfoImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListVideoInfoImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(ToolsAwemeAuthListV2DataListVideoInfoImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 抖音视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo mid(Long mid) {
    
    this.mid = mid;
    return this;
  }

   /**
   * 素材ID
   * @return mid
  **/
  @javax.annotation.Nullable
  public Long getMid() {
    return mid;
  }


  public void setMid(Long mid) {
    this.mid = mid;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 视频名称
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoCoverId(String videoCoverId) {
    
    this.videoCoverId = videoCoverId;
    return this;
  }

   /**
   * 视频封面ID
   * @return videoCoverId
  **/
  @javax.annotation.Nullable
  public String getVideoCoverId() {
    return videoCoverId;
  }


  public void setVideoCoverId(String videoCoverId) {
    this.videoCoverId = videoCoverId;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoCoverUrl(String videoCoverUrl) {
    
    this.videoCoverUrl = videoCoverUrl;
    return this;
  }

   /**
   * 视频封面链接
   * @return videoCoverUrl
  **/
  @javax.annotation.Nullable
  public String getVideoCoverUrl() {
    return videoCoverUrl;
  }


  public void setVideoCoverUrl(String videoCoverUrl) {
    this.videoCoverUrl = videoCoverUrl;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频ID
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo toolsAwemeAuthListV2ResponseDataListInnerVideoInfo = (ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo) o;
    return Objects.equals(this.awemePlayUrl, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.awemePlayUrl) &&
        Objects.equals(this.duration, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.duration) &&
        Objects.equals(this.imageMode, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.imageMode) &&
        Objects.equals(this.itemId, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.itemId) &&
        Objects.equals(this.mid, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.mid) &&
        Objects.equals(this.title, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.title) &&
        Objects.equals(this.videoCoverId, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.videoCoverId) &&
        Objects.equals(this.videoCoverUrl, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.videoCoverUrl) &&
        Objects.equals(this.videoId, toolsAwemeAuthListV2ResponseDataListInnerVideoInfo.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemePlayUrl, duration, imageMode, itemId, mid, title, videoCoverId, videoCoverUrl, videoId);
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
    sb.append("class ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo {\n");
    sb.append("    awemePlayUrl: ").append(toIndentedString(awemePlayUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
    sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("aweme_play_url");
    openapiFields.add("duration");
    openapiFields.add("image_mode");
    openapiFields.add("item_id");
    openapiFields.add("mid");
    openapiFields.add("title");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_cover_url");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("item_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo
  */
  public static ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo.class);
  }

 /**
  * Convert an instance of ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

