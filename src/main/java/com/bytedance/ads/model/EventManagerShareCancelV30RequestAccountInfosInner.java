/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerShareCancelV30AccountInfosAccountType;
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
 * EventManagerShareCancelV30RequestAccountInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class EventManagerShareCancelV30RequestAccountInfosInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private EventManagerShareCancelV30AccountInfosAccountType accountType = null;

  public EventManagerShareCancelV30RequestAccountInfosInner() {
  }

  public EventManagerShareCancelV30RequestAccountInfosInner accountId(Long accountId) {
    
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


  public EventManagerShareCancelV30RequestAccountInfosInner accountType(EventManagerShareCancelV30AccountInfosAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public EventManagerShareCancelV30AccountInfosAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(EventManagerShareCancelV30AccountInfosAccountType accountType) {
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
    EventManagerShareCancelV30RequestAccountInfosInner eventManagerShareCancelV30RequestAccountInfosInner = (EventManagerShareCancelV30RequestAccountInfosInner) o;
    return Objects.equals(this.accountId, eventManagerShareCancelV30RequestAccountInfosInner.accountId) &&
        Objects.equals(this.accountType, eventManagerShareCancelV30RequestAccountInfosInner.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerShareCancelV30RequestAccountInfosInner {\n");
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
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerShareCancelV30RequestAccountInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerShareCancelV30RequestAccountInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerShareCancelV30RequestAccountInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerShareCancelV30RequestAccountInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerShareCancelV30RequestAccountInfosInner>() {
           @Override
           public void write(JsonWriter out, EventManagerShareCancelV30RequestAccountInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerShareCancelV30RequestAccountInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerShareCancelV30RequestAccountInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerShareCancelV30RequestAccountInfosInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerShareCancelV30RequestAccountInfosInner
  */
  public static EventManagerShareCancelV30RequestAccountInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerShareCancelV30RequestAccountInfosInner.class);
  }

 /**
  * Convert an instance of EventManagerShareCancelV30RequestAccountInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
