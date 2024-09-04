/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * BrandCampaignCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class BrandCampaignCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_MAIN_CONTRACT_ID = "main_contract_id";
  @SerializedName(SERIALIZED_NAME_MAIN_CONTRACT_ID)
  private String mainContractId = null;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private Long staffId = null;

  public BrandCampaignCreateV30Request() {
  }

  public BrandCampaignCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BrandCampaignCreateV30Request campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 广告组名称
   * @return campaignName
  **/
  @javax.annotation.Nonnull
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public BrandCampaignCreateV30Request mainContractId(String mainContractId) {
    
    this.mainContractId = mainContractId;
    return this;
  }

   /**
   * 合同ID
   * @return mainContractId
  **/
  @javax.annotation.Nonnull
  public String getMainContractId() {
    return mainContractId;
  }


  public void setMainContractId(String mainContractId) {
    this.mainContractId = mainContractId;
  }


  public BrandCampaignCreateV30Request staffId(Long staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * 代理商员工id
   * @return staffId
  **/
  @javax.annotation.Nullable
  public Long getStaffId() {
    return staffId;
  }


  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCampaignCreateV30Request brandCampaignCreateV30Request = (BrandCampaignCreateV30Request) o;
    return Objects.equals(this.advertiserId, brandCampaignCreateV30Request.advertiserId) &&
        Objects.equals(this.campaignName, brandCampaignCreateV30Request.campaignName) &&
        Objects.equals(this.mainContractId, brandCampaignCreateV30Request.mainContractId) &&
        Objects.equals(this.staffId, brandCampaignCreateV30Request.staffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignName, mainContractId, staffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCampaignCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    mainContractId: ").append(toIndentedString(mainContractId)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
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
    openapiFields.add("campaign_name");
    openapiFields.add("main_contract_id");
    openapiFields.add("staff_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("campaign_name");
    openapiRequiredFields.add("main_contract_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCampaignCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCampaignCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCampaignCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCampaignCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCampaignCreateV30Request>() {
           @Override
           public void write(JsonWriter out, BrandCampaignCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCampaignCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCampaignCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCampaignCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to BrandCampaignCreateV30Request
  */
  public static BrandCampaignCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCampaignCreateV30Request.class);
  }

 /**
  * Convert an instance of BrandCampaignCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

