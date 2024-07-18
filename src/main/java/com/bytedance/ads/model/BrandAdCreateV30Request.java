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
import com.bytedance.ads.model.BrandAdCreateV30AdForm;
import com.bytedance.ads.model.BrandAdCreateV30AppOrigin;
import com.bytedance.ads.model.BrandAdCreateV30Classify;
import com.bytedance.ads.model.BrandAdCreateV30GdSendType;
import com.bytedance.ads.model.BrandAdCreateV30LandingType;
import com.bytedance.ads.model.BrandAdCreateV30RequestAudienceInfo;
import com.bytedance.ads.model.BrandAdCreateV30RequestDateQuantity;
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
 * BrandAdCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class BrandAdCreateV30Request {
  public static final String SERIALIZED_NAME_AD_FORM = "ad_form";
  @SerializedName(SERIALIZED_NAME_AD_FORM)
  private BrandAdCreateV30AdForm adForm = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private BrandAdCreateV30AppOrigin appOrigin = null;

  public static final String SERIALIZED_NAME_AUDIENCE_INFO = "audience_info";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_INFO)
  private BrandAdCreateV30RequestAudienceInfo audienceInfo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CLASSIFY = "classify";
  @SerializedName(SERIALIZED_NAME_CLASSIFY)
  private BrandAdCreateV30Classify classify = null;

  public static final String SERIALIZED_NAME_DATE_QUANTITY = "date_quantity";
  @SerializedName(SERIALIZED_NAME_DATE_QUANTITY)
  private BrandAdCreateV30RequestDateQuantity dateQuantity = null;

  public static final String SERIALIZED_NAME_GD_SEND_TYPE = "gd_send_type";
  @SerializedName(SERIALIZED_NAME_GD_SEND_TYPE)
  private BrandAdCreateV30GdSendType gdSendType = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private BrandAdCreateV30LandingType landingType = null;

  public static final String SERIALIZED_NAME_MERCHANT_INTENTION_NO = "merchant_Intention_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INTENTION_NO)
  private String merchantIntentionNo = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_POLICY_NO = "policy_no";
  @SerializedName(SERIALIZED_NAME_POLICY_NO)
  private String policyNo = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private Long staffId = null;

  public BrandAdCreateV30Request() {
  }

  public BrandAdCreateV30Request adForm(BrandAdCreateV30AdForm adForm) {
    
    this.adForm = adForm;
    return this;
  }

   /**
   * Get adForm
   * @return adForm
  **/
  @javax.annotation.Nonnull
  public BrandAdCreateV30AdForm getAdForm() {
    return adForm;
  }


  public void setAdForm(BrandAdCreateV30AdForm adForm) {
    this.adForm = adForm;
  }


  public BrandAdCreateV30Request advertiserId(Long advertiserId) {
    
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


  public BrandAdCreateV30Request appOrigin(BrandAdCreateV30AppOrigin appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * Get appOrigin
   * @return appOrigin
  **/
  @javax.annotation.Nonnull
  public BrandAdCreateV30AppOrigin getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(BrandAdCreateV30AppOrigin appOrigin) {
    this.appOrigin = appOrigin;
  }


  public BrandAdCreateV30Request audienceInfo(BrandAdCreateV30RequestAudienceInfo audienceInfo) {
    
    this.audienceInfo = audienceInfo;
    return this;
  }

   /**
   * Get audienceInfo
   * @return audienceInfo
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30RequestAudienceInfo getAudienceInfo() {
    return audienceInfo;
  }


  public void setAudienceInfo(BrandAdCreateV30RequestAudienceInfo audienceInfo) {
    this.audienceInfo = audienceInfo;
  }


  public BrandAdCreateV30Request campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组Id
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public BrandAdCreateV30Request classify(BrandAdCreateV30Classify classify) {
    
    this.classify = classify;
    return this;
  }

   /**
   * Get classify
   * @return classify
  **/
  @javax.annotation.Nonnull
  public BrandAdCreateV30Classify getClassify() {
    return classify;
  }


  public void setClassify(BrandAdCreateV30Classify classify) {
    this.classify = classify;
  }


  public BrandAdCreateV30Request dateQuantity(BrandAdCreateV30RequestDateQuantity dateQuantity) {
    
    this.dateQuantity = dateQuantity;
    return this;
  }

   /**
   * Get dateQuantity
   * @return dateQuantity
  **/
  @javax.annotation.Nonnull
  public BrandAdCreateV30RequestDateQuantity getDateQuantity() {
    return dateQuantity;
  }


  public void setDateQuantity(BrandAdCreateV30RequestDateQuantity dateQuantity) {
    this.dateQuantity = dateQuantity;
  }


  public BrandAdCreateV30Request gdSendType(BrandAdCreateV30GdSendType gdSendType) {
    
    this.gdSendType = gdSendType;
    return this;
  }

   /**
   * Get gdSendType
   * @return gdSendType
  **/
  @javax.annotation.Nonnull
  public BrandAdCreateV30GdSendType getGdSendType() {
    return gdSendType;
  }


  public void setGdSendType(BrandAdCreateV30GdSendType gdSendType) {
    this.gdSendType = gdSendType;
  }


  public BrandAdCreateV30Request landingType(BrandAdCreateV30LandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nonnull
  public BrandAdCreateV30LandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(BrandAdCreateV30LandingType landingType) {
    this.landingType = landingType;
  }


  public BrandAdCreateV30Request merchantIntentionNo(String merchantIntentionNo) {
    
    this.merchantIntentionNo = merchantIntentionNo;
    return this;
  }

   /**
   * 招商订单编号
   * @return merchantIntentionNo
  **/
  @javax.annotation.Nullable
  public String getMerchantIntentionNo() {
    return merchantIntentionNo;
  }


  public void setMerchantIntentionNo(String merchantIntentionNo) {
    this.merchantIntentionNo = merchantIntentionNo;
  }


  public BrandAdCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 计划名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandAdCreateV30Request policyNo(String policyNo) {
    
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


  public BrandAdCreateV30Request remark(String remark) {
    
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


  public BrandAdCreateV30Request staffId(Long staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * 代理商员工ID
   * @return staffId
  **/
  @javax.annotation.Nullable
  public Long getStaffId() {
    return staffId;
  }


  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdCreateV30Request brandAdCreateV30Request = (BrandAdCreateV30Request) o;
    return Objects.equals(this.adForm, brandAdCreateV30Request.adForm) &&
        Objects.equals(this.advertiserId, brandAdCreateV30Request.advertiserId) &&
        Objects.equals(this.appOrigin, brandAdCreateV30Request.appOrigin) &&
        Objects.equals(this.audienceInfo, brandAdCreateV30Request.audienceInfo) &&
        Objects.equals(this.campaignId, brandAdCreateV30Request.campaignId) &&
        Objects.equals(this.classify, brandAdCreateV30Request.classify) &&
        Objects.equals(this.dateQuantity, brandAdCreateV30Request.dateQuantity) &&
        Objects.equals(this.gdSendType, brandAdCreateV30Request.gdSendType) &&
        Objects.equals(this.landingType, brandAdCreateV30Request.landingType) &&
        Objects.equals(this.merchantIntentionNo, brandAdCreateV30Request.merchantIntentionNo) &&
        Objects.equals(this.name, brandAdCreateV30Request.name) &&
        Objects.equals(this.policyNo, brandAdCreateV30Request.policyNo) &&
        Objects.equals(this.remark, brandAdCreateV30Request.remark) &&
        Objects.equals(this.staffId, brandAdCreateV30Request.staffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adForm, advertiserId, appOrigin, audienceInfo, campaignId, classify, dateQuantity, gdSendType, landingType, merchantIntentionNo, name, policyNo, remark, staffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAdCreateV30Request {\n");
    sb.append("    adForm: ").append(toIndentedString(adForm)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    audienceInfo: ").append(toIndentedString(audienceInfo)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
    sb.append("    dateQuantity: ").append(toIndentedString(dateQuantity)).append("\n");
    sb.append("    gdSendType: ").append(toIndentedString(gdSendType)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    merchantIntentionNo: ").append(toIndentedString(merchantIntentionNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyNo: ").append(toIndentedString(policyNo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("classify");
    openapiFields.add("date_quantity");
    openapiFields.add("gd_send_type");
    openapiFields.add("landing_type");
    openapiFields.add("merchant_Intention_no");
    openapiFields.add("name");
    openapiFields.add("policy_no");
    openapiFields.add("remark");
    openapiFields.add("staff_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_form");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("app_origin");
    openapiRequiredFields.add("campaign_id");
    openapiRequiredFields.add("classify");
    openapiRequiredFields.add("date_quantity");
    openapiRequiredFields.add("gd_send_type");
    openapiRequiredFields.add("landing_type");
    openapiRequiredFields.add("policy_no");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdCreateV30Request>() {
           @Override
           public void write(JsonWriter out, BrandAdCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to BrandAdCreateV30Request
  */
  public static BrandAdCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdCreateV30Request.class);
  }

 /**
  * Convert an instance of BrandAdCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

