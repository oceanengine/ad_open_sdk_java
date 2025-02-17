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
import com.bytedance.ads.model.ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig;
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
 * ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_EXCLUSION_DIMS = "exclusion_dims";
  @SerializedName(SERIALIZED_NAME_EXCLUSION_DIMS)
  private List<String> exclusionDims = null;

  public static final String SERIALIZED_NAME_EXCLUSION_METRICS = "exclusion_metrics";
  @SerializedName(SERIALIZED_NAME_EXCLUSION_METRICS)
  private List<String> exclusionMetrics = null;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_FILTER_ABLE = "filter_able";
  @SerializedName(SERIALIZED_NAME_FILTER_ABLE)
  private Boolean filterAble = null;

  public static final String SERIALIZED_NAME_FILTER_CONFIG = "filter_config";
  @SerializedName(SERIALIZED_NAME_FILTER_CONFIG)
  private ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig filterConfig = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SORT_ABLE = "sort_able";
  @SerializedName(SERIALIZED_NAME_SORT_ABLE)
  private Boolean sortAble = null;

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner() {
  }

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner exclusionDims(List<String> exclusionDims) {
    
    this.exclusionDims = exclusionDims;
    return this;
  }

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner addExclusionDimsItem(String exclusionDimsItem) {
    if (this.exclusionDims == null) {
      this.exclusionDims = new ArrayList<>();
    }
    this.exclusionDims.add(exclusionDimsItem);
    return this;
  }

   /**
   * 
   * @return exclusionDims
  **/
  @javax.annotation.Nullable
  public List<String> getExclusionDims() {
    return exclusionDims;
  }


  public void setExclusionDims(List<String> exclusionDims) {
    this.exclusionDims = exclusionDims;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner exclusionMetrics(List<String> exclusionMetrics) {
    
    this.exclusionMetrics = exclusionMetrics;
    return this;
  }

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner addExclusionMetricsItem(String exclusionMetricsItem) {
    if (this.exclusionMetrics == null) {
      this.exclusionMetrics = new ArrayList<>();
    }
    this.exclusionMetrics.add(exclusionMetricsItem);
    return this;
  }

   /**
   * 
   * @return exclusionMetrics
  **/
  @javax.annotation.Nullable
  public List<String> getExclusionMetrics() {
    return exclusionMetrics;
  }


  public void setExclusionMetrics(List<String> exclusionMetrics) {
    this.exclusionMetrics = exclusionMetrics;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * 
   * @return field
  **/
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner filterAble(Boolean filterAble) {
    
    this.filterAble = filterAble;
    return this;
  }

   /**
   * 
   * @return filterAble
  **/
  @javax.annotation.Nullable
  public Boolean getFilterAble() {
    return filterAble;
  }


  public void setFilterAble(Boolean filterAble) {
    this.filterAble = filterAble;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner filterConfig(ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig filterConfig) {
    
    this.filterConfig = filterConfig;
    return this;
  }

   /**
   * Get filterConfig
   * @return filterConfig
  **/
  @javax.annotation.Nullable
  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig getFilterConfig() {
    return filterConfig;
  }


  public void setFilterConfig(ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig filterConfig) {
    this.filterConfig = filterConfig;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner sortAble(Boolean sortAble) {
    
    this.sortAble = sortAble;
    return this;
  }

   /**
   * 
   * @return sortAble
  **/
  @javax.annotation.Nullable
  public Boolean getSortAble() {
    return sortAble;
  }


  public void setSortAble(Boolean sortAble) {
    this.sortAble = sortAble;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner reportCustomConfigGetV30ResponseDataListInnerDimensionsInner = (ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner) o;
    return Objects.equals(this.description, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.description) &&
        Objects.equals(this.exclusionDims, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.exclusionDims) &&
        Objects.equals(this.exclusionMetrics, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.exclusionMetrics) &&
        Objects.equals(this.field, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.field) &&
        Objects.equals(this.filterAble, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.filterAble) &&
        Objects.equals(this.filterConfig, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.filterConfig) &&
        Objects.equals(this.name, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.name) &&
        Objects.equals(this.sortAble, reportCustomConfigGetV30ResponseDataListInnerDimensionsInner.sortAble);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, exclusionDims, exclusionMetrics, field, filterAble, filterConfig, name, sortAble);
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
    sb.append("class ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exclusionDims: ").append(toIndentedString(exclusionDims)).append("\n");
    sb.append("    exclusionMetrics: ").append(toIndentedString(exclusionMetrics)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    filterAble: ").append(toIndentedString(filterAble)).append("\n");
    sb.append("    filterConfig: ").append(toIndentedString(filterConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sortAble: ").append(toIndentedString(sortAble)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("exclusion_dims");
    openapiFields.add("exclusion_metrics");
    openapiFields.add("field");
    openapiFields.add("filter_able");
    openapiFields.add("filter_config");
    openapiFields.add("name");
    openapiFields.add("sort_able");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner
  */
  public static ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner.class);
  }

 /**
  * Convert an instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

