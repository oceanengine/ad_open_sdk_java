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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * 结算方式
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ANDROID_CONVERT_ID = "android_convert_id";
  @SerializedName(SERIALIZED_NAME_ANDROID_CONVERT_ID)
  private Long androidConvertId = null;

  public static final String SERIALIZED_NAME_AUTO_ADD_BUDGET_TIMES = "auto_add_budget_times";
  @SerializedName(SERIALIZED_NAME_AUTO_ADD_BUDGET_TIMES)
  private Long autoAddBudgetTimes = null;

  public static final String SERIALIZED_NAME_AUTO_ADD_BUDGET_TRIGGER_RATIO = "auto_add_budget_trigger_ratio";
  @SerializedName(SERIALIZED_NAME_AUTO_ADD_BUDGET_TRIGGER_RATIO)
  private Long autoAddBudgetTriggerRatio = null;

  public static final String SERIALIZED_NAME_COMMISSION_RATE = "commission_rate";
  @SerializedName(SERIALIZED_NAME_COMMISSION_RATE)
  private Integer commissionRate = null;

  public static final String SERIALIZED_NAME_EVALUATE_TYPE = "evaluate_type";
  @SerializedName(SERIALIZED_NAME_EVALUATE_TYPE)
  private Long evaluateType = null;

  public static final String SERIALIZED_NAME_IOS_CONVERT_ID = "ios_convert_id";
  @SerializedName(SERIALIZED_NAME_IOS_CONVERT_ID)
  private Long iosConvertId = null;

  public static final String SERIALIZED_NAME_MAX_BUDGET_ADD_AMOUNT = "max_budget_add_amount";
  @SerializedName(SERIALIZED_NAME_MAX_BUDGET_ADD_AMOUNT)
  private Long maxBudgetAddAmount = null;

  public static final String SERIALIZED_NAME_REWARD_RULE = "reward_rule";
  @SerializedName(SERIALIZED_NAME_REWARD_RULE)
  private String rewardRule = null;

  public static final String SERIALIZED_NAME_SUPPLEMENT_INFO = "supplement_info";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_INFO)
  private String supplementInfo = null;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unit_price";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Long unitPrice = null;

  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo() {
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 巨量引擎广告主ID 需要确保转化ID已在巨量引擎后台创建并激活
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo androidConvertId(Long androidConvertId) {
    
    this.androidConvertId = androidConvertId;
    return this;
  }

   /**
   * Android转化ID 有效的转化ID
   * @return androidConvertId
  **/
  @javax.annotation.Nullable
  public Long getAndroidConvertId() {
    return androidConvertId;
  }


  public void setAndroidConvertId(Long androidConvertId) {
    this.androidConvertId = androidConvertId;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo autoAddBudgetTimes(Long autoAddBudgetTimes) {
    
    this.autoAddBudgetTimes = autoAddBudgetTimes;
    return this;
  }

   /**
   * 自动追加预算次数。总金额除以自动追加次数等于单次追加金额 auto_add_budget_trigger_ratio 为正时需提供，最低1，且保证单次追加预算金额不低于10000
   * @return autoAddBudgetTimes
  **/
  @javax.annotation.Nullable
  public Long getAutoAddBudgetTimes() {
    return autoAddBudgetTimes;
  }


  public void setAutoAddBudgetTimes(Long autoAddBudgetTimes) {
    this.autoAddBudgetTimes = autoAddBudgetTimes;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo autoAddBudgetTriggerRatio(Long autoAddBudgetTriggerRatio) {
    
    this.autoAddBudgetTriggerRatio = autoAddBudgetTriggerRatio;
    return this;
  }

   /**
   * 预算自动追加节点 当消耗到x%时，允许平台自动追加预算 非负整数。为0则不启用自动追加预算，最大100
   * @return autoAddBudgetTriggerRatio
  **/
  @javax.annotation.Nullable
  public Long getAutoAddBudgetTriggerRatio() {
    return autoAddBudgetTriggerRatio;
  }


  public void setAutoAddBudgetTriggerRatio(Long autoAddBudgetTriggerRatio) {
    this.autoAddBudgetTriggerRatio = autoAddBudgetTriggerRatio;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo commissionRate(Integer commissionRate) {
    
    this.commissionRate = commissionRate;
    return this;
  }

   /**
   * cps分佣比例
   * @return commissionRate
  **/
  @javax.annotation.Nullable
  public Integer getCommissionRate() {
    return commissionRate;
  }


  public void setCommissionRate(Integer commissionRate) {
    this.commissionRate = commissionRate;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo evaluateType(Long evaluateType) {
    
    this.evaluateType = evaluateType;
    return this;
  }

   /**
   * 考核指标 5&#x3D;视频有效播放量 4&#x3D;激活总数 10&#x3D;安装完成数量 31&#x3D;组件点击数 32&#x3D;APP唤起 201&#x3D;客户自定义
   * @return evaluateType
  **/
  @javax.annotation.Nonnull
  public Long getEvaluateType() {
    return evaluateType;
  }


  public void setEvaluateType(Long evaluateType) {
    this.evaluateType = evaluateType;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo iosConvertId(Long iosConvertId) {
    
    this.iosConvertId = iosConvertId;
    return this;
  }

   /**
   * iOS转化ID 有效的转化ID
   * @return iosConvertId
  **/
  @javax.annotation.Nullable
  public Long getIosConvertId() {
    return iosConvertId;
  }


  public void setIosConvertId(Long iosConvertId) {
    this.iosConvertId = iosConvertId;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo maxBudgetAddAmount(Long maxBudgetAddAmount) {
    
    this.maxBudgetAddAmount = maxBudgetAddAmount;
    return this;
  }

   /**
   * 自动追加预算总金额（单位元） auto_add_budget_trigger_ratio 为正时需提供，最低10000
   * @return maxBudgetAddAmount
  **/
  @javax.annotation.Nullable
  public Long getMaxBudgetAddAmount() {
    return maxBudgetAddAmount;
  }


  public void setMaxBudgetAddAmount(Long maxBudgetAddAmount) {
    this.maxBudgetAddAmount = maxBudgetAddAmount;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo rewardRule(String rewardRule) {
    
    this.rewardRule = rewardRule;
    return this;
  }

   /**
   * 奖励规则 2000字内
   * @return rewardRule
  **/
  @javax.annotation.Nullable
  public String getRewardRule() {
    return rewardRule;
  }


  public void setRewardRule(String rewardRule) {
    this.rewardRule = rewardRule;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo supplementInfo(String supplementInfo) {
    
    this.supplementInfo = supplementInfo;
    return this;
  }

   /**
   * 奖励补充说明 200字内
   * @return supplementInfo
  **/
  @javax.annotation.Nullable
  public String getSupplementInfo() {
    return supplementInfo;
  }


  public void setSupplementInfo(String supplementInfo) {
    this.supplementInfo = supplementInfo;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo unitPrice(Long unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * 单价（单位分） 根据考核指标的不同而不同： 为视频有效播放量时为千次曝光单价 为激活总数时为Android激活单价 为安装完成数量时为安装单价 为组件点击数时为单次点击单价 为APP唤起时为唤起单价 为客户自定义时为0
   * @return unitPrice
  **/
  @javax.annotation.Nonnull
  public Long getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Long unitPrice) {
    this.unitPrice = unitPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo = (StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo) o;
    return Objects.equals(this.advertiserId, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.advertiserId) &&
        Objects.equals(this.androidConvertId, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.androidConvertId) &&
        Objects.equals(this.autoAddBudgetTimes, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.autoAddBudgetTimes) &&
        Objects.equals(this.autoAddBudgetTriggerRatio, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.autoAddBudgetTriggerRatio) &&
        Objects.equals(this.commissionRate, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.commissionRate) &&
        Objects.equals(this.evaluateType, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.evaluateType) &&
        Objects.equals(this.iosConvertId, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.iosConvertId) &&
        Objects.equals(this.maxBudgetAddAmount, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.maxBudgetAddAmount) &&
        Objects.equals(this.rewardRule, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.rewardRule) &&
        Objects.equals(this.supplementInfo, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.supplementInfo) &&
        Objects.equals(this.unitPrice, starDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, androidConvertId, autoAddBudgetTimes, autoAddBudgetTriggerRatio, commissionRate, evaluateType, iosConvertId, maxBudgetAddAmount, rewardRule, supplementInfo, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    androidConvertId: ").append(toIndentedString(androidConvertId)).append("\n");
    sb.append("    autoAddBudgetTimes: ").append(toIndentedString(autoAddBudgetTimes)).append("\n");
    sb.append("    autoAddBudgetTriggerRatio: ").append(toIndentedString(autoAddBudgetTriggerRatio)).append("\n");
    sb.append("    commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
    sb.append("    evaluateType: ").append(toIndentedString(evaluateType)).append("\n");
    sb.append("    iosConvertId: ").append(toIndentedString(iosConvertId)).append("\n");
    sb.append("    maxBudgetAddAmount: ").append(toIndentedString(maxBudgetAddAmount)).append("\n");
    sb.append("    rewardRule: ").append(toIndentedString(rewardRule)).append("\n");
    sb.append("    supplementInfo: ").append(toIndentedString(supplementInfo)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
    openapiFields.add("android_convert_id");
    openapiFields.add("auto_add_budget_times");
    openapiFields.add("auto_add_budget_trigger_ratio");
    openapiFields.add("commission_rate");
    openapiFields.add("evaluate_type");
    openapiFields.add("ios_convert_id");
    openapiFields.add("max_budget_add_amount");
    openapiFields.add("reward_rule");
    openapiFields.add("supplement_info");
    openapiFields.add("unit_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("evaluate_type");
    openapiRequiredFields.add("unit_price");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo
  */
  public static StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestChallengeInfoSettlementInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

