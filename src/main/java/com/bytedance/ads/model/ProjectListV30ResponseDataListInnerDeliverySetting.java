/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingBidSpeed;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingBudgetMode;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingBudgetOptimizeSwitch;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingDeepBidType;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingProjectCustom;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingScheduleType;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingSearchContinueDelivery;
import com.bytedance.ads.model.ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class ProjectListV30ResponseDataListInnerDeliverySetting {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_SPEED = "bid_speed";
  @SerializedName(SERIALIZED_NAME_BID_SPEED)
  private ProjectListV30DataListDeliverySettingBidSpeed bidSpeed = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private String bidType = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private ProjectListV30DataListDeliverySettingBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_BUDGET_OPTIMIZE_SWITCH = "budget_optimize_switch";
  @SerializedName(SERIALIZED_NAME_BUDGET_OPTIMIZE_SWITCH)
  private ProjectListV30DataListDeliverySettingBudgetOptimizeSwitch budgetOptimizeSwitch = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private ProjectListV30DataListDeliverySettingDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_CPABID = "deep_cpabid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPABID)
  private Double deepCpabid = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_FILTER_NIGHT_SWITCH = "filter_night_switch";
  @SerializedName(SERIALIZED_NAME_FILTER_NIGHT_SWITCH)
  private String filterNightSwitch = null;

  public static final String SERIALIZED_NAME_FIRST_ROI_GOAL = "first_roi_goal";
  @SerializedName(SERIALIZED_NAME_FIRST_ROI_GOAL)
  private Double firstRoiGoal = null;

  public static final String SERIALIZED_NAME_PROJECT_CUSTOM = "project_custom";
  @SerializedName(SERIALIZED_NAME_PROJECT_CUSTOM)
  private ProjectListV30DataListDeliverySettingProjectCustom projectCustom = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private ProjectListV30DataListDeliverySettingScheduleType scheduleType = null;

  public static final String SERIALIZED_NAME_SEARCH_CONTINUE_DELIVERY = "search_continue_delivery";
  @SerializedName(SERIALIZED_NAME_SEARCH_CONTINUE_DELIVERY)
  private ProjectListV30DataListDeliverySettingSearchContinueDelivery searchContinueDelivery = null;

  public static final String SERIALIZED_NAME_SHOP_MULTI_ROI_GOALS = "shop_multi_roi_goals";
  @SerializedName(SERIALIZED_NAME_SHOP_MULTI_ROI_GOALS)
  private List<ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner> shopMultiRoiGoals = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public ProjectListV30ResponseDataListInnerDeliverySetting() {
  }

  public ProjectListV30ResponseDataListInnerDeliverySetting bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting bidSpeed(ProjectListV30DataListDeliverySettingBidSpeed bidSpeed) {
    
    this.bidSpeed = bidSpeed;
    return this;
  }

   /**
   * Get bidSpeed
   * @return bidSpeed
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingBidSpeed getBidSpeed() {
    return bidSpeed;
  }


  public void setBidSpeed(ProjectListV30DataListDeliverySettingBidSpeed bidSpeed) {
    this.bidSpeed = bidSpeed;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting bidType(String bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * 
   * @return bidType
  **/
  @javax.annotation.Nullable
  public String getBidType() {
    return bidType;
  }


  public void setBidType(String bidType) {
    this.bidType = bidType;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting budgetMode(ProjectListV30DataListDeliverySettingBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(ProjectListV30DataListDeliverySettingBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting budgetOptimizeSwitch(ProjectListV30DataListDeliverySettingBudgetOptimizeSwitch budgetOptimizeSwitch) {
    
    this.budgetOptimizeSwitch = budgetOptimizeSwitch;
    return this;
  }

   /**
   * Get budgetOptimizeSwitch
   * @return budgetOptimizeSwitch
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingBudgetOptimizeSwitch getBudgetOptimizeSwitch() {
    return budgetOptimizeSwitch;
  }


  public void setBudgetOptimizeSwitch(ProjectListV30DataListDeliverySettingBudgetOptimizeSwitch budgetOptimizeSwitch) {
    this.budgetOptimizeSwitch = budgetOptimizeSwitch;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting deepBidType(ProjectListV30DataListDeliverySettingDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(ProjectListV30DataListDeliverySettingDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting deepCpabid(Double deepCpabid) {
    
    this.deepCpabid = deepCpabid;
    return this;
  }

   /**
   * 
   * @return deepCpabid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpabid() {
    return deepCpabid;
  }


  public void setDeepCpabid(Double deepCpabid) {
    this.deepCpabid = deepCpabid;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting filterNightSwitch(String filterNightSwitch) {
    
    this.filterNightSwitch = filterNightSwitch;
    return this;
  }

   /**
   * 
   * @return filterNightSwitch
  **/
  @javax.annotation.Nullable
  public String getFilterNightSwitch() {
    return filterNightSwitch;
  }


  public void setFilterNightSwitch(String filterNightSwitch) {
    this.filterNightSwitch = filterNightSwitch;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting firstRoiGoal(Double firstRoiGoal) {
    
    this.firstRoiGoal = firstRoiGoal;
    return this;
  }

   /**
   * 
   * @return firstRoiGoal
  **/
  @javax.annotation.Nullable
  public Double getFirstRoiGoal() {
    return firstRoiGoal;
  }


  public void setFirstRoiGoal(Double firstRoiGoal) {
    this.firstRoiGoal = firstRoiGoal;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting projectCustom(ProjectListV30DataListDeliverySettingProjectCustom projectCustom) {
    
    this.projectCustom = projectCustom;
    return this;
  }

   /**
   * Get projectCustom
   * @return projectCustom
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingProjectCustom getProjectCustom() {
    return projectCustom;
  }


  public void setProjectCustom(ProjectListV30DataListDeliverySettingProjectCustom projectCustom) {
    this.projectCustom = projectCustom;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting scheduleType(ProjectListV30DataListDeliverySettingScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(ProjectListV30DataListDeliverySettingScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting searchContinueDelivery(ProjectListV30DataListDeliverySettingSearchContinueDelivery searchContinueDelivery) {
    
    this.searchContinueDelivery = searchContinueDelivery;
    return this;
  }

   /**
   * Get searchContinueDelivery
   * @return searchContinueDelivery
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingSearchContinueDelivery getSearchContinueDelivery() {
    return searchContinueDelivery;
  }


  public void setSearchContinueDelivery(ProjectListV30DataListDeliverySettingSearchContinueDelivery searchContinueDelivery) {
    this.searchContinueDelivery = searchContinueDelivery;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting shopMultiRoiGoals(List<ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner> shopMultiRoiGoals) {
    
    this.shopMultiRoiGoals = shopMultiRoiGoals;
    return this;
  }

  public ProjectListV30ResponseDataListInnerDeliverySetting addShopMultiRoiGoalsItem(ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner shopMultiRoiGoalsItem) {
    if (this.shopMultiRoiGoals == null) {
      this.shopMultiRoiGoals = new ArrayList<>();
    }
    this.shopMultiRoiGoals.add(shopMultiRoiGoalsItem);
    return this;
  }

   /**
   * 
   * @return shopMultiRoiGoals
  **/
  @javax.annotation.Nullable
  public List<ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner> getShopMultiRoiGoals() {
    return shopMultiRoiGoals;
  }


  public void setShopMultiRoiGoals(List<ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner> shopMultiRoiGoals) {
    this.shopMultiRoiGoals = shopMultiRoiGoals;
  }


  public ProjectListV30ResponseDataListInnerDeliverySetting startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
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
    ProjectListV30ResponseDataListInnerDeliverySetting projectListV30ResponseDataListInnerDeliverySetting = (ProjectListV30ResponseDataListInnerDeliverySetting) o;
    return Objects.equals(this.bid, projectListV30ResponseDataListInnerDeliverySetting.bid) &&
        Objects.equals(this.bidSpeed, projectListV30ResponseDataListInnerDeliverySetting.bidSpeed) &&
        Objects.equals(this.bidType, projectListV30ResponseDataListInnerDeliverySetting.bidType) &&
        Objects.equals(this.budget, projectListV30ResponseDataListInnerDeliverySetting.budget) &&
        Objects.equals(this.budgetMode, projectListV30ResponseDataListInnerDeliverySetting.budgetMode) &&
        Objects.equals(this.budgetOptimizeSwitch, projectListV30ResponseDataListInnerDeliverySetting.budgetOptimizeSwitch) &&
        Objects.equals(this.cpaBid, projectListV30ResponseDataListInnerDeliverySetting.cpaBid) &&
        Objects.equals(this.deepBidType, projectListV30ResponseDataListInnerDeliverySetting.deepBidType) &&
        Objects.equals(this.deepCpabid, projectListV30ResponseDataListInnerDeliverySetting.deepCpabid) &&
        Objects.equals(this.endTime, projectListV30ResponseDataListInnerDeliverySetting.endTime) &&
        Objects.equals(this.filterNightSwitch, projectListV30ResponseDataListInnerDeliverySetting.filterNightSwitch) &&
        Objects.equals(this.firstRoiGoal, projectListV30ResponseDataListInnerDeliverySetting.firstRoiGoal) &&
        Objects.equals(this.projectCustom, projectListV30ResponseDataListInnerDeliverySetting.projectCustom) &&
        Objects.equals(this.roiGoal, projectListV30ResponseDataListInnerDeliverySetting.roiGoal) &&
        Objects.equals(this.scheduleTime, projectListV30ResponseDataListInnerDeliverySetting.scheduleTime) &&
        Objects.equals(this.scheduleType, projectListV30ResponseDataListInnerDeliverySetting.scheduleType) &&
        Objects.equals(this.searchContinueDelivery, projectListV30ResponseDataListInnerDeliverySetting.searchContinueDelivery) &&
        Objects.equals(this.shopMultiRoiGoals, projectListV30ResponseDataListInnerDeliverySetting.shopMultiRoiGoals) &&
        Objects.equals(this.startTime, projectListV30ResponseDataListInnerDeliverySetting.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, bidSpeed, bidType, budget, budgetMode, budgetOptimizeSwitch, cpaBid, deepBidType, deepCpabid, endTime, filterNightSwitch, firstRoiGoal, projectCustom, roiGoal, scheduleTime, scheduleType, searchContinueDelivery, shopMultiRoiGoals, startTime);
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
    sb.append("class ProjectListV30ResponseDataListInnerDeliverySetting {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidSpeed: ").append(toIndentedString(bidSpeed)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    budgetOptimizeSwitch: ").append(toIndentedString(budgetOptimizeSwitch)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpabid: ").append(toIndentedString(deepCpabid)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    filterNightSwitch: ").append(toIndentedString(filterNightSwitch)).append("\n");
    sb.append("    firstRoiGoal: ").append(toIndentedString(firstRoiGoal)).append("\n");
    sb.append("    projectCustom: ").append(toIndentedString(projectCustom)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    searchContinueDelivery: ").append(toIndentedString(searchContinueDelivery)).append("\n");
    sb.append("    shopMultiRoiGoals: ").append(toIndentedString(shopMultiRoiGoals)).append("\n");
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
    openapiFields.add("bid");
    openapiFields.add("bid_speed");
    openapiFields.add("bid_type");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("budget_optimize_switch");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_cpabid");
    openapiFields.add("end_time");
    openapiFields.add("filter_night_switch");
    openapiFields.add("first_roi_goal");
    openapiFields.add("project_custom");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_time");
    openapiFields.add("schedule_type");
    openapiFields.add("search_continue_delivery");
    openapiFields.add("shop_multi_roi_goals");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectListV30ResponseDataListInnerDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerDeliverySetting>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerDeliverySetting
  */
  public static ProjectListV30ResponseDataListInnerDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerDeliverySetting.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

