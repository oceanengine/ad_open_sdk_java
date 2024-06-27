/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceAc;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceActionDays;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceActionScene;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceAge;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceAudienceMode;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceAutoExtendEnabled;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceAutoExtendTargets;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceAwemeFanBehaviors;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceAwemeFanBehaviorsDays;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceDistrict;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceElectricFenceRegion;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceGender;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceLivePlatformTags;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceLocationType;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceNewCustomer;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudiencePlatform;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceSearchExtended;
import com.bytedance.ads.model.QianchuanAdUpdateV10AudienceSmartInterestAction;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class QianchuanAdUpdateV10RequestAudience {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private List<QianchuanAdUpdateV10AudienceAc> ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private QianchuanAdUpdateV10AudienceActionDays actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<QianchuanAdUpdateV10AudienceActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_ACTION_WORDS = "action_words";
  @SerializedName(SERIALIZED_NAME_ACTION_WORDS)
  private List<Long> actionWords = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanAdUpdateV10AudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanAdUpdateV10AudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_ENABLED = "auto_extend_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_ENABLED)
  private QianchuanAdUpdateV10AudienceAutoExtendEnabled autoExtendEnabled = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TARGETS = "auto_extend_targets";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TARGETS)
  private List<QianchuanAdUpdateV10AudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_ACCOUNTS = "aweme_fan_accounts";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_ACCOUNTS)
  private List<Long> awemeFanAccounts = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS = "aweme_fan_behaviors";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS)
  private List<QianchuanAdUpdateV10AudienceAwemeFanBehaviors> awemeFanBehaviors = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS = "aweme_fan_behaviors_days";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS)
  private QianchuanAdUpdateV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_CATEGORIES = "aweme_fan_categories";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_CATEGORIES)
  private List<Long> awemeFanCategories = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanAdUpdateV10AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private Boolean districtType = null;

  public static final String SERIALIZED_NAME_ELECTRIC_FENCE_REGION = "electric_fence_region";
  @SerializedName(SERIALIZED_NAME_ELECTRIC_FENCE_REGION)
  private QianchuanAdUpdateV10AudienceElectricFenceRegion electricFenceRegion = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanAdUpdateV10AudienceExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanAdUpdateV10AudienceGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public static final String SERIALIZED_NAME_INTEREST_WORDS = "interest_words";
  @SerializedName(SERIALIZED_NAME_INTEREST_WORDS)
  private List<Long> interestWords = null;

  public static final String SERIALIZED_NAME_LIVE_PLATFORM_TAGS = "live_platform_tags";
  @SerializedName(SERIALIZED_NAME_LIVE_PLATFORM_TAGS)
  private List<QianchuanAdUpdateV10AudienceLivePlatformTags> livePlatformTags = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private QianchuanAdUpdateV10AudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_NEW_CUSTOMER = "new_customer";
  @SerializedName(SERIALIZED_NAME_NEW_CUSTOMER)
  private QianchuanAdUpdateV10AudienceNewCustomer newCustomer = null;

  public static final String SERIALIZED_NAME_ORIENTATION_ID = "orientation_id";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_ID)
  private Long orientationId = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<QianchuanAdUpdateV10AudiencePlatform> platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE = "retargeting_tags_include";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE)
  private List<Long> retargetingTagsInclude = null;

  public static final String SERIALIZED_NAME_SEARCH_EXTENDED = "search_extended";
  @SerializedName(SERIALIZED_NAME_SEARCH_EXTENDED)
  private QianchuanAdUpdateV10AudienceSearchExtended searchExtended = null;

  public static final String SERIALIZED_NAME_SMART_INTEREST_ACTION = "smart_interest_action";
  @SerializedName(SERIALIZED_NAME_SMART_INTEREST_ACTION)
  private QianchuanAdUpdateV10AudienceSmartInterestAction smartInterestAction = null;

  public QianchuanAdUpdateV10RequestAudience() {
  }

  public QianchuanAdUpdateV10RequestAudience ac(List<QianchuanAdUpdateV10AudienceAc> ac) {
    
    this.ac = ac;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addAcItem(QianchuanAdUpdateV10AudienceAc acItem) {
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
  public List<QianchuanAdUpdateV10AudienceAc> getAc() {
    return ac;
  }


  public void setAc(List<QianchuanAdUpdateV10AudienceAc> ac) {
    this.ac = ac;
  }


  public QianchuanAdUpdateV10RequestAudience actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addActionCategoriesItem(Long actionCategoriesItem) {
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


  public QianchuanAdUpdateV10RequestAudience actionDays(QianchuanAdUpdateV10AudienceActionDays actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * Get actionDays
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceActionDays getActionDays() {
    return actionDays;
  }


  public void setActionDays(QianchuanAdUpdateV10AudienceActionDays actionDays) {
    this.actionDays = actionDays;
  }


  public QianchuanAdUpdateV10RequestAudience actionScene(List<QianchuanAdUpdateV10AudienceActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addActionSceneItem(QianchuanAdUpdateV10AudienceActionScene actionSceneItem) {
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
  public List<QianchuanAdUpdateV10AudienceActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<QianchuanAdUpdateV10AudienceActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public QianchuanAdUpdateV10RequestAudience actionWords(List<Long> actionWords) {
    
    this.actionWords = actionWords;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addActionWordsItem(Long actionWordsItem) {
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


  public QianchuanAdUpdateV10RequestAudience age(List<QianchuanAdUpdateV10AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addAgeItem(QianchuanAdUpdateV10AudienceAge ageItem) {
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
  public List<QianchuanAdUpdateV10AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanAdUpdateV10AudienceAge> age) {
    this.age = age;
  }


  public QianchuanAdUpdateV10RequestAudience audienceMode(QianchuanAdUpdateV10AudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanAdUpdateV10AudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanAdUpdateV10RequestAudience autoExtendEnabled(QianchuanAdUpdateV10AudienceAutoExtendEnabled autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * Get autoExtendEnabled
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceAutoExtendEnabled getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(QianchuanAdUpdateV10AudienceAutoExtendEnabled autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public QianchuanAdUpdateV10RequestAudience autoExtendTargets(List<QianchuanAdUpdateV10AudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addAutoExtendTargetsItem(QianchuanAdUpdateV10AudienceAutoExtendTargets autoExtendTargetsItem) {
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
  public List<QianchuanAdUpdateV10AudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<QianchuanAdUpdateV10AudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public QianchuanAdUpdateV10RequestAudience awemeFanAccounts(List<Long> awemeFanAccounts) {
    
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addAwemeFanAccountsItem(Long awemeFanAccountsItem) {
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


  public QianchuanAdUpdateV10RequestAudience awemeFanBehaviors(List<QianchuanAdUpdateV10AudienceAwemeFanBehaviors> awemeFanBehaviors) {
    
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addAwemeFanBehaviorsItem(QianchuanAdUpdateV10AudienceAwemeFanBehaviors awemeFanBehaviorsItem) {
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
  public List<QianchuanAdUpdateV10AudienceAwemeFanBehaviors> getAwemeFanBehaviors() {
    return awemeFanBehaviors;
  }


  public void setAwemeFanBehaviors(List<QianchuanAdUpdateV10AudienceAwemeFanBehaviors> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
  }


  public QianchuanAdUpdateV10RequestAudience awemeFanBehaviorsDays(QianchuanAdUpdateV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
    return this;
  }

   /**
   * Get awemeFanBehaviorsDays
   * @return awemeFanBehaviorsDays
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceAwemeFanBehaviorsDays getAwemeFanBehaviorsDays() {
    return awemeFanBehaviorsDays;
  }


  public void setAwemeFanBehaviorsDays(QianchuanAdUpdateV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
  }


  public QianchuanAdUpdateV10RequestAudience awemeFanCategories(List<Long> awemeFanCategories) {
    
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addAwemeFanCategoriesItem(Long awemeFanCategoriesItem) {
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


  public QianchuanAdUpdateV10RequestAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addCityItem(Long cityItem) {
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


  public QianchuanAdUpdateV10RequestAudience district(QianchuanAdUpdateV10AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanAdUpdateV10AudienceDistrict district) {
    this.district = district;
  }


  public QianchuanAdUpdateV10RequestAudience districtType(Boolean districtType) {
    
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


  public QianchuanAdUpdateV10RequestAudience electricFenceRegion(QianchuanAdUpdateV10AudienceElectricFenceRegion electricFenceRegion) {
    
    this.electricFenceRegion = electricFenceRegion;
    return this;
  }

   /**
   * Get electricFenceRegion
   * @return electricFenceRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceElectricFenceRegion getElectricFenceRegion() {
    return electricFenceRegion;
  }


  public void setElectricFenceRegion(QianchuanAdUpdateV10AudienceElectricFenceRegion electricFenceRegion) {
    this.electricFenceRegion = electricFenceRegion;
  }


  public QianchuanAdUpdateV10RequestAudience excludeLimitedRegion(QianchuanAdUpdateV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanAdUpdateV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAdUpdateV10RequestAudience gender(QianchuanAdUpdateV10AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanAdUpdateV10AudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanAdUpdateV10RequestAudience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addInterestCategoriesItem(Long interestCategoriesItem) {
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


  public QianchuanAdUpdateV10RequestAudience interestWords(List<Long> interestWords) {
    
    this.interestWords = interestWords;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addInterestWordsItem(Long interestWordsItem) {
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


  public QianchuanAdUpdateV10RequestAudience livePlatformTags(List<QianchuanAdUpdateV10AudienceLivePlatformTags> livePlatformTags) {
    
    this.livePlatformTags = livePlatformTags;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addLivePlatformTagsItem(QianchuanAdUpdateV10AudienceLivePlatformTags livePlatformTagsItem) {
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
  public List<QianchuanAdUpdateV10AudienceLivePlatformTags> getLivePlatformTags() {
    return livePlatformTags;
  }


  public void setLivePlatformTags(List<QianchuanAdUpdateV10AudienceLivePlatformTags> livePlatformTags) {
    this.livePlatformTags = livePlatformTags;
  }


  public QianchuanAdUpdateV10RequestAudience locationType(QianchuanAdUpdateV10AudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(QianchuanAdUpdateV10AudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public QianchuanAdUpdateV10RequestAudience newCustomer(QianchuanAdUpdateV10AudienceNewCustomer newCustomer) {
    
    this.newCustomer = newCustomer;
    return this;
  }

   /**
   * Get newCustomer
   * @return newCustomer
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceNewCustomer getNewCustomer() {
    return newCustomer;
  }


  public void setNewCustomer(QianchuanAdUpdateV10AudienceNewCustomer newCustomer) {
    this.newCustomer = newCustomer;
  }


  public QianchuanAdUpdateV10RequestAudience orientationId(Long orientationId) {
    
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


  public QianchuanAdUpdateV10RequestAudience platform(List<QianchuanAdUpdateV10AudiencePlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addPlatformItem(QianchuanAdUpdateV10AudiencePlatform platformItem) {
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
  public List<QianchuanAdUpdateV10AudiencePlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<QianchuanAdUpdateV10AudiencePlatform> platform) {
    this.platform = platform;
  }


  public QianchuanAdUpdateV10RequestAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
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


  public QianchuanAdUpdateV10RequestAudience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public QianchuanAdUpdateV10RequestAudience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
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


  public QianchuanAdUpdateV10RequestAudience searchExtended(QianchuanAdUpdateV10AudienceSearchExtended searchExtended) {
    
    this.searchExtended = searchExtended;
    return this;
  }

   /**
   * Get searchExtended
   * @return searchExtended
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceSearchExtended getSearchExtended() {
    return searchExtended;
  }


  public void setSearchExtended(QianchuanAdUpdateV10AudienceSearchExtended searchExtended) {
    this.searchExtended = searchExtended;
  }


  public QianchuanAdUpdateV10RequestAudience smartInterestAction(QianchuanAdUpdateV10AudienceSmartInterestAction smartInterestAction) {
    
    this.smartInterestAction = smartInterestAction;
    return this;
  }

   /**
   * Get smartInterestAction
   * @return smartInterestAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10AudienceSmartInterestAction getSmartInterestAction() {
    return smartInterestAction;
  }


  public void setSmartInterestAction(QianchuanAdUpdateV10AudienceSmartInterestAction smartInterestAction) {
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
    QianchuanAdUpdateV10RequestAudience qianchuanAdUpdateV10RequestAudience = (QianchuanAdUpdateV10RequestAudience) o;
    return Objects.equals(this.ac, qianchuanAdUpdateV10RequestAudience.ac) &&
        Objects.equals(this.actionCategories, qianchuanAdUpdateV10RequestAudience.actionCategories) &&
        Objects.equals(this.actionDays, qianchuanAdUpdateV10RequestAudience.actionDays) &&
        Objects.equals(this.actionScene, qianchuanAdUpdateV10RequestAudience.actionScene) &&
        Objects.equals(this.actionWords, qianchuanAdUpdateV10RequestAudience.actionWords) &&
        Objects.equals(this.age, qianchuanAdUpdateV10RequestAudience.age) &&
        Objects.equals(this.audienceMode, qianchuanAdUpdateV10RequestAudience.audienceMode) &&
        Objects.equals(this.autoExtendEnabled, qianchuanAdUpdateV10RequestAudience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, qianchuanAdUpdateV10RequestAudience.autoExtendTargets) &&
        Objects.equals(this.awemeFanAccounts, qianchuanAdUpdateV10RequestAudience.awemeFanAccounts) &&
        Objects.equals(this.awemeFanBehaviors, qianchuanAdUpdateV10RequestAudience.awemeFanBehaviors) &&
        Objects.equals(this.awemeFanBehaviorsDays, qianchuanAdUpdateV10RequestAudience.awemeFanBehaviorsDays) &&
        Objects.equals(this.awemeFanCategories, qianchuanAdUpdateV10RequestAudience.awemeFanCategories) &&
        Objects.equals(this.city, qianchuanAdUpdateV10RequestAudience.city) &&
        Objects.equals(this.district, qianchuanAdUpdateV10RequestAudience.district) &&
        Objects.equals(this.districtType, qianchuanAdUpdateV10RequestAudience.districtType) &&
        Objects.equals(this.electricFenceRegion, qianchuanAdUpdateV10RequestAudience.electricFenceRegion) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAdUpdateV10RequestAudience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanAdUpdateV10RequestAudience.gender) &&
        Objects.equals(this.interestCategories, qianchuanAdUpdateV10RequestAudience.interestCategories) &&
        Objects.equals(this.interestWords, qianchuanAdUpdateV10RequestAudience.interestWords) &&
        Objects.equals(this.livePlatformTags, qianchuanAdUpdateV10RequestAudience.livePlatformTags) &&
        Objects.equals(this.locationType, qianchuanAdUpdateV10RequestAudience.locationType) &&
        Objects.equals(this.newCustomer, qianchuanAdUpdateV10RequestAudience.newCustomer) &&
        Objects.equals(this.orientationId, qianchuanAdUpdateV10RequestAudience.orientationId) &&
        Objects.equals(this.platform, qianchuanAdUpdateV10RequestAudience.platform) &&
        Objects.equals(this.retargetingTagsExclude, qianchuanAdUpdateV10RequestAudience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, qianchuanAdUpdateV10RequestAudience.retargetingTagsInclude) &&
        Objects.equals(this.searchExtended, qianchuanAdUpdateV10RequestAudience.searchExtended) &&
        Objects.equals(this.smartInterestAction, qianchuanAdUpdateV10RequestAudience.smartInterestAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategories, actionDays, actionScene, actionWords, age, audienceMode, autoExtendEnabled, autoExtendTargets, awemeFanAccounts, awemeFanBehaviors, awemeFanBehaviorsDays, awemeFanCategories, city, district, districtType, electricFenceRegion, excludeLimitedRegion, gender, interestCategories, interestWords, livePlatformTags, locationType, newCustomer, orientationId, platform, retargetingTagsExclude, retargetingTagsInclude, searchExtended, smartInterestAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestAudience {\n");
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
    sb.append("    electricFenceRegion: ").append(toIndentedString(electricFenceRegion)).append("\n");
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
    sb.append("    searchExtended: ").append(toIndentedString(searchExtended)).append("\n");
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
    openapiFields.add("electric_fence_region");
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
    openapiFields.add("search_extended");
    openapiFields.add("smart_interest_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestAudience>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestAudience
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestAudience
  */
  public static QianchuanAdUpdateV10RequestAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestAudience.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

