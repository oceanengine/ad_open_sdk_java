/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPlayableListGetV2DataListPlayableOrientation;
import com.bytedance.ads.model.ToolsPlayableListGetV2DataListStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ToolsPlayableListGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsPlayableListGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_NAME = "playable_name";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_NAME)
  private String playableName = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ORIENTATION = "playable_orientation";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ORIENTATION)
  private ToolsPlayableListGetV2DataListPlayableOrientation playableOrientation = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsPlayableListGetV2DataListStatus status = null;

  public ToolsPlayableListGetV2ResponseDataListInner() {
  }

  public ToolsPlayableListGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPlayableListGetV2ResponseDataListInner playableId(Long playableId) {
    
    this.playableId = playableId;
    return this;
  }

   /**
   * 
   * @return playableId
  **/
  @javax.annotation.Nullable
  public Long getPlayableId() {
    return playableId;
  }


  public void setPlayableId(Long playableId) {
    this.playableId = playableId;
  }


  public ToolsPlayableListGetV2ResponseDataListInner playableName(String playableName) {
    
    this.playableName = playableName;
    return this;
  }

   /**
   * 
   * @return playableName
  **/
  @javax.annotation.Nullable
  public String getPlayableName() {
    return playableName;
  }


  public void setPlayableName(String playableName) {
    this.playableName = playableName;
  }


  public ToolsPlayableListGetV2ResponseDataListInner playableOrientation(ToolsPlayableListGetV2DataListPlayableOrientation playableOrientation) {
    
    this.playableOrientation = playableOrientation;
    return this;
  }

   /**
   * Get playableOrientation
   * @return playableOrientation
  **/
  @javax.annotation.Nullable
  public ToolsPlayableListGetV2DataListPlayableOrientation getPlayableOrientation() {
    return playableOrientation;
  }


  public void setPlayableOrientation(ToolsPlayableListGetV2DataListPlayableOrientation playableOrientation) {
    this.playableOrientation = playableOrientation;
  }


  public ToolsPlayableListGetV2ResponseDataListInner playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public ToolsPlayableListGetV2ResponseDataListInner status(ToolsPlayableListGetV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsPlayableListGetV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsPlayableListGetV2DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableListGetV2ResponseDataListInner toolsPlayableListGetV2ResponseDataListInner = (ToolsPlayableListGetV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, toolsPlayableListGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.playableId, toolsPlayableListGetV2ResponseDataListInner.playableId) &&
        Objects.equals(this.playableName, toolsPlayableListGetV2ResponseDataListInner.playableName) &&
        Objects.equals(this.playableOrientation, toolsPlayableListGetV2ResponseDataListInner.playableOrientation) &&
        Objects.equals(this.playableUrl, toolsPlayableListGetV2ResponseDataListInner.playableUrl) &&
        Objects.equals(this.status, toolsPlayableListGetV2ResponseDataListInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, playableId, playableName, playableOrientation, playableUrl, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPlayableListGetV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
    sb.append("    playableName: ").append(toIndentedString(playableName)).append("\n");
    sb.append("    playableOrientation: ").append(toIndentedString(playableOrientation)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("playable_id");
    openapiFields.add("playable_name");
    openapiFields.add("playable_orientation");
    openapiFields.add("playable_url");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableListGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableListGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableListGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableListGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableListGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableListGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableListGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableListGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableListGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableListGetV2ResponseDataListInner
  */
  public static ToolsPlayableListGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableListGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsPlayableListGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

