/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * LocalProjectDetailV30ResponseDataAudienceCustomAreaInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class LocalProjectDetailV30ResponseDataAudienceCustomAreaInner {
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

  public LocalProjectDetailV30ResponseDataAudienceCustomAreaInner() {
  }

  public LocalProjectDetailV30ResponseDataAudienceCustomAreaInner areaRadius(Long areaRadius) {
    
    this.areaRadius = areaRadius;
    return this;
  }

   /**
   * 自定义区域半径，单位为m
   * @return areaRadius
  **/
  @javax.annotation.Nullable
  public Long getAreaRadius() {
    return areaRadius;
  }


  public void setAreaRadius(Long areaRadius) {
    this.areaRadius = areaRadius;
  }


  public LocalProjectDetailV30ResponseDataAudienceCustomAreaInner lat(Double lat) {
    
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


  public LocalProjectDetailV30ResponseDataAudienceCustomAreaInner _long(Double _long) {
    
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


  public LocalProjectDetailV30ResponseDataAudienceCustomAreaInner name(String name) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectDetailV30ResponseDataAudienceCustomAreaInner localProjectDetailV30ResponseDataAudienceCustomAreaInner = (LocalProjectDetailV30ResponseDataAudienceCustomAreaInner) o;
    return Objects.equals(this.areaRadius, localProjectDetailV30ResponseDataAudienceCustomAreaInner.areaRadius) &&
        Objects.equals(this.lat, localProjectDetailV30ResponseDataAudienceCustomAreaInner.lat) &&
        Objects.equals(this._long, localProjectDetailV30ResponseDataAudienceCustomAreaInner._long) &&
        Objects.equals(this.name, localProjectDetailV30ResponseDataAudienceCustomAreaInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaRadius, lat, _long, name);
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
    sb.append("class LocalProjectDetailV30ResponseDataAudienceCustomAreaInner {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectDetailV30ResponseDataAudienceCustomAreaInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectDetailV30ResponseDataAudienceCustomAreaInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectDetailV30ResponseDataAudienceCustomAreaInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectDetailV30ResponseDataAudienceCustomAreaInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectDetailV30ResponseDataAudienceCustomAreaInner>() {
           @Override
           public void write(JsonWriter out, LocalProjectDetailV30ResponseDataAudienceCustomAreaInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectDetailV30ResponseDataAudienceCustomAreaInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectDetailV30ResponseDataAudienceCustomAreaInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectDetailV30ResponseDataAudienceCustomAreaInner
  * @throws IOException if the JSON string is invalid with respect to LocalProjectDetailV30ResponseDataAudienceCustomAreaInner
  */
  public static LocalProjectDetailV30ResponseDataAudienceCustomAreaInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectDetailV30ResponseDataAudienceCustomAreaInner.class);
  }

 /**
  * Convert an instance of LocalProjectDetailV30ResponseDataAudienceCustomAreaInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

