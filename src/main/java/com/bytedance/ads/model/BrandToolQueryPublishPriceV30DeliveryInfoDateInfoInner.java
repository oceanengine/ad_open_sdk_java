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
 * BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private List<String> period = null;

  public BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner() {
  }

  public BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 投放日期，格式：yyyy-MM-dd，例：2023-09-08
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner period(List<String> period) {
    
    this.period = period;
    return this;
  }

  public BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner addPeriodItem(String periodItem) {
    if (this.period == null) {
      this.period = new ArrayList<>();
    }
    this.period.add(periodItem);
    return this;
  }

   /**
   * 分时段信息，格式：[\&quot;09:00\&quot;,\&quot;24:00\&quot;]
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
    BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner brandToolQueryPublishPriceV30DeliveryInfoDateInfoInner = (BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner) o;
    return Objects.equals(this.date, brandToolQueryPublishPriceV30DeliveryInfoDateInfoInner.date) &&
        Objects.equals(this.period, brandToolQueryPublishPriceV30DeliveryInfoDateInfoInner.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, period);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner>() {
           @Override
           public void write(JsonWriter out, BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner
  * @throws IOException if the JSON string is invalid with respect to BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner
  */
  public static BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner.class);
  }

 /**
  * Convert an instance of BrandToolQueryPublishPriceV30DeliveryInfoDateInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

