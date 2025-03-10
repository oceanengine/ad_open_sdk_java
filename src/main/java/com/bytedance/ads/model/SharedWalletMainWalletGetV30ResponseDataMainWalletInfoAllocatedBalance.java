/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdOnlyAllocatedBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceEcpOnlyAllocatedBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceLocalOnlyAllocatedBalance;
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
 * 钱包已分配余额(单位元)
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance {
  public static final String SERIALIZED_NAME_AD_ONLY_ALLOCATED_BALANCE = "ad_only_allocated_balance";
  @SerializedName(SERIALIZED_NAME_AD_ONLY_ALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdOnlyAllocatedBalance adOnlyAllocatedBalance = null;

  public static final String SERIALIZED_NAME_AD_SHARED_ALLOCATED_BALANCE = "ad_shared_allocated_balance";
  @SerializedName(SERIALIZED_NAME_AD_SHARED_ALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalance adSharedAllocatedBalance = null;

  public static final String SERIALIZED_NAME_ECP_ONLY_ALLOCATED_BALANCE = "ecp_only_allocated_balance";
  @SerializedName(SERIALIZED_NAME_ECP_ONLY_ALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceEcpOnlyAllocatedBalance ecpOnlyAllocatedBalance = null;

  public static final String SERIALIZED_NAME_LOCAL_ONLY_ALLOCATED_BALANCE = "local_only_allocated_balance";
  @SerializedName(SERIALIZED_NAME_LOCAL_ONLY_ALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceLocalOnlyAllocatedBalance localOnlyAllocatedBalance = null;

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance() {
  }

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance adOnlyAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdOnlyAllocatedBalance adOnlyAllocatedBalance) {
    
    this.adOnlyAllocatedBalance = adOnlyAllocatedBalance;
    return this;
  }

   /**
   * Get adOnlyAllocatedBalance
   * @return adOnlyAllocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdOnlyAllocatedBalance getAdOnlyAllocatedBalance() {
    return adOnlyAllocatedBalance;
  }


  public void setAdOnlyAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdOnlyAllocatedBalance adOnlyAllocatedBalance) {
    this.adOnlyAllocatedBalance = adOnlyAllocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance adSharedAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalance adSharedAllocatedBalance) {
    
    this.adSharedAllocatedBalance = adSharedAllocatedBalance;
    return this;
  }

   /**
   * Get adSharedAllocatedBalance
   * @return adSharedAllocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalance getAdSharedAllocatedBalance() {
    return adSharedAllocatedBalance;
  }


  public void setAdSharedAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceAdSharedAllocatedBalance adSharedAllocatedBalance) {
    this.adSharedAllocatedBalance = adSharedAllocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance ecpOnlyAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceEcpOnlyAllocatedBalance ecpOnlyAllocatedBalance) {
    
    this.ecpOnlyAllocatedBalance = ecpOnlyAllocatedBalance;
    return this;
  }

   /**
   * Get ecpOnlyAllocatedBalance
   * @return ecpOnlyAllocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceEcpOnlyAllocatedBalance getEcpOnlyAllocatedBalance() {
    return ecpOnlyAllocatedBalance;
  }


  public void setEcpOnlyAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceEcpOnlyAllocatedBalance ecpOnlyAllocatedBalance) {
    this.ecpOnlyAllocatedBalance = ecpOnlyAllocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance localOnlyAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceLocalOnlyAllocatedBalance localOnlyAllocatedBalance) {
    
    this.localOnlyAllocatedBalance = localOnlyAllocatedBalance;
    return this;
  }

   /**
   * Get localOnlyAllocatedBalance
   * @return localOnlyAllocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceLocalOnlyAllocatedBalance getLocalOnlyAllocatedBalance() {
    return localOnlyAllocatedBalance;
  }


  public void setLocalOnlyAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalanceLocalOnlyAllocatedBalance localOnlyAllocatedBalance) {
    this.localOnlyAllocatedBalance = localOnlyAllocatedBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance = (SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance) o;
    return Objects.equals(this.adOnlyAllocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance.adOnlyAllocatedBalance) &&
        Objects.equals(this.adSharedAllocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance.adSharedAllocatedBalance) &&
        Objects.equals(this.ecpOnlyAllocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance.ecpOnlyAllocatedBalance) &&
        Objects.equals(this.localOnlyAllocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance.localOnlyAllocatedBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adOnlyAllocatedBalance, adSharedAllocatedBalance, ecpOnlyAllocatedBalance, localOnlyAllocatedBalance);
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
    sb.append("class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance {\n");
    sb.append("    adOnlyAllocatedBalance: ").append(toIndentedString(adOnlyAllocatedBalance)).append("\n");
    sb.append("    adSharedAllocatedBalance: ").append(toIndentedString(adSharedAllocatedBalance)).append("\n");
    sb.append("    ecpOnlyAllocatedBalance: ").append(toIndentedString(ecpOnlyAllocatedBalance)).append("\n");
    sb.append("    localOnlyAllocatedBalance: ").append(toIndentedString(localOnlyAllocatedBalance)).append("\n");
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
    openapiFields.add("ad_only_allocated_balance");
    openapiFields.add("ad_shared_allocated_balance");
    openapiFields.add("ecp_only_allocated_balance");
    openapiFields.add("local_only_allocated_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance>() {
           @Override
           public void write(JsonWriter out, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance
  * @throws IOException if the JSON string is invalid with respect to SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance
  */
  public static SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance.class);
  }

 /**
  * Convert an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

