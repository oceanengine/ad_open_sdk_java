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
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataAudienceAge;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataAudienceAudienceMode;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataAudienceDistrict;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataAudienceExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataAudienceGender;
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
 * 人群定向
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanAwemeOrderDetailGetV10DataAudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanAwemeOrderDetailGetV10DataAudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_ACCOUNTS = "aweme_fan_accounts";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_ACCOUNTS)
  private List<Long> awemeFanAccounts = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS = "aweme_fan_behaviors";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS)
  private List<QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors> awemeFanBehaviors = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanAwemeOrderDetailGetV10DataAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanAwemeOrderDetailGetV10DataAudienceExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanAwemeOrderDetailGetV10DataAudienceGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public static final String SERIALIZED_NAME_REGION_VERSION = "region_version";
  @SerializedName(SERIALIZED_NAME_REGION_VERSION)
  private String regionVersion = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience age(List<QianchuanAwemeOrderDetailGetV10DataAudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience addAgeItem(QianchuanAwemeOrderDetailGetV10DataAudienceAge ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 年龄定向
   * @return age
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeOrderDetailGetV10DataAudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanAwemeOrderDetailGetV10DataAudienceAge> age) {
    this.age = age;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience audienceMode(QianchuanAwemeOrderDetailGetV10DataAudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataAudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanAwemeOrderDetailGetV10DataAudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience awemeFanAccounts(List<Long> awemeFanAccounts) {
    
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience addAwemeFanAccountsItem(Long awemeFanAccountsItem) {
    if (this.awemeFanAccounts == null) {
      this.awemeFanAccounts = new ArrayList<>();
    }
    this.awemeFanAccounts.add(awemeFanAccountsItem);
    return this;
  }

   /**
   * 抖音达人ID列表
   * @return awemeFanAccounts
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeFanAccounts() {
    return awemeFanAccounts;
  }


  public void setAwemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience awemeFanBehaviors(List<QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors> awemeFanBehaviors) {
    
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience addAwemeFanBehaviorsItem(QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors awemeFanBehaviorsItem) {
    if (this.awemeFanBehaviors == null) {
      this.awemeFanBehaviors = new ArrayList<>();
    }
    this.awemeFanBehaviors.add(awemeFanBehaviorsItem);
    return this;
  }

   /**
   * 抖音用户行为类型 ，
   * @return awemeFanBehaviors
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors> getAwemeFanBehaviors() {
    return awemeFanBehaviors;
  }


  public void setAwemeFanBehaviors(List<QianchuanAwemeOrderDetailGetV10DataAudienceAwemeFanBehaviors> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 具体定向的城市列表
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience district(QianchuanAwemeOrderDetailGetV10DataAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanAwemeOrderDetailGetV10DataAudienceDistrict district) {
    this.district = district;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience excludeLimitedRegion(QianchuanAwemeOrderDetailGetV10DataAudienceExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataAudienceExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanAwemeOrderDetailGetV10DataAudienceExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience gender(QianchuanAwemeOrderDetailGetV10DataAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataAudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanAwemeOrderDetailGetV10DataAudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience addInterestCategoriesItem(Long interestCategoriesItem) {
    if (this.interestCategories == null) {
      this.interestCategories = new ArrayList<>();
    }
    this.interestCategories.add(interestCategoriesItem);
    return this;
  }

   /**
   * 兴趣类目词
   * @return interestCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestCategories() {
    return interestCategories;
  }


  public void setInterestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience regionVersion(String regionVersion) {
    
    this.regionVersion = regionVersion;
    return this;
  }

   /**
   * 定向版本
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
    QianchuanAwemeOrderDetailGetV10ResponseDataAudience qianchuanAwemeOrderDetailGetV10ResponseDataAudience = (QianchuanAwemeOrderDetailGetV10ResponseDataAudience) o;
    return Objects.equals(this.age, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.age) &&
        Objects.equals(this.audienceMode, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.audienceMode) &&
        Objects.equals(this.awemeFanAccounts, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.awemeFanAccounts) &&
        Objects.equals(this.awemeFanBehaviors, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.awemeFanBehaviors) &&
        Objects.equals(this.city, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.city) &&
        Objects.equals(this.district, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.district) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.gender) &&
        Objects.equals(this.interestCategories, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.interestCategories) &&
        Objects.equals(this.regionVersion, qianchuanAwemeOrderDetailGetV10ResponseDataAudience.regionVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audienceMode, awemeFanAccounts, awemeFanBehaviors, city, district, excludeLimitedRegion, gender, interestCategories, regionVersion);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audienceMode: ").append(toIndentedString(audienceMode)).append("\n");
    sb.append("    awemeFanAccounts: ").append(toIndentedString(awemeFanAccounts)).append("\n");
    sb.append("    awemeFanBehaviors: ").append(toIndentedString(awemeFanBehaviors)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    excludeLimitedRegion: ").append(toIndentedString(excludeLimitedRegion)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategories: ").append(toIndentedString(interestCategories)).append("\n");
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
    openapiFields.add("audience_mode");
    openapiFields.add("aweme_fan_accounts");
    openapiFields.add("aweme_fan_behaviors");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("exclude_limited_region");
    openapiFields.add("gender");
    openapiFields.add("interest_categories");
    openapiFields.add("region_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataAudience>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataAudience
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataAudience
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataAudience.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

