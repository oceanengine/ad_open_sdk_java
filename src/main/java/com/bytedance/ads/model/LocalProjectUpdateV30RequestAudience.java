/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalProjectUpdateV30AudienceAge;
import com.bytedance.ads.model.LocalProjectUpdateV30AudienceConvertedTimeDuration;
import com.bytedance.ads.model.LocalProjectUpdateV30AudienceDistrict;
import com.bytedance.ads.model.LocalProjectUpdateV30AudienceGender;
import com.bytedance.ads.model.LocalProjectUpdateV30AudienceHideIfConverted;
import com.bytedance.ads.model.LocalProjectUpdateV30RequestAudienceCustomArea;
import com.bytedance.ads.model.LocalProjectUpdateV30RequestAudiencePoiAround;
import com.bytedance.ads.model.LocalProjectUpdateV30RequestAudienceRegion;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class LocalProjectUpdateV30RequestAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<LocalProjectUpdateV30AudienceAge> age = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private LocalProjectUpdateV30AudienceConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_CUSTOM_AREA = "custom_area";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AREA)
  private LocalProjectUpdateV30RequestAudienceCustomArea customArea = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private LocalProjectUpdateV30AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private LocalProjectUpdateV30AudienceGender gender = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private LocalProjectUpdateV30AudienceHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_POI_AROUND = "poi_around";
  @SerializedName(SERIALIZED_NAME_POI_AROUND)
  private LocalProjectUpdateV30RequestAudiencePoiAround poiAround = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private LocalProjectUpdateV30RequestAudienceRegion region = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS = "retargeting_tags";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS)
  private List<Long> retargetingTags = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public LocalProjectUpdateV30RequestAudience() {
  }

  public LocalProjectUpdateV30RequestAudience age(List<LocalProjectUpdateV30AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public LocalProjectUpdateV30RequestAudience addAgeItem(LocalProjectUpdateV30AudienceAge ageItem) {
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
  public List<LocalProjectUpdateV30AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<LocalProjectUpdateV30AudienceAge> age) {
    this.age = age;
  }


  public LocalProjectUpdateV30RequestAudience convertedTimeDuration(LocalProjectUpdateV30AudienceConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30AudienceConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(LocalProjectUpdateV30AudienceConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public LocalProjectUpdateV30RequestAudience customArea(LocalProjectUpdateV30RequestAudienceCustomArea customArea) {
    
    this.customArea = customArea;
    return this;
  }

   /**
   * Get customArea
   * @return customArea
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30RequestAudienceCustomArea getCustomArea() {
    return customArea;
  }


  public void setCustomArea(LocalProjectUpdateV30RequestAudienceCustomArea customArea) {
    this.customArea = customArea;
  }


  public LocalProjectUpdateV30RequestAudience district(LocalProjectUpdateV30AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(LocalProjectUpdateV30AudienceDistrict district) {
    this.district = district;
  }


  public LocalProjectUpdateV30RequestAudience gender(LocalProjectUpdateV30AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30AudienceGender getGender() {
    return gender;
  }


  public void setGender(LocalProjectUpdateV30AudienceGender gender) {
    this.gender = gender;
  }


  public LocalProjectUpdateV30RequestAudience hideIfConverted(LocalProjectUpdateV30AudienceHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30AudienceHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(LocalProjectUpdateV30AudienceHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public LocalProjectUpdateV30RequestAudience poiAround(LocalProjectUpdateV30RequestAudiencePoiAround poiAround) {
    
    this.poiAround = poiAround;
    return this;
  }

   /**
   * Get poiAround
   * @return poiAround
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30RequestAudiencePoiAround getPoiAround() {
    return poiAround;
  }


  public void setPoiAround(LocalProjectUpdateV30RequestAudiencePoiAround poiAround) {
    this.poiAround = poiAround;
  }


  public LocalProjectUpdateV30RequestAudience region(LocalProjectUpdateV30RequestAudienceRegion region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30RequestAudienceRegion getRegion() {
    return region;
  }


  public void setRegion(LocalProjectUpdateV30RequestAudienceRegion region) {
    this.region = region;
  }


  public LocalProjectUpdateV30RequestAudience retargetingTags(List<Long> retargetingTags) {
    
    this.retargetingTags = retargetingTags;
    return this;
  }

  public LocalProjectUpdateV30RequestAudience addRetargetingTagsItem(Long retargetingTagsItem) {
    if (this.retargetingTags == null) {
      this.retargetingTags = new ArrayList<>();
    }
    this.retargetingTags.add(retargetingTagsItem);
    return this;
  }

   /**
   * 定向人群包
   * @return retargetingTags
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTags() {
    return retargetingTags;
  }


  public void setRetargetingTags(List<Long> retargetingTags) {
    this.retargetingTags = retargetingTags;
  }


  public LocalProjectUpdateV30RequestAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public LocalProjectUpdateV30RequestAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 排除人群包
   * @return retargetingTagsExclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsExclude() {
    return retargetingTagsExclude;
  }


  public void setRetargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectUpdateV30RequestAudience localProjectUpdateV30RequestAudience = (LocalProjectUpdateV30RequestAudience) o;
    return Objects.equals(this.age, localProjectUpdateV30RequestAudience.age) &&
        Objects.equals(this.convertedTimeDuration, localProjectUpdateV30RequestAudience.convertedTimeDuration) &&
        Objects.equals(this.customArea, localProjectUpdateV30RequestAudience.customArea) &&
        Objects.equals(this.district, localProjectUpdateV30RequestAudience.district) &&
        Objects.equals(this.gender, localProjectUpdateV30RequestAudience.gender) &&
        Objects.equals(this.hideIfConverted, localProjectUpdateV30RequestAudience.hideIfConverted) &&
        Objects.equals(this.poiAround, localProjectUpdateV30RequestAudience.poiAround) &&
        Objects.equals(this.region, localProjectUpdateV30RequestAudience.region) &&
        Objects.equals(this.retargetingTags, localProjectUpdateV30RequestAudience.retargetingTags) &&
        Objects.equals(this.retargetingTagsExclude, localProjectUpdateV30RequestAudience.retargetingTagsExclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, convertedTimeDuration, customArea, district, gender, hideIfConverted, poiAround, region, retargetingTags, retargetingTagsExclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectUpdateV30RequestAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    convertedTimeDuration: ").append(toIndentedString(convertedTimeDuration)).append("\n");
    sb.append("    customArea: ").append(toIndentedString(customArea)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    hideIfConverted: ").append(toIndentedString(hideIfConverted)).append("\n");
    sb.append("    poiAround: ").append(toIndentedString(poiAround)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    retargetingTags: ").append(toIndentedString(retargetingTags)).append("\n");
    sb.append("    retargetingTagsExclude: ").append(toIndentedString(retargetingTagsExclude)).append("\n");
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
    openapiFields.add("converted_time_duration");
    openapiFields.add("custom_area");
    openapiFields.add("district");
    openapiFields.add("gender");
    openapiFields.add("hide_if_converted");
    openapiFields.add("poi_around");
    openapiFields.add("region");
    openapiFields.add("retargeting_tags");
    openapiFields.add("retargeting_tags_exclude");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectUpdateV30RequestAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectUpdateV30RequestAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectUpdateV30RequestAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectUpdateV30RequestAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectUpdateV30RequestAudience>() {
           @Override
           public void write(JsonWriter out, LocalProjectUpdateV30RequestAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectUpdateV30RequestAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectUpdateV30RequestAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectUpdateV30RequestAudience
  * @throws IOException if the JSON string is invalid with respect to LocalProjectUpdateV30RequestAudience
  */
  public static LocalProjectUpdateV30RequestAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectUpdateV30RequestAudience.class);
  }

 /**
  * Convert an instance of LocalProjectUpdateV30RequestAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

