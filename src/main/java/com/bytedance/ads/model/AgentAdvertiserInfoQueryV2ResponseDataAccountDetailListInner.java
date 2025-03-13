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
import com.bytedance.ads.model.AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus;
import com.bytedance.ads.model.AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag;
import com.bytedance.ads.model.AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerBrandCollaboratorsInner;
import com.bytedance.ads.model.AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerCollaboratorsInner;
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
 * AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner {
  public static final String SERIALIZED_NAME_ADV_COMPANY_ID = "adv_company_id";
  @SerializedName(SERIALIZED_NAME_ADV_COMPANY_ID)
  private Long advCompanyId = null;

  public static final String SERIALIZED_NAME_ADV_COMPANY_NAME = "adv_company_name";
  @SerializedName(SERIALIZED_NAME_ADV_COMPANY_NAME)
  private String advCompanyName = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_ADVERTISER_STATUS = "advertiser_status";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_STATUS)
  private AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus advertiserStatus = null;

  public static final String SERIALIZED_NAME_AUTH_EXPIRE_DATE = "auth_expire_date";
  @SerializedName(SERIALIZED_NAME_AUTH_EXPIRE_DATE)
  private String authExpireDate = null;

  public static final String SERIALIZED_NAME_BIND_TIME = "bind_time";
  @SerializedName(SERIALIZED_NAME_BIND_TIME)
  private String bindTime = null;

  public static final String SERIALIZED_NAME_BRAND_COLLABORATORS = "brand_collaborators";
  @SerializedName(SERIALIZED_NAME_BRAND_COLLABORATORS)
  private List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerBrandCollaboratorsInner> brandCollaborators = null;

  public static final String SERIALIZED_NAME_BRAND_OPTIMIZER_ID = "brand_optimizer_id";
  @SerializedName(SERIALIZED_NAME_BRAND_OPTIMIZER_ID)
  private Long brandOptimizerId = null;

  public static final String SERIALIZED_NAME_BRAND_OPTIMIZER_NAME = "brand_optimizer_name";
  @SerializedName(SERIALIZED_NAME_BRAND_OPTIMIZER_NAME)
  private String brandOptimizerName = null;

  public static final String SERIALIZED_NAME_COLLABORATORS = "collaborators";
  @SerializedName(SERIALIZED_NAME_COLLABORATORS)
  private List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerCollaboratorsInner> collaborators = null;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CUSTOMER_SALE_NAME = "customer_sale_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SALE_NAME)
  private String customerSaleName = null;

  public static final String SERIALIZED_NAME_FIRST_AGENT_COMPANY_ID = "first_agent_company_id";
  @SerializedName(SERIALIZED_NAME_FIRST_AGENT_COMPANY_ID)
  private Long firstAgentCompanyId = null;

  public static final String SERIALIZED_NAME_FIRST_AGENT_COMPANY_NAME = "first_agent_company_name";
  @SerializedName(SERIALIZED_NAME_FIRST_AGENT_COMPANY_NAME)
  private String firstAgentCompanyName = null;

  public static final String SERIALIZED_NAME_FIRST_AGENT_ID = "first_agent_id";
  @SerializedName(SERIALIZED_NAME_FIRST_AGENT_ID)
  private Long firstAgentId = null;

  public static final String SERIALIZED_NAME_FIRST_AGENT_NAME = "first_agent_name";
  @SerializedName(SERIALIZED_NAME_FIRST_AGENT_NAME)
  private String firstAgentName = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_NAME = "first_industry_name";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_NAME)
  private String firstIndustryName = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_ID = "optimizer_id";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_ID)
  private Long optimizerId = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_NAME = "optimizer_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_NAME)
  private String optimizerName = null;

  public static final String SERIALIZED_NAME_SALE_ID = "sale_id";
  @SerializedName(SERIALIZED_NAME_SALE_ID)
  private Long saleId = null;

  public static final String SERIALIZED_NAME_SALE_NAME = "sale_name";
  @SerializedName(SERIALIZED_NAME_SALE_NAME)
  private String saleName = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_NAME = "second_industry_name";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_NAME)
  private String secondIndustryName = null;

  public static final String SERIALIZED_NAME_SELF_OPERATION_TAG = "self_operation_tag";
  @SerializedName(SERIALIZED_NAME_SELF_OPERATION_TAG)
  private AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag selfOperationTag = null;

  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner() {
  }

  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner advCompanyId(Long advCompanyId) {
    
    this.advCompanyId = advCompanyId;
    return this;
  }

   /**
   * 广告主公司ID
   * @return advCompanyId
  **/
  @javax.annotation.Nullable
  public Long getAdvCompanyId() {
    return advCompanyId;
  }


  public void setAdvCompanyId(Long advCompanyId) {
    this.advCompanyId = advCompanyId;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner advCompanyName(String advCompanyName) {
    
    this.advCompanyName = advCompanyName;
    return this;
  }

   /**
   * 广告主公司名称
   * @return advCompanyName
  **/
  @javax.annotation.Nullable
  public String getAdvCompanyName() {
    return advCompanyName;
  }


  public void setAdvCompanyName(String advCompanyName) {
    this.advCompanyName = advCompanyName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主账户名称
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner advertiserStatus(AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus advertiserStatus) {
    
    this.advertiserStatus = advertiserStatus;
    return this;
  }

   /**
   * Get advertiserStatus
   * @return advertiserStatus
  **/
  @javax.annotation.Nullable
  public AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus getAdvertiserStatus() {
    return advertiserStatus;
  }


  public void setAdvertiserStatus(AgentAdvertiserInfoQueryV2DataAccountDetailListAdvertiserStatus advertiserStatus) {
    this.advertiserStatus = advertiserStatus;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner authExpireDate(String authExpireDate) {
    
    this.authExpireDate = authExpireDate;
    return this;
  }

   /**
   * 对公认证过期时间
   * @return authExpireDate
  **/
  @javax.annotation.Nullable
  public String getAuthExpireDate() {
    return authExpireDate;
  }


  public void setAuthExpireDate(String authExpireDate) {
    this.authExpireDate = authExpireDate;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner bindTime(String bindTime) {
    
    this.bindTime = bindTime;
    return this;
  }

   /**
   * 广告主账户与代理商账户的绑定时间
   * @return bindTime
  **/
  @javax.annotation.Nullable
  public String getBindTime() {
    return bindTime;
  }


  public void setBindTime(String bindTime) {
    this.bindTime = bindTime;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner brandCollaborators(List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerBrandCollaboratorsInner> brandCollaborators) {
    
    this.brandCollaborators = brandCollaborators;
    return this;
  }

  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner addBrandCollaboratorsItem(AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerBrandCollaboratorsInner brandCollaboratorsItem) {
    if (this.brandCollaborators == null) {
      this.brandCollaborators = new ArrayList<>();
    }
    this.brandCollaborators.add(brandCollaboratorsItem);
    return this;
  }

   /**
   * 
   * @return brandCollaborators
  **/
  @javax.annotation.Nullable
  public List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerBrandCollaboratorsInner> getBrandCollaborators() {
    return brandCollaborators;
  }


  public void setBrandCollaborators(List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerBrandCollaboratorsInner> brandCollaborators) {
    this.brandCollaborators = brandCollaborators;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner brandOptimizerId(Long brandOptimizerId) {
    
    this.brandOptimizerId = brandOptimizerId;
    return this;
  }

   /**
   * 品牌权限负责人id
   * @return brandOptimizerId
  **/
  @javax.annotation.Nullable
  public Long getBrandOptimizerId() {
    return brandOptimizerId;
  }


  public void setBrandOptimizerId(Long brandOptimizerId) {
    this.brandOptimizerId = brandOptimizerId;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner brandOptimizerName(String brandOptimizerName) {
    
    this.brandOptimizerName = brandOptimizerName;
    return this;
  }

   /**
   * 品牌权限负责人姓名
   * @return brandOptimizerName
  **/
  @javax.annotation.Nullable
  public String getBrandOptimizerName() {
    return brandOptimizerName;
  }


  public void setBrandOptimizerName(String brandOptimizerName) {
    this.brandOptimizerName = brandOptimizerName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner collaborators(List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerCollaboratorsInner> collaborators) {
    
    this.collaborators = collaborators;
    return this;
  }

  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner addCollaboratorsItem(AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerCollaboratorsInner collaboratorsItem) {
    if (this.collaborators == null) {
      this.collaborators = new ArrayList<>();
    }
    this.collaborators.add(collaboratorsItem);
    return this;
  }

   /**
   * 
   * @return collaborators
  **/
  @javax.annotation.Nullable
  public List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerCollaboratorsInner> getCollaborators() {
    return collaborators;
  }


  public void setCollaborators(List<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInnerCollaboratorsInner> collaborators) {
    this.collaborators = collaborators;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner contactName(String contactName) {
    
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


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 广告主账户创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner customerSaleName(String customerSaleName) {
    
    this.customerSaleName = customerSaleName;
    return this;
  }

   /**
   * 直客销售名称
   * @return customerSaleName
  **/
  @javax.annotation.Nullable
  public String getCustomerSaleName() {
    return customerSaleName;
  }


  public void setCustomerSaleName(String customerSaleName) {
    this.customerSaleName = customerSaleName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner firstAgentCompanyId(Long firstAgentCompanyId) {
    
    this.firstAgentCompanyId = firstAgentCompanyId;
    return this;
  }

   /**
   * 一代代理商公司ID
   * @return firstAgentCompanyId
  **/
  @javax.annotation.Nullable
  public Long getFirstAgentCompanyId() {
    return firstAgentCompanyId;
  }


  public void setFirstAgentCompanyId(Long firstAgentCompanyId) {
    this.firstAgentCompanyId = firstAgentCompanyId;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner firstAgentCompanyName(String firstAgentCompanyName) {
    
    this.firstAgentCompanyName = firstAgentCompanyName;
    return this;
  }

   /**
   * 一代代理商公司名称
   * @return firstAgentCompanyName
  **/
  @javax.annotation.Nullable
  public String getFirstAgentCompanyName() {
    return firstAgentCompanyName;
  }


  public void setFirstAgentCompanyName(String firstAgentCompanyName) {
    this.firstAgentCompanyName = firstAgentCompanyName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner firstAgentId(Long firstAgentId) {
    
    this.firstAgentId = firstAgentId;
    return this;
  }

   /**
   * 一级代理商账户ID
   * @return firstAgentId
  **/
  @javax.annotation.Nullable
  public Long getFirstAgentId() {
    return firstAgentId;
  }


  public void setFirstAgentId(Long firstAgentId) {
    this.firstAgentId = firstAgentId;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner firstAgentName(String firstAgentName) {
    
    this.firstAgentName = firstAgentName;
    return this;
  }

   /**
   * 一级代理商账户名称
   * @return firstAgentName
  **/
  @javax.annotation.Nullable
  public String getFirstAgentName() {
    return firstAgentName;
  }


  public void setFirstAgentName(String firstAgentName) {
    this.firstAgentName = firstAgentName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner firstIndustryName(String firstIndustryName) {
    
    this.firstIndustryName = firstIndustryName;
    return this;
  }

   /**
   * 一级行业名称
   * @return firstIndustryName
  **/
  @javax.annotation.Nullable
  public String getFirstIndustryName() {
    return firstIndustryName;
  }


  public void setFirstIndustryName(String firstIndustryName) {
    this.firstIndustryName = firstIndustryName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner optimizerId(Long optimizerId) {
    
    this.optimizerId = optimizerId;
    return this;
  }

   /**
   * 竞价权限负责人id
   * @return optimizerId
  **/
  @javax.annotation.Nullable
  public Long getOptimizerId() {
    return optimizerId;
  }


  public void setOptimizerId(Long optimizerId) {
    this.optimizerId = optimizerId;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner optimizerName(String optimizerName) {
    
    this.optimizerName = optimizerName;
    return this;
  }

   /**
   * 竞价权限负责人姓名
   * @return optimizerName
  **/
  @javax.annotation.Nullable
  public String getOptimizerName() {
    return optimizerName;
  }


  public void setOptimizerName(String optimizerName) {
    this.optimizerName = optimizerName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner saleId(Long saleId) {
    
    this.saleId = saleId;
    return this;
  }

   /**
   * 销售ID
   * @return saleId
  **/
  @javax.annotation.Nullable
  public Long getSaleId() {
    return saleId;
  }


  public void setSaleId(Long saleId) {
    this.saleId = saleId;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner saleName(String saleName) {
    
    this.saleName = saleName;
    return this;
  }

   /**
   * 销售名称
   * @return saleName
  **/
  @javax.annotation.Nullable
  public String getSaleName() {
    return saleName;
  }


  public void setSaleName(String saleName) {
    this.saleName = saleName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner secondIndustryName(String secondIndustryName) {
    
    this.secondIndustryName = secondIndustryName;
    return this;
  }

   /**
   * 二级行业名称
   * @return secondIndustryName
  **/
  @javax.annotation.Nullable
  public String getSecondIndustryName() {
    return secondIndustryName;
  }


  public void setSecondIndustryName(String secondIndustryName) {
    this.secondIndustryName = secondIndustryName;
  }


  public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner selfOperationTag(AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag selfOperationTag) {
    
    this.selfOperationTag = selfOperationTag;
    return this;
  }

   /**
   * Get selfOperationTag
   * @return selfOperationTag
  **/
  @javax.annotation.Nullable
  public AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag getSelfOperationTag() {
    return selfOperationTag;
  }


  public void setSelfOperationTag(AgentAdvertiserInfoQueryV2DataAccountDetailListSelfOperationTag selfOperationTag) {
    this.selfOperationTag = selfOperationTag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner = (AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner) o;
    return Objects.equals(this.advCompanyId, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.advCompanyId) &&
        Objects.equals(this.advCompanyName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.advCompanyName) &&
        Objects.equals(this.advertiserId, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.advertiserId) &&
        Objects.equals(this.advertiserName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.advertiserName) &&
        Objects.equals(this.advertiserStatus, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.advertiserStatus) &&
        Objects.equals(this.authExpireDate, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.authExpireDate) &&
        Objects.equals(this.bindTime, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.bindTime) &&
        Objects.equals(this.brandCollaborators, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.brandCollaborators) &&
        Objects.equals(this.brandOptimizerId, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.brandOptimizerId) &&
        Objects.equals(this.brandOptimizerName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.brandOptimizerName) &&
        Objects.equals(this.collaborators, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.collaborators) &&
        Objects.equals(this.contactName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.contactName) &&
        Objects.equals(this.createTime, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.createTime) &&
        Objects.equals(this.customerSaleName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.customerSaleName) &&
        Objects.equals(this.firstAgentCompanyId, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.firstAgentCompanyId) &&
        Objects.equals(this.firstAgentCompanyName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.firstAgentCompanyName) &&
        Objects.equals(this.firstAgentId, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.firstAgentId) &&
        Objects.equals(this.firstAgentName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.firstAgentName) &&
        Objects.equals(this.firstIndustryName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.firstIndustryName) &&
        Objects.equals(this.optimizerId, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.optimizerId) &&
        Objects.equals(this.optimizerName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.optimizerName) &&
        Objects.equals(this.saleId, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.saleId) &&
        Objects.equals(this.saleName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.saleName) &&
        Objects.equals(this.secondIndustryName, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.secondIndustryName) &&
        Objects.equals(this.selfOperationTag, agentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.selfOperationTag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advCompanyId, advCompanyName, advertiserId, advertiserName, advertiserStatus, authExpireDate, bindTime, brandCollaborators, brandOptimizerId, brandOptimizerName, collaborators, contactName, createTime, customerSaleName, firstAgentCompanyId, firstAgentCompanyName, firstAgentId, firstAgentName, firstIndustryName, optimizerId, optimizerName, saleId, saleName, secondIndustryName, selfOperationTag);
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
    sb.append("class AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner {\n");
    sb.append("    advCompanyId: ").append(toIndentedString(advCompanyId)).append("\n");
    sb.append("    advCompanyName: ").append(toIndentedString(advCompanyName)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    advertiserStatus: ").append(toIndentedString(advertiserStatus)).append("\n");
    sb.append("    authExpireDate: ").append(toIndentedString(authExpireDate)).append("\n");
    sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
    sb.append("    brandCollaborators: ").append(toIndentedString(brandCollaborators)).append("\n");
    sb.append("    brandOptimizerId: ").append(toIndentedString(brandOptimizerId)).append("\n");
    sb.append("    brandOptimizerName: ").append(toIndentedString(brandOptimizerName)).append("\n");
    sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    customerSaleName: ").append(toIndentedString(customerSaleName)).append("\n");
    sb.append("    firstAgentCompanyId: ").append(toIndentedString(firstAgentCompanyId)).append("\n");
    sb.append("    firstAgentCompanyName: ").append(toIndentedString(firstAgentCompanyName)).append("\n");
    sb.append("    firstAgentId: ").append(toIndentedString(firstAgentId)).append("\n");
    sb.append("    firstAgentName: ").append(toIndentedString(firstAgentName)).append("\n");
    sb.append("    firstIndustryName: ").append(toIndentedString(firstIndustryName)).append("\n");
    sb.append("    optimizerId: ").append(toIndentedString(optimizerId)).append("\n");
    sb.append("    optimizerName: ").append(toIndentedString(optimizerName)).append("\n");
    sb.append("    saleId: ").append(toIndentedString(saleId)).append("\n");
    sb.append("    saleName: ").append(toIndentedString(saleName)).append("\n");
    sb.append("    secondIndustryName: ").append(toIndentedString(secondIndustryName)).append("\n");
    sb.append("    selfOperationTag: ").append(toIndentedString(selfOperationTag)).append("\n");
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
    openapiFields.add("adv_company_id");
    openapiFields.add("adv_company_name");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("advertiser_status");
    openapiFields.add("auth_expire_date");
    openapiFields.add("bind_time");
    openapiFields.add("brand_collaborators");
    openapiFields.add("brand_optimizer_id");
    openapiFields.add("brand_optimizer_name");
    openapiFields.add("collaborators");
    openapiFields.add("contact_name");
    openapiFields.add("create_time");
    openapiFields.add("customer_sale_name");
    openapiFields.add("first_agent_company_id");
    openapiFields.add("first_agent_company_name");
    openapiFields.add("first_agent_id");
    openapiFields.add("first_agent_name");
    openapiFields.add("first_industry_name");
    openapiFields.add("optimizer_id");
    openapiFields.add("optimizer_name");
    openapiFields.add("sale_id");
    openapiFields.add("sale_name");
    openapiFields.add("second_industry_name");
    openapiFields.add("self_operation_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner
  */
  public static AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner.class);
  }

 /**
  * Convert an instance of AgentAdvertiserInfoQueryV2ResponseDataAccountDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

