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
 * ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Double active = null;

  public static final String SERIALIZED_NAME_ACTIVE_COST = "active_cost";
  @SerializedName(SERIALIZED_NAME_ACTIVE_COST)
  private Double activeCost = null;

  public static final String SERIALIZED_NAME_ACTIVE_PAY = "active_pay";
  @SerializedName(SERIALIZED_NAME_ACTIVE_PAY)
  private Double activePay = null;

  public static final String SERIALIZED_NAME_ACTIVE_PAY_COST = "active_pay_cost";
  @SerializedName(SERIALIZED_NAME_ACTIVE_PAY_COST)
  private Double activePayCost = null;

  public static final String SERIALIZED_NAME_ACTIVE_PAY_RATE = "active_pay_rate";
  @SerializedName(SERIALIZED_NAME_ACTIVE_PAY_RATE)
  private Double activePayRate = null;

  public static final String SERIALIZED_NAME_ACTIVE_REGISTER = "active_register";
  @SerializedName(SERIALIZED_NAME_ACTIVE_REGISTER)
  private Double activeRegister = null;

  public static final String SERIALIZED_NAME_ACTIVE_REGISTER_COST = "active_register_cost";
  @SerializedName(SERIALIZED_NAME_ACTIVE_REGISTER_COST)
  private Double activeRegisterCost = null;

  public static final String SERIALIZED_NAME_ACTIVE_REGISTER_RATE = "active_register_rate";
  @SerializedName(SERIALIZED_NAME_ACTIVE_REGISTER_RATE)
  private Double activeRegisterRate = null;

  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Double clickCnt = null;

  public static final String SERIALIZED_NAME_CONVERSION_COST = "conversion_cost";
  @SerializedName(SERIALIZED_NAME_CONVERSION_COST)
  private Double conversionCost = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private Double convertCnt = null;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private Double form = null;

  public static final String SERIALIZED_NAME_FORM_COST = "form_cost";
  @SerializedName(SERIALIZED_NAME_FORM_COST)
  private Double formCost = null;

  public static final String SERIALIZED_NAME_GAME_ADDICTION = "game_addiction";
  @SerializedName(SERIALIZED_NAME_GAME_ADDICTION)
  private Double gameAddiction = null;

  public static final String SERIALIZED_NAME_GAME_ADDICTION_COST = "game_addiction_cost";
  @SerializedName(SERIALIZED_NAME_GAME_ADDICTION_COST)
  private Double gameAddictionCost = null;

  public static final String SERIALIZED_NAME_GAME_ADDICTION_RATE = "game_addiction_rate";
  @SerializedName(SERIALIZED_NAME_GAME_ADDICTION_RATE)
  private Double gameAddictionRate = null;

  public static final String SERIALIZED_NAME_LOAN_COMPLETION = "loan_completion";
  @SerializedName(SERIALIZED_NAME_LOAN_COMPLETION)
  private Double loanCompletion = null;

  public static final String SERIALIZED_NAME_LOAN_COMPLETION_COST = "loan_completion_cost";
  @SerializedName(SERIALIZED_NAME_LOAN_COMPLETION_COST)
  private Double loanCompletionCost = null;

  public static final String SERIALIZED_NAME_LOAN_CREDIT = "loan_credit";
  @SerializedName(SERIALIZED_NAME_LOAN_CREDIT)
  private Double loanCredit = null;

  public static final String SERIALIZED_NAME_LOAN_CREDIT_COST = "loan_credit_cost";
  @SerializedName(SERIALIZED_NAME_LOAN_CREDIT_COST)
  private Double loanCreditCost = null;

  public static final String SERIALIZED_NAME_NEXT_DAY_OPEN = "next_day_open";
  @SerializedName(SERIALIZED_NAME_NEXT_DAY_OPEN)
  private Double nextDayOpen = null;

  public static final String SERIALIZED_NAME_NEXT_DAY_OPEN_COST = "next_day_open_cost";
  @SerializedName(SERIALIZED_NAME_NEXT_DAY_OPEN_COST)
  private Double nextDayOpenCost = null;

  public static final String SERIALIZED_NAME_NEXT_DAY_OPEN_RATE = "next_day_open_rate";
  @SerializedName(SERIALIZED_NAME_NEXT_DAY_OPEN_RATE)
  private Double nextDayOpenRate = null;

  public static final String SERIALIZED_NAME_PRE_LOAN_CREDIT = "pre_loan_credit";
  @SerializedName(SERIALIZED_NAME_PRE_LOAN_CREDIT)
  private Double preLoanCredit = null;

  public static final String SERIALIZED_NAME_PRE_LOAN_CREDIT_COST = "pre_loan_credit_cost";
  @SerializedName(SERIALIZED_NAME_PRE_LOAN_CREDIT_COST)
  private Double preLoanCreditCost = null;

  public static final String SERIALIZED_NAME_RIT = "rit";
  @SerializedName(SERIALIZED_NAME_RIT)
  private Long rit = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private Double showCnt = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner() {
  }

  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner active(Double active) {
    
    this.active = active;
    return this;
  }

   /**
   * 激活数
   * @return active
  **/
  @javax.annotation.Nullable
  public Double getActive() {
    return active;
  }


  public void setActive(Double active) {
    this.active = active;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner activeCost(Double activeCost) {
    
    this.activeCost = activeCost;
    return this;
  }

   /**
   * 激活成本
   * @return activeCost
  **/
  @javax.annotation.Nullable
  public Double getActiveCost() {
    return activeCost;
  }


  public void setActiveCost(Double activeCost) {
    this.activeCost = activeCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner activePay(Double activePay) {
    
    this.activePay = activePay;
    return this;
  }

   /**
   * 付费数
   * @return activePay
  **/
  @javax.annotation.Nullable
  public Double getActivePay() {
    return activePay;
  }


  public void setActivePay(Double activePay) {
    this.activePay = activePay;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner activePayCost(Double activePayCost) {
    
    this.activePayCost = activePayCost;
    return this;
  }

   /**
   * 付费成本
   * @return activePayCost
  **/
  @javax.annotation.Nullable
  public Double getActivePayCost() {
    return activePayCost;
  }


  public void setActivePayCost(Double activePayCost) {
    this.activePayCost = activePayCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner activePayRate(Double activePayRate) {
    
    this.activePayRate = activePayRate;
    return this;
  }

   /**
   * 付费率
   * @return activePayRate
  **/
  @javax.annotation.Nullable
  public Double getActivePayRate() {
    return activePayRate;
  }


  public void setActivePayRate(Double activePayRate) {
    this.activePayRate = activePayRate;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner activeRegister(Double activeRegister) {
    
    this.activeRegister = activeRegister;
    return this;
  }

   /**
   * 注册数
   * @return activeRegister
  **/
  @javax.annotation.Nullable
  public Double getActiveRegister() {
    return activeRegister;
  }


  public void setActiveRegister(Double activeRegister) {
    this.activeRegister = activeRegister;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner activeRegisterCost(Double activeRegisterCost) {
    
    this.activeRegisterCost = activeRegisterCost;
    return this;
  }

   /**
   * 注册成本
   * @return activeRegisterCost
  **/
  @javax.annotation.Nullable
  public Double getActiveRegisterCost() {
    return activeRegisterCost;
  }


  public void setActiveRegisterCost(Double activeRegisterCost) {
    this.activeRegisterCost = activeRegisterCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner activeRegisterRate(Double activeRegisterRate) {
    
    this.activeRegisterRate = activeRegisterRate;
    return this;
  }

   /**
   * 注册率
   * @return activeRegisterRate
  **/
  @javax.annotation.Nullable
  public Double getActiveRegisterRate() {
    return activeRegisterRate;
  }


  public void setActiveRegisterRate(Double activeRegisterRate) {
    this.activeRegisterRate = activeRegisterRate;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner clickCnt(Double clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 点击指标
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public Double getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Double clickCnt) {
    this.clickCnt = clickCnt;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner conversionCost(Double conversionCost) {
    
    this.conversionCost = conversionCost;
    return this;
  }

   /**
   * 转化成本
   * @return conversionCost
  **/
  @javax.annotation.Nullable
  public Double getConversionCost() {
    return conversionCost;
  }


  public void setConversionCost(Double conversionCost) {
    this.conversionCost = conversionCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner convertCnt(Double convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * 转化量
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public Double getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(Double convertCnt) {
    this.convertCnt = convertCnt;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner form(Double form) {
    
    this.form = form;
    return this;
  }

   /**
   * 表单提交数
   * @return form
  **/
  @javax.annotation.Nullable
  public Double getForm() {
    return form;
  }


  public void setForm(Double form) {
    this.form = form;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner formCost(Double formCost) {
    
    this.formCost = formCost;
    return this;
  }

   /**
   * 表单
   * @return formCost
  **/
  @javax.annotation.Nullable
  public Double getFormCost() {
    return formCost;
  }


  public void setFormCost(Double formCost) {
    this.formCost = formCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner gameAddiction(Double gameAddiction) {
    
    this.gameAddiction = gameAddiction;
    return this;
  }

   /**
   * 关键行为数
   * @return gameAddiction
  **/
  @javax.annotation.Nullable
  public Double getGameAddiction() {
    return gameAddiction;
  }


  public void setGameAddiction(Double gameAddiction) {
    this.gameAddiction = gameAddiction;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner gameAddictionCost(Double gameAddictionCost) {
    
    this.gameAddictionCost = gameAddictionCost;
    return this;
  }

   /**
   * 关键行为成本
   * @return gameAddictionCost
  **/
  @javax.annotation.Nullable
  public Double getGameAddictionCost() {
    return gameAddictionCost;
  }


  public void setGameAddictionCost(Double gameAddictionCost) {
    this.gameAddictionCost = gameAddictionCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner gameAddictionRate(Double gameAddictionRate) {
    
    this.gameAddictionRate = gameAddictionRate;
    return this;
  }

   /**
   * 关键行为率
   * @return gameAddictionRate
  **/
  @javax.annotation.Nullable
  public Double getGameAddictionRate() {
    return gameAddictionRate;
  }


  public void setGameAddictionRate(Double gameAddictionRate) {
    this.gameAddictionRate = gameAddictionRate;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner loanCompletion(Double loanCompletion) {
    
    this.loanCompletion = loanCompletion;
    return this;
  }

   /**
   * 完件数
   * @return loanCompletion
  **/
  @javax.annotation.Nullable
  public Double getLoanCompletion() {
    return loanCompletion;
  }


  public void setLoanCompletion(Double loanCompletion) {
    this.loanCompletion = loanCompletion;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner loanCompletionCost(Double loanCompletionCost) {
    
    this.loanCompletionCost = loanCompletionCost;
    return this;
  }

   /**
   * 完件成本
   * @return loanCompletionCost
  **/
  @javax.annotation.Nullable
  public Double getLoanCompletionCost() {
    return loanCompletionCost;
  }


  public void setLoanCompletionCost(Double loanCompletionCost) {
    this.loanCompletionCost = loanCompletionCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner loanCredit(Double loanCredit) {
    
    this.loanCredit = loanCredit;
    return this;
  }

   /**
   * 授信数
   * @return loanCredit
  **/
  @javax.annotation.Nullable
  public Double getLoanCredit() {
    return loanCredit;
  }


  public void setLoanCredit(Double loanCredit) {
    this.loanCredit = loanCredit;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner loanCreditCost(Double loanCreditCost) {
    
    this.loanCreditCost = loanCreditCost;
    return this;
  }

   /**
   * 授信成本
   * @return loanCreditCost
  **/
  @javax.annotation.Nullable
  public Double getLoanCreditCost() {
    return loanCreditCost;
  }


  public void setLoanCreditCost(Double loanCreditCost) {
    this.loanCreditCost = loanCreditCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner nextDayOpen(Double nextDayOpen) {
    
    this.nextDayOpen = nextDayOpen;
    return this;
  }

   /**
   * 次留数
   * @return nextDayOpen
  **/
  @javax.annotation.Nullable
  public Double getNextDayOpen() {
    return nextDayOpen;
  }


  public void setNextDayOpen(Double nextDayOpen) {
    this.nextDayOpen = nextDayOpen;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner nextDayOpenCost(Double nextDayOpenCost) {
    
    this.nextDayOpenCost = nextDayOpenCost;
    return this;
  }

   /**
   * 次留成本
   * @return nextDayOpenCost
  **/
  @javax.annotation.Nullable
  public Double getNextDayOpenCost() {
    return nextDayOpenCost;
  }


  public void setNextDayOpenCost(Double nextDayOpenCost) {
    this.nextDayOpenCost = nextDayOpenCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner nextDayOpenRate(Double nextDayOpenRate) {
    
    this.nextDayOpenRate = nextDayOpenRate;
    return this;
  }

   /**
   * 次留率
   * @return nextDayOpenRate
  **/
  @javax.annotation.Nullable
  public Double getNextDayOpenRate() {
    return nextDayOpenRate;
  }


  public void setNextDayOpenRate(Double nextDayOpenRate) {
    this.nextDayOpenRate = nextDayOpenRate;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner preLoanCredit(Double preLoanCredit) {
    
    this.preLoanCredit = preLoanCredit;
    return this;
  }

   /**
   * 预授信数
   * @return preLoanCredit
  **/
  @javax.annotation.Nullable
  public Double getPreLoanCredit() {
    return preLoanCredit;
  }


  public void setPreLoanCredit(Double preLoanCredit) {
    this.preLoanCredit = preLoanCredit;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner preLoanCreditCost(Double preLoanCreditCost) {
    
    this.preLoanCreditCost = preLoanCreditCost;
    return this;
  }

   /**
   * 预授信成本
   * @return preLoanCreditCost
  **/
  @javax.annotation.Nullable
  public Double getPreLoanCreditCost() {
    return preLoanCreditCost;
  }


  public void setPreLoanCreditCost(Double preLoanCreditCost) {
    this.preLoanCreditCost = preLoanCreditCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner rit(Long rit) {
    
    this.rit = rit;
    return this;
  }

   /**
   * 广告位
   * @return rit
  **/
  @javax.annotation.Nullable
  public Long getRit() {
    return rit;
  }


  public void setRit(Long rit) {
    this.rit = rit;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner showCnt(Double showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 展示指标
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public Double getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(Double showCnt) {
    this.showCnt = showCnt;
  }


  public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 消耗，单位：元
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
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
    ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner = (ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner) o;
    return Objects.equals(this.active, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.active) &&
        Objects.equals(this.activeCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.activeCost) &&
        Objects.equals(this.activePay, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.activePay) &&
        Objects.equals(this.activePayCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.activePayCost) &&
        Objects.equals(this.activePayRate, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.activePayRate) &&
        Objects.equals(this.activeRegister, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.activeRegister) &&
        Objects.equals(this.activeRegisterCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.activeRegisterCost) &&
        Objects.equals(this.activeRegisterRate, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.activeRegisterRate) &&
        Objects.equals(this.clickCnt, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.clickCnt) &&
        Objects.equals(this.conversionCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.conversionCost) &&
        Objects.equals(this.convertCnt, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.convertCnt) &&
        Objects.equals(this.form, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.form) &&
        Objects.equals(this.formCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.formCost) &&
        Objects.equals(this.gameAddiction, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.gameAddiction) &&
        Objects.equals(this.gameAddictionCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.gameAddictionCost) &&
        Objects.equals(this.gameAddictionRate, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.gameAddictionRate) &&
        Objects.equals(this.loanCompletion, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.loanCompletion) &&
        Objects.equals(this.loanCompletionCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.loanCompletionCost) &&
        Objects.equals(this.loanCredit, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.loanCredit) &&
        Objects.equals(this.loanCreditCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.loanCreditCost) &&
        Objects.equals(this.nextDayOpen, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.nextDayOpen) &&
        Objects.equals(this.nextDayOpenCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.nextDayOpenCost) &&
        Objects.equals(this.nextDayOpenRate, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.nextDayOpenRate) &&
        Objects.equals(this.preLoanCredit, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.preLoanCredit) &&
        Objects.equals(this.preLoanCreditCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.preLoanCreditCost) &&
        Objects.equals(this.rit, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.rit) &&
        Objects.equals(this.showCnt, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.showCnt) &&
        Objects.equals(this.statCost, toolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.statCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, activeCost, activePay, activePayCost, activePayRate, activeRegister, activeRegisterCost, activeRegisterRate, clickCnt, conversionCost, convertCnt, form, formCost, gameAddiction, gameAddictionCost, gameAddictionRate, loanCompletion, loanCompletionCost, loanCredit, loanCreditCost, nextDayOpen, nextDayOpenCost, nextDayOpenRate, preLoanCredit, preLoanCreditCost, rit, showCnt, statCost);
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
    sb.append("class ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activeCost: ").append(toIndentedString(activeCost)).append("\n");
    sb.append("    activePay: ").append(toIndentedString(activePay)).append("\n");
    sb.append("    activePayCost: ").append(toIndentedString(activePayCost)).append("\n");
    sb.append("    activePayRate: ").append(toIndentedString(activePayRate)).append("\n");
    sb.append("    activeRegister: ").append(toIndentedString(activeRegister)).append("\n");
    sb.append("    activeRegisterCost: ").append(toIndentedString(activeRegisterCost)).append("\n");
    sb.append("    activeRegisterRate: ").append(toIndentedString(activeRegisterRate)).append("\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    conversionCost: ").append(toIndentedString(conversionCost)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    formCost: ").append(toIndentedString(formCost)).append("\n");
    sb.append("    gameAddiction: ").append(toIndentedString(gameAddiction)).append("\n");
    sb.append("    gameAddictionCost: ").append(toIndentedString(gameAddictionCost)).append("\n");
    sb.append("    gameAddictionRate: ").append(toIndentedString(gameAddictionRate)).append("\n");
    sb.append("    loanCompletion: ").append(toIndentedString(loanCompletion)).append("\n");
    sb.append("    loanCompletionCost: ").append(toIndentedString(loanCompletionCost)).append("\n");
    sb.append("    loanCredit: ").append(toIndentedString(loanCredit)).append("\n");
    sb.append("    loanCreditCost: ").append(toIndentedString(loanCreditCost)).append("\n");
    sb.append("    nextDayOpen: ").append(toIndentedString(nextDayOpen)).append("\n");
    sb.append("    nextDayOpenCost: ").append(toIndentedString(nextDayOpenCost)).append("\n");
    sb.append("    nextDayOpenRate: ").append(toIndentedString(nextDayOpenRate)).append("\n");
    sb.append("    preLoanCredit: ").append(toIndentedString(preLoanCredit)).append("\n");
    sb.append("    preLoanCreditCost: ").append(toIndentedString(preLoanCreditCost)).append("\n");
    sb.append("    rit: ").append(toIndentedString(rit)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("active_cost");
    openapiFields.add("active_pay");
    openapiFields.add("active_pay_cost");
    openapiFields.add("active_pay_rate");
    openapiFields.add("active_register");
    openapiFields.add("active_register_cost");
    openapiFields.add("active_register_rate");
    openapiFields.add("click_cnt");
    openapiFields.add("conversion_cost");
    openapiFields.add("convert_cnt");
    openapiFields.add("form");
    openapiFields.add("form_cost");
    openapiFields.add("game_addiction");
    openapiFields.add("game_addiction_cost");
    openapiFields.add("game_addiction_rate");
    openapiFields.add("loan_completion");
    openapiFields.add("loan_completion_cost");
    openapiFields.add("loan_credit");
    openapiFields.add("loan_credit_cost");
    openapiFields.add("next_day_open");
    openapiFields.add("next_day_open_cost");
    openapiFields.add("next_day_open_rate");
    openapiFields.add("pre_loan_credit");
    openapiFields.add("pre_loan_credit_cost");
    openapiFields.add("rit");
    openapiFields.add("show_cnt");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner
  */
  public static ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner.class);
  }

 /**
  * Convert an instance of ToolsUnionFlowPackagePromotionReportV30ResponseDataDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

