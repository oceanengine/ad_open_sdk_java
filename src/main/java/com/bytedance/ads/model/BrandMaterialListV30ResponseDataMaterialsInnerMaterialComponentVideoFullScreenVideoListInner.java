/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner {
  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_FILE_SIZE = "file_size";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Long fileSize = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_INITIAL_SIZE = "initial_size";
  @SerializedName(SERIALIZED_NAME_INITIAL_SIZE)
  private Long initialSize = null;

  public static final String SERIALIZED_NAME_ORIGIN_PLAY_URL = "origin_play_url";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PLAY_URL)
  private String originPlayUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_THUMB_HEIGHT = "thumb_height";
  @SerializedName(SERIALIZED_NAME_THUMB_HEIGHT)
  private Long thumbHeight = null;

  public static final String SERIALIZED_NAME_THUMB_WIDTH = "thumb_width";
  @SerializedName(SERIALIZED_NAME_THUMB_WIDTH)
  private Long thumbWidth = null;

  public static final String SERIALIZED_NAME_VIDEO_DURATION = "video_duration";
  @SerializedName(SERIALIZED_NAME_VIDEO_DURATION)
  private Double videoDuration = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_NAME = "video_name";
  @SerializedName(SERIALIZED_NAME_VIDEO_NAME)
  private String videoName = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * 封面图链接
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 时长
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 文件名称
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner fileSize(Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * 文件大小
   * @return fileSize
  **/
  @javax.annotation.Nullable
  public Long getFileSize() {
    return fileSize;
  }


  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 高度
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner initialSize(Long initialSize) {
    
    this.initialSize = initialSize;
    return this;
  }

   /**
   * 视频大小
   * @return initialSize
  **/
  @javax.annotation.Nullable
  public Long getInitialSize() {
    return initialSize;
  }


  public void setInitialSize(Long initialSize) {
    this.initialSize = initialSize;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner originPlayUrl(String originPlayUrl) {
    
    this.originPlayUrl = originPlayUrl;
    return this;
  }

   /**
   * 原始播放链接
   * @return originPlayUrl
  **/
  @javax.annotation.Nullable
  public String getOriginPlayUrl() {
    return originPlayUrl;
  }


  public void setOriginPlayUrl(String originPlayUrl) {
    this.originPlayUrl = originPlayUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 视频状态
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner thumbHeight(Long thumbHeight) {
    
    this.thumbHeight = thumbHeight;
    return this;
  }

   /**
   * 封面图高度
   * @return thumbHeight
  **/
  @javax.annotation.Nullable
  public Long getThumbHeight() {
    return thumbHeight;
  }


  public void setThumbHeight(Long thumbHeight) {
    this.thumbHeight = thumbHeight;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner thumbWidth(Long thumbWidth) {
    
    this.thumbWidth = thumbWidth;
    return this;
  }

   /**
   * 封面图宽度
   * @return thumbWidth
  **/
  @javax.annotation.Nullable
  public Long getThumbWidth() {
    return thumbWidth;
  }


  public void setThumbWidth(Long thumbWidth) {
    this.thumbWidth = thumbWidth;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner videoDuration(Double videoDuration) {
    
    this.videoDuration = videoDuration;
    return this;
  }

   /**
   * 视频时长
   * @return videoDuration
  **/
  @javax.annotation.Nullable
  public Double getVideoDuration() {
    return videoDuration;
  }


  public void setVideoDuration(Double videoDuration) {
    this.videoDuration = videoDuration;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner videoId(String videoId) {
    
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


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner videoName(String videoName) {
    
    this.videoName = videoName;
    return this;
  }

   /**
   * 视屏名称
   * @return videoName
  **/
  @javax.annotation.Nullable
  public String getVideoName() {
    return videoName;
  }


  public void setVideoName(String videoName) {
    this.videoName = videoName;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频链接
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 宽度
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner) o;
    return Objects.equals(this.coverUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.coverUrl) &&
        Objects.equals(this.duration, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.duration) &&
        Objects.equals(this.fileName, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.fileName) &&
        Objects.equals(this.fileSize, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.fileSize) &&
        Objects.equals(this.height, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.height) &&
        Objects.equals(this.initialSize, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.initialSize) &&
        Objects.equals(this.originPlayUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.originPlayUrl) &&
        Objects.equals(this.status, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.status) &&
        Objects.equals(this.thumbHeight, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.thumbHeight) &&
        Objects.equals(this.thumbWidth, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.thumbWidth) &&
        Objects.equals(this.videoDuration, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.videoDuration) &&
        Objects.equals(this.videoId, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.videoId) &&
        Objects.equals(this.videoName, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.videoName) &&
        Objects.equals(this.videoUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.videoUrl) &&
        Objects.equals(this.width, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverUrl, duration, fileName, fileSize, height, initialSize, originPlayUrl, status, thumbHeight, thumbWidth, videoDuration, videoId, videoName, videoUrl, width);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner {\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    initialSize: ").append(toIndentedString(initialSize)).append("\n");
    sb.append("    originPlayUrl: ").append(toIndentedString(originPlayUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbHeight: ").append(toIndentedString(thumbHeight)).append("\n");
    sb.append("    thumbWidth: ").append(toIndentedString(thumbWidth)).append("\n");
    sb.append("    videoDuration: ").append(toIndentedString(videoDuration)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoName: ").append(toIndentedString(videoName)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("cover_url");
    openapiFields.add("duration");
    openapiFields.add("file_name");
    openapiFields.add("file_size");
    openapiFields.add("height");
    openapiFields.add("initial_size");
    openapiFields.add("origin_play_url");
    openapiFields.add("status");
    openapiFields.add("thumb_height");
    openapiFields.add("thumb_width");
    openapiFields.add("video_duration");
    openapiFields.add("video_id");
    openapiFields.add("video_name");
    openapiFields.add("video_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

