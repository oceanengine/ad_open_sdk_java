/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponCreateV2CouponResourceListCodeType;
import com.bytedance.ads.model.ClueCouponCreateV2CouponResourceListIndustryType;
import com.bytedance.ads.model.ClueCouponCreateV2CouponResourceListResourceType;
import com.bytedance.ads.model.ClueCouponCreateV2CouponResourceListUseType;
import com.bytedance.ads.model.ClueCouponCreateV2RequestCouponResourceListInnerGiftListInner;
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
 * ClueCouponCreateV2RequestCouponResourceListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ClueCouponCreateV2RequestCouponResourceListInner {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount = null;

  public static final String SERIALIZED_NAME_ANDROID_LINK = "android_link";
  @SerializedName(SERIALIZED_NAME_ANDROID_LINK)
  private String androidLink = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code = null;

  public static final String SERIALIZED_NAME_CODE_TYPE = "code_type";
  @SerializedName(SERIALIZED_NAME_CODE_TYPE)
  private ClueCouponCreateV2CouponResourceListCodeType codeType = null;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private String condition = null;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Long discount = null;

  public static final String SERIALIZED_NAME_GIFT_LIST = "gift_list";
  @SerializedName(SERIALIZED_NAME_GIFT_LIST)
  private List<ClueCouponCreateV2RequestCouponResourceListInnerGiftListInner> giftList = null;

  public static final String SERIALIZED_NAME_HEAD_IMAGE_URL = "head_image_url";
  @SerializedName(SERIALIZED_NAME_HEAD_IMAGE_URL)
  private String headImageUrl = null;

  public static final String SERIALIZED_NAME_INDUSTRY_TYPE = "industry_type";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_TYPE)
  private ClueCouponCreateV2CouponResourceListIndustryType industryType = null;

  public static final String SERIALIZED_NAME_IOS_LINK = "ios_link";
  @SerializedName(SERIALIZED_NAME_IOS_LINK)
  private String iosLink = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_LOGO_IMAGE_URL = "logo_image_url";
  @SerializedName(SERIALIZED_NAME_LOGO_IMAGE_URL)
  private String logoImageUrl = null;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "max_amount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private Long maxAmount = null;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName = null;

  public static final String SERIALIZED_NAME_MIN_AMOUNT = "min_amount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private Long minAmount = null;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private String notification = null;

  public static final String SERIALIZED_NAME_RELIEF_AMOUNT = "relief_amount";
  @SerializedName(SERIALIZED_NAME_RELIEF_AMOUNT)
  private Long reliefAmount = null;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ClueCouponCreateV2CouponResourceListResourceType resourceType = null;

  public static final String SERIALIZED_NAME_SERVICE_NUM = "service_num";
  @SerializedName(SERIALIZED_NAME_SERVICE_NUM)
  private String serviceNum = null;

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Long stock = null;

  public static final String SERIALIZED_NAME_STORE_IDS = "store_ids";
  @SerializedName(SERIALIZED_NAME_STORE_IDS)
  private List<Long> storeIds = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private ClueCouponCreateV2CouponResourceListUseType useType = null;

  public static final String SERIALIZED_NAME_VALID_DAYS = "valid_days";
  @SerializedName(SERIALIZED_NAME_VALID_DAYS)
  private Long validDays = null;

  public static final String SERIALIZED_NAME_VALID_END = "valid_end";
  @SerializedName(SERIALIZED_NAME_VALID_END)
  private String validEnd = null;

  public static final String SERIALIZED_NAME_VALID_START = "valid_start";
  @SerializedName(SERIALIZED_NAME_VALID_START)
  private String validStart = null;

  public ClueCouponCreateV2RequestCouponResourceListInner() {
  }

  public ClueCouponCreateV2RequestCouponResourceListInner amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nullable
  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner androidLink(String androidLink) {
    
    this.androidLink = androidLink;
    return this;
  }

   /**
   * 
   * @return androidLink
  **/
  @javax.annotation.Nullable
  public String getAndroidLink() {
    return androidLink;
  }


  public void setAndroidLink(String androidLink) {
    this.androidLink = androidLink;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner codeType(ClueCouponCreateV2CouponResourceListCodeType codeType) {
    
    this.codeType = codeType;
    return this;
  }

   /**
   * Get codeType
   * @return codeType
  **/
  @javax.annotation.Nonnull
  public ClueCouponCreateV2CouponResourceListCodeType getCodeType() {
    return codeType;
  }


  public void setCodeType(ClueCouponCreateV2CouponResourceListCodeType codeType) {
    this.codeType = codeType;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner condition(String condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * 
   * @return condition
  **/
  @javax.annotation.Nonnull
  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner discount(Long discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 99
   * @return discount
  **/
  @javax.annotation.Nullable
  public Long getDiscount() {
    return discount;
  }


  public void setDiscount(Long discount) {
    this.discount = discount;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner giftList(List<ClueCouponCreateV2RequestCouponResourceListInnerGiftListInner> giftList) {
    
    this.giftList = giftList;
    return this;
  }

  public ClueCouponCreateV2RequestCouponResourceListInner addGiftListItem(ClueCouponCreateV2RequestCouponResourceListInnerGiftListInner giftListItem) {
    if (this.giftList == null) {
      this.giftList = new ArrayList<>();
    }
    this.giftList.add(giftListItem);
    return this;
  }

   /**
   * 
   * @return giftList
  **/
  @javax.annotation.Nullable
  public List<ClueCouponCreateV2RequestCouponResourceListInnerGiftListInner> getGiftList() {
    return giftList;
  }


  public void setGiftList(List<ClueCouponCreateV2RequestCouponResourceListInnerGiftListInner> giftList) {
    this.giftList = giftList;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner headImageUrl(String headImageUrl) {
    
    this.headImageUrl = headImageUrl;
    return this;
  }

   /**
   * 
   * @return headImageUrl
  **/
  @javax.annotation.Nonnull
  public String getHeadImageUrl() {
    return headImageUrl;
  }


  public void setHeadImageUrl(String headImageUrl) {
    this.headImageUrl = headImageUrl;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner industryType(ClueCouponCreateV2CouponResourceListIndustryType industryType) {
    
    this.industryType = industryType;
    return this;
  }

   /**
   * Get industryType
   * @return industryType
  **/
  @javax.annotation.Nonnull
  public ClueCouponCreateV2CouponResourceListIndustryType getIndustryType() {
    return industryType;
  }


  public void setIndustryType(ClueCouponCreateV2CouponResourceListIndustryType industryType) {
    this.industryType = industryType;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner iosLink(String iosLink) {
    
    this.iosLink = iosLink;
    return this;
  }

   /**
   * 
   * @return iosLink
  **/
  @javax.annotation.Nullable
  public String getIosLink() {
    return iosLink;
  }


  public void setIosLink(String iosLink) {
    this.iosLink = iosLink;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 
   * @return link
  **/
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner logoImageUrl(String logoImageUrl) {
    
    this.logoImageUrl = logoImageUrl;
    return this;
  }

   /**
   * 
   * @return logoImageUrl
  **/
  @javax.annotation.Nonnull
  public String getLogoImageUrl() {
    return logoImageUrl;
  }


  public void setLogoImageUrl(String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner maxAmount(Long maxAmount) {
    
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 2147483647
   * @return maxAmount
  **/
  @javax.annotation.Nullable
  public Long getMaxAmount() {
    return maxAmount;
  }


  public void setMaxAmount(Long maxAmount) {
    this.maxAmount = maxAmount;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 
   * @return merchantName
  **/
  @javax.annotation.Nonnull
  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner minAmount(Long minAmount) {
    
    this.minAmount = minAmount;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 2147483647
   * @return minAmount
  **/
  @javax.annotation.Nullable
  public Long getMinAmount() {
    return minAmount;
  }


  public void setMinAmount(Long minAmount) {
    this.minAmount = minAmount;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner notification(String notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 
   * @return notification
  **/
  @javax.annotation.Nonnull
  public String getNotification() {
    return notification;
  }


  public void setNotification(String notification) {
    this.notification = notification;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner reliefAmount(Long reliefAmount) {
    
    this.reliefAmount = reliefAmount;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 2147483647
   * @return reliefAmount
  **/
  @javax.annotation.Nullable
  public Long getReliefAmount() {
    return reliefAmount;
  }


  public void setReliefAmount(Long reliefAmount) {
    this.reliefAmount = reliefAmount;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner resourceType(ClueCouponCreateV2CouponResourceListResourceType resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  public ClueCouponCreateV2CouponResourceListResourceType getResourceType() {
    return resourceType;
  }


  public void setResourceType(ClueCouponCreateV2CouponResourceListResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner serviceNum(String serviceNum) {
    
    this.serviceNum = serviceNum;
    return this;
  }

   /**
   * 
   * @return serviceNum
  **/
  @javax.annotation.Nonnull
  public String getServiceNum() {
    return serviceNum;
  }


  public void setServiceNum(String serviceNum) {
    this.serviceNum = serviceNum;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner stock(Long stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 2147483647
   * @return stock
  **/
  @javax.annotation.Nullable
  public Long getStock() {
    return stock;
  }


  public void setStock(Long stock) {
    this.stock = stock;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner storeIds(List<Long> storeIds) {
    
    this.storeIds = storeIds;
    return this;
  }

  public ClueCouponCreateV2RequestCouponResourceListInner addStoreIdsItem(Long storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * 
   * @return storeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getStoreIds() {
    return storeIds;
  }


  public void setStoreIds(List<Long> storeIds) {
    this.storeIds = storeIds;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner useType(ClueCouponCreateV2CouponResourceListUseType useType) {
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nonnull
  public ClueCouponCreateV2CouponResourceListUseType getUseType() {
    return useType;
  }


  public void setUseType(ClueCouponCreateV2CouponResourceListUseType useType) {
    this.useType = useType;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner validDays(Long validDays) {
    
    this.validDays = validDays;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 365
   * @return validDays
  **/
  @javax.annotation.Nullable
  public Long getValidDays() {
    return validDays;
  }


  public void setValidDays(Long validDays) {
    this.validDays = validDays;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner validEnd(String validEnd) {
    
    this.validEnd = validEnd;
    return this;
  }

   /**
   * 
   * @return validEnd
  **/
  @javax.annotation.Nullable
  public String getValidEnd() {
    return validEnd;
  }


  public void setValidEnd(String validEnd) {
    this.validEnd = validEnd;
  }


  public ClueCouponCreateV2RequestCouponResourceListInner validStart(String validStart) {
    
    this.validStart = validStart;
    return this;
  }

   /**
   * 
   * @return validStart
  **/
  @javax.annotation.Nullable
  public String getValidStart() {
    return validStart;
  }


  public void setValidStart(String validStart) {
    this.validStart = validStart;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponCreateV2RequestCouponResourceListInner clueCouponCreateV2RequestCouponResourceListInner = (ClueCouponCreateV2RequestCouponResourceListInner) o;
    return Objects.equals(this.amount, clueCouponCreateV2RequestCouponResourceListInner.amount) &&
        Objects.equals(this.androidLink, clueCouponCreateV2RequestCouponResourceListInner.androidLink) &&
        Objects.equals(this.code, clueCouponCreateV2RequestCouponResourceListInner.code) &&
        Objects.equals(this.codeType, clueCouponCreateV2RequestCouponResourceListInner.codeType) &&
        Objects.equals(this.condition, clueCouponCreateV2RequestCouponResourceListInner.condition) &&
        Objects.equals(this.discount, clueCouponCreateV2RequestCouponResourceListInner.discount) &&
        Objects.equals(this.giftList, clueCouponCreateV2RequestCouponResourceListInner.giftList) &&
        Objects.equals(this.headImageUrl, clueCouponCreateV2RequestCouponResourceListInner.headImageUrl) &&
        Objects.equals(this.industryType, clueCouponCreateV2RequestCouponResourceListInner.industryType) &&
        Objects.equals(this.iosLink, clueCouponCreateV2RequestCouponResourceListInner.iosLink) &&
        Objects.equals(this.link, clueCouponCreateV2RequestCouponResourceListInner.link) &&
        Objects.equals(this.logoImageUrl, clueCouponCreateV2RequestCouponResourceListInner.logoImageUrl) &&
        Objects.equals(this.maxAmount, clueCouponCreateV2RequestCouponResourceListInner.maxAmount) &&
        Objects.equals(this.merchantName, clueCouponCreateV2RequestCouponResourceListInner.merchantName) &&
        Objects.equals(this.minAmount, clueCouponCreateV2RequestCouponResourceListInner.minAmount) &&
        Objects.equals(this.notification, clueCouponCreateV2RequestCouponResourceListInner.notification) &&
        Objects.equals(this.reliefAmount, clueCouponCreateV2RequestCouponResourceListInner.reliefAmount) &&
        Objects.equals(this.resourceType, clueCouponCreateV2RequestCouponResourceListInner.resourceType) &&
        Objects.equals(this.serviceNum, clueCouponCreateV2RequestCouponResourceListInner.serviceNum) &&
        Objects.equals(this.stock, clueCouponCreateV2RequestCouponResourceListInner.stock) &&
        Objects.equals(this.storeIds, clueCouponCreateV2RequestCouponResourceListInner.storeIds) &&
        Objects.equals(this.title, clueCouponCreateV2RequestCouponResourceListInner.title) &&
        Objects.equals(this.useType, clueCouponCreateV2RequestCouponResourceListInner.useType) &&
        Objects.equals(this.validDays, clueCouponCreateV2RequestCouponResourceListInner.validDays) &&
        Objects.equals(this.validEnd, clueCouponCreateV2RequestCouponResourceListInner.validEnd) &&
        Objects.equals(this.validStart, clueCouponCreateV2RequestCouponResourceListInner.validStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, androidLink, code, codeType, condition, discount, giftList, headImageUrl, industryType, iosLink, link, logoImageUrl, maxAmount, merchantName, minAmount, notification, reliefAmount, resourceType, serviceNum, stock, storeIds, title, useType, validDays, validEnd, validStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponCreateV2RequestCouponResourceListInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    androidLink: ").append(toIndentedString(androidLink)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    giftList: ").append(toIndentedString(giftList)).append("\n");
    sb.append("    headImageUrl: ").append(toIndentedString(headImageUrl)).append("\n");
    sb.append("    industryType: ").append(toIndentedString(industryType)).append("\n");
    sb.append("    iosLink: ").append(toIndentedString(iosLink)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    logoImageUrl: ").append(toIndentedString(logoImageUrl)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    reliefAmount: ").append(toIndentedString(reliefAmount)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    serviceNum: ").append(toIndentedString(serviceNum)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    validDays: ").append(toIndentedString(validDays)).append("\n");
    sb.append("    validEnd: ").append(toIndentedString(validEnd)).append("\n");
    sb.append("    validStart: ").append(toIndentedString(validStart)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("android_link");
    openapiFields.add("code");
    openapiFields.add("code_type");
    openapiFields.add("condition");
    openapiFields.add("discount");
    openapiFields.add("gift_list");
    openapiFields.add("head_image_url");
    openapiFields.add("industry_type");
    openapiFields.add("ios_link");
    openapiFields.add("link");
    openapiFields.add("logo_image_url");
    openapiFields.add("max_amount");
    openapiFields.add("merchant_name");
    openapiFields.add("min_amount");
    openapiFields.add("notification");
    openapiFields.add("relief_amount");
    openapiFields.add("resource_type");
    openapiFields.add("service_num");
    openapiFields.add("stock");
    openapiFields.add("store_ids");
    openapiFields.add("title");
    openapiFields.add("use_type");
    openapiFields.add("valid_days");
    openapiFields.add("valid_end");
    openapiFields.add("valid_start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code_type");
    openapiRequiredFields.add("condition");
    openapiRequiredFields.add("head_image_url");
    openapiRequiredFields.add("industry_type");
    openapiRequiredFields.add("logo_image_url");
    openapiRequiredFields.add("merchant_name");
    openapiRequiredFields.add("notification");
    openapiRequiredFields.add("resource_type");
    openapiRequiredFields.add("service_num");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("use_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponCreateV2RequestCouponResourceListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponCreateV2RequestCouponResourceListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponCreateV2RequestCouponResourceListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponCreateV2RequestCouponResourceListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponCreateV2RequestCouponResourceListInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponCreateV2RequestCouponResourceListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponCreateV2RequestCouponResourceListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponCreateV2RequestCouponResourceListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponCreateV2RequestCouponResourceListInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponCreateV2RequestCouponResourceListInner
  */
  public static ClueCouponCreateV2RequestCouponResourceListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponCreateV2RequestCouponResourceListInner.class);
  }

 /**
  * Convert an instance of ClueCouponCreateV2RequestCouponResourceListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

