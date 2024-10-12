/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo;
import com.bytedance.ads.model.StarDemandOmGetChallengeV2ResponseDataTaskInfoDemandInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class StarDemandOmGetChallengeV2ResponseDataTaskInfo {
  public static final String SERIALIZED_NAME_CHALLENGE_INFO = "challenge_info";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_INFO)
  private StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo challengeInfo = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_DEMAND_INFO = "demand_info";
  @SerializedName(SERIALIZED_NAME_DEMAND_INFO)
  private StarDemandOmGetChallengeV2ResponseDataTaskInfoDemandInfo demandInfo = null;

  public StarDemandOmGetChallengeV2ResponseDataTaskInfo() {
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfo challengeInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo challengeInfo) {
    
    this.challengeInfo = challengeInfo;
    return this;
  }

   /**
   * Get challengeInfo
   * @return challengeInfo
  **/
  @javax.annotation.Nullable
  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo getChallengeInfo() {
    return challengeInfo;
  }


  public void setChallengeInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo challengeInfo) {
    this.challengeInfo = challengeInfo;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfo challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 任务ID
   * @return challengeTaskId
  **/
  @javax.annotation.Nullable
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfo demandInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoDemandInfo demandInfo) {
    
    this.demandInfo = demandInfo;
    return this;
  }

   /**
   * Get demandInfo
   * @return demandInfo
  **/
  @javax.annotation.Nullable
  public StarDemandOmGetChallengeV2ResponseDataTaskInfoDemandInfo getDemandInfo() {
    return demandInfo;
  }


  public void setDemandInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoDemandInfo demandInfo) {
    this.demandInfo = demandInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeV2ResponseDataTaskInfo starDemandOmGetChallengeV2ResponseDataTaskInfo = (StarDemandOmGetChallengeV2ResponseDataTaskInfo) o;
    return Objects.equals(this.challengeInfo, starDemandOmGetChallengeV2ResponseDataTaskInfo.challengeInfo) &&
        Objects.equals(this.challengeTaskId, starDemandOmGetChallengeV2ResponseDataTaskInfo.challengeTaskId) &&
        Objects.equals(this.demandInfo, starDemandOmGetChallengeV2ResponseDataTaskInfo.demandInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeInfo, challengeTaskId, demandInfo);
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
    sb.append("class StarDemandOmGetChallengeV2ResponseDataTaskInfo {\n");
    sb.append("    challengeInfo: ").append(toIndentedString(challengeInfo)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    demandInfo: ").append(toIndentedString(demandInfo)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeV2ResponseDataTaskInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeV2ResponseDataTaskInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeV2ResponseDataTaskInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeV2ResponseDataTaskInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeV2ResponseDataTaskInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeV2ResponseDataTaskInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeV2ResponseDataTaskInfo
  */
  public static StarDemandOmGetChallengeV2ResponseDataTaskInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeV2ResponseDataTaskInfo.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

