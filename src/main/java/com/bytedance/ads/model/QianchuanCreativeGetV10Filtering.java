/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanCreativeGetV10FilteringCreativeMaterialMode;
import com.bytedance.ads.model.QianchuanCreativeGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanCreativeGetV10FilteringMarketingScene;
import com.bytedance.ads.model.QianchuanCreativeGetV10FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class QianchuanCreativeGetV10Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CREATIVE_CREATE_END_DATE = "creative_create_end_date";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CREATE_END_DATE)
  private String creativeCreateEndDate = null;

  public static final String SERIALIZED_NAME_CREATIVE_CREATE_START_DATE = "creative_create_start_date";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CREATE_START_DATE)
  private String creativeCreateStartDate = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODE = "creative_material_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODE)
  private QianchuanCreativeGetV10FilteringCreativeMaterialMode creativeMaterialMode = null;

  public static final String SERIALIZED_NAME_CREATIVE_MODIFY_TIME = "creative_modify_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MODIFY_TIME)
  private String creativeModifyTime = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanCreativeGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanCreativeGetV10FilteringMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanCreativeGetV10FilteringStatus status = null;

  public QianchuanCreativeGetV10Filtering() {
  }

  public QianchuanCreativeGetV10Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanCreativeGetV10Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public QianchuanCreativeGetV10Filtering campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
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


  public QianchuanCreativeGetV10Filtering creativeCreateEndDate(String creativeCreateEndDate) {
    
    this.creativeCreateEndDate = creativeCreateEndDate;
    return this;
  }

   /**
   * 
   * @return creativeCreateEndDate
  **/
  @javax.annotation.Nullable
  public String getCreativeCreateEndDate() {
    return creativeCreateEndDate;
  }


  public void setCreativeCreateEndDate(String creativeCreateEndDate) {
    this.creativeCreateEndDate = creativeCreateEndDate;
  }


  public QianchuanCreativeGetV10Filtering creativeCreateStartDate(String creativeCreateStartDate) {
    
    this.creativeCreateStartDate = creativeCreateStartDate;
    return this;
  }

   /**
   * 
   * @return creativeCreateStartDate
  **/
  @javax.annotation.Nullable
  public String getCreativeCreateStartDate() {
    return creativeCreateStartDate;
  }


  public void setCreativeCreateStartDate(String creativeCreateStartDate) {
    this.creativeCreateStartDate = creativeCreateStartDate;
  }


  public QianchuanCreativeGetV10Filtering creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public QianchuanCreativeGetV10Filtering creativeMaterialMode(QianchuanCreativeGetV10FilteringCreativeMaterialMode creativeMaterialMode) {
    
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * Get creativeMaterialMode
   * @return creativeMaterialMode
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10FilteringCreativeMaterialMode getCreativeMaterialMode() {
    return creativeMaterialMode;
  }


  public void setCreativeMaterialMode(QianchuanCreativeGetV10FilteringCreativeMaterialMode creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }


  public QianchuanCreativeGetV10Filtering creativeModifyTime(String creativeModifyTime) {
    
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

   /**
   * 
   * @return creativeModifyTime
  **/
  @javax.annotation.Nullable
  public String getCreativeModifyTime() {
    return creativeModifyTime;
  }


  public void setCreativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
  }


  public QianchuanCreativeGetV10Filtering marketingGoal(QianchuanCreativeGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanCreativeGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanCreativeGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanCreativeGetV10Filtering marketingScene(QianchuanCreativeGetV10FilteringMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10FilteringMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanCreativeGetV10FilteringMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanCreativeGetV10Filtering status(QianchuanCreativeGetV10FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanCreativeGetV10FilteringStatus status) {
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
    QianchuanCreativeGetV10Filtering qianchuanCreativeGetV10Filtering = (QianchuanCreativeGetV10Filtering) o;
    return Objects.equals(this.adIds, qianchuanCreativeGetV10Filtering.adIds) &&
        Objects.equals(this.campaignId, qianchuanCreativeGetV10Filtering.campaignId) &&
        Objects.equals(this.creativeCreateEndDate, qianchuanCreativeGetV10Filtering.creativeCreateEndDate) &&
        Objects.equals(this.creativeCreateStartDate, qianchuanCreativeGetV10Filtering.creativeCreateStartDate) &&
        Objects.equals(this.creativeId, qianchuanCreativeGetV10Filtering.creativeId) &&
        Objects.equals(this.creativeMaterialMode, qianchuanCreativeGetV10Filtering.creativeMaterialMode) &&
        Objects.equals(this.creativeModifyTime, qianchuanCreativeGetV10Filtering.creativeModifyTime) &&
        Objects.equals(this.marketingGoal, qianchuanCreativeGetV10Filtering.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanCreativeGetV10Filtering.marketingScene) &&
        Objects.equals(this.status, qianchuanCreativeGetV10Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, campaignId, creativeCreateEndDate, creativeCreateStartDate, creativeId, creativeMaterialMode, creativeModifyTime, marketingGoal, marketingScene, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanCreativeGetV10Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    creativeCreateEndDate: ").append(toIndentedString(creativeCreateEndDate)).append("\n");
    sb.append("    creativeCreateStartDate: ").append(toIndentedString(creativeCreateStartDate)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    creativeModifyTime: ").append(toIndentedString(creativeModifyTime)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("campaign_id");
    openapiFields.add("creative_create_end_date");
    openapiFields.add("creative_create_start_date");
    openapiFields.add("creative_id");
    openapiFields.add("creative_material_mode");
    openapiFields.add("creative_modify_time");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCreativeGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCreativeGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCreativeGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCreativeGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCreativeGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanCreativeGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCreativeGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCreativeGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCreativeGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanCreativeGetV10Filtering
  */
  public static QianchuanCreativeGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCreativeGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanCreativeGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
