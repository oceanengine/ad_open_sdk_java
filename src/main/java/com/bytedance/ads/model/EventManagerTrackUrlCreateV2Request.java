/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner;
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
 * EventManagerTrackUrlCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class EventManagerTrackUrlCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ASSETS_ID = "assets_id";
  @SerializedName(SERIALIZED_NAME_ASSETS_ID)
  private Long assetsId = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUPS = "track_url_groups";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUPS)
  private List<EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner> trackUrlGroups = null;

  public EventManagerTrackUrlCreateV2Request() {
  }

  public EventManagerTrackUrlCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public EventManagerTrackUrlCreateV2Request assetsId(Long assetsId) {
    
    this.assetsId = assetsId;
    return this;
  }

   /**
   * 资产ID
   * @return assetsId
  **/
  @javax.annotation.Nonnull
  public Long getAssetsId() {
    return assetsId;
  }


  public void setAssetsId(Long assetsId) {
    this.assetsId = assetsId;
  }


  public EventManagerTrackUrlCreateV2Request downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 应用下载链接
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public EventManagerTrackUrlCreateV2Request trackUrlGroups(List<EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner> trackUrlGroups) {
    
    this.trackUrlGroups = trackUrlGroups;
    return this;
  }

  public EventManagerTrackUrlCreateV2Request addTrackUrlGroupsItem(EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner trackUrlGroupsItem) {
    if (this.trackUrlGroups == null) {
      this.trackUrlGroups = new ArrayList<>();
    }
    this.trackUrlGroups.add(trackUrlGroupsItem);
    return this;
  }

   /**
   * 监测链接组信息，IOS和安卓应用可绑定多组监测链接
   * @return trackUrlGroups
  **/
  @javax.annotation.Nonnull
  public List<EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner> getTrackUrlGroups() {
    return trackUrlGroups;
  }


  public void setTrackUrlGroups(List<EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner> trackUrlGroups) {
    this.trackUrlGroups = trackUrlGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerTrackUrlCreateV2Request eventManagerTrackUrlCreateV2Request = (EventManagerTrackUrlCreateV2Request) o;
    return Objects.equals(this.advertiserId, eventManagerTrackUrlCreateV2Request.advertiserId) &&
        Objects.equals(this.assetsId, eventManagerTrackUrlCreateV2Request.assetsId) &&
        Objects.equals(this.downloadUrl, eventManagerTrackUrlCreateV2Request.downloadUrl) &&
        Objects.equals(this.trackUrlGroups, eventManagerTrackUrlCreateV2Request.trackUrlGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, assetsId, downloadUrl, trackUrlGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerTrackUrlCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    assetsId: ").append(toIndentedString(assetsId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    trackUrlGroups: ").append(toIndentedString(trackUrlGroups)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("assets_id");
    openapiFields.add("download_url");
    openapiFields.add("track_url_groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("assets_id");
    openapiRequiredFields.add("track_url_groups");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerTrackUrlCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerTrackUrlCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerTrackUrlCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerTrackUrlCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerTrackUrlCreateV2Request>() {
           @Override
           public void write(JsonWriter out, EventManagerTrackUrlCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerTrackUrlCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerTrackUrlCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerTrackUrlCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to EventManagerTrackUrlCreateV2Request
  */
  public static EventManagerTrackUrlCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerTrackUrlCreateV2Request.class);
  }

 /**
  * Convert an instance of EventManagerTrackUrlCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

