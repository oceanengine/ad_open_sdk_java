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
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoAdSyncConf;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoComponentInfo;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfoDemandRequirement;
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
 * 需求信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarDemandCreateAssignV2RequestDemandInfo {
  public static final String SERIALIZED_NAME_ACCEPT_EXPIRATION_DAY = "accept_expiration_day";
  @SerializedName(SERIALIZED_NAME_ACCEPT_EXPIRATION_DAY)
  private Long acceptExpirationDay = null;

  public static final String SERIALIZED_NAME_AD_SYNC_CONF = "ad_sync_conf";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_CONF)
  private StarDemandCreateAssignV2RequestDemandInfoAdSyncConf adSyncConf = null;

  public static final String SERIALIZED_NAME_ATTACHMENT_TEXT = "attachment_text";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TEXT)
  private String attachmentText = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL = "component_click_monitor_url";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL)
  private String componentClickMonitorUrl = null;

  public static final String SERIALIZED_NAME_COMPONENT_INFO = "component_info";
  @SerializedName(SERIALIZED_NAME_COMPONENT_INFO)
  private StarDemandCreateAssignV2RequestDemandInfoComponentInfo componentInfo = null;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName = null;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_DEMAND_REQUIREMENT = "demand_requirement";
  @SerializedName(SERIALIZED_NAME_DEMAND_REQUIREMENT)
  private StarDemandCreateAssignV2RequestDemandInfoDemandRequirement demandRequirement = null;

  public static final String SERIALIZED_NAME_EXPECT_REMAIN_TIME = "expect_remain_time";
  @SerializedName(SERIALIZED_NAME_EXPECT_REMAIN_TIME)
  private Long expectRemainTime = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expiration_time";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private Long expirationTime = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_END = "expiration_time_end";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_END)
  private Long expirationTimeEnd = null;

  public static final String SERIALIZED_NAME_IGNORE_SCRIPT = "ignore_script";
  @SerializedName(SERIALIZED_NAME_IGNORE_SCRIPT)
  private Long ignoreScript = null;

  public static final String SERIALIZED_NAME_IP_ACT_ID = "ip_act_id";
  @SerializedName(SERIALIZED_NAME_IP_ACT_ID)
  private Long ipActId = null;

  public static final String SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL = "item_show_monitor_url";
  @SerializedName(SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL)
  private String itemShowMonitorUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORY = "product_category";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORY)
  private List<String> productCategory = null;

  public static final String SERIALIZED_NAME_PRODUCT_INDUSTRY = "product_industry";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INDUSTRY)
  private List<String> productIndustry = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFORMATION = "product_information";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFORMATION)
  private String productInformation = null;

  public static final String SERIALIZED_NAME_PRODUCT_LINK = "product_link";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINK)
  private String productLink = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_XINGZHITOU_PRE_AUDIT = "xingzhitou_pre_audit";
  @SerializedName(SERIALIZED_NAME_XINGZHITOU_PRE_AUDIT)
  private Integer xingzhitouPreAudit = null;

  public static final String SERIALIZED_NAME_YUNTU_INDUSTRY_IDS = "yuntu_industry_ids";
  @SerializedName(SERIALIZED_NAME_YUNTU_INDUSTRY_IDS)
  private List<Long> yuntuIndustryIds = null;

  public static final String SERIALIZED_NAME_YUNTU_MAIN_BRAND = "yuntu_main_brand";
  @SerializedName(SERIALIZED_NAME_YUNTU_MAIN_BRAND)
  private Long yuntuMainBrand = null;

  public StarDemandCreateAssignV2RequestDemandInfo() {
  }

  public StarDemandCreateAssignV2RequestDemandInfo acceptExpirationDay(Long acceptExpirationDay) {
    
    this.acceptExpirationDay = acceptExpirationDay;
    return this;
  }

   /**
   * 接收任务超时时间（天，1≤x≤365）
   * @return acceptExpirationDay
  **/
  @javax.annotation.Nullable
  public Long getAcceptExpirationDay() {
    return acceptExpirationDay;
  }


  public void setAcceptExpirationDay(Long acceptExpirationDay) {
    this.acceptExpirationDay = acceptExpirationDay;
  }


  public StarDemandCreateAssignV2RequestDemandInfo adSyncConf(StarDemandCreateAssignV2RequestDemandInfoAdSyncConf adSyncConf) {
    
    this.adSyncConf = adSyncConf;
    return this;
  }

   /**
   * Get adSyncConf
   * @return adSyncConf
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConf getAdSyncConf() {
    return adSyncConf;
  }


  public void setAdSyncConf(StarDemandCreateAssignV2RequestDemandInfoAdSyncConf adSyncConf) {
    this.adSyncConf = adSyncConf;
  }


  public StarDemandCreateAssignV2RequestDemandInfo attachmentText(String attachmentText) {
    
    this.attachmentText = attachmentText;
    return this;
  }

   /**
   * 附件描述（可包含网盘链接，建议用此项）
   * @return attachmentText
  **/
  @javax.annotation.Nullable
  public String getAttachmentText() {
    return attachmentText;
  }


  public void setAttachmentText(String attachmentText) {
    this.attachmentText = attachmentText;
  }


  public StarDemandCreateAssignV2RequestDemandInfo attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public StarDemandCreateAssignV2RequestDemandInfo addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 附件 通过上传材料接口上传的文件名列表
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public StarDemandCreateAssignV2RequestDemandInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名称(50字内)
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public StarDemandCreateAssignV2RequestDemandInfo componentClickMonitorUrl(String componentClickMonitorUrl) {
    
    this.componentClickMonitorUrl = componentClickMonitorUrl;
    return this;
  }

   /**
   * 组件点击监测链接 https开头的URL
   * @return componentClickMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getComponentClickMonitorUrl() {
    return componentClickMonitorUrl;
  }


  public void setComponentClickMonitorUrl(String componentClickMonitorUrl) {
    this.componentClickMonitorUrl = componentClickMonitorUrl;
  }


  public StarDemandCreateAssignV2RequestDemandInfo componentInfo(StarDemandCreateAssignV2RequestDemandInfoComponentInfo componentInfo) {
    
    this.componentInfo = componentInfo;
    return this;
  }

   /**
   * Get componentInfo
   * @return componentInfo
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoComponentInfo getComponentInfo() {
    return componentInfo;
  }


  public void setComponentInfo(StarDemandCreateAssignV2RequestDemandInfoComponentInfo componentInfo) {
    this.componentInfo = componentInfo;
  }


  public StarDemandCreateAssignV2RequestDemandInfo contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 联系人姓名
   * @return contactName
  **/
  @javax.annotation.Nullable
  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public StarDemandCreateAssignV2RequestDemandInfo contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 联系人电话
   * @return contactPhone
  **/
  @javax.annotation.Nullable
  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public StarDemandCreateAssignV2RequestDemandInfo demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 需求名称（任务名称60字内）
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarDemandCreateAssignV2RequestDemandInfo demandRequirement(StarDemandCreateAssignV2RequestDemandInfoDemandRequirement demandRequirement) {
    
    this.demandRequirement = demandRequirement;
    return this;
  }

   /**
   * Get demandRequirement
   * @return demandRequirement
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement getDemandRequirement() {
    return demandRequirement;
  }


  public void setDemandRequirement(StarDemandCreateAssignV2RequestDemandInfoDemandRequirement demandRequirement) {
    this.demandRequirement = demandRequirement;
  }


  public StarDemandCreateAssignV2RequestDemandInfo expectRemainTime(Long expectRemainTime) {
    
    this.expectRemainTime = expectRemainTime;
    return this;
  }

   /**
   * 期望（视频）保留时间（天） 0&lt;x≤365整数
   * @return expectRemainTime
  **/
  @javax.annotation.Nullable
  public Long getExpectRemainTime() {
    return expectRemainTime;
  }


  public void setExpectRemainTime(Long expectRemainTime) {
    this.expectRemainTime = expectRemainTime;
  }


  public StarDemandCreateAssignV2RequestDemandInfo expirationTime(Long expirationTime) {
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * 期望发布时间
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  public Long getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
  }


  public StarDemandCreateAssignV2RequestDemandInfo expirationTimeEnd(Long expirationTimeEnd) {
    
    this.expirationTimeEnd = expirationTimeEnd;
    return this;
  }

   /**
   * 期望最迟发布时间 unix timestamp，发布时间范围长度不可超过30天
   * @return expirationTimeEnd
  **/
  @javax.annotation.Nullable
  public Long getExpirationTimeEnd() {
    return expirationTimeEnd;
  }


  public void setExpirationTimeEnd(Long expirationTimeEnd) {
    this.expirationTimeEnd = expirationTimeEnd;
  }


  public StarDemandCreateAssignV2RequestDemandInfo ignoreScript(Long ignoreScript) {
    
    this.ignoreScript = ignoreScript;
    return this;
  }

   /**
   * 是否跳过脚本环节 (0)或不传：不跳过，(1)：跳过
   * @return ignoreScript
  **/
  @javax.annotation.Nullable
  public Long getIgnoreScript() {
    return ignoreScript;
  }


  public void setIgnoreScript(Long ignoreScript) {
    this.ignoreScript = ignoreScript;
  }


  public StarDemandCreateAssignV2RequestDemandInfo ipActId(Long ipActId) {
    
    this.ipActId = ipActId;
    return this;
  }

   /**
   * ip活动ID
   * @return ipActId
  **/
  @javax.annotation.Nullable
  public Long getIpActId() {
    return ipActId;
  }


  public void setIpActId(Long ipActId) {
    this.ipActId = ipActId;
  }


  public StarDemandCreateAssignV2RequestDemandInfo itemShowMonitorUrl(String itemShowMonitorUrl) {
    
    this.itemShowMonitorUrl = itemShowMonitorUrl;
    return this;
  }

   /**
   * 视频曝光监测链接 https开头的URL
   * @return itemShowMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getItemShowMonitorUrl() {
    return itemShowMonitorUrl;
  }


  public void setItemShowMonitorUrl(String itemShowMonitorUrl) {
    this.itemShowMonitorUrl = itemShowMonitorUrl;
  }


  public StarDemandCreateAssignV2RequestDemandInfo productCategory(List<String> productCategory) {
    
    this.productCategory = productCategory;
    return this;
  }

  public StarDemandCreateAssignV2RequestDemandInfo addProductCategoryItem(String productCategoryItem) {
    if (this.productCategory == null) {
      this.productCategory = new ArrayList<>();
    }
    this.productCategory.add(productCategoryItem);
    return this;
  }

   /**
   * 所属类目
   * @return productCategory
  **/
  @javax.annotation.Nullable
  public List<String> getProductCategory() {
    return productCategory;
  }


  public void setProductCategory(List<String> productCategory) {
    this.productCategory = productCategory;
  }


  public StarDemandCreateAssignV2RequestDemandInfo productIndustry(List<String> productIndustry) {
    
    this.productIndustry = productIndustry;
    return this;
  }

  public StarDemandCreateAssignV2RequestDemandInfo addProductIndustryItem(String productIndustryItem) {
    if (this.productIndustry == null) {
      this.productIndustry = new ArrayList<>();
    }
    this.productIndustry.add(productIndustryItem);
    return this;
  }

   /**
   * 产品所属行业 [一级行业, 二级行业]
   * @return productIndustry
  **/
  @javax.annotation.Nullable
  public List<String> getProductIndustry() {
    return productIndustry;
  }


  public void setProductIndustry(List<String> productIndustry) {
    this.productIndustry = productIndustry;
  }


  public StarDemandCreateAssignV2RequestDemandInfo productInformation(String productInformation) {
    
    this.productInformation = productInformation;
    return this;
  }

   /**
   * 产品介绍(500字内)
   * @return productInformation
  **/
  @javax.annotation.Nullable
  public String getProductInformation() {
    return productInformation;
  }


  public void setProductInformation(String productInformation) {
    this.productInformation = productInformation;
  }


  public StarDemandCreateAssignV2RequestDemandInfo productLink(String productLink) {
    
    this.productLink = productLink;
    return this;
  }

   /**
   * 商品链接
   * @return productLink
  **/
  @javax.annotation.Nullable
  public String getProductLink() {
    return productLink;
  }


  public void setProductLink(String productLink) {
    this.productLink = productLink;
  }


  public StarDemandCreateAssignV2RequestDemandInfo productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 产品名称(40字内)
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public StarDemandCreateAssignV2RequestDemandInfo projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public StarDemandCreateAssignV2RequestDemandInfo xingzhitouPreAudit(Integer xingzhitouPreAudit) {
    
    this.xingzhitouPreAudit = xingzhitouPreAudit;
    return this;
  }

   /**
   * 星智投预审，0或不传为不开启，1为开启
   * @return xingzhitouPreAudit
  **/
  @javax.annotation.Nullable
  public Integer getXingzhitouPreAudit() {
    return xingzhitouPreAudit;
  }


  public void setXingzhitouPreAudit(Integer xingzhitouPreAudit) {
    this.xingzhitouPreAudit = xingzhitouPreAudit;
  }


  public StarDemandCreateAssignV2RequestDemandInfo yuntuIndustryIds(List<Long> yuntuIndustryIds) {
    
    this.yuntuIndustryIds = yuntuIndustryIds;
    return this;
  }

  public StarDemandCreateAssignV2RequestDemandInfo addYuntuIndustryIdsItem(Long yuntuIndustryIdsItem) {
    if (this.yuntuIndustryIds == null) {
      this.yuntuIndustryIds = new ArrayList<>();
    }
    this.yuntuIndustryIds.add(yuntuIndustryIdsItem);
    return this;
  }

   /**
   * 云图行业ID，目前仅支持填一个
   * @return yuntuIndustryIds
  **/
  @javax.annotation.Nullable
  public List<Long> getYuntuIndustryIds() {
    return yuntuIndustryIds;
  }


  public void setYuntuIndustryIds(List<Long> yuntuIndustryIds) {
    this.yuntuIndustryIds = yuntuIndustryIds;
  }


  public StarDemandCreateAssignV2RequestDemandInfo yuntuMainBrand(Long yuntuMainBrand) {
    
    this.yuntuMainBrand = yuntuMainBrand;
    return this;
  }

   /**
   * 品牌列表接口中返回的云图品牌ID
   * @return yuntuMainBrand
  **/
  @javax.annotation.Nullable
  public Long getYuntuMainBrand() {
    return yuntuMainBrand;
  }


  public void setYuntuMainBrand(Long yuntuMainBrand) {
    this.yuntuMainBrand = yuntuMainBrand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2RequestDemandInfo starDemandCreateAssignV2RequestDemandInfo = (StarDemandCreateAssignV2RequestDemandInfo) o;
    return Objects.equals(this.acceptExpirationDay, starDemandCreateAssignV2RequestDemandInfo.acceptExpirationDay) &&
        Objects.equals(this.adSyncConf, starDemandCreateAssignV2RequestDemandInfo.adSyncConf) &&
        Objects.equals(this.attachmentText, starDemandCreateAssignV2RequestDemandInfo.attachmentText) &&
        Objects.equals(this.attachments, starDemandCreateAssignV2RequestDemandInfo.attachments) &&
        Objects.equals(this.brandName, starDemandCreateAssignV2RequestDemandInfo.brandName) &&
        Objects.equals(this.componentClickMonitorUrl, starDemandCreateAssignV2RequestDemandInfo.componentClickMonitorUrl) &&
        Objects.equals(this.componentInfo, starDemandCreateAssignV2RequestDemandInfo.componentInfo) &&
        Objects.equals(this.contactName, starDemandCreateAssignV2RequestDemandInfo.contactName) &&
        Objects.equals(this.contactPhone, starDemandCreateAssignV2RequestDemandInfo.contactPhone) &&
        Objects.equals(this.demandName, starDemandCreateAssignV2RequestDemandInfo.demandName) &&
        Objects.equals(this.demandRequirement, starDemandCreateAssignV2RequestDemandInfo.demandRequirement) &&
        Objects.equals(this.expectRemainTime, starDemandCreateAssignV2RequestDemandInfo.expectRemainTime) &&
        Objects.equals(this.expirationTime, starDemandCreateAssignV2RequestDemandInfo.expirationTime) &&
        Objects.equals(this.expirationTimeEnd, starDemandCreateAssignV2RequestDemandInfo.expirationTimeEnd) &&
        Objects.equals(this.ignoreScript, starDemandCreateAssignV2RequestDemandInfo.ignoreScript) &&
        Objects.equals(this.ipActId, starDemandCreateAssignV2RequestDemandInfo.ipActId) &&
        Objects.equals(this.itemShowMonitorUrl, starDemandCreateAssignV2RequestDemandInfo.itemShowMonitorUrl) &&
        Objects.equals(this.productCategory, starDemandCreateAssignV2RequestDemandInfo.productCategory) &&
        Objects.equals(this.productIndustry, starDemandCreateAssignV2RequestDemandInfo.productIndustry) &&
        Objects.equals(this.productInformation, starDemandCreateAssignV2RequestDemandInfo.productInformation) &&
        Objects.equals(this.productLink, starDemandCreateAssignV2RequestDemandInfo.productLink) &&
        Objects.equals(this.productName, starDemandCreateAssignV2RequestDemandInfo.productName) &&
        Objects.equals(this.projectId, starDemandCreateAssignV2RequestDemandInfo.projectId) &&
        Objects.equals(this.xingzhitouPreAudit, starDemandCreateAssignV2RequestDemandInfo.xingzhitouPreAudit) &&
        Objects.equals(this.yuntuIndustryIds, starDemandCreateAssignV2RequestDemandInfo.yuntuIndustryIds) &&
        Objects.equals(this.yuntuMainBrand, starDemandCreateAssignV2RequestDemandInfo.yuntuMainBrand);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptExpirationDay, adSyncConf, attachmentText, attachments, brandName, componentClickMonitorUrl, componentInfo, contactName, contactPhone, demandName, demandRequirement, expectRemainTime, expirationTime, expirationTimeEnd, ignoreScript, ipActId, itemShowMonitorUrl, productCategory, productIndustry, productInformation, productLink, productName, projectId, xingzhitouPreAudit, yuntuIndustryIds, yuntuMainBrand);
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
    sb.append("class StarDemandCreateAssignV2RequestDemandInfo {\n");
    sb.append("    acceptExpirationDay: ").append(toIndentedString(acceptExpirationDay)).append("\n");
    sb.append("    adSyncConf: ").append(toIndentedString(adSyncConf)).append("\n");
    sb.append("    attachmentText: ").append(toIndentedString(attachmentText)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    componentClickMonitorUrl: ").append(toIndentedString(componentClickMonitorUrl)).append("\n");
    sb.append("    componentInfo: ").append(toIndentedString(componentInfo)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    demandRequirement: ").append(toIndentedString(demandRequirement)).append("\n");
    sb.append("    expectRemainTime: ").append(toIndentedString(expectRemainTime)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    expirationTimeEnd: ").append(toIndentedString(expirationTimeEnd)).append("\n");
    sb.append("    ignoreScript: ").append(toIndentedString(ignoreScript)).append("\n");
    sb.append("    ipActId: ").append(toIndentedString(ipActId)).append("\n");
    sb.append("    itemShowMonitorUrl: ").append(toIndentedString(itemShowMonitorUrl)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productIndustry: ").append(toIndentedString(productIndustry)).append("\n");
    sb.append("    productInformation: ").append(toIndentedString(productInformation)).append("\n");
    sb.append("    productLink: ").append(toIndentedString(productLink)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    xingzhitouPreAudit: ").append(toIndentedString(xingzhitouPreAudit)).append("\n");
    sb.append("    yuntuIndustryIds: ").append(toIndentedString(yuntuIndustryIds)).append("\n");
    sb.append("    yuntuMainBrand: ").append(toIndentedString(yuntuMainBrand)).append("\n");
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
    openapiFields.add("accept_expiration_day");
    openapiFields.add("ad_sync_conf");
    openapiFields.add("attachment_text");
    openapiFields.add("attachments");
    openapiFields.add("brand_name");
    openapiFields.add("component_click_monitor_url");
    openapiFields.add("component_info");
    openapiFields.add("contact_name");
    openapiFields.add("contact_phone");
    openapiFields.add("demand_name");
    openapiFields.add("demand_requirement");
    openapiFields.add("expect_remain_time");
    openapiFields.add("expiration_time");
    openapiFields.add("expiration_time_end");
    openapiFields.add("ignore_script");
    openapiFields.add("ip_act_id");
    openapiFields.add("item_show_monitor_url");
    openapiFields.add("product_category");
    openapiFields.add("product_industry");
    openapiFields.add("product_information");
    openapiFields.add("product_link");
    openapiFields.add("product_name");
    openapiFields.add("project_id");
    openapiFields.add("xingzhitou_pre_audit");
    openapiFields.add("yuntu_industry_ids");
    openapiFields.add("yuntu_main_brand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brand_name");
    openapiRequiredFields.add("contact_name");
    openapiRequiredFields.add("contact_phone");
    openapiRequiredFields.add("demand_name");
    openapiRequiredFields.add("demand_requirement");
    openapiRequiredFields.add("expect_remain_time");
    openapiRequiredFields.add("expiration_time");
    openapiRequiredFields.add("expiration_time_end");
    openapiRequiredFields.add("product_industry");
    openapiRequiredFields.add("product_information");
    openapiRequiredFields.add("product_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2RequestDemandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2RequestDemandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2RequestDemandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2RequestDemandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2RequestDemandInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2RequestDemandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2RequestDemandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2RequestDemandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2RequestDemandInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2RequestDemandInfo
  */
  public static StarDemandCreateAssignV2RequestDemandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2RequestDemandInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2RequestDemandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

