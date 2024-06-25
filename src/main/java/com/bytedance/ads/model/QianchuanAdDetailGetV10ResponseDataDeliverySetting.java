/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingBudgetMode;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingDeepBidType;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingDeepExternalAction;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingEnableAutoPause;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingEnableFollowMaterial;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingExternalAction;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingLiveScheduleType;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingQcpxMode;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingSmartBidType;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataDeliverySetting {
  public static final String SERIALIZED_NAME_ALLOW_QCPX = "allow_qcpx";
  @SerializedName(SERIALIZED_NAME_ALLOW_QCPX)
  private Boolean allowQcpx = null;

  public static final String SERIALIZED_NAME_AUTO_MANAGE_STRATEGY_CMD = "auto_manage_strategy_cmd";
  @SerializedName(SERIALIZED_NAME_AUTO_MANAGE_STRATEGY_CMD)
  private Long autoManageStrategyCmd = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private QianchuanAdDetailGetV10DataDeliverySettingBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private QianchuanAdDetailGetV10DataDeliverySettingDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_CPA_BID = "deep_cpa_bid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPA_BID)
  private Double deepCpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private QianchuanAdDetailGetV10DataDeliverySettingDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_ENABLE_AUTO_PAUSE = "enable_auto_pause";
  @SerializedName(SERIALIZED_NAME_ENABLE_AUTO_PAUSE)
  private QianchuanAdDetailGetV10DataDeliverySettingEnableAutoPause enableAutoPause = null;

  public static final String SERIALIZED_NAME_ENABLE_FOLLOW_MATERIAL = "enable_follow_material";
  @SerializedName(SERIALIZED_NAME_ENABLE_FOLLOW_MATERIAL)
  private QianchuanAdDetailGetV10DataDeliverySettingEnableFollowMaterial enableFollowMaterial = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAdDetailGetV10DataDeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE = "grab_first_screen_bid_adjust_rate";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE)
  private Long grabFirstScreenBidAdjustRate = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH = "grab_first_screen_switch";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH)
  private Boolean grabFirstScreenSwitch = null;

  public static final String SERIALIZED_NAME_LIVE_SCHEDULE_TYPE = "live_schedule_type";
  @SerializedName(SERIALIZED_NAME_LIVE_SCHEDULE_TYPE)
  private QianchuanAdDetailGetV10DataDeliverySettingLiveScheduleType liveScheduleType = null;

  public static final String SERIALIZED_NAME_PRODUCT_NEW_OPEN = "product_new_open";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NEW_OPEN)
  private Boolean productNewOpen = null;

  public static final String SERIALIZED_NAME_QCPX_MODE = "qcpx_mode";
  @SerializedName(SERIALIZED_NAME_QCPX_MODE)
  private QianchuanAdDetailGetV10DataDeliverySettingQcpxMode qcpxMode = null;

  public static final String SERIALIZED_NAME_REVIVE_BUDGET = "revive_budget";
  @SerializedName(SERIALIZED_NAME_REVIVE_BUDGET)
  private Double reviveBudget = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_FIXED_RANGE = "schedule_fixed_range";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FIXED_RANGE)
  private Long scheduleFixedRange = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanAdDetailGetV10DataDeliverySettingSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE = "video_schedule_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE)
  private QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType videoScheduleType = null;

  public QianchuanAdDetailGetV10ResponseDataDeliverySetting() {
  }

  public QianchuanAdDetailGetV10ResponseDataDeliverySetting allowQcpx(Boolean allowQcpx) {
    
    this.allowQcpx = allowQcpx;
    return this;
  }

   /**
   * 
   * @return allowQcpx
  **/
  @javax.annotation.Nullable
  public Boolean getAllowQcpx() {
    return allowQcpx;
  }


  public void setAllowQcpx(Boolean allowQcpx) {
    this.allowQcpx = allowQcpx;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting autoManageStrategyCmd(Long autoManageStrategyCmd) {
    
    this.autoManageStrategyCmd = autoManageStrategyCmd;
    return this;
  }

   /**
   * 
   * @return autoManageStrategyCmd
  **/
  @javax.annotation.Nullable
  public Long getAutoManageStrategyCmd() {
    return autoManageStrategyCmd;
  }


  public void setAutoManageStrategyCmd(Long autoManageStrategyCmd) {
    this.autoManageStrategyCmd = autoManageStrategyCmd;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting budget(Double budget) {
    
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


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting budgetMode(QianchuanAdDetailGetV10DataDeliverySettingBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(QianchuanAdDetailGetV10DataDeliverySettingBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting cpaBid(Double cpaBid) {
    
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


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting deepBidType(QianchuanAdDetailGetV10DataDeliverySettingDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(QianchuanAdDetailGetV10DataDeliverySettingDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting deepCpaBid(Double deepCpaBid) {
    
    this.deepCpaBid = deepCpaBid;
    return this;
  }

   /**
   * 
   * @return deepCpaBid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpaBid() {
    return deepCpaBid;
  }


  public void setDeepCpaBid(Double deepCpaBid) {
    this.deepCpaBid = deepCpaBid;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting deepExternalAction(QianchuanAdDetailGetV10DataDeliverySettingDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(QianchuanAdDetailGetV10DataDeliverySettingDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting enableAutoPause(QianchuanAdDetailGetV10DataDeliverySettingEnableAutoPause enableAutoPause) {
    
    this.enableAutoPause = enableAutoPause;
    return this;
  }

   /**
   * Get enableAutoPause
   * @return enableAutoPause
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingEnableAutoPause getEnableAutoPause() {
    return enableAutoPause;
  }


  public void setEnableAutoPause(QianchuanAdDetailGetV10DataDeliverySettingEnableAutoPause enableAutoPause) {
    this.enableAutoPause = enableAutoPause;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting enableFollowMaterial(QianchuanAdDetailGetV10DataDeliverySettingEnableFollowMaterial enableFollowMaterial) {
    
    this.enableFollowMaterial = enableFollowMaterial;
    return this;
  }

   /**
   * Get enableFollowMaterial
   * @return enableFollowMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingEnableFollowMaterial getEnableFollowMaterial() {
    return enableFollowMaterial;
  }


  public void setEnableFollowMaterial(QianchuanAdDetailGetV10DataDeliverySettingEnableFollowMaterial enableFollowMaterial) {
    this.enableFollowMaterial = enableFollowMaterial;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting endTime(String endTime) {
    
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


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting externalAction(QianchuanAdDetailGetV10DataDeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAdDetailGetV10DataDeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting grabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
    return this;
  }

   /**
   * 抢首屏ROI目标降低幅度
   * @return grabFirstScreenBidAdjustRate
  **/
  @javax.annotation.Nullable
  public Long getGrabFirstScreenBidAdjustRate() {
    return grabFirstScreenBidAdjustRate;
  }


  public void setGrabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting grabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
    return this;
  }

   /**
   * 抢首屏开关
   * @return grabFirstScreenSwitch
  **/
  @javax.annotation.Nullable
  public Boolean getGrabFirstScreenSwitch() {
    return grabFirstScreenSwitch;
  }


  public void setGrabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting liveScheduleType(QianchuanAdDetailGetV10DataDeliverySettingLiveScheduleType liveScheduleType) {
    
    this.liveScheduleType = liveScheduleType;
    return this;
  }

   /**
   * Get liveScheduleType
   * @return liveScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingLiveScheduleType getLiveScheduleType() {
    return liveScheduleType;
  }


  public void setLiveScheduleType(QianchuanAdDetailGetV10DataDeliverySettingLiveScheduleType liveScheduleType) {
    this.liveScheduleType = liveScheduleType;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting productNewOpen(Boolean productNewOpen) {
    
    this.productNewOpen = productNewOpen;
    return this;
  }

   /**
   * 
   * @return productNewOpen
  **/
  @javax.annotation.Nullable
  public Boolean getProductNewOpen() {
    return productNewOpen;
  }


  public void setProductNewOpen(Boolean productNewOpen) {
    this.productNewOpen = productNewOpen;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting qcpxMode(QianchuanAdDetailGetV10DataDeliverySettingQcpxMode qcpxMode) {
    
    this.qcpxMode = qcpxMode;
    return this;
  }

   /**
   * Get qcpxMode
   * @return qcpxMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingQcpxMode getQcpxMode() {
    return qcpxMode;
  }


  public void setQcpxMode(QianchuanAdDetailGetV10DataDeliverySettingQcpxMode qcpxMode) {
    this.qcpxMode = qcpxMode;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting reviveBudget(Double reviveBudget) {
    
    this.reviveBudget = reviveBudget;
    return this;
  }

   /**
   * 
   * @return reviveBudget
  **/
  @javax.annotation.Nullable
  public Double getReviveBudget() {
    return reviveBudget;
  }


  public void setReviveBudget(Double reviveBudget) {
    this.reviveBudget = reviveBudget;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting roiGoal(Double roiGoal) {
    
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


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting scheduleFixedRange(Long scheduleFixedRange) {
    
    this.scheduleFixedRange = scheduleFixedRange;
    return this;
  }

   /**
   * 
   * @return scheduleFixedRange
  **/
  @javax.annotation.Nullable
  public Long getScheduleFixedRange() {
    return scheduleFixedRange;
  }


  public void setScheduleFixedRange(Long scheduleFixedRange) {
    this.scheduleFixedRange = scheduleFixedRange;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting scheduleTime(String scheduleTime) {
    
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


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting smartBidType(QianchuanAdDetailGetV10DataDeliverySettingSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanAdDetailGetV10DataDeliverySettingSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting startTime(String startTime) {
    
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


  public QianchuanAdDetailGetV10ResponseDataDeliverySetting videoScheduleType(QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType videoScheduleType) {
    
    this.videoScheduleType = videoScheduleType;
    return this;
  }

   /**
   * Get videoScheduleType
   * @return videoScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType getVideoScheduleType() {
    return videoScheduleType;
  }


  public void setVideoScheduleType(QianchuanAdDetailGetV10DataDeliverySettingVideoScheduleType videoScheduleType) {
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
    QianchuanAdDetailGetV10ResponseDataDeliverySetting qianchuanAdDetailGetV10ResponseDataDeliverySetting = (QianchuanAdDetailGetV10ResponseDataDeliverySetting) o;
    return Objects.equals(this.allowQcpx, qianchuanAdDetailGetV10ResponseDataDeliverySetting.allowQcpx) &&
        Objects.equals(this.autoManageStrategyCmd, qianchuanAdDetailGetV10ResponseDataDeliverySetting.autoManageStrategyCmd) &&
        Objects.equals(this.budget, qianchuanAdDetailGetV10ResponseDataDeliverySetting.budget) &&
        Objects.equals(this.budgetMode, qianchuanAdDetailGetV10ResponseDataDeliverySetting.budgetMode) &&
        Objects.equals(this.cpaBid, qianchuanAdDetailGetV10ResponseDataDeliverySetting.cpaBid) &&
        Objects.equals(this.deepBidType, qianchuanAdDetailGetV10ResponseDataDeliverySetting.deepBidType) &&
        Objects.equals(this.deepCpaBid, qianchuanAdDetailGetV10ResponseDataDeliverySetting.deepCpaBid) &&
        Objects.equals(this.deepExternalAction, qianchuanAdDetailGetV10ResponseDataDeliverySetting.deepExternalAction) &&
        Objects.equals(this.enableAutoPause, qianchuanAdDetailGetV10ResponseDataDeliverySetting.enableAutoPause) &&
        Objects.equals(this.enableFollowMaterial, qianchuanAdDetailGetV10ResponseDataDeliverySetting.enableFollowMaterial) &&
        Objects.equals(this.endTime, qianchuanAdDetailGetV10ResponseDataDeliverySetting.endTime) &&
        Objects.equals(this.externalAction, qianchuanAdDetailGetV10ResponseDataDeliverySetting.externalAction) &&
        Objects.equals(this.grabFirstScreenBidAdjustRate, qianchuanAdDetailGetV10ResponseDataDeliverySetting.grabFirstScreenBidAdjustRate) &&
        Objects.equals(this.grabFirstScreenSwitch, qianchuanAdDetailGetV10ResponseDataDeliverySetting.grabFirstScreenSwitch) &&
        Objects.equals(this.liveScheduleType, qianchuanAdDetailGetV10ResponseDataDeliverySetting.liveScheduleType) &&
        Objects.equals(this.productNewOpen, qianchuanAdDetailGetV10ResponseDataDeliverySetting.productNewOpen) &&
        Objects.equals(this.qcpxMode, qianchuanAdDetailGetV10ResponseDataDeliverySetting.qcpxMode) &&
        Objects.equals(this.reviveBudget, qianchuanAdDetailGetV10ResponseDataDeliverySetting.reviveBudget) &&
        Objects.equals(this.roiGoal, qianchuanAdDetailGetV10ResponseDataDeliverySetting.roiGoal) &&
        Objects.equals(this.scheduleFixedRange, qianchuanAdDetailGetV10ResponseDataDeliverySetting.scheduleFixedRange) &&
        Objects.equals(this.scheduleTime, qianchuanAdDetailGetV10ResponseDataDeliverySetting.scheduleTime) &&
        Objects.equals(this.smartBidType, qianchuanAdDetailGetV10ResponseDataDeliverySetting.smartBidType) &&
        Objects.equals(this.startTime, qianchuanAdDetailGetV10ResponseDataDeliverySetting.startTime) &&
        Objects.equals(this.videoScheduleType, qianchuanAdDetailGetV10ResponseDataDeliverySetting.videoScheduleType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowQcpx, autoManageStrategyCmd, budget, budgetMode, cpaBid, deepBidType, deepCpaBid, deepExternalAction, enableAutoPause, enableFollowMaterial, endTime, externalAction, grabFirstScreenBidAdjustRate, grabFirstScreenSwitch, liveScheduleType, productNewOpen, qcpxMode, reviveBudget, roiGoal, scheduleFixedRange, scheduleTime, smartBidType, startTime, videoScheduleType);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataDeliverySetting {\n");
    sb.append("    allowQcpx: ").append(toIndentedString(allowQcpx)).append("\n");
    sb.append("    autoManageStrategyCmd: ").append(toIndentedString(autoManageStrategyCmd)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    enableAutoPause: ").append(toIndentedString(enableAutoPause)).append("\n");
    sb.append("    enableFollowMaterial: ").append(toIndentedString(enableFollowMaterial)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    grabFirstScreenBidAdjustRate: ").append(toIndentedString(grabFirstScreenBidAdjustRate)).append("\n");
    sb.append("    grabFirstScreenSwitch: ").append(toIndentedString(grabFirstScreenSwitch)).append("\n");
    sb.append("    liveScheduleType: ").append(toIndentedString(liveScheduleType)).append("\n");
    sb.append("    productNewOpen: ").append(toIndentedString(productNewOpen)).append("\n");
    sb.append("    qcpxMode: ").append(toIndentedString(qcpxMode)).append("\n");
    sb.append("    reviveBudget: ").append(toIndentedString(reviveBudget)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleFixedRange: ").append(toIndentedString(scheduleFixedRange)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
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
    openapiFields.add("allow_qcpx");
    openapiFields.add("auto_manage_strategy_cmd");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_cpa_bid");
    openapiFields.add("deep_external_action");
    openapiFields.add("enable_auto_pause");
    openapiFields.add("enable_follow_material");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("grab_first_screen_bid_adjust_rate");
    openapiFields.add("grab_first_screen_switch");
    openapiFields.add("live_schedule_type");
    openapiFields.add("product_new_open");
    openapiFields.add("qcpx_mode");
    openapiFields.add("revive_budget");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_fixed_range");
    openapiFields.add("schedule_time");
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
       if (!QianchuanAdDetailGetV10ResponseDataDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataDeliverySetting
  */
  public static QianchuanAdDetailGetV10ResponseDataDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

