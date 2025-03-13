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
import com.bytedance.ads.model.LocalCxtAudienceUpdateV30Age;
import com.bytedance.ads.model.LocalCxtAudienceUpdateV30District;
import com.bytedance.ads.model.LocalCxtAudienceUpdateV30Gender;
import com.bytedance.ads.model.LocalCxtAudienceUpdateV30PoiAroundRadius;
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
 * LocalCxtAudienceUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class LocalCxtAudienceUpdateV30Request {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<LocalCxtAudienceUpdateV30Age> age = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private LocalCxtAudienceUpdateV30District district = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private LocalCxtAudienceUpdateV30Gender gender = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_POI_AROUND_RADIUS = "poi_around_radius";
  @SerializedName(SERIALIZED_NAME_POI_AROUND_RADIUS)
  private LocalCxtAudienceUpdateV30PoiAroundRadius poiAroundRadius = null;

  public LocalCxtAudienceUpdateV30Request() {
  }

  public LocalCxtAudienceUpdateV30Request age(List<LocalCxtAudienceUpdateV30Age> age) {
    
    this.age = age;
    return this;
  }

  public LocalCxtAudienceUpdateV30Request addAgeItem(LocalCxtAudienceUpdateV30Age ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 年龄
   * @return age
  **/
  @javax.annotation.Nullable
  public List<LocalCxtAudienceUpdateV30Age> getAge() {
    return age;
  }


  public void setAge(List<LocalCxtAudienceUpdateV30Age> age) {
    this.age = age;
  }


  public LocalCxtAudienceUpdateV30Request city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public LocalCxtAudienceUpdateV30Request addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 当district&#x3D;CITY/COUNTRY时，必填
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public LocalCxtAudienceUpdateV30Request district(LocalCxtAudienceUpdateV30District district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public LocalCxtAudienceUpdateV30District getDistrict() {
    return district;
  }


  public void setDistrict(LocalCxtAudienceUpdateV30District district) {
    this.district = district;
  }


  public LocalCxtAudienceUpdateV30Request gender(LocalCxtAudienceUpdateV30Gender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public LocalCxtAudienceUpdateV30Gender getGender() {
    return gender;
  }


  public void setGender(LocalCxtAudienceUpdateV30Gender gender) {
    this.gender = gender;
  }


  public LocalCxtAudienceUpdateV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalCxtAudienceUpdateV30Request poiAroundRadius(LocalCxtAudienceUpdateV30PoiAroundRadius poiAroundRadius) {
    
    this.poiAroundRadius = poiAroundRadius;
    return this;
  }

   /**
   * Get poiAroundRadius
   * @return poiAroundRadius
  **/
  @javax.annotation.Nullable
  public LocalCxtAudienceUpdateV30PoiAroundRadius getPoiAroundRadius() {
    return poiAroundRadius;
  }


  public void setPoiAroundRadius(LocalCxtAudienceUpdateV30PoiAroundRadius poiAroundRadius) {
    this.poiAroundRadius = poiAroundRadius;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalCxtAudienceUpdateV30Request localCxtAudienceUpdateV30Request = (LocalCxtAudienceUpdateV30Request) o;
    return Objects.equals(this.age, localCxtAudienceUpdateV30Request.age) &&
        Objects.equals(this.city, localCxtAudienceUpdateV30Request.city) &&
        Objects.equals(this.district, localCxtAudienceUpdateV30Request.district) &&
        Objects.equals(this.gender, localCxtAudienceUpdateV30Request.gender) &&
        Objects.equals(this.localAccountId, localCxtAudienceUpdateV30Request.localAccountId) &&
        Objects.equals(this.poiAroundRadius, localCxtAudienceUpdateV30Request.poiAroundRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, city, district, gender, localAccountId, poiAroundRadius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalCxtAudienceUpdateV30Request {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    poiAroundRadius: ").append(toIndentedString(poiAroundRadius)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("gender");
    openapiFields.add("local_account_id");
    openapiFields.add("poi_around_radius");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("local_account_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalCxtAudienceUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalCxtAudienceUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalCxtAudienceUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalCxtAudienceUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalCxtAudienceUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalCxtAudienceUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalCxtAudienceUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalCxtAudienceUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalCxtAudienceUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalCxtAudienceUpdateV30Request
  */
  public static LocalCxtAudienceUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalCxtAudienceUpdateV30Request.class);
  }

 /**
  * Convert an instance of LocalCxtAudienceUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

