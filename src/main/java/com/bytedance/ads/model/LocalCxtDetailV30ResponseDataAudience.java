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
import com.bytedance.ads.model.LocalCxtDetailV30DataAudienceAge;
import com.bytedance.ads.model.LocalCxtDetailV30DataAudienceDistrict;
import com.bytedance.ads.model.LocalCxtDetailV30DataAudienceGender;
import com.bytedance.ads.model.LocalCxtDetailV30DataAudiencePoiAroundRadius;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class LocalCxtDetailV30ResponseDataAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<LocalCxtDetailV30DataAudienceAge> age = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private LocalCxtDetailV30DataAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private LocalCxtDetailV30DataAudienceGender gender = null;

  public static final String SERIALIZED_NAME_POI_AROUND_RADIUS = "poi_around_radius";
  @SerializedName(SERIALIZED_NAME_POI_AROUND_RADIUS)
  private LocalCxtDetailV30DataAudiencePoiAroundRadius poiAroundRadius = null;

  public LocalCxtDetailV30ResponseDataAudience() {
  }

  public LocalCxtDetailV30ResponseDataAudience age(List<LocalCxtDetailV30DataAudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public LocalCxtDetailV30ResponseDataAudience addAgeItem(LocalCxtDetailV30DataAudienceAge ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<LocalCxtDetailV30DataAudienceAge> getAge() {
    return age;
  }


  public void setAge(List<LocalCxtDetailV30DataAudienceAge> age) {
    this.age = age;
  }


  public LocalCxtDetailV30ResponseDataAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public LocalCxtDetailV30ResponseDataAudience addCityItem(Long cityItem) {
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
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public LocalCxtDetailV30ResponseDataAudience district(LocalCxtDetailV30DataAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public LocalCxtDetailV30DataAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(LocalCxtDetailV30DataAudienceDistrict district) {
    this.district = district;
  }


  public LocalCxtDetailV30ResponseDataAudience gender(LocalCxtDetailV30DataAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public LocalCxtDetailV30DataAudienceGender getGender() {
    return gender;
  }


  public void setGender(LocalCxtDetailV30DataAudienceGender gender) {
    this.gender = gender;
  }


  public LocalCxtDetailV30ResponseDataAudience poiAroundRadius(LocalCxtDetailV30DataAudiencePoiAroundRadius poiAroundRadius) {
    
    this.poiAroundRadius = poiAroundRadius;
    return this;
  }

   /**
   * Get poiAroundRadius
   * @return poiAroundRadius
  **/
  @javax.annotation.Nullable
  public LocalCxtDetailV30DataAudiencePoiAroundRadius getPoiAroundRadius() {
    return poiAroundRadius;
  }


  public void setPoiAroundRadius(LocalCxtDetailV30DataAudiencePoiAroundRadius poiAroundRadius) {
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
    LocalCxtDetailV30ResponseDataAudience localCxtDetailV30ResponseDataAudience = (LocalCxtDetailV30ResponseDataAudience) o;
    return Objects.equals(this.age, localCxtDetailV30ResponseDataAudience.age) &&
        Objects.equals(this.city, localCxtDetailV30ResponseDataAudience.city) &&
        Objects.equals(this.district, localCxtDetailV30ResponseDataAudience.district) &&
        Objects.equals(this.gender, localCxtDetailV30ResponseDataAudience.gender) &&
        Objects.equals(this.poiAroundRadius, localCxtDetailV30ResponseDataAudience.poiAroundRadius);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, city, district, gender, poiAroundRadius);
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
    sb.append("class LocalCxtDetailV30ResponseDataAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
    openapiFields.add("poi_around_radius");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalCxtDetailV30ResponseDataAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalCxtDetailV30ResponseDataAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalCxtDetailV30ResponseDataAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalCxtDetailV30ResponseDataAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalCxtDetailV30ResponseDataAudience>() {
           @Override
           public void write(JsonWriter out, LocalCxtDetailV30ResponseDataAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalCxtDetailV30ResponseDataAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalCxtDetailV30ResponseDataAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalCxtDetailV30ResponseDataAudience
  * @throws IOException if the JSON string is invalid with respect to LocalCxtDetailV30ResponseDataAudience
  */
  public static LocalCxtDetailV30ResponseDataAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalCxtDetailV30ResponseDataAudience.class);
  }

 /**
  * Convert an instance of LocalCxtDetailV30ResponseDataAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
