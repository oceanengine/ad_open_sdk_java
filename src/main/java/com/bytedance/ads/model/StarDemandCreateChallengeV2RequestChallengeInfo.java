/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestChallengeInfoParticipateMcnRange;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestChallengeInfo {
  public static final String SERIALIZED_NAME_AUTHOR_CHOOSE_TYPE = "author_choose_type";
  @SerializedName(SERIALIZED_NAME_AUTHOR_CHOOSE_TYPE)
  private Integer authorChooseType = null;

  public static final String SERIALIZED_NAME_AUTHOR_NO_THRESHOLD_TASK = "author_no_threshold_task";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NO_THRESHOLD_TASK)
  private Boolean authorNoThresholdTask = null;

  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_MARKETING_TYPE = "marketing_type";
  @SerializedName(SERIALIZED_NAME_MARKETING_TYPE)
  private Long marketingType = null;

  public static final String SERIALIZED_NAME_MAX_UPLOAD_ITEM_CNT = "max_upload_item_cnt";
  @SerializedName(SERIALIZED_NAME_MAX_UPLOAD_ITEM_CNT)
  private Long maxUploadItemCnt = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE = "participate_author_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE)
  private StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange participateAuthorRange = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_MCN_RANGE = "participate_mcn_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_MCN_RANGE)
  private StarDemandCreateChallengeV2RequestChallengeInfoParticipateMcnRange participateMcnRange = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_PROVIDER_RANGE = "participate_provider_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_PROVIDER_RANGE)
  private StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange participateProviderRange = null;

  public static final String SERIALIZED_NAME_SAMPLE_DELIVERY = "sample_delivery";
  @SerializedName(SERIALIZED_NAME_SAMPLE_DELIVERY)
  private Long sampleDelivery = null;

  public static final String SERIALIZED_NAME_SAMPLE_VIDEO = "sample_video";
  @SerializedName(SERIALIZED_NAME_SAMPLE_VIDEO)
  private List<Long> sampleVideo = null;

  public static final String SERIALIZED_NAME_SETTLEMENT_INFO = "settlement_info";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_INFO)
  private StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo settlementInfo = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE = "task_head_image";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE)
  private String taskHeadImage = null;

  public static final String SERIALIZED_NAME_TASK_ICON = "task_icon";
  @SerializedName(SERIALIZED_NAME_TASK_ICON)
  private String taskIcon = null;

  public StarDemandCreateChallengeV2RequestChallengeInfo() {
  }

  public StarDemandCreateChallengeV2RequestChallengeInfo authorChooseType(Integer authorChooseType) {
    
    this.authorChooseType = authorChooseType;
    return this;
  }

   /**
   * 达人选择方式
   * @return authorChooseType
  **/
  @javax.annotation.Nullable
  public Integer getAuthorChooseType() {
    return authorChooseType;
  }


  public void setAuthorChooseType(Integer authorChooseType) {
    this.authorChooseType = authorChooseType;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo authorNoThresholdTask(Boolean authorNoThresholdTask) {
    
    this.authorNoThresholdTask = authorNoThresholdTask;
    return this;
  }

   /**
   * 
   * @return authorNoThresholdTask
  **/
  @javax.annotation.Nullable
  public Boolean getAuthorNoThresholdTask() {
    return authorNoThresholdTask;
  }


  public void setAuthorNoThresholdTask(Boolean authorNoThresholdTask) {
    this.authorNoThresholdTask = authorNoThresholdTask;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 达人侧任务名称 60字内
   * @return authorTaskName
  **/
  @javax.annotation.Nonnull
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 总预算，单位元 正整数，最低10000
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投稿活动结束时间，unix时间戳（秒） 不可早于start_time
   * @return endTime
  **/
  @javax.annotation.Nonnull
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo marketingType(Long marketingType) {
    
    this.marketingType = marketingType;
    return this;
  }

   /**
   * 
   * @return marketingType
  **/
  @javax.annotation.Nullable
  public Long getMarketingType() {
    return marketingType;
  }


  public void setMarketingType(Long marketingType) {
    this.marketingType = marketingType;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo maxUploadItemCnt(Long maxUploadItemCnt) {
    
    this.maxUploadItemCnt = maxUploadItemCnt;
    return this;
  }

   /**
   * 单达人可投稿次数 范围1~20
   * @return maxUploadItemCnt
  **/
  @javax.annotation.Nonnull
  public Long getMaxUploadItemCnt() {
    return maxUploadItemCnt;
  }


  public void setMaxUploadItemCnt(Long maxUploadItemCnt) {
    this.maxUploadItemCnt = maxUploadItemCnt;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo participateAuthorRange(StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange participateAuthorRange) {
    
    this.participateAuthorRange = participateAuthorRange;
    return this;
  }

   /**
   * Get participateAuthorRange
   * @return participateAuthorRange
  **/
  @javax.annotation.Nonnull
  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange getParticipateAuthorRange() {
    return participateAuthorRange;
  }


  public void setParticipateAuthorRange(StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange participateAuthorRange) {
    this.participateAuthorRange = participateAuthorRange;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo participateMcnRange(StarDemandCreateChallengeV2RequestChallengeInfoParticipateMcnRange participateMcnRange) {
    
    this.participateMcnRange = participateMcnRange;
    return this;
  }

   /**
   * Get participateMcnRange
   * @return participateMcnRange
  **/
  @javax.annotation.Nullable
  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateMcnRange getParticipateMcnRange() {
    return participateMcnRange;
  }


  public void setParticipateMcnRange(StarDemandCreateChallengeV2RequestChallengeInfoParticipateMcnRange participateMcnRange) {
    this.participateMcnRange = participateMcnRange;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo participateProviderRange(StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange participateProviderRange) {
    
    this.participateProviderRange = participateProviderRange;
    return this;
  }

   /**
   * Get participateProviderRange
   * @return participateProviderRange
  **/
  @javax.annotation.Nullable
  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange getParticipateProviderRange() {
    return participateProviderRange;
  }


  public void setParticipateProviderRange(StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange participateProviderRange) {
    this.participateProviderRange = participateProviderRange;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo sampleDelivery(Long sampleDelivery) {
    
    this.sampleDelivery = sampleDelivery;
    return this;
  }

   /**
   * 是否给达人寄送样品 0：否；1：是
   * @return sampleDelivery
  **/
  @javax.annotation.Nonnull
  public Long getSampleDelivery() {
    return sampleDelivery;
  }


  public void setSampleDelivery(Long sampleDelivery) {
    this.sampleDelivery = sampleDelivery;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo sampleVideo(List<Long> sampleVideo) {
    
    this.sampleVideo = sampleVideo;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfo addSampleVideoItem(Long sampleVideoItem) {
    if (this.sampleVideo == null) {
      this.sampleVideo = new ArrayList<>();
    }
    this.sampleVideo.add(sampleVideoItem);
    return this;
  }

   /**
   * 示例视频ID（https://www.douyin.com/video/xxx 中的XXX部分） 最多3个
   * @return sampleVideo
  **/
  @javax.annotation.Nullable
  public List<Long> getSampleVideo() {
    return sampleVideo;
  }


  public void setSampleVideo(List<Long> sampleVideo) {
    this.sampleVideo = sampleVideo;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo settlementInfo(StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo settlementInfo) {
    
    this.settlementInfo = settlementInfo;
    return this;
  }

   /**
   * Get settlementInfo
   * @return settlementInfo
  **/
  @javax.annotation.Nonnull
  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo getSettlementInfo() {
    return settlementInfo;
  }


  public void setSettlementInfo(StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo settlementInfo) {
    this.settlementInfo = settlementInfo;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投稿活动开始时间，unix时间戳（秒） 不可早于当前日期
   * @return startTime
  **/
  @javax.annotation.Nonnull
  public Long getStartTime() {
    return startTime;
  }


  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo taskHeadImage(String taskHeadImage) {
    
    this.taskHeadImage = taskHeadImage;
    return this;
  }

   /**
   * 任务头图 通过上传材料接口上传的文件名
   * @return taskHeadImage
  **/
  @javax.annotation.Nullable
  public String getTaskHeadImage() {
    return taskHeadImage;
  }


  public void setTaskHeadImage(String taskHeadImage) {
    this.taskHeadImage = taskHeadImage;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfo taskIcon(String taskIcon) {
    
    this.taskIcon = taskIcon;
    return this;
  }

   /**
   * 任务图标 通过上传材料接口上传的文件名
   * @return taskIcon
  **/
  @javax.annotation.Nonnull
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
    StarDemandCreateChallengeV2RequestChallengeInfo starDemandCreateChallengeV2RequestChallengeInfo = (StarDemandCreateChallengeV2RequestChallengeInfo) o;
    return Objects.equals(this.authorChooseType, starDemandCreateChallengeV2RequestChallengeInfo.authorChooseType) &&
        Objects.equals(this.authorNoThresholdTask, starDemandCreateChallengeV2RequestChallengeInfo.authorNoThresholdTask) &&
        Objects.equals(this.authorTaskName, starDemandCreateChallengeV2RequestChallengeInfo.authorTaskName) &&
        Objects.equals(this.budget, starDemandCreateChallengeV2RequestChallengeInfo.budget) &&
        Objects.equals(this.endTime, starDemandCreateChallengeV2RequestChallengeInfo.endTime) &&
        Objects.equals(this.marketingType, starDemandCreateChallengeV2RequestChallengeInfo.marketingType) &&
        Objects.equals(this.maxUploadItemCnt, starDemandCreateChallengeV2RequestChallengeInfo.maxUploadItemCnt) &&
        Objects.equals(this.participateAuthorRange, starDemandCreateChallengeV2RequestChallengeInfo.participateAuthorRange) &&
        Objects.equals(this.participateMcnRange, starDemandCreateChallengeV2RequestChallengeInfo.participateMcnRange) &&
        Objects.equals(this.participateProviderRange, starDemandCreateChallengeV2RequestChallengeInfo.participateProviderRange) &&
        Objects.equals(this.sampleDelivery, starDemandCreateChallengeV2RequestChallengeInfo.sampleDelivery) &&
        Objects.equals(this.sampleVideo, starDemandCreateChallengeV2RequestChallengeInfo.sampleVideo) &&
        Objects.equals(this.settlementInfo, starDemandCreateChallengeV2RequestChallengeInfo.settlementInfo) &&
        Objects.equals(this.startTime, starDemandCreateChallengeV2RequestChallengeInfo.startTime) &&
        Objects.equals(this.taskHeadImage, starDemandCreateChallengeV2RequestChallengeInfo.taskHeadImage) &&
        Objects.equals(this.taskIcon, starDemandCreateChallengeV2RequestChallengeInfo.taskIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorChooseType, authorNoThresholdTask, authorTaskName, budget, endTime, marketingType, maxUploadItemCnt, participateAuthorRange, participateMcnRange, participateProviderRange, sampleDelivery, sampleVideo, settlementInfo, startTime, taskHeadImage, taskIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestChallengeInfo {\n");
    sb.append("    authorChooseType: ").append(toIndentedString(authorChooseType)).append("\n");
    sb.append("    authorNoThresholdTask: ").append(toIndentedString(authorNoThresholdTask)).append("\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    marketingType: ").append(toIndentedString(marketingType)).append("\n");
    sb.append("    maxUploadItemCnt: ").append(toIndentedString(maxUploadItemCnt)).append("\n");
    sb.append("    participateAuthorRange: ").append(toIndentedString(participateAuthorRange)).append("\n");
    sb.append("    participateMcnRange: ").append(toIndentedString(participateMcnRange)).append("\n");
    sb.append("    participateProviderRange: ").append(toIndentedString(participateProviderRange)).append("\n");
    sb.append("    sampleDelivery: ").append(toIndentedString(sampleDelivery)).append("\n");
    sb.append("    sampleVideo: ").append(toIndentedString(sampleVideo)).append("\n");
    sb.append("    settlementInfo: ").append(toIndentedString(settlementInfo)).append("\n");
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
    openapiFields.add("author_choose_type");
    openapiFields.add("author_no_threshold_task");
    openapiFields.add("author_task_name");
    openapiFields.add("budget");
    openapiFields.add("end_time");
    openapiFields.add("marketing_type");
    openapiFields.add("max_upload_item_cnt");
    openapiFields.add("participate_author_range");
    openapiFields.add("participate_mcn_range");
    openapiFields.add("participate_provider_range");
    openapiFields.add("sample_delivery");
    openapiFields.add("sample_video");
    openapiFields.add("settlement_info");
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
       if (!StarDemandCreateChallengeV2RequestChallengeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestChallengeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestChallengeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestChallengeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestChallengeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestChallengeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestChallengeInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestChallengeInfo
  */
  public static StarDemandCreateChallengeV2RequestChallengeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestChallengeInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestChallengeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

