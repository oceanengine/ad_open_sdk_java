/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge;
import com.bytedance.ads.model.DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceGender;
import com.bytedance.ads.model.DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork;
import com.bytedance.ads.model.DiagnosisTaskAgentCreateV2DiagnoseConfigExternalAction;
import com.bytedance.ads.model.DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform;
import com.bytedance.ads.model.DiagnosisTaskAgentCreateV2DiagnoseConfigPricingType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class DiagnosisTaskAgentCreateV2RequestDiagnoseConfig {
  public static final String SERIALIZED_NAME_AUDIENCE_AGE = "audience_age";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_AGE)
  private List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge> audienceAge = null;

  public static final String SERIALIZED_NAME_AUDIENCE_GENDER = "audience_gender";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_GENDER)
  private DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceGender audienceGender = null;

  public static final String SERIALIZED_NAME_AUDIENCE_NETWORK = "audience_network";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_NETWORK)
  private List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork> audienceNetwork = null;

  public static final String SERIALIZED_NAME_AUDIENCE_REGION = "audience_region";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_REGION)
  private List<Long> audienceRegion = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_COST_CAP = "cost_cap";
  @SerializedName(SERIALIZED_NAME_COST_CAP)
  private Boolean costCap = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_CPC_BID = "cpc_bid";
  @SerializedName(SERIALIZED_NAME_CPC_BID)
  private Double cpcBid = null;

  public static final String SERIALIZED_NAME_CUS_NAME = "cus_name";
  @SerializedName(SERIALIZED_NAME_CUS_NAME)
  private String cusName = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private DiagnosisTaskAgentCreateV2DiagnoseConfigExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_NOBID = "nobid";
  @SerializedName(SERIALIZED_NAME_NOBID)
  private Boolean nobid = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform platform = null;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  private DiagnosisTaskAgentCreateV2DiagnoseConfigPricingType pricingType = null;

  public static final String SERIALIZED_NAME_TARGET_COST = "target_cost";
  @SerializedName(SERIALIZED_NAME_TARGET_COST)
  private Boolean targetCost = null;

  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig() {
  }

  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig audienceAge(List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge> audienceAge) {
    
    this.audienceAge = audienceAge;
    return this;
  }

  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig addAudienceAgeItem(DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge audienceAgeItem) {
    if (this.audienceAge == null) {
      this.audienceAge = new ArrayList<>();
    }
    this.audienceAge.add(audienceAgeItem);
    return this;
  }

   /**
   * 
   * @return audienceAge
  **/
  @javax.annotation.Nullable
  public List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge> getAudienceAge() {
    return audienceAge;
  }


  public void setAudienceAge(List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceAge> audienceAge) {
    this.audienceAge = audienceAge;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig audienceGender(DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceGender audienceGender) {
    
    this.audienceGender = audienceGender;
    return this;
  }

   /**
   * Get audienceGender
   * @return audienceGender
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceGender getAudienceGender() {
    return audienceGender;
  }


  public void setAudienceGender(DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceGender audienceGender) {
    this.audienceGender = audienceGender;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig audienceNetwork(List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork> audienceNetwork) {
    
    this.audienceNetwork = audienceNetwork;
    return this;
  }

  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig addAudienceNetworkItem(DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork audienceNetworkItem) {
    if (this.audienceNetwork == null) {
      this.audienceNetwork = new ArrayList<>();
    }
    this.audienceNetwork.add(audienceNetworkItem);
    return this;
  }

   /**
   * 
   * @return audienceNetwork
  **/
  @javax.annotation.Nullable
  public List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork> getAudienceNetwork() {
    return audienceNetwork;
  }


  public void setAudienceNetwork(List<DiagnosisTaskAgentCreateV2DiagnoseConfigAudienceNetwork> audienceNetwork) {
    this.audienceNetwork = audienceNetwork;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig audienceRegion(List<Long> audienceRegion) {
    
    this.audienceRegion = audienceRegion;
    return this;
  }

  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig addAudienceRegionItem(Long audienceRegionItem) {
    if (this.audienceRegion == null) {
      this.audienceRegion = new ArrayList<>();
    }
    this.audienceRegion.add(audienceRegionItem);
    return this;
  }

   /**
   * 受众地区，传入二级行政区域（市）的code，行政区域接口
   * @return audienceRegion
  **/
  @javax.annotation.Nullable
  public List<Long> getAudienceRegion() {
    return audienceRegion;
  }


  public void setAudienceRegion(List<Long> audienceRegion) {
    this.audienceRegion = audienceRegion;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算金额：取值范围: [1, 10000],  精确到小数点后2位
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig costCap(Boolean costCap) {
    
    this.costCap = costCap;
    return this;
  }

   /**
   * 是否最优成本出价，只有AD支持，千川场景下会忽略本字段
   * @return costCap
  **/
  @javax.annotation.Nullable
  public Boolean getCostCap() {
    return costCap;
  }


  public void setCostCap(Boolean costCap) {
    this.costCap = costCap;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 目标转化成本：取值范围: [1, 10000],  精确到小数点后2位
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig cpcBid(Double cpcBid) {
    
    this.cpcBid = cpcBid;
    return this;
  }

   /**
   * 目标点击成本：取值范围: [1, 10000],  精确到小数点后2位
   * @return cpcBid
  **/
  @javax.annotation.Nullable
  public Double getCpcBid() {
    return cpcBid;
  }


  public void setCpcBid(Double cpcBid) {
    this.cpcBid = cpcBid;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig cusName(String cusName) {
    
    this.cusName = cusName;
    return this;
  }

   /**
   * 
   * @return cusName
  **/
  @javax.annotation.Nullable
  public String getCusName() {
    return cusName;
  }


  public void setCusName(String cusName) {
    this.cusName = cusName;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig externalAction(DiagnosisTaskAgentCreateV2DiagnoseConfigExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentCreateV2DiagnoseConfigExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(DiagnosisTaskAgentCreateV2DiagnoseConfigExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig nobid(Boolean nobid) {
    
    this.nobid = nobid;
    return this;
  }

   /**
   * 是否最大转化出价，只有AD支持，千川场景下会忽略本字段
   * @return nobid
  **/
  @javax.annotation.Nullable
  public Boolean getNobid() {
    return nobid;
  }


  public void setNobid(Boolean nobid) {
    this.nobid = nobid;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig platform(DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(DiagnosisTaskAgentCreateV2DiagnoseConfigPlatform platform) {
    this.platform = platform;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig pricingType(DiagnosisTaskAgentCreateV2DiagnoseConfigPricingType pricingType) {
    
    this.pricingType = pricingType;
    return this;
  }

   /**
   * Get pricingType
   * @return pricingType
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentCreateV2DiagnoseConfigPricingType getPricingType() {
    return pricingType;
  }


  public void setPricingType(DiagnosisTaskAgentCreateV2DiagnoseConfigPricingType pricingType) {
    this.pricingType = pricingType;
  }


  public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig targetCost(Boolean targetCost) {
    
    this.targetCost = targetCost;
    return this;
  }

   /**
   * 是否稳定成本出价，只有AD支持，千川场景下会忽略本字段
   * @return targetCost
  **/
  @javax.annotation.Nullable
  public Boolean getTargetCost() {
    return targetCost;
  }


  public void setTargetCost(Boolean targetCost) {
    this.targetCost = targetCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisTaskAgentCreateV2RequestDiagnoseConfig diagnosisTaskAgentCreateV2RequestDiagnoseConfig = (DiagnosisTaskAgentCreateV2RequestDiagnoseConfig) o;
    return Objects.equals(this.audienceAge, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.audienceAge) &&
        Objects.equals(this.audienceGender, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.audienceGender) &&
        Objects.equals(this.audienceNetwork, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.audienceNetwork) &&
        Objects.equals(this.audienceRegion, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.audienceRegion) &&
        Objects.equals(this.budget, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.budget) &&
        Objects.equals(this.costCap, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.costCap) &&
        Objects.equals(this.cpaBid, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.cpaBid) &&
        Objects.equals(this.cpcBid, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.cpcBid) &&
        Objects.equals(this.cusName, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.cusName) &&
        Objects.equals(this.externalAction, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.externalAction) &&
        Objects.equals(this.nobid, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.nobid) &&
        Objects.equals(this.platform, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.platform) &&
        Objects.equals(this.pricingType, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.pricingType) &&
        Objects.equals(this.targetCost, diagnosisTaskAgentCreateV2RequestDiagnoseConfig.targetCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceAge, audienceGender, audienceNetwork, audienceRegion, budget, costCap, cpaBid, cpcBid, cusName, externalAction, nobid, platform, pricingType, targetCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosisTaskAgentCreateV2RequestDiagnoseConfig {\n");
    sb.append("    audienceAge: ").append(toIndentedString(audienceAge)).append("\n");
    sb.append("    audienceGender: ").append(toIndentedString(audienceGender)).append("\n");
    sb.append("    audienceNetwork: ").append(toIndentedString(audienceNetwork)).append("\n");
    sb.append("    audienceRegion: ").append(toIndentedString(audienceRegion)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    costCap: ").append(toIndentedString(costCap)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    cpcBid: ").append(toIndentedString(cpcBid)).append("\n");
    sb.append("    cusName: ").append(toIndentedString(cusName)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    nobid: ").append(toIndentedString(nobid)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    targetCost: ").append(toIndentedString(targetCost)).append("\n");
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
    openapiFields.add("audience_age");
    openapiFields.add("audience_gender");
    openapiFields.add("audience_network");
    openapiFields.add("audience_region");
    openapiFields.add("budget");
    openapiFields.add("cost_cap");
    openapiFields.add("cpa_bid");
    openapiFields.add("cpc_bid");
    openapiFields.add("cus_name");
    openapiFields.add("external_action");
    openapiFields.add("nobid");
    openapiFields.add("platform");
    openapiFields.add("pricing_type");
    openapiFields.add("target_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiagnosisTaskAgentCreateV2RequestDiagnoseConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiagnosisTaskAgentCreateV2RequestDiagnoseConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiagnosisTaskAgentCreateV2RequestDiagnoseConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiagnosisTaskAgentCreateV2RequestDiagnoseConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DiagnosisTaskAgentCreateV2RequestDiagnoseConfig>() {
           @Override
           public void write(JsonWriter out, DiagnosisTaskAgentCreateV2RequestDiagnoseConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiagnosisTaskAgentCreateV2RequestDiagnoseConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiagnosisTaskAgentCreateV2RequestDiagnoseConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiagnosisTaskAgentCreateV2RequestDiagnoseConfig
  * @throws IOException if the JSON string is invalid with respect to DiagnosisTaskAgentCreateV2RequestDiagnoseConfig
  */
  public static DiagnosisTaskAgentCreateV2RequestDiagnoseConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiagnosisTaskAgentCreateV2RequestDiagnoseConfig.class);
  }

 /**
  * Convert an instance of DiagnosisTaskAgentCreateV2RequestDiagnoseConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

