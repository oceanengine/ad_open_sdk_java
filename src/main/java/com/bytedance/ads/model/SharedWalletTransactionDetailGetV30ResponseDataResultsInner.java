/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SharedWalletTransactionDetailGetV30DataResultsBizType;
import com.bytedance.ads.model.SharedWalletTransactionDetailGetV30DataResultsPayeeType;
import com.bytedance.ads.model.SharedWalletTransactionDetailGetV30DataResultsRemitterType;
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
 * SharedWalletTransactionDetailGetV30ResponseDataResultsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class SharedWalletTransactionDetailGetV30ResponseDataResultsInner {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private SharedWalletTransactionDetailGetV30DataResultsBizType bizType = null;

  public static final String SERIALIZED_NAME_BUSINESS_TIME = "business_time";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TIME)
  private String businessTime = null;

  public static final String SERIALIZED_NAME_CREDIT_AMOUNT = "credit_amount";
  @SerializedName(SERIALIZED_NAME_CREDIT_AMOUNT)
  private Double creditAmount = null;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private Long payee = null;

  public static final String SERIALIZED_NAME_PAYEE_NAME = "payee_name";
  @SerializedName(SERIALIZED_NAME_PAYEE_NAME)
  private String payeeName = null;

  public static final String SERIALIZED_NAME_PAYEE_TYPE = "payee_type";
  @SerializedName(SERIALIZED_NAME_PAYEE_TYPE)
  private SharedWalletTransactionDetailGetV30DataResultsPayeeType payeeType = null;

  public static final String SERIALIZED_NAME_PREPAY_AMOUNT = "prepay_amount";
  @SerializedName(SERIALIZED_NAME_PREPAY_AMOUNT)
  private Double prepayAmount = null;

  public static final String SERIALIZED_NAME_REMITTER = "remitter";
  @SerializedName(SERIALIZED_NAME_REMITTER)
  private Long remitter = null;

  public static final String SERIALIZED_NAME_REMITTER_NAME = "remitter_name";
  @SerializedName(SERIALIZED_NAME_REMITTER_NAME)
  private String remitterName = null;

  public static final String SERIALIZED_NAME_REMITTER_TYPE = "remitter_type";
  @SerializedName(SERIALIZED_NAME_REMITTER_TYPE)
  private SharedWalletTransactionDetailGetV30DataResultsRemitterType remitterType = null;

  public static final String SERIALIZED_NAME_TRANSACTION_SEQ = "transaction_seq";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_SEQ)
  private Long transactionSeq = null;

  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner() {
  }

  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 总金额(单位元)
   * @return amount
  **/
  @javax.annotation.Nullable
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner bizType(SharedWalletTransactionDetailGetV30DataResultsBizType bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * Get bizType
   * @return bizType
  **/
  @javax.annotation.Nullable
  public SharedWalletTransactionDetailGetV30DataResultsBizType getBizType() {
    return bizType;
  }


  public void setBizType(SharedWalletTransactionDetailGetV30DataResultsBizType bizType) {
    this.bizType = bizType;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner businessTime(String businessTime) {
    
    this.businessTime = businessTime;
    return this;
  }

   /**
   * 交易时间,精确到秒
   * @return businessTime
  **/
  @javax.annotation.Nullable
  public String getBusinessTime() {
    return businessTime;
  }


  public void setBusinessTime(String businessTime) {
    this.businessTime = businessTime;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner creditAmount(Double creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * 授信金额(单位元)
   * @return creditAmount
  **/
  @javax.annotation.Nullable
  public Double getCreditAmount() {
    return creditAmount;
  }


  public void setCreditAmount(Double creditAmount) {
    this.creditAmount = creditAmount;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner payee(Long payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * 收款账户ID
   * @return payee
  **/
  @javax.annotation.Nullable
  public Long getPayee() {
    return payee;
  }


  public void setPayee(Long payee) {
    this.payee = payee;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner payeeName(String payeeName) {
    
    this.payeeName = payeeName;
    return this;
  }

   /**
   * 收款账户名称
   * @return payeeName
  **/
  @javax.annotation.Nullable
  public String getPayeeName() {
    return payeeName;
  }


  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner payeeType(SharedWalletTransactionDetailGetV30DataResultsPayeeType payeeType) {
    
    this.payeeType = payeeType;
    return this;
  }

   /**
   * Get payeeType
   * @return payeeType
  **/
  @javax.annotation.Nullable
  public SharedWalletTransactionDetailGetV30DataResultsPayeeType getPayeeType() {
    return payeeType;
  }


  public void setPayeeType(SharedWalletTransactionDetailGetV30DataResultsPayeeType payeeType) {
    this.payeeType = payeeType;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner prepayAmount(Double prepayAmount) {
    
    this.prepayAmount = prepayAmount;
    return this;
  }

   /**
   * 预付金额(单位元)
   * @return prepayAmount
  **/
  @javax.annotation.Nullable
  public Double getPrepayAmount() {
    return prepayAmount;
  }


  public void setPrepayAmount(Double prepayAmount) {
    this.prepayAmount = prepayAmount;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner remitter(Long remitter) {
    
    this.remitter = remitter;
    return this;
  }

   /**
   * 付款账户ID
   * @return remitter
  **/
  @javax.annotation.Nullable
  public Long getRemitter() {
    return remitter;
  }


  public void setRemitter(Long remitter) {
    this.remitter = remitter;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner remitterName(String remitterName) {
    
    this.remitterName = remitterName;
    return this;
  }

   /**
   * 付款账户名称
   * @return remitterName
  **/
  @javax.annotation.Nullable
  public String getRemitterName() {
    return remitterName;
  }


  public void setRemitterName(String remitterName) {
    this.remitterName = remitterName;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner remitterType(SharedWalletTransactionDetailGetV30DataResultsRemitterType remitterType) {
    
    this.remitterType = remitterType;
    return this;
  }

   /**
   * Get remitterType
   * @return remitterType
  **/
  @javax.annotation.Nullable
  public SharedWalletTransactionDetailGetV30DataResultsRemitterType getRemitterType() {
    return remitterType;
  }


  public void setRemitterType(SharedWalletTransactionDetailGetV30DataResultsRemitterType remitterType) {
    this.remitterType = remitterType;
  }


  public SharedWalletTransactionDetailGetV30ResponseDataResultsInner transactionSeq(Long transactionSeq) {
    
    this.transactionSeq = transactionSeq;
    return this;
  }

   /**
   * 交易流水id
   * @return transactionSeq
  **/
  @javax.annotation.Nullable
  public Long getTransactionSeq() {
    return transactionSeq;
  }


  public void setTransactionSeq(Long transactionSeq) {
    this.transactionSeq = transactionSeq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletTransactionDetailGetV30ResponseDataResultsInner sharedWalletTransactionDetailGetV30ResponseDataResultsInner = (SharedWalletTransactionDetailGetV30ResponseDataResultsInner) o;
    return Objects.equals(this.amount, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.amount) &&
        Objects.equals(this.bizType, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.bizType) &&
        Objects.equals(this.businessTime, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.businessTime) &&
        Objects.equals(this.creditAmount, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.creditAmount) &&
        Objects.equals(this.payee, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.payee) &&
        Objects.equals(this.payeeName, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.payeeName) &&
        Objects.equals(this.payeeType, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.payeeType) &&
        Objects.equals(this.prepayAmount, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.prepayAmount) &&
        Objects.equals(this.remitter, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.remitter) &&
        Objects.equals(this.remitterName, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.remitterName) &&
        Objects.equals(this.remitterType, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.remitterType) &&
        Objects.equals(this.transactionSeq, sharedWalletTransactionDetailGetV30ResponseDataResultsInner.transactionSeq);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bizType, businessTime, creditAmount, payee, payeeName, payeeType, prepayAmount, remitter, remitterName, remitterType, transactionSeq);
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
    sb.append("class SharedWalletTransactionDetailGetV30ResponseDataResultsInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    businessTime: ").append(toIndentedString(businessTime)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    payeeName: ").append(toIndentedString(payeeName)).append("\n");
    sb.append("    payeeType: ").append(toIndentedString(payeeType)).append("\n");
    sb.append("    prepayAmount: ").append(toIndentedString(prepayAmount)).append("\n");
    sb.append("    remitter: ").append(toIndentedString(remitter)).append("\n");
    sb.append("    remitterName: ").append(toIndentedString(remitterName)).append("\n");
    sb.append("    remitterType: ").append(toIndentedString(remitterType)).append("\n");
    sb.append("    transactionSeq: ").append(toIndentedString(transactionSeq)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("biz_type");
    openapiFields.add("business_time");
    openapiFields.add("credit_amount");
    openapiFields.add("payee");
    openapiFields.add("payee_name");
    openapiFields.add("payee_type");
    openapiFields.add("prepay_amount");
    openapiFields.add("remitter");
    openapiFields.add("remitter_name");
    openapiFields.add("remitter_type");
    openapiFields.add("transaction_seq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletTransactionDetailGetV30ResponseDataResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletTransactionDetailGetV30ResponseDataResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletTransactionDetailGetV30ResponseDataResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletTransactionDetailGetV30ResponseDataResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletTransactionDetailGetV30ResponseDataResultsInner>() {
           @Override
           public void write(JsonWriter out, SharedWalletTransactionDetailGetV30ResponseDataResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletTransactionDetailGetV30ResponseDataResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletTransactionDetailGetV30ResponseDataResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletTransactionDetailGetV30ResponseDataResultsInner
  * @throws IOException if the JSON string is invalid with respect to SharedWalletTransactionDetailGetV30ResponseDataResultsInner
  */
  public static SharedWalletTransactionDetailGetV30ResponseDataResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletTransactionDetailGetV30ResponseDataResultsInner.class);
  }

 /**
  * Convert an instance of SharedWalletTransactionDetailGetV30ResponseDataResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

