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
import com.bytedance.ads.model.QianchuanFileVideoAwemeGetV10DataVideoListImageMode;
import com.bytedance.ads.model.QianchuanFileVideoAwemeGetV10DataVideoListIsRecommend;
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
 * QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_COMMENT_CNT = "comment_cnt";
  @SerializedName(SERIALIZED_NAME_COMMENT_CNT)
  private Long commentCnt = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanFileVideoAwemeGetV10DataVideoListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IS_AI_CREATE = "is_ai_create";
  @SerializedName(SERIALIZED_NAME_IS_AI_CREATE)
  private Boolean isAiCreate = null;

  public static final String SERIALIZED_NAME_IS_RECOMMEND = "is_recommend";
  @SerializedName(SERIALIZED_NAME_IS_RECOMMEND)
  private QianchuanFileVideoAwemeGetV10DataVideoListIsRecommend isRecommend = null;

  public static final String SERIALIZED_NAME_LIKE_CNT = "like_cnt";
  @SerializedName(SERIALIZED_NAME_LIKE_CNT)
  private Long likeCnt = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SHARE_CNT = "share_cnt";
  @SerializedName(SERIALIZED_NAME_SHARE_CNT)
  private Long shareCnt = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_URL = "video_cover_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_URL)
  private String videoCoverUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIEW_CNT = "view_cnt";
  @SerializedName(SERIALIZED_NAME_VIEW_CNT)
  private Long viewCnt = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width = null;

  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner() {
  }

  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner awemeItemId(Long awemeItemId) {
    
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


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner commentCnt(Long commentCnt) {
    
    this.commentCnt = commentCnt;
    return this;
  }

   /**
   * 
   * @return commentCnt
  **/
  @javax.annotation.Nullable
  public Long getCommentCnt() {
    return commentCnt;
  }


  public void setCommentCnt(Long commentCnt) {
    this.commentCnt = commentCnt;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner imageMode(QianchuanFileVideoAwemeGetV10DataVideoListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanFileVideoAwemeGetV10DataVideoListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanFileVideoAwemeGetV10DataVideoListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner isAiCreate(Boolean isAiCreate) {
    
    this.isAiCreate = isAiCreate;
    return this;
  }

   /**
   * 
   * @return isAiCreate
  **/
  @javax.annotation.Nullable
  public Boolean getIsAiCreate() {
    return isAiCreate;
  }


  public void setIsAiCreate(Boolean isAiCreate) {
    this.isAiCreate = isAiCreate;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner isRecommend(QianchuanFileVideoAwemeGetV10DataVideoListIsRecommend isRecommend) {
    
    this.isRecommend = isRecommend;
    return this;
  }

   /**
   * Get isRecommend
   * @return isRecommend
  **/
  @javax.annotation.Nullable
  public QianchuanFileVideoAwemeGetV10DataVideoListIsRecommend getIsRecommend() {
    return isRecommend;
  }


  public void setIsRecommend(QianchuanFileVideoAwemeGetV10DataVideoListIsRecommend isRecommend) {
    this.isRecommend = isRecommend;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner likeCnt(Long likeCnt) {
    
    this.likeCnt = likeCnt;
    return this;
  }

   /**
   * 
   * @return likeCnt
  **/
  @javax.annotation.Nullable
  public Long getLikeCnt() {
    return likeCnt;
  }


  public void setLikeCnt(Long likeCnt) {
    this.likeCnt = likeCnt;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner shareCnt(Long shareCnt) {
    
    this.shareCnt = shareCnt;
    return this;
  }

   /**
   * 
   * @return shareCnt
  **/
  @javax.annotation.Nullable
  public Long getShareCnt() {
    return shareCnt;
  }


  public void setShareCnt(Long shareCnt) {
    this.shareCnt = shareCnt;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner videoCoverUrl(String videoCoverUrl) {
    
    this.videoCoverUrl = videoCoverUrl;
    return this;
  }

   /**
   * 
   * @return videoCoverUrl
  **/
  @javax.annotation.Nullable
  public String getVideoCoverUrl() {
    return videoCoverUrl;
  }


  public void setVideoCoverUrl(String videoCoverUrl) {
    this.videoCoverUrl = videoCoverUrl;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner videoId(String videoId) {
    
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


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner viewCnt(Long viewCnt) {
    
    this.viewCnt = viewCnt;
    return this;
  }

   /**
   * 
   * @return viewCnt
  **/
  @javax.annotation.Nullable
  public Long getViewCnt() {
    return viewCnt;
  }


  public void setViewCnt(Long viewCnt) {
    this.viewCnt = viewCnt;
  }


  public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
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
    QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner = (QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner) o;
    return Objects.equals(this.awemeItemId, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.awemeItemId) &&
        Objects.equals(this.commentCnt, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.commentCnt) &&
        Objects.equals(this.duration, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.duration) &&
        Objects.equals(this.height, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.height) &&
        Objects.equals(this.imageMode, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.imageMode) &&
        Objects.equals(this.isAiCreate, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.isAiCreate) &&
        Objects.equals(this.isRecommend, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.isRecommend) &&
        Objects.equals(this.likeCnt, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.likeCnt) &&
        Objects.equals(this.materialId, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.materialId) &&
        Objects.equals(this.shareCnt, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.shareCnt) &&
        Objects.equals(this.title, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.title) &&
        Objects.equals(this.url, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.url) &&
        Objects.equals(this.videoCoverUrl, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.videoCoverUrl) &&
        Objects.equals(this.videoId, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.videoId) &&
        Objects.equals(this.viewCnt, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.viewCnt) &&
        Objects.equals(this.width, qianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, commentCnt, duration, height, imageMode, isAiCreate, isRecommend, likeCnt, materialId, shareCnt, title, url, videoCoverUrl, videoId, viewCnt, width);
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
    sb.append("class QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    commentCnt: ").append(toIndentedString(commentCnt)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    isAiCreate: ").append(toIndentedString(isAiCreate)).append("\n");
    sb.append("    isRecommend: ").append(toIndentedString(isRecommend)).append("\n");
    sb.append("    likeCnt: ").append(toIndentedString(likeCnt)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    shareCnt: ").append(toIndentedString(shareCnt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    viewCnt: ").append(toIndentedString(viewCnt)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("comment_cnt");
    openapiFields.add("duration");
    openapiFields.add("height");
    openapiFields.add("image_mode");
    openapiFields.add("is_ai_create");
    openapiFields.add("is_recommend");
    openapiFields.add("like_cnt");
    openapiFields.add("material_id");
    openapiFields.add("share_cnt");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("video_cover_url");
    openapiFields.add("video_id");
    openapiFields.add("view_cnt");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner
  */
  public static QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner.class);
  }

 /**
  * Convert an instance of QianchuanFileVideoAwemeGetV10ResponseDataVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

