/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class QianchuanAdUpdateV10RequestTrackUrl {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private List<String> actionTrackUrl = null;

  public static final String SERIALIZED_NAME_SHOW_TRACK_URL = "show_track_url";
  @SerializedName(SERIALIZED_NAME_SHOW_TRACK_URL)
  private List<String> showTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private List<String> videoPlayEffectiveTrackUrl = null;

  public QianchuanAdUpdateV10RequestTrackUrl() {
  }

  public QianchuanAdUpdateV10RequestTrackUrl actionTrackUrl(List<String> actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public QianchuanAdUpdateV10RequestTrackUrl addActionTrackUrlItem(String actionTrackUrlItem) {
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


  public QianchuanAdUpdateV10RequestTrackUrl showTrackUrl(List<String> showTrackUrl) {
    
    this.showTrackUrl = showTrackUrl;
    return this;
  }

  public QianchuanAdUpdateV10RequestTrackUrl addShowTrackUrlItem(String showTrackUrlItem) {
    if (this.showTrackUrl == null) {
      this.showTrackUrl = new ArrayList<>();
    }
    this.showTrackUrl.add(showTrackUrlItem);
    return this;
  }

   /**
   * 
   * @return showTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getShowTrackUrl() {
    return showTrackUrl;
  }


  public void setShowTrackUrl(List<String> showTrackUrl) {
    this.showTrackUrl = showTrackUrl;
  }


  public QianchuanAdUpdateV10RequestTrackUrl videoPlayEffectiveTrackUrl(List<String> videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

  public QianchuanAdUpdateV10RequestTrackUrl addVideoPlayEffectiveTrackUrlItem(String videoPlayEffectiveTrackUrlItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10RequestTrackUrl qianchuanAdUpdateV10RequestTrackUrl = (QianchuanAdUpdateV10RequestTrackUrl) o;
    return Objects.equals(this.actionTrackUrl, qianchuanAdUpdateV10RequestTrackUrl.actionTrackUrl) &&
        Objects.equals(this.showTrackUrl, qianchuanAdUpdateV10RequestTrackUrl.showTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, qianchuanAdUpdateV10RequestTrackUrl.videoPlayEffectiveTrackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, showTrackUrl, videoPlayEffectiveTrackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestTrackUrl {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    showTrackUrl: ").append(toIndentedString(showTrackUrl)).append("\n");
    sb.append("    videoPlayEffectiveTrackUrl: ").append(toIndentedString(videoPlayEffectiveTrackUrl)).append("\n");
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
    openapiFields.add("show_track_url");
    openapiFields.add("video_play_effective_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestTrackUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestTrackUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestTrackUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestTrackUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestTrackUrl>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestTrackUrl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestTrackUrl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestTrackUrl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestTrackUrl
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestTrackUrl
  */
  public static QianchuanAdUpdateV10RequestTrackUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestTrackUrl.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestTrackUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

