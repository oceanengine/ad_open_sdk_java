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
 * DouplusOrderCloseV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class DouplusOrderCloseV30Request {
  public static final String SERIALIZED_NAME_AWEME_SEC_UID = "aweme_sec_uid";
  @SerializedName(SERIALIZED_NAME_AWEME_SEC_UID)
  private String awemeSecUid = null;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public static final String SERIALIZED_NAME_TASK_IDS = "task_ids";
  @SerializedName(SERIALIZED_NAME_TASK_IDS)
  private List<Long> taskIds = null;

  public DouplusOrderCloseV30Request() {
  }

  public DouplusOrderCloseV30Request awemeSecUid(String awemeSecUid) {
    
    this.awemeSecUid = awemeSecUid;
    return this;
  }

   /**
   * 
   * @return awemeSecUid
  **/
  @javax.annotation.Nonnull
  public String getAwemeSecUid() {
    return awemeSecUid;
  }


  public void setAwemeSecUid(String awemeSecUid) {
    this.awemeSecUid = awemeSecUid;
  }


  public DouplusOrderCloseV30Request orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public DouplusOrderCloseV30Request addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 需要关停的订单ID列表，最多10
   * @return orderIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  public DouplusOrderCloseV30Request taskIds(List<Long> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public DouplusOrderCloseV30Request addTaskIdsItem(Long taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * 需要关停的task_id列表，最多10
   * @return taskIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTaskIds() {
    return taskIds;
  }


  public void setTaskIds(List<Long> taskIds) {
    this.taskIds = taskIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderCloseV30Request douplusOrderCloseV30Request = (DouplusOrderCloseV30Request) o;
    return Objects.equals(this.awemeSecUid, douplusOrderCloseV30Request.awemeSecUid) &&
        Objects.equals(this.orderIds, douplusOrderCloseV30Request.orderIds) &&
        Objects.equals(this.taskIds, douplusOrderCloseV30Request.taskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeSecUid, orderIds, taskIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderCloseV30Request {\n");
    sb.append("    awemeSecUid: ").append(toIndentedString(awemeSecUid)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
    openapiFields.add("aweme_sec_uid");
    openapiFields.add("order_ids");
    openapiFields.add("task_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aweme_sec_uid");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderCloseV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderCloseV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderCloseV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderCloseV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderCloseV30Request>() {
           @Override
           public void write(JsonWriter out, DouplusOrderCloseV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderCloseV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderCloseV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderCloseV30Request
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderCloseV30Request
  */
  public static DouplusOrderCloseV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderCloseV30Request.class);
  }

 /**
  * Convert an instance of DouplusOrderCloseV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

