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
import com.bytedance.ads.model.LocalProjectListV30FilteringAdType;
import com.bytedance.ads.model.LocalProjectListV30FilteringBidType;
import com.bytedance.ads.model.LocalProjectListV30FilteringLocalDeliveryScene;
import com.bytedance.ads.model.LocalProjectListV30FilteringMarketingGoal;
import com.bytedance.ads.model.LocalProjectListV30FilteringProjectStatusFirst;
import com.bytedance.ads.model.LocalProjectListV30FilteringProjectStatusSecond;
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
public class LocalProjectListV30Filtering {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private LocalProjectListV30FilteringAdType adType = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private LocalProjectListV30FilteringBidType bidType = null;

  public static final String SERIALIZED_NAME_LOCAL_DELIVERY_SCENE = "local_delivery_scene";
  @SerializedName(SERIALIZED_NAME_LOCAL_DELIVERY_SCENE)
  private LocalProjectListV30FilteringLocalDeliveryScene localDeliveryScene = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private LocalProjectListV30FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_PROJECT_CREATE_TIME_END = "project_create_time_end";
  @SerializedName(SERIALIZED_NAME_PROJECT_CREATE_TIME_END)
  private String projectCreateTimeEnd = null;

  public static final String SERIALIZED_NAME_PROJECT_CREATE_TIME_START = "project_create_time_start";
  @SerializedName(SERIALIZED_NAME_PROJECT_CREATE_TIME_START)
  private String projectCreateTimeStart = null;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "project_ids";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = null;

  public static final String SERIALIZED_NAME_PROJECT_MODIFY_TIME_END = "project_modify_time_end";
  @SerializedName(SERIALIZED_NAME_PROJECT_MODIFY_TIME_END)
  private String projectModifyTimeEnd = null;

