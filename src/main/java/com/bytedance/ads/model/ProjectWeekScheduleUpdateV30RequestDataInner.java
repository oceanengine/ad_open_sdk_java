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
import com.bytedance.ads.model.ProjectWeekScheduleUpdateV30DataScheduleScene;
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
 * ProjectWeekScheduleUpdateV30RequestDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ProjectWeekScheduleUpdateV30RequestDataInner {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_SCHEDULE_SCENE = "schedule_scene";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_SCENE)
  private ProjectWeekScheduleUpdateV30DataScheduleScene scheduleScene = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public ProjectWeekScheduleUpdateV30RequestDataInner() {
  }

  public ProjectWeekScheduleUpdateV30RequestDataInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public ProjectWeekScheduleUpdateV30RequestDataInner scheduleScene(ProjectWeekScheduleUpdateV30DataScheduleScene scheduleScene) {
    
    this.scheduleScene = scheduleScene;
    return this;
  }

   /**
   * Get scheduleScene
   * @return scheduleScene
  **/
  @javax.annotation.Nonnull
  public ProjectWeekScheduleUpdateV30DataScheduleScene getScheduleScene() {
    return scheduleScene;
  }


  public void setScheduleScene(ProjectWeekScheduleUpdateV30DataScheduleScene scheduleScene) {
    this.scheduleScene = scheduleScene;
  }


  public ProjectWeekScheduleUpdateV30RequestDataInner scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 更新后的投放时段
   * @return scheduleTime
  **/
  @javax.annotation.Nonnull
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectWeekScheduleUpdateV30RequestDataInner projectWeekScheduleUpdateV30RequestDataInner = (ProjectWeekScheduleUpdateV30RequestDataInner) o;
    return Objects.equals(this.projectId, projectWeekScheduleUpdateV30RequestDataInner.projectId) &&
        Objects.equals(this.scheduleScene, projectWeekScheduleUpdateV30RequestDataInner.scheduleScene) &&
        Objects.equals(this.scheduleTime, projectWeekScheduleUpdateV30RequestDataInner.scheduleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, scheduleScene, scheduleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectWeekScheduleUpdateV30RequestDataInner {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    scheduleScene: ").append(toIndentedString(scheduleScene)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
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
    openapiFields.add("project_id");
    openapiFields.add("schedule_scene");
    openapiFields.add("schedule_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("schedule_scene");
    openapiRequiredFields.add("schedule_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectWeekScheduleUpdateV30RequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectWeekScheduleUpdateV30RequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectWeekScheduleUpdateV30RequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectWeekScheduleUpdateV30RequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectWeekScheduleUpdateV30RequestDataInner>() {
           @Override
           public void write(JsonWriter out, ProjectWeekScheduleUpdateV30RequestDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectWeekScheduleUpdateV30RequestDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectWeekScheduleUpdateV30RequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectWeekScheduleUpdateV30RequestDataInner
  * @throws IOException if the JSON string is invalid with respect to ProjectWeekScheduleUpdateV30RequestDataInner
  */
  public static ProjectWeekScheduleUpdateV30RequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectWeekScheduleUpdateV30RequestDataInner.class);
  }

 /**
  * Convert an instance of ProjectWeekScheduleUpdateV30RequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

