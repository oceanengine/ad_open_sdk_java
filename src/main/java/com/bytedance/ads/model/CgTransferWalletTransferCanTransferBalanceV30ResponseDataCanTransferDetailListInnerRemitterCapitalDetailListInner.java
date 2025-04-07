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
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListCapitalType;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListPlatform;
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
 * CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner {
  public static final String SERIALIZED_NAME_CAPITAL_TYPE = "capital_type";
  @SerializedName(SERIALIZED_NAME_CAPITAL_TYPE)
  private CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListCapitalType capitalType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListPlatform platform = null;

  public static final String SERIALIZED_NAME_TRANSFER_BALANCE = "transfer_balance";
  @SerializedName(SERIALIZED_NAME_TRANSFER_BALANCE)
  private Long transferBalance = null;

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner() {
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner capitalType(CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListCapitalType capitalType) {
    
    this.capitalType = capitalType;
    return this;
  }

   /**
   * Get capitalType
   * @return capitalType
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListCapitalType getCapitalType() {
    return capitalType;
  }


  public void setCapitalType(CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListCapitalType capitalType) {
    this.capitalType = capitalType;
  }


  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner platform(CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(CgTransferWalletTransferCanTransferBalanceV30DataCanTransferDetailListRemitterCapitalDetailListPlatform platform) {
    this.platform = platform;
  }


  public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner transferBalance(Long transferBalance) {
    
    this.transferBalance = transferBalance;
    return this;
  }

   /**
   * 可转余额（单位：分）
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
    CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner = (CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner) o;
    return Objects.equals(this.capitalType, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner.capitalType) &&
        Objects.equals(this.platform, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner.platform) &&
        Objects.equals(this.transferBalance, cgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner.transferBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(capitalType, platform, transferBalance);
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
    sb.append("class CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner {\n");
    sb.append("    capitalType: ").append(toIndentedString(capitalType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
    openapiFields.add("platform");
    openapiFields.add("transfer_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner
  */
  public static CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInnerRemitterCapitalDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

