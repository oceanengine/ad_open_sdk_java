/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportProductHourlyAsyncTaskCreateV30RequestFiltering;
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
 * ReportProductHourlyAsyncTaskCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class ReportProductHourlyAsyncTaskCreateV30Request {
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
  private ReportProductHourlyAsyncTaskCreateV30RequestFiltering filtering = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public ReportProductHourlyAsyncTaskCreateV30Request() {
  }

  public ReportProductHourlyAsyncTaskCreateV30Request advertiserId(Long advertiserId) {
    
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


  public ReportProductHourlyAsyncTaskCreateV30Request endDate(String endDate) {
    
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


  public ReportProductHourlyAsyncTaskCreateV30Request fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public ReportProductHourlyAsyncTaskCreateV30Request addFieldsItem(String fieldsItem) {
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


  public ReportProductHourlyAsyncTaskCreateV30Request filtering(ReportProductHourlyAsyncTaskCreateV30RequestFiltering filtering) {
    
    this.filtering = filtering;
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @javax.annotation.Nullable
  public ReportProductHourlyAsyncTaskCreateV30RequestFiltering getFiltering() {
    return filtering;
  }


  public void setFiltering(ReportProductHourlyAsyncTaskCreateV30RequestFiltering filtering) {
    this.filtering = filtering;
  }


  public ReportProductHourlyAsyncTaskCreateV30Request productPlatformId(Long productPlatformId) {
    
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


  public ReportProductHourlyAsyncTaskCreateV30Request startDate(String startDate) {
    
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


  public ReportProductHourlyAsyncTaskCreateV30Request taskName(String taskName) {
    
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
    ReportProductHourlyAsyncTaskCreateV30Request reportProductHourlyAsyncTaskCreateV30Request = (ReportProductHourlyAsyncTaskCreateV30Request) o;
    return Objects.equals(this.advertiserId, reportProductHourlyAsyncTaskCreateV30Request.advertiserId) &&
        Objects.equals(this.endDate, reportProductHourlyAsyncTaskCreateV30Request.endDate) &&
        Objects.equals(this.fields, reportProductHourlyAsyncTaskCreateV30Request.fields) &&
        Objects.equals(this.filtering, reportProductHourlyAsyncTaskCreateV30Request.filtering) &&
        Objects.equals(this.productPlatformId, reportProductHourlyAsyncTaskCreateV30Request.productPlatformId) &&
        Objects.equals(this.startDate, reportProductHourlyAsyncTaskCreateV30Request.startDate) &&
        Objects.equals(this.taskName, reportProductHourlyAsyncTaskCreateV30Request.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, endDate, fields, filtering, productPlatformId, startDate, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportProductHourlyAsyncTaskCreateV30Request {\n");
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
       if (!ReportProductHourlyAsyncTaskCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportProductHourlyAsyncTaskCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportProductHourlyAsyncTaskCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportProductHourlyAsyncTaskCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportProductHourlyAsyncTaskCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ReportProductHourlyAsyncTaskCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportProductHourlyAsyncTaskCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportProductHourlyAsyncTaskCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportProductHourlyAsyncTaskCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ReportProductHourlyAsyncTaskCreateV30Request
  */
  public static ReportProductHourlyAsyncTaskCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportProductHourlyAsyncTaskCreateV30Request.class);
  }

 /**
  * Convert an instance of ReportProductHourlyAsyncTaskCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

