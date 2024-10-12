/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType accountType = null;

  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount() {
  }

  public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount accountType(ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementBpShareCancelV2DataSuccessListAllAccountAccountType accountType) {
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
    ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount toolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount = (ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount) o;
    return Objects.equals(this.accountType, toolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount {\n");
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
       if (!ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount
  */
  public static ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareCancelV2ResponseDataSuccessListInnerAllAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

