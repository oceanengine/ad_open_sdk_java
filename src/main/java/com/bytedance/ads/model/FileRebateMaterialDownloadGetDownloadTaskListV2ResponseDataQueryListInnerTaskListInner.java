/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private String taskId = null;

  public FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner() {
  }

  public FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 任务创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 任务ID
   * @return taskId
  **/
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
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
    FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner fileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner = (FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner) o;
    return Objects.equals(this.createTime, fileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner.createTime) &&
        Objects.equals(this.taskId, fileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner.taskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, taskId);
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
    sb.append("class FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner>() {
           @Override
           public void write(JsonWriter out, FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner
  * @throws IOException if the JSON string is invalid with respect to FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner
  */
  public static FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner.class);
  }

 /**
  * Convert an instance of FileRebateMaterialDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

