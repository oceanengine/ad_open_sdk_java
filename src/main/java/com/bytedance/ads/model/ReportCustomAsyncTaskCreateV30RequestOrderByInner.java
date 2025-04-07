/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportCustomAsyncTaskCreateV30OrderByType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ReportCustomAsyncTaskCreateV30RequestOrderByInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ReportCustomAsyncTaskCreateV30RequestOrderByInner {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ReportCustomAsyncTaskCreateV30OrderByType type = null;

  public ReportCustomAsyncTaskCreateV30RequestOrderByInner() {
  }

  public ReportCustomAsyncTaskCreateV30RequestOrderByInner field(String field) {
    
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


  public ReportCustomAsyncTaskCreateV30RequestOrderByInner type(ReportCustomAsyncTaskCreateV30OrderByType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ReportCustomAsyncTaskCreateV30OrderByType getType() {
    return type;
  }


  public void setType(ReportCustomAsyncTaskCreateV30OrderByType type) {
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
    ReportCustomAsyncTaskCreateV30RequestOrderByInner reportCustomAsyncTaskCreateV30RequestOrderByInner = (ReportCustomAsyncTaskCreateV30RequestOrderByInner) o;
    return Objects.equals(this.field, reportCustomAsyncTaskCreateV30RequestOrderByInner.field) &&
        Objects.equals(this.type, reportCustomAsyncTaskCreateV30RequestOrderByInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCustomAsyncTaskCreateV30RequestOrderByInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomAsyncTaskCreateV30RequestOrderByInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomAsyncTaskCreateV30RequestOrderByInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomAsyncTaskCreateV30RequestOrderByInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomAsyncTaskCreateV30RequestOrderByInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomAsyncTaskCreateV30RequestOrderByInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomAsyncTaskCreateV30RequestOrderByInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomAsyncTaskCreateV30RequestOrderByInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomAsyncTaskCreateV30RequestOrderByInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomAsyncTaskCreateV30RequestOrderByInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomAsyncTaskCreateV30RequestOrderByInner
  */
  public static ReportCustomAsyncTaskCreateV30RequestOrderByInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomAsyncTaskCreateV30RequestOrderByInner.class);
  }

 /**
  * Convert an instance of ReportCustomAsyncTaskCreateV30RequestOrderByInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

