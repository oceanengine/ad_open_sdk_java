/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * CustomerCenterFundTransferSeqCommitV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class CustomerCenterFundTransferSeqCommitV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_ID = "target_advertiser_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_ID)
  private Long targetAdvertiserId = null;

  public static final String SERIALIZED_NAME_TRANSACTION_SEQ = "transaction_seq";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_SEQ)
  private Long transactionSeq = null;

  public CustomerCenterFundTransferSeqCommitV2Request() {
  }

  public CustomerCenterFundTransferSeqCommitV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CustomerCenterFundTransferSeqCommitV2Request targetAdvertiserId(Long targetAdvertiserId) {
    
    this.targetAdvertiserId = targetAdvertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return targetAdvertiserId
  **/
  @javax.annotation.Nonnull
  public Long getTargetAdvertiserId() {
    return targetAdvertiserId;
  }


  public void setTargetAdvertiserId(Long targetAdvertiserId) {
    this.targetAdvertiserId = targetAdvertiserId;
  }


  public CustomerCenterFundTransferSeqCommitV2Request transactionSeq(Long transactionSeq) {
    
    this.transactionSeq = transactionSeq;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return transactionSeq
  **/
  @javax.annotation.Nonnull
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
    CustomerCenterFundTransferSeqCommitV2Request customerCenterFundTransferSeqCommitV2Request = (CustomerCenterFundTransferSeqCommitV2Request) o;
    return Objects.equals(this.advertiserId, customerCenterFundTransferSeqCommitV2Request.advertiserId) &&
        Objects.equals(this.targetAdvertiserId, customerCenterFundTransferSeqCommitV2Request.targetAdvertiserId) &&
        Objects.equals(this.transactionSeq, customerCenterFundTransferSeqCommitV2Request.transactionSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, targetAdvertiserId, transactionSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCenterFundTransferSeqCommitV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    targetAdvertiserId: ").append(toIndentedString(targetAdvertiserId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("target_advertiser_id");
    openapiFields.add("transaction_seq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("target_advertiser_id");
    openapiRequiredFields.add("transaction_seq");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCenterFundTransferSeqCommitV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCenterFundTransferSeqCommitV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCenterFundTransferSeqCommitV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCenterFundTransferSeqCommitV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCenterFundTransferSeqCommitV2Request>() {
           @Override
           public void write(JsonWriter out, CustomerCenterFundTransferSeqCommitV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCenterFundTransferSeqCommitV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCenterFundTransferSeqCommitV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCenterFundTransferSeqCommitV2Request
  * @throws IOException if the JSON string is invalid with respect to CustomerCenterFundTransferSeqCommitV2Request
  */
  public static CustomerCenterFundTransferSeqCommitV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCenterFundTransferSeqCommitV2Request.class);
  }

 /**
  * Convert an instance of CustomerCenterFundTransferSeqCommitV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

