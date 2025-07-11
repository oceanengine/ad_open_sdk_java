/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * QueryProjectV2ResponseDataProjectInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QueryProjectV2ResponseDataProjectInfoListInner {
  public static final String SERIALIZED_NAME_ADC_SERIAL = "adc_serial";
  @SerializedName(SERIALIZED_NAME_ADC_SERIAL)
  private String adcSerial = null;

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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount = null;

  public static final String SERIALIZED_NAME_CONFIRM_STATUS = "confirm_status";
  @SerializedName(SERIALIZED_NAME_CONFIRM_STATUS)
  private Long confirmStatus = null;

  public static final String SERIALIZED_NAME_CONFIRM_STATUS_NAME = "confirm_status_name";
  @SerializedName(SERIALIZED_NAME_CONFIRM_STATUS_NAME)
  private String confirmStatusName = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_CREDIT_COST = "credit_cost";
  @SerializedName(SERIALIZED_NAME_CREDIT_COST)
  private String creditCost = null;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName = null;

  public static final String SERIALIZED_NAME_DEADLINE = "deadline";
  @SerializedName(SERIALIZED_NAME_DEADLINE)
  private String deadline = null;

  public static final String SERIALIZED_NAME_GRANT_COST = "grant_cost";
  @SerializedName(SERIALIZED_NAME_GRANT_COST)
  private String grantCost = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private String invoiceAmount = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PAY_METHOD_NAME = "pay_method_name";
  @SerializedName(SERIALIZED_NAME_PAY_METHOD_NAME)
  private String payMethodName = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Long platform = null;

  public static final String SERIALIZED_NAME_PLATFORM_NAME = "platform_name";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NAME)
  private String platformName = null;

  public static final String SERIALIZED_NAME_PREPAY_COST = "prepay_cost";
  @SerializedName(SERIALIZED_NAME_PREPAY_COST)
  private String prepayCost = null;

  public static final String SERIALIZED_NAME_PROJECT_END_DATE = "project_end_date";
  @SerializedName(SERIALIZED_NAME_PROJECT_END_DATE)
  private String projectEndDate = null;

  public static final String SERIALIZED_NAME_PROJECT_START_DATE = "project_start_date";
  @SerializedName(SERIALIZED_NAME_PROJECT_START_DATE)
  private String projectStartDate = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS = "project_status";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS)
  private Long projectStatus = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_NAME = "project_status_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_NAME)
  private String projectStatusName = null;

  public static final String SERIALIZED_NAME_PROJECT_SUB_TYPE = "project_sub_type";
  @SerializedName(SERIALIZED_NAME_PROJECT_SUB_TYPE)
  private Long projectSubType = null;

  public static final String SERIALIZED_NAME_PROJECT_SUB_TYPE_NAME = "project_sub_type_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_SUB_TYPE_NAME)
  private String projectSubTypeName = null;

  public static final String SERIALIZED_NAME_RECEIPT_STATUS = "receipt_status";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STATUS)
  private Long receiptStatus = null;

  public static final String SERIALIZED_NAME_RECEIPT_STATUS_NAME = "receipt_status_name";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STATUS_NAME)
  private String receiptStatusName = null;

  public static final String SERIALIZED_NAME_RECEIPT_SUBJECT_NAME = "receipt_subject_name";
  @SerializedName(SERIALIZED_NAME_RECEIPT_SUBJECT_NAME)
  private String receiptSubjectName = null;

  public static final String SERIALIZED_NAME_RECHARGE_COST = "recharge_cost";
  @SerializedName(SERIALIZED_NAME_RECHARGE_COST)
  private String rechargeCost = null;

  public static final String SERIALIZED_NAME_REMAIN_VERIFICATION_AMOUNT = "remain_verification_amount";
  @SerializedName(SERIALIZED_NAME_REMAIN_VERIFICATION_AMOUNT)
  private String remainVerificationAmount = null;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial = null;

  public static final String SERIALIZED_NAME_SERVING_TYPE = "serving_type";
  @SerializedName(SERIALIZED_NAME_SERVING_TYPE)
  private Long servingType = null;

  public static final String SERIALIZED_NAME_SERVING_TYPE_NAME = "serving_type_name";
  @SerializedName(SERIALIZED_NAME_SERVING_TYPE_NAME)
  private String servingTypeName = null;

  public QueryProjectV2ResponseDataProjectInfoListInner() {
  }

  public QueryProjectV2ResponseDataProjectInfoListInner adcSerial(String adcSerial) {
    
    this.adcSerial = adcSerial;
    return this;
  }

   /**
   * 广告发布协议编号
   * @return adcSerial
  **/
  @javax.annotation.Nullable
  public String getAdcSerial() {
    return adcSerial;
  }


  public void setAdcSerial(String adcSerial) {
    this.adcSerial = adcSerial;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主名称
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商ID
   * @return agentId
  **/
  @javax.annotation.Nullable
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * 代理商名称
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 项目金额（元）
   * @return amount
  **/
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner confirmStatus(Long confirmStatus) {
    
    this.confirmStatus = confirmStatus;
    return this;
  }

   /**
   * 确认状态
   * @return confirmStatus
  **/
  @javax.annotation.Nullable
  public Long getConfirmStatus() {
    return confirmStatus;
  }


  public void setConfirmStatus(Long confirmStatus) {
    this.confirmStatus = confirmStatus;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner confirmStatusName(String confirmStatusName) {
    
    this.confirmStatusName = confirmStatusName;
    return this;
  }

   /**
   * 确认状态名称
   * @return confirmStatusName
  **/
  @javax.annotation.Nullable
  public String getConfirmStatusName() {
    return confirmStatusName;
  }


  public void setConfirmStatusName(String confirmStatusName) {
    this.confirmStatusName = confirmStatusName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner contractSerial(String contractSerial) {
    
    this.contractSerial = contractSerial;
    return this;
  }

   /**
   * 主合同编号
   * @return contractSerial
  **/
  @javax.annotation.Nullable
  public String getContractSerial() {
    return contractSerial;
  }


  public void setContractSerial(String contractSerial) {
    this.contractSerial = contractSerial;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner creditCost(String creditCost) {
    
    this.creditCost = creditCost;
    return this;
  }

   /**
   * 授信消耗
   * @return creditCost
  **/
  @javax.annotation.Nullable
  public String getCreditCost() {
    return creditCost;
  }


  public void setCreditCost(String creditCost) {
    this.creditCost = creditCost;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner customerId(Long customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * 客户ID
   * @return customerId
  **/
  @javax.annotation.Nullable
  public Long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * 客户名称
   * @return customerName
  **/
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner deadline(String deadline) {
    
    this.deadline = deadline;
    return this;
  }

   /**
   * 应回款时间
   * @return deadline
  **/
  @javax.annotation.Nullable
  public String getDeadline() {
    return deadline;
  }


  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner grantCost(String grantCost) {
    
    this.grantCost = grantCost;
    return this;
  }

   /**
   * 赠款消耗
   * @return grantCost
  **/
  @javax.annotation.Nullable
  public String getGrantCost() {
    return grantCost;
  }


  public void setGrantCost(String grantCost) {
    this.grantCost = grantCost;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 项目ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner invoiceAmount(String invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 已开票金额
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  public String getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(String invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 项目名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner payMethodName(String payMethodName) {
    
    this.payMethodName = payMethodName;
    return this;
  }

   /**
   * 付款方式
   * @return payMethodName
  **/
  @javax.annotation.Nullable
  public String getPayMethodName() {
    return payMethodName;
  }


  public void setPayMethodName(String payMethodName) {
    this.payMethodName = payMethodName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner platform(Long platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 平台
   * @return platform
  **/
  @javax.annotation.Nullable
  public Long getPlatform() {
    return platform;
  }


  public void setPlatform(Long platform) {
    this.platform = platform;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner platformName(String platformName) {
    
    this.platformName = platformName;
    return this;
  }

   /**
   * 平台名称
   * @return platformName
  **/
  @javax.annotation.Nullable
  public String getPlatformName() {
    return platformName;
  }


  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner prepayCost(String prepayCost) {
    
    this.prepayCost = prepayCost;
    return this;
  }

   /**
   * 预付消耗
   * @return prepayCost
  **/
  @javax.annotation.Nullable
  public String getPrepayCost() {
    return prepayCost;
  }


  public void setPrepayCost(String prepayCost) {
    this.prepayCost = prepayCost;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner projectEndDate(String projectEndDate) {
    
    this.projectEndDate = projectEndDate;
    return this;
  }

   /**
   * 项目结束时间 例如 2023-07-06
   * @return projectEndDate
  **/
  @javax.annotation.Nullable
  public String getProjectEndDate() {
    return projectEndDate;
  }


  public void setProjectEndDate(String projectEndDate) {
    this.projectEndDate = projectEndDate;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner projectStartDate(String projectStartDate) {
    
    this.projectStartDate = projectStartDate;
    return this;
  }

   /**
   * 项目开始时间 例如 2023-07-06
   * @return projectStartDate
  **/
  @javax.annotation.Nullable
  public String getProjectStartDate() {
    return projectStartDate;
  }


  public void setProjectStartDate(String projectStartDate) {
    this.projectStartDate = projectStartDate;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner projectStatus(Long projectStatus) {
    
    this.projectStatus = projectStatus;
    return this;
  }

   /**
   * 项目状态
   * @return projectStatus
  **/
  @javax.annotation.Nullable
  public Long getProjectStatus() {
    return projectStatus;
  }


  public void setProjectStatus(Long projectStatus) {
    this.projectStatus = projectStatus;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner projectStatusName(String projectStatusName) {
    
    this.projectStatusName = projectStatusName;
    return this;
  }

   /**
   * 项目状态名称
   * @return projectStatusName
  **/
  @javax.annotation.Nullable
  public String getProjectStatusName() {
    return projectStatusName;
  }


  public void setProjectStatusName(String projectStatusName) {
    this.projectStatusName = projectStatusName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner projectSubType(Long projectSubType) {
    
    this.projectSubType = projectSubType;
    return this;
  }

   /**
   * 项目类型
   * @return projectSubType
  **/
  @javax.annotation.Nullable
  public Long getProjectSubType() {
    return projectSubType;
  }


  public void setProjectSubType(Long projectSubType) {
    this.projectSubType = projectSubType;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner projectSubTypeName(String projectSubTypeName) {
    
    this.projectSubTypeName = projectSubTypeName;
    return this;
  }

   /**
   * 项目类型名称
   * @return projectSubTypeName
  **/
  @javax.annotation.Nullable
  public String getProjectSubTypeName() {
    return projectSubTypeName;
  }


  public void setProjectSubTypeName(String projectSubTypeName) {
    this.projectSubTypeName = projectSubTypeName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner receiptStatus(Long receiptStatus) {
    
    this.receiptStatus = receiptStatus;
    return this;
  }

   /**
   * 回款状态
   * @return receiptStatus
  **/
  @javax.annotation.Nullable
  public Long getReceiptStatus() {
    return receiptStatus;
  }


  public void setReceiptStatus(Long receiptStatus) {
    this.receiptStatus = receiptStatus;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner receiptStatusName(String receiptStatusName) {
    
    this.receiptStatusName = receiptStatusName;
    return this;
  }

   /**
   * 回款状态名称
   * @return receiptStatusName
  **/
  @javax.annotation.Nullable
  public String getReceiptStatusName() {
    return receiptStatusName;
  }


  public void setReceiptStatusName(String receiptStatusName) {
    this.receiptStatusName = receiptStatusName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner receiptSubjectName(String receiptSubjectName) {
    
    this.receiptSubjectName = receiptSubjectName;
    return this;
  }

   /**
   * 我方主体名称
   * @return receiptSubjectName
  **/
  @javax.annotation.Nullable
  public String getReceiptSubjectName() {
    return receiptSubjectName;
  }


  public void setReceiptSubjectName(String receiptSubjectName) {
    this.receiptSubjectName = receiptSubjectName;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner rechargeCost(String rechargeCost) {
    
    this.rechargeCost = rechargeCost;
    return this;
  }

   /**
   * 现金消耗
   * @return rechargeCost
  **/
  @javax.annotation.Nullable
  public String getRechargeCost() {
    return rechargeCost;
  }


  public void setRechargeCost(String rechargeCost) {
    this.rechargeCost = rechargeCost;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner remainVerificationAmount(String remainVerificationAmount) {
    
    this.remainVerificationAmount = remainVerificationAmount;
    return this;
  }

   /**
   * 待回款金额（元）
   * @return remainVerificationAmount
  **/
  @javax.annotation.Nullable
  public String getRemainVerificationAmount() {
    return remainVerificationAmount;
  }


  public void setRemainVerificationAmount(String remainVerificationAmount) {
    this.remainVerificationAmount = remainVerificationAmount;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * 项目编号
   * @return serial
  **/
  @javax.annotation.Nullable
  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner servingType(Long servingType) {
    
    this.servingType = servingType;
    return this;
  }

   /**
   * 投放方式
   * @return servingType
  **/
  @javax.annotation.Nullable
  public Long getServingType() {
    return servingType;
  }


  public void setServingType(Long servingType) {
    this.servingType = servingType;
  }


  public QueryProjectV2ResponseDataProjectInfoListInner servingTypeName(String servingTypeName) {
    
    this.servingTypeName = servingTypeName;
    return this;
  }

   /**
   * 投放方式名称
   * @return servingTypeName
  **/
  @javax.annotation.Nullable
  public String getServingTypeName() {
    return servingTypeName;
  }


  public void setServingTypeName(String servingTypeName) {
    this.servingTypeName = servingTypeName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryProjectV2ResponseDataProjectInfoListInner queryProjectV2ResponseDataProjectInfoListInner = (QueryProjectV2ResponseDataProjectInfoListInner) o;
    return Objects.equals(this.adcSerial, queryProjectV2ResponseDataProjectInfoListInner.adcSerial) &&
        Objects.equals(this.advertiserId, queryProjectV2ResponseDataProjectInfoListInner.advertiserId) &&
        Objects.equals(this.advertiserName, queryProjectV2ResponseDataProjectInfoListInner.advertiserName) &&
        Objects.equals(this.agentId, queryProjectV2ResponseDataProjectInfoListInner.agentId) &&
        Objects.equals(this.agentName, queryProjectV2ResponseDataProjectInfoListInner.agentName) &&
        Objects.equals(this.amount, queryProjectV2ResponseDataProjectInfoListInner.amount) &&
        Objects.equals(this.confirmStatus, queryProjectV2ResponseDataProjectInfoListInner.confirmStatus) &&
        Objects.equals(this.confirmStatusName, queryProjectV2ResponseDataProjectInfoListInner.confirmStatusName) &&
        Objects.equals(this.contractSerial, queryProjectV2ResponseDataProjectInfoListInner.contractSerial) &&
        Objects.equals(this.creditCost, queryProjectV2ResponseDataProjectInfoListInner.creditCost) &&
        Objects.equals(this.customerId, queryProjectV2ResponseDataProjectInfoListInner.customerId) &&
        Objects.equals(this.customerName, queryProjectV2ResponseDataProjectInfoListInner.customerName) &&
        Objects.equals(this.deadline, queryProjectV2ResponseDataProjectInfoListInner.deadline) &&
        Objects.equals(this.grantCost, queryProjectV2ResponseDataProjectInfoListInner.grantCost) &&
        Objects.equals(this.id, queryProjectV2ResponseDataProjectInfoListInner.id) &&
        Objects.equals(this.invoiceAmount, queryProjectV2ResponseDataProjectInfoListInner.invoiceAmount) &&
        Objects.equals(this.name, queryProjectV2ResponseDataProjectInfoListInner.name) &&
        Objects.equals(this.payMethodName, queryProjectV2ResponseDataProjectInfoListInner.payMethodName) &&
        Objects.equals(this.platform, queryProjectV2ResponseDataProjectInfoListInner.platform) &&
        Objects.equals(this.platformName, queryProjectV2ResponseDataProjectInfoListInner.platformName) &&
        Objects.equals(this.prepayCost, queryProjectV2ResponseDataProjectInfoListInner.prepayCost) &&
        Objects.equals(this.projectEndDate, queryProjectV2ResponseDataProjectInfoListInner.projectEndDate) &&
        Objects.equals(this.projectStartDate, queryProjectV2ResponseDataProjectInfoListInner.projectStartDate) &&
        Objects.equals(this.projectStatus, queryProjectV2ResponseDataProjectInfoListInner.projectStatus) &&
        Objects.equals(this.projectStatusName, queryProjectV2ResponseDataProjectInfoListInner.projectStatusName) &&
        Objects.equals(this.projectSubType, queryProjectV2ResponseDataProjectInfoListInner.projectSubType) &&
        Objects.equals(this.projectSubTypeName, queryProjectV2ResponseDataProjectInfoListInner.projectSubTypeName) &&
        Objects.equals(this.receiptStatus, queryProjectV2ResponseDataProjectInfoListInner.receiptStatus) &&
        Objects.equals(this.receiptStatusName, queryProjectV2ResponseDataProjectInfoListInner.receiptStatusName) &&
        Objects.equals(this.receiptSubjectName, queryProjectV2ResponseDataProjectInfoListInner.receiptSubjectName) &&
        Objects.equals(this.rechargeCost, queryProjectV2ResponseDataProjectInfoListInner.rechargeCost) &&
        Objects.equals(this.remainVerificationAmount, queryProjectV2ResponseDataProjectInfoListInner.remainVerificationAmount) &&
        Objects.equals(this.serial, queryProjectV2ResponseDataProjectInfoListInner.serial) &&
        Objects.equals(this.servingType, queryProjectV2ResponseDataProjectInfoListInner.servingType) &&
        Objects.equals(this.servingTypeName, queryProjectV2ResponseDataProjectInfoListInner.servingTypeName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adcSerial, advertiserId, advertiserName, agentId, agentName, amount, confirmStatus, confirmStatusName, contractSerial, creditCost, customerId, customerName, deadline, grantCost, id, invoiceAmount, name, payMethodName, platform, platformName, prepayCost, projectEndDate, projectStartDate, projectStatus, projectStatusName, projectSubType, projectSubTypeName, receiptStatus, receiptStatusName, receiptSubjectName, rechargeCost, remainVerificationAmount, serial, servingType, servingTypeName);
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
    sb.append("class QueryProjectV2ResponseDataProjectInfoListInner {\n");
    sb.append("    adcSerial: ").append(toIndentedString(adcSerial)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    confirmStatus: ").append(toIndentedString(confirmStatus)).append("\n");
    sb.append("    confirmStatusName: ").append(toIndentedString(confirmStatusName)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    creditCost: ").append(toIndentedString(creditCost)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    grantCost: ").append(toIndentedString(grantCost)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payMethodName: ").append(toIndentedString(payMethodName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    prepayCost: ").append(toIndentedString(prepayCost)).append("\n");
    sb.append("    projectEndDate: ").append(toIndentedString(projectEndDate)).append("\n");
    sb.append("    projectStartDate: ").append(toIndentedString(projectStartDate)).append("\n");
    sb.append("    projectStatus: ").append(toIndentedString(projectStatus)).append("\n");
    sb.append("    projectStatusName: ").append(toIndentedString(projectStatusName)).append("\n");
    sb.append("    projectSubType: ").append(toIndentedString(projectSubType)).append("\n");
    sb.append("    projectSubTypeName: ").append(toIndentedString(projectSubTypeName)).append("\n");
    sb.append("    receiptStatus: ").append(toIndentedString(receiptStatus)).append("\n");
    sb.append("    receiptStatusName: ").append(toIndentedString(receiptStatusName)).append("\n");
    sb.append("    receiptSubjectName: ").append(toIndentedString(receiptSubjectName)).append("\n");
    sb.append("    rechargeCost: ").append(toIndentedString(rechargeCost)).append("\n");
    sb.append("    remainVerificationAmount: ").append(toIndentedString(remainVerificationAmount)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    servingType: ").append(toIndentedString(servingType)).append("\n");
    sb.append("    servingTypeName: ").append(toIndentedString(servingTypeName)).append("\n");
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
    openapiFields.add("adc_serial");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("agent_id");
    openapiFields.add("agent_name");
    openapiFields.add("amount");
    openapiFields.add("confirm_status");
    openapiFields.add("confirm_status_name");
    openapiFields.add("contract_serial");
    openapiFields.add("credit_cost");
    openapiFields.add("customer_id");
    openapiFields.add("customer_name");
    openapiFields.add("deadline");
    openapiFields.add("grant_cost");
    openapiFields.add("id");
    openapiFields.add("invoice_amount");
    openapiFields.add("name");
    openapiFields.add("pay_method_name");
    openapiFields.add("platform");
    openapiFields.add("platform_name");
    openapiFields.add("prepay_cost");
    openapiFields.add("project_end_date");
    openapiFields.add("project_start_date");
    openapiFields.add("project_status");
    openapiFields.add("project_status_name");
    openapiFields.add("project_sub_type");
    openapiFields.add("project_sub_type_name");
    openapiFields.add("receipt_status");
    openapiFields.add("receipt_status_name");
    openapiFields.add("receipt_subject_name");
    openapiFields.add("recharge_cost");
    openapiFields.add("remain_verification_amount");
    openapiFields.add("serial");
    openapiFields.add("serving_type");
    openapiFields.add("serving_type_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryProjectV2ResponseDataProjectInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryProjectV2ResponseDataProjectInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryProjectV2ResponseDataProjectInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryProjectV2ResponseDataProjectInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryProjectV2ResponseDataProjectInfoListInner>() {
           @Override
           public void write(JsonWriter out, QueryProjectV2ResponseDataProjectInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryProjectV2ResponseDataProjectInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryProjectV2ResponseDataProjectInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryProjectV2ResponseDataProjectInfoListInner
  * @throws IOException if the JSON string is invalid with respect to QueryProjectV2ResponseDataProjectInfoListInner
  */
  public static QueryProjectV2ResponseDataProjectInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryProjectV2ResponseDataProjectInfoListInner.class);
  }

 /**
  * Convert an instance of QueryProjectV2ResponseDataProjectInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

