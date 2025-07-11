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
import com.bytedance.ads.model.BrandOrderCreateV30BookingQuantityInfoStockIncreasePackageType;
import com.bytedance.ads.model.BrandOrderCreateV30RequestBookingQuantityInfoDailyQuantityInner;
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
public class BrandOrderCreateV30RequestBookingQuantityInfo {
  public static final String SERIALIZED_NAME_DAILY_QUANTITY = "daily_quantity";
  @SerializedName(SERIALIZED_NAME_DAILY_QUANTITY)
  private List<BrandOrderCreateV30RequestBookingQuantityInfoDailyQuantityInner> dailyQuantity = null;

  public static final String SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE = "stock_increase_package_type";
  @SerializedName(SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE)
  private BrandOrderCreateV30BookingQuantityInfoStockIncreasePackageType stockIncreasePackageType = null;

  public BrandOrderCreateV30RequestBookingQuantityInfo() {
  }

  public BrandOrderCreateV30RequestBookingQuantityInfo dailyQuantity(List<BrandOrderCreateV30RequestBookingQuantityInfoDailyQuantityInner> dailyQuantity) {
    
    this.dailyQuantity = dailyQuantity;
    return this;
  }

  public BrandOrderCreateV30RequestBookingQuantityInfo addDailyQuantityItem(BrandOrderCreateV30RequestBookingQuantityInfoDailyQuantityInner dailyQuantityItem) {
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
  @javax.annotation.Nonnull
  public List<BrandOrderCreateV30RequestBookingQuantityInfoDailyQuantityInner> getDailyQuantity() {
    return dailyQuantity;
  }


  public void setDailyQuantity(List<BrandOrderCreateV30RequestBookingQuantityInfoDailyQuantityInner> dailyQuantity) {
    this.dailyQuantity = dailyQuantity;
  }


  public BrandOrderCreateV30RequestBookingQuantityInfo stockIncreasePackageType(BrandOrderCreateV30BookingQuantityInfoStockIncreasePackageType stockIncreasePackageType) {
    
    this.stockIncreasePackageType = stockIncreasePackageType;
    return this;
  }

   /**
   * Get stockIncreasePackageType
   * @return stockIncreasePackageType
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30BookingQuantityInfoStockIncreasePackageType getStockIncreasePackageType() {
    return stockIncreasePackageType;
  }


  public void setStockIncreasePackageType(BrandOrderCreateV30BookingQuantityInfoStockIncreasePackageType stockIncreasePackageType) {
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
    BrandOrderCreateV30RequestBookingQuantityInfo brandOrderCreateV30RequestBookingQuantityInfo = (BrandOrderCreateV30RequestBookingQuantityInfo) o;
    return Objects.equals(this.dailyQuantity, brandOrderCreateV30RequestBookingQuantityInfo.dailyQuantity) &&
        Objects.equals(this.stockIncreasePackageType, brandOrderCreateV30RequestBookingQuantityInfo.stockIncreasePackageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyQuantity, stockIncreasePackageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandOrderCreateV30RequestBookingQuantityInfo {\n");
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
    openapiRequiredFields.add("daily_quantity");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderCreateV30RequestBookingQuantityInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderCreateV30RequestBookingQuantityInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderCreateV30RequestBookingQuantityInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderCreateV30RequestBookingQuantityInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderCreateV30RequestBookingQuantityInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderCreateV30RequestBookingQuantityInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderCreateV30RequestBookingQuantityInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderCreateV30RequestBookingQuantityInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderCreateV30RequestBookingQuantityInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderCreateV30RequestBookingQuantityInfo
  */
  public static BrandOrderCreateV30RequestBookingQuantityInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderCreateV30RequestBookingQuantityInfo.class);
  }

 /**
  * Convert an instance of BrandOrderCreateV30RequestBookingQuantityInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

