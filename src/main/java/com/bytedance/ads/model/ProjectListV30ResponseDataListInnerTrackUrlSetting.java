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
import com.bytedance.ads.model.ProjectListV30DataListTrackUrlSettingSendType;
import com.bytedance.ads.model.ProjectListV30DataListTrackUrlSettingTrackUrlType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ProjectListV30ResponseDataListInnerTrackUrlSetting {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private List<String> actionTrackUrl = null;

  public static final String SERIALIZED_NAME_ACTIVE_TRACK_URL = "active_track_url";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TRACK_URL)
  private List<String> activeTrackUrl = null;

  public static final String SERIALIZED_NAME_SEND_TYPE = "send_type";
  @SerializedName(SERIALIZED_NAME_SEND_TYPE)
  private ProjectListV30DataListTrackUrlSettingSendType sendType = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private List<String> trackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_ID = "track_url_group_id";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_ID)
  private Long trackUrlGroupId = null;

  public static final String SERIALIZED_NAME_TRACK_URL_TYPE = "track_url_type";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_TYPE)
  private ProjectListV30DataListTrackUrlSettingTrackUrlType trackUrlType = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL = "video_play_done_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL)
  private List<String> videoPlayDoneTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private List<String> videoPlayEffectiveTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_FIRST_TRACK_URL = "video_play_first_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_FIRST_TRACK_URL)
  private List<String> videoPlayFirstTrackUrl = null;

  public ProjectListV30ResponseDataListInnerTrackUrlSetting() {
  }

  public ProjectListV30ResponseDataListInnerTrackUrlSetting actionTrackUrl(List<String> actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public ProjectListV30ResponseDataListInnerTrackUrlSetting addActionTrackUrlItem(String actionTrackUrlItem) {
    if (this.actionTrackUrl == null) {
      this.actionTrackUrl = new ArrayList<>();
    }
    this.actionTrackUrl.add(actionTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting activeTrackUrl(List<String> activeTrackUrl) {
    
    this.activeTrackUrl = activeTrackUrl;
    return this;
  }

  public ProjectListV30ResponseDataListInnerTrackUrlSetting addActiveTrackUrlItem(String activeTrackUrlItem) {
    if (this.activeTrackUrl == null) {
      this.activeTrackUrl = new ArrayList<>();
    }
    this.activeTrackUrl.add(activeTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return activeTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getActiveTrackUrl() {
    return activeTrackUrl;
  }


  public void setActiveTrackUrl(List<String> activeTrackUrl) {
    this.activeTrackUrl = activeTrackUrl;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting sendType(ProjectListV30DataListTrackUrlSettingSendType sendType) {
    
    this.sendType = sendType;
    return this;
  }

   /**
   * Get sendType
   * @return sendType
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListTrackUrlSettingSendType getSendType() {
    return sendType;
  }


  public void setSendType(ProjectListV30DataListTrackUrlSettingSendType sendType) {
    this.sendType = sendType;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting trackUrl(List<String> trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

  public ProjectListV30ResponseDataListInnerTrackUrlSetting addTrackUrlItem(String trackUrlItem) {
    if (this.trackUrl == null) {
      this.trackUrl = new ArrayList<>();
    }
    this.trackUrl.add(trackUrlItem);
    return this;
  }

   /**
   * 
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting trackUrlGroupId(Long trackUrlGroupId) {
    
    this.trackUrlGroupId = trackUrlGroupId;
    return this;
  }

   /**
   * 
   * @return trackUrlGroupId
  **/
  @javax.annotation.Nullable
  public Long getTrackUrlGroupId() {
    return trackUrlGroupId;
  }


  public void setTrackUrlGroupId(Long trackUrlGroupId) {
    this.trackUrlGroupId = trackUrlGroupId;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting trackUrlType(ProjectListV30DataListTrackUrlSettingTrackUrlType trackUrlType) {
    
    this.trackUrlType = trackUrlType;
    return this;
  }

   /**
   * Get trackUrlType
   * @return trackUrlType
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListTrackUrlSettingTrackUrlType getTrackUrlType() {
    return trackUrlType;
  }


  public void setTrackUrlType(ProjectListV30DataListTrackUrlSettingTrackUrlType trackUrlType) {
    this.trackUrlType = trackUrlType;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting videoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

  public ProjectListV30ResponseDataListInnerTrackUrlSetting addVideoPlayDoneTrackUrlItem(String videoPlayDoneTrackUrlItem) {
    if (this.videoPlayDoneTrackUrl == null) {
      this.videoPlayDoneTrackUrl = new ArrayList<>();
    }
    this.videoPlayDoneTrackUrl.add(videoPlayDoneTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return videoPlayDoneTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayDoneTrackUrl() {
    return videoPlayDoneTrackUrl;
  }


  public void setVideoPlayDoneTrackUrl(List<String> videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public ProjectListV30ResponseDataListInnerTrackUrlSetting addVideoPlayEffectiveTrackUrlItem(String videoPlayEffectiveTrackUrlItem) {
    if (this.videoPlayEffectiveTrackUrl == null) {
      this.videoPlayEffectiveTrackUrl = new ArrayList<>();
    }
    this.videoPlayEffectiveTrackUrl.add(videoPlayEffectiveTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return videoPlayEffectiveTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayEffectiveTrackUrl() {
    return videoPlayEffectiveTrackUrl;
  }


  public void setVideoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
  }


  public ProjectListV30ResponseDataListInnerTrackUrlSetting videoPlayFirstTrackUrl(List<String> videoPlayFirstTrackUrl) {
    
    this.videoPlayFirstTrackUrl = videoPlayFirstTrackUrl;
    return this;
  }

  public ProjectListV30ResponseDataListInnerTrackUrlSetting addVideoPlayFirstTrackUrlItem(String videoPlayFirstTrackUrlItem) {
    if (this.videoPlayFirstTrackUrl == null) {
      this.videoPlayFirstTrackUrl = new ArrayList<>();
    }
    this.videoPlayFirstTrackUrl.add(videoPlayFirstTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return videoPlayFirstTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getVideoPlayFirstTrackUrl() {
    return videoPlayFirstTrackUrl;
  }


  public void setVideoPlayFirstTrackUrl(List<String> videoPlayFirstTrackUrl) {
    this.videoPlayFirstTrackUrl = videoPlayFirstTrackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectListV30ResponseDataListInnerTrackUrlSetting projectListV30ResponseDataListInnerTrackUrlSetting = (ProjectListV30ResponseDataListInnerTrackUrlSetting) o;
    return Objects.equals(this.actionTrackUrl, projectListV30ResponseDataListInnerTrackUrlSetting.actionTrackUrl) &&
        Objects.equals(this.activeTrackUrl, projectListV30ResponseDataListInnerTrackUrlSetting.activeTrackUrl) &&
        Objects.equals(this.sendType, projectListV30ResponseDataListInnerTrackUrlSetting.sendType) &&
        Objects.equals(this.trackUrl, projectListV30ResponseDataListInnerTrackUrlSetting.trackUrl) &&
        Objects.equals(this.trackUrlGroupId, projectListV30ResponseDataListInnerTrackUrlSetting.trackUrlGroupId) &&
        Objects.equals(this.trackUrlType, projectListV30ResponseDataListInnerTrackUrlSetting.trackUrlType) &&
        Objects.equals(this.videoPlayDoneTrackUrl, projectListV30ResponseDataListInnerTrackUrlSetting.videoPlayDoneTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, projectListV30ResponseDataListInnerTrackUrlSetting.videoPlayEffectiveTrackUrl) &&
        Objects.equals(this.videoPlayFirstTrackUrl, projectListV30ResponseDataListInnerTrackUrlSetting.videoPlayFirstTrackUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, activeTrackUrl, sendType, trackUrl, trackUrlGroupId, trackUrlType, videoPlayDoneTrackUrl, videoPlayEffectiveTrackUrl, videoPlayFirstTrackUrl);
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
    sb.append("class ProjectListV30ResponseDataListInnerTrackUrlSetting {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    activeTrackUrl: ").append(toIndentedString(activeTrackUrl)).append("\n");
    sb.append("    sendType: ").append(toIndentedString(sendType)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    trackUrlGroupId: ").append(toIndentedString(trackUrlGroupId)).append("\n");
    sb.append("    trackUrlType: ").append(toIndentedString(trackUrlType)).append("\n");
    sb.append("    videoPlayDoneTrackUrl: ").append(toIndentedString(videoPlayDoneTrackUrl)).append("\n");
    sb.append("    videoPlayEffectiveTrackUrl: ").append(toIndentedString(videoPlayEffectiveTrackUrl)).append("\n");
    sb.append("    videoPlayFirstTrackUrl: ").append(toIndentedString(videoPlayFirstTrackUrl)).append("\n");
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
    openapiFields.add("send_type");
    openapiFields.add("track_url");
    openapiFields.add("track_url_group_id");
    openapiFields.add("track_url_type");
    openapiFields.add("video_play_done_track_url");
    openapiFields.add("video_play_effective_track_url");
    openapiFields.add("video_play_first_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectListV30ResponseDataListInnerTrackUrlSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerTrackUrlSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerTrackUrlSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerTrackUrlSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerTrackUrlSetting>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerTrackUrlSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerTrackUrlSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerTrackUrlSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerTrackUrlSetting
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerTrackUrlSetting
  */
  public static ProjectListV30ResponseDataListInnerTrackUrlSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerTrackUrlSetting.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerTrackUrlSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

