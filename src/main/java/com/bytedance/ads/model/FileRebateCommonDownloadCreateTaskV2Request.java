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
 * FileRebateCommonDownloadCreateTaskV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class FileRebateCommonDownloadCreateTaskV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month = null;

  public static final String SERIALIZED_NAME_QUARTER = "quarter";
  @SerializedName(SERIALIZED_NAME_QUARTER)
  private Long quarter = null;

  public static final String SERIALIZED_NAME_WAIT_LATEST = "wait_latest";
  @SerializedName(SERIALIZED_NAME_WAIT_LATEST)
  private Boolean waitLatest = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Long year = null;

  public FileRebateCommonDownloadCreateTaskV2Request() {
  }

  public FileRebateCommonDownloadCreateTaskV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商帐户ID
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


  public FileRebateCommonDownloadCreateTaskV2Request month(String month) {
    
    this.month = month;
    return this;
  }

   /**
   * 月度，可以传多个，以逗号分隔，如1,2,3
   * @return month
  **/
  @javax.annotation.Nullable
  public String getMonth() {
    return month;
  }


  public void setMonth(String month) {
    this.month = month;
  }


  public FileRebateCommonDownloadCreateTaskV2Request quarter(Long quarter) {
    
    this.quarter = quarter;
    return this;
  }

   /**
   * 季度
   * minimum: 1
   * maximum: 4
   * @return quarter
  **/
  @javax.annotation.Nonnull
  public Long getQuarter() {
    return quarter;
  }


  public void setQuarter(Long quarter) {
    this.quarter = quarter;
  }


  public FileRebateCommonDownloadCreateTaskV2Request waitLatest(Boolean waitLatest) {
    
    this.waitLatest = waitLatest;
    return this;
  }

   /**
   * 等待最新数据参数，默认等待
   * @return waitLatest
  **/
  @javax.annotation.Nullable
  public Boolean getWaitLatest() {
    return waitLatest;
  }


  public void setWaitLatest(Boolean waitLatest) {
    this.waitLatest = waitLatest;
  }


  public FileRebateCommonDownloadCreateTaskV2Request year(Long year) {
    
    this.year = year;
    return this;
  }

   /**
   * 年
   * minimum: 2025
   * maximum: 2050
   * @return year
  **/
  @javax.annotation.Nonnull
  public Long getYear() {
    return year;
  }


  public void setYear(Long year) {
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
    FileRebateCommonDownloadCreateTaskV2Request fileRebateCommonDownloadCreateTaskV2Request = (FileRebateCommonDownloadCreateTaskV2Request) o;
    return Objects.equals(this.agentId, fileRebateCommonDownloadCreateTaskV2Request.agentId) &&
        Objects.equals(this.month, fileRebateCommonDownloadCreateTaskV2Request.month) &&
        Objects.equals(this.quarter, fileRebateCommonDownloadCreateTaskV2Request.quarter) &&
        Objects.equals(this.waitLatest, fileRebateCommonDownloadCreateTaskV2Request.waitLatest) &&
        Objects.equals(this.year, fileRebateCommonDownloadCreateTaskV2Request.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, month, quarter, waitLatest, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRebateCommonDownloadCreateTaskV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    waitLatest: ").append(toIndentedString(waitLatest)).append("\n");
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
    openapiFields.add("month");
    openapiFields.add("quarter");
    openapiFields.add("wait_latest");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("quarter");
    openapiRequiredFields.add("year");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateCommonDownloadCreateTaskV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateCommonDownloadCreateTaskV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateCommonDownloadCreateTaskV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateCommonDownloadCreateTaskV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateCommonDownloadCreateTaskV2Request>() {
           @Override
           public void write(JsonWriter out, FileRebateCommonDownloadCreateTaskV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateCommonDownloadCreateTaskV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateCommonDownloadCreateTaskV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateCommonDownloadCreateTaskV2Request
  * @throws IOException if the JSON string is invalid with respect to FileRebateCommonDownloadCreateTaskV2Request
  */
  public static FileRebateCommonDownloadCreateTaskV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateCommonDownloadCreateTaskV2Request.class);
  }

 /**
  * Convert an instance of FileRebateCommonDownloadCreateTaskV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

