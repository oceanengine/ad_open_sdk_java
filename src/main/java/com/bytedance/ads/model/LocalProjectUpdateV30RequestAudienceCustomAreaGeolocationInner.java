/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
 * LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner {
  public static final String SERIALIZED_NAME_AREA_RADIUS = "area_radius";
  @SerializedName(SERIALIZED_NAME_AREA_RADIUS)
  private Long areaRadius = null;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Double lat = null;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Double _long = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner() {
  }

  public LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner areaRadius(Long areaRadius) {
    
    this.areaRadius = areaRadius;
    return this;
  }

   /**
   * 
   * minimum: 500
   * maximum: 30000
   * @return areaRadius
  **/
  @javax.annotation.Nonnull
  public Long getAreaRadius() {
    return areaRadius;
  }


  public void setAreaRadius(Long areaRadius) {
    this.areaRadius = areaRadius;
  }


  public LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner lat(Double lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * 
   * @return lat
  **/
  @javax.annotation.Nonnull
  public Double getLat() {
    return lat;
  }


  public void setLat(Double lat) {
    this.lat = lat;
  }


  public LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner _long(Double _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * 
   * @return _long
  **/
  @javax.annotation.Nonnull
  public Double getLong() {
    return _long;
  }


  public void setLong(Double _long) {
    this._long = _long;
  }


  public LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner localProjectUpdateV30RequestAudienceCustomAreaGeolocationInner = (LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner) o;
    return Objects.equals(this.areaRadius, localProjectUpdateV30RequestAudienceCustomAreaGeolocationInner.areaRadius) &&
        Objects.equals(this.lat, localProjectUpdateV30RequestAudienceCustomAreaGeolocationInner.lat) &&
        Objects.equals(this._long, localProjectUpdateV30RequestAudienceCustomAreaGeolocationInner._long) &&
        Objects.equals(this.name, localProjectUpdateV30RequestAudienceCustomAreaGeolocationInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaRadius, lat, _long, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner {\n");
    sb.append("    areaRadius: ").append(toIndentedString(areaRadius)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("area_radius");
    openapiFields.add("lat");
    openapiFields.add("long");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("area_radius");
    openapiRequiredFields.add("lat");
    openapiRequiredFields.add("long");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner>() {
           @Override
           public void write(JsonWriter out, LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner
  * @throws IOException if the JSON string is invalid with respect to LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner
  */
  public static LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner.class);
  }

 /**
  * Convert an instance of LocalProjectUpdateV30RequestAudienceCustomAreaGeolocationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

