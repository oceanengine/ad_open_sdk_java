/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QueryInvoiceV2ResponseDataInvoiceInfoListInner;
import com.bytedance.ads.model.QueryInvoiceV2ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class QueryInvoiceV2ResponseData {
  public static final String SERIALIZED_NAME_INVOICE_INFO_LIST = "invoice_info_list";
  @SerializedName(SERIALIZED_NAME_INVOICE_INFO_LIST)
  private List<QueryInvoiceV2ResponseDataInvoiceInfoListInner> invoiceInfoList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QueryInvoiceV2ResponseDataPageInfo pageInfo = null;

  public QueryInvoiceV2ResponseData() {
  }

  public QueryInvoiceV2ResponseData invoiceInfoList(List<QueryInvoiceV2ResponseDataInvoiceInfoListInner> invoiceInfoList) {
    
    this.invoiceInfoList = invoiceInfoList;
    return this;
  }

  public QueryInvoiceV2ResponseData addInvoiceInfoListItem(QueryInvoiceV2ResponseDataInvoiceInfoListInner invoiceInfoListItem) {
    if (this.invoiceInfoList == null) {
      this.invoiceInfoList = new ArrayList<>();
    }
    this.invoiceInfoList.add(invoiceInfoListItem);
    return this;
  }

   /**
   * 
   * @return invoiceInfoList
  **/
  @javax.annotation.Nullable
  public List<QueryInvoiceV2ResponseDataInvoiceInfoListInner> getInvoiceInfoList() {
    return invoiceInfoList;
  }


  public void setInvoiceInfoList(List<QueryInvoiceV2ResponseDataInvoiceInfoListInner> invoiceInfoList) {
    this.invoiceInfoList = invoiceInfoList;
  }


  public QueryInvoiceV2ResponseData pageInfo(QueryInvoiceV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QueryInvoiceV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QueryInvoiceV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceV2ResponseData queryInvoiceV2ResponseData = (QueryInvoiceV2ResponseData) o;
    return Objects.equals(this.invoiceInfoList, queryInvoiceV2ResponseData.invoiceInfoList) &&
        Objects.equals(this.pageInfo, queryInvoiceV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceInfoList, pageInfo);
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
    sb.append("class QueryInvoiceV2ResponseData {\n");
    sb.append("    invoiceInfoList: ").append(toIndentedString(invoiceInfoList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("invoice_info_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoice_info_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceV2ResponseData>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceV2ResponseData
  */
  public static QueryInvoiceV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceV2ResponseData.class);
  }

 /**
  * Convert an instance of QueryInvoiceV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

