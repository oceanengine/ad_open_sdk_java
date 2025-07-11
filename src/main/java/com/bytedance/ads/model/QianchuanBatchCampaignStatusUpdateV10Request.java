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
import com.bytedance.ads.model.QianchuanBatchCampaignStatusUpdateV10OptStatus;
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
 * QianchuanBatchCampaignStatusUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanBatchCampaignStatusUpdateV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private QianchuanBatchCampaignStatusUpdateV10OptStatus optStatus = null;

  public QianchuanBatchCampaignStatusUpdateV10Request() {
  }

  public QianchuanBatchCampaignStatusUpdateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanBatchCampaignStatusUpdateV10Request campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public QianchuanBatchCampaignStatusUpdateV10Request addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * 
   * @return campaignIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public QianchuanBatchCampaignStatusUpdateV10Request optStatus(QianchuanBatchCampaignStatusUpdateV10OptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nonnull
  public QianchuanBatchCampaignStatusUpdateV10OptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(QianchuanBatchCampaignStatusUpdateV10OptStatus optStatus) {
    this.optStatus = optStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanBatchCampaignStatusUpdateV10Request qianchuanBatchCampaignStatusUpdateV10Request = (QianchuanBatchCampaignStatusUpdateV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanBatchCampaignStatusUpdateV10Request.advertiserId) &&
        Objects.equals(this.campaignIds, qianchuanBatchCampaignStatusUpdateV10Request.campaignIds) &&
        Objects.equals(this.optStatus, qianchuanBatchCampaignStatusUpdateV10Request.optStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignIds, optStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanBatchCampaignStatusUpdateV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
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
    openapiFields.add("campaign_ids");
    openapiFields.add("opt_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("campaign_ids");
    openapiRequiredFields.add("opt_status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanBatchCampaignStatusUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanBatchCampaignStatusUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanBatchCampaignStatusUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanBatchCampaignStatusUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanBatchCampaignStatusUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanBatchCampaignStatusUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanBatchCampaignStatusUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanBatchCampaignStatusUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanBatchCampaignStatusUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanBatchCampaignStatusUpdateV10Request
  */
  public static QianchuanBatchCampaignStatusUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanBatchCampaignStatusUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanBatchCampaignStatusUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

