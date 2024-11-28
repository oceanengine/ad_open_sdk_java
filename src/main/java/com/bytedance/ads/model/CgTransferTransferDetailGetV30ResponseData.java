/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferTransferDetailGetV30DataTransferDirection;
import com.bytedance.ads.model.CgTransferTransferDetailGetV30DataTransferStatus;
import com.bytedance.ads.model.CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class CgTransferTransferDetailGetV30ResponseData {
  public static final String SERIALIZED_NAME_BIZ_REQUEST_NO = "biz_request_no";
  @SerializedName(SERIALIZED_NAME_BIZ_REQUEST_NO)
  private String bizRequestNo = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_CREATE_TIME = "transfer_create_time";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CREATE_TIME)
  private String transferCreateTime = null;

  public static final String SERIALIZED_NAME_TRANSFER_DIRECTION = "transfer_direction";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DIRECTION)
  private CgTransferTransferDetailGetV30DataTransferDirection transferDirection = null;

  public static final String SERIALIZED_NAME_TRANSFER_FINISH_TIME = "transfer_finish_time";
  @SerializedName(SERIALIZED_NAME_TRANSFER_FINISH_TIME)
  private String transferFinishTime = null;

  public static final String SERIALIZED_NAME_TRANSFER_SERIAL = "transfer_serial";
  @SerializedName(SERIALIZED_NAME_TRANSFER_SERIAL)
  private String transferSerial = null;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private CgTransferTransferDetailGetV30DataTransferStatus transferStatus = null;

  public static final String SERIALIZED_NAME_TRANSFER_TARGET_RECORD_LIST = "transfer_target_record_list";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TARGET_RECORD_LIST)
  private List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner> transferTargetRecordList = null;

  public CgTransferTransferDetailGetV30ResponseData() {
  }

  public CgTransferTransferDetailGetV30ResponseData bizRequestNo(String bizRequestNo) {
    
    this.bizRequestNo = bizRequestNo;
    return this;
  }

   /**
   * 幂等id
   * @return bizRequestNo
  **/
  @javax.annotation.Nullable
  public String getBizRequestNo() {
    return bizRequestNo;
  }


  public void setBizRequestNo(String bizRequestNo) {
    this.bizRequestNo = bizRequestNo;
  }


  public CgTransferTransferDetailGetV30ResponseData transferAmount(Long transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 转账总金额(单位：分)
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  public Long getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Long transferAmount) {
    this.transferAmount = transferAmount;
  }


  public CgTransferTransferDetailGetV30ResponseData transferCreateTime(String transferCreateTime) {
    
    this.transferCreateTime = transferCreateTime;
    return this;
  }

   /**
   * 转账创建时间(yyyy-MM-dd HH:mm:ss)
   * @return transferCreateTime
  **/
  @javax.annotation.Nullable
  public String getTransferCreateTime() {
    return transferCreateTime;
  }


  public void setTransferCreateTime(String transferCreateTime) {
    this.transferCreateTime = transferCreateTime;
  }


  public CgTransferTransferDetailGetV30ResponseData transferDirection(CgTransferTransferDetailGetV30DataTransferDirection transferDirection) {
    
    this.transferDirection = transferDirection;
    return this;
  }

   /**
   * Get transferDirection
   * @return transferDirection
  **/
  @javax.annotation.Nullable
  public CgTransferTransferDetailGetV30DataTransferDirection getTransferDirection() {
    return transferDirection;
  }


  public void setTransferDirection(CgTransferTransferDetailGetV30DataTransferDirection transferDirection) {
    this.transferDirection = transferDirection;
  }


  public CgTransferTransferDetailGetV30ResponseData transferFinishTime(String transferFinishTime) {
    
    this.transferFinishTime = transferFinishTime;
    return this;
  }

   /**
   * 转账完成时间(yyyy-MM-dd HH:mm:ss)
   * @return transferFinishTime
  **/
  @javax.annotation.Nullable
  public String getTransferFinishTime() {
    return transferFinishTime;
  }


  public void setTransferFinishTime(String transferFinishTime) {
    this.transferFinishTime = transferFinishTime;
  }


  public CgTransferTransferDetailGetV30ResponseData transferSerial(String transferSerial) {
    
    this.transferSerial = transferSerial;
    return this;
  }

   /**
   * 转账单号
   * @return transferSerial
  **/
  @javax.annotation.Nullable
  public String getTransferSerial() {
    return transferSerial;
  }


  public void setTransferSerial(String transferSerial) {
    this.transferSerial = transferSerial;
  }


  public CgTransferTransferDetailGetV30ResponseData transferStatus(CgTransferTransferDetailGetV30DataTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  public CgTransferTransferDetailGetV30DataTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(CgTransferTransferDetailGetV30DataTransferStatus transferStatus) {
    this.transferStatus = transferStatus;
  }


  public CgTransferTransferDetailGetV30ResponseData transferTargetRecordList(List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner> transferTargetRecordList) {
    
    this.transferTargetRecordList = transferTargetRecordList;
    return this;
  }

  public CgTransferTransferDetailGetV30ResponseData addTransferTargetRecordListItem(CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner transferTargetRecordListItem) {
    if (this.transferTargetRecordList == null) {
      this.transferTargetRecordList = new ArrayList<>();
    }
    this.transferTargetRecordList.add(transferTargetRecordListItem);
    return this;
  }

   /**
   * 账户信息列表
   * @return transferTargetRecordList
  **/
  @javax.annotation.Nullable
  public List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner> getTransferTargetRecordList() {
    return transferTargetRecordList;
  }


  public void setTransferTargetRecordList(List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner> transferTargetRecordList) {
    this.transferTargetRecordList = transferTargetRecordList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferTransferDetailGetV30ResponseData cgTransferTransferDetailGetV30ResponseData = (CgTransferTransferDetailGetV30ResponseData) o;
    return Objects.equals(this.bizRequestNo, cgTransferTransferDetailGetV30ResponseData.bizRequestNo) &&
        Objects.equals(this.transferAmount, cgTransferTransferDetailGetV30ResponseData.transferAmount) &&
        Objects.equals(this.transferCreateTime, cgTransferTransferDetailGetV30ResponseData.transferCreateTime) &&
        Objects.equals(this.transferDirection, cgTransferTransferDetailGetV30ResponseData.transferDirection) &&
        Objects.equals(this.transferFinishTime, cgTransferTransferDetailGetV30ResponseData.transferFinishTime) &&
        Objects.equals(this.transferSerial, cgTransferTransferDetailGetV30ResponseData.transferSerial) &&
        Objects.equals(this.transferStatus, cgTransferTransferDetailGetV30ResponseData.transferStatus) &&
        Objects.equals(this.transferTargetRecordList, cgTransferTransferDetailGetV30ResponseData.transferTargetRecordList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizRequestNo, transferAmount, transferCreateTime, transferDirection, transferFinishTime, transferSerial, transferStatus, transferTargetRecordList);
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
    sb.append("class CgTransferTransferDetailGetV30ResponseData {\n");
    sb.append("    bizRequestNo: ").append(toIndentedString(bizRequestNo)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferCreateTime: ").append(toIndentedString(transferCreateTime)).append("\n");
    sb.append("    transferDirection: ").append(toIndentedString(transferDirection)).append("\n");
    sb.append("    transferFinishTime: ").append(toIndentedString(transferFinishTime)).append("\n");
    sb.append("    transferSerial: ").append(toIndentedString(transferSerial)).append("\n");
    sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
    sb.append("    transferTargetRecordList: ").append(toIndentedString(transferTargetRecordList)).append("\n");
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
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_create_time");
    openapiFields.add("transfer_direction");
    openapiFields.add("transfer_finish_time");
    openapiFields.add("transfer_serial");
    openapiFields.add("transfer_status");
    openapiFields.add("transfer_target_record_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferTransferDetailGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferTransferDetailGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferTransferDetailGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferTransferDetailGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferTransferDetailGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, CgTransferTransferDetailGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferTransferDetailGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferTransferDetailGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferTransferDetailGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to CgTransferTransferDetailGetV30ResponseData
  */
  public static CgTransferTransferDetailGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferTransferDetailGetV30ResponseData.class);
  }

 /**
  * Convert an instance of CgTransferTransferDetailGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

