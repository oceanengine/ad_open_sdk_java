/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner;
import com.bytedance.ads.model.ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ReportBrandAgentDataV30ResponseDataDataReportsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ReportBrandAgentDataV30ResponseDataDataReportsInner {
  public static final String SERIALIZED_NAME_DATA_REPORT = "data_report";
  @SerializedName(SERIALIZED_NAME_DATA_REPORT)
  private List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner> dataReport = null;

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner> dimensions = null;

  public ReportBrandAgentDataV30ResponseDataDataReportsInner() {
  }

  public ReportBrandAgentDataV30ResponseDataDataReportsInner dataReport(List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner> dataReport) {
    
    this.dataReport = dataReport;
    return this;
  }

  public ReportBrandAgentDataV30ResponseDataDataReportsInner addDataReportItem(ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner dataReportItem) {
    if (this.dataReport == null) {
      this.dataReport = new ArrayList<>();
    }
    this.dataReport.add(dataReportItem);
    return this;
  }

   /**
   * 指标集合
   * @return dataReport
  **/
  @javax.annotation.Nullable
  public List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner> getDataReport() {
    return dataReport;
  }


  public void setDataReport(List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDataReportInner> dataReport) {
    this.dataReport = dataReport;
  }


  public ReportBrandAgentDataV30ResponseDataDataReportsInner dimensions(List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ReportBrandAgentDataV30ResponseDataDataReportsInner addDimensionsItem(ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * 
   * @return dimensions
  **/
  @javax.annotation.Nullable
  public List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<ReportBrandAgentDataV30ResponseDataDataReportsInnerDimensionsInner> dimensions) {
    this.dimensions = dimensions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBrandAgentDataV30ResponseDataDataReportsInner reportBrandAgentDataV30ResponseDataDataReportsInner = (ReportBrandAgentDataV30ResponseDataDataReportsInner) o;
    return Objects.equals(this.dataReport, reportBrandAgentDataV30ResponseDataDataReportsInner.dataReport) &&
        Objects.equals(this.dimensions, reportBrandAgentDataV30ResponseDataDataReportsInner.dimensions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataReport, dimensions);
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
    sb.append("class ReportBrandAgentDataV30ResponseDataDataReportsInner {\n");
    sb.append("    dataReport: ").append(toIndentedString(dataReport)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
    openapiFields.add("data_report");
    openapiFields.add("dimensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandAgentDataV30ResponseDataDataReportsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandAgentDataV30ResponseDataDataReportsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandAgentDataV30ResponseDataDataReportsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandAgentDataV30ResponseDataDataReportsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandAgentDataV30ResponseDataDataReportsInner>() {
           @Override
           public void write(JsonWriter out, ReportBrandAgentDataV30ResponseDataDataReportsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandAgentDataV30ResponseDataDataReportsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandAgentDataV30ResponseDataDataReportsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandAgentDataV30ResponseDataDataReportsInner
  * @throws IOException if the JSON string is invalid with respect to ReportBrandAgentDataV30ResponseDataDataReportsInner
  */
  public static ReportBrandAgentDataV30ResponseDataDataReportsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandAgentDataV30ResponseDataDataReportsInner.class);
  }

 /**
  * Convert an instance of ReportBrandAgentDataV30ResponseDataDataReportsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

