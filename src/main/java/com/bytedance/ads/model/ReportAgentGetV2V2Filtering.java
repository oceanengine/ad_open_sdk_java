/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportAgentGetV2V2FilteringAccountSource;
import com.bytedance.ads.model.ReportAgentGetV2V2FilteringAccountStatus;
import com.bytedance.ads.model.ReportAgentGetV2V2FilteringActive;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class ReportAgentGetV2V2Filtering {
  public static final String SERIALIZED_NAME_ACCOUNT_SOURCE = "account_source";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SOURCE)
  private ReportAgentGetV2V2FilteringAccountSource accountSource = null;

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private ReportAgentGetV2V2FilteringAccountStatus accountStatus = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private ReportAgentGetV2V2FilteringActive active = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_END_AUDIT_PASS_TIME = "end_audit_pass_time";
  @SerializedName(SERIALIZED_NAME_END_AUDIT_PASS_TIME)
  private String endAuditPassTime = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY = "first_industry";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY)
  private String firstIndustry = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY = "second_industry";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY)
  private String secondIndustry = null;

  public static final String SERIALIZED_NAME_START_AUDIT_PASS_TIME = "start_audit_pass_time";
  @SerializedName(SERIALIZED_NAME_START_AUDIT_PASS_TIME)
  private String startAuditPassTime = null;

  public ReportAgentGetV2V2Filtering() {
  }

  public ReportAgentGetV2V2Filtering accountSource(ReportAgentGetV2V2FilteringAccountSource accountSource) {
    
    this.accountSource = accountSource;
    return this;
  }

   /**
   * Get accountSource
   * @return accountSource
  **/
  @javax.annotation.Nullable
  public ReportAgentGetV2V2FilteringAccountSource getAccountSource() {
    return accountSource;
  }


  public void setAccountSource(ReportAgentGetV2V2FilteringAccountSource accountSource) {
    this.accountSource = accountSource;
  }


  public ReportAgentGetV2V2Filtering accountStatus(ReportAgentGetV2V2FilteringAccountStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  public ReportAgentGetV2V2FilteringAccountStatus getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(ReportAgentGetV2V2FilteringAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public ReportAgentGetV2V2Filtering active(ReportAgentGetV2V2FilteringActive active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public ReportAgentGetV2V2FilteringActive getActive() {
    return active;
  }


  public void setActive(ReportAgentGetV2V2FilteringActive active) {
    this.active = active;
  }


  public ReportAgentGetV2V2Filtering advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public ReportAgentGetV2V2Filtering addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public ReportAgentGetV2V2Filtering companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public ReportAgentGetV2V2Filtering endAuditPassTime(String endAuditPassTime) {
    
    this.endAuditPassTime = endAuditPassTime;
    return this;
  }

   /**
   * 
   * @return endAuditPassTime
  **/
  @javax.annotation.Nullable
  public String getEndAuditPassTime() {
    return endAuditPassTime;
  }


  public void setEndAuditPassTime(String endAuditPassTime) {
    this.endAuditPassTime = endAuditPassTime;
  }


  public ReportAgentGetV2V2Filtering firstIndustry(String firstIndustry) {
    
    this.firstIndustry = firstIndustry;
    return this;
  }

   /**
   * 
   * @return firstIndustry
  **/
  @javax.annotation.Nullable
  public String getFirstIndustry() {
    return firstIndustry;
  }


  public void setFirstIndustry(String firstIndustry) {
    this.firstIndustry = firstIndustry;
  }


  public ReportAgentGetV2V2Filtering secondIndustry(String secondIndustry) {
    
    this.secondIndustry = secondIndustry;
    return this;
  }

   /**
   * 
   * @return secondIndustry
  **/
  @javax.annotation.Nullable
  public String getSecondIndustry() {
    return secondIndustry;
  }


  public void setSecondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
  }


  public ReportAgentGetV2V2Filtering startAuditPassTime(String startAuditPassTime) {
    
    this.startAuditPassTime = startAuditPassTime;
    return this;
  }

   /**
   * 
   * @return startAuditPassTime
  **/
  @javax.annotation.Nullable
  public String getStartAuditPassTime() {
    return startAuditPassTime;
  }


  public void setStartAuditPassTime(String startAuditPassTime) {
    this.startAuditPassTime = startAuditPassTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAgentGetV2V2Filtering reportAgentGetV2V2Filtering = (ReportAgentGetV2V2Filtering) o;
    return Objects.equals(this.accountSource, reportAgentGetV2V2Filtering.accountSource) &&
        Objects.equals(this.accountStatus, reportAgentGetV2V2Filtering.accountStatus) &&
        Objects.equals(this.active, reportAgentGetV2V2Filtering.active) &&
        Objects.equals(this.advertiserIds, reportAgentGetV2V2Filtering.advertiserIds) &&
        Objects.equals(this.companyName, reportAgentGetV2V2Filtering.companyName) &&
        Objects.equals(this.endAuditPassTime, reportAgentGetV2V2Filtering.endAuditPassTime) &&
        Objects.equals(this.firstIndustry, reportAgentGetV2V2Filtering.firstIndustry) &&
        Objects.equals(this.secondIndustry, reportAgentGetV2V2Filtering.secondIndustry) &&
        Objects.equals(this.startAuditPassTime, reportAgentGetV2V2Filtering.startAuditPassTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSource, accountStatus, active, advertiserIds, companyName, endAuditPassTime, firstIndustry, secondIndustry, startAuditPassTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAgentGetV2V2Filtering {\n");
    sb.append("    accountSource: ").append(toIndentedString(accountSource)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    endAuditPassTime: ").append(toIndentedString(endAuditPassTime)).append("\n");
    sb.append("    firstIndustry: ").append(toIndentedString(firstIndustry)).append("\n");
    sb.append("    secondIndustry: ").append(toIndentedString(secondIndustry)).append("\n");
    sb.append("    startAuditPassTime: ").append(toIndentedString(startAuditPassTime)).append("\n");
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
    openapiFields.add("account_source");
    openapiFields.add("account_status");
    openapiFields.add("active");
    openapiFields.add("advertiser_ids");
    openapiFields.add("company_name");
    openapiFields.add("end_audit_pass_time");
    openapiFields.add("first_industry");
    openapiFields.add("second_industry");
    openapiFields.add("start_audit_pass_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAgentGetV2V2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAgentGetV2V2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAgentGetV2V2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAgentGetV2V2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAgentGetV2V2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportAgentGetV2V2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAgentGetV2V2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAgentGetV2V2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAgentGetV2V2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportAgentGetV2V2Filtering
  */
  public static ReportAgentGetV2V2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAgentGetV2V2Filtering.class);
  }

 /**
  * Convert an instance of ReportAgentGetV2V2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

