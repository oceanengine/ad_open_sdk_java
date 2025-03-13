/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerShareV30DataErrorListAllAccountType;
import com.bytedance.ads.model.EventManagerShareV30DataErrorListShareMode;
import com.bytedance.ads.model.EventManagerShareV30ResponseDataErrorListInnerAccountInfo;
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
 * EventManagerShareV30ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class EventManagerShareV30ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private EventManagerShareV30ResponseDataErrorListInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_TYPE = "all_account_type";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_TYPE)
  private EventManagerShareV30DataErrorListAllAccountType allAccountType = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private EventManagerShareV30DataErrorListShareMode shareMode = null;

  public EventManagerShareV30ResponseDataErrorListInner() {
  }

  public EventManagerShareV30ResponseDataErrorListInner accountInfo(EventManagerShareV30ResponseDataErrorListInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public EventManagerShareV30ResponseDataErrorListInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(EventManagerShareV30ResponseDataErrorListInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public EventManagerShareV30ResponseDataErrorListInner allAccountType(EventManagerShareV30DataErrorListAllAccountType allAccountType) {
    
    this.allAccountType = allAccountType;
    return this;
  }

   /**
   * Get allAccountType
   * @return allAccountType
  **/
  @javax.annotation.Nullable
  public EventManagerShareV30DataErrorListAllAccountType getAllAccountType() {
    return allAccountType;
  }


  public void setAllAccountType(EventManagerShareV30DataErrorListAllAccountType allAccountType) {
    this.allAccountType = allAccountType;
  }


  public EventManagerShareV30ResponseDataErrorListInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public EventManagerShareV30ResponseDataErrorListInner shareMode(EventManagerShareV30DataErrorListShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public EventManagerShareV30DataErrorListShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(EventManagerShareV30DataErrorListShareMode shareMode) {
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
    EventManagerShareV30ResponseDataErrorListInner eventManagerShareV30ResponseDataErrorListInner = (EventManagerShareV30ResponseDataErrorListInner) o;
    return Objects.equals(this.accountInfo, eventManagerShareV30ResponseDataErrorListInner.accountInfo) &&
        Objects.equals(this.allAccountType, eventManagerShareV30ResponseDataErrorListInner.allAccountType) &&
        Objects.equals(this.errorMessage, eventManagerShareV30ResponseDataErrorListInner.errorMessage) &&
        Objects.equals(this.shareMode, eventManagerShareV30ResponseDataErrorListInner.shareMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccountType, errorMessage, shareMode);
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
    sb.append("class EventManagerShareV30ResponseDataErrorListInner {\n");
    sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
    sb.append("    allAccountType: ").append(toIndentedString(allAccountType)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("all_account_type");
    openapiFields.add("error_message");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerShareV30ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerShareV30ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerShareV30ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerShareV30ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerShareV30ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, EventManagerShareV30ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerShareV30ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerShareV30ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerShareV30ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerShareV30ResponseDataErrorListInner
  */
  public static EventManagerShareV30ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerShareV30ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of EventManagerShareV30ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

