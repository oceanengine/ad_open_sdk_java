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
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance;
import com.bytedance.ads.model.SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 资金共享大钱包信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class SharedWalletMainWalletGetV30ResponseDataMainWalletInfo {
  public static final String SERIALIZED_NAME_ALLOCATED_BALANCE = "allocated_balance";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance allocatedBalance = null;

  public static final String SERIALIZED_NAME_MAIN_WALLET_ID = "main_wallet_id";
  @SerializedName(SERIALIZED_NAME_MAIN_WALLET_ID)
  private Long mainWalletId = null;

  public static final String SERIALIZED_NAME_TOTAL_BALANCE = "total_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_BALANCE)
  private Double totalBalance = null;

  public static final String SERIALIZED_NAME_UNALLOCATED_BALANCE = "unallocated_balance";
  @SerializedName(SERIALIZED_NAME_UNALLOCATED_BALANCE)
  private SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance unallocatedBalance = null;

  public static final String SERIALIZED_NAME_WALLET_DESCRIPTION = "wallet_description";
  @SerializedName(SERIALIZED_NAME_WALLET_DESCRIPTION)
  private String walletDescription = null;

  public static final String SERIALIZED_NAME_WALLET_LABEL = "wallet_label";
  @SerializedName(SERIALIZED_NAME_WALLET_LABEL)
  private List<String> walletLabel = null;

  public static final String SERIALIZED_NAME_WALLET_NAME = "wallet_name";
  @SerializedName(SERIALIZED_NAME_WALLET_NAME)
  private String walletName = null;

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo() {
  }

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo allocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance allocatedBalance) {
    
    this.allocatedBalance = allocatedBalance;
    return this;
  }

   /**
   * Get allocatedBalance
   * @return allocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance getAllocatedBalance() {
    return allocatedBalance;
  }


  public void setAllocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoAllocatedBalance allocatedBalance) {
    this.allocatedBalance = allocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo mainWalletId(Long mainWalletId) {
    
    this.mainWalletId = mainWalletId;
    return this;
  }

   /**
   * 大钱包ID
   * @return mainWalletId
  **/
  @javax.annotation.Nullable
  public Long getMainWalletId() {
    return mainWalletId;
  }


  public void setMainWalletId(Long mainWalletId) {
    this.mainWalletId = mainWalletId;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo totalBalance(Double totalBalance) {
    
    this.totalBalance = totalBalance;
    return this;
  }

   /**
   * 钱包总余额(单位元)
   * @return totalBalance
  **/
  @javax.annotation.Nullable
  public Double getTotalBalance() {
    return totalBalance;
  }


  public void setTotalBalance(Double totalBalance) {
    this.totalBalance = totalBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo unallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance unallocatedBalance) {
    
    this.unallocatedBalance = unallocatedBalance;
    return this;
  }

   /**
   * Get unallocatedBalance
   * @return unallocatedBalance
  **/
  @javax.annotation.Nullable
  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance getUnallocatedBalance() {
    return unallocatedBalance;
  }


  public void setUnallocatedBalance(SharedWalletMainWalletGetV30ResponseDataMainWalletInfoUnallocatedBalance unallocatedBalance) {
    this.unallocatedBalance = unallocatedBalance;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo walletDescription(String walletDescription) {
    
    this.walletDescription = walletDescription;
    return this;
  }

   /**
   * 钱包描述
   * @return walletDescription
  **/
  @javax.annotation.Nullable
  public String getWalletDescription() {
    return walletDescription;
  }


  public void setWalletDescription(String walletDescription) {
    this.walletDescription = walletDescription;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo walletLabel(List<String> walletLabel) {
    
    this.walletLabel = walletLabel;
    return this;
  }

  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo addWalletLabelItem(String walletLabelItem) {
    if (this.walletLabel == null) {
      this.walletLabel = new ArrayList<>();
    }
    this.walletLabel.add(walletLabelItem);
    return this;
  }

   /**
   * 钱包标签
   * @return walletLabel
  **/
  @javax.annotation.Nullable
  public List<String> getWalletLabel() {
    return walletLabel;
  }


  public void setWalletLabel(List<String> walletLabel) {
    this.walletLabel = walletLabel;
  }


  public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo walletName(String walletName) {
    
    this.walletName = walletName;
    return this;
  }

   /**
   * 钱包名称
   * @return walletName
  **/
  @javax.annotation.Nullable
  public String getWalletName() {
    return walletName;
  }


  public void setWalletName(String walletName) {
    this.walletName = walletName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletMainWalletGetV30ResponseDataMainWalletInfo sharedWalletMainWalletGetV30ResponseDataMainWalletInfo = (SharedWalletMainWalletGetV30ResponseDataMainWalletInfo) o;
    return Objects.equals(this.allocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfo.allocatedBalance) &&
        Objects.equals(this.mainWalletId, sharedWalletMainWalletGetV30ResponseDataMainWalletInfo.mainWalletId) &&
        Objects.equals(this.totalBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfo.totalBalance) &&
        Objects.equals(this.unallocatedBalance, sharedWalletMainWalletGetV30ResponseDataMainWalletInfo.unallocatedBalance) &&
        Objects.equals(this.walletDescription, sharedWalletMainWalletGetV30ResponseDataMainWalletInfo.walletDescription) &&
        Objects.equals(this.walletLabel, sharedWalletMainWalletGetV30ResponseDataMainWalletInfo.walletLabel) &&
        Objects.equals(this.walletName, sharedWalletMainWalletGetV30ResponseDataMainWalletInfo.walletName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedBalance, mainWalletId, totalBalance, unallocatedBalance, walletDescription, walletLabel, walletName);
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
    sb.append("class SharedWalletMainWalletGetV30ResponseDataMainWalletInfo {\n");
    sb.append("    allocatedBalance: ").append(toIndentedString(allocatedBalance)).append("\n");
    sb.append("    mainWalletId: ").append(toIndentedString(mainWalletId)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
    sb.append("    unallocatedBalance: ").append(toIndentedString(unallocatedBalance)).append("\n");
    sb.append("    walletDescription: ").append(toIndentedString(walletDescription)).append("\n");
    sb.append("    walletLabel: ").append(toIndentedString(walletLabel)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
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
    openapiFields.add("allocated_balance");
    openapiFields.add("main_wallet_id");
    openapiFields.add("total_balance");
    openapiFields.add("unallocated_balance");
    openapiFields.add("wallet_description");
    openapiFields.add("wallet_label");
    openapiFields.add("wallet_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletMainWalletGetV30ResponseDataMainWalletInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletMainWalletGetV30ResponseDataMainWalletInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletMainWalletGetV30ResponseDataMainWalletInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletMainWalletGetV30ResponseDataMainWalletInfo>() {
           @Override
           public void write(JsonWriter out, SharedWalletMainWalletGetV30ResponseDataMainWalletInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletMainWalletGetV30ResponseDataMainWalletInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfo
  * @throws IOException if the JSON string is invalid with respect to SharedWalletMainWalletGetV30ResponseDataMainWalletInfo
  */
  public static SharedWalletMainWalletGetV30ResponseDataMainWalletInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletMainWalletGetV30ResponseDataMainWalletInfo.class);
  }

 /**
  * Convert an instance of SharedWalletMainWalletGetV30ResponseDataMainWalletInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

