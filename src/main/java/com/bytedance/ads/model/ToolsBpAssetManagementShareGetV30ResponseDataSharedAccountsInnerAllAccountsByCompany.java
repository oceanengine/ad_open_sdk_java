/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType accountType = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany() {
  }

  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany accountType(ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsBpAssetManagementShareGetV30DataSharedAccountsAllAccountsByCompanyAccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany = (ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany) o;
    return Objects.equals(this.accountType, toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany.accountType) &&
        Objects.equals(this.companyId, toolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany.companyId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, companyId);
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
    sb.append("class ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
    openapiFields.add("company_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany>() {
           @Override
           public void write(JsonWriter out, ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany
  * @throws IOException if the JSON string is invalid with respect to ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany
  */
  public static ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany.class);
  }

 /**
  * Convert an instance of ToolsBpAssetManagementShareGetV30ResponseDataSharedAccountsInnerAllAccountsByCompany to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

