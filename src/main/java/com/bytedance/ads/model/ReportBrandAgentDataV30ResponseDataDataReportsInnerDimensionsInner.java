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
 * ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner {
  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private String dimension = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public static final String SERIALIZED_NAME_VALUE_STR = "value_str";
  @SerializedName(SERIALIZED_NAME_VALUE_STR)
  private String valueStr = null;

  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner() {
  }

  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner dimension(String dimension) {
    
    this.dimension = dimension;
    return this;
  }

   /**
   * 
   * @return dimension
  **/
  @javax.annotation.Nullable
  public String getDimension() {
    return dimension;
  }


  public void setDimension(String dimension) {
    this.dimension = dimension;
  }


  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner value(String value) {
    
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


  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner valueStr(String valueStr) {
    
    this.valueStr = valueStr;
    return this;
  }

   /**
   * 
   * @return valueStr
  **/
  @javax.annotation.Nullable
  public String getValueStr() {
    return valueStr;
  }


  public void setValueStr(String valueStr) {
    this.valueStr = valueStr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner reportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner = (ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner) o;
    return Objects.equals(this.dimension, reportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner.dimension) &&
        Objects.equals(this.value, reportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner.value) &&
        Objects.equals(this.valueStr, reportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner.valueStr);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, value, valueStr);
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
    sb.append("class ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner {\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueStr: ").append(toIndentedString(valueStr)).append("\n");
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
    openapiFields.add("dimension");
    openapiFields.add("value");
    openapiFields.add("value_str");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner>() {
           @Override
           public void write(JsonWriter out, ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner
  * @throws IOException if the JSON string is invalid with respect to ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner
  */
  public static ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner.class);
  }

 /**
  * Convert an instance of ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

