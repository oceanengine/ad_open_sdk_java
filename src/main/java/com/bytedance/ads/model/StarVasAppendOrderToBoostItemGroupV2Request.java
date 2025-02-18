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
 * StarVasAppendOrderToBoostItemGroupV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarVasAppendOrderToBoostItemGroupV2Request {
  public static final String SERIALIZED_NAME_BOOST_AMOUNT = "boost_amount";
  @SerializedName(SERIALIZED_NAME_BOOST_AMOUNT)
  private Long boostAmount = null;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public StarVasAppendOrderToBoostItemGroupV2Request() {
  }

  public StarVasAppendOrderToBoostItemGroupV2Request boostAmount(Long boostAmount) {
    
    this.boostAmount = boostAmount;
    return this;
  }

   /**
   * 助推金额，单位元。若为null，则不追加
   * @return boostAmount
  **/
  @javax.annotation.Nullable
  public Long getBoostAmount() {
    return boostAmount;
  }


  public void setBoostAmount(Long boostAmount) {
    this.boostAmount = boostAmount;
  }


  public StarVasAppendOrderToBoostItemGroupV2Request orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public StarVasAppendOrderToBoostItemGroupV2Request addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 关联指派单。若为null，则不追加
   * @return orderIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  public StarVasAppendOrderToBoostItemGroupV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户ID
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }


  public StarVasAppendOrderToBoostItemGroupV2Request taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 助推组ID
   * @return taskId
  **/
  @javax.annotation.Nonnull
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
    StarVasAppendOrderToBoostItemGroupV2Request starVasAppendOrderToBoostItemGroupV2Request = (StarVasAppendOrderToBoostItemGroupV2Request) o;
    return Objects.equals(this.boostAmount, starVasAppendOrderToBoostItemGroupV2Request.boostAmount) &&
        Objects.equals(this.orderIds, starVasAppendOrderToBoostItemGroupV2Request.orderIds) &&
        Objects.equals(this.starId, starVasAppendOrderToBoostItemGroupV2Request.starId) &&
        Objects.equals(this.taskId, starVasAppendOrderToBoostItemGroupV2Request.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boostAmount, orderIds, starId, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasAppendOrderToBoostItemGroupV2Request {\n");
    sb.append("    boostAmount: ").append(toIndentedString(boostAmount)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("boost_amount");
    openapiFields.add("order_ids");
    openapiFields.add("star_id");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("star_id");
    openapiRequiredFields.add("task_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasAppendOrderToBoostItemGroupV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasAppendOrderToBoostItemGroupV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasAppendOrderToBoostItemGroupV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasAppendOrderToBoostItemGroupV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasAppendOrderToBoostItemGroupV2Request>() {
           @Override
           public void write(JsonWriter out, StarVasAppendOrderToBoostItemGroupV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasAppendOrderToBoostItemGroupV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasAppendOrderToBoostItemGroupV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasAppendOrderToBoostItemGroupV2Request
  * @throws IOException if the JSON string is invalid with respect to StarVasAppendOrderToBoostItemGroupV2Request
  */
  public static StarVasAppendOrderToBoostItemGroupV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasAppendOrderToBoostItemGroupV2Request.class);
  }

 /**
  * Convert an instance of StarVasAppendOrderToBoostItemGroupV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

