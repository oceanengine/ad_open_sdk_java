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
import com.bytedance.ads.model.AdvertiserFundGrantTransactionGetV2DataListGrantType;
import com.bytedance.ads.model.AdvertiserFundGrantTransactionGetV2DataListTransactionType;
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
 * AdvertiserFundGrantTransactionGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class AdvertiserFundGrantTransactionGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_GRANT_TYPE = "grant_type";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPE)
  private AdvertiserFundGrantTransactionGetV2DataListGrantType grantType = null;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private AdvertiserFundGrantTransactionGetV2DataListTransactionType transactionType = null;

  public static final String SERIALIZED_NAME_UNIQ_ID = "uniq_id";
  @SerializedName(SERIALIZED_NAME_UNIQ_ID)
  private String uniqId = null;

  public AdvertiserFundGrantTransactionGetV2ResponseDataListInner() {
  }

  public AdvertiserFundGrantTransactionGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
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


  public AdvertiserFundGrantTransactionGetV2ResponseDataListInner amount(Double amount) {
    
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


  public AdvertiserFundGrantTransactionGetV2ResponseDataListInner createTime(String createTime) {
    
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


  public AdvertiserFundGrantTransactionGetV2ResponseDataListInner grantType(AdvertiserFundGrantTransactionGetV2DataListGrantType grantType) {
    
    this.grantType = grantType;
    return this;
  }

   /**
   * Get grantType
   * @return grantType
  **/
  @javax.annotation.Nullable
  public AdvertiserFundGrantTransactionGetV2DataListGrantType getGrantType() {
    return grantType;
  }


  public void setGrantType(AdvertiserFundGrantTransactionGetV2DataListGrantType grantType) {
    this.grantType = grantType;
  }


  public AdvertiserFundGrantTransactionGetV2ResponseDataListInner transactionType(AdvertiserFundGrantTransactionGetV2DataListTransactionType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  public AdvertiserFundGrantTransactionGetV2DataListTransactionType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(AdvertiserFundGrantTransactionGetV2DataListTransactionType transactionType) {
    this.transactionType = transactionType;
  }


  public AdvertiserFundGrantTransactionGetV2ResponseDataListInner uniqId(String uniqId) {
    
    this.uniqId = uniqId;
    return this;
  }

   /**
   * 
   * @return uniqId
  **/
  @javax.annotation.Nullable
  public String getUniqId() {
    return uniqId;
  }


  public void setUniqId(String uniqId) {
    this.uniqId = uniqId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserFundGrantTransactionGetV2ResponseDataListInner advertiserFundGrantTransactionGetV2ResponseDataListInner = (AdvertiserFundGrantTransactionGetV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, advertiserFundGrantTransactionGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.amount, advertiserFundGrantTransactionGetV2ResponseDataListInner.amount) &&
        Objects.equals(this.createTime, advertiserFundGrantTransactionGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.grantType, advertiserFundGrantTransactionGetV2ResponseDataListInner.grantType) &&
        Objects.equals(this.transactionType, advertiserFundGrantTransactionGetV2ResponseDataListInner.transactionType) &&
        Objects.equals(this.uniqId, advertiserFundGrantTransactionGetV2ResponseDataListInner.uniqId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, amount, createTime, grantType, transactionType, uniqId);
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
    sb.append("class AdvertiserFundGrantTransactionGetV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    uniqId: ").append(toIndentedString(uniqId)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("grant_type");
    openapiFields.add("transaction_type");
    openapiFields.add("uniq_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserFundGrantTransactionGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserFundGrantTransactionGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserFundGrantTransactionGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserFundGrantTransactionGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserFundGrantTransactionGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserFundGrantTransactionGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserFundGrantTransactionGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserFundGrantTransactionGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserFundGrantTransactionGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserFundGrantTransactionGetV2ResponseDataListInner
  */
  public static AdvertiserFundGrantTransactionGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserFundGrantTransactionGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdvertiserFundGrantTransactionGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

