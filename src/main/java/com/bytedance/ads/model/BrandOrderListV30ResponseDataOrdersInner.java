/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersAdForm;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersAppOrigin;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersAuditStatus;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersClassify;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersGdSendType;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersStatus;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersStockIncreasePackage;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerAdInfosInner;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerAudienceInfo;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerBudgetInfo;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerMagazinePriceInfo;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerPromptionsInner;
import com.bytedance.ads.model.BrandOrderListV30ResponseDataOrdersInnerScheduleInfo;
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
 * BrandOrderListV30ResponseDataOrdersInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class BrandOrderListV30ResponseDataOrdersInner {
  public static final String SERIALIZED_NAME_AD_FORM = "ad_form";
  @SerializedName(SERIALIZED_NAME_AD_FORM)
  private BrandOrderListV30DataOrdersAdForm adForm = null;

  public static final String SERIALIZED_NAME_AD_INFOS = "ad_infos";
  @SerializedName(SERIALIZED_NAME_AD_INFOS)
  private List<BrandOrderListV30ResponseDataOrdersInnerAdInfosInner> adInfos = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private List<BrandOrderListV30DataOrdersAppOrigin> appOrigin = null;

  public static final String SERIALIZED_NAME_AUDIENCE_INFO = "audience_info";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_INFO)
  private BrandOrderListV30ResponseDataOrdersInnerAudienceInfo audienceInfo = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private BrandOrderListV30DataOrdersAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_BUDGET_INFO = "budget_info";
  @SerializedName(SERIALIZED_NAME_BUDGET_INFO)
  private BrandOrderListV30ResponseDataOrdersInnerBudgetInfo budgetInfo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CLASSIFY = "classify";
  @SerializedName(SERIALIZED_NAME_CLASSIFY)
  private BrandOrderListV30DataOrdersClassify classify = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_FREQUENCY_INFO = "frequency_info";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_INFO)
  private BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo frequencyInfo = null;

  public static final String SERIALIZED_NAME_GD_SEND_TYPE = "gd_send_type";
  @SerializedName(SERIALIZED_NAME_GD_SEND_TYPE)
  private BrandOrderListV30DataOrdersGdSendType gdSendType = null;

  public static final String SERIALIZED_NAME_MAGAZINE_PRICE_INFO = "magazine_price_info";
  @SerializedName(SERIALIZED_NAME_MAGAZINE_PRICE_INFO)
  private BrandOrderListV30ResponseDataOrdersInnerMagazinePriceInfo magazinePriceInfo = null;

  public static final String SERIALIZED_NAME_MERCHANT_INTENTION_INFO = "merchant_intention_info";
  @SerializedName(SERIALIZED_NAME_MERCHANT_INTENTION_INFO)
  private BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo merchantIntentionInfo = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  private Long pricingType = null;

  public static final String SERIALIZED_NAME_PRO_TYPE = "pro_type";
  @SerializedName(SERIALIZED_NAME_PRO_TYPE)
  private Long proType = null;

  public static final String SERIALIZED_NAME_PROMPTIONS = "promptions";
  @SerializedName(SERIALIZED_NAME_PROMPTIONS)
  private List<BrandOrderListV30ResponseDataOrdersInnerPromptionsInner> promptions = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_SCHEDULE_INFO = "schedule_info";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_INFO)
  private BrandOrderListV30ResponseDataOrdersInnerScheduleInfo scheduleInfo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BrandOrderListV30DataOrdersStatus status = null;

  public static final String SERIALIZED_NAME_STOCK_INCREASE_PACKAGE = "stock_increase_package";
  @SerializedName(SERIALIZED_NAME_STOCK_INCREASE_PACKAGE)
  private BrandOrderListV30DataOrdersStockIncreasePackage stockIncreasePackage = null;

  public BrandOrderListV30ResponseDataOrdersInner() {
  }

  public BrandOrderListV30ResponseDataOrdersInner adForm(BrandOrderListV30DataOrdersAdForm adForm) {
    
    this.adForm = adForm;
    return this;
  }

   /**
   * Get adForm
   * @return adForm
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersAdForm getAdForm() {
    return adForm;
  }


  public void setAdForm(BrandOrderListV30DataOrdersAdForm adForm) {
    this.adForm = adForm;
  }


  public BrandOrderListV30ResponseDataOrdersInner adInfos(List<BrandOrderListV30ResponseDataOrdersInnerAdInfosInner> adInfos) {
    
    this.adInfos = adInfos;
    return this;
  }

  public BrandOrderListV30ResponseDataOrdersInner addAdInfosItem(BrandOrderListV30ResponseDataOrdersInnerAdInfosInner adInfosItem) {
    if (this.adInfos == null) {
      this.adInfos = new ArrayList<>();
    }
    this.adInfos.add(adInfosItem);
    return this;
  }

   /**
   * 计划信息
   * @return adInfos
  **/
  @javax.annotation.Nullable
  public List<BrandOrderListV30ResponseDataOrdersInnerAdInfosInner> getAdInfos() {
    return adInfos;
  }


  public void setAdInfos(List<BrandOrderListV30ResponseDataOrdersInnerAdInfosInner> adInfos) {
    this.adInfos = adInfos;
  }


  public BrandOrderListV30ResponseDataOrdersInner advertiserId(Long advertiserId) {
    
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


  public BrandOrderListV30ResponseDataOrdersInner appOrigin(List<BrandOrderListV30DataOrdersAppOrigin> appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

  public BrandOrderListV30ResponseDataOrdersInner addAppOriginItem(BrandOrderListV30DataOrdersAppOrigin appOriginItem) {
    if (this.appOrigin == null) {
      this.appOrigin = new ArrayList<>();
    }
    this.appOrigin.add(appOriginItem);
    return this;
  }

   /**
   * 端
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  public List<BrandOrderListV30DataOrdersAppOrigin> getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(List<BrandOrderListV30DataOrdersAppOrigin> appOrigin) {
    this.appOrigin = appOrigin;
  }


  public BrandOrderListV30ResponseDataOrdersInner audienceInfo(BrandOrderListV30ResponseDataOrdersInnerAudienceInfo audienceInfo) {
    
    this.audienceInfo = audienceInfo;
    return this;
  }

   /**
   * Get audienceInfo
   * @return audienceInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfo getAudienceInfo() {
    return audienceInfo;
  }


  public void setAudienceInfo(BrandOrderListV30ResponseDataOrdersInnerAudienceInfo audienceInfo) {
    this.audienceInfo = audienceInfo;
  }


  public BrandOrderListV30ResponseDataOrdersInner auditStatus(BrandOrderListV30DataOrdersAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(BrandOrderListV30DataOrdersAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public BrandOrderListV30ResponseDataOrdersInner budgetInfo(BrandOrderListV30ResponseDataOrdersInnerBudgetInfo budgetInfo) {
    
    this.budgetInfo = budgetInfo;
    return this;
  }

   /**
   * Get budgetInfo
   * @return budgetInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30ResponseDataOrdersInnerBudgetInfo getBudgetInfo() {
    return budgetInfo;
  }


  public void setBudgetInfo(BrandOrderListV30ResponseDataOrdersInnerBudgetInfo budgetInfo) {
    this.budgetInfo = budgetInfo;
  }


  public BrandOrderListV30ResponseDataOrdersInner campaignId(Long campaignId) {
    
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


  public BrandOrderListV30ResponseDataOrdersInner classify(BrandOrderListV30DataOrdersClassify classify) {
    
    this.classify = classify;
    return this;
  }

   /**
   * Get classify
   * @return classify
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersClassify getClassify() {
    return classify;
  }


  public void setClassify(BrandOrderListV30DataOrdersClassify classify) {
    this.classify = classify;
  }


  public BrandOrderListV30ResponseDataOrdersInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 预订单创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public BrandOrderListV30ResponseDataOrdersInner frequencyInfo(BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo frequencyInfo) {
    
    this.frequencyInfo = frequencyInfo;
    return this;
  }

   /**
   * Get frequencyInfo
   * @return frequencyInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo getFrequencyInfo() {
    return frequencyInfo;
  }


  public void setFrequencyInfo(BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo frequencyInfo) {
    this.frequencyInfo = frequencyInfo;
  }


  public BrandOrderListV30ResponseDataOrdersInner gdSendType(BrandOrderListV30DataOrdersGdSendType gdSendType) {
    
    this.gdSendType = gdSendType;
    return this;
  }

   /**
   * Get gdSendType
   * @return gdSendType
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersGdSendType getGdSendType() {
    return gdSendType;
  }


  public void setGdSendType(BrandOrderListV30DataOrdersGdSendType gdSendType) {
    this.gdSendType = gdSendType;
  }


  public BrandOrderListV30ResponseDataOrdersInner magazinePriceInfo(BrandOrderListV30ResponseDataOrdersInnerMagazinePriceInfo magazinePriceInfo) {
    
    this.magazinePriceInfo = magazinePriceInfo;
    return this;
  }

   /**
   * Get magazinePriceInfo
   * @return magazinePriceInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30ResponseDataOrdersInnerMagazinePriceInfo getMagazinePriceInfo() {
    return magazinePriceInfo;
  }


  public void setMagazinePriceInfo(BrandOrderListV30ResponseDataOrdersInnerMagazinePriceInfo magazinePriceInfo) {
    this.magazinePriceInfo = magazinePriceInfo;
  }


  public BrandOrderListV30ResponseDataOrdersInner merchantIntentionInfo(BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo merchantIntentionInfo) {
    
    this.merchantIntentionInfo = merchantIntentionInfo;
    return this;
  }

   /**
   * Get merchantIntentionInfo
   * @return merchantIntentionInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo getMerchantIntentionInfo() {
    return merchantIntentionInfo;
  }


  public void setMerchantIntentionInfo(BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo merchantIntentionInfo) {
    this.merchantIntentionInfo = merchantIntentionInfo;
  }


  public BrandOrderListV30ResponseDataOrdersInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 预订单名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandOrderListV30ResponseDataOrdersInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 预订单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public BrandOrderListV30ResponseDataOrdersInner pricingType(Long pricingType) {
    
    this.pricingType = pricingType;
    return this;
  }

   /**
   * 出价方式 3：CPT  6：GD
   * @return pricingType
  **/
  @javax.annotation.Nullable
  public Long getPricingType() {
    return pricingType;
  }


  public void setPricingType(Long pricingType) {
    this.pricingType = pricingType;
  }


  public BrandOrderListV30ResponseDataOrdersInner proType(Long proType) {
    
    this.proType = proType;
    return this;
  }

   /**
   * 产品类型
   * @return proType
  **/
  @javax.annotation.Nullable
  public Long getProType() {
    return proType;
  }


  public void setProType(Long proType) {
    this.proType = proType;
  }


  public BrandOrderListV30ResponseDataOrdersInner promptions(List<BrandOrderListV30ResponseDataOrdersInnerPromptionsInner> promptions) {
    
    this.promptions = promptions;
    return this;
  }

  public BrandOrderListV30ResponseDataOrdersInner addPromptionsItem(BrandOrderListV30ResponseDataOrdersInnerPromptionsInner promptionsItem) {
    if (this.promptions == null) {
      this.promptions = new ArrayList<>();
    }
    this.promptions.add(promptionsItem);
    return this;
  }

   /**
   * 政策
   * @return promptions
  **/
  @javax.annotation.Nullable
  public List<BrandOrderListV30ResponseDataOrdersInnerPromptionsInner> getPromptions() {
    return promptions;
  }


  public void setPromptions(List<BrandOrderListV30ResponseDataOrdersInnerPromptionsInner> promptions) {
    this.promptions = promptions;
  }


  public BrandOrderListV30ResponseDataOrdersInner remark(String remark) {
    
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


  public BrandOrderListV30ResponseDataOrdersInner scheduleInfo(BrandOrderListV30ResponseDataOrdersInnerScheduleInfo scheduleInfo) {
    
    this.scheduleInfo = scheduleInfo;
    return this;
  }

   /**
   * Get scheduleInfo
   * @return scheduleInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30ResponseDataOrdersInnerScheduleInfo getScheduleInfo() {
    return scheduleInfo;
  }


  public void setScheduleInfo(BrandOrderListV30ResponseDataOrdersInnerScheduleInfo scheduleInfo) {
    this.scheduleInfo = scheduleInfo;
  }


  public BrandOrderListV30ResponseDataOrdersInner status(BrandOrderListV30DataOrdersStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersStatus getStatus() {
    return status;
  }


  public void setStatus(BrandOrderListV30DataOrdersStatus status) {
    this.status = status;
  }


  public BrandOrderListV30ResponseDataOrdersInner stockIncreasePackage(BrandOrderListV30DataOrdersStockIncreasePackage stockIncreasePackage) {
    
    this.stockIncreasePackage = stockIncreasePackage;
    return this;
  }

   /**
   * Get stockIncreasePackage
   * @return stockIncreasePackage
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersStockIncreasePackage getStockIncreasePackage() {
    return stockIncreasePackage;
  }


  public void setStockIncreasePackage(BrandOrderListV30DataOrdersStockIncreasePackage stockIncreasePackage) {
    this.stockIncreasePackage = stockIncreasePackage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderListV30ResponseDataOrdersInner brandOrderListV30ResponseDataOrdersInner = (BrandOrderListV30ResponseDataOrdersInner) o;
    return Objects.equals(this.adForm, brandOrderListV30ResponseDataOrdersInner.adForm) &&
        Objects.equals(this.adInfos, brandOrderListV30ResponseDataOrdersInner.adInfos) &&
        Objects.equals(this.advertiserId, brandOrderListV30ResponseDataOrdersInner.advertiserId) &&
        Objects.equals(this.appOrigin, brandOrderListV30ResponseDataOrdersInner.appOrigin) &&
        Objects.equals(this.audienceInfo, brandOrderListV30ResponseDataOrdersInner.audienceInfo) &&
        Objects.equals(this.auditStatus, brandOrderListV30ResponseDataOrdersInner.auditStatus) &&
        Objects.equals(this.budgetInfo, brandOrderListV30ResponseDataOrdersInner.budgetInfo) &&
        Objects.equals(this.campaignId, brandOrderListV30ResponseDataOrdersInner.campaignId) &&
        Objects.equals(this.classify, brandOrderListV30ResponseDataOrdersInner.classify) &&
        Objects.equals(this.createTime, brandOrderListV30ResponseDataOrdersInner.createTime) &&
        Objects.equals(this.frequencyInfo, brandOrderListV30ResponseDataOrdersInner.frequencyInfo) &&
        Objects.equals(this.gdSendType, brandOrderListV30ResponseDataOrdersInner.gdSendType) &&
        Objects.equals(this.magazinePriceInfo, brandOrderListV30ResponseDataOrdersInner.magazinePriceInfo) &&
        Objects.equals(this.merchantIntentionInfo, brandOrderListV30ResponseDataOrdersInner.merchantIntentionInfo) &&
        Objects.equals(this.name, brandOrderListV30ResponseDataOrdersInner.name) &&
        Objects.equals(this.orderId, brandOrderListV30ResponseDataOrdersInner.orderId) &&
        Objects.equals(this.pricingType, brandOrderListV30ResponseDataOrdersInner.pricingType) &&
        Objects.equals(this.proType, brandOrderListV30ResponseDataOrdersInner.proType) &&
        Objects.equals(this.promptions, brandOrderListV30ResponseDataOrdersInner.promptions) &&
        Objects.equals(this.remark, brandOrderListV30ResponseDataOrdersInner.remark) &&
        Objects.equals(this.scheduleInfo, brandOrderListV30ResponseDataOrdersInner.scheduleInfo) &&
        Objects.equals(this.status, brandOrderListV30ResponseDataOrdersInner.status) &&
        Objects.equals(this.stockIncreasePackage, brandOrderListV30ResponseDataOrdersInner.stockIncreasePackage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adForm, adInfos, advertiserId, appOrigin, audienceInfo, auditStatus, budgetInfo, campaignId, classify, createTime, frequencyInfo, gdSendType, magazinePriceInfo, merchantIntentionInfo, name, orderId, pricingType, proType, promptions, remark, scheduleInfo, status, stockIncreasePackage);
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
    sb.append("class BrandOrderListV30ResponseDataOrdersInner {\n");
    sb.append("    adForm: ").append(toIndentedString(adForm)).append("\n");
    sb.append("    adInfos: ").append(toIndentedString(adInfos)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    audienceInfo: ").append(toIndentedString(audienceInfo)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    budgetInfo: ").append(toIndentedString(budgetInfo)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    frequencyInfo: ").append(toIndentedString(frequencyInfo)).append("\n");
    sb.append("    gdSendType: ").append(toIndentedString(gdSendType)).append("\n");
    sb.append("    magazinePriceInfo: ").append(toIndentedString(magazinePriceInfo)).append("\n");
    sb.append("    merchantIntentionInfo: ").append(toIndentedString(merchantIntentionInfo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    proType: ").append(toIndentedString(proType)).append("\n");
    sb.append("    promptions: ").append(toIndentedString(promptions)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    scheduleInfo: ").append(toIndentedString(scheduleInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stockIncreasePackage: ").append(toIndentedString(stockIncreasePackage)).append("\n");
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
    openapiFields.add("ad_infos");
    openapiFields.add("advertiser_id");
    openapiFields.add("app_origin");
    openapiFields.add("audience_info");
    openapiFields.add("audit_status");
    openapiFields.add("budget_info");
    openapiFields.add("campaign_id");
    openapiFields.add("classify");
    openapiFields.add("create_time");
    openapiFields.add("frequency_info");
    openapiFields.add("gd_send_type");
    openapiFields.add("magazine_price_info");
    openapiFields.add("merchant_intention_info");
    openapiFields.add("name");
    openapiFields.add("order_id");
    openapiFields.add("pricing_type");
    openapiFields.add("pro_type");
    openapiFields.add("promptions");
    openapiFields.add("remark");
    openapiFields.add("schedule_info");
    openapiFields.add("status");
    openapiFields.add("stock_increase_package");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderListV30ResponseDataOrdersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderListV30ResponseDataOrdersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderListV30ResponseDataOrdersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderListV30ResponseDataOrdersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderListV30ResponseDataOrdersInner>() {
           @Override
           public void write(JsonWriter out, BrandOrderListV30ResponseDataOrdersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderListV30ResponseDataOrdersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderListV30ResponseDataOrdersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderListV30ResponseDataOrdersInner
  * @throws IOException if the JSON string is invalid with respect to BrandOrderListV30ResponseDataOrdersInner
  */
  public static BrandOrderListV30ResponseDataOrdersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderListV30ResponseDataOrdersInner.class);
  }

 /**
  * Convert an instance of BrandOrderListV30ResponseDataOrdersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

