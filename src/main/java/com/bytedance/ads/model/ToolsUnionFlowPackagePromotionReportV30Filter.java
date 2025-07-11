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
import com.bytedance.ads.model.ToolsUnionFlowPackagePromotionReportV30FilterLandingType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsUnionFlowPackagePromotionReportV30Filter {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_HIGH_COST = "high_cost";
  @SerializedName(SERIALIZED_NAME_HIGH_COST)
  private String highCost = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private ToolsUnionFlowPackagePromotionReportV30FilterLandingType landingType = null;

  public static final String SERIALIZED_NAME_LOW_COST = "low_cost";
  @SerializedName(SERIALIZED_NAME_LOW_COST)
  private String lowCost = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public static final String SERIALIZED_NAME_RITS = "rits";
  @SerializedName(SERIALIZED_NAME_RITS)
  private List<Long> rits = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public ToolsUnionFlowPackagePromotionReportV30Filter() {
  }

  public ToolsUnionFlowPackagePromotionReportV30Filter endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间，格式为\&quot;yyyy-mm-dd\&quot; 默认昨天，即不指定起止时间获取最近7天数据
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsUnionFlowPackagePromotionReportV30Filter highCost(String highCost) {
    
    this.highCost = highCost;
    return this;
  }

   /**
   * 消耗金额上限，单位元
   * @return highCost
  **/
  @javax.annotation.Nullable
  public String getHighCost() {
    return highCost;
  }


  public void setHighCost(String highCost) {
    this.highCost = highCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30Filter landingType(ToolsUnionFlowPackagePromotionReportV30FilterLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public ToolsUnionFlowPackagePromotionReportV30FilterLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(ToolsUnionFlowPackagePromotionReportV30FilterLandingType landingType) {
    this.landingType = landingType;
  }


  public ToolsUnionFlowPackagePromotionReportV30Filter lowCost(String lowCost) {
    
    this.lowCost = lowCost;
    return this;
  }

   /**
   * 消耗金额下限，单位元
   * @return lowCost
  **/
  @javax.annotation.Nullable
  public String getLowCost() {
    return lowCost;
  }


  public void setLowCost(String lowCost) {
    this.lowCost = lowCost;
  }


  public ToolsUnionFlowPackagePromotionReportV30Filter promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public ToolsUnionFlowPackagePromotionReportV30Filter addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 广告 id 列表，最大数量限制：1000
   * @return promotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<Long> promotionIds) {
    this.promotionIds = promotionIds;
  }


  public ToolsUnionFlowPackagePromotionReportV30Filter rits(List<Long> rits) {
    
    this.rits = rits;
    return this;
  }

  public ToolsUnionFlowPackagePromotionReportV30Filter addRitsItem(Long ritsItem) {
    if (this.rits == null) {
      this.rits = new ArrayList<>();
    }
    this.rits.add(ritsItem);
    return this;
  }

   /**
   * 广告位列表，最大数量限制：1000
   * @return rits
  **/
  @javax.annotation.Nullable
  public List<Long> getRits() {
    return rits;
  }


  public void setRits(List<Long> rits) {
    this.rits = rits;
  }


  public ToolsUnionFlowPackagePromotionReportV30Filter startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间，格式为\&quot;yyyy-mm-dd\&quot; 限制范围100天内 默认7天前（不包括当天），即不指定起止时间获取最近7天数据
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsUnionFlowPackagePromotionReportV30Filter toolsUnionFlowPackagePromotionReportV30Filter = (ToolsUnionFlowPackagePromotionReportV30Filter) o;
    return Objects.equals(this.endTime, toolsUnionFlowPackagePromotionReportV30Filter.endTime) &&
        Objects.equals(this.highCost, toolsUnionFlowPackagePromotionReportV30Filter.highCost) &&
        Objects.equals(this.landingType, toolsUnionFlowPackagePromotionReportV30Filter.landingType) &&
        Objects.equals(this.lowCost, toolsUnionFlowPackagePromotionReportV30Filter.lowCost) &&
        Objects.equals(this.promotionIds, toolsUnionFlowPackagePromotionReportV30Filter.promotionIds) &&
        Objects.equals(this.rits, toolsUnionFlowPackagePromotionReportV30Filter.rits) &&
        Objects.equals(this.startTime, toolsUnionFlowPackagePromotionReportV30Filter.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, highCost, landingType, lowCost, promotionIds, rits, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsUnionFlowPackagePromotionReportV30Filter {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    highCost: ").append(toIndentedString(highCost)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    lowCost: ").append(toIndentedString(lowCost)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    rits: ").append(toIndentedString(rits)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("high_cost");
    openapiFields.add("landing_type");
    openapiFields.add("low_cost");
    openapiFields.add("promotion_ids");
    openapiFields.add("rits");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsUnionFlowPackagePromotionReportV30Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsUnionFlowPackagePromotionReportV30Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsUnionFlowPackagePromotionReportV30Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsUnionFlowPackagePromotionReportV30Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsUnionFlowPackagePromotionReportV30Filter>() {
           @Override
           public void write(JsonWriter out, ToolsUnionFlowPackagePromotionReportV30Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsUnionFlowPackagePromotionReportV30Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsUnionFlowPackagePromotionReportV30Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsUnionFlowPackagePromotionReportV30Filter
  * @throws IOException if the JSON string is invalid with respect to ToolsUnionFlowPackagePromotionReportV30Filter
  */
  public static ToolsUnionFlowPackagePromotionReportV30Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsUnionFlowPackagePromotionReportV30Filter.class);
  }

 /**
  * Convert an instance of ToolsUnionFlowPackagePromotionReportV30Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

