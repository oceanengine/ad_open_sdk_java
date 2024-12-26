/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsClueRefundReportGetV2ResponseData {
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

  public static final String SERIALIZED_NAME_CALL_RATE = "call_rate";
  @SerializedName(SERIALIZED_NAME_CALL_RATE)
  private Double callRate = null;

  public static final String SERIALIZED_NAME_CALL_REFUND_PAY_MONEY = "call_refund_pay_money";
  @SerializedName(SERIALIZED_NAME_CALL_REFUND_PAY_MONEY)
  private Double callRefundPayMoney = null;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_REFUND_CLUE_CNT = "participate_refund_clue_cnt";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_REFUND_CLUE_CNT)
  private Long participateRefundClueCnt = null;

  public static final String SERIALIZED_NAME_PAY_REFUND_CLUE_CNT = "pay_refund_clue_cnt";
  @SerializedName(SERIALIZED_NAME_PAY_REFUND_CLUE_CNT)
  private Long payRefundClueCnt = null;

  public static final String SERIALIZED_NAME_PULL_ACTION_CNT = "pull_action_cnt";
  @SerializedName(SERIALIZED_NAME_PULL_ACTION_CNT)
  private Long pullActionCnt = null;

  public static final String SERIALIZED_NAME_REFUND_PAY_MONEY = "refund_pay_money";
  @SerializedName(SERIALIZED_NAME_REFUND_PAY_MONEY)
  private Double refundPayMoney = null;

  public ToolsClueRefundReportGetV2ResponseData() {
  }

  public ToolsClueRefundReportGetV2ResponseData advertiserId(Long advertiserId) {
    
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


  public ToolsClueRefundReportGetV2ResponseData advertiserName(String advertiserName) {
    
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


  public ToolsClueRefundReportGetV2ResponseData callClueCnt(Long callClueCnt) {
    
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


  public ToolsClueRefundReportGetV2ResponseData callDurationAll(Long callDurationAll) {
    
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


  public ToolsClueRefundReportGetV2ResponseData callRate(Double callRate) {
    
    this.callRate = callRate;
    return this;
  }

   /**
   * 呼叫率
   * @return callRate
  **/
  @javax.annotation.Nullable
  public Double getCallRate() {
    return callRate;
  }


  public void setCallRate(Double callRate) {
    this.callRate = callRate;
  }


  public ToolsClueRefundReportGetV2ResponseData callRefundPayMoney(Double callRefundPayMoney) {
    
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


  public ToolsClueRefundReportGetV2ResponseData month(String month) {
    
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


  public ToolsClueRefundReportGetV2ResponseData participateRefundClueCnt(Long participateRefundClueCnt) {
    
    this.participateRefundClueCnt = participateRefundClueCnt;
    return this;
  }

   /**
   * 参与返款的线索数
   * @return participateRefundClueCnt
  **/
  @javax.annotation.Nullable
  public Long getParticipateRefundClueCnt() {
    return participateRefundClueCnt;
  }


  public void setParticipateRefundClueCnt(Long participateRefundClueCnt) {
    this.participateRefundClueCnt = participateRefundClueCnt;
  }


  public ToolsClueRefundReportGetV2ResponseData payRefundClueCnt(Long payRefundClueCnt) {
    
    this.payRefundClueCnt = payRefundClueCnt;
    return this;
  }

   /**
   * 支付赔付的线索数
   * @return payRefundClueCnt
  **/
  @javax.annotation.Nullable
  public Long getPayRefundClueCnt() {
    return payRefundClueCnt;
  }


  public void setPayRefundClueCnt(Long payRefundClueCnt) {
    this.payRefundClueCnt = payRefundClueCnt;
  }


  public ToolsClueRefundReportGetV2ResponseData pullActionCnt(Long pullActionCnt) {
    
    this.pullActionCnt = pullActionCnt;
    return this;
  }

   /**
   * 线索拉取行为数
   * @return pullActionCnt
  **/
  @javax.annotation.Nullable
  public Long getPullActionCnt() {
    return pullActionCnt;
  }


  public void setPullActionCnt(Long pullActionCnt) {
    this.pullActionCnt = pullActionCnt;
  }


  public ToolsClueRefundReportGetV2ResponseData refundPayMoney(Double refundPayMoney) {
    
    this.refundPayMoney = refundPayMoney;
    return this;
  }

   /**
   * 赔付金额
   * @return refundPayMoney
  **/
  @javax.annotation.Nullable
  public Double getRefundPayMoney() {
    return refundPayMoney;
  }


  public void setRefundPayMoney(Double refundPayMoney) {
    this.refundPayMoney = refundPayMoney;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundReportGetV2ResponseData toolsClueRefundReportGetV2ResponseData = (ToolsClueRefundReportGetV2ResponseData) o;
    return Objects.equals(this.advertiserId, toolsClueRefundReportGetV2ResponseData.advertiserId) &&
        Objects.equals(this.advertiserName, toolsClueRefundReportGetV2ResponseData.advertiserName) &&
        Objects.equals(this.callClueCnt, toolsClueRefundReportGetV2ResponseData.callClueCnt) &&
        Objects.equals(this.callDurationAll, toolsClueRefundReportGetV2ResponseData.callDurationAll) &&
        Objects.equals(this.callRate, toolsClueRefundReportGetV2ResponseData.callRate) &&
        Objects.equals(this.callRefundPayMoney, toolsClueRefundReportGetV2ResponseData.callRefundPayMoney) &&
        Objects.equals(this.month, toolsClueRefundReportGetV2ResponseData.month) &&
        Objects.equals(this.participateRefundClueCnt, toolsClueRefundReportGetV2ResponseData.participateRefundClueCnt) &&
        Objects.equals(this.payRefundClueCnt, toolsClueRefundReportGetV2ResponseData.payRefundClueCnt) &&
        Objects.equals(this.pullActionCnt, toolsClueRefundReportGetV2ResponseData.pullActionCnt) &&
        Objects.equals(this.refundPayMoney, toolsClueRefundReportGetV2ResponseData.refundPayMoney);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, advertiserName, callClueCnt, callDurationAll, callRate, callRefundPayMoney, month, participateRefundClueCnt, payRefundClueCnt, pullActionCnt, refundPayMoney);
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
    sb.append("class ToolsClueRefundReportGetV2ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    callClueCnt: ").append(toIndentedString(callClueCnt)).append("\n");
    sb.append("    callDurationAll: ").append(toIndentedString(callDurationAll)).append("\n");
    sb.append("    callRate: ").append(toIndentedString(callRate)).append("\n");
    sb.append("    callRefundPayMoney: ").append(toIndentedString(callRefundPayMoney)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    participateRefundClueCnt: ").append(toIndentedString(participateRefundClueCnt)).append("\n");
    sb.append("    payRefundClueCnt: ").append(toIndentedString(payRefundClueCnt)).append("\n");
    sb.append("    pullActionCnt: ").append(toIndentedString(pullActionCnt)).append("\n");
    sb.append("    refundPayMoney: ").append(toIndentedString(refundPayMoney)).append("\n");
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
    openapiFields.add("call_rate");
    openapiFields.add("call_refund_pay_money");
    openapiFields.add("month");
    openapiFields.add("participate_refund_clue_cnt");
    openapiFields.add("pay_refund_clue_cnt");
    openapiFields.add("pull_action_cnt");
    openapiFields.add("refund_pay_money");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundReportGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundReportGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundReportGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundReportGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundReportGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundReportGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundReportGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundReportGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundReportGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundReportGetV2ResponseData
  */
  public static ToolsClueRefundReportGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundReportGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueRefundReportGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

