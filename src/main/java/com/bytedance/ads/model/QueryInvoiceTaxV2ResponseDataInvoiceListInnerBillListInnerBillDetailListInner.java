/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_COMMODIFY_SERVICE_NAME = "commodify_service_name";
  @SerializedName(SERIALIZED_NAME_COMMODIFY_SERVICE_NAME)
  private String commodifyServiceName = null;

  public static final String SERIALIZED_NAME_SPECIFICATIONS_MODELS = "specifications_models";
  @SerializedName(SERIALIZED_NAME_SPECIFICATIONS_MODELS)
  private String specificationsModels = null;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Double taxAmount = null;

  public static final String SERIALIZED_NAME_TAX_RATE = "tax_rate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private Double taxRate = null;

  public static final String SERIALIZED_NAME_TOTAL_PRICE_TAX = "total_price_tax";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRICE_TAX)
  private Double totalPriceTax = null;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit = null;

  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner() {
  }

  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nullable
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner commodifyServiceName(String commodifyServiceName) {
    
    this.commodifyServiceName = commodifyServiceName;
    return this;
  }

   /**
   * 
   * @return commodifyServiceName
  **/
  @javax.annotation.Nullable
  public String getCommodifyServiceName() {
    return commodifyServiceName;
  }


  public void setCommodifyServiceName(String commodifyServiceName) {
    this.commodifyServiceName = commodifyServiceName;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner specificationsModels(String specificationsModels) {
    
    this.specificationsModels = specificationsModels;
    return this;
  }

   /**
   * 
   * @return specificationsModels
  **/
  @javax.annotation.Nullable
  public String getSpecificationsModels() {
    return specificationsModels;
  }


  public void setSpecificationsModels(String specificationsModels) {
    this.specificationsModels = specificationsModels;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner taxAmount(Double taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * 
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  public Double getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner taxRate(Double taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * 
   * @return taxRate
  **/
  @javax.annotation.Nullable
  public Double getTaxRate() {
    return taxRate;
  }


  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner totalPriceTax(Double totalPriceTax) {
    
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


  public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * 
   * @return unit
  **/
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner = (QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner) o;
    return Objects.equals(this.amount, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.amount) &&
        Objects.equals(this.commodifyServiceName, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.commodifyServiceName) &&
        Objects.equals(this.specificationsModels, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.specificationsModels) &&
        Objects.equals(this.taxAmount, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.taxAmount) &&
        Objects.equals(this.taxRate, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.taxRate) &&
        Objects.equals(this.totalPriceTax, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.totalPriceTax) &&
        Objects.equals(this.unit, queryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.unit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, commodifyServiceName, specificationsModels, taxAmount, taxRate, totalPriceTax, unit);
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
    sb.append("class QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    commodifyServiceName: ").append(toIndentedString(commodifyServiceName)).append("\n");
    sb.append("    specificationsModels: ").append(toIndentedString(specificationsModels)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    totalPriceTax: ").append(toIndentedString(totalPriceTax)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("commodify_service_name");
    openapiFields.add("specifications_models");
    openapiFields.add("tax_amount");
    openapiFields.add("tax_rate");
    openapiFields.add("total_price_tax");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner
  */
  public static QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner.class);
  }

 /**
  * Convert an instance of QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInnerBillDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

