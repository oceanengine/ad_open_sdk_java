/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionUpdateV30AutoExtendTraffic;
import com.bytedance.ads.model.PromotionUpdateV30CreativeAutoGenerateSwitch;
import com.bytedance.ads.model.PromotionUpdateV30IsCommentDisable;
import com.bytedance.ads.model.PromotionUpdateV30RequestBrandInfo;
import com.bytedance.ads.model.PromotionUpdateV30RequestKeywordsInner;
import com.bytedance.ads.model.PromotionUpdateV30RequestNativeSetting;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterials;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionRelatedProductInner;
import com.bytedance.ads.model.PromotionUpdateV30RequestShopMultiRoiGoalsInner;
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
 * PromotionUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class PromotionUpdateV30Request {
  public static final String SERIALIZED_NAME_7D_RETENTION = "7d_retention";
  @SerializedName(SERIALIZED_NAME_7D_RETENTION)
  private Double _7dRetention = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TRAFFIC = "auto_extend_traffic";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TRAFFIC)
  private PromotionUpdateV30AutoExtendTraffic autoExtendTraffic = null;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BRAND_INFO = "brand_info";
  @SerializedName(SERIALIZED_NAME_BRAND_INFO)
  private PromotionUpdateV30RequestBrandInfo brandInfo = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH = "creative_auto_generate_switch";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH)
  private PromotionUpdateV30CreativeAutoGenerateSwitch creativeAutoGenerateSwitch = null;

  public static final String SERIALIZED_NAME_DEEP_CPABID = "deep_cpabid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPABID)
  private Double deepCpabid = null;

  public static final String SERIALIZED_NAME_FIRST_ROI_GOAL = "first_roi_goal";
  @SerializedName(SERIALIZED_NAME_FIRST_ROI_GOAL)
  private Double firstRoiGoal = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private PromotionUpdateV30IsCommentDisable isCommentDisable = null;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<PromotionUpdateV30RequestKeywordsInner> keywords = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NATIVE_SETTING = "native_setting";
  @SerializedName(SERIALIZED_NAME_NATIVE_SETTING)
  private PromotionUpdateV30RequestNativeSetting nativeSetting = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_MATERIALS = "promotion_materials";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MATERIALS)
  private PromotionUpdateV30RequestPromotionMaterials promotionMaterials = null;

  public static final String SERIALIZED_NAME_PROMOTION_RELATED_PRODUCT = "promotion_related_product";
  @SerializedName(SERIALIZED_NAME_PROMOTION_RELATED_PRODUCT)
  private List<PromotionUpdateV30RequestPromotionRelatedProductInner> promotionRelatedProduct = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SHOP_MULTI_ROI_GOALS = "shop_multi_roi_goals";
  @SerializedName(SERIALIZED_NAME_SHOP_MULTI_ROI_GOALS)
  private List<PromotionUpdateV30RequestShopMultiRoiGoalsInner> shopMultiRoiGoals = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_UNION_BID_RATIO = "union_bid_ratio";
  @SerializedName(SERIALIZED_NAME_UNION_BID_RATIO)
  private Double unionBidRatio = null;

  public PromotionUpdateV30Request() {
  }

  public PromotionUpdateV30Request _7dRetention(Double _7dRetention) {
    
    this._7dRetention = _7dRetention;
    return this;
  }

   /**
   * 
   * @return _7dRetention
  **/
  @javax.annotation.Nullable
  public Double get7dRetention() {
    return _7dRetention;
  }


  public void set7dRetention(Double _7dRetention) {
    this._7dRetention = _7dRetention;
  }


  public PromotionUpdateV30Request advertiserId(Long advertiserId) {
    
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


  public PromotionUpdateV30Request autoExtendTraffic(PromotionUpdateV30AutoExtendTraffic autoExtendTraffic) {
    
    this.autoExtendTraffic = autoExtendTraffic;
    return this;
  }

   /**
   * Get autoExtendTraffic
   * @return autoExtendTraffic
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30AutoExtendTraffic getAutoExtendTraffic() {
    return autoExtendTraffic;
  }


  public void setAutoExtendTraffic(PromotionUpdateV30AutoExtendTraffic autoExtendTraffic) {
    this.autoExtendTraffic = autoExtendTraffic;
  }


  public PromotionUpdateV30Request bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public PromotionUpdateV30Request brandInfo(PromotionUpdateV30RequestBrandInfo brandInfo) {
    
    this.brandInfo = brandInfo;
    return this;
  }

   /**
   * Get brandInfo
   * @return brandInfo
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30RequestBrandInfo getBrandInfo() {
    return brandInfo;
  }


  public void setBrandInfo(PromotionUpdateV30RequestBrandInfo brandInfo) {
    this.brandInfo = brandInfo;
  }


  public PromotionUpdateV30Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public PromotionUpdateV30Request configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   * 
   * @return configId
  **/
  @javax.annotation.Nullable
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public PromotionUpdateV30Request cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public PromotionUpdateV30Request creativeAutoGenerateSwitch(PromotionUpdateV30CreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

   /**
   * Get creativeAutoGenerateSwitch
   * @return creativeAutoGenerateSwitch
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30CreativeAutoGenerateSwitch getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }


  public void setCreativeAutoGenerateSwitch(PromotionUpdateV30CreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }


  public PromotionUpdateV30Request deepCpabid(Double deepCpabid) {
    
    this.deepCpabid = deepCpabid;
    return this;
  }

   /**
   * 
   * @return deepCpabid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpabid() {
    return deepCpabid;
  }


  public void setDeepCpabid(Double deepCpabid) {
    this.deepCpabid = deepCpabid;
  }


  public PromotionUpdateV30Request firstRoiGoal(Double firstRoiGoal) {
    
    this.firstRoiGoal = firstRoiGoal;
    return this;
  }

   /**
   * 
   * @return firstRoiGoal
  **/
  @javax.annotation.Nullable
  public Double getFirstRoiGoal() {
    return firstRoiGoal;
  }


  public void setFirstRoiGoal(Double firstRoiGoal) {
    this.firstRoiGoal = firstRoiGoal;
  }


  public PromotionUpdateV30Request isCommentDisable(PromotionUpdateV30IsCommentDisable isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * Get isCommentDisable
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30IsCommentDisable getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(PromotionUpdateV30IsCommentDisable isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public PromotionUpdateV30Request keywords(List<PromotionUpdateV30RequestKeywordsInner> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public PromotionUpdateV30Request addKeywordsItem(PromotionUpdateV30RequestKeywordsInner keywordsItem) {
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
  public List<PromotionUpdateV30RequestKeywordsInner> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<PromotionUpdateV30RequestKeywordsInner> keywords) {
    this.keywords = keywords;
  }


  public PromotionUpdateV30Request name(String name) {
    
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


  public PromotionUpdateV30Request nativeSetting(PromotionUpdateV30RequestNativeSetting nativeSetting) {
    
    this.nativeSetting = nativeSetting;
    return this;
  }

   /**
   * Get nativeSetting
   * @return nativeSetting
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30RequestNativeSetting getNativeSetting() {
    return nativeSetting;
  }


  public void setNativeSetting(PromotionUpdateV30RequestNativeSetting nativeSetting) {
    this.nativeSetting = nativeSetting;
  }


  public PromotionUpdateV30Request promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return promotionId
  **/
  @javax.annotation.Nonnull
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public PromotionUpdateV30Request promotionMaterials(PromotionUpdateV30RequestPromotionMaterials promotionMaterials) {
    
    this.promotionMaterials = promotionMaterials;
    return this;
  }

   /**
   * Get promotionMaterials
   * @return promotionMaterials
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30RequestPromotionMaterials getPromotionMaterials() {
    return promotionMaterials;
  }


  public void setPromotionMaterials(PromotionUpdateV30RequestPromotionMaterials promotionMaterials) {
    this.promotionMaterials = promotionMaterials;
  }


  public PromotionUpdateV30Request promotionRelatedProduct(List<PromotionUpdateV30RequestPromotionRelatedProductInner> promotionRelatedProduct) {
    
    this.promotionRelatedProduct = promotionRelatedProduct;
    return this;
  }

  public PromotionUpdateV30Request addPromotionRelatedProductItem(PromotionUpdateV30RequestPromotionRelatedProductInner promotionRelatedProductItem) {
    if (this.promotionRelatedProduct == null) {
      this.promotionRelatedProduct = new ArrayList<>();
    }
    this.promotionRelatedProduct.add(promotionRelatedProductItem);
    return this;
  }

   /**
   * 
   * @return promotionRelatedProduct
  **/
  @javax.annotation.Nullable
  public List<PromotionUpdateV30RequestPromotionRelatedProductInner> getPromotionRelatedProduct() {
    return promotionRelatedProduct;
  }


  public void setPromotionRelatedProduct(List<PromotionUpdateV30RequestPromotionRelatedProductInner> promotionRelatedProduct) {
    this.promotionRelatedProduct = promotionRelatedProduct;
  }


  public PromotionUpdateV30Request roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public PromotionUpdateV30Request shopMultiRoiGoals(List<PromotionUpdateV30RequestShopMultiRoiGoalsInner> shopMultiRoiGoals) {
    
    this.shopMultiRoiGoals = shopMultiRoiGoals;
    return this;
  }

  public PromotionUpdateV30Request addShopMultiRoiGoalsItem(PromotionUpdateV30RequestShopMultiRoiGoalsInner shopMultiRoiGoalsItem) {
    if (this.shopMultiRoiGoals == null) {
      this.shopMultiRoiGoals = new ArrayList<>();
    }
    this.shopMultiRoiGoals.add(shopMultiRoiGoalsItem);
    return this;
  }

   /**
   * 
   * @return shopMultiRoiGoals
  **/
  @javax.annotation.Nullable
  public List<PromotionUpdateV30RequestShopMultiRoiGoalsInner> getShopMultiRoiGoals() {
    return shopMultiRoiGoals;
  }


  public void setShopMultiRoiGoals(List<PromotionUpdateV30RequestShopMultiRoiGoalsInner> shopMultiRoiGoals) {
    this.shopMultiRoiGoals = shopMultiRoiGoals;
  }


  public PromotionUpdateV30Request source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public PromotionUpdateV30Request unionBidRatio(Double unionBidRatio) {
    
    this.unionBidRatio = unionBidRatio;
    return this;
  }

   /**
   * 
   * @return unionBidRatio
  **/
  @javax.annotation.Nullable
  public Double getUnionBidRatio() {
    return unionBidRatio;
  }


  public void setUnionBidRatio(Double unionBidRatio) {
    this.unionBidRatio = unionBidRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30Request promotionUpdateV30Request = (PromotionUpdateV30Request) o;
    return Objects.equals(this._7dRetention, promotionUpdateV30Request._7dRetention) &&
        Objects.equals(this.advertiserId, promotionUpdateV30Request.advertiserId) &&
        Objects.equals(this.autoExtendTraffic, promotionUpdateV30Request.autoExtendTraffic) &&
        Objects.equals(this.bid, promotionUpdateV30Request.bid) &&
        Objects.equals(this.brandInfo, promotionUpdateV30Request.brandInfo) &&
        Objects.equals(this.budget, promotionUpdateV30Request.budget) &&
        Objects.equals(this.configId, promotionUpdateV30Request.configId) &&
        Objects.equals(this.cpaBid, promotionUpdateV30Request.cpaBid) &&
        Objects.equals(this.creativeAutoGenerateSwitch, promotionUpdateV30Request.creativeAutoGenerateSwitch) &&
        Objects.equals(this.deepCpabid, promotionUpdateV30Request.deepCpabid) &&
        Objects.equals(this.firstRoiGoal, promotionUpdateV30Request.firstRoiGoal) &&
        Objects.equals(this.isCommentDisable, promotionUpdateV30Request.isCommentDisable) &&
        Objects.equals(this.keywords, promotionUpdateV30Request.keywords) &&
        Objects.equals(this.name, promotionUpdateV30Request.name) &&
        Objects.equals(this.nativeSetting, promotionUpdateV30Request.nativeSetting) &&
        Objects.equals(this.promotionId, promotionUpdateV30Request.promotionId) &&
        Objects.equals(this.promotionMaterials, promotionUpdateV30Request.promotionMaterials) &&
        Objects.equals(this.promotionRelatedProduct, promotionUpdateV30Request.promotionRelatedProduct) &&
        Objects.equals(this.roiGoal, promotionUpdateV30Request.roiGoal) &&
        Objects.equals(this.shopMultiRoiGoals, promotionUpdateV30Request.shopMultiRoiGoals) &&
        Objects.equals(this.source, promotionUpdateV30Request.source) &&
        Objects.equals(this.unionBidRatio, promotionUpdateV30Request.unionBidRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_7dRetention, advertiserId, autoExtendTraffic, bid, brandInfo, budget, configId, cpaBid, creativeAutoGenerateSwitch, deepCpabid, firstRoiGoal, isCommentDisable, keywords, name, nativeSetting, promotionId, promotionMaterials, promotionRelatedProduct, roiGoal, shopMultiRoiGoals, source, unionBidRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30Request {\n");
    sb.append("    _7dRetention: ").append(toIndentedString(_7dRetention)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoExtendTraffic: ").append(toIndentedString(autoExtendTraffic)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    brandInfo: ").append(toIndentedString(brandInfo)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    creativeAutoGenerateSwitch: ").append(toIndentedString(creativeAutoGenerateSwitch)).append("\n");
    sb.append("    deepCpabid: ").append(toIndentedString(deepCpabid)).append("\n");
    sb.append("    firstRoiGoal: ").append(toIndentedString(firstRoiGoal)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nativeSetting: ").append(toIndentedString(nativeSetting)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionMaterials: ").append(toIndentedString(promotionMaterials)).append("\n");
    sb.append("    promotionRelatedProduct: ").append(toIndentedString(promotionRelatedProduct)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    shopMultiRoiGoals: ").append(toIndentedString(shopMultiRoiGoals)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    unionBidRatio: ").append(toIndentedString(unionBidRatio)).append("\n");
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
    openapiFields.add("7d_retention");
    openapiFields.add("advertiser_id");
    openapiFields.add("auto_extend_traffic");
    openapiFields.add("bid");
    openapiFields.add("brand_info");
    openapiFields.add("budget");
    openapiFields.add("config_id");
    openapiFields.add("cpa_bid");
    openapiFields.add("creative_auto_generate_switch");
    openapiFields.add("deep_cpabid");
    openapiFields.add("first_roi_goal");
    openapiFields.add("is_comment_disable");
    openapiFields.add("keywords");
    openapiFields.add("name");
    openapiFields.add("native_setting");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_materials");
    openapiFields.add("promotion_related_product");
    openapiFields.add("roi_goal");
    openapiFields.add("shop_multi_roi_goals");
    openapiFields.add("source");
    openapiFields.add("union_bid_ratio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("promotion_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30Request
  */
  public static PromotionUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30Request.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

