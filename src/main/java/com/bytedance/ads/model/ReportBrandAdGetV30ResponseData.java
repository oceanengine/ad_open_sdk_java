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
import com.bytedance.ads.model.ReportBrandAdGetV30ResponseDataDataReportsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ReportBrandAdGetV30ResponseData {
  public static final String SERIALIZED_NAME_DATA_REPORTS = "data_reports";
  @SerializedName(SERIALIZED_NAME_DATA_REPORTS)
  private List<ReportBrandAdGetV30ResponseDataDataReportsInner> dataReports = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount = null;

  public ReportBrandAdGetV30ResponseData() {
  }

  public ReportBrandAdGetV30ResponseData dataReports(List<ReportBrandAdGetV30ResponseDataDataReportsInner> dataReports) {
    
    this.dataReports = dataReports;
    return this;
  }

  public ReportBrandAdGetV30ResponseData addDataReportsItem(ReportBrandAdGetV30ResponseDataDataReportsInner dataReportsItem) {
    if (this.dataReports == null) {
      this.dataReports = new ArrayList<>();
    }
    this.dataReports.add(dataReportsItem);
    return this;
  }

   /**
   * 报表列表
   * @return dataReports
  **/
  @javax.annotation.Nullable
  public List<ReportBrandAdGetV30ResponseDataDataReportsInner> getDataReports() {
    return dataReports;
  }


  public void setDataReports(List<ReportBrandAdGetV30ResponseDataDataReportsInner> dataReports) {
    this.dataReports = dataReports;
  }


  public ReportBrandAdGetV30ResponseData totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 结果总数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBrandAdGetV30ResponseData reportBrandAdGetV30ResponseData = (ReportBrandAdGetV30ResponseData) o;
    return Objects.equals(this.dataReports, reportBrandAdGetV30ResponseData.dataReports) &&
        Objects.equals(this.totalCount, reportBrandAdGetV30ResponseData.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataReports, totalCount);
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
    sb.append("class ReportBrandAdGetV30ResponseData {\n");
    sb.append("    dataReports: ").append(toIndentedString(dataReports)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("data_reports");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandAdGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandAdGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandAdGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandAdGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandAdGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ReportBrandAdGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandAdGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandAdGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandAdGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ReportBrandAdGetV30ResponseData
  */
  public static ReportBrandAdGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandAdGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ReportBrandAdGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

