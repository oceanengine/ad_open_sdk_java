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
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdOnlyUnallocatedBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdSharedUnallocatedBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceEcpOnlyUnallocatedBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance;
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
 * 钱包待分配余额(单位元)
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance {
  public static final String SERIALIZED_NAME_AD_ONLY_UNALLOCATED_BALANCE = "ad_only_unallocated_balance";
  @SerializedName(SERIALIZED_NAME_AD_ONLY_UNALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdOnlyUnallocatedBalance adOnlyUnallocatedBalance = null;

  public static final String SERIALIZED_NAME_AD_SHARED_UNALLOCATED_BALANCE = "ad_shared_unallocated_balance";
  @SerializedName(SERIALIZED_NAME_AD_SHARED_UNALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdSharedUnallocatedBalance adSharedUnallocatedBalance = null;

  public static final String SERIALIZED_NAME_ECP_ONLY_UNALLOCATED_BALANCE = "ecp_only_unallocated_balance";
  @SerializedName(SERIALIZED_NAME_ECP_ONLY_UNALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceEcpOnlyUnallocatedBalance ecpOnlyUnallocatedBalance = null;

  public static final String SERIALIZED_NAME_LOCAL_ONLY_UNALLOCATED_BALANCE = "local_only_unallocated_balance";
  @SerializedName(SERIALIZED_NAME_LOCAL_ONLY_UNALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance localOnlyUnallocatedBalance = null;

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance() {
  }

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance adOnlyUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdOnlyUnallocatedBalance adOnlyUnallocatedBalance) {
    
    this.adOnlyUnallocatedBalance = adOnlyUnallocatedBalance;
    return this;
  }

   /**
   * Get adOnlyUnallocatedBalance
   * @return adOnlyUnallocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdOnlyUnallocatedBalance getAdOnlyUnallocatedBalance() {
    return adOnlyUnallocatedBalance;
  }


  public void setAdOnlyUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdOnlyUnallocatedBalance adOnlyUnallocatedBalance) {
    this.adOnlyUnallocatedBalance = adOnlyUnallocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance adSharedUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdSharedUnallocatedBalance adSharedUnallocatedBalance) {
    
    this.adSharedUnallocatedBalance = adSharedUnallocatedBalance;
    return this;
  }

   /**
   * Get adSharedUnallocatedBalance
   * @return adSharedUnallocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdSharedUnallocatedBalance getAdSharedUnallocatedBalance() {
    return adSharedUnallocatedBalance;
  }


  public void setAdSharedUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceAdSharedUnallocatedBalance adSharedUnallocatedBalance) {
    this.adSharedUnallocatedBalance = adSharedUnallocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance ecpOnlyUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceEcpOnlyUnallocatedBalance ecpOnlyUnallocatedBalance) {
    
    this.ecpOnlyUnallocatedBalance = ecpOnlyUnallocatedBalance;
    return this;
  }

   /**
   * Get ecpOnlyUnallocatedBalance
   * @return ecpOnlyUnallocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceEcpOnlyUnallocatedBalance getEcpOnlyUnallocatedBalance() {
    return ecpOnlyUnallocatedBalance;
  }


  public void setEcpOnlyUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceEcpOnlyUnallocatedBalance ecpOnlyUnallocatedBalance) {
    this.ecpOnlyUnallocatedBalance = ecpOnlyUnallocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance localOnlyUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance localOnlyUnallocatedBalance) {
    
    this.localOnlyUnallocatedBalance = localOnlyUnallocatedBalance;
    return this;
  }

   /**
   * Get localOnlyUnallocatedBalance
   * @return localOnlyUnallocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance getLocalOnlyUnallocatedBalance() {
    return localOnlyUnallocatedBalance;
  }


  public void setLocalOnlyUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalanceLocalOnlyUnallocatedBalance localOnlyUnallocatedBalance) {
    this.localOnlyUnallocatedBalance = localOnlyUnallocatedBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance = (SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance) o;
    return Objects.equals(this.adOnlyUnallocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance.adOnlyUnallocatedBalance) &&
        Objects.equals(this.adSharedUnallocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance.adSharedUnallocatedBalance) &&
        Objects.equals(this.ecpOnlyUnallocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance.ecpOnlyUnallocatedBalance) &&
        Objects.equals(this.localOnlyUnallocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance.localOnlyUnallocatedBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adOnlyUnallocatedBalance, adSharedUnallocatedBalance, ecpOnlyUnallocatedBalance, localOnlyUnallocatedBalance);
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
    sb.append("class SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance {\n");
    sb.append("    adOnlyUnallocatedBalance: ").append(toIndentedString(adOnlyUnallocatedBalance)).append("\n");
    sb.append("    adSharedUnallocatedBalance: ").append(toIndentedString(adSharedUnallocatedBalance)).append("\n");
    sb.append("    ecpOnlyUnallocatedBalance: ").append(toIndentedString(ecpOnlyUnallocatedBalance)).append("\n");
    sb.append("    localOnlyUnallocatedBalance: ").append(toIndentedString(localOnlyUnallocatedBalance)).append("\n");
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
    openapiFields.add("ad_only_unallocated_balance");
    openapiFields.add("ad_shared_unallocated_balance");
    openapiFields.add("ecp_only_unallocated_balance");
    openapiFields.add("local_only_unallocated_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance>() {
           @Override
           public void write(JsonWriter out, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance
  * @throws IOException if the JSON string is invalid with respect to SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance
  */
  public static SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance.class);
  }

 /**
  * Convert an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

