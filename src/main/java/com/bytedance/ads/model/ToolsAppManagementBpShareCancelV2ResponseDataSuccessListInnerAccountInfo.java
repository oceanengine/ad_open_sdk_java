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
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2DataSuccessListAccountInfoAccountType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementBpShareCancelV2DataSuccessListAccountInfoAccountType accountType = null;

  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo() {
  }

  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo accountType(ToolsAppManagementBpShareCancelV2DataSuccessListAccountInfoAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2DataSuccessListAccountInfoAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementBpShareCancelV2DataSuccessListAccountInfoAccountType accountType) {
    this.accountType = accountType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo toolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo = (ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo) o;
    return Objects.equals(this.accountId, toolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo.accountId) &&
        Objects.equals(this.accountType, toolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo
  */
  public static ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAccountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

