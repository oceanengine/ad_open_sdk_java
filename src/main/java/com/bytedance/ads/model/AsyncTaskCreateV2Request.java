/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AsyncTaskCreateV2RequestTaskParams;
import com.bytedance.ads.model.AsyncTaskCreateV2TaskType;
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
 * AsyncTaskCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class AsyncTaskCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public static final String SERIALIZED_NAME_TASK_PARAMS = "task_params";
  @SerializedName(SERIALIZED_NAME_TASK_PARAMS)
  private AsyncTaskCreateV2RequestTaskParams taskParams = null;

  public static final String SERIALIZED_NAME_TASK_TYPE = "task_type";
  @SerializedName(SERIALIZED_NAME_TASK_TYPE)
  private AsyncTaskCreateV2TaskType taskType = null;

  public AsyncTaskCreateV2Request() {
  }

  public AsyncTaskCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AsyncTaskCreateV2Request force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * 
   * @return force
  **/
  @javax.annotation.Nullable
  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  public AsyncTaskCreateV2Request taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * 
   * @return taskName
  **/
  @javax.annotation.Nonnull
  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public AsyncTaskCreateV2Request taskParams(AsyncTaskCreateV2RequestTaskParams taskParams) {
    
    this.taskParams = taskParams;
    return this;
  }

   /**
   * Get taskParams
   * @return taskParams
  **/
  @javax.annotation.Nonnull
  public AsyncTaskCreateV2RequestTaskParams getTaskParams() {
    return taskParams;
  }


  public void setTaskParams(AsyncTaskCreateV2RequestTaskParams taskParams) {
    this.taskParams = taskParams;
  }


  public AsyncTaskCreateV2Request taskType(AsyncTaskCreateV2TaskType taskType) {
    
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @javax.annotation.Nonnull
  public AsyncTaskCreateV2TaskType getTaskType() {
    return taskType;
  }


  public void setTaskType(AsyncTaskCreateV2TaskType taskType) {
    this.taskType = taskType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncTaskCreateV2Request asyncTaskCreateV2Request = (AsyncTaskCreateV2Request) o;
    return Objects.equals(this.advertiserId, asyncTaskCreateV2Request.advertiserId) &&
        Objects.equals(this.force, asyncTaskCreateV2Request.force) &&
        Objects.equals(this.taskName, asyncTaskCreateV2Request.taskName) &&
        Objects.equals(this.taskParams, asyncTaskCreateV2Request.taskParams) &&
        Objects.equals(this.taskType, asyncTaskCreateV2Request.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, force, taskName, taskParams, taskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncTaskCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    taskParams: ").append(toIndentedString(taskParams)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
    openapiFields.add("force");
    openapiFields.add("task_name");
    openapiFields.add("task_params");
    openapiFields.add("task_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("task_name");
    openapiRequiredFields.add("task_params");
    openapiRequiredFields.add("task_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncTaskCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncTaskCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncTaskCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncTaskCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncTaskCreateV2Request>() {
           @Override
           public void write(JsonWriter out, AsyncTaskCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncTaskCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncTaskCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncTaskCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to AsyncTaskCreateV2Request
  */
  public static AsyncTaskCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncTaskCreateV2Request.class);
  }

 /**
  * Convert an instance of AsyncTaskCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

