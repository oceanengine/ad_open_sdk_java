/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * 纸票寄送信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo {
  public static final String SERIALIZED_NAME_EXPRESS_COMPANY = "express_company";
  @SerializedName(SERIALIZED_NAME_EXPRESS_COMPANY)
  private String expressCompany = null;

  public static final String SERIALIZED_NAME_EXPRESS_DATE = "express_date";
  @SerializedName(SERIALIZED_NAME_EXPRESS_DATE)
  private String expressDate = null;

  public static final String SERIALIZED_NAME_EXPRESS_NUMBER = "express_number";
  @SerializedName(SERIALIZED_NAME_EXPRESS_NUMBER)
  private String expressNumber = null;

  public QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo() {
  }

  public QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo expressCompany(String expressCompany) {
    
    this.expressCompany = expressCompany;
    return this;
  }

   /**
   * 快递公司
   * @return expressCompany
  **/
  @javax.annotation.Nullable
  public String getExpressCompany() {
    return expressCompany;
  }


  public void setExpressCompany(String expressCompany) {
    this.expressCompany = expressCompany;
  }


  public QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo expressDate(String expressDate) {
    
    this.expressDate = expressDate;
    return this;
  }

   /**
   * 寄件日期
   * @return expressDate
  **/
  @javax.annotation.Nullable
  public String getExpressDate() {
    return expressDate;
  }


  public void setExpressDate(String expressDate) {
    this.expressDate = expressDate;
  }


  public QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo expressNumber(String expressNumber) {
    
    this.expressNumber = expressNumber;
    return this;
  }

   /**
   * 快递单号
   * @return expressNumber
  **/
  @javax.annotation.Nullable
  public String getExpressNumber() {
    return expressNumber;
  }


  public void setExpressNumber(String expressNumber) {
    this.expressNumber = expressNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo queryInvoiceDetailSelfV2ResponseDataPaperSendInfo = (QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo) o;
    return Objects.equals(this.expressCompany, queryInvoiceDetailSelfV2ResponseDataPaperSendInfo.expressCompany) &&
        Objects.equals(this.expressDate, queryInvoiceDetailSelfV2ResponseDataPaperSendInfo.expressDate) &&
        Objects.equals(this.expressNumber, queryInvoiceDetailSelfV2ResponseDataPaperSendInfo.expressNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressCompany, expressDate, expressNumber);
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
    sb.append("class QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo {\n");
    sb.append("    expressCompany: ").append(toIndentedString(expressCompany)).append("\n");
    sb.append("    expressDate: ").append(toIndentedString(expressDate)).append("\n");
    sb.append("    expressNumber: ").append(toIndentedString(expressNumber)).append("\n");
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
    openapiFields.add("express_company");
    openapiFields.add("express_date");
    openapiFields.add("express_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo
  */
  public static QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo.class);
  }

 /**
  * Convert an instance of QueryInvoiceDetailSelfV2ResponseDataPaperSendInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

