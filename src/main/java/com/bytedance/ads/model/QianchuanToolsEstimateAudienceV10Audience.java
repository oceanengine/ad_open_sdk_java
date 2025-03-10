/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceAc;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceActionDays;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceActionScene;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceAge;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceAudienceMode;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceAutoExtendEnabled;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceAutoExtendTargets;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviors;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviorsDays;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceDistrict;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceGender;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceLivePlatformTags;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceLocationType;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceNewCustomer;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudiencePlatform;
import com.bytedance.ads.model.QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanToolsEstimateAudienceV10Audience {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private List<QianchuanToolsEstimateAudienceV10AudienceAc> ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private QianchuanToolsEstimateAudienceV10AudienceActionDays actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<QianchuanToolsEstimateAudienceV10AudienceActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_ACTION_WORDS = "action_words";
  @SerializedName(SERIALIZED_NAME_ACTION_WORDS)
  private List<Long> actionWords = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanToolsEstimateAudienceV10AudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanToolsEstimateAudienceV10AudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_ENABLED = "auto_extend_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_ENABLED)
  private QianchuanToolsEstimateAudienceV10AudienceAutoExtendEnabled autoExtendEnabled = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TARGETS = "auto_extend_targets";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TARGETS)
  private List<QianchuanToolsEstimateAudienceV10AudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_ACCOUNTS = "aweme_fan_accounts";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_ACCOUNTS)
  private List<Long> awemeFanAccounts = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS = "aweme_fan_behaviors";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS)
  private List<QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviors> awemeFanBehaviors = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS = "aweme_fan_behaviors_days";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS)
  private QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_CATEGORIES = "aweme_fan_categories";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_CATEGORIES)
  private List<Long> awemeFanCategories = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanToolsEstimateAudienceV10AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private Boolean districtType = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanToolsEstimateAudienceV10AudienceGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public static final String SERIALIZED_NAME_INTEREST_WORDS = "interest_words";
  @SerializedName(SERIALIZED_NAME_INTEREST_WORDS)
  private List<Long> interestWords = null;

  public static final String SERIALIZED_NAME_LIVE_PLATFORM_TAGS = "live_platform_tags";
  @SerializedName(SERIALIZED_NAME_LIVE_PLATFORM_TAGS)
  private List<QianchuanToolsEstimateAudienceV10AudienceLivePlatformTags> livePlatformTags = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private QianchuanToolsEstimateAudienceV10AudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_NEW_CUSTOMER = "new_customer";
  @SerializedName(SERIALIZED_NAME_NEW_CUSTOMER)
  private QianchuanToolsEstimateAudienceV10AudienceNewCustomer newCustomer = null;

  public static final String SERIALIZED_NAME_ORIENTATION_ID = "orientation_id";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_ID)
  private Long orientationId = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<QianchuanToolsEstimateAudienceV10AudiencePlatform> platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE = "retargeting_tags_include";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE)
  private List<Long> retargetingTagsInclude = null;

  public static final String SERIALIZED_NAME_SMART_INTEREST_ACTION = "smart_interest_action";
  @SerializedName(SERIALIZED_NAME_SMART_INTEREST_ACTION)
  private QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction smartInterestAction = null;

  public QianchuanToolsEstimateAudienceV10Audience() {
  }

  public QianchuanToolsEstimateAudienceV10Audience ac(List<QianchuanToolsEstimateAudienceV10AudienceAc> ac) {
    
    this.ac = ac;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addAcItem(QianchuanToolsEstimateAudienceV10AudienceAc acItem) {
    if (this.ac == null) {
      this.ac = new ArrayList<>();
    }
    this.ac.add(acItem);
    return this;
  }

   /**
   * 
   * @return ac
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsEstimateAudienceV10AudienceAc> getAc() {
    return ac;
  }


  public void setAc(List<QianchuanToolsEstimateAudienceV10AudienceAc> ac) {
    this.ac = ac;
  }


  public QianchuanToolsEstimateAudienceV10Audience actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addActionCategoriesItem(Long actionCategoriesItem) {
    if (this.actionCategories == null) {
      this.actionCategories = new ArrayList<>();
    }
    this.actionCategories.add(actionCategoriesItem);
    return this;
  }

   /**
   * 
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
  }


  public QianchuanToolsEstimateAudienceV10Audience actionDays(QianchuanToolsEstimateAudienceV10AudienceActionDays actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * Get actionDays
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceActionDays getActionDays() {
    return actionDays;
  }


  public void setActionDays(QianchuanToolsEstimateAudienceV10AudienceActionDays actionDays) {
    this.actionDays = actionDays;
  }


  public QianchuanToolsEstimateAudienceV10Audience actionScene(List<QianchuanToolsEstimateAudienceV10AudienceActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addActionSceneItem(QianchuanToolsEstimateAudienceV10AudienceActionScene actionSceneItem) {
    if (this.actionScene == null) {
      this.actionScene = new ArrayList<>();
    }
    this.actionScene.add(actionSceneItem);
    return this;
  }

   /**
   * 
   * @return actionScene
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsEstimateAudienceV10AudienceActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<QianchuanToolsEstimateAudienceV10AudienceActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public QianchuanToolsEstimateAudienceV10Audience actionWords(List<Long> actionWords) {
    
    this.actionWords = actionWords;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addActionWordsItem(Long actionWordsItem) {
    if (this.actionWords == null) {
      this.actionWords = new ArrayList<>();
    }
    this.actionWords.add(actionWordsItem);
    return this;
  }

   /**
   * 
   * @return actionWords
  **/
  @javax.annotation.Nullable
  public List<Long> getActionWords() {
    return actionWords;
  }


  public void setActionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
  }


  public QianchuanToolsEstimateAudienceV10Audience age(List<QianchuanToolsEstimateAudienceV10AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addAgeItem(QianchuanToolsEstimateAudienceV10AudienceAge ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsEstimateAudienceV10AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanToolsEstimateAudienceV10AudienceAge> age) {
    this.age = age;
  }


  public QianchuanToolsEstimateAudienceV10Audience audienceMode(QianchuanToolsEstimateAudienceV10AudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanToolsEstimateAudienceV10AudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanToolsEstimateAudienceV10Audience autoExtendEnabled(QianchuanToolsEstimateAudienceV10AudienceAutoExtendEnabled autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * Get autoExtendEnabled
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceAutoExtendEnabled getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(QianchuanToolsEstimateAudienceV10AudienceAutoExtendEnabled autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public QianchuanToolsEstimateAudienceV10Audience autoExtendTargets(List<QianchuanToolsEstimateAudienceV10AudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addAutoExtendTargetsItem(QianchuanToolsEstimateAudienceV10AudienceAutoExtendTargets autoExtendTargetsItem) {
    if (this.autoExtendTargets == null) {
      this.autoExtendTargets = new ArrayList<>();
    }
    this.autoExtendTargets.add(autoExtendTargetsItem);
    return this;
  }

   /**
   * 
   * @return autoExtendTargets
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsEstimateAudienceV10AudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<QianchuanToolsEstimateAudienceV10AudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public QianchuanToolsEstimateAudienceV10Audience awemeFanAccounts(List<Long> awemeFanAccounts) {
    
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addAwemeFanAccountsItem(Long awemeFanAccountsItem) {
    if (this.awemeFanAccounts == null) {
      this.awemeFanAccounts = new ArrayList<>();
    }
    this.awemeFanAccounts.add(awemeFanAccountsItem);
    return this;
  }

   /**
   * 
   * @return awemeFanAccounts
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeFanAccounts() {
    return awemeFanAccounts;
  }


  public void setAwemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
  }


  public QianchuanToolsEstimateAudienceV10Audience awemeFanBehaviors(List<QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviors> awemeFanBehaviors) {
    
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addAwemeFanBehaviorsItem(QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviors awemeFanBehaviorsItem) {
    if (this.awemeFanBehaviors == null) {
      this.awemeFanBehaviors = new ArrayList<>();
    }
    this.awemeFanBehaviors.add(awemeFanBehaviorsItem);
    return this;
  }

   /**
   * 
   * @return awemeFanBehaviors
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviors> getAwemeFanBehaviors() {
    return awemeFanBehaviors;
  }


  public void setAwemeFanBehaviors(List<QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviors> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
  }


  public QianchuanToolsEstimateAudienceV10Audience awemeFanBehaviorsDays(QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
    return this;
  }

   /**
   * Get awemeFanBehaviorsDays
   * @return awemeFanBehaviorsDays
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviorsDays getAwemeFanBehaviorsDays() {
    return awemeFanBehaviorsDays;
  }


  public void setAwemeFanBehaviorsDays(QianchuanToolsEstimateAudienceV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
  }


  public QianchuanToolsEstimateAudienceV10Audience awemeFanCategories(List<Long> awemeFanCategories) {
    
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addAwemeFanCategoriesItem(Long awemeFanCategoriesItem) {
    if (this.awemeFanCategories == null) {
      this.awemeFanCategories = new ArrayList<>();
    }
    this.awemeFanCategories.add(awemeFanCategoriesItem);
    return this;
  }

   /**
   * 
   * @return awemeFanCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeFanCategories() {
    return awemeFanCategories;
  }


  public void setAwemeFanCategories(List<Long> awemeFanCategories) {
    this.awemeFanCategories = awemeFanCategories;
  }


  public QianchuanToolsEstimateAudienceV10Audience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public QianchuanToolsEstimateAudienceV10Audience district(QianchuanToolsEstimateAudienceV10AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanToolsEstimateAudienceV10AudienceDistrict district) {
    this.district = district;
  }


  public QianchuanToolsEstimateAudienceV10Audience districtType(Boolean districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * 
   * @return districtType
  **/
  @javax.annotation.Nullable
  public Boolean getDistrictType() {
    return districtType;
  }


  public void setDistrictType(Boolean districtType) {
    this.districtType = districtType;
  }


  public QianchuanToolsEstimateAudienceV10Audience excludeLimitedRegion(QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanToolsEstimateAudienceV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanToolsEstimateAudienceV10Audience gender(QianchuanToolsEstimateAudienceV10AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanToolsEstimateAudienceV10AudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanToolsEstimateAudienceV10Audience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addInterestCategoriesItem(Long interestCategoriesItem) {
    if (this.interestCategories == null) {
      this.interestCategories = new ArrayList<>();
    }
    this.interestCategories.add(interestCategoriesItem);
    return this;
  }

   /**
   * 
   * @return interestCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestCategories() {
    return interestCategories;
  }


  public void setInterestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
  }


  public QianchuanToolsEstimateAudienceV10Audience interestWords(List<Long> interestWords) {
    
    this.interestWords = interestWords;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addInterestWordsItem(Long interestWordsItem) {
    if (this.interestWords == null) {
      this.interestWords = new ArrayList<>();
    }
    this.interestWords.add(interestWordsItem);
    return this;
  }

   /**
   * 
   * @return interestWords
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestWords() {
    return interestWords;
  }


  public void setInterestWords(List<Long> interestWords) {
    this.interestWords = interestWords;
  }


  public QianchuanToolsEstimateAudienceV10Audience livePlatformTags(List<QianchuanToolsEstimateAudienceV10AudienceLivePlatformTags> livePlatformTags) {
    
    this.livePlatformTags = livePlatformTags;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addLivePlatformTagsItem(QianchuanToolsEstimateAudienceV10AudienceLivePlatformTags livePlatformTagsItem) {
    if (this.livePlatformTags == null) {
      this.livePlatformTags = new ArrayList<>();
    }
    this.livePlatformTags.add(livePlatformTagsItem);
    return this;
  }

   /**
   * 
   * @return livePlatformTags
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsEstimateAudienceV10AudienceLivePlatformTags> getLivePlatformTags() {
    return livePlatformTags;
  }


  public void setLivePlatformTags(List<QianchuanToolsEstimateAudienceV10AudienceLivePlatformTags> livePlatformTags) {
    this.livePlatformTags = livePlatformTags;
  }


  public QianchuanToolsEstimateAudienceV10Audience locationType(QianchuanToolsEstimateAudienceV10AudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(QianchuanToolsEstimateAudienceV10AudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public QianchuanToolsEstimateAudienceV10Audience newCustomer(QianchuanToolsEstimateAudienceV10AudienceNewCustomer newCustomer) {
    
    this.newCustomer = newCustomer;
    return this;
  }

   /**
   * Get newCustomer
   * @return newCustomer
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceNewCustomer getNewCustomer() {
    return newCustomer;
  }


  public void setNewCustomer(QianchuanToolsEstimateAudienceV10AudienceNewCustomer newCustomer) {
    this.newCustomer = newCustomer;
  }


  public QianchuanToolsEstimateAudienceV10Audience orientationId(Long orientationId) {
    
    this.orientationId = orientationId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return orientationId
  **/
  @javax.annotation.Nullable
  public Long getOrientationId() {
    return orientationId;
  }


  public void setOrientationId(Long orientationId) {
    this.orientationId = orientationId;
  }


  public QianchuanToolsEstimateAudienceV10Audience platform(List<QianchuanToolsEstimateAudienceV10AudiencePlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addPlatformItem(QianchuanToolsEstimateAudienceV10AudiencePlatform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsEstimateAudienceV10AudiencePlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<QianchuanToolsEstimateAudienceV10AudiencePlatform> platform) {
    this.platform = platform;
  }


  public QianchuanToolsEstimateAudienceV10Audience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 
   * @return retargetingTagsExclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsExclude() {
    return retargetingTagsExclude;
  }


  public void setRetargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
  }


  public QianchuanToolsEstimateAudienceV10Audience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public QianchuanToolsEstimateAudienceV10Audience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
    if (this.retargetingTagsInclude == null) {
      this.retargetingTagsInclude = new ArrayList<>();
    }
    this.retargetingTagsInclude.add(retargetingTagsIncludeItem);
    return this;
  }

   /**
   * 
   * @return retargetingTagsInclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsInclude() {
    return retargetingTagsInclude;
  }


  public void setRetargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
  }


  public QianchuanToolsEstimateAudienceV10Audience smartInterestAction(QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction smartInterestAction) {
    
    this.smartInterestAction = smartInterestAction;
    return this;
  }

   /**
   * Get smartInterestAction
   * @return smartInterestAction
  **/
  @javax.annotation.Nullable
  public QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction getSmartInterestAction() {
    return smartInterestAction;
  }


  public void setSmartInterestAction(QianchuanToolsEstimateAudienceV10AudienceSmartInterestAction smartInterestAction) {
    this.smartInterestAction = smartInterestAction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsEstimateAudienceV10Audience qianchuanToolsEstimateAudienceV10Audience = (QianchuanToolsEstimateAudienceV10Audience) o;
    return Objects.equals(this.ac, qianchuanToolsEstimateAudienceV10Audience.ac) &&
        Objects.equals(this.actionCategories, qianchuanToolsEstimateAudienceV10Audience.actionCategories) &&
        Objects.equals(this.actionDays, qianchuanToolsEstimateAudienceV10Audience.actionDays) &&
        Objects.equals(this.actionScene, qianchuanToolsEstimateAudienceV10Audience.actionScene) &&
        Objects.equals(this.actionWords, qianchuanToolsEstimateAudienceV10Audience.actionWords) &&
        Objects.equals(this.age, qianchuanToolsEstimateAudienceV10Audience.age) &&
        Objects.equals(this.audienceMode, qianchuanToolsEstimateAudienceV10Audience.audienceMode) &&
        Objects.equals(this.autoExtendEnabled, qianchuanToolsEstimateAudienceV10Audience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, qianchuanToolsEstimateAudienceV10Audience.autoExtendTargets) &&
        Objects.equals(this.awemeFanAccounts, qianchuanToolsEstimateAudienceV10Audience.awemeFanAccounts) &&
        Objects.equals(this.awemeFanBehaviors, qianchuanToolsEstimateAudienceV10Audience.awemeFanBehaviors) &&
        Objects.equals(this.awemeFanBehaviorsDays, qianchuanToolsEstimateAudienceV10Audience.awemeFanBehaviorsDays) &&
        Objects.equals(this.awemeFanCategories, qianchuanToolsEstimateAudienceV10Audience.awemeFanCategories) &&
        Objects.equals(this.city, qianchuanToolsEstimateAudienceV10Audience.city) &&
        Objects.equals(this.district, qianchuanToolsEstimateAudienceV10Audience.district) &&
        Objects.equals(this.districtType, qianchuanToolsEstimateAudienceV10Audience.districtType) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanToolsEstimateAudienceV10Audience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanToolsEstimateAudienceV10Audience.gender) &&
        Objects.equals(this.interestCategories, qianchuanToolsEstimateAudienceV10Audience.interestCategories) &&
        Objects.equals(this.interestWords, qianchuanToolsEstimateAudienceV10Audience.interestWords) &&
        Objects.equals(this.livePlatformTags, qianchuanToolsEstimateAudienceV10Audience.livePlatformTags) &&
        Objects.equals(this.locationType, qianchuanToolsEstimateAudienceV10Audience.locationType) &&
        Objects.equals(this.newCustomer, qianchuanToolsEstimateAudienceV10Audience.newCustomer) &&
        Objects.equals(this.orientationId, qianchuanToolsEstimateAudienceV10Audience.orientationId) &&
        Objects.equals(this.platform, qianchuanToolsEstimateAudienceV10Audience.platform) &&
        Objects.equals(this.retargetingTagsExclude, qianchuanToolsEstimateAudienceV10Audience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, qianchuanToolsEstimateAudienceV10Audience.retargetingTagsInclude) &&
        Objects.equals(this.smartInterestAction, qianchuanToolsEstimateAudienceV10Audience.smartInterestAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategories, actionDays, actionScene, actionWords, age, audienceMode, autoExtendEnabled, autoExtendTargets, awemeFanAccounts, awemeFanBehaviors, awemeFanBehaviorsDays, awemeFanCategories, city, district, districtType, excludeLimitedRegion, gender, interestCategories, interestWords, livePlatformTags, locationType, newCustomer, orientationId, platform, retargetingTagsExclude, retargetingTagsInclude, smartInterestAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanToolsEstimateAudienceV10Audience {\n");
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    actionDays: ").append(toIndentedString(actionDays)).append("\n");
    sb.append("    actionScene: ").append(toIndentedString(actionScene)).append("\n");
    sb.append("    actionWords: ").append(toIndentedString(actionWords)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audienceMode: ").append(toIndentedString(audienceMode)).append("\n");
    sb.append("    autoExtendEnabled: ").append(toIndentedString(autoExtendEnabled)).append("\n");
    sb.append("    autoExtendTargets: ").append(toIndentedString(autoExtendTargets)).append("\n");
    sb.append("    awemeFanAccounts: ").append(toIndentedString(awemeFanAccounts)).append("\n");
    sb.append("    awemeFanBehaviors: ").append(toIndentedString(awemeFanBehaviors)).append("\n");
    sb.append("    awemeFanBehaviorsDays: ").append(toIndentedString(awemeFanBehaviorsDays)).append("\n");
    sb.append("    awemeFanCategories: ").append(toIndentedString(awemeFanCategories)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    districtType: ").append(toIndentedString(districtType)).append("\n");
    sb.append("    excludeLimitedRegion: ").append(toIndentedString(excludeLimitedRegion)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategories: ").append(toIndentedString(interestCategories)).append("\n");
    sb.append("    interestWords: ").append(toIndentedString(interestWords)).append("\n");
    sb.append("    livePlatformTags: ").append(toIndentedString(livePlatformTags)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    newCustomer: ").append(toIndentedString(newCustomer)).append("\n");
    sb.append("    orientationId: ").append(toIndentedString(orientationId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    retargetingTagsExclude: ").append(toIndentedString(retargetingTagsExclude)).append("\n");
    sb.append("    retargetingTagsInclude: ").append(toIndentedString(retargetingTagsInclude)).append("\n");
    sb.append("    smartInterestAction: ").append(toIndentedString(smartInterestAction)).append("\n");
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
    openapiFields.add("ac");
    openapiFields.add("action_categories");
    openapiFields.add("action_days");
    openapiFields.add("action_scene");
    openapiFields.add("action_words");
    openapiFields.add("age");
    openapiFields.add("audience_mode");
    openapiFields.add("auto_extend_enabled");
    openapiFields.add("auto_extend_targets");
    openapiFields.add("aweme_fan_accounts");
    openapiFields.add("aweme_fan_behaviors");
    openapiFields.add("aweme_fan_behaviors_days");
    openapiFields.add("aweme_fan_categories");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("district_type");
    openapiFields.add("exclude_limited_region");
    openapiFields.add("gender");
    openapiFields.add("interest_categories");
    openapiFields.add("interest_words");
    openapiFields.add("live_platform_tags");
    openapiFields.add("location_type");
    openapiFields.add("new_customer");
    openapiFields.add("orientation_id");
    openapiFields.add("platform");
    openapiFields.add("retargeting_tags_exclude");
    openapiFields.add("retargeting_tags_include");
    openapiFields.add("smart_interest_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsEstimateAudienceV10Audience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsEstimateAudienceV10Audience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsEstimateAudienceV10Audience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsEstimateAudienceV10Audience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsEstimateAudienceV10Audience>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsEstimateAudienceV10Audience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsEstimateAudienceV10Audience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsEstimateAudienceV10Audience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsEstimateAudienceV10Audience
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsEstimateAudienceV10Audience
  */
  public static QianchuanToolsEstimateAudienceV10Audience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsEstimateAudienceV10Audience.class);
  }

 /**
  * Convert an instance of QianchuanToolsEstimateAudienceV10Audience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

