/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandAdCreateV30AudienceInfoDistrictInfoCitySelectType;
import com.bytedance.ads.model.BrandAdCreateV30AudienceInfoDistrictInfoDistrictType;
import com.bytedance.ads.model.BrandAdCreateV30AudienceInfoDistrictInfoLocationType;
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
 * 地域定向
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandAdCreateV30RequestAudienceInfoDistrictInfo {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CITY_SELECT_TYPE = "city_select_type";
  @SerializedName(SERIALIZED_NAME_CITY_SELECT_TYPE)
  private BrandAdCreateV30AudienceInfoDistrictInfoCitySelectType citySelectType = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private BrandAdCreateV30AudienceInfoDistrictInfoDistrictType districtType = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private BrandAdCreateV30AudienceInfoDistrictInfoLocationType locationType = null;

  public BrandAdCreateV30RequestAudienceInfoDistrictInfo() {
  }

  public BrandAdCreateV30RequestAudienceInfoDistrictInfo city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public BrandAdCreateV30RequestAudienceInfoDistrictInfo addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 选择城市
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public BrandAdCreateV30RequestAudienceInfoDistrictInfo citySelectType(BrandAdCreateV30AudienceInfoDistrictInfoCitySelectType citySelectType) {
    
    this.citySelectType = citySelectType;
    return this;
  }

   /**
   * Get citySelectType
   * @return citySelectType
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30AudienceInfoDistrictInfoCitySelectType getCitySelectType() {
    return citySelectType;
  }


  public void setCitySelectType(BrandAdCreateV30AudienceInfoDistrictInfoCitySelectType citySelectType) {
    this.citySelectType = citySelectType;
  }


  public BrandAdCreateV30RequestAudienceInfoDistrictInfo districtType(BrandAdCreateV30AudienceInfoDistrictInfoDistrictType districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * Get districtType
   * @return districtType
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30AudienceInfoDistrictInfoDistrictType getDistrictType() {
    return districtType;
  }


  public void setDistrictType(BrandAdCreateV30AudienceInfoDistrictInfoDistrictType districtType) {
    this.districtType = districtType;
  }


  public BrandAdCreateV30RequestAudienceInfoDistrictInfo locationType(BrandAdCreateV30AudienceInfoDistrictInfoLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30AudienceInfoDistrictInfoLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(BrandAdCreateV30AudienceInfoDistrictInfoLocationType locationType) {
    this.locationType = locationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdCreateV30RequestAudienceInfoDistrictInfo brandAdCreateV30RequestAudienceInfoDistrictInfo = (BrandAdCreateV30RequestAudienceInfoDistrictInfo) o;
    return Objects.equals(this.city, brandAdCreateV30RequestAudienceInfoDistrictInfo.city) &&
        Objects.equals(this.citySelectType, brandAdCreateV30RequestAudienceInfoDistrictInfo.citySelectType) &&
        Objects.equals(this.districtType, brandAdCreateV30RequestAudienceInfoDistrictInfo.districtType) &&
        Objects.equals(this.locationType, brandAdCreateV30RequestAudienceInfoDistrictInfo.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, citySelectType, districtType, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAdCreateV30RequestAudienceInfoDistrictInfo {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    citySelectType: ").append(toIndentedString(citySelectType)).append("\n");
    sb.append("    districtType: ").append(toIndentedString(districtType)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
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
    openapiFields.add("city_select_type");
    openapiFields.add("district_type");
    openapiFields.add("location_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdCreateV30RequestAudienceInfoDistrictInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdCreateV30RequestAudienceInfoDistrictInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdCreateV30RequestAudienceInfoDistrictInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdCreateV30RequestAudienceInfoDistrictInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdCreateV30RequestAudienceInfoDistrictInfo>() {
           @Override
           public void write(JsonWriter out, BrandAdCreateV30RequestAudienceInfoDistrictInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdCreateV30RequestAudienceInfoDistrictInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdCreateV30RequestAudienceInfoDistrictInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdCreateV30RequestAudienceInfoDistrictInfo
  * @throws IOException if the JSON string is invalid with respect to BrandAdCreateV30RequestAudienceInfoDistrictInfo
  */
  public static BrandAdCreateV30RequestAudienceInfoDistrictInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdCreateV30RequestAudienceInfoDistrictInfo.class);
  }

 /**
  * Convert an instance of BrandAdCreateV30RequestAudienceInfoDistrictInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

