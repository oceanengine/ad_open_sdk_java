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
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30DataWalletInfoWalletType;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo;
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
 * SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner {
  public static final String SERIALIZED_NAME_COMMON_WALLET_INFO = "common_wallet_info";
  @SerializedName(SERIALIZED_NAME_COMMON_WALLET_INFO)
  private SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo commonWalletInfo = null;

  public static final String SERIALIZED_NAME_MAIN_WALLET_INFO = "main_wallet_info";
  @SerializedName(SERIALIZED_NAME_MAIN_WALLET_INFO)
  private SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo mainWalletInfo = null;

  public static final String SERIALIZED_NAME_SUB_WALLET_INFO = "sub_wallet_info";
  @SerializedName(SERIALIZED_NAME_SUB_WALLET_INFO)
  private SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo subWalletInfo = null;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private Long walletId = null;

  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private SharedWalletWalletInfoGetV30DataWalletInfoWalletType walletType = null;

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner() {
  }

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner commonWalletInfo(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo commonWalletInfo) {
    
    this.commonWalletInfo = commonWalletInfo;
    return this;
  }

   /**
   * Get commonWalletInfo
   * @return commonWalletInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo getCommonWalletInfo() {
    return commonWalletInfo;
  }


  public void setCommonWalletInfo(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo commonWalletInfo) {
    this.commonWalletInfo = commonWalletInfo;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner mainWalletInfo(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo mainWalletInfo) {
    
    this.mainWalletInfo = mainWalletInfo;
    return this;
  }

   /**
   * Get mainWalletInfo
   * @return mainWalletInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo getMainWalletInfo() {
    return mainWalletInfo;
  }


  public void setMainWalletInfo(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo mainWalletInfo) {
    this.mainWalletInfo = mainWalletInfo;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner subWalletInfo(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo subWalletInfo) {
    
    this.subWalletInfo = subWalletInfo;
    return this;
  }

   /**
   * Get subWalletInfo
   * @return subWalletInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo getSubWalletInfo() {
    return subWalletInfo;
  }


  public void setSubWalletInfo(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo subWalletInfo) {
    this.subWalletInfo = subWalletInfo;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner walletId(Long walletId) {
    
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


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner walletType(SharedWalletWalletInfoGetV30DataWalletInfoWalletType walletType) {
    
    this.walletType = walletType;
    return this;
  }

   /**
   * Get walletType
   * @return walletType
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30DataWalletInfoWalletType getWalletType() {
    return walletType;
  }


  public void setWalletType(SharedWalletWalletInfoGetV30DataWalletInfoWalletType walletType) {
    this.walletType = walletType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner sharedWalletWalletInfoGetV30ResponseDataWalletInfoInner = (SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner) o;
    return Objects.equals(this.commonWalletInfo, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.commonWalletInfo) &&
        Objects.equals(this.mainWalletInfo, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.mainWalletInfo) &&
        Objects.equals(this.subWalletInfo, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.subWalletInfo) &&
        Objects.equals(this.walletId, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.walletId) &&
        Objects.equals(this.walletType, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.walletType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonWalletInfo, mainWalletInfo, subWalletInfo, walletId, walletType);
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
    sb.append("class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner {\n");
    sb.append("    commonWalletInfo: ").append(toIndentedString(commonWalletInfo)).append("\n");
    sb.append("    mainWalletInfo: ").append(toIndentedString(mainWalletInfo)).append("\n");
    sb.append("    subWalletInfo: ").append(toIndentedString(subWalletInfo)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
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
    openapiFields.add("common_wallet_info");
    openapiFields.add("main_wallet_info");
    openapiFields.add("sub_wallet_info");
    openapiFields.add("wallet_id");
    openapiFields.add("wallet_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner
  */
  public static SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner.class);
  }

 /**
  * Convert an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

