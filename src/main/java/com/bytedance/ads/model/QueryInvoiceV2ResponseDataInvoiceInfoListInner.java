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
 * QueryInvoiceV2ResponseDataInvoiceInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class QueryInvoiceV2ResponseDataInvoiceInfoListInner {
  public static final String SERIALIZED_NAME_ABANDONED_AMOUNT = "abandoned_amount";
  @SerializedName(SERIALIZED_NAME_ABANDONED_AMOUNT)
  private Double abandonedAmount = null;

  public static final String SERIALIZED_NAME_ACTUAL_INVOICE_AMOUNT = "actual_invoice_amount";
  @SerializedName(SERIALIZED_NAME_ACTUAL_INVOICE_AMOUNT)
  private Double actualInvoiceAmount = null;

  public static final String SERIALIZED_NAME_APPLY_AMOUNT = "apply_amount";
  @SerializedName(SERIALIZED_NAME_APPLY_AMOUNT)
  private Double applyAmount = null;

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

  public static final String SERIALIZED_NAME_INVOICE_SERIAL = "invoice_serial";
  @SerializedName(SERIALIZED_NAME_INVOICE_SERIAL)
  private String invoiceSerial = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoice_status";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private Long invoiceStatus = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS_NAME = "invoice_status_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS_NAME)
  private String invoiceStatusName = null;

  public static final String SERIALIZED_NAME_ISSUE_TIME = "issue_time";
  @SerializedName(SERIALIZED_NAME_ISSUE_TIME)
  private String issueTime = null;

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

  public QueryInvoiceV2ResponseDataInvoiceInfoListInner() {
  }

  public QueryInvoiceV2ResponseDataInvoiceInfoListInner abandonedAmount(Double abandonedAmount) {
    
    this.abandonedAmount = abandonedAmount;
    return this;
  }

   /**
   * 
   * @return abandonedAmount
  **/
  @javax.annotation.Nullable
  public Double getAbandonedAmount() {
    return abandonedAmount;
  }


  public void setAbandonedAmount(Double abandonedAmount) {
    this.abandonedAmount = abandonedAmount;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner actualInvoiceAmount(Double actualInvoiceAmount) {
    
    this.actualInvoiceAmount = actualInvoiceAmount;
    return this;
  }

   /**
   * 
   * @return actualInvoiceAmount
  **/
  @javax.annotation.Nullable
  public Double getActualInvoiceAmount() {
    return actualInvoiceAmount;
  }


  public void setActualInvoiceAmount(Double actualInvoiceAmount) {
    this.actualInvoiceAmount = actualInvoiceAmount;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner applyAmount(Double applyAmount) {
    
    this.applyAmount = applyAmount;
    return this;
  }

   /**
   * 
   * @return applyAmount
  **/
  @javax.annotation.Nullable
  public Double getApplyAmount() {
    return applyAmount;
  }


  public void setApplyAmount(Double applyAmount) {
    this.applyAmount = applyAmount;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceAmount(Double invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  public Double getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceCodes(List<String> invoiceCodes) {
    
    this.invoiceCodes = invoiceCodes;
    return this;
  }

  public QueryInvoiceV2ResponseDataInvoiceInfoListInner addInvoiceCodesItem(String invoiceCodesItem) {
    if (this.invoiceCodes == null) {
      this.invoiceCodes = new ArrayList<>();
    }
    this.invoiceCodes.add(invoiceCodesItem);
    return this;
  }

   /**
   * 
   * @return invoiceCodes
  **/
  @javax.annotation.Nullable
  public List<String> getInvoiceCodes() {
    return invoiceCodes;
  }


  public void setInvoiceCodes(List<String> invoiceCodes) {
    this.invoiceCodes = invoiceCodes;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceId(Long invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * 
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  public Long getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceNos(List<String> invoiceNos) {
    
    this.invoiceNos = invoiceNos;
    return this;
  }

  public QueryInvoiceV2ResponseDataInvoiceInfoListInner addInvoiceNosItem(String invoiceNosItem) {
    if (this.invoiceNos == null) {
      this.invoiceNos = new ArrayList<>();
    }
    this.invoiceNos.add(invoiceNosItem);
    return this;
  }

   /**
   * 
   * @return invoiceNos
  **/
  @javax.annotation.Nullable
  public List<String> getInvoiceNos() {
    return invoiceNos;
  }


  public void setInvoiceNos(List<String> invoiceNos) {
    this.invoiceNos = invoiceNos;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceSerial(String invoiceSerial) {
    
    this.invoiceSerial = invoiceSerial;
    return this;
  }

   /**
   * 
   * @return invoiceSerial
  **/
  @javax.annotation.Nullable
  public String getInvoiceSerial() {
    return invoiceSerial;
  }


  public void setInvoiceSerial(String invoiceSerial) {
    this.invoiceSerial = invoiceSerial;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceStatus(Long invoiceStatus) {
    
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * 
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  public Long getInvoiceStatus() {
    return invoiceStatus;
  }


  public void setInvoiceStatus(Long invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceStatusName(String invoiceStatusName) {
    
    this.invoiceStatusName = invoiceStatusName;
    return this;
  }

   /**
   * 
   * @return invoiceStatusName
  **/
  @javax.annotation.Nullable
  public String getInvoiceStatusName() {
    return invoiceStatusName;
  }


  public void setInvoiceStatusName(String invoiceStatusName) {
    this.invoiceStatusName = invoiceStatusName;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner issueTime(String issueTime) {
    
    this.issueTime = issueTime;
    return this;
  }

   /**
   * 
   * @return issueTime
  **/
  @javax.annotation.Nullable
  public String getIssueTime() {
    return issueTime;
  }


  public void setIssueTime(String issueTime) {
    this.issueTime = issueTime;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner revertAmount(Double revertAmount) {
    
    this.revertAmount = revertAmount;
    return this;
  }

   /**
   * 
   * @return revertAmount
  **/
  @javax.annotation.Nullable
  public Double getRevertAmount() {
    return revertAmount;
  }


  public void setRevertAmount(Double revertAmount) {
    this.revertAmount = revertAmount;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner revertFrozenAmount(Double revertFrozenAmount) {
    
    this.revertFrozenAmount = revertFrozenAmount;
    return this;
  }

   /**
   * 
   * @return revertFrozenAmount
  **/
  @javax.annotation.Nullable
  public Double getRevertFrozenAmount() {
    return revertFrozenAmount;
  }


  public void setRevertFrozenAmount(Double revertFrozenAmount) {
    this.revertFrozenAmount = revertFrozenAmount;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner revertStatus(Long revertStatus) {
    
    this.revertStatus = revertStatus;
    return this;
  }

   /**
   * 
   * @return revertStatus
  **/
  @javax.annotation.Nullable
  public Long getRevertStatus() {
    return revertStatus;
  }


  public void setRevertStatus(Long revertStatus) {
    this.revertStatus = revertStatus;
  }


  public QueryInvoiceV2ResponseDataInvoiceInfoListInner revertStatusName(String revertStatusName) {
    
    this.revertStatusName = revertStatusName;
    return this;
  }

   /**
   * 
   * @return revertStatusName
  **/
  @javax.annotation.Nullable
  public String getRevertStatusName() {
    return revertStatusName;
  }


  public void setRevertStatusName(String revertStatusName) {
    this.revertStatusName = revertStatusName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceV2ResponseDataInvoiceInfoListInner queryInvoiceV2ResponseDataInvoiceInfoListInner = (QueryInvoiceV2ResponseDataInvoiceInfoListInner) o;
    return Objects.equals(this.abandonedAmount, queryInvoiceV2ResponseDataInvoiceInfoListInner.abandonedAmount) &&
        Objects.equals(this.actualInvoiceAmount, queryInvoiceV2ResponseDataInvoiceInfoListInner.actualInvoiceAmount) &&
        Objects.equals(this.applyAmount, queryInvoiceV2ResponseDataInvoiceInfoListInner.applyAmount) &&
        Objects.equals(this.invoiceAmount, queryInvoiceV2ResponseDataInvoiceInfoListInner.invoiceAmount) &&
        Objects.equals(this.invoiceCodes, queryInvoiceV2ResponseDataInvoiceInfoListInner.invoiceCodes) &&
        Objects.equals(this.invoiceId, queryInvoiceV2ResponseDataInvoiceInfoListInner.invoiceId) &&
        Objects.equals(this.invoiceNos, queryInvoiceV2ResponseDataInvoiceInfoListInner.invoiceNos) &&
        Objects.equals(this.invoiceSerial, queryInvoiceV2ResponseDataInvoiceInfoListInner.invoiceSerial) &&
        Objects.equals(this.invoiceStatus, queryInvoiceV2ResponseDataInvoiceInfoListInner.invoiceStatus) &&
        Objects.equals(this.invoiceStatusName, queryInvoiceV2ResponseDataInvoiceInfoListInner.invoiceStatusName) &&
        Objects.equals(this.issueTime, queryInvoiceV2ResponseDataInvoiceInfoListInner.issueTime) &&
        Objects.equals(this.revertAmount, queryInvoiceV2ResponseDataInvoiceInfoListInner.revertAmount) &&
        Objects.equals(this.revertFrozenAmount, queryInvoiceV2ResponseDataInvoiceInfoListInner.revertFrozenAmount) &&
        Objects.equals(this.revertStatus, queryInvoiceV2ResponseDataInvoiceInfoListInner.revertStatus) &&
        Objects.equals(this.revertStatusName, queryInvoiceV2ResponseDataInvoiceInfoListInner.revertStatusName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonedAmount, actualInvoiceAmount, applyAmount, invoiceAmount, invoiceCodes, invoiceId, invoiceNos, invoiceSerial, invoiceStatus, invoiceStatusName, issueTime, revertAmount, revertFrozenAmount, revertStatus, revertStatusName);
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
    sb.append("class QueryInvoiceV2ResponseDataInvoiceInfoListInner {\n");
    sb.append("    abandonedAmount: ").append(toIndentedString(abandonedAmount)).append("\n");
    sb.append("    actualInvoiceAmount: ").append(toIndentedString(actualInvoiceAmount)).append("\n");
    sb.append("    applyAmount: ").append(toIndentedString(applyAmount)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    invoiceCodes: ").append(toIndentedString(invoiceCodes)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceNos: ").append(toIndentedString(invoiceNos)).append("\n");
    sb.append("    invoiceSerial: ").append(toIndentedString(invoiceSerial)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    invoiceStatusName: ").append(toIndentedString(invoiceStatusName)).append("\n");
    sb.append("    issueTime: ").append(toIndentedString(issueTime)).append("\n");
    sb.append("    revertAmount: ").append(toIndentedString(revertAmount)).append("\n");
    sb.append("    revertFrozenAmount: ").append(toIndentedString(revertFrozenAmount)).append("\n");
    sb.append("    revertStatus: ").append(toIndentedString(revertStatus)).append("\n");
    sb.append("    revertStatusName: ").append(toIndentedString(revertStatusName)).append("\n");
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
    openapiFields.add("invoice_amount");
    openapiFields.add("invoice_codes");
    openapiFields.add("invoice_id");
    openapiFields.add("invoice_nos");
    openapiFields.add("invoice_serial");
    openapiFields.add("invoice_status");
    openapiFields.add("invoice_status_name");
    openapiFields.add("issue_time");
    openapiFields.add("revert_amount");
    openapiFields.add("revert_frozen_amount");
    openapiFields.add("revert_status");
    openapiFields.add("revert_status_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoice_id");
    openapiRequiredFields.add("invoice_serial");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceV2ResponseDataInvoiceInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceV2ResponseDataInvoiceInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceV2ResponseDataInvoiceInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceV2ResponseDataInvoiceInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceV2ResponseDataInvoiceInfoListInner>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceV2ResponseDataInvoiceInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceV2ResponseDataInvoiceInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceV2ResponseDataInvoiceInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceV2ResponseDataInvoiceInfoListInner
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceV2ResponseDataInvoiceInfoListInner
  */
  public static QueryInvoiceV2ResponseDataInvoiceInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceV2ResponseDataInvoiceInfoListInner.class);
  }

 /**
  * Convert an instance of QueryInvoiceV2ResponseDataInvoiceInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

