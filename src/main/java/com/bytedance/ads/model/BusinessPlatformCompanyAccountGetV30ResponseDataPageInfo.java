/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = null;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER = "total_number";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER)
  private Integer totalNumber = null;

  public static final String SERIALIZED_NAME_TOTAL_PAGE = "total_page";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE)
  private Integer totalPage = null;

  public BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo() {
  }

  public BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * 
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo totalNumber(Integer totalNumber) {
    
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * 
   * @return totalNumber
  **/
  @javax.annotation.Nullable
  public Integer getTotalNumber() {
    return totalNumber;
  }


  public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
  }


  public BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo totalPage(Integer totalPage) {
    
    this.totalPage = totalPage;
    return this;
  }

   /**
   * 
   * @return totalPage
  **/
  @javax.annotation.Nullable
  public Integer getTotalPage() {
    return totalPage;
  }


  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo businessPlatformCompanyAccountGetV30ResponseDataPageInfo = (BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo) o;
    return Objects.equals(this.page, businessPlatformCompanyAccountGetV30ResponseDataPageInfo.page) &&
        Objects.equals(this.pageSize, businessPlatformCompanyAccountGetV30ResponseDataPageInfo.pageSize) &&
        Objects.equals(this.totalNumber, businessPlatformCompanyAccountGetV30ResponseDataPageInfo.totalNumber) &&
        Objects.equals(this.totalPage, businessPlatformCompanyAccountGetV30ResponseDataPageInfo.totalPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalNumber, totalPage);
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
    sb.append("class BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("total_number");
    openapiFields.add("total_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo
  */
  public static BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of BusinessPlatformCompanyAccountGetV30ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

