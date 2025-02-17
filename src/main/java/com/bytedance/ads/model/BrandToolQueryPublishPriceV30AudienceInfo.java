/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AudienceInfoAc;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AudienceInfoAges;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AudienceInfoDistrictInfo;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AudienceInfoGender;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AudienceInfoPlatform;
import com.bytedance.ads.model.BrandToolQueryPublishPriceV30AudienceInfoRetargetingInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandToolQueryPublishPriceV30AudienceInfo {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private BrandToolQueryPublishPriceV30AudienceInfoAc ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_AGES = "ages";
  @SerializedName(SERIALIZED_NAME_AGES)
  private List<BrandToolQueryPublishPriceV30AudienceInfoAges> ages = null;

  public static final String SERIALIZED_NAME_DISTRICT_INFO = "district_info";
  @SerializedName(SERIALIZED_NAME_DISTRICT_INFO)
  private BrandToolQueryPublishPriceV30AudienceInfoDistrictInfo districtInfo = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private BrandToolQueryPublishPriceV30AudienceInfoGender gender = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private BrandToolQueryPublishPriceV30AudienceInfoPlatform platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_INFO = "retargeting_info";
  @SerializedName(SERIALIZED_NAME_RETARGETING_INFO)
  private BrandToolQueryPublishPriceV30AudienceInfoRetargetingInfo retargetingInfo = null;

  public BrandToolQueryPublishPriceV30AudienceInfo() {
  }

  public BrandToolQueryPublishPriceV30AudienceInfo ac(BrandToolQueryPublishPriceV30AudienceInfoAc ac) {
    
    this.ac = ac;
    return this;
  }

   /**
   * Get ac
   * @return ac
  **/
  @javax.annotation.Nullable
  public BrandToolQueryPublishPriceV30AudienceInfoAc getAc() {
    return ac;
  }


  public void setAc(BrandToolQueryPublishPriceV30AudienceInfoAc ac) {
    this.ac = ac;
  }


  public BrandToolQueryPublishPriceV30AudienceInfo actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public BrandToolQueryPublishPriceV30AudienceInfo addActionCategoriesItem(Long actionCategoriesItem) {
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


  public BrandToolQueryPublishPriceV30AudienceInfo ages(List<BrandToolQueryPublishPriceV30AudienceInfoAges> ages) {
    
    this.ages = ages;
    return this;
  }

  public BrandToolQueryPublishPriceV30AudienceInfo addAgesItem(BrandToolQueryPublishPriceV30AudienceInfoAges agesItem) {
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
  public List<BrandToolQueryPublishPriceV30AudienceInfoAges> getAges() {
    return ages;
  }


  public void setAges(List<BrandToolQueryPublishPriceV30AudienceInfoAges> ages) {
    this.ages = ages;
  }


  public BrandToolQueryPublishPriceV30AudienceInfo districtInfo(BrandToolQueryPublishPriceV30AudienceInfoDistrictInfo districtInfo) {
    
    this.districtInfo = districtInfo;
    return this;
  }

   /**
   * Get districtInfo
   * @return districtInfo
  **/
  @javax.annotation.Nullable
  public BrandToolQueryPublishPriceV30AudienceInfoDistrictInfo getDistrictInfo() {
    return districtInfo;
  }


  public void setDistrictInfo(BrandToolQueryPublishPriceV30AudienceInfoDistrictInfo districtInfo) {
    this.districtInfo = districtInfo;
  }


  public BrandToolQueryPublishPriceV30AudienceInfo gender(BrandToolQueryPublishPriceV30AudienceInfoGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public BrandToolQueryPublishPriceV30AudienceInfoGender getGender() {
    return gender;
  }


  public void setGender(BrandToolQueryPublishPriceV30AudienceInfoGender gender) {
    this.gender = gender;
  }


  public BrandToolQueryPublishPriceV30AudienceInfo platform(BrandToolQueryPublishPriceV30AudienceInfoPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public BrandToolQueryPublishPriceV30AudienceInfoPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(BrandToolQueryPublishPriceV30AudienceInfoPlatform platform) {
    this.platform = platform;
  }


  public BrandToolQueryPublishPriceV30AudienceInfo retargetingInfo(BrandToolQueryPublishPriceV30AudienceInfoRetargetingInfo retargetingInfo) {
    
    this.retargetingInfo = retargetingInfo;
    return this;
  }

   /**
   * Get retargetingInfo
   * @return retargetingInfo
  **/
  @javax.annotation.Nullable
  public BrandToolQueryPublishPriceV30AudienceInfoRetargetingInfo getRetargetingInfo() {
    return retargetingInfo;
  }


  public void setRetargetingInfo(BrandToolQueryPublishPriceV30AudienceInfoRetargetingInfo retargetingInfo) {
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
    BrandToolQueryPublishPriceV30AudienceInfo brandToolQueryPublishPriceV30AudienceInfo = (BrandToolQueryPublishPriceV30AudienceInfo) o;
    return Objects.equals(this.ac, brandToolQueryPublishPriceV30AudienceInfo.ac) &&
        Objects.equals(this.actionCategories, brandToolQueryPublishPriceV30AudienceInfo.actionCategories) &&
        Objects.equals(this.ages, brandToolQueryPublishPriceV30AudienceInfo.ages) &&
        Objects.equals(this.districtInfo, brandToolQueryPublishPriceV30AudienceInfo.districtInfo) &&
        Objects.equals(this.gender, brandToolQueryPublishPriceV30AudienceInfo.gender) &&
        Objects.equals(this.platform, brandToolQueryPublishPriceV30AudienceInfo.platform) &&
        Objects.equals(this.retargetingInfo, brandToolQueryPublishPriceV30AudienceInfo.retargetingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategories, ages, districtInfo, gender, platform, retargetingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandToolQueryPublishPriceV30AudienceInfo {\n");
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
       if (!BrandToolQueryPublishPriceV30AudienceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandToolQueryPublishPriceV30AudienceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandToolQueryPublishPriceV30AudienceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandToolQueryPublishPriceV30AudienceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandToolQueryPublishPriceV30AudienceInfo>() {
           @Override
           public void write(JsonWriter out, BrandToolQueryPublishPriceV30AudienceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandToolQueryPublishPriceV30AudienceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandToolQueryPublishPriceV30AudienceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandToolQueryPublishPriceV30AudienceInfo
  * @throws IOException if the JSON string is invalid with respect to BrandToolQueryPublishPriceV30AudienceInfo
  */
  public static BrandToolQueryPublishPriceV30AudienceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandToolQueryPublishPriceV30AudienceInfo.class);
  }

 /**
  * Convert an instance of BrandToolQueryPublishPriceV30AudienceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

