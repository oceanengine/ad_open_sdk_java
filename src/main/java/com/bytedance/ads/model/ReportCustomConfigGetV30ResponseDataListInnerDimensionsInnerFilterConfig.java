/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-08T16:01:24.710+08:00[Asia/Shanghai]")
public class ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private Long operator = null;

  public static final String SERIALIZED_NAME_RANGE_VALUE = "range_value";
  @SerializedName(SERIALIZED_NAME_RANGE_VALUE)
  private List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner> rangeValue = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Long type = null;

  public static final String SERIALIZED_NAME_VALUE_LIMIT = "value_limit";
  @SerializedName(SERIALIZED_NAME_VALUE_LIMIT)
  private Long valueLimit = null;

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig() {
  }

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig operator(Long operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 
   * @return operator
  **/
  @javax.annotation.Nullable
  public Long getOperator() {
    return operator;
  }


  public void setOperator(Long operator) {
    this.operator = operator;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig rangeValue(List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner> rangeValue) {
    
    this.rangeValue = rangeValue;
    return this;
  }

  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig addRangeValueItem(ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner rangeValueItem) {
    if (this.rangeValue == null) {
      this.rangeValue = null;
    }
    this.rangeValue.add(rangeValueItem);
    return this;
  }

   /**
   * 
   * @return rangeValue
  **/
  @javax.annotation.Nullable
  public List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner> getRangeValue() {
    return rangeValue;
  }


  public void setRangeValue(List<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfigRangeValueInner> rangeValue) {
    this.rangeValue = rangeValue;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig type(Long type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nullable
  public Long getType() {
    return type;
  }


  public void setType(Long type) {
    this.type = type;
  }


  public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig valueLimit(Long valueLimit) {
    
    this.valueLimit = valueLimit;
    return this;
  }

   /**
   * 
   * @return valueLimit
  **/
  @javax.annotation.Nullable
  public Long getValueLimit() {
    return valueLimit;
  }


  public void setValueLimit(Long valueLimit) {
    this.valueLimit = valueLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig = (ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig) o;
    return Objects.equals(this.operator, reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig.operator) &&
        Objects.equals(this.rangeValue, reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig.rangeValue) &&
        Objects.equals(this.type, reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig.type) &&
        Objects.equals(this.valueLimit, reportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig.valueLimit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, rangeValue, type, valueLimit);
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
    sb.append("class ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    rangeValue: ").append(toIndentedString(rangeValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueLimit: ").append(toIndentedString(valueLimit)).append("\n");
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
    openapiFields.add("operator");
    openapiFields.add("range_value");
    openapiFields.add("type");
    openapiFields.add("value_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig>() {
           @Override
           public void write(JsonWriter out, ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig
  * @throws IOException if the JSON string is invalid with respect to ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig
  */
  public static ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig.class);
  }

 /**
  * Convert an instance of ReportCustomConfigGetV30ResponseDataListInnerDimensionsInnerFilterConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
