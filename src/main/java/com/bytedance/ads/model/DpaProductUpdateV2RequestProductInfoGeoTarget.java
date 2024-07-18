/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class DpaProductUpdateV2RequestProductInfoGeoTarget {
  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude = null;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude = null;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private Integer range = null;

  public DpaProductUpdateV2RequestProductInfoGeoTarget() {
  }

  public DpaProductUpdateV2RequestProductInfoGeoTarget latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 
   * @return latitude
  **/
  @javax.annotation.Nullable
  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public DpaProductUpdateV2RequestProductInfoGeoTarget longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 
   * @return longitude
  **/
  @javax.annotation.Nullable
  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public DpaProductUpdateV2RequestProductInfoGeoTarget range(Integer range) {
    
    this.range = range;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return range
  **/
  @javax.annotation.Nullable
  public Integer getRange() {
    return range;
  }


  public void setRange(Integer range) {
    this.range = range;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductUpdateV2RequestProductInfoGeoTarget dpaProductUpdateV2RequestProductInfoGeoTarget = (DpaProductUpdateV2RequestProductInfoGeoTarget) o;
    return Objects.equals(this.latitude, dpaProductUpdateV2RequestProductInfoGeoTarget.latitude) &&
        Objects.equals(this.longitude, dpaProductUpdateV2RequestProductInfoGeoTarget.longitude) &&
        Objects.equals(this.range, dpaProductUpdateV2RequestProductInfoGeoTarget.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductUpdateV2RequestProductInfoGeoTarget {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("range");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductUpdateV2RequestProductInfoGeoTarget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductUpdateV2RequestProductInfoGeoTarget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductUpdateV2RequestProductInfoGeoTarget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductUpdateV2RequestProductInfoGeoTarget.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductUpdateV2RequestProductInfoGeoTarget>() {
           @Override
           public void write(JsonWriter out, DpaProductUpdateV2RequestProductInfoGeoTarget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductUpdateV2RequestProductInfoGeoTarget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductUpdateV2RequestProductInfoGeoTarget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductUpdateV2RequestProductInfoGeoTarget
  * @throws IOException if the JSON string is invalid with respect to DpaProductUpdateV2RequestProductInfoGeoTarget
  */
  public static DpaProductUpdateV2RequestProductInfoGeoTarget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductUpdateV2RequestProductInfoGeoTarget.class);
  }

 /**
  * Convert an instance of DpaProductUpdateV2RequestProductInfoGeoTarget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

