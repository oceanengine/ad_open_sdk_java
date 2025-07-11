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
import com.bytedance.ads.model.QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner;
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
 * QueryInvoiceTaxV2ResponseDataInvoiceListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QueryInvoiceTaxV2ResponseDataInvoiceListInner {
  public static final String SERIALIZED_NAME_BILL_LIST = "bill_list";
  @SerializedName(SERIALIZED_NAME_BILL_LIST)
  private List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner> billList = null;

  public static final String SERIALIZED_NAME_INVOICE_SERIAL = "invoice_serial";
  @SerializedName(SERIALIZED_NAME_INVOICE_SERIAL)
  private String invoiceSerial = null;

  public QueryInvoiceTaxV2ResponseDataInvoiceListInner() {
  }

  public QueryInvoiceTaxV2ResponseDataInvoiceListInner billList(List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner> billList) {
    
    this.billList = billList;
    return this;
  }

  public QueryInvoiceTaxV2ResponseDataInvoiceListInner addBillListItem(QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner billListItem) {
    if (this.billList == null) {
      this.billList = new ArrayList<>();
    }
    this.billList.add(billListItem);
    return this;
  }

   /**
   * 
   * @return billList
  **/
  @javax.annotation.Nullable
  public List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner> getBillList() {
    return billList;
  }


  public void setBillList(List<QueryInvoiceTaxV2ResponseDataInvoiceListInnerBillListInner> billList) {
    this.billList = billList;
  }


  public QueryInvoiceTaxV2ResponseDataInvoiceListInner invoiceSerial(String invoiceSerial) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceTaxV2ResponseDataInvoiceListInner queryInvoiceTaxV2ResponseDataInvoiceListInner = (QueryInvoiceTaxV2ResponseDataInvoiceListInner) o;
    return Objects.equals(this.billList, queryInvoiceTaxV2ResponseDataInvoiceListInner.billList) &&
        Objects.equals(this.invoiceSerial, queryInvoiceTaxV2ResponseDataInvoiceListInner.invoiceSerial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billList, invoiceSerial);
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
    sb.append("class QueryInvoiceTaxV2ResponseDataInvoiceListInner {\n");
    sb.append("    billList: ").append(toIndentedString(billList)).append("\n");
    sb.append("    invoiceSerial: ").append(toIndentedString(invoiceSerial)).append("\n");
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
    openapiFields.add("bill_list");
    openapiFields.add("invoice_serial");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceTaxV2ResponseDataInvoiceListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceTaxV2ResponseDataInvoiceListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceTaxV2ResponseDataInvoiceListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceTaxV2ResponseDataInvoiceListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceTaxV2ResponseDataInvoiceListInner>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceTaxV2ResponseDataInvoiceListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceTaxV2ResponseDataInvoiceListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceTaxV2ResponseDataInvoiceListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceTaxV2ResponseDataInvoiceListInner
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceTaxV2ResponseDataInvoiceListInner
  */
  public static QueryInvoiceTaxV2ResponseDataInvoiceListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceTaxV2ResponseDataInvoiceListInner.class);
  }

 /**
  * Convert an instance of QueryInvoiceTaxV2ResponseDataInvoiceListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

