/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2FilteringPayeeType;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2FilteringPlatform;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2FilteringRemitterType;
import com.bytedance.ads.model.AgentTransferTransactionRecordV2FilteringTransferType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class AgentTransferTransactionRecordV2Filtering {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<Long> accountIds = null;

  public static final String SERIALIZED_NAME_CUSTOMER_IDS = "customer_ids";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_IDS)
  private List<Long> customerIds = null;

  public static final String SERIALIZED_NAME_OPERATOR_IDS = "operator_ids";
  @SerializedName(SERIALIZED_NAME_OPERATOR_IDS)
  private List<Long> operatorIds = null;

  public static final String SERIALIZED_NAME_PAYEE_CUSTOMER_IDS = "payee_customer_ids";
  @SerializedName(SERIALIZED_NAME_PAYEE_CUSTOMER_IDS)
  private List<Long> payeeCustomerIds = null;

  public static final String SERIALIZED_NAME_PAYEE_FIRST_AD_AGENT_ID = "payee_first_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_FIRST_AD_AGENT_ID)
  private Long payeeFirstAdAgentId = null;

  public static final String SERIALIZED_NAME_PAYEE_TYPE = "payee_type";
  @SerializedName(SERIALIZED_NAME_PAYEE_TYPE)
  private AgentTransferTransactionRecordV2FilteringPayeeType payeeType = null;

  public static final String SERIALIZED_NAME_PAYEES = "payees";
  @SerializedName(SERIALIZED_NAME_PAYEES)
  private List<Long> payees = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private AgentTransferTransactionRecordV2FilteringPlatform platform = null;

  public static final String SERIALIZED_NAME_REMITTER_CUSTOMER_IDS = "remitter_customer_ids";
  @SerializedName(SERIALIZED_NAME_REMITTER_CUSTOMER_IDS)
  private List<Long> remitterCustomerIds = null;

  public static final String SERIALIZED_NAME_REMITTER_FIRST_AD_AGENT_ID = "remitter_first_ad_agent_id";
  @SerializedName(SERIALIZED_NAME_REMITTER_FIRST_AD_AGENT_ID)
  private Long remitterFirstAdAgentId = null;

  public static final String SERIALIZED_NAME_REMITTER_TYPE = "remitter_type";
  @SerializedName(SERIALIZED_NAME_REMITTER_TYPE)
  private AgentTransferTransactionRecordV2FilteringRemitterType remitterType = null;

  public static final String SERIALIZED_NAME_REMITTERS = "remitters";
  @SerializedName(SERIALIZED_NAME_REMITTERS)
  private List<Long> remitters = null;

  public static final String SERIALIZED_NAME_TRANSFER_ORDER_SERIAL = "transfer_order_serial";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ORDER_SERIAL)
  private String transferOrderSerial = null;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transfer_type";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private AgentTransferTransactionRecordV2FilteringTransferType transferType = null;

  public AgentTransferTransactionRecordV2Filtering() {
  }

  public AgentTransferTransactionRecordV2Filtering accountIds(List<Long> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public AgentTransferTransactionRecordV2Filtering addAccountIdsItem(Long accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * 转入/转出方账户
   * @return accountIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<Long> accountIds) {
    this.accountIds = accountIds;
  }


  public AgentTransferTransactionRecordV2Filtering customerIds(List<Long> customerIds) {
    
    this.customerIds = customerIds;
    return this;
  }

  public AgentTransferTransactionRecordV2Filtering addCustomerIdsItem(Long customerIdsItem) {
    if (this.customerIds == null) {
      this.customerIds = new ArrayList<>();
    }
    this.customerIds.add(customerIdsItem);
    return this;
  }

   /**
   * 转入/转出方客户
   * @return customerIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCustomerIds() {
    return customerIds;
  }


  public void setCustomerIds(List<Long> customerIds) {
    this.customerIds = customerIds;
  }


  public AgentTransferTransactionRecordV2Filtering operatorIds(List<Long> operatorIds) {
    
    this.operatorIds = operatorIds;
    return this;
  }

  public AgentTransferTransactionRecordV2Filtering addOperatorIdsItem(Long operatorIdsItem) {
    if (this.operatorIds == null) {
      this.operatorIds = new ArrayList<>();
    }
    this.operatorIds.add(operatorIdsItem);
    return this;
  }

   /**
   * 操作人
   * @return operatorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOperatorIds() {
    return operatorIds;
  }


  public void setOperatorIds(List<Long> operatorIds) {
    this.operatorIds = operatorIds;
  }


  public AgentTransferTransactionRecordV2Filtering payeeCustomerIds(List<Long> payeeCustomerIds) {
    
    this.payeeCustomerIds = payeeCustomerIds;
    return this;
  }

  public AgentTransferTransactionRecordV2Filtering addPayeeCustomerIdsItem(Long payeeCustomerIdsItem) {
    if (this.payeeCustomerIds == null) {
      this.payeeCustomerIds = new ArrayList<>();
    }
    this.payeeCustomerIds.add(payeeCustomerIdsItem);
    return this;
  }

   /**
   * 转入方客户
   * @return payeeCustomerIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPayeeCustomerIds() {
    return payeeCustomerIds;
  }


  public void setPayeeCustomerIds(List<Long> payeeCustomerIds) {
    this.payeeCustomerIds = payeeCustomerIds;
  }


  public AgentTransferTransactionRecordV2Filtering payeeFirstAdAgentId(Long payeeFirstAdAgentId) {
    
    this.payeeFirstAdAgentId = payeeFirstAdAgentId;
    return this;
  }

   /**
   * 转入方代理商账户
   * @return payeeFirstAdAgentId
  **/
  @javax.annotation.Nullable
  public Long getPayeeFirstAdAgentId() {
    return payeeFirstAdAgentId;
  }


  public void setPayeeFirstAdAgentId(Long payeeFirstAdAgentId) {
    this.payeeFirstAdAgentId = payeeFirstAdAgentId;
  }


  public AgentTransferTransactionRecordV2Filtering payeeType(AgentTransferTransactionRecordV2FilteringPayeeType payeeType) {
    
    this.payeeType = payeeType;
    return this;
  }

   /**
   * Get payeeType
   * @return payeeType
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2FilteringPayeeType getPayeeType() {
    return payeeType;
  }


  public void setPayeeType(AgentTransferTransactionRecordV2FilteringPayeeType payeeType) {
    this.payeeType = payeeType;
  }


  public AgentTransferTransactionRecordV2Filtering payees(List<Long> payees) {
    
    this.payees = payees;
    return this;
  }

  public AgentTransferTransactionRecordV2Filtering addPayeesItem(Long payeesItem) {
    if (this.payees == null) {
      this.payees = new ArrayList<>();
    }
    this.payees.add(payeesItem);
    return this;
  }

   /**
   * 转入方账号
   * @return payees
  **/
  @javax.annotation.Nullable
  public List<Long> getPayees() {
    return payees;
  }


  public void setPayees(List<Long> payees) {
    this.payees = payees;
  }


  public AgentTransferTransactionRecordV2Filtering platform(AgentTransferTransactionRecordV2FilteringPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2FilteringPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(AgentTransferTransactionRecordV2FilteringPlatform platform) {
    this.platform = platform;
  }


  public AgentTransferTransactionRecordV2Filtering remitterCustomerIds(List<Long> remitterCustomerIds) {
    
    this.remitterCustomerIds = remitterCustomerIds;
    return this;
  }

  public AgentTransferTransactionRecordV2Filtering addRemitterCustomerIdsItem(Long remitterCustomerIdsItem) {
    if (this.remitterCustomerIds == null) {
      this.remitterCustomerIds = new ArrayList<>();
    }
    this.remitterCustomerIds.add(remitterCustomerIdsItem);
    return this;
  }

   /**
   * 转出方客户
   * @return remitterCustomerIds
  **/
  @javax.annotation.Nullable
  public List<Long> getRemitterCustomerIds() {
    return remitterCustomerIds;
  }


  public void setRemitterCustomerIds(List<Long> remitterCustomerIds) {
    this.remitterCustomerIds = remitterCustomerIds;
  }


  public AgentTransferTransactionRecordV2Filtering remitterFirstAdAgentId(Long remitterFirstAdAgentId) {
    
    this.remitterFirstAdAgentId = remitterFirstAdAgentId;
    return this;
  }

   /**
   * 转出方代理商账户
   * @return remitterFirstAdAgentId
  **/
  @javax.annotation.Nullable
  public Long getRemitterFirstAdAgentId() {
    return remitterFirstAdAgentId;
  }


  public void setRemitterFirstAdAgentId(Long remitterFirstAdAgentId) {
    this.remitterFirstAdAgentId = remitterFirstAdAgentId;
  }


  public AgentTransferTransactionRecordV2Filtering remitterType(AgentTransferTransactionRecordV2FilteringRemitterType remitterType) {
    
    this.remitterType = remitterType;
    return this;
  }

   /**
   * Get remitterType
   * @return remitterType
  **/
  @javax.annotation.Nullable
  public AgentTransferTransactionRecordV2FilteringRemitterType getRemitterType() {
    return remitterType;
  }


  public void setRemitterType(AgentTransferTransactionRecordV2FilteringRemitterType remitterType) {
    this.remitterType = remitterType;
  }


  public AgentTransferTransactionRecordV2Filtering remitters(List<Long> remitters) {
    
    this.remitters = remitters;
    return this;
  }

  public AgentTransferTransactionRecordV2Filtering addRemittersItem(Long remittersItem) {
    if (this.remitters == null) {
      this.remitters = new ArrayList<>();
    }
    this.remitters.add(remittersItem);
    return this;
  }

   /**
   * 转出方账户
   * @return remitters
  **/
  @javax.annotation.Nullable
  public List<Long> getRemitters() {
    return remitters;
  }


  public void setRemitters(List<Long> remitters) {
    this.remitters = remitters;
  }


  public AgentTransferTransactionRecordV2Filtering transferOrderSerial(String transferOrderSerial) {
    
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


  public AgentTransferTransactionRecordV2Filtering transferType(AgentTransferTransactionRecordV2FilteringTransferType transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nonnull
  public AgentTransferTransactionRecordV2FilteringTransferType getTransferType() {
    return transferType;
  }


  public void setTransferType(AgentTransferTransactionRecordV2FilteringTransferType transferType) {
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
    AgentTransferTransactionRecordV2Filtering agentTransferTransactionRecordV2Filtering = (AgentTransferTransactionRecordV2Filtering) o;
    return Objects.equals(this.accountIds, agentTransferTransactionRecordV2Filtering.accountIds) &&
        Objects.equals(this.customerIds, agentTransferTransactionRecordV2Filtering.customerIds) &&
        Objects.equals(this.operatorIds, agentTransferTransactionRecordV2Filtering.operatorIds) &&
        Objects.equals(this.payeeCustomerIds, agentTransferTransactionRecordV2Filtering.payeeCustomerIds) &&
        Objects.equals(this.payeeFirstAdAgentId, agentTransferTransactionRecordV2Filtering.payeeFirstAdAgentId) &&
        Objects.equals(this.payeeType, agentTransferTransactionRecordV2Filtering.payeeType) &&
        Objects.equals(this.payees, agentTransferTransactionRecordV2Filtering.payees) &&
        Objects.equals(this.platform, agentTransferTransactionRecordV2Filtering.platform) &&
        Objects.equals(this.remitterCustomerIds, agentTransferTransactionRecordV2Filtering.remitterCustomerIds) &&
        Objects.equals(this.remitterFirstAdAgentId, agentTransferTransactionRecordV2Filtering.remitterFirstAdAgentId) &&
        Objects.equals(this.remitterType, agentTransferTransactionRecordV2Filtering.remitterType) &&
        Objects.equals(this.remitters, agentTransferTransactionRecordV2Filtering.remitters) &&
        Objects.equals(this.transferOrderSerial, agentTransferTransactionRecordV2Filtering.transferOrderSerial) &&
        Objects.equals(this.transferType, agentTransferTransactionRecordV2Filtering.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, customerIds, operatorIds, payeeCustomerIds, payeeFirstAdAgentId, payeeType, payees, platform, remitterCustomerIds, remitterFirstAdAgentId, remitterType, remitters, transferOrderSerial, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentTransferTransactionRecordV2Filtering {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
    sb.append("    operatorIds: ").append(toIndentedString(operatorIds)).append("\n");
    sb.append("    payeeCustomerIds: ").append(toIndentedString(payeeCustomerIds)).append("\n");
    sb.append("    payeeFirstAdAgentId: ").append(toIndentedString(payeeFirstAdAgentId)).append("\n");
    sb.append("    payeeType: ").append(toIndentedString(payeeType)).append("\n");
    sb.append("    payees: ").append(toIndentedString(payees)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    remitterCustomerIds: ").append(toIndentedString(remitterCustomerIds)).append("\n");
    sb.append("    remitterFirstAdAgentId: ").append(toIndentedString(remitterFirstAdAgentId)).append("\n");
    sb.append("    remitterType: ").append(toIndentedString(remitterType)).append("\n");
    sb.append("    remitters: ").append(toIndentedString(remitters)).append("\n");
    sb.append("    transferOrderSerial: ").append(toIndentedString(transferOrderSerial)).append("\n");
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
    openapiFields.add("account_ids");
    openapiFields.add("customer_ids");
    openapiFields.add("operator_ids");
    openapiFields.add("payee_customer_ids");
    openapiFields.add("payee_first_ad_agent_id");
    openapiFields.add("payee_type");
    openapiFields.add("payees");
    openapiFields.add("platform");
    openapiFields.add("remitter_customer_ids");
    openapiFields.add("remitter_first_ad_agent_id");
    openapiFields.add("remitter_type");
    openapiFields.add("remitters");
    openapiFields.add("transfer_order_serial");
    openapiFields.add("transfer_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transfer_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentTransferTransactionRecordV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentTransferTransactionRecordV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentTransferTransactionRecordV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentTransferTransactionRecordV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentTransferTransactionRecordV2Filtering>() {
           @Override
           public void write(JsonWriter out, AgentTransferTransactionRecordV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentTransferTransactionRecordV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentTransferTransactionRecordV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentTransferTransactionRecordV2Filtering
  * @throws IOException if the JSON string is invalid with respect to AgentTransferTransactionRecordV2Filtering
  */
  public static AgentTransferTransactionRecordV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentTransferTransactionRecordV2Filtering.class);
  }

 /**
  * Convert an instance of AgentTransferTransactionRecordV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

