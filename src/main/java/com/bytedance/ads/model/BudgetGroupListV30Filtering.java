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
import com.bytedance.ads.model.BudgetGroupListV30FilteringAdType;
import com.bytedance.ads.model.BudgetGroupListV30FilteringBudgetGroupStatusFirst;
import com.bytedance.ads.model.BudgetGroupListV30FilteringBudgetGroupStatusSecond;
import com.bytedance.ads.model.BudgetGroupListV30FilteringDeliveryType;
import com.bytedance.ads.model.BudgetGroupListV30FilteringStatisticsTime;
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
public class BudgetGroupListV30Filtering {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private BudgetGroupListV30FilteringAdType adType = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_ID_LIST = "budget_group_id_list";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_ID_LIST)
  private List<Long> budgetGroupIdList = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_KEYWORD = "budget_group_keyword";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_KEYWORD)
  private String budgetGroupKeyword = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_STATUS_FIRST = "budget_group_status_first";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_STATUS_FIRST)
  private BudgetGroupListV30FilteringBudgetGroupStatusFirst budgetGroupStatusFirst = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_STATUS_SECOND = "budget_group_status_second";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_STATUS_SECOND)
  private BudgetGroupListV30FilteringBudgetGroupStatusSecond budgetGroupStatusSecond = null;

  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "delivery_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private BudgetGroupListV30FilteringDeliveryType deliveryType = null;

  public static final String SERIALIZED_NAME_STATISTICS_TIME = "statistics_time";
  @SerializedName(SERIALIZED_NAME_STATISTICS_TIME)
  private BudgetGroupListV30FilteringStatisticsTime statisticsTime = null;

  public BudgetGroupListV30Filtering() {
  }

  public BudgetGroupListV30Filtering adType(BudgetGroupListV30FilteringAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public BudgetGroupListV30FilteringAdType getAdType() {
    return adType;
  }


  public void setAdType(BudgetGroupListV30FilteringAdType adType) {
    this.adType = adType;
  }


  public BudgetGroupListV30Filtering budgetGroupIdList(List<Long> budgetGroupIdList) {
    
    this.budgetGroupIdList = budgetGroupIdList;
    return this;
  }

  public BudgetGroupListV30Filtering addBudgetGroupIdListItem(Long budgetGroupIdListItem) {
    if (this.budgetGroupIdList == null) {
      this.budgetGroupIdList = new ArrayList<>();
    }
    this.budgetGroupIdList.add(budgetGroupIdListItem);
    return this;
  }

   /**
   * 预算组id列表
   * @return budgetGroupIdList
  **/
  @javax.annotation.Nullable
  public List<Long> getBudgetGroupIdList() {
    return budgetGroupIdList;
  }


  public void setBudgetGroupIdList(List<Long> budgetGroupIdList) {
    this.budgetGroupIdList = budgetGroupIdList;
  }


  public BudgetGroupListV30Filtering budgetGroupKeyword(String budgetGroupKeyword) {
    
    this.budgetGroupKeyword = budgetGroupKeyword;
    return this;
  }

   /**
   * 预算组名称模糊搜索关键字
   * @return budgetGroupKeyword
  **/
  @javax.annotation.Nullable
  public String getBudgetGroupKeyword() {
    return budgetGroupKeyword;
  }


  public void setBudgetGroupKeyword(String budgetGroupKeyword) {
    this.budgetGroupKeyword = budgetGroupKeyword;
  }


  public BudgetGroupListV30Filtering budgetGroupStatusFirst(BudgetGroupListV30FilteringBudgetGroupStatusFirst budgetGroupStatusFirst) {
    
    this.budgetGroupStatusFirst = budgetGroupStatusFirst;
    return this;
  }

   /**
   * Get budgetGroupStatusFirst
   * @return budgetGroupStatusFirst
  **/
  @javax.annotation.Nullable
  public BudgetGroupListV30FilteringBudgetGroupStatusFirst getBudgetGroupStatusFirst() {
    return budgetGroupStatusFirst;
  }


  public void setBudgetGroupStatusFirst(BudgetGroupListV30FilteringBudgetGroupStatusFirst budgetGroupStatusFirst) {
    this.budgetGroupStatusFirst = budgetGroupStatusFirst;
  }


  public BudgetGroupListV30Filtering budgetGroupStatusSecond(BudgetGroupListV30FilteringBudgetGroupStatusSecond budgetGroupStatusSecond) {
    
    this.budgetGroupStatusSecond = budgetGroupStatusSecond;
    return this;
  }

   /**
   * Get budgetGroupStatusSecond
   * @return budgetGroupStatusSecond
  **/
  @javax.annotation.Nullable
  public BudgetGroupListV30FilteringBudgetGroupStatusSecond getBudgetGroupStatusSecond() {
    return budgetGroupStatusSecond;
  }


  public void setBudgetGroupStatusSecond(BudgetGroupListV30FilteringBudgetGroupStatusSecond budgetGroupStatusSecond) {
    this.budgetGroupStatusSecond = budgetGroupStatusSecond;
  }


  public BudgetGroupListV30Filtering deliveryType(BudgetGroupListV30FilteringDeliveryType deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  public BudgetGroupListV30FilteringDeliveryType getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(BudgetGroupListV30FilteringDeliveryType deliveryType) {
    this.deliveryType = deliveryType;
  }


  public BudgetGroupListV30Filtering statisticsTime(BudgetGroupListV30FilteringStatisticsTime statisticsTime) {
    
    this.statisticsTime = statisticsTime;
    return this;
  }

   /**
   * Get statisticsTime
   * @return statisticsTime
  **/
  @javax.annotation.Nullable
  public BudgetGroupListV30FilteringStatisticsTime getStatisticsTime() {
    return statisticsTime;
  }


  public void setStatisticsTime(BudgetGroupListV30FilteringStatisticsTime statisticsTime) {
    this.statisticsTime = statisticsTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetGroupListV30Filtering budgetGroupListV30Filtering = (BudgetGroupListV30Filtering) o;
    return Objects.equals(this.adType, budgetGroupListV30Filtering.adType) &&
        Objects.equals(this.budgetGroupIdList, budgetGroupListV30Filtering.budgetGroupIdList) &&
        Objects.equals(this.budgetGroupKeyword, budgetGroupListV30Filtering.budgetGroupKeyword) &&
        Objects.equals(this.budgetGroupStatusFirst, budgetGroupListV30Filtering.budgetGroupStatusFirst) &&
        Objects.equals(this.budgetGroupStatusSecond, budgetGroupListV30Filtering.budgetGroupStatusSecond) &&
        Objects.equals(this.deliveryType, budgetGroupListV30Filtering.deliveryType) &&
        Objects.equals(this.statisticsTime, budgetGroupListV30Filtering.statisticsTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, budgetGroupIdList, budgetGroupKeyword, budgetGroupStatusFirst, budgetGroupStatusSecond, deliveryType, statisticsTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetGroupListV30Filtering {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    budgetGroupIdList: ").append(toIndentedString(budgetGroupIdList)).append("\n");
    sb.append("    budgetGroupKeyword: ").append(toIndentedString(budgetGroupKeyword)).append("\n");
    sb.append("    budgetGroupStatusFirst: ").append(toIndentedString(budgetGroupStatusFirst)).append("\n");
    sb.append("    budgetGroupStatusSecond: ").append(toIndentedString(budgetGroupStatusSecond)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    statisticsTime: ").append(toIndentedString(statisticsTime)).append("\n");
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
    openapiFields.add("budget_group_id_list");
    openapiFields.add("budget_group_keyword");
    openapiFields.add("budget_group_status_first");
    openapiFields.add("budget_group_status_second");
    openapiFields.add("delivery_type");
    openapiFields.add("statistics_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BudgetGroupListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetGroupListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetGroupListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetGroupListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetGroupListV30Filtering>() {
           @Override
           public void write(JsonWriter out, BudgetGroupListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetGroupListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetGroupListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetGroupListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to BudgetGroupListV30Filtering
  */
  public static BudgetGroupListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetGroupListV30Filtering.class);
  }

 /**
  * Convert an instance of BudgetGroupListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

