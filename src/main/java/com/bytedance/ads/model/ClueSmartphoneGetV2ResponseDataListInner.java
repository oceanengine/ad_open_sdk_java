/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueSmartphoneGetV2DataListValidateType;
import com.bytedance.ads.model.ClueSmartphoneGetV2ResponseDataListInnerNoDisturbTimesInner;
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
 * ClueSmartphoneGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ClueSmartphoneGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CALL_DISPLAY = "call_display";
  @SerializedName(SERIALIZED_NAME_CALL_DISPLAY)
  private Long callDisplay = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NO_DISTURB_TIMES = "no_disturb_times";
  @SerializedName(SERIALIZED_NAME_NO_DISTURB_TIMES)
  private List<ClueSmartphoneGetV2ResponseDataListInnerNoDisturbTimesInner> noDisturbTimes = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber = null;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private ClueSmartphoneGetV2DataListValidateType validateType = null;

  public ClueSmartphoneGetV2ResponseDataListInner() {
  }

  
  public ClueSmartphoneGetV2ResponseDataListInner(
     String createTime
  ) {
    this();
    this.createTime = createTime;
  }

  public ClueSmartphoneGetV2ResponseDataListInner callDisplay(Long callDisplay) {
    
    this.callDisplay = callDisplay;
    return this;
  }

   /**
   * 
   * @return callDisplay
  **/
  @javax.annotation.Nullable
  public Long getCallDisplay() {
    return callDisplay;
  }


  public void setCallDisplay(Long callDisplay) {
    this.callDisplay = callDisplay;
  }


   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }




  public ClueSmartphoneGetV2ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueSmartphoneGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueSmartphoneGetV2ResponseDataListInner noDisturbTimes(List<ClueSmartphoneGetV2ResponseDataListInnerNoDisturbTimesInner> noDisturbTimes) {
    
    this.noDisturbTimes = noDisturbTimes;
    return this;
  }

  public ClueSmartphoneGetV2ResponseDataListInner addNoDisturbTimesItem(ClueSmartphoneGetV2ResponseDataListInnerNoDisturbTimesInner noDisturbTimesItem) {
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
  public List<ClueSmartphoneGetV2ResponseDataListInnerNoDisturbTimesInner> getNoDisturbTimes() {
    return noDisturbTimes;
  }


  public void setNoDisturbTimes(List<ClueSmartphoneGetV2ResponseDataListInnerNoDisturbTimesInner> noDisturbTimes) {
    this.noDisturbTimes = noDisturbTimes;
  }


  public ClueSmartphoneGetV2ResponseDataListInner phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public ClueSmartphoneGetV2ResponseDataListInner validateType(ClueSmartphoneGetV2DataListValidateType validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * Get validateType
   * @return validateType
  **/
  @javax.annotation.Nullable
  public ClueSmartphoneGetV2DataListValidateType getValidateType() {
    return validateType;
  }


  public void setValidateType(ClueSmartphoneGetV2DataListValidateType validateType) {
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
    ClueSmartphoneGetV2ResponseDataListInner clueSmartphoneGetV2ResponseDataListInner = (ClueSmartphoneGetV2ResponseDataListInner) o;
    return Objects.equals(this.callDisplay, clueSmartphoneGetV2ResponseDataListInner.callDisplay) &&
        Objects.equals(this.createTime, clueSmartphoneGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.instanceId, clueSmartphoneGetV2ResponseDataListInner.instanceId) &&
        Objects.equals(this.name, clueSmartphoneGetV2ResponseDataListInner.name) &&
        Objects.equals(this.noDisturbTimes, clueSmartphoneGetV2ResponseDataListInner.noDisturbTimes) &&
        Objects.equals(this.phoneNumber, clueSmartphoneGetV2ResponseDataListInner.phoneNumber) &&
        Objects.equals(this.validateType, clueSmartphoneGetV2ResponseDataListInner.validateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callDisplay, createTime, instanceId, name, noDisturbTimes, phoneNumber, validateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueSmartphoneGetV2ResponseDataListInner {\n");
    sb.append("    callDisplay: ").append(toIndentedString(callDisplay)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
    openapiFields.add("call_display");
    openapiFields.add("create_time");
    openapiFields.add("instance_id");
    openapiFields.add("name");
    openapiFields.add("no_disturb_times");
    openapiFields.add("phone_number");
    openapiFields.add("validate_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueSmartphoneGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueSmartphoneGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueSmartphoneGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueSmartphoneGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueSmartphoneGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ClueSmartphoneGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueSmartphoneGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueSmartphoneGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueSmartphoneGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ClueSmartphoneGetV2ResponseDataListInner
  */
  public static ClueSmartphoneGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueSmartphoneGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ClueSmartphoneGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

