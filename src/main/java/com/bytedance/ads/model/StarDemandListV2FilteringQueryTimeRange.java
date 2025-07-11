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
 * 查询时间范围内创建的任务。 筛选时间时，开始时间必须与结束时间同时传入，开始时间必须小于等于结束时间。 若缺省默认查询全时间范围任务，若出现超时等情况请缩小查询时间范围。
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarDemandListV2FilteringQueryTimeRange {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public StarDemandListV2FilteringQueryTimeRange() {
  }

  public StarDemandListV2FilteringQueryTimeRange endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 查询时间范围的终止时间。格式yyyy-MM-dd HH:mm:ss，如 2024-08-07 01:01:01
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public StarDemandListV2FilteringQueryTimeRange startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 查询时间范围的起始时间。 格式yyyy-MM-dd HH:mm:ss，如 2024-08-01 01:01:01
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandListV2FilteringQueryTimeRange starDemandListV2FilteringQueryTimeRange = (StarDemandListV2FilteringQueryTimeRange) o;
    return Objects.equals(this.endTime, starDemandListV2FilteringQueryTimeRange.endTime) &&
        Objects.equals(this.startTime, starDemandListV2FilteringQueryTimeRange.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandListV2FilteringQueryTimeRange {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandListV2FilteringQueryTimeRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandListV2FilteringQueryTimeRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandListV2FilteringQueryTimeRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandListV2FilteringQueryTimeRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandListV2FilteringQueryTimeRange>() {
           @Override
           public void write(JsonWriter out, StarDemandListV2FilteringQueryTimeRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandListV2FilteringQueryTimeRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandListV2FilteringQueryTimeRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandListV2FilteringQueryTimeRange
  * @throws IOException if the JSON string is invalid with respect to StarDemandListV2FilteringQueryTimeRange
  */
  public static StarDemandListV2FilteringQueryTimeRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandListV2FilteringQueryTimeRange.class);
  }

 /**
  * Convert an instance of StarDemandListV2FilteringQueryTimeRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

