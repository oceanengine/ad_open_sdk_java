/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo {
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

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo advertiserId(Long advertiserId) {
    
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


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo androidConvertId(Long androidConvertId) {
    
    this.androidConvertId = androidConvertId;
    return this;
  }

   /**
   * 
   * @return androidConvertId
  **/
  @javax.annotation.Nullable
  public Long getAndroidConvertId() {
    return androidConvertId;
  }


  public void setAndroidConvertId(Long androidConvertId) {
    this.androidConvertId = androidConvertId;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo autoAddBudgetTimes(Long autoAddBudgetTimes) {
    
    this.autoAddBudgetTimes = autoAddBudgetTimes;
    return this;
  }

   /**
   * 
   * @return autoAddBudgetTimes
  **/
  @javax.annotation.Nullable
  public Long getAutoAddBudgetTimes() {
    return autoAddBudgetTimes;
  }


  public void setAutoAddBudgetTimes(Long autoAddBudgetTimes) {
    this.autoAddBudgetTimes = autoAddBudgetTimes;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo autoAddBudgetTriggerRatio(Long autoAddBudgetTriggerRatio) {
    
    this.autoAddBudgetTriggerRatio = autoAddBudgetTriggerRatio;
    return this;
  }

   /**
   * 
   * @return autoAddBudgetTriggerRatio
  **/
  @javax.annotation.Nullable
  public Long getAutoAddBudgetTriggerRatio() {
    return autoAddBudgetTriggerRatio;
  }


  public void setAutoAddBudgetTriggerRatio(Long autoAddBudgetTriggerRatio) {
    this.autoAddBudgetTriggerRatio = autoAddBudgetTriggerRatio;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo evaluateType(Long evaluateType) {
    
    this.evaluateType = evaluateType;
    return this;
  }

   /**
   * 
   * @return evaluateType
  **/
  @javax.annotation.Nullable
  public Long getEvaluateType() {
    return evaluateType;
  }


  public void setEvaluateType(Long evaluateType) {
    this.evaluateType = evaluateType;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo iosConvertId(Long iosConvertId) {
    
    this.iosConvertId = iosConvertId;
    return this;
  }

   /**
   * 
   * @return iosConvertId
  **/
  @javax.annotation.Nullable
  public Long getIosConvertId() {
    return iosConvertId;
  }


  public void setIosConvertId(Long iosConvertId) {
    this.iosConvertId = iosConvertId;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo maxBudgetAddAmount(Long maxBudgetAddAmount) {
    
    this.maxBudgetAddAmount = maxBudgetAddAmount;
    return this;
  }

   /**
   * 
   * @return maxBudgetAddAmount
  **/
  @javax.annotation.Nullable
  public Long getMaxBudgetAddAmount() {
    return maxBudgetAddAmount;
  }


  public void setMaxBudgetAddAmount(Long maxBudgetAddAmount) {
    this.maxBudgetAddAmount = maxBudgetAddAmount;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo rewardRule(String rewardRule) {
    
    this.rewardRule = rewardRule;
    return this;
  }

   /**
   * 
   * @return rewardRule
  **/
  @javax.annotation.Nullable
  public String getRewardRule() {
    return rewardRule;
  }


  public void setRewardRule(String rewardRule) {
    this.rewardRule = rewardRule;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo supplementInfo(String supplementInfo) {
    
    this.supplementInfo = supplementInfo;
    return this;
  }

   /**
   * 
   * @return supplementInfo
  **/
  @javax.annotation.Nullable
  public String getSupplementInfo() {
    return supplementInfo;
  }


  public void setSupplementInfo(String supplementInfo) {
    this.supplementInfo = supplementInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo unitPrice(Long unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * 
   * @return unitPrice
  **/
  @javax.annotation.Nullable
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
    StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo = (StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo) o;
    return Objects.equals(this.advertiserId, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.advertiserId) &&
        Objects.equals(this.androidConvertId, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.androidConvertId) &&
        Objects.equals(this.autoAddBudgetTimes, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.autoAddBudgetTimes) &&
        Objects.equals(this.autoAddBudgetTriggerRatio, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.autoAddBudgetTriggerRatio) &&
        Objects.equals(this.evaluateType, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.evaluateType) &&
        Objects.equals(this.iosConvertId, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.iosConvertId) &&
        Objects.equals(this.maxBudgetAddAmount, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.maxBudgetAddAmount) &&
        Objects.equals(this.rewardRule, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.rewardRule) &&
        Objects.equals(this.supplementInfo, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.supplementInfo) &&
        Objects.equals(this.unitPrice, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.unitPrice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, androidConvertId, autoAddBudgetTimes, autoAddBudgetTriggerRatio, evaluateType, iosConvertId, maxBudgetAddAmount, rewardRule, supplementInfo, unitPrice);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    androidConvertId: ").append(toIndentedString(androidConvertId)).append("\n");
    sb.append("    autoAddBudgetTimes: ").append(toIndentedString(autoAddBudgetTimes)).append("\n");
    sb.append("    autoAddBudgetTriggerRatio: ").append(toIndentedString(autoAddBudgetTriggerRatio)).append("\n");
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
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

