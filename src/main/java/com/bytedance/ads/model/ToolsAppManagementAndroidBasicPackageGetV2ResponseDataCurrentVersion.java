/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxPaymentTierRange;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxRechargeTier;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMidPaymentTierRange;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinRechargeTier;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRecommendedRechargeTier;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRevenueModel;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionScheduleCards;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus;
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
 * 当前版本
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion {
  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_ART_STYLE = "art_style";
  @SerializedName(SERIALIZED_NAME_ART_STYLE)
  private String artStyle = null;

  public static final String SERIALIZED_NAME_AUDIT_ID = "audit_id";
  @SerializedName(SERIALIZED_NAME_AUDIT_ID)
  private Long auditId = null;

  public static final String SERIALIZED_NAME_AUDIT_MESSAGE = "audit_message";
  @SerializedName(SERIALIZED_NAME_AUDIT_MESSAGE)
  private String auditMessage = null;

  public static final String SERIALIZED_NAME_DISCOUNT_RATE = "discount_rate";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_RATE)
  private Long discountRate = null;

  public static final String SERIALIZED_NAME_FEATURE_TAGS = "feature_tags";
  @SerializedName(SERIALIZED_NAME_FEATURE_TAGS)
  private List<String> featureTags = null;

  public static final String SERIALIZED_NAME_GAME_BOX_NAME = "game_box_name";
  @SerializedName(SERIALIZED_NAME_GAME_BOX_NAME)
  private String gameBoxName = null;

  public static final String SERIALIZED_NAME_GAME_IP_TAG = "game_ip_tag";
  @SerializedName(SERIALIZED_NAME_GAME_IP_TAG)
  private String gameIpTag = null;

  public static final String SERIALIZED_NAME_GAME_IP_TYPE = "game_ip_type";
  @SerializedName(SERIALIZED_NAME_GAME_IP_TYPE)
  private List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType> gameIpType = null;

  public static final String SERIALIZED_NAME_HAS_DISCOUNT = "has_discount";
  @SerializedName(SERIALIZED_NAME_HAS_DISCOUNT)
  private Boolean hasDiscount = null;

  public static final String SERIALIZED_NAME_HAS_ONLINE_EARNING = "has_online_earning";
  @SerializedName(SERIALIZED_NAME_HAS_ONLINE_EARNING)
  private Boolean hasOnlineEarning = null;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE = "max_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxPaymentTierRange maxPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MAX_RECHARGE_TIER = "max_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MAX_RECHARGE_TIER)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxRechargeTier maxRechargeTier = null;

  public static final String SERIALIZED_NAME_MEMBERSHIP_TYPE = "membership_type";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_TYPE)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType membershipType = null;

  public static final String SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE = "mid_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMidPaymentTierRange midPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE = "min_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange minPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_RECHARGE_TIER = "min_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MIN_RECHARGE_TIER)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinRechargeTier minRechargeTier = null;

  public static final String SERIALIZED_NAME_NETWORK_ENVIRONMENT = "network_environment";
  @SerializedName(SERIALIZED_NAME_NETWORK_ENVIRONMENT)
  private List<String> networkEnvironment = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER = "recommended_recharge_tier";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRecommendedRechargeTier recommendedRechargeTier = null;

  public static final String SERIALIZED_NAME_REVENUE_MODEL = "revenue_model";
  @SerializedName(SERIALIZED_NAME_REVENUE_MODEL)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRevenueModel revenueModel = null;

  public static final String SERIALIZED_NAME_SCHEDULE_CARDS = "schedule_cards";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_CARDS)
  private List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionScheduleCards> scheduleCards = null;

  public static final String SERIALIZED_NAME_SPOKESPERSON = "spokesperson";
  @SerializedName(SERIALIZED_NAME_SPOKESPERSON)
  private String spokesperson = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus status = null;

  public static final String SERIALIZED_NAME_THEME_TAG = "theme_tag";
  @SerializedName(SERIALIZED_NAME_THEME_TAG)
  private String themeTag = null;

  public static final String SERIALIZED_NAME_VERSION_CODE = "version_code";
  @SerializedName(SERIALIZED_NAME_VERSION_CODE)
  private String versionCode = null;

  public static final String SERIALIZED_NAME_VERSION_ID = "version_id";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private String versionId = null;

  public static final String SERIALIZED_NAME_VERSION_NAME = "version_name";
  @SerializedName(SERIALIZED_NAME_VERSION_NAME)
  private String versionName = null;

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion() {
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion artStyle(String artStyle) {
    
    this.artStyle = artStyle;
    return this;
  }

   /**
   * 
   * @return artStyle
  **/
  @javax.annotation.Nullable
  public String getArtStyle() {
    return artStyle;
  }


  public void setArtStyle(String artStyle) {
    this.artStyle = artStyle;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion auditId(Long auditId) {
    
    this.auditId = auditId;
    return this;
  }

   /**
   * 审核 id
   * @return auditId
  **/
  @javax.annotation.Nullable
  public Long getAuditId() {
    return auditId;
  }


  public void setAuditId(Long auditId) {
    this.auditId = auditId;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion auditMessage(String auditMessage) {
    
    this.auditMessage = auditMessage;
    return this;
  }

   /**
   * 审核建议
   * @return auditMessage
  **/
  @javax.annotation.Nullable
  public String getAuditMessage() {
    return auditMessage;
  }


  public void setAuditMessage(String auditMessage) {
    this.auditMessage = auditMessage;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion discountRate(Long discountRate) {
    
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


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion featureTags(List<String> featureTags) {
    
    this.featureTags = featureTags;
    return this;
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion addFeatureTagsItem(String featureTagsItem) {
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
  @javax.annotation.Nullable
  public List<String> getFeatureTags() {
    return featureTags;
  }


  public void setFeatureTags(List<String> featureTags) {
    this.featureTags = featureTags;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion gameBoxName(String gameBoxName) {
    
    this.gameBoxName = gameBoxName;
    return this;
  }

   /**
   * 
   * @return gameBoxName
  **/
  @javax.annotation.Nullable
  public String getGameBoxName() {
    return gameBoxName;
  }


  public void setGameBoxName(String gameBoxName) {
    this.gameBoxName = gameBoxName;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion gameIpTag(String gameIpTag) {
    
    this.gameIpTag = gameIpTag;
    return this;
  }

   /**
   * 
   * @return gameIpTag
  **/
  @javax.annotation.Nullable
  public String getGameIpTag() {
    return gameIpTag;
  }


  public void setGameIpTag(String gameIpTag) {
    this.gameIpTag = gameIpTag;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion gameIpType(List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType> gameIpType) {
    
    this.gameIpType = gameIpType;
    return this;
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion addGameIpTypeItem(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType gameIpTypeItem) {
    if (this.gameIpType == null) {
      this.gameIpType = new ArrayList<>();
    }
    this.gameIpType.add(gameIpTypeItem);
    return this;
  }

   /**
   * 
   * @return gameIpType
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType> getGameIpType() {
    return gameIpType;
  }


  public void setGameIpType(List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionGameIpType> gameIpType) {
    this.gameIpType = gameIpType;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion hasDiscount(Boolean hasDiscount) {
    
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


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion hasOnlineEarning(Boolean hasOnlineEarning) {
    
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


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion maxPaymentTierRange(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxPaymentTierRange maxPaymentTierRange) {
    
    this.maxPaymentTierRange = maxPaymentTierRange;
    return this;
  }

   /**
   * Get maxPaymentTierRange
   * @return maxPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxPaymentTierRange getMaxPaymentTierRange() {
    return maxPaymentTierRange;
  }


  public void setMaxPaymentTierRange(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxPaymentTierRange maxPaymentTierRange) {
    this.maxPaymentTierRange = maxPaymentTierRange;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion maxRechargeTier(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxRechargeTier maxRechargeTier) {
    
    this.maxRechargeTier = maxRechargeTier;
    return this;
  }

   /**
   * Get maxRechargeTier
   * @return maxRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxRechargeTier getMaxRechargeTier() {
    return maxRechargeTier;
  }


  public void setMaxRechargeTier(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMaxRechargeTier maxRechargeTier) {
    this.maxRechargeTier = maxRechargeTier;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion membershipType(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType membershipType) {
    
    this.membershipType = membershipType;
    return this;
  }

   /**
   * Get membershipType
   * @return membershipType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType getMembershipType() {
    return membershipType;
  }


  public void setMembershipType(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMembershipType membershipType) {
    this.membershipType = membershipType;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion midPaymentTierRange(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMidPaymentTierRange midPaymentTierRange) {
    
    this.midPaymentTierRange = midPaymentTierRange;
    return this;
  }

   /**
   * Get midPaymentTierRange
   * @return midPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMidPaymentTierRange getMidPaymentTierRange() {
    return midPaymentTierRange;
  }


  public void setMidPaymentTierRange(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMidPaymentTierRange midPaymentTierRange) {
    this.midPaymentTierRange = midPaymentTierRange;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion minPaymentTierRange(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange minPaymentTierRange) {
    
    this.minPaymentTierRange = minPaymentTierRange;
    return this;
  }

   /**
   * Get minPaymentTierRange
   * @return minPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange getMinPaymentTierRange() {
    return minPaymentTierRange;
  }


  public void setMinPaymentTierRange(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinPaymentTierRange minPaymentTierRange) {
    this.minPaymentTierRange = minPaymentTierRange;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion minRechargeTier(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinRechargeTier minRechargeTier) {
    
    this.minRechargeTier = minRechargeTier;
    return this;
  }

   /**
   * Get minRechargeTier
   * @return minRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinRechargeTier getMinRechargeTier() {
    return minRechargeTier;
  }


  public void setMinRechargeTier(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionMinRechargeTier minRechargeTier) {
    this.minRechargeTier = minRechargeTier;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion networkEnvironment(List<String> networkEnvironment) {
    
    this.networkEnvironment = networkEnvironment;
    return this;
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion addNetworkEnvironmentItem(String networkEnvironmentItem) {
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
  @javax.annotation.Nullable
  public List<String> getNetworkEnvironment() {
    return networkEnvironment;
  }


  public void setNetworkEnvironment(List<String> networkEnvironment) {
    this.networkEnvironment = networkEnvironment;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion recommendedRechargeTier(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRecommendedRechargeTier recommendedRechargeTier) {
    
    this.recommendedRechargeTier = recommendedRechargeTier;
    return this;
  }

   /**
   * Get recommendedRechargeTier
   * @return recommendedRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRecommendedRechargeTier getRecommendedRechargeTier() {
    return recommendedRechargeTier;
  }


  public void setRecommendedRechargeTier(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRecommendedRechargeTier recommendedRechargeTier) {
    this.recommendedRechargeTier = recommendedRechargeTier;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion revenueModel(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRevenueModel revenueModel) {
    
    this.revenueModel = revenueModel;
    return this;
  }

   /**
   * Get revenueModel
   * @return revenueModel
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRevenueModel getRevenueModel() {
    return revenueModel;
  }


  public void setRevenueModel(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionRevenueModel revenueModel) {
    this.revenueModel = revenueModel;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion scheduleCards(List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionScheduleCards> scheduleCards) {
    
    this.scheduleCards = scheduleCards;
    return this;
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion addScheduleCardsItem(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionScheduleCards scheduleCardsItem) {
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
  public List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionScheduleCards> getScheduleCards() {
    return scheduleCards;
  }


  public void setScheduleCards(List<ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionScheduleCards> scheduleCards) {
    this.scheduleCards = scheduleCards;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion spokesperson(String spokesperson) {
    
    this.spokesperson = spokesperson;
    return this;
  }

   /**
   * 
   * @return spokesperson
  **/
  @javax.annotation.Nullable
  public String getSpokesperson() {
    return spokesperson;
  }


  public void setSpokesperson(String spokesperson) {
    this.spokesperson = spokesperson;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion status(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAppManagementAndroidBasicPackageGetV2DataCurrentVersionStatus status) {
    this.status = status;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion themeTag(String themeTag) {
    
    this.themeTag = themeTag;
    return this;
  }

   /**
   * 
   * @return themeTag
  **/
  @javax.annotation.Nullable
  public String getThemeTag() {
    return themeTag;
  }


  public void setThemeTag(String themeTag) {
    this.themeTag = themeTag;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion versionCode(String versionCode) {
    
    this.versionCode = versionCode;
    return this;
  }

   /**
   * 版本 code
   * @return versionCode
  **/
  @javax.annotation.Nullable
  public String getVersionCode() {
    return versionCode;
  }


  public void setVersionCode(String versionCode) {
    this.versionCode = versionCode;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion versionId(String versionId) {
    
    this.versionId = versionId;
    return this;
  }

   /**
   * 审核 id
   * @return versionId
  **/
  @javax.annotation.Nullable
  public String getVersionId() {
    return versionId;
  }


  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion versionName(String versionName) {
    
    this.versionName = versionName;
    return this;
  }

   /**
   * 版本信息
   * @return versionName
  **/
  @javax.annotation.Nullable
  public String getVersionName() {
    return versionName;
  }


  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion = (ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion) o;
    return Objects.equals(this.appName, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.appName) &&
        Objects.equals(this.artStyle, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.artStyle) &&
        Objects.equals(this.auditId, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.auditId) &&
        Objects.equals(this.auditMessage, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.auditMessage) &&
        Objects.equals(this.discountRate, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.discountRate) &&
        Objects.equals(this.featureTags, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.featureTags) &&
        Objects.equals(this.gameBoxName, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.gameBoxName) &&
        Objects.equals(this.gameIpTag, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.gameIpTag) &&
        Objects.equals(this.gameIpType, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.gameIpType) &&
        Objects.equals(this.hasDiscount, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.hasDiscount) &&
        Objects.equals(this.hasOnlineEarning, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.hasOnlineEarning) &&
        Objects.equals(this.maxPaymentTierRange, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.maxPaymentTierRange) &&
        Objects.equals(this.maxRechargeTier, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.maxRechargeTier) &&
        Objects.equals(this.membershipType, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.membershipType) &&
        Objects.equals(this.midPaymentTierRange, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.midPaymentTierRange) &&
        Objects.equals(this.minPaymentTierRange, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.minPaymentTierRange) &&
        Objects.equals(this.minRechargeTier, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.minRechargeTier) &&
        Objects.equals(this.networkEnvironment, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.networkEnvironment) &&
        Objects.equals(this.recommendedRechargeTier, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.recommendedRechargeTier) &&
        Objects.equals(this.revenueModel, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.revenueModel) &&
        Objects.equals(this.scheduleCards, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.scheduleCards) &&
        Objects.equals(this.spokesperson, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.spokesperson) &&
        Objects.equals(this.status, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.status) &&
        Objects.equals(this.themeTag, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.themeTag) &&
        Objects.equals(this.versionCode, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.versionCode) &&
        Objects.equals(this.versionId, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.versionId) &&
        Objects.equals(this.versionName, toolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.versionName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, artStyle, auditId, auditMessage, discountRate, featureTags, gameBoxName, gameIpTag, gameIpType, hasDiscount, hasOnlineEarning, maxPaymentTierRange, maxRechargeTier, membershipType, midPaymentTierRange, minPaymentTierRange, minRechargeTier, networkEnvironment, recommendedRechargeTier, revenueModel, scheduleCards, spokesperson, status, themeTag, versionCode, versionId, versionName);
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
    sb.append("class ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    artStyle: ").append(toIndentedString(artStyle)).append("\n");
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
    sb.append("    auditMessage: ").append(toIndentedString(auditMessage)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    featureTags: ").append(toIndentedString(featureTags)).append("\n");
    sb.append("    gameBoxName: ").append(toIndentedString(gameBoxName)).append("\n");
    sb.append("    gameIpTag: ").append(toIndentedString(gameIpTag)).append("\n");
    sb.append("    gameIpType: ").append(toIndentedString(gameIpType)).append("\n");
    sb.append("    hasDiscount: ").append(toIndentedString(hasDiscount)).append("\n");
    sb.append("    hasOnlineEarning: ").append(toIndentedString(hasOnlineEarning)).append("\n");
    sb.append("    maxPaymentTierRange: ").append(toIndentedString(maxPaymentTierRange)).append("\n");
    sb.append("    maxRechargeTier: ").append(toIndentedString(maxRechargeTier)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
    sb.append("    midPaymentTierRange: ").append(toIndentedString(midPaymentTierRange)).append("\n");
    sb.append("    minPaymentTierRange: ").append(toIndentedString(minPaymentTierRange)).append("\n");
    sb.append("    minRechargeTier: ").append(toIndentedString(minRechargeTier)).append("\n");
    sb.append("    networkEnvironment: ").append(toIndentedString(networkEnvironment)).append("\n");
    sb.append("    recommendedRechargeTier: ").append(toIndentedString(recommendedRechargeTier)).append("\n");
    sb.append("    revenueModel: ").append(toIndentedString(revenueModel)).append("\n");
    sb.append("    scheduleCards: ").append(toIndentedString(scheduleCards)).append("\n");
    sb.append("    spokesperson: ").append(toIndentedString(spokesperson)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    themeTag: ").append(toIndentedString(themeTag)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("art_style");
    openapiFields.add("audit_id");
    openapiFields.add("audit_message");
    openapiFields.add("discount_rate");
    openapiFields.add("feature_tags");
    openapiFields.add("game_box_name");
    openapiFields.add("game_ip_tag");
    openapiFields.add("game_ip_type");
    openapiFields.add("has_discount");
    openapiFields.add("has_online_earning");
    openapiFields.add("max_payment_tier_range");
    openapiFields.add("max_recharge_tier");
    openapiFields.add("membership_type");
    openapiFields.add("mid_payment_tier_range");
    openapiFields.add("min_payment_tier_range");
    openapiFields.add("min_recharge_tier");
    openapiFields.add("network_environment");
    openapiFields.add("recommended_recharge_tier");
    openapiFields.add("revenue_model");
    openapiFields.add("schedule_cards");
    openapiFields.add("spokesperson");
    openapiFields.add("status");
    openapiFields.add("theme_tag");
    openapiFields.add("version_code");
    openapiFields.add("version_id");
    openapiFields.add("version_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion
  */
  public static ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

