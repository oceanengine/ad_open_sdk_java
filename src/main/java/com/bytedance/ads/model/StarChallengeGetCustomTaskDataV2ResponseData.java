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
import com.bytedance.ads.model.StarChallengeGetCustomTaskDataV2ResponseDataItemListInner;
import com.bytedance.ads.model.StarChallengeGetCustomTaskDataV2ResponseDataPageInfo;
import com.bytedance.ads.model.StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StarChallengeGetCustomTaskDataV2ResponseData {
  public static final String SERIALIZED_NAME_ITEM_LIST = "item_list";
  @SerializedName(SERIALIZED_NAME_ITEM_LIST)
  private List<StarChallengeGetCustomTaskDataV2ResponseDataItemListInner> itemList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private StarChallengeGetCustomTaskDataV2ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_TASK_INFO = "task_info";
  @SerializedName(SERIALIZED_NAME_TASK_INFO)
  private StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo taskInfo = null;

  public StarChallengeGetCustomTaskDataV2ResponseData() {
  }

  public StarChallengeGetCustomTaskDataV2ResponseData itemList(List<StarChallengeGetCustomTaskDataV2ResponseDataItemListInner> itemList) {
    
    this.itemList = itemList;
    return this;
  }

  public StarChallengeGetCustomTaskDataV2ResponseData addItemListItem(StarChallengeGetCustomTaskDataV2ResponseDataItemListInner itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * 作品数据
   * @return itemList
  **/
  @javax.annotation.Nullable
  public List<StarChallengeGetCustomTaskDataV2ResponseDataItemListInner> getItemList() {
    return itemList;
  }


  public void setItemList(List<StarChallengeGetCustomTaskDataV2ResponseDataItemListInner> itemList) {
    this.itemList = itemList;
  }


  public StarChallengeGetCustomTaskDataV2ResponseData pageInfo(StarChallengeGetCustomTaskDataV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeGetCustomTaskDataV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(StarChallengeGetCustomTaskDataV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public StarChallengeGetCustomTaskDataV2ResponseData taskInfo(StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo taskInfo) {
    
    this.taskInfo = taskInfo;
    return this;
  }

   /**
   * Get taskInfo
   * @return taskInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo getTaskInfo() {
    return taskInfo;
  }


  public void setTaskInfo(StarChallengeGetCustomTaskDataV2ResponseDataTaskInfo taskInfo) {
    this.taskInfo = taskInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeGetCustomTaskDataV2ResponseData starChallengeGetCustomTaskDataV2ResponseData = (StarChallengeGetCustomTaskDataV2ResponseData) o;
    return Objects.equals(this.itemList, starChallengeGetCustomTaskDataV2ResponseData.itemList) &&
        Objects.equals(this.pageInfo, starChallengeGetCustomTaskDataV2ResponseData.pageInfo) &&
        Objects.equals(this.taskInfo, starChallengeGetCustomTaskDataV2ResponseData.taskInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemList, pageInfo, taskInfo);
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
    sb.append("class StarChallengeGetCustomTaskDataV2ResponseData {\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
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
    openapiFields.add("item_list");
    openapiFields.add("page_info");
    openapiFields.add("task_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeGetCustomTaskDataV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeGetCustomTaskDataV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeGetCustomTaskDataV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeGetCustomTaskDataV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarChallengeGetCustomTaskDataV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeGetCustomTaskDataV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeGetCustomTaskDataV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeGetCustomTaskDataV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarChallengeGetCustomTaskDataV2ResponseData
  */
  public static StarChallengeGetCustomTaskDataV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeGetCustomTaskDataV2ResponseData.class);
  }

 /**
  * Convert an instance of StarChallengeGetCustomTaskDataV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

