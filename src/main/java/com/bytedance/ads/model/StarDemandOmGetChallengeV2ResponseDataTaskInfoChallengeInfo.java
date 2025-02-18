/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner;
import com.bytedance.ads.model.StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo;
import com.bytedance.ads.model.StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange;
import com.bytedance.ads.model.StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_DIVIDE_DAY = "account_divide_day";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DIVIDE_DAY)
  private Long accountDivideDay = null;

  public static final String SERIALIZED_NAME_ANCHOR_TITLE = "anchor_title";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TITLE)
  private String anchorTitle = null;

  public static final String SERIALIZED_NAME_AUTHOR_LIST = "author_list";
  @SerializedName(SERIALIZED_NAME_AUTHOR_LIST)
  private List<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner> authorList = null;

  public static final String SERIALIZED_NAME_AUTHOR_SCOPE = "author_scope";
  @SerializedName(SERIALIZED_NAME_AUTHOR_SCOPE)
  private Long authorScope = null;

  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_COMMISSION_INFO = "commission_info";
  @SerializedName(SERIALIZED_NAME_COMMISSION_INFO)
  private StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo commissionInfo = null;

  public static final String SERIALIZED_NAME_COMMISSION_RATE = "commission_rate";
  @SerializedName(SERIALIZED_NAME_COMMISSION_RATE)
  private Long commissionRate = null;

  public static final String SERIALIZED_NAME_COMMISSION_TYPE = "commission_type";
  @SerializedName(SERIALIZED_NAME_COMMISSION_TYPE)
  private Long commissionType = null;

  public static final String SERIALIZED_NAME_DEMAND_DESC = "demand_desc";
  @SerializedName(SERIALIZED_NAME_DEMAND_DESC)
  private String demandDesc = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_MAX_UPLOAD_ITEM_CNT = "max_upload_item_cnt";
  @SerializedName(SERIALIZED_NAME_MAX_UPLOAD_ITEM_CNT)
  private Long maxUploadItemCnt = null;

  public static final String SERIALIZED_NAME_MICRO_APP_ID = "micro_app_id";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_ID)
  private String microAppId = null;

  public static final String SERIALIZED_NAME_OM_TASK_STATUS = "om_task_status";
  @SerializedName(SERIALIZED_NAME_OM_TASK_STATUS)
  private Long omTaskStatus = null;

  public static final String SERIALIZED_NAME_OM_TASK_TAG = "om_task_tag";
  @SerializedName(SERIALIZED_NAME_OM_TASK_TAG)
  private List<String> omTaskTag = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE = "participate_author_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE)
  private StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange participateAuthorRange = null;

  public static final String SERIALIZED_NAME_PROVIDER_SCOPE = "provider_scope";
  @SerializedName(SERIALIZED_NAME_PROVIDER_SCOPE)
  private Integer providerScope = null;

  public static final String SERIALIZED_NAME_SAMPLE_DELIVERY = "sample_delivery";
  @SerializedName(SERIALIZED_NAME_SAMPLE_DELIVERY)
  private Long sampleDelivery = null;

  public static final String SERIALIZED_NAME_SAMPLE_VIDEO = "sample_video";
  @SerializedName(SERIALIZED_NAME_SAMPLE_VIDEO)
  private List<Long> sampleVideo = null;

  public static final String SERIALIZED_NAME_SETTLEMENT_INFO = "settlement_info";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_INFO)
  private StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo settlementInfo = null;

  public static final String SERIALIZED_NAME_START_PAGE = "start_page";
  @SerializedName(SERIALIZED_NAME_START_PAGE)
  private String startPage = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE = "task_head_image";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE)
  private String taskHeadImage = null;

  public static final String SERIALIZED_NAME_TASK_ICON = "task_icon";
  @SerializedName(SERIALIZED_NAME_TASK_ICON)
  private String taskIcon = null;

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo() {
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo accountDivideDay(Long accountDivideDay) {
    
    this.accountDivideDay = accountDivideDay;
    return this;
  }

   /**
   * 最长分账周期
   * @return accountDivideDay
  **/
  @javax.annotation.Nullable
  public Long getAccountDivideDay() {
    return accountDivideDay;
  }


  public void setAccountDivideDay(Long accountDivideDay) {
    this.accountDivideDay = accountDivideDay;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo anchorTitle(String anchorTitle) {
    
    this.anchorTitle = anchorTitle;
    return this;
  }

   /**
   * 组件标题
   * @return anchorTitle
  **/
  @javax.annotation.Nullable
  public String getAnchorTitle() {
    return anchorTitle;
  }


  public void setAnchorTitle(String anchorTitle) {
    this.anchorTitle = anchorTitle;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo authorList(List<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner> authorList) {
    
    this.authorList = authorList;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo addAuthorListItem(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner authorListItem) {
    if (this.authorList == null) {
      this.authorList = new ArrayList<>();
    }
    this.authorList.add(authorListItem);
    return this;
  }

   /**
   * 
   * @return authorList
  **/
  @javax.annotation.Nullable
  public List<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner> getAuthorList() {
    return authorList;
  }


  public void setAuthorList(List<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoAuthorListInner> authorList) {
    this.authorList = authorList;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo authorScope(Long authorScope) {
    
    this.authorScope = authorScope;
    return this;
  }

   /**
   * 达人选择
   * @return authorScope
  **/
  @javax.annotation.Nullable
  public Long getAuthorScope() {
    return authorScope;
  }


  public void setAuthorScope(Long authorScope) {
    this.authorScope = authorScope;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 达人侧任务名称
   * @return authorTaskName
  **/
  @javax.annotation.Nullable
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo commissionInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo commissionInfo) {
    
    this.commissionInfo = commissionInfo;
    return this;
  }

   /**
   * Get commissionInfo
   * @return commissionInfo
  **/
  @javax.annotation.Nullable
  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo getCommissionInfo() {
    return commissionInfo;
  }


  public void setCommissionInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoCommissionInfo commissionInfo) {
    this.commissionInfo = commissionInfo;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo commissionRate(Long commissionRate) {
    
    this.commissionRate = commissionRate;
    return this;
  }

   /**
   * 分佣比例
   * @return commissionRate
  **/
  @javax.annotation.Nullable
  public Long getCommissionRate() {
    return commissionRate;
  }


  public void setCommissionRate(Long commissionRate) {
    this.commissionRate = commissionRate;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo commissionType(Long commissionType) {
    
    this.commissionType = commissionType;
    return this;
  }

   /**
   * 结算方式
   * @return commissionType
  **/
  @javax.annotation.Nullable
  public Long getCommissionType() {
    return commissionType;
  }


  public void setCommissionType(Long commissionType) {
    this.commissionType = commissionType;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo demandDesc(String demandDesc) {
    
    this.demandDesc = demandDesc;
    return this;
  }

   /**
   * 任务介绍
   * @return demandDesc
  **/
  @javax.annotation.Nullable
  public String getDemandDesc() {
    return demandDesc;
  }


  public void setDemandDesc(String demandDesc) {
    this.demandDesc = demandDesc;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 任务截止时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo maxUploadItemCnt(Long maxUploadItemCnt) {
    
    this.maxUploadItemCnt = maxUploadItemCnt;
    return this;
  }

   /**
   * 
   * @return maxUploadItemCnt
  **/
  @javax.annotation.Nullable
  public Long getMaxUploadItemCnt() {
    return maxUploadItemCnt;
  }


  public void setMaxUploadItemCnt(Long maxUploadItemCnt) {
    this.maxUploadItemCnt = maxUploadItemCnt;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo microAppId(String microAppId) {
    
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return microAppId
  **/
  @javax.annotation.Nullable
  public String getMicroAppId() {
    return microAppId;
  }


  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo omTaskStatus(Long omTaskStatus) {
    
    this.omTaskStatus = omTaskStatus;
    return this;
  }

   /**
   * 任务状态
   * @return omTaskStatus
  **/
  @javax.annotation.Nullable
  public Long getOmTaskStatus() {
    return omTaskStatus;
  }


  public void setOmTaskStatus(Long omTaskStatus) {
    this.omTaskStatus = omTaskStatus;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo omTaskTag(List<String> omTaskTag) {
    
    this.omTaskTag = omTaskTag;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo addOmTaskTagItem(String omTaskTagItem) {
    if (this.omTaskTag == null) {
      this.omTaskTag = new ArrayList<>();
    }
    this.omTaskTag.add(omTaskTagItem);
    return this;
  }

   /**
   * 任务标签
   * @return omTaskTag
  **/
  @javax.annotation.Nullable
  public List<String> getOmTaskTag() {
    return omTaskTag;
  }


  public void setOmTaskTag(List<String> omTaskTag) {
    this.omTaskTag = omTaskTag;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo participateAuthorRange(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange participateAuthorRange) {
    
    this.participateAuthorRange = participateAuthorRange;
    return this;
  }

   /**
   * Get participateAuthorRange
   * @return participateAuthorRange
  **/
  @javax.annotation.Nullable
  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange getParticipateAuthorRange() {
    return participateAuthorRange;
  }


  public void setParticipateAuthorRange(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoParticipateAuthorRange participateAuthorRange) {
    this.participateAuthorRange = participateAuthorRange;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo providerScope(Integer providerScope) {
    
    this.providerScope = providerScope;
    return this;
  }

   /**
   * 
   * @return providerScope
  **/
  @javax.annotation.Nullable
  public Integer getProviderScope() {
    return providerScope;
  }


  public void setProviderScope(Integer providerScope) {
    this.providerScope = providerScope;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo sampleDelivery(Long sampleDelivery) {
    
    this.sampleDelivery = sampleDelivery;
    return this;
  }

   /**
   * 
   * @return sampleDelivery
  **/
  @javax.annotation.Nullable
  public Long getSampleDelivery() {
    return sampleDelivery;
  }


  public void setSampleDelivery(Long sampleDelivery) {
    this.sampleDelivery = sampleDelivery;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo sampleVideo(List<Long> sampleVideo) {
    
    this.sampleVideo = sampleVideo;
    return this;
  }

  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo addSampleVideoItem(Long sampleVideoItem) {
    if (this.sampleVideo == null) {
      this.sampleVideo = new ArrayList<>();
    }
    this.sampleVideo.add(sampleVideoItem);
    return this;
  }

   /**
   * 示例视频
   * @return sampleVideo
  **/
  @javax.annotation.Nullable
  public List<Long> getSampleVideo() {
    return sampleVideo;
  }


  public void setSampleVideo(List<Long> sampleVideo) {
    this.sampleVideo = sampleVideo;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo settlementInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo settlementInfo) {
    
    this.settlementInfo = settlementInfo;
    return this;
  }

   /**
   * Get settlementInfo
   * @return settlementInfo
  **/
  @javax.annotation.Nullable
  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo getSettlementInfo() {
    return settlementInfo;
  }


  public void setSettlementInfo(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfoSettlementInfo settlementInfo) {
    this.settlementInfo = settlementInfo;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo startPage(String startPage) {
    
    this.startPage = startPage;
    return this;
  }

   /**
   * 小程序落地页地址
   * @return startPage
  **/
  @javax.annotation.Nullable
  public String getStartPage() {
    return startPage;
  }


  public void setStartPage(String startPage) {
    this.startPage = startPage;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投稿开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public Long getStartTime() {
    return startTime;
  }


  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo taskHeadImage(String taskHeadImage) {
    
    this.taskHeadImage = taskHeadImage;
    return this;
  }

   /**
   * 任务头图
   * @return taskHeadImage
  **/
  @javax.annotation.Nullable
  public String getTaskHeadImage() {
    return taskHeadImage;
  }


  public void setTaskHeadImage(String taskHeadImage) {
    this.taskHeadImage = taskHeadImage;
  }


  public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo taskIcon(String taskIcon) {
    
    this.taskIcon = taskIcon;
    return this;
  }

   /**
   * 任务图标
   * @return taskIcon
  **/
  @javax.annotation.Nullable
  public String getTaskIcon() {
    return taskIcon;
  }


  public void setTaskIcon(String taskIcon) {
    this.taskIcon = taskIcon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo = (StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo) o;
    return Objects.equals(this.accountDivideDay, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.accountDivideDay) &&
        Objects.equals(this.anchorTitle, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.anchorTitle) &&
        Objects.equals(this.authorList, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.authorList) &&
        Objects.equals(this.authorScope, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.authorScope) &&
        Objects.equals(this.authorTaskName, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.authorTaskName) &&
        Objects.equals(this.budget, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.budget) &&
        Objects.equals(this.commissionInfo, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.commissionInfo) &&
        Objects.equals(this.commissionRate, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.commissionRate) &&
        Objects.equals(this.commissionType, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.commissionType) &&
        Objects.equals(this.demandDesc, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.demandDesc) &&
        Objects.equals(this.endTime, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.endTime) &&
        Objects.equals(this.maxUploadItemCnt, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.maxUploadItemCnt) &&
        Objects.equals(this.microAppId, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.microAppId) &&
        Objects.equals(this.omTaskStatus, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.omTaskStatus) &&
        Objects.equals(this.omTaskTag, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.omTaskTag) &&
        Objects.equals(this.participateAuthorRange, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.participateAuthorRange) &&
        Objects.equals(this.providerScope, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.providerScope) &&
        Objects.equals(this.sampleDelivery, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.sampleDelivery) &&
        Objects.equals(this.sampleVideo, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.sampleVideo) &&
        Objects.equals(this.settlementInfo, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.settlementInfo) &&
        Objects.equals(this.startPage, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.startPage) &&
        Objects.equals(this.startTime, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.startTime) &&
        Objects.equals(this.taskHeadImage, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.taskHeadImage) &&
        Objects.equals(this.taskIcon, starDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.taskIcon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDivideDay, anchorTitle, authorList, authorScope, authorTaskName, budget, commissionInfo, commissionRate, commissionType, demandDesc, endTime, maxUploadItemCnt, microAppId, omTaskStatus, omTaskTag, participateAuthorRange, providerScope, sampleDelivery, sampleVideo, settlementInfo, startPage, startTime, taskHeadImage, taskIcon);
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
    sb.append("class StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo {\n");
    sb.append("    accountDivideDay: ").append(toIndentedString(accountDivideDay)).append("\n");
    sb.append("    anchorTitle: ").append(toIndentedString(anchorTitle)).append("\n");
    sb.append("    authorList: ").append(toIndentedString(authorList)).append("\n");
    sb.append("    authorScope: ").append(toIndentedString(authorScope)).append("\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    commissionInfo: ").append(toIndentedString(commissionInfo)).append("\n");
    sb.append("    commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
    sb.append("    commissionType: ").append(toIndentedString(commissionType)).append("\n");
    sb.append("    demandDesc: ").append(toIndentedString(demandDesc)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    maxUploadItemCnt: ").append(toIndentedString(maxUploadItemCnt)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    omTaskStatus: ").append(toIndentedString(omTaskStatus)).append("\n");
    sb.append("    omTaskTag: ").append(toIndentedString(omTaskTag)).append("\n");
    sb.append("    participateAuthorRange: ").append(toIndentedString(participateAuthorRange)).append("\n");
    sb.append("    providerScope: ").append(toIndentedString(providerScope)).append("\n");
    sb.append("    sampleDelivery: ").append(toIndentedString(sampleDelivery)).append("\n");
    sb.append("    sampleVideo: ").append(toIndentedString(sampleVideo)).append("\n");
    sb.append("    settlementInfo: ").append(toIndentedString(settlementInfo)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    taskHeadImage: ").append(toIndentedString(taskHeadImage)).append("\n");
    sb.append("    taskIcon: ").append(toIndentedString(taskIcon)).append("\n");
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
    openapiFields.add("account_divide_day");
    openapiFields.add("anchor_title");
    openapiFields.add("author_list");
    openapiFields.add("author_scope");
    openapiFields.add("author_task_name");
    openapiFields.add("budget");
    openapiFields.add("commission_info");
    openapiFields.add("commission_rate");
    openapiFields.add("commission_type");
    openapiFields.add("demand_desc");
    openapiFields.add("end_time");
    openapiFields.add("max_upload_item_cnt");
    openapiFields.add("micro_app_id");
    openapiFields.add("om_task_status");
    openapiFields.add("om_task_tag");
    openapiFields.add("participate_author_range");
    openapiFields.add("provider_scope");
    openapiFields.add("sample_delivery");
    openapiFields.add("sample_video");
    openapiFields.add("settlement_info");
    openapiFields.add("start_page");
    openapiFields.add("start_time");
    openapiFields.add("task_head_image");
    openapiFields.add("task_icon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author_task_name");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("max_upload_item_cnt");
    openapiRequiredFields.add("participate_author_range");
    openapiRequiredFields.add("sample_delivery");
    openapiRequiredFields.add("settlement_info");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("task_icon");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo
  */
  public static StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeV2ResponseDataTaskInfoChallengeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

