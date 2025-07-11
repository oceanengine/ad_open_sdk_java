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
import com.bytedance.ads.model.BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType;
import com.bytedance.ads.model.BrandOrderUpdateV30RequestBookingQuantityInfoDailyQuantityInner;
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
 * 预订量
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandOrderUpdateV30RequestBookingQuantityInfo {
  public static final String SERIALIZED_NAME_DAILY_QUANTITY = "daily_quantity";
  @SerializedName(SERIALIZED_NAME_DAILY_QUANTITY)
  private List<BrandOrderUpdateV30RequestBookingQuantityInfoDailyQuantityInner> dailyQuantity = null;

  public static final String SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE = "stock_increase_package_type";
  @SerializedName(SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE)
  private BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType stockIncreasePackageType = null;

  public BrandOrderUpdateV30RequestBookingQuantityInfo() {
  }

  public BrandOrderUpdateV30RequestBookingQuantityInfo dailyQuantity(List<BrandOrderUpdateV30RequestBookingQuantityInfoDailyQuantityInner> dailyQuantity) {
    
    this.dailyQuantity = dailyQuantity;
    return this;
  }

  public BrandOrderUpdateV30RequestBookingQuantityInfo addDailyQuantityItem(BrandOrderUpdateV30RequestBookingQuantityInfoDailyQuantityInner dailyQuantityItem) {
    if (this.dailyQuantity == null) {
      this.dailyQuantity = new ArrayList<>();
    }
    this.dailyQuantity.add(dailyQuantityItem);
    return this;
  }

   /**
   * 预订日期及预订量
   * @return dailyQuantity
  **/
  @javax.annotation.Nullable
  public List<BrandOrderUpdateV30RequestBookingQuantityInfoDailyQuantityInner> getDailyQuantity() {
    return dailyQuantity;
  }


  public void setDailyQuantity(List<BrandOrderUpdateV30RequestBookingQuantityInfoDailyQuantityInner> dailyQuantity) {
    this.dailyQuantity = dailyQuantity;
  }


  public BrandOrderUpdateV30RequestBookingQuantityInfo stockIncreasePackageType(BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType stockIncreasePackageType) {
    
    this.stockIncreasePackageType = stockIncreasePackageType;
    return this;
  }

   /**
   * Get stockIncreasePackageType
   * @return stockIncreasePackageType
  **/
  @javax.annotation.Nullable
  public BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType getStockIncreasePackageType() {
    return stockIncreasePackageType;
  }


  public void setStockIncreasePackageType(BrandOrderUpdateV30BookingQuantityInfoStockIncreasePackageType stockIncreasePackageType) {
    this.stockIncreasePackageType = stockIncreasePackageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderUpdateV30RequestBookingQuantityInfo brandOrderUpdateV30RequestBookingQuantityInfo = (BrandOrderUpdateV30RequestBookingQuantityInfo) o;
    return Objects.equals(this.dailyQuantity, brandOrderUpdateV30RequestBookingQuantityInfo.dailyQuantity) &&
        Objects.equals(this.stockIncreasePackageType, brandOrderUpdateV30RequestBookingQuantityInfo.stockIncreasePackageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyQuantity, stockIncreasePackageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandOrderUpdateV30RequestBookingQuantityInfo {\n");
    sb.append("    dailyQuantity: ").append(toIndentedString(dailyQuantity)).append("\n");
    sb.append("    stockIncreasePackageType: ").append(toIndentedString(stockIncreasePackageType)).append("\n");
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
    openapiFields.add("daily_quantity");
    openapiFields.add("stock_increase_package_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderUpdateV30RequestBookingQuantityInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderUpdateV30RequestBookingQuantityInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderUpdateV30RequestBookingQuantityInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderUpdateV30RequestBookingQuantityInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderUpdateV30RequestBookingQuantityInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderUpdateV30RequestBookingQuantityInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderUpdateV30RequestBookingQuantityInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderUpdateV30RequestBookingQuantityInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderUpdateV30RequestBookingQuantityInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderUpdateV30RequestBookingQuantityInfo
  */
  public static BrandOrderUpdateV30RequestBookingQuantityInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderUpdateV30RequestBookingQuantityInfo.class);
  }

 /**
  * Convert an instance of BrandOrderUpdateV30RequestBookingQuantityInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

