/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30DataErrorListAllAccountsByBp;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30DataErrorListShareMode;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAccountInfo;
import com.bytedance.ads.model.ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAllAccountsByCompany;
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
 * ToolsBpAssetManagementShareV30ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class ToolsBpAssetManagementShareV30ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNTS_BY_BP = "all_accounts_by_bp";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNTS_BY_BP)
  private ToolsBpAssetManagementShareV30DataErrorListAllAccountsByBp allAccountsByBp = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNTS_BY_COMPANY = "all_accounts_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNTS_BY_COMPANY)
  private ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAllAccountsByCompany allAccountsByCompany = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsBpAssetManagementShareV30DataErrorListShareMode shareMode = null;

  public ToolsBpAssetManagementShareV30ResponseDataErrorListInner() {
  }

  public ToolsBpAssetManagementShareV30ResponseDataErrorListInner accountInfo(ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public ToolsBpAssetManagementShareV30ResponseDataErrorListInner allAccountsByBp(ToolsBpAssetManagementShareV30DataErrorListAllAccountsByBp allAccountsByBp) {
    
    this.allAccountsByBp = allAccountsByBp;
    return this;
  }

   /**
   * Get allAccountsByBp
   * @return allAccountsByBp
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareV30DataErrorListAllAccountsByBp getAllAccountsByBp() {
    return allAccountsByBp;
  }


  public void setAllAccountsByBp(ToolsBpAssetManagementShareV30DataErrorListAllAccountsByBp allAccountsByBp) {
    this.allAccountsByBp = allAccountsByBp;
  }


  public ToolsBpAssetManagementShareV30ResponseDataErrorListInner allAccountsByCompany(ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAllAccountsByCompany allAccountsByCompany) {
    
    this.allAccountsByCompany = allAccountsByCompany;
    return this;
  }

   /**
   * Get allAccountsByCompany
   * @return allAccountsByCompany
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAllAccountsByCompany getAllAccountsByCompany() {
    return allAccountsByCompany;
  }


  public void setAllAccountsByCompany(ToolsBpAssetManagementShareV30ResponseDataErrorListInnerAllAccountsByCompany allAccountsByCompany) {
    this.allAccountsByCompany = allAccountsByCompany;
  }


  public ToolsBpAssetManagementShareV30ResponseDataErrorListInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 错误原因
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ToolsBpAssetManagementShareV30ResponseDataErrorListInner shareMode(ToolsBpAssetManagementShareV30DataErrorListShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareV30DataErrorListShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsBpAssetManagementShareV30DataErrorListShareMode shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBpAssetManagementShareV30ResponseDataErrorListInner toolsBpAssetManagementShareV30ResponseDataErrorListInner = (ToolsBpAssetManagementShareV30ResponseDataErrorListInner) o;
    return Objects.equals(this.accountInfo, toolsBpAssetManagementShareV30ResponseDataErrorListInner.accountInfo) &&
        Objects.equals(this.allAccountsByBp, toolsBpAssetManagementShareV30ResponseDataErrorListInner.allAccountsByBp) &&
        Objects.equals(this.allAccountsByCompany, toolsBpAssetManagementShareV30ResponseDataErrorListInner.allAccountsByCompany) &&
        Objects.equals(this.errorMessage, toolsBpAssetManagementShareV30ResponseDataErrorListInner.errorMessage) &&
        Objects.equals(this.shareMode, toolsBpAssetManagementShareV30ResponseDataErrorListInner.shareMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccountsByBp, allAccountsByCompany, errorMessage, shareMode);
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
    sb.append("class ToolsBpAssetManagementShareV30ResponseDataErrorListInner {\n");
    sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
    sb.append("    allAccountsByBp: ").append(toIndentedString(allAccountsByBp)).append("\n");
    sb.append("    allAccountsByCompany: ").append(toIndentedString(allAccountsByCompany)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("account_info");
    openapiFields.add("all_accounts_by_bp");
    openapiFields.add("all_accounts_by_company");
    openapiFields.add("error_message");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBpAssetManagementShareV30ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBpAssetManagementShareV30ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBpAssetManagementShareV30ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBpAssetManagementShareV30ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBpAssetManagementShareV30ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, ToolsBpAssetManagementShareV30ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBpAssetManagementShareV30ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBpAssetManagementShareV30ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBpAssetManagementShareV30ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsBpAssetManagementShareV30ResponseDataErrorListInner
  */
  public static ToolsBpAssetManagementShareV30ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBpAssetManagementShareV30ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of ToolsBpAssetManagementShareV30ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

