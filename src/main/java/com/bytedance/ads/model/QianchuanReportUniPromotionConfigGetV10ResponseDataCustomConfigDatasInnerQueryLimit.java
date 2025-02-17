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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit {
  public static final String SERIALIZED_NAME_EARLIEST_DAY = "earliest_day";
  @SerializedName(SERIALIZED_NAME_EARLIEST_DAY)
  private String earliestDay = null;

  public static final String SERIALIZED_NAME_MAX_DAY = "max_day";
  @SerializedName(SERIALIZED_NAME_MAX_DAY)
  private String maxDay = null;

  public static final String SERIALIZED_NAME_MAX_DAY_BY_DAY = "max_day_by_day";
  @SerializedName(SERIALIZED_NAME_MAX_DAY_BY_DAY)
  private String maxDayByDay = null;

  public static final String SERIALIZED_NAME_MAX_DAY_BY_HOUR = "max_day_by_hour";
  @SerializedName(SERIALIZED_NAME_MAX_DAY_BY_HOUR)
  private String maxDayByHour = null;

  public static final String SERIALIZED_NAME_MAX_DIMENSION_LIMIT = "max_dimension_limit";
  @SerializedName(SERIALIZED_NAME_MAX_DIMENSION_LIMIT)
  private String maxDimensionLimit = null;

  public QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit() {
  }

  public QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit earliestDay(String earliestDay) {
    
    this.earliestDay = earliestDay;
    return this;
  }

   /**
   * 
   * @return earliestDay
  **/
  @javax.annotation.Nullable
  public String getEarliestDay() {
    return earliestDay;
  }


  public void setEarliestDay(String earliestDay) {
    this.earliestDay = earliestDay;
  }


  public QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit maxDay(String maxDay) {
    
    this.maxDay = maxDay;
    return this;
  }

   /**
   * 
   * @return maxDay
  **/
  @javax.annotation.Nullable
  public String getMaxDay() {
    return maxDay;
  }


  public void setMaxDay(String maxDay) {
    this.maxDay = maxDay;
  }


  public QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit maxDayByDay(String maxDayByDay) {
    
    this.maxDayByDay = maxDayByDay;
    return this;
  }

   /**
   * 
   * @return maxDayByDay
  **/
  @javax.annotation.Nullable
  public String getMaxDayByDay() {
    return maxDayByDay;
  }


  public void setMaxDayByDay(String maxDayByDay) {
    this.maxDayByDay = maxDayByDay;
  }


  public QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit maxDayByHour(String maxDayByHour) {
    
    this.maxDayByHour = maxDayByHour;
    return this;
  }

   /**
   * 
   * @return maxDayByHour
  **/
  @javax.annotation.Nullable
  public String getMaxDayByHour() {
    return maxDayByHour;
  }


  public void setMaxDayByHour(String maxDayByHour) {
    this.maxDayByHour = maxDayByHour;
  }


  public QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit maxDimensionLimit(String maxDimensionLimit) {
    
    this.maxDimensionLimit = maxDimensionLimit;
    return this;
  }

   /**
   * 
   * @return maxDimensionLimit
  **/
  @javax.annotation.Nullable
  public String getMaxDimensionLimit() {
    return maxDimensionLimit;
  }


  public void setMaxDimensionLimit(String maxDimensionLimit) {
    this.maxDimensionLimit = maxDimensionLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit qianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit = (QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit) o;
    return Objects.equals(this.earliestDay, qianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.earliestDay) &&
        Objects.equals(this.maxDay, qianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.maxDay) &&
        Objects.equals(this.maxDayByDay, qianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.maxDayByDay) &&
        Objects.equals(this.maxDayByHour, qianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.maxDayByHour) &&
        Objects.equals(this.maxDimensionLimit, qianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.maxDimensionLimit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(earliestDay, maxDay, maxDayByDay, maxDayByHour, maxDimensionLimit);
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
    sb.append("class QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit {\n");
    sb.append("    earliestDay: ").append(toIndentedString(earliestDay)).append("\n");
    sb.append("    maxDay: ").append(toIndentedString(maxDay)).append("\n");
    sb.append("    maxDayByDay: ").append(toIndentedString(maxDayByDay)).append("\n");
    sb.append("    maxDayByHour: ").append(toIndentedString(maxDayByHour)).append("\n");
    sb.append("    maxDimensionLimit: ").append(toIndentedString(maxDimensionLimit)).append("\n");
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
    openapiFields.add("earliest_day");
    openapiFields.add("max_day");
    openapiFields.add("max_day_by_day");
    openapiFields.add("max_day_by_hour");
    openapiFields.add("max_dimension_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit>() {
           @Override
           public void write(JsonWriter out, QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit
  */
  public static QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit.class);
  }

 /**
  * Convert an instance of QianchuanReportUniPromotionConfigGetV10ResponseDataCustomConfigDatasInnerQueryLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

