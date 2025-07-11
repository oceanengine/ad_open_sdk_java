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
import com.bytedance.ads.model.LocalProjectCreateV30AdType;
import com.bytedance.ads.model.LocalProjectCreateV30AutoUpdatePois;
import com.bytedance.ads.model.LocalProjectCreateV30BidType;
import com.bytedance.ads.model.LocalProjectCreateV30BudgetMode;
import com.bytedance.ads.model.LocalProjectCreateV30DeliveryGoal;
import com.bytedance.ads.model.LocalProjectCreateV30DeliveryPoiMode;
import com.bytedance.ads.model.LocalProjectCreateV30ExternalAction;
import com.bytedance.ads.model.LocalProjectCreateV30LocalDeliveryScene;
import com.bytedance.ads.model.LocalProjectCreateV30MarketingGoal;
import com.bytedance.ads.model.LocalProjectCreateV30PeakHolidays;
import com.bytedance.ads.model.LocalProjectCreateV30PeakWeekDays;
import com.bytedance.ads.model.LocalProjectCreateV30RequestAudience;
import com.bytedance.ads.model.LocalProjectCreateV30ScheduleType;
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
 * LocalProjectCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class LocalProjectCreateV30Request {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private LocalProjectCreateV30AdType adType = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private LocalProjectCreateV30RequestAudience audience = null;

  public static final String SERIALIZED_NAME_AUTO_UPDATE_POIS = "auto_update_pois";
  @SerializedName(SERIALIZED_NAME_AUTO_UPDATE_POIS)
  private LocalProjectCreateV30AutoUpdatePois autoUpdatePois = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Long bid = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private LocalProjectCreateV30BidType bidType = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private LocalProjectCreateV30BudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_DELIVERY_GOAL = "delivery_goal";
  @SerializedName(SERIALIZED_NAME_DELIVERY_GOAL)
  private LocalProjectCreateV30DeliveryGoal deliveryGoal = null;

  public static final String SERIALIZED_NAME_DELIVERY_POI_MODE = "delivery_poi_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_POI_MODE)
  private LocalProjectCreateV30DeliveryPoiMode deliveryPoiMode = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private LocalProjectCreateV30ExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_HIGH_BUDGET_RATE = "high_budget_rate";
  @SerializedName(SERIALIZED_NAME_HIGH_BUDGET_RATE)
  private Long highBudgetRate = null;

  public static final String SERIALIZED_NAME_IS_SET_PEAK_BUDGET = "is_set_peak_budget";
  @SerializedName(SERIALIZED_NAME_IS_SET_PEAK_BUDGET)
  private Boolean isSetPeakBudget = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_LOCAL_DELIVERY_SCENE = "local_delivery_scene";
  @SerializedName(SERIALIZED_NAME_LOCAL_DELIVERY_SCENE)
  private LocalProjectCreateV30LocalDeliveryScene localDeliveryScene = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private LocalProjectCreateV30MarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PEAK_HOLIDAYS = "peak_holidays";
  @SerializedName(SERIALIZED_NAME_PEAK_HOLIDAYS)
  private List<LocalProjectCreateV30PeakHolidays> peakHolidays = null;

  public static final String SERIALIZED_NAME_PEAK_WEEK_DAYS = "peak_week_days";
  @SerializedName(SERIALIZED_NAME_PEAK_WEEK_DAYS)
  private List<LocalProjectCreateV30PeakWeekDays> peakWeekDays = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PROMOTION_POI_IDS = "promotion_poi_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_POI_IDS)
  private List<Long> promotionPoiIds = null;

  public static final String SERIALIZED_NAME_SCHEDULE_FIXED_SECONDS = "schedule_fixed_seconds";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FIXED_SECONDS)
  private Long scheduleFixedSeconds = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private LocalProjectCreateV30ScheduleType scheduleType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public LocalProjectCreateV30Request() {
  }

  public LocalProjectCreateV30Request adType(LocalProjectCreateV30AdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nonnull
  public LocalProjectCreateV30AdType getAdType() {
    return adType;
  }


  public void setAdType(LocalProjectCreateV30AdType adType) {
    this.adType = adType;
  }


  public LocalProjectCreateV30Request audience(LocalProjectCreateV30RequestAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30RequestAudience getAudience() {
    return audience;
  }


  public void setAudience(LocalProjectCreateV30RequestAudience audience) {
    this.audience = audience;
  }


  public LocalProjectCreateV30Request autoUpdatePois(LocalProjectCreateV30AutoUpdatePois autoUpdatePois) {
    
    this.autoUpdatePois = autoUpdatePois;
    return this;
  }

   /**
   * Get autoUpdatePois
   * @return autoUpdatePois
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30AutoUpdatePois getAutoUpdatePois() {
    return autoUpdatePois;
  }


  public void setAutoUpdatePois(LocalProjectCreateV30AutoUpdatePois autoUpdatePois) {
    this.autoUpdatePois = autoUpdatePois;
  }


  public LocalProjectCreateV30Request awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 用于推广直播间的抖音号，可通过【获取本地推创编可用抖音号】接口获取 填写说明： 当marketing_goal&#x3D;&#x60;LIVE&#x60;时有效且必填
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public LocalProjectCreateV30Request bid(Long bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 出价（单位：分）
   * @return bid
  **/
  @javax.annotation.Nullable
  public Long getBid() {
    return bid;
  }


  public void setBid(Long bid) {
    this.bid = bid;
  }


  public LocalProjectCreateV30Request bidType(LocalProjectCreateV30BidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nonnull
  public LocalProjectCreateV30BidType getBidType() {
    return bidType;
  }


  public void setBidType(LocalProjectCreateV30BidType bidType) {
    this.bidType = bidType;
  }


  public LocalProjectCreateV30Request budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算（单位：分）
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public LocalProjectCreateV30Request budgetMode(LocalProjectCreateV30BudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nonnull
  public LocalProjectCreateV30BudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(LocalProjectCreateV30BudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public LocalProjectCreateV30Request deliveryGoal(LocalProjectCreateV30DeliveryGoal deliveryGoal) {
    
    this.deliveryGoal = deliveryGoal;
    return this;
  }

   /**
   * Get deliveryGoal
   * @return deliveryGoal
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30DeliveryGoal getDeliveryGoal() {
    return deliveryGoal;
  }


  public void setDeliveryGoal(LocalProjectCreateV30DeliveryGoal deliveryGoal) {
    this.deliveryGoal = deliveryGoal;
  }


  public LocalProjectCreateV30Request deliveryPoiMode(LocalProjectCreateV30DeliveryPoiMode deliveryPoiMode) {
    
    this.deliveryPoiMode = deliveryPoiMode;
    return this;
  }

   /**
   * Get deliveryPoiMode
   * @return deliveryPoiMode
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30DeliveryPoiMode getDeliveryPoiMode() {
    return deliveryPoiMode;
  }


  public void setDeliveryPoiMode(LocalProjectCreateV30DeliveryPoiMode deliveryPoiMode) {
    this.deliveryPoiMode = deliveryPoiMode;
  }


  public LocalProjectCreateV30Request endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束投放时间 注意：当schedule_type&#x3D;“START_TO_END”时支持填写该字段
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public LocalProjectCreateV30Request externalAction(LocalProjectCreateV30ExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30ExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(LocalProjectCreateV30ExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public LocalProjectCreateV30Request highBudgetRate(Long highBudgetRate) {
    
    this.highBudgetRate = highBudgetRate;
    return this;
  }

   /**
   * 高峰日预算上调比例（注意：该字段为百分比，例如：传“40”表示高峰日时预算上调“40%”）
   * minimum: 20
   * maximum: 200
   * @return highBudgetRate
  **/
  @javax.annotation.Nullable
  public Long getHighBudgetRate() {
    return highBudgetRate;
  }


  public void setHighBudgetRate(Long highBudgetRate) {
    this.highBudgetRate = highBudgetRate;
  }


  public LocalProjectCreateV30Request isSetPeakBudget(Boolean isSetPeakBudget) {
    
    this.isSetPeakBudget = isSetPeakBudget;
    return this;
  }

   /**
   * 高峰日预算设置 该字段为false时：高峰日（自然周、节假日）、高峰日预算上调比例 均不可填值
   * @return isSetPeakBudget
  **/
  @javax.annotation.Nullable
  public Boolean getIsSetPeakBudget() {
    return isSetPeakBudget;
  }


  public void setIsSetPeakBudget(Boolean isSetPeakBudget) {
    this.isSetPeakBudget = isSetPeakBudget;
  }


  public LocalProjectCreateV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 本地推广告账户ID
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalProjectCreateV30Request localDeliveryScene(LocalProjectCreateV30LocalDeliveryScene localDeliveryScene) {
    
    this.localDeliveryScene = localDeliveryScene;
    return this;
  }

   /**
   * Get localDeliveryScene
   * @return localDeliveryScene
  **/
  @javax.annotation.Nonnull
  public LocalProjectCreateV30LocalDeliveryScene getLocalDeliveryScene() {
    return localDeliveryScene;
  }


  public void setLocalDeliveryScene(LocalProjectCreateV30LocalDeliveryScene localDeliveryScene) {
    this.localDeliveryScene = localDeliveryScene;
  }


  public LocalProjectCreateV30Request marketingGoal(LocalProjectCreateV30MarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public LocalProjectCreateV30MarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(LocalProjectCreateV30MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public LocalProjectCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 项目名称，长度是1-50个字（两个英文字符占1个字）
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocalProjectCreateV30Request peakHolidays(List<LocalProjectCreateV30PeakHolidays> peakHolidays) {
    
    this.peakHolidays = peakHolidays;
    return this;
  }

  public LocalProjectCreateV30Request addPeakHolidaysItem(LocalProjectCreateV30PeakHolidays peakHolidaysItem) {
    if (this.peakHolidays == null) {
      this.peakHolidays = new ArrayList<>();
    }
    this.peakHolidays.add(peakHolidaysItem);
    return this;
  }

   /**
   * 高峰日-节假日
   * @return peakHolidays
  **/
  @javax.annotation.Nullable
  public List<LocalProjectCreateV30PeakHolidays> getPeakHolidays() {
    return peakHolidays;
  }


  public void setPeakHolidays(List<LocalProjectCreateV30PeakHolidays> peakHolidays) {
    this.peakHolidays = peakHolidays;
  }


  public LocalProjectCreateV30Request peakWeekDays(List<LocalProjectCreateV30PeakWeekDays> peakWeekDays) {
    
    this.peakWeekDays = peakWeekDays;
    return this;
  }

  public LocalProjectCreateV30Request addPeakWeekDaysItem(LocalProjectCreateV30PeakWeekDays peakWeekDaysItem) {
    if (this.peakWeekDays == null) {
      this.peakWeekDays = new ArrayList<>();
    }
    this.peakWeekDays.add(peakWeekDaysItem);
    return this;
  }

   /**
   * 高峰日-自然周
   * @return peakWeekDays
  **/
  @javax.annotation.Nullable
  public List<LocalProjectCreateV30PeakWeekDays> getPeakWeekDays() {
    return peakWeekDays;
  }


  public void setPeakWeekDays(List<LocalProjectCreateV30PeakWeekDays> peakWeekDays) {
    this.peakWeekDays = peakWeekDays;
  }


  public LocalProjectCreateV30Request productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 推广商品ID，可通过【获取可投商品列表】接口查询获取 填写说明： 当marketing_goal&#x3D;&#x60;VIDEO_AND_IMAGE&#x60; 且 delivery_goal&#x3D;&#x60;PRODUCT&#x60; 时有效且必填
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public LocalProjectCreateV30Request promotionPoiIds(List<Long> promotionPoiIds) {
    
    this.promotionPoiIds = promotionPoiIds;
    return this;
  }

  public LocalProjectCreateV30Request addPromotionPoiIdsItem(Long promotionPoiIdsItem) {
    if (this.promotionPoiIds == null) {
      this.promotionPoiIds = new ArrayList<>();
    }
    this.promotionPoiIds.add(promotionPoiIdsItem);
    return this;
  }

   /**
   * 推广门店ID列表  填写说明： 当delivery_goal&#x3D;&#x60;POI&#x60;且 delivery_poi_mode&#x3D;&#x60;CUSTOM&#x60; 投放指定门店时，有效且必填
   * @return promotionPoiIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionPoiIds() {
    return promotionPoiIds;
  }


  public void setPromotionPoiIds(List<Long> promotionPoiIds) {
    this.promotionPoiIds = promotionPoiIds;
  }


  public LocalProjectCreateV30Request scheduleFixedSeconds(Long scheduleFixedSeconds) {
    
    this.scheduleFixedSeconds = scheduleFixedSeconds;
    return this;
  }

   /**
   * 直播固定时长（单位：秒） 交易场景下的设置规则： 仅在营销场景设置为直播时可用
   * @return scheduleFixedSeconds
  **/
  @javax.annotation.Nullable
  public Long getScheduleFixedSeconds() {
    return scheduleFixedSeconds;
  }


  public void setScheduleFixedSeconds(Long scheduleFixedSeconds) {
    this.scheduleFixedSeconds = scheduleFixedSeconds;
  }


  public LocalProjectCreateV30Request scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public LocalProjectCreateV30Request scheduleType(LocalProjectCreateV30ScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nonnull
  public LocalProjectCreateV30ScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(LocalProjectCreateV30ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public LocalProjectCreateV30Request startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始投放时间 注意：当schedule_type&#x3D;“START_TO_END”时支持填写该字段
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectCreateV30Request localProjectCreateV30Request = (LocalProjectCreateV30Request) o;
    return Objects.equals(this.adType, localProjectCreateV30Request.adType) &&
        Objects.equals(this.audience, localProjectCreateV30Request.audience) &&
        Objects.equals(this.autoUpdatePois, localProjectCreateV30Request.autoUpdatePois) &&
        Objects.equals(this.awemeId, localProjectCreateV30Request.awemeId) &&
        Objects.equals(this.bid, localProjectCreateV30Request.bid) &&
        Objects.equals(this.bidType, localProjectCreateV30Request.bidType) &&
        Objects.equals(this.budget, localProjectCreateV30Request.budget) &&
        Objects.equals(this.budgetMode, localProjectCreateV30Request.budgetMode) &&
        Objects.equals(this.deliveryGoal, localProjectCreateV30Request.deliveryGoal) &&
        Objects.equals(this.deliveryPoiMode, localProjectCreateV30Request.deliveryPoiMode) &&
        Objects.equals(this.endTime, localProjectCreateV30Request.endTime) &&
        Objects.equals(this.externalAction, localProjectCreateV30Request.externalAction) &&
        Objects.equals(this.highBudgetRate, localProjectCreateV30Request.highBudgetRate) &&
        Objects.equals(this.isSetPeakBudget, localProjectCreateV30Request.isSetPeakBudget) &&
        Objects.equals(this.localAccountId, localProjectCreateV30Request.localAccountId) &&
        Objects.equals(this.localDeliveryScene, localProjectCreateV30Request.localDeliveryScene) &&
        Objects.equals(this.marketingGoal, localProjectCreateV30Request.marketingGoal) &&
        Objects.equals(this.name, localProjectCreateV30Request.name) &&
        Objects.equals(this.peakHolidays, localProjectCreateV30Request.peakHolidays) &&
        Objects.equals(this.peakWeekDays, localProjectCreateV30Request.peakWeekDays) &&
        Objects.equals(this.productId, localProjectCreateV30Request.productId) &&
        Objects.equals(this.promotionPoiIds, localProjectCreateV30Request.promotionPoiIds) &&
        Objects.equals(this.scheduleFixedSeconds, localProjectCreateV30Request.scheduleFixedSeconds) &&
        Objects.equals(this.scheduleTime, localProjectCreateV30Request.scheduleTime) &&
        Objects.equals(this.scheduleType, localProjectCreateV30Request.scheduleType) &&
        Objects.equals(this.startTime, localProjectCreateV30Request.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, audience, autoUpdatePois, awemeId, bid, bidType, budget, budgetMode, deliveryGoal, deliveryPoiMode, endTime, externalAction, highBudgetRate, isSetPeakBudget, localAccountId, localDeliveryScene, marketingGoal, name, peakHolidays, peakWeekDays, productId, promotionPoiIds, scheduleFixedSeconds, scheduleTime, scheduleType, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectCreateV30Request {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    autoUpdatePois: ").append(toIndentedString(autoUpdatePois)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    deliveryGoal: ").append(toIndentedString(deliveryGoal)).append("\n");
    sb.append("    deliveryPoiMode: ").append(toIndentedString(deliveryPoiMode)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    highBudgetRate: ").append(toIndentedString(highBudgetRate)).append("\n");
    sb.append("    isSetPeakBudget: ").append(toIndentedString(isSetPeakBudget)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    localDeliveryScene: ").append(toIndentedString(localDeliveryScene)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    peakHolidays: ").append(toIndentedString(peakHolidays)).append("\n");
    sb.append("    peakWeekDays: ").append(toIndentedString(peakWeekDays)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    promotionPoiIds: ").append(toIndentedString(promotionPoiIds)).append("\n");
    sb.append("    scheduleFixedSeconds: ").append(toIndentedString(scheduleFixedSeconds)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("ad_type");
    openapiFields.add("audience");
    openapiFields.add("auto_update_pois");
    openapiFields.add("aweme_id");
    openapiFields.add("bid");
    openapiFields.add("bid_type");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("delivery_goal");
    openapiFields.add("delivery_poi_mode");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("high_budget_rate");
    openapiFields.add("is_set_peak_budget");
    openapiFields.add("local_account_id");
    openapiFields.add("local_delivery_scene");
    openapiFields.add("marketing_goal");
    openapiFields.add("name");
    openapiFields.add("peak_holidays");
    openapiFields.add("peak_week_days");
    openapiFields.add("product_id");
    openapiFields.add("promotion_poi_ids");
    openapiFields.add("schedule_fixed_seconds");
    openapiFields.add("schedule_time");
    openapiFields.add("schedule_type");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_type");
    openapiRequiredFields.add("bid_type");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("budget_mode");
    openapiRequiredFields.add("local_account_id");
    openapiRequiredFields.add("local_delivery_scene");
    openapiRequiredFields.add("marketing_goal");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("schedule_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectCreateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalProjectCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalProjectCreateV30Request
  */
  public static LocalProjectCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectCreateV30Request.class);
  }

 /**
  * Convert an instance of LocalProjectCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

