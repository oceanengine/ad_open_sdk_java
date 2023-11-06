/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaSearchDeliveryInfo;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaSearchStageInfo;
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
 * 搜索广告在投计划限额信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class QianchuanAdQuotaGetV10ResponseDataQuotaSearch {
  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private QianchuanAdQuotaGetV10ResponseDataQuotaSearchDeliveryInfo deliveryInfo = null;

  public static final String SERIALIZED_NAME_MONTH_COST = "month_cost";
  @SerializedName(SERIALIZED_NAME_MONTH_COST)
  private Double monthCost = null;

  public static final String SERIALIZED_NAME_QUOTA_GEAR = "quota_gear";
  @SerializedName(SERIALIZED_NAME_QUOTA_GEAR)
  private Long quotaGear = null;

  public static final String SERIALIZED_NAME_QUOTA_INFO = "quota_info";
  @SerializedName(SERIALIZED_NAME_QUOTA_INFO)
  private QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo quotaInfo = null;

  public static final String SERIALIZED_NAME_STAGE_INFO = "stage_info";
  @SerializedName(SERIALIZED_NAME_STAGE_INFO)
  private QianchuanAdQuotaGetV10ResponseDataQuotaSearchStageInfo stageInfo = null;

  public QianchuanAdQuotaGetV10ResponseDataQuotaSearch() {
  }

  public QianchuanAdQuotaGetV10ResponseDataQuotaSearch deliveryInfo(QianchuanAdQuotaGetV10ResponseDataQuotaSearchDeliveryInfo deliveryInfo) {
    
    this.deliveryInfo = deliveryInfo;
    return this;
  }

   /**
   * Get deliveryInfo
   * @return deliveryInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaSearchDeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }


  public void setDeliveryInfo(QianchuanAdQuotaGetV10ResponseDataQuotaSearchDeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaSearch monthCost(Double monthCost) {
    
    this.monthCost = monthCost;
    return this;
  }

   /**
   * 当前最高月消耗
   * @return monthCost
  **/
  @javax.annotation.Nullable
  public Double getMonthCost() {
    return monthCost;
  }


  public void setMonthCost(Double monthCost) {
    this.monthCost = monthCost;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaSearch quotaGear(Long quotaGear) {
    
    this.quotaGear = quotaGear;
    return this;
  }

   /**
   * 当前所在限额档位：1,2,3,4,5,6,7,8,9
   * @return quotaGear
  **/
  @javax.annotation.Nullable
  public Long getQuotaGear() {
    return quotaGear;
  }


  public void setQuotaGear(Long quotaGear) {
    this.quotaGear = quotaGear;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaSearch quotaInfo(QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo quotaInfo) {
    
    this.quotaInfo = quotaInfo;
    return this;
  }

   /**
   * Get quotaInfo
   * @return quotaInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo getQuotaInfo() {
    return quotaInfo;
  }


  public void setQuotaInfo(QianchuanAdQuotaGetV10ResponseDataQuotaSearchQuotaInfo quotaInfo) {
    this.quotaInfo = quotaInfo;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaSearch stageInfo(QianchuanAdQuotaGetV10ResponseDataQuotaSearchStageInfo stageInfo) {
    
    this.stageInfo = stageInfo;
    return this;
  }

   /**
   * Get stageInfo
   * @return stageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaSearchStageInfo getStageInfo() {
    return stageInfo;
  }


  public void setStageInfo(QianchuanAdQuotaGetV10ResponseDataQuotaSearchStageInfo stageInfo) {
    this.stageInfo = stageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdQuotaGetV10ResponseDataQuotaSearch qianchuanAdQuotaGetV10ResponseDataQuotaSearch = (QianchuanAdQuotaGetV10ResponseDataQuotaSearch) o;
    return Objects.equals(this.deliveryInfo, qianchuanAdQuotaGetV10ResponseDataQuotaSearch.deliveryInfo) &&
        Objects.equals(this.monthCost, qianchuanAdQuotaGetV10ResponseDataQuotaSearch.monthCost) &&
        Objects.equals(this.quotaGear, qianchuanAdQuotaGetV10ResponseDataQuotaSearch.quotaGear) &&
        Objects.equals(this.quotaInfo, qianchuanAdQuotaGetV10ResponseDataQuotaSearch.quotaInfo) &&
        Objects.equals(this.stageInfo, qianchuanAdQuotaGetV10ResponseDataQuotaSearch.stageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryInfo, monthCost, quotaGear, quotaInfo, stageInfo);
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
    sb.append("class QianchuanAdQuotaGetV10ResponseDataQuotaSearch {\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    monthCost: ").append(toIndentedString(monthCost)).append("\n");
    sb.append("    quotaGear: ").append(toIndentedString(quotaGear)).append("\n");
    sb.append("    quotaInfo: ").append(toIndentedString(quotaInfo)).append("\n");
    sb.append("    stageInfo: ").append(toIndentedString(stageInfo)).append("\n");
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
    openapiFields.add("delivery_info");
    openapiFields.add("month_cost");
    openapiFields.add("quota_gear");
    openapiFields.add("quota_info");
    openapiFields.add("stage_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdQuotaGetV10ResponseDataQuotaSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdQuotaGetV10ResponseDataQuotaSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdQuotaGetV10ResponseDataQuotaSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaSearch>() {
           @Override
           public void write(JsonWriter out, QianchuanAdQuotaGetV10ResponseDataQuotaSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdQuotaGetV10ResponseDataQuotaSearch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdQuotaGetV10ResponseDataQuotaSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdQuotaGetV10ResponseDataQuotaSearch
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdQuotaGetV10ResponseDataQuotaSearch
  */
  public static QianchuanAdQuotaGetV10ResponseDataQuotaSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdQuotaGetV10ResponseDataQuotaSearch.class);
  }

 /**
  * Convert an instance of QianchuanAdQuotaGetV10ResponseDataQuotaSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

