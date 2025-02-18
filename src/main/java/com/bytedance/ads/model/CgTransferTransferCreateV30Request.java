/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferTransferCreateV30Platform;
import com.bytedance.ads.model.CgTransferTransferCreateV30RequestTargetDetailListInner;
import com.bytedance.ads.model.CgTransferTransferCreateV30TransferDirection;
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
 * CgTransferTransferCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class CgTransferTransferCreateV30Request {
  public static final String SERIALIZED_NAME_BIZ_REQUEST_NO = "biz_request_no";
  @SerializedName(SERIALIZED_NAME_BIZ_REQUEST_NO)
  private String bizRequestNo = null;

  public static final String SERIALIZED_NAME_OPPONENT_TARGET_ID = "opponent_target_id";
  @SerializedName(SERIALIZED_NAME_OPPONENT_TARGET_ID)
  private Long opponentTargetId = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private Long organizationId = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private CgTransferTransferCreateV30Platform platform = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_TARGET_DETAIL_LIST = "target_detail_list";
  @SerializedName(SERIALIZED_NAME_TARGET_DETAIL_LIST)
  private List<CgTransferTransferCreateV30RequestTargetDetailListInner> targetDetailList = null;

  public static final String SERIALIZED_NAME_TRANSFER_DIRECTION = "transfer_direction";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DIRECTION)
  private CgTransferTransferCreateV30TransferDirection transferDirection = null;

  public CgTransferTransferCreateV30Request() {
  }

  public CgTransferTransferCreateV30Request bizRequestNo(String bizRequestNo) {
    
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


  public CgTransferTransferCreateV30Request opponentTargetId(Long opponentTargetId) {
    
    this.opponentTargetId = opponentTargetId;
    return this;
  }

   /**
   * 锚定账户id，1:N的1
   * @return opponentTargetId
  **/
  @javax.annotation.Nonnull
  public Long getOpponentTargetId() {
    return opponentTargetId;
  }


  public void setOpponentTargetId(Long opponentTargetId) {
    this.opponentTargetId = opponentTargetId;
  }


  public CgTransferTransferCreateV30Request organizationId(Long organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * 组织id
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  public Long getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  public CgTransferTransferCreateV30Request platform(CgTransferTransferCreateV30Platform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nonnull
  public CgTransferTransferCreateV30Platform getPlatform() {
    return platform;
  }


  public void setPlatform(CgTransferTransferCreateV30Platform platform) {
    this.platform = platform;
  }


  public CgTransferTransferCreateV30Request remark(String remark) {
    
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


  public CgTransferTransferCreateV30Request targetDetailList(List<CgTransferTransferCreateV30RequestTargetDetailListInner> targetDetailList) {
    
    this.targetDetailList = targetDetailList;
    return this;
  }

  public CgTransferTransferCreateV30Request addTargetDetailListItem(CgTransferTransferCreateV30RequestTargetDetailListInner targetDetailListItem) {
    if (this.targetDetailList == null) {
      this.targetDetailList = new ArrayList<>();
    }
    this.targetDetailList.add(targetDetailListItem);
    return this;
  }

   /**
   * 目标账户列表，1:N的N，需要列表内账户类型相同，最多支持100个
   * @return targetDetailList
  **/
  @javax.annotation.Nonnull
  public List<CgTransferTransferCreateV30RequestTargetDetailListInner> getTargetDetailList() {
    return targetDetailList;
  }


  public void setTargetDetailList(List<CgTransferTransferCreateV30RequestTargetDetailListInner> targetDetailList) {
    this.targetDetailList = targetDetailList;
  }


  public CgTransferTransferCreateV30Request transferDirection(CgTransferTransferCreateV30TransferDirection transferDirection) {
    
    this.transferDirection = transferDirection;
    return this;
  }

   /**
   * Get transferDirection
   * @return transferDirection
  **/
  @javax.annotation.Nonnull
  public CgTransferTransferCreateV30TransferDirection getTransferDirection() {
    return transferDirection;
  }


  public void setTransferDirection(CgTransferTransferCreateV30TransferDirection transferDirection) {
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
    CgTransferTransferCreateV30Request cgTransferTransferCreateV30Request = (CgTransferTransferCreateV30Request) o;
    return Objects.equals(this.bizRequestNo, cgTransferTransferCreateV30Request.bizRequestNo) &&
        Objects.equals(this.opponentTargetId, cgTransferTransferCreateV30Request.opponentTargetId) &&
        Objects.equals(this.organizationId, cgTransferTransferCreateV30Request.organizationId) &&
        Objects.equals(this.platform, cgTransferTransferCreateV30Request.platform) &&
        Objects.equals(this.remark, cgTransferTransferCreateV30Request.remark) &&
        Objects.equals(this.targetDetailList, cgTransferTransferCreateV30Request.targetDetailList) &&
        Objects.equals(this.transferDirection, cgTransferTransferCreateV30Request.transferDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizRequestNo, opponentTargetId, organizationId, platform, remark, targetDetailList, transferDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferTransferCreateV30Request {\n");
    sb.append("    bizRequestNo: ").append(toIndentedString(bizRequestNo)).append("\n");
    sb.append("    opponentTargetId: ").append(toIndentedString(opponentTargetId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    targetDetailList: ").append(toIndentedString(targetDetailList)).append("\n");
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
    openapiFields.add("biz_request_no");
    openapiFields.add("opponent_target_id");
    openapiFields.add("organization_id");
    openapiFields.add("platform");
    openapiFields.add("remark");
    openapiFields.add("target_detail_list");
    openapiFields.add("transfer_direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("biz_request_no");
    openapiRequiredFields.add("opponent_target_id");
    openapiRequiredFields.add("organization_id");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("target_detail_list");
    openapiRequiredFields.add("transfer_direction");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferTransferCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferTransferCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferTransferCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferTransferCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferTransferCreateV30Request>() {
           @Override
           public void write(JsonWriter out, CgTransferTransferCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferTransferCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferTransferCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferTransferCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to CgTransferTransferCreateV30Request
  */
  public static CgTransferTransferCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferTransferCreateV30Request.class);
  }

 /**
  * Convert an instance of CgTransferTransferCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

