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
import com.bytedance.ads.model.AgentAdvBiddingListQueryV2DataDataAccountStatus;
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
 * AgentAdvBiddingListQueryV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class AgentAdvBiddingListQueryV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AgentAdvBiddingListQueryV2DataDataAccountStatus accountStatus = null;

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

  public static final String SERIALIZED_NAME_AGENT_TRANS_AMOUNT = "agent_trans_amount";
  @SerializedName(SERIALIZED_NAME_AGENT_TRANS_AMOUNT)
  private Long agentTransAmount = null;

  public static final String SERIALIZED_NAME_AGENT_TRANS_NUM = "agent_trans_num";
  @SerializedName(SERIALIZED_NAME_AGENT_TRANS_NUM)
  private Long agentTransNum = null;

  public static final String SERIALIZED_NAME_CASH_COST = "cash_cost";
  @SerializedName(SERIALIZED_NAME_CASH_COST)
  private Long cashCost = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_ID = "first_industry_id";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_ID)
  private Long firstIndustryId = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_NAME = "first_industry_name";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_NAME)
  private String firstIndustryName = null;

  public static final String SERIALIZED_NAME_GRANT_BALANCE = "grant_balance";
  @SerializedName(SERIALIZED_NAME_GRANT_BALANCE)
  private Long grantBalance = null;

  public static final String SERIALIZED_NAME_GRANT_COST = "grant_cost";
  @SerializedName(SERIALIZED_NAME_GRANT_COST)
  private Long grantCost = null;

  public static final String SERIALIZED_NAME_NON_GRANT_BALANCE_VALID = "non_grant_balance_valid";
  @SerializedName(SERIALIZED_NAME_NON_GRANT_BALANCE_VALID)
  private Long nonGrantBalanceValid = null;

  public static final String SERIALIZED_NAME_REGISTER_TIME = "register_time";
  @SerializedName(SERIALIZED_NAME_REGISTER_TIME)
  private String registerTime = null;

  public static final String SERIALIZED_NAME_ROI2_COST = "roi2_cost";
  @SerializedName(SERIALIZED_NAME_ROI2_COST)
  private Long roi2Cost = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Long secondIndustryId = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_NAME = "second_industry_name";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_NAME)
  private String secondIndustryName = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Long statCost = null;

  public static final String SERIALIZED_NAME_TODAY_DTH_COST = "today_dth_cost";
  @SerializedName(SERIALIZED_NAME_TODAY_DTH_COST)
  private Long todayDthCost = null;

  public static final String SERIALIZED_NAME_TODAY_DTH_ROI2_COST = "today_dth_roi2_cost";
  @SerializedName(SERIALIZED_NAME_TODAY_DTH_ROI2_COST)
  private Long todayDthRoi2Cost = null;

  public static final String SERIALIZED_NAME_TODAY_DTH_ROI2_COST_DIFF = "today_dth_roi2_cost_diff";
  @SerializedName(SERIALIZED_NAME_TODAY_DTH_ROI2_COST_DIFF)
  private Long todayDthRoi2CostDiff = null;

  public static final String SERIALIZED_NAME_TODAY_YES_DTH_COST_DIFF = "today_yes_dth_cost_diff";
  @SerializedName(SERIALIZED_NAME_TODAY_YES_DTH_COST_DIFF)
  private Long todayYesDthCostDiff = null;

  public static final String SERIALIZED_NAME_TOTAL_BALANCE = "total_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_BALANCE)
  private Long totalBalance = null;

  public static final String SERIALIZED_NAME_TOTAL_BALANCE_VALID = "total_balance_valid";
  @SerializedName(SERIALIZED_NAME_TOTAL_BALANCE_VALID)
  private Long totalBalanceValid = null;

  public static final String SERIALIZED_NAME_YES_CASH_COST = "yes_cash_cost";
  @SerializedName(SERIALIZED_NAME_YES_CASH_COST)
  private Long yesCashCost = null;

  public static final String SERIALIZED_NAME_YES_COST = "yes_cost";
  @SerializedName(SERIALIZED_NAME_YES_COST)
  private Long yesCost = null;

  public static final String SERIALIZED_NAME_YES_DTH_COST = "yes_dth_cost";
  @SerializedName(SERIALIZED_NAME_YES_DTH_COST)
  private Long yesDthCost = null;

  public static final String SERIALIZED_NAME_YES_DTH_ROI2_COST = "yes_dth_roi2_cost";
  @SerializedName(SERIALIZED_NAME_YES_DTH_ROI2_COST)
  private Long yesDthRoi2Cost = null;

  public static final String SERIALIZED_NAME_YES_GRANT_COST = "yes_grant_cost";
  @SerializedName(SERIALIZED_NAME_YES_GRANT_COST)
  private Long yesGrantCost = null;

  public static final String SERIALIZED_NAME_YES_ROI2_CASH_COST = "yes_roi2_cash_cost";
  @SerializedName(SERIALIZED_NAME_YES_ROI2_CASH_COST)
  private Long yesRoi2CashCost = null;

  public static final String SERIALIZED_NAME_YES_ROI2_COST = "yes_roi2_cost";
  @SerializedName(SERIALIZED_NAME_YES_ROI2_COST)
  private Long yesRoi2Cost = null;

  public static final String SERIALIZED_NAME_YES_ROI2_GRANT_COST = "yes_roi2_grant_cost";
  @SerializedName(SERIALIZED_NAME_YES_ROI2_GRANT_COST)
  private Long yesRoi2GrantCost = null;

  public AgentAdvBiddingListQueryV2ResponseDataDataInner() {
  }

  public AgentAdvBiddingListQueryV2ResponseDataDataInner accountStatus(AgentAdvBiddingListQueryV2DataDataAccountStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  public AgentAdvBiddingListQueryV2DataDataAccountStatus getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(AgentAdvBiddingListQueryV2DataDataAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner advertiserId(Long advertiserId) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner advertiserName(String advertiserName) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner agentId(Long agentId) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner agentName(String agentName) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner agentTransAmount(Long agentTransAmount) {
    
    this.agentTransAmount = agentTransAmount;
    return this;
  }

   /**
   * 转账金额
   * @return agentTransAmount
  **/
  @javax.annotation.Nullable
  public Long getAgentTransAmount() {
    return agentTransAmount;
  }


  public void setAgentTransAmount(Long agentTransAmount) {
    this.agentTransAmount = agentTransAmount;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner agentTransNum(Long agentTransNum) {
    
    this.agentTransNum = agentTransNum;
    return this;
  }

   /**
   * 转账次数
   * @return agentTransNum
  **/
  @javax.annotation.Nullable
  public Long getAgentTransNum() {
    return agentTransNum;
  }


  public void setAgentTransNum(Long agentTransNum) {
    this.agentTransNum = agentTransNum;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner cashCost(Long cashCost) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner companyId(Long companyId) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner companyName(String companyName) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner firstIndustryId(Long firstIndustryId) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner firstIndustryName(String firstIndustryName) {
    
    this.firstIndustryName = firstIndustryName;
    return this;
  }

   /**
   * 广告主账户一级行业名称
   * @return firstIndustryName
  **/
  @javax.annotation.Nullable
  public String getFirstIndustryName() {
    return firstIndustryName;
  }


  public void setFirstIndustryName(String firstIndustryName) {
    this.firstIndustryName = firstIndustryName;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner grantBalance(Long grantBalance) {
    
    this.grantBalance = grantBalance;
    return this;
  }

   /**
   * 总竞价赠款可用余额
   * @return grantBalance
  **/
  @javax.annotation.Nullable
  public Long getGrantBalance() {
    return grantBalance;
  }


  public void setGrantBalance(Long grantBalance) {
    this.grantBalance = grantBalance;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner grantCost(Long grantCost) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner nonGrantBalanceValid(Long nonGrantBalanceValid) {
    
    this.nonGrantBalanceValid = nonGrantBalanceValid;
    return this;
  }

   /**
   * 总竞价非赠款可用余额
   * @return nonGrantBalanceValid
  **/
  @javax.annotation.Nullable
  public Long getNonGrantBalanceValid() {
    return nonGrantBalanceValid;
  }


  public void setNonGrantBalanceValid(Long nonGrantBalanceValid) {
    this.nonGrantBalanceValid = nonGrantBalanceValid;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner registerTime(String registerTime) {
    
    this.registerTime = registerTime;
    return this;
  }

   /**
   * 注册时间
   * @return registerTime
  **/
  @javax.annotation.Nullable
  public String getRegisterTime() {
    return registerTime;
  }


  public void setRegisterTime(String registerTime) {
    this.registerTime = registerTime;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner roi2Cost(Long roi2Cost) {
    
    this.roi2Cost = roi2Cost;
    return this;
  }

   /**
   * 全域推广消耗
   * @return roi2Cost
  **/
  @javax.annotation.Nullable
  public Long getRoi2Cost() {
    return roi2Cost;
  }


  public void setRoi2Cost(Long roi2Cost) {
    this.roi2Cost = roi2Cost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner secondIndustryId(Long secondIndustryId) {
    
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


  public AgentAdvBiddingListQueryV2ResponseDataDataInner secondIndustryName(String secondIndustryName) {
    
    this.secondIndustryName = secondIndustryName;
    return this;
  }

   /**
   * 广告主账户二级行业名称
   * @return secondIndustryName
  **/
  @javax.annotation.Nullable
  public String getSecondIndustryName() {
    return secondIndustryName;
  }


  public void setSecondIndustryName(String secondIndustryName) {
    this.secondIndustryName = secondIndustryName;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner statCost(Long statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 竞价消耗
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Long getStatCost() {
    return statCost;
  }


  public void setStatCost(Long statCost) {
    this.statCost = statCost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner todayDthCost(Long todayDthCost) {
    
    this.todayDthCost = todayDthCost;
    return this;
  }

   /**
   * 今日截止X点竞价消耗
   * @return todayDthCost
  **/
  @javax.annotation.Nullable
  public Long getTodayDthCost() {
    return todayDthCost;
  }


  public void setTodayDthCost(Long todayDthCost) {
    this.todayDthCost = todayDthCost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner todayDthRoi2Cost(Long todayDthRoi2Cost) {
    
    this.todayDthRoi2Cost = todayDthRoi2Cost;
    return this;
  }

   /**
   * 今日截止X点全域推广消耗
   * @return todayDthRoi2Cost
  **/
  @javax.annotation.Nullable
  public Long getTodayDthRoi2Cost() {
    return todayDthRoi2Cost;
  }


  public void setTodayDthRoi2Cost(Long todayDthRoi2Cost) {
    this.todayDthRoi2Cost = todayDthRoi2Cost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner todayDthRoi2CostDiff(Long todayDthRoi2CostDiff) {
    
    this.todayDthRoi2CostDiff = todayDthRoi2CostDiff;
    return this;
  }

   /**
   * 截止X点全域推广消耗升降值
   * @return todayDthRoi2CostDiff
  **/
  @javax.annotation.Nullable
  public Long getTodayDthRoi2CostDiff() {
    return todayDthRoi2CostDiff;
  }


  public void setTodayDthRoi2CostDiff(Long todayDthRoi2CostDiff) {
    this.todayDthRoi2CostDiff = todayDthRoi2CostDiff;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner todayYesDthCostDiff(Long todayYesDthCostDiff) {
    
    this.todayYesDthCostDiff = todayYesDthCostDiff;
    return this;
  }

   /**
   * 截止X点竞价消耗升降值
   * @return todayYesDthCostDiff
  **/
  @javax.annotation.Nullable
  public Long getTodayYesDthCostDiff() {
    return todayYesDthCostDiff;
  }


  public void setTodayYesDthCostDiff(Long todayYesDthCostDiff) {
    this.todayYesDthCostDiff = todayYesDthCostDiff;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner totalBalance(Long totalBalance) {
    
    this.totalBalance = totalBalance;
    return this;
  }

   /**
   * 总余额
   * @return totalBalance
  **/
  @javax.annotation.Nullable
  public Long getTotalBalance() {
    return totalBalance;
  }


  public void setTotalBalance(Long totalBalance) {
    this.totalBalance = totalBalance;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner totalBalanceValid(Long totalBalanceValid) {
    
    this.totalBalanceValid = totalBalanceValid;
    return this;
  }

   /**
   * 总竞价可用余额
   * @return totalBalanceValid
  **/
  @javax.annotation.Nullable
  public Long getTotalBalanceValid() {
    return totalBalanceValid;
  }


  public void setTotalBalanceValid(Long totalBalanceValid) {
    this.totalBalanceValid = totalBalanceValid;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesCashCost(Long yesCashCost) {
    
    this.yesCashCost = yesCashCost;
    return this;
  }

   /**
   * 昨日竞价非赠款消耗
   * @return yesCashCost
  **/
  @javax.annotation.Nullable
  public Long getYesCashCost() {
    return yesCashCost;
  }


  public void setYesCashCost(Long yesCashCost) {
    this.yesCashCost = yesCashCost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesCost(Long yesCost) {
    
    this.yesCost = yesCost;
    return this;
  }

   /**
   * 昨日竞价消耗
   * @return yesCost
  **/
  @javax.annotation.Nullable
  public Long getYesCost() {
    return yesCost;
  }


  public void setYesCost(Long yesCost) {
    this.yesCost = yesCost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesDthCost(Long yesDthCost) {
    
    this.yesDthCost = yesDthCost;
    return this;
  }

   /**
   * 昨日截止X点竞价消耗
   * @return yesDthCost
  **/
  @javax.annotation.Nullable
  public Long getYesDthCost() {
    return yesDthCost;
  }


  public void setYesDthCost(Long yesDthCost) {
    this.yesDthCost = yesDthCost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesDthRoi2Cost(Long yesDthRoi2Cost) {
    
    this.yesDthRoi2Cost = yesDthRoi2Cost;
    return this;
  }

   /**
   * 昨日截止X点全域推广消耗
   * @return yesDthRoi2Cost
  **/
  @javax.annotation.Nullable
  public Long getYesDthRoi2Cost() {
    return yesDthRoi2Cost;
  }


  public void setYesDthRoi2Cost(Long yesDthRoi2Cost) {
    this.yesDthRoi2Cost = yesDthRoi2Cost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesGrantCost(Long yesGrantCost) {
    
    this.yesGrantCost = yesGrantCost;
    return this;
  }

   /**
   * 昨日竞价赠款消耗
   * @return yesGrantCost
  **/
  @javax.annotation.Nullable
  public Long getYesGrantCost() {
    return yesGrantCost;
  }


  public void setYesGrantCost(Long yesGrantCost) {
    this.yesGrantCost = yesGrantCost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesRoi2CashCost(Long yesRoi2CashCost) {
    
    this.yesRoi2CashCost = yesRoi2CashCost;
    return this;
  }

   /**
   * 昨日全域推广消耗非赠款消耗
   * @return yesRoi2CashCost
  **/
  @javax.annotation.Nullable
  public Long getYesRoi2CashCost() {
    return yesRoi2CashCost;
  }


  public void setYesRoi2CashCost(Long yesRoi2CashCost) {
    this.yesRoi2CashCost = yesRoi2CashCost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesRoi2Cost(Long yesRoi2Cost) {
    
    this.yesRoi2Cost = yesRoi2Cost;
    return this;
  }

   /**
   * 昨日全域推广消耗
   * @return yesRoi2Cost
  **/
  @javax.annotation.Nullable
  public Long getYesRoi2Cost() {
    return yesRoi2Cost;
  }


  public void setYesRoi2Cost(Long yesRoi2Cost) {
    this.yesRoi2Cost = yesRoi2Cost;
  }


  public AgentAdvBiddingListQueryV2ResponseDataDataInner yesRoi2GrantCost(Long yesRoi2GrantCost) {
    
    this.yesRoi2GrantCost = yesRoi2GrantCost;
    return this;
  }

   /**
   * 昨日全域推广消耗赠款消耗
   * @return yesRoi2GrantCost
  **/
  @javax.annotation.Nullable
  public Long getYesRoi2GrantCost() {
    return yesRoi2GrantCost;
  }


  public void setYesRoi2GrantCost(Long yesRoi2GrantCost) {
    this.yesRoi2GrantCost = yesRoi2GrantCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvBiddingListQueryV2ResponseDataDataInner agentAdvBiddingListQueryV2ResponseDataDataInner = (AgentAdvBiddingListQueryV2ResponseDataDataInner) o;
    return Objects.equals(this.accountStatus, agentAdvBiddingListQueryV2ResponseDataDataInner.accountStatus) &&
        Objects.equals(this.advertiserId, agentAdvBiddingListQueryV2ResponseDataDataInner.advertiserId) &&
        Objects.equals(this.advertiserName, agentAdvBiddingListQueryV2ResponseDataDataInner.advertiserName) &&
        Objects.equals(this.agentId, agentAdvBiddingListQueryV2ResponseDataDataInner.agentId) &&
        Objects.equals(this.agentName, agentAdvBiddingListQueryV2ResponseDataDataInner.agentName) &&
        Objects.equals(this.agentTransAmount, agentAdvBiddingListQueryV2ResponseDataDataInner.agentTransAmount) &&
        Objects.equals(this.agentTransNum, agentAdvBiddingListQueryV2ResponseDataDataInner.agentTransNum) &&
        Objects.equals(this.cashCost, agentAdvBiddingListQueryV2ResponseDataDataInner.cashCost) &&
        Objects.equals(this.companyId, agentAdvBiddingListQueryV2ResponseDataDataInner.companyId) &&
        Objects.equals(this.companyName, agentAdvBiddingListQueryV2ResponseDataDataInner.companyName) &&
        Objects.equals(this.firstIndustryId, agentAdvBiddingListQueryV2ResponseDataDataInner.firstIndustryId) &&
        Objects.equals(this.firstIndustryName, agentAdvBiddingListQueryV2ResponseDataDataInner.firstIndustryName) &&
        Objects.equals(this.grantBalance, agentAdvBiddingListQueryV2ResponseDataDataInner.grantBalance) &&
        Objects.equals(this.grantCost, agentAdvBiddingListQueryV2ResponseDataDataInner.grantCost) &&
        Objects.equals(this.nonGrantBalanceValid, agentAdvBiddingListQueryV2ResponseDataDataInner.nonGrantBalanceValid) &&
        Objects.equals(this.registerTime, agentAdvBiddingListQueryV2ResponseDataDataInner.registerTime) &&
        Objects.equals(this.roi2Cost, agentAdvBiddingListQueryV2ResponseDataDataInner.roi2Cost) &&
        Objects.equals(this.secondIndustryId, agentAdvBiddingListQueryV2ResponseDataDataInner.secondIndustryId) &&
        Objects.equals(this.secondIndustryName, agentAdvBiddingListQueryV2ResponseDataDataInner.secondIndustryName) &&
        Objects.equals(this.statCost, agentAdvBiddingListQueryV2ResponseDataDataInner.statCost) &&
        Objects.equals(this.todayDthCost, agentAdvBiddingListQueryV2ResponseDataDataInner.todayDthCost) &&
        Objects.equals(this.todayDthRoi2Cost, agentAdvBiddingListQueryV2ResponseDataDataInner.todayDthRoi2Cost) &&
        Objects.equals(this.todayDthRoi2CostDiff, agentAdvBiddingListQueryV2ResponseDataDataInner.todayDthRoi2CostDiff) &&
        Objects.equals(this.todayYesDthCostDiff, agentAdvBiddingListQueryV2ResponseDataDataInner.todayYesDthCostDiff) &&
        Objects.equals(this.totalBalance, agentAdvBiddingListQueryV2ResponseDataDataInner.totalBalance) &&
        Objects.equals(this.totalBalanceValid, agentAdvBiddingListQueryV2ResponseDataDataInner.totalBalanceValid) &&
        Objects.equals(this.yesCashCost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesCashCost) &&
        Objects.equals(this.yesCost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesCost) &&
        Objects.equals(this.yesDthCost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesDthCost) &&
        Objects.equals(this.yesDthRoi2Cost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesDthRoi2Cost) &&
        Objects.equals(this.yesGrantCost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesGrantCost) &&
        Objects.equals(this.yesRoi2CashCost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesRoi2CashCost) &&
        Objects.equals(this.yesRoi2Cost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesRoi2Cost) &&
        Objects.equals(this.yesRoi2GrantCost, agentAdvBiddingListQueryV2ResponseDataDataInner.yesRoi2GrantCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountStatus, advertiserId, advertiserName, agentId, agentName, agentTransAmount, agentTransNum, cashCost, companyId, companyName, firstIndustryId, firstIndustryName, grantBalance, grantCost, nonGrantBalanceValid, registerTime, roi2Cost, secondIndustryId, secondIndustryName, statCost, todayDthCost, todayDthRoi2Cost, todayDthRoi2CostDiff, todayYesDthCostDiff, totalBalance, totalBalanceValid, yesCashCost, yesCost, yesDthCost, yesDthRoi2Cost, yesGrantCost, yesRoi2CashCost, yesRoi2Cost, yesRoi2GrantCost);
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
    sb.append("class AgentAdvBiddingListQueryV2ResponseDataDataInner {\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    agentTransAmount: ").append(toIndentedString(agentTransAmount)).append("\n");
    sb.append("    agentTransNum: ").append(toIndentedString(agentTransNum)).append("\n");
    sb.append("    cashCost: ").append(toIndentedString(cashCost)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    firstIndustryId: ").append(toIndentedString(firstIndustryId)).append("\n");
    sb.append("    firstIndustryName: ").append(toIndentedString(firstIndustryName)).append("\n");
    sb.append("    grantBalance: ").append(toIndentedString(grantBalance)).append("\n");
    sb.append("    grantCost: ").append(toIndentedString(grantCost)).append("\n");
    sb.append("    nonGrantBalanceValid: ").append(toIndentedString(nonGrantBalanceValid)).append("\n");
    sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
    sb.append("    roi2Cost: ").append(toIndentedString(roi2Cost)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    secondIndustryName: ").append(toIndentedString(secondIndustryName)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    todayDthCost: ").append(toIndentedString(todayDthCost)).append("\n");
    sb.append("    todayDthRoi2Cost: ").append(toIndentedString(todayDthRoi2Cost)).append("\n");
    sb.append("    todayDthRoi2CostDiff: ").append(toIndentedString(todayDthRoi2CostDiff)).append("\n");
    sb.append("    todayYesDthCostDiff: ").append(toIndentedString(todayYesDthCostDiff)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
    sb.append("    totalBalanceValid: ").append(toIndentedString(totalBalanceValid)).append("\n");
    sb.append("    yesCashCost: ").append(toIndentedString(yesCashCost)).append("\n");
    sb.append("    yesCost: ").append(toIndentedString(yesCost)).append("\n");
    sb.append("    yesDthCost: ").append(toIndentedString(yesDthCost)).append("\n");
    sb.append("    yesDthRoi2Cost: ").append(toIndentedString(yesDthRoi2Cost)).append("\n");
    sb.append("    yesGrantCost: ").append(toIndentedString(yesGrantCost)).append("\n");
    sb.append("    yesRoi2CashCost: ").append(toIndentedString(yesRoi2CashCost)).append("\n");
    sb.append("    yesRoi2Cost: ").append(toIndentedString(yesRoi2Cost)).append("\n");
    sb.append("    yesRoi2GrantCost: ").append(toIndentedString(yesRoi2GrantCost)).append("\n");
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
    openapiFields.add("agent_trans_amount");
    openapiFields.add("agent_trans_num");
    openapiFields.add("cash_cost");
    openapiFields.add("company_id");
    openapiFields.add("company_name");
    openapiFields.add("first_industry_id");
    openapiFields.add("first_industry_name");
    openapiFields.add("grant_balance");
    openapiFields.add("grant_cost");
    openapiFields.add("non_grant_balance_valid");
    openapiFields.add("register_time");
    openapiFields.add("roi2_cost");
    openapiFields.add("second_industry_id");
    openapiFields.add("second_industry_name");
    openapiFields.add("stat_cost");
    openapiFields.add("today_dth_cost");
    openapiFields.add("today_dth_roi2_cost");
    openapiFields.add("today_dth_roi2_cost_diff");
    openapiFields.add("today_yes_dth_cost_diff");
    openapiFields.add("total_balance");
    openapiFields.add("total_balance_valid");
    openapiFields.add("yes_cash_cost");
    openapiFields.add("yes_cost");
    openapiFields.add("yes_dth_cost");
    openapiFields.add("yes_dth_roi2_cost");
    openapiFields.add("yes_grant_cost");
    openapiFields.add("yes_roi2_cash_cost");
    openapiFields.add("yes_roi2_cost");
    openapiFields.add("yes_roi2_grant_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvBiddingListQueryV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvBiddingListQueryV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvBiddingListQueryV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvBiddingListQueryV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvBiddingListQueryV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, AgentAdvBiddingListQueryV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvBiddingListQueryV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvBiddingListQueryV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvBiddingListQueryV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to AgentAdvBiddingListQueryV2ResponseDataDataInner
  */
  public static AgentAdvBiddingListQueryV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvBiddingListQueryV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of AgentAdvBiddingListQueryV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

