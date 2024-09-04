/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCampaignGetV30DataCampaignsCampaignCategory;
import com.bytedance.ads.model.BrandCampaignGetV30DataCampaignsCampaignStatus;
import com.bytedance.ads.model.BrandCampaignGetV30DataCampaignsContractType;
import com.bytedance.ads.model.BrandCampaignGetV30DataCampaignsMarketingPurpose;
import com.bytedance.ads.model.BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo;
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
 * BrandCampaignGetV30ResponseDataCampaignsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class BrandCampaignGetV30ResponseDataCampaignsInner {
  public static final String SERIALIZED_NAME_ADS_BUDGET = "ads_budget";
  @SerializedName(SERIALIZED_NAME_ADS_BUDGET)
  private Long adsBudget = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTHENTICATION_INFO = "authentication_info";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_INFO)
  private BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo authenticationInfo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_CATEGORY = "campaign_category";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_CATEGORY)
  private BrandCampaignGetV30DataCampaignsCampaignCategory campaignCategory = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_STATUS = "campaign_status";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_STATUS)
  private BrandCampaignGetV30DataCampaignsCampaignStatus campaignStatus = null;

  public static final String SERIALIZED_NAME_CART_ID = "cart_id";
  @SerializedName(SERIALIZED_NAME_CART_ID)
  private Long cartId = null;

  public static final String SERIALIZED_NAME_CONTRACT_TYPE = "contract_type";
  @SerializedName(SERIALIZED_NAME_CONTRACT_TYPE)
  private BrandCampaignGetV30DataCampaignsContractType contractType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MARKETING_PURPOSE = "marketing_purpose";
  @SerializedName(SERIALIZED_NAME_MARKETING_PURPOSE)
  private BrandCampaignGetV30DataCampaignsMarketingPurpose marketingPurpose = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public BrandCampaignGetV30ResponseDataCampaignsInner() {
  }

  public BrandCampaignGetV30ResponseDataCampaignsInner adsBudget(Long adsBudget) {
    
    this.adsBudget = adsBudget;
    return this;
  }

   /**
   * 广告组总金额 该金额乘以10的5次方  避免出现小数
   * @return adsBudget
  **/
  @javax.annotation.Nullable
  public Long getAdsBudget() {
    return adsBudget;
  }


  public void setAdsBudget(Long adsBudget) {
    this.adsBudget = adsBudget;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner authenticationInfo(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo authenticationInfo) {
    
    this.authenticationInfo = authenticationInfo;
    return this;
  }

   /**
   * Get authenticationInfo
   * @return authenticationInfo
  **/
  @javax.annotation.Nullable
  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo getAuthenticationInfo() {
    return authenticationInfo;
  }


  public void setAuthenticationInfo(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo authenticationInfo) {
    this.authenticationInfo = authenticationInfo;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner campaignCategory(BrandCampaignGetV30DataCampaignsCampaignCategory campaignCategory) {
    
    this.campaignCategory = campaignCategory;
    return this;
  }

   /**
   * Get campaignCategory
   * @return campaignCategory
  **/
  @javax.annotation.Nullable
  public BrandCampaignGetV30DataCampaignsCampaignCategory getCampaignCategory() {
    return campaignCategory;
  }


  public void setCampaignCategory(BrandCampaignGetV30DataCampaignsCampaignCategory campaignCategory) {
    this.campaignCategory = campaignCategory;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 广告组名称
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner campaignStatus(BrandCampaignGetV30DataCampaignsCampaignStatus campaignStatus) {
    
    this.campaignStatus = campaignStatus;
    return this;
  }

   /**
   * Get campaignStatus
   * @return campaignStatus
  **/
  @javax.annotation.Nullable
  public BrandCampaignGetV30DataCampaignsCampaignStatus getCampaignStatus() {
    return campaignStatus;
  }


  public void setCampaignStatus(BrandCampaignGetV30DataCampaignsCampaignStatus campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner cartId(Long cartId) {
    
    this.cartId = cartId;
    return this;
  }

   /**
   * 排期ID
   * @return cartId
  **/
  @javax.annotation.Nullable
  public Long getCartId() {
    return cartId;
  }


  public void setCartId(Long cartId) {
    this.cartId = cartId;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner contractType(BrandCampaignGetV30DataCampaignsContractType contractType) {
    
    this.contractType = contractType;
    return this;
  }

   /**
   * Get contractType
   * @return contractType
  **/
  @javax.annotation.Nullable
  public BrandCampaignGetV30DataCampaignsContractType getContractType() {
    return contractType;
  }


  public void setContractType(BrandCampaignGetV30DataCampaignsContractType contractType) {
    this.contractType = contractType;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 广告组投放截止时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner marketingPurpose(BrandCampaignGetV30DataCampaignsMarketingPurpose marketingPurpose) {
    
    this.marketingPurpose = marketingPurpose;
    return this;
  }

   /**
   * Get marketingPurpose
   * @return marketingPurpose
  **/
  @javax.annotation.Nullable
  public BrandCampaignGetV30DataCampaignsMarketingPurpose getMarketingPurpose() {
    return marketingPurpose;
  }


  public void setMarketingPurpose(BrandCampaignGetV30DataCampaignsMarketingPurpose marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 修改时间
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 广告组投放起始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCampaignGetV30ResponseDataCampaignsInner brandCampaignGetV30ResponseDataCampaignsInner = (BrandCampaignGetV30ResponseDataCampaignsInner) o;
    return Objects.equals(this.adsBudget, brandCampaignGetV30ResponseDataCampaignsInner.adsBudget) &&
        Objects.equals(this.advertiserId, brandCampaignGetV30ResponseDataCampaignsInner.advertiserId) &&
        Objects.equals(this.authenticationInfo, brandCampaignGetV30ResponseDataCampaignsInner.authenticationInfo) &&
        Objects.equals(this.campaignCategory, brandCampaignGetV30ResponseDataCampaignsInner.campaignCategory) &&
        Objects.equals(this.campaignId, brandCampaignGetV30ResponseDataCampaignsInner.campaignId) &&
        Objects.equals(this.campaignName, brandCampaignGetV30ResponseDataCampaignsInner.campaignName) &&
        Objects.equals(this.campaignStatus, brandCampaignGetV30ResponseDataCampaignsInner.campaignStatus) &&
        Objects.equals(this.cartId, brandCampaignGetV30ResponseDataCampaignsInner.cartId) &&
        Objects.equals(this.contractType, brandCampaignGetV30ResponseDataCampaignsInner.contractType) &&
        Objects.equals(this.createTime, brandCampaignGetV30ResponseDataCampaignsInner.createTime) &&
        Objects.equals(this.endTime, brandCampaignGetV30ResponseDataCampaignsInner.endTime) &&
        Objects.equals(this.marketingPurpose, brandCampaignGetV30ResponseDataCampaignsInner.marketingPurpose) &&
        Objects.equals(this.modifyTime, brandCampaignGetV30ResponseDataCampaignsInner.modifyTime) &&
        Objects.equals(this.startTime, brandCampaignGetV30ResponseDataCampaignsInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adsBudget, advertiserId, authenticationInfo, campaignCategory, campaignId, campaignName, campaignStatus, cartId, contractType, createTime, endTime, marketingPurpose, modifyTime, startTime);
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
    sb.append("class BrandCampaignGetV30ResponseDataCampaignsInner {\n");
    sb.append("    adsBudget: ").append(toIndentedString(adsBudget)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    authenticationInfo: ").append(toIndentedString(authenticationInfo)).append("\n");
    sb.append("    campaignCategory: ").append(toIndentedString(campaignCategory)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    marketingPurpose: ").append(toIndentedString(marketingPurpose)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("ads_budget");
    openapiFields.add("advertiser_id");
    openapiFields.add("authentication_info");
    openapiFields.add("campaign_category");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_name");
    openapiFields.add("campaign_status");
    openapiFields.add("cart_id");
    openapiFields.add("contract_type");
    openapiFields.add("create_time");
    openapiFields.add("end_time");
    openapiFields.add("marketing_purpose");
    openapiFields.add("modify_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCampaignGetV30ResponseDataCampaignsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCampaignGetV30ResponseDataCampaignsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCampaignGetV30ResponseDataCampaignsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInner>() {
           @Override
           public void write(JsonWriter out, BrandCampaignGetV30ResponseDataCampaignsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCampaignGetV30ResponseDataCampaignsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCampaignGetV30ResponseDataCampaignsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCampaignGetV30ResponseDataCampaignsInner
  * @throws IOException if the JSON string is invalid with respect to BrandCampaignGetV30ResponseDataCampaignsInner
  */
  public static BrandCampaignGetV30ResponseDataCampaignsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCampaignGetV30ResponseDataCampaignsInner.class);
  }

 /**
  * Convert an instance of BrandCampaignGetV30ResponseDataCampaignsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

