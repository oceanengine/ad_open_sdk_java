/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QueryProjectV2FilteringPlatformList;
import com.bytedance.ads.model.QueryProjectV2FilteringProjectStatusList;
import com.bytedance.ads.model.QueryProjectV2FilteringReceiptStatusList;
import com.bytedance.ads.model.QueryProjectV2FilteringServingTypeList;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class QueryProjectV2Filtering {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId = null;

  public static final String SERIALIZED_NAME_DEADLINE = "deadline";
  @SerializedName(SERIALIZED_NAME_DEADLINE)
  private String deadline = null;

  public static final String SERIALIZED_NAME_PLATFORM_LIST = "platform_list";
  @SerializedName(SERIALIZED_NAME_PLATFORM_LIST)
  private List<QueryProjectV2FilteringPlatformList> platformList = null;

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
  private List<QueryProjectV2FilteringProjectStatusList> projectStatusList = null;

  public static final String SERIALIZED_NAME_RECEIPT_STATUS_LIST = "receipt_status_list";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STATUS_LIST)
  private List<QueryProjectV2FilteringReceiptStatusList> receiptStatusList = null;

  public static final String SERIALIZED_NAME_SERVING_TYPE_LIST = "serving_type_list";
  @SerializedName(SERIALIZED_NAME_SERVING_TYPE_LIST)
  private List<QueryProjectV2FilteringServingTypeList> servingTypeList = null;

  public QueryProjectV2Filtering() {
  }

  public QueryProjectV2Filtering advertiserId(Long advertiserId) {
    
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


  public QueryProjectV2Filtering customerId(Long customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * 客户ID
   * @return customerId
  **/
  @javax.annotation.Nullable
  public Long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }


  public QueryProjectV2Filtering deadline(String deadline) {
    
    this.deadline = deadline;
    return this;
  }

   /**
   * 应回款日期
   * @return deadline
  **/
  @javax.annotation.Nullable
  public String getDeadline() {
    return deadline;
  }


  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }


  public QueryProjectV2Filtering platformList(List<QueryProjectV2FilteringPlatformList> platformList) {
    
    this.platformList = platformList;
    return this;
  }

  public QueryProjectV2Filtering addPlatformListItem(QueryProjectV2FilteringPlatformList platformListItem) {
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
  public List<QueryProjectV2FilteringPlatformList> getPlatformList() {
    return platformList;
  }


  public void setPlatformList(List<QueryProjectV2FilteringPlatformList> platformList) {
    this.platformList = platformList;
  }


  public QueryProjectV2Filtering projectEndDateBegin(String projectEndDateBegin) {
    
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


  public QueryProjectV2Filtering projectEndDateEnd(String projectEndDateEnd) {
    
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


  public QueryProjectV2Filtering projectStartDateBegin(String projectStartDateBegin) {
    
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


  public QueryProjectV2Filtering projectStartDateEnd(String projectStartDateEnd) {
    
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


  public QueryProjectV2Filtering projectStatusList(List<QueryProjectV2FilteringProjectStatusList> projectStatusList) {
    
    this.projectStatusList = projectStatusList;
    return this;
  }

  public QueryProjectV2Filtering addProjectStatusListItem(QueryProjectV2FilteringProjectStatusList projectStatusListItem) {
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
  public List<QueryProjectV2FilteringProjectStatusList> getProjectStatusList() {
    return projectStatusList;
  }


  public void setProjectStatusList(List<QueryProjectV2FilteringProjectStatusList> projectStatusList) {
    this.projectStatusList = projectStatusList;
  }


  public QueryProjectV2Filtering receiptStatusList(List<QueryProjectV2FilteringReceiptStatusList> receiptStatusList) {
    
    this.receiptStatusList = receiptStatusList;
    return this;
  }

  public QueryProjectV2Filtering addReceiptStatusListItem(QueryProjectV2FilteringReceiptStatusList receiptStatusListItem) {
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
  public List<QueryProjectV2FilteringReceiptStatusList> getReceiptStatusList() {
    return receiptStatusList;
  }


  public void setReceiptStatusList(List<QueryProjectV2FilteringReceiptStatusList> receiptStatusList) {
    this.receiptStatusList = receiptStatusList;
  }


  public QueryProjectV2Filtering servingTypeList(List<QueryProjectV2FilteringServingTypeList> servingTypeList) {
    
    this.servingTypeList = servingTypeList;
    return this;
  }

  public QueryProjectV2Filtering addServingTypeListItem(QueryProjectV2FilteringServingTypeList servingTypeListItem) {
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
  public List<QueryProjectV2FilteringServingTypeList> getServingTypeList() {
    return servingTypeList;
  }


  public void setServingTypeList(List<QueryProjectV2FilteringServingTypeList> servingTypeList) {
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
    QueryProjectV2Filtering queryProjectV2Filtering = (QueryProjectV2Filtering) o;
    return Objects.equals(this.advertiserId, queryProjectV2Filtering.advertiserId) &&
        Objects.equals(this.customerId, queryProjectV2Filtering.customerId) &&
        Objects.equals(this.deadline, queryProjectV2Filtering.deadline) &&
        Objects.equals(this.platformList, queryProjectV2Filtering.platformList) &&
        Objects.equals(this.projectEndDateBegin, queryProjectV2Filtering.projectEndDateBegin) &&
        Objects.equals(this.projectEndDateEnd, queryProjectV2Filtering.projectEndDateEnd) &&
        Objects.equals(this.projectStartDateBegin, queryProjectV2Filtering.projectStartDateBegin) &&
        Objects.equals(this.projectStartDateEnd, queryProjectV2Filtering.projectStartDateEnd) &&
        Objects.equals(this.projectStatusList, queryProjectV2Filtering.projectStatusList) &&
        Objects.equals(this.receiptStatusList, queryProjectV2Filtering.receiptStatusList) &&
        Objects.equals(this.servingTypeList, queryProjectV2Filtering.servingTypeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, customerId, deadline, platformList, projectEndDateBegin, projectEndDateEnd, projectStartDateBegin, projectStartDateEnd, projectStatusList, receiptStatusList, servingTypeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryProjectV2Filtering {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
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
    openapiFields.add("customer_id");
    openapiFields.add("deadline");
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
       if (!QueryProjectV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryProjectV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryProjectV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryProjectV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryProjectV2Filtering>() {
           @Override
           public void write(JsonWriter out, QueryProjectV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryProjectV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryProjectV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryProjectV2Filtering
  * @throws IOException if the JSON string is invalid with respect to QueryProjectV2Filtering
  */
  public static QueryProjectV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryProjectV2Filtering.class);
  }

 /**
  * Convert an instance of QueryProjectV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

