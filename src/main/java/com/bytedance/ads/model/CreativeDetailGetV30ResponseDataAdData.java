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
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataAnchorRelatedType;
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataAnchorType;
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataDynamicCreativeSwitch;
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataEnableSmartSource;
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataParamsType;
import com.bytedance.ads.model.CreativeDetailGetV30DataAdDataPriorityTrial;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataAdDataMiniProgramInfo;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataAdDataSupplementsInner;
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
 * 基础创意信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataAdData {
  public static final String SERIALIZED_NAME_AD_DOWNLOAD_STATUS = "ad_download_status";
  @SerializedName(SERIALIZED_NAME_AD_DOWNLOAD_STATUS)
  private Long adDownloadStatus = null;

  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_RELATED_TYPE = "anchor_related_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_RELATED_TYPE)
  private CreativeDetailGetV30DataAdDataAnchorRelatedType anchorRelatedType = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private CreativeDetailGetV30DataAdDataAnchorType anchorType = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH = "creative_auto_generate_switch";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH)
  private Long creativeAutoGenerateSwitch = null;

  public static final String SERIALIZED_NAME_DPA_EXTERNAL_URL_FIELD = "dpa_external_url_field";
  @SerializedName(SERIALIZED_NAME_DPA_EXTERNAL_URL_FIELD)
  private String dpaExternalUrlField = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH = "dynamic_creative_switch";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH)
  private List<CreativeDetailGetV30DataAdDataDynamicCreativeSwitch> dynamicCreativeSwitch = null;

  public static final String SERIALIZED_NAME_ENABLE_SMART_SOURCE = "enable_smart_source";
  @SerializedName(SERIALIZED_NAME_ENABLE_SMART_SOURCE)
  private CreativeDetailGetV30DataAdDataEnableSmartSource enableSmartSource = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_PARAMS = "external_url_params";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_PARAMS)
  private String externalUrlParams = null;

  public static final String SERIALIZED_NAME_IES_CORE_USER_ID = "ies_core_user_id";
  @SerializedName(SERIALIZED_NAME_IES_CORE_USER_ID)
  private String iesCoreUserId = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private Long isCommentDisable = null;

  public static final String SERIALIZED_NAME_IS_FEED_AND_FAV_SEE = "is_feed_and_fav_see";
  @SerializedName(SERIALIZED_NAME_IS_FEED_AND_FAV_SEE)
  private Long isFeedAndFavSee = null;

  public static final String SERIALIZED_NAME_IS_PRESENTED_VIDEO = "is_presented_video";
  @SerializedName(SERIALIZED_NAME_IS_PRESENTED_VIDEO)
  private Long isPresentedVideo = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_INFO = "mini_program_info";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_INFO)
  private CreativeDetailGetV30ResponseDataAdDataMiniProgramInfo miniProgramInfo = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PARAMS_TYPE = "params_type";
  @SerializedName(SERIALIZED_NAME_PARAMS_TYPE)
  private CreativeDetailGetV30DataAdDataParamsType paramsType = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_PRIORITY_TRIAL = "priority_trial";
  @SerializedName(SERIALIZED_NAME_PRIORITY_TRIAL)
  private CreativeDetailGetV30DataAdDataPriorityTrial priorityTrial = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_SUPPLEMENTS = "supplements";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTS)
  private List<CreativeDetailGetV30ResponseDataAdDataSupplementsInner> supplements = null;

  public static final String SERIALIZED_NAME_THIRD_INDUSTRY_ID = "third_industry_id";
  @SerializedName(SERIALIZED_NAME_THIRD_INDUSTRY_ID)
  private Long thirdIndustryId = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public CreativeDetailGetV30ResponseDataAdData() {
  }

  public CreativeDetailGetV30ResponseDataAdData adDownloadStatus(Long adDownloadStatus) {
    
    this.adDownloadStatus = adDownloadStatus;
    return this;
  }

   /**
   * 是否允许客户端下载视频
   * @return adDownloadStatus
  **/
  @javax.annotation.Nullable
  public Long getAdDownloadStatus() {
    return adDownloadStatus;
  }


  public void setAdDownloadStatus(Long adDownloadStatus) {
    this.adDownloadStatus = adDownloadStatus;
  }


  public CreativeDetailGetV30ResponseDataAdData adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public CreativeDetailGetV30ResponseDataAdData addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 创意标签
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public CreativeDetailGetV30ResponseDataAdData anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public CreativeDetailGetV30ResponseDataAdData anchorRelatedType(CreativeDetailGetV30DataAdDataAnchorRelatedType anchorRelatedType) {
    
    this.anchorRelatedType = anchorRelatedType;
    return this;
  }

   /**
   * Get anchorRelatedType
   * @return anchorRelatedType
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataAdDataAnchorRelatedType getAnchorRelatedType() {
    return anchorRelatedType;
  }


  public void setAnchorRelatedType(CreativeDetailGetV30DataAdDataAnchorRelatedType anchorRelatedType) {
    this.anchorRelatedType = anchorRelatedType;
  }


  public CreativeDetailGetV30ResponseDataAdData anchorType(CreativeDetailGetV30DataAdDataAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataAdDataAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(CreativeDetailGetV30DataAdDataAnchorType anchorType) {
    this.anchorType = anchorType;
  }


  public CreativeDetailGetV30ResponseDataAdData appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public CreativeDetailGetV30ResponseDataAdData creativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

   /**
   * 是否开启自动派生创意
   * @return creativeAutoGenerateSwitch
  **/
  @javax.annotation.Nullable
  public Long getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }


  public void setCreativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }


  public CreativeDetailGetV30ResponseDataAdData dpaExternalUrlField(String dpaExternalUrlField) {
    
    this.dpaExternalUrlField = dpaExternalUrlField;
    return this;
  }

   /**
   * 落地页链接字段选择
   * @return dpaExternalUrlField
  **/
  @javax.annotation.Nullable
  public String getDpaExternalUrlField() {
    return dpaExternalUrlField;
  }


  public void setDpaExternalUrlField(String dpaExternalUrlField) {
    this.dpaExternalUrlField = dpaExternalUrlField;
  }


  public CreativeDetailGetV30ResponseDataAdData dynamicCreativeSwitch(List<CreativeDetailGetV30DataAdDataDynamicCreativeSwitch> dynamicCreativeSwitch) {
    
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
    return this;
  }

  public CreativeDetailGetV30ResponseDataAdData addDynamicCreativeSwitchItem(CreativeDetailGetV30DataAdDataDynamicCreativeSwitch dynamicCreativeSwitchItem) {
    if (this.dynamicCreativeSwitch == null) {
      this.dynamicCreativeSwitch = new ArrayList<>();
    }
    this.dynamicCreativeSwitch.add(dynamicCreativeSwitchItem);
    return this;
  }

   /**
   * 启用动态创意类型
   * @return dynamicCreativeSwitch
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30DataAdDataDynamicCreativeSwitch> getDynamicCreativeSwitch() {
    return dynamicCreativeSwitch;
  }


  public void setDynamicCreativeSwitch(List<CreativeDetailGetV30DataAdDataDynamicCreativeSwitch> dynamicCreativeSwitch) {
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
  }


  public CreativeDetailGetV30ResponseDataAdData enableSmartSource(CreativeDetailGetV30DataAdDataEnableSmartSource enableSmartSource) {
    
    this.enableSmartSource = enableSmartSource;
    return this;
  }

   /**
   * Get enableSmartSource
   * @return enableSmartSource
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataAdDataEnableSmartSource getEnableSmartSource() {
    return enableSmartSource;
  }


  public void setEnableSmartSource(CreativeDetailGetV30DataAdDataEnableSmartSource enableSmartSource) {
    this.enableSmartSource = enableSmartSource;
  }


  public CreativeDetailGetV30ResponseDataAdData externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 落地页链接
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public CreativeDetailGetV30ResponseDataAdData externalUrlParams(String externalUrlParams) {
    
    this.externalUrlParams = externalUrlParams;
    return this;
  }

   /**
   * 落地页检测参数
   * @return externalUrlParams
  **/
  @javax.annotation.Nullable
  public String getExternalUrlParams() {
    return externalUrlParams;
  }


  public void setExternalUrlParams(String externalUrlParams) {
    this.externalUrlParams = externalUrlParams;
  }


  public CreativeDetailGetV30ResponseDataAdData iesCoreUserId(String iesCoreUserId) {
    
    this.iesCoreUserId = iesCoreUserId;
    return this;
  }

   /**
   * 绑定抖音号
   * @return iesCoreUserId
  **/
  @javax.annotation.Nullable
  public String getIesCoreUserId() {
    return iesCoreUserId;
  }


  public void setIesCoreUserId(String iesCoreUserId) {
    this.iesCoreUserId = iesCoreUserId;
  }


  public CreativeDetailGetV30ResponseDataAdData isCommentDisable(Long isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * 是否关闭评论
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public Long getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(Long isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public CreativeDetailGetV30ResponseDataAdData isFeedAndFavSee(Long isFeedAndFavSee) {
    
    this.isFeedAndFavSee = isFeedAndFavSee;
    return this;
  }

   /**
   * 主页作品列表隐藏广告内容
   * @return isFeedAndFavSee
  **/
  @javax.annotation.Nullable
  public Long getIsFeedAndFavSee() {
    return isFeedAndFavSee;
  }


  public void setIsFeedAndFavSee(Long isFeedAndFavSee) {
    this.isFeedAndFavSee = isFeedAndFavSee;
  }


  public CreativeDetailGetV30ResponseDataAdData isPresentedVideo(Long isPresentedVideo) {
    
    this.isPresentedVideo = isPresentedVideo;
    return this;
  }

   /**
   * 自动生成视频素材
   * @return isPresentedVideo
  **/
  @javax.annotation.Nullable
  public Long getIsPresentedVideo() {
    return isPresentedVideo;
  }


  public void setIsPresentedVideo(Long isPresentedVideo) {
    this.isPresentedVideo = isPresentedVideo;
  }


  public CreativeDetailGetV30ResponseDataAdData miniProgramInfo(CreativeDetailGetV30ResponseDataAdDataMiniProgramInfo miniProgramInfo) {
    
    this.miniProgramInfo = miniProgramInfo;
    return this;
  }

   /**
   * Get miniProgramInfo
   * @return miniProgramInfo
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataAdDataMiniProgramInfo getMiniProgramInfo() {
    return miniProgramInfo;
  }


  public void setMiniProgramInfo(CreativeDetailGetV30ResponseDataAdDataMiniProgramInfo miniProgramInfo) {
    this.miniProgramInfo = miniProgramInfo;
  }


  public CreativeDetailGetV30ResponseDataAdData openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 直达链接
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public CreativeDetailGetV30ResponseDataAdData paramsType(CreativeDetailGetV30DataAdDataParamsType paramsType) {
    
    this.paramsType = paramsType;
    return this;
  }

   /**
   * Get paramsType
   * @return paramsType
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataAdDataParamsType getParamsType() {
    return paramsType;
  }


  public void setParamsType(CreativeDetailGetV30DataAdDataParamsType paramsType) {
    this.paramsType = paramsType;
  }


  public CreativeDetailGetV30ResponseDataAdData playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 搭配试玩素材URL
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public CreativeDetailGetV30ResponseDataAdData priorityTrial(CreativeDetailGetV30DataAdDataPriorityTrial priorityTrial) {
    
    this.priorityTrial = priorityTrial;
    return this;
  }

   /**
   * Get priorityTrial
   * @return priorityTrial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataAdDataPriorityTrial getPriorityTrial() {
    return priorityTrial;
  }


  public void setPriorityTrial(CreativeDetailGetV30DataAdDataPriorityTrial priorityTrial) {
    this.priorityTrial = priorityTrial;
  }


  public CreativeDetailGetV30ResponseDataAdData source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 广告来源
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public CreativeDetailGetV30ResponseDataAdData supplements(List<CreativeDetailGetV30ResponseDataAdDataSupplementsInner> supplements) {
    
    this.supplements = supplements;
    return this;
  }

  public CreativeDetailGetV30ResponseDataAdData addSupplementsItem(CreativeDetailGetV30ResponseDataAdDataSupplementsInner supplementsItem) {
    if (this.supplements == null) {
      this.supplements = new ArrayList<>();
    }
    this.supplements.add(supplementsItem);
    return this;
  }

   /**
   * 
   * @return supplements
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataAdDataSupplementsInner> getSupplements() {
    return supplements;
  }


  public void setSupplements(List<CreativeDetailGetV30ResponseDataAdDataSupplementsInner> supplements) {
    this.supplements = supplements;
  }


  public CreativeDetailGetV30ResponseDataAdData thirdIndustryId(Long thirdIndustryId) {
    
    this.thirdIndustryId = thirdIndustryId;
    return this;
  }

   /**
   * 三级行业ID
   * @return thirdIndustryId
  **/
  @javax.annotation.Nullable
  public Long getThirdIndustryId() {
    return thirdIndustryId;
  }


  public void setThirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
  }


  public CreativeDetailGetV30ResponseDataAdData webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * Android应用下载详情页
   * @return webUrl
  **/
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseDataAdData creativeDetailGetV30ResponseDataAdData = (CreativeDetailGetV30ResponseDataAdData) o;
    return Objects.equals(this.adDownloadStatus, creativeDetailGetV30ResponseDataAdData.adDownloadStatus) &&
        Objects.equals(this.adKeywords, creativeDetailGetV30ResponseDataAdData.adKeywords) &&
        Objects.equals(this.anchorId, creativeDetailGetV30ResponseDataAdData.anchorId) &&
        Objects.equals(this.anchorRelatedType, creativeDetailGetV30ResponseDataAdData.anchorRelatedType) &&
        Objects.equals(this.anchorType, creativeDetailGetV30ResponseDataAdData.anchorType) &&
        Objects.equals(this.appName, creativeDetailGetV30ResponseDataAdData.appName) &&
        Objects.equals(this.creativeAutoGenerateSwitch, creativeDetailGetV30ResponseDataAdData.creativeAutoGenerateSwitch) &&
        Objects.equals(this.dpaExternalUrlField, creativeDetailGetV30ResponseDataAdData.dpaExternalUrlField) &&
        Objects.equals(this.dynamicCreativeSwitch, creativeDetailGetV30ResponseDataAdData.dynamicCreativeSwitch) &&
        Objects.equals(this.enableSmartSource, creativeDetailGetV30ResponseDataAdData.enableSmartSource) &&
        Objects.equals(this.externalUrl, creativeDetailGetV30ResponseDataAdData.externalUrl) &&
        Objects.equals(this.externalUrlParams, creativeDetailGetV30ResponseDataAdData.externalUrlParams) &&
        Objects.equals(this.iesCoreUserId, creativeDetailGetV30ResponseDataAdData.iesCoreUserId) &&
        Objects.equals(this.isCommentDisable, creativeDetailGetV30ResponseDataAdData.isCommentDisable) &&
        Objects.equals(this.isFeedAndFavSee, creativeDetailGetV30ResponseDataAdData.isFeedAndFavSee) &&
        Objects.equals(this.isPresentedVideo, creativeDetailGetV30ResponseDataAdData.isPresentedVideo) &&
        Objects.equals(this.miniProgramInfo, creativeDetailGetV30ResponseDataAdData.miniProgramInfo) &&
        Objects.equals(this.openUrl, creativeDetailGetV30ResponseDataAdData.openUrl) &&
        Objects.equals(this.paramsType, creativeDetailGetV30ResponseDataAdData.paramsType) &&
        Objects.equals(this.playableUrl, creativeDetailGetV30ResponseDataAdData.playableUrl) &&
        Objects.equals(this.priorityTrial, creativeDetailGetV30ResponseDataAdData.priorityTrial) &&
        Objects.equals(this.source, creativeDetailGetV30ResponseDataAdData.source) &&
        Objects.equals(this.supplements, creativeDetailGetV30ResponseDataAdData.supplements) &&
        Objects.equals(this.thirdIndustryId, creativeDetailGetV30ResponseDataAdData.thirdIndustryId) &&
        Objects.equals(this.webUrl, creativeDetailGetV30ResponseDataAdData.webUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adDownloadStatus, adKeywords, anchorId, anchorRelatedType, anchorType, appName, creativeAutoGenerateSwitch, dpaExternalUrlField, dynamicCreativeSwitch, enableSmartSource, externalUrl, externalUrlParams, iesCoreUserId, isCommentDisable, isFeedAndFavSee, isPresentedVideo, miniProgramInfo, openUrl, paramsType, playableUrl, priorityTrial, source, supplements, thirdIndustryId, webUrl);
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
    sb.append("class CreativeDetailGetV30ResponseDataAdData {\n");
    sb.append("    adDownloadStatus: ").append(toIndentedString(adDownloadStatus)).append("\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorRelatedType: ").append(toIndentedString(anchorRelatedType)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    creativeAutoGenerateSwitch: ").append(toIndentedString(creativeAutoGenerateSwitch)).append("\n");
    sb.append("    dpaExternalUrlField: ").append(toIndentedString(dpaExternalUrlField)).append("\n");
    sb.append("    dynamicCreativeSwitch: ").append(toIndentedString(dynamicCreativeSwitch)).append("\n");
    sb.append("    enableSmartSource: ").append(toIndentedString(enableSmartSource)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    externalUrlParams: ").append(toIndentedString(externalUrlParams)).append("\n");
    sb.append("    iesCoreUserId: ").append(toIndentedString(iesCoreUserId)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    isFeedAndFavSee: ").append(toIndentedString(isFeedAndFavSee)).append("\n");
    sb.append("    isPresentedVideo: ").append(toIndentedString(isPresentedVideo)).append("\n");
    sb.append("    miniProgramInfo: ").append(toIndentedString(miniProgramInfo)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    paramsType: ").append(toIndentedString(paramsType)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    priorityTrial: ").append(toIndentedString(priorityTrial)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    supplements: ").append(toIndentedString(supplements)).append("\n");
    sb.append("    thirdIndustryId: ").append(toIndentedString(thirdIndustryId)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
    openapiFields.add("ad_download_status");
    openapiFields.add("ad_keywords");
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_related_type");
    openapiFields.add("anchor_type");
    openapiFields.add("app_name");
    openapiFields.add("creative_auto_generate_switch");
    openapiFields.add("dpa_external_url_field");
    openapiFields.add("dynamic_creative_switch");
    openapiFields.add("enable_smart_source");
    openapiFields.add("external_url");
    openapiFields.add("external_url_params");
    openapiFields.add("ies_core_user_id");
    openapiFields.add("is_comment_disable");
    openapiFields.add("is_feed_and_fav_see");
    openapiFields.add("is_presented_video");
    openapiFields.add("mini_program_info");
    openapiFields.add("open_url");
    openapiFields.add("params_type");
    openapiFields.add("playable_url");
    openapiFields.add("priority_trial");
    openapiFields.add("source");
    openapiFields.add("supplements");
    openapiFields.add("third_industry_id");
    openapiFields.add("web_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataAdData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataAdData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataAdData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataAdData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataAdData>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataAdData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataAdData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataAdData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataAdData
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataAdData
  */
  public static CreativeDetailGetV30ResponseDataAdData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataAdData.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataAdData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

