/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserFundTransactionGetV2DataListTransactionType;
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
 * AdvertiserFundTransactionGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class AdvertiserFundTransactionGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_CASH = "cash";
  @SerializedName(SERIALIZED_NAME_CASH)
  private Double cash = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEALBASE = "dealbase";
  @SerializedName(SERIALIZED_NAME_DEALBASE)
  private Double dealbase = null;

  public static final String SERIALIZED_NAME_FROZEN = "frozen";
  @SerializedName(SERIALIZED_NAME_FROZEN)
  private Double frozen = null;

  public static final String SERIALIZED_NAME_GRANT = "grant";
  @SerializedName(SERIALIZED_NAME_GRANT)
  private Double grant = null;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private Long payee = null;

  public static final String SERIALIZED_NAME_REMITTER = "remitter";
  @SerializedName(SERIALIZED_NAME_REMITTER)
  private Long remitter = null;

  public static final String SERIALIZED_NAME_RETURN_GOODS = "return_goods";
  @SerializedName(SERIALIZED_NAME_RETURN_GOODS)
  private Double returnGoods = null;

  public static final String SERIALIZED_NAME_TRANSACTION_SEQ = "transaction_seq";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_SEQ)
  private Long transactionSeq = null;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private AdvertiserFundTransactionGetV2DataListTransactionType transactionType = null;

  public AdvertiserFundTransactionGetV2ResponseDataListInner() {
  }

  public AdvertiserFundTransactionGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nullable
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner cash(Double cash) {
    
    this.cash = cash;
    return this;
  }

   /**
   * 
   * @return cash
  **/
  @javax.annotation.Nullable
  public Double getCash() {
    return cash;
  }


  public void setCash(Double cash) {
    this.cash = cash;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner dealbase(Double dealbase) {
    
    this.dealbase = dealbase;
    return this;
  }

   /**
   * 
   * @return dealbase
  **/
  @javax.annotation.Nullable
  public Double getDealbase() {
    return dealbase;
  }


  public void setDealbase(Double dealbase) {
    this.dealbase = dealbase;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner frozen(Double frozen) {
    
    this.frozen = frozen;
    return this;
  }

   /**
   * 
   * @return frozen
  **/
  @javax.annotation.Nullable
  public Double getFrozen() {
    return frozen;
  }


  public void setFrozen(Double frozen) {
    this.frozen = frozen;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner grant(Double grant) {
    
    this.grant = grant;
    return this;
  }

   /**
   * 
   * @return grant
  **/
  @javax.annotation.Nullable
  public Double getGrant() {
    return grant;
  }


  public void setGrant(Double grant) {
    this.grant = grant;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner payee(Long payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * 
   * @return payee
  **/
  @javax.annotation.Nullable
  public Long getPayee() {
    return payee;
  }


  public void setPayee(Long payee) {
    this.payee = payee;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner remitter(Long remitter) {
    
    this.remitter = remitter;
    return this;
  }

   /**
   * 
   * @return remitter
  **/
  @javax.annotation.Nullable
  public Long getRemitter() {
    return remitter;
  }


  public void setRemitter(Long remitter) {
    this.remitter = remitter;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner returnGoods(Double returnGoods) {
    
    this.returnGoods = returnGoods;
    return this;
  }

   /**
   * 
   * @return returnGoods
  **/
  @javax.annotation.Nullable
  public Double getReturnGoods() {
    return returnGoods;
  }


  public void setReturnGoods(Double returnGoods) {
    this.returnGoods = returnGoods;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner transactionSeq(Long transactionSeq) {
    
    this.transactionSeq = transactionSeq;
    return this;
  }

   /**
   * 
   * @return transactionSeq
  **/
  @javax.annotation.Nullable
  public Long getTransactionSeq() {
    return transactionSeq;
  }


  public void setTransactionSeq(Long transactionSeq) {
    this.transactionSeq = transactionSeq;
  }


  public AdvertiserFundTransactionGetV2ResponseDataListInner transactionType(AdvertiserFundTransactionGetV2DataListTransactionType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  public AdvertiserFundTransactionGetV2DataListTransactionType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(AdvertiserFundTransactionGetV2DataListTransactionType transactionType) {
    this.transactionType = transactionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserFundTransactionGetV2ResponseDataListInner advertiserFundTransactionGetV2ResponseDataListInner = (AdvertiserFundTransactionGetV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, advertiserFundTransactionGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.amount, advertiserFundTransactionGetV2ResponseDataListInner.amount) &&
        Objects.equals(this.cash, advertiserFundTransactionGetV2ResponseDataListInner.cash) &&
        Objects.equals(this.createTime, advertiserFundTransactionGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.dealbase, advertiserFundTransactionGetV2ResponseDataListInner.dealbase) &&
        Objects.equals(this.frozen, advertiserFundTransactionGetV2ResponseDataListInner.frozen) &&
        Objects.equals(this.grant, advertiserFundTransactionGetV2ResponseDataListInner.grant) &&
        Objects.equals(this.payee, advertiserFundTransactionGetV2ResponseDataListInner.payee) &&
        Objects.equals(this.remitter, advertiserFundTransactionGetV2ResponseDataListInner.remitter) &&
        Objects.equals(this.returnGoods, advertiserFundTransactionGetV2ResponseDataListInner.returnGoods) &&
        Objects.equals(this.transactionSeq, advertiserFundTransactionGetV2ResponseDataListInner.transactionSeq) &&
        Objects.equals(this.transactionType, advertiserFundTransactionGetV2ResponseDataListInner.transactionType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, amount, cash, createTime, dealbase, frozen, grant, payee, remitter, returnGoods, transactionSeq, transactionType);
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
    sb.append("class AdvertiserFundTransactionGetV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dealbase: ").append(toIndentedString(dealbase)).append("\n");
    sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
    sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    remitter: ").append(toIndentedString(remitter)).append("\n");
    sb.append("    returnGoods: ").append(toIndentedString(returnGoods)).append("\n");
    sb.append("    transactionSeq: ").append(toIndentedString(transactionSeq)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("cash");
    openapiFields.add("create_time");
    openapiFields.add("dealbase");
    openapiFields.add("frozen");
    openapiFields.add("grant");
    openapiFields.add("payee");
    openapiFields.add("remitter");
    openapiFields.add("return_goods");
    openapiFields.add("transaction_seq");
    openapiFields.add("transaction_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserFundTransactionGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserFundTransactionGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserFundTransactionGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserFundTransactionGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserFundTransactionGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserFundTransactionGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserFundTransactionGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserFundTransactionGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserFundTransactionGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserFundTransactionGetV2ResponseDataListInner
  */
  public static AdvertiserFundTransactionGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserFundTransactionGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdvertiserFundTransactionGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

