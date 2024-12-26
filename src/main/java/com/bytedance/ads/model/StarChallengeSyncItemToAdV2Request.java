/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * StarChallengeSyncItemToAdV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StarChallengeSyncItemToAdV2Request {
  public static final String SERIALIZED_NAME_ADV_IDS = "adv_ids";
  @SerializedName(SERIALIZED_NAME_ADV_IDS)
  private List<Long> advIds = null;

  public static final String SERIALIZED_NAME_CHALLENGE_ID = "challenge_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_ID)
  private Long challengeId = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Long> itemIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_PLATFORM = "material_platform";
  @SerializedName(SERIALIZED_NAME_MATERIAL_PLATFORM)
  private Long materialPlatform = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarChallengeSyncItemToAdV2Request() {
  }

  public StarChallengeSyncItemToAdV2Request advIds(List<Long> advIds) {
    
    this.advIds = advIds;
    return this;
  }

  public StarChallengeSyncItemToAdV2Request addAdvIdsItem(Long advIdsItem) {
    if (this.advIds == null) {
      this.advIds = new ArrayList<>();
    }
    this.advIds.add(advIdsItem);
    return this;
  }

   /**
   * 广告主ID
   * @return advIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvIds() {
    return advIds;
  }


  public void setAdvIds(List<Long> advIds) {
    this.advIds = advIds;
  }


  public StarChallengeSyncItemToAdV2Request challengeId(Long challengeId) {
    
    this.challengeId = challengeId;
    return this;
  }

   /**
   * 任务ID
   * @return challengeId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeId() {
    return challengeId;
  }


  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }


  public StarChallengeSyncItemToAdV2Request itemIds(List<Long> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public StarChallengeSyncItemToAdV2Request addItemIdsItem(Long itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 视频ID
   * @return itemIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
  }


  public StarChallengeSyncItemToAdV2Request materialPlatform(Long materialPlatform) {
    
    this.materialPlatform = materialPlatform;
    return this;
  }

   /**
   * 仅推送平台：1-巨量平台 - 竞价广告，7-本地推
   * @return materialPlatform
  **/
  @javax.annotation.Nonnull
  public Long getMaterialPlatform() {
    return materialPlatform;
  }


  public void setMaterialPlatform(Long materialPlatform) {
    this.materialPlatform = materialPlatform;
  }


  public StarChallengeSyncItemToAdV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeSyncItemToAdV2Request starChallengeSyncItemToAdV2Request = (StarChallengeSyncItemToAdV2Request) o;
    return Objects.equals(this.advIds, starChallengeSyncItemToAdV2Request.advIds) &&
        Objects.equals(this.challengeId, starChallengeSyncItemToAdV2Request.challengeId) &&
        Objects.equals(this.itemIds, starChallengeSyncItemToAdV2Request.itemIds) &&
        Objects.equals(this.materialPlatform, starChallengeSyncItemToAdV2Request.materialPlatform) &&
        Objects.equals(this.starId, starChallengeSyncItemToAdV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advIds, challengeId, itemIds, materialPlatform, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengeSyncItemToAdV2Request {\n");
    sb.append("    advIds: ").append(toIndentedString(advIds)).append("\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    materialPlatform: ").append(toIndentedString(materialPlatform)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("adv_ids");
    openapiFields.add("challenge_id");
    openapiFields.add("item_ids");
    openapiFields.add("material_platform");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("adv_ids");
    openapiRequiredFields.add("challenge_id");
    openapiRequiredFields.add("item_ids");
    openapiRequiredFields.add("material_platform");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeSyncItemToAdV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeSyncItemToAdV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeSyncItemToAdV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeSyncItemToAdV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeSyncItemToAdV2Request>() {
           @Override
           public void write(JsonWriter out, StarChallengeSyncItemToAdV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeSyncItemToAdV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeSyncItemToAdV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeSyncItemToAdV2Request
  * @throws IOException if the JSON string is invalid with respect to StarChallengeSyncItemToAdV2Request
  */
  public static StarChallengeSyncItemToAdV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeSyncItemToAdV2Request.class);
  }

 /**
  * Convert an instance of StarChallengeSyncItemToAdV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

