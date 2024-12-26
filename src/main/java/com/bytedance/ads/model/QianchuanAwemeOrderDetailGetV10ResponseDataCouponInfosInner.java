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
 * QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner {
  public static final String SERIALIZED_NAME_COUPON_TOTAL_AMOUNT = "coupon_total_amount";
  @SerializedName(SERIALIZED_NAME_COUPON_TOTAL_AMOUNT)
  private Double couponTotalAmount = null;

  public static final String SERIALIZED_NAME_COUPON_TYPE = "coupon_type";
  @SerializedName(SERIALIZED_NAME_COUPON_TYPE)
  private Long couponType = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner couponTotalAmount(Double couponTotalAmount) {
    
    this.couponTotalAmount = couponTotalAmount;
    return this;
  }

   /**
   * 券的总金额
   * @return couponTotalAmount
  **/
  @javax.annotation.Nullable
  public Double getCouponTotalAmount() {
    return couponTotalAmount;
  }


  public void setCouponTotalAmount(Double couponTotalAmount) {
    this.couponTotalAmount = couponTotalAmount;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner couponType(Long couponType) {
    
    this.couponType = couponType;
    return this;
  }

   /**
   * 券类型。1表示满减券；4表示满赠券
   * @return couponType
  **/
  @javax.annotation.Nullable
  public Long getCouponType() {
    return couponType;
  }


  public void setCouponType(Long couponType) {
    this.couponType = couponType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner qianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner = (QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner) o;
    return Objects.equals(this.couponTotalAmount, qianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner.couponTotalAmount) &&
        Objects.equals(this.couponType, qianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner.couponType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponTotalAmount, couponType);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner {\n");
    sb.append("    couponTotalAmount: ").append(toIndentedString(couponTotalAmount)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
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
    openapiFields.add("coupon_total_amount");
    openapiFields.add("coupon_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

