/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class QueryInvoiceV2Filtering {
  public static final String SERIALIZED_NAME_INVOICE_STATUSES = "invoice_statuses";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUSES)
  private List<Long> invoiceStatuses = null;

  public static final String SERIALIZED_NAME_PROJECT_SERIALS = "project_serials";
  @SerializedName(SERIALIZED_NAME_PROJECT_SERIALS)
  private List<String> projectSerials = null;

  public static final String SERIALIZED_NAME_STATEMENT_SERIALS = "statement_serials";
  @SerializedName(SERIALIZED_NAME_STATEMENT_SERIALS)
  private List<String> statementSerials = null;

  public QueryInvoiceV2Filtering() {
  }

  public QueryInvoiceV2Filtering invoiceStatuses(List<Long> invoiceStatuses) {
    
    this.invoiceStatuses = invoiceStatuses;
    return this;
  }

  public QueryInvoiceV2Filtering addInvoiceStatusesItem(Long invoiceStatusesItem) {
    if (this.invoiceStatuses == null) {
      this.invoiceStatuses = new ArrayList<>();
    }
    this.invoiceStatuses.add(invoiceStatusesItem);
    return this;
  }

   /**
   * 
   * @return invoiceStatuses
  **/
  @javax.annotation.Nullable
  public List<Long> getInvoiceStatuses() {
    return invoiceStatuses;
  }


  public void setInvoiceStatuses(List<Long> invoiceStatuses) {
    this.invoiceStatuses = invoiceStatuses;
  }


  public QueryInvoiceV2Filtering projectSerials(List<String> projectSerials) {
    
    this.projectSerials = projectSerials;
    return this;
  }

  public QueryInvoiceV2Filtering addProjectSerialsItem(String projectSerialsItem) {
    if (this.projectSerials == null) {
      this.projectSerials = new ArrayList<>();
    }
    this.projectSerials.add(projectSerialsItem);
    return this;
  }

   /**
   * 
   * @return projectSerials
  **/
  @javax.annotation.Nullable
  public List<String> getProjectSerials() {
    return projectSerials;
  }


  public void setProjectSerials(List<String> projectSerials) {
    this.projectSerials = projectSerials;
  }


  public QueryInvoiceV2Filtering statementSerials(List<String> statementSerials) {
    
    this.statementSerials = statementSerials;
    return this;
  }

  public QueryInvoiceV2Filtering addStatementSerialsItem(String statementSerialsItem) {
    if (this.statementSerials == null) {
      this.statementSerials = new ArrayList<>();
    }
    this.statementSerials.add(statementSerialsItem);
    return this;
  }

   /**
   * 
   * @return statementSerials
  **/
  @javax.annotation.Nullable
  public List<String> getStatementSerials() {
    return statementSerials;
  }


  public void setStatementSerials(List<String> statementSerials) {
    this.statementSerials = statementSerials;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceV2Filtering queryInvoiceV2Filtering = (QueryInvoiceV2Filtering) o;
    return Objects.equals(this.invoiceStatuses, queryInvoiceV2Filtering.invoiceStatuses) &&
        Objects.equals(this.projectSerials, queryInvoiceV2Filtering.projectSerials) &&
        Objects.equals(this.statementSerials, queryInvoiceV2Filtering.statementSerials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceStatuses, projectSerials, statementSerials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryInvoiceV2Filtering {\n");
    sb.append("    invoiceStatuses: ").append(toIndentedString(invoiceStatuses)).append("\n");
    sb.append("    projectSerials: ").append(toIndentedString(projectSerials)).append("\n");
    sb.append("    statementSerials: ").append(toIndentedString(statementSerials)).append("\n");
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
    openapiFields.add("invoice_statuses");
    openapiFields.add("project_serials");
    openapiFields.add("statement_serials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceV2Filtering>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceV2Filtering
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceV2Filtering
  */
  public static QueryInvoiceV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceV2Filtering.class);
  }

 /**
  * Convert an instance of QueryInvoiceV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

