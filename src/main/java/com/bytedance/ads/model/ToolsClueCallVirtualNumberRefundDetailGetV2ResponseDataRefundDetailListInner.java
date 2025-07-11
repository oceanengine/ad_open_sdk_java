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
 * ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_CALL_CLUE_CNT = "call_clue_cnt";
  @SerializedName(SERIALIZED_NAME_CALL_CLUE_CNT)
  private Long callClueCnt = null;

  public static final String SERIALIZED_NAME_CALL_DURATION_ALL = "call_duration_all";
  @SerializedName(SERIALIZED_NAME_CALL_DURATION_ALL)
  private Long callDurationAll = null;

  public static final String SERIALIZED_NAME_CALL_REFUND_PAY_MONEY = "call_refund_pay_money";
  @SerializedName(SERIALIZED_NAME_CALL_REFUND_PAY_MONEY)
  private Double callRefundPayMoney = null;

  public static final String SERIALIZED_NAME_CALLER_NUMBER = "caller_number";
  @SerializedName(SERIALIZED_NAME_CALLER_NUMBER)
  private String callerNumber = null;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month = null;

  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner() {
  }

  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主名称
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner callClueCnt(Long callClueCnt) {
    
    this.callClueCnt = callClueCnt;
    return this;
  }

   /**
   * 呼叫线索数
   * @return callClueCnt
  **/
  @javax.annotation.Nullable
  public Long getCallClueCnt() {
    return callClueCnt;
  }


  public void setCallClueCnt(Long callClueCnt) {
    this.callClueCnt = callClueCnt;
  }


  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner callDurationAll(Long callDurationAll) {
    
    this.callDurationAll = callDurationAll;
    return this;
  }

   /**
   * 呼叫总时长，单位：分钟
   * @return callDurationAll
  **/
  @javax.annotation.Nullable
  public Long getCallDurationAll() {
    return callDurationAll;
  }


  public void setCallDurationAll(Long callDurationAll) {
    this.callDurationAll = callDurationAll;
  }


  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner callRefundPayMoney(Double callRefundPayMoney) {
    
    this.callRefundPayMoney = callRefundPayMoney;
    return this;
  }

   /**
   * 呼叫话费返款总额
   * @return callRefundPayMoney
  **/
  @javax.annotation.Nullable
  public Double getCallRefundPayMoney() {
    return callRefundPayMoney;
  }


  public void setCallRefundPayMoney(Double callRefundPayMoney) {
    this.callRefundPayMoney = callRefundPayMoney;
  }


  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner callerNumber(String callerNumber) {
    
    this.callerNumber = callerNumber;
    return this;
  }

   /**
   * 主叫号码
   * @return callerNumber
  **/
  @javax.annotation.Nullable
  public String getCallerNumber() {
    return callerNumber;
  }


  public void setCallerNumber(String callerNumber) {
    this.callerNumber = callerNumber;
  }


  public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner month(String month) {
    
    this.month = month;
    return this;
  }

   /**
   * 查询账单月份，格式yyyyMM
   * @return month
  **/
  @javax.annotation.Nullable
  public String getMonth() {
    return month;
  }


  public void setMonth(String month) {
    this.month = month;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner = (ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner) o;
    return Objects.equals(this.advertiserId, toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.advertiserId) &&
        Objects.equals(this.advertiserName, toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.advertiserName) &&
        Objects.equals(this.callClueCnt, toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.callClueCnt) &&
        Objects.equals(this.callDurationAll, toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.callDurationAll) &&
        Objects.equals(this.callRefundPayMoney, toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.callRefundPayMoney) &&
        Objects.equals(this.callerNumber, toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.callerNumber) &&
        Objects.equals(this.month, toolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.month);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, advertiserName, callClueCnt, callDurationAll, callRefundPayMoney, callerNumber, month);
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
    sb.append("class ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    callClueCnt: ").append(toIndentedString(callClueCnt)).append("\n");
    sb.append("    callDurationAll: ").append(toIndentedString(callDurationAll)).append("\n");
    sb.append("    callRefundPayMoney: ").append(toIndentedString(callRefundPayMoney)).append("\n");
    sb.append("    callerNumber: ").append(toIndentedString(callerNumber)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("call_clue_cnt");
    openapiFields.add("call_duration_all");
    openapiFields.add("call_refund_pay_money");
    openapiFields.add("caller_number");
    openapiFields.add("month");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner
  */
  public static ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner.class);
  }

 /**
  * Convert an instance of ToolsClueCallVirtualNumberRefundDetailGetV2ResponseDataRefundDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

