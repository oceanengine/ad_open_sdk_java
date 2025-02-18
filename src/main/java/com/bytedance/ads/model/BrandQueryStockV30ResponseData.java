/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandQueryStockV30ResponseDataDailyQuantityInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class BrandQueryStockV30ResponseData {
  public static final String SERIALIZED_NAME_DAILY_QUANTITY = "daily_quantity";
  @SerializedName(SERIALIZED_NAME_DAILY_QUANTITY)
  private List<BrandQueryStockV30ResponseDataDailyQuantityInner> dailyQuantity = null;

  public BrandQueryStockV30ResponseData() {
  }

  public BrandQueryStockV30ResponseData dailyQuantity(List<BrandQueryStockV30ResponseDataDailyQuantityInner> dailyQuantity) {
    
    this.dailyQuantity = dailyQuantity;
    return this;
  }

  public BrandQueryStockV30ResponseData addDailyQuantityItem(BrandQueryStockV30ResponseDataDailyQuantityInner dailyQuantityItem) {
    if (this.dailyQuantity == null) {
      this.dailyQuantity = new ArrayList<>();
    }
    this.dailyQuantity.add(dailyQuantityItem);
    return this;
  }

   /**
   * 可预定量
   * @return dailyQuantity
  **/
  @javax.annotation.Nullable
  public List<BrandQueryStockV30ResponseDataDailyQuantityInner> getDailyQuantity() {
    return dailyQuantity;
  }


  public void setDailyQuantity(List<BrandQueryStockV30ResponseDataDailyQuantityInner> dailyQuantity) {
    this.dailyQuantity = dailyQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandQueryStockV30ResponseData brandQueryStockV30ResponseData = (BrandQueryStockV30ResponseData) o;
    return Objects.equals(this.dailyQuantity, brandQueryStockV30ResponseData.dailyQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandQueryStockV30ResponseData {\n");
    sb.append("    dailyQuantity: ").append(toIndentedString(dailyQuantity)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("daily_quantity");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandQueryStockV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandQueryStockV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandQueryStockV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandQueryStockV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandQueryStockV30ResponseData>() {
           @Override
           public void write(JsonWriter out, BrandQueryStockV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandQueryStockV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandQueryStockV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandQueryStockV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to BrandQueryStockV30ResponseData
  */
  public static BrandQueryStockV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandQueryStockV30ResponseData.class);
  }

 /**
  * Convert an instance of BrandQueryStockV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

