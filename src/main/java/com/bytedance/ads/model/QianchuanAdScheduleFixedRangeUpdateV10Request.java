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
 * QianchuanAdScheduleFixedRangeUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanAdScheduleFixedRangeUpdateV10Request {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_SCHEDULE_FIXED_RANGE = "schedule_fixed_range";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FIXED_RANGE)
  private Long scheduleFixedRange = null;

  public QianchuanAdScheduleFixedRangeUpdateV10Request() {
  }

  public QianchuanAdScheduleFixedRangeUpdateV10Request adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanAdScheduleFixedRangeUpdateV10Request addAdIdsItem(Long adIdsItem) {
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


  public QianchuanAdScheduleFixedRangeUpdateV10Request advertiserId(Long advertiserId) {
    
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


  public QianchuanAdScheduleFixedRangeUpdateV10Request scheduleFixedRange(Long scheduleFixedRange) {
    
    this.scheduleFixedRange = scheduleFixedRange;
    return this;
  }

   /**
   * 
   * minimum: 1800
   * maximum: 86400
   * @return scheduleFixedRange
  **/
  @javax.annotation.Nonnull
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
    QianchuanAdScheduleFixedRangeUpdateV10Request qianchuanAdScheduleFixedRangeUpdateV10Request = (QianchuanAdScheduleFixedRangeUpdateV10Request) o;
    return Objects.equals(this.adIds, qianchuanAdScheduleFixedRangeUpdateV10Request.adIds) &&
        Objects.equals(this.advertiserId, qianchuanAdScheduleFixedRangeUpdateV10Request.advertiserId) &&
        Objects.equals(this.scheduleFixedRange, qianchuanAdScheduleFixedRangeUpdateV10Request.scheduleFixedRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, advertiserId, scheduleFixedRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdScheduleFixedRangeUpdateV10Request {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
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
    openapiFields.add("schedule_fixed_range");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_ids");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("schedule_fixed_range");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdScheduleFixedRangeUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdScheduleFixedRangeUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdScheduleFixedRangeUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdScheduleFixedRangeUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdScheduleFixedRangeUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAdScheduleFixedRangeUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdScheduleFixedRangeUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdScheduleFixedRangeUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdScheduleFixedRangeUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdScheduleFixedRangeUpdateV10Request
  */
  public static QianchuanAdScheduleFixedRangeUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdScheduleFixedRangeUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAdScheduleFixedRangeUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

