/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentAdvBiddingListQueryV2FilteringAccountStatus;
import com.bytedance.ads.model.AgentAdvBiddingListQueryV2FilteringActive;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class AgentAdvBiddingListQueryV2Filtering {
  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AgentAdvBiddingListQueryV2FilteringAccountStatus accountStatus = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private AgentAdvBiddingListQueryV2FilteringActive active = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY = "first_industry";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY)
  private String firstIndustry = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY = "second_industry";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY)
  private String secondIndustry = null;

  public AgentAdvBiddingListQueryV2Filtering() {
  }

  public AgentAdvBiddingListQueryV2Filtering accountStatus(AgentAdvBiddingListQueryV2FilteringAccountStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  public AgentAdvBiddingListQueryV2FilteringAccountStatus getAccountStatus() {
    return accountStatus;
  }


  public void setAccountStatus(AgentAdvBiddingListQueryV2FilteringAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public AgentAdvBiddingListQueryV2Filtering active(AgentAdvBiddingListQueryV2FilteringActive active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public AgentAdvBiddingListQueryV2FilteringActive getActive() {
    return active;
  }


  public void setActive(AgentAdvBiddingListQueryV2FilteringActive active) {
    this.active = active;
  }


  public AgentAdvBiddingListQueryV2Filtering advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AgentAdvBiddingListQueryV2Filtering addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 广告主 id 列表，若选填该字段，则最少应上传1个广告主id，最多支持同时查询100个广告主。
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AgentAdvBiddingListQueryV2Filtering companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 广告主所属公司名称，若选填该字段，限制最小长度为1，最大长度为223。支持模糊查询。
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AgentAdvBiddingListQueryV2Filtering firstIndustry(String firstIndustry) {
    
    this.firstIndustry = firstIndustry;
    return this;
  }

   /**
   * 一级行业名称。可从【获取行业列表】接口获取。
   * @return firstIndustry
  **/
  @javax.annotation.Nullable
  public String getFirstIndustry() {
    return firstIndustry;
  }


  public void setFirstIndustry(String firstIndustry) {
    this.firstIndustry = firstIndustry;
  }


  public AgentAdvBiddingListQueryV2Filtering secondIndustry(String secondIndustry) {
    
    this.secondIndustry = secondIndustry;
    return this;
  }

   /**
   * 二级行业名称。可从【获取行业列表】接口获取
   * @return secondIndustry
  **/
  @javax.annotation.Nullable
  public String getSecondIndustry() {
    return secondIndustry;
  }


  public void setSecondIndustry(String secondIndustry) {
    this.secondIndustry = secondIndustry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvBiddingListQueryV2Filtering agentAdvBiddingListQueryV2Filtering = (AgentAdvBiddingListQueryV2Filtering) o;
    return Objects.equals(this.accountStatus, agentAdvBiddingListQueryV2Filtering.accountStatus) &&
        Objects.equals(this.active, agentAdvBiddingListQueryV2Filtering.active) &&
        Objects.equals(this.advertiserIds, agentAdvBiddingListQueryV2Filtering.advertiserIds) &&
        Objects.equals(this.companyName, agentAdvBiddingListQueryV2Filtering.companyName) &&
        Objects.equals(this.firstIndustry, agentAdvBiddingListQueryV2Filtering.firstIndustry) &&
        Objects.equals(this.secondIndustry, agentAdvBiddingListQueryV2Filtering.secondIndustry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountStatus, active, advertiserIds, companyName, firstIndustry, secondIndustry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvBiddingListQueryV2Filtering {\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    firstIndustry: ").append(toIndentedString(firstIndustry)).append("\n");
    sb.append("    secondIndustry: ").append(toIndentedString(secondIndustry)).append("\n");
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
    openapiFields.add("account_status");
    openapiFields.add("active");
    openapiFields.add("advertiser_ids");
    openapiFields.add("company_name");
    openapiFields.add("first_industry");
    openapiFields.add("second_industry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvBiddingListQueryV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvBiddingListQueryV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvBiddingListQueryV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvBiddingListQueryV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvBiddingListQueryV2Filtering>() {
           @Override
           public void write(JsonWriter out, AgentAdvBiddingListQueryV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvBiddingListQueryV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvBiddingListQueryV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvBiddingListQueryV2Filtering
  * @throws IOException if the JSON string is invalid with respect to AgentAdvBiddingListQueryV2Filtering
  */
  public static AgentAdvBiddingListQueryV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvBiddingListQueryV2Filtering.class);
  }

 /**
  * Convert an instance of AgentAdvBiddingListQueryV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

