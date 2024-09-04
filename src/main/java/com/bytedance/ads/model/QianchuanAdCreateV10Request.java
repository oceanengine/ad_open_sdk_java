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
import com.bytedance.ads.model.QianchuanAdCreateV10CampaignScene;
import com.bytedance.ads.model.QianchuanAdCreateV10CreativeAutoGenerate;
import com.bytedance.ads.model.QianchuanAdCreateV10CreativeMaterialMode;
import com.bytedance.ads.model.QianchuanAdCreateV10DynamicCreative;
import com.bytedance.ads.model.QianchuanAdCreateV10IsHomepageHide;
import com.bytedance.ads.model.QianchuanAdCreateV10IsIntelligent;
import com.bytedance.ads.model.QianchuanAdCreateV10LabAdType;
import com.bytedance.ads.model.QianchuanAdCreateV10MarketingGoal;
import com.bytedance.ads.model.QianchuanAdCreateV10MarketingScene;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestAudience;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestChannelProductInfosInner;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestCreativeListInner;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestDeliverySetting;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestKeywordsInner;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestMultiProductCreativeListInner;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestProgrammaticCreativeCard;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestProgrammaticCreativeMediaListInner;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestTrackUrl;
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
 * QianchuanAdCreateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10Request {
  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private QianchuanAdCreateV10RequestAudience audience = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_BRAND_ID = "brand_id";
  @SerializedName(SERIALIZED_NAME_BRAND_ID)
  private Long brandId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_SCENE = "campaign_scene";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SCENE)
  private QianchuanAdCreateV10CampaignScene campaignScene = null;

  public static final String SERIALIZED_NAME_CHANNEL_PRODUCT_INFOS = "channel_product_infos";
  @SerializedName(SERIALIZED_NAME_CHANNEL_PRODUCT_INFOS)
  private List<QianchuanAdCreateV10RequestChannelProductInfosInner> channelProductInfos = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE = "creative_auto_generate";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE)
  private QianchuanAdCreateV10CreativeAutoGenerate creativeAutoGenerate = null;

  public static final String SERIALIZED_NAME_CREATIVE_LIST = "creative_list";
  @SerializedName(SERIALIZED_NAME_CREATIVE_LIST)
  private List<QianchuanAdCreateV10RequestCreativeListInner> creativeList = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODE = "creative_material_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODE)
  private QianchuanAdCreateV10CreativeMaterialMode creativeMaterialMode = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanAdCreateV10RequestDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE = "dynamic_creative";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE)
  private QianchuanAdCreateV10DynamicCreative dynamicCreative = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_ID = "first_industry_id";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_ID)
  private Long firstIndustryId = null;

  public static final String SERIALIZED_NAME_IS_HOMEPAGE_HIDE = "is_homepage_hide";
  @SerializedName(SERIALIZED_NAME_IS_HOMEPAGE_HIDE)
  private QianchuanAdCreateV10IsHomepageHide isHomepageHide = null;

  public static final String SERIALIZED_NAME_IS_INTELLIGENT = "is_intelligent";
  @SerializedName(SERIALIZED_NAME_IS_INTELLIGENT)
  private QianchuanAdCreateV10IsIntelligent isIntelligent = null;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<QianchuanAdCreateV10RequestKeywordsInner> keywords = null;

  public static final String SERIALIZED_NAME_LAB_AD_TYPE = "lab_ad_type";
  @SerializedName(SERIALIZED_NAME_LAB_AD_TYPE)
  private QianchuanAdCreateV10LabAdType labAdType = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAdCreateV10MarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanAdCreateV10MarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_MULTI_PRODUCT_CREATIVE_LIST = "multi_product_creative_list";
  @SerializedName(SERIALIZED_NAME_MULTI_PRODUCT_CREATIVE_LIST)
  private List<QianchuanAdCreateV10RequestMultiProductCreativeListInner> multiProductCreativeList = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD = "programmatic_creative_card";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_CARD)
  private QianchuanAdCreateV10RequestProgrammaticCreativeCard programmaticCreativeCard = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST = "programmatic_creative_media_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST)
  private List<QianchuanAdCreateV10RequestProgrammaticCreativeMediaListInner> programmaticCreativeMediaList = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST = "programmatic_creative_title_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_TITLE_LIST)
  private List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner> programmaticCreativeTitleList = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Long secondIndustryId = null;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private Long shopId = null;

  public static final String SERIALIZED_NAME_THIRD_INDUSTRY_ID = "third_industry_id";
  @SerializedName(SERIALIZED_NAME_THIRD_INDUSTRY_ID)
  private Long thirdIndustryId = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private QianchuanAdCreateV10RequestTrackUrl trackUrl = null;

  public QianchuanAdCreateV10Request() {
  }

  public QianchuanAdCreateV10Request adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public QianchuanAdCreateV10Request addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public QianchuanAdCreateV10Request advertiserId(Long advertiserId) {
    
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


  public QianchuanAdCreateV10Request audience(QianchuanAdCreateV10RequestAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestAudience getAudience() {
    return audience;
  }


  public void setAudience(QianchuanAdCreateV10RequestAudience audience) {
    this.audience = audience;
  }


  public QianchuanAdCreateV10Request awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAdCreateV10Request brandId(Long brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 
   * @return brandId
  **/
  @javax.annotation.Nullable
  public Long getBrandId() {
    return brandId;
  }


  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }


  public QianchuanAdCreateV10Request campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public QianchuanAdCreateV10Request campaignScene(QianchuanAdCreateV10CampaignScene campaignScene) {
    
    this.campaignScene = campaignScene;
    return this;
  }

   /**
   * Get campaignScene
   * @return campaignScene
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10CampaignScene getCampaignScene() {
    return campaignScene;
  }


  public void setCampaignScene(QianchuanAdCreateV10CampaignScene campaignScene) {
    this.campaignScene = campaignScene;
  }


  public QianchuanAdCreateV10Request channelProductInfos(List<QianchuanAdCreateV10RequestChannelProductInfosInner> channelProductInfos) {
    
    this.channelProductInfos = channelProductInfos;
    return this;
  }

  public QianchuanAdCreateV10Request addChannelProductInfosItem(QianchuanAdCreateV10RequestChannelProductInfosInner channelProductInfosItem) {
    if (this.channelProductInfos == null) {
      this.channelProductInfos = new ArrayList<>();
    }
    this.channelProductInfos.add(channelProductInfosItem);
    return this;
  }

   /**
   * 
   * @return channelProductInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestChannelProductInfosInner> getChannelProductInfos() {
    return channelProductInfos;
  }


  public void setChannelProductInfos(List<QianchuanAdCreateV10RequestChannelProductInfosInner> channelProductInfos) {
    this.channelProductInfos = channelProductInfos;
  }


  public QianchuanAdCreateV10Request creativeAutoGenerate(QianchuanAdCreateV10CreativeAutoGenerate creativeAutoGenerate) {
    
    this.creativeAutoGenerate = creativeAutoGenerate;
    return this;
  }

   /**
   * Get creativeAutoGenerate
   * @return creativeAutoGenerate
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10CreativeAutoGenerate getCreativeAutoGenerate() {
    return creativeAutoGenerate;
  }


  public void setCreativeAutoGenerate(QianchuanAdCreateV10CreativeAutoGenerate creativeAutoGenerate) {
    this.creativeAutoGenerate = creativeAutoGenerate;
  }


  public QianchuanAdCreateV10Request creativeList(List<QianchuanAdCreateV10RequestCreativeListInner> creativeList) {
    
    this.creativeList = creativeList;
    return this;
  }

  public QianchuanAdCreateV10Request addCreativeListItem(QianchuanAdCreateV10RequestCreativeListInner creativeListItem) {
    if (this.creativeList == null) {
      this.creativeList = new ArrayList<>();
    }
    this.creativeList.add(creativeListItem);
    return this;
  }

   /**
   * 
   * @return creativeList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestCreativeListInner> getCreativeList() {
    return creativeList;
  }


  public void setCreativeList(List<QianchuanAdCreateV10RequestCreativeListInner> creativeList) {
    this.creativeList = creativeList;
  }


  public QianchuanAdCreateV10Request creativeMaterialMode(QianchuanAdCreateV10CreativeMaterialMode creativeMaterialMode) {
    
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * Get creativeMaterialMode
   * @return creativeMaterialMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10CreativeMaterialMode getCreativeMaterialMode() {
    return creativeMaterialMode;
  }


  public void setCreativeMaterialMode(QianchuanAdCreateV10CreativeMaterialMode creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }


  public QianchuanAdCreateV10Request deliverySetting(QianchuanAdCreateV10RequestDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10RequestDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanAdCreateV10RequestDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanAdCreateV10Request dynamicCreative(QianchuanAdCreateV10DynamicCreative dynamicCreative) {
    
    this.dynamicCreative = dynamicCreative;
    return this;
  }

   /**
   * Get dynamicCreative
   * @return dynamicCreative
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10DynamicCreative getDynamicCreative() {
    return dynamicCreative;
  }


  public void setDynamicCreative(QianchuanAdCreateV10DynamicCreative dynamicCreative) {
    this.dynamicCreative = dynamicCreative;
  }


  public QianchuanAdCreateV10Request firstIndustryId(Long firstIndustryId) {
    
    this.firstIndustryId = firstIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return firstIndustryId
  **/
  @javax.annotation.Nullable
  public Long getFirstIndustryId() {
    return firstIndustryId;
  }


  public void setFirstIndustryId(Long firstIndustryId) {
    this.firstIndustryId = firstIndustryId;
  }


  public QianchuanAdCreateV10Request isHomepageHide(QianchuanAdCreateV10IsHomepageHide isHomepageHide) {
    
    this.isHomepageHide = isHomepageHide;
    return this;
  }

   /**
   * Get isHomepageHide
   * @return isHomepageHide
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10IsHomepageHide getIsHomepageHide() {
    return isHomepageHide;
  }


  public void setIsHomepageHide(QianchuanAdCreateV10IsHomepageHide isHomepageHide) {
    this.isHomepageHide = isHomepageHide;
  }


  public QianchuanAdCreateV10Request isIntelligent(QianchuanAdCreateV10IsIntelligent isIntelligent) {
    
    this.isIntelligent = isIntelligent;
    return this;
  }

   /**
   * Get isIntelligent
   * @return isIntelligent
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10IsIntelligent getIsIntelligent() {
    return isIntelligent;
  }


  public void setIsIntelligent(QianchuanAdCreateV10IsIntelligent isIntelligent) {
    this.isIntelligent = isIntelligent;
  }


  public QianchuanAdCreateV10Request keywords(List<QianchuanAdCreateV10RequestKeywordsInner> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public QianchuanAdCreateV10Request addKeywordsItem(QianchuanAdCreateV10RequestKeywordsInner keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * 
   * @return keywords
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestKeywordsInner> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<QianchuanAdCreateV10RequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }


  public QianchuanAdCreateV10Request labAdType(QianchuanAdCreateV10LabAdType labAdType) {
    
    this.labAdType = labAdType;
    return this;
  }

   /**
   * Get labAdType
   * @return labAdType
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10LabAdType getLabAdType() {
    return labAdType;
  }


  public void setLabAdType(QianchuanAdCreateV10LabAdType labAdType) {
    this.labAdType = labAdType;
  }


  public QianchuanAdCreateV10Request marketingGoal(QianchuanAdCreateV10MarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10MarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAdCreateV10MarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanAdCreateV10Request marketingScene(QianchuanAdCreateV10MarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10MarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanAdCreateV10MarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanAdCreateV10Request multiProductCreativeList(List<QianchuanAdCreateV10RequestMultiProductCreativeListInner> multiProductCreativeList) {
    
    this.multiProductCreativeList = multiProductCreativeList;
    return this;
  }

  public QianchuanAdCreateV10Request addMultiProductCreativeListItem(QianchuanAdCreateV10RequestMultiProductCreativeListInner multiProductCreativeListItem) {
    if (this.multiProductCreativeList == null) {
      this.multiProductCreativeList = new ArrayList<>();
    }
    this.multiProductCreativeList.add(multiProductCreativeListItem);
    return this;
  }

   /**
   * 
   * @return multiProductCreativeList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestMultiProductCreativeListInner> getMultiProductCreativeList() {
    return multiProductCreativeList;
  }


  public void setMultiProductCreativeList(List<QianchuanAdCreateV10RequestMultiProductCreativeListInner> multiProductCreativeList) {
    this.multiProductCreativeList = multiProductCreativeList;
  }


  public QianchuanAdCreateV10Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanAdCreateV10Request productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public QianchuanAdCreateV10Request addProductIdsItem(Long productIdsItem) {
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


  public QianchuanAdCreateV10Request programmaticCreativeCard(QianchuanAdCreateV10RequestProgrammaticCreativeCard programmaticCreativeCard) {
    
    this.programmaticCreativeCard = programmaticCreativeCard;
    return this;
  }

   /**
   * Get programmaticCreativeCard
   * @return programmaticCreativeCard
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestProgrammaticCreativeCard getProgrammaticCreativeCard() {
    return programmaticCreativeCard;
  }


  public void setProgrammaticCreativeCard(QianchuanAdCreateV10RequestProgrammaticCreativeCard programmaticCreativeCard) {
    this.programmaticCreativeCard = programmaticCreativeCard;
  }


  public QianchuanAdCreateV10Request programmaticCreativeMediaList(List<QianchuanAdCreateV10RequestProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
    return this;
  }

  public QianchuanAdCreateV10Request addProgrammaticCreativeMediaListItem(QianchuanAdCreateV10RequestProgrammaticCreativeMediaListInner programmaticCreativeMediaListItem) {
    if (this.programmaticCreativeMediaList == null) {
      this.programmaticCreativeMediaList = new ArrayList<>();
    }
    this.programmaticCreativeMediaList.add(programmaticCreativeMediaListItem);
    return this;
  }

   /**
   * 
   * @return programmaticCreativeMediaList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestProgrammaticCreativeMediaListInner> getProgrammaticCreativeMediaList() {
    return programmaticCreativeMediaList;
  }


  public void setProgrammaticCreativeMediaList(List<QianchuanAdCreateV10RequestProgrammaticCreativeMediaListInner> programmaticCreativeMediaList) {
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
  }


  public QianchuanAdCreateV10Request programmaticCreativeTitleList(List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
    
    this.programmaticCreativeTitleList = programmaticCreativeTitleList;
    return this;
  }

  public QianchuanAdCreateV10Request addProgrammaticCreativeTitleListItem(QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner programmaticCreativeTitleListItem) {
    if (this.programmaticCreativeTitleList == null) {
      this.programmaticCreativeTitleList = new ArrayList<>();
    }
    this.programmaticCreativeTitleList.add(programmaticCreativeTitleListItem);
    return this;
  }

   /**
   * 
   * @return programmaticCreativeTitleList
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner> getProgrammaticCreativeTitleList() {
    return programmaticCreativeTitleList;
  }


  public void setProgrammaticCreativeTitleList(List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner> programmaticCreativeTitleList) {
    this.programmaticCreativeTitleList = programmaticCreativeTitleList;
  }


  public QianchuanAdCreateV10Request secondIndustryId(Long secondIndustryId) {
    
    this.secondIndustryId = secondIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return secondIndustryId
  **/
  @javax.annotation.Nullable
  public Long getSecondIndustryId() {
    return secondIndustryId;
  }


  public void setSecondIndustryId(Long secondIndustryId) {
    this.secondIndustryId = secondIndustryId;
  }


  public QianchuanAdCreateV10Request shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 
   * @return shopId
  **/
  @javax.annotation.Nullable
  public Long getShopId() {
    return shopId;
  }


  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public QianchuanAdCreateV10Request thirdIndustryId(Long thirdIndustryId) {
    
    this.thirdIndustryId = thirdIndustryId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return thirdIndustryId
  **/
  @javax.annotation.Nullable
  public Long getThirdIndustryId() {
    return thirdIndustryId;
  }


  public void setThirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
  }


  public QianchuanAdCreateV10Request trackUrl(QianchuanAdCreateV10RequestTrackUrl trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

   /**
   * Get trackUrl
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestTrackUrl getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(QianchuanAdCreateV10RequestTrackUrl trackUrl) {
    this.trackUrl = trackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10Request qianchuanAdCreateV10Request = (QianchuanAdCreateV10Request) o;
    return Objects.equals(this.adKeywords, qianchuanAdCreateV10Request.adKeywords) &&
        Objects.equals(this.advertiserId, qianchuanAdCreateV10Request.advertiserId) &&
        Objects.equals(this.audience, qianchuanAdCreateV10Request.audience) &&
        Objects.equals(this.awemeId, qianchuanAdCreateV10Request.awemeId) &&
        Objects.equals(this.brandId, qianchuanAdCreateV10Request.brandId) &&
        Objects.equals(this.campaignId, qianchuanAdCreateV10Request.campaignId) &&
        Objects.equals(this.campaignScene, qianchuanAdCreateV10Request.campaignScene) &&
        Objects.equals(this.channelProductInfos, qianchuanAdCreateV10Request.channelProductInfos) &&
        Objects.equals(this.creativeAutoGenerate, qianchuanAdCreateV10Request.creativeAutoGenerate) &&
        Objects.equals(this.creativeList, qianchuanAdCreateV10Request.creativeList) &&
        Objects.equals(this.creativeMaterialMode, qianchuanAdCreateV10Request.creativeMaterialMode) &&
        Objects.equals(this.deliverySetting, qianchuanAdCreateV10Request.deliverySetting) &&
        Objects.equals(this.dynamicCreative, qianchuanAdCreateV10Request.dynamicCreative) &&
        Objects.equals(this.firstIndustryId, qianchuanAdCreateV10Request.firstIndustryId) &&
        Objects.equals(this.isHomepageHide, qianchuanAdCreateV10Request.isHomepageHide) &&
        Objects.equals(this.isIntelligent, qianchuanAdCreateV10Request.isIntelligent) &&
        Objects.equals(this.keywords, qianchuanAdCreateV10Request.keywords) &&
        Objects.equals(this.labAdType, qianchuanAdCreateV10Request.labAdType) &&
        Objects.equals(this.marketingGoal, qianchuanAdCreateV10Request.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanAdCreateV10Request.marketingScene) &&
        Objects.equals(this.multiProductCreativeList, qianchuanAdCreateV10Request.multiProductCreativeList) &&
        Objects.equals(this.name, qianchuanAdCreateV10Request.name) &&
        Objects.equals(this.productIds, qianchuanAdCreateV10Request.productIds) &&
        Objects.equals(this.programmaticCreativeCard, qianchuanAdCreateV10Request.programmaticCreativeCard) &&
        Objects.equals(this.programmaticCreativeMediaList, qianchuanAdCreateV10Request.programmaticCreativeMediaList) &&
        Objects.equals(this.programmaticCreativeTitleList, qianchuanAdCreateV10Request.programmaticCreativeTitleList) &&
        Objects.equals(this.secondIndustryId, qianchuanAdCreateV10Request.secondIndustryId) &&
        Objects.equals(this.shopId, qianchuanAdCreateV10Request.shopId) &&
        Objects.equals(this.thirdIndustryId, qianchuanAdCreateV10Request.thirdIndustryId) &&
        Objects.equals(this.trackUrl, qianchuanAdCreateV10Request.trackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeywords, advertiserId, audience, awemeId, brandId, campaignId, campaignScene, channelProductInfos, creativeAutoGenerate, creativeList, creativeMaterialMode, deliverySetting, dynamicCreative, firstIndustryId, isHomepageHide, isIntelligent, keywords, labAdType, marketingGoal, marketingScene, multiProductCreativeList, name, productIds, programmaticCreativeCard, programmaticCreativeMediaList, programmaticCreativeTitleList, secondIndustryId, shopId, thirdIndustryId, trackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10Request {\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignScene: ").append(toIndentedString(campaignScene)).append("\n");
    sb.append("    channelProductInfos: ").append(toIndentedString(channelProductInfos)).append("\n");
    sb.append("    creativeAutoGenerate: ").append(toIndentedString(creativeAutoGenerate)).append("\n");
    sb.append("    creativeList: ").append(toIndentedString(creativeList)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    dynamicCreative: ").append(toIndentedString(dynamicCreative)).append("\n");
    sb.append("    firstIndustryId: ").append(toIndentedString(firstIndustryId)).append("\n");
    sb.append("    isHomepageHide: ").append(toIndentedString(isHomepageHide)).append("\n");
    sb.append("    isIntelligent: ").append(toIndentedString(isIntelligent)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    labAdType: ").append(toIndentedString(labAdType)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    multiProductCreativeList: ").append(toIndentedString(multiProductCreativeList)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    programmaticCreativeCard: ").append(toIndentedString(programmaticCreativeCard)).append("\n");
    sb.append("    programmaticCreativeMediaList: ").append(toIndentedString(programmaticCreativeMediaList)).append("\n");
    sb.append("    programmaticCreativeTitleList: ").append(toIndentedString(programmaticCreativeTitleList)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    thirdIndustryId: ").append(toIndentedString(thirdIndustryId)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
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
    openapiFields.add("ad_keywords");
    openapiFields.add("advertiser_id");
    openapiFields.add("audience");
    openapiFields.add("aweme_id");
    openapiFields.add("brand_id");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_scene");
    openapiFields.add("channel_product_infos");
    openapiFields.add("creative_auto_generate");
    openapiFields.add("creative_list");
    openapiFields.add("creative_material_mode");
    openapiFields.add("delivery_setting");
    openapiFields.add("dynamic_creative");
    openapiFields.add("first_industry_id");
    openapiFields.add("is_homepage_hide");
    openapiFields.add("is_intelligent");
    openapiFields.add("keywords");
    openapiFields.add("lab_ad_type");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("multi_product_creative_list");
    openapiFields.add("name");
    openapiFields.add("product_ids");
    openapiFields.add("programmatic_creative_card");
    openapiFields.add("programmatic_creative_media_list");
    openapiFields.add("programmatic_creative_title_list");
    openapiFields.add("second_industry_id");
    openapiFields.add("shop_id");
    openapiFields.add("third_industry_id");
    openapiFields.add("track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("delivery_setting");
    openapiRequiredFields.add("marketing_goal");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10Request
  */
  public static QianchuanAdCreateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

