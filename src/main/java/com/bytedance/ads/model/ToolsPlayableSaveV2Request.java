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
 * ToolsPlayableSaveV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPlayableSaveV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_NAME = "playable_name";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_NAME)
  private String playableName = null;

  public ToolsPlayableSaveV2Request() {
  }

  public ToolsPlayableSaveV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * minimum: 1
   * maximum: -9223372036854775616
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPlayableSaveV2Request playableId(Long playableId) {
    
    this.playableId = playableId;
    return this;
  }

   /**
   * 试玩素材ID
   * @return playableId
  **/
  @javax.annotation.Nonnull
  public Long getPlayableId() {
    return playableId;
  }


  public void setPlayableId(Long playableId) {
    this.playableId = playableId;
  }


  public ToolsPlayableSaveV2Request playableName(String playableName) {
    
    this.playableName = playableName;
    return this;
  }

   /**
   * 试玩素材名称
   * @return playableName
  **/
  @javax.annotation.Nonnull
  public String getPlayableName() {
    return playableName;
  }


  public void setPlayableName(String playableName) {
    this.playableName = playableName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableSaveV2Request toolsPlayableSaveV2Request = (ToolsPlayableSaveV2Request) o;
    return Objects.equals(this.advertiserId, toolsPlayableSaveV2Request.advertiserId) &&
        Objects.equals(this.playableId, toolsPlayableSaveV2Request.playableId) &&
        Objects.equals(this.playableName, toolsPlayableSaveV2Request.playableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, playableId, playableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPlayableSaveV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
    sb.append("    playableName: ").append(toIndentedString(playableName)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("playable_id");
    openapiRequiredFields.add("playable_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableSaveV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableSaveV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableSaveV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableSaveV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableSaveV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableSaveV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableSaveV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableSaveV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableSaveV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableSaveV2Request
  */
  public static ToolsPlayableSaveV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableSaveV2Request.class);
  }

 /**
  * Convert an instance of ToolsPlayableSaveV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

