/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueSmartphoneCreateV2CallDisplay;
import com.bytedance.ads.model.ClueSmartphoneCreateV2RequestNoDisturbTimesInner;
import com.bytedance.ads.model.ClueSmartphoneCreateV2ValidateType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ClueSmartphoneCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ClueSmartphoneCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CALL_DISPLAY = "call_display";
  @SerializedName(SERIALIZED_NAME_CALL_DISPLAY)
  private ClueSmartphoneCreateV2CallDisplay callDisplay = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NO_DISTURB_TIMES = "no_disturb_times";
  @SerializedName(SERIALIZED_NAME_NO_DISTURB_TIMES)
  private List<ClueSmartphoneCreateV2RequestNoDisturbTimesInner> noDisturbTimes = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber = null;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private ClueSmartphoneCreateV2ValidateType validateType = null;

  public ClueSmartphoneCreateV2Request() {
  }

  public ClueSmartphoneCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueSmartphoneCreateV2Request callDisplay(ClueSmartphoneCreateV2CallDisplay callDisplay) {
    
    this.callDisplay = callDisplay;
    return this;
  }

   /**
   * Get callDisplay
   * @return callDisplay
  **/
  @javax.annotation.Nullable
  public ClueSmartphoneCreateV2CallDisplay getCallDisplay() {
    return callDisplay;
  }


  public void setCallDisplay(ClueSmartphoneCreateV2CallDisplay callDisplay) {
    this.callDisplay = callDisplay;
  }


  public ClueSmartphoneCreateV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueSmartphoneCreateV2Request noDisturbTimes(List<ClueSmartphoneCreateV2RequestNoDisturbTimesInner> noDisturbTimes) {
    
    this.noDisturbTimes = noDisturbTimes;
    return this;
  }

  public ClueSmartphoneCreateV2Request addNoDisturbTimesItem(ClueSmartphoneCreateV2RequestNoDisturbTimesInner noDisturbTimesItem) {
    if (this.noDisturbTimes == null) {
      this.noDisturbTimes = new ArrayList<>();
    }
    this.noDisturbTimes.add(noDisturbTimesItem);
    return this;
  }

   /**
   * 
   * @return noDisturbTimes
  **/
  @javax.annotation.Nullable
  public List<ClueSmartphoneCreateV2RequestNoDisturbTimesInner> getNoDisturbTimes() {
    return noDisturbTimes;
  }


  public void setNoDisturbTimes(List<ClueSmartphoneCreateV2RequestNoDisturbTimesInner> noDisturbTimes) {
    this.noDisturbTimes = noDisturbTimes;
  }


  public ClueSmartphoneCreateV2Request phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public ClueSmartphoneCreateV2Request validateType(ClueSmartphoneCreateV2ValidateType validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * Get validateType
   * @return validateType
  **/
  @javax.annotation.Nullable
  public ClueSmartphoneCreateV2ValidateType getValidateType() {
    return validateType;
  }


  public void setValidateType(ClueSmartphoneCreateV2ValidateType validateType) {
    this.validateType = validateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueSmartphoneCreateV2Request clueSmartphoneCreateV2Request = (ClueSmartphoneCreateV2Request) o;
    return Objects.equals(this.advertiserId, clueSmartphoneCreateV2Request.advertiserId) &&
        Objects.equals(this.callDisplay, clueSmartphoneCreateV2Request.callDisplay) &&
        Objects.equals(this.name, clueSmartphoneCreateV2Request.name) &&
        Objects.equals(this.noDisturbTimes, clueSmartphoneCreateV2Request.noDisturbTimes) &&
        Objects.equals(this.phoneNumber, clueSmartphoneCreateV2Request.phoneNumber) &&
        Objects.equals(this.validateType, clueSmartphoneCreateV2Request.validateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, callDisplay, name, noDisturbTimes, phoneNumber, validateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueSmartphoneCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    callDisplay: ").append(toIndentedString(callDisplay)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noDisturbTimes: ").append(toIndentedString(noDisturbTimes)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    validateType: ").append(toIndentedString(validateType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("call_display");
    openapiFields.add("name");
    openapiFields.add("no_disturb_times");
    openapiFields.add("phone_number");
    openapiFields.add("validate_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("phone_number");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueSmartphoneCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueSmartphoneCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueSmartphoneCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueSmartphoneCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueSmartphoneCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ClueSmartphoneCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueSmartphoneCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueSmartphoneCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueSmartphoneCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueSmartphoneCreateV2Request
  */
  public static ClueSmartphoneCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueSmartphoneCreateV2Request.class);
  }

 /**
  * Convert an instance of ClueSmartphoneCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

