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
import com.bytedance.ads.model.LocalReportMaterialGetV30FilteringCampaignType;
import com.bytedance.ads.model.LocalReportMaterialGetV30FilteringDeliveryMode;
import com.bytedance.ads.model.LocalReportMaterialGetV30FilteringExternalAction;
import com.bytedance.ads.model.LocalReportMaterialGetV30FilteringLocalDeliveryScene;
import com.bytedance.ads.model.LocalReportMaterialGetV30FilteringMaterialType;
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
public class LocalReportMaterialGetV30Filtering {
  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private LocalReportMaterialGetV30FilteringCampaignType campaignType = null;

  public static final String SERIALIZED_NAME_CDP_PROJECT_IDS = "cdp_project_ids";
  @SerializedName(SERIALIZED_NAME_CDP_PROJECT_IDS)
  private List<Long> cdpProjectIds = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private List<LocalReportMaterialGetV30FilteringDeliveryMode> deliveryMode = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private List<LocalReportMaterialGetV30FilteringExternalAction> externalAction = null;

  public static final String SERIALIZED_NAME_LOCAL_DELIVERY_SCENE = "local_delivery_scene";
  @SerializedName(SERIALIZED_NAME_LOCAL_DELIVERY_SCENE)
  private LocalReportMaterialGetV30FilteringLocalDeliveryScene localDeliveryScene = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private LocalReportMaterialGetV30FilteringMaterialType materialType = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public LocalReportMaterialGetV30Filtering() {
  }

  public LocalReportMaterialGetV30Filtering campaignType(LocalReportMaterialGetV30FilteringCampaignType campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public LocalReportMaterialGetV30FilteringCampaignType getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(LocalReportMaterialGetV30FilteringCampaignType campaignType) {
    this.campaignType = campaignType;
  }


  public LocalReportMaterialGetV30Filtering cdpProjectIds(List<Long> cdpProjectIds) {
    
    this.cdpProjectIds = cdpProjectIds;
    return this;
  }

  public LocalReportMaterialGetV30Filtering addCdpProjectIdsItem(Long cdpProjectIdsItem) {
    if (this.cdpProjectIds == null) {
      this.cdpProjectIds = new ArrayList<>();
    }
    this.cdpProjectIds.add(cdpProjectIdsItem);
    return this;
  }

   /**
   * 
   * @return cdpProjectIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCdpProjectIds() {
    return cdpProjectIds;
  }


  public void setCdpProjectIds(List<Long> cdpProjectIds) {
    this.cdpProjectIds = cdpProjectIds;
  }


  public LocalReportMaterialGetV30Filtering deliveryMode(List<LocalReportMaterialGetV30FilteringDeliveryMode> deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

  public LocalReportMaterialGetV30Filtering addDeliveryModeItem(LocalReportMaterialGetV30FilteringDeliveryMode deliveryModeItem) {
    if (this.deliveryMode == null) {
      this.deliveryMode = new ArrayList<>();
    }
    this.deliveryMode.add(deliveryModeItem);
    return this;
  }

   /**
   * 
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public List<LocalReportMaterialGetV30FilteringDeliveryMode> getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(List<LocalReportMaterialGetV30FilteringDeliveryMode> deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public LocalReportMaterialGetV30Filtering externalAction(List<LocalReportMaterialGetV30FilteringExternalAction> externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

  public LocalReportMaterialGetV30Filtering addExternalActionItem(LocalReportMaterialGetV30FilteringExternalAction externalActionItem) {
    if (this.externalAction == null) {
      this.externalAction = new ArrayList<>();
    }
    this.externalAction.add(externalActionItem);
    return this;
  }

   /**
   * 
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public List<LocalReportMaterialGetV30FilteringExternalAction> getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(List<LocalReportMaterialGetV30FilteringExternalAction> externalAction) {
    this.externalAction = externalAction;
  }


  public LocalReportMaterialGetV30Filtering localDeliveryScene(LocalReportMaterialGetV30FilteringLocalDeliveryScene localDeliveryScene) {
    
    this.localDeliveryScene = localDeliveryScene;
    return this;
  }

   /**
   * Get localDeliveryScene
   * @return localDeliveryScene
  **/
  @javax.annotation.Nullable
  public LocalReportMaterialGetV30FilteringLocalDeliveryScene getLocalDeliveryScene() {
    return localDeliveryScene;
  }


  public void setLocalDeliveryScene(LocalReportMaterialGetV30FilteringLocalDeliveryScene localDeliveryScene) {
    this.localDeliveryScene = localDeliveryScene;
  }


  public LocalReportMaterialGetV30Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public LocalReportMaterialGetV30Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 素材ID，查询素材id。 注意：material_id是个维度条件，如果不传，查询的是本地推广告账户ID全部聚合后数据；如果仅传入字符串material_ids，查询的是维度明细是素材维度数据；如果传入数值，查询的是具体素材id数据
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public LocalReportMaterialGetV30Filtering materialType(LocalReportMaterialGetV30FilteringMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public LocalReportMaterialGetV30FilteringMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(LocalReportMaterialGetV30FilteringMaterialType materialType) {
    this.materialType = materialType;
  }


  public LocalReportMaterialGetV30Filtering promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public LocalReportMaterialGetV30Filtering addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 
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
    LocalReportMaterialGetV30Filtering localReportMaterialGetV30Filtering = (LocalReportMaterialGetV30Filtering) o;
    return Objects.equals(this.campaignType, localReportMaterialGetV30Filtering.campaignType) &&
        Objects.equals(this.cdpProjectIds, localReportMaterialGetV30Filtering.cdpProjectIds) &&
        Objects.equals(this.deliveryMode, localReportMaterialGetV30Filtering.deliveryMode) &&
        Objects.equals(this.externalAction, localReportMaterialGetV30Filtering.externalAction) &&
        Objects.equals(this.localDeliveryScene, localReportMaterialGetV30Filtering.localDeliveryScene) &&
        Objects.equals(this.materialIds, localReportMaterialGetV30Filtering.materialIds) &&
        Objects.equals(this.materialType, localReportMaterialGetV30Filtering.materialType) &&
        Objects.equals(this.promotionIds, localReportMaterialGetV30Filtering.promotionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignType, cdpProjectIds, deliveryMode, externalAction, localDeliveryScene, materialIds, materialType, promotionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalReportMaterialGetV30Filtering {\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    cdpProjectIds: ").append(toIndentedString(cdpProjectIds)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    localDeliveryScene: ").append(toIndentedString(localDeliveryScene)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
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
    openapiFields.add("cdp_project_ids");
    openapiFields.add("delivery_mode");
    openapiFields.add("external_action");
    openapiFields.add("local_delivery_scene");
    openapiFields.add("material_ids");
    openapiFields.add("material_type");
    openapiFields.add("promotion_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalReportMaterialGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalReportMaterialGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalReportMaterialGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalReportMaterialGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalReportMaterialGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalReportMaterialGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalReportMaterialGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalReportMaterialGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalReportMaterialGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalReportMaterialGetV30Filtering
  */
  public static LocalReportMaterialGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalReportMaterialGetV30Filtering.class);
  }

 /**
  * Convert an instance of LocalReportMaterialGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

