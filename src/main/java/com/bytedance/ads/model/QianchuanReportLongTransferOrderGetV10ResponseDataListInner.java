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
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10DataListIsPay;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10DataListPayType;
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
 * QianchuanReportLongTransferOrderGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanReportLongTransferOrderGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_IS_PAY = "is_pay";
  @SerializedName(SERIALIZED_NAME_IS_PAY)
  private QianchuanReportLongTransferOrderGetV10DataListIsPay isPay = null;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private Double orderAmount = null;

  public static final String SERIALIZED_NAME_ORDER_FLOW_SOURCE = "order_flow_source";
  @SerializedName(SERIALIZED_NAME_ORDER_FLOW_SOURCE)
  private QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource orderFlowSource = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_ORDER_PLACE_TIME = "order_place_time";
  @SerializedName(SERIALIZED_NAME_ORDER_PLACE_TIME)
  private String orderPlaceTime = null;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private QianchuanReportLongTransferOrderGetV10DataListPayType payType = null;

  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner() {
  }

  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner isPay(QianchuanReportLongTransferOrderGetV10DataListIsPay isPay) {
    
    this.isPay = isPay;
    return this;
  }

   /**
   * Get isPay
   * @return isPay
  **/
  @javax.annotation.Nullable
  public QianchuanReportLongTransferOrderGetV10DataListIsPay getIsPay() {
    return isPay;
  }


  public void setIsPay(QianchuanReportLongTransferOrderGetV10DataListIsPay isPay) {
    this.isPay = isPay;
  }


  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner orderAmount(Double orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * 
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  public Double getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(Double orderAmount) {
    this.orderAmount = orderAmount;
  }


  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner orderFlowSource(QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource orderFlowSource) {
    
    this.orderFlowSource = orderFlowSource;
    return this;
  }

   /**
   * Get orderFlowSource
   * @return orderFlowSource
  **/
  @javax.annotation.Nullable
  public QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource getOrderFlowSource() {
    return orderFlowSource;
  }


  public void setOrderFlowSource(QianchuanReportLongTransferOrderGetV10DataListOrderFlowSource orderFlowSource) {
    this.orderFlowSource = orderFlowSource;
  }


  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner orderPlaceTime(String orderPlaceTime) {
    
    this.orderPlaceTime = orderPlaceTime;
    return this;
  }

   /**
   * 
   * @return orderPlaceTime
  **/
  @javax.annotation.Nullable
  public String getOrderPlaceTime() {
    return orderPlaceTime;
  }


  public void setOrderPlaceTime(String orderPlaceTime) {
    this.orderPlaceTime = orderPlaceTime;
  }


  public QianchuanReportLongTransferOrderGetV10ResponseDataListInner payType(QianchuanReportLongTransferOrderGetV10DataListPayType payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * Get payType
   * @return payType
  **/
  @javax.annotation.Nullable
  public QianchuanReportLongTransferOrderGetV10DataListPayType getPayType() {
    return payType;
  }


  public void setPayType(QianchuanReportLongTransferOrderGetV10DataListPayType payType) {
    this.payType = payType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportLongTransferOrderGetV10ResponseDataListInner qianchuanReportLongTransferOrderGetV10ResponseDataListInner = (QianchuanReportLongTransferOrderGetV10ResponseDataListInner) o;
    return Objects.equals(this.adId, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.adId) &&
        Objects.equals(this.adName, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.adName) &&
        Objects.equals(this.isPay, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.isPay) &&
        Objects.equals(this.orderAmount, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.orderAmount) &&
        Objects.equals(this.orderFlowSource, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.orderFlowSource) &&
        Objects.equals(this.orderId, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.orderId) &&
        Objects.equals(this.orderPlaceTime, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.orderPlaceTime) &&
        Objects.equals(this.payType, qianchuanReportLongTransferOrderGetV10ResponseDataListInner.payType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adName, isPay, orderAmount, orderFlowSource, orderId, orderPlaceTime, payType);
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
    sb.append("class QianchuanReportLongTransferOrderGetV10ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    isPay: ").append(toIndentedString(isPay)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    orderFlowSource: ").append(toIndentedString(orderFlowSource)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderPlaceTime: ").append(toIndentedString(orderPlaceTime)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_name");
    openapiFields.add("is_pay");
    openapiFields.add("order_amount");
    openapiFields.add("order_flow_source");
    openapiFields.add("order_id");
    openapiFields.add("order_place_time");
    openapiFields.add("pay_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportLongTransferOrderGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportLongTransferOrderGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportLongTransferOrderGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportLongTransferOrderGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportLongTransferOrderGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportLongTransferOrderGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportLongTransferOrderGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportLongTransferOrderGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportLongTransferOrderGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportLongTransferOrderGetV10ResponseDataListInner
  */
  public static QianchuanReportLongTransferOrderGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportLongTransferOrderGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanReportLongTransferOrderGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

