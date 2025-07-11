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
import com.bytedance.ads.model.ReportProductDailyAsyncTaskCreateV30RequestFiltering;
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
 * ReportProductDailyAsyncTaskCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ReportProductDailyAsyncTaskCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = null;

  public static final String SERIALIZED_NAME_FILTERING = "filtering";
  @SerializedName(SERIALIZED_NAME_FILTERING)
  private ReportProductDailyAsyncTaskCreateV30RequestFiltering filtering = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public ReportProductDailyAsyncTaskCreateV30Request() {
  }

  public ReportProductDailyAsyncTaskCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ReportProductDailyAsyncTaskCreateV30Request endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 
   * @return endDate
  **/
  @javax.annotation.Nonnull
  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ReportProductDailyAsyncTaskCreateV30Request fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public ReportProductDailyAsyncTaskCreateV30Request addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * 
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<String> getFields() {
    return fields;
  }


  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  public ReportProductDailyAsyncTaskCreateV30Request filtering(ReportProductDailyAsyncTaskCreateV30RequestFiltering filtering) {
    
    this.filtering = filtering;
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @javax.annotation.Nullable
  public ReportProductDailyAsyncTaskCreateV30RequestFiltering getFiltering() {
    return filtering;
  }


  public void setFiltering(ReportProductDailyAsyncTaskCreateV30RequestFiltering filtering) {
    this.filtering = filtering;
  }


  public ReportProductDailyAsyncTaskCreateV30Request productPlatformId(Long productPlatformId) {
    
    this.productPlatformId = productPlatformId;
    return this;
  }

   /**
   * 
   * @return productPlatformId
  **/
  @javax.annotation.Nonnull
  public Long getProductPlatformId() {
    return productPlatformId;
  }


  public void setProductPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
  }


  public ReportProductDailyAsyncTaskCreateV30Request startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ReportProductDailyAsyncTaskCreateV30Request taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * 
   * @return taskName
  **/
  @javax.annotation.Nonnull
  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportProductDailyAsyncTaskCreateV30Request reportProductDailyAsyncTaskCreateV30Request = (ReportProductDailyAsyncTaskCreateV30Request) o;
    return Objects.equals(this.advertiserId, reportProductDailyAsyncTaskCreateV30Request.advertiserId) &&
        Objects.equals(this.endDate, reportProductDailyAsyncTaskCreateV30Request.endDate) &&
        Objects.equals(this.fields, reportProductDailyAsyncTaskCreateV30Request.fields) &&
        Objects.equals(this.filtering, reportProductDailyAsyncTaskCreateV30Request.filtering) &&
        Objects.equals(this.productPlatformId, reportProductDailyAsyncTaskCreateV30Request.productPlatformId) &&
        Objects.equals(this.startDate, reportProductDailyAsyncTaskCreateV30Request.startDate) &&
        Objects.equals(this.taskName, reportProductDailyAsyncTaskCreateV30Request.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, endDate, fields, filtering, productPlatformId, startDate, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportProductDailyAsyncTaskCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("end_date");
    openapiFields.add("fields");
    openapiFields.add("filtering");
    openapiFields.add("product_platform_id");
    openapiFields.add("start_date");
    openapiFields.add("task_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("product_platform_id");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("task_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportProductDailyAsyncTaskCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportProductDailyAsyncTaskCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportProductDailyAsyncTaskCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportProductDailyAsyncTaskCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportProductDailyAsyncTaskCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ReportProductDailyAsyncTaskCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportProductDailyAsyncTaskCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportProductDailyAsyncTaskCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportProductDailyAsyncTaskCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ReportProductDailyAsyncTaskCreateV30Request
  */
  public static ReportProductDailyAsyncTaskCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportProductDailyAsyncTaskCreateV30Request.class);
  }

 /**
  * Convert an instance of ReportProductDailyAsyncTaskCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

