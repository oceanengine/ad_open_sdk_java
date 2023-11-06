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
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCtrVariation;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCvrVariation;
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
 * 该实验对象详细数据
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics {
  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private String clickCnt = null;

  public static final String SERIALIZED_NAME_COMPOSITE_PROB = "composite_prob";
  @SerializedName(SERIALIZED_NAME_COMPOSITE_PROB)
  private String compositeProb = null;

  public static final String SERIALIZED_NAME_CONVERSION_COST = "conversion_cost";
  @SerializedName(SERIALIZED_NAME_CONVERSION_COST)
  private String conversionCost = null;

  public static final String SERIALIZED_NAME_CONVERSION_COST_PROB = "conversion_cost_prob";
  @SerializedName(SERIALIZED_NAME_CONVERSION_COST_PROB)
  private String conversionCostProb = null;

  public static final String SERIALIZED_NAME_CONVERSION_COST_VARIATION = "conversion_cost_variation";
  @SerializedName(SERIALIZED_NAME_CONVERSION_COST_VARIATION)
  private ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation conversionCostVariation = null;

  public static final String SERIALIZED_NAME_CONVERSION_RATE = "conversion_rate";
  @SerializedName(SERIALIZED_NAME_CONVERSION_RATE)
  private String conversionRate = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private String convertCnt = null;

  public static final String SERIALIZED_NAME_CPC_PLATFORM = "cpc_platform";
  @SerializedName(SERIALIZED_NAME_CPC_PLATFORM)
  private String cpcPlatform = null;

  public static final String SERIALIZED_NAME_CPM_PLATFORM = "cpm_platform";
  @SerializedName(SERIALIZED_NAME_CPM_PLATFORM)
  private String cpmPlatform = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private String ctr = null;

  public static final String SERIALIZED_NAME_CTR_PROB = "ctr_prob";
  @SerializedName(SERIALIZED_NAME_CTR_PROB)
  private String ctrProb = null;

  public static final String SERIALIZED_NAME_CTR_VARIATION = "ctr_variation";
  @SerializedName(SERIALIZED_NAME_CTR_VARIATION)
  private ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCtrVariation ctrVariation = null;

  public static final String SERIALIZED_NAME_CVR_PROB = "cvr_prob";
  @SerializedName(SERIALIZED_NAME_CVR_PROB)
  private String cvrProb = null;

  public static final String SERIALIZED_NAME_CVR_VARIATION = "cvr_variation";
  @SerializedName(SERIALIZED_NAME_CVR_VARIATION)
  private ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCvrVariation cvrVariation = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private String showCnt = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private String statCost = null;

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics() {
  }

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics clickCnt(String clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 点击数
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public String getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(String clickCnt) {
    this.clickCnt = clickCnt;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics compositeProb(String compositeProb) {
    
    this.compositeProb = compositeProb;
    return this;
  }

   /**
   * 综合指标获胜概率
   * @return compositeProb
  **/
  @javax.annotation.Nullable
  public String getCompositeProb() {
    return compositeProb;
  }


  public void setCompositeProb(String compositeProb) {
    this.compositeProb = compositeProb;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics conversionCost(String conversionCost) {
    
    this.conversionCost = conversionCost;
    return this;
  }

   /**
   * 转化成本
   * @return conversionCost
  **/
  @javax.annotation.Nullable
  public String getConversionCost() {
    return conversionCost;
  }


  public void setConversionCost(String conversionCost) {
    this.conversionCost = conversionCost;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics conversionCostProb(String conversionCostProb) {
    
    this.conversionCostProb = conversionCostProb;
    return this;
  }

   /**
   * 转化成本获胜概率
   * @return conversionCostProb
  **/
  @javax.annotation.Nullable
  public String getConversionCostProb() {
    return conversionCostProb;
  }


  public void setConversionCostProb(String conversionCostProb) {
    this.conversionCostProb = conversionCostProb;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics conversionCostVariation(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation conversionCostVariation) {
    
    this.conversionCostVariation = conversionCostVariation;
    return this;
  }

   /**
   * Get conversionCostVariation
   * @return conversionCostVariation
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation getConversionCostVariation() {
    return conversionCostVariation;
  }


  public void setConversionCostVariation(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsConversionCostVariation conversionCostVariation) {
    this.conversionCostVariation = conversionCostVariation;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics conversionRate(String conversionRate) {
    
    this.conversionRate = conversionRate;
    return this;
  }

   /**
   * 转化率
   * @return conversionRate
  **/
  @javax.annotation.Nullable
  public String getConversionRate() {
    return conversionRate;
  }


  public void setConversionRate(String conversionRate) {
    this.conversionRate = conversionRate;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics convertCnt(String convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * 转化数
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public String getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(String convertCnt) {
    this.convertCnt = convertCnt;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics cpcPlatform(String cpcPlatform) {
    
    this.cpcPlatform = cpcPlatform;
    return this;
  }

   /**
   * 平均点击单价
   * @return cpcPlatform
  **/
  @javax.annotation.Nullable
  public String getCpcPlatform() {
    return cpcPlatform;
  }


  public void setCpcPlatform(String cpcPlatform) {
    this.cpcPlatform = cpcPlatform;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics cpmPlatform(String cpmPlatform) {
    
    this.cpmPlatform = cpmPlatform;
    return this;
  }

   /**
   * 平均前次展现费用
   * @return cpmPlatform
  **/
  @javax.annotation.Nullable
  public String getCpmPlatform() {
    return cpmPlatform;
  }


  public void setCpmPlatform(String cpmPlatform) {
    this.cpmPlatform = cpmPlatform;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics ctr(String ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 点击率
   * @return ctr
  **/
  @javax.annotation.Nullable
  public String getCtr() {
    return ctr;
  }


  public void setCtr(String ctr) {
    this.ctr = ctr;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics ctrProb(String ctrProb) {
    
    this.ctrProb = ctrProb;
    return this;
  }

   /**
   * ctr获胜概率
   * @return ctrProb
  **/
  @javax.annotation.Nullable
  public String getCtrProb() {
    return ctrProb;
  }


  public void setCtrProb(String ctrProb) {
    this.ctrProb = ctrProb;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics ctrVariation(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCtrVariation ctrVariation) {
    
    this.ctrVariation = ctrVariation;
    return this;
  }

   /**
   * Get ctrVariation
   * @return ctrVariation
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCtrVariation getCtrVariation() {
    return ctrVariation;
  }


  public void setCtrVariation(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCtrVariation ctrVariation) {
    this.ctrVariation = ctrVariation;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics cvrProb(String cvrProb) {
    
    this.cvrProb = cvrProb;
    return this;
  }

   /**
   * cvr获胜概率
   * @return cvrProb
  **/
  @javax.annotation.Nullable
  public String getCvrProb() {
    return cvrProb;
  }


  public void setCvrProb(String cvrProb) {
    this.cvrProb = cvrProb;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics cvrVariation(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCvrVariation cvrVariation) {
    
    this.cvrVariation = cvrVariation;
    return this;
  }

   /**
   * Get cvrVariation
   * @return cvrVariation
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCvrVariation getCvrVariation() {
    return cvrVariation;
  }


  public void setCvrVariation(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInnerMetricsCvrVariation cvrVariation) {
    this.cvrVariation = cvrVariation;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics showCnt(String showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 展示数
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public String getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(String showCnt) {
    this.showCnt = showCnt;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics statCost(String statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 消耗
   * @return statCost
  **/
  @javax.annotation.Nullable
  public String getStatCost() {
    return statCost;
  }


  public void setStatCost(String statCost) {
    this.statCost = statCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics = (ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics) o;
    return Objects.equals(this.clickCnt, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.clickCnt) &&
        Objects.equals(this.compositeProb, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.compositeProb) &&
        Objects.equals(this.conversionCost, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.conversionCost) &&
        Objects.equals(this.conversionCostProb, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.conversionCostProb) &&
        Objects.equals(this.conversionCostVariation, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.conversionCostVariation) &&
        Objects.equals(this.conversionRate, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.conversionRate) &&
        Objects.equals(this.convertCnt, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.convertCnt) &&
        Objects.equals(this.cpcPlatform, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.cpcPlatform) &&
        Objects.equals(this.cpmPlatform, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.cpmPlatform) &&
        Objects.equals(this.ctr, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.ctr) &&
        Objects.equals(this.ctrProb, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.ctrProb) &&
        Objects.equals(this.ctrVariation, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.ctrVariation) &&
        Objects.equals(this.cvrProb, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.cvrProb) &&
        Objects.equals(this.cvrVariation, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.cvrVariation) &&
        Objects.equals(this.showCnt, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.showCnt) &&
        Objects.equals(this.statCost, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.statCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCnt, compositeProb, conversionCost, conversionCostProb, conversionCostVariation, conversionRate, convertCnt, cpcPlatform, cpmPlatform, ctr, ctrProb, ctrVariation, cvrProb, cvrVariation, showCnt, statCost);
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
    sb.append("class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics {\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    compositeProb: ").append(toIndentedString(compositeProb)).append("\n");
    sb.append("    conversionCost: ").append(toIndentedString(conversionCost)).append("\n");
    sb.append("    conversionCostProb: ").append(toIndentedString(conversionCostProb)).append("\n");
    sb.append("    conversionCostVariation: ").append(toIndentedString(conversionCostVariation)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    cpcPlatform: ").append(toIndentedString(cpcPlatform)).append("\n");
    sb.append("    cpmPlatform: ").append(toIndentedString(cpmPlatform)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    ctrProb: ").append(toIndentedString(ctrProb)).append("\n");
    sb.append("    ctrVariation: ").append(toIndentedString(ctrVariation)).append("\n");
    sb.append("    cvrProb: ").append(toIndentedString(cvrProb)).append("\n");
    sb.append("    cvrVariation: ").append(toIndentedString(cvrVariation)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
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
    openapiFields.add("click_cnt");
    openapiFields.add("composite_prob");
    openapiFields.add("conversion_cost");
    openapiFields.add("conversion_cost_prob");
    openapiFields.add("conversion_cost_variation");
    openapiFields.add("conversion_rate");
    openapiFields.add("convert_cnt");
    openapiFields.add("cpc_platform");
    openapiFields.add("cpm_platform");
    openapiFields.add("ctr");
    openapiFields.add("ctr_prob");
    openapiFields.add("ctr_variation");
    openapiFields.add("cvr_prob");
    openapiFields.add("cvr_variation");
    openapiFields.add("show_cnt");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics
  */
  public static ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics.class);
  }

 /**
  * Convert an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

