/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult {
  public static final String SERIALIZED_NAME_BID_INCR_ESTIMATE = "bid_incr_estimate";
  @SerializedName(SERIALIZED_NAME_BID_INCR_ESTIMATE)
  private List<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner> bidIncrEstimate = null;

  public static final String SERIALIZED_NAME_POTENTIAL_AD_LEVEL = "potential_ad_level";
  @SerializedName(SERIALIZED_NAME_POTENTIAL_AD_LEVEL)
  private Long potentialAdLevel = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult bidIncrEstimate(List<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner> bidIncrEstimate) {
    
    this.bidIncrEstimate = bidIncrEstimate;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult addBidIncrEstimateItem(ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner bidIncrEstimateItem) {
    if (this.bidIncrEstimate == null) {
      this.bidIncrEstimate = new ArrayList<>();
    }
    this.bidIncrEstimate.add(bidIncrEstimateItem);
    return this;
  }

   /**
   * 
   * @return bidIncrEstimate
  **/
  @javax.annotation.Nullable
  public List<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner> getBidIncrEstimate() {
    return bidIncrEstimate;
  }


  public void setBidIncrEstimate(List<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner> bidIncrEstimate) {
    this.bidIncrEstimate = bidIncrEstimate;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult potentialAdLevel(Long potentialAdLevel) {
    
    this.potentialAdLevel = potentialAdLevel;
    return this;
  }

   /**
   * 
   * @return potentialAdLevel
  **/
  @javax.annotation.Nullable
  public Long getPotentialAdLevel() {
    return potentialAdLevel;
  }


  public void setPotentialAdLevel(Long potentialAdLevel) {
    this.potentialAdLevel = potentialAdLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult toolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult) o;
    return Objects.equals(this.bidIncrEstimate, toolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult.bidIncrEstimate) &&
        Objects.equals(this.potentialAdLevel, toolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult.potentialAdLevel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidIncrEstimate, potentialAdLevel);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult {\n");
    sb.append("    bidIncrEstimate: ").append(toIndentedString(bidIncrEstimate)).append("\n");
    sb.append("    potentialAdLevel: ").append(toIndentedString(potentialAdLevel)).append("\n");
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
    openapiFields.add("bid_incr_estimate");
    openapiFields.add("potential_ad_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

