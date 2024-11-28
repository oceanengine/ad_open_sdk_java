/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat {
  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private Long convertCnt = null;

  public static final String SERIALIZED_NAME_CONVERT_TYPE = "convert_type";
  @SerializedName(SERIALIZED_NAME_CONVERT_TYPE)
  private Long convertType = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_CVR = "cvr";
  @SerializedName(SERIALIZED_NAME_CVR)
  private Double cvr = null;

  public static final String SERIALIZED_NAME_PVR = "pvr";
  @SerializedName(SERIALIZED_NAME_PVR)
  private Double pvr = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat() {
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * 组件点击量
   * @return click
  **/
  @javax.annotation.Nullable
  public Long getClick() {
    return click;
  }


  public void setClick(Long click) {
    this.click = click;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat convertCnt(Long convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * 转化量
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public Long getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(Long convertCnt) {
    this.convertCnt = convertCnt;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat convertType(Long convertType) {
    
    this.convertType = convertType;
    return this;
  }

   /**
   * 转化目标
   * @return convertType
  **/
  @javax.annotation.Nullable
  public Long getConvertType() {
    return convertType;
  }


  public void setConvertType(Long convertType) {
    this.convertType = convertType;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 点击率
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat cvr(Double cvr) {
    
    this.cvr = cvr;
    return this;
  }

   /**
   * 转化率
   * @return cvr
  **/
  @javax.annotation.Nullable
  public Double getCvr() {
    return cvr;
  }


  public void setCvr(Double cvr) {
    this.cvr = cvr;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat pvr(Double pvr) {
    
    this.pvr = pvr;
    return this;
  }

   /**
   * 展现转化率
   * @return pvr
  **/
  @javax.annotation.Nullable
  public Double getPvr() {
    return pvr;
  }


  public void setPvr(Double pvr) {
    this.pvr = pvr;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 组件曝光
   * @return show
  **/
  @javax.annotation.Nullable
  public Long getShow() {
    return show;
  }


  public void setShow(Long show) {
    this.show = show;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat = (StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat) o;
    return Objects.equals(this.click, starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.click) &&
        Objects.equals(this.convertCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.convertCnt) &&
        Objects.equals(this.convertType, starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.convertType) &&
        Objects.equals(this.ctr, starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.ctr) &&
        Objects.equals(this.cvr, starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.cvr) &&
        Objects.equals(this.pvr, starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.pvr) &&
        Objects.equals(this.show, starReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.show);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(click, convertCnt, convertType, ctr, cvr, pvr, show);
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
    sb.append("class StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat {\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    convertType: ").append(toIndentedString(convertType)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    cvr: ").append(toIndentedString(cvr)).append("\n");
    sb.append("    pvr: ").append(toIndentedString(pvr)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
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
    openapiFields.add("click");
    openapiFields.add("convert_cnt");
    openapiFields.add("convert_type");
    openapiFields.add("ctr");
    openapiFields.add("cvr");
    openapiFields.add("pvr");
    openapiFields.add("show");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat
  */
  public static StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerConvertStat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

