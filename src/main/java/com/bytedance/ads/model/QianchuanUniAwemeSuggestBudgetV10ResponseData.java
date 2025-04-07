/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanUniAwemeSuggestBudgetV10ResponseDataEstimateTransCostListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QianchuanUniAwemeSuggestBudgetV10ResponseData {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_BUDGET_DANGER = "budget_danger";
  @SerializedName(SERIALIZED_NAME_BUDGET_DANGER)
  private Long budgetDanger = null;

  public static final String SERIALIZED_NAME_BUDGET_MAX = "budget_max";
  @SerializedName(SERIALIZED_NAME_BUDGET_MAX)
  private Long budgetMax = null;

  public static final String SERIALIZED_NAME_BUDGET_MIN = "budget_min";
  @SerializedName(SERIALIZED_NAME_BUDGET_MIN)
  private Long budgetMin = null;

  public static final String SERIALIZED_NAME_ESTIMATE_TRANS_COST_LIST = "estimate_trans_cost_list";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_TRANS_COST_LIST)
  private List<QianchuanUniAwemeSuggestBudgetV10ResponseDataEstimateTransCostListInner> estimateTransCostList = null;

  public static final String SERIALIZED_NAME_IS_UPDATE = "is_update";
  @SerializedName(SERIALIZED_NAME_IS_UPDATE)
  private Boolean isUpdate = null;

  public static final String SERIALIZED_NAME_SUGGESTED_BUDGET_LIST = "suggested_budget_list";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_BUDGET_LIST)
  private List<Long> suggestedBudgetList = null;

  public QianchuanUniAwemeSuggestBudgetV10ResponseData() {
  }

  public QianchuanUniAwemeSuggestBudgetV10ResponseData budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 推荐预算
   * @return budget
  **/
  @javax.annotation.Nullable
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public QianchuanUniAwemeSuggestBudgetV10ResponseData budgetDanger(Long budgetDanger) {
    
    this.budgetDanger = budgetDanger;
    return this;
  }

   /**
   * 预算上限
   * @return budgetDanger
  **/
  @javax.annotation.Nullable
  public Long getBudgetDanger() {
    return budgetDanger;
  }


  public void setBudgetDanger(Long budgetDanger) {
    this.budgetDanger = budgetDanger;
  }


  public QianchuanUniAwemeSuggestBudgetV10ResponseData budgetMax(Long budgetMax) {
    
    this.budgetMax = budgetMax;
    return this;
  }

   /**
   * 
   * @return budgetMax
  **/
  @javax.annotation.Nullable
  public Long getBudgetMax() {
    return budgetMax;
  }


  public void setBudgetMax(Long budgetMax) {
    this.budgetMax = budgetMax;
  }


  public QianchuanUniAwemeSuggestBudgetV10ResponseData budgetMin(Long budgetMin) {
    
    this.budgetMin = budgetMin;
    return this;
  }

   /**
   * 
   * @return budgetMin
  **/
  @javax.annotation.Nullable
  public Long getBudgetMin() {
    return budgetMin;
  }


  public void setBudgetMin(Long budgetMin) {
    this.budgetMin = budgetMin;
  }


  public QianchuanUniAwemeSuggestBudgetV10ResponseData estimateTransCostList(List<QianchuanUniAwemeSuggestBudgetV10ResponseDataEstimateTransCostListInner> estimateTransCostList) {
    
    this.estimateTransCostList = estimateTransCostList;
    return this;
  }

  public QianchuanUniAwemeSuggestBudgetV10ResponseData addEstimateTransCostListItem(QianchuanUniAwemeSuggestBudgetV10ResponseDataEstimateTransCostListInner estimateTransCostListItem) {
    if (this.estimateTransCostList == null) {
      this.estimateTransCostList = new ArrayList<>();
    }
    this.estimateTransCostList.add(estimateTransCostListItem);
    return this;
  }

   /**
   * 
   * @return estimateTransCostList
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeSuggestBudgetV10ResponseDataEstimateTransCostListInner> getEstimateTransCostList() {
    return estimateTransCostList;
  }


  public void setEstimateTransCostList(List<QianchuanUniAwemeSuggestBudgetV10ResponseDataEstimateTransCostListInner> estimateTransCostList) {
    this.estimateTransCostList = estimateTransCostList;
  }


  public QianchuanUniAwemeSuggestBudgetV10ResponseData isUpdate(Boolean isUpdate) {
    
    this.isUpdate = isUpdate;
    return this;
  }

   /**
   * 用于roi2 nobid，建议预算是否更新
   * @return isUpdate
  **/
  @javax.annotation.Nullable
  public Boolean getIsUpdate() {
    return isUpdate;
  }


  public void setIsUpdate(Boolean isUpdate) {
    this.isUpdate = isUpdate;
  }


  public QianchuanUniAwemeSuggestBudgetV10ResponseData suggestedBudgetList(List<Long> suggestedBudgetList) {
    
    this.suggestedBudgetList = suggestedBudgetList;
    return this;
  }

  public QianchuanUniAwemeSuggestBudgetV10ResponseData addSuggestedBudgetListItem(Long suggestedBudgetListItem) {
    if (this.suggestedBudgetList == null) {
      this.suggestedBudgetList = new ArrayList<>();
    }
    this.suggestedBudgetList.add(suggestedBudgetListItem);
    return this;
  }

   /**
   * 多档建议预算
   * @return suggestedBudgetList
  **/
  @javax.annotation.Nullable
  public List<Long> getSuggestedBudgetList() {
    return suggestedBudgetList;
  }


  public void setSuggestedBudgetList(List<Long> suggestedBudgetList) {
    this.suggestedBudgetList = suggestedBudgetList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniAwemeSuggestBudgetV10ResponseData qianchuanUniAwemeSuggestBudgetV10ResponseData = (QianchuanUniAwemeSuggestBudgetV10ResponseData) o;
    return Objects.equals(this.budget, qianchuanUniAwemeSuggestBudgetV10ResponseData.budget) &&
        Objects.equals(this.budgetDanger, qianchuanUniAwemeSuggestBudgetV10ResponseData.budgetDanger) &&
        Objects.equals(this.budgetMax, qianchuanUniAwemeSuggestBudgetV10ResponseData.budgetMax) &&
        Objects.equals(this.budgetMin, qianchuanUniAwemeSuggestBudgetV10ResponseData.budgetMin) &&
        Objects.equals(this.estimateTransCostList, qianchuanUniAwemeSuggestBudgetV10ResponseData.estimateTransCostList) &&
        Objects.equals(this.isUpdate, qianchuanUniAwemeSuggestBudgetV10ResponseData.isUpdate) &&
        Objects.equals(this.suggestedBudgetList, qianchuanUniAwemeSuggestBudgetV10ResponseData.suggestedBudgetList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetDanger, budgetMax, budgetMin, estimateTransCostList, isUpdate, suggestedBudgetList);
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
    sb.append("class QianchuanUniAwemeSuggestBudgetV10ResponseData {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetDanger: ").append(toIndentedString(budgetDanger)).append("\n");
    sb.append("    budgetMax: ").append(toIndentedString(budgetMax)).append("\n");
    sb.append("    budgetMin: ").append(toIndentedString(budgetMin)).append("\n");
    sb.append("    estimateTransCostList: ").append(toIndentedString(estimateTransCostList)).append("\n");
    sb.append("    isUpdate: ").append(toIndentedString(isUpdate)).append("\n");
    sb.append("    suggestedBudgetList: ").append(toIndentedString(suggestedBudgetList)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_danger");
    openapiFields.add("budget_max");
    openapiFields.add("budget_min");
    openapiFields.add("estimate_trans_cost_list");
    openapiFields.add("is_update");
    openapiFields.add("suggested_budget_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeSuggestBudgetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeSuggestBudgetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeSuggestBudgetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeSuggestBudgetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeSuggestBudgetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeSuggestBudgetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeSuggestBudgetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeSuggestBudgetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeSuggestBudgetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeSuggestBudgetV10ResponseData
  */
  public static QianchuanUniAwemeSuggestBudgetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeSuggestBudgetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeSuggestBudgetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

