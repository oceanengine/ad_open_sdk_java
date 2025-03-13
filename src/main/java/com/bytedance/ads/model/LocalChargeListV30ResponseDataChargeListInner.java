/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
 * LocalChargeListV30ResponseDataChargeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class LocalChargeListV30ResponseDataChargeListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount = null;

  public static final String SERIALIZED_NAME_CANCEL_AMOUNT = "cancel_amount";
  @SerializedName(SERIALIZED_NAME_CANCEL_AMOUNT)
  private Long cancelAmount = null;

  public static final String SERIALIZED_NAME_CHARGE_METHOD_NAME = "charge_method_name";
  @SerializedName(SERIALIZED_NAME_CHARGE_METHOD_NAME)
  private String chargeMethodName = null;

  public static final String SERIALIZED_NAME_CHARGE_ORDER_ID = "charge_order_id";
  @SerializedName(SERIALIZED_NAME_CHARGE_ORDER_ID)
  private Long chargeOrderId = null;

  public static final String SERIALIZED_NAME_CHARGE_SERIAL = "charge_serial";
  @SerializedName(SERIALIZED_NAME_CHARGE_SERIAL)
  private String chargeSerial = null;

  public static final String SERIALIZED_NAME_CHARGE_STATUS_NAME = "charge_status_name";
  @SerializedName(SERIALIZED_NAME_CHARGE_STATUS_NAME)
  private String chargeStatusName = null;

  public static final String SERIALIZED_NAME_PAYMENT_CHANNEL_NAME = "payment_channel_name";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CHANNEL_NAME)
  private String paymentChannelName = null;

  public LocalChargeListV30ResponseDataChargeListInner() {
  }

  public LocalChargeListV30ResponseDataChargeListInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 广告主ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public LocalChargeListV30ResponseDataChargeListInner accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * 广告主名称
   * @return accountName
  **/
  @javax.annotation.Nullable
  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public LocalChargeListV30ResponseDataChargeListInner amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 充值金额，单位分，需除以100使用
   * @return amount
  **/
  @javax.annotation.Nullable
  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public LocalChargeListV30ResponseDataChargeListInner cancelAmount(Long cancelAmount) {
    
    this.cancelAmount = cancelAmount;
    return this;
  }

   /**
   * 撤销金额，单位分，需除以100使用
   * @return cancelAmount
  **/
  @javax.annotation.Nullable
  public Long getCancelAmount() {
    return cancelAmount;
  }


  public void setCancelAmount(Long cancelAmount) {
    this.cancelAmount = cancelAmount;
  }


  public LocalChargeListV30ResponseDataChargeListInner chargeMethodName(String chargeMethodName) {
    
    this.chargeMethodName = chargeMethodName;
    return this;
  }

   /**
   * 充值来源中文描述
   * @return chargeMethodName
  **/
  @javax.annotation.Nullable
  public String getChargeMethodName() {
    return chargeMethodName;
  }


  public void setChargeMethodName(String chargeMethodName) {
    this.chargeMethodName = chargeMethodName;
  }


  public LocalChargeListV30ResponseDataChargeListInner chargeOrderId(Long chargeOrderId) {
    
    this.chargeOrderId = chargeOrderId;
    return this;
  }

   /**
   * 充值单ID
   * @return chargeOrderId
  **/
  @javax.annotation.Nullable
  public Long getChargeOrderId() {
    return chargeOrderId;
  }


  public void setChargeOrderId(Long chargeOrderId) {
    this.chargeOrderId = chargeOrderId;
  }


  public LocalChargeListV30ResponseDataChargeListInner chargeSerial(String chargeSerial) {
    
    this.chargeSerial = chargeSerial;
    return this;
  }

   /**
   * 充值编号
   * @return chargeSerial
  **/
  @javax.annotation.Nullable
  public String getChargeSerial() {
    return chargeSerial;
  }


  public void setChargeSerial(String chargeSerial) {
    this.chargeSerial = chargeSerial;
  }


  public LocalChargeListV30ResponseDataChargeListInner chargeStatusName(String chargeStatusName) {
    
    this.chargeStatusName = chargeStatusName;
    return this;
  }

   /**
   * 充值状态中文描述
   * @return chargeStatusName
  **/
  @javax.annotation.Nullable
  public String getChargeStatusName() {
    return chargeStatusName;
  }


  public void setChargeStatusName(String chargeStatusName) {
    this.chargeStatusName = chargeStatusName;
  }


  public LocalChargeListV30ResponseDataChargeListInner paymentChannelName(String paymentChannelName) {
    
    this.paymentChannelName = paymentChannelName;
    return this;
  }

   /**
   * 支付方式中文描述
   * @return paymentChannelName
  **/
  @javax.annotation.Nullable
  public String getPaymentChannelName() {
    return paymentChannelName;
  }


  public void setPaymentChannelName(String paymentChannelName) {
    this.paymentChannelName = paymentChannelName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalChargeListV30ResponseDataChargeListInner localChargeListV30ResponseDataChargeListInner = (LocalChargeListV30ResponseDataChargeListInner) o;
    return Objects.equals(this.accountId, localChargeListV30ResponseDataChargeListInner.accountId) &&
        Objects.equals(this.accountName, localChargeListV30ResponseDataChargeListInner.accountName) &&
        Objects.equals(this.amount, localChargeListV30ResponseDataChargeListInner.amount) &&
        Objects.equals(this.cancelAmount, localChargeListV30ResponseDataChargeListInner.cancelAmount) &&
        Objects.equals(this.chargeMethodName, localChargeListV30ResponseDataChargeListInner.chargeMethodName) &&
        Objects.equals(this.chargeOrderId, localChargeListV30ResponseDataChargeListInner.chargeOrderId) &&
        Objects.equals(this.chargeSerial, localChargeListV30ResponseDataChargeListInner.chargeSerial) &&
        Objects.equals(this.chargeStatusName, localChargeListV30ResponseDataChargeListInner.chargeStatusName) &&
        Objects.equals(this.paymentChannelName, localChargeListV30ResponseDataChargeListInner.paymentChannelName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, amount, cancelAmount, chargeMethodName, chargeOrderId, chargeSerial, chargeStatusName, paymentChannelName);
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
    sb.append("class LocalChargeListV30ResponseDataChargeListInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cancelAmount: ").append(toIndentedString(cancelAmount)).append("\n");
    sb.append("    chargeMethodName: ").append(toIndentedString(chargeMethodName)).append("\n");
    sb.append("    chargeOrderId: ").append(toIndentedString(chargeOrderId)).append("\n");
    sb.append("    chargeSerial: ").append(toIndentedString(chargeSerial)).append("\n");
    sb.append("    chargeStatusName: ").append(toIndentedString(chargeStatusName)).append("\n");
    sb.append("    paymentChannelName: ").append(toIndentedString(paymentChannelName)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_name");
    openapiFields.add("amount");
    openapiFields.add("cancel_amount");
    openapiFields.add("charge_method_name");
    openapiFields.add("charge_order_id");
    openapiFields.add("charge_serial");
    openapiFields.add("charge_status_name");
    openapiFields.add("payment_channel_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalChargeListV30ResponseDataChargeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalChargeListV30ResponseDataChargeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalChargeListV30ResponseDataChargeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalChargeListV30ResponseDataChargeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalChargeListV30ResponseDataChargeListInner>() {
           @Override
           public void write(JsonWriter out, LocalChargeListV30ResponseDataChargeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalChargeListV30ResponseDataChargeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalChargeListV30ResponseDataChargeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalChargeListV30ResponseDataChargeListInner
  * @throws IOException if the JSON string is invalid with respect to LocalChargeListV30ResponseDataChargeListInner
  */
  public static LocalChargeListV30ResponseDataChargeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalChargeListV30ResponseDataChargeListInner.class);
  }

 /**
  * Convert an instance of LocalChargeListV30ResponseDataChargeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

