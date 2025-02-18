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
import com.bytedance.ads.model.BrandOrderCreateV30AdForm;
import com.bytedance.ads.model.BrandOrderCreateV30AppOrigin;
import com.bytedance.ads.model.BrandOrderCreateV30Classify;
import com.bytedance.ads.model.BrandOrderCreateV30GdSendType;
import com.bytedance.ads.model.BrandOrderCreateV30PricingType;
import com.bytedance.ads.model.BrandOrderCreateV30ProType;
import com.bytedance.ads.model.BrandOrderCreateV30RequestAudienceInfo;
import com.bytedance.ads.model.BrandOrderCreateV30RequestBookingQuantityInfo;
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
 * BrandOrderCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class BrandOrderCreateV30Request {
  public static final String SERIALIZED_NAME_AD_FORM = "ad_form";
  @SerializedName(SERIALIZED_NAME_AD_FORM)
  private BrandOrderCreateV30AdForm adForm = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private BrandOrderCreateV30AppOrigin appOrigin = null;

  public static final String SERIALIZED_NAME_AUDIENCE_INFO = "audience_info";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_INFO)
  private BrandOrderCreateV30RequestAudienceInfo audienceInfo = null;

  public static final String SERIALIZED_NAME_BOOKING_QUANTITY_INFO = "booking_quantity_info";
  @SerializedName(SERIALIZED_NAME_BOOKING_QUANTITY_INFO)
  private BrandOrderCreateV30RequestBookingQuantityInfo bookingQuantityInfo = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CLASSIFY = "classify";
  @SerializedName(SERIALIZED_NAME_CLASSIFY)
  private BrandOrderCreateV30Classify classify = null;

  public static final String SERIALIZED_NAME_GD_SEND_TYPE = "gd_send_type";
  @SerializedName(SERIALIZED_NAME_GD_SEND_TYPE)
  private BrandOrderCreateV30GdSendType gdSendType = null;

  public static final String SERIALIZED_NAME_INTENTION_NO = "intention_no";
  @SerializedName(SERIALIZED_NAME_INTENTION_NO)
  private String intentionNo = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_POLICY_NO = "policy_no";
  @SerializedName(SERIALIZED_NAME_POLICY_NO)
  private String policyNo = null;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  private BrandOrderCreateV30PricingType pricingType = null;

  public static final String SERIALIZED_NAME_PRO_TYPE = "pro_type";
  @SerializedName(SERIALIZED_NAME_PRO_TYPE)
  private BrandOrderCreateV30ProType proType = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_STAFF_IDS = "staff_ids";
  @SerializedName(SERIALIZED_NAME_STAFF_IDS)
  private List<Long> staffIds = null;

  public BrandOrderCreateV30Request() {
  }

  public BrandOrderCreateV30Request adForm(BrandOrderCreateV30AdForm adForm) {
    
    this.adForm = adForm;
    return this;
  }

   /**
   * Get adForm
   * @return adForm
  **/
  @javax.annotation.Nonnull
  public BrandOrderCreateV30AdForm getAdForm() {
    return adForm;
  }


  public void setAdForm(BrandOrderCreateV30AdForm adForm) {
    this.adForm = adForm;
  }


  public BrandOrderCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BrandOrderCreateV30Request appOrigin(BrandOrderCreateV30AppOrigin appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * Get appOrigin
   * @return appOrigin
  **/
  @javax.annotation.Nonnull
  public BrandOrderCreateV30AppOrigin getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(BrandOrderCreateV30AppOrigin appOrigin) {
    this.appOrigin = appOrigin;
  }


  public BrandOrderCreateV30Request audienceInfo(BrandOrderCreateV30RequestAudienceInfo audienceInfo) {
    
    this.audienceInfo = audienceInfo;
    return this;
  }

   /**
   * Get audienceInfo
   * @return audienceInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30RequestAudienceInfo getAudienceInfo() {
    return audienceInfo;
  }


  public void setAudienceInfo(BrandOrderCreateV30RequestAudienceInfo audienceInfo) {
    this.audienceInfo = audienceInfo;
  }


  public BrandOrderCreateV30Request bookingQuantityInfo(BrandOrderCreateV30RequestBookingQuantityInfo bookingQuantityInfo) {
    
    this.bookingQuantityInfo = bookingQuantityInfo;
    return this;
  }

   /**
   * Get bookingQuantityInfo
   * @return bookingQuantityInfo
  **/
  @javax.annotation.Nonnull
  public BrandOrderCreateV30RequestBookingQuantityInfo getBookingQuantityInfo() {
    return bookingQuantityInfo;
  }


  public void setBookingQuantityInfo(BrandOrderCreateV30RequestBookingQuantityInfo bookingQuantityInfo) {
    this.bookingQuantityInfo = bookingQuantityInfo;
  }


  public BrandOrderCreateV30Request budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 总预算
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public BrandOrderCreateV30Request campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组ID
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public BrandOrderCreateV30Request classify(BrandOrderCreateV30Classify classify) {
    
    this.classify = classify;
    return this;
  }

   /**
   * Get classify
   * @return classify
  **/
  @javax.annotation.Nonnull
  public BrandOrderCreateV30Classify getClassify() {
    return classify;
  }


  public void setClassify(BrandOrderCreateV30Classify classify) {
    this.classify = classify;
  }


  public BrandOrderCreateV30Request gdSendType(BrandOrderCreateV30GdSendType gdSendType) {
    
    this.gdSendType = gdSendType;
    return this;
  }

   /**
   * Get gdSendType
   * @return gdSendType
  **/
  @javax.annotation.Nonnull
  public BrandOrderCreateV30GdSendType getGdSendType() {
    return gdSendType;
  }


  public void setGdSendType(BrandOrderCreateV30GdSendType gdSendType) {
    this.gdSendType = gdSendType;
  }


  public BrandOrderCreateV30Request intentionNo(String intentionNo) {
    
    this.intentionNo = intentionNo;
    return this;
  }

   /**
   * 招商订单编号
   * @return intentionNo
  **/
  @javax.annotation.Nullable
  public String getIntentionNo() {
    return intentionNo;
  }


  public void setIntentionNo(String intentionNo) {
    this.intentionNo = intentionNo;
  }


  public BrandOrderCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 预订单名称
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandOrderCreateV30Request policyNo(String policyNo) {
    
    this.policyNo = policyNo;
    return this;
  }

   /**
   * 政策编号
   * @return policyNo
  **/
  @javax.annotation.Nonnull
  public String getPolicyNo() {
    return policyNo;
  }


  public void setPolicyNo(String policyNo) {
    this.policyNo = policyNo;
  }


  public BrandOrderCreateV30Request pricingType(BrandOrderCreateV30PricingType pricingType) {
    
    this.pricingType = pricingType;
    return this;
  }

   /**
   * Get pricingType
   * @return pricingType
  **/
  @javax.annotation.Nonnull
  public BrandOrderCreateV30PricingType getPricingType() {
    return pricingType;
  }


  public void setPricingType(BrandOrderCreateV30PricingType pricingType) {
    this.pricingType = pricingType;
  }


  public BrandOrderCreateV30Request proType(BrandOrderCreateV30ProType proType) {
    
    this.proType = proType;
    return this;
  }

   /**
   * Get proType
   * @return proType
  **/
  @javax.annotation.Nonnull
  public BrandOrderCreateV30ProType getProType() {
    return proType;
  }


  public void setProType(BrandOrderCreateV30ProType proType) {
    this.proType = proType;
  }


  public BrandOrderCreateV30Request remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public BrandOrderCreateV30Request staffIds(List<Long> staffIds) {
    
    this.staffIds = staffIds;
    return this;
  }

  public BrandOrderCreateV30Request addStaffIdsItem(Long staffIdsItem) {
    if (this.staffIds == null) {
      this.staffIds = new ArrayList<>();
    }
    this.staffIds.add(staffIdsItem);
    return this;
  }

   /**
   * 代理商创建广告的时候，需要传代理商员工ID
   * @return staffIds
  **/
  @javax.annotation.Nullable
  public List<Long> getStaffIds() {
    return staffIds;
  }


  public void setStaffIds(List<Long> staffIds) {
    this.staffIds = staffIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderCreateV30Request brandOrderCreateV30Request = (BrandOrderCreateV30Request) o;
    return Objects.equals(this.adForm, brandOrderCreateV30Request.adForm) &&
        Objects.equals(this.advertiserId, brandOrderCreateV30Request.advertiserId) &&
        Objects.equals(this.appOrigin, brandOrderCreateV30Request.appOrigin) &&
        Objects.equals(this.audienceInfo, brandOrderCreateV30Request.audienceInfo) &&
        Objects.equals(this.bookingQuantityInfo, brandOrderCreateV30Request.bookingQuantityInfo) &&
        Objects.equals(this.budget, brandOrderCreateV30Request.budget) &&
        Objects.equals(this.campaignId, brandOrderCreateV30Request.campaignId) &&
        Objects.equals(this.classify, brandOrderCreateV30Request.classify) &&
        Objects.equals(this.gdSendType, brandOrderCreateV30Request.gdSendType) &&
        Objects.equals(this.intentionNo, brandOrderCreateV30Request.intentionNo) &&
        Objects.equals(this.name, brandOrderCreateV30Request.name) &&
        Objects.equals(this.policyNo, brandOrderCreateV30Request.policyNo) &&
        Objects.equals(this.pricingType, brandOrderCreateV30Request.pricingType) &&
        Objects.equals(this.proType, brandOrderCreateV30Request.proType) &&
        Objects.equals(this.remark, brandOrderCreateV30Request.remark) &&
        Objects.equals(this.staffIds, brandOrderCreateV30Request.staffIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adForm, advertiserId, appOrigin, audienceInfo, bookingQuantityInfo, budget, campaignId, classify, gdSendType, intentionNo, name, policyNo, pricingType, proType, remark, staffIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandOrderCreateV30Request {\n");
    sb.append("    adForm: ").append(toIndentedString(adForm)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    audienceInfo: ").append(toIndentedString(audienceInfo)).append("\n");
    sb.append("    bookingQuantityInfo: ").append(toIndentedString(bookingQuantityInfo)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
    sb.append("    gdSendType: ").append(toIndentedString(gdSendType)).append("\n");
    sb.append("    intentionNo: ").append(toIndentedString(intentionNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyNo: ").append(toIndentedString(policyNo)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    proType: ").append(toIndentedString(proType)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    staffIds: ").append(toIndentedString(staffIds)).append("\n");
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
    openapiFields.add("ad_form");
    openapiFields.add("advertiser_id");
    openapiFields.add("app_origin");
    openapiFields.add("audience_info");
    openapiFields.add("booking_quantity_info");
    openapiFields.add("budget");
    openapiFields.add("campaign_id");
    openapiFields.add("classify");
    openapiFields.add("gd_send_type");
    openapiFields.add("intention_no");
    openapiFields.add("name");
    openapiFields.add("policy_no");
    openapiFields.add("pricing_type");
    openapiFields.add("pro_type");
    openapiFields.add("remark");
    openapiFields.add("staff_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_form");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("app_origin");
    openapiRequiredFields.add("booking_quantity_info");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("campaign_id");
    openapiRequiredFields.add("classify");
    openapiRequiredFields.add("gd_send_type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("policy_no");
    openapiRequiredFields.add("pricing_type");
    openapiRequiredFields.add("pro_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderCreateV30Request>() {
           @Override
           public void write(JsonWriter out, BrandOrderCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to BrandOrderCreateV30Request
  */
  public static BrandOrderCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderCreateV30Request.class);
  }

 /**
  * Convert an instance of BrandOrderCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

