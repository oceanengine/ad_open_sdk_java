/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
 * BrandQueryStockV30ScheduleInfoScheduleListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class BrandQueryStockV30ScheduleInfoScheduleListInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private List<String> period = null;

  public BrandQueryStockV30ScheduleInfoScheduleListInner() {
  }

  public BrandQueryStockV30ScheduleInfoScheduleListInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  @javax.annotation.Nonnull
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public BrandQueryStockV30ScheduleInfoScheduleListInner period(List<String> period) {
    
    this.period = period;
    return this;
  }

  public BrandQueryStockV30ScheduleInfoScheduleListInner addPeriodItem(String periodItem) {
    if (this.period == null) {
      this.period = new ArrayList<>();
    }
    this.period.add(periodItem);
    return this;
  }

   /**
   * 时段
   * @return period
  **/
  @javax.annotation.Nullable
  public List<String> getPeriod() {
    return period;
  }


  public void setPeriod(List<String> period) {
    this.period = period;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandQueryStockV30ScheduleInfoScheduleListInner brandQueryStockV30ScheduleInfoScheduleListInner = (BrandQueryStockV30ScheduleInfoScheduleListInner) o;
    return Objects.equals(this.date, brandQueryStockV30ScheduleInfoScheduleListInner.date) &&
        Objects.equals(this.period, brandQueryStockV30ScheduleInfoScheduleListInner.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandQueryStockV30ScheduleInfoScheduleListInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandQueryStockV30ScheduleInfoScheduleListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandQueryStockV30ScheduleInfoScheduleListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandQueryStockV30ScheduleInfoScheduleListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandQueryStockV30ScheduleInfoScheduleListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandQueryStockV30ScheduleInfoScheduleListInner>() {
           @Override
           public void write(JsonWriter out, BrandQueryStockV30ScheduleInfoScheduleListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandQueryStockV30ScheduleInfoScheduleListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandQueryStockV30ScheduleInfoScheduleListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandQueryStockV30ScheduleInfoScheduleListInner
  * @throws IOException if the JSON string is invalid with respect to BrandQueryStockV30ScheduleInfoScheduleListInner
  */
  public static BrandQueryStockV30ScheduleInfoScheduleListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandQueryStockV30ScheduleInfoScheduleListInner.class);
  }

 /**
  * Convert an instance of BrandQueryStockV30ScheduleInfoScheduleListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

