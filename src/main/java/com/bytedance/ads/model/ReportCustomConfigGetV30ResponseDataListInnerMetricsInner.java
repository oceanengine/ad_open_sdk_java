/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * ReportCustomConfigGetV30ResponseDataListInnerMetricsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ReportCustomConfigGetV30ResponseDataListInnerMetricsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_EXCLUSION_DIMS = "exclusion_dims";
  @SerializedName(SERIALIZED_NAME_EXCLUSION_DIMS)
  private List<String> exclusionDims = null;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public ReportCustomConfigGetV30ResponseDataListInnerMetricsInner() {
  }

  public ReportCustomConfigGetV30ResponseDataListInnerMetricsInner description(String description) {
    
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


  public ReportCustomConfigGetV30ResponseDataListInnerMetricsInner exclusionDims(List<String> exclusionDims) {
    
    this.exclusionDims = exclusionDims;
    return this;
  }

  public ReportCustomConfigGetV30ResponseDataListInnerMetricsInner addExclusionDimsItem(String exclusionDimsItem) {
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


  public ReportCustomConfigGetV30ResponseDataListInnerMetricsInner field(String field) {
    
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


  public ReportCustomConfigGetV30ResponseDataListInnerMetricsInner name(String name) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomConfigGetV30ResponseDataListInnerMetricsInner reportCustomConfigGetV30ResponseDataListInnerMetricsInner = (ReportCustomConfigGetV30ResponseDataListInnerMetricsInner) o;
    return Objects.equals(this.description, reportCustomConfigGetV30ResponseDataListInnerMetricsInner.description) &&
        Objects.equals(this.exclusionDims, reportCustomConfigGetV30ResponseDataListInnerMetricsInner.exclusionDims) &&
        Objects.equals(this.field, reportCustomConfigGetV30ResponseDataListInnerMetricsInner.field) &&
        Objects.equals(this.name, reportCustomConfigGetV30ResponseDataListInnerMetricsInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, exclusionDims, field, name);
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
    sb.append("class ReportCustomConfigGetV30ResponseDataListInnerMetricsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exclusionDims: ").append(toIndentedString(exclusionDims)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomConfigGetV30ResponseDataListInnerMetricsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomConfigGetV30ResponseDataListInnerMetricsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerMetricsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomConfigGetV30ResponseDataListInnerMetricsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomConfigGetV30ResponseDataListInnerMetricsInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomConfigGetV30ResponseDataListInnerMetricsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomConfigGetV30ResponseDataListInnerMetricsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomConfigGetV30ResponseDataListInnerMetricsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomConfigGetV30ResponseDataListInnerMetricsInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomConfigGetV30ResponseDataListInnerMetricsInner
  */
  public static ReportCustomConfigGetV30ResponseDataListInnerMetricsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomConfigGetV30ResponseDataListInnerMetricsInner.class);
  }

 /**
  * Convert an instance of ReportCustomConfigGetV30ResponseDataListInnerMetricsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

