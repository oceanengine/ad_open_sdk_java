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
 * BrandAdUpdateBaseInfoV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandAdUpdateBaseInfoV30Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public BrandAdUpdateBaseInfoV30Request() {
  }

  public BrandAdUpdateBaseInfoV30Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public BrandAdUpdateBaseInfoV30Request advertiserId(Long advertiserId) {
    
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


  public BrandAdUpdateBaseInfoV30Request campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组ID
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public BrandAdUpdateBaseInfoV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 计划名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandAdUpdateBaseInfoV30Request remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 计划备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdUpdateBaseInfoV30Request brandAdUpdateBaseInfoV30Request = (BrandAdUpdateBaseInfoV30Request) o;
    return Objects.equals(this.adId, brandAdUpdateBaseInfoV30Request.adId) &&
        Objects.equals(this.advertiserId, brandAdUpdateBaseInfoV30Request.advertiserId) &&
        Objects.equals(this.campaignId, brandAdUpdateBaseInfoV30Request.campaignId) &&
        Objects.equals(this.name, brandAdUpdateBaseInfoV30Request.name) &&
        Objects.equals(this.remark, brandAdUpdateBaseInfoV30Request.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, campaignId, name, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAdUpdateBaseInfoV30Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("campaign_id");
    openapiFields.add("name");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("campaign_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdUpdateBaseInfoV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdUpdateBaseInfoV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdUpdateBaseInfoV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdUpdateBaseInfoV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdUpdateBaseInfoV30Request>() {
           @Override
           public void write(JsonWriter out, BrandAdUpdateBaseInfoV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdUpdateBaseInfoV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdUpdateBaseInfoV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdUpdateBaseInfoV30Request
  * @throws IOException if the JSON string is invalid with respect to BrandAdUpdateBaseInfoV30Request
  */
  public static BrandAdUpdateBaseInfoV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdUpdateBaseInfoV30Request.class);
  }

 /**
  * Convert an instance of BrandAdUpdateBaseInfoV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

