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
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListAuditStatus;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListMaxPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListMaxRechargeTier;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListMembershipType;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListMidPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListMinPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListMinRechargeTier;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListPaymentForm;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListRecommendedRechargeTier;
import com.bytedance.ads.model.ToolsWechatAppletListV30DataListRevenueModel;
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
 * ToolsWechatAppletListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ToolsWechatAppletListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ToolsWechatAppletListV30DataListAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DISCOUNT_RATE = "discount_rate";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_RATE)
  private Long discountRate = null;

  public static final String SERIALIZED_NAME_GUIDE_TEXT = "guide_text";
  @SerializedName(SERIALIZED_NAME_GUIDE_TEXT)
  private String guideText = null;

  public static final String SERIALIZED_NAME_HAS_DISCOUNT = "has_discount";
  @SerializedName(SERIALIZED_NAME_HAS_DISCOUNT)
  private Boolean hasDiscount = null;

  public static final String SERIALIZED_NAME_HAS_ONLINE_EARNING = "has_online_earning";
  @SerializedName(SERIALIZED_NAME_HAS_ONLINE_EARNING)
  private Boolean hasOnlineEarning = null;

  public static final String SERIALIZED_NAME_HEADER_IMAGE_URL = "header_image_url";
  @SerializedName(SERIALIZED_NAME_HEADER_IMAGE_URL)
  private String headerImageUrl = null;

  public static final String SERIALIZED_NAME_ICON_IMAGE_URL = "icon_image_url";
  @SerializedName(SERIALIZED_NAME_ICON_IMAGE_URL)
  private String iconImageUrl = null;

  public static final String SERIALIZED_NAME_IMAGES_HORIZONTAL_URL = "images_horizontal_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_HORIZONTAL_URL)
  private List<String> imagesHorizontalUrl = null;

  public static final String SERIALIZED_NAME_IMAGES_VERTICAL_URL = "images_vertical_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_VERTICAL_URL)
  private List<String> imagesVerticalUrl = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE = "max_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE)
  private ToolsWechatAppletListV30DataListMaxPaymentTierRange maxPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MAX_RECHARGE_TIER = "max_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MAX_RECHARGE_TIER)
  private ToolsWechatAppletListV30DataListMaxRechargeTier maxRechargeTier = null;

  public static final String SERIALIZED_NAME_MEMBERSHIP_TYPE = "membership_type";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_TYPE)
  private ToolsWechatAppletListV30DataListMembershipType membershipType = null;

  public static final String SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE = "mid_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE)
  private ToolsWechatAppletListV30DataListMidPaymentTierRange midPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE = "min_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE)
  private ToolsWechatAppletListV30DataListMinPaymentTierRange minPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_RECHARGE_TIER = "min_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MIN_RECHARGE_TIER)
  private ToolsWechatAppletListV30DataListMinRechargeTier minRechargeTier = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = null;

  public static final String SERIALIZED_NAME_PAYMENT_FORM = "payment_form";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FORM)
  private ToolsWechatAppletListV30DataListPaymentForm paymentForm = null;

  public static final String SERIALIZED_NAME_PROP_NAME = "prop_name";
  @SerializedName(SERIALIZED_NAME_PROP_NAME)
  private String propName = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER = "recommended_recharge_tier";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER)
  private ToolsWechatAppletListV30DataListRecommendedRechargeTier recommendedRechargeTier = null;

  public static final String SERIALIZED_NAME_REMARK_MESSAGE = "remark_message";
  @SerializedName(SERIALIZED_NAME_REMARK_MESSAGE)
  private String remarkMessage = null;

  public static final String SERIALIZED_NAME_REVENUE_MODEL = "revenue_model";
  @SerializedName(SERIALIZED_NAME_REVENUE_MODEL)
  private ToolsWechatAppletListV30DataListRevenueModel revenueModel = null;

  public static final String SERIALIZED_NAME_TAG_INFO = "tag_info";
  @SerializedName(SERIALIZED_NAME_TAG_INFO)
  private String tagInfo = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName = null;

  public ToolsWechatAppletListV30ResponseDataListInner() {
  }

  public ToolsWechatAppletListV30ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsWechatAppletListV30ResponseDataListInner auditStatus(ToolsWechatAppletListV30DataListAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ToolsWechatAppletListV30DataListAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ToolsWechatAppletListV30ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsWechatAppletListV30ResponseDataListInner discountRate(Long discountRate) {
    
    this.discountRate = discountRate;
    return this;
  }

   /**
   * 
   * @return discountRate
  **/
  @javax.annotation.Nullable
  public Long getDiscountRate() {
    return discountRate;
  }


  public void setDiscountRate(Long discountRate) {
    this.discountRate = discountRate;
  }


  public ToolsWechatAppletListV30ResponseDataListInner guideText(String guideText) {
    
    this.guideText = guideText;
    return this;
  }

   /**
   * 
   * @return guideText
  **/
  @javax.annotation.Nullable
  public String getGuideText() {
    return guideText;
  }


  public void setGuideText(String guideText) {
    this.guideText = guideText;
  }


  public ToolsWechatAppletListV30ResponseDataListInner hasDiscount(Boolean hasDiscount) {
    
    this.hasDiscount = hasDiscount;
    return this;
  }

   /**
   * 
   * @return hasDiscount
  **/
  @javax.annotation.Nullable
  public Boolean getHasDiscount() {
    return hasDiscount;
  }


  public void setHasDiscount(Boolean hasDiscount) {
    this.hasDiscount = hasDiscount;
  }


  public ToolsWechatAppletListV30ResponseDataListInner hasOnlineEarning(Boolean hasOnlineEarning) {
    
    this.hasOnlineEarning = hasOnlineEarning;
    return this;
  }

   /**
   * 
   * @return hasOnlineEarning
  **/
  @javax.annotation.Nullable
  public Boolean getHasOnlineEarning() {
    return hasOnlineEarning;
  }


  public void setHasOnlineEarning(Boolean hasOnlineEarning) {
    this.hasOnlineEarning = hasOnlineEarning;
  }


  public ToolsWechatAppletListV30ResponseDataListInner headerImageUrl(String headerImageUrl) {
    
    this.headerImageUrl = headerImageUrl;
    return this;
  }

   /**
   * 
   * @return headerImageUrl
  **/
  @javax.annotation.Nullable
  public String getHeaderImageUrl() {
    return headerImageUrl;
  }


  public void setHeaderImageUrl(String headerImageUrl) {
    this.headerImageUrl = headerImageUrl;
  }


  public ToolsWechatAppletListV30ResponseDataListInner iconImageUrl(String iconImageUrl) {
    
    this.iconImageUrl = iconImageUrl;
    return this;
  }

   /**
   * 
   * @return iconImageUrl
  **/
  @javax.annotation.Nullable
  public String getIconImageUrl() {
    return iconImageUrl;
  }


  public void setIconImageUrl(String iconImageUrl) {
    this.iconImageUrl = iconImageUrl;
  }


  public ToolsWechatAppletListV30ResponseDataListInner imagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    
    this.imagesHorizontalUrl = imagesHorizontalUrl;
    return this;
  }

  public ToolsWechatAppletListV30ResponseDataListInner addImagesHorizontalUrlItem(String imagesHorizontalUrlItem) {
    if (this.imagesHorizontalUrl == null) {
      this.imagesHorizontalUrl = new ArrayList<>();
    }
    this.imagesHorizontalUrl.add(imagesHorizontalUrlItem);
    return this;
  }

   /**
   * 
   * @return imagesHorizontalUrl
  **/
  @javax.annotation.Nullable
  public List<String> getImagesHorizontalUrl() {
    return imagesHorizontalUrl;
  }


  public void setImagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    this.imagesHorizontalUrl = imagesHorizontalUrl;
  }


  public ToolsWechatAppletListV30ResponseDataListInner imagesVerticalUrl(List<String> imagesVerticalUrl) {
    
    this.imagesVerticalUrl = imagesVerticalUrl;
    return this;
  }

  public ToolsWechatAppletListV30ResponseDataListInner addImagesVerticalUrlItem(String imagesVerticalUrlItem) {
    if (this.imagesVerticalUrl == null) {
      this.imagesVerticalUrl = new ArrayList<>();
    }
    this.imagesVerticalUrl.add(imagesVerticalUrlItem);
    return this;
  }

   /**
   * 
   * @return imagesVerticalUrl
  **/
  @javax.annotation.Nullable
  public List<String> getImagesVerticalUrl() {
    return imagesVerticalUrl;
  }


  public void setImagesVerticalUrl(List<String> imagesVerticalUrl) {
    this.imagesVerticalUrl = imagesVerticalUrl;
  }


  public ToolsWechatAppletListV30ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsWechatAppletListV30ResponseDataListInner introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 
   * @return introduction
  **/
  @javax.annotation.Nullable
  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ToolsWechatAppletListV30ResponseDataListInner labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ToolsWechatAppletListV30ResponseDataListInner addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * 
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public ToolsWechatAppletListV30ResponseDataListInner maxPaymentTierRange(ToolsWechatAppletListV30DataListMaxPaymentTierRange maxPaymentTierRange) {
    
    this.maxPaymentTierRange = maxPaymentTierRange;
    return this;
  }

   /**
   * Get maxPaymentTierRange
   * @return maxPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListMaxPaymentTierRange getMaxPaymentTierRange() {
    return maxPaymentTierRange;
  }


  public void setMaxPaymentTierRange(ToolsWechatAppletListV30DataListMaxPaymentTierRange maxPaymentTierRange) {
    this.maxPaymentTierRange = maxPaymentTierRange;
  }


  public ToolsWechatAppletListV30ResponseDataListInner maxRechargeTier(ToolsWechatAppletListV30DataListMaxRechargeTier maxRechargeTier) {
    
    this.maxRechargeTier = maxRechargeTier;
    return this;
  }

   /**
   * Get maxRechargeTier
   * @return maxRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListMaxRechargeTier getMaxRechargeTier() {
    return maxRechargeTier;
  }


  public void setMaxRechargeTier(ToolsWechatAppletListV30DataListMaxRechargeTier maxRechargeTier) {
    this.maxRechargeTier = maxRechargeTier;
  }


  public ToolsWechatAppletListV30ResponseDataListInner membershipType(ToolsWechatAppletListV30DataListMembershipType membershipType) {
    
    this.membershipType = membershipType;
    return this;
  }

   /**
   * Get membershipType
   * @return membershipType
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListMembershipType getMembershipType() {
    return membershipType;
  }


  public void setMembershipType(ToolsWechatAppletListV30DataListMembershipType membershipType) {
    this.membershipType = membershipType;
  }


  public ToolsWechatAppletListV30ResponseDataListInner midPaymentTierRange(ToolsWechatAppletListV30DataListMidPaymentTierRange midPaymentTierRange) {
    
    this.midPaymentTierRange = midPaymentTierRange;
    return this;
  }

   /**
   * Get midPaymentTierRange
   * @return midPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListMidPaymentTierRange getMidPaymentTierRange() {
    return midPaymentTierRange;
  }


  public void setMidPaymentTierRange(ToolsWechatAppletListV30DataListMidPaymentTierRange midPaymentTierRange) {
    this.midPaymentTierRange = midPaymentTierRange;
  }


  public ToolsWechatAppletListV30ResponseDataListInner minPaymentTierRange(ToolsWechatAppletListV30DataListMinPaymentTierRange minPaymentTierRange) {
    
    this.minPaymentTierRange = minPaymentTierRange;
    return this;
  }

   /**
   * Get minPaymentTierRange
   * @return minPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListMinPaymentTierRange getMinPaymentTierRange() {
    return minPaymentTierRange;
  }


  public void setMinPaymentTierRange(ToolsWechatAppletListV30DataListMinPaymentTierRange minPaymentTierRange) {
    this.minPaymentTierRange = minPaymentTierRange;
  }


  public ToolsWechatAppletListV30ResponseDataListInner minRechargeTier(ToolsWechatAppletListV30DataListMinRechargeTier minRechargeTier) {
    
    this.minRechargeTier = minRechargeTier;
    return this;
  }

   /**
   * Get minRechargeTier
   * @return minRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListMinRechargeTier getMinRechargeTier() {
    return minRechargeTier;
  }


  public void setMinRechargeTier(ToolsWechatAppletListV30DataListMinRechargeTier minRechargeTier) {
    this.minRechargeTier = minRechargeTier;
  }


  public ToolsWechatAppletListV30ResponseDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public ToolsWechatAppletListV30ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsWechatAppletListV30ResponseDataListInner path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * 
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ToolsWechatAppletListV30ResponseDataListInner paymentForm(ToolsWechatAppletListV30DataListPaymentForm paymentForm) {
    
    this.paymentForm = paymentForm;
    return this;
  }

   /**
   * Get paymentForm
   * @return paymentForm
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListPaymentForm getPaymentForm() {
    return paymentForm;
  }


  public void setPaymentForm(ToolsWechatAppletListV30DataListPaymentForm paymentForm) {
    this.paymentForm = paymentForm;
  }


  public ToolsWechatAppletListV30ResponseDataListInner propName(String propName) {
    
    this.propName = propName;
    return this;
  }

   /**
   * 
   * @return propName
  **/
  @javax.annotation.Nullable
  public String getPropName() {
    return propName;
  }


  public void setPropName(String propName) {
    this.propName = propName;
  }


  public ToolsWechatAppletListV30ResponseDataListInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ToolsWechatAppletListV30ResponseDataListInner recommendedRechargeTier(ToolsWechatAppletListV30DataListRecommendedRechargeTier recommendedRechargeTier) {
    
    this.recommendedRechargeTier = recommendedRechargeTier;
    return this;
  }

   /**
   * Get recommendedRechargeTier
   * @return recommendedRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListRecommendedRechargeTier getRecommendedRechargeTier() {
    return recommendedRechargeTier;
  }


  public void setRecommendedRechargeTier(ToolsWechatAppletListV30DataListRecommendedRechargeTier recommendedRechargeTier) {
    this.recommendedRechargeTier = recommendedRechargeTier;
  }


  public ToolsWechatAppletListV30ResponseDataListInner remarkMessage(String remarkMessage) {
    
    this.remarkMessage = remarkMessage;
    return this;
  }

   /**
   * 
   * @return remarkMessage
  **/
  @javax.annotation.Nullable
  public String getRemarkMessage() {
    return remarkMessage;
  }


  public void setRemarkMessage(String remarkMessage) {
    this.remarkMessage = remarkMessage;
  }


  public ToolsWechatAppletListV30ResponseDataListInner revenueModel(ToolsWechatAppletListV30DataListRevenueModel revenueModel) {
    
    this.revenueModel = revenueModel;
    return this;
  }

   /**
   * Get revenueModel
   * @return revenueModel
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30DataListRevenueModel getRevenueModel() {
    return revenueModel;
  }


  public void setRevenueModel(ToolsWechatAppletListV30DataListRevenueModel revenueModel) {
    this.revenueModel = revenueModel;
  }


  public ToolsWechatAppletListV30ResponseDataListInner tagInfo(String tagInfo) {
    
    this.tagInfo = tagInfo;
    return this;
  }

   /**
   * 
   * @return tagInfo
  **/
  @javax.annotation.Nullable
  public String getTagInfo() {
    return tagInfo;
  }


  public void setTagInfo(String tagInfo) {
    this.tagInfo = tagInfo;
  }


  public ToolsWechatAppletListV30ResponseDataListInner userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsWechatAppletListV30ResponseDataListInner toolsWechatAppletListV30ResponseDataListInner = (ToolsWechatAppletListV30ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, toolsWechatAppletListV30ResponseDataListInner.advertiserId) &&
        Objects.equals(this.auditStatus, toolsWechatAppletListV30ResponseDataListInner.auditStatus) &&
        Objects.equals(this.createTime, toolsWechatAppletListV30ResponseDataListInner.createTime) &&
        Objects.equals(this.discountRate, toolsWechatAppletListV30ResponseDataListInner.discountRate) &&
        Objects.equals(this.guideText, toolsWechatAppletListV30ResponseDataListInner.guideText) &&
        Objects.equals(this.hasDiscount, toolsWechatAppletListV30ResponseDataListInner.hasDiscount) &&
        Objects.equals(this.hasOnlineEarning, toolsWechatAppletListV30ResponseDataListInner.hasOnlineEarning) &&
        Objects.equals(this.headerImageUrl, toolsWechatAppletListV30ResponseDataListInner.headerImageUrl) &&
        Objects.equals(this.iconImageUrl, toolsWechatAppletListV30ResponseDataListInner.iconImageUrl) &&
        Objects.equals(this.imagesHorizontalUrl, toolsWechatAppletListV30ResponseDataListInner.imagesHorizontalUrl) &&
        Objects.equals(this.imagesVerticalUrl, toolsWechatAppletListV30ResponseDataListInner.imagesVerticalUrl) &&
        Objects.equals(this.instanceId, toolsWechatAppletListV30ResponseDataListInner.instanceId) &&
        Objects.equals(this.introduction, toolsWechatAppletListV30ResponseDataListInner.introduction) &&
        Objects.equals(this.labels, toolsWechatAppletListV30ResponseDataListInner.labels) &&
        Objects.equals(this.maxPaymentTierRange, toolsWechatAppletListV30ResponseDataListInner.maxPaymentTierRange) &&
        Objects.equals(this.maxRechargeTier, toolsWechatAppletListV30ResponseDataListInner.maxRechargeTier) &&
        Objects.equals(this.membershipType, toolsWechatAppletListV30ResponseDataListInner.membershipType) &&
        Objects.equals(this.midPaymentTierRange, toolsWechatAppletListV30ResponseDataListInner.midPaymentTierRange) &&
        Objects.equals(this.minPaymentTierRange, toolsWechatAppletListV30ResponseDataListInner.minPaymentTierRange) &&
        Objects.equals(this.minRechargeTier, toolsWechatAppletListV30ResponseDataListInner.minRechargeTier) &&
        Objects.equals(this.modifyTime, toolsWechatAppletListV30ResponseDataListInner.modifyTime) &&
        Objects.equals(this.name, toolsWechatAppletListV30ResponseDataListInner.name) &&
        Objects.equals(this.path, toolsWechatAppletListV30ResponseDataListInner.path) &&
        Objects.equals(this.paymentForm, toolsWechatAppletListV30ResponseDataListInner.paymentForm) &&
        Objects.equals(this.propName, toolsWechatAppletListV30ResponseDataListInner.propName) &&
        Objects.equals(this.reason, toolsWechatAppletListV30ResponseDataListInner.reason) &&
        Objects.equals(this.recommendedRechargeTier, toolsWechatAppletListV30ResponseDataListInner.recommendedRechargeTier) &&
        Objects.equals(this.remarkMessage, toolsWechatAppletListV30ResponseDataListInner.remarkMessage) &&
        Objects.equals(this.revenueModel, toolsWechatAppletListV30ResponseDataListInner.revenueModel) &&
        Objects.equals(this.tagInfo, toolsWechatAppletListV30ResponseDataListInner.tagInfo) &&
        Objects.equals(this.userName, toolsWechatAppletListV30ResponseDataListInner.userName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, auditStatus, createTime, discountRate, guideText, hasDiscount, hasOnlineEarning, headerImageUrl, iconImageUrl, imagesHorizontalUrl, imagesVerticalUrl, instanceId, introduction, labels, maxPaymentTierRange, maxRechargeTier, membershipType, midPaymentTierRange, minPaymentTierRange, minRechargeTier, modifyTime, name, path, paymentForm, propName, reason, recommendedRechargeTier, remarkMessage, revenueModel, tagInfo, userName);
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
    sb.append("class ToolsWechatAppletListV30ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    hasDiscount: ").append(toIndentedString(hasDiscount)).append("\n");
    sb.append("    hasOnlineEarning: ").append(toIndentedString(hasOnlineEarning)).append("\n");
    sb.append("    headerImageUrl: ").append(toIndentedString(headerImageUrl)).append("\n");
    sb.append("    iconImageUrl: ").append(toIndentedString(iconImageUrl)).append("\n");
    sb.append("    imagesHorizontalUrl: ").append(toIndentedString(imagesHorizontalUrl)).append("\n");
    sb.append("    imagesVerticalUrl: ").append(toIndentedString(imagesVerticalUrl)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maxPaymentTierRange: ").append(toIndentedString(maxPaymentTierRange)).append("\n");
    sb.append("    maxRechargeTier: ").append(toIndentedString(maxRechargeTier)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
    sb.append("    midPaymentTierRange: ").append(toIndentedString(midPaymentTierRange)).append("\n");
    sb.append("    minPaymentTierRange: ").append(toIndentedString(minPaymentTierRange)).append("\n");
    sb.append("    minRechargeTier: ").append(toIndentedString(minRechargeTier)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paymentForm: ").append(toIndentedString(paymentForm)).append("\n");
    sb.append("    propName: ").append(toIndentedString(propName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    recommendedRechargeTier: ").append(toIndentedString(recommendedRechargeTier)).append("\n");
    sb.append("    remarkMessage: ").append(toIndentedString(remarkMessage)).append("\n");
    sb.append("    revenueModel: ").append(toIndentedString(revenueModel)).append("\n");
    sb.append("    tagInfo: ").append(toIndentedString(tagInfo)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("audit_status");
    openapiFields.add("create_time");
    openapiFields.add("discount_rate");
    openapiFields.add("guide_text");
    openapiFields.add("has_discount");
    openapiFields.add("has_online_earning");
    openapiFields.add("header_image_url");
    openapiFields.add("icon_image_url");
    openapiFields.add("images_horizontal_url");
    openapiFields.add("images_vertical_url");
    openapiFields.add("instance_id");
    openapiFields.add("introduction");
    openapiFields.add("labels");
    openapiFields.add("max_payment_tier_range");
    openapiFields.add("max_recharge_tier");
    openapiFields.add("membership_type");
    openapiFields.add("mid_payment_tier_range");
    openapiFields.add("min_payment_tier_range");
    openapiFields.add("min_recharge_tier");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("path");
    openapiFields.add("payment_form");
    openapiFields.add("prop_name");
    openapiFields.add("reason");
    openapiFields.add("recommended_recharge_tier");
    openapiFields.add("remark_message");
    openapiFields.add("revenue_model");
    openapiFields.add("tag_info");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatAppletListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatAppletListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatAppletListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatAppletListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatAppletListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsWechatAppletListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatAppletListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatAppletListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatAppletListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatAppletListV30ResponseDataListInner
  */
  public static ToolsWechatAppletListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatAppletListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsWechatAppletListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

