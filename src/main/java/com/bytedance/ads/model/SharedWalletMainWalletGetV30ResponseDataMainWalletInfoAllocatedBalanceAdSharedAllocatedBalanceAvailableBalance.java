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
 * 可用余额(单位元)
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance {
  public static final String SERIALIZED_NAME_PREPAY_BIDDING_BALANCE = "prepay_bidding_balance";
  @SerializedName(SERIALIZED_NAME_PREPAY_BIDDING_BALANCE)
  private Double prepayBiddingBalance = null;

  public static final String SERIALIZED_NAME_PREPAY_BRAND_BALANCE = "prepay_brand_balance";
  @SerializedName(SERIALIZED_NAME_PREPAY_BRAND_BALANCE)
  private Double prepayBrandBalance = null;

  public static final String SERIALIZED_NAME_PREPAY_GENERAL_BALANCE = "prepay_general_balance";
  @SerializedName(SERIALIZED_NAME_PREPAY_GENERAL_BALANCE)
  private Double prepayGeneralBalance = null;

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance() {
  }

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance prepayBiddingBalance(Double prepayBiddingBalance) {
    
    this.prepayBiddingBalance = prepayBiddingBalance;
    return this;
  }

   /**
   * 预付竞价可用余额(单位元)
   * @return prepayBiddingBalance
  **/
  @javax.annotation.Nullable
  public Double getPrepayBiddingBalance() {
    return prepayBiddingBalance;
  }


  public void setPrepayBiddingBalance(Double prepayBiddingBalance) {
    this.prepayBiddingBalance = prepayBiddingBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance prepayBrandBalance(Double prepayBrandBalance) {
    
    this.prepayBrandBalance = prepayBrandBalance;
    return this;
  }

   /**
   * 预付品牌可用余额(单位元)
   * @return prepayBrandBalance
  **/
  @javax.annotation.Nullable
  public Double getPrepayBrandBalance() {
    return prepayBrandBalance;
  }


  public void setPrepayBrandBalance(Double prepayBrandBalance) {
    this.prepayBrandBalance = prepayBrandBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance prepayGeneralBalance(Double prepayGeneralBalance) {
    
    this.prepayGeneralBalance = prepayGeneralBalance;
    return this;
  }

   /**
   * 预付通用可用余额(单位元)
   * @return prepayGeneralBalance
  **/
  @javax.annotation.Nullable
  public Double getPrepayGeneralBalance() {
    return prepayGeneralBalance;
  }


  public void setPrepayGeneralBalance(Double prepayGeneralBalance) {
    this.prepayGeneralBalance = prepayGeneralBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance = (SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance) o;
    return Objects.equals(this.prepayBiddingBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance.prepayBiddingBalance) &&
        Objects.equals(this.prepayBrandBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance.prepayBrandBalance) &&
        Objects.equals(this.prepayGeneralBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance.prepayGeneralBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepayBiddingBalance, prepayBrandBalance, prepayGeneralBalance);
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
    sb.append("class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance {\n");
    sb.append("    prepayBiddingBalance: ").append(toIndentedString(prepayBiddingBalance)).append("\n");
    sb.append("    prepayBrandBalance: ").append(toIndentedString(prepayBrandBalance)).append("\n");
    sb.append("    prepayGeneralBalance: ").append(toIndentedString(prepayGeneralBalance)).append("\n");
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
    openapiFields.add("prepay_bidding_balance");
    openapiFields.add("prepay_brand_balance");
    openapiFields.add("prepay_general_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance>() {
           @Override
           public void write(JsonWriter out, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance
  * @throws IOException if the JSON string is invalid with respect to SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance
  */
  public static SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance.class);
  }

 /**
  * Convert an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalanceAvailableBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

