/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
 * 转化成本波动范围
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation {
  public static final String SERIALIZED_NAME_VARIATION_MAX = "variation_max";
  @SerializedName(SERIALIZED_NAME_VARIATION_MAX)
  private String variationMax = null;

  public static final String SERIALIZED_NAME_VARIATION_MIN = "variation_min";
  @SerializedName(SERIALIZED_NAME_VARIATION_MIN)
  private String variationMin = null;

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation() {
  }

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation variationMax(String variationMax) {
    
    this.variationMax = variationMax;
    return this;
  }

   /**
   * 波动范围上限
   * @return variationMax
  **/
  @javax.annotation.Nullable
  public String getVariationMax() {
    return variationMax;
  }


  public void setVariationMax(String variationMax) {
    this.variationMax = variationMax;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation variationMin(String variationMin) {
    
    this.variationMin = variationMin;
    return this;
  }

   /**
   * 波动范围下限
   * @return variationMin
  **/
  @javax.annotation.Nullable
  public String getVariationMin() {
    return variationMin;
  }


  public void setVariationMin(String variationMin) {
    this.variationMin = variationMin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation toolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation = (ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation) o;
    return Objects.equals(this.variationMax, toolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation.variationMax) &&
        Objects.equals(this.variationMin, toolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation.variationMin);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(variationMax, variationMin);
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
    sb.append("class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation {\n");
    sb.append("    variationMax: ").append(toIndentedString(variationMax)).append("\n");
    sb.append("    variationMin: ").append(toIndentedString(variationMin)).append("\n");
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
    openapiFields.add("variation_max");
    openapiFields.add("variation_min");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation
  */
  public static ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation.class);
  }

 /**
  * Convert an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

