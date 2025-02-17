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
import com.bytedance.ads.model.StarReportDataTopicConfigV2DataStatMetricsType;
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
 * StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private StarReportDataTopicConfigV2DataStatMetricsType type = null;

  public StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner() {
  }

  public StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 指标描述
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * 指标字段，仅包含英文与下划线等符号
   * @return field
  **/
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 指标名称，中文或英文描述字段名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner type(StarReportDataTopicConfigV2DataStatMetricsType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public StarReportDataTopicConfigV2DataStatMetricsType getType() {
    return type;
  }


  public void setType(StarReportDataTopicConfigV2DataStatMetricsType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner starReportDataTopicConfigV2ResponseDataStatInnerMetricsInner = (StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner) o;
    return Objects.equals(this.description, starReportDataTopicConfigV2ResponseDataStatInnerMetricsInner.description) &&
        Objects.equals(this.field, starReportDataTopicConfigV2ResponseDataStatInnerMetricsInner.field) &&
        Objects.equals(this.name, starReportDataTopicConfigV2ResponseDataStatInnerMetricsInner.name) &&
        Objects.equals(this.type, starReportDataTopicConfigV2ResponseDataStatInnerMetricsInner.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, field, name, type);
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
    sb.append("class StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner>() {
           @Override
           public void write(JsonWriter out, StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner
  * @throws IOException if the JSON string is invalid with respect to StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner
  */
  public static StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner.class);
  }

 /**
  * Convert an instance of StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

