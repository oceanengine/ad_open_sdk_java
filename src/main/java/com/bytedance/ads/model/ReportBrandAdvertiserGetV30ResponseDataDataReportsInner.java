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
import com.bytedance.ads.model.ReportBrandAdvertiserGetV30ResponseDataDataReportsInnerDataReport;
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
 * ReportBrandAdvertiserGetV30ResponseDataDataReportsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ReportBrandAdvertiserGetV30ResponseDataDataReportsInner {
  public static final String SERIALIZED_NAME_DATA_REPORT = "data_report";
  @SerializedName(SERIALIZED_NAME_DATA_REPORT)
  private ReportBrandAdvertiserGetV30ResponseDataDataReportsInnerDataReport dataReport = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public ReportBrandAdvertiserGetV30ResponseDataDataReportsInner() {
  }

  public ReportBrandAdvertiserGetV30ResponseDataDataReportsInner dataReport(ReportBrandAdvertiserGetV30ResponseDataDataReportsInnerDataReport dataReport) {
    
    this.dataReport = dataReport;
    return this;
  }

   /**
   * Get dataReport
   * @return dataReport
  **/
  @javax.annotation.Nullable
  public ReportBrandAdvertiserGetV30ResponseDataDataReportsInnerDataReport getDataReport() {
    return dataReport;
  }


  public void setDataReport(ReportBrandAdvertiserGetV30ResponseDataDataReportsInnerDataReport dataReport) {
    this.dataReport = dataReport;
  }


  public ReportBrandAdvertiserGetV30ResponseDataDataReportsInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期 2016-01-01
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBrandAdvertiserGetV30ResponseDataDataReportsInner reportBrandAdvertiserGetV30ResponseDataDataReportsInner = (ReportBrandAdvertiserGetV30ResponseDataDataReportsInner) o;
    return Objects.equals(this.dataReport, reportBrandAdvertiserGetV30ResponseDataDataReportsInner.dataReport) &&
        Objects.equals(this.date, reportBrandAdvertiserGetV30ResponseDataDataReportsInner.date);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataReport, date);
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
    sb.append("class ReportBrandAdvertiserGetV30ResponseDataDataReportsInner {\n");
    sb.append("    dataReport: ").append(toIndentedString(dataReport)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
    openapiFields.add("date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandAdvertiserGetV30ResponseDataDataReportsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandAdvertiserGetV30ResponseDataDataReportsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandAdvertiserGetV30ResponseDataDataReportsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandAdvertiserGetV30ResponseDataDataReportsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandAdvertiserGetV30ResponseDataDataReportsInner>() {
           @Override
           public void write(JsonWriter out, ReportBrandAdvertiserGetV30ResponseDataDataReportsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandAdvertiserGetV30ResponseDataDataReportsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandAdvertiserGetV30ResponseDataDataReportsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandAdvertiserGetV30ResponseDataDataReportsInner
  * @throws IOException if the JSON string is invalid with respect to ReportBrandAdvertiserGetV30ResponseDataDataReportsInner
  */
  public static ReportBrandAdvertiserGetV30ResponseDataDataReportsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandAdvertiserGetV30ResponseDataDataReportsInner.class);
  }

 /**
  * Convert an instance of ReportBrandAdvertiserGetV30ResponseDataDataReportsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

