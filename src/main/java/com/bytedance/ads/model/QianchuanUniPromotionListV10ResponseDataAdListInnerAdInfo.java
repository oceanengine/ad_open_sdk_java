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
import com.bytedance.ads.model.QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode;
import com.bytedance.ads.model.QianchuanUniPromotionListV10DataAdListAdInfoMarketingGoal;
import com.bytedance.ads.model.QianchuanUniPromotionListV10DataAdListAdInfoOptStatus;
import com.bytedance.ads.model.QianchuanUniPromotionListV10DataAdListAdInfoSmartBidType;
import com.bytedance.ads.model.QianchuanUniPromotionListV10DataAdListAdInfoStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DELIVERY_SECONDS = "delivery_seconds";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SECONDS)
  private Long deliverySeconds = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanUniPromotionListV10DataAdListAdInfoMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private QianchuanUniPromotionListV10DataAdListAdInfoOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_ROI2_GOAL = "roi2_goal";
  @SerializedName(SERIALIZED_NAME_ROI2_GOAL)
  private Double roi2Goal = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanUniPromotionListV10DataAdListAdInfoSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanUniPromotionListV10DataAdListAdInfoStatus status = null;

  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo() {
  }

  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo budget(Double budget) {
    
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


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo budgetMode(QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(QianchuanUniPromotionListV10DataAdListAdInfoBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo deliverySeconds(Long deliverySeconds) {
    
    this.deliverySeconds = deliverySeconds;
    return this;
  }

   /**
   * 
   * @return deliverySeconds
  **/
  @javax.annotation.Nullable
  public Long getDeliverySeconds() {
    return deliverySeconds;
  }


  public void setDeliverySeconds(Long deliverySeconds) {
    this.deliverySeconds = deliverySeconds;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo endTime(String endTime) {
    
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


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo id(Long id) {
    
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


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo marketingGoal(QianchuanUniPromotionListV10DataAdListAdInfoMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionListV10DataAdListAdInfoMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanUniPromotionListV10DataAdListAdInfoMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo optStatus(QianchuanUniPromotionListV10DataAdListAdInfoOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionListV10DataAdListAdInfoOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(QianchuanUniPromotionListV10DataAdListAdInfoOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo roi2Goal(Double roi2Goal) {
    
    this.roi2Goal = roi2Goal;
    return this;
  }

   /**
   * 
   * @return roi2Goal
  **/
  @javax.annotation.Nullable
  public Double getRoi2Goal() {
    return roi2Goal;
  }


  public void setRoi2Goal(Double roi2Goal) {
    this.roi2Goal = roi2Goal;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo smartBidType(QianchuanUniPromotionListV10DataAdListAdInfoSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionListV10DataAdListAdInfoSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanUniPromotionListV10DataAdListAdInfoSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo startTime(String startTime) {
    
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


  public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo status(QianchuanUniPromotionListV10DataAdListAdInfoStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionListV10DataAdListAdInfoStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanUniPromotionListV10DataAdListAdInfoStatus status) {
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
    QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo = (QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo) o;
    return Objects.equals(this.budget, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.budget) &&
        Objects.equals(this.budgetMode, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.budgetMode) &&
        Objects.equals(this.createTime, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.createTime) &&
        Objects.equals(this.deliverySeconds, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.deliverySeconds) &&
        Objects.equals(this.endTime, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.endTime) &&
        Objects.equals(this.id, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.id) &&
        Objects.equals(this.marketingGoal, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.marketingGoal) &&
        Objects.equals(this.modifyTime, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.modifyTime) &&
        Objects.equals(this.optStatus, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.optStatus) &&
        Objects.equals(this.roi2Goal, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.roi2Goal) &&
        Objects.equals(this.smartBidType, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.smartBidType) &&
        Objects.equals(this.startTime, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.startTime) &&
        Objects.equals(this.status, qianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetMode, createTime, deliverySeconds, endTime, id, marketingGoal, modifyTime, optStatus, roi2Goal, smartBidType, startTime, status);
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
    sb.append("class QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deliverySeconds: ").append(toIndentedString(deliverySeconds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    roi2Goal: ").append(toIndentedString(roi2Goal)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("delivery_seconds");
    openapiFields.add("end_time");
    openapiFields.add("id");
    openapiFields.add("marketing_goal");
    openapiFields.add("modify_time");
    openapiFields.add("opt_status");
    openapiFields.add("roi2_goal");
    openapiFields.add("smart_bid_type");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo
  */
  public static QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerAdInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

