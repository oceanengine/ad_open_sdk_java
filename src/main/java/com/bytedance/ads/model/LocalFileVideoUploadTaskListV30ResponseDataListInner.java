/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalFileVideoUploadTaskListV30DataListStatus;
import com.bytedance.ads.model.LocalFileVideoUploadTaskListV30ResponseDataListInnerVideoInfo;
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
 * LocalFileVideoUploadTaskListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class LocalFileVideoUploadTaskListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
  @SerializedName(SERIALIZED_NAME_ERROR_MSG)
  private String errorMsg = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LocalFileVideoUploadTaskListV30DataListStatus status = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private LocalFileVideoUploadTaskListV30ResponseDataListInnerVideoInfo videoInfo = null;

  public LocalFileVideoUploadTaskListV30ResponseDataListInner() {
  }

  public LocalFileVideoUploadTaskListV30ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public LocalFileVideoUploadTaskListV30ResponseDataListInner errorMsg(String errorMsg) {
    
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * 当任务失败后，会返回失败信息
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  public String getErrorMsg() {
    return errorMsg;
  }


  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  public LocalFileVideoUploadTaskListV30ResponseDataListInner status(LocalFileVideoUploadTaskListV30DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public LocalFileVideoUploadTaskListV30DataListStatus getStatus() {
    return status;
  }


  public void setStatus(LocalFileVideoUploadTaskListV30DataListStatus status) {
    this.status = status;
  }


  public LocalFileVideoUploadTaskListV30ResponseDataListInner taskId(Long taskId) {
    
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


  public LocalFileVideoUploadTaskListV30ResponseDataListInner videoInfo(LocalFileVideoUploadTaskListV30ResponseDataListInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public LocalFileVideoUploadTaskListV30ResponseDataListInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(LocalFileVideoUploadTaskListV30ResponseDataListInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalFileVideoUploadTaskListV30ResponseDataListInner localFileVideoUploadTaskListV30ResponseDataListInner = (LocalFileVideoUploadTaskListV30ResponseDataListInner) o;
    return Objects.equals(this.createTime, localFileVideoUploadTaskListV30ResponseDataListInner.createTime) &&
        Objects.equals(this.errorMsg, localFileVideoUploadTaskListV30ResponseDataListInner.errorMsg) &&
        Objects.equals(this.status, localFileVideoUploadTaskListV30ResponseDataListInner.status) &&
        Objects.equals(this.taskId, localFileVideoUploadTaskListV30ResponseDataListInner.taskId) &&
        Objects.equals(this.videoInfo, localFileVideoUploadTaskListV30ResponseDataListInner.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, errorMsg, status, taskId, videoInfo);
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
    sb.append("class LocalFileVideoUploadTaskListV30ResponseDataListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("error_msg");
    openapiFields.add("status");
    openapiFields.add("task_id");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoUploadTaskListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoUploadTaskListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoUploadTaskListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoUploadTaskListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoUploadTaskListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoUploadTaskListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoUploadTaskListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoUploadTaskListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoUploadTaskListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoUploadTaskListV30ResponseDataListInner
  */
  public static LocalFileVideoUploadTaskListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoUploadTaskListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of LocalFileVideoUploadTaskListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

