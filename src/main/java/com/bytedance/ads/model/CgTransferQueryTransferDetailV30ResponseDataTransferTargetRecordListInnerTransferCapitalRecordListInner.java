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
import com.bytedance.ads.model.CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListCapitalType;
import com.bytedance.ads.model.CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListTransferStatus;
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
 * CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner {
  public static final String SERIALIZED_NAME_CAPITAL_TYPE = "capital_type";
  @SerializedName(SERIALIZED_NAME_CAPITAL_TYPE)
  private CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListCapitalType capitalType = null;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListTransferStatus transferStatus = null;

  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner() {
  }

  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner capitalType(CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListCapitalType capitalType) {
    
    this.capitalType = capitalType;
    return this;
  }

   /**
   * Get capitalType
   * @return capitalType
  **/
  @javax.annotation.Nullable
  public CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListCapitalType getCapitalType() {
    return capitalType;
  }


  public void setCapitalType(CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListCapitalType capitalType) {
    this.capitalType = capitalType;
  }


  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner transferAmount(Long transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 转账资金金额(单位：分)
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  public Long getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Long transferAmount) {
    this.transferAmount = transferAmount;
  }


  public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner transferStatus(CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  public CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(CgTransferQueryTransferDetailV30DataTransferTargetRecordListTransferCapitalRecordListTransferStatus transferStatus) {
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
    CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner = (CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner) o;
    return Objects.equals(this.capitalType, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner.capitalType) &&
        Objects.equals(this.failReason, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner.failReason) &&
        Objects.equals(this.transferAmount, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner.transferAmount) &&
        Objects.equals(this.transferStatus, cgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner.transferStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalType, failReason, transferAmount, transferStatus);
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
    sb.append("class CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner {\n");
    sb.append("    capitalType: ").append(toIndentedString(capitalType)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
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
    openapiFields.add("capital_type");
    openapiFields.add("fail_reason");
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner
  */
  public static CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner.class);
  }

 /**
  * Convert an instance of CgTransferQueryTransferDetailV30ResponseDataTransferTargetRecordListInnerTransferCapitalRecordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

