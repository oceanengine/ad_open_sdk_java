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
import com.bytedance.ads.model.ToolsMicroGameConvertWindowUpdateV30AccountType;
import com.bytedance.ads.model.ToolsMicroGameConvertWindowUpdateV30AssetType;
import com.bytedance.ads.model.ToolsMicroGameConvertWindowUpdateV30ConvertWindow;
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
 * ToolsMicroGameConvertWindowUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsMicroGameConvertWindowUpdateV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsMicroGameConvertWindowUpdateV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private ToolsMicroGameConvertWindowUpdateV30AssetType assetType = null;

  public static final String SERIALIZED_NAME_CONVERT_WINDOW = "convert_window";
  @SerializedName(SERIALIZED_NAME_CONVERT_WINDOW)
  private ToolsMicroGameConvertWindowUpdateV30ConvertWindow convertWindow = null;

  public ToolsMicroGameConvertWindowUpdateV30Request() {
  }

  public ToolsMicroGameConvertWindowUpdateV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsMicroGameConvertWindowUpdateV30Request accountType(ToolsMicroGameConvertWindowUpdateV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsMicroGameConvertWindowUpdateV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsMicroGameConvertWindowUpdateV30AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsMicroGameConvertWindowUpdateV30Request assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 
   * @return assetId
  **/
  @javax.annotation.Nonnull
  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public ToolsMicroGameConvertWindowUpdateV30Request assetType(ToolsMicroGameConvertWindowUpdateV30AssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nonnull
  public ToolsMicroGameConvertWindowUpdateV30AssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(ToolsMicroGameConvertWindowUpdateV30AssetType assetType) {
    this.assetType = assetType;
  }


  public ToolsMicroGameConvertWindowUpdateV30Request convertWindow(ToolsMicroGameConvertWindowUpdateV30ConvertWindow convertWindow) {
    
    this.convertWindow = convertWindow;
    return this;
  }

   /**
   * Get convertWindow
   * @return convertWindow
  **/
  @javax.annotation.Nonnull
  public ToolsMicroGameConvertWindowUpdateV30ConvertWindow getConvertWindow() {
    return convertWindow;
  }


  public void setConvertWindow(ToolsMicroGameConvertWindowUpdateV30ConvertWindow convertWindow) {
    this.convertWindow = convertWindow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroGameConvertWindowUpdateV30Request toolsMicroGameConvertWindowUpdateV30Request = (ToolsMicroGameConvertWindowUpdateV30Request) o;
    return Objects.equals(this.accountId, toolsMicroGameConvertWindowUpdateV30Request.accountId) &&
        Objects.equals(this.accountType, toolsMicroGameConvertWindowUpdateV30Request.accountType) &&
        Objects.equals(this.assetId, toolsMicroGameConvertWindowUpdateV30Request.assetId) &&
        Objects.equals(this.assetType, toolsMicroGameConvertWindowUpdateV30Request.assetType) &&
        Objects.equals(this.convertWindow, toolsMicroGameConvertWindowUpdateV30Request.convertWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, assetId, assetType, convertWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroGameConvertWindowUpdateV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    convertWindow: ").append(toIndentedString(convertWindow)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("asset_type");
    openapiFields.add("convert_window");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("asset_id");
    openapiRequiredFields.add("asset_type");
    openapiRequiredFields.add("convert_window");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroGameConvertWindowUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroGameConvertWindowUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroGameConvertWindowUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroGameConvertWindowUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroGameConvertWindowUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsMicroGameConvertWindowUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroGameConvertWindowUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroGameConvertWindowUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroGameConvertWindowUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroGameConvertWindowUpdateV30Request
  */
  public static ToolsMicroGameConvertWindowUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroGameConvertWindowUpdateV30Request.class);
  }

 /**
  * Convert an instance of ToolsMicroGameConvertWindowUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

