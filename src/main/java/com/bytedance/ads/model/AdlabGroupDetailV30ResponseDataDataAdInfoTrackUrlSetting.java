/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType;
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
 * 监测链接设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private List<String> actionTrackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private List<String> trackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_ID = "track_url_group_id";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_ID)
  private Long trackUrlGroupId = null;

  public static final String SERIALIZED_NAME_TRACK_URL_SEND_TYPE = "track_url_send_type";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_SEND_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType trackUrlSendType = null;

  public static final String SERIALIZED_NAME_TRACK_URL_TYPE = "track_url_type";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType trackUrlType = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL = "video_play_done_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL)
  private List<String> videoPlayDoneTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private List<String> videoPlayEffectiveTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL = "video_play_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL)
  private List<String> videoPlayTrackUrl = null;

  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting() {
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting actionTrackUrl(List<String> actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting addActionTrackUrlItem(String actionTrackUrlItem) {
    if (this.actionTrackUrl == null) {
      this.actionTrackUrl = new ArrayList<>();
    }
    this.actionTrackUrl.add(actionTrackUrlItem);
    return this;
  }

   /**
   * 点击（监测链接）
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting trackUrl(List<String> trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting addTrackUrlItem(String trackUrlItem) {
    if (this.trackUrl == null) {
      this.trackUrl = new ArrayList<>();
    }
    this.trackUrl.add(trackUrlItem);
    return this;
  }

   /**
   * 展示（监测链接）
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting trackUrlGroupId(Long trackUrlGroupId) {
    
    this.trackUrlGroupId = trackUrlGroupId;
    return this;
  }

   /**
   * 监测链接组id
   * @return trackUrlGroupId
  **/
  @javax.annotation.Nullable
  public Long getTrackUrlGroupId() {
    return trackUrlGroupId;
  }


  public void setTrackUrlGroupId(Long trackUrlGroupId) {
    this.trackUrlGroupId = trackUrlGroupId;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting trackUrlSendType(AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType trackUrlSendType) {
    
    this.trackUrlSendType = trackUrlSendType;
    return this;
  }

   /**
   * Get trackUrlSendType
   * @return trackUrlSendType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType getTrackUrlSendType() {
    return trackUrlSendType;
  }


  public void setTrackUrlSendType(AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlSendType trackUrlSendType) {
    this.trackUrlSendType = trackUrlSendType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting trackUrlType(AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType trackUrlType) {
    
    this.trackUrlType = trackUrlType;
    return this;
  }

   /**
   * Get trackUrlType
   * @return trackUrlType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType getTrackUrlType() {
    return trackUrlType;
  }


  public void setTrackUrlType(AdlabGroupDetailV30DataDataAdInfoTrackUrlSettingTrackUrlType trackUrlType) {
    this.trackUrlType = trackUrlType;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting videoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting addVideoPlayDoneTrackUrlItem(String videoPlayDoneTrackUrlItem) {
    if (this.videoPlayDoneTrackUrl == null) {
      this.videoPlayDoneTrackUrl = new ArrayList<>();
    }
    this.videoPlayDoneTrackUrl.add(videoPlayDoneTrackUrlItem);
    return this;
  }

   /**
   * 视频播完（监测链接）
   * @return videoPlayDoneTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayDoneTrackUrl() {
    return videoPlayDoneTrackUrl;
  }


  public void setVideoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting addVideoPlayEffectiveTrackUrlItem(String videoPlayEffectiveTrackUrlItem) {
    if (this.videoPlayEffectiveTrackUrl == null) {
      this.videoPlayEffectiveTrackUrl = new ArrayList<>();
    }
    this.videoPlayEffectiveTrackUrl.add(videoPlayEffectiveTrackUrlItem);
    return this;
  }

   /**
   * 视频有效播放（监测链接）
   * @return videoPlayEffectiveTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayEffectiveTrackUrl() {
    return videoPlayEffectiveTrackUrl;
  }


  public void setVideoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting videoPlayTrackUrl(List<String> videoPlayTrackUrl) {
    
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting addVideoPlayTrackUrlItem(String videoPlayTrackUrlItem) {
    if (this.videoPlayTrackUrl == null) {
      this.videoPlayTrackUrl = new ArrayList<>();
    }
    this.videoPlayTrackUrl.add(videoPlayTrackUrlItem);
    return this;
  }

   /**
   * 视频开始播放（监测链接）
   * @return videoPlayTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayTrackUrl() {
    return videoPlayTrackUrl;
  }


  public void setVideoPlayTrackUrl(List<String> videoPlayTrackUrl) {
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
    AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting = (AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting) o;
    return Objects.equals(this.actionTrackUrl, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.actionTrackUrl) &&
        Objects.equals(this.trackUrl, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.trackUrl) &&
        Objects.equals(this.trackUrlGroupId, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.trackUrlGroupId) &&
        Objects.equals(this.trackUrlSendType, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.trackUrlSendType) &&
        Objects.equals(this.trackUrlType, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.trackUrlType) &&
        Objects.equals(this.videoPlayDoneTrackUrl, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.videoPlayDoneTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.videoPlayEffectiveTrackUrl) &&
        Objects.equals(this.videoPlayTrackUrl, adlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.videoPlayTrackUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, trackUrl, trackUrlGroupId, trackUrlSendType, trackUrlType, videoPlayDoneTrackUrl, videoPlayEffectiveTrackUrl, videoPlayTrackUrl);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    trackUrlGroupId: ").append(toIndentedString(trackUrlGroupId)).append("\n");
    sb.append("    trackUrlSendType: ").append(toIndentedString(trackUrlSendType)).append("\n");
    sb.append("    trackUrlType: ").append(toIndentedString(trackUrlType)).append("\n");
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
    openapiFields.add("track_url");
    openapiFields.add("track_url_group_id");
    openapiFields.add("track_url_send_type");
    openapiFields.add("track_url_type");
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
       if (!AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting
  */
  public static AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataAdInfoTrackUrlSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

