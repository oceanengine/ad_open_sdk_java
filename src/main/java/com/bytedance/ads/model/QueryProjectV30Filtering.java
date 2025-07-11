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
import com.bytedance.ads.model.QueryProjectV30FilteringPlatformList;
import com.bytedance.ads.model.QueryProjectV30FilteringProjectStatusList;
import com.bytedance.ads.model.QueryProjectV30FilteringReceiptStatusList;
import com.bytedance.ads.model.QueryProjectV30FilteringServingTypeList;
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
public class QueryProjectV30Filtering {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_COST_CUSTOMER_ID = "cost_customer_id";
  @SerializedName(SERIALIZED_NAME_COST_CUSTOMER_ID)
  private Long costCustomerId = null;

  public static final String SERIALIZED_NAME_DEADLINE_BEGIN = "deadline_begin";
  @SerializedName(SERIALIZED_NAME_DEADLINE_BEGIN)
  private String deadlineBegin = null;

  public static final String SERIALIZED_NAME_DEADLINE_END = "deadline_end";
  @SerializedName(SERIALIZED_NAME_DEADLINE_END)
  private String deadlineEnd = null;

  public static final String SERIALIZED_NAME_PLATFORM_LIST = "platform_list";
  @SerializedName(SERIALIZED_NAME_PLATFORM_LIST)
  private List<QueryProjectV30FilteringPlatformList> platformList = null;

  public static final String SERIALIZED_NAME_PROJECT_END_DATE_BEGIN = "project_end_date_begin";
  @SerializedName(SERIALIZED_NAME_PROJECT_END_DATE_BEGIN)
  private String projectEndDateBegin = null;

  public static final String SERIALIZED_NAME_PROJECT_END_DATE_END = "project_end_date_end";
  @SerializedName(SERIALIZED_NAME_PROJECT_END_DATE_END)
  private String projectEndDateEnd = null;

  public static final String SERIALIZED_NAME_PROJECT_START_DATE_BEGIN = "project_start_date_begin";
  @SerializedName(SERIALIZED_NAME_PROJECT_START_DATE_BEGIN)
  private String projectStartDateBegin = null;

