/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_COVER_IMAGE_HEIGHT = "cover_image_height";
  @SerializedName(SERIALIZED_NAME_COVER_IMAGE_HEIGHT)
  private Long coverImageHeight = null;

  public static final String SERIALIZED_NAME_COVER_IMAGE_WEB_URL = "cover_image_web_url";
  @SerializedName(SERIALIZED_NAME_COVER_IMAGE_WEB_URL)
  private String coverImageWebUrl = null;

  public static final String SERIALIZED_NAME_COVER_IMAGE_WIDTH = "cover_image_width";
  @SerializedName(SERIALIZED_NAME_COVER_IMAGE_WIDTH)
  private Long coverImageWidth = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource source = null;

  public static final String SERIALIZED_NAME_VIDEO_DURATION = "video_duration";
  @SerializedName(SERIALIZED_NAME_VIDEO_DURATION)
  private Long videoDuration = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private List<String> videoUrl = null;

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner() {
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner coverImageHeight(Long coverImageHeight) {
    
    this.coverImageHeight = coverImageHeight;
    return this;
  }

   /**
   * 
   * @return coverImageHeight
  **/
  @javax.annotation.Nullable
  public Long getCoverImageHeight() {
    return coverImageHeight;
  }


  public void setCoverImageHeight(Long coverImageHeight) {
    this.coverImageHeight = coverImageHeight;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner coverImageWebUrl(String coverImageWebUrl) {
    
    this.coverImageWebUrl = coverImageWebUrl;
    return this;
  }

   /**
   * 
   * @return coverImageWebUrl
  **/
  @javax.annotation.Nullable
  public String getCoverImageWebUrl() {
    return coverImageWebUrl;
  }


  public void setCoverImageWebUrl(String coverImageWebUrl) {
    this.coverImageWebUrl = coverImageWebUrl;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner coverImageWidth(Long coverImageWidth) {
    
    this.coverImageWidth = coverImageWidth;
    return this;
  }

   /**
   * 
   * @return coverImageWidth
  **/
  @javax.annotation.Nullable
  public Long getCoverImageWidth() {
    return coverImageWidth;
  }


  public void setCoverImageWidth(Long coverImageWidth) {
    this.coverImageWidth = coverImageWidth;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner source(QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource getSource() {
    return source;
  }


  public void setSource(QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeVideoMaterialSource source) {
    this.source = source;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner videoDuration(Long videoDuration) {
    
    this.videoDuration = videoDuration;
    return this;
  }

   /**
   * 
   * @return videoDuration
  **/
  @javax.annotation.Nullable
  public Long getVideoDuration() {
    return videoDuration;
  }


  public void setVideoDuration(Long videoDuration) {
    this.videoDuration = videoDuration;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner videoUrl(List<String> videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner addVideoUrlItem(String videoUrlItem) {
    if (this.videoUrl == null) {
      this.videoUrl = new ArrayList<>();
    }
    this.videoUrl.add(videoUrlItem);
    return this;
  }

   /**
   * 
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(List<String> videoUrl) {
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
    QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner = (QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner) o;
    return Objects.equals(this.awemeItemId, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.awemeItemId) &&
        Objects.equals(this.coverImageHeight, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.coverImageHeight) &&
        Objects.equals(this.coverImageWebUrl, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.coverImageWebUrl) &&
        Objects.equals(this.coverImageWidth, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.coverImageWidth) &&
        Objects.equals(this.source, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.source) &&
        Objects.equals(this.videoDuration, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.videoDuration) &&
        Objects.equals(this.videoId, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.videoId) &&
        Objects.equals(this.videoUrl, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.videoUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, coverImageHeight, coverImageWebUrl, coverImageWidth, source, videoDuration, videoId, videoUrl);
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
    sb.append("class QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    coverImageHeight: ").append(toIndentedString(coverImageHeight)).append("\n");
    sb.append("    coverImageWebUrl: ").append(toIndentedString(coverImageWebUrl)).append("\n");
    sb.append("    coverImageWidth: ").append(toIndentedString(coverImageWidth)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    videoDuration: ").append(toIndentedString(videoDuration)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("cover_image_height");
    openapiFields.add("cover_image_web_url");
    openapiFields.add("cover_image_width");
    openapiFields.add("source");
    openapiFields.add("video_duration");
    openapiFields.add("video_id");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner
  */
  public static QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner.class);
  }

 /**
  * Convert an instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

