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
import com.bytedance.ads.model.AicElementDeleteV30AccountType;
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
 * AicElementDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class AicElementDeleteV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AicElementDeleteV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_ELEMENT_ID = "element_id";
  @SerializedName(SERIALIZED_NAME_ELEMENT_ID)
  private Long elementId = null;

  public AicElementDeleteV30Request() {
  }

  public AicElementDeleteV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * BP账户体系:组织id，Agent账户体系:代理商id
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AicElementDeleteV30Request accountType(AicElementDeleteV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public AicElementDeleteV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(AicElementDeleteV30AccountType accountType) {
    this.accountType = accountType;
  }


  public AicElementDeleteV30Request elementId(Long elementId) {
    
    this.elementId = elementId;
    return this;
  }

   /**
   * 需要删除的元素id， 注:删除文件夹元素会把文件夹的子文件都移动到上层文件夹， 权限范围:传入的account_id账户下的元素
   * @return elementId
  **/
  @javax.annotation.Nonnull
  public Long getElementId() {
    return elementId;
  }


  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicElementDeleteV30Request aicElementDeleteV30Request = (AicElementDeleteV30Request) o;
    return Objects.equals(this.accountId, aicElementDeleteV30Request.accountId) &&
        Objects.equals(this.accountType, aicElementDeleteV30Request.accountType) &&
        Objects.equals(this.elementId, aicElementDeleteV30Request.elementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, elementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicElementDeleteV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
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
    openapiFields.add("element_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("element_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicElementDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicElementDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicElementDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicElementDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AicElementDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, AicElementDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicElementDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicElementDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicElementDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to AicElementDeleteV30Request
  */
  public static AicElementDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicElementDeleteV30Request.class);
  }

 /**
  * Convert an instance of AicElementDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

