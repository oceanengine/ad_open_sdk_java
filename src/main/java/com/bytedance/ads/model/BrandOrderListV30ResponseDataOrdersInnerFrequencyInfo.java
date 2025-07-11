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
 * 频控信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo {
  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Long frequency = null;

  public static final String SERIALIZED_NAME_FREQUENCY_STATUS = "frequency_status";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_STATUS)
  private Long frequencyStatus = null;

  public BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo() {
  }

  public BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo frequency(Long frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * 频控次数
   * @return frequency
  **/
  @javax.annotation.Nullable
  public Long getFrequency() {
    return frequency;
  }


  public void setFrequency(Long frequency) {
    this.frequency = frequency;
  }


  public BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo frequencyStatus(Long frequencyStatus) {
    
    this.frequencyStatus = frequencyStatus;
    return this;
  }

   /**
   * 是否启用
   * @return frequencyStatus
  **/
  @javax.annotation.Nullable
  public Long getFrequencyStatus() {
    return frequencyStatus;
  }


  public void setFrequencyStatus(Long frequencyStatus) {
    this.frequencyStatus = frequencyStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo brandOrderListV30ResponseDataOrdersInnerFrequencyInfo = (BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo) o;
    return Objects.equals(this.frequency, brandOrderListV30ResponseDataOrdersInnerFrequencyInfo.frequency) &&
        Objects.equals(this.frequencyStatus, brandOrderListV30ResponseDataOrdersInnerFrequencyInfo.frequencyStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, frequencyStatus);
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
    sb.append("class BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyStatus: ").append(toIndentedString(frequencyStatus)).append("\n");
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
    openapiFields.add("frequency");
    openapiFields.add("frequency_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo
  */
  public static BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo.class);
  }

 /**
  * Convert an instance of BrandOrderListV30ResponseDataOrdersInnerFrequencyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

