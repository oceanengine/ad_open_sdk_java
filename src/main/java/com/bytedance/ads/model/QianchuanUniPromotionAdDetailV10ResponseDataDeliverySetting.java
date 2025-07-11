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
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepBidType;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingExternalAction;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingLiveScheduleType;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingPricingType;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingQcpxMode;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataDeliverySettingVideoScheduleType;
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
public class QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_DAILY_DELIVERY_TIME = "daily_delivery_time";
  @SerializedName(SERIALIZED_NAME_DAILY_DELIVERY_TIME)
  private Double dailyDeliveryTime = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_LIVE_SCHEDULE_TYPE = "live_schedule_type";
  @SerializedName(SERIALIZED_NAME_LIVE_SCHEDULE_TYPE)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingLiveScheduleType liveScheduleType = null;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingPricingType pricingType = null;

  public static final String SERIALIZED_NAME_QCPX_MODE = "qcpx_mode";
  @SerializedName(SERIALIZED_NAME_QCPX_MODE)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingQcpxMode qcpxMode = null;

  public static final String SERIALIZED_NAME_ROI2_GOAL = "roi2_goal";
  @SerializedName(SERIALIZED_NAME_ROI2_GOAL)
  private Double roi2Goal = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE = "video_schedule_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE)
  private QianchuanUniPromotionAdDetailV10DataDeliverySettingVideoScheduleType videoScheduleType = null;

  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting() {
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting budget(Double budget) {
    
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


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting budgetMode(QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(QianchuanUniPromotionAdDetailV10DataDeliverySettingBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting dailyDeliveryTime(Double dailyDeliveryTime) {
    
    this.dailyDeliveryTime = dailyDeliveryTime;
    return this;
  }

   /**
   * 
   * @return dailyDeliveryTime
  **/
  @javax.annotation.Nullable
  public Double getDailyDeliveryTime() {
    return dailyDeliveryTime;
  }


  public void setDailyDeliveryTime(Double dailyDeliveryTime) {
    this.dailyDeliveryTime = dailyDeliveryTime;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting deepBidType(QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting deepExternalAction(QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(QianchuanUniPromotionAdDetailV10DataDeliverySettingDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting externalAction(QianchuanUniPromotionAdDetailV10DataDeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanUniPromotionAdDetailV10DataDeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting liveScheduleType(QianchuanUniPromotionAdDetailV10DataDeliverySettingLiveScheduleType liveScheduleType) {
    
    this.liveScheduleType = liveScheduleType;
    return this;
  }

   /**
   * Get liveScheduleType
   * @return liveScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingLiveScheduleType getLiveScheduleType() {
    return liveScheduleType;
  }


  public void setLiveScheduleType(QianchuanUniPromotionAdDetailV10DataDeliverySettingLiveScheduleType liveScheduleType) {
    this.liveScheduleType = liveScheduleType;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting pricingType(QianchuanUniPromotionAdDetailV10DataDeliverySettingPricingType pricingType) {
    
    this.pricingType = pricingType;
    return this;
  }

   /**
   * Get pricingType
   * @return pricingType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingPricingType getPricingType() {
    return pricingType;
  }


  public void setPricingType(QianchuanUniPromotionAdDetailV10DataDeliverySettingPricingType pricingType) {
    this.pricingType = pricingType;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting qcpxMode(QianchuanUniPromotionAdDetailV10DataDeliverySettingQcpxMode qcpxMode) {
    
    this.qcpxMode = qcpxMode;
    return this;
  }

   /**
   * Get qcpxMode
   * @return qcpxMode
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingQcpxMode getQcpxMode() {
    return qcpxMode;
  }


  public void setQcpxMode(QianchuanUniPromotionAdDetailV10DataDeliverySettingQcpxMode qcpxMode) {
    this.qcpxMode = qcpxMode;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting roi2Goal(Double roi2Goal) {
    
    this.roi2Goal = roi2Goal;
    return this;
  }

   /**
   * 
   * @return roi2Goal
  **/
  @javax.annotation.Nullable
  public Double getRoi2Goal() {
    return roi2Goal;
  }


  public void setRoi2Goal(Double roi2Goal) {
    this.roi2Goal = roi2Goal;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting smartBidType(QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanUniPromotionAdDetailV10DataDeliverySettingSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting videoScheduleType(QianchuanUniPromotionAdDetailV10DataDeliverySettingVideoScheduleType videoScheduleType) {
    
    this.videoScheduleType = videoScheduleType;
    return this;
  }

   /**
   * Get videoScheduleType
   * @return videoScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataDeliverySettingVideoScheduleType getVideoScheduleType() {
    return videoScheduleType;
  }


  public void setVideoScheduleType(QianchuanUniPromotionAdDetailV10DataDeliverySettingVideoScheduleType videoScheduleType) {
    this.videoScheduleType = videoScheduleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting = (QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting) o;
    return Objects.equals(this.budget, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.budget) &&
        Objects.equals(this.budgetMode, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.budgetMode) &&
        Objects.equals(this.dailyDeliveryTime, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.dailyDeliveryTime) &&
        Objects.equals(this.deepBidType, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.deepBidType) &&
        Objects.equals(this.deepExternalAction, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.deepExternalAction) &&
        Objects.equals(this.endTime, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.endTime) &&
        Objects.equals(this.externalAction, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.externalAction) &&
        Objects.equals(this.liveScheduleType, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.liveScheduleType) &&
        Objects.equals(this.pricingType, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.pricingType) &&
        Objects.equals(this.qcpxMode, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.qcpxMode) &&
        Objects.equals(this.roi2Goal, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.roi2Goal) &&
        Objects.equals(this.smartBidType, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.smartBidType) &&
        Objects.equals(this.startTime, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.startTime) &&
        Objects.equals(this.videoScheduleType, qianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.videoScheduleType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetMode, dailyDeliveryTime, deepBidType, deepExternalAction, endTime, externalAction, liveScheduleType, pricingType, qcpxMode, roi2Goal, smartBidType, startTime, videoScheduleType);
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
    sb.append("class QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    dailyDeliveryTime: ").append(toIndentedString(dailyDeliveryTime)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    liveScheduleType: ").append(toIndentedString(liveScheduleType)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    qcpxMode: ").append(toIndentedString(qcpxMode)).append("\n");
    sb.append("    roi2Goal: ").append(toIndentedString(roi2Goal)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    videoScheduleType: ").append(toIndentedString(videoScheduleType)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("daily_delivery_time");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_external_action");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("live_schedule_type");
    openapiFields.add("pricing_type");
    openapiFields.add("qcpx_mode");
    openapiFields.add("roi2_goal");
    openapiFields.add("smart_bid_type");
    openapiFields.add("start_time");
    openapiFields.add("video_schedule_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting
  */
  public static QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

