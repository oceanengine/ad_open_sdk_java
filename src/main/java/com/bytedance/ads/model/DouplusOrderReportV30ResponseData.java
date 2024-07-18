/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOrderReportV30ResponseDataOrderMetricsInner;
import com.bytedance.ads.model.DouplusOrderReportV30ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class DouplusOrderReportV30ResponseData {
  public static final String SERIALIZED_NAME_ORDER_METRICS = "order_metrics";
  @SerializedName(SERIALIZED_NAME_ORDER_METRICS)
  private List<DouplusOrderReportV30ResponseDataOrderMetricsInner> orderMetrics = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private DouplusOrderReportV30ResponseDataPageInfo pageInfo = null;

  public DouplusOrderReportV30ResponseData() {
  }

  public DouplusOrderReportV30ResponseData orderMetrics(List<DouplusOrderReportV30ResponseDataOrderMetricsInner> orderMetrics) {
    
    this.orderMetrics = orderMetrics;
    return this;
  }

  public DouplusOrderReportV30ResponseData addOrderMetricsItem(DouplusOrderReportV30ResponseDataOrderMetricsInner orderMetricsItem) {
    if (this.orderMetrics == null) {
      this.orderMetrics = new ArrayList<>();
    }
    this.orderMetrics.add(orderMetricsItem);
    return this;
  }

   /**
   * 
   * @return orderMetrics
  **/
  @javax.annotation.Nullable
  public List<DouplusOrderReportV30ResponseDataOrderMetricsInner> getOrderMetrics() {
    return orderMetrics;
  }


  public void setOrderMetrics(List<DouplusOrderReportV30ResponseDataOrderMetricsInner> orderMetrics) {
    this.orderMetrics = orderMetrics;
  }


  public DouplusOrderReportV30ResponseData pageInfo(DouplusOrderReportV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public DouplusOrderReportV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(DouplusOrderReportV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderReportV30ResponseData douplusOrderReportV30ResponseData = (DouplusOrderReportV30ResponseData) o;
    return Objects.equals(this.orderMetrics, douplusOrderReportV30ResponseData.orderMetrics) &&
        Objects.equals(this.pageInfo, douplusOrderReportV30ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderMetrics, pageInfo);
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
    sb.append("class DouplusOrderReportV30ResponseData {\n");
    sb.append("    orderMetrics: ").append(toIndentedString(orderMetrics)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("order_metrics");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderReportV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderReportV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderReportV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderReportV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderReportV30ResponseData>() {
           @Override
           public void write(JsonWriter out, DouplusOrderReportV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderReportV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderReportV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderReportV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderReportV30ResponseData
  */
  public static DouplusOrderReportV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderReportV30ResponseData.class);
  }

 /**
  * Convert an instance of DouplusOrderReportV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

