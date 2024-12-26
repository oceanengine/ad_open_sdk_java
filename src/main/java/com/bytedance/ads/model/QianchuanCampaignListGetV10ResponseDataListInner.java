/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanCampaignListGetV10DataListBudgetMode;
import com.bytedance.ads.model.QianchuanCampaignListGetV10DataListMarketingGoal;
import com.bytedance.ads.model.QianchuanCampaignListGetV10DataListMarketingScene;
import com.bytedance.ads.model.QianchuanCampaignListGetV10DataListStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * QianchuanCampaignListGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QianchuanCampaignListGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private QianchuanCampaignListGetV10DataListBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CREATE_DATE = "create_date";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private String createDate = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanCampaignListGetV10DataListMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanCampaignListGetV10DataListMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanCampaignListGetV10DataListStatus status = null;

  public QianchuanCampaignListGetV10ResponseDataListInner() {
  }

  public QianchuanCampaignListGetV10ResponseDataListInner budget(Double budget) {
    
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


  public QianchuanCampaignListGetV10ResponseDataListInner budgetMode(QianchuanCampaignListGetV10DataListBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public QianchuanCampaignListGetV10DataListBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(QianchuanCampaignListGetV10DataListBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public QianchuanCampaignListGetV10ResponseDataListInner createDate(String createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * 
   * @return createDate
  **/
  @javax.annotation.Nullable
  public String getCreateDate() {
    return createDate;
  }


  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }


  public QianchuanCampaignListGetV10ResponseDataListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanCampaignListGetV10ResponseDataListInner marketingGoal(QianchuanCampaignListGetV10DataListMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanCampaignListGetV10DataListMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanCampaignListGetV10DataListMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanCampaignListGetV10ResponseDataListInner marketingScene(QianchuanCampaignListGetV10DataListMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanCampaignListGetV10DataListMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanCampaignListGetV10DataListMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanCampaignListGetV10ResponseDataListInner name(String name) {
    
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


  public QianchuanCampaignListGetV10ResponseDataListInner status(QianchuanCampaignListGetV10DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanCampaignListGetV10DataListStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanCampaignListGetV10DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCampaignListGetV10ResponseDataListInner qianchuanCampaignListGetV10ResponseDataListInner = (QianchuanCampaignListGetV10ResponseDataListInner) o;
    return Objects.equals(this.budget, qianchuanCampaignListGetV10ResponseDataListInner.budget) &&
        Objects.equals(this.budgetMode, qianchuanCampaignListGetV10ResponseDataListInner.budgetMode) &&
        Objects.equals(this.createDate, qianchuanCampaignListGetV10ResponseDataListInner.createDate) &&
        Objects.equals(this.id, qianchuanCampaignListGetV10ResponseDataListInner.id) &&
        Objects.equals(this.marketingGoal, qianchuanCampaignListGetV10ResponseDataListInner.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanCampaignListGetV10ResponseDataListInner.marketingScene) &&
        Objects.equals(this.name, qianchuanCampaignListGetV10ResponseDataListInner.name) &&
        Objects.equals(this.status, qianchuanCampaignListGetV10ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetMode, createDate, id, marketingGoal, marketingScene, name, status);
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
    sb.append("class QianchuanCampaignListGetV10ResponseDataListInner {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("budget_mode");
    openapiFields.add("create_date");
    openapiFields.add("id");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget_mode");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("marketing_goal");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCampaignListGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCampaignListGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCampaignListGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCampaignListGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCampaignListGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCampaignListGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCampaignListGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCampaignListGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCampaignListGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCampaignListGetV10ResponseDataListInner
  */
  public static QianchuanCampaignListGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCampaignListGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanCampaignListGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

