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
import com.bytedance.ads.model.QueryInvoiceV2FilteringDifferenceInvoice;
import com.bytedance.ads.model.QueryInvoiceV2FilteringInvoiceType;
import com.bytedance.ads.model.QueryInvoiceV2FilteringPlatform;
import com.bytedance.ads.model.QueryInvoiceV2FilteringRevertStatusList;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QueryInvoiceV2Filtering {
  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_DIFFERENCE_INVOICE = "difference_invoice";
  @SerializedName(SERIALIZED_NAME_DIFFERENCE_INVOICE)
  private QueryInvoiceV2FilteringDifferenceInvoice differenceInvoice = null;

  public static final String SERIALIZED_NAME_INVOICE_END_DATE = "invoice_end_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_END_DATE)
  private String invoiceEndDate = null;

  public static final String SERIALIZED_NAME_INVOICE_SERIAL_LIST = "invoice_serial_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_SERIAL_LIST)
  private List<String> invoiceSerialList = null;

  public static final String SERIALIZED_NAME_INVOICE_START_DATE = "invoice_start_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_START_DATE)
  private String invoiceStartDate = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUSES = "invoice_statuses";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUSES)
  private List<Long> invoiceStatuses = null;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoice_type";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private QueryInvoiceV2FilteringInvoiceType invoiceType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private QueryInvoiceV2FilteringPlatform platform = null;

  public static final String SERIALIZED_NAME_PROJECT_SERIALS = "project_serials";
  @SerializedName(SERIALIZED_NAME_PROJECT_SERIALS)
  private List<String> projectSerials = null;

  public static final String SERIALIZED_NAME_REVERT_STATUS_LIST = "revert_status_list";
  @SerializedName(SERIALIZED_NAME_REVERT_STATUS_LIST)
  private List<QueryInvoiceV2FilteringRevertStatusList> revertStatusList = null;

  public static final String SERIALIZED_NAME_STATEMENT_SERIALS = "statement_serials";
  @SerializedName(SERIALIZED_NAME_STATEMENT_SERIALS)
  private List<String> statementSerials = null;

  public static final String SERIALIZED_NAME_SUBMIT_END_TIME = "submit_end_time";
  @SerializedName(SERIALIZED_NAME_SUBMIT_END_TIME)
  private String submitEndTime = null;

  public static final String SERIALIZED_NAME_SUBMIT_START_TIME = "submit_start_time";
  @SerializedName(SERIALIZED_NAME_SUBMIT_START_TIME)
  private String submitStartTime = null;

  public QueryInvoiceV2Filtering() {
  }

  public QueryInvoiceV2Filtering contractSerial(String contractSerial) {
    
    this.contractSerial = contractSerial;
    return this;
  }

   /**
   * 合同编号
   * @return contractSerial
  **/
  @javax.annotation.Nullable
  public String getContractSerial() {
    return contractSerial;
  }


  public void setContractSerial(String contractSerial) {
    this.contractSerial = contractSerial;
  }


  public QueryInvoiceV2Filtering differenceInvoice(QueryInvoiceV2FilteringDifferenceInvoice differenceInvoice) {
    
    this.differenceInvoice = differenceInvoice;
    return this;
  }

   /**
   * Get differenceInvoice
   * @return differenceInvoice
  **/
  @javax.annotation.Nullable
  public QueryInvoiceV2FilteringDifferenceInvoice getDifferenceInvoice() {
    return differenceInvoice;
  }


  public void setDifferenceInvoice(QueryInvoiceV2FilteringDifferenceInvoice differenceInvoice) {
    this.differenceInvoice = differenceInvoice;
  }


  public QueryInvoiceV2Filtering invoiceEndDate(String invoiceEndDate) {
    
    this.invoiceEndDate = invoiceEndDate;
    return this;
  }

   /**
   * 实际开票时间范围结束时间，格式：%Y-%m-%d
   * @return invoiceEndDate
  **/
  @javax.annotation.Nullable
  public String getInvoiceEndDate() {
    return invoiceEndDate;
  }


  public void setInvoiceEndDate(String invoiceEndDate) {
    this.invoiceEndDate = invoiceEndDate;
  }


  public QueryInvoiceV2Filtering invoiceSerialList(List<String> invoiceSerialList) {
    
    this.invoiceSerialList = invoiceSerialList;
    return this;
  }

  public QueryInvoiceV2Filtering addInvoiceSerialListItem(String invoiceSerialListItem) {
    if (this.invoiceSerialList == null) {
      this.invoiceSerialList = new ArrayList<>();
    }
    this.invoiceSerialList.add(invoiceSerialListItem);
    return this;
  }

   /**
   * 开票单编号
   * @return invoiceSerialList
  **/
  @javax.annotation.Nullable
  public List<String> getInvoiceSerialList() {
    return invoiceSerialList;
  }


  public void setInvoiceSerialList(List<String> invoiceSerialList) {
    this.invoiceSerialList = invoiceSerialList;
  }


  public QueryInvoiceV2Filtering invoiceStartDate(String invoiceStartDate) {
    
    this.invoiceStartDate = invoiceStartDate;
    return this;
  }

   /**
   * 实际开票时间范围开始时间，格式：%Y-%m-%d
   * @return invoiceStartDate
  **/
  @javax.annotation.Nullable
  public String getInvoiceStartDate() {
    return invoiceStartDate;
  }


  public void setInvoiceStartDate(String invoiceStartDate) {
    this.invoiceStartDate = invoiceStartDate;
  }


  public QueryInvoiceV2Filtering invoiceStatuses(List<Long> invoiceStatuses) {
    
    this.invoiceStatuses = invoiceStatuses;
    return this;
  }

  public QueryInvoiceV2Filtering addInvoiceStatusesItem(Long invoiceStatusesItem) {
    if (this.invoiceStatuses == null) {
      this.invoiceStatuses = new ArrayList<>();
    }
    this.invoiceStatuses.add(invoiceStatusesItem);
    return this;
  }

   /**
   * 
   * @return invoiceStatuses
  **/
  @javax.annotation.Nullable
  public List<Long> getInvoiceStatuses() {
    return invoiceStatuses;
  }


  public void setInvoiceStatuses(List<Long> invoiceStatuses) {
    this.invoiceStatuses = invoiceStatuses;
  }


  public QueryInvoiceV2Filtering invoiceType(QueryInvoiceV2FilteringInvoiceType invoiceType) {
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * Get invoiceType
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  public QueryInvoiceV2FilteringInvoiceType getInvoiceType() {
    return invoiceType;
  }


  public void setInvoiceType(QueryInvoiceV2FilteringInvoiceType invoiceType) {
    this.invoiceType = invoiceType;
  }


  public QueryInvoiceV2Filtering platform(QueryInvoiceV2FilteringPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public QueryInvoiceV2FilteringPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(QueryInvoiceV2FilteringPlatform platform) {
    this.platform = platform;
  }


  public QueryInvoiceV2Filtering projectSerials(List<String> projectSerials) {
    
    this.projectSerials = projectSerials;
    return this;
  }

  public QueryInvoiceV2Filtering addProjectSerialsItem(String projectSerialsItem) {
    if (this.projectSerials == null) {
      this.projectSerials = new ArrayList<>();
    }
    this.projectSerials.add(projectSerialsItem);
    return this;
  }

   /**
   * 
   * @return projectSerials
  **/
  @javax.annotation.Nullable
  public List<String> getProjectSerials() {
    return projectSerials;
  }


  public void setProjectSerials(List<String> projectSerials) {
    this.projectSerials = projectSerials;
  }


  public QueryInvoiceV2Filtering revertStatusList(List<QueryInvoiceV2FilteringRevertStatusList> revertStatusList) {
    
    this.revertStatusList = revertStatusList;
    return this;
  }

  public QueryInvoiceV2Filtering addRevertStatusListItem(QueryInvoiceV2FilteringRevertStatusList revertStatusListItem) {
    if (this.revertStatusList == null) {
      this.revertStatusList = new ArrayList<>();
    }
    this.revertStatusList.add(revertStatusListItem);
    return this;
  }

   /**
   * 红冲状态
   * @return revertStatusList
  **/
  @javax.annotation.Nullable
  public List<QueryInvoiceV2FilteringRevertStatusList> getRevertStatusList() {
    return revertStatusList;
  }


  public void setRevertStatusList(List<QueryInvoiceV2FilteringRevertStatusList> revertStatusList) {
    this.revertStatusList = revertStatusList;
  }


  public QueryInvoiceV2Filtering statementSerials(List<String> statementSerials) {
    
    this.statementSerials = statementSerials;
    return this;
  }

  public QueryInvoiceV2Filtering addStatementSerialsItem(String statementSerialsItem) {
    if (this.statementSerials == null) {
      this.statementSerials = new ArrayList<>();
    }
    this.statementSerials.add(statementSerialsItem);
    return this;
  }

   /**
   * 
   * @return statementSerials
  **/
  @javax.annotation.Nullable
  public List<String> getStatementSerials() {
    return statementSerials;
  }


  public void setStatementSerials(List<String> statementSerials) {
    this.statementSerials = statementSerials;
  }


  public QueryInvoiceV2Filtering submitEndTime(String submitEndTime) {
    
    this.submitEndTime = submitEndTime;
    return this;
  }

   /**
   * 提交审批时间范围结束时间，格式：%Y-%m-%d %H:%M:%S
   * @return submitEndTime
  **/
  @javax.annotation.Nullable
  public String getSubmitEndTime() {
    return submitEndTime;
  }


  public void setSubmitEndTime(String submitEndTime) {
    this.submitEndTime = submitEndTime;
  }


  public QueryInvoiceV2Filtering submitStartTime(String submitStartTime) {
    
    this.submitStartTime = submitStartTime;
    return this;
  }

   /**
   * 提交审批时间范围开始时间，格式：%Y-%m-%d %H:%M:%S
   * @return submitStartTime
  **/
  @javax.annotation.Nullable
  public String getSubmitStartTime() {
    return submitStartTime;
  }


  public void setSubmitStartTime(String submitStartTime) {
    this.submitStartTime = submitStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceV2Filtering queryInvoiceV2Filtering = (QueryInvoiceV2Filtering) o;
    return Objects.equals(this.contractSerial, queryInvoiceV2Filtering.contractSerial) &&
        Objects.equals(this.differenceInvoice, queryInvoiceV2Filtering.differenceInvoice) &&
        Objects.equals(this.invoiceEndDate, queryInvoiceV2Filtering.invoiceEndDate) &&
        Objects.equals(this.invoiceSerialList, queryInvoiceV2Filtering.invoiceSerialList) &&
        Objects.equals(this.invoiceStartDate, queryInvoiceV2Filtering.invoiceStartDate) &&
        Objects.equals(this.invoiceStatuses, queryInvoiceV2Filtering.invoiceStatuses) &&
        Objects.equals(this.invoiceType, queryInvoiceV2Filtering.invoiceType) &&
        Objects.equals(this.platform, queryInvoiceV2Filtering.platform) &&
        Objects.equals(this.projectSerials, queryInvoiceV2Filtering.projectSerials) &&
        Objects.equals(this.revertStatusList, queryInvoiceV2Filtering.revertStatusList) &&
        Objects.equals(this.statementSerials, queryInvoiceV2Filtering.statementSerials) &&
        Objects.equals(this.submitEndTime, queryInvoiceV2Filtering.submitEndTime) &&
        Objects.equals(this.submitStartTime, queryInvoiceV2Filtering.submitStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractSerial, differenceInvoice, invoiceEndDate, invoiceSerialList, invoiceStartDate, invoiceStatuses, invoiceType, platform, projectSerials, revertStatusList, statementSerials, submitEndTime, submitStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryInvoiceV2Filtering {\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    differenceInvoice: ").append(toIndentedString(differenceInvoice)).append("\n");
    sb.append("    invoiceEndDate: ").append(toIndentedString(invoiceEndDate)).append("\n");
    sb.append("    invoiceSerialList: ").append(toIndentedString(invoiceSerialList)).append("\n");
    sb.append("    invoiceStartDate: ").append(toIndentedString(invoiceStartDate)).append("\n");
    sb.append("    invoiceStatuses: ").append(toIndentedString(invoiceStatuses)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    projectSerials: ").append(toIndentedString(projectSerials)).append("\n");
    sb.append("    revertStatusList: ").append(toIndentedString(revertStatusList)).append("\n");
    sb.append("    statementSerials: ").append(toIndentedString(statementSerials)).append("\n");
    sb.append("    submitEndTime: ").append(toIndentedString(submitEndTime)).append("\n");
    sb.append("    submitStartTime: ").append(toIndentedString(submitStartTime)).append("\n");
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
    openapiFields.add("contract_serial");
    openapiFields.add("difference_invoice");
    openapiFields.add("invoice_end_date");
    openapiFields.add("invoice_serial_list");
    openapiFields.add("invoice_start_date");
    openapiFields.add("invoice_statuses");
    openapiFields.add("invoice_type");
    openapiFields.add("platform");
    openapiFields.add("project_serials");
    openapiFields.add("revert_status_list");
    openapiFields.add("statement_serials");
    openapiFields.add("submit_end_time");
    openapiFields.add("submit_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceV2Filtering>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceV2Filtering
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceV2Filtering
  */
  public static QueryInvoiceV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceV2Filtering.class);
  }

 /**
  * Convert an instance of QueryInvoiceV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

