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
import com.bytedance.ads.model.DouplusOrderListV30DataOrderListAdListAudienceDistrict;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<String> age = null;

  public static final String SERIALIZED_NAME_AUTHOR_PKGS = "author_pkgs";
  @SerializedName(SERIALIZED_NAME_AUTHOR_PKGS)
  private List<String> authorPkgs = null;

  public static final String SERIALIZED_NAME_BUSINESS = "business";
  @SerializedName(SERIALIZED_NAME_BUSINESS)
  private List<String> business = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<String> city = null;

  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "delivery_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private String deliveryType = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private DouplusOrderListV30DataOrderListAdListAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<String> interestCategories = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<String> platform = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<String> province = null;

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience() {
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience age(List<String> age) {
    
    this.age = age;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience addAgeItem(String ageItem) {
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
  public List<String> getAge() {
    return age;
  }


  public void setAge(List<String> age) {
    this.age = age;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience authorPkgs(List<String> authorPkgs) {
    
    this.authorPkgs = authorPkgs;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience addAuthorPkgsItem(String authorPkgsItem) {
    if (this.authorPkgs == null) {
      this.authorPkgs = new ArrayList<>();
    }
    this.authorPkgs.add(authorPkgsItem);
    return this;
  }

   /**
   * 
   * @return authorPkgs
  **/
  @javax.annotation.Nullable
  public List<String> getAuthorPkgs() {
    return authorPkgs;
  }


  public void setAuthorPkgs(List<String> authorPkgs) {
    this.authorPkgs = authorPkgs;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience business(List<String> business) {
    
    this.business = business;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience addBusinessItem(String businessItem) {
    if (this.business == null) {
      this.business = new ArrayList<>();
    }
    this.business.add(businessItem);
    return this;
  }

   /**
   * 
   * @return business
  **/
  @javax.annotation.Nullable
  public List<String> getBusiness() {
    return business;
  }


  public void setBusiness(List<String> business) {
    this.business = business;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience city(List<String> city) {
    
    this.city = city;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience addCityItem(String cityItem) {
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
  public List<String> getCity() {
    return city;
  }


  public void setCity(List<String> city) {
    this.city = city;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience deliveryType(String deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * 
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  public String getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience district(DouplusOrderListV30DataOrderListAdListAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30DataOrderListAdListAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(DouplusOrderListV30DataOrderListAdListAudienceDistrict district) {
    this.district = district;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience interestCategories(List<String> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience addInterestCategoriesItem(String interestCategoriesItem) {
    if (this.interestCategories == null) {
      this.interestCategories = new ArrayList<>();
    }
    this.interestCategories.add(interestCategoriesItem);
    return this;
  }

   /**
   * 
   * @return interestCategories
  **/
  @javax.annotation.Nullable
  public List<String> getInterestCategories() {
    return interestCategories;
  }


  public void setInterestCategories(List<String> interestCategories) {
    this.interestCategories = interestCategories;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience platform(List<String> platform) {
    
    this.platform = platform;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience addPlatformItem(String platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<String> getPlatform() {
    return platform;
  }


  public void setPlatform(List<String> platform) {
    this.platform = platform;
  }


  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience province(List<String> province) {
    
    this.province = province;
    return this;
  }

  public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience addProvinceItem(String provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * 
   * @return province
  **/
  @javax.annotation.Nullable
  public List<String> getProvince() {
    return province;
  }


  public void setProvince(List<String> province) {
    this.province = province;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience = (DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience) o;
    return Objects.equals(this.age, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.age) &&
        Objects.equals(this.authorPkgs, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.authorPkgs) &&
        Objects.equals(this.business, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.business) &&
        Objects.equals(this.city, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.city) &&
        Objects.equals(this.deliveryType, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.deliveryType) &&
        Objects.equals(this.district, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.district) &&
        Objects.equals(this.gender, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.gender) &&
        Objects.equals(this.interestCategories, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.interestCategories) &&
        Objects.equals(this.platform, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.platform) &&
        Objects.equals(this.province, douplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.province);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, authorPkgs, business, city, deliveryType, district, gender, interestCategories, platform, province);
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
    sb.append("class DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    authorPkgs: ").append(toIndentedString(authorPkgs)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategories: ").append(toIndentedString(interestCategories)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
    openapiFields.add("author_pkgs");
    openapiFields.add("business");
    openapiFields.add("city");
    openapiFields.add("delivery_type");
    openapiFields.add("district");
    openapiFields.add("gender");
    openapiFields.add("interest_categories");
    openapiFields.add("platform");
    openapiFields.add("province");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience>() {
           @Override
           public void write(JsonWriter out, DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience
  */
  public static DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience.class);
  }

 /**
  * Convert an instance of DouplusOrderListV30ResponseDataOrderListInnerAdListInnerAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

