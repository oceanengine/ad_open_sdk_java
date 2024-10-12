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
import com.bytedance.ads.model.DouplusOrderCreateV30TargetingAge;
import com.bytedance.ads.model.DouplusOrderCreateV30TargetingAudienceMode;
import com.bytedance.ads.model.DouplusOrderCreateV30TargetingGender;
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
 * 定向设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class DouplusOrderCreateV30RequestTargeting {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<DouplusOrderCreateV30TargetingAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private DouplusOrderCreateV30TargetingAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUDIENCE_PKG_ID = "audience_pkg_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_PKG_ID)
  private Long audiencePkgId = null;

  public static final String SERIALIZED_NAME_DMP_PKG_IDS = "dmp_pkg_ids";
  @SerializedName(SERIALIZED_NAME_DMP_PKG_IDS)
  private List<Long> dmpPkgIds = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private DouplusOrderCreateV30TargetingGender gender = null;

  public DouplusOrderCreateV30RequestTargeting() {
  }

  public DouplusOrderCreateV30RequestTargeting age(List<DouplusOrderCreateV30TargetingAge> age) {
    
    this.age = age;
    return this;
  }

  public DouplusOrderCreateV30RequestTargeting addAgeItem(DouplusOrderCreateV30TargetingAge ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 年龄，允许值：若不传值，则默认为不限 AGE_BETWEEN_18_23：18-23岁、 AGE_BETWEEN_24_30：24-30岁、 AGE_BETWEEN_31_40：31-40岁、 AGE_BETWEEN_41_49：41-49岁 注意：仅想吸引的观众类型为”CUSTOM”时，有效
   * @return age
  **/
  @javax.annotation.Nullable
  public List<DouplusOrderCreateV30TargetingAge> getAge() {
    return age;
  }


  public void setAge(List<DouplusOrderCreateV30TargetingAge> age) {
    this.age = age;
  }


  public DouplusOrderCreateV30RequestTargeting audienceMode(DouplusOrderCreateV30TargetingAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nonnull
  public DouplusOrderCreateV30TargetingAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(DouplusOrderCreateV30TargetingAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public DouplusOrderCreateV30RequestTargeting audiencePkgId(Long audiencePkgId) {
    
    this.audiencePkgId = audiencePkgId;
    return this;
  }

   /**
   * 具体定向包id 注意：想吸引的观众类型为”AUDIENCE_PKG”时，必填
   * @return audiencePkgId
  **/
  @javax.annotation.Nullable
  public Long getAudiencePkgId() {
    return audiencePkgId;
  }


  public void setAudiencePkgId(Long audiencePkgId) {
    this.audiencePkgId = audiencePkgId;
  }


  public DouplusOrderCreateV30RequestTargeting dmpPkgIds(List<Long> dmpPkgIds) {
    
    this.dmpPkgIds = dmpPkgIds;
    return this;
  }

  public DouplusOrderCreateV30RequestTargeting addDmpPkgIdsItem(Long dmpPkgIdsItem) {
    if (this.dmpPkgIds == null) {
      this.dmpPkgIds = new ArrayList<>();
    }
    this.dmpPkgIds.add(dmpPkgIdsItem);
    return this;
  }

   /**
   * 定向人群包ID（需客户从网页版查询获取） 注意：仅想吸引的观众类型为”DMP_PKG”时，有效
   * @return dmpPkgIds
  **/
  @javax.annotation.Nullable
  public List<Long> getDmpPkgIds() {
    return dmpPkgIds;
  }


  public void setDmpPkgIds(List<Long> dmpPkgIds) {
    this.dmpPkgIds = dmpPkgIds;
  }


  public DouplusOrderCreateV30RequestTargeting gender(DouplusOrderCreateV30TargetingGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public DouplusOrderCreateV30TargetingGender getGender() {
    return gender;
  }


  public void setGender(DouplusOrderCreateV30TargetingGender gender) {
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
    DouplusOrderCreateV30RequestTargeting douplusOrderCreateV30RequestTargeting = (DouplusOrderCreateV30RequestTargeting) o;
    return Objects.equals(this.age, douplusOrderCreateV30RequestTargeting.age) &&
        Objects.equals(this.audienceMode, douplusOrderCreateV30RequestTargeting.audienceMode) &&
        Objects.equals(this.audiencePkgId, douplusOrderCreateV30RequestTargeting.audiencePkgId) &&
        Objects.equals(this.dmpPkgIds, douplusOrderCreateV30RequestTargeting.dmpPkgIds) &&
        Objects.equals(this.gender, douplusOrderCreateV30RequestTargeting.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audienceMode, audiencePkgId, dmpPkgIds, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderCreateV30RequestTargeting {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audienceMode: ").append(toIndentedString(audienceMode)).append("\n");
    sb.append("    audiencePkgId: ").append(toIndentedString(audiencePkgId)).append("\n");
    sb.append("    dmpPkgIds: ").append(toIndentedString(dmpPkgIds)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("audience_mode");
    openapiFields.add("audience_pkg_id");
    openapiFields.add("dmp_pkg_ids");
    openapiFields.add("gender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audience_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderCreateV30RequestTargeting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderCreateV30RequestTargeting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderCreateV30RequestTargeting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderCreateV30RequestTargeting.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderCreateV30RequestTargeting>() {
           @Override
           public void write(JsonWriter out, DouplusOrderCreateV30RequestTargeting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderCreateV30RequestTargeting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderCreateV30RequestTargeting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderCreateV30RequestTargeting
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderCreateV30RequestTargeting
  */
  public static DouplusOrderCreateV30RequestTargeting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderCreateV30RequestTargeting.class);
  }

 /**
  * Convert an instance of DouplusOrderCreateV30RequestTargeting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

