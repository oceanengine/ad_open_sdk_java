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
import com.bytedance.ads.model.ToolsMicroGameUpdateV30AgeLimit;
import com.bytedance.ads.model.ToolsMicroGameUpdateV30MaxPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroGameUpdateV30MidPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroGameUpdateV30MinPaymentTierRange;
import com.bytedance.ads.model.ToolsMicroGameUpdateV30RequestGameLinkInner;
import com.bytedance.ads.model.ToolsMicroGameUpdateV30RevenueModel;
import com.bytedance.ads.model.ToolsMicroGameUpdateV30ScheduleCards;
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
 * ToolsMicroGameUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsMicroGameUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AGE_LIMIT = "age_limit";
  @SerializedName(SERIALIZED_NAME_AGE_LIMIT)
  private ToolsMicroGameUpdateV30AgeLimit ageLimit = null;

  public static final String SERIALIZED_NAME_ART_STYLE = "art_style";
  @SerializedName(SERIALIZED_NAME_ART_STYLE)
  private String artStyle = null;

  public static final String SERIALIZED_NAME_DISCOUNT_RATE = "discount_rate";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_RATE)
  private Long discountRate = null;

  public static final String SERIALIZED_NAME_FEATURE_TAGS = "feature_tags";
  @SerializedName(SERIALIZED_NAME_FEATURE_TAGS)
  private List<String> featureTags = null;

  public static final String SERIALIZED_NAME_GAME_LINK = "game_link";
  @SerializedName(SERIALIZED_NAME_GAME_LINK)
  private List<ToolsMicroGameUpdateV30RequestGameLinkInner> gameLink = null;

  public static final String SERIALIZED_NAME_HAS_DISCOUNT = "has_discount";
  @SerializedName(SERIALIZED_NAME_HAS_DISCOUNT)
  private Boolean hasDiscount = null;

  public static final String SERIALIZED_NAME_HAS_ONLINE_EARNING = "has_online_earning";
  @SerializedName(SERIALIZED_NAME_HAS_ONLINE_EARNING)
  private Boolean hasOnlineEarning = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction = null;

  public static final String SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE = "max_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MAX_PAYMENT_TIER_RANGE)
  private ToolsMicroGameUpdateV30MaxPaymentTierRange maxPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE = "mid_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MID_PAYMENT_TIER_RANGE)
  private ToolsMicroGameUpdateV30MidPaymentTierRange midPaymentTierRange = null;

  public static final String SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE = "min_payment_tier_range";
  @SerializedName(SERIALIZED_NAME_MIN_PAYMENT_TIER_RANGE)
  private ToolsMicroGameUpdateV30MinPaymentTierRange minPaymentTierRange = null;

  public static final String SERIALIZED_NAME_NETWORK_ENVIRONMENT = "network_environment";
  @SerializedName(SERIALIZED_NAME_NETWORK_ENVIRONMENT)
  private List<String> networkEnvironment = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_REVENUE_MODEL = "revenue_model";
  @SerializedName(SERIALIZED_NAME_REVENUE_MODEL)
  private ToolsMicroGameUpdateV30RevenueModel revenueModel = null;

  public static final String SERIALIZED_NAME_SCHEDULE_CARDS = "schedule_cards";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_CARDS)
  private List<ToolsMicroGameUpdateV30ScheduleCards> scheduleCards = null;

  public static final String SERIALIZED_NAME_TAG_INFO = "tag_info";
  @SerializedName(SERIALIZED_NAME_TAG_INFO)
  private String tagInfo = null;

  public static final String SERIALIZED_NAME_THEME_TAG = "theme_tag";
  @SerializedName(SERIALIZED_NAME_THEME_TAG)
  private String themeTag = null;

  public ToolsMicroGameUpdateV30Request() {
  }

  public ToolsMicroGameUpdateV30Request advertiserId(Long advertiserId) {
    
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


  public ToolsMicroGameUpdateV30Request ageLimit(ToolsMicroGameUpdateV30AgeLimit ageLimit) {
    
    this.ageLimit = ageLimit;
    return this;
  }

   /**
   * Get ageLimit
   * @return ageLimit
  **/
  @javax.annotation.Nonnull
  public ToolsMicroGameUpdateV30AgeLimit getAgeLimit() {
    return ageLimit;
  }


  public void setAgeLimit(ToolsMicroGameUpdateV30AgeLimit ageLimit) {
    this.ageLimit = ageLimit;
  }


  public ToolsMicroGameUpdateV30Request artStyle(String artStyle) {
    
    this.artStyle = artStyle;
    return this;
  }

   /**
   * 
   * @return artStyle
  **/
  @javax.annotation.Nonnull
  public String getArtStyle() {
    return artStyle;
  }


  public void setArtStyle(String artStyle) {
    this.artStyle = artStyle;
  }


  public ToolsMicroGameUpdateV30Request discountRate(Long discountRate) {
    
    this.discountRate = discountRate;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 100
   * @return discountRate
  **/
  @javax.annotation.Nullable
  public Long getDiscountRate() {
    return discountRate;
  }


  public void setDiscountRate(Long discountRate) {
    this.discountRate = discountRate;
  }


  public ToolsMicroGameUpdateV30Request featureTags(List<String> featureTags) {
    
    this.featureTags = featureTags;
    return this;
  }

  public ToolsMicroGameUpdateV30Request addFeatureTagsItem(String featureTagsItem) {
    if (this.featureTags == null) {
      this.featureTags = new ArrayList<>();
    }
    this.featureTags.add(featureTagsItem);
    return this;
  }

   /**
   * 
   * @return featureTags
  **/
  @javax.annotation.Nonnull
  public List<String> getFeatureTags() {
    return featureTags;
  }


  public void setFeatureTags(List<String> featureTags) {
    this.featureTags = featureTags;
  }


  public ToolsMicroGameUpdateV30Request gameLink(List<ToolsMicroGameUpdateV30RequestGameLinkInner> gameLink) {
    
    this.gameLink = gameLink;
    return this;
  }

  public ToolsMicroGameUpdateV30Request addGameLinkItem(ToolsMicroGameUpdateV30RequestGameLinkInner gameLinkItem) {
    if (this.gameLink == null) {
      this.gameLink = new ArrayList<>();
    }
    this.gameLink.add(gameLinkItem);
    return this;
  }

   /**
   * 
   * @return gameLink
  **/
  @javax.annotation.Nonnull
  public List<ToolsMicroGameUpdateV30RequestGameLinkInner> getGameLink() {
    return gameLink;
  }


  public void setGameLink(List<ToolsMicroGameUpdateV30RequestGameLinkInner> gameLink) {
    this.gameLink = gameLink;
  }


  public ToolsMicroGameUpdateV30Request hasDiscount(Boolean hasDiscount) {
    
    this.hasDiscount = hasDiscount;
    return this;
  }

   /**
   * 
   * @return hasDiscount
  **/
  @javax.annotation.Nullable
  public Boolean getHasDiscount() {
    return hasDiscount;
  }


  public void setHasDiscount(Boolean hasDiscount) {
    this.hasDiscount = hasDiscount;
  }


  public ToolsMicroGameUpdateV30Request hasOnlineEarning(Boolean hasOnlineEarning) {
    
    this.hasOnlineEarning = hasOnlineEarning;
    return this;
  }

   /**
   * 
   * @return hasOnlineEarning
  **/
  @javax.annotation.Nullable
  public Boolean getHasOnlineEarning() {
    return hasOnlineEarning;
  }


  public void setHasOnlineEarning(Boolean hasOnlineEarning) {
    this.hasOnlineEarning = hasOnlineEarning;
  }


  public ToolsMicroGameUpdateV30Request instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsMicroGameUpdateV30Request introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 
   * @return introduction
  **/
  @javax.annotation.Nonnull
  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ToolsMicroGameUpdateV30Request maxPaymentTierRange(ToolsMicroGameUpdateV30MaxPaymentTierRange maxPaymentTierRange) {
    
    this.maxPaymentTierRange = maxPaymentTierRange;
    return this;
  }

   /**
   * Get maxPaymentTierRange
   * @return maxPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroGameUpdateV30MaxPaymentTierRange getMaxPaymentTierRange() {
    return maxPaymentTierRange;
  }


  public void setMaxPaymentTierRange(ToolsMicroGameUpdateV30MaxPaymentTierRange maxPaymentTierRange) {
    this.maxPaymentTierRange = maxPaymentTierRange;
  }


  public ToolsMicroGameUpdateV30Request midPaymentTierRange(ToolsMicroGameUpdateV30MidPaymentTierRange midPaymentTierRange) {
    
    this.midPaymentTierRange = midPaymentTierRange;
    return this;
  }

   /**
   * Get midPaymentTierRange
   * @return midPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroGameUpdateV30MidPaymentTierRange getMidPaymentTierRange() {
    return midPaymentTierRange;
  }


  public void setMidPaymentTierRange(ToolsMicroGameUpdateV30MidPaymentTierRange midPaymentTierRange) {
    this.midPaymentTierRange = midPaymentTierRange;
  }


  public ToolsMicroGameUpdateV30Request minPaymentTierRange(ToolsMicroGameUpdateV30MinPaymentTierRange minPaymentTierRange) {
    
    this.minPaymentTierRange = minPaymentTierRange;
    return this;
  }

   /**
   * Get minPaymentTierRange
   * @return minPaymentTierRange
  **/
  @javax.annotation.Nullable
  public ToolsMicroGameUpdateV30MinPaymentTierRange getMinPaymentTierRange() {
    return minPaymentTierRange;
  }


  public void setMinPaymentTierRange(ToolsMicroGameUpdateV30MinPaymentTierRange minPaymentTierRange) {
    this.minPaymentTierRange = minPaymentTierRange;
  }


  public ToolsMicroGameUpdateV30Request networkEnvironment(List<String> networkEnvironment) {
    
    this.networkEnvironment = networkEnvironment;
    return this;
  }

  public ToolsMicroGameUpdateV30Request addNetworkEnvironmentItem(String networkEnvironmentItem) {
    if (this.networkEnvironment == null) {
      this.networkEnvironment = new ArrayList<>();
    }
    this.networkEnvironment.add(networkEnvironmentItem);
    return this;
  }

   /**
   * 
   * @return networkEnvironment
  **/
  @javax.annotation.Nonnull
  public List<String> getNetworkEnvironment() {
    return networkEnvironment;
  }


  public void setNetworkEnvironment(List<String> networkEnvironment) {
    this.networkEnvironment = networkEnvironment;
  }


  public ToolsMicroGameUpdateV30Request remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsMicroGameUpdateV30Request revenueModel(ToolsMicroGameUpdateV30RevenueModel revenueModel) {
    
    this.revenueModel = revenueModel;
    return this;
  }

   /**
   * Get revenueModel
   * @return revenueModel
  **/
  @javax.annotation.Nonnull
  public ToolsMicroGameUpdateV30RevenueModel getRevenueModel() {
    return revenueModel;
  }


  public void setRevenueModel(ToolsMicroGameUpdateV30RevenueModel revenueModel) {
    this.revenueModel = revenueModel;
  }


  public ToolsMicroGameUpdateV30Request scheduleCards(List<ToolsMicroGameUpdateV30ScheduleCards> scheduleCards) {
    
    this.scheduleCards = scheduleCards;
    return this;
  }

  public ToolsMicroGameUpdateV30Request addScheduleCardsItem(ToolsMicroGameUpdateV30ScheduleCards scheduleCardsItem) {
    if (this.scheduleCards == null) {
      this.scheduleCards = new ArrayList<>();
    }
    this.scheduleCards.add(scheduleCardsItem);
    return this;
  }

   /**
   * 
   * @return scheduleCards
  **/
  @javax.annotation.Nullable
  public List<ToolsMicroGameUpdateV30ScheduleCards> getScheduleCards() {
    return scheduleCards;
  }


  public void setScheduleCards(List<ToolsMicroGameUpdateV30ScheduleCards> scheduleCards) {
    this.scheduleCards = scheduleCards;
  }


  public ToolsMicroGameUpdateV30Request tagInfo(String tagInfo) {
    
    this.tagInfo = tagInfo;
    return this;
  }

   /**
   * 
   * @return tagInfo
  **/
  @javax.annotation.Nonnull
  public String getTagInfo() {
    return tagInfo;
  }


  public void setTagInfo(String tagInfo) {
    this.tagInfo = tagInfo;
  }


  public ToolsMicroGameUpdateV30Request themeTag(String themeTag) {
    
    this.themeTag = themeTag;
    return this;
  }

   /**
   * 
   * @return themeTag
  **/
  @javax.annotation.Nonnull
  public String getThemeTag() {
    return themeTag;
  }


  public void setThemeTag(String themeTag) {
    this.themeTag = themeTag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroGameUpdateV30Request toolsMicroGameUpdateV30Request = (ToolsMicroGameUpdateV30Request) o;
    return Objects.equals(this.advertiserId, toolsMicroGameUpdateV30Request.advertiserId) &&
        Objects.equals(this.ageLimit, toolsMicroGameUpdateV30Request.ageLimit) &&
        Objects.equals(this.artStyle, toolsMicroGameUpdateV30Request.artStyle) &&
        Objects.equals(this.discountRate, toolsMicroGameUpdateV30Request.discountRate) &&
        Objects.equals(this.featureTags, toolsMicroGameUpdateV30Request.featureTags) &&
        Objects.equals(this.gameLink, toolsMicroGameUpdateV30Request.gameLink) &&
        Objects.equals(this.hasDiscount, toolsMicroGameUpdateV30Request.hasDiscount) &&
        Objects.equals(this.hasOnlineEarning, toolsMicroGameUpdateV30Request.hasOnlineEarning) &&
        Objects.equals(this.instanceId, toolsMicroGameUpdateV30Request.instanceId) &&
        Objects.equals(this.introduction, toolsMicroGameUpdateV30Request.introduction) &&
        Objects.equals(this.maxPaymentTierRange, toolsMicroGameUpdateV30Request.maxPaymentTierRange) &&
        Objects.equals(this.midPaymentTierRange, toolsMicroGameUpdateV30Request.midPaymentTierRange) &&
        Objects.equals(this.minPaymentTierRange, toolsMicroGameUpdateV30Request.minPaymentTierRange) &&
        Objects.equals(this.networkEnvironment, toolsMicroGameUpdateV30Request.networkEnvironment) &&
        Objects.equals(this.remark, toolsMicroGameUpdateV30Request.remark) &&
        Objects.equals(this.revenueModel, toolsMicroGameUpdateV30Request.revenueModel) &&
        Objects.equals(this.scheduleCards, toolsMicroGameUpdateV30Request.scheduleCards) &&
        Objects.equals(this.tagInfo, toolsMicroGameUpdateV30Request.tagInfo) &&
        Objects.equals(this.themeTag, toolsMicroGameUpdateV30Request.themeTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, ageLimit, artStyle, discountRate, featureTags, gameLink, hasDiscount, hasOnlineEarning, instanceId, introduction, maxPaymentTierRange, midPaymentTierRange, minPaymentTierRange, networkEnvironment, remark, revenueModel, scheduleCards, tagInfo, themeTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroGameUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    ageLimit: ").append(toIndentedString(ageLimit)).append("\n");
    sb.append("    artStyle: ").append(toIndentedString(artStyle)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    featureTags: ").append(toIndentedString(featureTags)).append("\n");
    sb.append("    gameLink: ").append(toIndentedString(gameLink)).append("\n");
    sb.append("    hasDiscount: ").append(toIndentedString(hasDiscount)).append("\n");
    sb.append("    hasOnlineEarning: ").append(toIndentedString(hasOnlineEarning)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    maxPaymentTierRange: ").append(toIndentedString(maxPaymentTierRange)).append("\n");
    sb.append("    midPaymentTierRange: ").append(toIndentedString(midPaymentTierRange)).append("\n");
    sb.append("    minPaymentTierRange: ").append(toIndentedString(minPaymentTierRange)).append("\n");
    sb.append("    networkEnvironment: ").append(toIndentedString(networkEnvironment)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    revenueModel: ").append(toIndentedString(revenueModel)).append("\n");
    sb.append("    scheduleCards: ").append(toIndentedString(scheduleCards)).append("\n");
    sb.append("    tagInfo: ").append(toIndentedString(tagInfo)).append("\n");
    sb.append("    themeTag: ").append(toIndentedString(themeTag)).append("\n");
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
    openapiFields.add("age_limit");
    openapiFields.add("art_style");
    openapiFields.add("discount_rate");
    openapiFields.add("feature_tags");
    openapiFields.add("game_link");
    openapiFields.add("has_discount");
    openapiFields.add("has_online_earning");
    openapiFields.add("instance_id");
    openapiFields.add("introduction");
    openapiFields.add("max_payment_tier_range");
    openapiFields.add("mid_payment_tier_range");
    openapiFields.add("min_payment_tier_range");
    openapiFields.add("network_environment");
    openapiFields.add("remark");
    openapiFields.add("revenue_model");
    openapiFields.add("schedule_cards");
    openapiFields.add("tag_info");
    openapiFields.add("theme_tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("age_limit");
    openapiRequiredFields.add("art_style");
    openapiRequiredFields.add("feature_tags");
    openapiRequiredFields.add("game_link");
    openapiRequiredFields.add("instance_id");
    openapiRequiredFields.add("introduction");
    openapiRequiredFields.add("network_environment");
    openapiRequiredFields.add("revenue_model");
    openapiRequiredFields.add("tag_info");
    openapiRequiredFields.add("theme_tag");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroGameUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroGameUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroGameUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroGameUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroGameUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsMicroGameUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroGameUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroGameUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroGameUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroGameUpdateV30Request
  */
  public static ToolsMicroGameUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroGameUpdateV30Request.class);
  }

 /**
  * Convert an instance of ToolsMicroGameUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

