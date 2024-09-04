/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementBpShareV2DataErrorListAllAccountAccountType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementBpShareV2DataErrorListAllAccountAccountType accountType = null;

  public ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount() {
  }

  public ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount accountType(ToolsAppManagementBpShareV2DataErrorListAllAccountAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementBpShareV2DataErrorListAllAccountAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementBpShareV2DataErrorListAllAccountAccountType accountType) {
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
    ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount toolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount = (ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount) o;
    return Objects.equals(this.accountType, toolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount {\n");
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
       if (!ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount
  */
  public static ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount.class);
  }

 /**
  * Convert an instance of ToolsAppManagementBpShareV2ResponseDataErrorListInnerAllAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

