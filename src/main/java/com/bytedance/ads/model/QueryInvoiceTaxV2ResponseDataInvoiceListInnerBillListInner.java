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
import com.bytedance.ads.model.QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner;
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
 * QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner {
  public static final String SERIALIZED_NAME_BILL_DETAIL_LIST = "bill_detail_list";
  @SerializedName(SERIALIZED_NAME_BILL_DETAIL_LIST)
  private List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner> billDetailList = null;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode = null;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate = null;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo = null;

  public static final String SERIALIZED_NAME_TOTAL_PRICE_TAX = "total_price_tax";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE_TAX)
  private Double totalPriceTax = null;

  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner() {
  }

  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner billDetailList(List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner> billDetailList) {
    
    this.billDetailList = billDetailList;
    return this;
  }

  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner addBillDetailListItem(QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner billDetailListItem) {
    if (this.billDetailList == null) {
      this.billDetailList = new ArrayList<>();
    }
    this.billDetailList.add(billDetailListItem);
    return this;
  }

   /**
   * 
   * @return billDetailList
  **/
  @javax.annotation.Nullable
  public List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner> getBillDetailList() {
    return billDetailList;
  }


  public void setBillDetailList(List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner> billDetailList) {
    this.billDetailList = billDetailList;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * 
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  public String getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner totalPriceTax(Double totalPriceTax) {
    
    this.totalPriceTax = totalPriceTax;
    return this;
  }

   /**
   * 
   * @return totalPriceTax
  **/
  @javax.annotation.Nullable
  public Double getTotalPriceTax() {
    return totalPriceTax;
  }


  public void setTotalPriceTax(Double totalPriceTax) {
    this.totalPriceTax = totalPriceTax;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner = (QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner) o;
    return Objects.equals(this.billDetailList, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.billDetailList) &&
        Objects.equals(this.invoiceCode, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.invoiceCode) &&
        Objects.equals(this.invoiceDate, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.invoiceDate) &&
        Objects.equals(this.invoiceNo, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.invoiceNo) &&
        Objects.equals(this.totalPriceTax, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.totalPriceTax);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billDetailList, invoiceCode, invoiceDate, invoiceNo, totalPriceTax);
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
    sb.append("class QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner {\n");
    sb.append("    billDetailList: ").append(toIndentedString(billDetailList)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    totalPriceTax: ").append(toIndentedString(totalPriceTax)).append("\n");
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
    openapiFields.add("bill_detail_list");
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_date");
    openapiFields.add("invoice_no");
    openapiFields.add("total_price_tax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner
  */
  public static QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner.class);
  }

 /**
  * Convert an instance of QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

