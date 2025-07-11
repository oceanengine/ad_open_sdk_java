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
import com.bytedance.ads.model.ToolsWechatAppletCreateV30MaxPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30MaxRechargeTier;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30MembershipType;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30MidPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30MinPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30MinRechargeTier;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30PaymentForm;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30RecommendedRechargeTier;
import com.bytedance.ads.model.ToolsWechatAppletCreateV30RevenueModel;
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
 * ToolsWechatAppletCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsWechatAppletCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

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

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE = "max_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE)
  private ToolsWechatAppletCreateV30MaxPaymentTierRange maxPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MAX_RECHARGE_TIER = "max_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MAX_RECHARGE_TIER)
  private ToolsWechatAppletCreateV30MaxRechargeTier maxRechargeTier = null;

  public static final String SERIALIZED_NAME_MEMBERSHIP_TYPE = "membership_type";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_TYPE)
  private ToolsWechatAppletCreateV30MembershipType membershipType = null;

  public static final String SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE = "mid_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE)
  private ToolsWechatAppletCreateV30MidPaymentTierRange midPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE = "min_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE)
  private ToolsWechatAppletCreateV30MinPaymentTierRange minPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_RECHARGE_TIER = "min_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MIN_RECHARGE_TIER)
  private ToolsWechatAppletCreateV30MinRechargeTier minRechargeTier = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = null;

  public static final String SERIALIZED_NAME_PAYMENT_FORM = "payment_form";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FORM)
  private ToolsWechatAppletCreateV30PaymentForm paymentForm = null;

  public static final String SERIALIZED_NAME_PROP_NAME = "prop_name";
  @SerializedName(SERIALIZED_NAME_PROP_NAME)
  private String propName = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER = "recommended_recharge_tier";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER)
  private ToolsWechatAppletCreateV30RecommendedRechargeTier recommendedRechargeTier = null;

  public static final String SERIALIZED_NAME_REMARK_MESSAGE = "remark_message";
  @SerializedName(SERIALIZED_NAME_REMARK_MESSAGE)
  private String remarkMessage = null;

  public static final String SERIALIZED_NAME_REVENUE_MODEL = "revenue_model";
  @SerializedName(SERIALIZED_NAME_REVENUE_MODEL)
  private ToolsWechatAppletCreateV30RevenueModel revenueModel = null;

  public static final String SERIALIZED_NAME_TAG_INFO = "tag_info";
  @SerializedName(SERIALIZED_NAME_TAG_INFO)
  private String tagInfo = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName = null;

  public ToolsWechatAppletCreateV30Request() {
  }

  public ToolsWechatAppletCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsWechatAppletCreateV30Request discountRate(Long discountRate) {
    
    this.discountRate = discountRate;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 100
   * @return discountRate
  **/
  @javax.annotation.Nullable
  public Long getDiscountRate() {
    return discountRate;
  }


  public void setDiscountRate(Long discountRate) {
    this.discountRate = discountRate;
  }


  public ToolsWechatAppletCreateV30Request guideText(String guideText) {
    
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


  public ToolsWechatAppletCreateV30Request hasDiscount(Boolean hasDiscount) {
    
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


  public ToolsWechatAppletCreateV30Request hasOnlineEarning(Boolean hasOnlineEarning) {
    
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


  public ToolsWechatAppletCreateV30Request headerImageUrl(String headerImageUrl) {
    
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


  public ToolsWechatAppletCreateV30Request iconImageUrl(String iconImageUrl) {
    
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


  public ToolsWechatAppletCreateV30Request imagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    
    this.imagesHorizontalUrl = imagesHorizontalUrl;
    return this;
  }

  public ToolsWechatAppletCreateV30Request addImagesHorizontalUrlItem(String imagesHorizontalUrlItem) {
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


  public ToolsWechatAppletCreateV30Request imagesVerticalUrl(List<String> imagesVerticalUrl) {
    
    this.imagesVerticalUrl = imagesVerticalUrl;
    return this;
  }

  public ToolsWechatAppletCreateV30Request addImagesVerticalUrlItem(String imagesVerticalUrlItem) {
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


  public ToolsWechatAppletCreateV30Request introduction(String introduction) {
    
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


  public ToolsWechatAppletCreateV30Request labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ToolsWechatAppletCreateV30Request addLabelsItem(String labelsItem) {
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


  public ToolsWechatAppletCreateV30Request maxPaymentTierRange(ToolsWechatAppletCreateV30MaxPaymentTierRange maxPaymentTierRange) {
    
    this.maxPaymentTierRange = maxPaymentTierRange;
    return this;
  }

   /**
   * Get maxPaymentTierRange
   * @return maxPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30MaxPaymentTierRange getMaxPaymentTierRange() {
    return maxPaymentTierRange;
  }


  public void setMaxPaymentTierRange(ToolsWechatAppletCreateV30MaxPaymentTierRange maxPaymentTierRange) {
    this.maxPaymentTierRange = maxPaymentTierRange;
  }


  public ToolsWechatAppletCreateV30Request maxRechargeTier(ToolsWechatAppletCreateV30MaxRechargeTier maxRechargeTier) {
    
    this.maxRechargeTier = maxRechargeTier;
    return this;
  }

   /**
   * Get maxRechargeTier
   * @return maxRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30MaxRechargeTier getMaxRechargeTier() {
    return maxRechargeTier;
  }


  public void setMaxRechargeTier(ToolsWechatAppletCreateV30MaxRechargeTier maxRechargeTier) {
    this.maxRechargeTier = maxRechargeTier;
  }


  public ToolsWechatAppletCreateV30Request membershipType(ToolsWechatAppletCreateV30MembershipType membershipType) {
    
    this.membershipType = membershipType;
    return this;
  }

   /**
   * Get membershipType
   * @return membershipType
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30MembershipType getMembershipType() {
    return membershipType;
  }


  public void setMembershipType(ToolsWechatAppletCreateV30MembershipType membershipType) {
    this.membershipType = membershipType;
  }


  public ToolsWechatAppletCreateV30Request midPaymentTierRange(ToolsWechatAppletCreateV30MidPaymentTierRange midPaymentTierRange) {
    
    this.midPaymentTierRange = midPaymentTierRange;
    return this;
  }

   /**
   * Get midPaymentTierRange
   * @return midPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30MidPaymentTierRange getMidPaymentTierRange() {
    return midPaymentTierRange;
  }


  public void setMidPaymentTierRange(ToolsWechatAppletCreateV30MidPaymentTierRange midPaymentTierRange) {
    this.midPaymentTierRange = midPaymentTierRange;
  }


  public ToolsWechatAppletCreateV30Request minPaymentTierRange(ToolsWechatAppletCreateV30MinPaymentTierRange minPaymentTierRange) {
    
    this.minPaymentTierRange = minPaymentTierRange;
    return this;
  }

   /**
   * Get minPaymentTierRange
   * @return minPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30MinPaymentTierRange getMinPaymentTierRange() {
    return minPaymentTierRange;
  }


  public void setMinPaymentTierRange(ToolsWechatAppletCreateV30MinPaymentTierRange minPaymentTierRange) {
    this.minPaymentTierRange = minPaymentTierRange;
  }


  public ToolsWechatAppletCreateV30Request minRechargeTier(ToolsWechatAppletCreateV30MinRechargeTier minRechargeTier) {
    
    this.minRechargeTier = minRechargeTier;
    return this;
  }

   /**
   * Get minRechargeTier
   * @return minRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30MinRechargeTier getMinRechargeTier() {
    return minRechargeTier;
  }


  public void setMinRechargeTier(ToolsWechatAppletCreateV30MinRechargeTier minRechargeTier) {
    this.minRechargeTier = minRechargeTier;
  }


  public ToolsWechatAppletCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsWechatAppletCreateV30Request path(String path) {
    
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


  public ToolsWechatAppletCreateV30Request paymentForm(ToolsWechatAppletCreateV30PaymentForm paymentForm) {
    
    this.paymentForm = paymentForm;
    return this;
  }

   /**
   * Get paymentForm
   * @return paymentForm
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30PaymentForm getPaymentForm() {
    return paymentForm;
  }


  public void setPaymentForm(ToolsWechatAppletCreateV30PaymentForm paymentForm) {
    this.paymentForm = paymentForm;
  }


  public ToolsWechatAppletCreateV30Request propName(String propName) {
    
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


  public ToolsWechatAppletCreateV30Request recommendedRechargeTier(ToolsWechatAppletCreateV30RecommendedRechargeTier recommendedRechargeTier) {
    
    this.recommendedRechargeTier = recommendedRechargeTier;
    return this;
  }

   /**
   * Get recommendedRechargeTier
   * @return recommendedRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30RecommendedRechargeTier getRecommendedRechargeTier() {
    return recommendedRechargeTier;
  }


  public void setRecommendedRechargeTier(ToolsWechatAppletCreateV30RecommendedRechargeTier recommendedRechargeTier) {
    this.recommendedRechargeTier = recommendedRechargeTier;
  }


  public ToolsWechatAppletCreateV30Request remarkMessage(String remarkMessage) {
    
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


  public ToolsWechatAppletCreateV30Request revenueModel(ToolsWechatAppletCreateV30RevenueModel revenueModel) {
    
    this.revenueModel = revenueModel;
    return this;
  }

   /**
   * Get revenueModel
   * @return revenueModel
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletCreateV30RevenueModel getRevenueModel() {
    return revenueModel;
  }


  public void setRevenueModel(ToolsWechatAppletCreateV30RevenueModel revenueModel) {
    this.revenueModel = revenueModel;
  }


  public ToolsWechatAppletCreateV30Request tagInfo(String tagInfo) {
    
    this.tagInfo = tagInfo;
    return this;
  }

   /**
   * 
   * @return tagInfo
  **/
  @javax.annotation.Nonnull
  public String getTagInfo() {
    return tagInfo;
  }


  public void setTagInfo(String tagInfo) {
    this.tagInfo = tagInfo;
  }


  public ToolsWechatAppletCreateV30Request userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @javax.annotation.Nonnull
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
    ToolsWechatAppletCreateV30Request toolsWechatAppletCreateV30Request = (ToolsWechatAppletCreateV30Request) o;
    return Objects.equals(this.advertiserId, toolsWechatAppletCreateV30Request.advertiserId) &&
        Objects.equals(this.discountRate, toolsWechatAppletCreateV30Request.discountRate) &&
        Objects.equals(this.guideText, toolsWechatAppletCreateV30Request.guideText) &&
        Objects.equals(this.hasDiscount, toolsWechatAppletCreateV30Request.hasDiscount) &&
        Objects.equals(this.hasOnlineEarning, toolsWechatAppletCreateV30Request.hasOnlineEarning) &&
        Objects.equals(this.headerImageUrl, toolsWechatAppletCreateV30Request.headerImageUrl) &&
        Objects.equals(this.iconImageUrl, toolsWechatAppletCreateV30Request.iconImageUrl) &&
        Objects.equals(this.imagesHorizontalUrl, toolsWechatAppletCreateV30Request.imagesHorizontalUrl) &&
        Objects.equals(this.imagesVerticalUrl, toolsWechatAppletCreateV30Request.imagesVerticalUrl) &&
        Objects.equals(this.introduction, toolsWechatAppletCreateV30Request.introduction) &&
        Objects.equals(this.labels, toolsWechatAppletCreateV30Request.labels) &&
        Objects.equals(this.maxPaymentTierRange, toolsWechatAppletCreateV30Request.maxPaymentTierRange) &&
        Objects.equals(this.maxRechargeTier, toolsWechatAppletCreateV30Request.maxRechargeTier) &&
        Objects.equals(this.membershipType, toolsWechatAppletCreateV30Request.membershipType) &&
        Objects.equals(this.midPaymentTierRange, toolsWechatAppletCreateV30Request.midPaymentTierRange) &&
        Objects.equals(this.minPaymentTierRange, toolsWechatAppletCreateV30Request.minPaymentTierRange) &&
        Objects.equals(this.minRechargeTier, toolsWechatAppletCreateV30Request.minRechargeTier) &&
        Objects.equals(this.name, toolsWechatAppletCreateV30Request.name) &&
        Objects.equals(this.path, toolsWechatAppletCreateV30Request.path) &&
        Objects.equals(this.paymentForm, toolsWechatAppletCreateV30Request.paymentForm) &&
        Objects.equals(this.propName, toolsWechatAppletCreateV30Request.propName) &&
        Objects.equals(this.recommendedRechargeTier, toolsWechatAppletCreateV30Request.recommendedRechargeTier) &&
        Objects.equals(this.remarkMessage, toolsWechatAppletCreateV30Request.remarkMessage) &&
        Objects.equals(this.revenueModel, toolsWechatAppletCreateV30Request.revenueModel) &&
        Objects.equals(this.tagInfo, toolsWechatAppletCreateV30Request.tagInfo) &&
        Objects.equals(this.userName, toolsWechatAppletCreateV30Request.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, discountRate, guideText, hasDiscount, hasOnlineEarning, headerImageUrl, iconImageUrl, imagesHorizontalUrl, imagesVerticalUrl, introduction, labels, maxPaymentTierRange, maxRechargeTier, membershipType, midPaymentTierRange, minPaymentTierRange, minRechargeTier, name, path, paymentForm, propName, recommendedRechargeTier, remarkMessage, revenueModel, tagInfo, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsWechatAppletCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    hasDiscount: ").append(toIndentedString(hasDiscount)).append("\n");
    sb.append("    hasOnlineEarning: ").append(toIndentedString(hasOnlineEarning)).append("\n");
    sb.append("    headerImageUrl: ").append(toIndentedString(headerImageUrl)).append("\n");
    sb.append("    iconImageUrl: ").append(toIndentedString(iconImageUrl)).append("\n");
    sb.append("    imagesHorizontalUrl: ").append(toIndentedString(imagesHorizontalUrl)).append("\n");
    sb.append("    imagesVerticalUrl: ").append(toIndentedString(imagesVerticalUrl)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maxPaymentTierRange: ").append(toIndentedString(maxPaymentTierRange)).append("\n");
    sb.append("    maxRechargeTier: ").append(toIndentedString(maxRechargeTier)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
    sb.append("    midPaymentTierRange: ").append(toIndentedString(midPaymentTierRange)).append("\n");
    sb.append("    minPaymentTierRange: ").append(toIndentedString(minPaymentTierRange)).append("\n");
    sb.append("    minRechargeTier: ").append(toIndentedString(minRechargeTier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paymentForm: ").append(toIndentedString(paymentForm)).append("\n");
    sb.append("    propName: ").append(toIndentedString(propName)).append("\n");
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
    openapiFields.add("discount_rate");
    openapiFields.add("guide_text");
    openapiFields.add("has_discount");
    openapiFields.add("has_online_earning");
    openapiFields.add("header_image_url");
    openapiFields.add("icon_image_url");
    openapiFields.add("images_horizontal_url");
    openapiFields.add("images_vertical_url");
    openapiFields.add("introduction");
    openapiFields.add("labels");
    openapiFields.add("max_payment_tier_range");
    openapiFields.add("max_recharge_tier");
    openapiFields.add("membership_type");
    openapiFields.add("mid_payment_tier_range");
    openapiFields.add("min_payment_tier_range");
    openapiFields.add("min_recharge_tier");
    openapiFields.add("name");
    openapiFields.add("path");
    openapiFields.add("payment_form");
    openapiFields.add("prop_name");
    openapiFields.add("recommended_recharge_tier");
    openapiFields.add("remark_message");
    openapiFields.add("revenue_model");
    openapiFields.add("tag_info");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("tag_info");
    openapiRequiredFields.add("user_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatAppletCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatAppletCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatAppletCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatAppletCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatAppletCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsWechatAppletCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatAppletCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatAppletCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatAppletCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatAppletCreateV30Request
  */
  public static ToolsWechatAppletCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatAppletCreateV30Request.class);
  }

 /**
  * Convert an instance of ToolsWechatAppletCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

