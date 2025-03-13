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
import com.bytedance.ads.model.LocalProjectUpdateV30AudienceRegionCityDivide;
import com.bytedance.ads.model.LocalProjectUpdateV30AudienceRegionLocationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * 按区域设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class LocalProjectUpdateV30RequestAudienceRegion {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CITY_DIVIDE = "city_divide";
  @SerializedName(SERIALIZED_NAME_CITY_DIVIDE)
  private LocalProjectUpdateV30AudienceRegionCityDivide cityDivide = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private LocalProjectUpdateV30AudienceRegionLocationType locationType = null;

  public static final String SERIALIZED_NAME_REGION_VER = "region_ver";
  @SerializedName(SERIALIZED_NAME_REGION_VER)
  private String regionVer = null;

  public LocalProjectUpdateV30RequestAudienceRegion() {
  }

  public LocalProjectUpdateV30RequestAudienceRegion city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public LocalProjectUpdateV30RequestAudienceRegion addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nonnull
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public LocalProjectUpdateV30RequestAudienceRegion cityDivide(LocalProjectUpdateV30AudienceRegionCityDivide cityDivide) {
    
    this.cityDivide = cityDivide;
    return this;
  }

   /**
   * Get cityDivide
   * @return cityDivide
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30AudienceRegionCityDivide getCityDivide() {
    return cityDivide;
  }


  public void setCityDivide(LocalProjectUpdateV30AudienceRegionCityDivide cityDivide) {
    this.cityDivide = cityDivide;
  }


  public LocalProjectUpdateV30RequestAudienceRegion locationType(LocalProjectUpdateV30AudienceRegionLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30AudienceRegionLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(LocalProjectUpdateV30AudienceRegionLocationType locationType) {
    this.locationType = locationType;
  }


  public LocalProjectUpdateV30RequestAudienceRegion regionVer(String regionVer) {
    
    this.regionVer = regionVer;
    return this;
  }

   /**
   * 
   * @return regionVer
  **/
  @javax.annotation.Nonnull
  public String getRegionVer() {
    return regionVer;
  }


  public void setRegionVer(String regionVer) {
    this.regionVer = regionVer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectUpdateV30RequestAudienceRegion localProjectUpdateV30RequestAudienceRegion = (LocalProjectUpdateV30RequestAudienceRegion) o;
    return Objects.equals(this.city, localProjectUpdateV30RequestAudienceRegion.city) &&
        Objects.equals(this.cityDivide, localProjectUpdateV30RequestAudienceRegion.cityDivide) &&
        Objects.equals(this.locationType, localProjectUpdateV30RequestAudienceRegion.locationType) &&
        Objects.equals(this.regionVer, localProjectUpdateV30RequestAudienceRegion.regionVer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, cityDivide, locationType, regionVer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectUpdateV30RequestAudienceRegion {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cityDivide: ").append(toIndentedString(cityDivide)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    regionVer: ").append(toIndentedString(regionVer)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("city_divide");
    openapiFields.add("location_type");
    openapiFields.add("region_ver");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("region_ver");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectUpdateV30RequestAudienceRegion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectUpdateV30RequestAudienceRegion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectUpdateV30RequestAudienceRegion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectUpdateV30RequestAudienceRegion.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectUpdateV30RequestAudienceRegion>() {
           @Override
           public void write(JsonWriter out, LocalProjectUpdateV30RequestAudienceRegion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectUpdateV30RequestAudienceRegion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectUpdateV30RequestAudienceRegion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectUpdateV30RequestAudienceRegion
  * @throws IOException if the JSON string is invalid with respect to LocalProjectUpdateV30RequestAudienceRegion
  */
  public static LocalProjectUpdateV30RequestAudienceRegion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectUpdateV30RequestAudienceRegion.class);
  }

 /**
  * Convert an instance of LocalProjectUpdateV30RequestAudienceRegion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

