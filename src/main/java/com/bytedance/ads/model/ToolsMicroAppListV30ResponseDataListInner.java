/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListAuditStatus;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListMaxPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListMaxRechargeTier;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListMembershipType;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListMidPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListMinPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListMinRechargeTier;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListPaymentForm;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListRecommendedRechargeTier;
import com.bytedance.ads.model.ToolsMicroAppListV30DataListRevenueModel;
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
 * ToolsMicroAppListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ToolsMicroAppListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ToolsMicroAppListV30DataListAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DISCOUNT_RATE = "discount_rate";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_RATE)
  private Long discountRate = null;

  public static final String SERIALIZED_NAME_HAS_DISCOUNT = "has_discount";
  @SerializedName(SERIALIZED_NAME_HAS_DISCOUNT)
  private Boolean hasDiscount = null;

  public static final String SERIALIZED_NAME_HAS_ONLINE_EARNING = "has_online_earning";
  @SerializedName(SERIALIZED_NAME_HAS_ONLINE_EARNING)
  private Boolean hasOnlineEarning = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE = "max_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE)
  private ToolsMicroAppListV30DataListMaxPaymentTierRange maxPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MAX_RECHARGE_TIER = "max_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MAX_RECHARGE_TIER)
  private ToolsMicroAppListV30DataListMaxRechargeTier maxRechargeTier = null;

  public static final String SERIALIZED_NAME_MEMBERSHIP_TYPE = "membership_type";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_TYPE)
  private ToolsMicroAppListV30DataListMembershipType membershipType = null;

  public static final String SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE = "mid_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE)
  private ToolsMicroAppListV30DataListMidPaymentTierRange midPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE = "min_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE)
  private ToolsMicroAppListV30DataListMinPaymentTierRange minPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_RECHARGE_TIER = "min_recharge_tier";
  @SerializedName(SERIALIZED_NAME_MIN_RECHARGE_TIER)
  private ToolsMicroAppListV30DataListMinRechargeTier minRechargeTier = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PAYMENT_FORM = "payment_form";
  @SerializedName(SERIALIZED_NAME_PAYMENT_FORM)
  private ToolsMicroAppListV30DataListPaymentForm paymentForm = null;

  public static final String SERIALIZED_NAME_PROP_NAME = "prop_name";
  @SerializedName(SERIALIZED_NAME_PROP_NAME)
  private String propName = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER = "recommended_recharge_tier";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_RECHARGE_TIER)
  private ToolsMicroAppListV30DataListRecommendedRechargeTier recommendedRechargeTier = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_REVENUE_MODEL = "revenue_model";
  @SerializedName(SERIALIZED_NAME_REVENUE_MODEL)
  private ToolsMicroAppListV30DataListRevenueModel revenueModel = null;

  public static final String SERIALIZED_NAME_TAG_INFO = "tag_info";
  @SerializedName(SERIALIZED_NAME_TAG_INFO)
  private String tagInfo = null;

  public ToolsMicroAppListV30ResponseDataListInner() {
  }

  public ToolsMicroAppListV30ResponseDataListInner advertiserId(Long advertiserId) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ToolsMicroAppListV30ResponseDataListInner auditStatus(ToolsMicroAppListV30DataListAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ToolsMicroAppListV30DataListAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ToolsMicroAppListV30ResponseDataListInner createTime(String createTime) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner discountRate(Long discountRate) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner hasDiscount(Boolean hasDiscount) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner hasOnlineEarning(Boolean hasOnlineEarning) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsMicroAppListV30ResponseDataListInner maxPaymentTierRange(ToolsMicroAppListV30DataListMaxPaymentTierRange maxPaymentTierRange) {
    
    this.maxPaymentTierRange = maxPaymentTierRange;
    return this;
  }

   /**
   * Get maxPaymentTierRange
   * @return maxPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListMaxPaymentTierRange getMaxPaymentTierRange() {
    return maxPaymentTierRange;
  }


  public void setMaxPaymentTierRange(ToolsMicroAppListV30DataListMaxPaymentTierRange maxPaymentTierRange) {
    this.maxPaymentTierRange = maxPaymentTierRange;
  }


  public ToolsMicroAppListV30ResponseDataListInner maxRechargeTier(ToolsMicroAppListV30DataListMaxRechargeTier maxRechargeTier) {
    
    this.maxRechargeTier = maxRechargeTier;
    return this;
  }

   /**
   * Get maxRechargeTier
   * @return maxRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListMaxRechargeTier getMaxRechargeTier() {
    return maxRechargeTier;
  }


  public void setMaxRechargeTier(ToolsMicroAppListV30DataListMaxRechargeTier maxRechargeTier) {
    this.maxRechargeTier = maxRechargeTier;
  }


  public ToolsMicroAppListV30ResponseDataListInner membershipType(ToolsMicroAppListV30DataListMembershipType membershipType) {
    
    this.membershipType = membershipType;
    return this;
  }

   /**
   * Get membershipType
   * @return membershipType
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListMembershipType getMembershipType() {
    return membershipType;
  }


  public void setMembershipType(ToolsMicroAppListV30DataListMembershipType membershipType) {
    this.membershipType = membershipType;
  }


  public ToolsMicroAppListV30ResponseDataListInner midPaymentTierRange(ToolsMicroAppListV30DataListMidPaymentTierRange midPaymentTierRange) {
    
    this.midPaymentTierRange = midPaymentTierRange;
    return this;
  }

   /**
   * Get midPaymentTierRange
   * @return midPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListMidPaymentTierRange getMidPaymentTierRange() {
    return midPaymentTierRange;
  }


  public void setMidPaymentTierRange(ToolsMicroAppListV30DataListMidPaymentTierRange midPaymentTierRange) {
    this.midPaymentTierRange = midPaymentTierRange;
  }


  public ToolsMicroAppListV30ResponseDataListInner minPaymentTierRange(ToolsMicroAppListV30DataListMinPaymentTierRange minPaymentTierRange) {
    
    this.minPaymentTierRange = minPaymentTierRange;
    return this;
  }

   /**
   * Get minPaymentTierRange
   * @return minPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListMinPaymentTierRange getMinPaymentTierRange() {
    return minPaymentTierRange;
  }


  public void setMinPaymentTierRange(ToolsMicroAppListV30DataListMinPaymentTierRange minPaymentTierRange) {
    this.minPaymentTierRange = minPaymentTierRange;
  }


  public ToolsMicroAppListV30ResponseDataListInner minRechargeTier(ToolsMicroAppListV30DataListMinRechargeTier minRechargeTier) {
    
    this.minRechargeTier = minRechargeTier;
    return this;
  }

   /**
   * Get minRechargeTier
   * @return minRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListMinRechargeTier getMinRechargeTier() {
    return minRechargeTier;
  }


  public void setMinRechargeTier(ToolsMicroAppListV30DataListMinRechargeTier minRechargeTier) {
    this.minRechargeTier = minRechargeTier;
  }


  public ToolsMicroAppListV30ResponseDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public ToolsMicroAppListV30ResponseDataListInner name(String name) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner paymentForm(ToolsMicroAppListV30DataListPaymentForm paymentForm) {
    
    this.paymentForm = paymentForm;
    return this;
  }

   /**
   * Get paymentForm
   * @return paymentForm
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListPaymentForm getPaymentForm() {
    return paymentForm;
  }


  public void setPaymentForm(ToolsMicroAppListV30DataListPaymentForm paymentForm) {
    this.paymentForm = paymentForm;
  }


  public ToolsMicroAppListV30ResponseDataListInner propName(String propName) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ToolsMicroAppListV30ResponseDataListInner recommendedRechargeTier(ToolsMicroAppListV30DataListRecommendedRechargeTier recommendedRechargeTier) {
    
    this.recommendedRechargeTier = recommendedRechargeTier;
    return this;
  }

   /**
   * Get recommendedRechargeTier
   * @return recommendedRechargeTier
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListRecommendedRechargeTier getRecommendedRechargeTier() {
    return recommendedRechargeTier;
  }


  public void setRecommendedRechargeTier(ToolsMicroAppListV30DataListRecommendedRechargeTier recommendedRechargeTier) {
    this.recommendedRechargeTier = recommendedRechargeTier;
  }


  public ToolsMicroAppListV30ResponseDataListInner remark(String remark) {
    
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


  public ToolsMicroAppListV30ResponseDataListInner revenueModel(ToolsMicroAppListV30DataListRevenueModel revenueModel) {
    
    this.revenueModel = revenueModel;
    return this;
  }

   /**
   * Get revenueModel
   * @return revenueModel
  **/
  @javax.annotation.Nullable
  public ToolsMicroAppListV30DataListRevenueModel getRevenueModel() {
    return revenueModel;
  }


  public void setRevenueModel(ToolsMicroAppListV30DataListRevenueModel revenueModel) {
    this.revenueModel = revenueModel;
  }


  public ToolsMicroAppListV30ResponseDataListInner tagInfo(String tagInfo) {
    
    this.tagInfo = tagInfo;
    return this;
  }

   /**
   * 
   * @return tagInfo
  **/
  @javax.annotation.Nullable
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
    ToolsMicroAppListV30ResponseDataListInner toolsMicroAppListV30ResponseDataListInner = (ToolsMicroAppListV30ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, toolsMicroAppListV30ResponseDataListInner.advertiserId) &&
        Objects.equals(this.appId, toolsMicroAppListV30ResponseDataListInner.appId) &&
        Objects.equals(this.auditStatus, toolsMicroAppListV30ResponseDataListInner.auditStatus) &&
        Objects.equals(this.createTime, toolsMicroAppListV30ResponseDataListInner.createTime) &&
        Objects.equals(this.discountRate, toolsMicroAppListV30ResponseDataListInner.discountRate) &&
        Objects.equals(this.hasDiscount, toolsMicroAppListV30ResponseDataListInner.hasDiscount) &&
        Objects.equals(this.hasOnlineEarning, toolsMicroAppListV30ResponseDataListInner.hasOnlineEarning) &&
        Objects.equals(this.instanceId, toolsMicroAppListV30ResponseDataListInner.instanceId) &&
        Objects.equals(this.maxPaymentTierRange, toolsMicroAppListV30ResponseDataListInner.maxPaymentTierRange) &&
        Objects.equals(this.maxRechargeTier, toolsMicroAppListV30ResponseDataListInner.maxRechargeTier) &&
        Objects.equals(this.membershipType, toolsMicroAppListV30ResponseDataListInner.membershipType) &&
        Objects.equals(this.midPaymentTierRange, toolsMicroAppListV30ResponseDataListInner.midPaymentTierRange) &&
        Objects.equals(this.minPaymentTierRange, toolsMicroAppListV30ResponseDataListInner.minPaymentTierRange) &&
        Objects.equals(this.minRechargeTier, toolsMicroAppListV30ResponseDataListInner.minRechargeTier) &&
        Objects.equals(this.modifyTime, toolsMicroAppListV30ResponseDataListInner.modifyTime) &&
        Objects.equals(this.name, toolsMicroAppListV30ResponseDataListInner.name) &&
        Objects.equals(this.paymentForm, toolsMicroAppListV30ResponseDataListInner.paymentForm) &&
        Objects.equals(this.propName, toolsMicroAppListV30ResponseDataListInner.propName) &&
        Objects.equals(this.reason, toolsMicroAppListV30ResponseDataListInner.reason) &&
        Objects.equals(this.recommendedRechargeTier, toolsMicroAppListV30ResponseDataListInner.recommendedRechargeTier) &&
        Objects.equals(this.remark, toolsMicroAppListV30ResponseDataListInner.remark) &&
        Objects.equals(this.revenueModel, toolsMicroAppListV30ResponseDataListInner.revenueModel) &&
        Objects.equals(this.tagInfo, toolsMicroAppListV30ResponseDataListInner.tagInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, auditStatus, createTime, discountRate, hasDiscount, hasOnlineEarning, instanceId, maxPaymentTierRange, maxRechargeTier, membershipType, midPaymentTierRange, minPaymentTierRange, minRechargeTier, modifyTime, name, paymentForm, propName, reason, recommendedRechargeTier, remark, revenueModel, tagInfo);
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
    sb.append("class ToolsMicroAppListV30ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    hasDiscount: ").append(toIndentedString(hasDiscount)).append("\n");
    sb.append("    hasOnlineEarning: ").append(toIndentedString(hasOnlineEarning)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    maxPaymentTierRange: ").append(toIndentedString(maxPaymentTierRange)).append("\n");
    sb.append("    maxRechargeTier: ").append(toIndentedString(maxRechargeTier)).append("\n");
    sb.append("    membershipType: ").append(toIndentedString(membershipType)).append("\n");
    sb.append("    midPaymentTierRange: ").append(toIndentedString(midPaymentTierRange)).append("\n");
    sb.append("    minPaymentTierRange: ").append(toIndentedString(minPaymentTierRange)).append("\n");
    sb.append("    minRechargeTier: ").append(toIndentedString(minRechargeTier)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentForm: ").append(toIndentedString(paymentForm)).append("\n");
    sb.append("    propName: ").append(toIndentedString(propName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("create_time");
    openapiFields.add("discount_rate");
    openapiFields.add("has_discount");
    openapiFields.add("has_online_earning");
    openapiFields.add("instance_id");
    openapiFields.add("max_payment_tier_range");
    openapiFields.add("max_recharge_tier");
    openapiFields.add("membership_type");
    openapiFields.add("mid_payment_tier_range");
    openapiFields.add("min_payment_tier_range");
    openapiFields.add("min_recharge_tier");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("payment_form");
    openapiFields.add("prop_name");
    openapiFields.add("reason");
    openapiFields.add("recommended_recharge_tier");
    openapiFields.add("remark");
    openapiFields.add("revenue_model");
    openapiFields.add("tag_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroAppListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroAppListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroAppListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroAppListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroAppListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsMicroAppListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroAppListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroAppListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroAppListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroAppListV30ResponseDataListInner
  */
  public static ToolsMicroAppListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroAppListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsMicroAppListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

