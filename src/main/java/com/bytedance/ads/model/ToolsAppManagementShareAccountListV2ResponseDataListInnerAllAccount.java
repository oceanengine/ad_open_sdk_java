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
import com.bytedance.ads.model.ToolsAppManagementShareAccountListV2DataListAllAccountAccountType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementShareAccountListV2DataListAllAccountAccountType accountType = null;

  public ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount() {
  }

  public ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount accountType(ToolsAppManagementShareAccountListV2DataListAllAccountAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementShareAccountListV2DataListAllAccountAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementShareAccountListV2DataListAllAccountAccountType accountType) {
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
    ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount toolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount = (ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount) o;
    return Objects.equals(this.accountType, toolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount {\n");
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
    openapiFields.add("account_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount
  */
  public static ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount.class);
  }

 /**
  * Convert an instance of ToolsAppManagementShareAccountListV2ResponseDataListInnerAllAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

