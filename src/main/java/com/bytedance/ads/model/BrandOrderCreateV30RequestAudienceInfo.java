/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandOrderCreateV30AudienceInfoAc;
import com.bytedance.ads.model.BrandOrderCreateV30AudienceInfoAges;
import com.bytedance.ads.model.BrandOrderCreateV30AudienceInfoGender;
import com.bytedance.ads.model.BrandOrderCreateV30AudienceInfoPlatform;
import com.bytedance.ads.model.BrandOrderCreateV30RequestAudienceInfoDistrictInfo;
import com.bytedance.ads.model.BrandOrderCreateV30RequestAudienceInfoRetargetingInfo;
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
 * 定向
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class BrandOrderCreateV30RequestAudienceInfo {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private BrandOrderCreateV30AudienceInfoAc ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_AGES = "ages";
  @SerializedName(SERIALIZED_NAME_AGES)
  private List<BrandOrderCreateV30AudienceInfoAges> ages = null;

  public static final String SERIALIZED_NAME_DISTRICT_INFO = "district_info";
  @SerializedName(SERIALIZED_NAME_DISTRICT_INFO)
  private BrandOrderCreateV30RequestAudienceInfoDistrictInfo districtInfo = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private BrandOrderCreateV30AudienceInfoGender gender = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private BrandOrderCreateV30AudienceInfoPlatform platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_INFO = "retargeting_info";
  @SerializedName(SERIALIZED_NAME_RETARGETING_INFO)
  private BrandOrderCreateV30RequestAudienceInfoRetargetingInfo retargetingInfo = null;

  public BrandOrderCreateV30RequestAudienceInfo() {
  }

  public BrandOrderCreateV30RequestAudienceInfo ac(BrandOrderCreateV30AudienceInfoAc ac) {
    
    this.ac = ac;
    return this;
  }

   /**
   * Get ac
   * @return ac
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30AudienceInfoAc getAc() {
    return ac;
  }


  public void setAc(BrandOrderCreateV30AudienceInfoAc ac) {
    this.ac = ac;
  }


  public BrandOrderCreateV30RequestAudienceInfo actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public BrandOrderCreateV30RequestAudienceInfo addActionCategoriesItem(Long actionCategoriesItem) {
    if (this.actionCategories == null) {
      this.actionCategories = new ArrayList<>();
    }
    this.actionCategories.add(actionCategoriesItem);
    return this;
  }

   /**
   * 兴趣
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
  }


  public BrandOrderCreateV30RequestAudienceInfo ages(List<BrandOrderCreateV30AudienceInfoAges> ages) {
    
    this.ages = ages;
    return this;
  }

  public BrandOrderCreateV30RequestAudienceInfo addAgesItem(BrandOrderCreateV30AudienceInfoAges agesItem) {
    if (this.ages == null) {
      this.ages = new ArrayList<>();
    }
    this.ages.add(agesItem);
    return this;
  }

   /**
   * 年龄
   * @return ages
  **/
  @javax.annotation.Nullable
  public List<BrandOrderCreateV30AudienceInfoAges> getAges() {
    return ages;
  }


  public void setAges(List<BrandOrderCreateV30AudienceInfoAges> ages) {
    this.ages = ages;
  }


  public BrandOrderCreateV30RequestAudienceInfo districtInfo(BrandOrderCreateV30RequestAudienceInfoDistrictInfo districtInfo) {
    
    this.districtInfo = districtInfo;
    return this;
  }

   /**
   * Get districtInfo
   * @return districtInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30RequestAudienceInfoDistrictInfo getDistrictInfo() {
    return districtInfo;
  }


  public void setDistrictInfo(BrandOrderCreateV30RequestAudienceInfoDistrictInfo districtInfo) {
    this.districtInfo = districtInfo;
  }


  public BrandOrderCreateV30RequestAudienceInfo gender(BrandOrderCreateV30AudienceInfoGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30AudienceInfoGender getGender() {
    return gender;
  }


  public void setGender(BrandOrderCreateV30AudienceInfoGender gender) {
    this.gender = gender;
  }


  public BrandOrderCreateV30RequestAudienceInfo platform(BrandOrderCreateV30AudienceInfoPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30AudienceInfoPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(BrandOrderCreateV30AudienceInfoPlatform platform) {
    this.platform = platform;
  }


  public BrandOrderCreateV30RequestAudienceInfo retargetingInfo(BrandOrderCreateV30RequestAudienceInfoRetargetingInfo retargetingInfo) {
    
    this.retargetingInfo = retargetingInfo;
    return this;
  }

   /**
   * Get retargetingInfo
   * @return retargetingInfo
  **/
  @javax.annotation.Nullable
  public BrandOrderCreateV30RequestAudienceInfoRetargetingInfo getRetargetingInfo() {
    return retargetingInfo;
  }


  public void setRetargetingInfo(BrandOrderCreateV30RequestAudienceInfoRetargetingInfo retargetingInfo) {
    this.retargetingInfo = retargetingInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderCreateV30RequestAudienceInfo brandOrderCreateV30RequestAudienceInfo = (BrandOrderCreateV30RequestAudienceInfo) o;
    return Objects.equals(this.ac, brandOrderCreateV30RequestAudienceInfo.ac) &&
        Objects.equals(this.actionCategories, brandOrderCreateV30RequestAudienceInfo.actionCategories) &&
        Objects.equals(this.ages, brandOrderCreateV30RequestAudienceInfo.ages) &&
        Objects.equals(this.districtInfo, brandOrderCreateV30RequestAudienceInfo.districtInfo) &&
        Objects.equals(this.gender, brandOrderCreateV30RequestAudienceInfo.gender) &&
        Objects.equals(this.platform, brandOrderCreateV30RequestAudienceInfo.platform) &&
        Objects.equals(this.retargetingInfo, brandOrderCreateV30RequestAudienceInfo.retargetingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategories, ages, districtInfo, gender, platform, retargetingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandOrderCreateV30RequestAudienceInfo {\n");
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    districtInfo: ").append(toIndentedString(districtInfo)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    retargetingInfo: ").append(toIndentedString(retargetingInfo)).append("\n");
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
    openapiFields.add("ac");
    openapiFields.add("action_categories");
    openapiFields.add("ages");
    openapiFields.add("district_info");
    openapiFields.add("gender");
    openapiFields.add("platform");
    openapiFields.add("retargeting_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderCreateV30RequestAudienceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderCreateV30RequestAudienceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderCreateV30RequestAudienceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderCreateV30RequestAudienceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderCreateV30RequestAudienceInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderCreateV30RequestAudienceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderCreateV30RequestAudienceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderCreateV30RequestAudienceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderCreateV30RequestAudienceInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderCreateV30RequestAudienceInfo
  */
  public static BrandOrderCreateV30RequestAudienceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderCreateV30RequestAudienceInfo.class);
  }

 /**
  * Convert an instance of BrandOrderCreateV30RequestAudienceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

