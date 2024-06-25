/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner {
  public static final String SERIALIZED_NAME_ANDROID_CONVERT = "android_convert";
  @SerializedName(SERIALIZED_NAME_ANDROID_CONVERT)
  private Long androidConvert = null;

  public static final String SERIALIZED_NAME_ANDROID_CONVERT_UNIT_AMOUNT = "android_convert_unit_amount";
  @SerializedName(SERIALIZED_NAME_ANDROID_CONVERT_UNIT_AMOUNT)
  private Long androidConvertUnitAmount = null;

  public static final String SERIALIZED_NAME_ANDROID_COST = "android_cost";
  @SerializedName(SERIALIZED_NAME_ANDROID_COST)
  private Long androidCost = null;

  public static final String SERIALIZED_NAME_ANDROID_DEEP_CONVERT = "android_deep_convert";
  @SerializedName(SERIALIZED_NAME_ANDROID_DEEP_CONVERT)
  private Long androidDeepConvert = null;

  public static final String SERIALIZED_NAME_IOS_CONVERT = "ios_convert";
  @SerializedName(SERIALIZED_NAME_IOS_CONVERT)
  private Long iosConvert = null;

  public static final String SERIALIZED_NAME_IOS_CONVERT_UNIT_AMOUNT = "ios_convert_unit_amount";
  @SerializedName(SERIALIZED_NAME_IOS_CONVERT_UNIT_AMOUNT)
  private Long iosConvertUnitAmount = null;

  public static final String SERIALIZED_NAME_IOS_COST = "ios_cost";
  @SerializedName(SERIALIZED_NAME_IOS_COST)
  private Long iosCost = null;

  public static final String SERIALIZED_NAME_IOS_DEEP_CONVERT = "ios_deep_convert";
  @SerializedName(SERIALIZED_NAME_IOS_DEEP_CONVERT)
  private Long iosDeepConvert = null;

  public static final String SERIALIZED_NAME_STAT_DATE = "stat_date";
  @SerializedName(SERIALIZED_NAME_STAT_DATE)
  private String statDate = null;

  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner() {
  }

  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner androidConvert(Long androidConvert) {
    
    this.androidConvert = androidConvert;
    return this;
  }

   /**
   * 安卓转化数
   * @return androidConvert
  **/
  @javax.annotation.Nullable
  public Long getAndroidConvert() {
    return androidConvert;
  }


  public void setAndroidConvert(Long androidConvert) {
    this.androidConvert = androidConvert;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner androidConvertUnitAmount(Long androidConvertUnitAmount) {
    
    this.androidConvertUnitAmount = androidConvertUnitAmount;
    return this;
  }

   /**
   * 安卓最新出价，单位：元*1000，建议获取后除以1000展示为元单位
   * @return androidConvertUnitAmount
  **/
  @javax.annotation.Nullable
  public Long getAndroidConvertUnitAmount() {
    return androidConvertUnitAmount;
  }


  public void setAndroidConvertUnitAmount(Long androidConvertUnitAmount) {
    this.androidConvertUnitAmount = androidConvertUnitAmount;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner androidCost(Long androidCost) {
    
    this.androidCost = androidCost;
    return this;
  }

   /**
   * 安卓消耗，单位：元*100000，建议获取后除以100000展示为元单位
   * @return androidCost
  **/
  @javax.annotation.Nullable
  public Long getAndroidCost() {
    return androidCost;
  }


  public void setAndroidCost(Long androidCost) {
    this.androidCost = androidCost;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner androidDeepConvert(Long androidDeepConvert) {
    
    this.androidDeepConvert = androidDeepConvert;
    return this;
  }

   /**
   * 安卓深度转化数
   * @return androidDeepConvert
  **/
  @javax.annotation.Nullable
  public Long getAndroidDeepConvert() {
    return androidDeepConvert;
  }


  public void setAndroidDeepConvert(Long androidDeepConvert) {
    this.androidDeepConvert = androidDeepConvert;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner iosConvert(Long iosConvert) {
    
    this.iosConvert = iosConvert;
    return this;
  }

   /**
   * iOS转化数
   * @return iosConvert
  **/
  @javax.annotation.Nullable
  public Long getIosConvert() {
    return iosConvert;
  }


  public void setIosConvert(Long iosConvert) {
    this.iosConvert = iosConvert;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner iosConvertUnitAmount(Long iosConvertUnitAmount) {
    
    this.iosConvertUnitAmount = iosConvertUnitAmount;
    return this;
  }

   /**
   * iOS最新出价，单位：元*1000，建议获取后除以1000展示为元单位
   * @return iosConvertUnitAmount
  **/
  @javax.annotation.Nullable
  public Long getIosConvertUnitAmount() {
    return iosConvertUnitAmount;
  }


  public void setIosConvertUnitAmount(Long iosConvertUnitAmount) {
    this.iosConvertUnitAmount = iosConvertUnitAmount;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner iosCost(Long iosCost) {
    
    this.iosCost = iosCost;
    return this;
  }

   /**
   * iOS消耗，单位：元*100000，建议获取后除以100000展示为元单位
   * @return iosCost
  **/
  @javax.annotation.Nullable
  public Long getIosCost() {
    return iosCost;
  }


  public void setIosCost(Long iosCost) {
    this.iosCost = iosCost;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner iosDeepConvert(Long iosDeepConvert) {
    
    this.iosDeepConvert = iosDeepConvert;
    return this;
  }

   /**
   * iOS深度转化数
   * @return iosDeepConvert
  **/
  @javax.annotation.Nullable
  public Long getIosDeepConvert() {
    return iosDeepConvert;
  }


  public void setIosDeepConvert(Long iosDeepConvert) {
    this.iosDeepConvert = iosDeepConvert;
  }


  public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner statDate(String statDate) {
    
    this.statDate = statDate;
    return this;
  }

   /**
   * 数据日期，只和安卓/iOS消耗、转化数、深度转化数相关
   * @return statDate
  **/
  @javax.annotation.Nullable
  public String getStatDate() {
    return statDate;
  }


  public void setStatDate(String statDate) {
    this.statDate = statDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner starStarAdUniteTaskDetailV2ResponseDataStatInfoInner = (StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner) o;
    return Objects.equals(this.androidConvert, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.androidConvert) &&
        Objects.equals(this.androidConvertUnitAmount, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.androidConvertUnitAmount) &&
        Objects.equals(this.androidCost, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.androidCost) &&
        Objects.equals(this.androidDeepConvert, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.androidDeepConvert) &&
        Objects.equals(this.iosConvert, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.iosConvert) &&
        Objects.equals(this.iosConvertUnitAmount, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.iosConvertUnitAmount) &&
        Objects.equals(this.iosCost, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.iosCost) &&
        Objects.equals(this.iosDeepConvert, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.iosDeepConvert) &&
        Objects.equals(this.statDate, starStarAdUniteTaskDetailV2ResponseDataStatInfoInner.statDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidConvert, androidConvertUnitAmount, androidCost, androidDeepConvert, iosConvert, iosConvertUnitAmount, iosCost, iosDeepConvert, statDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner {\n");
    sb.append("    androidConvert: ").append(toIndentedString(androidConvert)).append("\n");
    sb.append("    androidConvertUnitAmount: ").append(toIndentedString(androidConvertUnitAmount)).append("\n");
    sb.append("    androidCost: ").append(toIndentedString(androidCost)).append("\n");
    sb.append("    androidDeepConvert: ").append(toIndentedString(androidDeepConvert)).append("\n");
    sb.append("    iosConvert: ").append(toIndentedString(iosConvert)).append("\n");
    sb.append("    iosConvertUnitAmount: ").append(toIndentedString(iosConvertUnitAmount)).append("\n");
    sb.append("    iosCost: ").append(toIndentedString(iosCost)).append("\n");
    sb.append("    iosDeepConvert: ").append(toIndentedString(iosDeepConvert)).append("\n");
    sb.append("    statDate: ").append(toIndentedString(statDate)).append("\n");
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
    openapiFields.add("android_convert");
    openapiFields.add("android_convert_unit_amount");
    openapiFields.add("android_cost");
    openapiFields.add("android_deep_convert");
    openapiFields.add("ios_convert");
    openapiFields.add("ios_convert_unit_amount");
    openapiFields.add("ios_cost");
    openapiFields.add("ios_deep_convert");
    openapiFields.add("stat_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("android_convert");
    openapiRequiredFields.add("android_convert_unit_amount");
    openapiRequiredFields.add("android_cost");
    openapiRequiredFields.add("android_deep_convert");
    openapiRequiredFields.add("ios_convert");
    openapiRequiredFields.add("ios_convert_unit_amount");
    openapiRequiredFields.add("ios_cost");
    openapiRequiredFields.add("ios_deep_convert");
    openapiRequiredFields.add("stat_date");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner>() {
           @Override
           public void write(JsonWriter out, StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner
  */
  public static StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner.class);
  }

 /**
  * Convert an instance of StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

