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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * QianchuanReportTodayLiveRoomDataGetV10FiltersInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class QianchuanReportTodayLiveRoomDataGetV10FiltersInner {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private Long operator = null;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;

  public QianchuanReportTodayLiveRoomDataGetV10FiltersInner() {
  }

  public QianchuanReportTodayLiveRoomDataGetV10FiltersInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * 
   * @return field
  **/
  @javax.annotation.Nonnull
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public QianchuanReportTodayLiveRoomDataGetV10FiltersInner operator(Long operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 
   * @return operator
  **/
  @javax.annotation.Nonnull
  public Long getOperator() {
    return operator;
  }


  public void setOperator(Long operator) {
    this.operator = operator;
  }


  public QianchuanReportTodayLiveRoomDataGetV10FiltersInner values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public QianchuanReportTodayLiveRoomDataGetV10FiltersInner addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * 
   * @return values
  **/
  @javax.annotation.Nonnull
  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportTodayLiveRoomDataGetV10FiltersInner qianchuanReportTodayLiveRoomDataGetV10FiltersInner = (QianchuanReportTodayLiveRoomDataGetV10FiltersInner) o;
    return Objects.equals(this.field, qianchuanReportTodayLiveRoomDataGetV10FiltersInner.field) &&
        Objects.equals(this.operator, qianchuanReportTodayLiveRoomDataGetV10FiltersInner.operator) &&
        Objects.equals(this.values, qianchuanReportTodayLiveRoomDataGetV10FiltersInner.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportTodayLiveRoomDataGetV10FiltersInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("operator");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("values");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportTodayLiveRoomDataGetV10FiltersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportTodayLiveRoomDataGetV10FiltersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportTodayLiveRoomDataGetV10FiltersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportTodayLiveRoomDataGetV10FiltersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportTodayLiveRoomDataGetV10FiltersInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportTodayLiveRoomDataGetV10FiltersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportTodayLiveRoomDataGetV10FiltersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportTodayLiveRoomDataGetV10FiltersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportTodayLiveRoomDataGetV10FiltersInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportTodayLiveRoomDataGetV10FiltersInner
  */
  public static QianchuanReportTodayLiveRoomDataGetV10FiltersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportTodayLiveRoomDataGetV10FiltersInner.class);
  }

 /**
  * Convert an instance of QianchuanReportTodayLiveRoomDataGetV10FiltersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

