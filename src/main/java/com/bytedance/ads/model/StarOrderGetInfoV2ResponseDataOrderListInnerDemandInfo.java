/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo {
  public static final String SERIALIZED_NAME_ACCEPT_EXPIRATION_DAY = "accept_expiration_day";
  @SerializedName(SERIALIZED_NAME_ACCEPT_EXPIRATION_DAY)
  private Long acceptExpirationDay = null;

  public static final String SERIALIZED_NAME_AD_SYNC_CONF = "ad_sync_conf";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_CONF)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf adSyncConf = null;

  public static final String SERIALIZED_NAME_ATTACHMENT_TEXT = "attachment_text";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TEXT)
  private String attachmentText = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_COMPONENT_INFO = "component_info";
  @SerializedName(SERIALIZED_NAME_COMPONENT_INFO)
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo componentInfo = null;

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
  private StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement demandRequirement = null;

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
  private Long xingzhitouPreAudit = null;

  public static final String SERIALIZED_NAME_YUNTU_INDUSTRY_IDS = "yuntu_industry_ids";
  @SerializedName(SERIALIZED_NAME_YUNTU_INDUSTRY_IDS)
  private List<Long> yuntuIndustryIds = null;

  public static final String SERIALIZED_NAME_YUNTU_MAIN_BRAND = "yuntu_main_brand";
  @SerializedName(SERIALIZED_NAME_YUNTU_MAIN_BRAND)
  private Long yuntuMainBrand = null;

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo acceptExpirationDay(Long acceptExpirationDay) {
    
    this.acceptExpirationDay = acceptExpirationDay;
    return this;
  }

   /**
   * 接收任务超时时间
   * @return acceptExpirationDay
  **/
  @javax.annotation.Nullable
  public Long getAcceptExpirationDay() {
    return acceptExpirationDay;
  }


  public void setAcceptExpirationDay(Long acceptExpirationDay) {
    this.acceptExpirationDay = acceptExpirationDay;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo adSyncConf(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf adSyncConf) {
    
    this.adSyncConf = adSyncConf;
    return this;
  }

   /**
   * Get adSyncConf
   * @return adSyncConf
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf getAdSyncConf() {
    return adSyncConf;
  }


  public void setAdSyncConf(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoAdSyncConf adSyncConf) {
    this.adSyncConf = adSyncConf;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo attachmentText(String attachmentText) {
    
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


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 附件
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名称
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo componentInfo(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo componentInfo) {
    
    this.componentInfo = componentInfo;
    return this;
  }

   /**
   * Get componentInfo
   * @return componentInfo
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo getComponentInfo() {
    return componentInfo;
  }


  public void setComponentInfo(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoComponentInfo componentInfo) {
    this.componentInfo = componentInfo;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo contactName(String contactName) {
    
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


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo contactPhone(String contactPhone) {
    
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


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 需求名称（任务名称）
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo demandRequirement(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement demandRequirement) {
    
    this.demandRequirement = demandRequirement;
    return this;
  }

   /**
   * Get demandRequirement
   * @return demandRequirement
  **/
  @javax.annotation.Nullable
  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement getDemandRequirement() {
    return demandRequirement;
  }


  public void setDemandRequirement(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement demandRequirement) {
    this.demandRequirement = demandRequirement;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo expectRemainTime(Long expectRemainTime) {
    
    this.expectRemainTime = expectRemainTime;
    return this;
  }

   /**
   * 期望（视频）保留时间（天）
   * @return expectRemainTime
  **/
  @javax.annotation.Nullable
  public Long getExpectRemainTime() {
    return expectRemainTime;
  }


  public void setExpectRemainTime(Long expectRemainTime) {
    this.expectRemainTime = expectRemainTime;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo expirationTime(Long expirationTime) {
    
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


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo expirationTimeEnd(Long expirationTimeEnd) {
    
    this.expirationTimeEnd = expirationTimeEnd;
    return this;
  }

   /**
   * 期望最迟发布时间
   * @return expirationTimeEnd
  **/
  @javax.annotation.Nullable
  public Long getExpirationTimeEnd() {
    return expirationTimeEnd;
  }


  public void setExpirationTimeEnd(Long expirationTimeEnd) {
    this.expirationTimeEnd = expirationTimeEnd;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo ignoreScript(Long ignoreScript) {
    
    this.ignoreScript = ignoreScript;
    return this;
  }

   /**
   * 是否跳过脚本环节
   * @return ignoreScript
  **/
  @javax.annotation.Nullable
  public Long getIgnoreScript() {
    return ignoreScript;
  }


  public void setIgnoreScript(Long ignoreScript) {
    this.ignoreScript = ignoreScript;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo ipActId(Long ipActId) {
    
    this.ipActId = ipActId;
    return this;
  }

   /**
   * IP活动id
   * @return ipActId
  **/
  @javax.annotation.Nullable
  public Long getIpActId() {
    return ipActId;
  }


  public void setIpActId(Long ipActId) {
    this.ipActId = ipActId;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo productIndustry(List<String> productIndustry) {
    
    this.productIndustry = productIndustry;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo addProductIndustryItem(String productIndustryItem) {
    if (this.productIndustry == null) {
      this.productIndustry = new ArrayList<>();
    }
    this.productIndustry.add(productIndustryItem);
    return this;
  }

   /**
   * 产品所属行业
   * @return productIndustry
  **/
  @javax.annotation.Nullable
  public List<String> getProductIndustry() {
    return productIndustry;
  }


  public void setProductIndustry(List<String> productIndustry) {
    this.productIndustry = productIndustry;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo productInformation(String productInformation) {
    
    this.productInformation = productInformation;
    return this;
  }

   /**
   * 产品介绍
   * @return productInformation
  **/
  @javax.annotation.Nullable
  public String getProductInformation() {
    return productInformation;
  }


  public void setProductInformation(String productInformation) {
    this.productInformation = productInformation;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo productLink(String productLink) {
    
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


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 产品名称
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo projectId(Long projectId) {
    
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


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo xingzhitouPreAudit(Long xingzhitouPreAudit) {
    
    this.xingzhitouPreAudit = xingzhitouPreAudit;
    return this;
  }

   /**
   * 星智投预审开关
   * @return xingzhitouPreAudit
  **/
  @javax.annotation.Nullable
  public Long getXingzhitouPreAudit() {
    return xingzhitouPreAudit;
  }


  public void setXingzhitouPreAudit(Long xingzhitouPreAudit) {
    this.xingzhitouPreAudit = xingzhitouPreAudit;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo yuntuIndustryIds(List<Long> yuntuIndustryIds) {
    
    this.yuntuIndustryIds = yuntuIndustryIds;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo addYuntuIndustryIdsItem(Long yuntuIndustryIdsItem) {
    if (this.yuntuIndustryIds == null) {
      this.yuntuIndustryIds = new ArrayList<>();
    }
    this.yuntuIndustryIds.add(yuntuIndustryIdsItem);
    return this;
  }

   /**
   * 云图行业ID
   * @return yuntuIndustryIds
  **/
  @javax.annotation.Nullable
  public List<Long> getYuntuIndustryIds() {
    return yuntuIndustryIds;
  }


  public void setYuntuIndustryIds(List<Long> yuntuIndustryIds) {
    this.yuntuIndustryIds = yuntuIndustryIds;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo yuntuMainBrand(Long yuntuMainBrand) {
    
    this.yuntuMainBrand = yuntuMainBrand;
    return this;
  }

   /**
   * 云图品牌ID
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
    StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo = (StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo) o;
    return Objects.equals(this.acceptExpirationDay, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.acceptExpirationDay) &&
        Objects.equals(this.adSyncConf, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.adSyncConf) &&
        Objects.equals(this.attachmentText, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.attachmentText) &&
        Objects.equals(this.attachments, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.attachments) &&
        Objects.equals(this.brandName, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.brandName) &&
        Objects.equals(this.componentInfo, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.componentInfo) &&
        Objects.equals(this.contactName, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.contactName) &&
        Objects.equals(this.contactPhone, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.contactPhone) &&
        Objects.equals(this.demandName, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.demandName) &&
        Objects.equals(this.demandRequirement, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.demandRequirement) &&
        Objects.equals(this.expectRemainTime, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.expectRemainTime) &&
        Objects.equals(this.expirationTime, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.expirationTime) &&
        Objects.equals(this.expirationTimeEnd, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.expirationTimeEnd) &&
        Objects.equals(this.ignoreScript, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.ignoreScript) &&
        Objects.equals(this.ipActId, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.ipActId) &&
        Objects.equals(this.productIndustry, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.productIndustry) &&
        Objects.equals(this.productInformation, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.productInformation) &&
        Objects.equals(this.productLink, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.productLink) &&
        Objects.equals(this.productName, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.productName) &&
        Objects.equals(this.projectId, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.projectId) &&
        Objects.equals(this.xingzhitouPreAudit, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.xingzhitouPreAudit) &&
        Objects.equals(this.yuntuIndustryIds, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.yuntuIndustryIds) &&
        Objects.equals(this.yuntuMainBrand, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.yuntuMainBrand);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptExpirationDay, adSyncConf, attachmentText, attachments, brandName, componentInfo, contactName, contactPhone, demandName, demandRequirement, expectRemainTime, expirationTime, expirationTimeEnd, ignoreScript, ipActId, productIndustry, productInformation, productLink, productName, projectId, xingzhitouPreAudit, yuntuIndustryIds, yuntuMainBrand);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo {\n");
    sb.append("    acceptExpirationDay: ").append(toIndentedString(acceptExpirationDay)).append("\n");
    sb.append("    adSyncConf: ").append(toIndentedString(adSyncConf)).append("\n");
    sb.append("    attachmentText: ").append(toIndentedString(attachmentText)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

