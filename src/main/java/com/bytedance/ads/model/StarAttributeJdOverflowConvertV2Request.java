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
 * StarAttributeJdOverflowConvertV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarAttributeJdOverflowConvertV2Request {
  public static final String SERIALIZED_NAME_CONVERT_TIME = "convert_time";
  @SerializedName(SERIALIZED_NAME_CONVERT_TIME)
  private Long convertTime = null;

  public static final String SERIALIZED_NAME_DEVICE_ID = "device_id";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId = null;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private Long deviceType = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public StarAttributeJdOverflowConvertV2Request() {
  }

  public StarAttributeJdOverflowConvertV2Request convertTime(Long convertTime) {
    
    this.convertTime = convertTime;
    return this;
  }

   /**
   * 发生转化行为的秒级时间戳
   * @return convertTime
  **/
  @javax.annotation.Nonnull
  public Long getConvertTime() {
    return convertTime;
  }


  public void setConvertTime(Long convertTime) {
    this.convertTime = convertTime;
  }


  public StarAttributeJdOverflowConvertV2Request deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备号sha256
   * @return deviceId
  **/
  @javax.annotation.Nonnull
  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public StarAttributeJdOverflowConvertV2Request deviceType(Long deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * 设备号类型
   * @return deviceType
  **/
  @javax.annotation.Nonnull
  public Long getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(Long deviceType) {
    this.deviceType = deviceType;
  }


  public StarAttributeJdOverflowConvertV2Request itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nonnull
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarAttributeJdOverflowConvertV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }


  public StarAttributeJdOverflowConvertV2Request taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 
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
    StarAttributeJdOverflowConvertV2Request starAttributeJdOverflowConvertV2Request = (StarAttributeJdOverflowConvertV2Request) o;
    return Objects.equals(this.convertTime, starAttributeJdOverflowConvertV2Request.convertTime) &&
        Objects.equals(this.deviceId, starAttributeJdOverflowConvertV2Request.deviceId) &&
        Objects.equals(this.deviceType, starAttributeJdOverflowConvertV2Request.deviceType) &&
        Objects.equals(this.itemId, starAttributeJdOverflowConvertV2Request.itemId) &&
        Objects.equals(this.starId, starAttributeJdOverflowConvertV2Request.starId) &&
        Objects.equals(this.taskId, starAttributeJdOverflowConvertV2Request.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertTime, deviceId, deviceType, itemId, starId, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarAttributeJdOverflowConvertV2Request {\n");
    sb.append("    convertTime: ").append(toIndentedString(convertTime)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
    openapiFields.add("convert_time");
    openapiFields.add("device_id");
    openapiFields.add("device_type");
    openapiFields.add("item_id");
    openapiFields.add("star_id");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("convert_time");
    openapiRequiredFields.add("device_id");
    openapiRequiredFields.add("device_type");
    openapiRequiredFields.add("item_id");
    openapiRequiredFields.add("star_id");
    openapiRequiredFields.add("task_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarAttributeJdOverflowConvertV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarAttributeJdOverflowConvertV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarAttributeJdOverflowConvertV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarAttributeJdOverflowConvertV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarAttributeJdOverflowConvertV2Request>() {
           @Override
           public void write(JsonWriter out, StarAttributeJdOverflowConvertV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarAttributeJdOverflowConvertV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarAttributeJdOverflowConvertV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarAttributeJdOverflowConvertV2Request
  * @throws IOException if the JSON string is invalid with respect to StarAttributeJdOverflowConvertV2Request
  */
  public static StarAttributeJdOverflowConvertV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarAttributeJdOverflowConvertV2Request.class);
  }

 /**
  * Convert an instance of StarAttributeJdOverflowConvertV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

