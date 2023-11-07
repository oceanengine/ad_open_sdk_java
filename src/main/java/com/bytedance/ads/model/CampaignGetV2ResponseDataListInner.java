/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CampaignGetV2DataListBudgetMode;
import com.bytedance.ads.model.CampaignGetV2DataListCampaignBudgetOptimization;
import com.bytedance.ads.model.CampaignGetV2DataListCampaignType;
import com.bytedance.ads.model.CampaignGetV2DataListDedicateType;
import com.bytedance.ads.model.CampaignGetV2DataListDeliveryMode;
import com.bytedance.ads.model.CampaignGetV2DataListDeliveryRelatedNum;
import com.bytedance.ads.model.CampaignGetV2DataListLandingType;
import com.bytedance.ads.model.CampaignGetV2DataListMarketingPurpose;
import com.bytedance.ads.model.CampaignGetV2DataListMarketingScene;
import com.bytedance.ads.model.CampaignGetV2DataListSmartBidType;
import com.bytedance.ads.model.CampaignGetV2DataListStatus;
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
 * CampaignGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class CampaignGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private CampaignGetV2DataListBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_BUDGET_OPTIMIZATION = "campaign_budget_optimization";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_BUDGET_OPTIMIZATION)
  private CampaignGetV2DataListCampaignBudgetOptimization campaignBudgetOptimization = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_CREATE_TIME = "campaign_create_time";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_CREATE_TIME)
  private String campaignCreateTime = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_MODIFY_TIME = "campaign_modify_time";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_MODIFY_TIME)
  private String campaignModifyTime = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private CampaignGetV2DataListCampaignType campaignType = null;

  public static final String SERIALIZED_NAME_DEDICATE_TYPE = "dedicate_type";
  @SerializedName(SERIALIZED_NAME_DEDICATE_TYPE)
  private CampaignGetV2DataListDedicateType dedicateType = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private CampaignGetV2DataListDeliveryMode deliveryMode = null;

  public static final String SERIALIZED_NAME_DELIVERY_RELATED_NUM = "delivery_related_num";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RELATED_NUM)
  private CampaignGetV2DataListDeliveryRelatedNum deliveryRelatedNum = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private CampaignGetV2DataListLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_PURPOSE = "marketing_purpose";
  @SerializedName(SERIALIZED_NAME_MARKETING_PURPOSE)
  private CampaignGetV2DataListMarketingPurpose marketingPurpose = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private CampaignGetV2DataListMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private CampaignGetV2DataListSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CampaignGetV2DataListStatus status = null;

  public CampaignGetV2ResponseDataListInner() {
  }

  public CampaignGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
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


  public CampaignGetV2ResponseDataListInner budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public CampaignGetV2ResponseDataListInner budgetMode(CampaignGetV2DataListBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(CampaignGetV2DataListBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public CampaignGetV2ResponseDataListInner campaignBudgetOptimization(CampaignGetV2DataListCampaignBudgetOptimization campaignBudgetOptimization) {
    
    this.campaignBudgetOptimization = campaignBudgetOptimization;
    return this;
  }

   /**
   * Get campaignBudgetOptimization
   * @return campaignBudgetOptimization
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListCampaignBudgetOptimization getCampaignBudgetOptimization() {
    return campaignBudgetOptimization;
  }


  public void setCampaignBudgetOptimization(CampaignGetV2DataListCampaignBudgetOptimization campaignBudgetOptimization) {
    this.campaignBudgetOptimization = campaignBudgetOptimization;
  }


  public CampaignGetV2ResponseDataListInner campaignCreateTime(String campaignCreateTime) {
    
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


  public CampaignGetV2ResponseDataListInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignGetV2ResponseDataListInner campaignModifyTime(String campaignModifyTime) {
    
    this.campaignModifyTime = campaignModifyTime;
    return this;
  }

   /**
   * 
   * @return campaignModifyTime
  **/
  @javax.annotation.Nullable
  public String getCampaignModifyTime() {
    return campaignModifyTime;
  }


  public void setCampaignModifyTime(String campaignModifyTime) {
    this.campaignModifyTime = campaignModifyTime;
  }


  public CampaignGetV2ResponseDataListInner campaignType(CampaignGetV2DataListCampaignType campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListCampaignType getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(CampaignGetV2DataListCampaignType campaignType) {
    this.campaignType = campaignType;
  }


  public CampaignGetV2ResponseDataListInner dedicateType(CampaignGetV2DataListDedicateType dedicateType) {
    
    this.dedicateType = dedicateType;
    return this;
  }

   /**
   * Get dedicateType
   * @return dedicateType
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListDedicateType getDedicateType() {
    return dedicateType;
  }


  public void setDedicateType(CampaignGetV2DataListDedicateType dedicateType) {
    this.dedicateType = dedicateType;
  }


  public CampaignGetV2ResponseDataListInner deliveryMode(CampaignGetV2DataListDeliveryMode deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Get deliveryMode
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListDeliveryMode getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(CampaignGetV2DataListDeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public CampaignGetV2ResponseDataListInner deliveryRelatedNum(CampaignGetV2DataListDeliveryRelatedNum deliveryRelatedNum) {
    
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

   /**
   * Get deliveryRelatedNum
   * @return deliveryRelatedNum
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListDeliveryRelatedNum getDeliveryRelatedNum() {
    return deliveryRelatedNum;
  }


  public void setDeliveryRelatedNum(CampaignGetV2DataListDeliveryRelatedNum deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
  }


  public CampaignGetV2ResponseDataListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public CampaignGetV2ResponseDataListInner landingType(CampaignGetV2DataListLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(CampaignGetV2DataListLandingType landingType) {
    this.landingType = landingType;
  }


  public CampaignGetV2ResponseDataListInner marketingPurpose(CampaignGetV2DataListMarketingPurpose marketingPurpose) {
    
    this.marketingPurpose = marketingPurpose;
    return this;
  }

   /**
   * Get marketingPurpose
   * @return marketingPurpose
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListMarketingPurpose getMarketingPurpose() {
    return marketingPurpose;
  }


  public void setMarketingPurpose(CampaignGetV2DataListMarketingPurpose marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
  }


  public CampaignGetV2ResponseDataListInner marketingScene(CampaignGetV2DataListMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(CampaignGetV2DataListMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public CampaignGetV2ResponseDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public CampaignGetV2ResponseDataListInner name(String name) {
    
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


  public CampaignGetV2ResponseDataListInner smartBidType(CampaignGetV2DataListSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(CampaignGetV2DataListSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public CampaignGetV2ResponseDataListInner status(CampaignGetV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public CampaignGetV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(CampaignGetV2DataListStatus status) {
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
    CampaignGetV2ResponseDataListInner campaignGetV2ResponseDataListInner = (CampaignGetV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, campaignGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.budget, campaignGetV2ResponseDataListInner.budget) &&
        Objects.equals(this.budgetMode, campaignGetV2ResponseDataListInner.budgetMode) &&
        Objects.equals(this.campaignBudgetOptimization, campaignGetV2ResponseDataListInner.campaignBudgetOptimization) &&
        Objects.equals(this.campaignCreateTime, campaignGetV2ResponseDataListInner.campaignCreateTime) &&
        Objects.equals(this.campaignId, campaignGetV2ResponseDataListInner.campaignId) &&
        Objects.equals(this.campaignModifyTime, campaignGetV2ResponseDataListInner.campaignModifyTime) &&
        Objects.equals(this.campaignType, campaignGetV2ResponseDataListInner.campaignType) &&
        Objects.equals(this.dedicateType, campaignGetV2ResponseDataListInner.dedicateType) &&
        Objects.equals(this.deliveryMode, campaignGetV2ResponseDataListInner.deliveryMode) &&
        Objects.equals(this.deliveryRelatedNum, campaignGetV2ResponseDataListInner.deliveryRelatedNum) &&
        Objects.equals(this.id, campaignGetV2ResponseDataListInner.id) &&
        Objects.equals(this.landingType, campaignGetV2ResponseDataListInner.landingType) &&
        Objects.equals(this.marketingPurpose, campaignGetV2ResponseDataListInner.marketingPurpose) &&
        Objects.equals(this.marketingScene, campaignGetV2ResponseDataListInner.marketingScene) &&
        Objects.equals(this.modifyTime, campaignGetV2ResponseDataListInner.modifyTime) &&
        Objects.equals(this.name, campaignGetV2ResponseDataListInner.name) &&
        Objects.equals(this.smartBidType, campaignGetV2ResponseDataListInner.smartBidType) &&
        Objects.equals(this.status, campaignGetV2ResponseDataListInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, budgetMode, campaignBudgetOptimization, campaignCreateTime, campaignId, campaignModifyTime, campaignType, dedicateType, deliveryMode, deliveryRelatedNum, id, landingType, marketingPurpose, marketingScene, modifyTime, name, smartBidType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignGetV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    campaignBudgetOptimization: ").append(toIndentedString(campaignBudgetOptimization)).append("\n");
    sb.append("    campaignCreateTime: ").append(toIndentedString(campaignCreateTime)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignModifyTime: ").append(toIndentedString(campaignModifyTime)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    dedicateType: ").append(toIndentedString(dedicateType)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    deliveryRelatedNum: ").append(toIndentedString(deliveryRelatedNum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingPurpose: ").append(toIndentedString(marketingPurpose)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("campaign_budget_optimization");
    openapiFields.add("campaign_create_time");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_modify_time");
    openapiFields.add("campaign_type");
    openapiFields.add("dedicate_type");
    openapiFields.add("delivery_mode");
    openapiFields.add("delivery_related_num");
    openapiFields.add("id");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_purpose");
    openapiFields.add("marketing_scene");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("smart_bid_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, CampaignGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to CampaignGetV2ResponseDataListInner
  */
  public static CampaignGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of CampaignGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

