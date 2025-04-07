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
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10MarketingGoal;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestCreativeSetting;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestDeliverySetting;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestProductChannelInfoInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestProgrammaticCreativeMediaList;
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
 * QianchuanUniAwemeAdCreateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QianchuanUniAwemeAdCreateV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_SETTING = "creative_setting";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SETTING)
  private QianchuanUniAwemeAdCreateV10RequestCreativeSetting creativeSetting = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanUniAwemeAdCreateV10RequestDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanUniAwemeAdCreateV10MarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MULTI_PRODUCT_CREATIVE_LIST = "multi_product_creative_list";
  @SerializedName(SERIALIZED_NAME_MULTI_PRODUCT_CREATIVE_LIST)
  private List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner> multiProductCreativeList = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PRODUCT_CHANNEL_INFO = "product_channel_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CHANNEL_INFO)
  private List<QianchuanUniAwemeAdCreateV10RequestProductChannelInfoInner> productChannelInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST = "programmatic_creative_media_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST)
  private QianchuanUniAwemeAdCreateV10RequestProgrammaticCreativeMediaList programmaticCreativeMediaList = null;

  public QianchuanUniAwemeAdCreateV10Request() {
  }

  public QianchuanUniAwemeAdCreateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanUniAwemeAdCreateV10Request awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号id
   * @return awemeId
  **/
  @javax.annotation.Nonnull
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanUniAwemeAdCreateV10Request creativeSetting(QianchuanUniAwemeAdCreateV10RequestCreativeSetting creativeSetting) {
    
    this.creativeSetting = creativeSetting;
    return this;
  }

   /**
   * Get creativeSetting
   * @return creativeSetting
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdCreateV10RequestCreativeSetting getCreativeSetting() {
    return creativeSetting;
  }


  public void setCreativeSetting(QianchuanUniAwemeAdCreateV10RequestCreativeSetting creativeSetting) {
    this.creativeSetting = creativeSetting;
  }


  public QianchuanUniAwemeAdCreateV10Request deliverySetting(QianchuanUniAwemeAdCreateV10RequestDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nonnull
  public QianchuanUniAwemeAdCreateV10RequestDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanUniAwemeAdCreateV10RequestDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanUniAwemeAdCreateV10Request marketingGoal(QianchuanUniAwemeAdCreateV10MarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanUniAwemeAdCreateV10MarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanUniAwemeAdCreateV10MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanUniAwemeAdCreateV10Request multiProductCreativeList(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner> multiProductCreativeList) {
    
    this.multiProductCreativeList = multiProductCreativeList;
    return this;
  }

  public QianchuanUniAwemeAdCreateV10Request addMultiProductCreativeListItem(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner multiProductCreativeListItem) {
    if (this.multiProductCreativeList == null) {
      this.multiProductCreativeList = new ArrayList<>();
    }
    this.multiProductCreativeList.add(multiProductCreativeListItem);
    return this;
  }

   /**
   * 商品创意素材信息
   * @return multiProductCreativeList
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner> getMultiProductCreativeList() {
    return multiProductCreativeList;
  }


  public void setMultiProductCreativeList(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner> multiProductCreativeList) {
    this.multiProductCreativeList = multiProductCreativeList;
  }


  public QianchuanUniAwemeAdCreateV10Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanUniAwemeAdCreateV10Request productChannelInfo(List<QianchuanUniAwemeAdCreateV10RequestProductChannelInfoInner> productChannelInfo) {
    
    this.productChannelInfo = productChannelInfo;
    return this;
  }

  public QianchuanUniAwemeAdCreateV10Request addProductChannelInfoItem(QianchuanUniAwemeAdCreateV10RequestProductChannelInfoInner productChannelInfoItem) {
    if (this.productChannelInfo == null) {
      this.productChannelInfo = new ArrayList<>();
    }
    this.productChannelInfo.add(productChannelInfoItem);
    return this;
  }

   /**
   * 
   * @return productChannelInfo
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeAdCreateV10RequestProductChannelInfoInner> getProductChannelInfo() {
    return productChannelInfo;
  }


  public void setProductChannelInfo(List<QianchuanUniAwemeAdCreateV10RequestProductChannelInfoInner> productChannelInfo) {
    this.productChannelInfo = productChannelInfo;
  }


  public QianchuanUniAwemeAdCreateV10Request productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public QianchuanUniAwemeAdCreateV10Request addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }


  public QianchuanUniAwemeAdCreateV10Request programmaticCreativeMediaList(QianchuanUniAwemeAdCreateV10RequestProgrammaticCreativeMediaList programmaticCreativeMediaList) {
    
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
    return this;
  }

   /**
   * Get programmaticCreativeMediaList
   * @return programmaticCreativeMediaList
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdCreateV10RequestProgrammaticCreativeMediaList getProgrammaticCreativeMediaList() {
    return programmaticCreativeMediaList;
  }


  public void setProgrammaticCreativeMediaList(QianchuanUniAwemeAdCreateV10RequestProgrammaticCreativeMediaList programmaticCreativeMediaList) {
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniAwemeAdCreateV10Request qianchuanUniAwemeAdCreateV10Request = (QianchuanUniAwemeAdCreateV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanUniAwemeAdCreateV10Request.advertiserId) &&
        Objects.equals(this.awemeId, qianchuanUniAwemeAdCreateV10Request.awemeId) &&
        Objects.equals(this.creativeSetting, qianchuanUniAwemeAdCreateV10Request.creativeSetting) &&
        Objects.equals(this.deliverySetting, qianchuanUniAwemeAdCreateV10Request.deliverySetting) &&
        Objects.equals(this.marketingGoal, qianchuanUniAwemeAdCreateV10Request.marketingGoal) &&
        Objects.equals(this.multiProductCreativeList, qianchuanUniAwemeAdCreateV10Request.multiProductCreativeList) &&
        Objects.equals(this.name, qianchuanUniAwemeAdCreateV10Request.name) &&
        Objects.equals(this.productChannelInfo, qianchuanUniAwemeAdCreateV10Request.productChannelInfo) &&
        Objects.equals(this.productIds, qianchuanUniAwemeAdCreateV10Request.productIds) &&
        Objects.equals(this.programmaticCreativeMediaList, qianchuanUniAwemeAdCreateV10Request.programmaticCreativeMediaList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, awemeId, creativeSetting, deliverySetting, marketingGoal, multiProductCreativeList, name, productChannelInfo, productIds, programmaticCreativeMediaList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdCreateV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    creativeSetting: ").append(toIndentedString(creativeSetting)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    multiProductCreativeList: ").append(toIndentedString(multiProductCreativeList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productChannelInfo: ").append(toIndentedString(productChannelInfo)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    programmaticCreativeMediaList: ").append(toIndentedString(programmaticCreativeMediaList)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("creative_setting");
    openapiFields.add("delivery_setting");
    openapiFields.add("marketing_goal");
    openapiFields.add("multi_product_creative_list");
    openapiFields.add("name");
    openapiFields.add("product_channel_info");
    openapiFields.add("product_ids");
    openapiFields.add("programmatic_creative_media_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("aweme_id");
    openapiRequiredFields.add("delivery_setting");
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAdCreateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdCreateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdCreateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdCreateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdCreateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdCreateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdCreateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdCreateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdCreateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdCreateV10Request
  */
  public static QianchuanUniAwemeAdCreateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdCreateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdCreateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

