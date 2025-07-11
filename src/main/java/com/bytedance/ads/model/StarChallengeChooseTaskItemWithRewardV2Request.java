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
import com.bytedance.ads.model.StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner;
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
 * StarChallengeChooseTaskItemWithRewardV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarChallengeChooseTaskItemWithRewardV2Request {
  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_ITEM_REWARDS = "item_rewards";
  @SerializedName(SERIALIZED_NAME_ITEM_REWARDS)
  private List<StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner> itemRewards = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarChallengeChooseTaskItemWithRewardV2Request() {
  }

  public StarChallengeChooseTaskItemWithRewardV2Request challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 投稿任务ID
   * @return challengeTaskId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarChallengeChooseTaskItemWithRewardV2Request itemRewards(List<StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner> itemRewards) {
    
    this.itemRewards = itemRewards;
    return this;
  }

  public StarChallengeChooseTaskItemWithRewardV2Request addItemRewardsItem(StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner itemRewardsItem) {
    if (this.itemRewards == null) {
      this.itemRewards = new ArrayList<>();
    }
    this.itemRewards.add(itemRewardsItem);
    return this;
  }

   /**
   * 选稿信息
   * @return itemRewards
  **/
  @javax.annotation.Nonnull
  public List<StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner> getItemRewards() {
    return itemRewards;
  }


  public void setItemRewards(List<StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner> itemRewards) {
    this.itemRewards = itemRewards;
  }


  public StarChallengeChooseTaskItemWithRewardV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户星图ID
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
    StarChallengeChooseTaskItemWithRewardV2Request starChallengeChooseTaskItemWithRewardV2Request = (StarChallengeChooseTaskItemWithRewardV2Request) o;
    return Objects.equals(this.challengeTaskId, starChallengeChooseTaskItemWithRewardV2Request.challengeTaskId) &&
        Objects.equals(this.itemRewards, starChallengeChooseTaskItemWithRewardV2Request.itemRewards) &&
        Objects.equals(this.starId, starChallengeChooseTaskItemWithRewardV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeTaskId, itemRewards, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengeChooseTaskItemWithRewardV2Request {\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    itemRewards: ").append(toIndentedString(itemRewards)).append("\n");
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
    openapiFields.add("challenge_task_id");
    openapiFields.add("item_rewards");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challenge_task_id");
    openapiRequiredFields.add("item_rewards");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeChooseTaskItemWithRewardV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeChooseTaskItemWithRewardV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeChooseTaskItemWithRewardV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeChooseTaskItemWithRewardV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeChooseTaskItemWithRewardV2Request>() {
           @Override
           public void write(JsonWriter out, StarChallengeChooseTaskItemWithRewardV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeChooseTaskItemWithRewardV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeChooseTaskItemWithRewardV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeChooseTaskItemWithRewardV2Request
  * @throws IOException if the JSON string is invalid with respect to StarChallengeChooseTaskItemWithRewardV2Request
  */
  public static StarChallengeChooseTaskItemWithRewardV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeChooseTaskItemWithRewardV2Request.class);
  }

 /**
  * Convert an instance of StarChallengeChooseTaskItemWithRewardV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

