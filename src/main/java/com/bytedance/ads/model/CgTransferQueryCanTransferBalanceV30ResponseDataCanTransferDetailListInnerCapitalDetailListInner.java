/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType;
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
 * CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner {
  public static final String SERIALIZED_NAME_CAPITAL_TYPE = "capital_type";
  @SerializedName(SERIALIZED_NAME_CAPITAL_TYPE)
  private CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType capitalType = null;

  public static final String SERIALIZED_NAME_TRANSFER_BALANCE = "transfer_balance";
  @SerializedName(SERIALIZED_NAME_TRANSFER_BALANCE)
  private Long transferBalance = null;

  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner() {
  }

  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner capitalType(CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType capitalType) {
    
    this.capitalType = capitalType;
    return this;
  }

   /**
   * Get capitalType
   * @return capitalType
  **/
  @javax.annotation.Nullable
  public CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType getCapitalType() {
    return capitalType;
  }


  public void setCapitalType(CgTransferQueryCanTransferBalanceV30DataCanTransferDetailListCapitalDetailListCapitalType capitalType) {
    this.capitalType = capitalType;
  }


  public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner transferBalance(Long transferBalance) {
    
    this.transferBalance = transferBalance;
    return this;
  }

   /**
   * 减款方可转资金余额(单位：分)
   * @return transferBalance
  **/
  @javax.annotation.Nullable
  public Long getTransferBalance() {
    return transferBalance;
  }


  public void setTransferBalance(Long transferBalance) {
    this.transferBalance = transferBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner cgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner = (CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner) o;
    return Objects.equals(this.capitalType, cgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner.capitalType) &&
        Objects.equals(this.transferBalance, cgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner.transferBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalType, transferBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner {\n");
    sb.append("    capitalType: ").append(toIndentedString(capitalType)).append("\n");
    sb.append("    transferBalance: ").append(toIndentedString(transferBalance)).append("\n");
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
    openapiFields.add("capital_type");
    openapiFields.add("transfer_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("capital_type");
    openapiRequiredFields.add("transfer_balance");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner
  */
  public static CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferQueryCanTransferBalanceV30ResponseDataCanTransferDetailListInnerCapitalDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

