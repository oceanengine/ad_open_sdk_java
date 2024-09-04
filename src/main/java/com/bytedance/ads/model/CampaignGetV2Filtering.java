/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CampaignGetV2FilteringCampaignBudgetOptimization;
import com.bytedance.ads.model.CampaignGetV2FilteringDedicateType;
import com.bytedance.ads.model.CampaignGetV2FilteringLandingType;
import com.bytedance.ads.model.CampaignGetV2FilteringSmartBidType;
import com.bytedance.ads.model.CampaignGetV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class CampaignGetV2Filtering {
  public static final String SERIALIZED_NAME_CAMPAIGN_BUDGET_OPTIMIZATION = "campaign_budget_optimization";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_BUDGET_OPTIMIZATION)
  private CampaignGetV2FilteringCampaignBudgetOptimization campaignBudgetOptimization = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_CREATE_TIME = "campaign_create_time";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_CREATE_TIME)
  private String campaignCreateTime = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_DEDICATE_TYPE = "dedicate_type";
  @SerializedName(SERIALIZED_NAME_DEDICATE_TYPE)
  private CampaignGetV2FilteringDedicateType dedicateType = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private CampaignGetV2FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private CampaignGetV2FilteringSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CampaignGetV2FilteringStatus status = null;

  public CampaignGetV2Filtering() {
  }

  public CampaignGetV2Filtering campaignBudgetOptimization(CampaignGetV2FilteringCampaignBudgetOptimization campaignBudgetOptimization) {
    
    this.campaignBudgetOptimization = campaignBudgetOptimization;
    return this;
  }

   /**
   * Get campaignBudgetOptimization
   * @return campaignBudgetOptimization
  **/
  @javax.annotation.Nullable
  public CampaignGetV2FilteringCampaignBudgetOptimization getCampaignBudgetOptimization() {
    return campaignBudgetOptimization;
  }


  public void setCampaignBudgetOptimization(CampaignGetV2FilteringCampaignBudgetOptimization campaignBudgetOptimization) {
    this.campaignBudgetOptimization = campaignBudgetOptimization;
  }


  public CampaignGetV2Filtering campaignCreateTime(String campaignCreateTime) {
    
    this.campaignCreateTime = campaignCreateTime;
    return this;
  }

   /**
   * 
   * @return campaignCreateTime
  **/
  @javax.annotation.Nullable
  public String getCampaignCreateTime() {
    return campaignCreateTime;
  }


  public void setCampaignCreateTime(String campaignCreateTime) {
    this.campaignCreateTime = campaignCreateTime;
  }


  public CampaignGetV2Filtering campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public CampaignGetV2Filtering dedicateType(CampaignGetV2FilteringDedicateType dedicateType) {
    
    this.dedicateType = dedicateType;
    return this;
  }

   /**
   * Get dedicateType
   * @return dedicateType
  **/
  @javax.annotation.Nullable
  public CampaignGetV2FilteringDedicateType getDedicateType() {
    return dedicateType;
  }


  public void setDedicateType(CampaignGetV2FilteringDedicateType dedicateType) {
    this.dedicateType = dedicateType;
  }


  public CampaignGetV2Filtering ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public CampaignGetV2Filtering addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public CampaignGetV2Filtering landingType(CampaignGetV2FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public CampaignGetV2FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(CampaignGetV2FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public CampaignGetV2Filtering smartBidType(CampaignGetV2FilteringSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public CampaignGetV2FilteringSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(CampaignGetV2FilteringSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public CampaignGetV2Filtering status(CampaignGetV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public CampaignGetV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(CampaignGetV2FilteringStatus status) {
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
    CampaignGetV2Filtering campaignGetV2Filtering = (CampaignGetV2Filtering) o;
    return Objects.equals(this.campaignBudgetOptimization, campaignGetV2Filtering.campaignBudgetOptimization) &&
        Objects.equals(this.campaignCreateTime, campaignGetV2Filtering.campaignCreateTime) &&
        Objects.equals(this.campaignName, campaignGetV2Filtering.campaignName) &&
        Objects.equals(this.dedicateType, campaignGetV2Filtering.dedicateType) &&
        Objects.equals(this.ids, campaignGetV2Filtering.ids) &&
        Objects.equals(this.landingType, campaignGetV2Filtering.landingType) &&
        Objects.equals(this.smartBidType, campaignGetV2Filtering.smartBidType) &&
        Objects.equals(this.status, campaignGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignBudgetOptimization, campaignCreateTime, campaignName, dedicateType, ids, landingType, smartBidType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignGetV2Filtering {\n");
    sb.append("    campaignBudgetOptimization: ").append(toIndentedString(campaignBudgetOptimization)).append("\n");
    sb.append("    campaignCreateTime: ").append(toIndentedString(campaignCreateTime)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    dedicateType: ").append(toIndentedString(dedicateType)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
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
    openapiFields.add("campaign_budget_optimization");
    openapiFields.add("campaign_create_time");
    openapiFields.add("campaign_name");
    openapiFields.add("dedicate_type");
    openapiFields.add("ids");
    openapiFields.add("landing_type");
    openapiFields.add("smart_bid_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, CampaignGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to CampaignGetV2Filtering
  */
  public static CampaignGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignGetV2Filtering.class);
  }

 /**
  * Convert an instance of CampaignGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

