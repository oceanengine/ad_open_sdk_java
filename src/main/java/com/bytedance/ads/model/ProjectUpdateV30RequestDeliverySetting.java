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
import com.bytedance.ads.model.ProjectUpdateV30DeliverySettingBudgetMode;
import com.bytedance.ads.model.ProjectUpdateV30DeliverySettingFilterNightSwitch;
import com.bytedance.ads.model.ProjectUpdateV30DeliverySettingScheduleType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;

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
public class ProjectUpdateV30RequestDeliverySetting {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Float bid = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Float budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private ProjectUpdateV30DeliverySettingBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Float cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_CPABID = "deep_cpabid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPABID)
  private Float deepCpabid = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private LocalDate endTime = null;

  public static final String SERIALIZED_NAME_FILTER_NIGHT_SWITCH = "filter_night_switch";
  @SerializedName(SERIALIZED_NAME_FILTER_NIGHT_SWITCH)
  private ProjectUpdateV30DeliverySettingFilterNightSwitch filterNightSwitch = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Float roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private ProjectUpdateV30DeliverySettingScheduleType scheduleType = null;

  public ProjectUpdateV30RequestDeliverySetting() {
  }

  public ProjectUpdateV30RequestDeliverySetting bid(Float bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Float getBid() {
    return bid;
  }


  public void setBid(Float bid) {
    this.bid = bid;
  }


  public ProjectUpdateV30RequestDeliverySetting budget(Float budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Float getBudget() {
    return budget;
  }


  public void setBudget(Float budget) {
    this.budget = budget;
  }


  public ProjectUpdateV30RequestDeliverySetting budgetMode(ProjectUpdateV30DeliverySettingBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30DeliverySettingBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(ProjectUpdateV30DeliverySettingBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public ProjectUpdateV30RequestDeliverySetting cpaBid(Float cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Float getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Float cpaBid) {
    this.cpaBid = cpaBid;
  }


  public ProjectUpdateV30RequestDeliverySetting deepCpabid(Float deepCpabid) {
    
    this.deepCpabid = deepCpabid;
    return this;
  }

   /**
   * 
   * @return deepCpabid
  **/
  @javax.annotation.Nullable
  public Float getDeepCpabid() {
    return deepCpabid;
  }


  public void setDeepCpabid(Float deepCpabid) {
    this.deepCpabid = deepCpabid;
  }


  public ProjectUpdateV30RequestDeliverySetting endTime(LocalDate endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public LocalDate getEndTime() {
    return endTime;
  }


  public void setEndTime(LocalDate endTime) {
    this.endTime = endTime;
  }


  public ProjectUpdateV30RequestDeliverySetting filterNightSwitch(ProjectUpdateV30DeliverySettingFilterNightSwitch filterNightSwitch) {
    
    this.filterNightSwitch = filterNightSwitch;
    return this;
  }

   /**
   * Get filterNightSwitch
   * @return filterNightSwitch
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30DeliverySettingFilterNightSwitch getFilterNightSwitch() {
    return filterNightSwitch;
  }


  public void setFilterNightSwitch(ProjectUpdateV30DeliverySettingFilterNightSwitch filterNightSwitch) {
    this.filterNightSwitch = filterNightSwitch;
  }


  public ProjectUpdateV30RequestDeliverySetting roiGoal(Float roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Float getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Float roiGoal) {
    this.roiGoal = roiGoal;
  }


  public ProjectUpdateV30RequestDeliverySetting scheduleTime(String scheduleTime) {
    
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


  public ProjectUpdateV30RequestDeliverySetting scheduleType(ProjectUpdateV30DeliverySettingScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public ProjectUpdateV30DeliverySettingScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(ProjectUpdateV30DeliverySettingScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateV30RequestDeliverySetting projectUpdateV30RequestDeliverySetting = (ProjectUpdateV30RequestDeliverySetting) o;
    return Objects.equals(this.bid, projectUpdateV30RequestDeliverySetting.bid) &&
        Objects.equals(this.budget, projectUpdateV30RequestDeliverySetting.budget) &&
        Objects.equals(this.budgetMode, projectUpdateV30RequestDeliverySetting.budgetMode) &&
        Objects.equals(this.cpaBid, projectUpdateV30RequestDeliverySetting.cpaBid) &&
        Objects.equals(this.deepCpabid, projectUpdateV30RequestDeliverySetting.deepCpabid) &&
        Objects.equals(this.endTime, projectUpdateV30RequestDeliverySetting.endTime) &&
        Objects.equals(this.filterNightSwitch, projectUpdateV30RequestDeliverySetting.filterNightSwitch) &&
        Objects.equals(this.roiGoal, projectUpdateV30RequestDeliverySetting.roiGoal) &&
        Objects.equals(this.scheduleTime, projectUpdateV30RequestDeliverySetting.scheduleTime) &&
        Objects.equals(this.scheduleType, projectUpdateV30RequestDeliverySetting.scheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, budget, budgetMode, cpaBid, deepCpabid, endTime, filterNightSwitch, roiGoal, scheduleTime, scheduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateV30RequestDeliverySetting {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepCpabid: ").append(toIndentedString(deepCpabid)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    filterNightSwitch: ").append(toIndentedString(filterNightSwitch)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_cpabid");
    openapiFields.add("end_time");
    openapiFields.add("filter_night_switch");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_time");
    openapiFields.add("schedule_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUpdateV30RequestDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUpdateV30RequestDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUpdateV30RequestDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUpdateV30RequestDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUpdateV30RequestDeliverySetting>() {
           @Override
           public void write(JsonWriter out, ProjectUpdateV30RequestDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUpdateV30RequestDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectUpdateV30RequestDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectUpdateV30RequestDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to ProjectUpdateV30RequestDeliverySetting
  */
  public static ProjectUpdateV30RequestDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUpdateV30RequestDeliverySetting.class);
  }

 /**
  * Convert an instance of ProjectUpdateV30RequestDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

