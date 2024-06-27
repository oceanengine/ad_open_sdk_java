/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanCreativeGetV10DataListCreativeMaterialMode;
import com.bytedance.ads.model.QianchuanCreativeGetV10DataListImageMode;
import com.bytedance.ads.model.QianchuanCreativeGetV10DataListLabAdType;
import com.bytedance.ads.model.QianchuanCreativeGetV10DataListMarketingScene;
import com.bytedance.ads.model.QianchuanCreativeGetV10DataListOptStatus;
import com.bytedance.ads.model.QianchuanCreativeGetV10DataListStatus;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerCarouselMaterialListInner;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerImageMaterial;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerImageMaterialListInner;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerPromotionCardMaterial;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerTitleMaterial;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerVideoMaterial;
import com.bytedance.ads.model.QianchuanCreativeGetV10ResponseDataListInnerVideoMaterialListInner;
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
 * QianchuanCreativeGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class QianchuanCreativeGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST = "carousel_material_list";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST)
  private List<QianchuanCreativeGetV10ResponseDataListInnerCarouselMaterialListInner> carouselMaterialList = null;

  public static final String SERIALIZED_NAME_CREATIVE_CREATE_TIME = "creative_create_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CREATE_TIME)
  private String creativeCreateTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODE = "creative_material_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODE)
  private QianchuanCreativeGetV10DataListCreativeMaterialMode creativeMaterialMode = null;

  public static final String SERIALIZED_NAME_CREATIVE_MODIFY_TIME = "creative_modify_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MODIFY_TIME)
  private String creativeModifyTime = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private QianchuanCreativeGetV10ResponseDataListInnerImageMaterial imageMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL_LIST = "image_material_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL_LIST)
  private List<QianchuanCreativeGetV10ResponseDataListInnerImageMaterialListInner> imageMaterialList = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanCreativeGetV10DataListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_LAB_AD_TYPE = "lab_ad_type";
  @SerializedName(SERIALIZED_NAME_LAB_AD_TYPE)
  private QianchuanCreativeGetV10DataListLabAdType labAdType = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanCreativeGetV10DataListMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private QianchuanCreativeGetV10DataListOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_MATERIAL = "promotion_card_material";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_MATERIAL)
  private QianchuanCreativeGetV10ResponseDataListInnerPromotionCardMaterial promotionCardMaterial = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanCreativeGetV10DataListStatus status = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private QianchuanCreativeGetV10ResponseDataListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL_LIST = "title_material_list";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL_LIST)
  private List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner> titleMaterialList = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private QianchuanCreativeGetV10ResponseDataListInnerVideoMaterial videoMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL_LIST = "video_material_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL_LIST)
  private List<QianchuanCreativeGetV10ResponseDataListInnerVideoMaterialListInner> videoMaterialList = null;

  public QianchuanCreativeGetV10ResponseDataListInner() {
  }

  public QianchuanCreativeGetV10ResponseDataListInner adId(Long adId) {
    
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


  public QianchuanCreativeGetV10ResponseDataListInner carouselMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerCarouselMaterialListInner> carouselMaterialList) {
    
    this.carouselMaterialList = carouselMaterialList;
    return this;
  }

  public QianchuanCreativeGetV10ResponseDataListInner addCarouselMaterialListItem(QianchuanCreativeGetV10ResponseDataListInnerCarouselMaterialListInner carouselMaterialListItem) {
    if (this.carouselMaterialList == null) {
      this.carouselMaterialList = new ArrayList<>();
    }
    this.carouselMaterialList.add(carouselMaterialListItem);
    return this;
  }

   /**
   * 图文素材
   * @return carouselMaterialList
  **/
  @javax.annotation.Nullable
  public List<QianchuanCreativeGetV10ResponseDataListInnerCarouselMaterialListInner> getCarouselMaterialList() {
    return carouselMaterialList;
  }


  public void setCarouselMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerCarouselMaterialListInner> carouselMaterialList) {
    this.carouselMaterialList = carouselMaterialList;
  }


  public QianchuanCreativeGetV10ResponseDataListInner creativeCreateTime(String creativeCreateTime) {
    
    this.creativeCreateTime = creativeCreateTime;
    return this;
  }

   /**
   * 
   * @return creativeCreateTime
  **/
  @javax.annotation.Nullable
  public String getCreativeCreateTime() {
    return creativeCreateTime;
  }


  public void setCreativeCreateTime(String creativeCreateTime) {
    this.creativeCreateTime = creativeCreateTime;
  }


  public QianchuanCreativeGetV10ResponseDataListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public QianchuanCreativeGetV10ResponseDataListInner creativeMaterialMode(QianchuanCreativeGetV10DataListCreativeMaterialMode creativeMaterialMode) {
    
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * Get creativeMaterialMode
   * @return creativeMaterialMode
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10DataListCreativeMaterialMode getCreativeMaterialMode() {
    return creativeMaterialMode;
  }


  public void setCreativeMaterialMode(QianchuanCreativeGetV10DataListCreativeMaterialMode creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }


  public QianchuanCreativeGetV10ResponseDataListInner creativeModifyTime(String creativeModifyTime) {
    
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

   /**
   * 
   * @return creativeModifyTime
  **/
  @javax.annotation.Nullable
  public String getCreativeModifyTime() {
    return creativeModifyTime;
  }


  public void setCreativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
  }


  public QianchuanCreativeGetV10ResponseDataListInner imageMaterial(QianchuanCreativeGetV10ResponseDataListInnerImageMaterial imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

   /**
   * Get imageMaterial
   * @return imageMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10ResponseDataListInnerImageMaterial getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(QianchuanCreativeGetV10ResponseDataListInnerImageMaterial imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanCreativeGetV10ResponseDataListInner imageMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerImageMaterialListInner> imageMaterialList) {
    
    this.imageMaterialList = imageMaterialList;
    return this;
  }

  public QianchuanCreativeGetV10ResponseDataListInner addImageMaterialListItem(QianchuanCreativeGetV10ResponseDataListInnerImageMaterialListInner imageMaterialListItem) {
    if (this.imageMaterialList == null) {
      this.imageMaterialList = new ArrayList<>();
    }
    this.imageMaterialList.add(imageMaterialListItem);
    return this;
  }

   /**
   * 
   * @return imageMaterialList
  **/
  @javax.annotation.Nullable
  public List<QianchuanCreativeGetV10ResponseDataListInnerImageMaterialListInner> getImageMaterialList() {
    return imageMaterialList;
  }


  public void setImageMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerImageMaterialListInner> imageMaterialList) {
    this.imageMaterialList = imageMaterialList;
  }


  public QianchuanCreativeGetV10ResponseDataListInner imageMode(QianchuanCreativeGetV10DataListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10DataListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanCreativeGetV10DataListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanCreativeGetV10ResponseDataListInner labAdType(QianchuanCreativeGetV10DataListLabAdType labAdType) {
    
    this.labAdType = labAdType;
    return this;
  }

   /**
   * Get labAdType
   * @return labAdType
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10DataListLabAdType getLabAdType() {
    return labAdType;
  }


  public void setLabAdType(QianchuanCreativeGetV10DataListLabAdType labAdType) {
    this.labAdType = labAdType;
  }


  public QianchuanCreativeGetV10ResponseDataListInner marketingScene(QianchuanCreativeGetV10DataListMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10DataListMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanCreativeGetV10DataListMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanCreativeGetV10ResponseDataListInner optStatus(QianchuanCreativeGetV10DataListOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10DataListOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(QianchuanCreativeGetV10DataListOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public QianchuanCreativeGetV10ResponseDataListInner promotionCardMaterial(QianchuanCreativeGetV10ResponseDataListInnerPromotionCardMaterial promotionCardMaterial) {
    
    this.promotionCardMaterial = promotionCardMaterial;
    return this;
  }

   /**
   * Get promotionCardMaterial
   * @return promotionCardMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10ResponseDataListInnerPromotionCardMaterial getPromotionCardMaterial() {
    return promotionCardMaterial;
  }


  public void setPromotionCardMaterial(QianchuanCreativeGetV10ResponseDataListInnerPromotionCardMaterial promotionCardMaterial) {
    this.promotionCardMaterial = promotionCardMaterial;
  }


  public QianchuanCreativeGetV10ResponseDataListInner status(QianchuanCreativeGetV10DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10DataListStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanCreativeGetV10DataListStatus status) {
    this.status = status;
  }


  public QianchuanCreativeGetV10ResponseDataListInner titleMaterial(QianchuanCreativeGetV10ResponseDataListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10ResponseDataListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(QianchuanCreativeGetV10ResponseDataListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanCreativeGetV10ResponseDataListInner titleMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner> titleMaterialList) {
    
    this.titleMaterialList = titleMaterialList;
    return this;
  }

  public QianchuanCreativeGetV10ResponseDataListInner addTitleMaterialListItem(QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner titleMaterialListItem) {
    if (this.titleMaterialList == null) {
      this.titleMaterialList = new ArrayList<>();
    }
    this.titleMaterialList.add(titleMaterialListItem);
    return this;
  }

   /**
   * 
   * @return titleMaterialList
  **/
  @javax.annotation.Nullable
  public List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner> getTitleMaterialList() {
    return titleMaterialList;
  }


  public void setTitleMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerTitleMaterialListInner> titleMaterialList) {
    this.titleMaterialList = titleMaterialList;
  }


  public QianchuanCreativeGetV10ResponseDataListInner videoMaterial(QianchuanCreativeGetV10ResponseDataListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanCreativeGetV10ResponseDataListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(QianchuanCreativeGetV10ResponseDataListInnerVideoMaterial videoMaterial) {
    this.videoMaterial = videoMaterial;
  }


  public QianchuanCreativeGetV10ResponseDataListInner videoMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerVideoMaterialListInner> videoMaterialList) {
    
    this.videoMaterialList = videoMaterialList;
    return this;
  }

  public QianchuanCreativeGetV10ResponseDataListInner addVideoMaterialListItem(QianchuanCreativeGetV10ResponseDataListInnerVideoMaterialListInner videoMaterialListItem) {
    if (this.videoMaterialList == null) {
      this.videoMaterialList = new ArrayList<>();
    }
    this.videoMaterialList.add(videoMaterialListItem);
    return this;
  }

   /**
   * 
   * @return videoMaterialList
  **/
  @javax.annotation.Nullable
  public List<QianchuanCreativeGetV10ResponseDataListInnerVideoMaterialListInner> getVideoMaterialList() {
    return videoMaterialList;
  }


  public void setVideoMaterialList(List<QianchuanCreativeGetV10ResponseDataListInnerVideoMaterialListInner> videoMaterialList) {
    this.videoMaterialList = videoMaterialList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCreativeGetV10ResponseDataListInner qianchuanCreativeGetV10ResponseDataListInner = (QianchuanCreativeGetV10ResponseDataListInner) o;
    return Objects.equals(this.adId, qianchuanCreativeGetV10ResponseDataListInner.adId) &&
        Objects.equals(this.carouselMaterialList, qianchuanCreativeGetV10ResponseDataListInner.carouselMaterialList) &&
        Objects.equals(this.creativeCreateTime, qianchuanCreativeGetV10ResponseDataListInner.creativeCreateTime) &&
        Objects.equals(this.creativeId, qianchuanCreativeGetV10ResponseDataListInner.creativeId) &&
        Objects.equals(this.creativeMaterialMode, qianchuanCreativeGetV10ResponseDataListInner.creativeMaterialMode) &&
        Objects.equals(this.creativeModifyTime, qianchuanCreativeGetV10ResponseDataListInner.creativeModifyTime) &&
        Objects.equals(this.imageMaterial, qianchuanCreativeGetV10ResponseDataListInner.imageMaterial) &&
        Objects.equals(this.imageMaterialList, qianchuanCreativeGetV10ResponseDataListInner.imageMaterialList) &&
        Objects.equals(this.imageMode, qianchuanCreativeGetV10ResponseDataListInner.imageMode) &&
        Objects.equals(this.labAdType, qianchuanCreativeGetV10ResponseDataListInner.labAdType) &&
        Objects.equals(this.marketingScene, qianchuanCreativeGetV10ResponseDataListInner.marketingScene) &&
        Objects.equals(this.optStatus, qianchuanCreativeGetV10ResponseDataListInner.optStatus) &&
        Objects.equals(this.promotionCardMaterial, qianchuanCreativeGetV10ResponseDataListInner.promotionCardMaterial) &&
        Objects.equals(this.status, qianchuanCreativeGetV10ResponseDataListInner.status) &&
        Objects.equals(this.titleMaterial, qianchuanCreativeGetV10ResponseDataListInner.titleMaterial) &&
        Objects.equals(this.titleMaterialList, qianchuanCreativeGetV10ResponseDataListInner.titleMaterialList) &&
        Objects.equals(this.videoMaterial, qianchuanCreativeGetV10ResponseDataListInner.videoMaterial) &&
        Objects.equals(this.videoMaterialList, qianchuanCreativeGetV10ResponseDataListInner.videoMaterialList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, carouselMaterialList, creativeCreateTime, creativeId, creativeMaterialMode, creativeModifyTime, imageMaterial, imageMaterialList, imageMode, labAdType, marketingScene, optStatus, promotionCardMaterial, status, titleMaterial, titleMaterialList, videoMaterial, videoMaterialList);
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
    sb.append("class QianchuanCreativeGetV10ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    carouselMaterialList: ").append(toIndentedString(carouselMaterialList)).append("\n");
    sb.append("    creativeCreateTime: ").append(toIndentedString(creativeCreateTime)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    creativeModifyTime: ").append(toIndentedString(creativeModifyTime)).append("\n");
    sb.append("    imageMaterial: ").append(toIndentedString(imageMaterial)).append("\n");
    sb.append("    imageMaterialList: ").append(toIndentedString(imageMaterialList)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    labAdType: ").append(toIndentedString(labAdType)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    promotionCardMaterial: ").append(toIndentedString(promotionCardMaterial)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    titleMaterial: ").append(toIndentedString(titleMaterial)).append("\n");
    sb.append("    titleMaterialList: ").append(toIndentedString(titleMaterialList)).append("\n");
    sb.append("    videoMaterial: ").append(toIndentedString(videoMaterial)).append("\n");
    sb.append("    videoMaterialList: ").append(toIndentedString(videoMaterialList)).append("\n");
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
    openapiFields.add("carousel_material_list");
    openapiFields.add("creative_create_time");
    openapiFields.add("creative_id");
    openapiFields.add("creative_material_mode");
    openapiFields.add("creative_modify_time");
    openapiFields.add("image_material");
    openapiFields.add("image_material_list");
    openapiFields.add("image_mode");
    openapiFields.add("lab_ad_type");
    openapiFields.add("marketing_scene");
    openapiFields.add("opt_status");
    openapiFields.add("promotion_card_material");
    openapiFields.add("status");
    openapiFields.add("title_material");
    openapiFields.add("title_material_list");
    openapiFields.add("video_material");
    openapiFields.add("video_material_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCreativeGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCreativeGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCreativeGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCreativeGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCreativeGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCreativeGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCreativeGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCreativeGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCreativeGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCreativeGetV10ResponseDataListInner
  */
  public static QianchuanCreativeGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCreativeGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanCreativeGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

