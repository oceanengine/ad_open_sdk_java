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
import com.bytedance.ads.model.EnterpriseBindListGetV10ResponseData;
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
 * EnterpriseBindListGetV10Response
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class EnterpriseBindListGetV10Response {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private EnterpriseBindListGetV10ResponseData data = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId = null;

  public EnterpriseBindListGetV10Response() {
  }

  public EnterpriseBindListGetV10Response code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nullable
  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public EnterpriseBindListGetV10Response data(EnterpriseBindListGetV10ResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public EnterpriseBindListGetV10ResponseData getData() {
    return data;
  }


  public void setData(EnterpriseBindListGetV10ResponseData data) {
    this.data = data;
  }


  public EnterpriseBindListGetV10Response message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public EnterpriseBindListGetV10Response requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * 
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseBindListGetV10Response enterpriseBindListGetV10Response = (EnterpriseBindListGetV10Response) o;
    return Objects.equals(this.code, enterpriseBindListGetV10Response.code) &&
        Objects.equals(this.data, enterpriseBindListGetV10Response.data) &&
        Objects.equals(this.message, enterpriseBindListGetV10Response.message) &&
        Objects.equals(this.requestId, enterpriseBindListGetV10Response.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseBindListGetV10Response {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("data");
    openapiFields.add("message");
    openapiFields.add("request_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseBindListGetV10Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseBindListGetV10Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseBindListGetV10Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseBindListGetV10Response.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseBindListGetV10Response>() {
           @Override
           public void write(JsonWriter out, EnterpriseBindListGetV10Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseBindListGetV10Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseBindListGetV10Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseBindListGetV10Response
  * @throws IOException if the JSON string is invalid with respect to EnterpriseBindListGetV10Response
  */
  public static EnterpriseBindListGetV10Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseBindListGetV10Response.class);
  }

 /**
  * Convert an instance of EnterpriseBindListGetV10Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

