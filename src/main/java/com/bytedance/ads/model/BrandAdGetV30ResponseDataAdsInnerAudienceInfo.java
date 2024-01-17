/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAudienceInfoAcV2;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAudienceInfoBrandSafety;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAudienceInfoDistrictSplit;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAudienceInfoDistrictType;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAudienceInfoExcludeDistrict;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAudienceInfoPlatformV2;
import com.bytedance.ads.model.BrandAdGetV30DataAdsAudienceInfoRetargetingType;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * 定向信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class BrandAdGetV30ResponseDataAdsInnerAudienceInfo {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private List<Long> ac = null;

  public static final String SERIALIZED_NAME_AC_V2 = "ac_v2";
  @SerializedName(SERIALIZED_NAME_AC_V2)
  private BrandAdGetV30DataAdsAudienceInfoAcV2 acV2 = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES_LEVEL = "action_categories_level";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES_LEVEL)
  private List<String> actionCategoriesLevel = null;

  public static final String SERIALIZED_NAME_AD_TAG = "ad_tag";
  @SerializedName(SERIALIZED_NAME_AD_TAG)
  private List<Long> adTag = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<List<Long>> age = null;

  public static final String SERIALIZED_NAME_BRAND_SAFETY = "brand_safety";
  @SerializedName(SERIALIZED_NAME_BRAND_SAFETY)
  private BrandAdGetV30DataAdsAudienceInfoBrandSafety brandSafety = null;

  public static final String SERIALIZED_NAME_BUSINESS_IDS = "business_ids";
  @SerializedName(SERIALIZED_NAME_BUSINESS_IDS)
  private List<Long> businessIds = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CONTENT_KEY_WORDS = "content_key_words";
  @SerializedName(SERIALIZED_NAME_CONTENT_KEY_WORDS)
  private List<String> contentKeyWords = null;

  public static final String SERIALIZED_NAME_DISPLAY_RETARGETING_TAGS = "display_retargeting_tags";
  @SerializedName(SERIALIZED_NAME_DISPLAY_RETARGETING_TAGS)
  private List<Long> displayRetargetingTags = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district = null;

  public static final String SERIALIZED_NAME_DISTRICT_SPLIT = "district_split";
  @SerializedName(SERIALIZED_NAME_DISTRICT_SPLIT)
  private BrandAdGetV30DataAdsAudienceInfoDistrictSplit districtSplit = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private BrandAdGetV30DataAdsAudienceInfoDistrictType districtType = null;

  public static final String SERIALIZED_NAME_ENTRY = "entry";
  @SerializedName(SERIALIZED_NAME_ENTRY)
  private List<Long> entry = null;

  public static final String SERIALIZED_NAME_EXCLUDE_DISTRICT = "exclude_district";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_DISTRICT)
  private BrandAdGetV30DataAdsAudienceInfoExcludeDistrict excludeDistrict = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Long gender = null;

  public static final String SERIALIZED_NAME_GEOLOCATION = "geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner> geolocation = null;

  public static final String SERIALIZED_NAME_IS_BUSINESS_SPLIT = "is_business_split";
  @SerializedName(SERIALIZED_NAME_IS_BUSINESS_SPLIT)
  private Long isBusinessSplit = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<Long> platform = null;

  public static final String SERIALIZED_NAME_PLATFORM_V2 = "platform_v2";
  @SerializedName(SERIALIZED_NAME_PLATFORM_V2)
  private BrandAdGetV30DataAdsAudienceInfoPlatformV2 platformV2 = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<Long> province = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAG_TYPE = "retargeting_tag_type";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAG_TYPE)
  private Map<String, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue> retargetingTagType = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS = "retargeting_tags";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS)
  private List<Long> retargetingTags = null;

  public static final String SERIALIZED_NAME_RETARGETING_TYPE = "retargeting_type";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TYPE)
  private BrandAdGetV30DataAdsAudienceInfoRetargetingType retargetingType = null;

  public static final String SERIALIZED_NAME_SEARCH_KEYWORD = "search_keyword";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEYWORD)
  private List<String> searchKeyword = null;

  public static final String SERIALIZED_NAME_WORD_BAG_IDS = "word_bag_ids";
  @SerializedName(SERIALIZED_NAME_WORD_BAG_IDS)
  private List<Long> wordBagIds = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<String> wordList = null;

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo() {
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo ac(List<Long> ac) {
    
    this.ac = ac;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addAcItem(Long acItem) {
    if (this.ac == null) {
      this.ac = new ArrayList<>();
    }
    this.ac.add(acItem);
    return this;
  }

   /**
   * 网络
   * @return ac
  **/
  @javax.annotation.Nullable
  public List<Long> getAc() {
    return ac;
  }


  public void setAc(List<Long> ac) {
    this.ac = ac;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo acV2(BrandAdGetV30DataAdsAudienceInfoAcV2 acV2) {
    
    this.acV2 = acV2;
    return this;
  }

   /**
   * Get acV2
   * @return acV2
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAudienceInfoAcV2 getAcV2() {
    return acV2;
  }


  public void setAcV2(BrandAdGetV30DataAdsAudienceInfoAcV2 acV2) {
    this.acV2 = acV2;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addActionCategoriesItem(Long actionCategoriesItem) {
    if (this.actionCategories == null) {
      this.actionCategories = new ArrayList<>();
    }
    this.actionCategories.add(actionCategoriesItem);
    return this;
  }

   /**
   * 新版兴趣(行为)定向
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo actionCategoriesLevel(List<String> actionCategoriesLevel) {
    
    this.actionCategoriesLevel = actionCategoriesLevel;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addActionCategoriesLevelItem(String actionCategoriesLevelItem) {
    if (this.actionCategoriesLevel == null) {
      this.actionCategoriesLevel = new ArrayList<>();
    }
    this.actionCategoriesLevel.add(actionCategoriesLevelItem);
    return this;
  }

   /**
   * 新版兴趣(行为)定向支持的层级  [&#39;1&#39;]、[&#39;2&#39;]
   * @return actionCategoriesLevel
  **/
  @javax.annotation.Nullable
  public List<String> getActionCategoriesLevel() {
    return actionCategoriesLevel;
  }


  public void setActionCategoriesLevel(List<String> actionCategoriesLevel) {
    this.actionCategoriesLevel = actionCategoriesLevel;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo adTag(List<Long> adTag) {
    
    this.adTag = adTag;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addAdTagItem(Long adTagItem) {
    if (this.adTag == null) {
      this.adTag = new ArrayList<>();
    }
    this.adTag.add(adTagItem);
    return this;
  }

   /**
   * 兴趣分类
   * @return adTag
  **/
  @javax.annotation.Nullable
  public List<Long> getAdTag() {
    return adTag;
  }


  public void setAdTag(List<Long> adTag) {
    this.adTag = adTag;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo age(List<List<Long>> age) {
    
    this.age = age;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addAgeItem(List<Long> ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 年龄 [[0, 17], [18, 23]]
   * @return age
  **/
  @javax.annotation.Nullable
  public List<List<Long>> getAge() {
    return age;
  }


  public void setAge(List<List<Long>> age) {
    this.age = age;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo brandSafety(BrandAdGetV30DataAdsAudienceInfoBrandSafety brandSafety) {
    
    this.brandSafety = brandSafety;
    return this;
  }

   /**
   * Get brandSafety
   * @return brandSafety
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAudienceInfoBrandSafety getBrandSafety() {
    return brandSafety;
  }


  public void setBrandSafety(BrandAdGetV30DataAdsAudienceInfoBrandSafety brandSafety) {
    this.brandSafety = brandSafety;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo businessIds(List<Long> businessIds) {
    
    this.businessIds = businessIds;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addBusinessIdsItem(Long businessIdsItem) {
    if (this.businessIds == null) {
      this.businessIds = new ArrayList<>();
    }
    this.businessIds.add(businessIdsItem);
    return this;
  }

   /**
   * 商圈
   * @return businessIds
  **/
  @javax.annotation.Nullable
  public List<Long> getBusinessIds() {
    return businessIds;
  }


  public void setBusinessIds(List<Long> businessIds) {
    this.businessIds = businessIds;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 地域定向 - 城市
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo contentKeyWords(List<String> contentKeyWords) {
    
    this.contentKeyWords = contentKeyWords;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addContentKeyWordsItem(String contentKeyWordsItem) {
    if (this.contentKeyWords == null) {
      this.contentKeyWords = new ArrayList<>();
    }
    this.contentKeyWords.add(contentKeyWordsItem);
    return this;
  }

   /**
   * 内容关键词
   * @return contentKeyWords
  **/
  @javax.annotation.Nullable
  public List<String> getContentKeyWords() {
    return contentKeyWords;
  }


  public void setContentKeyWords(List<String> contentKeyWords) {
    this.contentKeyWords = contentKeyWords;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo displayRetargetingTags(List<Long> displayRetargetingTags) {
    
    this.displayRetargetingTags = displayRetargetingTags;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addDisplayRetargetingTagsItem(Long displayRetargetingTagsItem) {
    if (this.displayRetargetingTags == null) {
      this.displayRetargetingTags = new ArrayList<>();
    }
    this.displayRetargetingTags.add(displayRetargetingTagsItem);
    return this;
  }

   /**
   * 人群包
   * @return displayRetargetingTags
  **/
  @javax.annotation.Nullable
  public List<Long> getDisplayRetargetingTags() {
    return displayRetargetingTags;
  }


  public void setDisplayRetargetingTags(List<Long> displayRetargetingTags) {
    this.displayRetargetingTags = displayRetargetingTags;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo district(String district) {
    
    this.district = district;
    return this;
  }

   /**
   * 地域类型,all:不限;select:城市;local:商圈
   * @return district
  **/
  @javax.annotation.Nullable
  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    this.district = district;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo districtSplit(BrandAdGetV30DataAdsAudienceInfoDistrictSplit districtSplit) {
    
    this.districtSplit = districtSplit;
    return this;
  }

   /**
   * Get districtSplit
   * @return districtSplit
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAudienceInfoDistrictSplit getDistrictSplit() {
    return districtSplit;
  }


  public void setDistrictSplit(BrandAdGetV30DataAdsAudienceInfoDistrictSplit districtSplit) {
    this.districtSplit = districtSplit;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo districtType(BrandAdGetV30DataAdsAudienceInfoDistrictType districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * Get districtType
   * @return districtType
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAudienceInfoDistrictType getDistrictType() {
    return districtType;
  }


  public void setDistrictType(BrandAdGetV30DataAdsAudienceInfoDistrictType districtType) {
    this.districtType = districtType;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo entry(List<Long> entry) {
    
    this.entry = entry;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addEntryItem(Long entryItem) {
    if (this.entry == null) {
      this.entry = new ArrayList<>();
    }
    this.entry.add(entryItem);
    return this;
  }

   /**
   * 频道标识
   * @return entry
  **/
  @javax.annotation.Nullable
  public List<Long> getEntry() {
    return entry;
  }


  public void setEntry(List<Long> entry) {
    this.entry = entry;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo excludeDistrict(BrandAdGetV30DataAdsAudienceInfoExcludeDistrict excludeDistrict) {
    
    this.excludeDistrict = excludeDistrict;
    return this;
  }

   /**
   * Get excludeDistrict
   * @return excludeDistrict
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAudienceInfoExcludeDistrict getExcludeDistrict() {
    return excludeDistrict;
  }


  public void setExcludeDistrict(BrandAdGetV30DataAdsAudienceInfoExcludeDistrict excludeDistrict) {
    this.excludeDistrict = excludeDistrict;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo gender(Long gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * 性别
   * @return gender
  **/
  @javax.annotation.Nullable
  public Long getGender() {
    return gender;
  }


  public void setGender(Long gender) {
    this.gender = gender;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo geolocation(List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner> geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addGeolocationItem(BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner geolocationItem) {
    if (this.geolocation == null) {
      this.geolocation = new ArrayList<>();
    }
    this.geolocation.add(geolocationItem);
    return this;
  }

   /**
   * 商圈地理位置信息
   * @return geolocation
  **/
  @javax.annotation.Nullable
  public List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner> getGeolocation() {
    return geolocation;
  }


  public void setGeolocation(List<BrandAdGetV30ResponseDataAdsInnerAudienceInfoGeolocationInner> geolocation) {
    this.geolocation = geolocation;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo isBusinessSplit(Long isBusinessSplit) {
    
    this.isBusinessSplit = isBusinessSplit;
    return this;
  }

   /**
   * 商圈拆分
   * @return isBusinessSplit
  **/
  @javax.annotation.Nullable
  public Long getIsBusinessSplit() {
    return isBusinessSplit;
  }


  public void setIsBusinessSplit(Long isBusinessSplit) {
    this.isBusinessSplit = isBusinessSplit;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo platform(List<Long> platform) {
    
    this.platform = platform;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addPlatformItem(Long platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 平台
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<Long> getPlatform() {
    return platform;
  }


  public void setPlatform(List<Long> platform) {
    this.platform = platform;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo platformV2(BrandAdGetV30DataAdsAudienceInfoPlatformV2 platformV2) {
    
    this.platformV2 = platformV2;
    return this;
  }

   /**
   * Get platformV2
   * @return platformV2
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAudienceInfoPlatformV2 getPlatformV2() {
    return platformV2;
  }


  public void setPlatformV2(BrandAdGetV30DataAdsAudienceInfoPlatformV2 platformV2) {
    this.platformV2 = platformV2;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo province(List<Long> province) {
    
    this.province = province;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addProvinceItem(Long provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * 地域定向 - 省份
   * @return province
  **/
  @javax.annotation.Nullable
  public List<Long> getProvince() {
    return province;
  }


  public void setProvince(List<Long> province) {
    this.province = province;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo retargetingTagType(Map<String, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue> retargetingTagType) {
    
    this.retargetingTagType = retargetingTagType;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo putRetargetingTagTypeItem(String key, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue retargetingTagTypeItem) {
    if (this.retargetingTagType == null) {
      this.retargetingTagType = new HashMap<>();
    }
    this.retargetingTagType.put(key, retargetingTagTypeItem);
    return this;
  }

   /**
   * 人群包
   * @return retargetingTagType
  **/
  @javax.annotation.Nullable
  public Map<String, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue> getRetargetingTagType() {
    return retargetingTagType;
  }


  public void setRetargetingTagType(Map<String, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValue> retargetingTagType) {
    this.retargetingTagType = retargetingTagType;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo retargetingTags(List<Long> retargetingTags) {
    
    this.retargetingTags = retargetingTags;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addRetargetingTagsItem(Long retargetingTagsItem) {
    if (this.retargetingTags == null) {
      this.retargetingTags = new ArrayList<>();
    }
    this.retargetingTags.add(retargetingTagsItem);
    return this;
  }

   /**
   * 人群包
   * @return retargetingTags
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTags() {
    return retargetingTags;
  }


  public void setRetargetingTags(List<Long> retargetingTags) {
    this.retargetingTags = retargetingTags;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo retargetingType(BrandAdGetV30DataAdsAudienceInfoRetargetingType retargetingType) {
    
    this.retargetingType = retargetingType;
    return this;
  }

   /**
   * Get retargetingType
   * @return retargetingType
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsAudienceInfoRetargetingType getRetargetingType() {
    return retargetingType;
  }


  public void setRetargetingType(BrandAdGetV30DataAdsAudienceInfoRetargetingType retargetingType) {
    this.retargetingType = retargetingType;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo searchKeyword(List<String> searchKeyword) {
    
    this.searchKeyword = searchKeyword;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addSearchKeywordItem(String searchKeywordItem) {
    if (this.searchKeyword == null) {
      this.searchKeyword = new ArrayList<>();
    }
    this.searchKeyword.add(searchKeywordItem);
    return this;
  }

   /**
   * 搜索关键词
   * @return searchKeyword
  **/
  @javax.annotation.Nullable
  public List<String> getSearchKeyword() {
    return searchKeyword;
  }


  public void setSearchKeyword(List<String> searchKeyword) {
    this.searchKeyword = searchKeyword;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo wordBagIds(List<Long> wordBagIds) {
    
    this.wordBagIds = wordBagIds;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addWordBagIdsItem(Long wordBagIdsItem) {
    if (this.wordBagIds == null) {
      this.wordBagIds = new ArrayList<>();
    }
    this.wordBagIds.add(wordBagIdsItem);
    return this;
  }

   /**
   * 词包Id
   * @return wordBagIds
  **/
  @javax.annotation.Nullable
  public List<Long> getWordBagIds() {
    return wordBagIds;
  }


  public void setWordBagIds(List<Long> wordBagIds) {
    this.wordBagIds = wordBagIds;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo wordList(List<String> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo addWordListItem(String wordListItem) {
    if (this.wordList == null) {
      this.wordList = new ArrayList<>();
    }
    this.wordList.add(wordListItem);
    return this;
  }

   /**
   * 询价单关联的词条列表
   * @return wordList
  **/
  @javax.annotation.Nullable
  public List<String> getWordList() {
    return wordList;
  }


  public void setWordList(List<String> wordList) {
    this.wordList = wordList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerAudienceInfo brandAdGetV30ResponseDataAdsInnerAudienceInfo = (BrandAdGetV30ResponseDataAdsInnerAudienceInfo) o;
    return Objects.equals(this.ac, brandAdGetV30ResponseDataAdsInnerAudienceInfo.ac) &&
        Objects.equals(this.acV2, brandAdGetV30ResponseDataAdsInnerAudienceInfo.acV2) &&
        Objects.equals(this.actionCategories, brandAdGetV30ResponseDataAdsInnerAudienceInfo.actionCategories) &&
        Objects.equals(this.actionCategoriesLevel, brandAdGetV30ResponseDataAdsInnerAudienceInfo.actionCategoriesLevel) &&
        Objects.equals(this.adTag, brandAdGetV30ResponseDataAdsInnerAudienceInfo.adTag) &&
        Objects.equals(this.age, brandAdGetV30ResponseDataAdsInnerAudienceInfo.age) &&
        Objects.equals(this.brandSafety, brandAdGetV30ResponseDataAdsInnerAudienceInfo.brandSafety) &&
        Objects.equals(this.businessIds, brandAdGetV30ResponseDataAdsInnerAudienceInfo.businessIds) &&
        Objects.equals(this.city, brandAdGetV30ResponseDataAdsInnerAudienceInfo.city) &&
        Objects.equals(this.contentKeyWords, brandAdGetV30ResponseDataAdsInnerAudienceInfo.contentKeyWords) &&
        Objects.equals(this.displayRetargetingTags, brandAdGetV30ResponseDataAdsInnerAudienceInfo.displayRetargetingTags) &&
        Objects.equals(this.district, brandAdGetV30ResponseDataAdsInnerAudienceInfo.district) &&
        Objects.equals(this.districtSplit, brandAdGetV30ResponseDataAdsInnerAudienceInfo.districtSplit) &&
        Objects.equals(this.districtType, brandAdGetV30ResponseDataAdsInnerAudienceInfo.districtType) &&
        Objects.equals(this.entry, brandAdGetV30ResponseDataAdsInnerAudienceInfo.entry) &&
        Objects.equals(this.excludeDistrict, brandAdGetV30ResponseDataAdsInnerAudienceInfo.excludeDistrict) &&
        Objects.equals(this.gender, brandAdGetV30ResponseDataAdsInnerAudienceInfo.gender) &&
        Objects.equals(this.geolocation, brandAdGetV30ResponseDataAdsInnerAudienceInfo.geolocation) &&
        Objects.equals(this.isBusinessSplit, brandAdGetV30ResponseDataAdsInnerAudienceInfo.isBusinessSplit) &&
        Objects.equals(this.platform, brandAdGetV30ResponseDataAdsInnerAudienceInfo.platform) &&
        Objects.equals(this.platformV2, brandAdGetV30ResponseDataAdsInnerAudienceInfo.platformV2) &&
        Objects.equals(this.province, brandAdGetV30ResponseDataAdsInnerAudienceInfo.province) &&
        Objects.equals(this.retargetingTagType, brandAdGetV30ResponseDataAdsInnerAudienceInfo.retargetingTagType) &&
        Objects.equals(this.retargetingTags, brandAdGetV30ResponseDataAdsInnerAudienceInfo.retargetingTags) &&
        Objects.equals(this.retargetingType, brandAdGetV30ResponseDataAdsInnerAudienceInfo.retargetingType) &&
        Objects.equals(this.searchKeyword, brandAdGetV30ResponseDataAdsInnerAudienceInfo.searchKeyword) &&
        Objects.equals(this.wordBagIds, brandAdGetV30ResponseDataAdsInnerAudienceInfo.wordBagIds) &&
        Objects.equals(this.wordList, brandAdGetV30ResponseDataAdsInnerAudienceInfo.wordList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, acV2, actionCategories, actionCategoriesLevel, adTag, age, brandSafety, businessIds, city, contentKeyWords, displayRetargetingTags, district, districtSplit, districtType, entry, excludeDistrict, gender, geolocation, isBusinessSplit, platform, platformV2, province, retargetingTagType, retargetingTags, retargetingType, searchKeyword, wordBagIds, wordList);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerAudienceInfo {\n");
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    acV2: ").append(toIndentedString(acV2)).append("\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    actionCategoriesLevel: ").append(toIndentedString(actionCategoriesLevel)).append("\n");
    sb.append("    adTag: ").append(toIndentedString(adTag)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    brandSafety: ").append(toIndentedString(brandSafety)).append("\n");
    sb.append("    businessIds: ").append(toIndentedString(businessIds)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    contentKeyWords: ").append(toIndentedString(contentKeyWords)).append("\n");
    sb.append("    displayRetargetingTags: ").append(toIndentedString(displayRetargetingTags)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    districtSplit: ").append(toIndentedString(districtSplit)).append("\n");
    sb.append("    districtType: ").append(toIndentedString(districtType)).append("\n");
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
    sb.append("    excludeDistrict: ").append(toIndentedString(excludeDistrict)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    isBusinessSplit: ").append(toIndentedString(isBusinessSplit)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformV2: ").append(toIndentedString(platformV2)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    retargetingTagType: ").append(toIndentedString(retargetingTagType)).append("\n");
    sb.append("    retargetingTags: ").append(toIndentedString(retargetingTags)).append("\n");
    sb.append("    retargetingType: ").append(toIndentedString(retargetingType)).append("\n");
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
    sb.append("    wordBagIds: ").append(toIndentedString(wordBagIds)).append("\n");
    sb.append("    wordList: ").append(toIndentedString(wordList)).append("\n");
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
    openapiFields.add("ac_v2");
    openapiFields.add("action_categories");
    openapiFields.add("action_categories_level");
    openapiFields.add("ad_tag");
    openapiFields.add("age");
    openapiFields.add("brand_safety");
    openapiFields.add("business_ids");
    openapiFields.add("city");
    openapiFields.add("content_key_words");
    openapiFields.add("display_retargeting_tags");
    openapiFields.add("district");
    openapiFields.add("district_split");
    openapiFields.add("district_type");
    openapiFields.add("entry");
    openapiFields.add("exclude_district");
    openapiFields.add("gender");
    openapiFields.add("geolocation");
    openapiFields.add("is_business_split");
    openapiFields.add("platform");
    openapiFields.add("platform_v2");
    openapiFields.add("province");
    openapiFields.add("retargeting_tag_type");
    openapiFields.add("retargeting_tags");
    openapiFields.add("retargeting_type");
    openapiFields.add("search_keyword");
    openapiFields.add("word_bag_ids");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerAudienceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerAudienceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerAudienceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfo>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerAudienceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerAudienceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfo
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerAudienceInfo
  */
  public static BrandAdGetV30ResponseDataAdsInnerAudienceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerAudienceInfo.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

