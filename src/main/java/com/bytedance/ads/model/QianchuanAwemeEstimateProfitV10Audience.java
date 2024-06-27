/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10AudienceAge;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10AudienceAudienceMode;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10AudienceBehaviors;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10AudienceDistrict;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10AudienceExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10AudienceGender;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class QianchuanAwemeEstimateProfitV10Audience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanAwemeEstimateProfitV10AudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanAwemeEstimateProfitV10AudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUTHOR_IDS = "author_ids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IDS)
  private List<Long> authorIds = null;

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<QianchuanAwemeEstimateProfitV10AudienceBehaviors> behaviors = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanAwemeEstimateProfitV10AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanAwemeEstimateProfitV10AudienceExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanAwemeEstimateProfitV10AudienceGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public QianchuanAwemeEstimateProfitV10Audience() {
  }

  public QianchuanAwemeEstimateProfitV10Audience age(List<QianchuanAwemeEstimateProfitV10AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanAwemeEstimateProfitV10Audience addAgeItem(QianchuanAwemeEstimateProfitV10AudienceAge ageItem) {
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
  public List<QianchuanAwemeEstimateProfitV10AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanAwemeEstimateProfitV10AudienceAge> age) {
    this.age = age;
  }


  public QianchuanAwemeEstimateProfitV10Audience audienceMode(QianchuanAwemeEstimateProfitV10AudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeEstimateProfitV10AudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanAwemeEstimateProfitV10AudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanAwemeEstimateProfitV10Audience authorIds(List<Long> authorIds) {
    
    this.authorIds = authorIds;
    return this;
  }

  public QianchuanAwemeEstimateProfitV10Audience addAuthorIdsItem(Long authorIdsItem) {
    if (this.authorIds == null) {
      this.authorIds = new ArrayList<>();
    }
    this.authorIds.add(authorIdsItem);
    return this;
  }

   /**
   * 
   * @return authorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAuthorIds() {
    return authorIds;
  }


  public void setAuthorIds(List<Long> authorIds) {
    this.authorIds = authorIds;
  }


  public QianchuanAwemeEstimateProfitV10Audience behaviors(List<QianchuanAwemeEstimateProfitV10AudienceBehaviors> behaviors) {
    
    this.behaviors = behaviors;
    return this;
  }

  public QianchuanAwemeEstimateProfitV10Audience addBehaviorsItem(QianchuanAwemeEstimateProfitV10AudienceBehaviors behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * 
   * @return behaviors
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeEstimateProfitV10AudienceBehaviors> getBehaviors() {
    return behaviors;
  }


  public void setBehaviors(List<QianchuanAwemeEstimateProfitV10AudienceBehaviors> behaviors) {
    this.behaviors = behaviors;
  }


  public QianchuanAwemeEstimateProfitV10Audience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAwemeEstimateProfitV10Audience addCityItem(Long cityItem) {
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


  public QianchuanAwemeEstimateProfitV10Audience district(QianchuanAwemeEstimateProfitV10AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeEstimateProfitV10AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanAwemeEstimateProfitV10AudienceDistrict district) {
    this.district = district;
  }


  public QianchuanAwemeEstimateProfitV10Audience excludeLimitedRegion(QianchuanAwemeEstimateProfitV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeEstimateProfitV10AudienceExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanAwemeEstimateProfitV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAwemeEstimateProfitV10Audience gender(QianchuanAwemeEstimateProfitV10AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeEstimateProfitV10AudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanAwemeEstimateProfitV10AudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanAwemeEstimateProfitV10Audience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanAwemeEstimateProfitV10Audience addInterestCategoriesItem(Long interestCategoriesItem) {
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
  public List<Long> getInterestCategories() {
    return interestCategories;
  }


  public void setInterestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeEstimateProfitV10Audience qianchuanAwemeEstimateProfitV10Audience = (QianchuanAwemeEstimateProfitV10Audience) o;
    return Objects.equals(this.age, qianchuanAwemeEstimateProfitV10Audience.age) &&
        Objects.equals(this.audienceMode, qianchuanAwemeEstimateProfitV10Audience.audienceMode) &&
        Objects.equals(this.authorIds, qianchuanAwemeEstimateProfitV10Audience.authorIds) &&
        Objects.equals(this.behaviors, qianchuanAwemeEstimateProfitV10Audience.behaviors) &&
        Objects.equals(this.city, qianchuanAwemeEstimateProfitV10Audience.city) &&
        Objects.equals(this.district, qianchuanAwemeEstimateProfitV10Audience.district) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAwemeEstimateProfitV10Audience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanAwemeEstimateProfitV10Audience.gender) &&
        Objects.equals(this.interestCategories, qianchuanAwemeEstimateProfitV10Audience.interestCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audienceMode, authorIds, behaviors, city, district, excludeLimitedRegion, gender, interestCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeEstimateProfitV10Audience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audienceMode: ").append(toIndentedString(audienceMode)).append("\n");
    sb.append("    authorIds: ").append(toIndentedString(authorIds)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    excludeLimitedRegion: ").append(toIndentedString(excludeLimitedRegion)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategories: ").append(toIndentedString(interestCategories)).append("\n");
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
    openapiFields.add("audience_mode");
    openapiFields.add("author_ids");
    openapiFields.add("behaviors");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("exclude_limited_region");
    openapiFields.add("gender");
    openapiFields.add("interest_categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audience_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeEstimateProfitV10Audience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeEstimateProfitV10Audience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeEstimateProfitV10Audience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeEstimateProfitV10Audience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeEstimateProfitV10Audience>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeEstimateProfitV10Audience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeEstimateProfitV10Audience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeEstimateProfitV10Audience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeEstimateProfitV10Audience
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeEstimateProfitV10Audience
  */
  public static QianchuanAwemeEstimateProfitV10Audience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeEstimateProfitV10Audience.class);
  }

 /**
  * Convert an instance of QianchuanAwemeEstimateProfitV10Audience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

