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
import com.bytedance.ads.model.StardeliveryTaskListV30FilteringStarTaskSource;
import com.bytedance.ads.model.StardeliveryTaskListV30FilteringStarTaskStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class StardeliveryTaskListV30Filtering {
  public static final String SERIALIZED_NAME_STAR_TASK_IDS = "star_task_ids";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_IDS)
  private List<Long> starTaskIds = null;

  public static final String SERIALIZED_NAME_STAR_TASK_NAME = "star_task_name";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_NAME)
  private String starTaskName = null;

  public static final String SERIALIZED_NAME_STAR_TASK_SOURCE = "star_task_source";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_SOURCE)
  private StardeliveryTaskListV30FilteringStarTaskSource starTaskSource = null;

  public static final String SERIALIZED_NAME_STAR_TASK_STATUS = "star_task_status";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_STATUS)
  private StardeliveryTaskListV30FilteringStarTaskStatus starTaskStatus = null;

  public static final String SERIALIZED_NAME_TASK_MODIFY_END_TIME = "task_modify_end_time";
  @SerializedName(SERIALIZED_NAME_TASK_MODIFY_END_TIME)
  private String taskModifyEndTime = null;

  public static final String SERIALIZED_NAME_TASK_MODIFY_START_TIME = "task_modify_start_time";
  @SerializedName(SERIALIZED_NAME_TASK_MODIFY_START_TIME)
  private String taskModifyStartTime = null;

  public StardeliveryTaskListV30Filtering() {
  }

  public StardeliveryTaskListV30Filtering starTaskIds(List<Long> starTaskIds) {
    
    this.starTaskIds = starTaskIds;
    return this;
  }

  public StardeliveryTaskListV30Filtering addStarTaskIdsItem(Long starTaskIdsItem) {
    if (this.starTaskIds == null) {
      this.starTaskIds = new ArrayList<>();
    }
    this.starTaskIds.add(starTaskIdsItem);
    return this;
  }

   /**
   * 任务id过滤，精确搜索，最长50
   * @return starTaskIds
  **/
  @javax.annotation.Nullable
  public List<Long> getStarTaskIds() {
    return starTaskIds;
  }


  public void setStarTaskIds(List<Long> starTaskIds) {
    this.starTaskIds = starTaskIds;
  }


  public StardeliveryTaskListV30Filtering starTaskName(String starTaskName) {
    
    this.starTaskName = starTaskName;
    return this;
  }

   /**
   * 任务名称过滤，长度1-50个字符（两个英文字符占1个字，该字段采取模糊查询的方式）
   * @return starTaskName
  **/
  @javax.annotation.Nullable
  public String getStarTaskName() {
    return starTaskName;
  }


  public void setStarTaskName(String starTaskName) {
    this.starTaskName = starTaskName;
  }


  public StardeliveryTaskListV30Filtering starTaskSource(StardeliveryTaskListV30FilteringStarTaskSource starTaskSource) {
    
    this.starTaskSource = starTaskSource;
    return this;
  }

   /**
   * Get starTaskSource
   * @return starTaskSource
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskListV30FilteringStarTaskSource getStarTaskSource() {
    return starTaskSource;
  }


  public void setStarTaskSource(StardeliveryTaskListV30FilteringStarTaskSource starTaskSource) {
    this.starTaskSource = starTaskSource;
  }


  public StardeliveryTaskListV30Filtering starTaskStatus(StardeliveryTaskListV30FilteringStarTaskStatus starTaskStatus) {
    
    this.starTaskStatus = starTaskStatus;
    return this;
  }

   /**
   * Get starTaskStatus
   * @return starTaskStatus
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskListV30FilteringStarTaskStatus getStarTaskStatus() {
    return starTaskStatus;
  }


  public void setStarTaskStatus(StardeliveryTaskListV30FilteringStarTaskStatus starTaskStatus) {
    this.starTaskStatus = starTaskStatus;
  }


  public StardeliveryTaskListV30Filtering taskModifyEndTime(String taskModifyEndTime) {
    
    this.taskModifyEndTime = taskModifyEndTime;
    return this;
  }

   /**
   * 任务更新时间，结束时间，格式YYYY-MM-DD hh:mm:ss
   * @return taskModifyEndTime
  **/
  @javax.annotation.Nullable
  public String getTaskModifyEndTime() {
    return taskModifyEndTime;
  }


  public void setTaskModifyEndTime(String taskModifyEndTime) {
    this.taskModifyEndTime = taskModifyEndTime;
  }


  public StardeliveryTaskListV30Filtering taskModifyStartTime(String taskModifyStartTime) {
    
    this.taskModifyStartTime = taskModifyStartTime;
    return this;
  }

   /**
   * 任务更新时间，起始时间，格式YYYY-MM-DD hh:mm:ss
   * @return taskModifyStartTime
  **/
  @javax.annotation.Nullable
  public String getTaskModifyStartTime() {
    return taskModifyStartTime;
  }


  public void setTaskModifyStartTime(String taskModifyStartTime) {
    this.taskModifyStartTime = taskModifyStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskListV30Filtering stardeliveryTaskListV30Filtering = (StardeliveryTaskListV30Filtering) o;
    return Objects.equals(this.starTaskIds, stardeliveryTaskListV30Filtering.starTaskIds) &&
        Objects.equals(this.starTaskName, stardeliveryTaskListV30Filtering.starTaskName) &&
        Objects.equals(this.starTaskSource, stardeliveryTaskListV30Filtering.starTaskSource) &&
        Objects.equals(this.starTaskStatus, stardeliveryTaskListV30Filtering.starTaskStatus) &&
        Objects.equals(this.taskModifyEndTime, stardeliveryTaskListV30Filtering.taskModifyEndTime) &&
        Objects.equals(this.taskModifyStartTime, stardeliveryTaskListV30Filtering.taskModifyStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starTaskIds, starTaskName, starTaskSource, starTaskStatus, taskModifyEndTime, taskModifyStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskListV30Filtering {\n");
    sb.append("    starTaskIds: ").append(toIndentedString(starTaskIds)).append("\n");
    sb.append("    starTaskName: ").append(toIndentedString(starTaskName)).append("\n");
    sb.append("    starTaskSource: ").append(toIndentedString(starTaskSource)).append("\n");
    sb.append("    starTaskStatus: ").append(toIndentedString(starTaskStatus)).append("\n");
    sb.append("    taskModifyEndTime: ").append(toIndentedString(taskModifyEndTime)).append("\n");
    sb.append("    taskModifyStartTime: ").append(toIndentedString(taskModifyStartTime)).append("\n");
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
    openapiFields.add("star_task_ids");
    openapiFields.add("star_task_name");
    openapiFields.add("star_task_source");
    openapiFields.add("star_task_status");
    openapiFields.add("task_modify_end_time");
    openapiFields.add("task_modify_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskListV30Filtering>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskListV30Filtering
  */
  public static StardeliveryTaskListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskListV30Filtering.class);
  }

 /**
  * Convert an instance of StardeliveryTaskListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

