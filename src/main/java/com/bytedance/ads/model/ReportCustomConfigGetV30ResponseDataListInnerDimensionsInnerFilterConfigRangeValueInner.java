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
 * ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner {
  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner() {
  }

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner value(String value) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner = (ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner) o;
    return Objects.equals(this.label, reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner.label) &&
        Objects.equals(this.value, reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, value);
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
    sb.append("class ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("label");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner
  */
  public static ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner.class);
  }

 /**
  * Convert an instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

