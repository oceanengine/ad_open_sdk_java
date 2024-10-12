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
 * CustomerCenterAdvertiserListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class CustomerCenterAdvertiserListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "account_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_ADVERTISER_TYPE = "advertiser_type";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_TYPE)
  private String advertiserType = null;

  public static final String SERIALIZED_NAME_E_DOUYIN_ID = "e_douyin_id";
  @SerializedName(SERIALIZED_NAME_E_DOUYIN_ID)
  private String eDouyinId = null;

  public static final String SERIALIZED_NAME_E_DOUYIN_NAME = "e_douyin_name";
  @SerializedName(SERIALIZED_NAME_E_DOUYIN_NAME)
  private String eDouyinName = null;

  public CustomerCenterAdvertiserListV2ResponseDataListInner() {
  }

  public CustomerCenterAdvertiserListV2ResponseDataListInner accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CustomerCenterAdvertiserListV2ResponseDataListInner accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * 
   * @return accountName
  **/
  @javax.annotation.Nullable
  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public CustomerCenterAdvertiserListV2ResponseDataListInner accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * 
   * @return accountType
  **/
  @javax.annotation.Nullable
  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public CustomerCenterAdvertiserListV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CustomerCenterAdvertiserListV2ResponseDataListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public CustomerCenterAdvertiserListV2ResponseDataListInner advertiserType(String advertiserType) {
    
    this.advertiserType = advertiserType;
    return this;
  }

   /**
   * 
   * @return advertiserType
  **/
  @javax.annotation.Nullable
  public String getAdvertiserType() {
    return advertiserType;
  }


  public void setAdvertiserType(String advertiserType) {
    this.advertiserType = advertiserType;
  }


  public CustomerCenterAdvertiserListV2ResponseDataListInner eDouyinId(String eDouyinId) {
    
    this.eDouyinId = eDouyinId;
    return this;
  }

   /**
   * 
   * @return eDouyinId
  **/
  @javax.annotation.Nullable
  public String geteDouyinId() {
    return eDouyinId;
  }


  public void seteDouyinId(String eDouyinId) {
    this.eDouyinId = eDouyinId;
  }


  public CustomerCenterAdvertiserListV2ResponseDataListInner eDouyinName(String eDouyinName) {
    
    this.eDouyinName = eDouyinName;
    return this;
  }

   /**
   * 
   * @return eDouyinName
  **/
  @javax.annotation.Nullable
  public String geteDouyinName() {
    return eDouyinName;
  }


  public void seteDouyinName(String eDouyinName) {
    this.eDouyinName = eDouyinName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCenterAdvertiserListV2ResponseDataListInner customerCenterAdvertiserListV2ResponseDataListInner = (CustomerCenterAdvertiserListV2ResponseDataListInner) o;
    return Objects.equals(this.accountId, customerCenterAdvertiserListV2ResponseDataListInner.accountId) &&
        Objects.equals(this.accountName, customerCenterAdvertiserListV2ResponseDataListInner.accountName) &&
        Objects.equals(this.accountType, customerCenterAdvertiserListV2ResponseDataListInner.accountType) &&
        Objects.equals(this.advertiserId, customerCenterAdvertiserListV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.advertiserName, customerCenterAdvertiserListV2ResponseDataListInner.advertiserName) &&
        Objects.equals(this.advertiserType, customerCenterAdvertiserListV2ResponseDataListInner.advertiserType) &&
        Objects.equals(this.eDouyinId, customerCenterAdvertiserListV2ResponseDataListInner.eDouyinId) &&
        Objects.equals(this.eDouyinName, customerCenterAdvertiserListV2ResponseDataListInner.eDouyinName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountType, advertiserId, advertiserName, advertiserType, eDouyinId, eDouyinName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCenterAdvertiserListV2ResponseDataListInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    advertiserType: ").append(toIndentedString(advertiserType)).append("\n");
    sb.append("    eDouyinId: ").append(toIndentedString(eDouyinId)).append("\n");
    sb.append("    eDouyinName: ").append(toIndentedString(eDouyinName)).append("\n");
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
    openapiFields.add("account_name");
    openapiFields.add("account_type");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("advertiser_type");
    openapiFields.add("e_douyin_id");
    openapiFields.add("e_douyin_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCenterAdvertiserListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCenterAdvertiserListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCenterAdvertiserListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCenterAdvertiserListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCenterAdvertiserListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, CustomerCenterAdvertiserListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCenterAdvertiserListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCenterAdvertiserListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCenterAdvertiserListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to CustomerCenterAdvertiserListV2ResponseDataListInner
  */
  public static CustomerCenterAdvertiserListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCenterAdvertiserListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of CustomerCenterAdvertiserListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

