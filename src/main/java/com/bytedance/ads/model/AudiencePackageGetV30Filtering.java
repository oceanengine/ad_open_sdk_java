/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AudiencePackageGetV30FilteringAdType;
import com.bytedance.ads.model.AudiencePackageGetV30FilteringDeliveryRange;
import com.bytedance.ads.model.AudiencePackageGetV30FilteringLandingType;
import com.bytedance.ads.model.AudiencePackageGetV30FilteringMarketingGoal;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class AudiencePackageGetV30Filtering {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private AudiencePackageGetV30FilteringAdType adType = null;

  public static final String SERIALIZED_NAME_DELIVERY_RANGE = "delivery_range";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RANGE)
  private AudiencePackageGetV30FilteringDeliveryRange deliveryRange = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private AudiencePackageGetV30FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private AudiencePackageGetV30FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public AudiencePackageGetV30Filtering() {
  }

  public AudiencePackageGetV30Filtering adType(AudiencePackageGetV30FilteringAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV30FilteringAdType getAdType() {
    return adType;
  }


  public void setAdType(AudiencePackageGetV30FilteringAdType adType) {
    this.adType = adType;
  }


  public AudiencePackageGetV30Filtering deliveryRange(AudiencePackageGetV30FilteringDeliveryRange deliveryRange) {
    
    this.deliveryRange = deliveryRange;
    return this;
  }

   /**
   * Get deliveryRange
   * @return deliveryRange
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV30FilteringDeliveryRange getDeliveryRange() {
    return deliveryRange;
  }


  public void setDeliveryRange(AudiencePackageGetV30FilteringDeliveryRange deliveryRange) {
    this.deliveryRange = deliveryRange;
  }


  public AudiencePackageGetV30Filtering landingType(AudiencePackageGetV30FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV30FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(AudiencePackageGetV30FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public AudiencePackageGetV30Filtering marketingGoal(AudiencePackageGetV30FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public AudiencePackageGetV30FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(AudiencePackageGetV30FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public AudiencePackageGetV30Filtering name(String name) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiencePackageGetV30Filtering audiencePackageGetV30Filtering = (AudiencePackageGetV30Filtering) o;
    return Objects.equals(this.adType, audiencePackageGetV30Filtering.adType) &&
        Objects.equals(this.deliveryRange, audiencePackageGetV30Filtering.deliveryRange) &&
        Objects.equals(this.landingType, audiencePackageGetV30Filtering.landingType) &&
        Objects.equals(this.marketingGoal, audiencePackageGetV30Filtering.marketingGoal) &&
        Objects.equals(this.name, audiencePackageGetV30Filtering.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, deliveryRange, landingType, marketingGoal, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudiencePackageGetV30Filtering {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    deliveryRange: ").append(toIndentedString(deliveryRange)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("delivery_range");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_goal");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudiencePackageGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudiencePackageGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudiencePackageGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudiencePackageGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AudiencePackageGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, AudiencePackageGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AudiencePackageGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudiencePackageGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudiencePackageGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to AudiencePackageGetV30Filtering
  */
  public static AudiencePackageGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudiencePackageGetV30Filtering.class);
  }

 /**
  * Convert an instance of AudiencePackageGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

