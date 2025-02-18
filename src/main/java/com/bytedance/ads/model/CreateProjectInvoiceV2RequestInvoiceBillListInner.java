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
import com.bytedance.ads.model.CreateProjectInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner;
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
 * CreateProjectInvoiceV2RequestInvoiceBillListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class CreateProjectInvoiceV2RequestInvoiceBillListInner {
  public static final String SERIALIZED_NAME_INVOICE_BILL_PROJECT_LIST = "invoice_bill_project_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_BILL_PROJECT_LIST)
  private List<CreateProjectInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner> invoiceBillProjectList = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public CreateProjectInvoiceV2RequestInvoiceBillListInner() {
  }

  public CreateProjectInvoiceV2RequestInvoiceBillListInner invoiceBillProjectList(List<CreateProjectInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner> invoiceBillProjectList) {
    
    this.invoiceBillProjectList = invoiceBillProjectList;
    return this;
  }

  public CreateProjectInvoiceV2RequestInvoiceBillListInner addInvoiceBillProjectListItem(CreateProjectInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner invoiceBillProjectListItem) {
    if (this.invoiceBillProjectList == null) {
      this.invoiceBillProjectList = new ArrayList<>();
    }
    this.invoiceBillProjectList.add(invoiceBillProjectListItem);
    return this;
  }

   /**
   * 开票票据项目列表
   * @return invoiceBillProjectList
  **/
  @javax.annotation.Nonnull
  public List<CreateProjectInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner> getInvoiceBillProjectList() {
    return invoiceBillProjectList;
  }


  public void setInvoiceBillProjectList(List<CreateProjectInvoiceV2RequestInvoiceBillListInnerInvoiceBillProjectListInner> invoiceBillProjectList) {
    this.invoiceBillProjectList = invoiceBillProjectList;
  }


  public CreateProjectInvoiceV2RequestInvoiceBillListInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 打印备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectInvoiceV2RequestInvoiceBillListInner createProjectInvoiceV2RequestInvoiceBillListInner = (CreateProjectInvoiceV2RequestInvoiceBillListInner) o;
    return Objects.equals(this.invoiceBillProjectList, createProjectInvoiceV2RequestInvoiceBillListInner.invoiceBillProjectList) &&
        Objects.equals(this.remark, createProjectInvoiceV2RequestInvoiceBillListInner.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceBillProjectList, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectInvoiceV2RequestInvoiceBillListInner {\n");
    sb.append("    invoiceBillProjectList: ").append(toIndentedString(invoiceBillProjectList)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("invoice_bill_project_list");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoice_bill_project_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateProjectInvoiceV2RequestInvoiceBillListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateProjectInvoiceV2RequestInvoiceBillListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateProjectInvoiceV2RequestInvoiceBillListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateProjectInvoiceV2RequestInvoiceBillListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateProjectInvoiceV2RequestInvoiceBillListInner>() {
           @Override
           public void write(JsonWriter out, CreateProjectInvoiceV2RequestInvoiceBillListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateProjectInvoiceV2RequestInvoiceBillListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateProjectInvoiceV2RequestInvoiceBillListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateProjectInvoiceV2RequestInvoiceBillListInner
  * @throws IOException if the JSON string is invalid with respect to CreateProjectInvoiceV2RequestInvoiceBillListInner
  */
  public static CreateProjectInvoiceV2RequestInvoiceBillListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateProjectInvoiceV2RequestInvoiceBillListInner.class);
  }

 /**
  * Convert an instance of CreateProjectInvoiceV2RequestInvoiceBillListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

