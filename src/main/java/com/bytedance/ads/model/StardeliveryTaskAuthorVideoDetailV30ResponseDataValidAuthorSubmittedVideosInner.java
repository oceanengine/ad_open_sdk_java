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
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosImageMode;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoStatus;
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
 * StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosImageMode imageMode = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_STAR_VIDEO_BAN_REASON_DETAIL = "star_video_ban_reason_detail";
  @SerializedName(SERIALIZED_NAME_STAR_VIDEO_BAN_REASON_DETAIL)
  private String starVideoBanReasonDetail = null;

  public static final String SERIALIZED_NAME_STAR_VIDEO_CUS_APPROVAL_TIME = "star_video_cus_approval_time";
  @SerializedName(SERIALIZED_NAME_STAR_VIDEO_CUS_APPROVAL_TIME)
  private String starVideoCusApprovalTime = null;

  public static final String SERIALIZED_NAME_STAR_VIDEO_DELIVERY_STATUS = "star_video_delivery_status";
  @SerializedName(SERIALIZED_NAME_STAR_VIDEO_DELIVERY_STATUS)
  private StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus starVideoDeliveryStatus = null;

  public static final String SERIALIZED_NAME_STAR_VIDEO_PUBLISH_TIME = "star_video_publish_time";
  @SerializedName(SERIALIZED_NAME_STAR_VIDEO_PUBLISH_TIME)
  private String starVideoPublishTime = null;

  public static final String SERIALIZED_NAME_STAR_VIDEO_STATUS = "star_video_status";
  @SerializedName(SERIALIZED_NAME_STAR_VIDEO_STATUS)
  private StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoStatus starVideoStatus = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_URL = "video_cover_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_URL)
  private String videoCoverUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_LINK = "video_play_link";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_LINK)
  private String videoPlayLink = null;

  public static final String SERIALIZED_NAME_VIDEO_TITLE = "video_title";
  @SerializedName(SERIALIZED_NAME_VIDEO_TITLE)
  private String videoTitle = null;

  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner() {
  }

  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner duration(Long duration) {
    
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


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner imageMode(StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner materialId(Long materialId) {
    
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


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner starVideoBanReasonDetail(String starVideoBanReasonDetail) {
    
    this.starVideoBanReasonDetail = starVideoBanReasonDetail;
    return this;
  }

   /**
   * 视频被客户审核拒绝的理由
   * @return starVideoBanReasonDetail
  **/
  @javax.annotation.Nullable
  public String getStarVideoBanReasonDetail() {
    return starVideoBanReasonDetail;
  }


  public void setStarVideoBanReasonDetail(String starVideoBanReasonDetail) {
    this.starVideoBanReasonDetail = starVideoBanReasonDetail;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner starVideoCusApprovalTime(String starVideoCusApprovalTime) {
    
    this.starVideoCusApprovalTime = starVideoCusApprovalTime;
    return this;
  }

   /**
   * 视频被服务商审核通过的时间
   * @return starVideoCusApprovalTime
  **/
  @javax.annotation.Nullable
  public String getStarVideoCusApprovalTime() {
    return starVideoCusApprovalTime;
  }


  public void setStarVideoCusApprovalTime(String starVideoCusApprovalTime) {
    this.starVideoCusApprovalTime = starVideoCusApprovalTime;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner starVideoDeliveryStatus(StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus starVideoDeliveryStatus) {
    
    this.starVideoDeliveryStatus = starVideoDeliveryStatus;
    return this;
  }

   /**
   * Get starVideoDeliveryStatus
   * @return starVideoDeliveryStatus
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus getStarVideoDeliveryStatus() {
    return starVideoDeliveryStatus;
  }


  public void setStarVideoDeliveryStatus(StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoDeliveryStatus starVideoDeliveryStatus) {
    this.starVideoDeliveryStatus = starVideoDeliveryStatus;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner starVideoPublishTime(String starVideoPublishTime) {
    
    this.starVideoPublishTime = starVideoPublishTime;
    return this;
  }

   /**
   * 视频发布时间
   * @return starVideoPublishTime
  **/
  @javax.annotation.Nullable
  public String getStarVideoPublishTime() {
    return starVideoPublishTime;
  }


  public void setStarVideoPublishTime(String starVideoPublishTime) {
    this.starVideoPublishTime = starVideoPublishTime;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner starVideoStatus(StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoStatus starVideoStatus) {
    
    this.starVideoStatus = starVideoStatus;
    return this;
  }

   /**
   * Get starVideoStatus
   * @return starVideoStatus
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoStatus getStarVideoStatus() {
    return starVideoStatus;
  }


  public void setStarVideoStatus(StardeliveryTaskAuthorVideoDetailV30DataValidAuthorSubmittedVideosStarVideoStatus starVideoStatus) {
    this.starVideoStatus = starVideoStatus;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner videoCoverId(String videoCoverId) {
    
    this.videoCoverId = videoCoverId;
    return this;
  }

   /**
   * 
   * @return videoCoverId
  **/
  @javax.annotation.Nullable
  public String getVideoCoverId() {
    return videoCoverId;
  }


  public void setVideoCoverId(String videoCoverId) {
    this.videoCoverId = videoCoverId;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner videoCoverUrl(String videoCoverUrl) {
    
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


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner videoId(String videoId) {
    
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


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner videoPlayLink(String videoPlayLink) {
    
    this.videoPlayLink = videoPlayLink;
    return this;
  }

   /**
   * 
   * @return videoPlayLink
  **/
  @javax.annotation.Nullable
  public String getVideoPlayLink() {
    return videoPlayLink;
  }


  public void setVideoPlayLink(String videoPlayLink) {
    this.videoPlayLink = videoPlayLink;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner videoTitle(String videoTitle) {
    
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * 
   * @return videoTitle
  **/
  @javax.annotation.Nullable
  public String getVideoTitle() {
    return videoTitle;
  }


  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner = (StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner) o;
    return Objects.equals(this.awemeId, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.awemeId) &&
        Objects.equals(this.duration, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.duration) &&
        Objects.equals(this.imageMode, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.imageMode) &&
        Objects.equals(this.itemId, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.itemId) &&
        Objects.equals(this.materialId, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.materialId) &&
        Objects.equals(this.starVideoBanReasonDetail, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.starVideoBanReasonDetail) &&
        Objects.equals(this.starVideoCusApprovalTime, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.starVideoCusApprovalTime) &&
        Objects.equals(this.starVideoDeliveryStatus, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.starVideoDeliveryStatus) &&
        Objects.equals(this.starVideoPublishTime, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.starVideoPublishTime) &&
        Objects.equals(this.starVideoStatus, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.starVideoStatus) &&
        Objects.equals(this.videoCoverId, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.videoCoverId) &&
        Objects.equals(this.videoCoverUrl, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.videoCoverUrl) &&
        Objects.equals(this.videoId, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.videoId) &&
        Objects.equals(this.videoPlayLink, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.videoPlayLink) &&
        Objects.equals(this.videoTitle, stardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.videoTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, duration, imageMode, itemId, materialId, starVideoBanReasonDetail, starVideoCusApprovalTime, starVideoDeliveryStatus, starVideoPublishTime, starVideoStatus, videoCoverId, videoCoverUrl, videoId, videoPlayLink, videoTitle);
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
    sb.append("class StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    starVideoBanReasonDetail: ").append(toIndentedString(starVideoBanReasonDetail)).append("\n");
    sb.append("    starVideoCusApprovalTime: ").append(toIndentedString(starVideoCusApprovalTime)).append("\n");
    sb.append("    starVideoDeliveryStatus: ").append(toIndentedString(starVideoDeliveryStatus)).append("\n");
    sb.append("    starVideoPublishTime: ").append(toIndentedString(starVideoPublishTime)).append("\n");
    sb.append("    starVideoStatus: ").append(toIndentedString(starVideoStatus)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
    sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoPlayLink: ").append(toIndentedString(videoPlayLink)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("duration");
    openapiFields.add("image_mode");
    openapiFields.add("item_id");
    openapiFields.add("material_id");
    openapiFields.add("star_video_ban_reason_detail");
    openapiFields.add("star_video_cus_approval_time");
    openapiFields.add("star_video_delivery_status");
    openapiFields.add("star_video_publish_time");
    openapiFields.add("star_video_status");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_cover_url");
    openapiFields.add("video_id");
    openapiFields.add("video_play_link");
    openapiFields.add("video_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner
  */
  public static StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner.class);
  }

 /**
  * Convert an instance of StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

