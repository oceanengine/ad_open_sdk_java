/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileRebateRebateDownloadCreateTaskV2QueryType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * FileRebateRebateDownloadCreateTaskV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class FileRebateRebateDownloadCreateTaskV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_MONTH_QUARTER = "month_quarter";
  @SerializedName(SERIALIZED_NAME_MONTH_QUARTER)
  private String monthQuarter = null;

  public static final String SERIALIZED_NAME_QUERY_TYPE = "query_type";
  @SerializedName(SERIALIZED_NAME_QUERY_TYPE)
  private FileRebateRebateDownloadCreateTaskV2QueryType queryType = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year = null;

  public FileRebateRebateDownloadCreateTaskV2Request() {
  }

  public FileRebateRebateDownloadCreateTaskV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商账户id
   * minimum: 0
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public FileRebateRebateDownloadCreateTaskV2Request monthQuarter(String monthQuarter) {
    
    this.monthQuarter = monthQuarter;
    return this;
  }

   /**
   * 月/季度，可以传多个，以逗号分隔，如传入   1,2,3
   * @return monthQuarter
  **/
  @javax.annotation.Nonnull
  public String getMonthQuarter() {
    return monthQuarter;
  }


  public void setMonthQuarter(String monthQuarter) {
    this.monthQuarter = monthQuarter;
  }


  public FileRebateRebateDownloadCreateTaskV2Request queryType(FileRebateRebateDownloadCreateTaskV2QueryType queryType) {
    
    this.queryType = queryType;
    return this;
  }

   /**
   * Get queryType
   * @return queryType
  **/
  @javax.annotation.Nonnull
  public FileRebateRebateDownloadCreateTaskV2QueryType getQueryType() {
    return queryType;
  }


  public void setQueryType(FileRebateRebateDownloadCreateTaskV2QueryType queryType) {
    this.queryType = queryType;
  }


  public FileRebateRebateDownloadCreateTaskV2Request year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * 年
   * minimum: 2000
   * maximum: 2050
   * @return year
  **/
  @javax.annotation.Nonnull
  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRebateRebateDownloadCreateTaskV2Request fileRebateRebateDownloadCreateTaskV2Request = (FileRebateRebateDownloadCreateTaskV2Request) o;
    return Objects.equals(this.agentId, fileRebateRebateDownloadCreateTaskV2Request.agentId) &&
        Objects.equals(this.monthQuarter, fileRebateRebateDownloadCreateTaskV2Request.monthQuarter) &&
        Objects.equals(this.queryType, fileRebateRebateDownloadCreateTaskV2Request.queryType) &&
        Objects.equals(this.year, fileRebateRebateDownloadCreateTaskV2Request.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, monthQuarter, queryType, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRebateRebateDownloadCreateTaskV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    monthQuarter: ").append(toIndentedString(monthQuarter)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("month_quarter");
    openapiFields.add("query_type");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("month_quarter");
    openapiRequiredFields.add("query_type");
    openapiRequiredFields.add("year");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateRebateDownloadCreateTaskV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateRebateDownloadCreateTaskV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateRebateDownloadCreateTaskV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateRebateDownloadCreateTaskV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateRebateDownloadCreateTaskV2Request>() {
           @Override
           public void write(JsonWriter out, FileRebateRebateDownloadCreateTaskV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateRebateDownloadCreateTaskV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateRebateDownloadCreateTaskV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateRebateDownloadCreateTaskV2Request
  * @throws IOException if the JSON string is invalid with respect to FileRebateRebateDownloadCreateTaskV2Request
  */
  public static FileRebateRebateDownloadCreateTaskV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateRebateDownloadCreateTaskV2Request.class);
  }

 /**
  * Convert an instance of FileRebateRebateDownloadCreateTaskV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

