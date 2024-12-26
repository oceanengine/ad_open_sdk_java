/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner {
  public static final String SERIALIZED_NAME_QUERY_ID = "query_id";
  @SerializedName(SERIALIZED_NAME_QUERY_ID)
  private String queryId = null;

  public static final String SERIALIZED_NAME_QUERY_STATUS = "query_status";
  @SerializedName(SERIALIZED_NAME_QUERY_STATUS)
  private Long queryStatus = null;

  public static final String SERIALIZED_NAME_TASK_LIST = "task_list";
  @SerializedName(SERIALIZED_NAME_TASK_LIST)
  private List<FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner> taskList = null;

  public FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner() {
  }

  public FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner queryId(String queryId) {
    
    this.queryId = queryId;
    return this;
  }

   /**
   * 查询ID
   * @return queryId
  **/
  @javax.annotation.Nullable
  public String getQueryId() {
    return queryId;
  }


  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }


  public FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner queryStatus(Long queryStatus) {
    
    this.queryStatus = queryStatus;
    return this;
  }

   /**
   * 查询状态 1- 初始化，2-运行中，3-成功，4-失败
   * @return queryStatus
  **/
  @javax.annotation.Nullable
  public Long getQueryStatus() {
    return queryStatus;
  }


  public void setQueryStatus(Long queryStatus) {
    this.queryStatus = queryStatus;
  }


  public FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner taskList(List<FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner> taskList) {
    
    this.taskList = taskList;
    return this;
  }

  public FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner addTaskListItem(FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner taskListItem) {
    if (this.taskList == null) {
      this.taskList = new ArrayList<>();
    }
    this.taskList.add(taskListItem);
    return this;
  }

   /**
   * 任务ID列表
   * @return taskList
  **/
  @javax.annotation.Nullable
  public List<FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner> getTaskList() {
    return taskList;
  }


  public void setTaskList(List<FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInnerTaskListInner> taskList) {
    this.taskList = taskList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner fileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner = (FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner) o;
    return Objects.equals(this.queryId, fileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner.queryId) &&
        Objects.equals(this.queryStatus, fileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner.queryStatus) &&
        Objects.equals(this.taskList, fileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner.taskList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, queryStatus, taskList);
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
    sb.append("class FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner {\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    queryStatus: ").append(toIndentedString(queryStatus)).append("\n");
    sb.append("    taskList: ").append(toIndentedString(taskList)).append("\n");
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
    openapiFields.add("query_id");
    openapiFields.add("query_status");
    openapiFields.add("task_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner>() {
           @Override
           public void write(JsonWriter out, FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner
  * @throws IOException if the JSON string is invalid with respect to FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner
  */
  public static FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner.class);
  }

 /**
  * Convert an instance of FileRebateCommonDownloadGetDownloadTaskListV2ResponseDataQueryListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

