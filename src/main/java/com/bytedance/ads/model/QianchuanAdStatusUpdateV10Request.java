/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdStatusUpdateV10OptStatus;
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
 * QianchuanAdStatusUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QianchuanAdStatusUpdateV10Request {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private QianchuanAdStatusUpdateV10OptStatus optStatus = null;

  public static final String SERIALIZED_NAME_REVIVE_BUDGET = "revive_budget";
  @SerializedName(SERIALIZED_NAME_REVIVE_BUDGET)
  private Double reviveBudget = null;

  public static final String SERIALIZED_NAME_SCHEDULE_FIXED_RANGE = "schedule_fixed_range";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FIXED_RANGE)
  private Long scheduleFixedRange = null;

  public QianchuanAdStatusUpdateV10Request() {
  }

  public QianchuanAdStatusUpdateV10Request adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanAdStatusUpdateV10Request addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public QianchuanAdStatusUpdateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAdStatusUpdateV10Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * minimum: 300.0
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public QianchuanAdStatusUpdateV10Request optStatus(QianchuanAdStatusUpdateV10OptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nonnull
  public QianchuanAdStatusUpdateV10OptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(QianchuanAdStatusUpdateV10OptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public QianchuanAdStatusUpdateV10Request reviveBudget(Double reviveBudget) {
    
    this.reviveBudget = reviveBudget;
    return this;
  }

   /**
   * 
   * minimum: 300.0
   * @return reviveBudget
  **/
  @javax.annotation.Nullable
  public Double getReviveBudget() {
    return reviveBudget;
  }


  public void setReviveBudget(Double reviveBudget) {
    this.reviveBudget = reviveBudget;
  }


  public QianchuanAdStatusUpdateV10Request scheduleFixedRange(Long scheduleFixedRange) {
    
    this.scheduleFixedRange = scheduleFixedRange;
    return this;
  }

   /**
   * 
   * minimum: 1800
   * maximum: 86400
   * @return scheduleFixedRange
  **/
  @javax.annotation.Nullable
  public Long getScheduleFixedRange() {
    return scheduleFixedRange;
  }


  public void setScheduleFixedRange(Long scheduleFixedRange) {
    this.scheduleFixedRange = scheduleFixedRange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdStatusUpdateV10Request qianchuanAdStatusUpdateV10Request = (QianchuanAdStatusUpdateV10Request) o;
    return Objects.equals(this.adIds, qianchuanAdStatusUpdateV10Request.adIds) &&
        Objects.equals(this.advertiserId, qianchuanAdStatusUpdateV10Request.advertiserId) &&
        Objects.equals(this.budget, qianchuanAdStatusUpdateV10Request.budget) &&
        Objects.equals(this.optStatus, qianchuanAdStatusUpdateV10Request.optStatus) &&
        Objects.equals(this.reviveBudget, qianchuanAdStatusUpdateV10Request.reviveBudget) &&
        Objects.equals(this.scheduleFixedRange, qianchuanAdStatusUpdateV10Request.scheduleFixedRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, advertiserId, budget, optStatus, reviveBudget, scheduleFixedRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdStatusUpdateV10Request {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    reviveBudget: ").append(toIndentedString(reviveBudget)).append("\n");
    sb.append("    scheduleFixedRange: ").append(toIndentedString(scheduleFixedRange)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("advertiser_id");
    openapiFields.add("budget");
    openapiFields.add("opt_status");
    openapiFields.add("revive_budget");
    openapiFields.add("schedule_fixed_range");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_ids");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("opt_status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdStatusUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdStatusUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdStatusUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdStatusUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdStatusUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAdStatusUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdStatusUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdStatusUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdStatusUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdStatusUpdateV10Request
  */
  public static QianchuanAdStatusUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdStatusUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAdStatusUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

