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
import com.bytedance.ads.model.LocalProjectDetailV30DataAudienceAge;
import com.bytedance.ads.model.LocalProjectDetailV30DataAudienceConvertedTimeDuration;
import com.bytedance.ads.model.LocalProjectDetailV30DataAudienceDistrict;
import com.bytedance.ads.model.LocalProjectDetailV30DataAudienceGender;
import com.bytedance.ads.model.LocalProjectDetailV30DataAudienceHideIfConverted;
import com.bytedance.ads.model.LocalProjectDetailV30ResponseDataAudienceCustomAreaInner;
import com.bytedance.ads.model.LocalProjectDetailV30ResponseDataAudiencePoiAround;
import com.bytedance.ads.model.LocalProjectDetailV30ResponseDataAudienceRegion;
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
 * 定向相关数据
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class LocalProjectDetailV30ResponseDataAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<LocalProjectDetailV30DataAudienceAge> age = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private LocalProjectDetailV30DataAudienceConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_CUSTOM_AREA = "custom_area";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AREA)
  private List<LocalProjectDetailV30ResponseDataAudienceCustomAreaInner> customArea = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private LocalProjectDetailV30DataAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private LocalProjectDetailV30DataAudienceGender gender = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private LocalProjectDetailV30DataAudienceHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_POI_AROUND = "poi_around";
  @SerializedName(SERIALIZED_NAME_POI_AROUND)
  private LocalProjectDetailV30ResponseDataAudiencePoiAround poiAround = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private LocalProjectDetailV30ResponseDataAudienceRegion region = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS = "retargeting_tags";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS)
  private List<Long> retargetingTags = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public LocalProjectDetailV30ResponseDataAudience() {
  }

  public LocalProjectDetailV30ResponseDataAudience age(List<LocalProjectDetailV30DataAudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public LocalProjectDetailV30ResponseDataAudience addAgeItem(LocalProjectDetailV30DataAudienceAge ageItem) {
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
  public List<LocalProjectDetailV30DataAudienceAge> getAge() {
    return age;
  }


  public void setAge(List<LocalProjectDetailV30DataAudienceAge> age) {
    this.age = age;
  }


  public LocalProjectDetailV30ResponseDataAudience convertedTimeDuration(LocalProjectDetailV30DataAudienceConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public LocalProjectDetailV30DataAudienceConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(LocalProjectDetailV30DataAudienceConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public LocalProjectDetailV30ResponseDataAudience customArea(List<LocalProjectDetailV30ResponseDataAudienceCustomAreaInner> customArea) {
    
    this.customArea = customArea;
    return this;
  }

  public LocalProjectDetailV30ResponseDataAudience addCustomAreaItem(LocalProjectDetailV30ResponseDataAudienceCustomAreaInner customAreaItem) {
    if (this.customArea == null) {
      this.customArea = new ArrayList<>();
    }
    this.customArea.add(customAreaItem);
    return this;
  }

   /**
   * 自定义区域定向设置
   * @return customArea
  **/
  @javax.annotation.Nullable
  public List<LocalProjectDetailV30ResponseDataAudienceCustomAreaInner> getCustomArea() {
    return customArea;
  }


  public void setCustomArea(List<LocalProjectDetailV30ResponseDataAudienceCustomAreaInner> customArea) {
    this.customArea = customArea;
  }


  public LocalProjectDetailV30ResponseDataAudience district(LocalProjectDetailV30DataAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public LocalProjectDetailV30DataAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(LocalProjectDetailV30DataAudienceDistrict district) {
    this.district = district;
  }


  public LocalProjectDetailV30ResponseDataAudience gender(LocalProjectDetailV30DataAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public LocalProjectDetailV30DataAudienceGender getGender() {
    return gender;
  }


  public void setGender(LocalProjectDetailV30DataAudienceGender gender) {
    this.gender = gender;
  }


  public LocalProjectDetailV30ResponseDataAudience hideIfConverted(LocalProjectDetailV30DataAudienceHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public LocalProjectDetailV30DataAudienceHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(LocalProjectDetailV30DataAudienceHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public LocalProjectDetailV30ResponseDataAudience poiAround(LocalProjectDetailV30ResponseDataAudiencePoiAround poiAround) {
    
    this.poiAround = poiAround;
    return this;
  }

   /**
   * Get poiAround
   * @return poiAround
  **/
  @javax.annotation.Nullable
  public LocalProjectDetailV30ResponseDataAudiencePoiAround getPoiAround() {
    return poiAround;
  }


  public void setPoiAround(LocalProjectDetailV30ResponseDataAudiencePoiAround poiAround) {
    this.poiAround = poiAround;
  }


  public LocalProjectDetailV30ResponseDataAudience region(LocalProjectDetailV30ResponseDataAudienceRegion region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  public LocalProjectDetailV30ResponseDataAudienceRegion getRegion() {
    return region;
  }


  public void setRegion(LocalProjectDetailV30ResponseDataAudienceRegion region) {
    this.region = region;
  }


  public LocalProjectDetailV30ResponseDataAudience retargetingTags(List<Long> retargetingTags) {
    
    this.retargetingTags = retargetingTags;
    return this;
  }

  public LocalProjectDetailV30ResponseDataAudience addRetargetingTagsItem(Long retargetingTagsItem) {
    if (this.retargetingTags == null) {
      this.retargetingTags = new ArrayList<>();
    }
    this.retargetingTags.add(retargetingTagsItem);
    return this;
  }

   /**
   * 定向人群包列表
   * @return retargetingTags
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTags() {
    return retargetingTags;
  }


  public void setRetargetingTags(List<Long> retargetingTags) {
    this.retargetingTags = retargetingTags;
  }


  public LocalProjectDetailV30ResponseDataAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public LocalProjectDetailV30ResponseDataAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 排除人群包列表
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
    LocalProjectDetailV30ResponseDataAudience localProjectDetailV30ResponseDataAudience = (LocalProjectDetailV30ResponseDataAudience) o;
    return Objects.equals(this.age, localProjectDetailV30ResponseDataAudience.age) &&
        Objects.equals(this.convertedTimeDuration, localProjectDetailV30ResponseDataAudience.convertedTimeDuration) &&
        Objects.equals(this.customArea, localProjectDetailV30ResponseDataAudience.customArea) &&
        Objects.equals(this.district, localProjectDetailV30ResponseDataAudience.district) &&
        Objects.equals(this.gender, localProjectDetailV30ResponseDataAudience.gender) &&
        Objects.equals(this.hideIfConverted, localProjectDetailV30ResponseDataAudience.hideIfConverted) &&
        Objects.equals(this.poiAround, localProjectDetailV30ResponseDataAudience.poiAround) &&
        Objects.equals(this.region, localProjectDetailV30ResponseDataAudience.region) &&
        Objects.equals(this.retargetingTags, localProjectDetailV30ResponseDataAudience.retargetingTags) &&
        Objects.equals(this.retargetingTagsExclude, localProjectDetailV30ResponseDataAudience.retargetingTagsExclude);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, convertedTimeDuration, customArea, district, gender, hideIfConverted, poiAround, region, retargetingTags, retargetingTagsExclude);
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
    sb.append("class LocalProjectDetailV30ResponseDataAudience {\n");
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
       if (!LocalProjectDetailV30ResponseDataAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectDetailV30ResponseDataAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectDetailV30ResponseDataAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectDetailV30ResponseDataAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectDetailV30ResponseDataAudience>() {
           @Override
           public void write(JsonWriter out, LocalProjectDetailV30ResponseDataAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectDetailV30ResponseDataAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectDetailV30ResponseDataAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectDetailV30ResponseDataAudience
  * @throws IOException if the JSON string is invalid with respect to LocalProjectDetailV30ResponseDataAudience
  */
  public static LocalProjectDetailV30ResponseDataAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectDetailV30ResponseDataAudience.class);
  }

 /**
  * Convert an instance of LocalProjectDetailV30ResponseDataAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

