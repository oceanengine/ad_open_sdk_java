/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerAllFlowStatInfo;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerOrderInfo;
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
 * StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-19T10:55:13.584702527+08:00[PRC]")
public class StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner {
  public static final String SERIALIZED_NAME_ALL_FLOW_STAT_INFO = "all_flow_stat_info";
  @SerializedName(SERIALIZED_NAME_ALL_FLOW_STAT_INFO)
  private StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerAllFlowStatInfo allFlowStatInfo = null;

  public static final String SERIALIZED_NAME_BOOST_FLOW_STAT_INFO = "boost_flow_stat_info";
  @SerializedName(SERIALIZED_NAME_BOOST_FLOW_STAT_INFO)
  private StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo boostFlowStatInfo = null;

  public static final String SERIALIZED_NAME_ORDER_INFO = "order_info";
  @SerializedName(SERIALIZED_NAME_ORDER_INFO)
  private StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerOrderInfo orderInfo = null;

  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner() {
  }

  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner allFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerAllFlowStatInfo allFlowStatInfo) {
    
    this.allFlowStatInfo = allFlowStatInfo;
    return this;
  }

   /**
   * Get allFlowStatInfo
   * @return allFlowStatInfo
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerAllFlowStatInfo getAllFlowStatInfo() {
    return allFlowStatInfo;
  }


  public void setAllFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerAllFlowStatInfo allFlowStatInfo) {
    this.allFlowStatInfo = allFlowStatInfo;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner boostFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo boostFlowStatInfo) {
    
    this.boostFlowStatInfo = boostFlowStatInfo;
    return this;
  }

   /**
   * Get boostFlowStatInfo
   * @return boostFlowStatInfo
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo getBoostFlowStatInfo() {
    return boostFlowStatInfo;
  }


  public void setBoostFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo boostFlowStatInfo) {
    this.boostFlowStatInfo = boostFlowStatInfo;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner orderInfo(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerOrderInfo orderInfo) {
    
    this.orderInfo = orderInfo;
    return this;
  }

   /**
   * Get orderInfo
   * @return orderInfo
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerOrderInfo getOrderInfo() {
    return orderInfo;
  }


  public void setOrderInfo(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerOrderInfo orderInfo) {
    this.orderInfo = orderInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner = (StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner) o;
    return Objects.equals(this.allFlowStatInfo, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner.allFlowStatInfo) &&
        Objects.equals(this.boostFlowStatInfo, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner.boostFlowStatInfo) &&
        Objects.equals(this.orderInfo, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner.orderInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allFlowStatInfo, boostFlowStatInfo, orderInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner {\n");
    sb.append("    allFlowStatInfo: ").append(toIndentedString(allFlowStatInfo)).append("\n");
    sb.append("    boostFlowStatInfo: ").append(toIndentedString(boostFlowStatInfo)).append("\n");
    sb.append("    orderInfo: ").append(toIndentedString(orderInfo)).append("\n");
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
    openapiFields.add("all_flow_stat_info");
    openapiFields.add("boost_flow_stat_info");
    openapiFields.add("order_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("all_flow_stat_info");
    openapiRequiredFields.add("boost_flow_stat_info");
    openapiRequiredFields.add("order_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner>() {
           @Override
           public void write(JsonWriter out, StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner
  */
  public static StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner.class);
  }

 /**
  * Convert an instance of StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
