/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskAuthorDetailV30ResponseDataPageInfo;
import com.bytedance.ads.model.StardeliveryTaskAuthorDetailV30ResponseDataTaskAuthorsInfoInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StardeliveryTaskAuthorDetailV30ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private StardeliveryTaskAuthorDetailV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_TASK_AUTHORS_INFO = "task_authors_info";
  @SerializedName(SERIALIZED_NAME_TASK_AUTHORS_INFO)
  private List<StardeliveryTaskAuthorDetailV30ResponseDataTaskAuthorsInfoInner> taskAuthorsInfo = null;

  public StardeliveryTaskAuthorDetailV30ResponseData() {
  }

  public StardeliveryTaskAuthorDetailV30ResponseData pageInfo(StardeliveryTaskAuthorDetailV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskAuthorDetailV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(StardeliveryTaskAuthorDetailV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public StardeliveryTaskAuthorDetailV30ResponseData taskAuthorsInfo(List<StardeliveryTaskAuthorDetailV30ResponseDataTaskAuthorsInfoInner> taskAuthorsInfo) {
    
    this.taskAuthorsInfo = taskAuthorsInfo;
    return this;
  }

  public StardeliveryTaskAuthorDetailV30ResponseData addTaskAuthorsInfoItem(StardeliveryTaskAuthorDetailV30ResponseDataTaskAuthorsInfoInner taskAuthorsInfoItem) {
    if (this.taskAuthorsInfo == null) {
      this.taskAuthorsInfo = new ArrayList<>();
    }
    this.taskAuthorsInfo.add(taskAuthorsInfoItem);
    return this;
  }

   /**
   * 
   * @return taskAuthorsInfo
  **/
  @javax.annotation.Nullable
  public List<StardeliveryTaskAuthorDetailV30ResponseDataTaskAuthorsInfoInner> getTaskAuthorsInfo() {
    return taskAuthorsInfo;
  }


  public void setTaskAuthorsInfo(List<StardeliveryTaskAuthorDetailV30ResponseDataTaskAuthorsInfoInner> taskAuthorsInfo) {
    this.taskAuthorsInfo = taskAuthorsInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskAuthorDetailV30ResponseData stardeliveryTaskAuthorDetailV30ResponseData = (StardeliveryTaskAuthorDetailV30ResponseData) o;
    return Objects.equals(this.pageInfo, stardeliveryTaskAuthorDetailV30ResponseData.pageInfo) &&
        Objects.equals(this.taskAuthorsInfo, stardeliveryTaskAuthorDetailV30ResponseData.taskAuthorsInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, taskAuthorsInfo);
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
    sb.append("class StardeliveryTaskAuthorDetailV30ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    taskAuthorsInfo: ").append(toIndentedString(taskAuthorsInfo)).append("\n");
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
    openapiFields.add("task_authors_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("task_authors_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskAuthorDetailV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskAuthorDetailV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskAuthorDetailV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskAuthorDetailV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskAuthorDetailV30ResponseData>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskAuthorDetailV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskAuthorDetailV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskAuthorDetailV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskAuthorDetailV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskAuthorDetailV30ResponseData
  */
  public static StardeliveryTaskAuthorDetailV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskAuthorDetailV30ResponseData.class);
  }

 /**
  * Convert an instance of StardeliveryTaskAuthorDetailV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

