/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
 * AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner {
  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Double lat = null;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Double _long = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RADIUS = "radius";
  @SerializedName(SERIALIZED_NAME_RADIUS)
  private Long radius = null;

  public AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner() {
  }

  public AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner lat(Double lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * 纬度
   * @return lat
  **/
  @javax.annotation.Nullable
  public Double getLat() {
    return lat;
  }


  public void setLat(Double lat) {
    this.lat = lat;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner _long(Double _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * 经度
   * @return _long
  **/
  @javax.annotation.Nullable
  public Double getLong() {
    return _long;
  }


  public void setLong(Double _long) {
    this._long = _long;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 地点名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner radius(Long radius) {
    
    this.radius = radius;
    return this;
  }

   /**
   * 半径，单位为m，允许值为：3000-15000m
   * @return radius
  **/
  @javax.annotation.Nullable
  public Long getRadius() {
    return radius;
  }


  public void setRadius(Long radius) {
    this.radius = radius;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner adlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner = (AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner) o;
    return Objects.equals(this.lat, adlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner.lat) &&
        Objects.equals(this._long, adlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner._long) &&
        Objects.equals(this.name, adlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner.name) &&
        Objects.equals(this.radius, adlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, _long, name, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner {\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
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
    openapiFields.add("lat");
    openapiFields.add("long");
    openapiFields.add("name");
    openapiFields.add("radius");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner
  */
  public static AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateV30RequestAdInfoAudienceGeolocationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

