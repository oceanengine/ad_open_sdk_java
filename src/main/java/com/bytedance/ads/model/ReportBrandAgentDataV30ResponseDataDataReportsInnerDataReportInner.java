/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner {
  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private String metric = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value = null;

  public static final String SERIALIZED_NAME_VALUE_STR = "value_str";
  @SerializedName(SERIALIZED_NAME_VALUE_STR)
  private String valueStr = null;

  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner() {
  }

  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner metric(String metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * 指标名
   * @return metric
  **/
  @javax.annotation.Nullable
  public String getMetric() {
    return metric;
  }


  public void setMetric(String metric) {
    this.metric = metric;
  }


  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * 指标值-float类型
   * @return value
  **/
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  public ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner valueStr(String valueStr) {
    
    this.valueStr = valueStr;
    return this;
  }

   /**
   * 指标值-string类型
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
    ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner reportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner = (ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner) o;
    return Objects.equals(this.metric, reportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner.metric) &&
        Objects.equals(this.value, reportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner.value) &&
        Objects.equals(this.valueStr, reportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner.valueStr);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, value, valueStr);
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
    sb.append("class ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
    openapiFields.add("metric");
    openapiFields.add("value");
    openapiFields.add("value_str");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner>() {
           @Override
           public void write(JsonWriter out, ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner
  * @throws IOException if the JSON string is invalid with respect to ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner
  */
  public static ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner.class);
  }

 /**
  * Convert an instance of ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

