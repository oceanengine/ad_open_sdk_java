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
import com.bytedance.ads.model.AgentCreditChargeSubmitV2RequestContractInfo;
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
 * AgentCreditChargeSubmitV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class AgentCreditChargeSubmitV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_CHARGE_AMOUNT = "charge_amount";
  @SerializedName(SERIALIZED_NAME_CHARGE_AMOUNT)
  private Long chargeAmount = null;

  public static final String SERIALIZED_NAME_CHARGE_REQUEST_ID = "charge_request_id";
  @SerializedName(SERIALIZED_NAME_CHARGE_REQUEST_ID)
  private String chargeRequestId = null;

  public static final String SERIALIZED_NAME_CONTRACT_INFO = "contract_info";
  @SerializedName(SERIALIZED_NAME_CONTRACT_INFO)
  private AgentCreditChargeSubmitV2RequestContractInfo contractInfo = null;

  public AgentCreditChargeSubmitV2Request() {
  }

  public AgentCreditChargeSubmitV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商账户
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentCreditChargeSubmitV2Request chargeAmount(Long chargeAmount) {
    
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * 充值金额，单位为分（即实际金额*100）
   * minimum: 1
   * maximum: 1000000000
   * @return chargeAmount
  **/
  @javax.annotation.Nonnull
  public Long getChargeAmount() {
    return chargeAmount;
  }


  public void setChargeAmount(Long chargeAmount) {
    this.chargeAmount = chargeAmount;
  }


  public AgentCreditChargeSubmitV2Request chargeRequestId(String chargeRequestId) {
    
    this.chargeRequestId = chargeRequestId;
    return this;
  }

   /**
   * 充值请求唯一编号，相同编号幂等
   * @return chargeRequestId
  **/
  @javax.annotation.Nonnull
  public String getChargeRequestId() {
    return chargeRequestId;
  }


  public void setChargeRequestId(String chargeRequestId) {
    this.chargeRequestId = chargeRequestId;
  }


  public AgentCreditChargeSubmitV2Request contractInfo(AgentCreditChargeSubmitV2RequestContractInfo contractInfo) {
    
    this.contractInfo = contractInfo;
    return this;
  }

   /**
   * Get contractInfo
   * @return contractInfo
  **/
  @javax.annotation.Nonnull
  public AgentCreditChargeSubmitV2RequestContractInfo getContractInfo() {
    return contractInfo;
  }


  public void setContractInfo(AgentCreditChargeSubmitV2RequestContractInfo contractInfo) {
    this.contractInfo = contractInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCreditChargeSubmitV2Request agentCreditChargeSubmitV2Request = (AgentCreditChargeSubmitV2Request) o;
    return Objects.equals(this.agentId, agentCreditChargeSubmitV2Request.agentId) &&
        Objects.equals(this.chargeAmount, agentCreditChargeSubmitV2Request.chargeAmount) &&
        Objects.equals(this.chargeRequestId, agentCreditChargeSubmitV2Request.chargeRequestId) &&
        Objects.equals(this.contractInfo, agentCreditChargeSubmitV2Request.contractInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, chargeAmount, chargeRequestId, contractInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentCreditChargeSubmitV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    chargeRequestId: ").append(toIndentedString(chargeRequestId)).append("\n");
    sb.append("    contractInfo: ").append(toIndentedString(contractInfo)).append("\n");
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
    openapiFields.add("charge_amount");
    openapiFields.add("charge_request_id");
    openapiFields.add("contract_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("charge_amount");
    openapiRequiredFields.add("charge_request_id");
    openapiRequiredFields.add("contract_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentCreditChargeSubmitV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentCreditChargeSubmitV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentCreditChargeSubmitV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentCreditChargeSubmitV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentCreditChargeSubmitV2Request>() {
           @Override
           public void write(JsonWriter out, AgentCreditChargeSubmitV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentCreditChargeSubmitV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentCreditChargeSubmitV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentCreditChargeSubmitV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentCreditChargeSubmitV2Request
  */
  public static AgentCreditChargeSubmitV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentCreditChargeSubmitV2Request.class);
  }

 /**
  * Convert an instance of AgentCreditChargeSubmitV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

