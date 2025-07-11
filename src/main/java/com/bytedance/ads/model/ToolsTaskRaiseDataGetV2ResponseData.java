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
import com.bytedance.ads.model.ToolsTaskRaiseDataGetV2ResponseDataClickCnt;
import com.bytedance.ads.model.ToolsTaskRaiseDataGetV2ResponseDataConvertCnt;
import com.bytedance.ads.model.ToolsTaskRaiseDataGetV2ResponseDataCost;
import com.bytedance.ads.model.ToolsTaskRaiseDataGetV2ResponseDataShowCnt;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsTaskRaiseDataGetV2ResponseData {
  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private ToolsTaskRaiseDataGetV2ResponseDataClickCnt clickCnt = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private ToolsTaskRaiseDataGetV2ResponseDataConvertCnt convertCnt = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private ToolsTaskRaiseDataGetV2ResponseDataCost cost = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private ToolsTaskRaiseDataGetV2ResponseDataShowCnt showCnt = null;

  public ToolsTaskRaiseDataGetV2ResponseData() {
  }

  public ToolsTaskRaiseDataGetV2ResponseData clickCnt(ToolsTaskRaiseDataGetV2ResponseDataClickCnt clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * Get clickCnt
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseDataGetV2ResponseDataClickCnt getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(ToolsTaskRaiseDataGetV2ResponseDataClickCnt clickCnt) {
    this.clickCnt = clickCnt;
  }


  public ToolsTaskRaiseDataGetV2ResponseData convertCnt(ToolsTaskRaiseDataGetV2ResponseDataConvertCnt convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * Get convertCnt
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseDataGetV2ResponseDataConvertCnt getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(ToolsTaskRaiseDataGetV2ResponseDataConvertCnt convertCnt) {
    this.convertCnt = convertCnt;
  }


  public ToolsTaskRaiseDataGetV2ResponseData cost(ToolsTaskRaiseDataGetV2ResponseDataCost cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseDataGetV2ResponseDataCost getCost() {
    return cost;
  }


  public void setCost(ToolsTaskRaiseDataGetV2ResponseDataCost cost) {
    this.cost = cost;
  }


  public ToolsTaskRaiseDataGetV2ResponseData showCnt(ToolsTaskRaiseDataGetV2ResponseDataShowCnt showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * Get showCnt
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseDataGetV2ResponseDataShowCnt getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(ToolsTaskRaiseDataGetV2ResponseDataShowCnt showCnt) {
    this.showCnt = showCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsTaskRaiseDataGetV2ResponseData toolsTaskRaiseDataGetV2ResponseData = (ToolsTaskRaiseDataGetV2ResponseData) o;
    return Objects.equals(this.clickCnt, toolsTaskRaiseDataGetV2ResponseData.clickCnt) &&
        Objects.equals(this.convertCnt, toolsTaskRaiseDataGetV2ResponseData.convertCnt) &&
        Objects.equals(this.cost, toolsTaskRaiseDataGetV2ResponseData.cost) &&
        Objects.equals(this.showCnt, toolsTaskRaiseDataGetV2ResponseData.showCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCnt, convertCnt, cost, showCnt);
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
    sb.append("class ToolsTaskRaiseDataGetV2ResponseData {\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
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
    openapiFields.add("convert_cnt");
    openapiFields.add("cost");
    openapiFields.add("show_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsTaskRaiseDataGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsTaskRaiseDataGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsTaskRaiseDataGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsTaskRaiseDataGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsTaskRaiseDataGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsTaskRaiseDataGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsTaskRaiseDataGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsTaskRaiseDataGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsTaskRaiseDataGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsTaskRaiseDataGetV2ResponseData
  */
  public static ToolsTaskRaiseDataGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsTaskRaiseDataGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsTaskRaiseDataGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

