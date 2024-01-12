/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10DeliverySettingBidMode;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10DeliverySettingBidType;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10DeliverySettingExternalAction;
import com.bytedance.ads.model.QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode;
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
 * 投放设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class QianchuanAwemeOrderCreateV10RequestDeliverySetting {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount = null;

  public static final String SERIALIZED_NAME_BID_MODE = "bid_mode";
  @SerializedName(SERIALIZED_NAME_BID_MODE)
  private QianchuanAwemeOrderCreateV10DeliverySettingBidMode bidMode = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private QianchuanAwemeOrderCreateV10DeliverySettingBidType bidType = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DELIVERY_TIME = "delivery_time";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIME)
  private Double deliveryTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAwemeOrderCreateV10DeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_LIVEROOM_HEAT_MODE = "liveroom_heat_mode";
  @SerializedName(SERIALIZED_NAME_LIVEROOM_HEAT_MODE)
  private QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode liveroomHeatMode = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public QianchuanAwemeOrderCreateV10RequestDeliverySetting() {
  }

  public QianchuanAwemeOrderCreateV10RequestDeliverySetting amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public QianchuanAwemeOrderCreateV10RequestDeliverySetting bidMode(QianchuanAwemeOrderCreateV10DeliverySettingBidMode bidMode) {
    
    this.bidMode = bidMode;
    return this;
  }

   /**
   * Get bidMode
   * @return bidMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeOrderCreateV10DeliverySettingBidMode getBidMode() {
    return bidMode;
  }


  public void setBidMode(QianchuanAwemeOrderCreateV10DeliverySettingBidMode bidMode) {
    this.bidMode = bidMode;
  }


  public QianchuanAwemeOrderCreateV10RequestDeliverySetting bidType(QianchuanAwemeOrderCreateV10DeliverySettingBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderCreateV10DeliverySettingBidType getBidType() {
    return bidType;
  }


  public void setBidType(QianchuanAwemeOrderCreateV10DeliverySettingBidType bidType) {
    this.bidType = bidType;
  }


  public QianchuanAwemeOrderCreateV10RequestDeliverySetting cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public QianchuanAwemeOrderCreateV10RequestDeliverySetting deliveryTime(Double deliveryTime) {
    
    this.deliveryTime = deliveryTime;
    return this;
  }

   /**
   * 
   * @return deliveryTime
  **/
  @javax.annotation.Nonnull
  public Double getDeliveryTime() {
    return deliveryTime;
  }


  public void setDeliveryTime(Double deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public QianchuanAwemeOrderCreateV10RequestDeliverySetting externalAction(QianchuanAwemeOrderCreateV10DeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeOrderCreateV10DeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAwemeOrderCreateV10DeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAwemeOrderCreateV10RequestDeliverySetting liveroomHeatMode(QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode liveroomHeatMode) {
    
    this.liveroomHeatMode = liveroomHeatMode;
    return this;
  }

   /**
   * Get liveroomHeatMode
   * @return liveroomHeatMode
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode getLiveroomHeatMode() {
    return liveroomHeatMode;
  }


  public void setLiveroomHeatMode(QianchuanAwemeOrderCreateV10DeliverySettingLiveroomHeatMode liveroomHeatMode) {
    this.liveroomHeatMode = liveroomHeatMode;
  }


  public QianchuanAwemeOrderCreateV10RequestDeliverySetting roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderCreateV10RequestDeliverySetting qianchuanAwemeOrderCreateV10RequestDeliverySetting = (QianchuanAwemeOrderCreateV10RequestDeliverySetting) o;
    return Objects.equals(this.amount, qianchuanAwemeOrderCreateV10RequestDeliverySetting.amount) &&
        Objects.equals(this.bidMode, qianchuanAwemeOrderCreateV10RequestDeliverySetting.bidMode) &&
        Objects.equals(this.bidType, qianchuanAwemeOrderCreateV10RequestDeliverySetting.bidType) &&
        Objects.equals(this.cpaBid, qianchuanAwemeOrderCreateV10RequestDeliverySetting.cpaBid) &&
        Objects.equals(this.deliveryTime, qianchuanAwemeOrderCreateV10RequestDeliverySetting.deliveryTime) &&
        Objects.equals(this.externalAction, qianchuanAwemeOrderCreateV10RequestDeliverySetting.externalAction) &&
        Objects.equals(this.liveroomHeatMode, qianchuanAwemeOrderCreateV10RequestDeliverySetting.liveroomHeatMode) &&
        Objects.equals(this.roiGoal, qianchuanAwemeOrderCreateV10RequestDeliverySetting.roiGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bidMode, bidType, cpaBid, deliveryTime, externalAction, liveroomHeatMode, roiGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeOrderCreateV10RequestDeliverySetting {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bidMode: ").append(toIndentedString(bidMode)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    liveroomHeatMode: ").append(toIndentedString(liveroomHeatMode)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("bid_mode");
    openapiFields.add("bid_type");
    openapiFields.add("cpa_bid");
    openapiFields.add("delivery_time");
    openapiFields.add("external_action");
    openapiFields.add("liveroom_heat_mode");
    openapiFields.add("roi_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("bid_mode");
    openapiRequiredFields.add("delivery_time");
    openapiRequiredFields.add("external_action");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderCreateV10RequestDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderCreateV10RequestDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderCreateV10RequestDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderCreateV10RequestDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderCreateV10RequestDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderCreateV10RequestDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderCreateV10RequestDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderCreateV10RequestDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderCreateV10RequestDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderCreateV10RequestDeliverySetting
  */
  public static QianchuanAwemeOrderCreateV10RequestDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderCreateV10RequestDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderCreateV10RequestDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

