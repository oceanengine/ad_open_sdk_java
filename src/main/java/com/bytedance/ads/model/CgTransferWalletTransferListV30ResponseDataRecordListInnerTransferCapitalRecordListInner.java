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
import com.bytedance.ads.model.CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform;
import com.bytedance.ads.model.CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferCapital;
import com.bytedance.ads.model.CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus;
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
 * CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_FINISH_TIME = "finish_time";
  @SerializedName(SERIALIZED_NAME_FINISH_TIME)
  private String finishTime = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform platform = null;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transfer_amount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Long transferAmount = null;

  public static final String SERIALIZED_NAME_TRANSFER_CAPITAL = "transfer_capital";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CAPITAL)
  private CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferCapital transferCapital = null;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus transferStatus = null;

  public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner() {
  }

  public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 转账资金创建时间yyyy-MM-dd HH:mm:ss
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner finishTime(String finishTime) {
    
    this.finishTime = finishTime;
    return this;
  }

   /**
   * 转账资金完成时间yyyy-MM-dd HH:mm:ss
   * @return finishTime
  **/
  @javax.annotation.Nullable
  public String getFinishTime() {
    return finishTime;
  }


  public void setFinishTime(String finishTime) {
    this.finishTime = finishTime;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner platform(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListPlatform platform) {
    this.platform = platform;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner transferAmount(Long transferAmount) {
    
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


  public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner transferCapital(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferCapital transferCapital) {
    
    this.transferCapital = transferCapital;
    return this;
  }

   /**
   * Get transferCapital
   * @return transferCapital
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferCapital getTransferCapital() {
    return transferCapital;
  }


  public void setTransferCapital(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferCapital transferCapital) {
    this.transferCapital = transferCapital;
  }


  public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner transferStatus(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(CgTransferWalletTransferListV30DataRecordListTransferCapitalRecordListTransferStatus transferStatus) {
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
    CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner cgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner = (CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner) o;
    return Objects.equals(this.createTime, cgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.createTime) &&
        Objects.equals(this.finishTime, cgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.finishTime) &&
        Objects.equals(this.platform, cgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.platform) &&
        Objects.equals(this.transferAmount, cgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.transferAmount) &&
        Objects.equals(this.transferCapital, cgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.transferCapital) &&
        Objects.equals(this.transferStatus, cgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.transferStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, finishTime, platform, transferAmount, transferCapital, transferStatus);
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
    sb.append("class CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferCapital: ").append(toIndentedString(transferCapital)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("finish_time");
    openapiFields.add("platform");
    openapiFields.add("transfer_amount");
    openapiFields.add("transfer_capital");
    openapiFields.add("transfer_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner
  */
  public static CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferListV30ResponseDataRecordListInnerTransferCapitalRecordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

