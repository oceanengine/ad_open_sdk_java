/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * AdGetV2ResponseDataDpaProductTargetInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class AdGetV2ResponseDataDpaProductTargetInner {
  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public AdGetV2ResponseDataDpaProductTargetInner() {
  }

  public AdGetV2ResponseDataDpaProductTargetInner rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * 
   * @return rule
  **/
  @javax.annotation.Nullable
  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  public AdGetV2ResponseDataDpaProductTargetInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AdGetV2ResponseDataDpaProductTargetInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AdGetV2ResponseDataDpaProductTargetInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGetV2ResponseDataDpaProductTargetInner adGetV2ResponseDataDpaProductTargetInner = (AdGetV2ResponseDataDpaProductTargetInner) o;
    return Objects.equals(this.rule, adGetV2ResponseDataDpaProductTargetInner.rule) &&
        Objects.equals(this.title, adGetV2ResponseDataDpaProductTargetInner.title) &&
        Objects.equals(this.type, adGetV2ResponseDataDpaProductTargetInner.type) &&
        Objects.equals(this.value, adGetV2ResponseDataDpaProductTargetInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, title, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGetV2ResponseDataDpaProductTargetInner {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("rule");
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdGetV2ResponseDataDpaProductTargetInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdGetV2ResponseDataDpaProductTargetInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdGetV2ResponseDataDpaProductTargetInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdGetV2ResponseDataDpaProductTargetInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdGetV2ResponseDataDpaProductTargetInner>() {
           @Override
           public void write(JsonWriter out, AdGetV2ResponseDataDpaProductTargetInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdGetV2ResponseDataDpaProductTargetInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdGetV2ResponseDataDpaProductTargetInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdGetV2ResponseDataDpaProductTargetInner
  * @throws IOException if the JSON string is invalid with respect to AdGetV2ResponseDataDpaProductTargetInner
  */
  public static AdGetV2ResponseDataDpaProductTargetInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdGetV2ResponseDataDpaProductTargetInner.class);
  }

 /**
  * Convert an instance of AdGetV2ResponseDataDpaProductTargetInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

