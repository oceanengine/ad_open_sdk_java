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
 * StarChallengeAddBudgetV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarChallengeAddBudgetV2Request {
  public static final String SERIALIZED_NAME_ADD_BUDGET = "add_budget";
  @SerializedName(SERIALIZED_NAME_ADD_BUDGET)
  private Long addBudget = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarChallengeAddBudgetV2Request() {
  }

  public StarChallengeAddBudgetV2Request addBudget(Long addBudget) {
    
    this.addBudget = addBudget;
    return this;
  }

   /**
   * 追加预算金额（单位元，不低于10000）
   * @return addBudget
  **/
  @javax.annotation.Nonnull
  public Long getAddBudget() {
    return addBudget;
  }


  public void setAddBudget(Long addBudget) {
    this.addBudget = addBudget;
  }


  public StarChallengeAddBudgetV2Request challengeTaskId(Long challengeTaskId) {
    
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


  public StarChallengeAddBudgetV2Request starId(Long starId) {
    
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
    StarChallengeAddBudgetV2Request starChallengeAddBudgetV2Request = (StarChallengeAddBudgetV2Request) o;
    return Objects.equals(this.addBudget, starChallengeAddBudgetV2Request.addBudget) &&
        Objects.equals(this.challengeTaskId, starChallengeAddBudgetV2Request.challengeTaskId) &&
        Objects.equals(this.starId, starChallengeAddBudgetV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addBudget, challengeTaskId, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengeAddBudgetV2Request {\n");
    sb.append("    addBudget: ").append(toIndentedString(addBudget)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
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
    openapiFields.add("add_budget");
    openapiFields.add("challenge_task_id");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("add_budget");
    openapiRequiredFields.add("challenge_task_id");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeAddBudgetV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeAddBudgetV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeAddBudgetV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeAddBudgetV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeAddBudgetV2Request>() {
           @Override
           public void write(JsonWriter out, StarChallengeAddBudgetV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeAddBudgetV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeAddBudgetV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeAddBudgetV2Request
  * @throws IOException if the JSON string is invalid with respect to StarChallengeAddBudgetV2Request
  */
  public static StarChallengeAddBudgetV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeAddBudgetV2Request.class);
  }

 /**
  * Convert an instance of StarChallengeAddBudgetV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

