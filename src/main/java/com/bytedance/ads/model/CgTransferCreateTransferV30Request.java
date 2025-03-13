/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferCreateTransferV30RequestTargetAccountDetailListInner;
import com.bytedance.ads.model.CgTransferCreateTransferV30TransferDirection;
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
 * CgTransferCreateTransferV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class CgTransferCreateTransferV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_BIZ_REQUEST_NO = "biz_request_no";
  @SerializedName(SERIALIZED_NAME_BIZ_REQUEST_NO)
  private String bizRequestNo = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT_DETAIL_LIST = "target_account_detail_list";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT_DETAIL_LIST)
  private List<CgTransferCreateTransferV30RequestTargetAccountDetailListInner> targetAccountDetailList = null;

  public static final String SERIALIZED_NAME_TRANSFER_DIRECTION = "transfer_direction";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DIRECTION)
  private CgTransferCreateTransferV30TransferDirection transferDirection = null;

  public CgTransferCreateTransferV30Request() {
  }

  public CgTransferCreateTransferV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 锚定账户id，1:N的1
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CgTransferCreateTransferV30Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商账户id，用于鉴权
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public CgTransferCreateTransferV30Request bizRequestNo(String bizRequestNo) {
    
    this.bizRequestNo = bizRequestNo;
    return this;
  }

   /**
   * 请求幂等id，同一biz_request_no发起转账代表同一转账申请，返回的转账单号相同，推荐uuid
   * @return bizRequestNo
  **/
  @javax.annotation.Nonnull
  public String getBizRequestNo() {
    return bizRequestNo;
  }


  public void setBizRequestNo(String bizRequestNo) {
    this.bizRequestNo = bizRequestNo;
  }


  public CgTransferCreateTransferV30Request remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public CgTransferCreateTransferV30Request targetAccountDetailList(List<CgTransferCreateTransferV30RequestTargetAccountDetailListInner> targetAccountDetailList) {
    
    this.targetAccountDetailList = targetAccountDetailList;
    return this;
  }

  public CgTransferCreateTransferV30Request addTargetAccountDetailListItem(CgTransferCreateTransferV30RequestTargetAccountDetailListInner targetAccountDetailListItem) {
    if (this.targetAccountDetailList == null) {
      this.targetAccountDetailList = new ArrayList<>();
    }
    this.targetAccountDetailList.add(targetAccountDetailListItem);
    return this;
  }

   /**
   * 目标账户列表，1:N的N，需要列表内账户类型相同，最多支持100个
   * @return targetAccountDetailList
  **/
  @javax.annotation.Nonnull
  public List<CgTransferCreateTransferV30RequestTargetAccountDetailListInner> getTargetAccountDetailList() {
    return targetAccountDetailList;
  }


  public void setTargetAccountDetailList(List<CgTransferCreateTransferV30RequestTargetAccountDetailListInner> targetAccountDetailList) {
    this.targetAccountDetailList = targetAccountDetailList;
  }


  public CgTransferCreateTransferV30Request transferDirection(CgTransferCreateTransferV30TransferDirection transferDirection) {
    
    this.transferDirection = transferDirection;
    return this;
  }

   /**
   * Get transferDirection
   * @return transferDirection
  **/
  @javax.annotation.Nonnull
  public CgTransferCreateTransferV30TransferDirection getTransferDirection() {
    return transferDirection;
  }


  public void setTransferDirection(CgTransferCreateTransferV30TransferDirection transferDirection) {
    this.transferDirection = transferDirection;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferCreateTransferV30Request cgTransferCreateTransferV30Request = (CgTransferCreateTransferV30Request) o;
    return Objects.equals(this.accountId, cgTransferCreateTransferV30Request.accountId) &&
        Objects.equals(this.agentId, cgTransferCreateTransferV30Request.agentId) &&
        Objects.equals(this.bizRequestNo, cgTransferCreateTransferV30Request.bizRequestNo) &&
        Objects.equals(this.remark, cgTransferCreateTransferV30Request.remark) &&
        Objects.equals(this.targetAccountDetailList, cgTransferCreateTransferV30Request.targetAccountDetailList) &&
        Objects.equals(this.transferDirection, cgTransferCreateTransferV30Request.transferDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agentId, bizRequestNo, remark, targetAccountDetailList, transferDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferCreateTransferV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    bizRequestNo: ").append(toIndentedString(bizRequestNo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    targetAccountDetailList: ").append(toIndentedString(targetAccountDetailList)).append("\n");
    sb.append("    transferDirection: ").append(toIndentedString(transferDirection)).append("\n");
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
    openapiFields.add("biz_request_no");
    openapiFields.add("remark");
    openapiFields.add("target_account_detail_list");
    openapiFields.add("transfer_direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("biz_request_no");
    openapiRequiredFields.add("target_account_detail_list");
    openapiRequiredFields.add("transfer_direction");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferCreateTransferV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferCreateTransferV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferCreateTransferV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferCreateTransferV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferCreateTransferV30Request>() {
           @Override
           public void write(JsonWriter out, CgTransferCreateTransferV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferCreateTransferV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferCreateTransferV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferCreateTransferV30Request
  * @throws IOException if the JSON string is invalid with respect to CgTransferCreateTransferV30Request
  */
  public static CgTransferCreateTransferV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferCreateTransferV30Request.class);
  }

 /**
  * Convert an instance of CgTransferCreateTransferV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

