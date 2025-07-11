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
 * ToolsPlayableGrantV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPlayableGrantV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_GRANTED_IDS = "granted_ids";
  @SerializedName(SERIALIZED_NAME_GRANTED_IDS)
  private List<Long> grantedIds = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public ToolsPlayableGrantV2Request() {
  }

  public ToolsPlayableGrantV2Request advertiserId(Long advertiserId) {
    
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


  public ToolsPlayableGrantV2Request grantedIds(List<Long> grantedIds) {
    
    this.grantedIds = grantedIds;
    return this;
  }

  public ToolsPlayableGrantV2Request addGrantedIdsItem(Long grantedIdsItem) {
    if (this.grantedIds == null) {
      this.grantedIds = new ArrayList<>();
    }
    this.grantedIds.add(grantedIdsItem);
    return this;
  }

   /**
   * 推送的目标（广告主id）列表，一次最多同时推送给50个广告主
   * @return grantedIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getGrantedIds() {
    return grantedIds;
  }


  public void setGrantedIds(List<Long> grantedIds) {
    this.grantedIds = grantedIds;
  }


  public ToolsPlayableGrantV2Request playableId(Long playableId) {
    
    this.playableId = playableId;
    return this;
  }

   /**
   * 需要推送的试玩素材ID，与playable_url有且仅有一个
   * @return playableId
  **/
  @javax.annotation.Nullable
  public Long getPlayableId() {
    return playableId;
  }


  public void setPlayableId(Long playableId) {
    this.playableId = playableId;
  }


  public ToolsPlayableGrantV2Request playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 需要推送的试玩素材url，与playable_id有且仅有一个
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableGrantV2Request toolsPlayableGrantV2Request = (ToolsPlayableGrantV2Request) o;
    return Objects.equals(this.advertiserId, toolsPlayableGrantV2Request.advertiserId) &&
        Objects.equals(this.grantedIds, toolsPlayableGrantV2Request.grantedIds) &&
        Objects.equals(this.playableId, toolsPlayableGrantV2Request.playableId) &&
        Objects.equals(this.playableUrl, toolsPlayableGrantV2Request.playableUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, grantedIds, playableId, playableUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPlayableGrantV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    grantedIds: ").append(toIndentedString(grantedIds)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
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
    openapiFields.add("granted_ids");
    openapiFields.add("playable_id");
    openapiFields.add("playable_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("granted_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableGrantV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableGrantV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableGrantV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableGrantV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableGrantV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableGrantV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableGrantV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableGrantV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableGrantV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableGrantV2Request
  */
  public static ToolsPlayableGrantV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableGrantV2Request.class);
  }

 /**
  * Convert an instance of ToolsPlayableGrantV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

