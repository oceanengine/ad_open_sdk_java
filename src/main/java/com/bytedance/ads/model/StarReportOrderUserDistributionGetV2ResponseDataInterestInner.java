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
 * StarReportOrderUserDistributionGetV2ResponseDataInterestInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarReportOrderUserDistributionGetV2ResponseDataInterestInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value = null;

  public StarReportOrderUserDistributionGetV2ResponseDataInterestInner() {
  }

  public StarReportOrderUserDistributionGetV2ResponseDataInterestInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public StarReportOrderUserDistributionGetV2ResponseDataInterestInner value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
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
    StarReportOrderUserDistributionGetV2ResponseDataInterestInner starReportOrderUserDistributionGetV2ResponseDataInterestInner = (StarReportOrderUserDistributionGetV2ResponseDataInterestInner) o;
    return Objects.equals(this.key, starReportOrderUserDistributionGetV2ResponseDataInterestInner.key) &&
        Objects.equals(this.value, starReportOrderUserDistributionGetV2ResponseDataInterestInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarReportOrderUserDistributionGetV2ResponseDataInterestInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderUserDistributionGetV2ResponseDataInterestInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderUserDistributionGetV2ResponseDataInterestInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderUserDistributionGetV2ResponseDataInterestInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderUserDistributionGetV2ResponseDataInterestInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderUserDistributionGetV2ResponseDataInterestInner>() {
           @Override
           public void write(JsonWriter out, StarReportOrderUserDistributionGetV2ResponseDataInterestInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderUserDistributionGetV2ResponseDataInterestInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderUserDistributionGetV2ResponseDataInterestInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderUserDistributionGetV2ResponseDataInterestInner
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderUserDistributionGetV2ResponseDataInterestInner
  */
  public static StarReportOrderUserDistributionGetV2ResponseDataInterestInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderUserDistributionGetV2ResponseDataInterestInner.class);
  }

 /**
  * Convert an instance of StarReportOrderUserDistributionGetV2ResponseDataInterestInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

