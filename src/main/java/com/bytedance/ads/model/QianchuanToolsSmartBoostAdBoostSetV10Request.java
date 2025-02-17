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
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostSetV10OptType;
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
 * QianchuanToolsSmartBoostAdBoostSetV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QianchuanToolsSmartBoostAdBoostSetV10Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_OPT_TYPE = "opt_type";
  @SerializedName(SERIALIZED_NAME_OPT_TYPE)
  private QianchuanToolsSmartBoostAdBoostSetV10OptType optType = null;

  public static final String SERIALIZED_NAME_RAISE_DURATION = "raise_duration";
  @SerializedName(SERIALIZED_NAME_RAISE_DURATION)
  private Double raiseDuration = null;

  public static final String SERIALIZED_NAME_RAISE_TIME = "raise_time";
  @SerializedName(SERIALIZED_NAME_RAISE_TIME)
  private String raiseTime = null;

  public QianchuanToolsSmartBoostAdBoostSetV10Request() {
  }

  public QianchuanToolsSmartBoostAdBoostSetV10Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告计划ID
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanToolsSmartBoostAdBoostSetV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 千川广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanToolsSmartBoostAdBoostSetV10Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 起量预算，单位元，小数点后两位 注意：不得超过计划日预算/总预算 注意：当opt_type&#x3D;START_RAISE、SUBSCRIBE_RAISE时必填
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public QianchuanToolsSmartBoostAdBoostSetV10Request optType(QianchuanToolsSmartBoostAdBoostSetV10OptType optType) {
    
    this.optType = optType;
    return this;
  }

   /**
   * Get optType
   * @return optType
  **/
  @javax.annotation.Nonnull
  public QianchuanToolsSmartBoostAdBoostSetV10OptType getOptType() {
    return optType;
  }


  public void setOptType(QianchuanToolsSmartBoostAdBoostSetV10OptType optType) {
    this.optType = optType;
  }


  public QianchuanToolsSmartBoostAdBoostSetV10Request raiseDuration(Double raiseDuration) {
    
    this.raiseDuration = raiseDuration;
    return this;
  }

   /**
   * 起量时长，单位小时，小数点后1位，范围0.5-6小时 注意：当opt_type&#x3D;START_RAISE、SUBSCRIBE_RAISE时必填
   * @return raiseDuration
  **/
  @javax.annotation.Nullable
  public Double getRaiseDuration() {
    return raiseDuration;
  }


  public void setRaiseDuration(Double raiseDuration) {
    this.raiseDuration = raiseDuration;
  }


  public QianchuanToolsSmartBoostAdBoostSetV10Request raiseTime(String raiseTime) {
    
    this.raiseTime = raiseTime;
    return this;
  }

   /**
   * 起量时间，仅支持当前时间往后的时间 注意：当opt_type&#x3D;START_RAISE/SUBSCRIBE_RAISE必填
   * @return raiseTime
  **/
  @javax.annotation.Nullable
  public String getRaiseTime() {
    return raiseTime;
  }


  public void setRaiseTime(String raiseTime) {
    this.raiseTime = raiseTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsSmartBoostAdBoostSetV10Request qianchuanToolsSmartBoostAdBoostSetV10Request = (QianchuanToolsSmartBoostAdBoostSetV10Request) o;
    return Objects.equals(this.adId, qianchuanToolsSmartBoostAdBoostSetV10Request.adId) &&
        Objects.equals(this.advertiserId, qianchuanToolsSmartBoostAdBoostSetV10Request.advertiserId) &&
        Objects.equals(this.budget, qianchuanToolsSmartBoostAdBoostSetV10Request.budget) &&
        Objects.equals(this.optType, qianchuanToolsSmartBoostAdBoostSetV10Request.optType) &&
        Objects.equals(this.raiseDuration, qianchuanToolsSmartBoostAdBoostSetV10Request.raiseDuration) &&
        Objects.equals(this.raiseTime, qianchuanToolsSmartBoostAdBoostSetV10Request.raiseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, budget, optType, raiseDuration, raiseTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanToolsSmartBoostAdBoostSetV10Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
    sb.append("    raiseDuration: ").append(toIndentedString(raiseDuration)).append("\n");
    sb.append("    raiseTime: ").append(toIndentedString(raiseTime)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("opt_type");
    openapiFields.add("raise_duration");
    openapiFields.add("raise_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("opt_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsSmartBoostAdBoostSetV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsSmartBoostAdBoostSetV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsSmartBoostAdBoostSetV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsSmartBoostAdBoostSetV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsSmartBoostAdBoostSetV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsSmartBoostAdBoostSetV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsSmartBoostAdBoostSetV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsSmartBoostAdBoostSetV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsSmartBoostAdBoostSetV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsSmartBoostAdBoostSetV10Request
  */
  public static QianchuanToolsSmartBoostAdBoostSetV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsSmartBoostAdBoostSetV10Request.class);
  }

 /**
  * Convert an instance of QianchuanToolsSmartBoostAdBoostSetV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

