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
import com.bytedance.ads.model.ToolsClueLifeCallbackV2EventDataReasonCode;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsClueLifeCallbackV2RequestEventData {
  public static final String SERIALIZED_NAME_REASON_CODE = "reason_code";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private ToolsClueLifeCallbackV2EventDataReasonCode reasonCode = null;

  public static final String SERIALIZED_NAME_REASON_MESSAGE = "reason_message";
  @SerializedName(SERIALIZED_NAME_REASON_MESSAGE)
  private String reasonMessage = null;

  public ToolsClueLifeCallbackV2RequestEventData() {
  }

  public ToolsClueLifeCallbackV2RequestEventData reasonCode(ToolsClueLifeCallbackV2EventDataReasonCode reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeCallbackV2EventDataReasonCode getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(ToolsClueLifeCallbackV2EventDataReasonCode reasonCode) {
    this.reasonCode = reasonCode;
  }


  public ToolsClueLifeCallbackV2RequestEventData reasonMessage(String reasonMessage) {
    
    this.reasonMessage = reasonMessage;
    return this;
  }

   /**
   * 
   * @return reasonMessage
  **/
  @javax.annotation.Nullable
  public String getReasonMessage() {
    return reasonMessage;
  }


  public void setReasonMessage(String reasonMessage) {
    this.reasonMessage = reasonMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueLifeCallbackV2RequestEventData toolsClueLifeCallbackV2RequestEventData = (ToolsClueLifeCallbackV2RequestEventData) o;
    return Objects.equals(this.reasonCode, toolsClueLifeCallbackV2RequestEventData.reasonCode) &&
        Objects.equals(this.reasonMessage, toolsClueLifeCallbackV2RequestEventData.reasonMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode, reasonMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueLifeCallbackV2RequestEventData {\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonMessage: ").append(toIndentedString(reasonMessage)).append("\n");
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
    openapiFields.add("reason_code");
    openapiFields.add("reason_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueLifeCallbackV2RequestEventData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueLifeCallbackV2RequestEventData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueLifeCallbackV2RequestEventData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueLifeCallbackV2RequestEventData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueLifeCallbackV2RequestEventData>() {
           @Override
           public void write(JsonWriter out, ToolsClueLifeCallbackV2RequestEventData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueLifeCallbackV2RequestEventData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueLifeCallbackV2RequestEventData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueLifeCallbackV2RequestEventData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueLifeCallbackV2RequestEventData
  */
  public static ToolsClueLifeCallbackV2RequestEventData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueLifeCallbackV2RequestEventData.class);
  }

 /**
  * Convert an instance of ToolsClueLifeCallbackV2RequestEventData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

