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
import com.bytedance.ads.model.LocalPromotionListV30FilteringAdType;
import com.bytedance.ads.model.LocalPromotionListV30FilteringBidType;
import com.bytedance.ads.model.LocalPromotionListV30FilteringBudgetMode;
import com.bytedance.ads.model.LocalPromotionListV30FilteringLearningPhase;
import com.bytedance.ads.model.LocalPromotionListV30FilteringMarketingGoal;
import com.bytedance.ads.model.LocalPromotionListV30FilteringPromotionStatusFirst;
import com.bytedance.ads.model.LocalPromotionListV30FilteringPromotionStatusSecond;
import com.bytedance.ads.model.LocalPromotionListV30FilteringRejectReasonType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class LocalPromotionListV30Filtering {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private LocalPromotionListV30FilteringAdType adType = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private LocalPromotionListV30FilteringBidType bidType = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private LocalPromotionListV30FilteringBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_LEARNING_PHASE = "learning_phase";
  @SerializedName(SERIALIZED_NAME_LEARNING_PHASE)
  private LocalPromotionListV30FilteringLearningPhase learningPhase = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private LocalPromotionListV30FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CREATE_TIME_END = "promotion_create_time_end";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CREATE_TIME_END)
  private String promotionCreateTimeEnd = null;

  public static final String SERIALIZED_NAME_PROMOTION_CREATE_TIME_START = "promotion_create_time_start";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CREATE_TIME_START)
  private String promotionCreateTimeStart = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public static final String SERIALIZED_NAME_PROMOTION_MODIFY_TIME_END = "promotion_modify_time_end";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MODIFY_TIME_END)
  private String promotionModifyTimeEnd = null;

  public static final String SERIALIZED_NAME_PROMOTION_MODIFY_TIME_START = "promotion_modify_time_start";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MODIFY_TIME_START)
  private String promotionModifyTimeStart = null;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName = null;

  public static final String SERIALIZED_NAME_PROMOTION_STATUS_FIRST = "promotion_status_first";
  @SerializedName(SERIALIZED_NAME_PROMOTION_STATUS_FIRST)
  private LocalPromotionListV30FilteringPromotionStatusFirst promotionStatusFirst = null;

  public static final String SERIALIZED_NAME_PROMOTION_STATUS_SECOND = "promotion_status_second";
  @SerializedName(SERIALIZED_NAME_PROMOTION_STATUS_SECOND)
  private LocalPromotionListV30FilteringPromotionStatusSecond promotionStatusSecond = null;

  public static final String SERIALIZED_NAME_REJECT_REASON_TYPE = "reject_reason_type";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON_TYPE)
  private LocalPromotionListV30FilteringRejectReasonType rejectReasonType = null;

  public LocalPromotionListV30Filtering() {
  }

  public LocalPromotionListV30Filtering adType(LocalPromotionListV30FilteringAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringAdType getAdType() {
    return adType;
  }


  public void setAdType(LocalPromotionListV30FilteringAdType adType) {
    this.adType = adType;
  }


  public LocalPromotionListV30Filtering bidType(LocalPromotionListV30FilteringBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringBidType getBidType() {
    return bidType;
  }


  public void setBidType(LocalPromotionListV30FilteringBidType bidType) {
    this.bidType = bidType;
  }


  public LocalPromotionListV30Filtering budgetMode(LocalPromotionListV30FilteringBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(LocalPromotionListV30FilteringBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public LocalPromotionListV30Filtering learningPhase(LocalPromotionListV30FilteringLearningPhase learningPhase) {
    
    this.learningPhase = learningPhase;
    return this;
  }

   /**
   * Get learningPhase
   * @return learningPhase
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringLearningPhase getLearningPhase() {
    return learningPhase;
  }


  public void setLearningPhase(LocalPromotionListV30FilteringLearningPhase learningPhase) {
    this.learningPhase = learningPhase;
  }


  public LocalPromotionListV30Filtering marketingGoal(LocalPromotionListV30FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(LocalPromotionListV30FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public LocalPromotionListV30Filtering projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID筛选
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public LocalPromotionListV30Filtering promotionCreateTimeEnd(String promotionCreateTimeEnd) {
    
    this.promotionCreateTimeEnd = promotionCreateTimeEnd;
    return this;
  }

   /**
   * 广告创建结束时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;,与time_start搭配使用
   * @return promotionCreateTimeEnd
  **/
  @javax.annotation.Nullable
  public String getPromotionCreateTimeEnd() {
    return promotionCreateTimeEnd;
  }


  public void setPromotionCreateTimeEnd(String promotionCreateTimeEnd) {
    this.promotionCreateTimeEnd = promotionCreateTimeEnd;
  }


  public LocalPromotionListV30Filtering promotionCreateTimeStart(String promotionCreateTimeStart) {
    
    this.promotionCreateTimeStart = promotionCreateTimeStart;
    return this;
  }

   /**
   * 广告创建开始时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;,与time_end搭配使用
   * @return promotionCreateTimeStart
  **/
  @javax.annotation.Nullable
  public String getPromotionCreateTimeStart() {
    return promotionCreateTimeStart;
  }


  public void setPromotionCreateTimeStart(String promotionCreateTimeStart) {
    this.promotionCreateTimeStart = promotionCreateTimeStart;
  }


  public LocalPromotionListV30Filtering promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public LocalPromotionListV30Filtering addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 广告IDs筛选，最多100个
   * @return promotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<Long> promotionIds) {
    this.promotionIds = promotionIds;
  }


  public LocalPromotionListV30Filtering promotionModifyTimeEnd(String promotionModifyTimeEnd) {
    
    this.promotionModifyTimeEnd = promotionModifyTimeEnd;
    return this;
  }

   /**
   * 广告更新结束时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;,与time_start搭配使用
   * @return promotionModifyTimeEnd
  **/
  @javax.annotation.Nullable
  public String getPromotionModifyTimeEnd() {
    return promotionModifyTimeEnd;
  }


  public void setPromotionModifyTimeEnd(String promotionModifyTimeEnd) {
    this.promotionModifyTimeEnd = promotionModifyTimeEnd;
  }


  public LocalPromotionListV30Filtering promotionModifyTimeStart(String promotionModifyTimeStart) {
    
    this.promotionModifyTimeStart = promotionModifyTimeStart;
    return this;
  }

   /**
   * 广告更新开始时间，格式\&quot;yyyy-MM-dd HH:mm:ss\&quot;,与time_end搭配使用
   * @return promotionModifyTimeStart
  **/
  @javax.annotation.Nullable
  public String getPromotionModifyTimeStart() {
    return promotionModifyTimeStart;
  }


  public void setPromotionModifyTimeStart(String promotionModifyTimeStart) {
    this.promotionModifyTimeStart = promotionModifyTimeStart;
  }


  public LocalPromotionListV30Filtering promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 广告名称模糊搜索
   * @return promotionName
  **/
  @javax.annotation.Nullable
  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public LocalPromotionListV30Filtering promotionStatusFirst(LocalPromotionListV30FilteringPromotionStatusFirst promotionStatusFirst) {
    
    this.promotionStatusFirst = promotionStatusFirst;
    return this;
  }

   /**
   * Get promotionStatusFirst
   * @return promotionStatusFirst
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringPromotionStatusFirst getPromotionStatusFirst() {
    return promotionStatusFirst;
  }


  public void setPromotionStatusFirst(LocalPromotionListV30FilteringPromotionStatusFirst promotionStatusFirst) {
    this.promotionStatusFirst = promotionStatusFirst;
  }


  public LocalPromotionListV30Filtering promotionStatusSecond(LocalPromotionListV30FilteringPromotionStatusSecond promotionStatusSecond) {
    
    this.promotionStatusSecond = promotionStatusSecond;
    return this;
  }

   /**
   * Get promotionStatusSecond
   * @return promotionStatusSecond
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringPromotionStatusSecond getPromotionStatusSecond() {
    return promotionStatusSecond;
  }


  public void setPromotionStatusSecond(LocalPromotionListV30FilteringPromotionStatusSecond promotionStatusSecond) {
    this.promotionStatusSecond = promotionStatusSecond;
  }


  public LocalPromotionListV30Filtering rejectReasonType(LocalPromotionListV30FilteringRejectReasonType rejectReasonType) {
    
    this.rejectReasonType = rejectReasonType;
    return this;
  }

   /**
   * Get rejectReasonType
   * @return rejectReasonType
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30FilteringRejectReasonType getRejectReasonType() {
    return rejectReasonType;
  }


  public void setRejectReasonType(LocalPromotionListV30FilteringRejectReasonType rejectReasonType) {
    this.rejectReasonType = rejectReasonType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPromotionListV30Filtering localPromotionListV30Filtering = (LocalPromotionListV30Filtering) o;
    return Objects.equals(this.adType, localPromotionListV30Filtering.adType) &&
        Objects.equals(this.bidType, localPromotionListV30Filtering.bidType) &&
        Objects.equals(this.budgetMode, localPromotionListV30Filtering.budgetMode) &&
        Objects.equals(this.learningPhase, localPromotionListV30Filtering.learningPhase) &&
        Objects.equals(this.marketingGoal, localPromotionListV30Filtering.marketingGoal) &&
        Objects.equals(this.projectId, localPromotionListV30Filtering.projectId) &&
        Objects.equals(this.promotionCreateTimeEnd, localPromotionListV30Filtering.promotionCreateTimeEnd) &&
        Objects.equals(this.promotionCreateTimeStart, localPromotionListV30Filtering.promotionCreateTimeStart) &&
        Objects.equals(this.promotionIds, localPromotionListV30Filtering.promotionIds) &&
        Objects.equals(this.promotionModifyTimeEnd, localPromotionListV30Filtering.promotionModifyTimeEnd) &&
        Objects.equals(this.promotionModifyTimeStart, localPromotionListV30Filtering.promotionModifyTimeStart) &&
        Objects.equals(this.promotionName, localPromotionListV30Filtering.promotionName) &&
        Objects.equals(this.promotionStatusFirst, localPromotionListV30Filtering.promotionStatusFirst) &&
        Objects.equals(this.promotionStatusSecond, localPromotionListV30Filtering.promotionStatusSecond) &&
        Objects.equals(this.rejectReasonType, localPromotionListV30Filtering.rejectReasonType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, bidType, budgetMode, learningPhase, marketingGoal, projectId, promotionCreateTimeEnd, promotionCreateTimeStart, promotionIds, promotionModifyTimeEnd, promotionModifyTimeStart, promotionName, promotionStatusFirst, promotionStatusSecond, rejectReasonType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalPromotionListV30Filtering {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    learningPhase: ").append(toIndentedString(learningPhase)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    promotionCreateTimeEnd: ").append(toIndentedString(promotionCreateTimeEnd)).append("\n");
    sb.append("    promotionCreateTimeStart: ").append(toIndentedString(promotionCreateTimeStart)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    promotionModifyTimeEnd: ").append(toIndentedString(promotionModifyTimeEnd)).append("\n");
    sb.append("    promotionModifyTimeStart: ").append(toIndentedString(promotionModifyTimeStart)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    promotionStatusFirst: ").append(toIndentedString(promotionStatusFirst)).append("\n");
    sb.append("    promotionStatusSecond: ").append(toIndentedString(promotionStatusSecond)).append("\n");
    sb.append("    rejectReasonType: ").append(toIndentedString(rejectReasonType)).append("\n");
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
    openapiFields.add("budget_mode");
    openapiFields.add("learning_phase");
    openapiFields.add("marketing_goal");
    openapiFields.add("project_id");
    openapiFields.add("promotion_create_time_end");
    openapiFields.add("promotion_create_time_start");
    openapiFields.add("promotion_ids");
    openapiFields.add("promotion_modify_time_end");
    openapiFields.add("promotion_modify_time_start");
    openapiFields.add("promotion_name");
    openapiFields.add("promotion_status_first");
    openapiFields.add("promotion_status_second");
    openapiFields.add("reject_reason_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionListV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalPromotionListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionListV30Filtering
  */
  public static LocalPromotionListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionListV30Filtering.class);
  }

 /**
  * Convert an instance of LocalPromotionListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

