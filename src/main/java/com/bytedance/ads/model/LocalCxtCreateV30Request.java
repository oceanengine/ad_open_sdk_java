/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalCxtCreateV30ExternalAction;
import com.bytedance.ads.model.LocalCxtCreateV30PeakHolidays;
import com.bytedance.ads.model.LocalCxtCreateV30PeakWeekDays;
import com.bytedance.ads.model.LocalCxtCreateV30RequestAudience;
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
 * LocalCxtCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class LocalCxtCreateV30Request {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private LocalCxtCreateV30RequestAudience audience = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private LocalCxtCreateV30ExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_HIGH_BUDGET_RATE = "high_budget_rate";
  @SerializedName(SERIALIZED_NAME_HIGH_BUDGET_RATE)
  private Long highBudgetRate = null;

  public static final String SERIALIZED_NAME_IS_SET_PEAK_BUDGET = "is_set_peak_budget";
  @SerializedName(SERIALIZED_NAME_IS_SET_PEAK_BUDGET)
  private Boolean isSetPeakBudget = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_PEAK_HOLIDAYS = "peak_holidays";
  @SerializedName(SERIALIZED_NAME_PEAK_HOLIDAYS)
  private List<LocalCxtCreateV30PeakHolidays> peakHolidays = null;

  public static final String SERIALIZED_NAME_PEAK_WEEK_DAYS = "peak_week_days";
  @SerializedName(SERIALIZED_NAME_PEAK_WEEK_DAYS)
  private List<LocalCxtCreateV30PeakWeekDays> peakWeekDays = null;

  public static final String SERIALIZED_NAME_POI_LIST = "poi_list";
  @SerializedName(SERIALIZED_NAME_POI_LIST)
  private List<Long> poiList = null;

  public LocalCxtCreateV30Request() {
  }

  public LocalCxtCreateV30Request audience(LocalCxtCreateV30RequestAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public LocalCxtCreateV30RequestAudience getAudience() {
    return audience;
  }


  public void setAudience(LocalCxtCreateV30RequestAudience audience) {
    this.audience = audience;
  }


  public LocalCxtCreateV30Request budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算（单位：分）
   * minimum: 3000
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public LocalCxtCreateV30Request externalAction(LocalCxtCreateV30ExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nonnull
  public LocalCxtCreateV30ExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(LocalCxtCreateV30ExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public LocalCxtCreateV30Request highBudgetRate(Long highBudgetRate) {
    
    this.highBudgetRate = highBudgetRate;
    return this;
  }

   /**
   * 高峰日预算上调比例（注意：该字段为百分比，例如：传“40”表示高峰日时预算上调“40%”）
   * minimum: 20
   * maximum: 300
   * @return highBudgetRate
  **/
  @javax.annotation.Nullable
  public Long getHighBudgetRate() {
    return highBudgetRate;
  }


  public void setHighBudgetRate(Long highBudgetRate) {
    this.highBudgetRate = highBudgetRate;
  }


  public LocalCxtCreateV30Request isSetPeakBudget(Boolean isSetPeakBudget) {
    
    this.isSetPeakBudget = isSetPeakBudget;
    return this;
  }

   /**
   * 高峰日预算设置 该字段为false时：高峰日（自然周、节假日）、高峰日预算上调比例 均不可填值
   * @return isSetPeakBudget
  **/
  @javax.annotation.Nonnull
  public Boolean getIsSetPeakBudget() {
    return isSetPeakBudget;
  }


  public void setIsSetPeakBudget(Boolean isSetPeakBudget) {
    this.isSetPeakBudget = isSetPeakBudget;
  }


  public LocalCxtCreateV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalCxtCreateV30Request peakHolidays(List<LocalCxtCreateV30PeakHolidays> peakHolidays) {
    
    this.peakHolidays = peakHolidays;
    return this;
  }

  public LocalCxtCreateV30Request addPeakHolidaysItem(LocalCxtCreateV30PeakHolidays peakHolidaysItem) {
    if (this.peakHolidays == null) {
      this.peakHolidays = new ArrayList<>();
    }
    this.peakHolidays.add(peakHolidaysItem);
    return this;
  }

   /**
   * 高峰日-节假日
   * @return peakHolidays
  **/
  @javax.annotation.Nullable
  public List<LocalCxtCreateV30PeakHolidays> getPeakHolidays() {
    return peakHolidays;
  }


  public void setPeakHolidays(List<LocalCxtCreateV30PeakHolidays> peakHolidays) {
    this.peakHolidays = peakHolidays;
  }


  public LocalCxtCreateV30Request peakWeekDays(List<LocalCxtCreateV30PeakWeekDays> peakWeekDays) {
    
    this.peakWeekDays = peakWeekDays;
    return this;
  }

  public LocalCxtCreateV30Request addPeakWeekDaysItem(LocalCxtCreateV30PeakWeekDays peakWeekDaysItem) {
    if (this.peakWeekDays == null) {
      this.peakWeekDays = new ArrayList<>();
    }
    this.peakWeekDays.add(peakWeekDaysItem);
    return this;
  }

   /**
   * 高峰日-自然周 
   * @return peakWeekDays
  **/
  @javax.annotation.Nullable
  public List<LocalCxtCreateV30PeakWeekDays> getPeakWeekDays() {
    return peakWeekDays;
  }


  public void setPeakWeekDays(List<LocalCxtCreateV30PeakWeekDays> peakWeekDays) {
    this.peakWeekDays = peakWeekDays;
  }


  public LocalCxtCreateV30Request poiList(List<Long> poiList) {
    
    this.poiList = poiList;
    return this;
  }

  public LocalCxtCreateV30Request addPoiListItem(Long poiListItem) {
    if (this.poiList == null) {
      this.poiList = new ArrayList<>();
    }
    this.poiList.add(poiListItem);
    return this;
  }

   /**
   * 
   * @return poiList
  **/
  @javax.annotation.Nonnull
  public List<Long> getPoiList() {
    return poiList;
  }


  public void setPoiList(List<Long> poiList) {
    this.poiList = poiList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalCxtCreateV30Request localCxtCreateV30Request = (LocalCxtCreateV30Request) o;
    return Objects.equals(this.audience, localCxtCreateV30Request.audience) &&
        Objects.equals(this.budget, localCxtCreateV30Request.budget) &&
        Objects.equals(this.externalAction, localCxtCreateV30Request.externalAction) &&
        Objects.equals(this.highBudgetRate, localCxtCreateV30Request.highBudgetRate) &&
        Objects.equals(this.isSetPeakBudget, localCxtCreateV30Request.isSetPeakBudget) &&
        Objects.equals(this.localAccountId, localCxtCreateV30Request.localAccountId) &&
        Objects.equals(this.peakHolidays, localCxtCreateV30Request.peakHolidays) &&
        Objects.equals(this.peakWeekDays, localCxtCreateV30Request.peakWeekDays) &&
        Objects.equals(this.poiList, localCxtCreateV30Request.poiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, budget, externalAction, highBudgetRate, isSetPeakBudget, localAccountId, peakHolidays, peakWeekDays, poiList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalCxtCreateV30Request {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    highBudgetRate: ").append(toIndentedString(highBudgetRate)).append("\n");
    sb.append("    isSetPeakBudget: ").append(toIndentedString(isSetPeakBudget)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    peakHolidays: ").append(toIndentedString(peakHolidays)).append("\n");
    sb.append("    peakWeekDays: ").append(toIndentedString(peakWeekDays)).append("\n");
    sb.append("    poiList: ").append(toIndentedString(poiList)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("budget");
    openapiFields.add("external_action");
    openapiFields.add("high_budget_rate");
    openapiFields.add("is_set_peak_budget");
    openapiFields.add("local_account_id");
    openapiFields.add("peak_holidays");
    openapiFields.add("peak_week_days");
    openapiFields.add("poi_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("external_action");
    openapiRequiredFields.add("is_set_peak_budget");
    openapiRequiredFields.add("local_account_id");
    openapiRequiredFields.add("poi_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalCxtCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalCxtCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalCxtCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalCxtCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalCxtCreateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalCxtCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalCxtCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalCxtCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalCxtCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalCxtCreateV30Request
  */
  public static LocalCxtCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalCxtCreateV30Request.class);
  }

 /**
  * Convert an instance of LocalCxtCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

