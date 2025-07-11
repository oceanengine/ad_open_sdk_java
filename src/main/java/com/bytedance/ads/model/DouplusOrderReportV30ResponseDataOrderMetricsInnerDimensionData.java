/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_IS_FANS = "is_fans";
  @SerializedName(SERIALIZED_NAME_IS_FANS)
  private Boolean isFans = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private Long roomId = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData() {
  }

  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData isFans(Boolean isFans) {
    
    this.isFans = isFans;
    return this;
  }

   /**
   * 
   * @return isFans
  **/
  @javax.annotation.Nullable
  public Boolean getIsFans() {
    return isFans;
  }


  public void setIsFans(Boolean isFans) {
    this.isFans = isFans;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData roomId(Long roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * 
   * @return roomId
  **/
  @javax.annotation.Nullable
  public Long getRoomId() {
    return roomId;
  }


  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData taskId(Long taskId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData = (DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData) o;
    return Objects.equals(this.adId, douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.adId) &&
        Objects.equals(this.advertiserId, douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.advertiserId) &&
        Objects.equals(this.isFans, douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.isFans) &&
        Objects.equals(this.itemId, douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.itemId) &&
        Objects.equals(this.orderId, douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.orderId) &&
        Objects.equals(this.roomId, douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.roomId) &&
        Objects.equals(this.taskId, douplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.taskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, isFans, itemId, orderId, roomId, taskId);
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
    sb.append("class DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    isFans: ").append(toIndentedString(isFans)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("is_fans");
    openapiFields.add("item_id");
    openapiFields.add("order_id");
    openapiFields.add("room_id");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData>() {
           @Override
           public void write(JsonWriter out, DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData
  */
  public static DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData.class);
  }

 /**
  * Convert an instance of DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

