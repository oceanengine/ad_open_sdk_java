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
 * 续费信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo {
  public static final String SERIALIZED_NAME_ADD_AMOUNT = "add_amount";
  @SerializedName(SERIALIZED_NAME_ADD_AMOUNT)
  private Double addAmount = null;

  public static final String SERIALIZED_NAME_ADD_AMOUNT_CNT = "add_amount_cnt";
  @SerializedName(SERIALIZED_NAME_ADD_AMOUNT_CNT)
  private Long addAmountCnt = null;

  public static final String SERIALIZED_NAME_ADD_DELIVERY_TIME = "add_delivery_time";
  @SerializedName(SERIALIZED_NAME_ADD_DELIVERY_TIME)
  private Double addDeliveryTime = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo addAmount(Double addAmount) {
    
    this.addAmount = addAmount;
    return this;
  }

   /**
   * 续费订单金额之和
   * @return addAmount
  **/
  @javax.annotation.Nullable
  public Double getAddAmount() {
    return addAmount;
  }


  public void setAddAmount(Double addAmount) {
    this.addAmount = addAmount;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo addAmountCnt(Long addAmountCnt) {
    
    this.addAmountCnt = addAmountCnt;
    return this;
  }

   /**
   * 续费次数
   * @return addAmountCnt
  **/
  @javax.annotation.Nullable
  public Long getAddAmountCnt() {
    return addAmountCnt;
  }


  public void setAddAmountCnt(Long addAmountCnt) {
    this.addAmountCnt = addAmountCnt;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo addDeliveryTime(Double addDeliveryTime) {
    
    this.addDeliveryTime = addDeliveryTime;
    return this;
  }

   /**
   * 续费订单时长之和 - 短视频：xx天 - 直播：xx小时
   * @return addDeliveryTime
  **/
  @javax.annotation.Nullable
  public Double getAddDeliveryTime() {
    return addDeliveryTime;
  }


  public void setAddDeliveryTime(Double addDeliveryTime) {
    this.addDeliveryTime = addDeliveryTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo qianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo = (QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo) o;
    return Objects.equals(this.addAmount, qianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo.addAmount) &&
        Objects.equals(this.addAmountCnt, qianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo.addAmountCnt) &&
        Objects.equals(this.addDeliveryTime, qianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo.addDeliveryTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addAmount, addAmountCnt, addDeliveryTime);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo {\n");
    sb.append("    addAmount: ").append(toIndentedString(addAmount)).append("\n");
    sb.append("    addAmountCnt: ").append(toIndentedString(addAmountCnt)).append("\n");
    sb.append("    addDeliveryTime: ").append(toIndentedString(addDeliveryTime)).append("\n");
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
    openapiFields.add("add_amount");
    openapiFields.add("add_amount_cnt");
    openapiFields.add("add_delivery_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

