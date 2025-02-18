/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersAudienceInfoDistrictInfoCitySelectType;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersAudienceInfoDistrictInfoDistrictType;
import com.bytedance.ads.model.BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 地域定向
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CITY_SELECT_TYPE = "city_select_type";
  @SerializedName(SERIALIZED_NAME_CITY_SELECT_TYPE)
  private BrandOrderListV30DataOrdersAudienceInfoDistrictInfoCitySelectType citySelectType = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private BrandOrderListV30DataOrdersAudienceInfoDistrictInfoDistrictType districtType = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType locationType = null;

  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo() {
  }

  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 地域code
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo citySelectType(BrandOrderListV30DataOrdersAudienceInfoDistrictInfoCitySelectType citySelectType) {
    
    this.citySelectType = citySelectType;
    return this;
  }

   /**
   * Get citySelectType
   * @return citySelectType
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersAudienceInfoDistrictInfoCitySelectType getCitySelectType() {
    return citySelectType;
  }


  public void setCitySelectType(BrandOrderListV30DataOrdersAudienceInfoDistrictInfoCitySelectType citySelectType) {
    this.citySelectType = citySelectType;
  }


  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo districtType(BrandOrderListV30DataOrdersAudienceInfoDistrictInfoDistrictType districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * Get districtType
   * @return districtType
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersAudienceInfoDistrictInfoDistrictType getDistrictType() {
    return districtType;
  }


  public void setDistrictType(BrandOrderListV30DataOrdersAudienceInfoDistrictInfoDistrictType districtType) {
    this.districtType = districtType;
  }


  public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo locationType(BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(BrandOrderListV30DataOrdersAudienceInfoDistrictInfoLocationType locationType) {
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
    BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo brandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo = (BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo) o;
    return Objects.equals(this.city, brandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo.city) &&
        Objects.equals(this.citySelectType, brandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo.citySelectType) &&
        Objects.equals(this.districtType, brandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo.districtType) &&
        Objects.equals(this.locationType, brandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo.locationType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, citySelectType, districtType, locationType);
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
    sb.append("class BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo {\n");
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
       if (!BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo
  */
  public static BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo.class);
  }

 /**
  * Convert an instance of BrandOrderListV30ResponseDataOrdersInnerAudienceInfoDistrictInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

