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
import com.bytedance.ads.model.FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * FundSharedWalletBalanceGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class FundSharedWalletBalanceGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BALANCE_DETAIL = "balance_detail";
  @SerializedName(SERIALIZED_NAME_BALANCE_DETAIL)
  private List<FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner> balanceDetail = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage = null;

  public FundSharedWalletBalanceGetV2ResponseDataListInner() {
  }

  public FundSharedWalletBalanceGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
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


  public FundSharedWalletBalanceGetV2ResponseDataListInner balanceDetail(List<FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner> balanceDetail) {
    
    this.balanceDetail = balanceDetail;
    return this;
  }

  public FundSharedWalletBalanceGetV2ResponseDataListInner addBalanceDetailItem(FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner balanceDetailItem) {
    if (this.balanceDetail == null) {
      this.balanceDetail = new ArrayList<>();
    }
    this.balanceDetail.add(balanceDetailItem);
    return this;
  }

   /**
   * 
   * @return balanceDetail
  **/
  @javax.annotation.Nullable
  public List<FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner> getBalanceDetail() {
    return balanceDetail;
  }


  public void setBalanceDetail(List<FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner> balanceDetail) {
    this.balanceDetail = balanceDetail;
  }


  public FundSharedWalletBalanceGetV2ResponseDataListInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public FundSharedWalletBalanceGetV2ResponseDataListInner statusMessage(String statusMessage) {
    
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * 
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  public String getStatusMessage() {
    return statusMessage;
  }


  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundSharedWalletBalanceGetV2ResponseDataListInner fundSharedWalletBalanceGetV2ResponseDataListInner = (FundSharedWalletBalanceGetV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, fundSharedWalletBalanceGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.balanceDetail, fundSharedWalletBalanceGetV2ResponseDataListInner.balanceDetail) &&
        Objects.equals(this.status, fundSharedWalletBalanceGetV2ResponseDataListInner.status) &&
        Objects.equals(this.statusMessage, fundSharedWalletBalanceGetV2ResponseDataListInner.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, balanceDetail, status, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundSharedWalletBalanceGetV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    balanceDetail: ").append(toIndentedString(balanceDetail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
    openapiFields.add("balance_detail");
    openapiFields.add("status");
    openapiFields.add("status_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundSharedWalletBalanceGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundSharedWalletBalanceGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundSharedWalletBalanceGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundSharedWalletBalanceGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FundSharedWalletBalanceGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FundSharedWalletBalanceGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FundSharedWalletBalanceGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FundSharedWalletBalanceGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundSharedWalletBalanceGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FundSharedWalletBalanceGetV2ResponseDataListInner
  */
  public static FundSharedWalletBalanceGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundSharedWalletBalanceGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FundSharedWalletBalanceGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

