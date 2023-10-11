/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class DouplusOrderReportV30StatTime {
  public static final String SERIALIZED_NAME_BEGIN_TIME = "begin_time";
  @SerializedName(SERIALIZED_NAME_BEGIN_TIME)
  private String beginTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public DouplusOrderReportV30StatTime() {
  }

  public DouplusOrderReportV30StatTime beginTime(String beginTime) {
    
    this.beginTime = beginTime;
    return this;
  }

   /**
   * 
   * @return beginTime
  **/
  @javax.annotation.Nullable
  public String getBeginTime() {
    return beginTime;
  }


  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }


  public DouplusOrderReportV30StatTime endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderReportV30StatTime douplusOrderReportV30StatTime = (DouplusOrderReportV30StatTime) o;
    return Objects.equals(this.beginTime, douplusOrderReportV30StatTime.beginTime) &&
        Objects.equals(this.endTime, douplusOrderReportV30StatTime.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderReportV30StatTime {\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
    openapiFields.add("begin_time");
    openapiFields.add("end_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderReportV30StatTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderReportV30StatTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderReportV30StatTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderReportV30StatTime.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderReportV30StatTime>() {
           @Override
           public void write(JsonWriter out, DouplusOrderReportV30StatTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderReportV30StatTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderReportV30StatTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderReportV30StatTime
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderReportV30StatTime
  */
  public static DouplusOrderReportV30StatTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderReportV30StatTime.class);
  }

 /**
  * Convert an instance of DouplusOrderReportV30StatTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

