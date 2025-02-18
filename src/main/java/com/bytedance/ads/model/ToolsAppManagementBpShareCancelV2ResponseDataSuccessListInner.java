/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2DataSuccessListShareMode;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccountByCompany;
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
 * ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT = "all_account";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT)
  private ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount allAccount = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY = "all_account_by_company";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_BY_COMPANY)
  private ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccountByCompany allAccountByCompany = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private ToolsAppManagementBpShareCancelV2DataSuccessListShareMode shareMode = null;

  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner() {
  }

  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner accountInfo(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner allAccount(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount allAccount) {
    
    this.allAccount = allAccount;
    return this;
  }

   /**
   * Get allAccount
   * @return allAccount
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount getAllAccount() {
    return allAccount;
  }


  public void setAllAccount(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount allAccount) {
    this.allAccount = allAccount;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner allAccountByCompany(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccountByCompany allAccountByCompany) {
    
    this.allAccountByCompany = allAccountByCompany;
    return this;
  }

   /**
   * Get allAccountByCompany
   * @return allAccountByCompany
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccountByCompany getAllAccountByCompany() {
    return allAccountByCompany;
  }


  public void setAllAccountByCompany(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccountByCompany allAccountByCompany) {
    this.allAccountByCompany = allAccountByCompany;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner shareMode(ToolsAppManagementBpShareCancelV2DataSuccessListShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2DataSuccessListShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(ToolsAppManagementBpShareCancelV2DataSuccessListShareMode shareMode) {
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
    ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner toolsAppManagementBpShareCancelV2ResponseDataSuccessListInner = (ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner) o;
    return Objects.equals(this.accountInfo, toolsAppManagementBpShareCancelV2ResponseDataSuccessListInner.accountInfo) &&
        Objects.equals(this.allAccount, toolsAppManagementBpShareCancelV2ResponseDataSuccessListInner.allAccount) &&
        Objects.equals(this.allAccountByCompany, toolsAppManagementBpShareCancelV2ResponseDataSuccessListInner.allAccountByCompany) &&
        Objects.equals(this.shareMode, toolsAppManagementBpShareCancelV2ResponseDataSuccessListInner.shareMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccount, allAccountByCompany, shareMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner {\n");
    sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
    sb.append("    allAccount: ").append(toIndentedString(allAccount)).append("\n");
    sb.append("    allAccountByCompany: ").append(toIndentedString(allAccountByCompany)).append("\n");
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
    openapiFields.add("all_account");
    openapiFields.add("all_account_by_company");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner
  */
  public static ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

