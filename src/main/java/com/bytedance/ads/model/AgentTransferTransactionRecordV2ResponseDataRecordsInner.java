/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2DataRecordsPayeeRole;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2DataRecordsPlatform;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2DataRecordsRemitterRole;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2DataRecordsTransferType;
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
 * AgentTransferTransactionRecordV2ResponseDataRecordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class AgentTransferTransactionRecordV2ResponseDataRecordsInner {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_CASH = "cash";
  @SerializedName(SERIALIZED_NAME_CASH)
  private Double cash = null;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT = "credit_amount";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT)
  private Double creditAmount = null;

  public static final String SERIALIZED_NAME_GRANTS = "grants";
  @SerializedName(SERIALIZED_NAME_GRANTS)
  private Double grants = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator = null;

  public static final String SERIALIZED_NAME_OPERATOR_ID = "operator_id";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ID)
  private String operatorId = null;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private String payee = null;

  public static final String SERIALIZED_NAME_PAYEE_CUSTOMER_ID = "payee_customer_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_CUSTOMER_ID)
  private String payeeCustomerId = null;

  public static final String SERIALIZED_NAME_PAYEE_CUSTOMER_NAME = "payee_customer_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_CUSTOMER_NAME)
  private String payeeCustomerName = null;

  public static final String SERIALIZED_NAME_PAYEE_FIRST_AD_AGENT_ID = "payee_first_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_FIRST_AD_AGENT_ID)
  private String payeeFirstAdAgentId = null;

  public static final String SERIALIZED_NAME_PAYEE_FIRST_AD_AGENT_NAME = "payee_first_ad_agent_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_FIRST_AD_AGENT_NAME)
  private String payeeFirstAdAgentName = null;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName = null;

  public static final String SERIALIZED_NAME_PAYEE_ROLE = "payee_role";
  @SerializedName(SERIALIZED_NAME_PAYEE_ROLE)
  private AgentTransferTransactionRecordV2DataRecordsPayeeRole payeeRole = null;

  public static final String SERIALIZED_NAME_PAYEE_SECOND_AD_AGENT_ID = "payee_second_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_SECOND_AD_AGENT_ID)
  private String payeeSecondAdAgentId = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private AgentTransferTransactionRecordV2DataRecordsPlatform platform = null;

  public static final String SERIALIZED_NAME_PREPAY_AMOUNT = "prepay_amount";
  @SerializedName(SERIALIZED_NAME_PREPAY_AMOUNT)
  private Double prepayAmount = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_REMITTER = "remitter";
  @SerializedName(SERIALIZED_NAME_REMITTER)
  private String remitter = null;

  public static final String SERIALIZED_NAME_REMITTER_CUSTOMER_ID = "remitter_customer_id";
  @SerializedName(SERIALIZED_NAME_REMITTER_CUSTOMER_ID)
  private String remitterCustomerId = null;

  public static final String SERIALIZED_NAME_REMITTER_CUSTOMER_NAME = "remitter_customer_name";
  @SerializedName(SERIALIZED_NAME_REMITTER_CUSTOMER_NAME)
  private String remitterCustomerName = null;

  public static final String SERIALIZED_NAME_REMITTER_FIRST_AD_AGENT_ID = "remitter_first_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_REMITTER_FIRST_AD_AGENT_ID)
  private String remitterFirstAdAgentId = null;

  public static final String SERIALIZED_NAME_REMITTER_FIRST_AD_AGENT_NAME = "remitter_first_ad_agent_name";
  @SerializedName(SERIALIZED_NAME_REMITTER_FIRST_AD_AGENT_NAME)
  private String remitterFirstAdAgentName = null;

  public static final String SERIALIZED_NAME_REMITTER_NAME = "remitter_name";
  @SerializedName(SERIALIZED_NAME_REMITTER_NAME)
  private String remitterName = null;

  public static final String SERIALIZED_NAME_REMITTER_ROLE = "remitter_role";
  @SerializedName(SERIALIZED_NAME_REMITTER_ROLE)
  private AgentTransferTransactionRecordV2DataRecordsRemitterRole remitterRole = null;

  public static final String SERIALIZED_NAME_REMITTER_SECOND_AD_AGENT_ID = "remitter_second_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_REMITTER_SECOND_AD_AGENT_ID)
  private String remitterSecondAdAgentId = null;

  public static final String SERIALIZED_NAME_TRANSFER_ORDER_SERIAL = "transfer_order_serial";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ORDER_SERIAL)
  private String transferOrderSerial = null;

  public static final String SERIALIZED_NAME_TRANSFER_TARGET_PAY_STATUS = "transfer_target_pay_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TARGET_PAY_STATUS)
  private AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus transferTargetPayStatus = null;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transfer_type";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private AgentTransferTransactionRecordV2DataRecordsTransferType transferType = null;

  public AgentTransferTransactionRecordV2ResponseDataRecordsInner() {
  }

  public AgentTransferTransactionRecordV2ResponseDataRecordsInner amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 总金额（元）
   * @return amount
  **/
  @javax.annotation.Nullable
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner cash(Double cash) {
    
    this.cash = cash;
    return this;
  }

   /**
   * 非赠款金额(元)
   * @return cash
  **/
  @javax.annotation.Nullable
  public Double getCash() {
    return cash;
  }


  public void setCash(Double cash) {
    this.cash = cash;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner creditAmount(Double creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * 授信金额额（元）
   * @return creditAmount
  **/
  @javax.annotation.Nullable
  public Double getCreditAmount() {
    return creditAmount;
  }


  public void setCreditAmount(Double creditAmount) {
    this.creditAmount = creditAmount;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner grants(Double grants) {
    
    this.grants = grants;
    return this;
  }

   /**
   * 赠款金额(元)
   * @return grants
  **/
  @javax.annotation.Nullable
  public Double getGrants() {
    return grants;
  }


  public void setGrants(Double grants) {
    this.grants = grants;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 转账时间
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 操作人名称
   * @return operator
  **/
  @javax.annotation.Nullable
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner operatorId(String operatorId) {
    
    this.operatorId = operatorId;
    return this;
  }

   /**
   * 操作人id
   * @return operatorId
  **/
  @javax.annotation.Nullable
  public String getOperatorId() {
    return operatorId;
  }


  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payee(String payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * 转入方账户ID
   * @return payee
  **/
  @javax.annotation.Nullable
  public String getPayee() {
    return payee;
  }


  public void setPayee(String payee) {
    this.payee = payee;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payeeCustomerId(String payeeCustomerId) {
    
    this.payeeCustomerId = payeeCustomerId;
    return this;
  }

   /**
   * 转入方客户ID
   * @return payeeCustomerId
  **/
  @javax.annotation.Nullable
  public String getPayeeCustomerId() {
    return payeeCustomerId;
  }


  public void setPayeeCustomerId(String payeeCustomerId) {
    this.payeeCustomerId = payeeCustomerId;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payeeCustomerName(String payeeCustomerName) {
    
    this.payeeCustomerName = payeeCustomerName;
    return this;
  }

   /**
   * 转入方客户名称
   * @return payeeCustomerName
  **/
  @javax.annotation.Nullable
  public String getPayeeCustomerName() {
    return payeeCustomerName;
  }


  public void setPayeeCustomerName(String payeeCustomerName) {
    this.payeeCustomerName = payeeCustomerName;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payeeFirstAdAgentId(String payeeFirstAdAgentId) {
    
    this.payeeFirstAdAgentId = payeeFirstAdAgentId;
    return this;
  }

   /**
   * 转入方一代账户ID
   * @return payeeFirstAdAgentId
  **/
  @javax.annotation.Nullable
  public String getPayeeFirstAdAgentId() {
    return payeeFirstAdAgentId;
  }


  public void setPayeeFirstAdAgentId(String payeeFirstAdAgentId) {
    this.payeeFirstAdAgentId = payeeFirstAdAgentId;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payeeFirstAdAgentName(String payeeFirstAdAgentName) {
    
    this.payeeFirstAdAgentName = payeeFirstAdAgentName;
    return this;
  }

   /**
   * 转入方一代账户名称
   * @return payeeFirstAdAgentName
  **/
  @javax.annotation.Nullable
  public String getPayeeFirstAdAgentName() {
    return payeeFirstAdAgentName;
  }


  public void setPayeeFirstAdAgentName(String payeeFirstAdAgentName) {
    this.payeeFirstAdAgentName = payeeFirstAdAgentName;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 转入方账户名称
   * @return payeeName
  **/
  @javax.annotation.Nullable
  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payeeRole(AgentTransferTransactionRecordV2DataRecordsPayeeRole payeeRole) {
    
    this.payeeRole = payeeRole;
    return this;
  }

   /**
   * Get payeeRole
   * @return payeeRole
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2DataRecordsPayeeRole getPayeeRole() {
    return payeeRole;
  }


  public void setPayeeRole(AgentTransferTransactionRecordV2DataRecordsPayeeRole payeeRole) {
    this.payeeRole = payeeRole;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner payeeSecondAdAgentId(String payeeSecondAdAgentId) {
    
    this.payeeSecondAdAgentId = payeeSecondAdAgentId;
    return this;
  }

   /**
   * 转入方二代账户ID
   * @return payeeSecondAdAgentId
  **/
  @javax.annotation.Nullable
  public String getPayeeSecondAdAgentId() {
    return payeeSecondAdAgentId;
  }


  public void setPayeeSecondAdAgentId(String payeeSecondAdAgentId) {
    this.payeeSecondAdAgentId = payeeSecondAdAgentId;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner platform(AgentTransferTransactionRecordV2DataRecordsPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2DataRecordsPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(AgentTransferTransactionRecordV2DataRecordsPlatform platform) {
    this.platform = platform;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner prepayAmount(Double prepayAmount) {
    
    this.prepayAmount = prepayAmount;
    return this;
  }

   /**
   * 预付金额（元）
   * @return prepayAmount
  **/
  @javax.annotation.Nullable
  public Double getPrepayAmount() {
    return prepayAmount;
  }


  public void setPrepayAmount(Double prepayAmount) {
    this.prepayAmount = prepayAmount;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 转账备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitter(String remitter) {
    
    this.remitter = remitter;
    return this;
  }

   /**
   * 转账时间转出方账户ID
   * @return remitter
  **/
  @javax.annotation.Nullable
  public String getRemitter() {
    return remitter;
  }


  public void setRemitter(String remitter) {
    this.remitter = remitter;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitterCustomerId(String remitterCustomerId) {
    
    this.remitterCustomerId = remitterCustomerId;
    return this;
  }

   /**
   * 转出方客户ID
   * @return remitterCustomerId
  **/
  @javax.annotation.Nullable
  public String getRemitterCustomerId() {
    return remitterCustomerId;
  }


  public void setRemitterCustomerId(String remitterCustomerId) {
    this.remitterCustomerId = remitterCustomerId;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitterCustomerName(String remitterCustomerName) {
    
    this.remitterCustomerName = remitterCustomerName;
    return this;
  }

   /**
   * 转出方客户名称
   * @return remitterCustomerName
  **/
  @javax.annotation.Nullable
  public String getRemitterCustomerName() {
    return remitterCustomerName;
  }


  public void setRemitterCustomerName(String remitterCustomerName) {
    this.remitterCustomerName = remitterCustomerName;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitterFirstAdAgentId(String remitterFirstAdAgentId) {
    
    this.remitterFirstAdAgentId = remitterFirstAdAgentId;
    return this;
  }

   /**
   * 转出方一代账户ID
   * @return remitterFirstAdAgentId
  **/
  @javax.annotation.Nullable
  public String getRemitterFirstAdAgentId() {
    return remitterFirstAdAgentId;
  }


  public void setRemitterFirstAdAgentId(String remitterFirstAdAgentId) {
    this.remitterFirstAdAgentId = remitterFirstAdAgentId;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitterFirstAdAgentName(String remitterFirstAdAgentName) {
    
    this.remitterFirstAdAgentName = remitterFirstAdAgentName;
    return this;
  }

   /**
   * 转出方一代账户名称
   * @return remitterFirstAdAgentName
  **/
  @javax.annotation.Nullable
  public String getRemitterFirstAdAgentName() {
    return remitterFirstAdAgentName;
  }


  public void setRemitterFirstAdAgentName(String remitterFirstAdAgentName) {
    this.remitterFirstAdAgentName = remitterFirstAdAgentName;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitterName(String remitterName) {
    
    this.remitterName = remitterName;
    return this;
  }

   /**
   * 转出方账户名称
   * @return remitterName
  **/
  @javax.annotation.Nullable
  public String getRemitterName() {
    return remitterName;
  }


  public void setRemitterName(String remitterName) {
    this.remitterName = remitterName;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitterRole(AgentTransferTransactionRecordV2DataRecordsRemitterRole remitterRole) {
    
    this.remitterRole = remitterRole;
    return this;
  }

   /**
   * Get remitterRole
   * @return remitterRole
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2DataRecordsRemitterRole getRemitterRole() {
    return remitterRole;
  }


  public void setRemitterRole(AgentTransferTransactionRecordV2DataRecordsRemitterRole remitterRole) {
    this.remitterRole = remitterRole;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner remitterSecondAdAgentId(String remitterSecondAdAgentId) {
    
    this.remitterSecondAdAgentId = remitterSecondAdAgentId;
    return this;
  }

   /**
   * 转出方二代账户ID
   * @return remitterSecondAdAgentId
  **/
  @javax.annotation.Nullable
  public String getRemitterSecondAdAgentId() {
    return remitterSecondAdAgentId;
  }


  public void setRemitterSecondAdAgentId(String remitterSecondAdAgentId) {
    this.remitterSecondAdAgentId = remitterSecondAdAgentId;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner transferOrderSerial(String transferOrderSerial) {
    
    this.transferOrderSerial = transferOrderSerial;
    return this;
  }

   /**
   * 转账编号
   * @return transferOrderSerial
  **/
  @javax.annotation.Nullable
  public String getTransferOrderSerial() {
    return transferOrderSerial;
  }


  public void setTransferOrderSerial(String transferOrderSerial) {
    this.transferOrderSerial = transferOrderSerial;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner transferTargetPayStatus(AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus transferTargetPayStatus) {
    
    this.transferTargetPayStatus = transferTargetPayStatus;
    return this;
  }

   /**
   * Get transferTargetPayStatus
   * @return transferTargetPayStatus
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus getTransferTargetPayStatus() {
    return transferTargetPayStatus;
  }


  public void setTransferTargetPayStatus(AgentTransferTransactionRecordV2DataRecordsTransferTargetPayStatus transferTargetPayStatus) {
    this.transferTargetPayStatus = transferTargetPayStatus;
  }


  public AgentTransferTransactionRecordV2ResponseDataRecordsInner transferType(AgentTransferTransactionRecordV2DataRecordsTransferType transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2DataRecordsTransferType getTransferType() {
    return transferType;
  }


  public void setTransferType(AgentTransferTransactionRecordV2DataRecordsTransferType transferType) {
    this.transferType = transferType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentTransferTransactionRecordV2ResponseDataRecordsInner agentTransferTransactionRecordV2ResponseDataRecordsInner = (AgentTransferTransactionRecordV2ResponseDataRecordsInner) o;
    return Objects.equals(this.amount, agentTransferTransactionRecordV2ResponseDataRecordsInner.amount) &&
        Objects.equals(this.cash, agentTransferTransactionRecordV2ResponseDataRecordsInner.cash) &&
        Objects.equals(this.creditAmount, agentTransferTransactionRecordV2ResponseDataRecordsInner.creditAmount) &&
        Objects.equals(this.grants, agentTransferTransactionRecordV2ResponseDataRecordsInner.grants) &&
        Objects.equals(this.modifyTime, agentTransferTransactionRecordV2ResponseDataRecordsInner.modifyTime) &&
        Objects.equals(this.operator, agentTransferTransactionRecordV2ResponseDataRecordsInner.operator) &&
        Objects.equals(this.operatorId, agentTransferTransactionRecordV2ResponseDataRecordsInner.operatorId) &&
        Objects.equals(this.payee, agentTransferTransactionRecordV2ResponseDataRecordsInner.payee) &&
        Objects.equals(this.payeeCustomerId, agentTransferTransactionRecordV2ResponseDataRecordsInner.payeeCustomerId) &&
        Objects.equals(this.payeeCustomerName, agentTransferTransactionRecordV2ResponseDataRecordsInner.payeeCustomerName) &&
        Objects.equals(this.payeeFirstAdAgentId, agentTransferTransactionRecordV2ResponseDataRecordsInner.payeeFirstAdAgentId) &&
        Objects.equals(this.payeeFirstAdAgentName, agentTransferTransactionRecordV2ResponseDataRecordsInner.payeeFirstAdAgentName) &&
        Objects.equals(this.payeeName, agentTransferTransactionRecordV2ResponseDataRecordsInner.payeeName) &&
        Objects.equals(this.payeeRole, agentTransferTransactionRecordV2ResponseDataRecordsInner.payeeRole) &&
        Objects.equals(this.payeeSecondAdAgentId, agentTransferTransactionRecordV2ResponseDataRecordsInner.payeeSecondAdAgentId) &&
        Objects.equals(this.platform, agentTransferTransactionRecordV2ResponseDataRecordsInner.platform) &&
        Objects.equals(this.prepayAmount, agentTransferTransactionRecordV2ResponseDataRecordsInner.prepayAmount) &&
        Objects.equals(this.remark, agentTransferTransactionRecordV2ResponseDataRecordsInner.remark) &&
        Objects.equals(this.remitter, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitter) &&
        Objects.equals(this.remitterCustomerId, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitterCustomerId) &&
        Objects.equals(this.remitterCustomerName, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitterCustomerName) &&
        Objects.equals(this.remitterFirstAdAgentId, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitterFirstAdAgentId) &&
        Objects.equals(this.remitterFirstAdAgentName, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitterFirstAdAgentName) &&
        Objects.equals(this.remitterName, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitterName) &&
        Objects.equals(this.remitterRole, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitterRole) &&
        Objects.equals(this.remitterSecondAdAgentId, agentTransferTransactionRecordV2ResponseDataRecordsInner.remitterSecondAdAgentId) &&
        Objects.equals(this.transferOrderSerial, agentTransferTransactionRecordV2ResponseDataRecordsInner.transferOrderSerial) &&
        Objects.equals(this.transferTargetPayStatus, agentTransferTransactionRecordV2ResponseDataRecordsInner.transferTargetPayStatus) &&
        Objects.equals(this.transferType, agentTransferTransactionRecordV2ResponseDataRecordsInner.transferType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cash, creditAmount, grants, modifyTime, operator, operatorId, payee, payeeCustomerId, payeeCustomerName, payeeFirstAdAgentId, payeeFirstAdAgentName, payeeName, payeeRole, payeeSecondAdAgentId, platform, prepayAmount, remark, remitter, remitterCustomerId, remitterCustomerName, remitterFirstAdAgentId, remitterFirstAdAgentName, remitterName, remitterRole, remitterSecondAdAgentId, transferOrderSerial, transferTargetPayStatus, transferType);
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
    sb.append("class AgentTransferTransactionRecordV2ResponseDataRecordsInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    payeeCustomerId: ").append(toIndentedString(payeeCustomerId)).append("\n");
    sb.append("    payeeCustomerName: ").append(toIndentedString(payeeCustomerName)).append("\n");
    sb.append("    payeeFirstAdAgentId: ").append(toIndentedString(payeeFirstAdAgentId)).append("\n");
    sb.append("    payeeFirstAdAgentName: ").append(toIndentedString(payeeFirstAdAgentName)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    payeeRole: ").append(toIndentedString(payeeRole)).append("\n");
    sb.append("    payeeSecondAdAgentId: ").append(toIndentedString(payeeSecondAdAgentId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    prepayAmount: ").append(toIndentedString(prepayAmount)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    remitter: ").append(toIndentedString(remitter)).append("\n");
    sb.append("    remitterCustomerId: ").append(toIndentedString(remitterCustomerId)).append("\n");
    sb.append("    remitterCustomerName: ").append(toIndentedString(remitterCustomerName)).append("\n");
    sb.append("    remitterFirstAdAgentId: ").append(toIndentedString(remitterFirstAdAgentId)).append("\n");
    sb.append("    remitterFirstAdAgentName: ").append(toIndentedString(remitterFirstAdAgentName)).append("\n");
    sb.append("    remitterName: ").append(toIndentedString(remitterName)).append("\n");
    sb.append("    remitterRole: ").append(toIndentedString(remitterRole)).append("\n");
    sb.append("    remitterSecondAdAgentId: ").append(toIndentedString(remitterSecondAdAgentId)).append("\n");
    sb.append("    transferOrderSerial: ").append(toIndentedString(transferOrderSerial)).append("\n");
    sb.append("    transferTargetPayStatus: ").append(toIndentedString(transferTargetPayStatus)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("cash");
    openapiFields.add("credit_amount");
    openapiFields.add("grants");
    openapiFields.add("modify_time");
    openapiFields.add("operator");
    openapiFields.add("operator_id");
    openapiFields.add("payee");
    openapiFields.add("payee_customer_id");
    openapiFields.add("payee_customer_name");
    openapiFields.add("payee_first_ad_agent_id");
    openapiFields.add("payee_first_ad_agent_name");
    openapiFields.add("payee_name");
    openapiFields.add("payee_role");
    openapiFields.add("payee_second_ad_agent_id");
    openapiFields.add("platform");
    openapiFields.add("prepay_amount");
    openapiFields.add("remark");
    openapiFields.add("remitter");
    openapiFields.add("remitter_customer_id");
    openapiFields.add("remitter_customer_name");
    openapiFields.add("remitter_first_ad_agent_id");
    openapiFields.add("remitter_first_ad_agent_name");
    openapiFields.add("remitter_name");
    openapiFields.add("remitter_role");
    openapiFields.add("remitter_second_ad_agent_id");
    openapiFields.add("transfer_order_serial");
    openapiFields.add("transfer_target_pay_status");
    openapiFields.add("transfer_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentTransferTransactionRecordV2ResponseDataRecordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentTransferTransactionRecordV2ResponseDataRecordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentTransferTransactionRecordV2ResponseDataRecordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentTransferTransactionRecordV2ResponseDataRecordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentTransferTransactionRecordV2ResponseDataRecordsInner>() {
           @Override
           public void write(JsonWriter out, AgentTransferTransactionRecordV2ResponseDataRecordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentTransferTransactionRecordV2ResponseDataRecordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentTransferTransactionRecordV2ResponseDataRecordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentTransferTransactionRecordV2ResponseDataRecordsInner
  * @throws IOException if the JSON string is invalid with respect to AgentTransferTransactionRecordV2ResponseDataRecordsInner
  */
  public static AgentTransferTransactionRecordV2ResponseDataRecordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentTransferTransactionRecordV2ResponseDataRecordsInner.class);
  }

 /**
  * Convert an instance of AgentTransferTransactionRecordV2ResponseDataRecordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
