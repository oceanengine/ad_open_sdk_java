/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceAc;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceActionScene;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceAge;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceAudienceMode;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceAutoExtendTargets;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviors;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviorsDays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceDistrict;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceGender;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceLocationType;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceNewCustomer;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudiencePlatform;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataAudienceSmartInterestAction;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataAudience {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private List<QianchuanAdDetailGetV10DataAudienceAc> ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private Long actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<QianchuanAdDetailGetV10DataAudienceActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_ACTION_WORDS = "action_words";
  @SerializedName(SERIALIZED_NAME_ACTION_WORDS)
  private List<Long> actionWords = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanAdDetailGetV10DataAudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanAdDetailGetV10DataAudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_ENABLED = "auto_extend_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_ENABLED)
  private Long autoExtendEnabled = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TARGETS = "auto_extend_targets";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TARGETS)
  private List<QianchuanAdDetailGetV10DataAudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_ACCOUNTS = "aweme_fan_accounts";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_ACCOUNTS)
  private List<Long> awemeFanAccounts = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS = "aweme_fan_behaviors";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS)
  private List<QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviors> awemeFanBehaviors = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS = "aweme_fan_behaviors_days";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS)
  private QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_CATEGORIES = "aweme_fan_categories";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_CATEGORIES)
  private List<Long> awemeFanCategories = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanAdDetailGetV10DataAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private Boolean districtType = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private Long excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanAdDetailGetV10DataAudienceGender gender = null;

  public static final String SERIALIZED_NAME_INACTIVE_RETARGETING_TAGS = "inactive_retargeting_tags";
  @SerializedName(SERIALIZED_NAME_INACTIVE_RETARGETING_TAGS)
  private List<QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner> inactiveRetargetingTags = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public static final String SERIALIZED_NAME_INTEREST_WORDS = "interest_words";
  @SerializedName(SERIALIZED_NAME_INTEREST_WORDS)
  private List<Long> interestWords = null;

  public static final String SERIALIZED_NAME_LIVE_PLATFORM_TAGS = "live_platform_tags";
  @SerializedName(SERIALIZED_NAME_LIVE_PLATFORM_TAGS)
  private List<String> livePlatformTags = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private QianchuanAdDetailGetV10DataAudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_NEW_CUSTOMER = "new_customer";
  @SerializedName(SERIALIZED_NAME_NEW_CUSTOMER)
  private QianchuanAdDetailGetV10DataAudienceNewCustomer newCustomer = null;

  public static final String SERIALIZED_NAME_ORIENTATION_ID = "orientation_id";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_ID)
  private Long orientationId = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<QianchuanAdDetailGetV10DataAudiencePlatform> platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE = "retargeting_tags_include";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE)
  private List<Long> retargetingTagsInclude = null;

  public static final String SERIALIZED_NAME_SMART_INTEREST_ACTION = "smart_interest_action";
  @SerializedName(SERIALIZED_NAME_SMART_INTEREST_ACTION)
  private QianchuanAdDetailGetV10DataAudienceSmartInterestAction smartInterestAction = null;

  public QianchuanAdDetailGetV10ResponseDataAudience() {
  }

  public QianchuanAdDetailGetV10ResponseDataAudience ac(List<QianchuanAdDetailGetV10DataAudienceAc> ac) {
    
    this.ac = ac;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addAcItem(QianchuanAdDetailGetV10DataAudienceAc acItem) {
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
  public List<QianchuanAdDetailGetV10DataAudienceAc> getAc() {
    return ac;
  }


  public void setAc(List<QianchuanAdDetailGetV10DataAudienceAc> ac) {
    this.ac = ac;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addActionCategoriesItem(Long actionCategoriesItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience actionDays(Long actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * 
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public Long getActionDays() {
    return actionDays;
  }


  public void setActionDays(Long actionDays) {
    this.actionDays = actionDays;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience actionScene(List<QianchuanAdDetailGetV10DataAudienceActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addActionSceneItem(QianchuanAdDetailGetV10DataAudienceActionScene actionSceneItem) {
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
  public List<QianchuanAdDetailGetV10DataAudienceActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<QianchuanAdDetailGetV10DataAudienceActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience actionWords(List<Long> actionWords) {
    
    this.actionWords = actionWords;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addActionWordsItem(Long actionWordsItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience age(List<QianchuanAdDetailGetV10DataAudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addAgeItem(QianchuanAdDetailGetV10DataAudienceAge ageItem) {
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
  public List<QianchuanAdDetailGetV10DataAudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanAdDetailGetV10DataAudienceAge> age) {
    this.age = age;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience audienceMode(QianchuanAdDetailGetV10DataAudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanAdDetailGetV10DataAudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience autoExtendEnabled(Long autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * 
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public Long getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience autoExtendTargets(List<QianchuanAdDetailGetV10DataAudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addAutoExtendTargetsItem(QianchuanAdDetailGetV10DataAudienceAutoExtendTargets autoExtendTargetsItem) {
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
  public List<QianchuanAdDetailGetV10DataAudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<QianchuanAdDetailGetV10DataAudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience awemeFanAccounts(List<Long> awemeFanAccounts) {
    
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addAwemeFanAccountsItem(Long awemeFanAccountsItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience awemeFanBehaviors(List<QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviors> awemeFanBehaviors) {
    
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addAwemeFanBehaviorsItem(QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviors awemeFanBehaviorsItem) {
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
  public List<QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviors> getAwemeFanBehaviors() {
    return awemeFanBehaviors;
  }


  public void setAwemeFanBehaviors(List<QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviors> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience awemeFanBehaviorsDays(QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
    return this;
  }

   /**
   * Get awemeFanBehaviorsDays
   * @return awemeFanBehaviorsDays
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviorsDays getAwemeFanBehaviorsDays() {
    return awemeFanBehaviorsDays;
  }


  public void setAwemeFanBehaviorsDays(QianchuanAdDetailGetV10DataAudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience awemeFanCategories(List<Long> awemeFanCategories) {
    
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addAwemeFanCategoriesItem(Long awemeFanCategoriesItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addCityItem(Long cityItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience district(QianchuanAdDetailGetV10DataAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanAdDetailGetV10DataAudienceDistrict district) {
    this.district = district;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience districtType(Boolean districtType) {
    
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


  public QianchuanAdDetailGetV10ResponseDataAudience excludeLimitedRegion(Long excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * 
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public Long getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(Long excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience gender(QianchuanAdDetailGetV10DataAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanAdDetailGetV10DataAudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience inactiveRetargetingTags(List<QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner> inactiveRetargetingTags) {
    
    this.inactiveRetargetingTags = inactiveRetargetingTags;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addInactiveRetargetingTagsItem(QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner inactiveRetargetingTagsItem) {
    if (this.inactiveRetargetingTags == null) {
      this.inactiveRetargetingTags = new ArrayList<>();
    }
    this.inactiveRetargetingTags.add(inactiveRetargetingTagsItem);
    return this;
  }

   /**
   * 
   * @return inactiveRetargetingTags
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner> getInactiveRetargetingTags() {
    return inactiveRetargetingTags;
  }


  public void setInactiveRetargetingTags(List<QianchuanAdDetailGetV10ResponseDataAudienceInactiveRetargetingTagsInner> inactiveRetargetingTags) {
    this.inactiveRetargetingTags = inactiveRetargetingTags;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addInterestCategoriesItem(Long interestCategoriesItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience interestWords(List<Long> interestWords) {
    
    this.interestWords = interestWords;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addInterestWordsItem(Long interestWordsItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience livePlatformTags(List<String> livePlatformTags) {
    
    this.livePlatformTags = livePlatformTags;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addLivePlatformTagsItem(String livePlatformTagsItem) {
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
  public List<String> getLivePlatformTags() {
    return livePlatformTags;
  }


  public void setLivePlatformTags(List<String> livePlatformTags) {
    this.livePlatformTags = livePlatformTags;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience locationType(QianchuanAdDetailGetV10DataAudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(QianchuanAdDetailGetV10DataAudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience newCustomer(QianchuanAdDetailGetV10DataAudienceNewCustomer newCustomer) {
    
    this.newCustomer = newCustomer;
    return this;
  }

   /**
   * Get newCustomer
   * @return newCustomer
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceNewCustomer getNewCustomer() {
    return newCustomer;
  }


  public void setNewCustomer(QianchuanAdDetailGetV10DataAudienceNewCustomer newCustomer) {
    this.newCustomer = newCustomer;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience orientationId(Long orientationId) {
    
    this.orientationId = orientationId;
    return this;
  }

   /**
   * 
   * @return orientationId
  **/
  @javax.annotation.Nullable
  public Long getOrientationId() {
    return orientationId;
  }


  public void setOrientationId(Long orientationId) {
    this.orientationId = orientationId;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience platform(List<QianchuanAdDetailGetV10DataAudiencePlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addPlatformItem(QianchuanAdDetailGetV10DataAudiencePlatform platformItem) {
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
  public List<QianchuanAdDetailGetV10DataAudiencePlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<QianchuanAdDetailGetV10DataAudiencePlatform> platform) {
    this.platform = platform;
  }


  public QianchuanAdDetailGetV10ResponseDataAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public QianchuanAdDetailGetV10ResponseDataAudience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
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


  public QianchuanAdDetailGetV10ResponseDataAudience smartInterestAction(QianchuanAdDetailGetV10DataAudienceSmartInterestAction smartInterestAction) {
    
    this.smartInterestAction = smartInterestAction;
    return this;
  }

   /**
   * Get smartInterestAction
   * @return smartInterestAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataAudienceSmartInterestAction getSmartInterestAction() {
    return smartInterestAction;
  }


  public void setSmartInterestAction(QianchuanAdDetailGetV10DataAudienceSmartInterestAction smartInterestAction) {
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
    QianchuanAdDetailGetV10ResponseDataAudience qianchuanAdDetailGetV10ResponseDataAudience = (QianchuanAdDetailGetV10ResponseDataAudience) o;
    return Objects.equals(this.ac, qianchuanAdDetailGetV10ResponseDataAudience.ac) &&
        Objects.equals(this.actionCategories, qianchuanAdDetailGetV10ResponseDataAudience.actionCategories) &&
        Objects.equals(this.actionDays, qianchuanAdDetailGetV10ResponseDataAudience.actionDays) &&
        Objects.equals(this.actionScene, qianchuanAdDetailGetV10ResponseDataAudience.actionScene) &&
        Objects.equals(this.actionWords, qianchuanAdDetailGetV10ResponseDataAudience.actionWords) &&
        Objects.equals(this.age, qianchuanAdDetailGetV10ResponseDataAudience.age) &&
        Objects.equals(this.audienceMode, qianchuanAdDetailGetV10ResponseDataAudience.audienceMode) &&
        Objects.equals(this.autoExtendEnabled, qianchuanAdDetailGetV10ResponseDataAudience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, qianchuanAdDetailGetV10ResponseDataAudience.autoExtendTargets) &&
        Objects.equals(this.awemeFanAccounts, qianchuanAdDetailGetV10ResponseDataAudience.awemeFanAccounts) &&
        Objects.equals(this.awemeFanBehaviors, qianchuanAdDetailGetV10ResponseDataAudience.awemeFanBehaviors) &&
        Objects.equals(this.awemeFanBehaviorsDays, qianchuanAdDetailGetV10ResponseDataAudience.awemeFanBehaviorsDays) &&
        Objects.equals(this.awemeFanCategories, qianchuanAdDetailGetV10ResponseDataAudience.awemeFanCategories) &&
        Objects.equals(this.city, qianchuanAdDetailGetV10ResponseDataAudience.city) &&
        Objects.equals(this.district, qianchuanAdDetailGetV10ResponseDataAudience.district) &&
        Objects.equals(this.districtType, qianchuanAdDetailGetV10ResponseDataAudience.districtType) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAdDetailGetV10ResponseDataAudience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanAdDetailGetV10ResponseDataAudience.gender) &&
        Objects.equals(this.inactiveRetargetingTags, qianchuanAdDetailGetV10ResponseDataAudience.inactiveRetargetingTags) &&
        Objects.equals(this.interestCategories, qianchuanAdDetailGetV10ResponseDataAudience.interestCategories) &&
        Objects.equals(this.interestWords, qianchuanAdDetailGetV10ResponseDataAudience.interestWords) &&
        Objects.equals(this.livePlatformTags, qianchuanAdDetailGetV10ResponseDataAudience.livePlatformTags) &&
        Objects.equals(this.locationType, qianchuanAdDetailGetV10ResponseDataAudience.locationType) &&
        Objects.equals(this.newCustomer, qianchuanAdDetailGetV10ResponseDataAudience.newCustomer) &&
        Objects.equals(this.orientationId, qianchuanAdDetailGetV10ResponseDataAudience.orientationId) &&
        Objects.equals(this.platform, qianchuanAdDetailGetV10ResponseDataAudience.platform) &&
        Objects.equals(this.retargetingTagsExclude, qianchuanAdDetailGetV10ResponseDataAudience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, qianchuanAdDetailGetV10ResponseDataAudience.retargetingTagsInclude) &&
        Objects.equals(this.smartInterestAction, qianchuanAdDetailGetV10ResponseDataAudience.smartInterestAction);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategories, actionDays, actionScene, actionWords, age, audienceMode, autoExtendEnabled, autoExtendTargets, awemeFanAccounts, awemeFanBehaviors, awemeFanBehaviorsDays, awemeFanCategories, city, district, districtType, excludeLimitedRegion, gender, inactiveRetargetingTags, interestCategories, interestWords, livePlatformTags, locationType, newCustomer, orientationId, platform, retargetingTagsExclude, retargetingTagsInclude, smartInterestAction);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataAudience {\n");
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
    sb.append("    inactiveRetargetingTags: ").append(toIndentedString(inactiveRetargetingTags)).append("\n");
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
    openapiFields.add("inactive_retargeting_tags");
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
       if (!QianchuanAdDetailGetV10ResponseDataAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataAudience>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataAudience
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataAudience
  */
  public static QianchuanAdDetailGetV10ResponseDataAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataAudience.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

