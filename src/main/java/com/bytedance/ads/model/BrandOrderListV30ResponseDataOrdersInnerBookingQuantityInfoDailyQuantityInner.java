/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private List<String> period = null;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity = null;

  public BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner() {
  }

  public BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 预定日期
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner period(List<String> period) {
    
    this.period = period;
    return this;
  }

  public BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner addPeriodItem(String periodItem) {
    if (this.period == null) {
      this.period = new ArrayList<>();
    }
    this.period.add(periodItem);
    return this;
  }

   /**
   * 分时段
   * @return period
  **/
  @javax.annotation.Nullable
  public List<String> getPeriod() {
    return period;
  }


  public void setPeriod(List<String> period) {
    this.period = period;
  }


  public BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 预定量
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner brandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner = (BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner) o;
    return Objects.equals(this.date, brandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner.date) &&
        Objects.equals(this.period, brandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner.period) &&
        Objects.equals(this.quantity, brandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner.quantity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period, quantity);
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
    sb.append("class BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner>() {
           @Override
           public void write(JsonWriter out, BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner
  * @throws IOException if the JSON string is invalid with respect to BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner
  */
  public static BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner.class);
  }

 /**
  * Convert an instance of BrandOrderListV30ResponseDataOrdersInnerBookingQuantityInfoDailyQuantityInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

