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
import com.bytedance.ads.model.ToolsWechatGameCreateV30AccountType;
import com.bytedance.ads.model.ToolsWechatGameCreateV30AgeLimit;
import com.bytedance.ads.model.ToolsWechatGameCreateV30MaxPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatGameCreateV30MidPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatGameCreateV30MinPaymentTierRange;
import com.bytedance.ads.model.ToolsWechatGameCreateV30RequestAnchorList;
import com.bytedance.ads.model.ToolsWechatGameCreateV30RevenueModel;
import com.bytedance.ads.model.ToolsWechatGameCreateV30ScheduleCards;
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
 * ToolsWechatGameCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ToolsWechatGameCreateV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsWechatGameCreateV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_AGE_LIMIT = "age_limit";
  @SerializedName(SERIALIZED_NAME_AGE_LIMIT)
  private ToolsWechatGameCreateV30AgeLimit ageLimit = null;

  public static final String SERIALIZED_NAME_AGE_REMIND_URL = "age_remind_url";
  @SerializedName(SERIALIZED_NAME_AGE_REMIND_URL)
  private String ageRemindUrl = null;

  public static final String SERIALIZED_NAME_ANCHOR_LIST = "anchor_list";
  @SerializedName(SERIALIZED_NAME_ANCHOR_LIST)
  private ToolsWechatGameCreateV30RequestAnchorList anchorList = null;

  public static final String SERIALIZED_NAME_ANTI_ADDICTION_URL = "anti_addiction_url";
  @SerializedName(SERIALIZED_NAME_ANTI_ADDICTION_URL)
  private String antiAddictionUrl = null;

  public static final String SERIALIZED_NAME_ART_STYLE = "art_style";
  @SerializedName(SERIALIZED_NAME_ART_STYLE)
  private String artStyle = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_DISCOUNT_RATE = "discount_rate";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_RATE)
  private Long discountRate = null;

  public static final String SERIALIZED_NAME_FEATURE_TAGS = "feature_tags";
  @SerializedName(SERIALIZED_NAME_FEATURE_TAGS)
  private List<String> featureTags = null;

  public static final String SERIALIZED_NAME_HAS_DISCOUNT = "has_discount";
  @SerializedName(SERIALIZED_NAME_HAS_DISCOUNT)
  private Boolean hasDiscount = null;

  public static final String SERIALIZED_NAME_HAS_ONLINE_EARNING = "has_online_earning";
  @SerializedName(SERIALIZED_NAME_HAS_ONLINE_EARNING)
  private Boolean hasOnlineEarning = null;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE = "max_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE)
  private ToolsWechatGameCreateV30MaxPaymentTierRange maxPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE = "mid_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE)
  private ToolsWechatGameCreateV30MidPaymentTierRange midPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE = "min_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE)
  private ToolsWechatGameCreateV30MinPaymentTierRange minPaymentTierRange = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NETWORK_ENVIRONMENT = "network_environment";
  @SerializedName(SERIALIZED_NAME_NETWORK_ENVIRONMENT)
  private List<String> networkEnvironment = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = null;

  public static final String SERIALIZED_NAME_REAL_NAME_URL = "real_name_url";
  @SerializedName(SERIALIZED_NAME_REAL_NAME_URL)
  private String realNameUrl = null;

  public static final String SERIALIZED_NAME_REVENUE_MODEL = "revenue_model";
  @SerializedName(SERIALIZED_NAME_REVENUE_MODEL)
  private ToolsWechatGameCreateV30RevenueModel revenueModel = null;

  public static final String SERIALIZED_NAME_SCHEDULE_CARDS = "schedule_cards";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_CARDS)
  private List<ToolsWechatGameCreateV30ScheduleCards> scheduleCards = null;

  public static final String SERIALIZED_NAME_SCREEN_RECORD_URL = "screen_record_url";
  @SerializedName(SERIALIZED_NAME_SCREEN_RECORD_URL)
  private String screenRecordUrl = null;

  public static final String SERIALIZED_NAME_TAG_INFO = "tag_info";
  @SerializedName(SERIALIZED_NAME_TAG_INFO)
  private String tagInfo = null;

  public static final String SERIALIZED_NAME_THEME_TAG = "theme_tag";
  @SerializedName(SERIALIZED_NAME_THEME_TAG)
  private String themeTag = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName = null;

  public ToolsWechatGameCreateV30Request() {
  }

  public ToolsWechatGameCreateV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsWechatGameCreateV30Request accountType(ToolsWechatGameCreateV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsWechatGameCreateV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsWechatGameCreateV30AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsWechatGameCreateV30Request ageLimit(ToolsWechatGameCreateV30AgeLimit ageLimit) {
    
    this.ageLimit = ageLimit;
    return this;
  }

   /**
   * Get ageLimit
   * @return ageLimit
  **/
  @javax.annotation.Nonnull
  public ToolsWechatGameCreateV30AgeLimit getAgeLimit() {
    return ageLimit;
  }


  public void setAgeLimit(ToolsWechatGameCreateV30AgeLimit ageLimit) {
    this.ageLimit = ageLimit;
  }


  public ToolsWechatGameCreateV30Request ageRemindUrl(String ageRemindUrl) {
    
    this.ageRemindUrl = ageRemindUrl;
    return this;
  }

   /**
   * 
   * @return ageRemindUrl
  **/
  @javax.annotation.Nonnull
  public String getAgeRemindUrl() {
    return ageRemindUrl;
  }


  public void setAgeRemindUrl(String ageRemindUrl) {
    this.ageRemindUrl = ageRemindUrl;
  }


  public ToolsWechatGameCreateV30Request anchorList(ToolsWechatGameCreateV30RequestAnchorList anchorList) {
    
    this.anchorList = anchorList;
    return this;
  }

   /**
   * Get anchorList
   * @return anchorList
  **/
  @javax.annotation.Nonnull
  public ToolsWechatGameCreateV30RequestAnchorList getAnchorList() {
    return anchorList;
  }


  public void setAnchorList(ToolsWechatGameCreateV30RequestAnchorList anchorList) {
    this.anchorList = anchorList;
  }


  public ToolsWechatGameCreateV30Request antiAddictionUrl(String antiAddictionUrl) {
    
    this.antiAddictionUrl = antiAddictionUrl;
    return this;
  }

   /**
   * 
   * @return antiAddictionUrl
  **/
  @javax.annotation.Nonnull
  public String getAntiAddictionUrl() {
    return antiAddictionUrl;
  }


  public void setAntiAddictionUrl(String antiAddictionUrl) {
    this.antiAddictionUrl = antiAddictionUrl;
  }


  public ToolsWechatGameCreateV30Request artStyle(String artStyle) {
    
    this.artStyle = artStyle;
    return this;
  }

   /**
   * 
   * @return artStyle
  **/
  @javax.annotation.Nonnull
  public String getArtStyle() {
    return artStyle;
  }


  public void setArtStyle(String artStyle) {
    this.artStyle = artStyle;
  }


  public ToolsWechatGameCreateV30Request companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public ToolsWechatGameCreateV30Request discountRate(Long discountRate) {
    
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


  public ToolsWechatGameCreateV30Request featureTags(List<String> featureTags) {
    
    this.featureTags = featureTags;
    return this;
  }

  public ToolsWechatGameCreateV30Request addFeatureTagsItem(String featureTagsItem) {
    if (this.featureTags == null) {
      this.featureTags = new ArrayList<>();
    }
    this.featureTags.add(featureTagsItem);
    return this;
  }

   /**
   * 
   * @return featureTags
  **/
  @javax.annotation.Nonnull
  public List<String> getFeatureTags() {
    return featureTags;
  }


  public void setFeatureTags(List<String> featureTags) {
    this.featureTags = featureTags;
  }


  public ToolsWechatGameCreateV30Request hasDiscount(Boolean hasDiscount) {
    
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


  public ToolsWechatGameCreateV30Request hasOnlineEarning(Boolean hasOnlineEarning) {
    
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


  public ToolsWechatGameCreateV30Request maxPaymentTierRange(ToolsWechatGameCreateV30MaxPaymentTierRange maxPaymentTierRange) {
    
    this.maxPaymentTierRange = maxPaymentTierRange;
    return this;
  }

   /**
   * Get maxPaymentTierRange
   * @return maxPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatGameCreateV30MaxPaymentTierRange getMaxPaymentTierRange() {
    return maxPaymentTierRange;
  }


  public void setMaxPaymentTierRange(ToolsWechatGameCreateV30MaxPaymentTierRange maxPaymentTierRange) {
    this.maxPaymentTierRange = maxPaymentTierRange;
  }


  public ToolsWechatGameCreateV30Request midPaymentTierRange(ToolsWechatGameCreateV30MidPaymentTierRange midPaymentTierRange) {
    
    this.midPaymentTierRange = midPaymentTierRange;
    return this;
  }

   /**
   * Get midPaymentTierRange
   * @return midPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatGameCreateV30MidPaymentTierRange getMidPaymentTierRange() {
    return midPaymentTierRange;
  }


  public void setMidPaymentTierRange(ToolsWechatGameCreateV30MidPaymentTierRange midPaymentTierRange) {
    this.midPaymentTierRange = midPaymentTierRange;
  }


  public ToolsWechatGameCreateV30Request minPaymentTierRange(ToolsWechatGameCreateV30MinPaymentTierRange minPaymentTierRange) {
    
    this.minPaymentTierRange = minPaymentTierRange;
    return this;
  }

   /**
   * Get minPaymentTierRange
   * @return minPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsWechatGameCreateV30MinPaymentTierRange getMinPaymentTierRange() {
    return minPaymentTierRange;
  }


  public void setMinPaymentTierRange(ToolsWechatGameCreateV30MinPaymentTierRange minPaymentTierRange) {
    this.minPaymentTierRange = minPaymentTierRange;
  }


  public ToolsWechatGameCreateV30Request name(String name) {
    
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


  public ToolsWechatGameCreateV30Request networkEnvironment(List<String> networkEnvironment) {
    
    this.networkEnvironment = networkEnvironment;
    return this;
  }

  public ToolsWechatGameCreateV30Request addNetworkEnvironmentItem(String networkEnvironmentItem) {
    if (this.networkEnvironment == null) {
      this.networkEnvironment = new ArrayList<>();
    }
    this.networkEnvironment.add(networkEnvironmentItem);
    return this;
  }

   /**
   * 
   * @return networkEnvironment
  **/
  @javax.annotation.Nonnull
  public List<String> getNetworkEnvironment() {
    return networkEnvironment;
  }


  public void setNetworkEnvironment(List<String> networkEnvironment) {
    this.networkEnvironment = networkEnvironment;
  }


  public ToolsWechatGameCreateV30Request path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * 
   * @return path
  **/
  @javax.annotation.Nonnull
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ToolsWechatGameCreateV30Request realNameUrl(String realNameUrl) {
    
    this.realNameUrl = realNameUrl;
    return this;
  }

   /**
   * 
   * @return realNameUrl
  **/
  @javax.annotation.Nonnull
  public String getRealNameUrl() {
    return realNameUrl;
  }


  public void setRealNameUrl(String realNameUrl) {
    this.realNameUrl = realNameUrl;
  }


  public ToolsWechatGameCreateV30Request revenueModel(ToolsWechatGameCreateV30RevenueModel revenueModel) {
    
    this.revenueModel = revenueModel;
    return this;
  }

   /**
   * Get revenueModel
   * @return revenueModel
  **/
  @javax.annotation.Nonnull
  public ToolsWechatGameCreateV30RevenueModel getRevenueModel() {
    return revenueModel;
  }


  public void setRevenueModel(ToolsWechatGameCreateV30RevenueModel revenueModel) {
    this.revenueModel = revenueModel;
  }


  public ToolsWechatGameCreateV30Request scheduleCards(List<ToolsWechatGameCreateV30ScheduleCards> scheduleCards) {
    
    this.scheduleCards = scheduleCards;
    return this;
  }

  public ToolsWechatGameCreateV30Request addScheduleCardsItem(ToolsWechatGameCreateV30ScheduleCards scheduleCardsItem) {
    if (this.scheduleCards == null) {
      this.scheduleCards = new ArrayList<>();
    }
    this.scheduleCards.add(scheduleCardsItem);
    return this;
  }

   /**
   * 
   * @return scheduleCards
  **/
  @javax.annotation.Nullable
  public List<ToolsWechatGameCreateV30ScheduleCards> getScheduleCards() {
    return scheduleCards;
  }


  public void setScheduleCards(List<ToolsWechatGameCreateV30ScheduleCards> scheduleCards) {
    this.scheduleCards = scheduleCards;
  }


  public ToolsWechatGameCreateV30Request screenRecordUrl(String screenRecordUrl) {
    
    this.screenRecordUrl = screenRecordUrl;
    return this;
  }

   /**
   * 
   * @return screenRecordUrl
  **/
  @javax.annotation.Nonnull
  public String getScreenRecordUrl() {
    return screenRecordUrl;
  }


  public void setScreenRecordUrl(String screenRecordUrl) {
    this.screenRecordUrl = screenRecordUrl;
  }


  public ToolsWechatGameCreateV30Request tagInfo(String tagInfo) {
    
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


  public ToolsWechatGameCreateV30Request themeTag(String themeTag) {
    
    this.themeTag = themeTag;
    return this;
  }

   /**
   * 
   * @return themeTag
  **/
  @javax.annotation.Nonnull
  public String getThemeTag() {
    return themeTag;
  }


  public void setThemeTag(String themeTag) {
    this.themeTag = themeTag;
  }


  public ToolsWechatGameCreateV30Request userName(String userName) {
    
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
    ToolsWechatGameCreateV30Request toolsWechatGameCreateV30Request = (ToolsWechatGameCreateV30Request) o;
    return Objects.equals(this.accountId, toolsWechatGameCreateV30Request.accountId) &&
        Objects.equals(this.accountType, toolsWechatGameCreateV30Request.accountType) &&
        Objects.equals(this.ageLimit, toolsWechatGameCreateV30Request.ageLimit) &&
        Objects.equals(this.ageRemindUrl, toolsWechatGameCreateV30Request.ageRemindUrl) &&
        Objects.equals(this.anchorList, toolsWechatGameCreateV30Request.anchorList) &&
        Objects.equals(this.antiAddictionUrl, toolsWechatGameCreateV30Request.antiAddictionUrl) &&
        Objects.equals(this.artStyle, toolsWechatGameCreateV30Request.artStyle) &&
        Objects.equals(this.companyId, toolsWechatGameCreateV30Request.companyId) &&
        Objects.equals(this.discountRate, toolsWechatGameCreateV30Request.discountRate) &&
        Objects.equals(this.featureTags, toolsWechatGameCreateV30Request.featureTags) &&
        Objects.equals(this.hasDiscount, toolsWechatGameCreateV30Request.hasDiscount) &&
        Objects.equals(this.hasOnlineEarning, toolsWechatGameCreateV30Request.hasOnlineEarning) &&
        Objects.equals(this.maxPaymentTierRange, toolsWechatGameCreateV30Request.maxPaymentTierRange) &&
        Objects.equals(this.midPaymentTierRange, toolsWechatGameCreateV30Request.midPaymentTierRange) &&
        Objects.equals(this.minPaymentTierRange, toolsWechatGameCreateV30Request.minPaymentTierRange) &&
        Objects.equals(this.name, toolsWechatGameCreateV30Request.name) &&
        Objects.equals(this.networkEnvironment, toolsWechatGameCreateV30Request.networkEnvironment) &&
        Objects.equals(this.path, toolsWechatGameCreateV30Request.path) &&
        Objects.equals(this.realNameUrl, toolsWechatGameCreateV30Request.realNameUrl) &&
        Objects.equals(this.revenueModel, toolsWechatGameCreateV30Request.revenueModel) &&
        Objects.equals(this.scheduleCards, toolsWechatGameCreateV30Request.scheduleCards) &&
        Objects.equals(this.screenRecordUrl, toolsWechatGameCreateV30Request.screenRecordUrl) &&
        Objects.equals(this.tagInfo, toolsWechatGameCreateV30Request.tagInfo) &&
        Objects.equals(this.themeTag, toolsWechatGameCreateV30Request.themeTag) &&
        Objects.equals(this.userName, toolsWechatGameCreateV30Request.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, ageLimit, ageRemindUrl, anchorList, antiAddictionUrl, artStyle, companyId, discountRate, featureTags, hasDiscount, hasOnlineEarning, maxPaymentTierRange, midPaymentTierRange, minPaymentTierRange, name, networkEnvironment, path, realNameUrl, revenueModel, scheduleCards, screenRecordUrl, tagInfo, themeTag, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsWechatGameCreateV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    ageLimit: ").append(toIndentedString(ageLimit)).append("\n");
    sb.append("    ageRemindUrl: ").append(toIndentedString(ageRemindUrl)).append("\n");
    sb.append("    anchorList: ").append(toIndentedString(anchorList)).append("\n");
    sb.append("    antiAddictionUrl: ").append(toIndentedString(antiAddictionUrl)).append("\n");
    sb.append("    artStyle: ").append(toIndentedString(artStyle)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    featureTags: ").append(toIndentedString(featureTags)).append("\n");
    sb.append("    hasDiscount: ").append(toIndentedString(hasDiscount)).append("\n");
    sb.append("    hasOnlineEarning: ").append(toIndentedString(hasOnlineEarning)).append("\n");
    sb.append("    maxPaymentTierRange: ").append(toIndentedString(maxPaymentTierRange)).append("\n");
    sb.append("    midPaymentTierRange: ").append(toIndentedString(midPaymentTierRange)).append("\n");
    sb.append("    minPaymentTierRange: ").append(toIndentedString(minPaymentTierRange)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkEnvironment: ").append(toIndentedString(networkEnvironment)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    realNameUrl: ").append(toIndentedString(realNameUrl)).append("\n");
    sb.append("    revenueModel: ").append(toIndentedString(revenueModel)).append("\n");
    sb.append("    scheduleCards: ").append(toIndentedString(scheduleCards)).append("\n");
    sb.append("    screenRecordUrl: ").append(toIndentedString(screenRecordUrl)).append("\n");
    sb.append("    tagInfo: ").append(toIndentedString(tagInfo)).append("\n");
    sb.append("    themeTag: ").append(toIndentedString(themeTag)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("age_limit");
    openapiFields.add("age_remind_url");
    openapiFields.add("anchor_list");
    openapiFields.add("anti_addiction_url");
    openapiFields.add("art_style");
    openapiFields.add("company_id");
    openapiFields.add("discount_rate");
    openapiFields.add("feature_tags");
    openapiFields.add("has_discount");
    openapiFields.add("has_online_earning");
    openapiFields.add("max_payment_tier_range");
    openapiFields.add("mid_payment_tier_range");
    openapiFields.add("min_payment_tier_range");
    openapiFields.add("name");
    openapiFields.add("network_environment");
    openapiFields.add("path");
    openapiFields.add("real_name_url");
    openapiFields.add("revenue_model");
    openapiFields.add("schedule_cards");
    openapiFields.add("screen_record_url");
    openapiFields.add("tag_info");
    openapiFields.add("theme_tag");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("age_limit");
    openapiRequiredFields.add("age_remind_url");
    openapiRequiredFields.add("anchor_list");
    openapiRequiredFields.add("anti_addiction_url");
    openapiRequiredFields.add("art_style");
    openapiRequiredFields.add("feature_tags");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("network_environment");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("real_name_url");
    openapiRequiredFields.add("revenue_model");
    openapiRequiredFields.add("screen_record_url");
    openapiRequiredFields.add("tag_info");
    openapiRequiredFields.add("theme_tag");
    openapiRequiredFields.add("user_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatGameCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatGameCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatGameCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatGameCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatGameCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsWechatGameCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatGameCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatGameCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatGameCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatGameCreateV30Request
  */
  public static ToolsWechatGameCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatGameCreateV30Request.class);
  }

 /**
  * Convert an instance of ToolsWechatGameCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

