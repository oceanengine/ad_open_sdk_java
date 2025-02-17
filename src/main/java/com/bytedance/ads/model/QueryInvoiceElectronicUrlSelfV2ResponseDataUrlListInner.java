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
 * QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner {
  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode = null;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo = null;

  public static final String SERIALIZED_NAME_OFD_URL = "ofd_url";
  @SerializedName(SERIALIZED_NAME_OFD_URL)
  private String ofdUrl = null;

  public static final String SERIALIZED_NAME_PDF_URL = "pdf_url";
  @SerializedName(SERIALIZED_NAME_PDF_URL)
  private String pdfUrl = null;

  public static final String SERIALIZED_NAME_XML_URL = "xml_url";
  @SerializedName(SERIALIZED_NAME_XML_URL)
  private String xmlUrl = null;

  public QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner() {
  }

  public QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner ofdUrl(String ofdUrl) {
    
    this.ofdUrl = ofdUrl;
    return this;
  }

   /**
   * 发票ofd链接
   * @return ofdUrl
  **/
  @javax.annotation.Nullable
  public String getOfdUrl() {
    return ofdUrl;
  }


  public void setOfdUrl(String ofdUrl) {
    this.ofdUrl = ofdUrl;
  }


  public QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner pdfUrl(String pdfUrl) {
    
    this.pdfUrl = pdfUrl;
    return this;
  }

   /**
   * 发票pdf链接
   * @return pdfUrl
  **/
  @javax.annotation.Nullable
  public String getPdfUrl() {
    return pdfUrl;
  }


  public void setPdfUrl(String pdfUrl) {
    this.pdfUrl = pdfUrl;
  }


  public QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner xmlUrl(String xmlUrl) {
    
    this.xmlUrl = xmlUrl;
    return this;
  }

   /**
   * 发票xml链接
   * @return xmlUrl
  **/
  @javax.annotation.Nullable
  public String getXmlUrl() {
    return xmlUrl;
  }


  public void setXmlUrl(String xmlUrl) {
    this.xmlUrl = xmlUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner queryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner = (QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner) o;
    return Objects.equals(this.invoiceCode, queryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.invoiceCode) &&
        Objects.equals(this.invoiceNo, queryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.invoiceNo) &&
        Objects.equals(this.ofdUrl, queryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.ofdUrl) &&
        Objects.equals(this.pdfUrl, queryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.pdfUrl) &&
        Objects.equals(this.xmlUrl, queryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.xmlUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceCode, invoiceNo, ofdUrl, pdfUrl, xmlUrl);
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
    sb.append("class QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner {\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    ofdUrl: ").append(toIndentedString(ofdUrl)).append("\n");
    sb.append("    pdfUrl: ").append(toIndentedString(pdfUrl)).append("\n");
    sb.append("    xmlUrl: ").append(toIndentedString(xmlUrl)).append("\n");
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
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_no");
    openapiFields.add("ofd_url");
    openapiFields.add("pdf_url");
    openapiFields.add("xml_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner
  */
  public static QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner.class);
  }

 /**
  * Convert an instance of QueryInvoiceElectronicUrlSelfV2ResponseDataUrlListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

