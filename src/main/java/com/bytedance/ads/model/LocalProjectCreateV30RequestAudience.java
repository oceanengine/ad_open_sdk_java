/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalProjectCreateV30AudienceAge;
import com.bytedance.ads.model.LocalProjectCreateV30AudienceConvertedTimeDuration;
import com.bytedance.ads.model.LocalProjectCreateV30AudienceDistrict;
import com.bytedance.ads.model.LocalProjectCreateV30AudienceGender;
import com.bytedance.ads.model.LocalProjectCreateV30AudienceHideIfConverted;
import com.bytedance.ads.model.LocalProjectCreateV30RequestAudienceCustomArea;
import com.bytedance.ads.model.LocalProjectCreateV30RequestAudiencePoiAround;
import com.bytedance.ads.model.LocalProjectCreateV30RequestAudienceRegion;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class LocalProjectCreateV30RequestAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<LocalProjectCreateV30AudienceAge> age = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private LocalProjectCreateV30AudienceConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_CUSTOM_AREA = "custom_area";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AREA)
  private LocalProjectCreateV30RequestAudienceCustomArea customArea = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private LocalProjectCreateV30AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private LocalProjectCreateV30AudienceGender gender = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private LocalProjectCreateV30AudienceHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_POI_AROUND = "poi_around";
  @SerializedName(SERIALIZED_NAME_POI_AROUND)
  private LocalProjectCreateV30RequestAudiencePoiAround poiAround = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private LocalProjectCreateV30RequestAudienceRegion region = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS = "retargeting_tags";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS)
  private List<Long> retargetingTags = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public LocalProjectCreateV30RequestAudience() {
  }

  public LocalProjectCreateV30RequestAudience age(List<LocalProjectCreateV30AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public LocalProjectCreateV30RequestAudience addAgeItem(LocalProjectCreateV30AudienceAge ageItem) {
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
  public List<LocalProjectCreateV30AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<LocalProjectCreateV30AudienceAge> age) {
    this.age = age;
  }


  public LocalProjectCreateV30RequestAudience convertedTimeDuration(LocalProjectCreateV30AudienceConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30AudienceConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(LocalProjectCreateV30AudienceConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public LocalProjectCreateV30RequestAudience customArea(LocalProjectCreateV30RequestAudienceCustomArea customArea) {
    
    this.customArea = customArea;
    return this;
  }

   /**
   * Get customArea
   * @return customArea
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30RequestAudienceCustomArea getCustomArea() {
    return customArea;
  }


  public void setCustomArea(LocalProjectCreateV30RequestAudienceCustomArea customArea) {
    this.customArea = customArea;
  }


  public LocalProjectCreateV30RequestAudience district(LocalProjectCreateV30AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nonnull
  public LocalProjectCreateV30AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(LocalProjectCreateV30AudienceDistrict district) {
    this.district = district;
  }


  public LocalProjectCreateV30RequestAudience gender(LocalProjectCreateV30AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30AudienceGender getGender() {
    return gender;
  }


  public void setGender(LocalProjectCreateV30AudienceGender gender) {
    this.gender = gender;
  }


  public LocalProjectCreateV30RequestAudience hideIfConverted(LocalProjectCreateV30AudienceHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30AudienceHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(LocalProjectCreateV30AudienceHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public LocalProjectCreateV30RequestAudience poiAround(LocalProjectCreateV30RequestAudiencePoiAround poiAround) {
    
    this.poiAround = poiAround;
    return this;
  }

   /**
   * Get poiAround
   * @return poiAround
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30RequestAudiencePoiAround getPoiAround() {
    return poiAround;
  }


  public void setPoiAround(LocalProjectCreateV30RequestAudiencePoiAround poiAround) {
    this.poiAround = poiAround;
  }


  public LocalProjectCreateV30RequestAudience region(LocalProjectCreateV30RequestAudienceRegion region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30RequestAudienceRegion getRegion() {
    return region;
  }


  public void setRegion(LocalProjectCreateV30RequestAudienceRegion region) {
    this.region = region;
  }


  public LocalProjectCreateV30RequestAudience retargetingTags(List<Long> retargetingTags) {
    
    this.retargetingTags = retargetingTags;
    return this;
  }

  public LocalProjectCreateV30RequestAudience addRetargetingTagsItem(Long retargetingTagsItem) {
    if (this.retargetingTags == null) {
      this.retargetingTags = new ArrayList<>();
    }
    this.retargetingTags.add(retargetingTagsItem);
    return this;
  }

   /**
   * 定向人群包ID
   * @return retargetingTags
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTags() {
    return retargetingTags;
  }


  public void setRetargetingTags(List<Long> retargetingTags) {
    this.retargetingTags = retargetingTags;
  }


  public LocalProjectCreateV30RequestAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public LocalProjectCreateV30RequestAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 排除人群包ID
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
    LocalProjectCreateV30RequestAudience localProjectCreateV30RequestAudience = (LocalProjectCreateV30RequestAudience) o;
    return Objects.equals(this.age, localProjectCreateV30RequestAudience.age) &&
        Objects.equals(this.convertedTimeDuration, localProjectCreateV30RequestAudience.convertedTimeDuration) &&
        Objects.equals(this.customArea, localProjectCreateV30RequestAudience.customArea) &&
        Objects.equals(this.district, localProjectCreateV30RequestAudience.district) &&
        Objects.equals(this.gender, localProjectCreateV30RequestAudience.gender) &&
        Objects.equals(this.hideIfConverted, localProjectCreateV30RequestAudience.hideIfConverted) &&
        Objects.equals(this.poiAround, localProjectCreateV30RequestAudience.poiAround) &&
        Objects.equals(this.region, localProjectCreateV30RequestAudience.region) &&
        Objects.equals(this.retargetingTags, localProjectCreateV30RequestAudience.retargetingTags) &&
        Objects.equals(this.retargetingTagsExclude, localProjectCreateV30RequestAudience.retargetingTagsExclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, convertedTimeDuration, customArea, district, gender, hideIfConverted, poiAround, region, retargetingTags, retargetingTagsExclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectCreateV30RequestAudience {\n");
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
    openapiRequiredFields.add("district");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectCreateV30RequestAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectCreateV30RequestAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectCreateV30RequestAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectCreateV30RequestAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectCreateV30RequestAudience>() {
           @Override
           public void write(JsonWriter out, LocalProjectCreateV30RequestAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectCreateV30RequestAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectCreateV30RequestAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectCreateV30RequestAudience
  * @throws IOException if the JSON string is invalid with respect to LocalProjectCreateV30RequestAudience
  */
  public static LocalProjectCreateV30RequestAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectCreateV30RequestAudience.class);
  }

 /**
  * Convert an instance of LocalProjectCreateV30RequestAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

