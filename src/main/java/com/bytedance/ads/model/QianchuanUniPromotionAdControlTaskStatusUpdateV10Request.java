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
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskStatusUpdateV10OptType;
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
 * QianchuanUniPromotionAdControlTaskStatusUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdControlTaskStatusUpdateV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_OPT_TYPE = "opt_type";
  @SerializedName(SERIALIZED_NAME_OPT_TYPE)
  private QianchuanUniPromotionAdControlTaskStatusUpdateV10OptType optType = null;

  public static final String SERIALIZED_NAME_TASK_IDS = "task_ids";
  @SerializedName(SERIALIZED_NAME_TASK_IDS)
  private List<Long> taskIds = null;

  public QianchuanUniPromotionAdControlTaskStatusUpdateV10Request() {
  }

  public QianchuanUniPromotionAdControlTaskStatusUpdateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 千川广告账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanUniPromotionAdControlTaskStatusUpdateV10Request optType(QianchuanUniPromotionAdControlTaskStatusUpdateV10OptType optType) {
    
    this.optType = optType;
    return this;
  }

   /**
   * Get optType
   * @return optType
  **/
  @javax.annotation.Nonnull
  public QianchuanUniPromotionAdControlTaskStatusUpdateV10OptType getOptType() {
    return optType;
  }


  public void setOptType(QianchuanUniPromotionAdControlTaskStatusUpdateV10OptType optType) {
    this.optType = optType;
  }


  public QianchuanUniPromotionAdControlTaskStatusUpdateV10Request taskIds(List<Long> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public QianchuanUniPromotionAdControlTaskStatusUpdateV10Request addTaskIdsItem(Long taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * 一键起量计划ID
   * @return taskIds
  **/
  @javax.annotation.Nonnull
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
    QianchuanUniPromotionAdControlTaskStatusUpdateV10Request qianchuanUniPromotionAdControlTaskStatusUpdateV10Request = (QianchuanUniPromotionAdControlTaskStatusUpdateV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanUniPromotionAdControlTaskStatusUpdateV10Request.advertiserId) &&
        Objects.equals(this.optType, qianchuanUniPromotionAdControlTaskStatusUpdateV10Request.optType) &&
        Objects.equals(this.taskIds, qianchuanUniPromotionAdControlTaskStatusUpdateV10Request.taskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, optType, taskIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniPromotionAdControlTaskStatusUpdateV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("opt_type");
    openapiFields.add("task_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("opt_type");
    openapiRequiredFields.add("task_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdControlTaskStatusUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdControlTaskStatusUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdControlTaskStatusUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdControlTaskStatusUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdControlTaskStatusUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdControlTaskStatusUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdControlTaskStatusUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdControlTaskStatusUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdControlTaskStatusUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdControlTaskStatusUpdateV10Request
  */
  public static QianchuanUniPromotionAdControlTaskStatusUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdControlTaskStatusUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdControlTaskStatusUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

