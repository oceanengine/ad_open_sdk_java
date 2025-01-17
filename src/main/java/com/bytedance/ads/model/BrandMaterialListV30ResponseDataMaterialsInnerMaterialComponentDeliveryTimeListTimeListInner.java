/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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
 * BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
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
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner) o;
    return Objects.equals(this.endTime, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner.endTime) &&
        Objects.equals(this.startTime, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("start_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentDeliveryTimeListTimeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

