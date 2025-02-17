/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * StarTaskListByProjectV2ResponseDataProjectTasksInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class StarTaskListByProjectV2ResponseDataProjectTasksInner {
  public static final String SERIALIZED_NAME_IS_FROM_API = "is_from_api";
  @SerializedName(SERIALIZED_NAME_IS_FROM_API)
  private Boolean isFromApi = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_TASK_CATEGORY = "task_category";
  @SerializedName(SERIALIZED_NAME_TASK_CATEGORY)
  private Long taskCategory = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public StarTaskListByProjectV2ResponseDataProjectTasksInner() {
  }

  public StarTaskListByProjectV2ResponseDataProjectTasksInner isFromApi(Boolean isFromApi) {
    
    this.isFromApi = isFromApi;
    return this;
  }

   /**
   * 
   * @return isFromApi
  **/
  @javax.annotation.Nullable
  public Boolean getIsFromApi() {
    return isFromApi;
  }


  public void setIsFromApi(Boolean isFromApi) {
    this.isFromApi = isFromApi;
  }


  public StarTaskListByProjectV2ResponseDataProjectTasksInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public StarTaskListByProjectV2ResponseDataProjectTasksInner taskCategory(Long taskCategory) {
    
    this.taskCategory = taskCategory;
    return this;
  }

   /**
   * 
   * @return taskCategory
  **/
  @javax.annotation.Nullable
  public Long getTaskCategory() {
    return taskCategory;
  }


  public void setTaskCategory(Long taskCategory) {
    this.taskCategory = taskCategory;
  }


  public StarTaskListByProjectV2ResponseDataProjectTasksInner taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 
   * @return taskId
  **/
  @javax.annotation.Nullable
  public Long getTaskId() {
    return taskId;
  }


  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarTaskListByProjectV2ResponseDataProjectTasksInner starTaskListByProjectV2ResponseDataProjectTasksInner = (StarTaskListByProjectV2ResponseDataProjectTasksInner) o;
    return Objects.equals(this.isFromApi, starTaskListByProjectV2ResponseDataProjectTasksInner.isFromApi) &&
        Objects.equals(this.projectId, starTaskListByProjectV2ResponseDataProjectTasksInner.projectId) &&
        Objects.equals(this.taskCategory, starTaskListByProjectV2ResponseDataProjectTasksInner.taskCategory) &&
        Objects.equals(this.taskId, starTaskListByProjectV2ResponseDataProjectTasksInner.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFromApi, projectId, taskCategory, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarTaskListByProjectV2ResponseDataProjectTasksInner {\n");
    sb.append("    isFromApi: ").append(toIndentedString(isFromApi)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    taskCategory: ").append(toIndentedString(taskCategory)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
    openapiFields.add("is_from_api");
    openapiFields.add("project_id");
    openapiFields.add("task_category");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("is_from_api");
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("task_category");
    openapiRequiredFields.add("task_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarTaskListByProjectV2ResponseDataProjectTasksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarTaskListByProjectV2ResponseDataProjectTasksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarTaskListByProjectV2ResponseDataProjectTasksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarTaskListByProjectV2ResponseDataProjectTasksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarTaskListByProjectV2ResponseDataProjectTasksInner>() {
           @Override
           public void write(JsonWriter out, StarTaskListByProjectV2ResponseDataProjectTasksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarTaskListByProjectV2ResponseDataProjectTasksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarTaskListByProjectV2ResponseDataProjectTasksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarTaskListByProjectV2ResponseDataProjectTasksInner
  * @throws IOException if the JSON string is invalid with respect to StarTaskListByProjectV2ResponseDataProjectTasksInner
  */
  public static StarTaskListByProjectV2ResponseDataProjectTasksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarTaskListByProjectV2ResponseDataProjectTasksInner.class);
  }

 /**
  * Convert an instance of StarTaskListByProjectV2ResponseDataProjectTasksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

