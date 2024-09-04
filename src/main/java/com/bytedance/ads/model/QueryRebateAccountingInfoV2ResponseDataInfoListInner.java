/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * QueryRebateAccountingInfoV2ResponseDataInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class QueryRebateAccountingInfoV2ResponseDataInfoListInner {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agent_name";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_CONTRACT_SUBJECT_NAME = "contract_subject_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SUBJECT_NAME)
  private String contractSubjectName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CURRENT_APPROVAL_STATUS_NAME = "current_approval_status_name";
  @SerializedName(SERIALIZED_NAME_CURRENT_APPROVAL_STATUS_NAME)
  private String currentApprovalStatusName = null;

  public static final String SERIALIZED_NAME_IS_CREATE_REBATE = "is_create_rebate";
  @SerializedName(SERIALIZED_NAME_IS_CREATE_REBATE)
  private Integer isCreateRebate = null;

  public static final String SERIALIZED_NAME_IS_CREATE_REBATE_NAME = "is_create_rebate_name";
  @SerializedName(SERIALIZED_NAME_IS_CREATE_REBATE_NAME)
  private String isCreateRebateName = null;

  public static final String SERIALIZED_NAME_MONTH_QUARTER = "month_quarter";
  @SerializedName(SERIALIZED_NAME_MONTH_QUARTER)
  private Integer monthQuarter = null;

  public static final String SERIALIZED_NAME_MONTH_QUARTER_NAME = "month_quarter_name";
  @SerializedName(SERIALIZED_NAME_MONTH_QUARTER_NAME)
  private String monthQuarterName = null;

  public static final String SERIALIZED_NAME_PERFORMANCE_AMOUNT = "performance_amount";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE_AMOUNT)
  private Double performanceAmount = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Long platform = null;

  public static final String SERIALIZED_NAME_PLATFORM_NAME = "platform_name";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NAME)
  private String platformName = null;

  public static final String SERIALIZED_NAME_REBATE_ACCOUNTING_INFO_ID = "rebate_accounting_info_id";
  @SerializedName(SERIALIZED_NAME_REBATE_ACCOUNTING_INFO_ID)
  private Long rebateAccountingInfoId = null;

  public static final String SERIALIZED_NAME_REBATE_ACCOUNTING_INFO_SERIAL = "rebate_accounting_info_serial";
  @SerializedName(SERIALIZED_NAME_REBATE_ACCOUNTING_INFO_SERIAL)
  private String rebateAccountingInfoSerial = null;

  public static final String SERIALIZED_NAME_REBATE_BALANCE_ID = "rebate_balance_id";
  @SerializedName(SERIALIZED_NAME_REBATE_BALANCE_ID)
  private Long rebateBalanceId = null;

  public static final String SERIALIZED_NAME_REBATE_BALANCE_SERIAL = "rebate_balance_serial";
  @SerializedName(SERIALIZED_NAME_REBATE_BALANCE_SERIAL)
  private String rebateBalanceSerial = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public static final String SERIALIZED_NAME_STATUS_NAME = "status_name";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type = null;

  public static final String SERIALIZED_NAME_TYPE_NAME = "type_name";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName = null;

  public static final String SERIALIZED_NAME_USE_TYPE_NAMES = "use_type_names";
  @SerializedName(SERIALIZED_NAME_USE_TYPE_NAMES)
  private List<String> useTypeNames = null;

  public static final String SERIALIZED_NAME_USE_TYPES = "use_types";
  @SerializedName(SERIALIZED_NAME_USE_TYPES)
  private List<Integer> useTypes = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year = null;

  public QueryRebateAccountingInfoV2ResponseDataInfoListInner() {
  }

  public QueryRebateAccountingInfoV2ResponseDataInfoListInner agentId(Long agentId) {
    
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


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * 代理商name
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 返点金额 单位 元 保留2位小数
   * @return amount
  **/
  @javax.annotation.Nullable
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner contractSerial(String contractSerial) {
    
    this.contractSerial = contractSerial;
    return this;
  }

   /**
   * 合同编号
   * @return contractSerial
  **/
  @javax.annotation.Nullable
  public String getContractSerial() {
    return contractSerial;
  }


  public void setContractSerial(String contractSerial) {
    this.contractSerial = contractSerial;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner contractSubjectName(String contractSubjectName) {
    
    this.contractSubjectName = contractSubjectName;
    return this;
  }

   /**
   * 媒体签约主体
   * @return contractSubjectName
  **/
  @javax.annotation.Nullable
  public String getContractSubjectName() {
    return contractSubjectName;
  }


  public void setContractSubjectName(String contractSubjectName) {
    this.contractSubjectName = contractSubjectName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间 2000-01-01 00:00:00
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner currentApprovalStatusName(String currentApprovalStatusName) {
    
    this.currentApprovalStatusName = currentApprovalStatusName;
    return this;
  }

   /**
   * 当前审批节点名称 （待代理商审批/待平台复核终审/审批完成）
   * @return currentApprovalStatusName
  **/
  @javax.annotation.Nullable
  public String getCurrentApprovalStatusName() {
    return currentApprovalStatusName;
  }


  public void setCurrentApprovalStatusName(String currentApprovalStatusName) {
    this.currentApprovalStatusName = currentApprovalStatusName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner isCreateRebate(Integer isCreateRebate) {
    
    this.isCreateRebate = isCreateRebate;
    return this;
  }

   /**
   * 是否已创建返点 1:是 2:否
   * @return isCreateRebate
  **/
  @javax.annotation.Nullable
  public Integer getIsCreateRebate() {
    return isCreateRebate;
  }


  public void setIsCreateRebate(Integer isCreateRebate) {
    this.isCreateRebate = isCreateRebate;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner isCreateRebateName(String isCreateRebateName) {
    
    this.isCreateRebateName = isCreateRebateName;
    return this;
  }

   /**
   * 是否已创建返点name (\&quot;是\&quot;、\&quot;否\&quot;)
   * @return isCreateRebateName
  **/
  @javax.annotation.Nullable
  public String getIsCreateRebateName() {
    return isCreateRebateName;
  }


  public void setIsCreateRebateName(String isCreateRebateName) {
    this.isCreateRebateName = isCreateRebateName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner monthQuarter(Integer monthQuarter) {
    
    this.monthQuarter = monthQuarter;
    return this;
  }

   /**
   * 结算季度/月 （1:1月，2:2月，3:3月，4:4月，5:5月，6:6月，7:7月，8:8月，9:9月，10:10月，11:11月，12:12月，13:Q1，14:Q2，15:Q3，16:Q4，17:上半年，18:下半年，19:全年）
   * @return monthQuarter
  **/
  @javax.annotation.Nullable
  public Integer getMonthQuarter() {
    return monthQuarter;
  }


  public void setMonthQuarter(Integer monthQuarter) {
    this.monthQuarter = monthQuarter;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner monthQuarterName(String monthQuarterName) {
    
    this.monthQuarterName = monthQuarterName;
    return this;
  }

   /**
   * 结算季度/月name
   * @return monthQuarterName
  **/
  @javax.annotation.Nullable
  public String getMonthQuarterName() {
    return monthQuarterName;
  }


  public void setMonthQuarterName(String monthQuarterName) {
    this.monthQuarterName = monthQuarterName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner performanceAmount(Double performanceAmount) {
    
    this.performanceAmount = performanceAmount;
    return this;
  }

   /**
   * 业绩基数 单位 元 保留2位小数
   * @return performanceAmount
  **/
  @javax.annotation.Nullable
  public Double getPerformanceAmount() {
    return performanceAmount;
  }


  public void setPerformanceAmount(Double performanceAmount) {
    this.performanceAmount = performanceAmount;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner platform(Long platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 业务线/平台
   * @return platform
  **/
  @javax.annotation.Nullable
  public Long getPlatform() {
    return platform;
  }


  public void setPlatform(Long platform) {
    this.platform = platform;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner platformName(String platformName) {
    
    this.platformName = platformName;
    return this;
  }

   /**
   * 业务线/平台name
   * @return platformName
  **/
  @javax.annotation.Nullable
  public String getPlatformName() {
    return platformName;
  }


  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner rebateAccountingInfoId(Long rebateAccountingInfoId) {
    
    this.rebateAccountingInfoId = rebateAccountingInfoId;
    return this;
  }

   /**
   * 返点核算信息ID
   * @return rebateAccountingInfoId
  **/
  @javax.annotation.Nullable
  public Long getRebateAccountingInfoId() {
    return rebateAccountingInfoId;
  }


  public void setRebateAccountingInfoId(Long rebateAccountingInfoId) {
    this.rebateAccountingInfoId = rebateAccountingInfoId;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner rebateAccountingInfoSerial(String rebateAccountingInfoSerial) {
    
    this.rebateAccountingInfoSerial = rebateAccountingInfoSerial;
    return this;
  }

   /**
   * 返点核算信息编号（与平台披露编号一致，建议使用）
   * @return rebateAccountingInfoSerial
  **/
  @javax.annotation.Nullable
  public String getRebateAccountingInfoSerial() {
    return rebateAccountingInfoSerial;
  }


  public void setRebateAccountingInfoSerial(String rebateAccountingInfoSerial) {
    this.rebateAccountingInfoSerial = rebateAccountingInfoSerial;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner rebateBalanceId(Long rebateBalanceId) {
    
    this.rebateBalanceId = rebateBalanceId;
    return this;
  }

   /**
   * 返点流水ID
   * @return rebateBalanceId
  **/
  @javax.annotation.Nullable
  public Long getRebateBalanceId() {
    return rebateBalanceId;
  }


  public void setRebateBalanceId(Long rebateBalanceId) {
    this.rebateBalanceId = rebateBalanceId;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner rebateBalanceSerial(String rebateBalanceSerial) {
    
    this.rebateBalanceSerial = rebateBalanceSerial;
    return this;
  }

   /**
   * 返点流水编号（与平台披露编号一致，建议使用）
   * @return rebateBalanceSerial
  **/
  @javax.annotation.Nullable
  public String getRebateBalanceSerial() {
    return rebateBalanceSerial;
  }


  public void setRebateBalanceSerial(String rebateBalanceSerial) {
    this.rebateBalanceSerial = rebateBalanceSerial;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 审批状态code
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner statusName(String statusName) {
    
    this.statusName = statusName;
    return this;
  }

   /**
   * 审批状态name
   * @return statusName
  **/
  @javax.annotation.Nullable
  public String getStatusName() {
    return statusName;
  }


  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * 返点结算类型
   * @return type
  **/
  @javax.annotation.Nullable
  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner typeName(String typeName) {
    
    this.typeName = typeName;
    return this;
  }

   /**
   * 返点结算类型name
   * @return typeName
  **/
  @javax.annotation.Nullable
  public String getTypeName() {
    return typeName;
  }


  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner useTypeNames(List<String> useTypeNames) {
    
    this.useTypeNames = useTypeNames;
    return this;
  }

  public QueryRebateAccountingInfoV2ResponseDataInfoListInner addUseTypeNamesItem(String useTypeNamesItem) {
    if (this.useTypeNames == null) {
      this.useTypeNames = new ArrayList<>();
    }
    this.useTypeNames.add(useTypeNamesItem);
    return this;
  }

   /**
   * 使用类型name
   * @return useTypeNames
  **/
  @javax.annotation.Nullable
  public List<String> getUseTypeNames() {
    return useTypeNames;
  }


  public void setUseTypeNames(List<String> useTypeNames) {
    this.useTypeNames = useTypeNames;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner useTypes(List<Integer> useTypes) {
    
    this.useTypes = useTypes;
    return this;
  }

  public QueryRebateAccountingInfoV2ResponseDataInfoListInner addUseTypesItem(Integer useTypesItem) {
    if (this.useTypes == null) {
      this.useTypes = new ArrayList<>();
    }
    this.useTypes.add(useTypesItem);
    return this;
  }

   /**
   * 使用类型list
   * @return useTypes
  **/
  @javax.annotation.Nullable
  public List<Integer> getUseTypes() {
    return useTypes;
  }


  public void setUseTypes(List<Integer> useTypes) {
    this.useTypes = useTypes;
  }


  public QueryRebateAccountingInfoV2ResponseDataInfoListInner year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * 结算年份 例：2024
   * @return year
  **/
  @javax.annotation.Nullable
  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRebateAccountingInfoV2ResponseDataInfoListInner queryRebateAccountingInfoV2ResponseDataInfoListInner = (QueryRebateAccountingInfoV2ResponseDataInfoListInner) o;
    return Objects.equals(this.agentId, queryRebateAccountingInfoV2ResponseDataInfoListInner.agentId) &&
        Objects.equals(this.agentName, queryRebateAccountingInfoV2ResponseDataInfoListInner.agentName) &&
        Objects.equals(this.amount, queryRebateAccountingInfoV2ResponseDataInfoListInner.amount) &&
        Objects.equals(this.contractSerial, queryRebateAccountingInfoV2ResponseDataInfoListInner.contractSerial) &&
        Objects.equals(this.contractSubjectName, queryRebateAccountingInfoV2ResponseDataInfoListInner.contractSubjectName) &&
        Objects.equals(this.createTime, queryRebateAccountingInfoV2ResponseDataInfoListInner.createTime) &&
        Objects.equals(this.currentApprovalStatusName, queryRebateAccountingInfoV2ResponseDataInfoListInner.currentApprovalStatusName) &&
        Objects.equals(this.isCreateRebate, queryRebateAccountingInfoV2ResponseDataInfoListInner.isCreateRebate) &&
        Objects.equals(this.isCreateRebateName, queryRebateAccountingInfoV2ResponseDataInfoListInner.isCreateRebateName) &&
        Objects.equals(this.monthQuarter, queryRebateAccountingInfoV2ResponseDataInfoListInner.monthQuarter) &&
        Objects.equals(this.monthQuarterName, queryRebateAccountingInfoV2ResponseDataInfoListInner.monthQuarterName) &&
        Objects.equals(this.performanceAmount, queryRebateAccountingInfoV2ResponseDataInfoListInner.performanceAmount) &&
        Objects.equals(this.platform, queryRebateAccountingInfoV2ResponseDataInfoListInner.platform) &&
        Objects.equals(this.platformName, queryRebateAccountingInfoV2ResponseDataInfoListInner.platformName) &&
        Objects.equals(this.rebateAccountingInfoId, queryRebateAccountingInfoV2ResponseDataInfoListInner.rebateAccountingInfoId) &&
        Objects.equals(this.rebateAccountingInfoSerial, queryRebateAccountingInfoV2ResponseDataInfoListInner.rebateAccountingInfoSerial) &&
        Objects.equals(this.rebateBalanceId, queryRebateAccountingInfoV2ResponseDataInfoListInner.rebateBalanceId) &&
        Objects.equals(this.rebateBalanceSerial, queryRebateAccountingInfoV2ResponseDataInfoListInner.rebateBalanceSerial) &&
        Objects.equals(this.status, queryRebateAccountingInfoV2ResponseDataInfoListInner.status) &&
        Objects.equals(this.statusName, queryRebateAccountingInfoV2ResponseDataInfoListInner.statusName) &&
        Objects.equals(this.type, queryRebateAccountingInfoV2ResponseDataInfoListInner.type) &&
        Objects.equals(this.typeName, queryRebateAccountingInfoV2ResponseDataInfoListInner.typeName) &&
        Objects.equals(this.useTypeNames, queryRebateAccountingInfoV2ResponseDataInfoListInner.useTypeNames) &&
        Objects.equals(this.useTypes, queryRebateAccountingInfoV2ResponseDataInfoListInner.useTypes) &&
        Objects.equals(this.year, queryRebateAccountingInfoV2ResponseDataInfoListInner.year);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentName, amount, contractSerial, contractSubjectName, createTime, currentApprovalStatusName, isCreateRebate, isCreateRebateName, monthQuarter, monthQuarterName, performanceAmount, platform, platformName, rebateAccountingInfoId, rebateAccountingInfoSerial, rebateBalanceId, rebateBalanceSerial, status, statusName, type, typeName, useTypeNames, useTypes, year);
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
    sb.append("class QueryRebateAccountingInfoV2ResponseDataInfoListInner {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    contractSubjectName: ").append(toIndentedString(contractSubjectName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    currentApprovalStatusName: ").append(toIndentedString(currentApprovalStatusName)).append("\n");
    sb.append("    isCreateRebate: ").append(toIndentedString(isCreateRebate)).append("\n");
    sb.append("    isCreateRebateName: ").append(toIndentedString(isCreateRebateName)).append("\n");
    sb.append("    monthQuarter: ").append(toIndentedString(monthQuarter)).append("\n");
    sb.append("    monthQuarterName: ").append(toIndentedString(monthQuarterName)).append("\n");
    sb.append("    performanceAmount: ").append(toIndentedString(performanceAmount)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    rebateAccountingInfoId: ").append(toIndentedString(rebateAccountingInfoId)).append("\n");
    sb.append("    rebateAccountingInfoSerial: ").append(toIndentedString(rebateAccountingInfoSerial)).append("\n");
    sb.append("    rebateBalanceId: ").append(toIndentedString(rebateBalanceId)).append("\n");
    sb.append("    rebateBalanceSerial: ").append(toIndentedString(rebateBalanceSerial)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    useTypeNames: ").append(toIndentedString(useTypeNames)).append("\n");
    sb.append("    useTypes: ").append(toIndentedString(useTypes)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("agent_name");
    openapiFields.add("amount");
    openapiFields.add("contract_serial");
    openapiFields.add("contract_subject_name");
    openapiFields.add("create_time");
    openapiFields.add("current_approval_status_name");
    openapiFields.add("is_create_rebate");
    openapiFields.add("is_create_rebate_name");
    openapiFields.add("month_quarter");
    openapiFields.add("month_quarter_name");
    openapiFields.add("performance_amount");
    openapiFields.add("platform");
    openapiFields.add("platform_name");
    openapiFields.add("rebate_accounting_info_id");
    openapiFields.add("rebate_accounting_info_serial");
    openapiFields.add("rebate_balance_id");
    openapiFields.add("rebate_balance_serial");
    openapiFields.add("status");
    openapiFields.add("status_name");
    openapiFields.add("type");
    openapiFields.add("type_name");
    openapiFields.add("use_type_names");
    openapiFields.add("use_types");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryRebateAccountingInfoV2ResponseDataInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryRebateAccountingInfoV2ResponseDataInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryRebateAccountingInfoV2ResponseDataInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryRebateAccountingInfoV2ResponseDataInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryRebateAccountingInfoV2ResponseDataInfoListInner>() {
           @Override
           public void write(JsonWriter out, QueryRebateAccountingInfoV2ResponseDataInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryRebateAccountingInfoV2ResponseDataInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryRebateAccountingInfoV2ResponseDataInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryRebateAccountingInfoV2ResponseDataInfoListInner
  * @throws IOException if the JSON string is invalid with respect to QueryRebateAccountingInfoV2ResponseDataInfoListInner
  */
  public static QueryRebateAccountingInfoV2ResponseDataInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryRebateAccountingInfoV2ResponseDataInfoListInner.class);
  }

 /**
  * Convert an instance of QueryRebateAccountingInfoV2ResponseDataInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

