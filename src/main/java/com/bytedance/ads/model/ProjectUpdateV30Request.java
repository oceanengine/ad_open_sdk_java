/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectUpdateV30AudienceExtend;
import com.bytedance.ads.model.ProjectUpdateV30DownloadMode;
import com.bytedance.ads.model.ProjectUpdateV30RequestAudience;
import com.bytedance.ads.model.ProjectUpdateV30RequestDeliverySetting;
import com.bytedance.ads.model.ProjectUpdateV30RequestDpaProductTargetInner;
import com.bytedance.ads.model.ProjectUpdateV30RequestKeywordsInner;
import com.bytedance.ads.model.ProjectUpdateV30RequestTrackUrlSetting;
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
 * ProjectUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ProjectUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private ProjectUpdateV30RequestAudience audience = null;

  public static final String SERIALIZED_NAME_AUDIENCE_EXTEND = "audience_extend";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_EXTEND)
  private ProjectUpdateV30AudienceExtend audienceExtend = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private ProjectUpdateV30RequestDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_MODE = "download_mode";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_MODE)
  private ProjectUpdateV30DownloadMode downloadMode = null;

  public static final String SERIALIZED_NAME_DPA_CATEGORIES = "dpa_categories";
  @SerializedName(SERIALIZED_NAME_DPA_CATEGORIES)
  private List<Long> dpaCategories = null;

  public static final String SERIALIZED_NAME_DPA_PRODUCT_TARGET = "dpa_product_target";
  @SerializedName(SERIALIZED_NAME_DPA_PRODUCT_TARGET)
  private List<ProjectUpdateV30RequestDpaProductTargetInner> dpaProductTarget = null;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<ProjectUpdateV30RequestKeywordsInner> keywords = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_OPEN_URL_FIELD = "open_url_field";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_FIELD)
  private String openUrlField = null;

  public static final String SERIALIZED_NAME_OPEN_URL_PARAMS = "open_url_params";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_PARAMS)
  private String openUrlParams = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_SEARCH_BID_RATIO = "search_bid_ratio";
  @SerializedName(SERIALIZED_NAME_SEARCH_BID_RATIO)
  private Double searchBidRatio = null;

  public static final String SERIALIZED_NAME_TRACK_URL_SETTING = "track_url_setting";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_SETTING)
  private ProjectUpdateV30RequestTrackUrlSetting trackUrlSetting = null;

  public static final String SERIALIZED_NAME_ULINK_URL = "ulink_url";
  @SerializedName(SERIALIZED_NAME_ULINK_URL)
  private String ulinkUrl = null;

  public ProjectUpdateV30Request() {
  }

  public ProjectUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ProjectUpdateV30Request audience(ProjectUpdateV30RequestAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30RequestAudience getAudience() {
    return audience;
  }


  public void setAudience(ProjectUpdateV30RequestAudience audience) {
    this.audience = audience;
  }


  public ProjectUpdateV30Request audienceExtend(ProjectUpdateV30AudienceExtend audienceExtend) {
    
    this.audienceExtend = audienceExtend;
    return this;
  }

   /**
   * Get audienceExtend
   * @return audienceExtend
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30AudienceExtend getAudienceExtend() {
    return audienceExtend;
  }


  public void setAudienceExtend(ProjectUpdateV30AudienceExtend audienceExtend) {
    this.audienceExtend = audienceExtend;
  }


  public ProjectUpdateV30Request deliverySetting(ProjectUpdateV30RequestDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30RequestDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(ProjectUpdateV30RequestDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public ProjectUpdateV30Request downloadMode(ProjectUpdateV30DownloadMode downloadMode) {
    
    this.downloadMode = downloadMode;
    return this;
  }

   /**
   * Get downloadMode
   * @return downloadMode
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30DownloadMode getDownloadMode() {
    return downloadMode;
  }


  public void setDownloadMode(ProjectUpdateV30DownloadMode downloadMode) {
    this.downloadMode = downloadMode;
  }


  public ProjectUpdateV30Request dpaCategories(List<Long> dpaCategories) {
    
    this.dpaCategories = dpaCategories;
    return this;
  }

  public ProjectUpdateV30Request addDpaCategoriesItem(Long dpaCategoriesItem) {
    if (this.dpaCategories == null) {
      this.dpaCategories = new ArrayList<>();
    }
    this.dpaCategories.add(dpaCategoriesItem);
    return this;
  }

   /**
   * 
   * @return dpaCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getDpaCategories() {
    return dpaCategories;
  }


  public void setDpaCategories(List<Long> dpaCategories) {
    this.dpaCategories = dpaCategories;
  }


  public ProjectUpdateV30Request dpaProductTarget(List<ProjectUpdateV30RequestDpaProductTargetInner> dpaProductTarget) {
    
    this.dpaProductTarget = dpaProductTarget;
    return this;
  }

  public ProjectUpdateV30Request addDpaProductTargetItem(ProjectUpdateV30RequestDpaProductTargetInner dpaProductTargetItem) {
    if (this.dpaProductTarget == null) {
      this.dpaProductTarget = new ArrayList<>();
    }
    this.dpaProductTarget.add(dpaProductTargetItem);
    return this;
  }

   /**
   * 
   * @return dpaProductTarget
  **/
  @javax.annotation.Nullable
  public List<ProjectUpdateV30RequestDpaProductTargetInner> getDpaProductTarget() {
    return dpaProductTarget;
  }


  public void setDpaProductTarget(List<ProjectUpdateV30RequestDpaProductTargetInner> dpaProductTarget) {
    this.dpaProductTarget = dpaProductTarget;
  }


  public ProjectUpdateV30Request keywords(List<ProjectUpdateV30RequestKeywordsInner> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public ProjectUpdateV30Request addKeywordsItem(ProjectUpdateV30RequestKeywordsInner keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<ProjectUpdateV30RequestKeywordsInner> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<ProjectUpdateV30RequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }


  public ProjectUpdateV30Request name(String name) {
    
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


  public ProjectUpdateV30Request openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public ProjectUpdateV30Request openUrlField(String openUrlField) {
    
    this.openUrlField = openUrlField;
    return this;
  }

   /**
   * 
   * @return openUrlField
  **/
  @javax.annotation.Nullable
  public String getOpenUrlField() {
    return openUrlField;
  }


  public void setOpenUrlField(String openUrlField) {
    this.openUrlField = openUrlField;
  }


  public ProjectUpdateV30Request openUrlParams(String openUrlParams) {
    
    this.openUrlParams = openUrlParams;
    return this;
  }

   /**
   * 
   * @return openUrlParams
  **/
  @javax.annotation.Nullable
  public String getOpenUrlParams() {
    return openUrlParams;
  }


  public void setOpenUrlParams(String openUrlParams) {
    this.openUrlParams = openUrlParams;
  }


  public ProjectUpdateV30Request projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public ProjectUpdateV30Request searchBidRatio(Double searchBidRatio) {
    
    this.searchBidRatio = searchBidRatio;
    return this;
  }

   /**
   * 
   * @return searchBidRatio
  **/
  @javax.annotation.Nullable
  public Double getSearchBidRatio() {
    return searchBidRatio;
  }


  public void setSearchBidRatio(Double searchBidRatio) {
    this.searchBidRatio = searchBidRatio;
  }


  public ProjectUpdateV30Request trackUrlSetting(ProjectUpdateV30RequestTrackUrlSetting trackUrlSetting) {
    
    this.trackUrlSetting = trackUrlSetting;
    return this;
  }

   /**
   * Get trackUrlSetting
   * @return trackUrlSetting
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30RequestTrackUrlSetting getTrackUrlSetting() {
    return trackUrlSetting;
  }


  public void setTrackUrlSetting(ProjectUpdateV30RequestTrackUrlSetting trackUrlSetting) {
    this.trackUrlSetting = trackUrlSetting;
  }


  public ProjectUpdateV30Request ulinkUrl(String ulinkUrl) {
    
    this.ulinkUrl = ulinkUrl;
    return this;
  }

   /**
   * 
   * @return ulinkUrl
  **/
  @javax.annotation.Nullable
  public String getUlinkUrl() {
    return ulinkUrl;
  }


  public void setUlinkUrl(String ulinkUrl) {
    this.ulinkUrl = ulinkUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateV30Request projectUpdateV30Request = (ProjectUpdateV30Request) o;
    return Objects.equals(this.advertiserId, projectUpdateV30Request.advertiserId) &&
        Objects.equals(this.audience, projectUpdateV30Request.audience) &&
        Objects.equals(this.audienceExtend, projectUpdateV30Request.audienceExtend) &&
        Objects.equals(this.deliverySetting, projectUpdateV30Request.deliverySetting) &&
        Objects.equals(this.downloadMode, projectUpdateV30Request.downloadMode) &&
        Objects.equals(this.dpaCategories, projectUpdateV30Request.dpaCategories) &&
        Objects.equals(this.dpaProductTarget, projectUpdateV30Request.dpaProductTarget) &&
        Objects.equals(this.keywords, projectUpdateV30Request.keywords) &&
        Objects.equals(this.name, projectUpdateV30Request.name) &&
        Objects.equals(this.openUrl, projectUpdateV30Request.openUrl) &&
        Objects.equals(this.openUrlField, projectUpdateV30Request.openUrlField) &&
        Objects.equals(this.openUrlParams, projectUpdateV30Request.openUrlParams) &&
        Objects.equals(this.projectId, projectUpdateV30Request.projectId) &&
        Objects.equals(this.searchBidRatio, projectUpdateV30Request.searchBidRatio) &&
        Objects.equals(this.trackUrlSetting, projectUpdateV30Request.trackUrlSetting) &&
        Objects.equals(this.ulinkUrl, projectUpdateV30Request.ulinkUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, audience, audienceExtend, deliverySetting, downloadMode, dpaCategories, dpaProductTarget, keywords, name, openUrl, openUrlField, openUrlParams, projectId, searchBidRatio, trackUrlSetting, ulinkUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    audienceExtend: ").append(toIndentedString(audienceExtend)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    downloadMode: ").append(toIndentedString(downloadMode)).append("\n");
    sb.append("    dpaCategories: ").append(toIndentedString(dpaCategories)).append("\n");
    sb.append("    dpaProductTarget: ").append(toIndentedString(dpaProductTarget)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    openUrlField: ").append(toIndentedString(openUrlField)).append("\n");
    sb.append("    openUrlParams: ").append(toIndentedString(openUrlParams)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    searchBidRatio: ").append(toIndentedString(searchBidRatio)).append("\n");
    sb.append("    trackUrlSetting: ").append(toIndentedString(trackUrlSetting)).append("\n");
    sb.append("    ulinkUrl: ").append(toIndentedString(ulinkUrl)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("audience_extend");
    openapiFields.add("delivery_setting");
    openapiFields.add("download_mode");
    openapiFields.add("dpa_categories");
    openapiFields.add("dpa_product_target");
    openapiFields.add("keywords");
    openapiFields.add("name");
    openapiFields.add("open_url");
    openapiFields.add("open_url_field");
    openapiFields.add("open_url_params");
    openapiFields.add("project_id");
    openapiFields.add("search_bid_ratio");
    openapiFields.add("track_url_setting");
    openapiFields.add("ulink_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("project_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, ProjectUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to ProjectUpdateV30Request
  */
  public static ProjectUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUpdateV30Request.class);
  }

 /**
  * Convert an instance of ProjectUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

