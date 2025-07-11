/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionNewcustomerCreateV30AudienceAge;
import com.bytedance.ads.model.PromotionNewcustomerCreateV30AudienceGender;
import com.bytedance.ads.model.PromotionNewcustomerCreateV30AudienceLocationType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class PromotionNewcustomerCreateV30RequestAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<PromotionNewcustomerCreateV30AudienceAge> age = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private PromotionNewcustomerCreateV30AudienceGender gender = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private PromotionNewcustomerCreateV30AudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_REGION_VERSION = "region_version";
  @SerializedName(SERIALIZED_NAME_REGION_VERSION)
  private String regionVersion = null;

  public PromotionNewcustomerCreateV30RequestAudience() {
  }

  public PromotionNewcustomerCreateV30RequestAudience age(List<PromotionNewcustomerCreateV30AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public PromotionNewcustomerCreateV30RequestAudience addAgeItem(PromotionNewcustomerCreateV30AudienceAge ageItem) {
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
  public List<PromotionNewcustomerCreateV30AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<PromotionNewcustomerCreateV30AudienceAge> age) {
    this.age = age;
  }


  public PromotionNewcustomerCreateV30RequestAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public PromotionNewcustomerCreateV30RequestAudience addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 定向城市
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public PromotionNewcustomerCreateV30RequestAudience gender(PromotionNewcustomerCreateV30AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public PromotionNewcustomerCreateV30AudienceGender getGender() {
    return gender;
  }


  public void setGender(PromotionNewcustomerCreateV30AudienceGender gender) {
    this.gender = gender;
  }


  public PromotionNewcustomerCreateV30RequestAudience locationType(PromotionNewcustomerCreateV30AudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public PromotionNewcustomerCreateV30AudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(PromotionNewcustomerCreateV30AudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public PromotionNewcustomerCreateV30RequestAudience regionVersion(String regionVersion) {
    
    this.regionVersion = regionVersion;
    return this;
  }

   /**
   * 行政区域版本号
   * @return regionVersion
  **/
  @javax.annotation.Nullable
  public String getRegionVersion() {
    return regionVersion;
  }


  public void setRegionVersion(String regionVersion) {
    this.regionVersion = regionVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionNewcustomerCreateV30RequestAudience promotionNewcustomerCreateV30RequestAudience = (PromotionNewcustomerCreateV30RequestAudience) o;
    return Objects.equals(this.age, promotionNewcustomerCreateV30RequestAudience.age) &&
        Objects.equals(this.city, promotionNewcustomerCreateV30RequestAudience.city) &&
        Objects.equals(this.gender, promotionNewcustomerCreateV30RequestAudience.gender) &&
        Objects.equals(this.locationType, promotionNewcustomerCreateV30RequestAudience.locationType) &&
        Objects.equals(this.regionVersion, promotionNewcustomerCreateV30RequestAudience.regionVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, city, gender, locationType, regionVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionNewcustomerCreateV30RequestAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    regionVersion: ").append(toIndentedString(regionVersion)).append("\n");
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
    openapiFields.add("gender");
    openapiFields.add("location_type");
    openapiFields.add("region_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionNewcustomerCreateV30RequestAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionNewcustomerCreateV30RequestAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionNewcustomerCreateV30RequestAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionNewcustomerCreateV30RequestAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionNewcustomerCreateV30RequestAudience>() {
           @Override
           public void write(JsonWriter out, PromotionNewcustomerCreateV30RequestAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionNewcustomerCreateV30RequestAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionNewcustomerCreateV30RequestAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionNewcustomerCreateV30RequestAudience
  * @throws IOException if the JSON string is invalid with respect to PromotionNewcustomerCreateV30RequestAudience
  */
  public static PromotionNewcustomerCreateV30RequestAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionNewcustomerCreateV30RequestAudience.class);
  }

 /**
  * Convert an instance of PromotionNewcustomerCreateV30RequestAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

