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
import com.bytedance.ads.model.CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus;
import com.bytedance.ads.model.CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner;
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
 * CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner {
  public static final String SERIALIZED_NAME_OPPONENT_TARGET_ID = "opponent_target_id";
  @SerializedName(SERIALIZED_NAME_OPPONENT_TARGET_ID)
  private Long opponentTargetId = null;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private Long targetId = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST = "transfer_capital_record_list";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CAPITAL_RECORD_LIST)
  private List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList = null;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus transferStatus = null;

  public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner() {
  }

  public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner opponentTargetId(Long opponentTargetId) {
    
    this.opponentTargetId = opponentTargetId;
    return this;
  }

   /**
   * 锚定账户id，1:N的1
   * @return opponentTargetId
  **/
  @javax.annotation.Nullable
  public Long getOpponentTargetId() {
    return opponentTargetId;
  }


  public void setOpponentTargetId(Long opponentTargetId) {
    this.opponentTargetId = opponentTargetId;
  }


  public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner targetId(Long targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 目标账户id，1:N的N
   * @return targetId
  **/
  @javax.annotation.Nullable
  public Long getTargetId() {
    return targetId;
  }


  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner transferAmount(Long transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 转账金额(单位：分)
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  public Long getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Long transferAmount) {
    this.transferAmount = transferAmount;
  }


  public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner transferCapitalRecordList(List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    
    this.transferCapitalRecordList = transferCapitalRecordList;
    return this;
  }

  public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner addTransferCapitalRecordListItem(CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner transferCapitalRecordListItem) {
    if (this.transferCapitalRecordList == null) {
      this.transferCapitalRecordList = new ArrayList<>();
    }
    this.transferCapitalRecordList.add(transferCapitalRecordListItem);
    return this;
  }

   /**
   * 转账资金类型列表
   * @return transferCapitalRecordList
  **/
  @javax.annotation.Nullable
  public List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> getTransferCapitalRecordList() {
    return transferCapitalRecordList;
  }


  public void setTransferCapitalRecordList(List<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> transferCapitalRecordList) {
    this.transferCapitalRecordList = transferCapitalRecordList;
  }


  public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner transferStatus(CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  public CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(CgTransferTransferDetailGetV30DataTransferTargetRecordListTransferStatus transferStatus) {
    this.transferStatus = transferStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner cgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner = (CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner) o;
    return Objects.equals(this.opponentTargetId, cgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.opponentTargetId) &&
        Objects.equals(this.targetId, cgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.targetId) &&
        Objects.equals(this.transferAmount, cgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.transferAmount) &&
        Objects.equals(this.transferCapitalRecordList, cgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.transferCapitalRecordList) &&
        Objects.equals(this.transferStatus, cgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.transferStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(opponentTargetId, targetId, transferAmount, transferCapitalRecordList, transferStatus);
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
    sb.append("class CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner {\n");
    sb.append("    opponentTargetId: ").append(toIndentedString(opponentTargetId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferCapitalRecordList: ").append(toIndentedString(transferCapitalRecordList)).append("\n");
    sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
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
    openapiFields.add("opponent_target_id");
    openapiFields.add("target_id");
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_capital_record_list");
    openapiFields.add("transfer_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner
  */
  public static CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner.class);
  }

 /**
  * Convert an instance of CgTransferTransferDetailGetV30ResponseDataTransferTargetRecordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

