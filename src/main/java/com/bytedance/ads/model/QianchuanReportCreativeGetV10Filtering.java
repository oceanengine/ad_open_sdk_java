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
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringCampaignScene;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringCreativeMaterialMode;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringImageMode;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringIsHighlight;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringMarketingScene;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringOrderPlatform;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringSmartBidType;
import com.bytedance.ads.model.QianchuanReportCreativeGetV10FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class QianchuanReportCreativeGetV10Filtering {
  public static final String SERIALIZED_NAME_CAMPAIGN_SCENE = "campaign_scene";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SCENE)
  private QianchuanReportCreativeGetV10FilteringCampaignScene campaignScene = null;

  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODE = "creative_material_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODE)
  private QianchuanReportCreativeGetV10FilteringCreativeMaterialMode creativeMaterialMode = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private List<QianchuanReportCreativeGetV10FilteringImageMode> imageMode = null;

  public static final String SERIALIZED_NAME_IS_HIGHLIGHT = "is_highlight";
  @SerializedName(SERIALIZED_NAME_IS_HIGHLIGHT)
  private QianchuanReportCreativeGetV10FilteringIsHighlight isHighlight = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanReportCreativeGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanReportCreativeGetV10FilteringMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_ORDER_PLATFORM = "order_platform";
  @SerializedName(SERIALIZED_NAME_ORDER_PLATFORM)
  private QianchuanReportCreativeGetV10FilteringOrderPlatform orderPlatform = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanReportCreativeGetV10FilteringSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanReportCreativeGetV10FilteringStatus status = null;

  public QianchuanReportCreativeGetV10Filtering() {
  }

  public QianchuanReportCreativeGetV10Filtering campaignScene(QianchuanReportCreativeGetV10FilteringCampaignScene campaignScene) {
    
    this.campaignScene = campaignScene;
    return this;
  }

   /**
   * Get campaignScene
   * @return campaignScene
  **/
  @javax.annotation.Nullable
  public QianchuanReportCreativeGetV10FilteringCampaignScene getCampaignScene() {
    return campaignScene;
  }


  public void setCampaignScene(QianchuanReportCreativeGetV10FilteringCampaignScene campaignScene) {
    this.campaignScene = campaignScene;
  }


  public QianchuanReportCreativeGetV10Filtering creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public QianchuanReportCreativeGetV10Filtering addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * 
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public QianchuanReportCreativeGetV10Filtering creativeMaterialMode(QianchuanReportCreativeGetV10FilteringCreativeMaterialMode creativeMaterialMode) {
    
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * Get creativeMaterialMode
   * @return creativeMaterialMode
  **/
  @javax.annotation.Nullable
  public QianchuanReportCreativeGetV10FilteringCreativeMaterialMode getCreativeMaterialMode() {
    return creativeMaterialMode;
  }


  public void setCreativeMaterialMode(QianchuanReportCreativeGetV10FilteringCreativeMaterialMode creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }


  public QianchuanReportCreativeGetV10Filtering imageMode(List<QianchuanReportCreativeGetV10FilteringImageMode> imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

  public QianchuanReportCreativeGetV10Filtering addImageModeItem(QianchuanReportCreativeGetV10FilteringImageMode imageModeItem) {
    if (this.imageMode == null) {
      this.imageMode = new ArrayList<>();
    }
    this.imageMode.add(imageModeItem);
    return this;
  }

   /**
   * 
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportCreativeGetV10FilteringImageMode> getImageMode() {
    return imageMode;
  }


  public void setImageMode(List<QianchuanReportCreativeGetV10FilteringImageMode> imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanReportCreativeGetV10Filtering isHighlight(QianchuanReportCreativeGetV10FilteringIsHighlight isHighlight) {
    
    this.isHighlight = isHighlight;
    return this;
  }

   /**
   * Get isHighlight
   * @return isHighlight
  **/
  @javax.annotation.Nullable
  public QianchuanReportCreativeGetV10FilteringIsHighlight getIsHighlight() {
    return isHighlight;
  }


  public void setIsHighlight(QianchuanReportCreativeGetV10FilteringIsHighlight isHighlight) {
    this.isHighlight = isHighlight;
  }


  public QianchuanReportCreativeGetV10Filtering marketingGoal(QianchuanReportCreativeGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanReportCreativeGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanReportCreativeGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanReportCreativeGetV10Filtering marketingScene(QianchuanReportCreativeGetV10FilteringMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanReportCreativeGetV10FilteringMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanReportCreativeGetV10FilteringMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanReportCreativeGetV10Filtering orderPlatform(QianchuanReportCreativeGetV10FilteringOrderPlatform orderPlatform) {
    
    this.orderPlatform = orderPlatform;
    return this;
  }

   /**
   * Get orderPlatform
   * @return orderPlatform
  **/
  @javax.annotation.Nullable
  public QianchuanReportCreativeGetV10FilteringOrderPlatform getOrderPlatform() {
    return orderPlatform;
  }


  public void setOrderPlatform(QianchuanReportCreativeGetV10FilteringOrderPlatform orderPlatform) {
    this.orderPlatform = orderPlatform;
  }


  public QianchuanReportCreativeGetV10Filtering smartBidType(QianchuanReportCreativeGetV10FilteringSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public QianchuanReportCreativeGetV10FilteringSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanReportCreativeGetV10FilteringSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanReportCreativeGetV10Filtering status(QianchuanReportCreativeGetV10FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanReportCreativeGetV10FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanReportCreativeGetV10FilteringStatus status) {
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
    QianchuanReportCreativeGetV10Filtering qianchuanReportCreativeGetV10Filtering = (QianchuanReportCreativeGetV10Filtering) o;
    return Objects.equals(this.campaignScene, qianchuanReportCreativeGetV10Filtering.campaignScene) &&
        Objects.equals(this.creativeIds, qianchuanReportCreativeGetV10Filtering.creativeIds) &&
        Objects.equals(this.creativeMaterialMode, qianchuanReportCreativeGetV10Filtering.creativeMaterialMode) &&
        Objects.equals(this.imageMode, qianchuanReportCreativeGetV10Filtering.imageMode) &&
        Objects.equals(this.isHighlight, qianchuanReportCreativeGetV10Filtering.isHighlight) &&
        Objects.equals(this.marketingGoal, qianchuanReportCreativeGetV10Filtering.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanReportCreativeGetV10Filtering.marketingScene) &&
        Objects.equals(this.orderPlatform, qianchuanReportCreativeGetV10Filtering.orderPlatform) &&
        Objects.equals(this.smartBidType, qianchuanReportCreativeGetV10Filtering.smartBidType) &&
        Objects.equals(this.status, qianchuanReportCreativeGetV10Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignScene, creativeIds, creativeMaterialMode, imageMode, isHighlight, marketingGoal, marketingScene, orderPlatform, smartBidType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportCreativeGetV10Filtering {\n");
    sb.append("    campaignScene: ").append(toIndentedString(campaignScene)).append("\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    isHighlight: ").append(toIndentedString(isHighlight)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    orderPlatform: ").append(toIndentedString(orderPlatform)).append("\n");
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
    openapiFields.add("campaign_scene");
    openapiFields.add("creative_ids");
    openapiFields.add("creative_material_mode");
    openapiFields.add("image_mode");
    openapiFields.add("is_highlight");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("order_platform");
    openapiFields.add("smart_bid_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportCreativeGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportCreativeGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportCreativeGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportCreativeGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportCreativeGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanReportCreativeGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportCreativeGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportCreativeGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportCreativeGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportCreativeGetV10Filtering
  */
  public static QianchuanReportCreativeGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportCreativeGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanReportCreativeGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

