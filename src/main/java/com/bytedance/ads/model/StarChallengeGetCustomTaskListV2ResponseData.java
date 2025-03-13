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
import com.bytedance.ads.model.StarChallengeGetCustomTaskListV2ResponseDataPageInfo;
import com.bytedance.ads.model.StarChallengeGetCustomTaskListV2ResponseDataTaskListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarChallengeGetCustomTaskListV2ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private StarChallengeGetCustomTaskListV2ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_TASK_LIST = "task_list";
  @SerializedName(SERIALIZED_NAME_TASK_LIST)
  private List<StarChallengeGetCustomTaskListV2ResponseDataTaskListInner> taskList = null;

  public StarChallengeGetCustomTaskListV2ResponseData() {
  }

  public StarChallengeGetCustomTaskListV2ResponseData pageInfo(StarChallengeGetCustomTaskListV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeGetCustomTaskListV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(StarChallengeGetCustomTaskListV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public StarChallengeGetCustomTaskListV2ResponseData taskList(List<StarChallengeGetCustomTaskListV2ResponseDataTaskListInner> taskList) {
    
    this.taskList = taskList;
    return this;
  }

  public StarChallengeGetCustomTaskListV2ResponseData addTaskListItem(StarChallengeGetCustomTaskListV2ResponseDataTaskListInner taskListItem) {
    if (this.taskList == null) {
      this.taskList = new ArrayList<>();
    }
    this.taskList.add(taskListItem);
    return this;
  }

   /**
   * 任务列表
   * @return taskList
  **/
  @javax.annotation.Nullable
  public List<StarChallengeGetCustomTaskListV2ResponseDataTaskListInner> getTaskList() {
    return taskList;
  }


  public void setTaskList(List<StarChallengeGetCustomTaskListV2ResponseDataTaskListInner> taskList) {
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
    StarChallengeGetCustomTaskListV2ResponseData starChallengeGetCustomTaskListV2ResponseData = (StarChallengeGetCustomTaskListV2ResponseData) o;
    return Objects.equals(this.pageInfo, starChallengeGetCustomTaskListV2ResponseData.pageInfo) &&
        Objects.equals(this.taskList, starChallengeGetCustomTaskListV2ResponseData.taskList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, taskList);
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
    sb.append("class StarChallengeGetCustomTaskListV2ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("task_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeGetCustomTaskListV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeGetCustomTaskListV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeGetCustomTaskListV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeGetCustomTaskListV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeGetCustomTaskListV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarChallengeGetCustomTaskListV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeGetCustomTaskListV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeGetCustomTaskListV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeGetCustomTaskListV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarChallengeGetCustomTaskListV2ResponseData
  */
  public static StarChallengeGetCustomTaskListV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeGetCustomTaskListV2ResponseData.class);
  }

 /**
  * Convert an instance of StarChallengeGetCustomTaskListV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

