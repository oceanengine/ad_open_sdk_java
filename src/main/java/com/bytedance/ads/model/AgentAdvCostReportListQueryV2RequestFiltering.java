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
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2FilteringAppName;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2FilteringCostSource;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2FilteringEcommerceType;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2FilteringPricingCategory;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2FilteringPromotionType;
import com.bytedance.ads.model.AgentAdvCostReportListQueryV2FilteringSpuLabelName;
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
 * 过滤条件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class AgentAdvCostReportListQueryV2RequestFiltering {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_AGENT_CUSTOMER_ID = "agent_customer_id";
  @SerializedName(SERIALIZED_NAME_AGENT_CUSTOMER_ID)
  private Long agentCustomerId = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private AgentAdvCostReportListQueryV2FilteringAppName appName = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_COST_SOURCE = "cost_source";
  @SerializedName(SERIALIZED_NAME_COST_SOURCE)
  private AgentAdvCostReportListQueryV2FilteringCostSource costSource = null;

  public static final String SERIALIZED_NAME_ECOMMERCE_TYPE = "ecommerce_type";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE_TYPE)
  private AgentAdvCostReportListQueryV2FilteringEcommerceType ecommerceType = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY = "first_industry";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY)
  private String firstIndustry = null;

  public static final String SERIALIZED_NAME_PRICING_CATEGORY = "pricing_category";
  @SerializedName(SERIALIZED_NAME_PRICING_CATEGORY)
  private AgentAdvCostReportListQueryV2FilteringPricingCategory pricingCategory = null;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName = null;

  public static final String SERIALIZED_NAME_PROJECT_SERIAL = "project_serial";
  @SerializedName(SERIALIZED_NAME_PROJECT_SERIAL)
  private String projectSerial = null;

  public static final String SERIALIZED_NAME_PROMOTION_TYPE = "promotion_type";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TYPE)
  private AgentAdvCostReportListQueryV2FilteringPromotionType promotionType = null;

  public static final String SERIALIZED_NAME_SECOND_AD_AGENT_ID = "second_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_SECOND_AD_AGENT_ID)
  private Long secondAdAgentId = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY = "second_industry";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY)
  private String secondIndustry = null;

  public static final String SERIALIZED_NAME_SPU_LABEL_NAME = "spu_label_name";
  @SerializedName(SERIALIZED_NAME_SPU_LABEL_NAME)
  private List<AgentAdvCostReportListQueryV2FilteringSpuLabelName> spuLabelName = null;

  public AgentAdvCostReportListQueryV2RequestFiltering() {
  }

  public AgentAdvCostReportListQueryV2RequestFiltering advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AgentAdvCostReportListQueryV2RequestFiltering addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 广告主 id 
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering agentCustomerId(Long agentCustomerId) {
    
    this.agentCustomerId = agentCustomerId;
    return this;
  }

   /**
   * 代理商客户id
   * @return agentCustomerId
  **/
  @javax.annotation.Nullable
  public Long getAgentCustomerId() {
    return agentCustomerId;
  }


  public void setAgentCustomerId(Long agentCustomerId) {
    this.agentCustomerId = agentCustomerId;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering appName(AgentAdvCostReportListQueryV2FilteringAppName appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  @javax.annotation.Nullable
  public AgentAdvCostReportListQueryV2FilteringAppName getAppName() {
    return appName;
  }


  public void setAppName(AgentAdvCostReportListQueryV2FilteringAppName appName) {
    this.appName = appName;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 广告主所属公司名称，若选填该字段，限制最小长度为1，最大长度为223。支持模糊查询。
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering costSource(AgentAdvCostReportListQueryV2FilteringCostSource costSource) {
    
    this.costSource = costSource;
    return this;
  }

   /**
   * Get costSource
   * @return costSource
  **/
  @javax.annotation.Nullable
  public AgentAdvCostReportListQueryV2FilteringCostSource getCostSource() {
    return costSource;
  }


  public void setCostSource(AgentAdvCostReportListQueryV2FilteringCostSource costSource) {
    this.costSource = costSource;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering ecommerceType(AgentAdvCostReportListQueryV2FilteringEcommerceType ecommerceType) {
    
    this.ecommerceType = ecommerceType;
    return this;
  }

   /**
   * Get ecommerceType
   * @return ecommerceType
  **/
  @javax.annotation.Nullable
  public AgentAdvCostReportListQueryV2FilteringEcommerceType getEcommerceType() {
    return ecommerceType;
  }


  public void setEcommerceType(AgentAdvCostReportListQueryV2FilteringEcommerceType ecommerceType) {
    this.ecommerceType = ecommerceType;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering firstIndustry(String firstIndustry) {
    
    this.firstIndustry = firstIndustry;
    return this;
  }

   /**
   * 一级行业名称。可从【获取行业列表】接口获取。
   * @return firstIndustry
  **/
  @javax.annotation.Nullable
  public String getFirstIndustry() {
    return firstIndustry;
  }


  public void setFirstIndustry(String firstIndustry) {
    this.firstIndustry = firstIndustry;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering pricingCategory(AgentAdvCostReportListQueryV2FilteringPricingCategory pricingCategory) {
    
    this.pricingCategory = pricingCategory;
    return this;
  }

   /**
   * Get pricingCategory
   * @return pricingCategory
  **/
  @javax.annotation.Nullable
  public AgentAdvCostReportListQueryV2FilteringPricingCategory getPricingCategory() {
    return pricingCategory;
  }


  public void setPricingCategory(AgentAdvCostReportListQueryV2FilteringPricingCategory pricingCategory) {
    this.pricingCategory = pricingCategory;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * 项目名称，若选填该字段，限制最小长度为1，最大长度为223。支持模糊查询
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering projectSerial(String projectSerial) {
    
    this.projectSerial = projectSerial;
    return this;
  }

   /**
   * 项目编号
   * @return projectSerial
  **/
  @javax.annotation.Nullable
  public String getProjectSerial() {
    return projectSerial;
  }


  public void setProjectSerial(String projectSerial) {
    this.projectSerial = projectSerial;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering promotionType(AgentAdvCostReportListQueryV2FilteringPromotionType promotionType) {
    
    this.promotionType = promotionType;
    return this;
  }

   /**
   * Get promotionType
   * @return promotionType
  **/
  @javax.annotation.Nullable
  public AgentAdvCostReportListQueryV2FilteringPromotionType getPromotionType() {
    return promotionType;
  }


  public void setPromotionType(AgentAdvCostReportListQueryV2FilteringPromotionType promotionType) {
    this.promotionType = promotionType;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering secondAdAgentId(Long secondAdAgentId) {
    
    this.secondAdAgentId = secondAdAgentId;
    return this;
  }

   /**
   * 代理商子账户id
   * @return secondAdAgentId
  **/
  @javax.annotation.Nullable
  public Long getSecondAdAgentId() {
    return secondAdAgentId;
  }


  public void setSecondAdAgentId(Long secondAdAgentId) {
    this.secondAdAgentId = secondAdAgentId;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering secondIndustry(String secondIndustry) {
    
    this.secondIndustry = secondIndustry;
    return this;
  }

   /**
   * 二级行业名称。可从【获取行业列表】接口获取。
   * @return secondIndustry
  **/
  @javax.annotation.Nullable
  public String getSecondIndustry() {
    return secondIndustry;
  }


  public void setSecondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
  }


  public AgentAdvCostReportListQueryV2RequestFiltering spuLabelName(List<AgentAdvCostReportListQueryV2FilteringSpuLabelName> spuLabelName) {
    
    this.spuLabelName = spuLabelName;
    return this;
  }

  public AgentAdvCostReportListQueryV2RequestFiltering addSpuLabelNameItem(AgentAdvCostReportListQueryV2FilteringSpuLabelName spuLabelNameItem) {
    if (this.spuLabelName == null) {
      this.spuLabelName = new ArrayList<>();
    }
    this.spuLabelName.add(spuLabelNameItem);
    return this;
  }

   /**
   * 
   * @return spuLabelName
  **/
  @javax.annotation.Nullable
  public List<AgentAdvCostReportListQueryV2FilteringSpuLabelName> getSpuLabelName() {
    return spuLabelName;
  }


  public void setSpuLabelName(List<AgentAdvCostReportListQueryV2FilteringSpuLabelName> spuLabelName) {
    this.spuLabelName = spuLabelName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvCostReportListQueryV2RequestFiltering agentAdvCostReportListQueryV2RequestFiltering = (AgentAdvCostReportListQueryV2RequestFiltering) o;
    return Objects.equals(this.advertiserIds, agentAdvCostReportListQueryV2RequestFiltering.advertiserIds) &&
        Objects.equals(this.agentCustomerId, agentAdvCostReportListQueryV2RequestFiltering.agentCustomerId) &&
        Objects.equals(this.appName, agentAdvCostReportListQueryV2RequestFiltering.appName) &&
        Objects.equals(this.companyName, agentAdvCostReportListQueryV2RequestFiltering.companyName) &&
        Objects.equals(this.costSource, agentAdvCostReportListQueryV2RequestFiltering.costSource) &&
        Objects.equals(this.ecommerceType, agentAdvCostReportListQueryV2RequestFiltering.ecommerceType) &&
        Objects.equals(this.firstIndustry, agentAdvCostReportListQueryV2RequestFiltering.firstIndustry) &&
        Objects.equals(this.pricingCategory, agentAdvCostReportListQueryV2RequestFiltering.pricingCategory) &&
        Objects.equals(this.projectName, agentAdvCostReportListQueryV2RequestFiltering.projectName) &&
        Objects.equals(this.projectSerial, agentAdvCostReportListQueryV2RequestFiltering.projectSerial) &&
        Objects.equals(this.promotionType, agentAdvCostReportListQueryV2RequestFiltering.promotionType) &&
        Objects.equals(this.secondAdAgentId, agentAdvCostReportListQueryV2RequestFiltering.secondAdAgentId) &&
        Objects.equals(this.secondIndustry, agentAdvCostReportListQueryV2RequestFiltering.secondIndustry) &&
        Objects.equals(this.spuLabelName, agentAdvCostReportListQueryV2RequestFiltering.spuLabelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, agentCustomerId, appName, companyName, costSource, ecommerceType, firstIndustry, pricingCategory, projectName, projectSerial, promotionType, secondAdAgentId, secondIndustry, spuLabelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvCostReportListQueryV2RequestFiltering {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    agentCustomerId: ").append(toIndentedString(agentCustomerId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    costSource: ").append(toIndentedString(costSource)).append("\n");
    sb.append("    ecommerceType: ").append(toIndentedString(ecommerceType)).append("\n");
    sb.append("    firstIndustry: ").append(toIndentedString(firstIndustry)).append("\n");
    sb.append("    pricingCategory: ").append(toIndentedString(pricingCategory)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectSerial: ").append(toIndentedString(projectSerial)).append("\n");
    sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
    sb.append("    secondAdAgentId: ").append(toIndentedString(secondAdAgentId)).append("\n");
    sb.append("    secondIndustry: ").append(toIndentedString(secondIndustry)).append("\n");
    sb.append("    spuLabelName: ").append(toIndentedString(spuLabelName)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("agent_customer_id");
    openapiFields.add("app_name");
    openapiFields.add("company_name");
    openapiFields.add("cost_source");
    openapiFields.add("ecommerce_type");
    openapiFields.add("first_industry");
    openapiFields.add("pricing_category");
    openapiFields.add("project_name");
    openapiFields.add("project_serial");
    openapiFields.add("promotion_type");
    openapiFields.add("second_ad_agent_id");
    openapiFields.add("second_industry");
    openapiFields.add("spu_label_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvCostReportListQueryV2RequestFiltering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvCostReportListQueryV2RequestFiltering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvCostReportListQueryV2RequestFiltering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvCostReportListQueryV2RequestFiltering.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvCostReportListQueryV2RequestFiltering>() {
           @Override
           public void write(JsonWriter out, AgentAdvCostReportListQueryV2RequestFiltering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvCostReportListQueryV2RequestFiltering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvCostReportListQueryV2RequestFiltering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvCostReportListQueryV2RequestFiltering
  * @throws IOException if the JSON string is invalid with respect to AgentAdvCostReportListQueryV2RequestFiltering
  */
  public static AgentAdvCostReportListQueryV2RequestFiltering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvCostReportListQueryV2RequestFiltering.class);
  }

 /**
  * Convert an instance of AgentAdvCostReportListQueryV2RequestFiltering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

