/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsMicroAppCreateV30MaxPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroAppCreateV30MaxRechargeTier;
import com.bytedance.ads.model.ToolsMicroAppCreateV30MembershipType;
import com.bytedance.ads.model.ToolsMicroAppCreateV30MidPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroAppCreateV30MinPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroAppCreateV30MinRechargeTier;
import com.bytedance.ads.model.ToolsMicroAppCreateV30PaymentForm;
import com.bytedance.ads.model.ToolsMicroAppCreateV30RecommendedRechargeTier;
import com.bytedance.ads.model.ToolsMicroAppCreateV30RequestAppPage;
import com.bytedance.ads.model.ToolsMicroAppCreateV30RevenueModel;
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
 * ToolsMicroAppCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsMicroAppCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_APP_PAGE = "app_page";
  @SerializedName(SERIALIZED_NAME_APP_PAGE)
  private ToolsMicroAppCreateV30RequestAppPage appPage = null;

  public static final String SERIALIZED_NAME_DISCOUNT_RATE = "discount_rate";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_RATE)
  private Long discountRate = null;

  public static final String SERIALIZED_NAME_HAS_DISCOUNT = "has_discount";
  @SerializedName(SERIALIZED_NAME_HAS_DISCOUNT)
  private Boolean hasDiscount = null;

  public static final String SERIALIZED_NAME_HAS_ONLINE_EARNING = "has_online_earning";
  @SerializedName(SERIALIZED_NAME_HAS_ONLINE_EARNING)
  private Boolean hasOnlineEarning = null;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE = "max_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE)
  private ToolsMicroAppCreateV30MaxPaymentTierRange maxPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MAX_RECHARGE_TIER = "max_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MAX_RECHARGE_TIER)
  private ToolsMicroAppCreateV30MaxRechargeTier maxRechargeTier = null;

  public static final String SERIALIZED_NAME_MEMBERSHIP_TYPE = "membership_type";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_TYPE)
  private ToolsMicroAppCreateV30MembershipType membershipType = null;

  public static final String SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE = "mid_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE)
  private ToolsMicroAppCreateV30MidPaymentTierRange midPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE = "min_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE)
  private ToolsMicroAppCreateV30MinPaymentTierRange minPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_RECHARGE_TIER = "min_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MIN_RECHARGE_TIER)
  private ToolsMicroAppCreateV30MinRechargeTier minRechargeTier = null;

  public static final String SERIALIZED_NAME_PAYMENT_FORM = "payment_form";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FORM)
  private ToolsMicroAppCreateV30PaymentForm paymentForm = null;

  public static final String SERIALIZED_NAME_PROP_NAME = "prop_name";
  @SerializedName(SERIALIZED_NAME_PROP_NAME)
  private String propName = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER = "recommended_recharge_tier";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER)
  private ToolsMicroAppCreateV30RecommendedRechargeTier recommendedRechargeTier = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_REVENUE_MODEL = "revenue_model";
  @SerializedName(SERIALIZED_NAME_REVENUE_MODEL)
  private ToolsMicroAppCreateV30RevenueModel revenueModel = null;

  public static final String SERIALIZED_NAME_TAG_INFO = "tag_info";
  @SerializedName(SERIALIZED_NAME_TAG_INFO)
  private String tagInfo = null;

  public ToolsMicroAppCreateV30Request() {
  }

  public ToolsMicroAppCreateV30Request advertiserId(Long advertiserId) {
    
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


  public ToolsMicroAppCreateV30Request appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nonnull
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ToolsMicroAppCreateV30Request appPage(ToolsMicroAppCreateV30RequestAppPage appPage) {
    
    this.appPage = appPage;
    return this;
  }

   /**
   * Get appPage
   * @return appPage
  **/
  @javax.annotation.Nonnull
  public ToolsMicroAppCreateV30RequestAppPage getAppPage() {
    return appPage;
  }


  public void setAppPage(ToolsMicroAppCreateV30RequestAppPage appPage) {
    this.appPage = appPage;
  }


  public ToolsMicroAppCreateV30Request discountRate(Long discountRate) {
    
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


  public ToolsMicroAppCreateV30Request hasDiscount(Boolean hasDiscount) {
    
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


  public ToolsMicroAppCreateV30Request hasOnlineEarning(Boolean hasOnlineEarning) {
    
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


  public ToolsMicroAppCreateV30Request maxPaymentTierRange(ToolsMicroAppCreateV30MaxPaymentTierRange maxPaymentTierRange) {
    
    this.maxPaymentTierRange = maxPaymentTierRange;
    return this;
  }

   /**
   * Get maxPaymentTierRange
   * @return maxPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30MaxPaymentTierRange getMaxPaymentTierRange() {
    return maxPaymentTierRange;
  }


  public void setMaxPaymentTierRange(ToolsMicroAppCreateV30MaxPaymentTierRange maxPaymentTierRange) {
    this.maxPaymentTierRange = maxPaymentTierRange;
  }


  public ToolsMicroAppCreateV30Request maxRechargeTier(ToolsMicroAppCreateV30MaxRechargeTier maxRechargeTier) {
    
    this.maxRechargeTier = maxRechargeTier;
    return this;
  }

   /**
   * Get maxRechargeTier
   * @return maxRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30MaxRechargeTier getMaxRechargeTier() {
    return maxRechargeTier;
  }


  public void setMaxRechargeTier(ToolsMicroAppCreateV30MaxRechargeTier maxRechargeTier) {
    this.maxRechargeTier = maxRechargeTier;
  }


  public ToolsMicroAppCreateV30Request membershipType(ToolsMicroAppCreateV30MembershipType membershipType) {
    
    this.membershipType = membershipType;
    return this;
  }

   /**
   * Get membershipType
   * @return membershipType
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30MembershipType getMembershipType() {
    return membershipType;
  }


  public void setMembershipType(ToolsMicroAppCreateV30MembershipType membershipType) {
    this.membershipType = membershipType;
  }


  public ToolsMicroAppCreateV30Request midPaymentTierRange(ToolsMicroAppCreateV30MidPaymentTierRange midPaymentTierRange) {
    
    this.midPaymentTierRange = midPaymentTierRange;
    return this;
  }

   /**
   * Get midPaymentTierRange
   * @return midPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30MidPaymentTierRange getMidPaymentTierRange() {
    return midPaymentTierRange;
  }


  public void setMidPaymentTierRange(ToolsMicroAppCreateV30MidPaymentTierRange midPaymentTierRange) {
    this.midPaymentTierRange = midPaymentTierRange;
  }


  public ToolsMicroAppCreateV30Request minPaymentTierRange(ToolsMicroAppCreateV30MinPaymentTierRange minPaymentTierRange) {
    
    this.minPaymentTierRange = minPaymentTierRange;
    return this;
  }

   /**
   * Get minPaymentTierRange
   * @return minPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30MinPaymentTierRange getMinPaymentTierRange() {
    return minPaymentTierRange;
  }


  public void setMinPaymentTierRange(ToolsMicroAppCreateV30MinPaymentTierRange minPaymentTierRange) {
    this.minPaymentTierRange = minPaymentTierRange;
  }


  public ToolsMicroAppCreateV30Request minRechargeTier(ToolsMicroAppCreateV30MinRechargeTier minRechargeTier) {
    
    this.minRechargeTier = minRechargeTier;
    return this;
  }

   /**
   * Get minRechargeTier
   * @return minRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30MinRechargeTier getMinRechargeTier() {
    return minRechargeTier;
  }


  public void setMinRechargeTier(ToolsMicroAppCreateV30MinRechargeTier minRechargeTier) {
    this.minRechargeTier = minRechargeTier;
  }


  public ToolsMicroAppCreateV30Request paymentForm(ToolsMicroAppCreateV30PaymentForm paymentForm) {
    
    this.paymentForm = paymentForm;
    return this;
  }

   /**
   * Get paymentForm
   * @return paymentForm
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30PaymentForm getPaymentForm() {
    return paymentForm;
  }


  public void setPaymentForm(ToolsMicroAppCreateV30PaymentForm paymentForm) {
    this.paymentForm = paymentForm;
  }


  public ToolsMicroAppCreateV30Request propName(String propName) {
    
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


  public ToolsMicroAppCreateV30Request recommendedRechargeTier(ToolsMicroAppCreateV30RecommendedRechargeTier recommendedRechargeTier) {
    
    this.recommendedRechargeTier = recommendedRechargeTier;
    return this;
  }

   /**
   * Get recommendedRechargeTier
   * @return recommendedRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30RecommendedRechargeTier getRecommendedRechargeTier() {
    return recommendedRechargeTier;
  }


  public void setRecommendedRechargeTier(ToolsMicroAppCreateV30RecommendedRechargeTier recommendedRechargeTier) {
    this.recommendedRechargeTier = recommendedRechargeTier;
  }


  public ToolsMicroAppCreateV30Request remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 
   * @return remark
  **/
  @javax.annotation.Nonnull
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsMicroAppCreateV30Request revenueModel(ToolsMicroAppCreateV30RevenueModel revenueModel) {
    
    this.revenueModel = revenueModel;
    return this;
  }

   /**
   * Get revenueModel
   * @return revenueModel
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppCreateV30RevenueModel getRevenueModel() {
    return revenueModel;
  }


  public void setRevenueModel(ToolsMicroAppCreateV30RevenueModel revenueModel) {
    this.revenueModel = revenueModel;
  }


  public ToolsMicroAppCreateV30Request tagInfo(String tagInfo) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroAppCreateV30Request toolsMicroAppCreateV30Request = (ToolsMicroAppCreateV30Request) o;
    return Objects.equals(this.advertiserId, toolsMicroAppCreateV30Request.advertiserId) &&
        Objects.equals(this.appId, toolsMicroAppCreateV30Request.appId) &&
        Objects.equals(this.appPage, toolsMicroAppCreateV30Request.appPage) &&
        Objects.equals(this.discountRate, toolsMicroAppCreateV30Request.discountRate) &&
        Objects.equals(this.hasDiscount, toolsMicroAppCreateV30Request.hasDiscount) &&
        Objects.equals(this.hasOnlineEarning, toolsMicroAppCreateV30Request.hasOnlineEarning) &&
        Objects.equals(this.maxPaymentTierRange, toolsMicroAppCreateV30Request.maxPaymentTierRange) &&
        Objects.equals(this.maxRechargeTier, toolsMicroAppCreateV30Request.maxRechargeTier) &&
        Objects.equals(this.membershipType, toolsMicroAppCreateV30Request.membershipType) &&
        Objects.equals(this.midPaymentTierRange, toolsMicroAppCreateV30Request.midPaymentTierRange) &&
        Objects.equals(this.minPaymentTierRange, toolsMicroAppCreateV30Request.minPaymentTierRange) &&
        Objects.equals(this.minRechargeTier, toolsMicroAppCreateV30Request.minRechargeTier) &&
        Objects.equals(this.paymentForm, toolsMicroAppCreateV30Request.paymentForm) &&
        Objects.equals(this.propName, toolsMicroAppCreateV30Request.propName) &&
        Objects.equals(this.recommendedRechargeTier, toolsMicroAppCreateV30Request.recommendedRechargeTier) &&
        Objects.equals(this.remark, toolsMicroAppCreateV30Request.remark) &&
        Objects.equals(this.revenueModel, toolsMicroAppCreateV30Request.revenueModel) &&
        Objects.equals(this.tagInfo, toolsMicroAppCreateV30Request.tagInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, appPage, discountRate, hasDiscount, hasOnlineEarning, maxPaymentTierRange, maxRechargeTier, membershipType, midPaymentTierRange, minPaymentTierRange, minRechargeTier, paymentForm, propName, recommendedRechargeTier, remark, revenueModel, tagInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroAppCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPage: ").append(toIndentedString(appPage)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    hasDiscount: ").append(toIndentedString(hasDiscount)).append("\n");
    sb.append("    hasOnlineEarning: ").append(toIndentedString(hasOnlineEarning)).append("\n");
    sb.append("    maxPaymentTierRange: ").append(toIndentedString(maxPaymentTierRange)).append("\n");
    sb.append("    maxRechargeTier: ").append(toIndentedString(maxRechargeTier)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
    sb.append("    midPaymentTierRange: ").append(toIndentedString(midPaymentTierRange)).append("\n");
    sb.append("    minPaymentTierRange: ").append(toIndentedString(minPaymentTierRange)).append("\n");
    sb.append("    minRechargeTier: ").append(toIndentedString(minRechargeTier)).append("\n");
    sb.append("    paymentForm: ").append(toIndentedString(paymentForm)).append("\n");
    sb.append("    propName: ").append(toIndentedString(propName)).append("\n");
    sb.append("    recommendedRechargeTier: ").append(toIndentedString(recommendedRechargeTier)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    revenueModel: ").append(toIndentedString(revenueModel)).append("\n");
    sb.append("    tagInfo: ").append(toIndentedString(tagInfo)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("app_page");
    openapiFields.add("discount_rate");
    openapiFields.add("has_discount");
    openapiFields.add("has_online_earning");
    openapiFields.add("max_payment_tier_range");
    openapiFields.add("max_recharge_tier");
    openapiFields.add("membership_type");
    openapiFields.add("mid_payment_tier_range");
    openapiFields.add("min_payment_tier_range");
    openapiFields.add("min_recharge_tier");
    openapiFields.add("payment_form");
    openapiFields.add("prop_name");
    openapiFields.add("recommended_recharge_tier");
    openapiFields.add("remark");
    openapiFields.add("revenue_model");
    openapiFields.add("tag_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("app_page");
    openapiRequiredFields.add("remark");
    openapiRequiredFields.add("tag_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroAppCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroAppCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroAppCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroAppCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroAppCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsMicroAppCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroAppCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroAppCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroAppCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroAppCreateV30Request
  */
  public static ToolsMicroAppCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroAppCreateV30Request.class);
  }

 /**
  * Convert an instance of ToolsMicroAppCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

