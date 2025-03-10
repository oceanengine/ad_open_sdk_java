/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner {
  public static final String SERIALIZED_NAME_ABANDONED_AMOUNT = "abandoned_amount";
  @SerializedName(SERIALIZED_NAME_ABANDONED_AMOUNT)
  private Double abandonedAmount = null;

  public static final String SERIALIZED_NAME_ACTUAL_INVOICE_AMOUNT = "actual_invoice_amount";
  @SerializedName(SERIALIZED_NAME_ACTUAL_INVOICE_AMOUNT)
  private Double actualInvoiceAmount = null;

  public static final String SERIALIZED_NAME_APPLY_AMOUNT = "apply_amount";
  @SerializedName(SERIALIZED_NAME_APPLY_AMOUNT)
  private Double applyAmount = null;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contract_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  private String contractName = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_CONTRACT_SUBJECT_NAME = "contract_subject_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SUBJECT_NAME)
  private String contractSubjectName = null;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName = null;

  public static final String SERIALIZED_NAME_CUSTOMER_SUBJECT_NAME = "customer_subject_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SUBJECT_NAME)
  private String customerSubjectName = null;

  public static final String SERIALIZED_NAME_DIFFERENCE_INVOICE_NAME = "difference_invoice_name";
  @SerializedName(SERIALIZED_NAME_DIFFERENCE_INVOICE_NAME)
  private String differenceInvoiceName = null;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private Double invoiceAmount = null;

  public static final String SERIALIZED_NAME_INVOICE_CODES = "invoice_codes";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODES)
  private List<String> invoiceCodes = null;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoice_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private Long invoiceId = null;

  public static final String SERIALIZED_NAME_INVOICE_NOS = "invoice_nos";
  @SerializedName(SERIALIZED_NAME_INVOICE_NOS)
  private List<String> invoiceNos = null;

  public static final String SERIALIZED_NAME_INVOICE_OBJECT_NAME = "invoice_object_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_OBJECT_NAME)
  private String invoiceObjectName = null;

  public static final String SERIALIZED_NAME_INVOICE_PROJECT_LIST = "invoice_project_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_PROJECT_LIST)
  private List<String> invoiceProjectList = null;

  public static final String SERIALIZED_NAME_INVOICE_SERIAL = "invoice_serial";
  @SerializedName(SERIALIZED_NAME_INVOICE_SERIAL)
  private String invoiceSerial = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoice_status";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private Long invoiceStatus = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS_NAME = "invoice_status_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS_NAME)
  private String invoiceStatusName = null;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoice_type";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private Long invoiceType = null;

  public static final String SERIALIZED_NAME_INVOICE_TYPE_NAME = "invoice_type_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE_NAME)
  private String invoiceTypeName = null;

  public static final String SERIALIZED_NAME_ISSUE_TIME = "issue_time";
  @SerializedName(SERIALIZED_NAME_ISSUE_TIME)
  private String issueTime = null;

  public static final String SERIALIZED_NAME_PLATFORM_NAME = "platform_name";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NAME)
  private String platformName = null;

  public static final String SERIALIZED_NAME_REVERT_AMOUNT = "revert_amount";
  @SerializedName(SERIALIZED_NAME_REVERT_AMOUNT)
  private Double revertAmount = null;

  public static final String SERIALIZED_NAME_REVERT_FROZEN_AMOUNT = "revert_frozen_amount";
  @SerializedName(SERIALIZED_NAME_REVERT_FROZEN_AMOUNT)
  private Double revertFrozenAmount = null;

  public static final String SERIALIZED_NAME_REVERT_STATUS = "revert_status";
  @SerializedName(SERIALIZED_NAME_REVERT_STATUS)
  private Long revertStatus = null;

  public static final String SERIALIZED_NAME_REVERT_STATUS_NAME = "revert_status_name";
  @SerializedName(SERIALIZED_NAME_REVERT_STATUS_NAME)
  private String revertStatusName = null;

  public static final String SERIALIZED_NAME_SUBMIT_TIME = "submit_time";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TIME)
  private String submitTime = null;

  public static final String SERIALIZED_NAME_SUBMITTER_NAME = "submitter_name";
  @SerializedName(SERIALIZED_NAME_SUBMITTER_NAME)
  private String submitterName = null;

  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner() {
  }

  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner abandonedAmount(Double abandonedAmount) {
    
    this.abandonedAmount = abandonedAmount;
    return this;
  }

   /**
   * 作废金额
   * @return abandonedAmount
  **/
  @javax.annotation.Nullable
  public Double getAbandonedAmount() {
    return abandonedAmount;
  }


  public void setAbandonedAmount(Double abandonedAmount) {
    this.abandonedAmount = abandonedAmount;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner actualInvoiceAmount(Double actualInvoiceAmount) {
    
    this.actualInvoiceAmount = actualInvoiceAmount;
    return this;
  }

   /**
   * 实际开票金额
   * @return actualInvoiceAmount
  **/
  @javax.annotation.Nullable
  public Double getActualInvoiceAmount() {
    return actualInvoiceAmount;
  }


  public void setActualInvoiceAmount(Double actualInvoiceAmount) {
    this.actualInvoiceAmount = actualInvoiceAmount;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner applyAmount(Double applyAmount) {
    
    this.applyAmount = applyAmount;
    return this;
  }

   /**
   * 开票申请金额
   * @return applyAmount
  **/
  @javax.annotation.Nullable
  public Double getApplyAmount() {
    return applyAmount;
  }


  public void setApplyAmount(Double applyAmount) {
    this.applyAmount = applyAmount;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner contractName(String contractName) {
    
    this.contractName = contractName;
    return this;
  }

   /**
   * 合同名称
   * @return contractName
  **/
  @javax.annotation.Nullable
  public String getContractName() {
    return contractName;
  }


  public void setContractName(String contractName) {
    this.contractName = contractName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner contractSerial(String contractSerial) {
    
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


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner contractSubjectName(String contractSubjectName) {
    
    this.contractSubjectName = contractSubjectName;
    return this;
  }

   /**
   * 签约主体
   * @return contractSubjectName
  **/
  @javax.annotation.Nullable
  public String getContractSubjectName() {
    return contractSubjectName;
  }


  public void setContractSubjectName(String contractSubjectName) {
    this.contractSubjectName = contractSubjectName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner customerId(Long customerId) {
    
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


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * 客户名称
   * @return customerName
  **/
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner customerSubjectName(String customerSubjectName) {
    
    this.customerSubjectName = customerSubjectName;
    return this;
  }

   /**
   * 开票客户名称
   * @return customerSubjectName
  **/
  @javax.annotation.Nullable
  public String getCustomerSubjectName() {
    return customerSubjectName;
  }


  public void setCustomerSubjectName(String customerSubjectName) {
    this.customerSubjectName = customerSubjectName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner differenceInvoiceName(String differenceInvoiceName) {
    
    this.differenceInvoiceName = differenceInvoiceName;
    return this;
  }

   /**
   * 是否差额开票
   * @return differenceInvoiceName
  **/
  @javax.annotation.Nullable
  public String getDifferenceInvoiceName() {
    return differenceInvoiceName;
  }


  public void setDifferenceInvoiceName(String differenceInvoiceName) {
    this.differenceInvoiceName = differenceInvoiceName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceAmount(Double invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 开票金额
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  public Double getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceCodes(List<String> invoiceCodes) {
    
    this.invoiceCodes = invoiceCodes;
    return this;
  }

  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner addInvoiceCodesItem(String invoiceCodesItem) {
    if (this.invoiceCodes == null) {
      this.invoiceCodes = new ArrayList<>();
    }
    this.invoiceCodes.add(invoiceCodesItem);
    return this;
  }

   /**
   * 发票代码
   * @return invoiceCodes
  **/
  @javax.annotation.Nullable
  public List<String> getInvoiceCodes() {
    return invoiceCodes;
  }


  public void setInvoiceCodes(List<String> invoiceCodes) {
    this.invoiceCodes = invoiceCodes;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceId(Long invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * 开票单ID
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  public Long getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceNos(List<String> invoiceNos) {
    
    this.invoiceNos = invoiceNos;
    return this;
  }

  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner addInvoiceNosItem(String invoiceNosItem) {
    if (this.invoiceNos == null) {
      this.invoiceNos = new ArrayList<>();
    }
    this.invoiceNos.add(invoiceNosItem);
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNos
  **/
  @javax.annotation.Nullable
  public List<String> getInvoiceNos() {
    return invoiceNos;
  }


  public void setInvoiceNos(List<String> invoiceNos) {
    this.invoiceNos = invoiceNos;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceObjectName(String invoiceObjectName) {
    
    this.invoiceObjectName = invoiceObjectName;
    return this;
  }

   /**
   * 开票类型名称
   * @return invoiceObjectName
  **/
  @javax.annotation.Nullable
  public String getInvoiceObjectName() {
    return invoiceObjectName;
  }


  public void setInvoiceObjectName(String invoiceObjectName) {
    this.invoiceObjectName = invoiceObjectName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceProjectList(List<String> invoiceProjectList) {
    
    this.invoiceProjectList = invoiceProjectList;
    return this;
  }

  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner addInvoiceProjectListItem(String invoiceProjectListItem) {
    if (this.invoiceProjectList == null) {
      this.invoiceProjectList = new ArrayList<>();
    }
    this.invoiceProjectList.add(invoiceProjectListItem);
    return this;
  }

   /**
   * 开票项目名称
   * @return invoiceProjectList
  **/
  @javax.annotation.Nullable
  public List<String> getInvoiceProjectList() {
    return invoiceProjectList;
  }


  public void setInvoiceProjectList(List<String> invoiceProjectList) {
    this.invoiceProjectList = invoiceProjectList;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceSerial(String invoiceSerial) {
    
    this.invoiceSerial = invoiceSerial;
    return this;
  }

   /**
   * 开票单编号
   * @return invoiceSerial
  **/
  @javax.annotation.Nullable
  public String getInvoiceSerial() {
    return invoiceSerial;
  }


  public void setInvoiceSerial(String invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceStatus(Long invoiceStatus) {
    
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * 开票状态 CANCELLED(0, \&quot;已作废\&quot;),NO_INVOICED(1, \&quot;未开票\&quot;),PART_INVOICED(2, \&quot;部分开票\&quot;),INVOICED(3, \&quot;已开票\&quot;),NO_NEED_INVOICE(4, \&quot;无需开票\&quot;);
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  public Long getInvoiceStatus() {
    return invoiceStatus;
  }


  public void setInvoiceStatus(Long invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceStatusName(String invoiceStatusName) {
    
    this.invoiceStatusName = invoiceStatusName;
    return this;
  }

   /**
   * 开票状态名称
   * @return invoiceStatusName
  **/
  @javax.annotation.Nullable
  public String getInvoiceStatusName() {
    return invoiceStatusName;
  }


  public void setInvoiceStatusName(String invoiceStatusName) {
    this.invoiceStatusName = invoiceStatusName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceType(Long invoiceType) {
    
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * 发票类型
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  public Long getInvoiceType() {
    return invoiceType;
  }


  public void setInvoiceType(Long invoiceType) {
    this.invoiceType = invoiceType;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner invoiceTypeName(String invoiceTypeName) {
    
    this.invoiceTypeName = invoiceTypeName;
    return this;
  }

   /**
   * 发票类型名称
   * @return invoiceTypeName
  **/
  @javax.annotation.Nullable
  public String getInvoiceTypeName() {
    return invoiceTypeName;
  }


  public void setInvoiceTypeName(String invoiceTypeName) {
    this.invoiceTypeName = invoiceTypeName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner issueTime(String issueTime) {
    
    this.issueTime = issueTime;
    return this;
  }

   /**
   * 发票开具时间 yyyy-MM-dd HH:mm:ss
   * @return issueTime
  **/
  @javax.annotation.Nullable
  public String getIssueTime() {
    return issueTime;
  }


  public void setIssueTime(String issueTime) {
    this.issueTime = issueTime;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner platformName(String platformName) {
    
    this.platformName = platformName;
    return this;
  }

   /**
   * 业务线
   * @return platformName
  **/
  @javax.annotation.Nullable
  public String getPlatformName() {
    return platformName;
  }


  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner revertAmount(Double revertAmount) {
    
    this.revertAmount = revertAmount;
    return this;
  }

   /**
   * 红冲金额
   * @return revertAmount
  **/
  @javax.annotation.Nullable
  public Double getRevertAmount() {
    return revertAmount;
  }


  public void setRevertAmount(Double revertAmount) {
    this.revertAmount = revertAmount;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner revertFrozenAmount(Double revertFrozenAmount) {
    
    this.revertFrozenAmount = revertFrozenAmount;
    return this;
  }

   /**
   * 红冲冻结金额
   * @return revertFrozenAmount
  **/
  @javax.annotation.Nullable
  public Double getRevertFrozenAmount() {
    return revertFrozenAmount;
  }


  public void setRevertFrozenAmount(Double revertFrozenAmount) {
    this.revertFrozenAmount = revertFrozenAmount;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner revertStatus(Long revertStatus) {
    
    this.revertStatus = revertStatus;
    return this;
  }

   /**
   * 红冲状态  NORMAL(1, \&quot;未红冲\&quot;),REVERTED(2, \&quot;全额红冲\&quot;),RED(3, \&quot;红票\&quot;),PART_REVERTED(4, \&quot;部分红冲\&quot;);
   * @return revertStatus
  **/
  @javax.annotation.Nullable
  public Long getRevertStatus() {
    return revertStatus;
  }


  public void setRevertStatus(Long revertStatus) {
    this.revertStatus = revertStatus;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner revertStatusName(String revertStatusName) {
    
    this.revertStatusName = revertStatusName;
    return this;
  }

   /**
   * 红冲状态名称
   * @return revertStatusName
  **/
  @javax.annotation.Nullable
  public String getRevertStatusName() {
    return revertStatusName;
  }


  public void setRevertStatusName(String revertStatusName) {
    this.revertStatusName = revertStatusName;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner submitTime(String submitTime) {
    
    this.submitTime = submitTime;
    return this;
  }

   /**
   * 提交时间 yyyy-MM-dd HH:mm:ss
   * @return submitTime
  **/
  @javax.annotation.Nullable
  public String getSubmitTime() {
    return submitTime;
  }


  public void setSubmitTime(String submitTime) {
    this.submitTime = submitTime;
  }


  public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner submitterName(String submitterName) {
    
    this.submitterName = submitterName;
    return this;
  }

   /**
   * 提交人名称
   * @return submitterName
  **/
  @javax.annotation.Nullable
  public String getSubmitterName() {
    return submitterName;
  }


  public void setSubmitterName(String submitterName) {
    this.submitterName = submitterName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner queryInvoiceSelfV2ResponseDataInvoiceInfoListInner = (QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner) o;
    return Objects.equals(this.abandonedAmount, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.abandonedAmount) &&
        Objects.equals(this.actualInvoiceAmount, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.actualInvoiceAmount) &&
        Objects.equals(this.applyAmount, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.applyAmount) &&
        Objects.equals(this.contractName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.contractName) &&
        Objects.equals(this.contractSerial, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.contractSerial) &&
        Objects.equals(this.contractSubjectName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.contractSubjectName) &&
        Objects.equals(this.customerId, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.customerId) &&
        Objects.equals(this.customerName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.customerName) &&
        Objects.equals(this.customerSubjectName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.customerSubjectName) &&
        Objects.equals(this.differenceInvoiceName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.differenceInvoiceName) &&
        Objects.equals(this.invoiceAmount, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceAmount) &&
        Objects.equals(this.invoiceCodes, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceCodes) &&
        Objects.equals(this.invoiceId, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceId) &&
        Objects.equals(this.invoiceNos, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceNos) &&
        Objects.equals(this.invoiceObjectName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceObjectName) &&
        Objects.equals(this.invoiceProjectList, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceProjectList) &&
        Objects.equals(this.invoiceSerial, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceSerial) &&
        Objects.equals(this.invoiceStatus, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceStatus) &&
        Objects.equals(this.invoiceStatusName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceStatusName) &&
        Objects.equals(this.invoiceType, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceType) &&
        Objects.equals(this.invoiceTypeName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.invoiceTypeName) &&
        Objects.equals(this.issueTime, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.issueTime) &&
        Objects.equals(this.platformName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.platformName) &&
        Objects.equals(this.revertAmount, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.revertAmount) &&
        Objects.equals(this.revertFrozenAmount, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.revertFrozenAmount) &&
        Objects.equals(this.revertStatus, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.revertStatus) &&
        Objects.equals(this.revertStatusName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.revertStatusName) &&
        Objects.equals(this.submitTime, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.submitTime) &&
        Objects.equals(this.submitterName, queryInvoiceSelfV2ResponseDataInvoiceInfoListInner.submitterName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonedAmount, actualInvoiceAmount, applyAmount, contractName, contractSerial, contractSubjectName, customerId, customerName, customerSubjectName, differenceInvoiceName, invoiceAmount, invoiceCodes, invoiceId, invoiceNos, invoiceObjectName, invoiceProjectList, invoiceSerial, invoiceStatus, invoiceStatusName, invoiceType, invoiceTypeName, issueTime, platformName, revertAmount, revertFrozenAmount, revertStatus, revertStatusName, submitTime, submitterName);
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
    sb.append("class QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner {\n");
    sb.append("    abandonedAmount: ").append(toIndentedString(abandonedAmount)).append("\n");
    sb.append("    actualInvoiceAmount: ").append(toIndentedString(actualInvoiceAmount)).append("\n");
    sb.append("    applyAmount: ").append(toIndentedString(applyAmount)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    contractSubjectName: ").append(toIndentedString(contractSubjectName)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerSubjectName: ").append(toIndentedString(customerSubjectName)).append("\n");
    sb.append("    differenceInvoiceName: ").append(toIndentedString(differenceInvoiceName)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    invoiceCodes: ").append(toIndentedString(invoiceCodes)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceNos: ").append(toIndentedString(invoiceNos)).append("\n");
    sb.append("    invoiceObjectName: ").append(toIndentedString(invoiceObjectName)).append("\n");
    sb.append("    invoiceProjectList: ").append(toIndentedString(invoiceProjectList)).append("\n");
    sb.append("    invoiceSerial: ").append(toIndentedString(invoiceSerial)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    invoiceStatusName: ").append(toIndentedString(invoiceStatusName)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    invoiceTypeName: ").append(toIndentedString(invoiceTypeName)).append("\n");
    sb.append("    issueTime: ").append(toIndentedString(issueTime)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    revertAmount: ").append(toIndentedString(revertAmount)).append("\n");
    sb.append("    revertFrozenAmount: ").append(toIndentedString(revertFrozenAmount)).append("\n");
    sb.append("    revertStatus: ").append(toIndentedString(revertStatus)).append("\n");
    sb.append("    revertStatusName: ").append(toIndentedString(revertStatusName)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    submitterName: ").append(toIndentedString(submitterName)).append("\n");
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
    openapiFields.add("abandoned_amount");
    openapiFields.add("actual_invoice_amount");
    openapiFields.add("apply_amount");
    openapiFields.add("contract_name");
    openapiFields.add("contract_serial");
    openapiFields.add("contract_subject_name");
    openapiFields.add("customer_id");
    openapiFields.add("customer_name");
    openapiFields.add("customer_subject_name");
    openapiFields.add("difference_invoice_name");
    openapiFields.add("invoice_amount");
    openapiFields.add("invoice_codes");
    openapiFields.add("invoice_id");
    openapiFields.add("invoice_nos");
    openapiFields.add("invoice_object_name");
    openapiFields.add("invoice_project_list");
    openapiFields.add("invoice_serial");
    openapiFields.add("invoice_status");
    openapiFields.add("invoice_status_name");
    openapiFields.add("invoice_type");
    openapiFields.add("invoice_type_name");
    openapiFields.add("issue_time");
    openapiFields.add("platform_name");
    openapiFields.add("revert_amount");
    openapiFields.add("revert_frozen_amount");
    openapiFields.add("revert_status");
    openapiFields.add("revert_status_name");
    openapiFields.add("submit_time");
    openapiFields.add("submitter_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoice_id");
    openapiRequiredFields.add("invoice_serial");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner
  */
  public static QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner.class);
  }

 /**
  * Convert an instance of QueryInvoiceSelfV2ResponseDataInvoiceInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

