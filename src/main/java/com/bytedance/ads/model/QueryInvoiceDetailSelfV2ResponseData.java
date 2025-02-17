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
import com.bytedance.ads.model.QueryInvoiceDetailSelfV2ResponseDataBillProjectInfoListInner;
import com.bytedance.ads.model.QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo;
import com.bytedance.ads.model.QueryInvoiceDetailSelfV2ResponseDataElectronicReceiveInfo;
import com.bytedance.ads.model.QueryInvoiceDetailSelfV2ResponseDataPaperReceiveInfo;
import com.bytedance.ads.model.QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QueryInvoiceDetailSelfV2ResponseData {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_APPLY_AMOUNT = "apply_amount";
  @SerializedName(SERIALIZED_NAME_APPLY_AMOUNT)
  private Double applyAmount = null;

  public static final String SERIALIZED_NAME_APPROVAL_STATUS_NAME = "approval_status_name";
  @SerializedName(SERIALIZED_NAME_APPROVAL_STATUS_NAME)
  private String approvalStatusName = null;

  public static final String SERIALIZED_NAME_BILL_PROJECT_INFO_LIST = "bill_project_info_list";
  @SerializedName(SERIALIZED_NAME_BILL_PROJECT_INFO_LIST)
  private List<QueryInvoiceDetailSelfV2ResponseDataBillProjectInfoListInner> billProjectInfoList = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_CONTRACT_SUBJECT_NAME = "contract_subject_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SUBJECT_NAME)
  private String contractSubjectName = null;

  public static final String SERIALIZED_NAME_CUS_QUALIFICATION_INFO = "cus_qualification_info";
  @SerializedName(SERIALIZED_NAME_CUS_QUALIFICATION_INFO)
  private QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo cusQualificationInfo = null;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private Long customerId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName = null;

  public static final String SERIALIZED_NAME_ELECTRONIC_RECEIVE_INFO = "electronic_receive_info";
  @SerializedName(SERIALIZED_NAME_ELECTRONIC_RECEIVE_INFO)
  private QueryInvoiceDetailSelfV2ResponseDataElectronicReceiveInfo electronicReceiveInfo = null;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason = null;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private Double invoiceAmount = null;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoice_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private Long invoiceId = null;

  public static final String SERIALIZED_NAME_INVOICE_OBJECT_NAME = "invoice_object_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_OBJECT_NAME)
  private String invoiceObjectName = null;

  public static final String SERIALIZED_NAME_INVOICE_SERIAL = "invoice_serial";
  @SerializedName(SERIALIZED_NAME_INVOICE_SERIAL)
  private String invoiceSerial = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS_NAME = "invoice_status_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS_NAME)
  private String invoiceStatusName = null;

  public static final String SERIALIZED_NAME_INVOICE_TYPE_NAME = "invoice_type_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE_NAME)
  private String invoiceTypeName = null;

  public static final String SERIALIZED_NAME_ORG_INVOICE_ID = "org_invoice_id";
  @SerializedName(SERIALIZED_NAME_ORG_INVOICE_ID)
  private Long orgInvoiceId = null;

  public static final String SERIALIZED_NAME_PAPER_RECEIVE_INFO = "paper_receive_info";
  @SerializedName(SERIALIZED_NAME_PAPER_RECEIVE_INFO)
  private QueryInvoiceDetailSelfV2ResponseDataPaperReceiveInfo paperReceiveInfo = null;

  public static final String SERIALIZED_NAME_PAPER_SEND_INFO = "paper_send_info";
  @SerializedName(SERIALIZED_NAME_PAPER_SEND_INFO)
  private QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo paperSendInfo = null;

  public static final String SERIALIZED_NAME_PLATFORM_NAME = "platform_name";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NAME)
  private String platformName = null;

  public static final String SERIALIZED_NAME_REVERT_AMOUNT = "revert_amount";
  @SerializedName(SERIALIZED_NAME_REVERT_AMOUNT)
  private Double revertAmount = null;

  public static final String SERIALIZED_NAME_REVERT_FROZEN_AMOUNT = "revert_frozen_amount";
  @SerializedName(SERIALIZED_NAME_REVERT_FROZEN_AMOUNT)
  private Double revertFrozenAmount = null;

  public static final String SERIALIZED_NAME_REVERT_STATUS_NAME = "revert_status_name";
  @SerializedName(SERIALIZED_NAME_REVERT_STATUS_NAME)
  private String revertStatusName = null;

  public static final String SERIALIZED_NAME_SEND_STATUS_NAME = "send_status_name";
  @SerializedName(SERIALIZED_NAME_SEND_STATUS_NAME)
  private String sendStatusName = null;

  public static final String SERIALIZED_NAME_UNPRINTABLE_REMARK = "unprintable_remark";
  @SerializedName(SERIALIZED_NAME_UNPRINTABLE_REMARK)
  private String unprintableRemark = null;

  public QueryInvoiceDetailSelfV2ResponseData() {
  }

  public QueryInvoiceDetailSelfV2ResponseData accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户Id
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public QueryInvoiceDetailSelfV2ResponseData applyAmount(Double applyAmount) {
    
    this.applyAmount = applyAmount;
    return this;
  }

   /**
   * 申请开票金额
   * @return applyAmount
  **/
  @javax.annotation.Nullable
  public Double getApplyAmount() {
    return applyAmount;
  }


  public void setApplyAmount(Double applyAmount) {
    this.applyAmount = applyAmount;
  }


  public QueryInvoiceDetailSelfV2ResponseData approvalStatusName(String approvalStatusName) {
    
    this.approvalStatusName = approvalStatusName;
    return this;
  }

   /**
   * 审批状态
   * @return approvalStatusName
  **/
  @javax.annotation.Nullable
  public String getApprovalStatusName() {
    return approvalStatusName;
  }


  public void setApprovalStatusName(String approvalStatusName) {
    this.approvalStatusName = approvalStatusName;
  }


  public QueryInvoiceDetailSelfV2ResponseData billProjectInfoList(List<QueryInvoiceDetailSelfV2ResponseDataBillProjectInfoListInner> billProjectInfoList) {
    
    this.billProjectInfoList = billProjectInfoList;
    return this;
  }

  public QueryInvoiceDetailSelfV2ResponseData addBillProjectInfoListItem(QueryInvoiceDetailSelfV2ResponseDataBillProjectInfoListInner billProjectInfoListItem) {
    if (this.billProjectInfoList == null) {
      this.billProjectInfoList = new ArrayList<>();
    }
    this.billProjectInfoList.add(billProjectInfoListItem);
    return this;
  }

   /**
   * 发票小票明细
   * @return billProjectInfoList
  **/
  @javax.annotation.Nullable
  public List<QueryInvoiceDetailSelfV2ResponseDataBillProjectInfoListInner> getBillProjectInfoList() {
    return billProjectInfoList;
  }


  public void setBillProjectInfoList(List<QueryInvoiceDetailSelfV2ResponseDataBillProjectInfoListInner> billProjectInfoList) {
    this.billProjectInfoList = billProjectInfoList;
  }


  public QueryInvoiceDetailSelfV2ResponseData contractSerial(String contractSerial) {
    
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


  public QueryInvoiceDetailSelfV2ResponseData contractSubjectName(String contractSubjectName) {
    
    this.contractSubjectName = contractSubjectName;
    return this;
  }

   /**
   * 我方开票主体名称
   * @return contractSubjectName
  **/
  @javax.annotation.Nullable
  public String getContractSubjectName() {
    return contractSubjectName;
  }


  public void setContractSubjectName(String contractSubjectName) {
    this.contractSubjectName = contractSubjectName;
  }


  public QueryInvoiceDetailSelfV2ResponseData cusQualificationInfo(QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo cusQualificationInfo) {
    
    this.cusQualificationInfo = cusQualificationInfo;
    return this;
  }

   /**
   * Get cusQualificationInfo
   * @return cusQualificationInfo
  **/
  @javax.annotation.Nullable
  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo getCusQualificationInfo() {
    return cusQualificationInfo;
  }


  public void setCusQualificationInfo(QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo cusQualificationInfo) {
    this.cusQualificationInfo = cusQualificationInfo;
  }


  public QueryInvoiceDetailSelfV2ResponseData customerId(Long customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * 客户Id
   * @return customerId
  **/
  @javax.annotation.Nullable
  public Long getCustomerId() {
    return customerId;
  }


  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }


  public QueryInvoiceDetailSelfV2ResponseData customerName(String customerName) {
    
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


  public QueryInvoiceDetailSelfV2ResponseData electronicReceiveInfo(QueryInvoiceDetailSelfV2ResponseDataElectronicReceiveInfo electronicReceiveInfo) {
    
    this.electronicReceiveInfo = electronicReceiveInfo;
    return this;
  }

   /**
   * Get electronicReceiveInfo
   * @return electronicReceiveInfo
  **/
  @javax.annotation.Nullable
  public QueryInvoiceDetailSelfV2ResponseDataElectronicReceiveInfo getElectronicReceiveInfo() {
    return electronicReceiveInfo;
  }


  public void setElectronicReceiveInfo(QueryInvoiceDetailSelfV2ResponseDataElectronicReceiveInfo electronicReceiveInfo) {
    this.electronicReceiveInfo = electronicReceiveInfo;
  }


  public QueryInvoiceDetailSelfV2ResponseData failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 开票失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public QueryInvoiceDetailSelfV2ResponseData invoiceAmount(Double invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 已开票金额
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  public Double getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public QueryInvoiceDetailSelfV2ResponseData invoiceId(Long invoiceId) {
    
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


  public QueryInvoiceDetailSelfV2ResponseData invoiceObjectName(String invoiceObjectName) {
    
    this.invoiceObjectName = invoiceObjectName;
    return this;
  }

   /**
   * 开票实体
   * @return invoiceObjectName
  **/
  @javax.annotation.Nullable
  public String getInvoiceObjectName() {
    return invoiceObjectName;
  }


  public void setInvoiceObjectName(String invoiceObjectName) {
    this.invoiceObjectName = invoiceObjectName;
  }


  public QueryInvoiceDetailSelfV2ResponseData invoiceSerial(String invoiceSerial) {
    
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


  public QueryInvoiceDetailSelfV2ResponseData invoiceStatusName(String invoiceStatusName) {
    
    this.invoiceStatusName = invoiceStatusName;
    return this;
  }

   /**
   * 开票状态
   * @return invoiceStatusName
  **/
  @javax.annotation.Nullable
  public String getInvoiceStatusName() {
    return invoiceStatusName;
  }


  public void setInvoiceStatusName(String invoiceStatusName) {
    this.invoiceStatusName = invoiceStatusName;
  }


  public QueryInvoiceDetailSelfV2ResponseData invoiceTypeName(String invoiceTypeName) {
    
    this.invoiceTypeName = invoiceTypeName;
    return this;
  }

   /**
   * 发票类型
   * @return invoiceTypeName
  **/
  @javax.annotation.Nullable
  public String getInvoiceTypeName() {
    return invoiceTypeName;
  }


  public void setInvoiceTypeName(String invoiceTypeName) {
    this.invoiceTypeName = invoiceTypeName;
  }


  public QueryInvoiceDetailSelfV2ResponseData orgInvoiceId(Long orgInvoiceId) {
    
    this.orgInvoiceId = orgInvoiceId;
    return this;
  }

   /**
   * 蓝票开票单ID（仅红票）
   * @return orgInvoiceId
  **/
  @javax.annotation.Nullable
  public Long getOrgInvoiceId() {
    return orgInvoiceId;
  }


  public void setOrgInvoiceId(Long orgInvoiceId) {
    this.orgInvoiceId = orgInvoiceId;
  }


  public QueryInvoiceDetailSelfV2ResponseData paperReceiveInfo(QueryInvoiceDetailSelfV2ResponseDataPaperReceiveInfo paperReceiveInfo) {
    
    this.paperReceiveInfo = paperReceiveInfo;
    return this;
  }

   /**
   * Get paperReceiveInfo
   * @return paperReceiveInfo
  **/
  @javax.annotation.Nullable
  public QueryInvoiceDetailSelfV2ResponseDataPaperReceiveInfo getPaperReceiveInfo() {
    return paperReceiveInfo;
  }


  public void setPaperReceiveInfo(QueryInvoiceDetailSelfV2ResponseDataPaperReceiveInfo paperReceiveInfo) {
    this.paperReceiveInfo = paperReceiveInfo;
  }


  public QueryInvoiceDetailSelfV2ResponseData paperSendInfo(QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo paperSendInfo) {
    
    this.paperSendInfo = paperSendInfo;
    return this;
  }

   /**
   * Get paperSendInfo
   * @return paperSendInfo
  **/
  @javax.annotation.Nullable
  public QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo getPaperSendInfo() {
    return paperSendInfo;
  }


  public void setPaperSendInfo(QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo paperSendInfo) {
    this.paperSendInfo = paperSendInfo;
  }


  public QueryInvoiceDetailSelfV2ResponseData platformName(String platformName) {
    
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


  public QueryInvoiceDetailSelfV2ResponseData revertAmount(Double revertAmount) {
    
    this.revertAmount = revertAmount;
    return this;
  }

   /**
   * 已红冲金额
   * @return revertAmount
  **/
  @javax.annotation.Nullable
  public Double getRevertAmount() {
    return revertAmount;
  }


  public void setRevertAmount(Double revertAmount) {
    this.revertAmount = revertAmount;
  }


  public QueryInvoiceDetailSelfV2ResponseData revertFrozenAmount(Double revertFrozenAmount) {
    
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


  public QueryInvoiceDetailSelfV2ResponseData revertStatusName(String revertStatusName) {
    
    this.revertStatusName = revertStatusName;
    return this;
  }

   /**
   * 红冲状态
   * @return revertStatusName
  **/
  @javax.annotation.Nullable
  public String getRevertStatusName() {
    return revertStatusName;
  }


  public void setRevertStatusName(String revertStatusName) {
    this.revertStatusName = revertStatusName;
  }


  public QueryInvoiceDetailSelfV2ResponseData sendStatusName(String sendStatusName) {
    
    this.sendStatusName = sendStatusName;
    return this;
  }

   /**
   * 寄送状态
   * @return sendStatusName
  **/
  @javax.annotation.Nullable
  public String getSendStatusName() {
    return sendStatusName;
  }


  public void setSendStatusName(String sendStatusName) {
    this.sendStatusName = sendStatusName;
  }


  public QueryInvoiceDetailSelfV2ResponseData unprintableRemark(String unprintableRemark) {
    
    this.unprintableRemark = unprintableRemark;
    return this;
  }

   /**
   * 非打印备注
   * @return unprintableRemark
  **/
  @javax.annotation.Nullable
  public String getUnprintableRemark() {
    return unprintableRemark;
  }


  public void setUnprintableRemark(String unprintableRemark) {
    this.unprintableRemark = unprintableRemark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceDetailSelfV2ResponseData queryInvoiceDetailSelfV2ResponseData = (QueryInvoiceDetailSelfV2ResponseData) o;
    return Objects.equals(this.accountId, queryInvoiceDetailSelfV2ResponseData.accountId) &&
        Objects.equals(this.applyAmount, queryInvoiceDetailSelfV2ResponseData.applyAmount) &&
        Objects.equals(this.approvalStatusName, queryInvoiceDetailSelfV2ResponseData.approvalStatusName) &&
        Objects.equals(this.billProjectInfoList, queryInvoiceDetailSelfV2ResponseData.billProjectInfoList) &&
        Objects.equals(this.contractSerial, queryInvoiceDetailSelfV2ResponseData.contractSerial) &&
        Objects.equals(this.contractSubjectName, queryInvoiceDetailSelfV2ResponseData.contractSubjectName) &&
        Objects.equals(this.cusQualificationInfo, queryInvoiceDetailSelfV2ResponseData.cusQualificationInfo) &&
        Objects.equals(this.customerId, queryInvoiceDetailSelfV2ResponseData.customerId) &&
        Objects.equals(this.customerName, queryInvoiceDetailSelfV2ResponseData.customerName) &&
        Objects.equals(this.electronicReceiveInfo, queryInvoiceDetailSelfV2ResponseData.electronicReceiveInfo) &&
        Objects.equals(this.failReason, queryInvoiceDetailSelfV2ResponseData.failReason) &&
        Objects.equals(this.invoiceAmount, queryInvoiceDetailSelfV2ResponseData.invoiceAmount) &&
        Objects.equals(this.invoiceId, queryInvoiceDetailSelfV2ResponseData.invoiceId) &&
        Objects.equals(this.invoiceObjectName, queryInvoiceDetailSelfV2ResponseData.invoiceObjectName) &&
        Objects.equals(this.invoiceSerial, queryInvoiceDetailSelfV2ResponseData.invoiceSerial) &&
        Objects.equals(this.invoiceStatusName, queryInvoiceDetailSelfV2ResponseData.invoiceStatusName) &&
        Objects.equals(this.invoiceTypeName, queryInvoiceDetailSelfV2ResponseData.invoiceTypeName) &&
        Objects.equals(this.orgInvoiceId, queryInvoiceDetailSelfV2ResponseData.orgInvoiceId) &&
        Objects.equals(this.paperReceiveInfo, queryInvoiceDetailSelfV2ResponseData.paperReceiveInfo) &&
        Objects.equals(this.paperSendInfo, queryInvoiceDetailSelfV2ResponseData.paperSendInfo) &&
        Objects.equals(this.platformName, queryInvoiceDetailSelfV2ResponseData.platformName) &&
        Objects.equals(this.revertAmount, queryInvoiceDetailSelfV2ResponseData.revertAmount) &&
        Objects.equals(this.revertFrozenAmount, queryInvoiceDetailSelfV2ResponseData.revertFrozenAmount) &&
        Objects.equals(this.revertStatusName, queryInvoiceDetailSelfV2ResponseData.revertStatusName) &&
        Objects.equals(this.sendStatusName, queryInvoiceDetailSelfV2ResponseData.sendStatusName) &&
        Objects.equals(this.unprintableRemark, queryInvoiceDetailSelfV2ResponseData.unprintableRemark);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, applyAmount, approvalStatusName, billProjectInfoList, contractSerial, contractSubjectName, cusQualificationInfo, customerId, customerName, electronicReceiveInfo, failReason, invoiceAmount, invoiceId, invoiceObjectName, invoiceSerial, invoiceStatusName, invoiceTypeName, orgInvoiceId, paperReceiveInfo, paperSendInfo, platformName, revertAmount, revertFrozenAmount, revertStatusName, sendStatusName, unprintableRemark);
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
    sb.append("class QueryInvoiceDetailSelfV2ResponseData {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    applyAmount: ").append(toIndentedString(applyAmount)).append("\n");
    sb.append("    approvalStatusName: ").append(toIndentedString(approvalStatusName)).append("\n");
    sb.append("    billProjectInfoList: ").append(toIndentedString(billProjectInfoList)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    contractSubjectName: ").append(toIndentedString(contractSubjectName)).append("\n");
    sb.append("    cusQualificationInfo: ").append(toIndentedString(cusQualificationInfo)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    electronicReceiveInfo: ").append(toIndentedString(electronicReceiveInfo)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceObjectName: ").append(toIndentedString(invoiceObjectName)).append("\n");
    sb.append("    invoiceSerial: ").append(toIndentedString(invoiceSerial)).append("\n");
    sb.append("    invoiceStatusName: ").append(toIndentedString(invoiceStatusName)).append("\n");
    sb.append("    invoiceTypeName: ").append(toIndentedString(invoiceTypeName)).append("\n");
    sb.append("    orgInvoiceId: ").append(toIndentedString(orgInvoiceId)).append("\n");
    sb.append("    paperReceiveInfo: ").append(toIndentedString(paperReceiveInfo)).append("\n");
    sb.append("    paperSendInfo: ").append(toIndentedString(paperSendInfo)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    revertAmount: ").append(toIndentedString(revertAmount)).append("\n");
    sb.append("    revertFrozenAmount: ").append(toIndentedString(revertFrozenAmount)).append("\n");
    sb.append("    revertStatusName: ").append(toIndentedString(revertStatusName)).append("\n");
    sb.append("    sendStatusName: ").append(toIndentedString(sendStatusName)).append("\n");
    sb.append("    unprintableRemark: ").append(toIndentedString(unprintableRemark)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("apply_amount");
    openapiFields.add("approval_status_name");
    openapiFields.add("bill_project_info_list");
    openapiFields.add("contract_serial");
    openapiFields.add("contract_subject_name");
    openapiFields.add("cus_qualification_info");
    openapiFields.add("customer_id");
    openapiFields.add("customer_name");
    openapiFields.add("electronic_receive_info");
    openapiFields.add("fail_reason");
    openapiFields.add("invoice_amount");
    openapiFields.add("invoice_id");
    openapiFields.add("invoice_object_name");
    openapiFields.add("invoice_serial");
    openapiFields.add("invoice_status_name");
    openapiFields.add("invoice_type_name");
    openapiFields.add("org_invoice_id");
    openapiFields.add("paper_receive_info");
    openapiFields.add("paper_send_info");
    openapiFields.add("platform_name");
    openapiFields.add("revert_amount");
    openapiFields.add("revert_frozen_amount");
    openapiFields.add("revert_status_name");
    openapiFields.add("send_status_name");
    openapiFields.add("unprintable_remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceDetailSelfV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceDetailSelfV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceDetailSelfV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceDetailSelfV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceDetailSelfV2ResponseData>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceDetailSelfV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceDetailSelfV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceDetailSelfV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceDetailSelfV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceDetailSelfV2ResponseData
  */
  public static QueryInvoiceDetailSelfV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceDetailSelfV2ResponseData.class);
  }

 /**
  * Convert an instance of QueryInvoiceDetailSelfV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