  public static final String SERIALIZED_NAME_PROJECT_MODIFY_TIME_START = "project_modify_time_start";
  @SerializedName(SERIALIZED_NAME_PROJECT_MODIFY_TIME_START)
  private String projectModifyTimeStart = null;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_FIRST = "project_status_first";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_FIRST)
  private LocalProjectListV30FilteringProjectStatusFirst projectStatusFirst = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_SECOND = "project_status_second";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_SECOND)
  private LocalProjectListV30FilteringProjectStatusSecond projectStatusSecond = null;

  public static final String SERIALIZED_NAME_SHOP_IDS = "shop_ids";
  @SerializedName(SERIALIZED_NAME_SHOP_IDS)
  private List<Long> shopIds = null;

  public LocalProjectListV30Filtering() {
  }

  public LocalProjectListV30Filtering adType(LocalProjectListV30FilteringAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30FilteringAdType getAdType() {
    return adType;
  }


  public void setAdType(LocalProjectListV30FilteringAdType adType) {
    this.adType = adType;
  }


  public LocalProjectListV30Filtering bidType(LocalProjectListV30FilteringBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30FilteringBidType getBidType() {
    return bidType;
  }


  public void setBidType(LocalProjectListV30FilteringBidType bidType) {
    this.bidType = bidType;
  }


  public LocalProjectListV30Filtering localDeliveryScene(LocalProjectListV30FilteringLocalDeliveryScene localDeliveryScene) {
    
    this.localDeliveryScene = localDeliveryScene;
    return this;
  }

   /**
   * Get localDeliveryScene
   * @return localDeliveryScene
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30FilteringLocalDeliveryScene getLocalDeliveryScene() {
    return localDeliveryScene;
  }


  public void setLocalDeliveryScene(LocalProjectListV30FilteringLocalDeliveryScene localDeliveryScene) {
    this.localDeliveryScene = localDeliveryScene;
  }


  public LocalProjectListV30Filtering marketingGoal(LocalProjectListV30FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(LocalProjectListV30FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public LocalProjectListV30Filtering productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public LocalProjectListV30Filtering addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 商品IDs筛选，最多10个
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }


  public LocalProjectListV30Filtering projectCreateTimeEnd(String projectCreateTimeEnd) {
    
    this.projectCreateTimeEnd = projectCreateTimeEnd;
    return this;
  }

   /**
   * 项目创建结束时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;与time_start搭配使用
   * @return projectCreateTimeEnd
  **/
  @javax.annotation.Nullable
  public String getProjectCreateTimeEnd() {
    return projectCreateTimeEnd;
  }


  public void setProjectCreateTimeEnd(String projectCreateTimeEnd) {
    this.projectCreateTimeEnd = projectCreateTimeEnd;
  }


  public LocalProjectListV30Filtering projectCreateTimeStart(String projectCreateTimeStart) {
    
    this.projectCreateTimeStart = projectCreateTimeStart;
    return this;
  }

   /**
   * 项目创建开始时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;,与time_end搭配使用
   * @return projectCreateTimeStart
  **/
  @javax.annotation.Nullable
  public String getProjectCreateTimeStart() {
    return projectCreateTimeStart;
  }


  public void setProjectCreateTimeStart(String projectCreateTimeStart) {
    this.projectCreateTimeStart = projectCreateTimeStart;
  }


  public LocalProjectListV30Filtering projectIds(List<Long> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public LocalProjectListV30Filtering addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * 项目IDs筛选，最多100个
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }


  public LocalProjectListV30Filtering projectModifyTimeEnd(String projectModifyTimeEnd) {
    
    this.projectModifyTimeEnd = projectModifyTimeEnd;
    return this;
  }

   /**
   * 项目更新结束时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;,与time_start搭配使用
   * @return projectModifyTimeEnd
  **/
  @javax.annotation.Nullable
  public String getProjectModifyTimeEnd() {
    return projectModifyTimeEnd;
  }


  public void setProjectModifyTimeEnd(String projectModifyTimeEnd) {
    this.projectModifyTimeEnd = projectModifyTimeEnd;
  }


  public LocalProjectListV30Filtering projectModifyTimeStart(String projectModifyTimeStart) {
    
    this.projectModifyTimeStart = projectModifyTimeStart;
    return this;
  }

   /**
   * 项目更新开始时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;,与time_end搭配使用
   * @return projectModifyTimeStart
  **/
  @javax.annotation.Nullable
  public String getProjectModifyTimeStart() {
    return projectModifyTimeStart;
  }


  public void setProjectModifyTimeStart(String projectModifyTimeStart) {
    this.projectModifyTimeStart = projectModifyTimeStart;
  }


  public LocalProjectListV30Filtering projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * 项目名称模糊搜索
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public LocalProjectListV30Filtering projectStatusFirst(LocalProjectListV30FilteringProjectStatusFirst projectStatusFirst) {
    
    this.projectStatusFirst = projectStatusFirst;
    return this;
  }

   /**
   * Get projectStatusFirst
   * @return projectStatusFirst
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30FilteringProjectStatusFirst getProjectStatusFirst() {
    return projectStatusFirst;
  }


  public void setProjectStatusFirst(LocalProjectListV30FilteringProjectStatusFirst projectStatusFirst) {
    this.projectStatusFirst = projectStatusFirst;
  }


  public LocalProjectListV30Filtering projectStatusSecond(LocalProjectListV30FilteringProjectStatusSecond projectStatusSecond) {
    
    this.projectStatusSecond = projectStatusSecond;
    return this;
  }

   /**
   * Get projectStatusSecond
   * @return projectStatusSecond
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30FilteringProjectStatusSecond getProjectStatusSecond() {
    return projectStatusSecond;
  }


  public void setProjectStatusSecond(LocalProjectListV30FilteringProjectStatusSecond projectStatusSecond) {
    this.projectStatusSecond = projectStatusSecond;
  }


  public LocalProjectListV30Filtering shopIds(List<Long> shopIds) {
    
    this.shopIds = shopIds;
    return this;
  }

  public LocalProjectListV30Filtering addShopIdsItem(Long shopIdsItem) {
    if (this.shopIds == null) {
      this.shopIds = new ArrayList<>();
    }
    this.shopIds.add(shopIdsItem);
    return this;
  }

   /**
   * 门店IDs筛选，最多10个
   * @return shopIds
  **/
  @javax.annotation.Nullable
  public List<Long> getShopIds() {
    return shopIds;
  }


  public void setShopIds(List<Long> shopIds) {
    this.shopIds = shopIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectListV30Filtering localProjectListV30Filtering = (LocalProjectListV30Filtering) o;
    return Objects.equals(this.adType, localProjectListV30Filtering.adType) &&
        Objects.equals(this.bidType, localProjectListV30Filtering.bidType) &&
        Objects.equals(this.localDeliveryScene, localProjectListV30Filtering.localDeliveryScene) &&
        Objects.equals(this.marketingGoal, localProjectListV30Filtering.marketingGoal) &&
        Objects.equals(this.productIds, localProjectListV30Filtering.productIds) &&
        Objects.equals(this.projectCreateTimeEnd, localProjectListV30Filtering.projectCreateTimeEnd) &&
        Objects.equals(this.projectCreateTimeStart, localProjectListV30Filtering.projectCreateTimeStart) &&
        Objects.equals(this.projectIds, localProjectListV30Filtering.projectIds) &&
        Objects.equals(this.projectModifyTimeEnd, localProjectListV30Filtering.projectModifyTimeEnd) &&
        Objects.equals(this.projectModifyTimeStart, localProjectListV30Filtering.projectModifyTimeStart) &&
        Objects.equals(this.projectName, localProjectListV30Filtering.projectName) &&
        Objects.equals(this.projectStatusFirst, localProjectListV30Filtering.projectStatusFirst) &&
        Objects.equals(this.projectStatusSecond, localProjectListV30Filtering.projectStatusSecond) &&
        Objects.equals(this.shopIds, localProjectListV30Filtering.shopIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, bidType, localDeliveryScene, marketingGoal, productIds, projectCreateTimeEnd, projectCreateTimeStart, projectIds, projectModifyTimeEnd, projectModifyTimeStart, projectName, projectStatusFirst, projectStatusSecond, shopIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectListV30Filtering {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    localDeliveryScene: ").append(toIndentedString(localDeliveryScene)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    projectCreateTimeEnd: ").append(toIndentedString(projectCreateTimeEnd)).append("\n");
    sb.append("    projectCreateTimeStart: ").append(toIndentedString(projectCreateTimeStart)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    projectModifyTimeEnd: ").append(toIndentedString(projectModifyTimeEnd)).append("\n");
    sb.append("    projectModifyTimeStart: ").append(toIndentedString(projectModifyTimeStart)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectStatusFirst: ").append(toIndentedString(projectStatusFirst)).append("\n");
    sb.append("    projectStatusSecond: ").append(toIndentedString(projectStatusSecond)).append("\n");
    sb.append("    shopIds: ").append(toIndentedString(shopIds)).append("\n");
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
    openapiFields.add("bid_type");
    openapiFields.add("local_delivery_scene");
    openapiFields.add("marketing_goal");
    openapiFields.add("product_ids");
    openapiFields.add("project_create_time_end");
    openapiFields.add("project_create_time_start");
    openapiFields.add("project_ids");
    openapiFields.add("project_modify_time_end");
    openapiFields.add("project_modify_time_start");
    openapiFields.add("project_name");
    openapiFields.add("project_status_first");
    openapiFields.add("project_status_second");
    openapiFields.add("shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectListV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalProjectListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalProjectListV30Filtering
  */
  public static LocalProjectListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectListV30Filtering.class);
  }

 /**
  * Convert an instance of LocalProjectListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
