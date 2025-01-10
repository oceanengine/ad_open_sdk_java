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
import com.bytedance.ads.model.BrandOrderCreateV30AudienceInfoDistrictInfoCitySelectType;
import com.bytedance.ads.model.BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType;
import com.bytedance.ads.model.BrandOrderCreateV30AudienceInfoDistrictInfoLocationType;
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
 * 地域信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class BrandOrderCreateV30RequestAudienceInfoDistrictInfo {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CITY_SELECT_TYPE = "city_select_type";
  @SerializedName(SERIALIZED_NAME_CITY_SELECT_TYPE)
  private BrandOrderCreateV30AudienceInfoDistrictInfoCitySelectType citySelectType = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType districtType = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private BrandOrderCreateV30AudienceInfoDistrictInfoLocationType locationType = null;

  public BrandOrderCreateV30RequestAudienceInfoDistrictInfo() {
  }

  public BrandOrderCreateV30RequestAudienceInfoDistrictInfo city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public BrandOrderCreateV30RequestAudienceInfoDistrictInfo addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 选择的城市
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public BrandOrderCreateV30RequestAudienceInfoDistrictInfo citySelectType(BrandOrderCreateV30AudienceInfoDistrictInfoCitySelectType citySelectType) {
    
    this.citySelectType = citySelectType;
    return this;
  }

   /**
   * Get citySelectType
   * @return citySelectType
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30AudienceInfoDistrictInfoCitySelectType getCitySelectType() {
    return citySelectType;
  }


  public void setCitySelectType(BrandOrderCreateV30AudienceInfoDistrictInfoCitySelectType citySelectType) {
    this.citySelectType = citySelectType;
  }


  public BrandOrderCreateV30RequestAudienceInfoDistrictInfo districtType(BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * Get districtType
   * @return districtType
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType getDistrictType() {
    return districtType;
  }


  public void setDistrictType(BrandOrderCreateV30AudienceInfoDistrictInfoDistrictType districtType) {
    this.districtType = districtType;
  }


  public BrandOrderCreateV30RequestAudienceInfoDistrictInfo locationType(BrandOrderCreateV30AudienceInfoDistrictInfoLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30AudienceInfoDistrictInfoLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(BrandOrderCreateV30AudienceInfoDistrictInfoLocationType locationType) {
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
    BrandOrderCreateV30RequestAudienceInfoDistrictInfo brandOrderCreateV30RequestAudienceInfoDistrictInfo = (BrandOrderCreateV30RequestAudienceInfoDistrictInfo) o;
    return Objects.equals(this.city, brandOrderCreateV30RequestAudienceInfoDistrictInfo.city) &&
        Objects.equals(this.citySelectType, brandOrderCreateV30RequestAudienceInfoDistrictInfo.citySelectType) &&
        Objects.equals(this.districtType, brandOrderCreateV30RequestAudienceInfoDistrictInfo.districtType) &&
        Objects.equals(this.locationType, brandOrderCreateV30RequestAudienceInfoDistrictInfo.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, citySelectType, districtType, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandOrderCreateV30RequestAudienceInfoDistrictInfo {\n");
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
       if (!BrandOrderCreateV30RequestAudienceInfoDistrictInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderCreateV30RequestAudienceInfoDistrictInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderCreateV30RequestAudienceInfoDistrictInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderCreateV30RequestAudienceInfoDistrictInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderCreateV30RequestAudienceInfoDistrictInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderCreateV30RequestAudienceInfoDistrictInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderCreateV30RequestAudienceInfoDistrictInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderCreateV30RequestAudienceInfoDistrictInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderCreateV30RequestAudienceInfoDistrictInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderCreateV30RequestAudienceInfoDistrictInfo
  */
  public static BrandOrderCreateV30RequestAudienceInfoDistrictInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderCreateV30RequestAudienceInfoDistrictInfo.class);
  }

 /**
  * Convert an instance of BrandOrderCreateV30RequestAudienceInfoDistrictInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
