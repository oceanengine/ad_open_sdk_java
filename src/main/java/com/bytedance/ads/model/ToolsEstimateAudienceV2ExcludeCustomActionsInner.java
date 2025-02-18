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
 * ToolsEstimateAudienceV2ExcludeCustomActionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ToolsEstimateAudienceV2ExcludeCustomActionsInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code = null;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private Long days = null;

  public ToolsEstimateAudienceV2ExcludeCustomActionsInner() {
  }

  public ToolsEstimateAudienceV2ExcludeCustomActionsInner code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nonnull
  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public ToolsEstimateAudienceV2ExcludeCustomActionsInner days(Long days) {
    
    this.days = days;
    return this;
  }

   /**
   * 
   * @return days
  **/
  @javax.annotation.Nonnull
  public Long getDays() {
    return days;
  }


  public void setDays(Long days) {
    this.days = days;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEstimateAudienceV2ExcludeCustomActionsInner toolsEstimateAudienceV2ExcludeCustomActionsInner = (ToolsEstimateAudienceV2ExcludeCustomActionsInner) o;
    return Objects.equals(this.code, toolsEstimateAudienceV2ExcludeCustomActionsInner.code) &&
        Objects.equals(this.days, toolsEstimateAudienceV2ExcludeCustomActionsInner.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEstimateAudienceV2ExcludeCustomActionsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
    openapiFields.add("days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("days");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEstimateAudienceV2ExcludeCustomActionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEstimateAudienceV2ExcludeCustomActionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEstimateAudienceV2ExcludeCustomActionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEstimateAudienceV2ExcludeCustomActionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEstimateAudienceV2ExcludeCustomActionsInner>() {
           @Override
           public void write(JsonWriter out, ToolsEstimateAudienceV2ExcludeCustomActionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEstimateAudienceV2ExcludeCustomActionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEstimateAudienceV2ExcludeCustomActionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEstimateAudienceV2ExcludeCustomActionsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEstimateAudienceV2ExcludeCustomActionsInner
  */
  public static ToolsEstimateAudienceV2ExcludeCustomActionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEstimateAudienceV2ExcludeCustomActionsInner.class);
  }

 /**
  * Convert an instance of ToolsEstimateAudienceV2ExcludeCustomActionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

