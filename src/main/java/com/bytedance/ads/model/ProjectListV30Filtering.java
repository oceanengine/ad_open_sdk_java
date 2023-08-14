/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectListV30FilteringAdType;
import com.bytedance.ads.model.ProjectListV30FilteringAppPromotionType;
import com.bytedance.ads.model.ProjectListV30FilteringDeliveryMode;
import com.bytedance.ads.model.ProjectListV30FilteringInventoryType;
import com.bytedance.ads.model.ProjectListV30FilteringLandingType;
import com.bytedance.ads.model.ProjectListV30FilteringMarketingGoal;
import com.bytedance.ads.model.ProjectListV30FilteringPlatform;
import com.bytedance.ads.model.ProjectListV30FilteringPricing;
import com.bytedance.ads.model.ProjectListV30FilteringStatus;
import com.bytedance.ads.model.ProjectListV30FilteringStatusFirst;
import com.bytedance.ads.model.ProjectListV30FilteringStatusSecond;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-14T15:20:18.530+08:00[Asia/Shanghai]")
public class ProjectListV30Filtering {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private ProjectListV30FilteringAdType adType = null;

  public static final String SERIALIZED_NAME_APP_PROMOTION_TYPE = "app_promotion_type";
  @SerializedName(SERIALIZED_NAME_APP_PROMOTION_TYPE)
  private ProjectListV30FilteringAppPromotionType appPromotionType = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private ProjectListV30FilteringDeliveryMode deliveryMode = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
  private ProjectListV30FilteringInventoryType inventoryType = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private ProjectListV30FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private ProjectListV30FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private ProjectListV30FilteringPlatform platform = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private ProjectListV30FilteringPricing pricing = null;

  public static final String SERIALIZED_NAME_PROJECT_CREATE_TIME = "project_create_time";
  @SerializedName(SERIALIZED_NAME_PROJECT_CREATE_TIME)
  private LocalDate projectCreateTime = null;

  public static final String SERIALIZED_NAME_PROJECT_MODIFY_TIME = "project_modify_time";
  @SerializedName(SERIALIZED_NAME_PROJECT_MODIFY_TIME)
  private LocalDate projectModifyTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ProjectListV30FilteringStatus status = null;

  public static final String SERIALIZED_NAME_STATUS_FIRST = "status_first";
  @SerializedName(SERIALIZED_NAME_STATUS_FIRST)
  private ProjectListV30FilteringStatusFirst statusFirst = null;

  public static final String SERIALIZED_NAME_STATUS_SECOND = "status_second";
  @SerializedName(SERIALIZED_NAME_STATUS_SECOND)
  private ProjectListV30FilteringStatusSecond statusSecond = null;

  public ProjectListV30Filtering() {
  }

