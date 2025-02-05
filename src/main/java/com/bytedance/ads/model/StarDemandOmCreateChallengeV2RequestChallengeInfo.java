/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope;
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2ChallengeInfoCommissionType;
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2ChallengeInfoProviderScope;
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2RequestChallengeInfoCommissionInfo;
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange;
import com.bytedance.ads.model.StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateProviderRange;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarDemandOmCreateChallengeV2RequestChallengeInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_DIVIDE_DAY = "account_divide_day";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DIVIDE_DAY)
  private Long accountDivideDay = null;

  public static final String SERIALIZED_NAME_ANCHOR_TITLE = "anchor_title";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TITLE)
  private String anchorTitle = null;

  public static final String SERIALIZED_NAME_AUTHOR_SCOPE = "author_scope";
  @SerializedName(SERIALIZED_NAME_AUTHOR_SCOPE)
  private StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope authorScope = null;

  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_COMMISSION_INFO = "commission_info";
  @SerializedName(SERIALIZED_NAME_COMMISSION_INFO)
  private StarDemandOmCreateChallengeV2RequestChallengeInfoCommissionInfo commissionInfo = null;

  public static final String SERIALIZED_NAME_COMMISSION_RATE = "commission_rate";
  @SerializedName(SERIALIZED_NAME_COMMISSION_RATE)
  private Long commissionRate = null;

  public static final String SERIALIZED_NAME_COMMISSION_TYPE = "commission_type";
  @SerializedName(SERIALIZED_NAME_COMMISSION_TYPE)
  private StarDemandOmCreateChallengeV2ChallengeInfoCommissionType commissionType = null;

  public static final String SERIALIZED_NAME_DEMAND_DESC = "demand_desc";
  @SerializedName(SERIALIZED_NAME_DEMAND_DESC)
  private String demandDesc = null;

  public static final String SERIALIZED_NAME_MICRO_APP_ID = "micro_app_id";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_ID)
  private String microAppId = null;

  public static final String SERIALIZED_NAME_OM_TASK_TAG = "om_task_tag";
  @SerializedName(SERIALIZED_NAME_OM_TASK_TAG)
  private List<String> omTaskTag = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE = "participate_author_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE)
  private StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange participateAuthorRange = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_PROVIDER_RANGE = "participate_provider_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_PROVIDER_RANGE)
  private StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateProviderRange participateProviderRange = null;

  public static final String SERIALIZED_NAME_PROVIDER_SCOPE = "provider_scope";
  @SerializedName(SERIALIZED_NAME_PROVIDER_SCOPE)
  private StarDemandOmCreateChallengeV2ChallengeInfoProviderScope providerScope = null;

  public static final String SERIALIZED_NAME_SAMPLE_VIDEO = "sample_video";
  @SerializedName(SERIALIZED_NAME_SAMPLE_VIDEO)
  private List<Long> sampleVideo = null;

  public static final String SERIALIZED_NAME_START_PAGE = "start_page";
  @SerializedName(SERIALIZED_NAME_START_PAGE)
  private String startPage = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE = "task_head_image";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE)
  private String taskHeadImage = null;

  public static final String SERIALIZED_NAME_TASK_ICON = "task_icon";
  @SerializedName(SERIALIZED_NAME_TASK_ICON)
  private String taskIcon = null;

  public StarDemandOmCreateChallengeV2RequestChallengeInfo() {
  }

  public StarDemandOmCreateChallengeV2RequestChallengeInfo accountDivideDay(Long accountDivideDay) {
    
    this.accountDivideDay = accountDivideDay;
    return this;
  }

   /**
   * 最长分账周期
   * minimum: 0
   * maximum: 9
   * @return accountDivideDay
  **/
  @javax.annotation.Nonnull
  public Long getAccountDivideDay() {
    return accountDivideDay;
  }


  public void setAccountDivideDay(Long accountDivideDay) {
    this.accountDivideDay = accountDivideDay;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo anchorTitle(String anchorTitle) {
    
    this.anchorTitle = anchorTitle;
    return this;
  }

   /**
   * 组件标题 最长14字
   * @return anchorTitle
  **/
  @javax.annotation.Nonnull
  public String getAnchorTitle() {
    return anchorTitle;
  }


  public void setAnchorTitle(String anchorTitle) {
    this.anchorTitle = anchorTitle;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo authorScope(StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope authorScope) {
    
    this.authorScope = authorScope;
    return this;
  }

   /**
   * Get authorScope
   * @return authorScope
  **/
  @javax.annotation.Nonnull
  public StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope getAuthorScope() {
    return authorScope;
  }


  public void setAuthorScope(StarDemandOmCreateChallengeV2ChallengeInfoAuthorScope authorScope) {
    this.authorScope = authorScope;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 达人侧任务名称 字符串，最长17
   * @return authorTaskName
  **/
  @javax.annotation.Nonnull
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo commissionInfo(StarDemandOmCreateChallengeV2RequestChallengeInfoCommissionInfo commissionInfo) {
    
    this.commissionInfo = commissionInfo;
    return this;
  }

   /**
   * Get commissionInfo
   * @return commissionInfo
  **/
  @javax.annotation.Nullable
  public StarDemandOmCreateChallengeV2RequestChallengeInfoCommissionInfo getCommissionInfo() {
    return commissionInfo;
  }


  public void setCommissionInfo(StarDemandOmCreateChallengeV2RequestChallengeInfoCommissionInfo commissionInfo) {
    this.commissionInfo = commissionInfo;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo commissionRate(Long commissionRate) {
    
    this.commissionRate = commissionRate;
    return this;
  }

   /**
   * 分佣比例 整数，范围根据任务类型限制 
   * @return commissionRate
  **/
  @javax.annotation.Nullable
  public Long getCommissionRate() {
    return commissionRate;
  }


  public void setCommissionRate(Long commissionRate) {
    this.commissionRate = commissionRate;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo commissionType(StarDemandOmCreateChallengeV2ChallengeInfoCommissionType commissionType) {
    
    this.commissionType = commissionType;
    return this;
  }

   /**
   * Get commissionType
   * @return commissionType
  **/
  @javax.annotation.Nonnull
  public StarDemandOmCreateChallengeV2ChallengeInfoCommissionType getCommissionType() {
    return commissionType;
  }


  public void setCommissionType(StarDemandOmCreateChallengeV2ChallengeInfoCommissionType commissionType) {
    this.commissionType = commissionType;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo demandDesc(String demandDesc) {
    
    this.demandDesc = demandDesc;
    return this;
  }

   /**
   * 任务介绍 文本，最长500字
   * @return demandDesc
  **/
  @javax.annotation.Nullable
  public String getDemandDesc() {
    return demandDesc;
  }


  public void setDemandDesc(String demandDesc) {
    this.demandDesc = demandDesc;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo microAppId(String microAppId) {
    
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 小程序ID
   * @return microAppId
  **/
  @javax.annotation.Nonnull
  public String getMicroAppId() {
    return microAppId;
  }


  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo omTaskTag(List<String> omTaskTag) {
    
    this.omTaskTag = omTaskTag;
    return this;
  }

  public StarDemandOmCreateChallengeV2RequestChallengeInfo addOmTaskTagItem(String omTaskTagItem) {
    if (this.omTaskTag == null) {
      this.omTaskTag = new ArrayList<>();
    }
    this.omTaskTag.add(omTaskTagItem);
    return this;
  }

   /**
   * 任务标签 list&lt;string&gt; 长度固定为2  [${形式标签}, ${内容标签}]
   * @return omTaskTag
  **/
  @javax.annotation.Nonnull
  public List<String> getOmTaskTag() {
    return omTaskTag;
  }


  public void setOmTaskTag(List<String> omTaskTag) {
    this.omTaskTag = omTaskTag;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo participateAuthorRange(StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange participateAuthorRange) {
    
    this.participateAuthorRange = participateAuthorRange;
    return this;
  }

   /**
   * Get participateAuthorRange
   * @return participateAuthorRange
  **/
  @javax.annotation.Nullable
  public StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange getParticipateAuthorRange() {
    return participateAuthorRange;
  }


  public void setParticipateAuthorRange(StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateAuthorRange participateAuthorRange) {
    this.participateAuthorRange = participateAuthorRange;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo participateProviderRange(StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateProviderRange participateProviderRange) {
    
    this.participateProviderRange = participateProviderRange;
    return this;
  }

   /**
   * Get participateProviderRange
   * @return participateProviderRange
  **/
  @javax.annotation.Nullable
  public StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateProviderRange getParticipateProviderRange() {
    return participateProviderRange;
  }


  public void setParticipateProviderRange(StarDemandOmCreateChallengeV2RequestChallengeInfoParticipateProviderRange participateProviderRange) {
    this.participateProviderRange = participateProviderRange;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo providerScope(StarDemandOmCreateChallengeV2ChallengeInfoProviderScope providerScope) {
    
    this.providerScope = providerScope;
    return this;
  }

   /**
   * Get providerScope
   * @return providerScope
  **/
  @javax.annotation.Nullable
  public StarDemandOmCreateChallengeV2ChallengeInfoProviderScope getProviderScope() {
    return providerScope;
  }


  public void setProviderScope(StarDemandOmCreateChallengeV2ChallengeInfoProviderScope providerScope) {
    this.providerScope = providerScope;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo sampleVideo(List<Long> sampleVideo) {
    
    this.sampleVideo = sampleVideo;
    return this;
  }

  public StarDemandOmCreateChallengeV2RequestChallengeInfo addSampleVideoItem(Long sampleVideoItem) {
    if (this.sampleVideo == null) {
      this.sampleVideo = new ArrayList<>();
    }
    this.sampleVideo.add(sampleVideoItem);
    return this;
  }

   /**
   * 示例视频id list&lt;i64&gt; 最多5个
   * @return sampleVideo
  **/
  @javax.annotation.Nullable
  public List<Long> getSampleVideo() {
    return sampleVideo;
  }


  public void setSampleVideo(List<Long> sampleVideo) {
    this.sampleVideo = sampleVideo;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo startPage(String startPage) {
    
    this.startPage = startPage;
    return this;
  }

   /**
   * 小程序落地页地址 字符串，支持校验合规性
   * @return startPage
  **/
  @javax.annotation.Nullable
  public String getStartPage() {
    return startPage;
  }


  public void setStartPage(String startPage) {
    this.startPage = startPage;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo taskHeadImage(String taskHeadImage) {
    
    this.taskHeadImage = taskHeadImage;
    return this;
  }

   /**
   * 任务头图 URL文本
   * @return taskHeadImage
  **/
  @javax.annotation.Nullable
  public String getTaskHeadImage() {
    return taskHeadImage;
  }


  public void setTaskHeadImage(String taskHeadImage) {
    this.taskHeadImage = taskHeadImage;
  }


  public StarDemandOmCreateChallengeV2RequestChallengeInfo taskIcon(String taskIcon) {
    
    this.taskIcon = taskIcon;
    return this;
  }

   /**
   * 任务图标 URL文本
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
    StarDemandOmCreateChallengeV2RequestChallengeInfo starDemandOmCreateChallengeV2RequestChallengeInfo = (StarDemandOmCreateChallengeV2RequestChallengeInfo) o;
    return Objects.equals(this.accountDivideDay, starDemandOmCreateChallengeV2RequestChallengeInfo.accountDivideDay) &&
        Objects.equals(this.anchorTitle, starDemandOmCreateChallengeV2RequestChallengeInfo.anchorTitle) &&
        Objects.equals(this.authorScope, starDemandOmCreateChallengeV2RequestChallengeInfo.authorScope) &&
        Objects.equals(this.authorTaskName, starDemandOmCreateChallengeV2RequestChallengeInfo.authorTaskName) &&
        Objects.equals(this.commissionInfo, starDemandOmCreateChallengeV2RequestChallengeInfo.commissionInfo) &&
        Objects.equals(this.commissionRate, starDemandOmCreateChallengeV2RequestChallengeInfo.commissionRate) &&
        Objects.equals(this.commissionType, starDemandOmCreateChallengeV2RequestChallengeInfo.commissionType) &&
        Objects.equals(this.demandDesc, starDemandOmCreateChallengeV2RequestChallengeInfo.demandDesc) &&
        Objects.equals(this.microAppId, starDemandOmCreateChallengeV2RequestChallengeInfo.microAppId) &&
        Objects.equals(this.omTaskTag, starDemandOmCreateChallengeV2RequestChallengeInfo.omTaskTag) &&
        Objects.equals(this.participateAuthorRange, starDemandOmCreateChallengeV2RequestChallengeInfo.participateAuthorRange) &&
        Objects.equals(this.participateProviderRange, starDemandOmCreateChallengeV2RequestChallengeInfo.participateProviderRange) &&
        Objects.equals(this.providerScope, starDemandOmCreateChallengeV2RequestChallengeInfo.providerScope) &&
        Objects.equals(this.sampleVideo, starDemandOmCreateChallengeV2RequestChallengeInfo.sampleVideo) &&
        Objects.equals(this.startPage, starDemandOmCreateChallengeV2RequestChallengeInfo.startPage) &&
        Objects.equals(this.taskHeadImage, starDemandOmCreateChallengeV2RequestChallengeInfo.taskHeadImage) &&
        Objects.equals(this.taskIcon, starDemandOmCreateChallengeV2RequestChallengeInfo.taskIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDivideDay, anchorTitle, authorScope, authorTaskName, commissionInfo, commissionRate, commissionType, demandDesc, microAppId, omTaskTag, participateAuthorRange, participateProviderRange, providerScope, sampleVideo, startPage, taskHeadImage, taskIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmCreateChallengeV2RequestChallengeInfo {\n");
    sb.append("    accountDivideDay: ").append(toIndentedString(accountDivideDay)).append("\n");
    sb.append("    anchorTitle: ").append(toIndentedString(anchorTitle)).append("\n");
    sb.append("    authorScope: ").append(toIndentedString(authorScope)).append("\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    commissionInfo: ").append(toIndentedString(commissionInfo)).append("\n");
    sb.append("    commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
    sb.append("    commissionType: ").append(toIndentedString(commissionType)).append("\n");
    sb.append("    demandDesc: ").append(toIndentedString(demandDesc)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    omTaskTag: ").append(toIndentedString(omTaskTag)).append("\n");
    sb.append("    participateAuthorRange: ").append(toIndentedString(participateAuthorRange)).append("\n");
    sb.append("    participateProviderRange: ").append(toIndentedString(participateProviderRange)).append("\n");
    sb.append("    providerScope: ").append(toIndentedString(providerScope)).append("\n");
    sb.append("    sampleVideo: ").append(toIndentedString(sampleVideo)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
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
    openapiFields.add("author_scope");
    openapiFields.add("author_task_name");
    openapiFields.add("commission_info");
    openapiFields.add("commission_rate");
    openapiFields.add("commission_type");
    openapiFields.add("demand_desc");
    openapiFields.add("micro_app_id");
    openapiFields.add("om_task_tag");
    openapiFields.add("participate_author_range");
    openapiFields.add("participate_provider_range");
    openapiFields.add("provider_scope");
    openapiFields.add("sample_video");
    openapiFields.add("start_page");
    openapiFields.add("task_head_image");
    openapiFields.add("task_icon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_divide_day");
    openapiRequiredFields.add("anchor_title");
    openapiRequiredFields.add("author_scope");
    openapiRequiredFields.add("author_task_name");
    openapiRequiredFields.add("commission_type");
    openapiRequiredFields.add("micro_app_id");
    openapiRequiredFields.add("om_task_tag");
    openapiRequiredFields.add("task_icon");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmCreateChallengeV2RequestChallengeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmCreateChallengeV2RequestChallengeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmCreateChallengeV2RequestChallengeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmCreateChallengeV2RequestChallengeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmCreateChallengeV2RequestChallengeInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandOmCreateChallengeV2RequestChallengeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmCreateChallengeV2RequestChallengeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmCreateChallengeV2RequestChallengeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmCreateChallengeV2RequestChallengeInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmCreateChallengeV2RequestChallengeInfo
  */
  public static StarDemandOmCreateChallengeV2RequestChallengeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmCreateChallengeV2RequestChallengeInfo.class);
  }

 /**
  * Convert an instance of StarDemandOmCreateChallengeV2RequestChallengeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

