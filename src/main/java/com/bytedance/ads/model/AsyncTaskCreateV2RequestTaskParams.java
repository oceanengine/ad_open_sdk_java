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
import com.bytedance.ads.model.AsyncTaskCreateV2RequestTaskParamsFiltering;
import com.bytedance.ads.model.AsyncTaskCreateV2TaskParamsOrderType;
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
public class AsyncTaskCreateV2RequestTaskParams {
  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<String> fields = null;

  public static final String SERIALIZED_NAME_FILTERING = "filtering";
  @SerializedName(SERIALIZED_NAME_FILTERING)
  private AsyncTaskCreateV2RequestTaskParamsFiltering filtering = null;

  public static final String SERIALIZED_NAME_GROUP_BY = "group_by";
  @SerializedName(SERIALIZED_NAME_GROUP_BY)
  private List<String> groupBy = null;

  public static final String SERIALIZED_NAME_ORDER_FIELD = "order_field";
  @SerializedName(SERIALIZED_NAME_ORDER_FIELD)
  private String orderField = null;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private AsyncTaskCreateV2TaskParamsOrderType orderType = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate = null;

  public AsyncTaskCreateV2RequestTaskParams() {
  }

  public AsyncTaskCreateV2RequestTaskParams endDate(String endDate) {
    
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


  public AsyncTaskCreateV2RequestTaskParams fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParams addFieldsItem(String fieldsItem) {
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


  public AsyncTaskCreateV2RequestTaskParams filtering(AsyncTaskCreateV2RequestTaskParamsFiltering filtering) {
    
    this.filtering = filtering;
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @javax.annotation.Nullable
  public AsyncTaskCreateV2RequestTaskParamsFiltering getFiltering() {
    return filtering;
  }


  public void setFiltering(AsyncTaskCreateV2RequestTaskParamsFiltering filtering) {
    this.filtering = filtering;
  }


  public AsyncTaskCreateV2RequestTaskParams groupBy(List<String> groupBy) {
    
    this.groupBy = groupBy;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParams addGroupByItem(String groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

   /**
   * 
   * @return groupBy
  **/
  @javax.annotation.Nonnull
  public List<String> getGroupBy() {
    return groupBy;
  }


  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }


  public AsyncTaskCreateV2RequestTaskParams orderField(String orderField) {
    
    this.orderField = orderField;
    return this;
  }

   /**
   * 
   * @return orderField
  **/
  @javax.annotation.Nullable
  public String getOrderField() {
    return orderField;
  }


  public void setOrderField(String orderField) {
    this.orderField = orderField;
  }


  public AsyncTaskCreateV2RequestTaskParams orderType(AsyncTaskCreateV2TaskParamsOrderType orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @javax.annotation.Nullable
  public AsyncTaskCreateV2TaskParamsOrderType getOrderType() {
    return orderType;
  }


  public void setOrderType(AsyncTaskCreateV2TaskParamsOrderType orderType) {
    this.orderType = orderType;
  }


  public AsyncTaskCreateV2RequestTaskParams startDate(String startDate) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncTaskCreateV2RequestTaskParams asyncTaskCreateV2RequestTaskParams = (AsyncTaskCreateV2RequestTaskParams) o;
    return Objects.equals(this.endDate, asyncTaskCreateV2RequestTaskParams.endDate) &&
        Objects.equals(this.fields, asyncTaskCreateV2RequestTaskParams.fields) &&
        Objects.equals(this.filtering, asyncTaskCreateV2RequestTaskParams.filtering) &&
        Objects.equals(this.groupBy, asyncTaskCreateV2RequestTaskParams.groupBy) &&
        Objects.equals(this.orderField, asyncTaskCreateV2RequestTaskParams.orderField) &&
        Objects.equals(this.orderType, asyncTaskCreateV2RequestTaskParams.orderType) &&
        Objects.equals(this.startDate, asyncTaskCreateV2RequestTaskParams.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, fields, filtering, groupBy, orderField, orderType, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncTaskCreateV2RequestTaskParams {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("end_date");
    openapiFields.add("fields");
    openapiFields.add("filtering");
    openapiFields.add("group_by");
    openapiFields.add("order_field");
    openapiFields.add("order_type");
    openapiFields.add("start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("end_date");
    openapiRequiredFields.add("group_by");
    openapiRequiredFields.add("start_date");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncTaskCreateV2RequestTaskParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncTaskCreateV2RequestTaskParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncTaskCreateV2RequestTaskParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncTaskCreateV2RequestTaskParams.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncTaskCreateV2RequestTaskParams>() {
           @Override
           public void write(JsonWriter out, AsyncTaskCreateV2RequestTaskParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncTaskCreateV2RequestTaskParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncTaskCreateV2RequestTaskParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncTaskCreateV2RequestTaskParams
  * @throws IOException if the JSON string is invalid with respect to AsyncTaskCreateV2RequestTaskParams
  */
  public static AsyncTaskCreateV2RequestTaskParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncTaskCreateV2RequestTaskParams.class);
  }

 /**
  * Convert an instance of AsyncTaskCreateV2RequestTaskParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

