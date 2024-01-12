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
import com.bytedance.ads.model.ToolsClueGetV2ResponseDataListInnerStore;
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
 * ToolsClueGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class ToolsClueGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private String adId = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Long age = null;

  public static final String SERIALIZED_NAME_ALLOCATION_STATUS = "allocation_status";
  @SerializedName(SERIALIZED_NAME_ALLOCATION_STATUS)
  private Long allocationStatus = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private String clueId = null;

  public static final String SERIALIZED_NAME_CLUE_OWNER_NAME = "clue_owner_name";
  @SerializedName(SERIALIZED_NAME_CLUE_OWNER_NAME)
  private String clueOwnerName = null;

  public static final String SERIALIZED_NAME_CLUE_SOURCE = "clue_source";
  @SerializedName(SERIALIZED_NAME_CLUE_SOURCE)
  private Long clueSource = null;

  public static final String SERIALIZED_NAME_CLUE_STATE = "clue_state";
  @SerializedName(SERIALIZED_NAME_CLUE_STATE)
  private Long clueState = null;

  public static final String SERIALIZED_NAME_CLUE_STATE_NAME = "clue_state_name";
  @SerializedName(SERIALIZED_NAME_CLUE_STATE_NAME)
  private String clueStateName = null;

  public static final String SERIALIZED_NAME_CLUE_TYPE = "clue_type";
  @SerializedName(SERIALIZED_NAME_CLUE_TYPE)
  private Long clueType = null;

  public static final String SERIALIZED_NAME_CONVERT_STATUS = "convert_status";
  @SerializedName(SERIALIZED_NAME_CONVERT_STATUS)
  private String convertStatus = null;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "country_name";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_DETAIL = "create_time_detail";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_DETAIL)
  private String createTimeDetail = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_EXTRA_INFO = "extra_info";
  @SerializedName(SERIALIZED_NAME_EXTRA_INFO)
  private Object extraInfo = null;

  public static final String SERIALIZED_NAME_FOLLOW_STATE_NAME = "follow_state_name";
  @SerializedName(SERIALIZED_NAME_FOLLOW_STATE_NAME)
  private String followStateName = null;

  public static final String SERIALIZED_NAME_FORM_REMARK = "form_remark";
  @SerializedName(SERIALIZED_NAME_FORM_REMARK)
  private String formRemark = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Long gender = null;

  public static final String SERIALIZED_NAME_INTENTION_ESTIMATION = "intention_estimation";
  @SerializedName(SERIALIZED_NAME_INTENTION_ESTIMATION)
  private String intentionEstimation = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location = null;

  public static final String SERIALIZED_NAME_MID_INFO = "mid_info";
  @SerializedName(SERIALIZED_NAME_MID_INFO)
  private String midInfo = null;

  public static final String SERIALIZED_NAME_MODULE_ID = "module_id";
  @SerializedName(SERIALIZED_NAME_MODULE_ID)
  private String moduleId = null;

  public static final String SERIALIZED_NAME_MODULE_NAME = "module_name";
  @SerializedName(SERIALIZED_NAME_MODULE_NAME)
  private String moduleName = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName = null;

  public static final String SERIALIZED_NAME_PROVINCE_NAME = "province_name";
  @SerializedName(SERIALIZED_NAME_PROVINCE_NAME)
  private String provinceName = null;

  public static final String SERIALIZED_NAME_QQ = "qq";
  @SerializedName(SERIALIZED_NAME_QQ)
  private String qq = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_REMARK_DICT = "remark_dict";
  @SerializedName(SERIALIZED_NAME_REMARK_DICT)
  private Object remarkDict = null;

  public static final String SERIALIZED_NAME_REQ_ID = "req_id";
  @SerializedName(SERIALIZED_NAME_REQ_ID)
  private String reqId = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public static final String SERIALIZED_NAME_SITE_NAME = "site_name";
  @SerializedName(SERIALIZED_NAME_SITE_NAME)
  private String siteName = null;

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private ToolsClueGetV2ResponseDataListInnerStore store = null;

  public static final String SERIALIZED_NAME_SYSTEM_TAGS = "system_tags";
  @SerializedName(SERIALIZED_NAME_SYSTEM_TAGS)
  private List<String> systemTags = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone = null;

  public static final String SERIALIZED_NAME_WEIXIN = "weixin";
  @SerializedName(SERIALIZED_NAME_WEIXIN)
  private String weixin = null;

  public ToolsClueGetV2ResponseDataListInner() {
  }

  public ToolsClueGetV2ResponseDataListInner adId(String adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public String getAdId() {
    return adId;
  }


  public void setAdId(String adId) {
    this.adId = adId;
  }


  public ToolsClueGetV2ResponseDataListInner adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public ToolsClueGetV2ResponseDataListInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ToolsClueGetV2ResponseDataListInner advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueGetV2ResponseDataListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public ToolsClueGetV2ResponseDataListInner age(Long age) {
    
    this.age = age;
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public Long getAge() {
    return age;
  }


  public void setAge(Long age) {
    this.age = age;
  }


  public ToolsClueGetV2ResponseDataListInner allocationStatus(Long allocationStatus) {
    
    this.allocationStatus = allocationStatus;
    return this;
  }

   /**
   * 
   * @return allocationStatus
  **/
  @javax.annotation.Nullable
  public Long getAllocationStatus() {
    return allocationStatus;
  }


  public void setAllocationStatus(Long allocationStatus) {
    this.allocationStatus = allocationStatus;
  }


  public ToolsClueGetV2ResponseDataListInner appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ToolsClueGetV2ResponseDataListInner cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 
   * @return cityName
  **/
  @javax.annotation.Nullable
  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public ToolsClueGetV2ResponseDataListInner clueId(String clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 
   * @return clueId
  **/
  @javax.annotation.Nullable
  public String getClueId() {
    return clueId;
  }


  public void setClueId(String clueId) {
    this.clueId = clueId;
  }


  public ToolsClueGetV2ResponseDataListInner clueOwnerName(String clueOwnerName) {
    
    this.clueOwnerName = clueOwnerName;
    return this;
  }

   /**
   * 
   * @return clueOwnerName
  **/
  @javax.annotation.Nullable
  public String getClueOwnerName() {
    return clueOwnerName;
  }


  public void setClueOwnerName(String clueOwnerName) {
    this.clueOwnerName = clueOwnerName;
  }


  public ToolsClueGetV2ResponseDataListInner clueSource(Long clueSource) {
    
    this.clueSource = clueSource;
    return this;
  }

   /**
   * 
   * @return clueSource
  **/
  @javax.annotation.Nullable
  public Long getClueSource() {
    return clueSource;
  }


  public void setClueSource(Long clueSource) {
    this.clueSource = clueSource;
  }


  public ToolsClueGetV2ResponseDataListInner clueState(Long clueState) {
    
    this.clueState = clueState;
    return this;
  }

   /**
   * 
   * @return clueState
  **/
  @javax.annotation.Nullable
  public Long getClueState() {
    return clueState;
  }


  public void setClueState(Long clueState) {
    this.clueState = clueState;
  }


  public ToolsClueGetV2ResponseDataListInner clueStateName(String clueStateName) {
    
    this.clueStateName = clueStateName;
    return this;
  }

   /**
   * 
   * @return clueStateName
  **/
  @javax.annotation.Nullable
  public String getClueStateName() {
    return clueStateName;
  }


  public void setClueStateName(String clueStateName) {
    this.clueStateName = clueStateName;
  }


  public ToolsClueGetV2ResponseDataListInner clueType(Long clueType) {
    
    this.clueType = clueType;
    return this;
  }

   /**
   * 
   * @return clueType
  **/
  @javax.annotation.Nullable
  public Long getClueType() {
    return clueType;
  }


  public void setClueType(Long clueType) {
    this.clueType = clueType;
  }


  public ToolsClueGetV2ResponseDataListInner convertStatus(String convertStatus) {
    
    this.convertStatus = convertStatus;
    return this;
  }

   /**
   * 
   * @return convertStatus
  **/
  @javax.annotation.Nullable
  public String getConvertStatus() {
    return convertStatus;
  }


  public void setConvertStatus(String convertStatus) {
    this.convertStatus = convertStatus;
  }


  public ToolsClueGetV2ResponseDataListInner countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * 
   * @return countryName
  **/
  @javax.annotation.Nullable
  public String getCountryName() {
    return countryName;
  }


  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public ToolsClueGetV2ResponseDataListInner createTime(String createTime) {
    
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


  public ToolsClueGetV2ResponseDataListInner createTimeDetail(String createTimeDetail) {
    
    this.createTimeDetail = createTimeDetail;
    return this;
  }

   /**
   * 
   * @return createTimeDetail
  **/
  @javax.annotation.Nullable
  public String getCreateTimeDetail() {
    return createTimeDetail;
  }


  public void setCreateTimeDetail(String createTimeDetail) {
    this.createTimeDetail = createTimeDetail;
  }


  public ToolsClueGetV2ResponseDataListInner creativeId(String creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public String getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  public ToolsClueGetV2ResponseDataListInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public ToolsClueGetV2ResponseDataListInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ToolsClueGetV2ResponseDataListInner externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public ToolsClueGetV2ResponseDataListInner extraInfo(Object extraInfo) {
    
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * 
   * @return extraInfo
  **/
  @javax.annotation.Nullable
  public Object getExtraInfo() {
    return extraInfo;
  }


  public void setExtraInfo(Object extraInfo) {
    this.extraInfo = extraInfo;
  }


  public ToolsClueGetV2ResponseDataListInner followStateName(String followStateName) {
    
    this.followStateName = followStateName;
    return this;
  }

   /**
   * 
   * @return followStateName
  **/
  @javax.annotation.Nullable
  public String getFollowStateName() {
    return followStateName;
  }


  public void setFollowStateName(String followStateName) {
    this.followStateName = followStateName;
  }


  public ToolsClueGetV2ResponseDataListInner formRemark(String formRemark) {
    
    this.formRemark = formRemark;
    return this;
  }

   /**
   * 
   * @return formRemark
  **/
  @javax.annotation.Nullable
  public String getFormRemark() {
    return formRemark;
  }


  public void setFormRemark(String formRemark) {
    this.formRemark = formRemark;
  }


  public ToolsClueGetV2ResponseDataListInner gender(Long gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  public Long getGender() {
    return gender;
  }


  public void setGender(Long gender) {
    this.gender = gender;
  }


  public ToolsClueGetV2ResponseDataListInner intentionEstimation(String intentionEstimation) {
    
    this.intentionEstimation = intentionEstimation;
    return this;
  }

   /**
   * 
   * @return intentionEstimation
  **/
  @javax.annotation.Nullable
  public String getIntentionEstimation() {
    return intentionEstimation;
  }


  public void setIntentionEstimation(String intentionEstimation) {
    this.intentionEstimation = intentionEstimation;
  }


  public ToolsClueGetV2ResponseDataListInner location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * 
   * @return location
  **/
  @javax.annotation.Nullable
  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ToolsClueGetV2ResponseDataListInner midInfo(String midInfo) {
    
    this.midInfo = midInfo;
    return this;
  }

   /**
   * 
   * @return midInfo
  **/
  @javax.annotation.Nullable
  public String getMidInfo() {
    return midInfo;
  }


  public void setMidInfo(String midInfo) {
    this.midInfo = midInfo;
  }


  public ToolsClueGetV2ResponseDataListInner moduleId(String moduleId) {
    
    this.moduleId = moduleId;
    return this;
  }

   /**
   * 
   * @return moduleId
  **/
  @javax.annotation.Nullable
  public String getModuleId() {
    return moduleId;
  }


  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }


  public ToolsClueGetV2ResponseDataListInner moduleName(String moduleName) {
    
    this.moduleName = moduleName;
    return this;
  }

   /**
   * 
   * @return moduleName
  **/
  @javax.annotation.Nullable
  public String getModuleName() {
    return moduleName;
  }


  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }


  public ToolsClueGetV2ResponseDataListInner name(String name) {
    
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


  public ToolsClueGetV2ResponseDataListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsClueGetV2ResponseDataListInner promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 
   * @return promotionName
  **/
  @javax.annotation.Nullable
  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public ToolsClueGetV2ResponseDataListInner provinceName(String provinceName) {
    
    this.provinceName = provinceName;
    return this;
  }

   /**
   * 
   * @return provinceName
  **/
  @javax.annotation.Nullable
  public String getProvinceName() {
    return provinceName;
  }


  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }


  public ToolsClueGetV2ResponseDataListInner qq(String qq) {
    
    this.qq = qq;
    return this;
  }

   /**
   * 
   * @return qq
  **/
  @javax.annotation.Nullable
  public String getQq() {
    return qq;
  }


  public void setQq(String qq) {
    this.qq = qq;
  }


  public ToolsClueGetV2ResponseDataListInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsClueGetV2ResponseDataListInner remarkDict(Object remarkDict) {
    
    this.remarkDict = remarkDict;
    return this;
  }

   /**
   * 
   * @return remarkDict
  **/
  @javax.annotation.Nullable
  public Object getRemarkDict() {
    return remarkDict;
  }


  public void setRemarkDict(Object remarkDict) {
    this.remarkDict = remarkDict;
  }


  public ToolsClueGetV2ResponseDataListInner reqId(String reqId) {
    
    this.reqId = reqId;
    return this;
  }

   /**
   * 
   * @return reqId
  **/
  @javax.annotation.Nullable
  public String getReqId() {
    return reqId;
  }


  public void setReqId(String reqId) {
    this.reqId = reqId;
  }


  public ToolsClueGetV2ResponseDataListInner siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public ToolsClueGetV2ResponseDataListInner siteName(String siteName) {
    
    this.siteName = siteName;
    return this;
  }

   /**
   * 
   * @return siteName
  **/
  @javax.annotation.Nullable
  public String getSiteName() {
    return siteName;
  }


  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }


  public ToolsClueGetV2ResponseDataListInner store(ToolsClueGetV2ResponseDataListInnerStore store) {
    
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  @javax.annotation.Nullable
  public ToolsClueGetV2ResponseDataListInnerStore getStore() {
    return store;
  }


  public void setStore(ToolsClueGetV2ResponseDataListInnerStore store) {
    this.store = store;
  }


  public ToolsClueGetV2ResponseDataListInner systemTags(List<String> systemTags) {
    
    this.systemTags = systemTags;
    return this;
  }

  public ToolsClueGetV2ResponseDataListInner addSystemTagsItem(String systemTagsItem) {
    if (this.systemTags == null) {
      this.systemTags = new ArrayList<>();
    }
    this.systemTags.add(systemTagsItem);
    return this;
  }

   /**
   * 
   * @return systemTags
  **/
  @javax.annotation.Nullable
  public List<String> getSystemTags() {
    return systemTags;
  }


  public void setSystemTags(List<String> systemTags) {
    this.systemTags = systemTags;
  }


  public ToolsClueGetV2ResponseDataListInner tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ToolsClueGetV2ResponseDataListInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public ToolsClueGetV2ResponseDataListInner telephone(String telephone) {
    
    this.telephone = telephone;
    return this;
  }

   /**
   * 
   * @return telephone
  **/
  @javax.annotation.Nullable
  public String getTelephone() {
    return telephone;
  }


  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public ToolsClueGetV2ResponseDataListInner weixin(String weixin) {
    
    this.weixin = weixin;
    return this;
  }

   /**
   * 
   * @return weixin
  **/
  @javax.annotation.Nullable
  public String getWeixin() {
    return weixin;
  }


  public void setWeixin(String weixin) {
    this.weixin = weixin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueGetV2ResponseDataListInner toolsClueGetV2ResponseDataListInner = (ToolsClueGetV2ResponseDataListInner) o;
    return Objects.equals(this.adId, toolsClueGetV2ResponseDataListInner.adId) &&
        Objects.equals(this.adName, toolsClueGetV2ResponseDataListInner.adName) &&
        Objects.equals(this.address, toolsClueGetV2ResponseDataListInner.address) &&
        Objects.equals(this.advertiserId, toolsClueGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.advertiserName, toolsClueGetV2ResponseDataListInner.advertiserName) &&
        Objects.equals(this.age, toolsClueGetV2ResponseDataListInner.age) &&
        Objects.equals(this.allocationStatus, toolsClueGetV2ResponseDataListInner.allocationStatus) &&
        Objects.equals(this.appName, toolsClueGetV2ResponseDataListInner.appName) &&
        Objects.equals(this.cityName, toolsClueGetV2ResponseDataListInner.cityName) &&
        Objects.equals(this.clueId, toolsClueGetV2ResponseDataListInner.clueId) &&
        Objects.equals(this.clueOwnerName, toolsClueGetV2ResponseDataListInner.clueOwnerName) &&
        Objects.equals(this.clueSource, toolsClueGetV2ResponseDataListInner.clueSource) &&
        Objects.equals(this.clueState, toolsClueGetV2ResponseDataListInner.clueState) &&
        Objects.equals(this.clueStateName, toolsClueGetV2ResponseDataListInner.clueStateName) &&
        Objects.equals(this.clueType, toolsClueGetV2ResponseDataListInner.clueType) &&
        Objects.equals(this.convertStatus, toolsClueGetV2ResponseDataListInner.convertStatus) &&
        Objects.equals(this.countryName, toolsClueGetV2ResponseDataListInner.countryName) &&
        Objects.equals(this.createTime, toolsClueGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.createTimeDetail, toolsClueGetV2ResponseDataListInner.createTimeDetail) &&
        Objects.equals(this.creativeId, toolsClueGetV2ResponseDataListInner.creativeId) &&
        Objects.equals(this.date, toolsClueGetV2ResponseDataListInner.date) &&
        Objects.equals(this.email, toolsClueGetV2ResponseDataListInner.email) &&
        Objects.equals(this.externalUrl, toolsClueGetV2ResponseDataListInner.externalUrl) &&
        Objects.equals(this.extraInfo, toolsClueGetV2ResponseDataListInner.extraInfo) &&
        Objects.equals(this.followStateName, toolsClueGetV2ResponseDataListInner.followStateName) &&
        Objects.equals(this.formRemark, toolsClueGetV2ResponseDataListInner.formRemark) &&
        Objects.equals(this.gender, toolsClueGetV2ResponseDataListInner.gender) &&
        Objects.equals(this.intentionEstimation, toolsClueGetV2ResponseDataListInner.intentionEstimation) &&
        Objects.equals(this.location, toolsClueGetV2ResponseDataListInner.location) &&
        Objects.equals(this.midInfo, toolsClueGetV2ResponseDataListInner.midInfo) &&
        Objects.equals(this.moduleId, toolsClueGetV2ResponseDataListInner.moduleId) &&
        Objects.equals(this.moduleName, toolsClueGetV2ResponseDataListInner.moduleName) &&
        Objects.equals(this.name, toolsClueGetV2ResponseDataListInner.name) &&
        Objects.equals(this.promotionId, toolsClueGetV2ResponseDataListInner.promotionId) &&
        Objects.equals(this.promotionName, toolsClueGetV2ResponseDataListInner.promotionName) &&
        Objects.equals(this.provinceName, toolsClueGetV2ResponseDataListInner.provinceName) &&
        Objects.equals(this.qq, toolsClueGetV2ResponseDataListInner.qq) &&
        Objects.equals(this.remark, toolsClueGetV2ResponseDataListInner.remark) &&
        Objects.equals(this.remarkDict, toolsClueGetV2ResponseDataListInner.remarkDict) &&
        Objects.equals(this.reqId, toolsClueGetV2ResponseDataListInner.reqId) &&
        Objects.equals(this.siteId, toolsClueGetV2ResponseDataListInner.siteId) &&
        Objects.equals(this.siteName, toolsClueGetV2ResponseDataListInner.siteName) &&
        Objects.equals(this.store, toolsClueGetV2ResponseDataListInner.store) &&
        Objects.equals(this.systemTags, toolsClueGetV2ResponseDataListInner.systemTags) &&
        Objects.equals(this.tags, toolsClueGetV2ResponseDataListInner.tags) &&
        Objects.equals(this.telephone, toolsClueGetV2ResponseDataListInner.telephone) &&
        Objects.equals(this.weixin, toolsClueGetV2ResponseDataListInner.weixin);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adName, address, advertiserId, advertiserName, age, allocationStatus, appName, cityName, clueId, clueOwnerName, clueSource, clueState, clueStateName, clueType, convertStatus, countryName, createTime, createTimeDetail, creativeId, date, email, externalUrl, extraInfo, followStateName, formRemark, gender, intentionEstimation, location, midInfo, moduleId, moduleName, name, promotionId, promotionName, provinceName, qq, remark, remarkDict, reqId, siteId, siteName, store, systemTags, tags, telephone, weixin);
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
    sb.append("class ToolsClueGetV2ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    allocationStatus: ").append(toIndentedString(allocationStatus)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    clueOwnerName: ").append(toIndentedString(clueOwnerName)).append("\n");
    sb.append("    clueSource: ").append(toIndentedString(clueSource)).append("\n");
    sb.append("    clueState: ").append(toIndentedString(clueState)).append("\n");
    sb.append("    clueStateName: ").append(toIndentedString(clueStateName)).append("\n");
    sb.append("    clueType: ").append(toIndentedString(clueType)).append("\n");
    sb.append("    convertStatus: ").append(toIndentedString(convertStatus)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createTimeDetail: ").append(toIndentedString(createTimeDetail)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    followStateName: ").append(toIndentedString(followStateName)).append("\n");
    sb.append("    formRemark: ").append(toIndentedString(formRemark)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    intentionEstimation: ").append(toIndentedString(intentionEstimation)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    midInfo: ").append(toIndentedString(midInfo)).append("\n");
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
    sb.append("    qq: ").append(toIndentedString(qq)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    remarkDict: ").append(toIndentedString(remarkDict)).append("\n");
    sb.append("    reqId: ").append(toIndentedString(reqId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    systemTags: ").append(toIndentedString(systemTags)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    weixin: ").append(toIndentedString(weixin)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_name");
    openapiFields.add("address");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("age");
    openapiFields.add("allocation_status");
    openapiFields.add("app_name");
    openapiFields.add("city_name");
    openapiFields.add("clue_id");
    openapiFields.add("clue_owner_name");
    openapiFields.add("clue_source");
    openapiFields.add("clue_state");
    openapiFields.add("clue_state_name");
    openapiFields.add("clue_type");
    openapiFields.add("convert_status");
    openapiFields.add("country_name");
    openapiFields.add("create_time");
    openapiFields.add("create_time_detail");
    openapiFields.add("creative_id");
    openapiFields.add("date");
    openapiFields.add("email");
    openapiFields.add("external_url");
    openapiFields.add("extra_info");
    openapiFields.add("follow_state_name");
    openapiFields.add("form_remark");
    openapiFields.add("gender");
    openapiFields.add("intention_estimation");
    openapiFields.add("location");
    openapiFields.add("mid_info");
    openapiFields.add("module_id");
    openapiFields.add("module_name");
    openapiFields.add("name");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_name");
    openapiFields.add("province_name");
    openapiFields.add("qq");
    openapiFields.add("remark");
    openapiFields.add("remark_dict");
    openapiFields.add("req_id");
    openapiFields.add("site_id");
    openapiFields.add("site_name");
    openapiFields.add("store");
    openapiFields.add("system_tags");
    openapiFields.add("tags");
    openapiFields.add("telephone");
    openapiFields.add("weixin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueGetV2ResponseDataListInner
  */
  public static ToolsClueGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsClueGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

