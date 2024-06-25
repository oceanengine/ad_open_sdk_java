/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * 达人观众标签
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag {
  public static final String SERIALIZED_NAME_AGE_RANGE = "age_range";
  @SerializedName(SERIALIZED_NAME_AGE_RANGE)
  private List<String> ageRange = null;

  public static final String SERIALIZED_NAME_CITY_LEVEL = "city_level";
  @SerializedName(SERIALIZED_NAME_CITY_LEVEL)
  private List<String> cityLevel = null;

  public static final String SERIALIZED_NAME_DEVICE_BRANDS = "device_brands";
  @SerializedName(SERIALIZED_NAME_DEVICE_BRANDS)
  private List<String> deviceBrands = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private List<String> gender = null;

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag() {
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag ageRange(List<String> ageRange) {
    
    this.ageRange = ageRange;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag addAgeRangeItem(String ageRangeItem) {
    if (this.ageRange == null) {
      this.ageRange = new ArrayList<>();
    }
    this.ageRange.add(ageRangeItem);
    return this;
  }

   /**
   * 观众年龄范围 「投稿任务创建数据字典」中返回的age_range中的项 形如  \&quot;18-23岁居多\&quot;，\&quot;24-30岁居多\&quot;
   * @return ageRange
  **/
  @javax.annotation.Nullable
  public List<String> getAgeRange() {
    return ageRange;
  }


  public void setAgeRange(List<String> ageRange) {
    this.ageRange = ageRange;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag cityLevel(List<String> cityLevel) {
    
    this.cityLevel = cityLevel;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag addCityLevelItem(String cityLevelItem) {
    if (this.cityLevel == null) {
      this.cityLevel = new ArrayList<>();
    }
    this.cityLevel.add(cityLevelItem);
    return this;
  }

   /**
   * 观众地域 「投稿任务创建数据字典」返回的city_level中的项 形如“一线城市居多”，“二线城市居多”，“全部”
   * @return cityLevel
  **/
  @javax.annotation.Nullable
  public List<String> getCityLevel() {
    return cityLevel;
  }


  public void setCityLevel(List<String> cityLevel) {
    this.cityLevel = cityLevel;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag deviceBrands(List<String> deviceBrands) {
    
    this.deviceBrands = deviceBrands;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag addDeviceBrandsItem(String deviceBrandsItem) {
    if (this.deviceBrands == null) {
      this.deviceBrands = new ArrayList<>();
    }
    this.deviceBrands.add(deviceBrandsItem);
    return this;
  }

   /**
   * 观众设备品牌 「投稿任务创建数据字典」返回的device_brands中的项 形如“苹果居多”，“华为居多”
   * @return deviceBrands
  **/
  @javax.annotation.Nullable
  public List<String> getDeviceBrands() {
    return deviceBrands;
  }


  public void setDeviceBrands(List<String> deviceBrands) {
    this.deviceBrands = deviceBrands;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag gender(List<String> gender) {
    
    this.gender = gender;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

   /**
   * 观众性别 “男”，“女”
   * @return gender
  **/
  @javax.annotation.Nullable
  public List<String> getGender() {
    return gender;
  }


  public void setGender(List<String> gender) {
    this.gender = gender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag = (StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag) o;
    return Objects.equals(this.ageRange, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag.ageRange) &&
        Objects.equals(this.cityLevel, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag.cityLevel) &&
        Objects.equals(this.deviceBrands, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag.deviceBrands) &&
        Objects.equals(this.gender, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageRange, cityLevel, deviceBrands, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag {\n");
    sb.append("    ageRange: ").append(toIndentedString(ageRange)).append("\n");
    sb.append("    cityLevel: ").append(toIndentedString(cityLevel)).append("\n");
    sb.append("    deviceBrands: ").append(toIndentedString(deviceBrands)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
    openapiFields.add("age_range");
    openapiFields.add("city_level");
    openapiFields.add("device_brands");
    openapiFields.add("gender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag
  */
  public static StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

