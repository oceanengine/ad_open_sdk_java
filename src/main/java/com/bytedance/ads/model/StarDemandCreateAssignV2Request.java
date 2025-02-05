/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestDemandInfo;
import com.bytedance.ads.model.StarDemandCreateAssignV2RequestOrderItemInfo;
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
 * StarDemandCreateAssignV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarDemandCreateAssignV2Request {
  public static final String SERIALIZED_NAME_DEMAND_INFO = "demand_info";
  @SerializedName(SERIALIZED_NAME_DEMAND_INFO)
  private StarDemandCreateAssignV2RequestDemandInfo demandInfo = null;

  public static final String SERIALIZED_NAME_ORDER_ITEM_INFO = "order_item_info";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_INFO)
  private StarDemandCreateAssignV2RequestOrderItemInfo orderItemInfo = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarDemandCreateAssignV2Request() {
  }

  public StarDemandCreateAssignV2Request demandInfo(StarDemandCreateAssignV2RequestDemandInfo demandInfo) {
    
    this.demandInfo = demandInfo;
    return this;
  }

   /**
   * Get demandInfo
   * @return demandInfo
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestDemandInfo getDemandInfo() {
    return demandInfo;
  }


  public void setDemandInfo(StarDemandCreateAssignV2RequestDemandInfo demandInfo) {
    this.demandInfo = demandInfo;
  }


  public StarDemandCreateAssignV2Request orderItemInfo(StarDemandCreateAssignV2RequestOrderItemInfo orderItemInfo) {
    
    this.orderItemInfo = orderItemInfo;
    return this;
  }

   /**
   * Get orderItemInfo
   * @return orderItemInfo
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2RequestOrderItemInfo getOrderItemInfo() {
    return orderItemInfo;
  }


  public void setOrderItemInfo(StarDemandCreateAssignV2RequestOrderItemInfo orderItemInfo) {
    this.orderItemInfo = orderItemInfo;
  }


  public StarDemandCreateAssignV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 星图客户ID
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2Request starDemandCreateAssignV2Request = (StarDemandCreateAssignV2Request) o;
    return Objects.equals(this.demandInfo, starDemandCreateAssignV2Request.demandInfo) &&
        Objects.equals(this.orderItemInfo, starDemandCreateAssignV2Request.orderItemInfo) &&
        Objects.equals(this.starId, starDemandCreateAssignV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demandInfo, orderItemInfo, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateAssignV2Request {\n");
    sb.append("    demandInfo: ").append(toIndentedString(demandInfo)).append("\n");
    sb.append("    orderItemInfo: ").append(toIndentedString(orderItemInfo)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("demand_info");
    openapiFields.add("order_item_info");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demand_info");
    openapiRequiredFields.add("order_item_info");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2Request>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2Request
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2Request
  */
  public static StarDemandCreateAssignV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2Request.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

