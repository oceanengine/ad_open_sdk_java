/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentCompanyBiddingListQueryV2ResponseDataDataInnerCollaboratorsInner;
import com.bytedance.ads.model.AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner;
import com.bytedance.ads.model.AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizersInner;
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
 * AgentCompanyBiddingListQueryV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class AgentCompanyBiddingListQueryV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_COLLABORATORS = "collaborators";
  @SerializedName(SERIALIZED_NAME_COLLABORATORS)
  private List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerCollaboratorsInner> collaborators = null;

  public static final String SERIALIZED_NAME_COMPANY_ALL_AUDIT_ADV_CNT = "company_all_audit_adv_cnt";
  @SerializedName(SERIALIZED_NAME_COMPANY_ALL_AUDIT_ADV_CNT)
  private Long companyAllAuditAdvCnt = null;

  public static final String SERIALIZED_NAME_COMPANY_AUDIT_ADV_CNT = "company_audit_adv_cnt";
  @SerializedName(SERIALIZED_NAME_COMPANY_AUDIT_ADV_CNT)
  private Long companyAuditAdvCnt = null;

  public static final String SERIALIZED_NAME_COMPANY_BALANCE = "company_balance";
  @SerializedName(SERIALIZED_NAME_COMPANY_BALANCE)
  private Long companyBalance = null;

  public static final String SERIALIZED_NAME_COMPANY_GRANT_BALANCE = "company_grant_balance";
  @SerializedName(SERIALIZED_NAME_COMPANY_GRANT_BALANCE)
  private Long companyGrantBalance = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_COMPANY_LAST_RENEW_DATE = "company_last_renew_date";
  @SerializedName(SERIALIZED_NAME_COMPANY_LAST_RENEW_DATE)
  private String companyLastRenewDate = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_COMPANY_NON_GRANT_BALANCE = "company_non_grant_balance";
  @SerializedName(SERIALIZED_NAME_COMPANY_NON_GRANT_BALANCE)
  private Long companyNonGrantBalance = null;

  public static final String SERIALIZED_NAME_COMPANY_RENEW_AMOUNT = "company_renew_amount";
  @SerializedName(SERIALIZED_NAME_COMPANY_RENEW_AMOUNT)
  private Long companyRenewAmount = null;

  public static final String SERIALIZED_NAME_COMPANY_RENEW_NUM = "company_renew_num";
  @SerializedName(SERIALIZED_NAME_COMPANY_RENEW_NUM)
  private Long companyRenewNum = null;

  public static final String SERIALIZED_NAME_COMPANY_TRANS_AMOUNT = "company_trans_amount";
  @SerializedName(SERIALIZED_NAME_COMPANY_TRANS_AMOUNT)
  private Long companyTransAmount = null;

  public static final String SERIALIZED_NAME_COMPANY_TRANS_NUM = "company_trans_num";
  @SerializedName(SERIALIZED_NAME_COMPANY_TRANS_NUM)
  private Long companyTransNum = null;

  public static final String SERIALIZED_NAME_COMPANY_VALID_BALANCE = "company_valid_balance";
  @SerializedName(SERIALIZED_NAME_COMPANY_VALID_BALANCE)
  private Long companyValidBalance = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_DEPARTMENTS = "optimizer_departments";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_DEPARTMENTS)
  private List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner> optimizerDepartments = null;

  public static final String SERIALIZED_NAME_OPTIMIZERS = "optimizers";
  @SerializedName(SERIALIZED_NAME_OPTIMIZERS)
  private List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizersInner> optimizers = null;

  public static final String SERIALIZED_NAME_ROI2_CASH_COST = "roi2_cash_cost";
  @SerializedName(SERIALIZED_NAME_ROI2_CASH_COST)
  private Long roi2CashCost = null;

  public static final String SERIALIZED_NAME_ROI2_COST = "roi2_cost";
  @SerializedName(SERIALIZED_NAME_ROI2_COST)
  private Long roi2Cost = null;

  public static final String SERIALIZED_NAME_ROI2_GRANT_COST = "roi2_grant_cost";
  @SerializedName(SERIALIZED_NAME_ROI2_GRANT_COST)
  private Long roi2GrantCost = null;

  public static final String SERIALIZED_NAME_STANDARD_CASH_COST = "standard_cash_cost";
  @SerializedName(SERIALIZED_NAME_STANDARD_CASH_COST)
  private Long standardCashCost = null;

  public static final String SERIALIZED_NAME_STANDARD_COST = "standard_cost";
  @SerializedName(SERIALIZED_NAME_STANDARD_COST)
  private Long standardCost = null;

  public static final String SERIALIZED_NAME_STANDARD_GRANT_COST = "standard_grant_cost";
  @SerializedName(SERIALIZED_NAME_STANDARD_GRANT_COST)
  private Long standardGrantCost = null;

  public static final String SERIALIZED_NAME_TODAY_DTH_ROI2_COST = "today_dth_roi2_cost";
  @SerializedName(SERIALIZED_NAME_TODAY_DTH_ROI2_COST)
  private Long todayDthRoi2Cost = null;

  public static final String SERIALIZED_NAME_TODAY_DTH_ROI2_COST_DIFF = "today_dth_roi2_cost_diff";
  @SerializedName(SERIALIZED_NAME_TODAY_DTH_ROI2_COST_DIFF)
  private String todayDthRoi2CostDiff = null;

  public static final String SERIALIZED_NAME_TODAY_DTH_STANDARD_COST = "today_dth_standard_cost";
  @SerializedName(SERIALIZED_NAME_TODAY_DTH_STANDARD_COST)
  private Long todayDthStandardCost = null;

  public static final String SERIALIZED_NAME_TODAY_DTH_STANDARD_COST_DIFF = "today_dth_standard_cost_diff";
  @SerializedName(SERIALIZED_NAME_TODAY_DTH_STANDARD_COST_DIFF)
  private Long todayDthStandardCostDiff = null;

  public static final String SERIALIZED_NAME_YES_DTH_ROI2_COST = "yes_dth_roi2_cost";
  @SerializedName(SERIALIZED_NAME_YES_DTH_ROI2_COST)
  private String yesDthRoi2Cost = null;

  public static final String SERIALIZED_NAME_YES_DTH_STANDARD_COST = "yes_dth_standard_cost";
  @SerializedName(SERIALIZED_NAME_YES_DTH_STANDARD_COST)
  private Long yesDthStandardCost = null;

  public static final String SERIALIZED_NAME_YES_ROI2_CASH_COST = "yes_roi2_cash_cost";
  @SerializedName(SERIALIZED_NAME_YES_ROI2_CASH_COST)
  private String yesRoi2CashCost = null;

  public static final String SERIALIZED_NAME_YES_ROI2_COST = "yes_roi2_cost";
  @SerializedName(SERIALIZED_NAME_YES_ROI2_COST)
  private Long yesRoi2Cost = null;

  public static final String SERIALIZED_NAME_YES_ROI2_GRANT_COST = "yes_roi2_grant_cost";
  @SerializedName(SERIALIZED_NAME_YES_ROI2_GRANT_COST)
  private String yesRoi2GrantCost = null;

  public static final String SERIALIZED_NAME_YES_STANDARD_CASH_COST = "yes_standard_cash_cost";
  @SerializedName(SERIALIZED_NAME_YES_STANDARD_CASH_COST)
  private Long yesStandardCashCost = null;

  public static final String SERIALIZED_NAME_YES_STANDARD_COST = "yes_standard_cost";
  @SerializedName(SERIALIZED_NAME_YES_STANDARD_COST)
  private Long yesStandardCost = null;

  public static final String SERIALIZED_NAME_YES_STANDARD_GRANT_COST = "yes_standard_grant_cost";
  @SerializedName(SERIALIZED_NAME_YES_STANDARD_GRANT_COST)
  private Long yesStandardGrantCost = null;

  public AgentCompanyBiddingListQueryV2ResponseDataDataInner() {
  }

  public AgentCompanyBiddingListQueryV2ResponseDataDataInner collaborators(List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerCollaboratorsInner> collaborators) {
    
    this.collaborators = collaborators;
    return this;
  }

  public AgentCompanyBiddingListQueryV2ResponseDataDataInner addCollaboratorsItem(AgentCompanyBiddingListQueryV2ResponseDataDataInnerCollaboratorsInner collaboratorsItem) {
    if (this.collaborators == null) {
      this.collaborators = new ArrayList<>();
    }
    this.collaborators.add(collaboratorsItem);
    return this;
  }

   /**
   * 协作者
   * @return collaborators
  **/
  @javax.annotation.Nullable
  public List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerCollaboratorsInner> getCollaborators() {
    return collaborators;
  }


  public void setCollaborators(List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerCollaboratorsInner> collaborators) {
    this.collaborators = collaborators;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyAllAuditAdvCnt(Long companyAllAuditAdvCnt) {
    
    this.companyAllAuditAdvCnt = companyAllAuditAdvCnt;
    return this;
  }

   /**
   * 已审核账户数
   * @return companyAllAuditAdvCnt
  **/
  @javax.annotation.Nullable
  public Long getCompanyAllAuditAdvCnt() {
    return companyAllAuditAdvCnt;
  }


  public void setCompanyAllAuditAdvCnt(Long companyAllAuditAdvCnt) {
    this.companyAllAuditAdvCnt = companyAllAuditAdvCnt;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyAuditAdvCnt(Long companyAuditAdvCnt) {
    
    this.companyAuditAdvCnt = companyAuditAdvCnt;
    return this;
  }

   /**
   * 可见已审账户数
   * @return companyAuditAdvCnt
  **/
  @javax.annotation.Nullable
  public Long getCompanyAuditAdvCnt() {
    return companyAuditAdvCnt;
  }


  public void setCompanyAuditAdvCnt(Long companyAuditAdvCnt) {
    this.companyAuditAdvCnt = companyAuditAdvCnt;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyBalance(Long companyBalance) {
    
    this.companyBalance = companyBalance;
    return this;
  }

   /**
   * 总余额
   * @return companyBalance
  **/
  @javax.annotation.Nullable
  public Long getCompanyBalance() {
    return companyBalance;
  }


  public void setCompanyBalance(Long companyBalance) {
    this.companyBalance = companyBalance;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyGrantBalance(Long companyGrantBalance) {
    
    this.companyGrantBalance = companyGrantBalance;
    return this;
  }

   /**
   * 总竞价赠款可用余额
   * @return companyGrantBalance
  **/
  @javax.annotation.Nullable
  public Long getCompanyGrantBalance() {
    return companyGrantBalance;
  }


  public void setCompanyGrantBalance(Long companyGrantBalance) {
    this.companyGrantBalance = companyGrantBalance;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyId(Long companyId) {
    
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


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyLastRenewDate(String companyLastRenewDate) {
    
    this.companyLastRenewDate = companyLastRenewDate;
    return this;
  }

   /**
   * 最近一次续费日期
   * @return companyLastRenewDate
  **/
  @javax.annotation.Nullable
  public String getCompanyLastRenewDate() {
    return companyLastRenewDate;
  }


  public void setCompanyLastRenewDate(String companyLastRenewDate) {
    this.companyLastRenewDate = companyLastRenewDate;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyName(String companyName) {
    
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


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyNonGrantBalance(Long companyNonGrantBalance) {
    
    this.companyNonGrantBalance = companyNonGrantBalance;
    return this;
  }

   /**
   * 总竞价非赠款可用余额
   * @return companyNonGrantBalance
  **/
  @javax.annotation.Nullable
  public Long getCompanyNonGrantBalance() {
    return companyNonGrantBalance;
  }


  public void setCompanyNonGrantBalance(Long companyNonGrantBalance) {
    this.companyNonGrantBalance = companyNonGrantBalance;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyRenewAmount(Long companyRenewAmount) {
    
    this.companyRenewAmount = companyRenewAmount;
    return this;
  }

   /**
   * 续费金额
   * @return companyRenewAmount
  **/
  @javax.annotation.Nullable
  public Long getCompanyRenewAmount() {
    return companyRenewAmount;
  }


  public void setCompanyRenewAmount(Long companyRenewAmount) {
    this.companyRenewAmount = companyRenewAmount;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyRenewNum(Long companyRenewNum) {
    
    this.companyRenewNum = companyRenewNum;
    return this;
  }

   /**
   * 续费次数
   * @return companyRenewNum
  **/
  @javax.annotation.Nullable
  public Long getCompanyRenewNum() {
    return companyRenewNum;
  }


  public void setCompanyRenewNum(Long companyRenewNum) {
    this.companyRenewNum = companyRenewNum;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyTransAmount(Long companyTransAmount) {
    
    this.companyTransAmount = companyTransAmount;
    return this;
  }

   /**
   * 转账金额
   * @return companyTransAmount
  **/
  @javax.annotation.Nullable
  public Long getCompanyTransAmount() {
    return companyTransAmount;
  }


  public void setCompanyTransAmount(Long companyTransAmount) {
    this.companyTransAmount = companyTransAmount;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyTransNum(Long companyTransNum) {
    
    this.companyTransNum = companyTransNum;
    return this;
  }

   /**
   * 转账次数
   * @return companyTransNum
  **/
  @javax.annotation.Nullable
  public Long getCompanyTransNum() {
    return companyTransNum;
  }


  public void setCompanyTransNum(Long companyTransNum) {
    this.companyTransNum = companyTransNum;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner companyValidBalance(Long companyValidBalance) {
    
    this.companyValidBalance = companyValidBalance;
    return this;
  }

   /**
   * 总竞价可用余额
   * @return companyValidBalance
  **/
  @javax.annotation.Nullable
  public Long getCompanyValidBalance() {
    return companyValidBalance;
  }


  public void setCompanyValidBalance(Long companyValidBalance) {
    this.companyValidBalance = companyValidBalance;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner optimizerDepartments(List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner> optimizerDepartments) {
    
    this.optimizerDepartments = optimizerDepartments;
    return this;
  }

  public AgentCompanyBiddingListQueryV2ResponseDataDataInner addOptimizerDepartmentsItem(AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner optimizerDepartmentsItem) {
    if (this.optimizerDepartments == null) {
      this.optimizerDepartments = new ArrayList<>();
    }
    this.optimizerDepartments.add(optimizerDepartmentsItem);
    return this;
  }

   /**
   * 
   * @return optimizerDepartments
  **/
  @javax.annotation.Nullable
  public List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner> getOptimizerDepartments() {
    return optimizerDepartments;
  }


  public void setOptimizerDepartments(List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner> optimizerDepartments) {
    this.optimizerDepartments = optimizerDepartments;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner optimizers(List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizersInner> optimizers) {
    
    this.optimizers = optimizers;
    return this;
  }

  public AgentCompanyBiddingListQueryV2ResponseDataDataInner addOptimizersItem(AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizersInner optimizersItem) {
    if (this.optimizers == null) {
      this.optimizers = new ArrayList<>();
    }
    this.optimizers.add(optimizersItem);
    return this;
  }

   /**
   * 负责人
   * @return optimizers
  **/
  @javax.annotation.Nullable
  public List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizersInner> getOptimizers() {
    return optimizers;
  }


  public void setOptimizers(List<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizersInner> optimizers) {
    this.optimizers = optimizers;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner roi2CashCost(Long roi2CashCost) {
    
    this.roi2CashCost = roi2CashCost;
    return this;
  }

   /**
   * 全域推广非赠款消耗
   * @return roi2CashCost
  **/
  @javax.annotation.Nullable
  public Long getRoi2CashCost() {
    return roi2CashCost;
  }


  public void setRoi2CashCost(Long roi2CashCost) {
    this.roi2CashCost = roi2CashCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner roi2Cost(Long roi2Cost) {
    
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


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner roi2GrantCost(Long roi2GrantCost) {
    
    this.roi2GrantCost = roi2GrantCost;
    return this;
  }

   /**
   * 全域推广赠款消耗
   * @return roi2GrantCost
  **/
  @javax.annotation.Nullable
  public Long getRoi2GrantCost() {
    return roi2GrantCost;
  }


  public void setRoi2GrantCost(Long roi2GrantCost) {
    this.roi2GrantCost = roi2GrantCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner standardCashCost(Long standardCashCost) {
    
    this.standardCashCost = standardCashCost;
    return this;
  }

   /**
   * 标准推广非赠款消耗
   * @return standardCashCost
  **/
  @javax.annotation.Nullable
  public Long getStandardCashCost() {
    return standardCashCost;
  }


  public void setStandardCashCost(Long standardCashCost) {
    this.standardCashCost = standardCashCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner standardCost(Long standardCost) {
    
    this.standardCost = standardCost;
    return this;
  }

   /**
   * 标准推广消耗
   * @return standardCost
  **/
  @javax.annotation.Nullable
  public Long getStandardCost() {
    return standardCost;
  }


  public void setStandardCost(Long standardCost) {
    this.standardCost = standardCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner standardGrantCost(Long standardGrantCost) {
    
    this.standardGrantCost = standardGrantCost;
    return this;
  }

   /**
   * 标准推广赠款消耗
   * @return standardGrantCost
  **/
  @javax.annotation.Nullable
  public Long getStandardGrantCost() {
    return standardGrantCost;
  }


  public void setStandardGrantCost(Long standardGrantCost) {
    this.standardGrantCost = standardGrantCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner todayDthRoi2Cost(Long todayDthRoi2Cost) {
    
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


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner todayDthRoi2CostDiff(String todayDthRoi2CostDiff) {
    
    this.todayDthRoi2CostDiff = todayDthRoi2CostDiff;
    return this;
  }

   /**
   * 截止X点全域推广消耗升降值
   * @return todayDthRoi2CostDiff
  **/
  @javax.annotation.Nullable
  public String getTodayDthRoi2CostDiff() {
    return todayDthRoi2CostDiff;
  }


  public void setTodayDthRoi2CostDiff(String todayDthRoi2CostDiff) {
    this.todayDthRoi2CostDiff = todayDthRoi2CostDiff;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner todayDthStandardCost(Long todayDthStandardCost) {
    
    this.todayDthStandardCost = todayDthStandardCost;
    return this;
  }

   /**
   * 今日截止X点标准推广消耗
   * @return todayDthStandardCost
  **/
  @javax.annotation.Nullable
  public Long getTodayDthStandardCost() {
    return todayDthStandardCost;
  }


  public void setTodayDthStandardCost(Long todayDthStandardCost) {
    this.todayDthStandardCost = todayDthStandardCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner todayDthStandardCostDiff(Long todayDthStandardCostDiff) {
    
    this.todayDthStandardCostDiff = todayDthStandardCostDiff;
    return this;
  }

   /**
   * 截止X点标准推广消耗升降值
   * @return todayDthStandardCostDiff
  **/
  @javax.annotation.Nullable
  public Long getTodayDthStandardCostDiff() {
    return todayDthStandardCostDiff;
  }


  public void setTodayDthStandardCostDiff(Long todayDthStandardCostDiff) {
    this.todayDthStandardCostDiff = todayDthStandardCostDiff;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesDthRoi2Cost(String yesDthRoi2Cost) {
    
    this.yesDthRoi2Cost = yesDthRoi2Cost;
    return this;
  }

   /**
   * 昨日截止X点全域推广消耗
   * @return yesDthRoi2Cost
  **/
  @javax.annotation.Nullable
  public String getYesDthRoi2Cost() {
    return yesDthRoi2Cost;
  }


  public void setYesDthRoi2Cost(String yesDthRoi2Cost) {
    this.yesDthRoi2Cost = yesDthRoi2Cost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesDthStandardCost(Long yesDthStandardCost) {
    
    this.yesDthStandardCost = yesDthStandardCost;
    return this;
  }

   /**
   * 昨日截止X点标准推广消耗
   * @return yesDthStandardCost
  **/
  @javax.annotation.Nullable
  public Long getYesDthStandardCost() {
    return yesDthStandardCost;
  }


  public void setYesDthStandardCost(Long yesDthStandardCost) {
    this.yesDthStandardCost = yesDthStandardCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesRoi2CashCost(String yesRoi2CashCost) {
    
    this.yesRoi2CashCost = yesRoi2CashCost;
    return this;
  }

   /**
   * 昨日全域推广消耗非赠款消耗
   * @return yesRoi2CashCost
  **/
  @javax.annotation.Nullable
  public String getYesRoi2CashCost() {
    return yesRoi2CashCost;
  }


  public void setYesRoi2CashCost(String yesRoi2CashCost) {
    this.yesRoi2CashCost = yesRoi2CashCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesRoi2Cost(Long yesRoi2Cost) {
    
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


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesRoi2GrantCost(String yesRoi2GrantCost) {
    
    this.yesRoi2GrantCost = yesRoi2GrantCost;
    return this;
  }

   /**
   * 昨日全域推广消耗赠款消耗
   * @return yesRoi2GrantCost
  **/
  @javax.annotation.Nullable
  public String getYesRoi2GrantCost() {
    return yesRoi2GrantCost;
  }


  public void setYesRoi2GrantCost(String yesRoi2GrantCost) {
    this.yesRoi2GrantCost = yesRoi2GrantCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesStandardCashCost(Long yesStandardCashCost) {
    
    this.yesStandardCashCost = yesStandardCashCost;
    return this;
  }

   /**
   * 昨日标准推广非赠款消耗
   * @return yesStandardCashCost
  **/
  @javax.annotation.Nullable
  public Long getYesStandardCashCost() {
    return yesStandardCashCost;
  }


  public void setYesStandardCashCost(Long yesStandardCashCost) {
    this.yesStandardCashCost = yesStandardCashCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesStandardCost(Long yesStandardCost) {
    
    this.yesStandardCost = yesStandardCost;
    return this;
  }

   /**
   * 昨日标准推广消耗
   * @return yesStandardCost
  **/
  @javax.annotation.Nullable
  public Long getYesStandardCost() {
    return yesStandardCost;
  }


  public void setYesStandardCost(Long yesStandardCost) {
    this.yesStandardCost = yesStandardCost;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInner yesStandardGrantCost(Long yesStandardGrantCost) {
    
    this.yesStandardGrantCost = yesStandardGrantCost;
    return this;
  }

   /**
   * 昨日标准推广赠款消耗
   * @return yesStandardGrantCost
  **/
  @javax.annotation.Nullable
  public Long getYesStandardGrantCost() {
    return yesStandardGrantCost;
  }


  public void setYesStandardGrantCost(Long yesStandardGrantCost) {
    this.yesStandardGrantCost = yesStandardGrantCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCompanyBiddingListQueryV2ResponseDataDataInner agentCompanyBiddingListQueryV2ResponseDataDataInner = (AgentCompanyBiddingListQueryV2ResponseDataDataInner) o;
    return Objects.equals(this.collaborators, agentCompanyBiddingListQueryV2ResponseDataDataInner.collaborators) &&
        Objects.equals(this.companyAllAuditAdvCnt, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyAllAuditAdvCnt) &&
        Objects.equals(this.companyAuditAdvCnt, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyAuditAdvCnt) &&
        Objects.equals(this.companyBalance, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyBalance) &&
        Objects.equals(this.companyGrantBalance, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyGrantBalance) &&
        Objects.equals(this.companyId, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyId) &&
        Objects.equals(this.companyLastRenewDate, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyLastRenewDate) &&
        Objects.equals(this.companyName, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyName) &&
        Objects.equals(this.companyNonGrantBalance, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyNonGrantBalance) &&
        Objects.equals(this.companyRenewAmount, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyRenewAmount) &&
        Objects.equals(this.companyRenewNum, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyRenewNum) &&
        Objects.equals(this.companyTransAmount, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyTransAmount) &&
        Objects.equals(this.companyTransNum, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyTransNum) &&
        Objects.equals(this.companyValidBalance, agentCompanyBiddingListQueryV2ResponseDataDataInner.companyValidBalance) &&
        Objects.equals(this.optimizerDepartments, agentCompanyBiddingListQueryV2ResponseDataDataInner.optimizerDepartments) &&
        Objects.equals(this.optimizers, agentCompanyBiddingListQueryV2ResponseDataDataInner.optimizers) &&
        Objects.equals(this.roi2CashCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.roi2CashCost) &&
        Objects.equals(this.roi2Cost, agentCompanyBiddingListQueryV2ResponseDataDataInner.roi2Cost) &&
        Objects.equals(this.roi2GrantCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.roi2GrantCost) &&
        Objects.equals(this.standardCashCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.standardCashCost) &&
        Objects.equals(this.standardCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.standardCost) &&
        Objects.equals(this.standardGrantCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.standardGrantCost) &&
        Objects.equals(this.todayDthRoi2Cost, agentCompanyBiddingListQueryV2ResponseDataDataInner.todayDthRoi2Cost) &&
        Objects.equals(this.todayDthRoi2CostDiff, agentCompanyBiddingListQueryV2ResponseDataDataInner.todayDthRoi2CostDiff) &&
        Objects.equals(this.todayDthStandardCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.todayDthStandardCost) &&
        Objects.equals(this.todayDthStandardCostDiff, agentCompanyBiddingListQueryV2ResponseDataDataInner.todayDthStandardCostDiff) &&
        Objects.equals(this.yesDthRoi2Cost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesDthRoi2Cost) &&
        Objects.equals(this.yesDthStandardCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesDthStandardCost) &&
        Objects.equals(this.yesRoi2CashCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesRoi2CashCost) &&
        Objects.equals(this.yesRoi2Cost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesRoi2Cost) &&
        Objects.equals(this.yesRoi2GrantCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesRoi2GrantCost) &&
        Objects.equals(this.yesStandardCashCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesStandardCashCost) &&
        Objects.equals(this.yesStandardCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesStandardCost) &&
        Objects.equals(this.yesStandardGrantCost, agentCompanyBiddingListQueryV2ResponseDataDataInner.yesStandardGrantCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(collaborators, companyAllAuditAdvCnt, companyAuditAdvCnt, companyBalance, companyGrantBalance, companyId, companyLastRenewDate, companyName, companyNonGrantBalance, companyRenewAmount, companyRenewNum, companyTransAmount, companyTransNum, companyValidBalance, optimizerDepartments, optimizers, roi2CashCost, roi2Cost, roi2GrantCost, standardCashCost, standardCost, standardGrantCost, todayDthRoi2Cost, todayDthRoi2CostDiff, todayDthStandardCost, todayDthStandardCostDiff, yesDthRoi2Cost, yesDthStandardCost, yesRoi2CashCost, yesRoi2Cost, yesRoi2GrantCost, yesStandardCashCost, yesStandardCost, yesStandardGrantCost);
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
    sb.append("class AgentCompanyBiddingListQueryV2ResponseDataDataInner {\n");
    sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
    sb.append("    companyAllAuditAdvCnt: ").append(toIndentedString(companyAllAuditAdvCnt)).append("\n");
    sb.append("    companyAuditAdvCnt: ").append(toIndentedString(companyAuditAdvCnt)).append("\n");
    sb.append("    companyBalance: ").append(toIndentedString(companyBalance)).append("\n");
    sb.append("    companyGrantBalance: ").append(toIndentedString(companyGrantBalance)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyLastRenewDate: ").append(toIndentedString(companyLastRenewDate)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyNonGrantBalance: ").append(toIndentedString(companyNonGrantBalance)).append("\n");
    sb.append("    companyRenewAmount: ").append(toIndentedString(companyRenewAmount)).append("\n");
    sb.append("    companyRenewNum: ").append(toIndentedString(companyRenewNum)).append("\n");
    sb.append("    companyTransAmount: ").append(toIndentedString(companyTransAmount)).append("\n");
    sb.append("    companyTransNum: ").append(toIndentedString(companyTransNum)).append("\n");
    sb.append("    companyValidBalance: ").append(toIndentedString(companyValidBalance)).append("\n");
    sb.append("    optimizerDepartments: ").append(toIndentedString(optimizerDepartments)).append("\n");
    sb.append("    optimizers: ").append(toIndentedString(optimizers)).append("\n");
    sb.append("    roi2CashCost: ").append(toIndentedString(roi2CashCost)).append("\n");
    sb.append("    roi2Cost: ").append(toIndentedString(roi2Cost)).append("\n");
    sb.append("    roi2GrantCost: ").append(toIndentedString(roi2GrantCost)).append("\n");
    sb.append("    standardCashCost: ").append(toIndentedString(standardCashCost)).append("\n");
    sb.append("    standardCost: ").append(toIndentedString(standardCost)).append("\n");
    sb.append("    standardGrantCost: ").append(toIndentedString(standardGrantCost)).append("\n");
    sb.append("    todayDthRoi2Cost: ").append(toIndentedString(todayDthRoi2Cost)).append("\n");
    sb.append("    todayDthRoi2CostDiff: ").append(toIndentedString(todayDthRoi2CostDiff)).append("\n");
    sb.append("    todayDthStandardCost: ").append(toIndentedString(todayDthStandardCost)).append("\n");
    sb.append("    todayDthStandardCostDiff: ").append(toIndentedString(todayDthStandardCostDiff)).append("\n");
    sb.append("    yesDthRoi2Cost: ").append(toIndentedString(yesDthRoi2Cost)).append("\n");
    sb.append("    yesDthStandardCost: ").append(toIndentedString(yesDthStandardCost)).append("\n");
    sb.append("    yesRoi2CashCost: ").append(toIndentedString(yesRoi2CashCost)).append("\n");
    sb.append("    yesRoi2Cost: ").append(toIndentedString(yesRoi2Cost)).append("\n");
    sb.append("    yesRoi2GrantCost: ").append(toIndentedString(yesRoi2GrantCost)).append("\n");
    sb.append("    yesStandardCashCost: ").append(toIndentedString(yesStandardCashCost)).append("\n");
    sb.append("    yesStandardCost: ").append(toIndentedString(yesStandardCost)).append("\n");
    sb.append("    yesStandardGrantCost: ").append(toIndentedString(yesStandardGrantCost)).append("\n");
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
    openapiFields.add("collaborators");
    openapiFields.add("company_all_audit_adv_cnt");
    openapiFields.add("company_audit_adv_cnt");
    openapiFields.add("company_balance");
    openapiFields.add("company_grant_balance");
    openapiFields.add("company_id");
    openapiFields.add("company_last_renew_date");
    openapiFields.add("company_name");
    openapiFields.add("company_non_grant_balance");
    openapiFields.add("company_renew_amount");
    openapiFields.add("company_renew_num");
    openapiFields.add("company_trans_amount");
    openapiFields.add("company_trans_num");
    openapiFields.add("company_valid_balance");
    openapiFields.add("optimizer_departments");
    openapiFields.add("optimizers");
    openapiFields.add("roi2_cash_cost");
    openapiFields.add("roi2_cost");
    openapiFields.add("roi2_grant_cost");
    openapiFields.add("standard_cash_cost");
    openapiFields.add("standard_cost");
    openapiFields.add("standard_grant_cost");
    openapiFields.add("today_dth_roi2_cost");
    openapiFields.add("today_dth_roi2_cost_diff");
    openapiFields.add("today_dth_standard_cost");
    openapiFields.add("today_dth_standard_cost_diff");
    openapiFields.add("yes_dth_roi2_cost");
    openapiFields.add("yes_dth_standard_cost");
    openapiFields.add("yes_roi2_cash_cost");
    openapiFields.add("yes_roi2_cost");
    openapiFields.add("yes_roi2_grant_cost");
    openapiFields.add("yes_standard_cash_cost");
    openapiFields.add("yes_standard_cost");
    openapiFields.add("yes_standard_grant_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentCompanyBiddingListQueryV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentCompanyBiddingListQueryV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentCompanyBiddingListQueryV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentCompanyBiddingListQueryV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentCompanyBiddingListQueryV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, AgentCompanyBiddingListQueryV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentCompanyBiddingListQueryV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentCompanyBiddingListQueryV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentCompanyBiddingListQueryV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to AgentCompanyBiddingListQueryV2ResponseDataDataInner
  */
  public static AgentCompanyBiddingListQueryV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentCompanyBiddingListQueryV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of AgentCompanyBiddingListQueryV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

