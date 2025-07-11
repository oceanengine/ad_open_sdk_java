/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandAdGetV30DataAdsClassify;
import com.bytedance.ads.model.BrandAdGetV30DataAdsEnableMerchantIntention;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerAudienceInfo;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerBudgetInfo;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerFrequencyInfo;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerPromotionsInner;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerScheduleInfo;
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
 * BrandAdGetV30ResponseDataAdsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private String adId = null;

  public static final String SERIALIZED_NAME_AD_STATUS = "ad_status";
  @SerializedName(SERIALIZED_NAME_AD_STATUS)
  private Long adStatus = null;

  public static final String SERIALIZED_NAME_AD_STOCK_INFOS = "ad_stock_infos";
  @SerializedName(SERIALIZED_NAME_AD_STOCK_INFOS)
  private List<BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner> adStockInfos = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIENCE_INFO = "audience_info";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_INFO)
  private BrandAdGetV30ResponseDataAdsInnerAudienceInfo audienceInfo = null;

  public static final String SERIALIZED_NAME_BUDGET_INFO = "budget_info";
  @SerializedName(SERIALIZED_NAME_BUDGET_INFO)
  private BrandAdGetV30ResponseDataAdsInnerBudgetInfo budgetInfo = null;

  public static final String SERIALIZED_NAME_BUDGET_NO = "budget_no";
  @SerializedName(SERIALIZED_NAME_BUDGET_NO)
  private String budgetNo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId = null;

  public static final String SERIALIZED_NAME_CLASSIFY = "classify";
  @SerializedName(SERIALIZED_NAME_CLASSIFY)
  private BrandAdGetV30DataAdsClassify classify = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ENABLE_MERCHANT_INTENTION = "enable_merchant_intention";
  @SerializedName(SERIALIZED_NAME_ENABLE_MERCHANT_INTENTION)
  private BrandAdGetV30DataAdsEnableMerchantIntention enableMerchantIntention = null;

  public static final String SERIALIZED_NAME_FREQUENCY_INFO = "frequency_info";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_INFO)
  private BrandAdGetV30ResponseDataAdsInnerFrequencyInfo frequencyInfo = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private Long landingType = null;

  public static final String SERIALIZED_NAME_MAGAZINE_PRICE_INFO = "magazine_price_info";
  @SerializedName(SERIALIZED_NAME_MAGAZINE_PRICE_INFO)
  private BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo magazinePriceInfo = null;

  public static final String SERIALIZED_NAME_MERCHANT_INTENTION_ID = "merchant_intention_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INTENTION_ID)
  private Long merchantIntentionId = null;

  public static final String SERIALIZED_NAME_MERCHANT_INTENTION_NAME = "merchant_intention_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INTENTION_NAME)
  private String merchantIntentionName = null;

  public static final String SERIALIZED_NAME_MERCHANT_INTENTION_NO = "merchant_intention_no";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INTENTION_NO)
  private String merchantIntentionNo = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROMOTIONS = "promotions";
  @SerializedName(SERIALIZED_NAME_PROMOTIONS)
  private List<BrandAdGetV30ResponseDataAdsInnerPromotionsInner> promotions = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_SCHEDULE_INFO = "schedule_info";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_INFO)
  private BrandAdGetV30ResponseDataAdsInnerScheduleInfo scheduleInfo = null;

  public static final String SERIALIZED_NAME_SPU_ID = "spu_id";
  @SerializedName(SERIALIZED_NAME_SPU_ID)
  private Long spuId = null;

  public BrandAdGetV30ResponseDataAdsInner() {
  }

  public BrandAdGetV30ResponseDataAdsInner adId(String adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID
   * @return adId
  **/
  @javax.annotation.Nullable
  public String getAdId() {
    return adId;
  }


  public void setAdId(String adId) {
    this.adId = adId;
  }


  public BrandAdGetV30ResponseDataAdsInner adStatus(Long adStatus) {
    
    this.adStatus = adStatus;
    return this;
  }

   /**
   * 计划状态
   * @return adStatus
  **/
  @javax.annotation.Nullable
  public Long getAdStatus() {
    return adStatus;
  }


  public void setAdStatus(Long adStatus) {
    this.adStatus = adStatus;
  }


  public BrandAdGetV30ResponseDataAdsInner adStockInfos(List<BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner> adStockInfos) {
    
    this.adStockInfos = adStockInfos;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInner addAdStockInfosItem(BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner adStockInfosItem) {
    if (this.adStockInfos == null) {
      this.adStockInfos = new ArrayList<>();
    }
    this.adStockInfos.add(adStockInfosItem);
    return this;
  }

   /**
   * 流量位置信息
   * @return adStockInfos
  **/
  @javax.annotation.Nullable
  public List<BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner> getAdStockInfos() {
    return adStockInfos;
  }


  public void setAdStockInfos(List<BrandAdGetV30ResponseDataAdsInnerAdStockInfosInner> adStockInfos) {
    this.adStockInfos = adStockInfos;
  }


  public BrandAdGetV30ResponseDataAdsInner advertiserId(Long advertiserId) {
    
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


  public BrandAdGetV30ResponseDataAdsInner audienceInfo(BrandAdGetV30ResponseDataAdsInnerAudienceInfo audienceInfo) {
    
    this.audienceInfo = audienceInfo;
    return this;
  }

   /**
   * Get audienceInfo
   * @return audienceInfo
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30ResponseDataAdsInnerAudienceInfo getAudienceInfo() {
    return audienceInfo;
  }


  public void setAudienceInfo(BrandAdGetV30ResponseDataAdsInnerAudienceInfo audienceInfo) {
    this.audienceInfo = audienceInfo;
  }


  public BrandAdGetV30ResponseDataAdsInner budgetInfo(BrandAdGetV30ResponseDataAdsInnerBudgetInfo budgetInfo) {
    
    this.budgetInfo = budgetInfo;
    return this;
  }

   /**
   * Get budgetInfo
   * @return budgetInfo
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo getBudgetInfo() {
    return budgetInfo;
  }


  public void setBudgetInfo(BrandAdGetV30ResponseDataAdsInnerBudgetInfo budgetInfo) {
    this.budgetInfo = budgetInfo;
  }


  public BrandAdGetV30ResponseDataAdsInner budgetNo(String budgetNo) {
    
    this.budgetNo = budgetNo;
    return this;
  }

   /**
   * 资源立项编号
   * @return budgetNo
  **/
  @javax.annotation.Nullable
  public String getBudgetNo() {
    return budgetNo;
  }


  public void setBudgetNo(String budgetNo) {
    this.budgetNo = budgetNo;
  }


  public BrandAdGetV30ResponseDataAdsInner campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public BrandAdGetV30ResponseDataAdsInner classify(BrandAdGetV30DataAdsClassify classify) {
    
    this.classify = classify;
    return this;
  }

   /**
   * Get classify
   * @return classify
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsClassify getClassify() {
    return classify;
  }


  public void setClassify(BrandAdGetV30DataAdsClassify classify) {
    this.classify = classify;
  }


  public BrandAdGetV30ResponseDataAdsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 计划创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public BrandAdGetV30ResponseDataAdsInner enableMerchantIntention(BrandAdGetV30DataAdsEnableMerchantIntention enableMerchantIntention) {
    
    this.enableMerchantIntention = enableMerchantIntention;
    return this;
  }

   /**
   * Get enableMerchantIntention
   * @return enableMerchantIntention
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsEnableMerchantIntention getEnableMerchantIntention() {
    return enableMerchantIntention;
  }


  public void setEnableMerchantIntention(BrandAdGetV30DataAdsEnableMerchantIntention enableMerchantIntention) {
    this.enableMerchantIntention = enableMerchantIntention;
  }


  public BrandAdGetV30ResponseDataAdsInner frequencyInfo(BrandAdGetV30ResponseDataAdsInnerFrequencyInfo frequencyInfo) {
    
    this.frequencyInfo = frequencyInfo;
    return this;
  }

   /**
   * Get frequencyInfo
   * @return frequencyInfo
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30ResponseDataAdsInnerFrequencyInfo getFrequencyInfo() {
    return frequencyInfo;
  }


  public void setFrequencyInfo(BrandAdGetV30ResponseDataAdsInnerFrequencyInfo frequencyInfo) {
    this.frequencyInfo = frequencyInfo;
  }


  public BrandAdGetV30ResponseDataAdsInner landingType(Long landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * 推广目的（枚举值）
   * @return landingType
  **/
  @javax.annotation.Nullable
  public Long getLandingType() {
    return landingType;
  }


  public void setLandingType(Long landingType) {
    this.landingType = landingType;
  }


  public BrandAdGetV30ResponseDataAdsInner magazinePriceInfo(BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo magazinePriceInfo) {
    
    this.magazinePriceInfo = magazinePriceInfo;
    return this;
  }

   /**
   * Get magazinePriceInfo
   * @return magazinePriceInfo
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo getMagazinePriceInfo() {
    return magazinePriceInfo;
  }


  public void setMagazinePriceInfo(BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo magazinePriceInfo) {
    this.magazinePriceInfo = magazinePriceInfo;
  }


  public BrandAdGetV30ResponseDataAdsInner merchantIntentionId(Long merchantIntentionId) {
    
    this.merchantIntentionId = merchantIntentionId;
    return this;
  }

   /**
   * 招商意向单ID
   * @return merchantIntentionId
  **/
  @javax.annotation.Nullable
  public Long getMerchantIntentionId() {
    return merchantIntentionId;
  }


  public void setMerchantIntentionId(Long merchantIntentionId) {
    this.merchantIntentionId = merchantIntentionId;
  }


  public BrandAdGetV30ResponseDataAdsInner merchantIntentionName(String merchantIntentionName) {
    
    this.merchantIntentionName = merchantIntentionName;
    return this;
  }

   /**
   * 招商意向单名称
   * @return merchantIntentionName
  **/
  @javax.annotation.Nullable
  public String getMerchantIntentionName() {
    return merchantIntentionName;
  }


  public void setMerchantIntentionName(String merchantIntentionName) {
    this.merchantIntentionName = merchantIntentionName;
  }


  public BrandAdGetV30ResponseDataAdsInner merchantIntentionNo(String merchantIntentionNo) {
    
    this.merchantIntentionNo = merchantIntentionNo;
    return this;
  }

   /**
   * 招商意向单编号
   * @return merchantIntentionNo
  **/
  @javax.annotation.Nullable
  public String getMerchantIntentionNo() {
    return merchantIntentionNo;
  }


  public void setMerchantIntentionNo(String merchantIntentionNo) {
    this.merchantIntentionNo = merchantIntentionNo;
  }


  public BrandAdGetV30ResponseDataAdsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 广告计划名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandAdGetV30ResponseDataAdsInner promotions(List<BrandAdGetV30ResponseDataAdsInnerPromotionsInner> promotions) {
    
    this.promotions = promotions;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInner addPromotionsItem(BrandAdGetV30ResponseDataAdsInnerPromotionsInner promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

   /**
   * 政策信息
   * @return promotions
  **/
  @javax.annotation.Nullable
  public List<BrandAdGetV30ResponseDataAdsInnerPromotionsInner> getPromotions() {
    return promotions;
  }


  public void setPromotions(List<BrandAdGetV30ResponseDataAdsInnerPromotionsInner> promotions) {
    this.promotions = promotions;
  }


  public BrandAdGetV30ResponseDataAdsInner remark(String remark) {
    
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


  public BrandAdGetV30ResponseDataAdsInner scheduleInfo(BrandAdGetV30ResponseDataAdsInnerScheduleInfo scheduleInfo) {
    
    this.scheduleInfo = scheduleInfo;
    return this;
  }

   /**
   * Get scheduleInfo
   * @return scheduleInfo
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30ResponseDataAdsInnerScheduleInfo getScheduleInfo() {
    return scheduleInfo;
  }


  public void setScheduleInfo(BrandAdGetV30ResponseDataAdsInnerScheduleInfo scheduleInfo) {
    this.scheduleInfo = scheduleInfo;
  }


  public BrandAdGetV30ResponseDataAdsInner spuId(Long spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * 商品ID
   * @return spuId
  **/
  @javax.annotation.Nullable
  public Long getSpuId() {
    return spuId;
  }


  public void setSpuId(Long spuId) {
    this.spuId = spuId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInner brandAdGetV30ResponseDataAdsInner = (BrandAdGetV30ResponseDataAdsInner) o;
    return Objects.equals(this.adId, brandAdGetV30ResponseDataAdsInner.adId) &&
        Objects.equals(this.adStatus, brandAdGetV30ResponseDataAdsInner.adStatus) &&
        Objects.equals(this.adStockInfos, brandAdGetV30ResponseDataAdsInner.adStockInfos) &&
        Objects.equals(this.advertiserId, brandAdGetV30ResponseDataAdsInner.advertiserId) &&
        Objects.equals(this.audienceInfo, brandAdGetV30ResponseDataAdsInner.audienceInfo) &&
        Objects.equals(this.budgetInfo, brandAdGetV30ResponseDataAdsInner.budgetInfo) &&
        Objects.equals(this.budgetNo, brandAdGetV30ResponseDataAdsInner.budgetNo) &&
        Objects.equals(this.campaignId, brandAdGetV30ResponseDataAdsInner.campaignId) &&
        Objects.equals(this.classify, brandAdGetV30ResponseDataAdsInner.classify) &&
        Objects.equals(this.createTime, brandAdGetV30ResponseDataAdsInner.createTime) &&
        Objects.equals(this.enableMerchantIntention, brandAdGetV30ResponseDataAdsInner.enableMerchantIntention) &&
        Objects.equals(this.frequencyInfo, brandAdGetV30ResponseDataAdsInner.frequencyInfo) &&
        Objects.equals(this.landingType, brandAdGetV30ResponseDataAdsInner.landingType) &&
        Objects.equals(this.magazinePriceInfo, brandAdGetV30ResponseDataAdsInner.magazinePriceInfo) &&
        Objects.equals(this.merchantIntentionId, brandAdGetV30ResponseDataAdsInner.merchantIntentionId) &&
        Objects.equals(this.merchantIntentionName, brandAdGetV30ResponseDataAdsInner.merchantIntentionName) &&
        Objects.equals(this.merchantIntentionNo, brandAdGetV30ResponseDataAdsInner.merchantIntentionNo) &&
        Objects.equals(this.name, brandAdGetV30ResponseDataAdsInner.name) &&
        Objects.equals(this.promotions, brandAdGetV30ResponseDataAdsInner.promotions) &&
        Objects.equals(this.remark, brandAdGetV30ResponseDataAdsInner.remark) &&
        Objects.equals(this.scheduleInfo, brandAdGetV30ResponseDataAdsInner.scheduleInfo) &&
        Objects.equals(this.spuId, brandAdGetV30ResponseDataAdsInner.spuId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adStatus, adStockInfos, advertiserId, audienceInfo, budgetInfo, budgetNo, campaignId, classify, createTime, enableMerchantIntention, frequencyInfo, landingType, magazinePriceInfo, merchantIntentionId, merchantIntentionName, merchantIntentionNo, name, promotions, remark, scheduleInfo, spuId);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adStatus: ").append(toIndentedString(adStatus)).append("\n");
    sb.append("    adStockInfos: ").append(toIndentedString(adStockInfos)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audienceInfo: ").append(toIndentedString(audienceInfo)).append("\n");
    sb.append("    budgetInfo: ").append(toIndentedString(budgetInfo)).append("\n");
    sb.append("    budgetNo: ").append(toIndentedString(budgetNo)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    enableMerchantIntention: ").append(toIndentedString(enableMerchantIntention)).append("\n");
    sb.append("    frequencyInfo: ").append(toIndentedString(frequencyInfo)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    magazinePriceInfo: ").append(toIndentedString(magazinePriceInfo)).append("\n");
    sb.append("    merchantIntentionId: ").append(toIndentedString(merchantIntentionId)).append("\n");
    sb.append("    merchantIntentionName: ").append(toIndentedString(merchantIntentionName)).append("\n");
    sb.append("    merchantIntentionNo: ").append(toIndentedString(merchantIntentionNo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    scheduleInfo: ").append(toIndentedString(scheduleInfo)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
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
    openapiFields.add("ad_status");
    openapiFields.add("ad_stock_infos");
    openapiFields.add("advertiser_id");
    openapiFields.add("audience_info");
    openapiFields.add("budget_info");
    openapiFields.add("budget_no");
    openapiFields.add("campaign_id");
    openapiFields.add("classify");
    openapiFields.add("create_time");
    openapiFields.add("enable_merchant_intention");
    openapiFields.add("frequency_info");
    openapiFields.add("landing_type");
    openapiFields.add("magazine_price_info");
    openapiFields.add("merchant_intention_id");
    openapiFields.add("merchant_intention_name");
    openapiFields.add("merchant_intention_no");
    openapiFields.add("name");
    openapiFields.add("promotions");
    openapiFields.add("remark");
    openapiFields.add("schedule_info");
    openapiFields.add("spu_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInner>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInner
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInner
  */
  public static BrandAdGetV30ResponseDataAdsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInner.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

