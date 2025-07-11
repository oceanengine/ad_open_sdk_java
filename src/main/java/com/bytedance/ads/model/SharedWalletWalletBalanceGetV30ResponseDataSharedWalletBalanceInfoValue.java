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
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo;
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
 * SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue {
  public static final String SERIALIZED_NAME_BASIC_BALANCE_INFO = "basic_balance_info";
  @SerializedName(SERIALIZED_NAME_BASIC_BALANCE_INFO)
  private SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo basicBalanceInfo = null;

  public static final String SERIALIZED_NAME_GENERAL_BALANCE_INFO = "general_balance_info";
  @SerializedName(SERIALIZED_NAME_GENERAL_BALANCE_INFO)
  private SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo generalBalanceInfo = null;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private Long walletId = null;

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue() {
  }

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue basicBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo basicBalanceInfo) {
    
    this.basicBalanceInfo = basicBalanceInfo;
    return this;
  }

   /**
   * Get basicBalanceInfo
   * @return basicBalanceInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo getBasicBalanceInfo() {
    return basicBalanceInfo;
  }


  public void setBasicBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo basicBalanceInfo) {
    this.basicBalanceInfo = basicBalanceInfo;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue generalBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo generalBalanceInfo) {
    
    this.generalBalanceInfo = generalBalanceInfo;
    return this;
  }

   /**
   * Get generalBalanceInfo
   * @return generalBalanceInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo getGeneralBalanceInfo() {
    return generalBalanceInfo;
  }


  public void setGeneralBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo generalBalanceInfo) {
    this.generalBalanceInfo = generalBalanceInfo;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue walletId(Long walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * 共享钱包ID
   * @return walletId
  **/
  @javax.annotation.Nullable
  public Long getWalletId() {
    return walletId;
  }


  public void setWalletId(Long walletId) {
    this.walletId = walletId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue = (SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue) o;
    return Objects.equals(this.basicBalanceInfo, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue.basicBalanceInfo) &&
        Objects.equals(this.generalBalanceInfo, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue.generalBalanceInfo) &&
        Objects.equals(this.walletId, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue.walletId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicBalanceInfo, generalBalanceInfo, walletId);
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
    sb.append("class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue {\n");
    sb.append("    basicBalanceInfo: ").append(toIndentedString(basicBalanceInfo)).append("\n");
    sb.append("    generalBalanceInfo: ").append(toIndentedString(generalBalanceInfo)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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
    openapiFields.add("basic_balance_info");
    openapiFields.add("general_balance_info");
    openapiFields.add("wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue
  */
  public static SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue.class);
  }

 /**
  * Convert an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

