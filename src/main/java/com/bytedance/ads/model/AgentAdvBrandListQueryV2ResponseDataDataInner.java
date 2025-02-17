/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentAdvBrandListQueryV2DataDataAccountStatus;
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
 * AgentAdvBrandListQueryV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class AgentAdvBrandListQueryV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AgentAdvBrandListQueryV2DataDataAccountStatus accountStatus = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agent_name";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName = null;

  public static final String SERIALIZED_NAME_BRAND_BALANCE = "brand_balance";
  @SerializedName(SERIALIZED_NAME_BRAND_BALANCE)
  private Long brandBalance = null;

  public static final String SERIALIZED_NAME_BRAND_BALANCE_VALID = "brand_balance_valid";
  @SerializedName(SERIALIZED_NAME_BRAND_BALANCE_VALID)
  private Long brandBalanceValid = null;

  public static final String SERIALIZED_NAME_BRAND_GRANT_BALANCE = "brand_grant_balance";
  @SerializedName(SERIALIZED_NAME_BRAND_GRANT_BALANCE)
  private Long brandGrantBalance = null;

  public static final String SERIALIZED_NAME_BRAND_NON_GRANT_BALANCE_VALID = "brand_non_grant_balance_valid";
  @SerializedName(SERIALIZED_NAME_BRAND_NON_GRANT_BALANCE_VALID)
  private Long brandNonGrantBalanceValid = null;

  public static final String SERIALIZED_NAME_CASH_COST = "cash_cost";
  @SerializedName(SERIALIZED_NAME_CASH_COST)
  private Long cashCost = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY = "first_industry";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY)
  private String firstIndustry = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_ID = "first_industry_id";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_ID)
  private Long firstIndustryId = null;

  public static final String SERIALIZED_NAME_GRANT_COST = "grant_cost";
  @SerializedName(SERIALIZED_NAME_GRANT_COST)
  private Long grantCost = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY = "second_industry";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY)
  private String secondIndustry = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Long secondIndustryId = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Long statCost = null;

  public AgentAdvBrandListQueryV2ResponseDataDataInner() {
  }

  public AgentAdvBrandListQueryV2ResponseDataDataInner accountStatus(AgentAdvBrandListQueryV2DataDataAccountStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  public AgentAdvBrandListQueryV2DataDataAccountStatus getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(AgentAdvBrandListQueryV2DataDataAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner advertiserName(String advertiserName) {
    
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


  public AgentAdvBrandListQueryV2ResponseDataDataInner agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商账户ID
   * @return agentId
  **/
  @javax.annotation.Nullable
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * 代理商账户名称
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner brandBalance(Long brandBalance) {
    
    this.brandBalance = brandBalance;
    return this;
  }

   /**
   * 品牌余额
   * @return brandBalance
  **/
  @javax.annotation.Nullable
  public Long getBrandBalance() {
    return brandBalance;
  }


  public void setBrandBalance(Long brandBalance) {
    this.brandBalance = brandBalance;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner brandBalanceValid(Long brandBalanceValid) {
    
    this.brandBalanceValid = brandBalanceValid;
    return this;
  }

   /**
   * 品牌可用余额
   * @return brandBalanceValid
  **/
  @javax.annotation.Nullable
  public Long getBrandBalanceValid() {
    return brandBalanceValid;
  }


  public void setBrandBalanceValid(Long brandBalanceValid) {
    this.brandBalanceValid = brandBalanceValid;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner brandGrantBalance(Long brandGrantBalance) {
    
    this.brandGrantBalance = brandGrantBalance;
    return this;
  }

   /**
   * 品牌赠款余额
   * @return brandGrantBalance
  **/
  @javax.annotation.Nullable
  public Long getBrandGrantBalance() {
    return brandGrantBalance;
  }


  public void setBrandGrantBalance(Long brandGrantBalance) {
    this.brandGrantBalance = brandGrantBalance;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner brandNonGrantBalanceValid(Long brandNonGrantBalanceValid) {
    
    this.brandNonGrantBalanceValid = brandNonGrantBalanceValid;
    return this;
  }

   /**
   * 品牌非赠款可用余额
   * @return brandNonGrantBalanceValid
  **/
  @javax.annotation.Nullable
  public Long getBrandNonGrantBalanceValid() {
    return brandNonGrantBalanceValid;
  }


  public void setBrandNonGrantBalanceValid(Long brandNonGrantBalanceValid) {
    this.brandNonGrantBalanceValid = brandNonGrantBalanceValid;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner cashCost(Long cashCost) {
    
    this.cashCost = cashCost;
    return this;
  }

   /**
   * 非赠款消耗
   * @return cashCost
  **/
  @javax.annotation.Nullable
  public Long getCashCost() {
    return cashCost;
  }


  public void setCashCost(Long cashCost) {
    this.cashCost = cashCost;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 广告主公司ID
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 广告主公司名称
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner firstIndustry(String firstIndustry) {
    
    this.firstIndustry = firstIndustry;
    return this;
  }

   /**
   * 广告主账户一级行业名称
   * @return firstIndustry
  **/
  @javax.annotation.Nullable
  public String getFirstIndustry() {
    return firstIndustry;
  }


  public void setFirstIndustry(String firstIndustry) {
    this.firstIndustry = firstIndustry;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner firstIndustryId(Long firstIndustryId) {
    
    this.firstIndustryId = firstIndustryId;
    return this;
  }

   /**
   * 广告主账户一级行业ID
   * @return firstIndustryId
  **/
  @javax.annotation.Nullable
  public Long getFirstIndustryId() {
    return firstIndustryId;
  }


  public void setFirstIndustryId(Long firstIndustryId) {
    this.firstIndustryId = firstIndustryId;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner grantCost(Long grantCost) {
    
    this.grantCost = grantCost;
    return this;
  }

   /**
   * 赠款消耗
   * @return grantCost
  **/
  @javax.annotation.Nullable
  public Long getGrantCost() {
    return grantCost;
  }


  public void setGrantCost(Long grantCost) {
    this.grantCost = grantCost;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner secondIndustry(String secondIndustry) {
    
    this.secondIndustry = secondIndustry;
    return this;
  }

   /**
   * 广告主账户二级行业名称
   * @return secondIndustry
  **/
  @javax.annotation.Nullable
  public String getSecondIndustry() {
    return secondIndustry;
  }


  public void setSecondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner secondIndustryId(Long secondIndustryId) {
    
    this.secondIndustryId = secondIndustryId;
    return this;
  }

   /**
   * 广告主账户二级行业ID
   * @return secondIndustryId
  **/
  @javax.annotation.Nullable
  public Long getSecondIndustryId() {
    return secondIndustryId;
  }


  public void setSecondIndustryId(Long secondIndustryId) {
    this.secondIndustryId = secondIndustryId;
  }


  public AgentAdvBrandListQueryV2ResponseDataDataInner statCost(Long statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 总消耗
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Long getStatCost() {
    return statCost;
  }


  public void setStatCost(Long statCost) {
    this.statCost = statCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvBrandListQueryV2ResponseDataDataInner agentAdvBrandListQueryV2ResponseDataDataInner = (AgentAdvBrandListQueryV2ResponseDataDataInner) o;
    return Objects.equals(this.accountStatus, agentAdvBrandListQueryV2ResponseDataDataInner.accountStatus) &&
        Objects.equals(this.advertiserId, agentAdvBrandListQueryV2ResponseDataDataInner.advertiserId) &&
        Objects.equals(this.advertiserName, agentAdvBrandListQueryV2ResponseDataDataInner.advertiserName) &&
        Objects.equals(this.agentId, agentAdvBrandListQueryV2ResponseDataDataInner.agentId) &&
        Objects.equals(this.agentName, agentAdvBrandListQueryV2ResponseDataDataInner.agentName) &&
        Objects.equals(this.brandBalance, agentAdvBrandListQueryV2ResponseDataDataInner.brandBalance) &&
        Objects.equals(this.brandBalanceValid, agentAdvBrandListQueryV2ResponseDataDataInner.brandBalanceValid) &&
        Objects.equals(this.brandGrantBalance, agentAdvBrandListQueryV2ResponseDataDataInner.brandGrantBalance) &&
        Objects.equals(this.brandNonGrantBalanceValid, agentAdvBrandListQueryV2ResponseDataDataInner.brandNonGrantBalanceValid) &&
        Objects.equals(this.cashCost, agentAdvBrandListQueryV2ResponseDataDataInner.cashCost) &&
        Objects.equals(this.companyId, agentAdvBrandListQueryV2ResponseDataDataInner.companyId) &&
        Objects.equals(this.companyName, agentAdvBrandListQueryV2ResponseDataDataInner.companyName) &&
        Objects.equals(this.firstIndustry, agentAdvBrandListQueryV2ResponseDataDataInner.firstIndustry) &&
        Objects.equals(this.firstIndustryId, agentAdvBrandListQueryV2ResponseDataDataInner.firstIndustryId) &&
        Objects.equals(this.grantCost, agentAdvBrandListQueryV2ResponseDataDataInner.grantCost) &&
        Objects.equals(this.secondIndustry, agentAdvBrandListQueryV2ResponseDataDataInner.secondIndustry) &&
        Objects.equals(this.secondIndustryId, agentAdvBrandListQueryV2ResponseDataDataInner.secondIndustryId) &&
        Objects.equals(this.statCost, agentAdvBrandListQueryV2ResponseDataDataInner.statCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountStatus, advertiserId, advertiserName, agentId, agentName, brandBalance, brandBalanceValid, brandGrantBalance, brandNonGrantBalanceValid, cashCost, companyId, companyName, firstIndustry, firstIndustryId, grantCost, secondIndustry, secondIndustryId, statCost);
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
    sb.append("class AgentAdvBrandListQueryV2ResponseDataDataInner {\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    brandBalance: ").append(toIndentedString(brandBalance)).append("\n");
    sb.append("    brandBalanceValid: ").append(toIndentedString(brandBalanceValid)).append("\n");
    sb.append("    brandGrantBalance: ").append(toIndentedString(brandGrantBalance)).append("\n");
    sb.append("    brandNonGrantBalanceValid: ").append(toIndentedString(brandNonGrantBalanceValid)).append("\n");
    sb.append("    cashCost: ").append(toIndentedString(cashCost)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    firstIndustry: ").append(toIndentedString(firstIndustry)).append("\n");
    sb.append("    firstIndustryId: ").append(toIndentedString(firstIndustryId)).append("\n");
    sb.append("    grantCost: ").append(toIndentedString(grantCost)).append("\n");
    sb.append("    secondIndustry: ").append(toIndentedString(secondIndustry)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
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
    openapiFields.add("account_status");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("agent_id");
    openapiFields.add("agent_name");
    openapiFields.add("brand_balance");
    openapiFields.add("brand_balance_valid");
    openapiFields.add("brand_grant_balance");
    openapiFields.add("brand_non_grant_balance_valid");
    openapiFields.add("cash_cost");
    openapiFields.add("company_id");
    openapiFields.add("company_name");
    openapiFields.add("first_industry");
    openapiFields.add("first_industry_id");
    openapiFields.add("grant_cost");
    openapiFields.add("second_industry");
    openapiFields.add("second_industry_id");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvBrandListQueryV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvBrandListQueryV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvBrandListQueryV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvBrandListQueryV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvBrandListQueryV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, AgentAdvBrandListQueryV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvBrandListQueryV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvBrandListQueryV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvBrandListQueryV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to AgentAdvBrandListQueryV2ResponseDataDataInner
  */
  public static AgentAdvBrandListQueryV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvBrandListQueryV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of AgentAdvBrandListQueryV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

