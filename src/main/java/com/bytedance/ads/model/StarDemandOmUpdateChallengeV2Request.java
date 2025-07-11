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
import com.bytedance.ads.model.StarDemandOmUpdateChallengeV2RequestChallengeInfo;
import com.bytedance.ads.model.StarDemandOmUpdateChallengeV2RequestDemandInfo;
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
 * StarDemandOmUpdateChallengeV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarDemandOmUpdateChallengeV2Request {
  public static final String SERIALIZED_NAME_CHALLENGE_INFO = "challenge_info";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_INFO)
  private StarDemandOmUpdateChallengeV2RequestChallengeInfo challengeInfo = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_DEMAND_INFO = "demand_info";
  @SerializedName(SERIALIZED_NAME_DEMAND_INFO)
  private StarDemandOmUpdateChallengeV2RequestDemandInfo demandInfo = null;

  public static final String SERIALIZED_NAME_DEVELOPER_ID = "developer_id";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_ID)
  private String developerId = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarDemandOmUpdateChallengeV2Request() {
  }

  public StarDemandOmUpdateChallengeV2Request challengeInfo(StarDemandOmUpdateChallengeV2RequestChallengeInfo challengeInfo) {
    
    this.challengeInfo = challengeInfo;
    return this;
  }

   /**
   * Get challengeInfo
   * @return challengeInfo
  **/
  @javax.annotation.Nonnull
  public StarDemandOmUpdateChallengeV2RequestChallengeInfo getChallengeInfo() {
    return challengeInfo;
  }


  public void setChallengeInfo(StarDemandOmUpdateChallengeV2RequestChallengeInfo challengeInfo) {
    this.challengeInfo = challengeInfo;
  }


  public StarDemandOmUpdateChallengeV2Request challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 任务ID,19位数字
   * @return challengeTaskId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarDemandOmUpdateChallengeV2Request demandInfo(StarDemandOmUpdateChallengeV2RequestDemandInfo demandInfo) {
    
    this.demandInfo = demandInfo;
    return this;
  }

   /**
   * Get demandInfo
   * @return demandInfo
  **/
  @javax.annotation.Nonnull
  public StarDemandOmUpdateChallengeV2RequestDemandInfo getDemandInfo() {
    return demandInfo;
  }


  public void setDemandInfo(StarDemandOmUpdateChallengeV2RequestDemandInfo demandInfo) {
    this.demandInfo = demandInfo;
  }


  public StarDemandOmUpdateChallengeV2Request developerId(String developerId) {
    
    this.developerId = developerId;
    return this;
  }

   /**
   * 
   * @return developerId
  **/
  @javax.annotation.Nullable
  public String getDeveloperId() {
    return developerId;
  }


  public void setDeveloperId(String developerId) {
    this.developerId = developerId;
  }


  public StarDemandOmUpdateChallengeV2Request starId(Long starId) {
    
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
    StarDemandOmUpdateChallengeV2Request starDemandOmUpdateChallengeV2Request = (StarDemandOmUpdateChallengeV2Request) o;
    return Objects.equals(this.challengeInfo, starDemandOmUpdateChallengeV2Request.challengeInfo) &&
        Objects.equals(this.challengeTaskId, starDemandOmUpdateChallengeV2Request.challengeTaskId) &&
        Objects.equals(this.demandInfo, starDemandOmUpdateChallengeV2Request.demandInfo) &&
        Objects.equals(this.developerId, starDemandOmUpdateChallengeV2Request.developerId) &&
        Objects.equals(this.starId, starDemandOmUpdateChallengeV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeInfo, challengeTaskId, demandInfo, developerId, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmUpdateChallengeV2Request {\n");
    sb.append("    challengeInfo: ").append(toIndentedString(challengeInfo)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    demandInfo: ").append(toIndentedString(demandInfo)).append("\n");
    sb.append("    developerId: ").append(toIndentedString(developerId)).append("\n");
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
    openapiFields.add("challenge_info");
    openapiFields.add("challenge_task_id");
    openapiFields.add("demand_info");
    openapiFields.add("developer_id");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("challenge_info");
    openapiRequiredFields.add("challenge_task_id");
    openapiRequiredFields.add("demand_info");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmUpdateChallengeV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmUpdateChallengeV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmUpdateChallengeV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmUpdateChallengeV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmUpdateChallengeV2Request>() {
           @Override
           public void write(JsonWriter out, StarDemandOmUpdateChallengeV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmUpdateChallengeV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmUpdateChallengeV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmUpdateChallengeV2Request
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmUpdateChallengeV2Request
  */
  public static StarDemandOmUpdateChallengeV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmUpdateChallengeV2Request.class);
  }

 /**
  * Convert an instance of StarDemandOmUpdateChallengeV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

