/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
 * ReportCustomGetV30FiltersInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ReportCustomGetV30FiltersInner {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private Long operator = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Long type = null;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;

  public ReportCustomGetV30FiltersInner() {
  }

  public ReportCustomGetV30FiltersInner field(String field) {
    
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


  public ReportCustomGetV30FiltersInner operator(Long operator) {
    
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


  public ReportCustomGetV30FiltersInner type(Long type) {
    
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


  public ReportCustomGetV30FiltersInner values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public ReportCustomGetV30FiltersInner addValuesItem(String valuesItem) {
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
  @javax.annotation.Nullable
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
    ReportCustomGetV30FiltersInner reportCustomGetV30FiltersInner = (ReportCustomGetV30FiltersInner) o;
    return Objects.equals(this.field, reportCustomGetV30FiltersInner.field) &&
        Objects.equals(this.operator, reportCustomGetV30FiltersInner.operator) &&
        Objects.equals(this.type, reportCustomGetV30FiltersInner.type) &&
        Objects.equals(this.values, reportCustomGetV30FiltersInner.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, type, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCustomGetV30FiltersInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("values");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomGetV30FiltersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomGetV30FiltersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomGetV30FiltersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomGetV30FiltersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomGetV30FiltersInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomGetV30FiltersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomGetV30FiltersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomGetV30FiltersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomGetV30FiltersInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomGetV30FiltersInner
  */
  public static ReportCustomGetV30FiltersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomGetV30FiltersInner.class);
  }

 /**
  * Convert an instance of ReportCustomGetV30FiltersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

