/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private String actionTrackUrl = null;

  public static final String SERIALIZED_NAME_ACTIVE_TRACK_URL = "active_track_url";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TRACK_URL)
  private String activeTrackUrl = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private String trackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_ID = "track_url_group_id";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_ID)
  private Long trackUrlGroupId = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_NAME = "track_url_group_name";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_NAME)
  private String trackUrlGroupName = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL = "video_play_done_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL)
  private String videoPlayDoneTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private String videoPlayEffectiveTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL = "video_play_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL)
  private String videoPlayTrackUrl = null;

  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner() {
  }

  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner actionTrackUrl(String actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

   /**
   * 点击（监测链接）只允许传入1个
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public String getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(String actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner activeTrackUrl(String activeTrackUrl) {
    
    this.activeTrackUrl = activeTrackUrl;
    return this;
  }

   /**
   * 激活监测
   * @return activeTrackUrl
  **/
  @javax.annotation.Nullable
  public String getActiveTrackUrl() {
    return activeTrackUrl;
  }


  public void setActiveTrackUrl(String activeTrackUrl) {
    this.activeTrackUrl = activeTrackUrl;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 下载链接
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner trackUrl(String trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

   /**
   * 展示（监测链接）
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public String getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(String trackUrl) {
    this.trackUrl = trackUrl;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner trackUrlGroupId(Long trackUrlGroupId) {
    
    this.trackUrlGroupId = trackUrlGroupId;
    return this;
  }

   /**
   * 监测链接组ID
   * @return trackUrlGroupId
  **/
  @javax.annotation.Nullable
  public Long getTrackUrlGroupId() {
    return trackUrlGroupId;
  }


  public void setTrackUrlGroupId(Long trackUrlGroupId) {
    this.trackUrlGroupId = trackUrlGroupId;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner trackUrlGroupName(String trackUrlGroupName) {
    
    this.trackUrlGroupName = trackUrlGroupName;
    return this;
  }

   /**
   * 监测链接组名称
   * @return trackUrlGroupName
  **/
  @javax.annotation.Nullable
  public String getTrackUrlGroupName() {
    return trackUrlGroupName;
  }


  public void setTrackUrlGroupName(String trackUrlGroupName) {
    this.trackUrlGroupName = trackUrlGroupName;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner videoPlayDoneTrackUrl(String videoPlayDoneTrackUrl) {
    
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

   /**
   * 视频播完（监测链接），只允许传入1个
   * @return videoPlayDoneTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayDoneTrackUrl() {
    return videoPlayDoneTrackUrl;
  }


  public void setVideoPlayDoneTrackUrl(String videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner videoPlayEffectiveTrackUrl(String videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

   /**
   * 视频有效播放（监测链接），只允许传入1个
   * @return videoPlayEffectiveTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayEffectiveTrackUrl() {
    return videoPlayEffectiveTrackUrl;
  }


  public void setVideoPlayEffectiveTrackUrl(String videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
  }


  public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner videoPlayTrackUrl(String videoPlayTrackUrl) {
    
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

   /**
   * 视频播放（监测链接），只允许传入1个
   * @return videoPlayTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayTrackUrl() {
    return videoPlayTrackUrl;
  }


  public void setVideoPlayTrackUrl(String videoPlayTrackUrl) {
    this.videoPlayTrackUrl = videoPlayTrackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner = (EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner) o;
    return Objects.equals(this.actionTrackUrl, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.actionTrackUrl) &&
        Objects.equals(this.activeTrackUrl, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.activeTrackUrl) &&
        Objects.equals(this.downloadUrl, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.downloadUrl) &&
        Objects.equals(this.trackUrl, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.trackUrl) &&
        Objects.equals(this.trackUrlGroupId, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.trackUrlGroupId) &&
        Objects.equals(this.trackUrlGroupName, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.trackUrlGroupName) &&
        Objects.equals(this.videoPlayDoneTrackUrl, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.videoPlayDoneTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.videoPlayEffectiveTrackUrl) &&
        Objects.equals(this.videoPlayTrackUrl, eventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.videoPlayTrackUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, activeTrackUrl, downloadUrl, trackUrl, trackUrlGroupId, trackUrlGroupName, videoPlayDoneTrackUrl, videoPlayEffectiveTrackUrl, videoPlayTrackUrl);
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
    sb.append("class EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    activeTrackUrl: ").append(toIndentedString(activeTrackUrl)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    trackUrlGroupId: ").append(toIndentedString(trackUrlGroupId)).append("\n");
    sb.append("    trackUrlGroupName: ").append(toIndentedString(trackUrlGroupName)).append("\n");
    sb.append("    videoPlayDoneTrackUrl: ").append(toIndentedString(videoPlayDoneTrackUrl)).append("\n");
    sb.append("    videoPlayEffectiveTrackUrl: ").append(toIndentedString(videoPlayEffectiveTrackUrl)).append("\n");
    sb.append("    videoPlayTrackUrl: ").append(toIndentedString(videoPlayTrackUrl)).append("\n");
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
    openapiFields.add("action_track_url");
    openapiFields.add("active_track_url");
    openapiFields.add("download_url");
    openapiFields.add("track_url");
    openapiFields.add("track_url_group_id");
    openapiFields.add("track_url_group_name");
    openapiFields.add("video_play_done_track_url");
    openapiFields.add("video_play_effective_track_url");
    openapiFields.add("video_play_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner>() {
           @Override
           public void write(JsonWriter out, EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner
  */
  public static EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner.class);
  }

 /**
  * Convert an instance of EventManagerTrackUrlGetV2ResponseDataTrackUrlGroupsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

