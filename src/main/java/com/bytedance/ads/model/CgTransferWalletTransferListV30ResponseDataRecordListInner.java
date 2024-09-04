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
import com.bytedance.ads.model.CgTransferWalletTransferListV30DataRecordListPayeeCategory;
import com.bytedance.ads.model.CgTransferWalletTransferListV30DataRecordListRemitterCategory;
import com.bytedance.ads.model.CgTransferWalletTransferListV30DataRecordListTransferTargetStatus;
import com.bytedance.ads.model.CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner;
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
 * CgTransferWalletTransferListV30ResponseDataRecordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferListV30ResponseDataRecordListInner {
  public static final String SERIALIZED_NAME_BIZ_REQUEST_NO = "biz_request_no";
  @SerializedName(SERIALIZED_NAME_BIZ_REQUEST_NO)
  private String bizRequestNo = null;

  public static final String SERIALIZED_NAME_PAYEE_CATEGORY = "payee_category";
  @SerializedName(SERIALIZED_NAME_PAYEE_CATEGORY)
  private CgTransferWalletTransferListV30DataRecordListPayeeCategory payeeCategory = null;

  public static final String SERIALIZED_NAME_PAYEE_ID = "payee_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_ID)
  private Long payeeId = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_REMITTER_CATEGORY = "remitter_category";
  @SerializedName(SERIALIZED_NAME_REMITTER_CATEGORY)
  private CgTransferWalletTransferListV30DataRecordListRemitterCategory remitterCategory = null;

  public static final String SERIALIZED_NAME_REMITTER_ID = "remitter_id";
  @SerializedName(SERIALIZED_NAME_REMITTER_ID)
  private Long remitterId = null;

  public static final String SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST = "transfer_capital_record_list";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST)
  private List<CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList = null;

  public static final String SERIALIZED_NAME_TRANSFER_ORDER_SERIAL = "transfer_order_serial";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ORDER_SERIAL)
  private String transferOrderSerial = null;

  public static final String SERIALIZED_NAME_TRANSFER_TARGET_AMOUNT = "transfer_target_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TARGET_AMOUNT)
  private Long transferTargetAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_TARGET_CREATE_TIME = "transfer_target_create_time";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TARGET_CREATE_TIME)
  private String transferTargetCreateTime = null;

  public static final String SERIALIZED_NAME_TRANSFER_TARGET_FINISH_TIME = "transfer_target_finish_time";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TARGET_FINISH_TIME)
  private String transferTargetFinishTime = null;

  public static final String SERIALIZED_NAME_TRANSFER_TARGET_STATUS = "transfer_target_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TARGET_STATUS)
  private CgTransferWalletTransferListV30DataRecordListTransferTargetStatus transferTargetStatus = null;

  public CgTransferWalletTransferListV30ResponseDataRecordListInner() {
  }

  public CgTransferWalletTransferListV30ResponseDataRecordListInner bizRequestNo(String bizRequestNo) {
    
    this.bizRequestNo = bizRequestNo;
    return this;
  }

   /**
   * 转账申请幂等id
   * @return bizRequestNo
  **/
  @javax.annotation.Nullable
  public String getBizRequestNo() {
    return bizRequestNo;
  }


  public void setBizRequestNo(String bizRequestNo) {
    this.bizRequestNo = bizRequestNo;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner payeeCategory(CgTransferWalletTransferListV30DataRecordListPayeeCategory payeeCategory) {
    
    this.payeeCategory = payeeCategory;
    return this;
  }

   /**
   * Get payeeCategory
   * @return payeeCategory
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferListV30DataRecordListPayeeCategory getPayeeCategory() {
    return payeeCategory;
  }


  public void setPayeeCategory(CgTransferWalletTransferListV30DataRecordListPayeeCategory payeeCategory) {
    this.payeeCategory = payeeCategory;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner payeeId(Long payeeId) {
    
    this.payeeId = payeeId;
    return this;
  }

   /**
   * 加款方id
   * @return payeeId
  **/
  @javax.annotation.Nullable
  public Long getPayeeId() {
    return payeeId;
  }


  public void setPayeeId(Long payeeId) {
    this.payeeId = payeeId;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner remark(String remark) {
    
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


  public CgTransferWalletTransferListV30ResponseDataRecordListInner remitterCategory(CgTransferWalletTransferListV30DataRecordListRemitterCategory remitterCategory) {
    
    this.remitterCategory = remitterCategory;
    return this;
  }

   /**
   * Get remitterCategory
   * @return remitterCategory
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferListV30DataRecordListRemitterCategory getRemitterCategory() {
    return remitterCategory;
  }


  public void setRemitterCategory(CgTransferWalletTransferListV30DataRecordListRemitterCategory remitterCategory) {
    this.remitterCategory = remitterCategory;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner remitterId(Long remitterId) {
    
    this.remitterId = remitterId;
    return this;
  }

   /**
   * 减款方id
   * @return remitterId
  **/
  @javax.annotation.Nullable
  public Long getRemitterId() {
    return remitterId;
  }


  public void setRemitterId(Long remitterId) {
    this.remitterId = remitterId;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner transferCapitalRecordList(List<CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    
    this.transferCapitalRecordList = transferCapitalRecordList;
    return this;
  }

  public CgTransferWalletTransferListV30ResponseDataRecordListInner addTransferCapitalRecordListItem(CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner transferCapitalRecordListItem) {
    if (this.transferCapitalRecordList == null) {
      this.transferCapitalRecordList = new ArrayList<>();
    }
    this.transferCapitalRecordList.add(transferCapitalRecordListItem);
    return this;
  }

   /**
   * 转账资金列表
   * @return transferCapitalRecordList
  **/
  @javax.annotation.Nullable
  public List<CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner> getTransferCapitalRecordList() {
    return transferCapitalRecordList;
  }


  public void setTransferCapitalRecordList(List<CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    this.transferCapitalRecordList = transferCapitalRecordList;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner transferOrderSerial(String transferOrderSerial) {
    
    this.transferOrderSerial = transferOrderSerial;
    return this;
  }

   /**
   * 转账单编号
   * @return transferOrderSerial
  **/
  @javax.annotation.Nullable
  public String getTransferOrderSerial() {
    return transferOrderSerial;
  }


  public void setTransferOrderSerial(String transferOrderSerial) {
    this.transferOrderSerial = transferOrderSerial;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner transferTargetAmount(Long transferTargetAmount) {
    
    this.transferTargetAmount = transferTargetAmount;
    return this;
  }

   /**
   * 加款方-减款方间转账金额(单位：分)
   * @return transferTargetAmount
  **/
  @javax.annotation.Nullable
  public Long getTransferTargetAmount() {
    return transferTargetAmount;
  }


  public void setTransferTargetAmount(Long transferTargetAmount) {
    this.transferTargetAmount = transferTargetAmount;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner transferTargetCreateTime(String transferTargetCreateTime) {
    
    this.transferTargetCreateTime = transferTargetCreateTime;
    return this;
  }

   /**
   * 完成时间yyyy-MM-dd HH:mm:ss
   * @return transferTargetCreateTime
  **/
  @javax.annotation.Nullable
  public String getTransferTargetCreateTime() {
    return transferTargetCreateTime;
  }


  public void setTransferTargetCreateTime(String transferTargetCreateTime) {
    this.transferTargetCreateTime = transferTargetCreateTime;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner transferTargetFinishTime(String transferTargetFinishTime) {
    
    this.transferTargetFinishTime = transferTargetFinishTime;
    return this;
  }

   /**
   * 创建时间yyyy-MM-dd HH:mm:ss
   * @return transferTargetFinishTime
  **/
  @javax.annotation.Nullable
  public String getTransferTargetFinishTime() {
    return transferTargetFinishTime;
  }


  public void setTransferTargetFinishTime(String transferTargetFinishTime) {
    this.transferTargetFinishTime = transferTargetFinishTime;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInner transferTargetStatus(CgTransferWalletTransferListV30DataRecordListTransferTargetStatus transferTargetStatus) {
    
    this.transferTargetStatus = transferTargetStatus;
    return this;
  }

   /**
   * Get transferTargetStatus
   * @return transferTargetStatus
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferListV30DataRecordListTransferTargetStatus getTransferTargetStatus() {
    return transferTargetStatus;
  }


  public void setTransferTargetStatus(CgTransferWalletTransferListV30DataRecordListTransferTargetStatus transferTargetStatus) {
    this.transferTargetStatus = transferTargetStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferWalletTransferListV30ResponseDataRecordListInner cgTransferWalletTransferListV30ResponseDataRecordListInner = (CgTransferWalletTransferListV30ResponseDataRecordListInner) o;
    return Objects.equals(this.bizRequestNo, cgTransferWalletTransferListV30ResponseDataRecordListInner.bizRequestNo) &&
        Objects.equals(this.payeeCategory, cgTransferWalletTransferListV30ResponseDataRecordListInner.payeeCategory) &&
        Objects.equals(this.payeeId, cgTransferWalletTransferListV30ResponseDataRecordListInner.payeeId) &&
        Objects.equals(this.remark, cgTransferWalletTransferListV30ResponseDataRecordListInner.remark) &&
        Objects.equals(this.remitterCategory, cgTransferWalletTransferListV30ResponseDataRecordListInner.remitterCategory) &&
        Objects.equals(this.remitterId, cgTransferWalletTransferListV30ResponseDataRecordListInner.remitterId) &&
        Objects.equals(this.transferCapitalRecordList, cgTransferWalletTransferListV30ResponseDataRecordListInner.transferCapitalRecordList) &&
        Objects.equals(this.transferOrderSerial, cgTransferWalletTransferListV30ResponseDataRecordListInner.transferOrderSerial) &&
        Objects.equals(this.transferTargetAmount, cgTransferWalletTransferListV30ResponseDataRecordListInner.transferTargetAmount) &&
        Objects.equals(this.transferTargetCreateTime, cgTransferWalletTransferListV30ResponseDataRecordListInner.transferTargetCreateTime) &&
        Objects.equals(this.transferTargetFinishTime, cgTransferWalletTransferListV30ResponseDataRecordListInner.transferTargetFinishTime) &&
        Objects.equals(this.transferTargetStatus, cgTransferWalletTransferListV30ResponseDataRecordListInner.transferTargetStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizRequestNo, payeeCategory, payeeId, remark, remitterCategory, remitterId, transferCapitalRecordList, transferOrderSerial, transferTargetAmount, transferTargetCreateTime, transferTargetFinishTime, transferTargetStatus);
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
    sb.append("class CgTransferWalletTransferListV30ResponseDataRecordListInner {\n");
    sb.append("    bizRequestNo: ").append(toIndentedString(bizRequestNo)).append("\n");
    sb.append("    payeeCategory: ").append(toIndentedString(payeeCategory)).append("\n");
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    remitterCategory: ").append(toIndentedString(remitterCategory)).append("\n");
    sb.append("    remitterId: ").append(toIndentedString(remitterId)).append("\n");
    sb.append("    transferCapitalRecordList: ").append(toIndentedString(transferCapitalRecordList)).append("\n");
    sb.append("    transferOrderSerial: ").append(toIndentedString(transferOrderSerial)).append("\n");
    sb.append("    transferTargetAmount: ").append(toIndentedString(transferTargetAmount)).append("\n");
    sb.append("    transferTargetCreateTime: ").append(toIndentedString(transferTargetCreateTime)).append("\n");
    sb.append("    transferTargetFinishTime: ").append(toIndentedString(transferTargetFinishTime)).append("\n");
    sb.append("    transferTargetStatus: ").append(toIndentedString(transferTargetStatus)).append("\n");
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
    openapiFields.add("payee_category");
    openapiFields.add("payee_id");
    openapiFields.add("remark");
    openapiFields.add("remitter_category");
    openapiFields.add("remitter_id");
    openapiFields.add("transfer_capital_record_list");
    openapiFields.add("transfer_order_serial");
    openapiFields.add("transfer_target_amount");
    openapiFields.add("transfer_target_create_time");
    openapiFields.add("transfer_target_finish_time");
    openapiFields.add("transfer_target_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferListV30ResponseDataRecordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferListV30ResponseDataRecordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferListV30ResponseDataRecordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferListV30ResponseDataRecordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferListV30ResponseDataRecordListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferListV30ResponseDataRecordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferListV30ResponseDataRecordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferListV30ResponseDataRecordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferListV30ResponseDataRecordListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferListV30ResponseDataRecordListInner
  */
  public static CgTransferWalletTransferListV30ResponseDataRecordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferListV30ResponseDataRecordListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferListV30ResponseDataRecordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

