/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringApprovalStatus;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringArchiveStatusList;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringInvoiceStatusList;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringMonthQuarter;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringPlatforms;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringStampStatusList;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringStampType;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringStandard;
import com.bytedance.ads.model.QueryRebateBalanceV2FilteringUseType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class QueryRebateBalanceV2Filtering {
  public static final String SERIALIZED_NAME_APPROVAL_STATUS = "approval_status";
  @SerializedName(SERIALIZED_NAME_APPROVAL_STATUS)
  private QueryRebateBalanceV2FilteringApprovalStatus approvalStatus = null;

  public static final String SERIALIZED_NAME_ARCHIVE_STATUS_LIST = "archive_status_list";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_STATUS_LIST)
  private List<QueryRebateBalanceV2FilteringArchiveStatusList> archiveStatusList = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_CREATE_END_DATE = "create_end_date";
  @SerializedName(SERIALIZED_NAME_CREATE_END_DATE)
  private String createEndDate = null;

  public static final String SERIALIZED_NAME_CREATE_START_DATE = "create_start_date";
  @SerializedName(SERIALIZED_NAME_CREATE_START_DATE)
  private String createStartDate = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS_LIST = "invoice_status_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS_LIST)
  private List<QueryRebateBalanceV2FilteringInvoiceStatusList> invoiceStatusList = null;

  public static final String SERIALIZED_NAME_MONTH_QUARTER = "month_quarter";
  @SerializedName(SERIALIZED_NAME_MONTH_QUARTER)
  private QueryRebateBalanceV2FilteringMonthQuarter monthQuarter = null;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private List<QueryRebateBalanceV2FilteringPlatforms> platforms = null;

  public static final String SERIALIZED_NAME_REBATE_BALANCE_SERIAL = "rebate_balance_serial";
  @SerializedName(SERIALIZED_NAME_REBATE_BALANCE_SERIAL)
  private String rebateBalanceSerial = null;

  public static final String SERIALIZED_NAME_STAMP_STATUS_LIST = "stamp_status_list";
  @SerializedName(SERIALIZED_NAME_STAMP_STATUS_LIST)
  private List<QueryRebateBalanceV2FilteringStampStatusList> stampStatusList = null;

  public static final String SERIALIZED_NAME_STAMP_TYPE = "stamp_type";
  @SerializedName(SERIALIZED_NAME_STAMP_TYPE)
  private QueryRebateBalanceV2FilteringStampType stampType = null;

  public static final String SERIALIZED_NAME_STANDARD = "standard";
  @SerializedName(SERIALIZED_NAME_STANDARD)
  private QueryRebateBalanceV2FilteringStandard standard = null;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private QueryRebateBalanceV2FilteringUseType useType = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year = null;

  public QueryRebateBalanceV2Filtering() {
  }

  public QueryRebateBalanceV2Filtering approvalStatus(QueryRebateBalanceV2FilteringApprovalStatus approvalStatus) {
    
    this.approvalStatus = approvalStatus;
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  public QueryRebateBalanceV2FilteringApprovalStatus getApprovalStatus() {
    return approvalStatus;
  }


  public void setApprovalStatus(QueryRebateBalanceV2FilteringApprovalStatus approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public QueryRebateBalanceV2Filtering archiveStatusList(List<QueryRebateBalanceV2FilteringArchiveStatusList> archiveStatusList) {
    
    this.archiveStatusList = archiveStatusList;
    return this;
  }

  public QueryRebateBalanceV2Filtering addArchiveStatusListItem(QueryRebateBalanceV2FilteringArchiveStatusList archiveStatusListItem) {
    if (this.archiveStatusList == null) {
      this.archiveStatusList = new ArrayList<>();
    }
    this.archiveStatusList.add(archiveStatusListItem);
    return this;
  }

   /**
   * 回收状态 （1：未回收，2：已回收，3：已归档）
   * @return archiveStatusList
  **/
  @javax.annotation.Nullable
  public List<QueryRebateBalanceV2FilteringArchiveStatusList> getArchiveStatusList() {
    return archiveStatusList;
  }


  public void setArchiveStatusList(List<QueryRebateBalanceV2FilteringArchiveStatusList> archiveStatusList) {
    this.archiveStatusList = archiveStatusList;
  }


  public QueryRebateBalanceV2Filtering contractSerial(String contractSerial) {
    
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


  public QueryRebateBalanceV2Filtering createEndDate(String createEndDate) {
    
    this.createEndDate = createEndDate;
    return this;
  }

   /**
   * 创建时间范围结束时间
   * @return createEndDate
  **/
  @javax.annotation.Nullable
  public String getCreateEndDate() {
    return createEndDate;
  }


  public void setCreateEndDate(String createEndDate) {
    this.createEndDate = createEndDate;
  }


  public QueryRebateBalanceV2Filtering createStartDate(String createStartDate) {
    
    this.createStartDate = createStartDate;
    return this;
  }

   /**
   * 创建时间范围开始时间
   * @return createStartDate
  **/
  @javax.annotation.Nullable
  public String getCreateStartDate() {
    return createStartDate;
  }


  public void setCreateStartDate(String createStartDate) {
    this.createStartDate = createStartDate;
  }


  public QueryRebateBalanceV2Filtering invoiceStatusList(List<QueryRebateBalanceV2FilteringInvoiceStatusList> invoiceStatusList) {
    
    this.invoiceStatusList = invoiceStatusList;
    return this;
  }

  public QueryRebateBalanceV2Filtering addInvoiceStatusListItem(QueryRebateBalanceV2FilteringInvoiceStatusList invoiceStatusListItem) {
    if (this.invoiceStatusList == null) {
      this.invoiceStatusList = new ArrayList<>();
    }
    this.invoiceStatusList.add(invoiceStatusListItem);
    return this;
  }

   /**
   * 开票状态 （1：未开票，2：部分开票，3：已开票）
   * @return invoiceStatusList
  **/
  @javax.annotation.Nullable
  public List<QueryRebateBalanceV2FilteringInvoiceStatusList> getInvoiceStatusList() {
    return invoiceStatusList;
  }


  public void setInvoiceStatusList(List<QueryRebateBalanceV2FilteringInvoiceStatusList> invoiceStatusList) {
    this.invoiceStatusList = invoiceStatusList;
  }


  public QueryRebateBalanceV2Filtering monthQuarter(QueryRebateBalanceV2FilteringMonthQuarter monthQuarter) {
    
    this.monthQuarter = monthQuarter;
    return this;
  }

   /**
   * Get monthQuarter
   * @return monthQuarter
  **/
  @javax.annotation.Nullable
  public QueryRebateBalanceV2FilteringMonthQuarter getMonthQuarter() {
    return monthQuarter;
  }


  public void setMonthQuarter(QueryRebateBalanceV2FilteringMonthQuarter monthQuarter) {
    this.monthQuarter = monthQuarter;
  }


  public QueryRebateBalanceV2Filtering platforms(List<QueryRebateBalanceV2FilteringPlatforms> platforms) {
    
    this.platforms = platforms;
    return this;
  }

  public QueryRebateBalanceV2Filtering addPlatformsItem(QueryRebateBalanceV2FilteringPlatforms platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

   /**
   * 
   * @return platforms
  **/
  @javax.annotation.Nullable
  public List<QueryRebateBalanceV2FilteringPlatforms> getPlatforms() {
    return platforms;
  }


  public void setPlatforms(List<QueryRebateBalanceV2FilteringPlatforms> platforms) {
    this.platforms = platforms;
  }


  public QueryRebateBalanceV2Filtering rebateBalanceSerial(String rebateBalanceSerial) {
    
    this.rebateBalanceSerial = rebateBalanceSerial;
    return this;
  }

   /**
   * 返点流水编号 （与平台披露编号一致，建议使用）
   * @return rebateBalanceSerial
  **/
  @javax.annotation.Nullable
  public String getRebateBalanceSerial() {
    return rebateBalanceSerial;
  }


  public void setRebateBalanceSerial(String rebateBalanceSerial) {
    this.rebateBalanceSerial = rebateBalanceSerial;
  }


  public QueryRebateBalanceV2Filtering stampStatusList(List<QueryRebateBalanceV2FilteringStampStatusList> stampStatusList) {
    
    this.stampStatusList = stampStatusList;
    return this;
  }

  public QueryRebateBalanceV2Filtering addStampStatusListItem(QueryRebateBalanceV2FilteringStampStatusList stampStatusListItem) {
    if (this.stampStatusList == null) {
      this.stampStatusList = new ArrayList<>();
    }
    this.stampStatusList.add(stampStatusListItem);
    return this;
  }

   /**
   * 盖章状态 （1：未盖章，2：审批中，3：已盖章）
   * @return stampStatusList
  **/
  @javax.annotation.Nullable
  public List<QueryRebateBalanceV2FilteringStampStatusList> getStampStatusList() {
    return stampStatusList;
  }


  public void setStampStatusList(List<QueryRebateBalanceV2FilteringStampStatusList> stampStatusList) {
    this.stampStatusList = stampStatusList;
  }


  public QueryRebateBalanceV2Filtering stampType(QueryRebateBalanceV2FilteringStampType stampType) {
    
    this.stampType = stampType;
    return this;
  }

   /**
   * Get stampType
   * @return stampType
  **/
  @javax.annotation.Nullable
  public QueryRebateBalanceV2FilteringStampType getStampType() {
    return stampType;
  }


  public void setStampType(QueryRebateBalanceV2FilteringStampType stampType) {
    this.stampType = stampType;
  }


  public QueryRebateBalanceV2Filtering standard(QueryRebateBalanceV2FilteringStandard standard) {
    
    this.standard = standard;
    return this;
  }

   /**
   * Get standard
   * @return standard
  **/
  @javax.annotation.Nullable
  public QueryRebateBalanceV2FilteringStandard getStandard() {
    return standard;
  }


  public void setStandard(QueryRebateBalanceV2FilteringStandard standard) {
    this.standard = standard;
  }


  public QueryRebateBalanceV2Filtering useType(QueryRebateBalanceV2FilteringUseType useType) {
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  public QueryRebateBalanceV2FilteringUseType getUseType() {
    return useType;
  }


  public void setUseType(QueryRebateBalanceV2FilteringUseType useType) {
    this.useType = useType;
  }


  public QueryRebateBalanceV2Filtering year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * 结算周期年
   * @return year
  **/
  @javax.annotation.Nullable
  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRebateBalanceV2Filtering queryRebateBalanceV2Filtering = (QueryRebateBalanceV2Filtering) o;
    return Objects.equals(this.approvalStatus, queryRebateBalanceV2Filtering.approvalStatus) &&
        Objects.equals(this.archiveStatusList, queryRebateBalanceV2Filtering.archiveStatusList) &&
        Objects.equals(this.contractSerial, queryRebateBalanceV2Filtering.contractSerial) &&
        Objects.equals(this.createEndDate, queryRebateBalanceV2Filtering.createEndDate) &&
        Objects.equals(this.createStartDate, queryRebateBalanceV2Filtering.createStartDate) &&
        Objects.equals(this.invoiceStatusList, queryRebateBalanceV2Filtering.invoiceStatusList) &&
        Objects.equals(this.monthQuarter, queryRebateBalanceV2Filtering.monthQuarter) &&
        Objects.equals(this.platforms, queryRebateBalanceV2Filtering.platforms) &&
        Objects.equals(this.rebateBalanceSerial, queryRebateBalanceV2Filtering.rebateBalanceSerial) &&
        Objects.equals(this.stampStatusList, queryRebateBalanceV2Filtering.stampStatusList) &&
        Objects.equals(this.stampType, queryRebateBalanceV2Filtering.stampType) &&
        Objects.equals(this.standard, queryRebateBalanceV2Filtering.standard) &&
        Objects.equals(this.useType, queryRebateBalanceV2Filtering.useType) &&
        Objects.equals(this.year, queryRebateBalanceV2Filtering.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalStatus, archiveStatusList, contractSerial, createEndDate, createStartDate, invoiceStatusList, monthQuarter, platforms, rebateBalanceSerial, stampStatusList, stampType, standard, useType, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRebateBalanceV2Filtering {\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    archiveStatusList: ").append(toIndentedString(archiveStatusList)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    createEndDate: ").append(toIndentedString(createEndDate)).append("\n");
    sb.append("    createStartDate: ").append(toIndentedString(createStartDate)).append("\n");
    sb.append("    invoiceStatusList: ").append(toIndentedString(invoiceStatusList)).append("\n");
    sb.append("    monthQuarter: ").append(toIndentedString(monthQuarter)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    rebateBalanceSerial: ").append(toIndentedString(rebateBalanceSerial)).append("\n");
    sb.append("    stampStatusList: ").append(toIndentedString(stampStatusList)).append("\n");
    sb.append("    stampType: ").append(toIndentedString(stampType)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("approval_status");
    openapiFields.add("archive_status_list");
    openapiFields.add("contract_serial");
    openapiFields.add("create_end_date");
    openapiFields.add("create_start_date");
    openapiFields.add("invoice_status_list");
    openapiFields.add("month_quarter");
    openapiFields.add("platforms");
    openapiFields.add("rebate_balance_serial");
    openapiFields.add("stamp_status_list");
    openapiFields.add("stamp_type");
    openapiFields.add("standard");
    openapiFields.add("use_type");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryRebateBalanceV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryRebateBalanceV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryRebateBalanceV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryRebateBalanceV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryRebateBalanceV2Filtering>() {
           @Override
           public void write(JsonWriter out, QueryRebateBalanceV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryRebateBalanceV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryRebateBalanceV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryRebateBalanceV2Filtering
  * @throws IOException if the JSON string is invalid with respect to QueryRebateBalanceV2Filtering
  */
  public static QueryRebateBalanceV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryRebateBalanceV2Filtering.class);
  }

 /**
  * Convert an instance of QueryRebateBalanceV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

