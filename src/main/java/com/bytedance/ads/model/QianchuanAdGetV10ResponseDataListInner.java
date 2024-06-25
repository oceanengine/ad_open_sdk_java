/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdGetV10DataListCampaignScene;
import com.bytedance.ads.model.QianchuanAdGetV10DataListLabAdType;
import com.bytedance.ads.model.QianchuanAdGetV10DataListMarketingGoal;
import com.bytedance.ads.model.QianchuanAdGetV10DataListMarketingScene;
import com.bytedance.ads.model.QianchuanAdGetV10DataListOptStatus;
import com.bytedance.ads.model.QianchuanAdGetV10DataListStatus;
import com.bytedance.ads.model.QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner;
import com.bytedance.ads.model.QianchuanAdGetV10ResponseDataListInnerDeliverySetting;
import com.bytedance.ads.model.QianchuanAdGetV10ResponseDataListInnerProductInfoInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * QianchuanAdGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class QianchuanAdGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_CREATE_TIME = "ad_create_time";
  @SerializedName(SERIALIZED_NAME_AD_CREATE_TIME)
  private String adCreateTime = null;

  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_MODIFY_TIME = "ad_modify_time";
  @SerializedName(SERIALIZED_NAME_AD_MODIFY_TIME)
  private String adModifyTime = null;

  public static final String SERIALIZED_NAME_AWEME_INFO = "aweme_info";
  @SerializedName(SERIALIZED_NAME_AWEME_INFO)
  private List<QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner> awemeInfo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_SCENE = "campaign_scene";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SCENE)
  private QianchuanAdGetV10DataListCampaignScene campaignScene = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanAdGetV10ResponseDataListInnerDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE = "grab_first_screen_bid_adjust_rate";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE)
  private Long grabFirstScreenBidAdjustRate = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH = "grab_first_screen_switch";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH)
  private Boolean grabFirstScreenSwitch = null;

  public static final String SERIALIZED_NAME_LAB_AD_TYPE = "lab_ad_type";
  @SerializedName(SERIALIZED_NAME_LAB_AD_TYPE)
  private QianchuanAdGetV10DataListLabAdType labAdType = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAdGetV10DataListMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanAdGetV10DataListMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private QianchuanAdGetV10DataListOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private List<QianchuanAdGetV10ResponseDataListInnerProductInfoInner> productInfo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanAdGetV10DataListStatus status = null;

  public QianchuanAdGetV10ResponseDataListInner() {
  }

  public QianchuanAdGetV10ResponseDataListInner adCreateTime(String adCreateTime) {
    
    this.adCreateTime = adCreateTime;
    return this;
  }

   /**
   * 
   * @return adCreateTime
  **/
  @javax.annotation.Nullable
  public String getAdCreateTime() {
    return adCreateTime;
  }


  public void setAdCreateTime(String adCreateTime) {
    this.adCreateTime = adCreateTime;
  }


  public QianchuanAdGetV10ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAdGetV10ResponseDataListInner adModifyTime(String adModifyTime) {
    
    this.adModifyTime = adModifyTime;
    return this;
  }

   /**
   * 
   * @return adModifyTime
  **/
  @javax.annotation.Nullable
  public String getAdModifyTime() {
    return adModifyTime;
  }


  public void setAdModifyTime(String adModifyTime) {
    this.adModifyTime = adModifyTime;
  }


  public QianchuanAdGetV10ResponseDataListInner awemeInfo(List<QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner> awemeInfo) {
    
    this.awemeInfo = awemeInfo;
    return this;
  }

  public QianchuanAdGetV10ResponseDataListInner addAwemeInfoItem(QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner awemeInfoItem) {
    if (this.awemeInfo == null) {
      this.awemeInfo = new ArrayList<>();
    }
    this.awemeInfo.add(awemeInfoItem);
    return this;
  }

   /**
   * 
   * @return awemeInfo
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner> getAwemeInfo() {
    return awemeInfo;
  }


  public void setAwemeInfo(List<QianchuanAdGetV10ResponseDataListInnerAwemeInfoInner> awemeInfo) {
    this.awemeInfo = awemeInfo;
  }


  public QianchuanAdGetV10ResponseDataListInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public QianchuanAdGetV10ResponseDataListInner campaignScene(QianchuanAdGetV10DataListCampaignScene campaignScene) {
    
    this.campaignScene = campaignScene;
    return this;
  }

   /**
   * Get campaignScene
   * @return campaignScene
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListCampaignScene getCampaignScene() {
    return campaignScene;
  }


  public void setCampaignScene(QianchuanAdGetV10DataListCampaignScene campaignScene) {
    this.campaignScene = campaignScene;
  }


  public QianchuanAdGetV10ResponseDataListInner deliverySetting(QianchuanAdGetV10ResponseDataListInnerDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10ResponseDataListInnerDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanAdGetV10ResponseDataListInnerDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanAdGetV10ResponseDataListInner grabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
    return this;
  }

   /**
   * 抢首屏ROI目标降低幅度
   * @return grabFirstScreenBidAdjustRate
  **/
  @javax.annotation.Nullable
  public Long getGrabFirstScreenBidAdjustRate() {
    return grabFirstScreenBidAdjustRate;
  }


  public void setGrabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
  }


  public QianchuanAdGetV10ResponseDataListInner grabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
    return this;
  }

   /**
   * 抢首屏开关
   * @return grabFirstScreenSwitch
  **/
  @javax.annotation.Nullable
  public Boolean getGrabFirstScreenSwitch() {
    return grabFirstScreenSwitch;
  }


  public void setGrabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
  }


  public QianchuanAdGetV10ResponseDataListInner labAdType(QianchuanAdGetV10DataListLabAdType labAdType) {
    
    this.labAdType = labAdType;
    return this;
  }

   /**
   * Get labAdType
   * @return labAdType
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListLabAdType getLabAdType() {
    return labAdType;
  }


  public void setLabAdType(QianchuanAdGetV10DataListLabAdType labAdType) {
    this.labAdType = labAdType;
  }


  public QianchuanAdGetV10ResponseDataListInner marketingGoal(QianchuanAdGetV10DataListMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAdGetV10DataListMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanAdGetV10ResponseDataListInner marketingScene(QianchuanAdGetV10DataListMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanAdGetV10DataListMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanAdGetV10ResponseDataListInner name(String name) {
    
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


  public QianchuanAdGetV10ResponseDataListInner optStatus(QianchuanAdGetV10DataListOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(QianchuanAdGetV10DataListOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public QianchuanAdGetV10ResponseDataListInner productInfo(List<QianchuanAdGetV10ResponseDataListInnerProductInfoInner> productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

  public QianchuanAdGetV10ResponseDataListInner addProductInfoItem(QianchuanAdGetV10ResponseDataListInnerProductInfoInner productInfoItem) {
    if (this.productInfo == null) {
      this.productInfo = new ArrayList<>();
    }
    this.productInfo.add(productInfoItem);
    return this;
  }

   /**
   * 
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdGetV10ResponseDataListInnerProductInfoInner> getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(List<QianchuanAdGetV10ResponseDataListInnerProductInfoInner> productInfo) {
    this.productInfo = productInfo;
  }


  public QianchuanAdGetV10ResponseDataListInner status(QianchuanAdGetV10DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanAdGetV10DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdGetV10ResponseDataListInner qianchuanAdGetV10ResponseDataListInner = (QianchuanAdGetV10ResponseDataListInner) o;
    return Objects.equals(this.adCreateTime, qianchuanAdGetV10ResponseDataListInner.adCreateTime) &&
        Objects.equals(this.adId, qianchuanAdGetV10ResponseDataListInner.adId) &&
        Objects.equals(this.adModifyTime, qianchuanAdGetV10ResponseDataListInner.adModifyTime) &&
        Objects.equals(this.awemeInfo, qianchuanAdGetV10ResponseDataListInner.awemeInfo) &&
        Objects.equals(this.campaignId, qianchuanAdGetV10ResponseDataListInner.campaignId) &&
        Objects.equals(this.campaignScene, qianchuanAdGetV10ResponseDataListInner.campaignScene) &&
        Objects.equals(this.deliverySetting, qianchuanAdGetV10ResponseDataListInner.deliverySetting) &&
        Objects.equals(this.grabFirstScreenBidAdjustRate, qianchuanAdGetV10ResponseDataListInner.grabFirstScreenBidAdjustRate) &&
        Objects.equals(this.grabFirstScreenSwitch, qianchuanAdGetV10ResponseDataListInner.grabFirstScreenSwitch) &&
        Objects.equals(this.labAdType, qianchuanAdGetV10ResponseDataListInner.labAdType) &&
        Objects.equals(this.marketingGoal, qianchuanAdGetV10ResponseDataListInner.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanAdGetV10ResponseDataListInner.marketingScene) &&
        Objects.equals(this.name, qianchuanAdGetV10ResponseDataListInner.name) &&
        Objects.equals(this.optStatus, qianchuanAdGetV10ResponseDataListInner.optStatus) &&
        Objects.equals(this.productInfo, qianchuanAdGetV10ResponseDataListInner.productInfo) &&
        Objects.equals(this.status, qianchuanAdGetV10ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCreateTime, adId, adModifyTime, awemeInfo, campaignId, campaignScene, deliverySetting, grabFirstScreenBidAdjustRate, grabFirstScreenSwitch, labAdType, marketingGoal, marketingScene, name, optStatus, productInfo, status);
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
    sb.append("class QianchuanAdGetV10ResponseDataListInner {\n");
    sb.append("    adCreateTime: ").append(toIndentedString(adCreateTime)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adModifyTime: ").append(toIndentedString(adModifyTime)).append("\n");
    sb.append("    awemeInfo: ").append(toIndentedString(awemeInfo)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignScene: ").append(toIndentedString(campaignScene)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    grabFirstScreenBidAdjustRate: ").append(toIndentedString(grabFirstScreenBidAdjustRate)).append("\n");
    sb.append("    grabFirstScreenSwitch: ").append(toIndentedString(grabFirstScreenSwitch)).append("\n");
    sb.append("    labAdType: ").append(toIndentedString(labAdType)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("ad_create_time");
    openapiFields.add("ad_id");
    openapiFields.add("ad_modify_time");
    openapiFields.add("aweme_info");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_scene");
    openapiFields.add("delivery_setting");
    openapiFields.add("grab_first_screen_bid_adjust_rate");
    openapiFields.add("grab_first_screen_switch");
    openapiFields.add("lab_ad_type");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("name");
    openapiFields.add("opt_status");
    openapiFields.add("product_info");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdGetV10ResponseDataListInner
  */
  public static QianchuanAdGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