  public ProjectListV30Filtering adType(ProjectListV30FilteringAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringAdType getAdType() {
    return adType;
  }


  public void setAdType(ProjectListV30FilteringAdType adType) {
    this.adType = adType;
  }


  public ProjectListV30Filtering appPromotionType(ProjectListV30FilteringAppPromotionType appPromotionType) {
    
    this.appPromotionType = appPromotionType;
    return this;
  }

   /**
   * Get appPromotionType
   * @return appPromotionType
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringAppPromotionType getAppPromotionType() {
    return appPromotionType;
  }


  public void setAppPromotionType(ProjectListV30FilteringAppPromotionType appPromotionType) {
    this.appPromotionType = appPromotionType;
  }


  public ProjectListV30Filtering deliveryMode(ProjectListV30FilteringDeliveryMode deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Get deliveryMode
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringDeliveryMode getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(ProjectListV30FilteringDeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public ProjectListV30Filtering ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public ProjectListV30Filtering addIdsItem(Long idsItem) {
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


  public ProjectListV30Filtering inventoryType(ProjectListV30FilteringInventoryType inventoryType) {
    
    this.inventoryType = inventoryType;
    return this;
  }

   /**
   * Get inventoryType
   * @return inventoryType
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringInventoryType getInventoryType() {
    return inventoryType;
  }


  public void setInventoryType(ProjectListV30FilteringInventoryType inventoryType) {
    this.inventoryType = inventoryType;
  }


  public ProjectListV30Filtering landingType(ProjectListV30FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(ProjectListV30FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public ProjectListV30Filtering marketingGoal(ProjectListV30FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(ProjectListV30FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public ProjectListV30Filtering name(String name) {
    
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


  public ProjectListV30Filtering platform(ProjectListV30FilteringPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(ProjectListV30FilteringPlatform platform) {
    this.platform = platform;
  }


  public ProjectListV30Filtering pricing(ProjectListV30FilteringPricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringPricing getPricing() {
    return pricing;
  }


  public void setPricing(ProjectListV30FilteringPricing pricing) {
    this.pricing = pricing;
  }


  public ProjectListV30Filtering projectCreateTime(LocalDate projectCreateTime) {
    
    this.projectCreateTime = projectCreateTime;
    return this;
  }

   /**
   * 
   * @return projectCreateTime
  **/
  @javax.annotation.Nullable
  public LocalDate getProjectCreateTime() {
    return projectCreateTime;
  }


  public void setProjectCreateTime(LocalDate projectCreateTime) {
    this.projectCreateTime = projectCreateTime;
  }


  public ProjectListV30Filtering projectModifyTime(LocalDate projectModifyTime) {
    
    this.projectModifyTime = projectModifyTime;
    return this;
  }

   /**
   * 
   * @return projectModifyTime
  **/
  @javax.annotation.Nullable
  public LocalDate getProjectModifyTime() {
    return projectModifyTime;
  }


  public void setProjectModifyTime(LocalDate projectModifyTime) {
    this.projectModifyTime = projectModifyTime;
  }


  public ProjectListV30Filtering status(ProjectListV30FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(ProjectListV30FilteringStatus status) {
    this.status = status;
  }


  public ProjectListV30Filtering statusFirst(ProjectListV30FilteringStatusFirst statusFirst) {
    
    this.statusFirst = statusFirst;
    return this;
  }

   /**
   * Get statusFirst
   * @return statusFirst
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringStatusFirst getStatusFirst() {
    return statusFirst;
  }


  public void setStatusFirst(ProjectListV30FilteringStatusFirst statusFirst) {
    this.statusFirst = statusFirst;
  }


  public ProjectListV30Filtering statusSecond(ProjectListV30FilteringStatusSecond statusSecond) {
    
    this.statusSecond = statusSecond;
    return this;
  }

   /**
   * Get statusSecond
   * @return statusSecond
  **/
  @javax.annotation.Nullable
  public ProjectListV30FilteringStatusSecond getStatusSecond() {
    return statusSecond;
  }


  public void setStatusSecond(ProjectListV30FilteringStatusSecond statusSecond) {
    this.statusSecond = statusSecond;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectListV30Filtering projectListV30Filtering = (ProjectListV30Filtering) o;
    return Objects.equals(this.adType, projectListV30Filtering.adType) &&
        Objects.equals(this.appPromotionType, projectListV30Filtering.appPromotionType) &&
        Objects.equals(this.deliveryMode, projectListV30Filtering.deliveryMode) &&
        Objects.equals(this.ids, projectListV30Filtering.ids) &&
        Objects.equals(this.inventoryType, projectListV30Filtering.inventoryType) &&
        Objects.equals(this.landingType, projectListV30Filtering.landingType) &&
        Objects.equals(this.marketingGoal, projectListV30Filtering.marketingGoal) &&
        Objects.equals(this.name, projectListV30Filtering.name) &&
        Objects.equals(this.platform, projectListV30Filtering.platform) &&
        Objects.equals(this.pricing, projectListV30Filtering.pricing) &&
        Objects.equals(this.projectCreateTime, projectListV30Filtering.projectCreateTime) &&
        Objects.equals(this.projectModifyTime, projectListV30Filtering.projectModifyTime) &&
        Objects.equals(this.status, projectListV30Filtering.status) &&
        Objects.equals(this.statusFirst, projectListV30Filtering.statusFirst) &&
        Objects.equals(this.statusSecond, projectListV30Filtering.statusSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, appPromotionType, deliveryMode, ids, inventoryType, landingType, marketingGoal, name, platform, pricing, projectCreateTime, projectModifyTime, status, statusFirst, statusSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectListV30Filtering {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    appPromotionType: ").append(toIndentedString(appPromotionType)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    projectCreateTime: ").append(toIndentedString(projectCreateTime)).append("\n");
    sb.append("    projectModifyTime: ").append(toIndentedString(projectModifyTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusFirst: ").append(toIndentedString(statusFirst)).append("\n");
    sb.append("    statusSecond: ").append(toIndentedString(statusSecond)).append("\n");
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
    openapiFields.add("ad_type");
    openapiFields.add("app_promotion_type");
    openapiFields.add("delivery_mode");
    openapiFields.add("ids");
    openapiFields.add("inventory_type");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_goal");
    openapiFields.add("name");
    openapiFields.add("platform");
    openapiFields.add("pricing");
    openapiFields.add("project_create_time");
    openapiFields.add("project_modify_time");
    openapiFields.add("status");
    openapiFields.add("status_first");
    openapiFields.add("status_second");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30Filtering>() {
           @Override
           public void write(JsonWriter out, ProjectListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30Filtering
  */
  public static ProjectListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30Filtering.class);
  }

 /**
  * Convert an instance of ProjectListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

