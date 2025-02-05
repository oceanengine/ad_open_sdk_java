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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo {
  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_TASK_CATEGORY = "task_category";
  @SerializedName(SERIALIZED_NAME_TASK_CATEGORY)
  private Long taskCategory = null;

  public StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo() {
  }

  public StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo challengeTaskId(Long challengeTaskId) {
    
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


  public StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 任务状态（2，3为可选稿状态）
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo taskCategory(Long taskCategory) {
    
    this.taskCategory = taskCategory;
    return this;
  }

   /**
   * 任务类型（4:短视频，57:直播）
   * @return taskCategory
  **/
  @javax.annotation.Nullable
  public Long getTaskCategory() {
    return taskCategory;
  }


  public void setTaskCategory(Long taskCategory) {
    this.taskCategory = taskCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo starChallengeGetCustomTaskDataV2ResponseDataTaskInfo = (StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo) o;
    return Objects.equals(this.challengeTaskId, starChallengeGetCustomTaskDataV2ResponseDataTaskInfo.challengeTaskId) &&
        Objects.equals(this.status, starChallengeGetCustomTaskDataV2ResponseDataTaskInfo.status) &&
        Objects.equals(this.taskCategory, starChallengeGetCustomTaskDataV2ResponseDataTaskInfo.taskCategory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeTaskId, status, taskCategory);
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
    sb.append("class StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo {\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskCategory: ").append(toIndentedString(taskCategory)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("task_category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo
  */
  public static StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo.class);
  }

 /**
  * Convert an instance of StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

