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
import com.bytedance.ads.model.LocalReportPromotionGetV30FilteringCampaignType;
import com.bytedance.ads.model.LocalReportPromotionGetV30FilteringExternalAction;
import com.bytedance.ads.model.LocalReportPromotionGetV30FilteringLocalDeliveryScene;
import com.bytedance.ads.model.LocalReportPromotionGetV30FilteringMarketingGoal;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class LocalReportPromotionGetV30Filtering {
  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private LocalReportPromotionGetV30FilteringCampaignType campaignType = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private List<LocalReportPromotionGetV30FilteringExternalAction> externalAction = null;

  public static final String SERIALIZED_NAME_LOCAL_DELIVERY_SCENE = "local_delivery_scene";
  @SerializedName(SERIALIZED_NAME_LOCAL_DELIVERY_SCENE)
  private LocalReportPromotionGetV30FilteringLocalDeliveryScene localDeliveryScene = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private LocalReportPromotionGetV30FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public LocalReportPromotionGetV30Filtering() {
  }

  public LocalReportPromotionGetV30Filtering campaignType(LocalReportPromotionGetV30FilteringCampaignType campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public LocalReportPromotionGetV30FilteringCampaignType getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(LocalReportPromotionGetV30FilteringCampaignType campaignType) {
    this.campaignType = campaignType;
  }


  public LocalReportPromotionGetV30Filtering externalAction(List<LocalReportPromotionGetV30FilteringExternalAction> externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

  public LocalReportPromotionGetV30Filtering addExternalActionItem(LocalReportPromotionGetV30FilteringExternalAction externalActionItem) {
    if (this.externalAction == null) {
      this.externalAction = new ArrayList<>();
    }
    this.externalAction.add(externalActionItem);
    return this;
  }

   /**
   * 优化目标
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public List<LocalReportPromotionGetV30FilteringExternalAction> getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(List<LocalReportPromotionGetV30FilteringExternalAction> externalAction) {
    this.externalAction = externalAction;
  }


  public LocalReportPromotionGetV30Filtering localDeliveryScene(LocalReportPromotionGetV30FilteringLocalDeliveryScene localDeliveryScene) {
    
    this.localDeliveryScene = localDeliveryScene;
    return this;
  }

   /**
   * Get localDeliveryScene
   * @return localDeliveryScene
  **/
  @javax.annotation.Nullable
  public LocalReportPromotionGetV30FilteringLocalDeliveryScene getLocalDeliveryScene() {
    return localDeliveryScene;
  }


  public void setLocalDeliveryScene(LocalReportPromotionGetV30FilteringLocalDeliveryScene localDeliveryScene) {
    this.localDeliveryScene = localDeliveryScene;
  }


  public LocalReportPromotionGetV30Filtering marketingGoal(LocalReportPromotionGetV30FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public LocalReportPromotionGetV30FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(LocalReportPromotionGetV30FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public LocalReportPromotionGetV30Filtering promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public LocalReportPromotionGetV30Filtering addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 广告ID，查询广告id。 注意：promotion_id是个维度条件，如果不传，查询的是本地推广告账户ID全部聚合后数据；如果仅传入字符串promotion_ids，查询的是维度明细是广告维度数据；如果传入数值，查询的是具体广告id数据
   * @return promotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<Long> promotionIds) {
    this.promotionIds = promotionIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalReportPromotionGetV30Filtering localReportPromotionGetV30Filtering = (LocalReportPromotionGetV30Filtering) o;
    return Objects.equals(this.campaignType, localReportPromotionGetV30Filtering.campaignType) &&
        Objects.equals(this.externalAction, localReportPromotionGetV30Filtering.externalAction) &&
        Objects.equals(this.localDeliveryScene, localReportPromotionGetV30Filtering.localDeliveryScene) &&
        Objects.equals(this.marketingGoal, localReportPromotionGetV30Filtering.marketingGoal) &&
        Objects.equals(this.promotionIds, localReportPromotionGetV30Filtering.promotionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignType, externalAction, localDeliveryScene, marketingGoal, promotionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalReportPromotionGetV30Filtering {\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    localDeliveryScene: ").append(toIndentedString(localDeliveryScene)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
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
    openapiFields.add("campaign_type");
    openapiFields.add("external_action");
    openapiFields.add("local_delivery_scene");
    openapiFields.add("marketing_goal");
    openapiFields.add("promotion_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalReportPromotionGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalReportPromotionGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalReportPromotionGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalReportPromotionGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalReportPromotionGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalReportPromotionGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalReportPromotionGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalReportPromotionGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalReportPromotionGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalReportPromotionGetV30Filtering
  */
  public static LocalReportPromotionGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalReportPromotionGetV30Filtering.class);
  }

 /**
  * Convert an instance of LocalReportPromotionGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

