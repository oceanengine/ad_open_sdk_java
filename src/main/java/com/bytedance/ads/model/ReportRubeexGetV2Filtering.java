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
import com.bytedance.ads.model.ReportRubeexGetV2FilteringAppCode;
import com.bytedance.ads.model.ReportRubeexGetV2FilteringDataScope;
import com.bytedance.ads.model.ReportRubeexGetV2FilteringOsType;
import com.bytedance.ads.model.ReportRubeexGetV2FilteringPlayableType;
import com.bytedance.ads.model.ReportRubeexGetV2FilteringType;
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
public class ReportRubeexGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_APP_CODE = "app_code";
  @SerializedName(SERIALIZED_NAME_APP_CODE)
  private ReportRubeexGetV2FilteringAppCode appCode = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_DATA_MD5 = "data_md5";
  @SerializedName(SERIALIZED_NAME_DATA_MD5)
  private String dataMd5 = null;

  public static final String SERIALIZED_NAME_DATA_SCOPE = "data_scope";
  @SerializedName(SERIALIZED_NAME_DATA_SCOPE)
  private ReportRubeexGetV2FilteringDataScope dataScope = null;

  public static final String SERIALIZED_NAME_OS_TYPE = "os_type";
  @SerializedName(SERIALIZED_NAME_OS_TYPE)
  private ReportRubeexGetV2FilteringOsType osType = null;

  public static final String SERIALIZED_NAME_PLAYABLE_TYPE = "playable_type";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_TYPE)
  private ReportRubeexGetV2FilteringPlayableType playableType = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ReportRubeexGetV2FilteringType type = null;

  public ReportRubeexGetV2Filtering() {
  }

  public ReportRubeexGetV2Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ReportRubeexGetV2Filtering addAdIdsItem(Long adIdsItem) {
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


  public ReportRubeexGetV2Filtering appCode(ReportRubeexGetV2FilteringAppCode appCode) {
    
    this.appCode = appCode;
    return this;
  }

   /**
   * Get appCode
   * @return appCode
  **/
  @javax.annotation.Nullable
  public ReportRubeexGetV2FilteringAppCode getAppCode() {
    return appCode;
  }


  public void setAppCode(ReportRubeexGetV2FilteringAppCode appCode) {
    this.appCode = appCode;
  }


  public ReportRubeexGetV2Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportRubeexGetV2Filtering addCampaignIdsItem(Long campaignIdsItem) {
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


  public ReportRubeexGetV2Filtering creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public ReportRubeexGetV2Filtering addCreativeIdsItem(Long creativeIdsItem) {
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


  public ReportRubeexGetV2Filtering dataMd5(String dataMd5) {
    
    this.dataMd5 = dataMd5;
    return this;
  }

   /**
   * 
   * @return dataMd5
  **/
  @javax.annotation.Nullable
  public String getDataMd5() {
    return dataMd5;
  }


  public void setDataMd5(String dataMd5) {
    this.dataMd5 = dataMd5;
  }


  public ReportRubeexGetV2Filtering dataScope(ReportRubeexGetV2FilteringDataScope dataScope) {
    
    this.dataScope = dataScope;
    return this;
  }

   /**
   * Get dataScope
   * @return dataScope
  **/
  @javax.annotation.Nullable
  public ReportRubeexGetV2FilteringDataScope getDataScope() {
    return dataScope;
  }


  public void setDataScope(ReportRubeexGetV2FilteringDataScope dataScope) {
    this.dataScope = dataScope;
  }


  public ReportRubeexGetV2Filtering osType(ReportRubeexGetV2FilteringOsType osType) {
    
    this.osType = osType;
    return this;
  }

   /**
   * Get osType
   * @return osType
  **/
  @javax.annotation.Nullable
  public ReportRubeexGetV2FilteringOsType getOsType() {
    return osType;
  }


  public void setOsType(ReportRubeexGetV2FilteringOsType osType) {
    this.osType = osType;
  }


  public ReportRubeexGetV2Filtering playableType(ReportRubeexGetV2FilteringPlayableType playableType) {
    
    this.playableType = playableType;
    return this;
  }

   /**
   * Get playableType
   * @return playableType
  **/
  @javax.annotation.Nullable
  public ReportRubeexGetV2FilteringPlayableType getPlayableType() {
    return playableType;
  }


  public void setPlayableType(ReportRubeexGetV2FilteringPlayableType playableType) {
    this.playableType = playableType;
  }


  public ReportRubeexGetV2Filtering type(ReportRubeexGetV2FilteringType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ReportRubeexGetV2FilteringType getType() {
    return type;
  }


  public void setType(ReportRubeexGetV2FilteringType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRubeexGetV2Filtering reportRubeexGetV2Filtering = (ReportRubeexGetV2Filtering) o;
    return Objects.equals(this.adIds, reportRubeexGetV2Filtering.adIds) &&
        Objects.equals(this.appCode, reportRubeexGetV2Filtering.appCode) &&
        Objects.equals(this.campaignIds, reportRubeexGetV2Filtering.campaignIds) &&
        Objects.equals(this.creativeIds, reportRubeexGetV2Filtering.creativeIds) &&
        Objects.equals(this.dataMd5, reportRubeexGetV2Filtering.dataMd5) &&
        Objects.equals(this.dataScope, reportRubeexGetV2Filtering.dataScope) &&
        Objects.equals(this.osType, reportRubeexGetV2Filtering.osType) &&
        Objects.equals(this.playableType, reportRubeexGetV2Filtering.playableType) &&
        Objects.equals(this.type, reportRubeexGetV2Filtering.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, appCode, campaignIds, creativeIds, dataMd5, dataScope, osType, playableType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRubeexGetV2Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    appCode: ").append(toIndentedString(appCode)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    dataMd5: ").append(toIndentedString(dataMd5)).append("\n");
    sb.append("    dataScope: ").append(toIndentedString(dataScope)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    playableType: ").append(toIndentedString(playableType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("app_code");
    openapiFields.add("campaign_ids");
    openapiFields.add("creative_ids");
    openapiFields.add("data_md5");
    openapiFields.add("data_scope");
    openapiFields.add("os_type");
    openapiFields.add("playable_type");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRubeexGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRubeexGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRubeexGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRubeexGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRubeexGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportRubeexGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRubeexGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRubeexGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRubeexGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportRubeexGetV2Filtering
  */
  public static ReportRubeexGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRubeexGetV2Filtering.class);
  }

 /**
  * Convert an instance of ReportRubeexGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

