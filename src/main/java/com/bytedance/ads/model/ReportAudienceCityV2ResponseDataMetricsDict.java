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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class ReportAudienceCityV2ResponseDataMetricsDict {
  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_FINISH = "download_finish";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_FINISH)
  private Long downloadFinish = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public ReportAudienceCityV2ResponseDataMetricsDict() {
  }

  public ReportAudienceCityV2ResponseDataMetricsDict click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * 
   * @return click
  **/
  @javax.annotation.Nullable
  public Long getClick() {
    return click;
  }


  public void setClick(Long click) {
    this.click = click;
  }


  public ReportAudienceCityV2ResponseDataMetricsDict convert(Long convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * 
   * @return convert
  **/
  @javax.annotation.Nullable
  public Long getConvert() {
    return convert;
  }


  public void setConvert(Long convert) {
    this.convert = convert;
  }


  public ReportAudienceCityV2ResponseDataMetricsDict cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public ReportAudienceCityV2ResponseDataMetricsDict downloadFinish(Long downloadFinish) {
    
    this.downloadFinish = downloadFinish;
    return this;
  }

   /**
   * 
   * @return downloadFinish
  **/
  @javax.annotation.Nullable
  public Long getDownloadFinish() {
    return downloadFinish;
  }


  public void setDownloadFinish(Long downloadFinish) {
    this.downloadFinish = downloadFinish;
  }


  public ReportAudienceCityV2ResponseDataMetricsDict show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 
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
    ReportAudienceCityV2ResponseDataMetricsDict reportAudienceCityV2ResponseDataMetricsDict = (ReportAudienceCityV2ResponseDataMetricsDict) o;
    return Objects.equals(this.click, reportAudienceCityV2ResponseDataMetricsDict.click) &&
        Objects.equals(this.convert, reportAudienceCityV2ResponseDataMetricsDict.convert) &&
        Objects.equals(this.cost, reportAudienceCityV2ResponseDataMetricsDict.cost) &&
        Objects.equals(this.downloadFinish, reportAudienceCityV2ResponseDataMetricsDict.downloadFinish) &&
        Objects.equals(this.show, reportAudienceCityV2ResponseDataMetricsDict.show);
  }

  @Override
  public int hashCode() {
    return Objects.hash(click, convert, cost, downloadFinish, show);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAudienceCityV2ResponseDataMetricsDict {\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    downloadFinish: ").append(toIndentedString(downloadFinish)).append("\n");
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
    openapiFields.add("convert");
    openapiFields.add("cost");
    openapiFields.add("download_finish");
    openapiFields.add("show");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAudienceCityV2ResponseDataMetricsDict.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAudienceCityV2ResponseDataMetricsDict' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAudienceCityV2ResponseDataMetricsDict> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAudienceCityV2ResponseDataMetricsDict.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAudienceCityV2ResponseDataMetricsDict>() {
           @Override
           public void write(JsonWriter out, ReportAudienceCityV2ResponseDataMetricsDict value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAudienceCityV2ResponseDataMetricsDict read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAudienceCityV2ResponseDataMetricsDict given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAudienceCityV2ResponseDataMetricsDict
  * @throws IOException if the JSON string is invalid with respect to ReportAudienceCityV2ResponseDataMetricsDict
  */
  public static ReportAudienceCityV2ResponseDataMetricsDict fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAudienceCityV2ResponseDataMetricsDict.class);
  }

 /**
  * Convert an instance of ReportAudienceCityV2ResponseDataMetricsDict to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

