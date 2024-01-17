/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesAppBehaviorTarget;
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration;
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesDeliveryRange;
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesHideIfConverted;
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesLandingType;
import com.bytedance.ads.model.AudiencePackageGetV2DataAudiencePackagesMarketingGoal;
import com.bytedance.ads.model.AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudience;
import com.bytedance.ads.model.AudiencePackageGetV2ResponseDataAudiencePackagesInnerBindInfoInner;
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
 * AudiencePackageGetV2ResponseDataAudiencePackagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class AudiencePackageGetV2ResponseDataAudiencePackagesInner {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private String adType = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_BEHAVIOR_TARGET = "app_behavior_target";
  @SerializedName(SERIALIZED_NAME_APP_BEHAVIOR_TARGET)
  private AudiencePackageGetV2DataAudiencePackagesAppBehaviorTarget appBehaviorTarget = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudience audience = null;

  public static final String SERIALIZED_NAME_AUDIENCE_PACKAGE_ID = "audience_package_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_PACKAGE_ID)
  private Long audiencePackageId = null;

  public static final String SERIALIZED_NAME_BIND_INFO = "bind_info";
  @SerializedName(SERIALIZED_NAME_BIND_INFO)
  private List<AudiencePackageGetV2ResponseDataAudiencePackagesInnerBindInfoInner> bindInfo = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_DELIVERY_RANGE = "delivery_range";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RANGE)
  private AudiencePackageGetV2DataAudiencePackagesDeliveryRange deliveryRange = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private AudiencePackageGetV2DataAudiencePackagesHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_HIDE_IF_EXISTS = "hide_if_exists";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_EXISTS)
  private Long hideIfExists = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private AudiencePackageGetV2DataAudiencePackagesLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private AudiencePackageGetV2DataAudiencePackagesMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SMART_TARGET = "smart_target";
  @SerializedName(SERIALIZED_NAME_SMART_TARGET)
  private List<String> smartTarget = null;

  public AudiencePackageGetV2ResponseDataAudiencePackagesInner() {
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInner adType(String adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * 
   * @return adType
  **/
  @javax.annotation.Nullable
  public String getAdType() {
    return adType;
  }


  public void setAdType(String adType) {
    this.adType = adType;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner appBehaviorTarget(AudiencePackageGetV2DataAudiencePackagesAppBehaviorTarget appBehaviorTarget) {
    
    this.appBehaviorTarget = appBehaviorTarget;
    return this;
  }

   /**
   * Get appBehaviorTarget
   * @return appBehaviorTarget
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2DataAudiencePackagesAppBehaviorTarget getAppBehaviorTarget() {
    return appBehaviorTarget;
  }


  public void setAppBehaviorTarget(AudiencePackageGetV2DataAudiencePackagesAppBehaviorTarget appBehaviorTarget) {
    this.appBehaviorTarget = appBehaviorTarget;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner audience(AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudience getAudience() {
    return audience;
  }


  public void setAudience(AudiencePackageGetV2ResponseDataAudiencePackagesInnerAudience audience) {
    this.audience = audience;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner audiencePackageId(Long audiencePackageId) {
    
    this.audiencePackageId = audiencePackageId;
    return this;
  }

   /**
   * 
   * @return audiencePackageId
  **/
  @javax.annotation.Nullable
  public Long getAudiencePackageId() {
    return audiencePackageId;
  }


  public void setAudiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner bindInfo(List<AudiencePackageGetV2ResponseDataAudiencePackagesInnerBindInfoInner> bindInfo) {
    
    this.bindInfo = bindInfo;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInner addBindInfoItem(AudiencePackageGetV2ResponseDataAudiencePackagesInnerBindInfoInner bindInfoItem) {
    if (this.bindInfo == null) {
      this.bindInfo = new ArrayList<>();
    }
    this.bindInfo.add(bindInfoItem);
    return this;
  }

   /**
   * 
   * @return bindInfo
  **/
  @javax.annotation.Nullable
  public List<AudiencePackageGetV2ResponseDataAudiencePackagesInnerBindInfoInner> getBindInfo() {
    return bindInfo;
  }


  public void setBindInfo(List<AudiencePackageGetV2ResponseDataAudiencePackagesInnerBindInfoInner> bindInfo) {
    this.bindInfo = bindInfo;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner convertedTimeDuration(AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(AudiencePackageGetV2DataAudiencePackagesConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner deliveryRange(AudiencePackageGetV2DataAudiencePackagesDeliveryRange deliveryRange) {
    
    this.deliveryRange = deliveryRange;
    return this;
  }

   /**
   * Get deliveryRange
   * @return deliveryRange
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2DataAudiencePackagesDeliveryRange getDeliveryRange() {
    return deliveryRange;
  }


  public void setDeliveryRange(AudiencePackageGetV2DataAudiencePackagesDeliveryRange deliveryRange) {
    this.deliveryRange = deliveryRange;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner hideIfConverted(AudiencePackageGetV2DataAudiencePackagesHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2DataAudiencePackagesHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(AudiencePackageGetV2DataAudiencePackagesHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner hideIfExists(Long hideIfExists) {
    
    this.hideIfExists = hideIfExists;
    return this;
  }

   /**
   * 
   * @return hideIfExists
  **/
  @javax.annotation.Nullable
  public Long getHideIfExists() {
    return hideIfExists;
  }


  public void setHideIfExists(Long hideIfExists) {
    this.hideIfExists = hideIfExists;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner landingType(AudiencePackageGetV2DataAudiencePackagesLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2DataAudiencePackagesLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(AudiencePackageGetV2DataAudiencePackagesLandingType landingType) {
    this.landingType = landingType;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner marketingGoal(AudiencePackageGetV2DataAudiencePackagesMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV2DataAudiencePackagesMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(AudiencePackageGetV2DataAudiencePackagesMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AudiencePackageGetV2ResponseDataAudiencePackagesInner smartTarget(List<String> smartTarget) {
    
    this.smartTarget = smartTarget;
    return this;
  }

  public AudiencePackageGetV2ResponseDataAudiencePackagesInner addSmartTargetItem(String smartTargetItem) {
    if (this.smartTarget == null) {
      this.smartTarget = new ArrayList<>();
    }
    this.smartTarget.add(smartTargetItem);
    return this;
  }

   /**
   * 
   * @return smartTarget
  **/
  @javax.annotation.Nullable
  public List<String> getSmartTarget() {
    return smartTarget;
  }


  public void setSmartTarget(List<String> smartTarget) {
    this.smartTarget = smartTarget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV2ResponseDataAudiencePackagesInner audiencePackageGetV2ResponseDataAudiencePackagesInner = (AudiencePackageGetV2ResponseDataAudiencePackagesInner) o;
    return Objects.equals(this.adType, audiencePackageGetV2ResponseDataAudiencePackagesInner.adType) &&
        Objects.equals(this.advertiserId, audiencePackageGetV2ResponseDataAudiencePackagesInner.advertiserId) &&
        Objects.equals(this.appBehaviorTarget, audiencePackageGetV2ResponseDataAudiencePackagesInner.appBehaviorTarget) &&
        Objects.equals(this.audience, audiencePackageGetV2ResponseDataAudiencePackagesInner.audience) &&
        Objects.equals(this.audiencePackageId, audiencePackageGetV2ResponseDataAudiencePackagesInner.audiencePackageId) &&
        Objects.equals(this.bindInfo, audiencePackageGetV2ResponseDataAudiencePackagesInner.bindInfo) &&
        Objects.equals(this.convertedTimeDuration, audiencePackageGetV2ResponseDataAudiencePackagesInner.convertedTimeDuration) &&
        Objects.equals(this.deliveryRange, audiencePackageGetV2ResponseDataAudiencePackagesInner.deliveryRange) &&
        Objects.equals(this.description, audiencePackageGetV2ResponseDataAudiencePackagesInner.description) &&
        Objects.equals(this.hideIfConverted, audiencePackageGetV2ResponseDataAudiencePackagesInner.hideIfConverted) &&
        Objects.equals(this.hideIfExists, audiencePackageGetV2ResponseDataAudiencePackagesInner.hideIfExists) &&
        Objects.equals(this.landingType, audiencePackageGetV2ResponseDataAudiencePackagesInner.landingType) &&
        Objects.equals(this.marketingGoal, audiencePackageGetV2ResponseDataAudiencePackagesInner.marketingGoal) &&
        Objects.equals(this.name, audiencePackageGetV2ResponseDataAudiencePackagesInner.name) &&
        Objects.equals(this.smartTarget, audiencePackageGetV2ResponseDataAudiencePackagesInner.smartTarget);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, advertiserId, appBehaviorTarget, audience, audiencePackageId, bindInfo, convertedTimeDuration, deliveryRange, description, hideIfConverted, hideIfExists, landingType, marketingGoal, name, smartTarget);
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
    sb.append("class AudiencePackageGetV2ResponseDataAudiencePackagesInner {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appBehaviorTarget: ").append(toIndentedString(appBehaviorTarget)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    audiencePackageId: ").append(toIndentedString(audiencePackageId)).append("\n");
    sb.append("    bindInfo: ").append(toIndentedString(bindInfo)).append("\n");
    sb.append("    convertedTimeDuration: ").append(toIndentedString(convertedTimeDuration)).append("\n");
    sb.append("    deliveryRange: ").append(toIndentedString(deliveryRange)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hideIfConverted: ").append(toIndentedString(hideIfConverted)).append("\n");
    sb.append("    hideIfExists: ").append(toIndentedString(hideIfExists)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    smartTarget: ").append(toIndentedString(smartTarget)).append("\n");
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
    openapiFields.add("ad_type");
    openapiFields.add("advertiser_id");
    openapiFields.add("app_behavior_target");
    openapiFields.add("audience");
    openapiFields.add("audience_package_id");
    openapiFields.add("bind_info");
    openapiFields.add("converted_time_duration");
    openapiFields.add("delivery_range");
    openapiFields.add("description");
    openapiFields.add("hide_if_converted");
    openapiFields.add("hide_if_exists");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_goal");
    openapiFields.add("name");
    openapiFields.add("smart_target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV2ResponseDataAudiencePackagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV2ResponseDataAudiencePackagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV2ResponseDataAudiencePackagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV2ResponseDataAudiencePackagesInner>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV2ResponseDataAudiencePackagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV2ResponseDataAudiencePackagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV2ResponseDataAudiencePackagesInner
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV2ResponseDataAudiencePackagesInner
  */
  public static AudiencePackageGetV2ResponseDataAudiencePackagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV2ResponseDataAudiencePackagesInner.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV2ResponseDataAudiencePackagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

