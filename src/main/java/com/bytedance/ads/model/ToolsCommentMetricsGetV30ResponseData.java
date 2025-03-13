/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsCommentMetricsGetV30ResponseData {
  public static final String SERIALIZED_NAME_NEGATIVE_COUNT = "negative_count";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_COUNT)
  private Long negativeCount = null;

  public static final String SERIALIZED_NAME_NEGATIVE_RATE = "negative_rate";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_RATE)
  private Double negativeRate = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount = null;

  public ToolsCommentMetricsGetV30ResponseData() {
  }

  public ToolsCommentMetricsGetV30ResponseData negativeCount(Long negativeCount) {
    
    this.negativeCount = negativeCount;
    return this;
  }

   /**
   * 
   * @return negativeCount
  **/
  @javax.annotation.Nullable
  public Long getNegativeCount() {
    return negativeCount;
  }


  public void setNegativeCount(Long negativeCount) {
    this.negativeCount = negativeCount;
  }


  public ToolsCommentMetricsGetV30ResponseData negativeRate(Double negativeRate) {
    
    this.negativeRate = negativeRate;
    return this;
  }

   /**
   * 
   * @return negativeRate
  **/
  @javax.annotation.Nullable
  public Double getNegativeRate() {
    return negativeRate;
  }


  public void setNegativeRate(Double negativeRate) {
    this.negativeRate = negativeRate;
  }


  public ToolsCommentMetricsGetV30ResponseData totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentMetricsGetV30ResponseData toolsCommentMetricsGetV30ResponseData = (ToolsCommentMetricsGetV30ResponseData) o;
    return Objects.equals(this.negativeCount, toolsCommentMetricsGetV30ResponseData.negativeCount) &&
        Objects.equals(this.negativeRate, toolsCommentMetricsGetV30ResponseData.negativeRate) &&
        Objects.equals(this.totalCount, toolsCommentMetricsGetV30ResponseData.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(negativeCount, negativeRate, totalCount);
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
    sb.append("class ToolsCommentMetricsGetV30ResponseData {\n");
    sb.append("    negativeCount: ").append(toIndentedString(negativeCount)).append("\n");
    sb.append("    negativeRate: ").append(toIndentedString(negativeRate)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("negative_count");
    openapiFields.add("negative_rate");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentMetricsGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentMetricsGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentMetricsGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentMetricsGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentMetricsGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsCommentMetricsGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentMetricsGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentMetricsGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentMetricsGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentMetricsGetV30ResponseData
  */
  public static ToolsCommentMetricsGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentMetricsGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsCommentMetricsGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

