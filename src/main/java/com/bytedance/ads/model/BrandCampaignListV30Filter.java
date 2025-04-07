/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCampaignListV30FilterCampaignStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class BrandCampaignListV30Filter {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_STATUS = "campaign_status";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_STATUS)
  private List<BrandCampaignListV30FilterCampaignStatus> campaignStatus = null;

  public static final String SERIALIZED_NAME_CREATE_END_TIME = "create_end_time";
  @SerializedName(SERIALIZED_NAME_CREATE_END_TIME)
  private String createEndTime = null;

  public static final String SERIALIZED_NAME_CREATE_START_TIME = "create_start_time";
  @SerializedName(SERIALIZED_NAME_CREATE_START_TIME)
  private String createStartTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public BrandCampaignListV30Filter() {
  }

  public BrandCampaignListV30Filter campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public BrandCampaignListV30Filter campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 广告组名称
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public BrandCampaignListV30Filter campaignStatus(List<BrandCampaignListV30FilterCampaignStatus> campaignStatus) {
    
    this.campaignStatus = campaignStatus;
    return this;
  }

  public BrandCampaignListV30Filter addCampaignStatusItem(BrandCampaignListV30FilterCampaignStatus campaignStatusItem) {
    if (this.campaignStatus == null) {
      this.campaignStatus = new ArrayList<>();
    }
    this.campaignStatus.add(campaignStatusItem);
    return this;
  }

   /**
   * 广告组状态
   * @return campaignStatus
  **/
  @javax.annotation.Nullable
  public List<BrandCampaignListV30FilterCampaignStatus> getCampaignStatus() {
    return campaignStatus;
  }


  public void setCampaignStatus(List<BrandCampaignListV30FilterCampaignStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  public BrandCampaignListV30Filter createEndTime(String createEndTime) {
    
    this.createEndTime = createEndTime;
    return this;
  }

   /**
   * 广告组截止创建时间 格式例如：2023-01-01
   * @return createEndTime
  **/
  @javax.annotation.Nullable
  public String getCreateEndTime() {
    return createEndTime;
  }


  public void setCreateEndTime(String createEndTime) {
    this.createEndTime = createEndTime;
  }


  public BrandCampaignListV30Filter createStartTime(String createStartTime) {
    
    this.createStartTime = createStartTime;
    return this;
  }

   /**
   * 广告组起始创建时间 格式例如：2023-01-01
   * @return createStartTime
  **/
  @javax.annotation.Nullable
  public String getCreateStartTime() {
    return createStartTime;
  }


  public void setCreateStartTime(String createStartTime) {
    this.createStartTime = createStartTime;
  }


  public BrandCampaignListV30Filter endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 广告组截止投放时间 格式例如：2023-01-01
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandCampaignListV30Filter startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 广告组起始投放时间 格式例如：2023-01-01
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCampaignListV30Filter brandCampaignListV30Filter = (BrandCampaignListV30Filter) o;
    return Objects.equals(this.campaignId, brandCampaignListV30Filter.campaignId) &&
        Objects.equals(this.campaignName, brandCampaignListV30Filter.campaignName) &&
        Objects.equals(this.campaignStatus, brandCampaignListV30Filter.campaignStatus) &&
        Objects.equals(this.createEndTime, brandCampaignListV30Filter.createEndTime) &&
        Objects.equals(this.createStartTime, brandCampaignListV30Filter.createStartTime) &&
        Objects.equals(this.endTime, brandCampaignListV30Filter.endTime) &&
        Objects.equals(this.startTime, brandCampaignListV30Filter.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, campaignStatus, createEndTime, createStartTime, endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCampaignListV30Filter {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
    sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_name");
    openapiFields.add("campaign_status");
    openapiFields.add("create_end_time");
    openapiFields.add("create_start_time");
    openapiFields.add("end_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCampaignListV30Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCampaignListV30Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCampaignListV30Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCampaignListV30Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCampaignListV30Filter>() {
           @Override
           public void write(JsonWriter out, BrandCampaignListV30Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCampaignListV30Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCampaignListV30Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCampaignListV30Filter
  * @throws IOException if the JSON string is invalid with respect to BrandCampaignListV30Filter
  */
  public static BrandCampaignListV30Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCampaignListV30Filter.class);
  }

 /**
  * Convert an instance of BrandCampaignListV30Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