  public static final String SERIALIZED_NAME_PROJECT_START_DATE_END = "project_start_date_end";
  @SerializedName(SERIALIZED_NAME_PROJECT_START_DATE_END)
  private String projectStartDateEnd = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_LIST = "project_status_list";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_LIST)
  private List<QueryProjectV30FilteringProjectStatusList> projectStatusList = null;

  public static final String SERIALIZED_NAME_RECEIPT_STATUS_LIST = "receipt_status_list";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STATUS_LIST)
  private List<QueryProjectV30FilteringReceiptStatusList> receiptStatusList = null;

  public static final String SERIALIZED_NAME_SERVING_TYPE_LIST = "serving_type_list";
  @SerializedName(SERIALIZED_NAME_SERVING_TYPE_LIST)
  private List<QueryProjectV30FilteringServingTypeList> servingTypeList = null;

  public QueryProjectV30Filtering() {
  }

  public QueryProjectV30Filtering advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 投放账号ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QueryProjectV30Filtering costCustomerId(Long costCustomerId) {
    
    this.costCustomerId = costCustomerId;
    return this;
  }

   /**
   * 客户ID
   * @return costCustomerId
  **/
  @javax.annotation.Nullable
  public Long getCostCustomerId() {
    return costCustomerId;
  }


  public void setCostCustomerId(Long costCustomerId) {
    this.costCustomerId = costCustomerId;
  }


  public QueryProjectV30Filtering deadlineBegin(String deadlineBegin) {
    
    this.deadlineBegin = deadlineBegin;
    return this;
  }

   /**
   * 应回款日期-开始 2023-07-06
   * @return deadlineBegin
  **/
  @javax.annotation.Nullable
  public String getDeadlineBegin() {
    return deadlineBegin;
  }


  public void setDeadlineBegin(String deadlineBegin) {
    this.deadlineBegin = deadlineBegin;
  }


  public QueryProjectV30Filtering deadlineEnd(String deadlineEnd) {
    
    this.deadlineEnd = deadlineEnd;
    return this;
  }

   /**
   * 应回款日期-结束 2023-07-06
   * @return deadlineEnd
  **/
  @javax.annotation.Nullable
  public String getDeadlineEnd() {
    return deadlineEnd;
  }


  public void setDeadlineEnd(String deadlineEnd) {
    this.deadlineEnd = deadlineEnd;
  }


  public QueryProjectV30Filtering platformList(List<QueryProjectV30FilteringPlatformList> platformList) {
    
    this.platformList = platformList;
    return this;
  }

  public QueryProjectV30Filtering addPlatformListItem(QueryProjectV30FilteringPlatformList platformListItem) {
    if (this.platformList == null) {
      this.platformList = new ArrayList<>();
    }
    this.platformList.add(platformListItem);
    return this;
  }

   /**
   * 平台列表
   * @return platformList
  **/
  @javax.annotation.Nullable
  public List<QueryProjectV30FilteringPlatformList> getPlatformList() {
    return platformList;
  }


  public void setPlatformList(List<QueryProjectV30FilteringPlatformList> platformList) {
    this.platformList = platformList;
  }


  public QueryProjectV30Filtering projectEndDateBegin(String projectEndDateBegin) {
    
    this.projectEndDateBegin = projectEndDateBegin;
    return this;
  }

   /**
   * 项目结束时间-开始 例如 2023-07-06
   * @return projectEndDateBegin
  **/
  @javax.annotation.Nullable
  public String getProjectEndDateBegin() {
    return projectEndDateBegin;
  }


  public void setProjectEndDateBegin(String projectEndDateBegin) {
    this.projectEndDateBegin = projectEndDateBegin;
  }


  public QueryProjectV30Filtering projectEndDateEnd(String projectEndDateEnd) {
    
    this.projectEndDateEnd = projectEndDateEnd;
    return this;
  }

   /**
   * 项目结束时间-结束 例如 2023-07-06
   * @return projectEndDateEnd
  **/
  @javax.annotation.Nullable
  public String getProjectEndDateEnd() {
    return projectEndDateEnd;
  }


  public void setProjectEndDateEnd(String projectEndDateEnd) {
    this.projectEndDateEnd = projectEndDateEnd;
  }


  public QueryProjectV30Filtering projectStartDateBegin(String projectStartDateBegin) {
    
    this.projectStartDateBegin = projectStartDateBegin;
    return this;
  }

   /**
   * 项目开始时间-开始 例如 2023-07-06
   * @return projectStartDateBegin
  **/
  @javax.annotation.Nullable
  public String getProjectStartDateBegin() {
    return projectStartDateBegin;
  }


  public void setProjectStartDateBegin(String projectStartDateBegin) {
    this.projectStartDateBegin = projectStartDateBegin;
  }


  public QueryProjectV30Filtering projectStartDateEnd(String projectStartDateEnd) {
    
    this.projectStartDateEnd = projectStartDateEnd;
    return this;
  }

   /**
   * 项目开始时间-结束 例如 2023-07-06
   * @return projectStartDateEnd
  **/
  @javax.annotation.Nullable
  public String getProjectStartDateEnd() {
    return projectStartDateEnd;
  }


  public void setProjectStartDateEnd(String projectStartDateEnd) {
    this.projectStartDateEnd = projectStartDateEnd;
  }


  public QueryProjectV30Filtering projectStatusList(List<QueryProjectV30FilteringProjectStatusList> projectStatusList) {
    
    this.projectStatusList = projectStatusList;
    return this;
  }

  public QueryProjectV30Filtering addProjectStatusListItem(QueryProjectV30FilteringProjectStatusList projectStatusListItem) {
    if (this.projectStatusList == null) {
      this.projectStatusList = new ArrayList<>();
    }
    this.projectStatusList.add(projectStatusListItem);
    return this;
  }

   /**
   * 项目状态
   * @return projectStatusList
  **/
  @javax.annotation.Nullable
  public List<QueryProjectV30FilteringProjectStatusList> getProjectStatusList() {
    return projectStatusList;
  }


  public void setProjectStatusList(List<QueryProjectV30FilteringProjectStatusList> projectStatusList) {
    this.projectStatusList = projectStatusList;
  }


  public QueryProjectV30Filtering receiptStatusList(List<QueryProjectV30FilteringReceiptStatusList> receiptStatusList) {
    
    this.receiptStatusList = receiptStatusList;
    return this;
  }

  public QueryProjectV30Filtering addReceiptStatusListItem(QueryProjectV30FilteringReceiptStatusList receiptStatusListItem) {
    if (this.receiptStatusList == null) {
      this.receiptStatusList = new ArrayList<>();
    }
    this.receiptStatusList.add(receiptStatusListItem);
    return this;
  }

   /**
   * 项目回款状态
   * @return receiptStatusList
  **/
  @javax.annotation.Nullable
  public List<QueryProjectV30FilteringReceiptStatusList> getReceiptStatusList() {
    return receiptStatusList;
  }


  public void setReceiptStatusList(List<QueryProjectV30FilteringReceiptStatusList> receiptStatusList) {
    this.receiptStatusList = receiptStatusList;
  }


  public QueryProjectV30Filtering servingTypeList(List<QueryProjectV30FilteringServingTypeList> servingTypeList) {
    
    this.servingTypeList = servingTypeList;
    return this;
  }

  public QueryProjectV30Filtering addServingTypeListItem(QueryProjectV30FilteringServingTypeList servingTypeListItem) {
    if (this.servingTypeList == null) {
      this.servingTypeList = new ArrayList<>();
    }
    this.servingTypeList.add(servingTypeListItem);
    return this;
  }

   /**
   * 投放类型
   * @return servingTypeList
  **/
  @javax.annotation.Nullable
  public List<QueryProjectV30FilteringServingTypeList> getServingTypeList() {
    return servingTypeList;
  }


  public void setServingTypeList(List<QueryProjectV30FilteringServingTypeList> servingTypeList) {
    this.servingTypeList = servingTypeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryProjectV30Filtering queryProjectV30Filtering = (QueryProjectV30Filtering) o;
    return Objects.equals(this.advertiserId, queryProjectV30Filtering.advertiserId) &&
        Objects.equals(this.costCustomerId, queryProjectV30Filtering.costCustomerId) &&
        Objects.equals(this.deadlineBegin, queryProjectV30Filtering.deadlineBegin) &&
        Objects.equals(this.deadlineEnd, queryProjectV30Filtering.deadlineEnd) &&
        Objects.equals(this.platformList, queryProjectV30Filtering.platformList) &&
        Objects.equals(this.projectEndDateBegin, queryProjectV30Filtering.projectEndDateBegin) &&
        Objects.equals(this.projectEndDateEnd, queryProjectV30Filtering.projectEndDateEnd) &&
        Objects.equals(this.projectStartDateBegin, queryProjectV30Filtering.projectStartDateBegin) &&
        Objects.equals(this.projectStartDateEnd, queryProjectV30Filtering.projectStartDateEnd) &&
        Objects.equals(this.projectStatusList, queryProjectV30Filtering.projectStatusList) &&
        Objects.equals(this.receiptStatusList, queryProjectV30Filtering.receiptStatusList) &&
        Objects.equals(this.servingTypeList, queryProjectV30Filtering.servingTypeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, costCustomerId, deadlineBegin, deadlineEnd, platformList, projectEndDateBegin, projectEndDateEnd, projectStartDateBegin, projectStartDateEnd, projectStatusList, receiptStatusList, servingTypeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryProjectV30Filtering {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    costCustomerId: ").append(toIndentedString(costCustomerId)).append("\n");
    sb.append("    deadlineBegin: ").append(toIndentedString(deadlineBegin)).append("\n");
    sb.append("    deadlineEnd: ").append(toIndentedString(deadlineEnd)).append("\n");
    sb.append("    platformList: ").append(toIndentedString(platformList)).append("\n");
    sb.append("    projectEndDateBegin: ").append(toIndentedString(projectEndDateBegin)).append("\n");
    sb.append("    projectEndDateEnd: ").append(toIndentedString(projectEndDateEnd)).append("\n");
    sb.append("    projectStartDateBegin: ").append(toIndentedString(projectStartDateBegin)).append("\n");
    sb.append("    projectStartDateEnd: ").append(toIndentedString(projectStartDateEnd)).append("\n");
    sb.append("    projectStatusList: ").append(toIndentedString(projectStatusList)).append("\n");
    sb.append("    receiptStatusList: ").append(toIndentedString(receiptStatusList)).append("\n");
    sb.append("    servingTypeList: ").append(toIndentedString(servingTypeList)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("cost_customer_id");
    openapiFields.add("deadline_begin");
    openapiFields.add("deadline_end");
    openapiFields.add("platform_list");
    openapiFields.add("project_end_date_begin");
    openapiFields.add("project_end_date_end");
    openapiFields.add("project_start_date_begin");
    openapiFields.add("project_start_date_end");
    openapiFields.add("project_status_list");
    openapiFields.add("receipt_status_list");
    openapiFields.add("serving_type_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryProjectV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryProjectV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryProjectV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryProjectV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryProjectV30Filtering>() {
           @Override
           public void write(JsonWriter out, QueryProjectV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryProjectV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryProjectV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryProjectV30Filtering
  * @throws IOException if the JSON string is invalid with respect to QueryProjectV30Filtering
  */
  public static QueryProjectV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryProjectV30Filtering.class);
  }

 /**
  * Convert an instance of QueryProjectV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

