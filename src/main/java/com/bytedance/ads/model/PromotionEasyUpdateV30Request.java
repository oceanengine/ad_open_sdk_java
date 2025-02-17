/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionEasyUpdateV30RequestPromotionMaterials;
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
 * PromotionEasyUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class PromotionEasyUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DELIVERY_DURATION = "delivery_duration";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DURATION)
  private Long deliveryDuration = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_MATERIALS = "promotion_materials";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MATERIALS)
  private PromotionEasyUpdateV30RequestPromotionMaterials promotionMaterials = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public PromotionEasyUpdateV30Request() {
  }

  public PromotionEasyUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public PromotionEasyUpdateV30Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public PromotionEasyUpdateV30Request cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 目标转化出价
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public PromotionEasyUpdateV30Request deliveryDuration(Long deliveryDuration) {
    
    this.deliveryDuration = deliveryDuration;
    return this;
  }

   /**
   * 投放天数
   * @return deliveryDuration
  **/
  @javax.annotation.Nullable
  public Long getDeliveryDuration() {
    return deliveryDuration;
  }


  public void setDeliveryDuration(Long deliveryDuration) {
    this.deliveryDuration = deliveryDuration;
  }


  public PromotionEasyUpdateV30Request projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public PromotionEasyUpdateV30Request promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nonnull
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public PromotionEasyUpdateV30Request promotionMaterials(PromotionEasyUpdateV30RequestPromotionMaterials promotionMaterials) {
    
    this.promotionMaterials = promotionMaterials;
    return this;
  }

   /**
   * Get promotionMaterials
   * @return promotionMaterials
  **/
  @javax.annotation.Nullable
  public PromotionEasyUpdateV30RequestPromotionMaterials getPromotionMaterials() {
    return promotionMaterials;
  }


  public void setPromotionMaterials(PromotionEasyUpdateV30RequestPromotionMaterials promotionMaterials) {
    this.promotionMaterials = promotionMaterials;
  }


  public PromotionEasyUpdateV30Request scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 投放时段
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionEasyUpdateV30Request promotionEasyUpdateV30Request = (PromotionEasyUpdateV30Request) o;
    return Objects.equals(this.advertiserId, promotionEasyUpdateV30Request.advertiserId) &&
        Objects.equals(this.budget, promotionEasyUpdateV30Request.budget) &&
        Objects.equals(this.cpaBid, promotionEasyUpdateV30Request.cpaBid) &&
        Objects.equals(this.deliveryDuration, promotionEasyUpdateV30Request.deliveryDuration) &&
        Objects.equals(this.projectId, promotionEasyUpdateV30Request.projectId) &&
        Objects.equals(this.promotionId, promotionEasyUpdateV30Request.promotionId) &&
        Objects.equals(this.promotionMaterials, promotionEasyUpdateV30Request.promotionMaterials) &&
        Objects.equals(this.scheduleTime, promotionEasyUpdateV30Request.scheduleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, cpaBid, deliveryDuration, projectId, promotionId, promotionMaterials, scheduleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionEasyUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deliveryDuration: ").append(toIndentedString(deliveryDuration)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionMaterials: ").append(toIndentedString(promotionMaterials)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("cpa_bid");
    openapiFields.add("delivery_duration");
    openapiFields.add("project_id");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_materials");
    openapiFields.add("schedule_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("promotion_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionEasyUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionEasyUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionEasyUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionEasyUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionEasyUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, PromotionEasyUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionEasyUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionEasyUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionEasyUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to PromotionEasyUpdateV30Request
  */
  public static PromotionEasyUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionEasyUpdateV30Request.class);
  }

 /**
  * Convert an instance of PromotionEasyUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

