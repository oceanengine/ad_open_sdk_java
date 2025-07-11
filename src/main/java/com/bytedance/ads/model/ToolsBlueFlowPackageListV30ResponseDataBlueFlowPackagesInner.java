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
import com.bytedance.ads.model.ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner {
  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD = "blue_flow_keyword";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD)
  private List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner> blueFlowKeyword = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID = "blue_flow_package_id";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID)
  private Long blueFlowPackageId = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_NAME = "blue_flow_package_name";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_NAME)
  private String blueFlowPackageName = null;

  public static final String SERIALIZED_NAME_ESTIMATED_COST_RANGE = "estimated_cost_range";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_COST_RANGE)
  private List<Long> estimatedCostRange = null;

  public static final String SERIALIZED_NAME_ESTIMATED_REACH_TRAFFIC_RANGE = "estimated_reach_traffic_range";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_REACH_TRAFFIC_RANGE)
  private List<Long> estimatedReachTrafficRange = null;

  public static final String SERIALIZED_NAME_FLOW_COVERAGE_RATIO = "flow_coverage_ratio";
  @SerializedName(SERIALIZED_NAME_FLOW_COVERAGE_RATIO)
  private String flowCoverageRatio = null;

  public static final String SERIALIZED_NAME_SUGGESTED_BID_RANGE = "suggested_bid_range";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_BID_RANGE)
  private List<Long> suggestedBidRange = null;

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner() {
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner blueFlowKeyword(List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner> blueFlowKeyword) {
    
    this.blueFlowKeyword = blueFlowKeyword;
    return this;
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner addBlueFlowKeywordItem(ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner blueFlowKeywordItem) {
    if (this.blueFlowKeyword == null) {
      this.blueFlowKeyword = new ArrayList<>();
    }
    this.blueFlowKeyword.add(blueFlowKeywordItem);
    return this;
  }

   /**
   * 
   * @return blueFlowKeyword
  **/
  @javax.annotation.Nullable
  public List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner> getBlueFlowKeyword() {
    return blueFlowKeyword;
  }


  public void setBlueFlowKeyword(List<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInnerBlueFlowKeywordInner> blueFlowKeyword) {
    this.blueFlowKeyword = blueFlowKeyword;
  }


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner blueFlowPackageId(Long blueFlowPackageId) {
    
    this.blueFlowPackageId = blueFlowPackageId;
    return this;
  }

   /**
   * 
   * @return blueFlowPackageId
  **/
  @javax.annotation.Nullable
  public Long getBlueFlowPackageId() {
    return blueFlowPackageId;
  }


  public void setBlueFlowPackageId(Long blueFlowPackageId) {
    this.blueFlowPackageId = blueFlowPackageId;
  }


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner blueFlowPackageName(String blueFlowPackageName) {
    
    this.blueFlowPackageName = blueFlowPackageName;
    return this;
  }

   /**
   * 
   * @return blueFlowPackageName
  **/
  @javax.annotation.Nullable
  public String getBlueFlowPackageName() {
    return blueFlowPackageName;
  }


  public void setBlueFlowPackageName(String blueFlowPackageName) {
    this.blueFlowPackageName = blueFlowPackageName;
  }


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner estimatedCostRange(List<Long> estimatedCostRange) {
    
    this.estimatedCostRange = estimatedCostRange;
    return this;
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner addEstimatedCostRangeItem(Long estimatedCostRangeItem) {
    if (this.estimatedCostRange == null) {
      this.estimatedCostRange = new ArrayList<>();
    }
    this.estimatedCostRange.add(estimatedCostRangeItem);
    return this;
  }

   /**
   * 
   * @return estimatedCostRange
  **/
  @javax.annotation.Nullable
  public List<Long> getEstimatedCostRange() {
    return estimatedCostRange;
  }


  public void setEstimatedCostRange(List<Long> estimatedCostRange) {
    this.estimatedCostRange = estimatedCostRange;
  }


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner estimatedReachTrafficRange(List<Long> estimatedReachTrafficRange) {
    
    this.estimatedReachTrafficRange = estimatedReachTrafficRange;
    return this;
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner addEstimatedReachTrafficRangeItem(Long estimatedReachTrafficRangeItem) {
    if (this.estimatedReachTrafficRange == null) {
      this.estimatedReachTrafficRange = new ArrayList<>();
    }
    this.estimatedReachTrafficRange.add(estimatedReachTrafficRangeItem);
    return this;
  }

   /**
   * 
   * @return estimatedReachTrafficRange
  **/
  @javax.annotation.Nullable
  public List<Long> getEstimatedReachTrafficRange() {
    return estimatedReachTrafficRange;
  }


  public void setEstimatedReachTrafficRange(List<Long> estimatedReachTrafficRange) {
    this.estimatedReachTrafficRange = estimatedReachTrafficRange;
  }


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner flowCoverageRatio(String flowCoverageRatio) {
    
    this.flowCoverageRatio = flowCoverageRatio;
    return this;
  }

   /**
   * 
   * @return flowCoverageRatio
  **/
  @javax.annotation.Nullable
  public String getFlowCoverageRatio() {
    return flowCoverageRatio;
  }


  public void setFlowCoverageRatio(String flowCoverageRatio) {
    this.flowCoverageRatio = flowCoverageRatio;
  }


  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner suggestedBidRange(List<Long> suggestedBidRange) {
    
    this.suggestedBidRange = suggestedBidRange;
    return this;
  }

  public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner addSuggestedBidRangeItem(Long suggestedBidRangeItem) {
    if (this.suggestedBidRange == null) {
      this.suggestedBidRange = new ArrayList<>();
    }
    this.suggestedBidRange.add(suggestedBidRangeItem);
    return this;
  }

   /**
   * 
   * @return suggestedBidRange
  **/
  @javax.annotation.Nullable
  public List<Long> getSuggestedBidRange() {
    return suggestedBidRange;
  }


  public void setSuggestedBidRange(List<Long> suggestedBidRange) {
    this.suggestedBidRange = suggestedBidRange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner = (ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner) o;
    return Objects.equals(this.blueFlowKeyword, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.blueFlowKeyword) &&
        Objects.equals(this.blueFlowPackageId, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.blueFlowPackageId) &&
        Objects.equals(this.blueFlowPackageName, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.blueFlowPackageName) &&
        Objects.equals(this.estimatedCostRange, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.estimatedCostRange) &&
        Objects.equals(this.estimatedReachTrafficRange, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.estimatedReachTrafficRange) &&
        Objects.equals(this.flowCoverageRatio, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.flowCoverageRatio) &&
        Objects.equals(this.suggestedBidRange, toolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.suggestedBidRange);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowKeyword, blueFlowPackageId, blueFlowPackageName, estimatedCostRange, estimatedReachTrafficRange, flowCoverageRatio, suggestedBidRange);
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
    sb.append("class ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner {\n");
    sb.append("    blueFlowKeyword: ").append(toIndentedString(blueFlowKeyword)).append("\n");
    sb.append("    blueFlowPackageId: ").append(toIndentedString(blueFlowPackageId)).append("\n");
    sb.append("    blueFlowPackageName: ").append(toIndentedString(blueFlowPackageName)).append("\n");
    sb.append("    estimatedCostRange: ").append(toIndentedString(estimatedCostRange)).append("\n");
    sb.append("    estimatedReachTrafficRange: ").append(toIndentedString(estimatedReachTrafficRange)).append("\n");
    sb.append("    flowCoverageRatio: ").append(toIndentedString(flowCoverageRatio)).append("\n");
    sb.append("    suggestedBidRange: ").append(toIndentedString(suggestedBidRange)).append("\n");
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
    openapiFields.add("blue_flow_keyword");
    openapiFields.add("blue_flow_package_id");
    openapiFields.add("blue_flow_package_name");
    openapiFields.add("estimated_cost_range");
    openapiFields.add("estimated_reach_traffic_range");
    openapiFields.add("flow_coverage_ratio");
    openapiFields.add("suggested_bid_range");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner>() {
           @Override
           public void write(JsonWriter out, ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner
  */
  public static ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner.class);
  }

 /**
  * Convert an instance of ToolsBlueFlowPackageListV30ResponseDataBlueFlowPackagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

