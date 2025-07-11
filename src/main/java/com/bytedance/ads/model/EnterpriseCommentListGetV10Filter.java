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
import com.bytedance.ads.model.EnterpriseCommentListGetV10FilterEmotion;
import com.bytedance.ads.model.EnterpriseCommentListGetV10FilterItemType;
import com.bytedance.ads.model.EnterpriseCommentListGetV10FilterLevel;
import com.bytedance.ads.model.EnterpriseCommentListGetV10FilterReplyStatusByEDouyin;
import com.bytedance.ads.model.EnterpriseCommentListGetV10FilterSource;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EnterpriseCommentListGetV10Filter {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private List<Long> adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private List<Long> advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private List<Long> campaignId = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private List<Long> creativeId = null;

  public static final String SERIALIZED_NAME_EMOTION = "emotion";
  @SerializedName(SERIALIZED_NAME_EMOTION)
  private EnterpriseCommentListGetV10FilterEmotion emotion = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private List<Long> itemId = null;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private EnterpriseCommentListGetV10FilterItemType itemType = null;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private EnterpriseCommentListGetV10FilterLevel level = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_REPLY_STATUS_BY_E_DOUYIN = "reply_status_by_e_douyin";
  @SerializedName(SERIALIZED_NAME_REPLY_STATUS_BY_E_DOUYIN)
  private EnterpriseCommentListGetV10FilterReplyStatusByEDouyin replyStatusByEDouyin = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private EnterpriseCommentListGetV10FilterSource source = null;

  public EnterpriseCommentListGetV10Filter() {
  }

  public EnterpriseCommentListGetV10Filter adId(List<Long> adId) {
    
    this.adId = adId;
    return this;
  }

  public EnterpriseCommentListGetV10Filter addAdIdItem(Long adIdItem) {
    if (this.adId == null) {
      this.adId = new ArrayList<>();
    }
    this.adId.add(adIdItem);
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public List<Long> getAdId() {
    return adId;
  }


  public void setAdId(List<Long> adId) {
    this.adId = adId;
  }


  public EnterpriseCommentListGetV10Filter advertiserId(List<Long> advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

  public EnterpriseCommentListGetV10Filter addAdvertiserIdItem(Long advertiserIdItem) {
    if (this.advertiserId == null) {
      this.advertiserId = new ArrayList<>();
    }
    this.advertiserId.add(advertiserIdItem);
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(List<Long> advertiserId) {
    this.advertiserId = advertiserId;
  }


  public EnterpriseCommentListGetV10Filter campaignId(List<Long> campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

  public EnterpriseCommentListGetV10Filter addCampaignIdItem(Long campaignIdItem) {
    if (this.campaignId == null) {
      this.campaignId = new ArrayList<>();
    }
    this.campaignId.add(campaignIdItem);
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(List<Long> campaignId) {
    this.campaignId = campaignId;
  }


  public EnterpriseCommentListGetV10Filter content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public EnterpriseCommentListGetV10Filter creativeId(List<Long> creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

  public EnterpriseCommentListGetV10Filter addCreativeIdItem(Long creativeIdItem) {
    if (this.creativeId == null) {
      this.creativeId = new ArrayList<>();
    }
    this.creativeId.add(creativeIdItem);
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(List<Long> creativeId) {
    this.creativeId = creativeId;
  }


  public EnterpriseCommentListGetV10Filter emotion(EnterpriseCommentListGetV10FilterEmotion emotion) {
    
    this.emotion = emotion;
    return this;
  }

   /**
   * Get emotion
   * @return emotion
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentListGetV10FilterEmotion getEmotion() {
    return emotion;
  }


  public void setEmotion(EnterpriseCommentListGetV10FilterEmotion emotion) {
    this.emotion = emotion;
  }


  public EnterpriseCommentListGetV10Filter itemId(List<Long> itemId) {
    
    this.itemId = itemId;
    return this;
  }

  public EnterpriseCommentListGetV10Filter addItemIdItem(Long itemIdItem) {
    if (this.itemId == null) {
      this.itemId = new ArrayList<>();
    }
    this.itemId.add(itemIdItem);
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public List<Long> getItemId() {
    return itemId;
  }


  public void setItemId(List<Long> itemId) {
    this.itemId = itemId;
  }


  public EnterpriseCommentListGetV10Filter itemType(EnterpriseCommentListGetV10FilterItemType itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentListGetV10FilterItemType getItemType() {
    return itemType;
  }


  public void setItemType(EnterpriseCommentListGetV10FilterItemType itemType) {
    this.itemType = itemType;
  }


  public EnterpriseCommentListGetV10Filter level(EnterpriseCommentListGetV10FilterLevel level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentListGetV10FilterLevel getLevel() {
    return level;
  }


  public void setLevel(EnterpriseCommentListGetV10FilterLevel level) {
    this.level = level;
  }


  public EnterpriseCommentListGetV10Filter materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public EnterpriseCommentListGetV10Filter replyStatusByEDouyin(EnterpriseCommentListGetV10FilterReplyStatusByEDouyin replyStatusByEDouyin) {
    
    this.replyStatusByEDouyin = replyStatusByEDouyin;
    return this;
  }

   /**
   * Get replyStatusByEDouyin
   * @return replyStatusByEDouyin
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentListGetV10FilterReplyStatusByEDouyin getReplyStatusByEDouyin() {
    return replyStatusByEDouyin;
  }


  public void setReplyStatusByEDouyin(EnterpriseCommentListGetV10FilterReplyStatusByEDouyin replyStatusByEDouyin) {
    this.replyStatusByEDouyin = replyStatusByEDouyin;
  }


  public EnterpriseCommentListGetV10Filter source(EnterpriseCommentListGetV10FilterSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentListGetV10FilterSource getSource() {
    return source;
  }


  public void setSource(EnterpriseCommentListGetV10FilterSource source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseCommentListGetV10Filter enterpriseCommentListGetV10Filter = (EnterpriseCommentListGetV10Filter) o;
    return Objects.equals(this.adId, enterpriseCommentListGetV10Filter.adId) &&
        Objects.equals(this.advertiserId, enterpriseCommentListGetV10Filter.advertiserId) &&
        Objects.equals(this.campaignId, enterpriseCommentListGetV10Filter.campaignId) &&
        Objects.equals(this.content, enterpriseCommentListGetV10Filter.content) &&
        Objects.equals(this.creativeId, enterpriseCommentListGetV10Filter.creativeId) &&
        Objects.equals(this.emotion, enterpriseCommentListGetV10Filter.emotion) &&
        Objects.equals(this.itemId, enterpriseCommentListGetV10Filter.itemId) &&
        Objects.equals(this.itemType, enterpriseCommentListGetV10Filter.itemType) &&
        Objects.equals(this.level, enterpriseCommentListGetV10Filter.level) &&
        Objects.equals(this.materialId, enterpriseCommentListGetV10Filter.materialId) &&
        Objects.equals(this.replyStatusByEDouyin, enterpriseCommentListGetV10Filter.replyStatusByEDouyin) &&
        Objects.equals(this.source, enterpriseCommentListGetV10Filter.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, campaignId, content, creativeId, emotion, itemId, itemType, level, materialId, replyStatusByEDouyin, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentListGetV10Filter {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    replyStatusByEDouyin: ").append(toIndentedString(replyStatusByEDouyin)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("creative_id");
    openapiFields.add("emotion");
    openapiFields.add("item_id");
    openapiFields.add("item_type");
    openapiFields.add("level");
    openapiFields.add("material_id");
    openapiFields.add("reply_status_by_e_douyin");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentListGetV10Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentListGetV10Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentListGetV10Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentListGetV10Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentListGetV10Filter>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentListGetV10Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentListGetV10Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentListGetV10Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentListGetV10Filter
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentListGetV10Filter
  */
  public static EnterpriseCommentListGetV10Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentListGetV10Filter.class);
  }

 /**
  * Convert an instance of EnterpriseCommentListGetV10Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

