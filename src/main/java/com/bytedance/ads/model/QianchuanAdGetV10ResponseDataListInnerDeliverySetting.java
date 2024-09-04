/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdGetV10DataListDeliverySettingBudgetMode;
import com.bytedance.ads.model.QianchuanAdGetV10DataListDeliverySettingDeepBidType;
import com.bytedance.ads.model.QianchuanAdGetV10DataListDeliverySettingDeepExternalAction;
import com.bytedance.ads.model.QianchuanAdGetV10DataListDeliverySettingExternalAction;
import com.bytedance.ads.model.QianchuanAdGetV10DataListDeliverySettingQcpxMode;
import com.bytedance.ads.model.QianchuanAdGetV10DataListDeliverySettingSmartBidType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class QianchuanAdGetV10ResponseDataListInnerDeliverySetting {
  public static final String SERIALIZED_NAME_ALLOW_QCPX = "allow_qcpx";
  @SerializedName(SERIALIZED_NAME_ALLOW_QCPX)
  private Boolean allowQcpx = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private QianchuanAdGetV10DataListDeliverySettingBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private QianchuanAdGetV10DataListDeliverySettingDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_CPA_BID = "deep_cpa_bid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPA_BID)
  private Double deepCpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private QianchuanAdGetV10DataListDeliverySettingDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAdGetV10DataListDeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_PRODUCT_NEW_OPEN = "product_new_open";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NEW_OPEN)
  private Boolean productNewOpen = null;

  public static final String SERIALIZED_NAME_QCPX_MODE = "qcpx_mode";
  @SerializedName(SERIALIZED_NAME_QCPX_MODE)
  private QianchuanAdGetV10DataListDeliverySettingQcpxMode qcpxMode = null;

  public static final String SERIALIZED_NAME_REVIVE_BUDGET = "revive_budget";
  @SerializedName(SERIALIZED_NAME_REVIVE_BUDGET)
  private Double reviveBudget = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanAdGetV10DataListDeliverySettingSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting() {
  }

  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting allowQcpx(Boolean allowQcpx) {
    
    this.allowQcpx = allowQcpx;
    return this;
  }

   /**
   * 
   * @return allowQcpx
  **/
  @javax.annotation.Nullable
  public Boolean getAllowQcpx() {
    return allowQcpx;
  }


  public void setAllowQcpx(Boolean allowQcpx) {
    this.allowQcpx = allowQcpx;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting budget(Double budget) {
    
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


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting budgetMode(QianchuanAdGetV10DataListDeliverySettingBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListDeliverySettingBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(QianchuanAdGetV10DataListDeliverySettingBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting cpaBid(Double cpaBid) {
    
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


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting deepBidType(QianchuanAdGetV10DataListDeliverySettingDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListDeliverySettingDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(QianchuanAdGetV10DataListDeliverySettingDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting deepCpaBid(Double deepCpaBid) {
    
    this.deepCpaBid = deepCpaBid;
    return this;
  }

   /**
   * 
   * @return deepCpaBid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpaBid() {
    return deepCpaBid;
  }


  public void setDeepCpaBid(Double deepCpaBid) {
    this.deepCpaBid = deepCpaBid;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting deepExternalAction(QianchuanAdGetV10DataListDeliverySettingDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListDeliverySettingDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(QianchuanAdGetV10DataListDeliverySettingDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting endTime(String endTime) {
    
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


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting externalAction(QianchuanAdGetV10DataListDeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListDeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAdGetV10DataListDeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting productNewOpen(Boolean productNewOpen) {
    
    this.productNewOpen = productNewOpen;
    return this;
  }

   /**
   * 
   * @return productNewOpen
  **/
  @javax.annotation.Nullable
  public Boolean getProductNewOpen() {
    return productNewOpen;
  }


  public void setProductNewOpen(Boolean productNewOpen) {
    this.productNewOpen = productNewOpen;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting qcpxMode(QianchuanAdGetV10DataListDeliverySettingQcpxMode qcpxMode) {
    
    this.qcpxMode = qcpxMode;
    return this;
  }

   /**
   * Get qcpxMode
   * @return qcpxMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListDeliverySettingQcpxMode getQcpxMode() {
    return qcpxMode;
  }


  public void setQcpxMode(QianchuanAdGetV10DataListDeliverySettingQcpxMode qcpxMode) {
    this.qcpxMode = qcpxMode;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting reviveBudget(Double reviveBudget) {
    
    this.reviveBudget = reviveBudget;
    return this;
  }

   /**
   * 
   * @return reviveBudget
  **/
  @javax.annotation.Nullable
  public Double getReviveBudget() {
    return reviveBudget;
  }


  public void setReviveBudget(Double reviveBudget) {
    this.reviveBudget = reviveBudget;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting roiGoal(Double roiGoal) {
    
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


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting smartBidType(QianchuanAdGetV10DataListDeliverySettingSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListDeliverySettingSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanAdGetV10DataListDeliverySettingSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting startTime(String startTime) {
    
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
    QianchuanAdGetV10ResponseDataListInnerDeliverySetting qianchuanAdGetV10ResponseDataListInnerDeliverySetting = (QianchuanAdGetV10ResponseDataListInnerDeliverySetting) o;
    return Objects.equals(this.allowQcpx, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.allowQcpx) &&
        Objects.equals(this.budget, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.budget) &&
        Objects.equals(this.budgetMode, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.budgetMode) &&
        Objects.equals(this.cpaBid, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.cpaBid) &&
        Objects.equals(this.deepBidType, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.deepBidType) &&
        Objects.equals(this.deepCpaBid, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.deepCpaBid) &&
        Objects.equals(this.deepExternalAction, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.deepExternalAction) &&
        Objects.equals(this.endTime, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.endTime) &&
        Objects.equals(this.externalAction, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.externalAction) &&
        Objects.equals(this.productNewOpen, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.productNewOpen) &&
        Objects.equals(this.qcpxMode, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.qcpxMode) &&
        Objects.equals(this.reviveBudget, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.reviveBudget) &&
        Objects.equals(this.roiGoal, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.roiGoal) &&
        Objects.equals(this.smartBidType, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.smartBidType) &&
        Objects.equals(this.startTime, qianchuanAdGetV10ResponseDataListInnerDeliverySetting.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowQcpx, budget, budgetMode, cpaBid, deepBidType, deepCpaBid, deepExternalAction, endTime, externalAction, productNewOpen, qcpxMode, reviveBudget, roiGoal, smartBidType, startTime);
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
    sb.append("class QianchuanAdGetV10ResponseDataListInnerDeliverySetting {\n");
    sb.append("    allowQcpx: ").append(toIndentedString(allowQcpx)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    productNewOpen: ").append(toIndentedString(productNewOpen)).append("\n");
    sb.append("    qcpxMode: ").append(toIndentedString(qcpxMode)).append("\n");
    sb.append("    reviveBudget: ").append(toIndentedString(reviveBudget)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
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
    openapiFields.add("allow_qcpx");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_cpa_bid");
    openapiFields.add("deep_external_action");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("product_new_open");
    openapiFields.add("qcpx_mode");
    openapiFields.add("revive_budget");
    openapiFields.add("roi_goal");
    openapiFields.add("smart_bid_type");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdGetV10ResponseDataListInnerDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdGetV10ResponseDataListInnerDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdGetV10ResponseDataListInnerDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdGetV10ResponseDataListInnerDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdGetV10ResponseDataListInnerDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAdGetV10ResponseDataListInnerDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdGetV10ResponseDataListInnerDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdGetV10ResponseDataListInnerDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdGetV10ResponseDataListInnerDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdGetV10ResponseDataListInnerDeliverySetting
  */
  public static QianchuanAdGetV10ResponseDataListInnerDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdGetV10ResponseDataListInnerDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAdGetV10ResponseDataListInnerDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

