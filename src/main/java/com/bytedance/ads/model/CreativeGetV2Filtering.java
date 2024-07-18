/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeGetV2FilteringImageMode;
import com.bytedance.ads.model.CreativeGetV2FilteringLandingType;
import com.bytedance.ads.model.CreativeGetV2FilteringPricing;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class CreativeGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CREATIVE_CREATE_TIME = "creative_create_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CREATE_TIME)
  private String creativeCreateTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_CREATIVE_MODIFY_TIME = "creative_modify_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MODIFY_TIME)
  private String creativeModifyTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_TITLE = "creative_title";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TITLE)
  private String creativeTitle = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeGetV2FilteringImageMode imageMode = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private CreativeGetV2FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private CreativeGetV2FilteringPricing pricing = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public CreativeGetV2Filtering() {
  }

  public CreativeGetV2Filtering adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 按照ad_id过滤
   * minimum: 1
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public CreativeGetV2Filtering campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 按照campaign_id过滤
   * minimum: 1
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CreativeGetV2Filtering creativeCreateTime(String creativeCreateTime) {
    
    this.creativeCreateTime = creativeCreateTime;
    return this;
  }

   /**
   * 广告创意创建时间，格式yyyy-MM-dd，表示过滤出当天创建的广告创意
   * @return creativeCreateTime
  **/
  @javax.annotation.Nullable
  public String getCreativeCreateTime() {
    return creativeCreateTime;
  }


  public void setCreativeCreateTime(String creativeCreateTime) {
    this.creativeCreateTime = creativeCreateTime;
  }


  public CreativeGetV2Filtering creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public CreativeGetV2Filtering addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * 按照creative_id过滤，最多传100个。创意ID需属于当前广告主，否则会报错
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public CreativeGetV2Filtering creativeModifyTime(String creativeModifyTime) {
    
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

   /**
   * 广告创意更新时间，格式yyyy-MM-dd，表示过滤出当天更新的广告创意
   * @return creativeModifyTime
  **/
  @javax.annotation.Nullable
  public String getCreativeModifyTime() {
    return creativeModifyTime;
  }


  public void setCreativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
  }


  public CreativeGetV2Filtering creativeTitle(String creativeTitle) {
    
    this.creativeTitle = creativeTitle;
    return this;
  }

   /**
   * 按照creative_title过滤，支持模糊搜索。支持的最大长度为30
   * @return creativeTitle
  **/
  @javax.annotation.Nullable
  public String getCreativeTitle() {
    return creativeTitle;
  }


  public void setCreativeTitle(String creativeTitle) {
    this.creativeTitle = creativeTitle;
  }


  public CreativeGetV2Filtering imageMode(CreativeGetV2FilteringImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeGetV2FilteringImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeGetV2FilteringImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeGetV2Filtering landingType(CreativeGetV2FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public CreativeGetV2FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(CreativeGetV2FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public CreativeGetV2Filtering pricing(CreativeGetV2FilteringPricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  public CreativeGetV2FilteringPricing getPricing() {
    return pricing;
  }


  public void setPricing(CreativeGetV2FilteringPricing pricing) {
    this.pricing = pricing;
  }


  public CreativeGetV2Filtering status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 按照创意状态过滤，默认为返回“所有不包含已删除”，如果要返回所有包含已删除有对应枚举表示，[【附录-广告创意状态】](https://ad.oceanengine.com/openapi/doc/index.html?id&#x3D;1696710760171535)
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeGetV2Filtering creativeGetV2Filtering = (CreativeGetV2Filtering) o;
    return Objects.equals(this.adId, creativeGetV2Filtering.adId) &&
        Objects.equals(this.campaignId, creativeGetV2Filtering.campaignId) &&
        Objects.equals(this.creativeCreateTime, creativeGetV2Filtering.creativeCreateTime) &&
        Objects.equals(this.creativeIds, creativeGetV2Filtering.creativeIds) &&
        Objects.equals(this.creativeModifyTime, creativeGetV2Filtering.creativeModifyTime) &&
        Objects.equals(this.creativeTitle, creativeGetV2Filtering.creativeTitle) &&
        Objects.equals(this.imageMode, creativeGetV2Filtering.imageMode) &&
        Objects.equals(this.landingType, creativeGetV2Filtering.landingType) &&
        Objects.equals(this.pricing, creativeGetV2Filtering.pricing) &&
        Objects.equals(this.status, creativeGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, campaignId, creativeCreateTime, creativeIds, creativeModifyTime, creativeTitle, imageMode, landingType, pricing, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeGetV2Filtering {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    creativeCreateTime: ").append(toIndentedString(creativeCreateTime)).append("\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    creativeModifyTime: ").append(toIndentedString(creativeModifyTime)).append("\n");
    sb.append("    creativeTitle: ").append(toIndentedString(creativeTitle)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("campaign_id");
    openapiFields.add("creative_create_time");
    openapiFields.add("creative_ids");
    openapiFields.add("creative_modify_time");
    openapiFields.add("creative_title");
    openapiFields.add("image_mode");
    openapiFields.add("landing_type");
    openapiFields.add("pricing");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, CreativeGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to CreativeGetV2Filtering
  */
  public static CreativeGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeGetV2Filtering.class);
  }

 /**
  * Convert an instance of CreativeGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

