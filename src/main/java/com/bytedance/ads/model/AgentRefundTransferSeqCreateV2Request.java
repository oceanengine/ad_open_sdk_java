/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentRefundTransferSeqCreateV2TransferType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * AgentRefundTransferSeqCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class AgentRefundTransferSeqCreateV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transfer_type";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private AgentRefundTransferSeqCreateV2TransferType transferType = null;

  public AgentRefundTransferSeqCreateV2Request() {
  }

  public AgentRefundTransferSeqCreateV2Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 广告主账户ID
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AgentRefundTransferSeqCreateV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商账户ID
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentRefundTransferSeqCreateV2Request amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 转账金额，单位为分
   * minimum: 0.01
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public AgentRefundTransferSeqCreateV2Request transferType(AgentRefundTransferSeqCreateV2TransferType transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nonnull
  public AgentRefundTransferSeqCreateV2TransferType getTransferType() {
    return transferType;
  }


  public void setTransferType(AgentRefundTransferSeqCreateV2TransferType transferType) {
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
    AgentRefundTransferSeqCreateV2Request agentRefundTransferSeqCreateV2Request = (AgentRefundTransferSeqCreateV2Request) o;
    return Objects.equals(this.accountId, agentRefundTransferSeqCreateV2Request.accountId) &&
        Objects.equals(this.agentId, agentRefundTransferSeqCreateV2Request.agentId) &&
        Objects.equals(this.amount, agentRefundTransferSeqCreateV2Request.amount) &&
        Objects.equals(this.transferType, agentRefundTransferSeqCreateV2Request.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agentId, amount, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentRefundTransferSeqCreateV2Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("agent_id");
    openapiFields.add("amount");
    openapiFields.add("transfer_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("transfer_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentRefundTransferSeqCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentRefundTransferSeqCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentRefundTransferSeqCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentRefundTransferSeqCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentRefundTransferSeqCreateV2Request>() {
           @Override
           public void write(JsonWriter out, AgentRefundTransferSeqCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentRefundTransferSeqCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentRefundTransferSeqCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentRefundTransferSeqCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentRefundTransferSeqCreateV2Request
  */
  public static AgentRefundTransferSeqCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentRefundTransferSeqCreateV2Request.class);
  }

 /**
  * Convert an instance of AgentRefundTransferSeqCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

