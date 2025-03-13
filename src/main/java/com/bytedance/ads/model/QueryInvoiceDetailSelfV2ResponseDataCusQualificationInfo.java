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
 * 开票客户信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo {
  public static final String SERIALIZED_NAME_CUSTOMER_ADDRESS = "customer_address";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ADDRESS)
  private String customerAddress = null;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK = "customer_bank";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK)
  private String customerBank = null;

  public static final String SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT = "customer_bank_account";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_BANK_ACCOUNT)
  private String customerBankAccount = null;

  public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customer_phone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
  private String customerPhone = null;

  public static final String SERIALIZED_NAME_CUSTOMER_SUBJECT_NAME = "customer_subject_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SUBJECT_NAME)
  private String customerSubjectName = null;

  public static final String SERIALIZED_NAME_CUSTOMER_TAX_TO = "customer_tax_to";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TAX_TO)
  private String customerTaxTo = null;

  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo() {
  }

  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo customerAddress(String customerAddress) {
    
    this.customerAddress = customerAddress;
    return this;
  }

   /**
   * 注册地址
   * @return customerAddress
  **/
  @javax.annotation.Nullable
  public String getCustomerAddress() {
    return customerAddress;
  }


  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }


  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo customerBank(String customerBank) {
    
    this.customerBank = customerBank;
    return this;
  }

   /**
   * 开户行
   * @return customerBank
  **/
  @javax.annotation.Nullable
  public String getCustomerBank() {
    return customerBank;
  }


  public void setCustomerBank(String customerBank) {
    this.customerBank = customerBank;
  }


  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo customerBankAccount(String customerBankAccount) {
    
    this.customerBankAccount = customerBankAccount;
    return this;
  }

   /**
   * 开户账号
   * @return customerBankAccount
  **/
  @javax.annotation.Nullable
  public String getCustomerBankAccount() {
    return customerBankAccount;
  }


  public void setCustomerBankAccount(String customerBankAccount) {
    this.customerBankAccount = customerBankAccount;
  }


  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo customerPhone(String customerPhone) {
    
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * 注册电话
   * @return customerPhone
  **/
  @javax.annotation.Nullable
  public String getCustomerPhone() {
    return customerPhone;
  }


  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }


  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo customerSubjectName(String customerSubjectName) {
    
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


  public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo customerTaxTo(String customerTaxTo) {
    
    this.customerTaxTo = customerTaxTo;
    return this;
  }

   /**
   * 纳税人识别号
   * @return customerTaxTo
  **/
  @javax.annotation.Nullable
  public String getCustomerTaxTo() {
    return customerTaxTo;
  }


  public void setCustomerTaxTo(String customerTaxTo) {
    this.customerTaxTo = customerTaxTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo queryInvoiceDetailSelfV2ResponseDataCusQualificationInfo = (QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo) o;
    return Objects.equals(this.customerAddress, queryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.customerAddress) &&
        Objects.equals(this.customerBank, queryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.customerBank) &&
        Objects.equals(this.customerBankAccount, queryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.customerBankAccount) &&
        Objects.equals(this.customerPhone, queryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.customerPhone) &&
        Objects.equals(this.customerSubjectName, queryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.customerSubjectName) &&
        Objects.equals(this.customerTaxTo, queryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.customerTaxTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAddress, customerBank, customerBankAccount, customerPhone, customerSubjectName, customerTaxTo);
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
    sb.append("class QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo {\n");
    sb.append("    customerAddress: ").append(toIndentedString(customerAddress)).append("\n");
    sb.append("    customerBank: ").append(toIndentedString(customerBank)).append("\n");
    sb.append("    customerBankAccount: ").append(toIndentedString(customerBankAccount)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    customerSubjectName: ").append(toIndentedString(customerSubjectName)).append("\n");
    sb.append("    customerTaxTo: ").append(toIndentedString(customerTaxTo)).append("\n");
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
    openapiFields.add("customer_address");
    openapiFields.add("customer_bank");
    openapiFields.add("customer_bank_account");
    openapiFields.add("customer_phone");
    openapiFields.add("customer_subject_name");
    openapiFields.add("customer_tax_to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo
  */
  public static QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo.class);
  }

 /**
  * Convert an instance of QueryInvoiceDetailSelfV2ResponseDataCusQualificationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

