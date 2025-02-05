/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCampaignListV30DataCampaignsCampaignStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * BrandCampaignListV30ResponseDataCampaignsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class BrandCampaignListV30ResponseDataCampaignsInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_STATUS = "campaign_status";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_STATUS)
  private BrandCampaignListV30DataCampaignsCampaignStatus campaignStatus = null;

  public static final String SERIALIZED_NAME_CART_ID = "cart_id";
  @SerializedName(SERIALIZED_NAME_CART_ID)
  private Long cartId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MAIN_CONTRACT_ID = "main_contract_id";
  @SerializedName(SERIALIZED_NAME_MAIN_CONTRACT_ID)
  private String mainContractId = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TOTAL_SELL_PRICE = "total_sell_price";
  @SerializedName(SERIALIZED_NAME_TOTAL_SELL_PRICE)
  private String totalSellPrice = null;

  public BrandCampaignListV30ResponseDataCampaignsInner() {
  }

  public BrandCampaignListV30ResponseDataCampaignsInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner campaignName(String campaignName) {
    
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


  public BrandCampaignListV30ResponseDataCampaignsInner campaignStatus(BrandCampaignListV30DataCampaignsCampaignStatus campaignStatus) {
    
    this.campaignStatus = campaignStatus;
    return this;
  }

   /**
   * Get campaignStatus
   * @return campaignStatus
  **/
  @javax.annotation.Nullable
  public BrandCampaignListV30DataCampaignsCampaignStatus getCampaignStatus() {
    return campaignStatus;
  }


  public void setCampaignStatus(BrandCampaignListV30DataCampaignsCampaignStatus campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner cartId(Long cartId) {
    
    this.cartId = cartId;
    return this;
  }

   /**
   * 排期ID
   * @return cartId
  **/
  @javax.annotation.Nullable
  public Long getCartId() {
    return cartId;
  }


  public void setCartId(Long cartId) {
    this.cartId = cartId;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 广告组创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投放结束时间 \&quot;2020-03-01\&quot;
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner mainContractId(String mainContractId) {
    
    this.mainContractId = mainContractId;
    return this;
  }

   /**
   * 合同ID
   * @return mainContractId
  **/
  @javax.annotation.Nullable
  public String getMainContractId() {
    return mainContractId;
  }


  public void setMainContractId(String mainContractId) {
    this.mainContractId = mainContractId;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投放开始时间 \&quot;2020-03-01\&quot;
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public BrandCampaignListV30ResponseDataCampaignsInner totalSellPrice(String totalSellPrice) {
    
    this.totalSellPrice = totalSellPrice;
    return this;
  }

   /**
   * 总金额 单位元
   * @return totalSellPrice
  **/
  @javax.annotation.Nullable
  public String getTotalSellPrice() {
    return totalSellPrice;
  }


  public void setTotalSellPrice(String totalSellPrice) {
    this.totalSellPrice = totalSellPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCampaignListV30ResponseDataCampaignsInner brandCampaignListV30ResponseDataCampaignsInner = (BrandCampaignListV30ResponseDataCampaignsInner) o;
    return Objects.equals(this.advertiserId, brandCampaignListV30ResponseDataCampaignsInner.advertiserId) &&
        Objects.equals(this.campaignId, brandCampaignListV30ResponseDataCampaignsInner.campaignId) &&
        Objects.equals(this.campaignName, brandCampaignListV30ResponseDataCampaignsInner.campaignName) &&
        Objects.equals(this.campaignStatus, brandCampaignListV30ResponseDataCampaignsInner.campaignStatus) &&
        Objects.equals(this.cartId, brandCampaignListV30ResponseDataCampaignsInner.cartId) &&
        Objects.equals(this.createTime, brandCampaignListV30ResponseDataCampaignsInner.createTime) &&
        Objects.equals(this.endTime, brandCampaignListV30ResponseDataCampaignsInner.endTime) &&
        Objects.equals(this.mainContractId, brandCampaignListV30ResponseDataCampaignsInner.mainContractId) &&
        Objects.equals(this.startTime, brandCampaignListV30ResponseDataCampaignsInner.startTime) &&
        Objects.equals(this.totalSellPrice, brandCampaignListV30ResponseDataCampaignsInner.totalSellPrice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignId, campaignName, campaignStatus, cartId, createTime, endTime, mainContractId, startTime, totalSellPrice);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCampaignListV30ResponseDataCampaignsInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    mainContractId: ").append(toIndentedString(mainContractId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalSellPrice: ").append(toIndentedString(totalSellPrice)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_name");
    openapiFields.add("campaign_status");
    openapiFields.add("cart_id");
    openapiFields.add("create_time");
    openapiFields.add("end_time");
    openapiFields.add("main_contract_id");
    openapiFields.add("start_time");
    openapiFields.add("total_sell_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCampaignListV30ResponseDataCampaignsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCampaignListV30ResponseDataCampaignsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCampaignListV30ResponseDataCampaignsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCampaignListV30ResponseDataCampaignsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCampaignListV30ResponseDataCampaignsInner>() {
           @Override
           public void write(JsonWriter out, BrandCampaignListV30ResponseDataCampaignsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCampaignListV30ResponseDataCampaignsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCampaignListV30ResponseDataCampaignsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCampaignListV30ResponseDataCampaignsInner
  * @throws IOException if the JSON string is invalid with respect to BrandCampaignListV30ResponseDataCampaignsInner
  */
  public static BrandCampaignListV30ResponseDataCampaignsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCampaignListV30ResponseDataCampaignsInner.class);
  }

 /**
  * Convert an instance of BrandCampaignListV30ResponseDataCampaignsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

