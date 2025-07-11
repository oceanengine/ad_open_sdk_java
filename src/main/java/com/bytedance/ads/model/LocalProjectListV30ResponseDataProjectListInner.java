/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListAdType;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListBidType;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListDeliveryGoal;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListExternalAction;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListLocalDeliveryScene;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListMarketingGoal;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListProjectBudgetMode;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListProjectStatusFirst;
import com.bytedance.ads.model.LocalProjectListV30DataProjectListProjectStatusSecond;
import com.bytedance.ads.model.LocalProjectListV30ResponseDataProjectListInnerPoiInfo;
import com.bytedance.ads.model.LocalProjectListV30ResponseDataProjectListInnerProductInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * LocalProjectListV30ResponseDataProjectListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class LocalProjectListV30ResponseDataProjectListInner {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private LocalProjectListV30DataProjectListAdType adType = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private LocalProjectListV30DataProjectListBidType bidType = null;

  public static final String SERIALIZED_NAME_DELIVERY_GOAL = "delivery_goal";
  @SerializedName(SERIALIZED_NAME_DELIVERY_GOAL)
  private LocalProjectListV30DataProjectListDeliveryGoal deliveryGoal = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private LocalProjectListV30DataProjectListExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_LOCAL_DELIVERY_SCENE = "local_delivery_scene";
  @SerializedName(SERIALIZED_NAME_LOCAL_DELIVERY_SCENE)
  private LocalProjectListV30DataProjectListLocalDeliveryScene localDeliveryScene = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private LocalProjectListV30DataProjectListMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_POI_INFO = "poi_info";
  @SerializedName(SERIALIZED_NAME_POI_INFO)
  private LocalProjectListV30ResponseDataProjectListInnerPoiInfo poiInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private LocalProjectListV30ResponseDataProjectListInnerProductInfo productInfo = null;

  public static final String SERIALIZED_NAME_PROJECT_BID = "project_bid";
  @SerializedName(SERIALIZED_NAME_PROJECT_BID)
  private String projectBid = null;

  public static final String SERIALIZED_NAME_PROJECT_BUDGET = "project_budget";
  @SerializedName(SERIALIZED_NAME_PROJECT_BUDGET)
  private String projectBudget = null;

  public static final String SERIALIZED_NAME_PROJECT_BUDGET_MODE = "project_budget_mode";
  @SerializedName(SERIALIZED_NAME_PROJECT_BUDGET_MODE)
  private LocalProjectListV30DataProjectListProjectBudgetMode projectBudgetMode = null;

  public static final String SERIALIZED_NAME_PROJECT_CREATE_TIME = "project_create_time";
  @SerializedName(SERIALIZED_NAME_PROJECT_CREATE_TIME)
  private String projectCreateTime = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROJECT_MODIFY_TIME = "project_modify_time";
  @SerializedName(SERIALIZED_NAME_PROJECT_MODIFY_TIME)
  private String projectModifyTime = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_FIRST = "project_status_first";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_FIRST)
  private LocalProjectListV30DataProjectListProjectStatusFirst projectStatusFirst = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_SECOND = "project_status_second";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_SECOND)
  private List<LocalProjectListV30DataProjectListProjectStatusSecond> projectStatusSecond = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public LocalProjectListV30ResponseDataProjectListInner() {
  }

  public LocalProjectListV30ResponseDataProjectListInner adType(LocalProjectListV30DataProjectListAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListAdType getAdType() {
    return adType;
  }


  public void setAdType(LocalProjectListV30DataProjectListAdType adType) {
    this.adType = adType;
  }


  public LocalProjectListV30ResponseDataProjectListInner bidType(LocalProjectListV30DataProjectListBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListBidType getBidType() {
    return bidType;
  }


  public void setBidType(LocalProjectListV30DataProjectListBidType bidType) {
    this.bidType = bidType;
  }


  public LocalProjectListV30ResponseDataProjectListInner deliveryGoal(LocalProjectListV30DataProjectListDeliveryGoal deliveryGoal) {
    
    this.deliveryGoal = deliveryGoal;
    return this;
  }

   /**
   * Get deliveryGoal
   * @return deliveryGoal
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListDeliveryGoal getDeliveryGoal() {
    return deliveryGoal;
  }


  public void setDeliveryGoal(LocalProjectListV30DataProjectListDeliveryGoal deliveryGoal) {
    this.deliveryGoal = deliveryGoal;
  }


  public LocalProjectListV30ResponseDataProjectListInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投放结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public LocalProjectListV30ResponseDataProjectListInner externalAction(LocalProjectListV30DataProjectListExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(LocalProjectListV30DataProjectListExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public LocalProjectListV30ResponseDataProjectListInner localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 广告账户id
   * @return localAccountId
  **/
  @javax.annotation.Nullable
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalProjectListV30ResponseDataProjectListInner localDeliveryScene(LocalProjectListV30DataProjectListLocalDeliveryScene localDeliveryScene) {
    
    this.localDeliveryScene = localDeliveryScene;
    return this;
  }

   /**
   * Get localDeliveryScene
   * @return localDeliveryScene
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListLocalDeliveryScene getLocalDeliveryScene() {
    return localDeliveryScene;
  }


  public void setLocalDeliveryScene(LocalProjectListV30DataProjectListLocalDeliveryScene localDeliveryScene) {
    this.localDeliveryScene = localDeliveryScene;
  }


  public LocalProjectListV30ResponseDataProjectListInner marketingGoal(LocalProjectListV30DataProjectListMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(LocalProjectListV30DataProjectListMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public LocalProjectListV30ResponseDataProjectListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 项目名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocalProjectListV30ResponseDataProjectListInner poiInfo(LocalProjectListV30ResponseDataProjectListInnerPoiInfo poiInfo) {
    
    this.poiInfo = poiInfo;
    return this;
  }

   /**
   * Get poiInfo
   * @return poiInfo
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30ResponseDataProjectListInnerPoiInfo getPoiInfo() {
    return poiInfo;
  }


  public void setPoiInfo(LocalProjectListV30ResponseDataProjectListInnerPoiInfo poiInfo) {
    this.poiInfo = poiInfo;
  }


  public LocalProjectListV30ResponseDataProjectListInner productInfo(LocalProjectListV30ResponseDataProjectListInnerProductInfo productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30ResponseDataProjectListInnerProductInfo getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(LocalProjectListV30ResponseDataProjectListInnerProductInfo productInfo) {
    this.productInfo = productInfo;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectBid(String projectBid) {
    
    this.projectBid = projectBid;
    return this;
  }

   /**
   * 项目出价
   * @return projectBid
  **/
  @javax.annotation.Nullable
  public String getProjectBid() {
    return projectBid;
  }


  public void setProjectBid(String projectBid) {
    this.projectBid = projectBid;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectBudget(String projectBudget) {
    
    this.projectBudget = projectBudget;
    return this;
  }

   /**
   * 项目预算，单位为元
   * @return projectBudget
  **/
  @javax.annotation.Nullable
  public String getProjectBudget() {
    return projectBudget;
  }


  public void setProjectBudget(String projectBudget) {
    this.projectBudget = projectBudget;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectBudgetMode(LocalProjectListV30DataProjectListProjectBudgetMode projectBudgetMode) {
    
    this.projectBudgetMode = projectBudgetMode;
    return this;
  }

   /**
   * Get projectBudgetMode
   * @return projectBudgetMode
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListProjectBudgetMode getProjectBudgetMode() {
    return projectBudgetMode;
  }


  public void setProjectBudgetMode(LocalProjectListV30DataProjectListProjectBudgetMode projectBudgetMode) {
    this.projectBudgetMode = projectBudgetMode;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectCreateTime(String projectCreateTime) {
    
    this.projectCreateTime = projectCreateTime;
    return this;
  }

   /**
   * 项目创建时间，格式yyyy-MM-dd HH:mm:ss
   * @return projectCreateTime
  **/
  @javax.annotation.Nullable
  public String getProjectCreateTime() {
    return projectCreateTime;
  }


  public void setProjectCreateTime(String projectCreateTime) {
    this.projectCreateTime = projectCreateTime;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectModifyTime(String projectModifyTime) {
    
    this.projectModifyTime = projectModifyTime;
    return this;
  }

   /**
   * 项目更新时间，格式yyyy-MM-dd HH:mm:ss
   * @return projectModifyTime
  **/
  @javax.annotation.Nullable
  public String getProjectModifyTime() {
    return projectModifyTime;
  }


  public void setProjectModifyTime(String projectModifyTime) {
    this.projectModifyTime = projectModifyTime;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectStatusFirst(LocalProjectListV30DataProjectListProjectStatusFirst projectStatusFirst) {
    
    this.projectStatusFirst = projectStatusFirst;
    return this;
  }

   /**
   * Get projectStatusFirst
   * @return projectStatusFirst
  **/
  @javax.annotation.Nullable
  public LocalProjectListV30DataProjectListProjectStatusFirst getProjectStatusFirst() {
    return projectStatusFirst;
  }


  public void setProjectStatusFirst(LocalProjectListV30DataProjectListProjectStatusFirst projectStatusFirst) {
    this.projectStatusFirst = projectStatusFirst;
  }


  public LocalProjectListV30ResponseDataProjectListInner projectStatusSecond(List<LocalProjectListV30DataProjectListProjectStatusSecond> projectStatusSecond) {
    
    this.projectStatusSecond = projectStatusSecond;
    return this;
  }

  public LocalProjectListV30ResponseDataProjectListInner addProjectStatusSecondItem(LocalProjectListV30DataProjectListProjectStatusSecond projectStatusSecondItem) {
    if (this.projectStatusSecond == null) {
      this.projectStatusSecond = new ArrayList<>();
    }
    this.projectStatusSecond.add(projectStatusSecondItem);
    return this;
  }

   /**
   * 项目二级状态
   * @return projectStatusSecond
  **/
  @javax.annotation.Nullable
  public List<LocalProjectListV30DataProjectListProjectStatusSecond> getProjectStatusSecond() {
    return projectStatusSecond;
  }


  public void setProjectStatusSecond(List<LocalProjectListV30DataProjectListProjectStatusSecond> projectStatusSecond) {
    this.projectStatusSecond = projectStatusSecond;
  }


  public LocalProjectListV30ResponseDataProjectListInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投放开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectListV30ResponseDataProjectListInner localProjectListV30ResponseDataProjectListInner = (LocalProjectListV30ResponseDataProjectListInner) o;
    return Objects.equals(this.adType, localProjectListV30ResponseDataProjectListInner.adType) &&
        Objects.equals(this.bidType, localProjectListV30ResponseDataProjectListInner.bidType) &&
        Objects.equals(this.deliveryGoal, localProjectListV30ResponseDataProjectListInner.deliveryGoal) &&
        Objects.equals(this.endTime, localProjectListV30ResponseDataProjectListInner.endTime) &&
        Objects.equals(this.externalAction, localProjectListV30ResponseDataProjectListInner.externalAction) &&
        Objects.equals(this.localAccountId, localProjectListV30ResponseDataProjectListInner.localAccountId) &&
        Objects.equals(this.localDeliveryScene, localProjectListV30ResponseDataProjectListInner.localDeliveryScene) &&
        Objects.equals(this.marketingGoal, localProjectListV30ResponseDataProjectListInner.marketingGoal) &&
        Objects.equals(this.name, localProjectListV30ResponseDataProjectListInner.name) &&
        Objects.equals(this.poiInfo, localProjectListV30ResponseDataProjectListInner.poiInfo) &&
        Objects.equals(this.productInfo, localProjectListV30ResponseDataProjectListInner.productInfo) &&
        Objects.equals(this.projectBid, localProjectListV30ResponseDataProjectListInner.projectBid) &&
        Objects.equals(this.projectBudget, localProjectListV30ResponseDataProjectListInner.projectBudget) &&
        Objects.equals(this.projectBudgetMode, localProjectListV30ResponseDataProjectListInner.projectBudgetMode) &&
        Objects.equals(this.projectCreateTime, localProjectListV30ResponseDataProjectListInner.projectCreateTime) &&
        Objects.equals(this.projectId, localProjectListV30ResponseDataProjectListInner.projectId) &&
        Objects.equals(this.projectModifyTime, localProjectListV30ResponseDataProjectListInner.projectModifyTime) &&
        Objects.equals(this.projectStatusFirst, localProjectListV30ResponseDataProjectListInner.projectStatusFirst) &&
        Objects.equals(this.projectStatusSecond, localProjectListV30ResponseDataProjectListInner.projectStatusSecond) &&
        Objects.equals(this.startTime, localProjectListV30ResponseDataProjectListInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, bidType, deliveryGoal, endTime, externalAction, localAccountId, localDeliveryScene, marketingGoal, name, poiInfo, productInfo, projectBid, projectBudget, projectBudgetMode, projectCreateTime, projectId, projectModifyTime, projectStatusFirst, projectStatusSecond, startTime);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectListV30ResponseDataProjectListInner {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    deliveryGoal: ").append(toIndentedString(deliveryGoal)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    localDeliveryScene: ").append(toIndentedString(localDeliveryScene)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poiInfo: ").append(toIndentedString(poiInfo)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    projectBid: ").append(toIndentedString(projectBid)).append("\n");
    sb.append("    projectBudget: ").append(toIndentedString(projectBudget)).append("\n");
    sb.append("    projectBudgetMode: ").append(toIndentedString(projectBudgetMode)).append("\n");
    sb.append("    projectCreateTime: ").append(toIndentedString(projectCreateTime)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectModifyTime: ").append(toIndentedString(projectModifyTime)).append("\n");
    sb.append("    projectStatusFirst: ").append(toIndentedString(projectStatusFirst)).append("\n");
    sb.append("    projectStatusSecond: ").append(toIndentedString(projectStatusSecond)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("delivery_goal");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("local_account_id");
    openapiFields.add("local_delivery_scene");
    openapiFields.add("marketing_goal");
    openapiFields.add("name");
    openapiFields.add("poi_info");
    openapiFields.add("product_info");
    openapiFields.add("project_bid");
    openapiFields.add("project_budget");
    openapiFields.add("project_budget_mode");
    openapiFields.add("project_create_time");
    openapiFields.add("project_id");
    openapiFields.add("project_modify_time");
    openapiFields.add("project_status_first");
    openapiFields.add("project_status_second");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectListV30ResponseDataProjectListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectListV30ResponseDataProjectListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectListV30ResponseDataProjectListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectListV30ResponseDataProjectListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectListV30ResponseDataProjectListInner>() {
           @Override
           public void write(JsonWriter out, LocalProjectListV30ResponseDataProjectListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectListV30ResponseDataProjectListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectListV30ResponseDataProjectListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectListV30ResponseDataProjectListInner
  * @throws IOException if the JSON string is invalid with respect to LocalProjectListV30ResponseDataProjectListInner
  */
  public static LocalProjectListV30ResponseDataProjectListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectListV30ResponseDataProjectListInner.class);
  }

 /**
  * Convert an instance of LocalProjectListV30ResponseDataProjectListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

