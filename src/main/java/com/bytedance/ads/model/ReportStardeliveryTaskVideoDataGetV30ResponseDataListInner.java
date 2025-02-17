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
import com.bytedance.ads.model.ReportStardeliveryTaskVideoDataGetV30DataListStarVideoStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Long active = null;

  public static final String SERIALIZED_NAME_ACTIVE_PAY = "active_pay";
  @SerializedName(SERIALIZED_NAME_ACTIVE_PAY)
  private Long activePay = null;

  public static final String SERIALIZED_NAME_ACTIVE_REGISTER = "active_register";
  @SerializedName(SERIALIZED_NAME_ACTIVE_REGISTER)
  private Long activeRegister = null;

  public static final String SERIALIZED_NAME_GAME_PAY_COUNT = "game_pay_count";
  @SerializedName(SERIALIZED_NAME_GAME_PAY_COUNT)
  private Long gamePayCount = null;

  public static final String SERIALIZED_NAME_IES_AVATAR_URL = "ies_avatar_url";
  @SerializedName(SERIALIZED_NAME_IES_AVATAR_URL)
  private String iesAvatarUrl = null;

  public static final String SERIALIZED_NAME_IES_NICKNAME = "ies_nickname";
  @SerializedName(SERIALIZED_NAME_IES_NICKNAME)
  private String iesNickname = null;

  public static final String SERIALIZED_NAME_IN_APP_PAYMENT_AMOUNT_RANGE = "in_app_payment_amount_range";
  @SerializedName(SERIALIZED_NAME_IN_APP_PAYMENT_AMOUNT_RANGE)
  private List<Double> inAppPaymentAmountRange = null;

  public static final String SERIALIZED_NAME_IN_APP_STAT_COST_RANGE = "in_app_stat_cost_range";
  @SerializedName(SERIALIZED_NAME_IN_APP_STAT_COST_RANGE)
  private List<Double> inAppStatCostRange = null;

  public static final String SERIALIZED_NAME_INSTALL_FINISH_CNT = "install_finish_cnt";
  @SerializedName(SERIALIZED_NAME_INSTALL_FINISH_CNT)
  private Long installFinishCnt = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_NON_AD_STAT_COST = "non_ad_stat_cost";
  @SerializedName(SERIALIZED_NAME_NON_AD_STAT_COST)
  private Double nonAdStatCost = null;

  public static final String SERIALIZED_NAME_STAR_ACTIVE_COUNT = "star_active_count";
  @SerializedName(SERIALIZED_NAME_STAR_ACTIVE_COUNT)
  private Long starActiveCount = null;

  public static final String SERIALIZED_NAME_STAR_ACTIVE_PAY_COUNT = "star_active_pay_count";
  @SerializedName(SERIALIZED_NAME_STAR_ACTIVE_PAY_COUNT)
  private Long starActivePayCount = null;

  public static final String SERIALIZED_NAME_STAR_ACTIVE_REGISTER_COUNT = "star_active_register_count";
  @SerializedName(SERIALIZED_NAME_STAR_ACTIVE_REGISTER_COUNT)
  private Long starActiveRegisterCount = null;

  public static final String SERIALIZED_NAME_STAR_CONVERT_CNT = "star_convert_cnt";
  @SerializedName(SERIALIZED_NAME_STAR_CONVERT_CNT)
  private Long starConvertCnt = null;

  public static final String SERIALIZED_NAME_STAR_DEEP_PURCHASE_COUNT = "star_deep_purchase_count";
  @SerializedName(SERIALIZED_NAME_STAR_DEEP_PURCHASE_COUNT)
  private Long starDeepPurchaseCount = null;

  public static final String SERIALIZED_NAME_STAR_INSTALL_FINISH_COUNT = "star_install_finish_count";
  @SerializedName(SERIALIZED_NAME_STAR_INSTALL_FINISH_COUNT)
  private Long starInstallFinishCount = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_FIRST_NAME = "star_material_first_name";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_FIRST_NAME)
  private String starMaterialFirstName = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_FIRST_TYPE = "star_material_first_type";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_FIRST_TYPE)
  private Integer starMaterialFirstType = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_SECOND_NAME = "star_material_second_name";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_SECOND_NAME)
  private String starMaterialSecondName = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_SECOND_TYPE = "star_material_second_type";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_SECOND_TYPE)
  private Integer starMaterialSecondType = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_STAT_COST = "star_material_stat_cost";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_STAT_COST)
  private Double starMaterialStatCost = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_TOTAL_VIEWS = "star_material_total_views";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_TOTAL_VIEWS)
  private Long starMaterialTotalViews = null;

  public static final String SERIALIZED_NAME_STAR_SALE_MATERIAL_STAT_COST = "star_sale_material_stat_cost";
  @SerializedName(SERIALIZED_NAME_STAR_SALE_MATERIAL_STAT_COST)
  private Double starSaleMaterialStatCost = null;

  public static final String SERIALIZED_NAME_STAR_STAT_COST = "star_stat_cost";
  @SerializedName(SERIALIZED_NAME_STAR_STAT_COST)
  private Double starStatCost = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ID = "star_task_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ID)
  private Long starTaskId = null;

  public static final String SERIALIZED_NAME_STAR_VIDEO_RELATE_PROMOTION_COUNT = "star_video_relate_promotion_count";
  @SerializedName(SERIALIZED_NAME_STAR_VIDEO_RELATE_PROMOTION_COUNT)
  private Long starVideoRelatePromotionCount = null;

  public static final String SERIALIZED_NAME_STAR_VIDEO_STATUS = "star_video_status";
  @SerializedName(SERIALIZED_NAME_STAR_VIDEO_STATUS)
  private ReportStardeliveryTaskVideoDataGetV30DataListStarVideoStatus starVideoStatus = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_URL = "video_cover_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_URL)
  private String videoCoverUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_LINK = "video_play_link";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_LINK)
  private String videoPlayLink = null;

  public static final String SERIALIZED_NAME_VIDEO_TITLE = "video_title";
  @SerializedName(SERIALIZED_NAME_VIDEO_TITLE)
  private String videoTitle = null;

  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner() {
  }

  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner active(Long active) {
    
    this.active = active;
    return this;
  }

   /**
   * 
   * @return active
  **/
  @javax.annotation.Nullable
  public Long getActive() {
    return active;
  }


  public void setActive(Long active) {
    this.active = active;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner activePay(Long activePay) {
    
    this.activePay = activePay;
    return this;
  }

   /**
   * 
   * @return activePay
  **/
  @javax.annotation.Nullable
  public Long getActivePay() {
    return activePay;
  }


  public void setActivePay(Long activePay) {
    this.activePay = activePay;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner activeRegister(Long activeRegister) {
    
    this.activeRegister = activeRegister;
    return this;
  }

   /**
   * 
   * @return activeRegister
  **/
  @javax.annotation.Nullable
  public Long getActiveRegister() {
    return activeRegister;
  }


  public void setActiveRegister(Long activeRegister) {
    this.activeRegister = activeRegister;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner gamePayCount(Long gamePayCount) {
    
    this.gamePayCount = gamePayCount;
    return this;
  }

   /**
   * 
   * @return gamePayCount
  **/
  @javax.annotation.Nullable
  public Long getGamePayCount() {
    return gamePayCount;
  }


  public void setGamePayCount(Long gamePayCount) {
    this.gamePayCount = gamePayCount;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner iesAvatarUrl(String iesAvatarUrl) {
    
    this.iesAvatarUrl = iesAvatarUrl;
    return this;
  }

   /**
   * 
   * @return iesAvatarUrl
  **/
  @javax.annotation.Nullable
  public String getIesAvatarUrl() {
    return iesAvatarUrl;
  }


  public void setIesAvatarUrl(String iesAvatarUrl) {
    this.iesAvatarUrl = iesAvatarUrl;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner iesNickname(String iesNickname) {
    
    this.iesNickname = iesNickname;
    return this;
  }

   /**
   * 
   * @return iesNickname
  **/
  @javax.annotation.Nullable
  public String getIesNickname() {
    return iesNickname;
  }


  public void setIesNickname(String iesNickname) {
    this.iesNickname = iesNickname;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner inAppPaymentAmountRange(List<Double> inAppPaymentAmountRange) {
    
    this.inAppPaymentAmountRange = inAppPaymentAmountRange;
    return this;
  }

  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner addInAppPaymentAmountRangeItem(Double inAppPaymentAmountRangeItem) {
    if (this.inAppPaymentAmountRange == null) {
      this.inAppPaymentAmountRange = new ArrayList<>();
    }
    this.inAppPaymentAmountRange.add(inAppPaymentAmountRangeItem);
    return this;
  }

   /**
   * 
   * @return inAppPaymentAmountRange
  **/
  @javax.annotation.Nullable
  public List<Double> getInAppPaymentAmountRange() {
    return inAppPaymentAmountRange;
  }


  public void setInAppPaymentAmountRange(List<Double> inAppPaymentAmountRange) {
    this.inAppPaymentAmountRange = inAppPaymentAmountRange;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner inAppStatCostRange(List<Double> inAppStatCostRange) {
    
    this.inAppStatCostRange = inAppStatCostRange;
    return this;
  }

  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner addInAppStatCostRangeItem(Double inAppStatCostRangeItem) {
    if (this.inAppStatCostRange == null) {
      this.inAppStatCostRange = new ArrayList<>();
    }
    this.inAppStatCostRange.add(inAppStatCostRangeItem);
    return this;
  }

   /**
   * 
   * @return inAppStatCostRange
  **/
  @javax.annotation.Nullable
  public List<Double> getInAppStatCostRange() {
    return inAppStatCostRange;
  }


  public void setInAppStatCostRange(List<Double> inAppStatCostRange) {
    this.inAppStatCostRange = inAppStatCostRange;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner installFinishCnt(Long installFinishCnt) {
    
    this.installFinishCnt = installFinishCnt;
    return this;
  }

   /**
   * 
   * @return installFinishCnt
  **/
  @javax.annotation.Nullable
  public Long getInstallFinishCnt() {
    return installFinishCnt;
  }


  public void setInstallFinishCnt(Long installFinishCnt) {
    this.installFinishCnt = installFinishCnt;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner nonAdStatCost(Double nonAdStatCost) {
    
    this.nonAdStatCost = nonAdStatCost;
    return this;
  }

   /**
   * 
   * @return nonAdStatCost
  **/
  @javax.annotation.Nullable
  public Double getNonAdStatCost() {
    return nonAdStatCost;
  }


  public void setNonAdStatCost(Double nonAdStatCost) {
    this.nonAdStatCost = nonAdStatCost;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starActiveCount(Long starActiveCount) {
    
    this.starActiveCount = starActiveCount;
    return this;
  }

   /**
   * 
   * @return starActiveCount
  **/
  @javax.annotation.Nullable
  public Long getStarActiveCount() {
    return starActiveCount;
  }


  public void setStarActiveCount(Long starActiveCount) {
    this.starActiveCount = starActiveCount;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starActivePayCount(Long starActivePayCount) {
    
    this.starActivePayCount = starActivePayCount;
    return this;
  }

   /**
   * 
   * @return starActivePayCount
  **/
  @javax.annotation.Nullable
  public Long getStarActivePayCount() {
    return starActivePayCount;
  }


  public void setStarActivePayCount(Long starActivePayCount) {
    this.starActivePayCount = starActivePayCount;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starActiveRegisterCount(Long starActiveRegisterCount) {
    
    this.starActiveRegisterCount = starActiveRegisterCount;
    return this;
  }

   /**
   * 
   * @return starActiveRegisterCount
  **/
  @javax.annotation.Nullable
  public Long getStarActiveRegisterCount() {
    return starActiveRegisterCount;
  }


  public void setStarActiveRegisterCount(Long starActiveRegisterCount) {
    this.starActiveRegisterCount = starActiveRegisterCount;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starConvertCnt(Long starConvertCnt) {
    
    this.starConvertCnt = starConvertCnt;
    return this;
  }

   /**
   * 
   * @return starConvertCnt
  **/
  @javax.annotation.Nullable
  public Long getStarConvertCnt() {
    return starConvertCnt;
  }


  public void setStarConvertCnt(Long starConvertCnt) {
    this.starConvertCnt = starConvertCnt;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starDeepPurchaseCount(Long starDeepPurchaseCount) {
    
    this.starDeepPurchaseCount = starDeepPurchaseCount;
    return this;
  }

   /**
   * 
   * @return starDeepPurchaseCount
  **/
  @javax.annotation.Nullable
  public Long getStarDeepPurchaseCount() {
    return starDeepPurchaseCount;
  }


  public void setStarDeepPurchaseCount(Long starDeepPurchaseCount) {
    this.starDeepPurchaseCount = starDeepPurchaseCount;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starInstallFinishCount(Long starInstallFinishCount) {
    
    this.starInstallFinishCount = starInstallFinishCount;
    return this;
  }

   /**
   * 
   * @return starInstallFinishCount
  **/
  @javax.annotation.Nullable
  public Long getStarInstallFinishCount() {
    return starInstallFinishCount;
  }


  public void setStarInstallFinishCount(Long starInstallFinishCount) {
    this.starInstallFinishCount = starInstallFinishCount;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starMaterialFirstName(String starMaterialFirstName) {
    
    this.starMaterialFirstName = starMaterialFirstName;
    return this;
  }

   /**
   * 
   * @return starMaterialFirstName
  **/
  @javax.annotation.Nullable
  public String getStarMaterialFirstName() {
    return starMaterialFirstName;
  }


  public void setStarMaterialFirstName(String starMaterialFirstName) {
    this.starMaterialFirstName = starMaterialFirstName;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starMaterialFirstType(Integer starMaterialFirstType) {
    
    this.starMaterialFirstType = starMaterialFirstType;
    return this;
  }

   /**
   * 
   * @return starMaterialFirstType
  **/
  @javax.annotation.Nullable
  public Integer getStarMaterialFirstType() {
    return starMaterialFirstType;
  }


  public void setStarMaterialFirstType(Integer starMaterialFirstType) {
    this.starMaterialFirstType = starMaterialFirstType;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starMaterialSecondName(String starMaterialSecondName) {
    
    this.starMaterialSecondName = starMaterialSecondName;
    return this;
  }

   /**
   * 
   * @return starMaterialSecondName
  **/
  @javax.annotation.Nullable
  public String getStarMaterialSecondName() {
    return starMaterialSecondName;
  }


  public void setStarMaterialSecondName(String starMaterialSecondName) {
    this.starMaterialSecondName = starMaterialSecondName;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starMaterialSecondType(Integer starMaterialSecondType) {
    
    this.starMaterialSecondType = starMaterialSecondType;
    return this;
  }

   /**
   * 
   * @return starMaterialSecondType
  **/
  @javax.annotation.Nullable
  public Integer getStarMaterialSecondType() {
    return starMaterialSecondType;
  }


  public void setStarMaterialSecondType(Integer starMaterialSecondType) {
    this.starMaterialSecondType = starMaterialSecondType;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starMaterialStatCost(Double starMaterialStatCost) {
    
    this.starMaterialStatCost = starMaterialStatCost;
    return this;
  }

   /**
   * 
   * @return starMaterialStatCost
  **/
  @javax.annotation.Nullable
  public Double getStarMaterialStatCost() {
    return starMaterialStatCost;
  }


  public void setStarMaterialStatCost(Double starMaterialStatCost) {
    this.starMaterialStatCost = starMaterialStatCost;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starMaterialTotalViews(Long starMaterialTotalViews) {
    
    this.starMaterialTotalViews = starMaterialTotalViews;
    return this;
  }

   /**
   * 
   * @return starMaterialTotalViews
  **/
  @javax.annotation.Nullable
  public Long getStarMaterialTotalViews() {
    return starMaterialTotalViews;
  }


  public void setStarMaterialTotalViews(Long starMaterialTotalViews) {
    this.starMaterialTotalViews = starMaterialTotalViews;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starSaleMaterialStatCost(Double starSaleMaterialStatCost) {
    
    this.starSaleMaterialStatCost = starSaleMaterialStatCost;
    return this;
  }

   /**
   * 
   * @return starSaleMaterialStatCost
  **/
  @javax.annotation.Nullable
  public Double getStarSaleMaterialStatCost() {
    return starSaleMaterialStatCost;
  }


  public void setStarSaleMaterialStatCost(Double starSaleMaterialStatCost) {
    this.starSaleMaterialStatCost = starSaleMaterialStatCost;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starStatCost(Double starStatCost) {
    
    this.starStatCost = starStatCost;
    return this;
  }

   /**
   * 
   * @return starStatCost
  **/
  @javax.annotation.Nullable
  public Double getStarStatCost() {
    return starStatCost;
  }


  public void setStarStatCost(Double starStatCost) {
    this.starStatCost = starStatCost;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starTaskId(Long starTaskId) {
    
    this.starTaskId = starTaskId;
    return this;
  }

   /**
   * 
   * @return starTaskId
  **/
  @javax.annotation.Nullable
  public Long getStarTaskId() {
    return starTaskId;
  }


  public void setStarTaskId(Long starTaskId) {
    this.starTaskId = starTaskId;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starVideoRelatePromotionCount(Long starVideoRelatePromotionCount) {
    
    this.starVideoRelatePromotionCount = starVideoRelatePromotionCount;
    return this;
  }

   /**
   * 
   * @return starVideoRelatePromotionCount
  **/
  @javax.annotation.Nullable
  public Long getStarVideoRelatePromotionCount() {
    return starVideoRelatePromotionCount;
  }


  public void setStarVideoRelatePromotionCount(Long starVideoRelatePromotionCount) {
    this.starVideoRelatePromotionCount = starVideoRelatePromotionCount;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner starVideoStatus(ReportStardeliveryTaskVideoDataGetV30DataListStarVideoStatus starVideoStatus) {
    
    this.starVideoStatus = starVideoStatus;
    return this;
  }

   /**
   * Get starVideoStatus
   * @return starVideoStatus
  **/
  @javax.annotation.Nullable
  public ReportStardeliveryTaskVideoDataGetV30DataListStarVideoStatus getStarVideoStatus() {
    return starVideoStatus;
  }


  public void setStarVideoStatus(ReportStardeliveryTaskVideoDataGetV30DataListStarVideoStatus starVideoStatus) {
    this.starVideoStatus = starVideoStatus;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner videoCoverUrl(String videoCoverUrl) {
    
    this.videoCoverUrl = videoCoverUrl;
    return this;
  }

   /**
   * 
   * @return videoCoverUrl
  **/
  @javax.annotation.Nullable
  public String getVideoCoverUrl() {
    return videoCoverUrl;
  }


  public void setVideoCoverUrl(String videoCoverUrl) {
    this.videoCoverUrl = videoCoverUrl;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner videoPlayLink(String videoPlayLink) {
    
    this.videoPlayLink = videoPlayLink;
    return this;
  }

   /**
   * 
   * @return videoPlayLink
  **/
  @javax.annotation.Nullable
  public String getVideoPlayLink() {
    return videoPlayLink;
  }


  public void setVideoPlayLink(String videoPlayLink) {
    this.videoPlayLink = videoPlayLink;
  }


  public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner videoTitle(String videoTitle) {
    
    this.videoTitle = videoTitle;
    return this;
  }

   /**
   * 
   * @return videoTitle
  **/
  @javax.annotation.Nullable
  public String getVideoTitle() {
    return videoTitle;
  }


  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner reportStardeliveryTaskVideoDataGetV30ResponseDataListInner = (ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner) o;
    return Objects.equals(this.active, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.active) &&
        Objects.equals(this.activePay, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.activePay) &&
        Objects.equals(this.activeRegister, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.activeRegister) &&
        Objects.equals(this.gamePayCount, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.gamePayCount) &&
        Objects.equals(this.iesAvatarUrl, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.iesAvatarUrl) &&
        Objects.equals(this.iesNickname, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.iesNickname) &&
        Objects.equals(this.inAppPaymentAmountRange, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.inAppPaymentAmountRange) &&
        Objects.equals(this.inAppStatCostRange, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.inAppStatCostRange) &&
        Objects.equals(this.installFinishCnt, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.installFinishCnt) &&
        Objects.equals(this.materialId, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.materialId) &&
        Objects.equals(this.nonAdStatCost, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.nonAdStatCost) &&
        Objects.equals(this.starActiveCount, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starActiveCount) &&
        Objects.equals(this.starActivePayCount, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starActivePayCount) &&
        Objects.equals(this.starActiveRegisterCount, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starActiveRegisterCount) &&
        Objects.equals(this.starConvertCnt, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starConvertCnt) &&
        Objects.equals(this.starDeepPurchaseCount, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starDeepPurchaseCount) &&
        Objects.equals(this.starInstallFinishCount, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starInstallFinishCount) &&
        Objects.equals(this.starMaterialFirstName, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starMaterialFirstName) &&
        Objects.equals(this.starMaterialFirstType, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starMaterialFirstType) &&
        Objects.equals(this.starMaterialSecondName, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starMaterialSecondName) &&
        Objects.equals(this.starMaterialSecondType, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starMaterialSecondType) &&
        Objects.equals(this.starMaterialStatCost, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starMaterialStatCost) &&
        Objects.equals(this.starMaterialTotalViews, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starMaterialTotalViews) &&
        Objects.equals(this.starSaleMaterialStatCost, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starSaleMaterialStatCost) &&
        Objects.equals(this.starStatCost, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starStatCost) &&
        Objects.equals(this.starTaskId, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starTaskId) &&
        Objects.equals(this.starVideoRelatePromotionCount, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starVideoRelatePromotionCount) &&
        Objects.equals(this.starVideoStatus, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.starVideoStatus) &&
        Objects.equals(this.statCost, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.statCost) &&
        Objects.equals(this.videoCoverUrl, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.videoCoverUrl) &&
        Objects.equals(this.videoPlayLink, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.videoPlayLink) &&
        Objects.equals(this.videoTitle, reportStardeliveryTaskVideoDataGetV30ResponseDataListInner.videoTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, activePay, activeRegister, gamePayCount, iesAvatarUrl, iesNickname, inAppPaymentAmountRange, inAppStatCostRange, installFinishCnt, materialId, nonAdStatCost, starActiveCount, starActivePayCount, starActiveRegisterCount, starConvertCnt, starDeepPurchaseCount, starInstallFinishCount, starMaterialFirstName, starMaterialFirstType, starMaterialSecondName, starMaterialSecondType, starMaterialStatCost, starMaterialTotalViews, starSaleMaterialStatCost, starStatCost, starTaskId, starVideoRelatePromotionCount, starVideoStatus, statCost, videoCoverUrl, videoPlayLink, videoTitle);
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
    sb.append("class ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activePay: ").append(toIndentedString(activePay)).append("\n");
    sb.append("    activeRegister: ").append(toIndentedString(activeRegister)).append("\n");
    sb.append("    gamePayCount: ").append(toIndentedString(gamePayCount)).append("\n");
    sb.append("    iesAvatarUrl: ").append(toIndentedString(iesAvatarUrl)).append("\n");
    sb.append("    iesNickname: ").append(toIndentedString(iesNickname)).append("\n");
    sb.append("    inAppPaymentAmountRange: ").append(toIndentedString(inAppPaymentAmountRange)).append("\n");
    sb.append("    inAppStatCostRange: ").append(toIndentedString(inAppStatCostRange)).append("\n");
    sb.append("    installFinishCnt: ").append(toIndentedString(installFinishCnt)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    nonAdStatCost: ").append(toIndentedString(nonAdStatCost)).append("\n");
    sb.append("    starActiveCount: ").append(toIndentedString(starActiveCount)).append("\n");
    sb.append("    starActivePayCount: ").append(toIndentedString(starActivePayCount)).append("\n");
    sb.append("    starActiveRegisterCount: ").append(toIndentedString(starActiveRegisterCount)).append("\n");
    sb.append("    starConvertCnt: ").append(toIndentedString(starConvertCnt)).append("\n");
    sb.append("    starDeepPurchaseCount: ").append(toIndentedString(starDeepPurchaseCount)).append("\n");
    sb.append("    starInstallFinishCount: ").append(toIndentedString(starInstallFinishCount)).append("\n");
    sb.append("    starMaterialFirstName: ").append(toIndentedString(starMaterialFirstName)).append("\n");
    sb.append("    starMaterialFirstType: ").append(toIndentedString(starMaterialFirstType)).append("\n");
    sb.append("    starMaterialSecondName: ").append(toIndentedString(starMaterialSecondName)).append("\n");
    sb.append("    starMaterialSecondType: ").append(toIndentedString(starMaterialSecondType)).append("\n");
    sb.append("    starMaterialStatCost: ").append(toIndentedString(starMaterialStatCost)).append("\n");
    sb.append("    starMaterialTotalViews: ").append(toIndentedString(starMaterialTotalViews)).append("\n");
    sb.append("    starSaleMaterialStatCost: ").append(toIndentedString(starSaleMaterialStatCost)).append("\n");
    sb.append("    starStatCost: ").append(toIndentedString(starStatCost)).append("\n");
    sb.append("    starTaskId: ").append(toIndentedString(starTaskId)).append("\n");
    sb.append("    starVideoRelatePromotionCount: ").append(toIndentedString(starVideoRelatePromotionCount)).append("\n");
    sb.append("    starVideoStatus: ").append(toIndentedString(starVideoStatus)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
    sb.append("    videoPlayLink: ").append(toIndentedString(videoPlayLink)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("active_pay");
    openapiFields.add("active_register");
    openapiFields.add("game_pay_count");
    openapiFields.add("ies_avatar_url");
    openapiFields.add("ies_nickname");
    openapiFields.add("in_app_payment_amount_range");
    openapiFields.add("in_app_stat_cost_range");
    openapiFields.add("install_finish_cnt");
    openapiFields.add("material_id");
    openapiFields.add("non_ad_stat_cost");
    openapiFields.add("star_active_count");
    openapiFields.add("star_active_pay_count");
    openapiFields.add("star_active_register_count");
    openapiFields.add("star_convert_cnt");
    openapiFields.add("star_deep_purchase_count");
    openapiFields.add("star_install_finish_count");
    openapiFields.add("star_material_first_name");
    openapiFields.add("star_material_first_type");
    openapiFields.add("star_material_second_name");
    openapiFields.add("star_material_second_type");
    openapiFields.add("star_material_stat_cost");
    openapiFields.add("star_material_total_views");
    openapiFields.add("star_sale_material_stat_cost");
    openapiFields.add("star_stat_cost");
    openapiFields.add("star_task_id");
    openapiFields.add("star_video_relate_promotion_count");
    openapiFields.add("star_video_status");
    openapiFields.add("stat_cost");
    openapiFields.add("video_cover_url");
    openapiFields.add("video_play_link");
    openapiFields.add("video_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner
  */
  public static ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportStardeliveryTaskVideoDataGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

