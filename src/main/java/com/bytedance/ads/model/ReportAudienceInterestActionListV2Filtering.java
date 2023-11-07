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
import com.bytedance.ads.model.ReportAudienceInterestActionListV2FilteringActionDays;
import com.bytedance.ads.model.ReportAudienceInterestActionListV2FilteringActionScene;
import com.bytedance.ads.model.ReportAudienceInterestActionListV2FilteringAudienceLevel;
import com.bytedance.ads.model.ReportAudienceInterestActionListV2FilteringInterestActionType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class ReportAudienceInterestActionListV2Filtering {
  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private ReportAudienceInterestActionListV2FilteringActionDays actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<ReportAudienceInterestActionListV2FilteringActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_AUDIENCE_LEVEL = "audience_level";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_LEVEL)
  private ReportAudienceInterestActionListV2FilteringAudienceLevel audienceLevel = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_INTEREST_ACTION_TYPE = "interest_action_type";
  @SerializedName(SERIALIZED_NAME_INTEREST_ACTION_TYPE)
  private ReportAudienceInterestActionListV2FilteringInterestActionType interestActionType = null;

  public ReportAudienceInterestActionListV2Filtering() {
  }

  public ReportAudienceInterestActionListV2Filtering actionDays(ReportAudienceInterestActionListV2FilteringActionDays actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * Get actionDays
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public ReportAudienceInterestActionListV2FilteringActionDays getActionDays() {
    return actionDays;
  }


  public void setActionDays(ReportAudienceInterestActionListV2FilteringActionDays actionDays) {
    this.actionDays = actionDays;
  }


  public ReportAudienceInterestActionListV2Filtering actionScene(List<ReportAudienceInterestActionListV2FilteringActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public ReportAudienceInterestActionListV2Filtering addActionSceneItem(ReportAudienceInterestActionListV2FilteringActionScene actionSceneItem) {
    if (this.actionScene == null) {
      this.actionScene = new ArrayList<>(Arrays.asList(ReportAudienceInterestActionListV2FilteringActionScene.E_COMMERCE, ReportAudienceInterestActionListV2FilteringActionScene.NEWS, ReportAudienceInterestActionListV2FilteringActionScene.APP, ReportAudienceInterestActionListV2FilteringActionScene.SEARCH, ReportAudienceInterestActionListV2FilteringActionScene.AD));
    }
    this.actionScene.add(actionSceneItem);
    return this;
  }

   /**
   * 
   * @return actionScene
  **/
  @javax.annotation.Nullable
  public List<ReportAudienceInterestActionListV2FilteringActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<ReportAudienceInterestActionListV2FilteringActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public ReportAudienceInterestActionListV2Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ReportAudienceInterestActionListV2Filtering addAdIdsItem(Long adIdsItem) {
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


  public ReportAudienceInterestActionListV2Filtering audienceLevel(ReportAudienceInterestActionListV2FilteringAudienceLevel audienceLevel) {
    
    this.audienceLevel = audienceLevel;
    return this;
  }

   /**
   * Get audienceLevel
   * @return audienceLevel
  **/
  @javax.annotation.Nullable
  public ReportAudienceInterestActionListV2FilteringAudienceLevel getAudienceLevel() {
    return audienceLevel;
  }


  public void setAudienceLevel(ReportAudienceInterestActionListV2FilteringAudienceLevel audienceLevel) {
    this.audienceLevel = audienceLevel;
  }


  public ReportAudienceInterestActionListV2Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportAudienceInterestActionListV2Filtering addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public ReportAudienceInterestActionListV2Filtering interestActionType(ReportAudienceInterestActionListV2FilteringInterestActionType interestActionType) {
    
    this.interestActionType = interestActionType;
    return this;
  }

   /**
   * Get interestActionType
   * @return interestActionType
  **/
  @javax.annotation.Nullable
  public ReportAudienceInterestActionListV2FilteringInterestActionType getInterestActionType() {
    return interestActionType;
  }


  public void setInterestActionType(ReportAudienceInterestActionListV2FilteringInterestActionType interestActionType) {
    this.interestActionType = interestActionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAudienceInterestActionListV2Filtering reportAudienceInterestActionListV2Filtering = (ReportAudienceInterestActionListV2Filtering) o;
    return Objects.equals(this.actionDays, reportAudienceInterestActionListV2Filtering.actionDays) &&
        Objects.equals(this.actionScene, reportAudienceInterestActionListV2Filtering.actionScene) &&
        Objects.equals(this.adIds, reportAudienceInterestActionListV2Filtering.adIds) &&
        Objects.equals(this.audienceLevel, reportAudienceInterestActionListV2Filtering.audienceLevel) &&
        Objects.equals(this.campaignIds, reportAudienceInterestActionListV2Filtering.campaignIds) &&
        Objects.equals(this.interestActionType, reportAudienceInterestActionListV2Filtering.interestActionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDays, actionScene, adIds, audienceLevel, campaignIds, interestActionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAudienceInterestActionListV2Filtering {\n");
    sb.append("    actionDays: ").append(toIndentedString(actionDays)).append("\n");
    sb.append("    actionScene: ").append(toIndentedString(actionScene)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    audienceLevel: ").append(toIndentedString(audienceLevel)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    interestActionType: ").append(toIndentedString(interestActionType)).append("\n");
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
    openapiFields.add("action_days");
    openapiFields.add("action_scene");
    openapiFields.add("ad_ids");
    openapiFields.add("audience_level");
    openapiFields.add("campaign_ids");
    openapiFields.add("interest_action_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAudienceInterestActionListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAudienceInterestActionListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAudienceInterestActionListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAudienceInterestActionListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAudienceInterestActionListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportAudienceInterestActionListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAudienceInterestActionListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAudienceInterestActionListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAudienceInterestActionListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportAudienceInterestActionListV2Filtering
  */
  public static ReportAudienceInterestActionListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAudienceInterestActionListV2Filtering.class);
  }

 /**
  * Convert an instance of ReportAudienceInterestActionListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

