/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandQueryStockV30ScheduleInfoScheduleListInner;
import com.bytedance.ads.model.BrandQueryStockV30ScheduleInfoStockIncreasePackageType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class BrandQueryStockV30ScheduleInfo {
  public static final String SERIALIZED_NAME_SCHEDULE_LIST = "schedule_list";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_LIST)
  private List<BrandQueryStockV30ScheduleInfoScheduleListInner> scheduleList = null;

  public static final String SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE = "stock_increase_package_type";
  @SerializedName(SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE)
  private BrandQueryStockV30ScheduleInfoStockIncreasePackageType stockIncreasePackageType = null;

  public BrandQueryStockV30ScheduleInfo() {
  }

  public BrandQueryStockV30ScheduleInfo scheduleList(List<BrandQueryStockV30ScheduleInfoScheduleListInner> scheduleList) {
    
    this.scheduleList = scheduleList;
    return this;
  }

  public BrandQueryStockV30ScheduleInfo addScheduleListItem(BrandQueryStockV30ScheduleInfoScheduleListInner scheduleListItem) {
    if (this.scheduleList == null) {
      this.scheduleList = new ArrayList<>();
    }
    this.scheduleList.add(scheduleListItem);
    return this;
  }

   /**
   * 需要查询的日期列表
   * @return scheduleList
  **/
  @javax.annotation.Nonnull
  public List<BrandQueryStockV30ScheduleInfoScheduleListInner> getScheduleList() {
    return scheduleList;
  }


  public void setScheduleList(List<BrandQueryStockV30ScheduleInfoScheduleListInner> scheduleList) {
    this.scheduleList = scheduleList;
  }


  public BrandQueryStockV30ScheduleInfo stockIncreasePackageType(BrandQueryStockV30ScheduleInfoStockIncreasePackageType stockIncreasePackageType) {
    
    this.stockIncreasePackageType = stockIncreasePackageType;
    return this;
  }

   /**
   * Get stockIncreasePackageType
   * @return stockIncreasePackageType
  **/
  @javax.annotation.Nullable
  public BrandQueryStockV30ScheduleInfoStockIncreasePackageType getStockIncreasePackageType() {
    return stockIncreasePackageType;
  }


  public void setStockIncreasePackageType(BrandQueryStockV30ScheduleInfoStockIncreasePackageType stockIncreasePackageType) {
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
    BrandQueryStockV30ScheduleInfo brandQueryStockV30ScheduleInfo = (BrandQueryStockV30ScheduleInfo) o;
    return Objects.equals(this.scheduleList, brandQueryStockV30ScheduleInfo.scheduleList) &&
        Objects.equals(this.stockIncreasePackageType, brandQueryStockV30ScheduleInfo.stockIncreasePackageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleList, stockIncreasePackageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandQueryStockV30ScheduleInfo {\n");
    sb.append("    scheduleList: ").append(toIndentedString(scheduleList)).append("\n");
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
    openapiFields.add("schedule_list");
    openapiFields.add("stock_increase_package_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schedule_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandQueryStockV30ScheduleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandQueryStockV30ScheduleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandQueryStockV30ScheduleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandQueryStockV30ScheduleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandQueryStockV30ScheduleInfo>() {
           @Override
           public void write(JsonWriter out, BrandQueryStockV30ScheduleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandQueryStockV30ScheduleInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandQueryStockV30ScheduleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandQueryStockV30ScheduleInfo
  * @throws IOException if the JSON string is invalid with respect to BrandQueryStockV30ScheduleInfo
  */
  public static BrandQueryStockV30ScheduleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandQueryStockV30ScheduleInfo.class);
  }

 /**
  * Convert an instance of BrandQueryStockV30ScheduleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

