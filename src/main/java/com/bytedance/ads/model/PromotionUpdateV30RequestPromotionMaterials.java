/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsDynamicCreativeSwitch;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsIntelligentGeneration;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsComponentMaterialListInner;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInner;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsProductInfo;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class PromotionUpdateV30RequestPromotionMaterials {
  public static final String SERIALIZED_NAME_ANCHOR_MATERIAL_LIST = "anchor_material_list";
  @SerializedName(SERIALIZED_NAME_ANCHOR_MATERIAL_LIST)
  private List<PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner> anchorMaterialList = null;

  public static final String SERIALIZED_NAME_CALL_TO_ACTION_BUTTONS = "call_to_action_buttons";
  @SerializedName(SERIALIZED_NAME_CALL_TO_ACTION_BUTTONS)
  private List<String> callToActionButtons = null;

  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST = "carousel_material_list";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList = null;

  public static final String SERIALIZED_NAME_COMPONENT_MATERIAL_LIST = "component_material_list";
  @SerializedName(SERIALIZED_NAME_COMPONENT_MATERIAL_LIST)
  private List<PromotionUpdateV30RequestPromotionMaterialsComponentMaterialListInner> componentMaterialList = null;

  public static final String SERIALIZED_NAME_DECORATION_MATERIAL = "decoration_material";
  @SerializedName(SERIALIZED_NAME_DECORATION_MATERIAL)
  private PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial decorationMaterial = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH = "dynamic_creative_switch";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH)
  private PromotionUpdateV30PromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_FIELD = "external_url_field";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_FIELD)
  private String externalUrlField = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_MATERIAL_LIST = "external_url_material_list";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_MATERIAL_LIST)
  private List<String> externalUrlMaterialList = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_PARAMS = "external_url_params";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_PARAMS)
  private String externalUrlParams = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL_LIST = "image_material_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL_LIST)
  private List<PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInner> imageMaterialList = null;

  public static final String SERIALIZED_NAME_INTELLIGENT_GENERATION = "intelligent_generation";
  @SerializedName(SERIALIZED_NAME_INTELLIGENT_GENERATION)
  private PromotionUpdateV30PromotionMaterialsIntelligentGeneration intelligentGeneration = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_INFO = "mini_program_info";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_INFO)
  private PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo miniProgramInfo = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_OPEN_URL_FIELD = "open_url_field";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_FIELD)
  private String openUrlField = null;

  public static final String SERIALIZED_NAME_OPEN_URL_PARAMS = "open_url_params";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_PARAMS)
  private String openUrlParams = null;

  public static final String SERIALIZED_NAME_OPEN_URLS = "open_urls";
  @SerializedName(SERIALIZED_NAME_OPEN_URLS)
  private List<String> openUrls = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL_MATERIAL_LIST = "playable_url_material_list";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL_MATERIAL_LIST)
  private List<String> playableUrlMaterialList = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private PromotionUpdateV30RequestPromotionMaterialsProductInfo productInfo = null;

  public static final String SERIALIZED_NAME_TEXT_ABSTRACT_LIST = "text_abstract_list";
  @SerializedName(SERIALIZED_NAME_TEXT_ABSTRACT_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> textAbstractList = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL_LIST = "title_material_list";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL_LIST)
  private List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList = null;

  public static final String SERIALIZED_NAME_ULINK = "ulink";
  @SerializedName(SERIALIZED_NAME_ULINK)
  private String ulink = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL_LIST = "video_material_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL_LIST)
  private List<PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList = null;

  public static final String SERIALIZED_NAME_WEB_URL_MATERIAL_LIST = "web_url_material_list";
  @SerializedName(SERIALIZED_NAME_WEB_URL_MATERIAL_LIST)
  private List<String> webUrlMaterialList = null;

  public PromotionUpdateV30RequestPromotionMaterials() {
  }

  public PromotionUpdateV30RequestPromotionMaterials anchorMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner> anchorMaterialList) {
    
    this.anchorMaterialList = anchorMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addAnchorMaterialListItem(PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner anchorMaterialListItem) {
    if (this.anchorMaterialList == null) {
      this.anchorMaterialList = new ArrayList<>();
    }
    this.anchorMaterialList.add(anchorMaterialListItem);
    return this;
  }

   /**
   * 
   * @return anchorMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner> getAnchorMaterialList() {
    return anchorMaterialList;
  }


  public void setAnchorMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsAnchorMaterialListInner> anchorMaterialList) {
    this.anchorMaterialList = anchorMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials callToActionButtons(List<String> callToActionButtons) {
    
    this.callToActionButtons = callToActionButtons;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addCallToActionButtonsItem(String callToActionButtonsItem) {
    if (this.callToActionButtons == null) {
      this.callToActionButtons = new ArrayList<>();
    }
    this.callToActionButtons.add(callToActionButtonsItem);
    return this;
  }

   /**
   * 
   * @return callToActionButtons
  **/
  @javax.annotation.Nullable
  public List<String> getCallToActionButtons() {
    return callToActionButtons;
  }


  public void setCallToActionButtons(List<String> callToActionButtons) {
    this.callToActionButtons = callToActionButtons;
  }


  public PromotionUpdateV30RequestPromotionMaterials carouselMaterialList(List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    
    this.carouselMaterialList = carouselMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addCarouselMaterialListItem(PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner carouselMaterialListItem) {
    if (this.carouselMaterialList == null) {
      this.carouselMaterialList = new ArrayList<>();
    }
    this.carouselMaterialList.add(carouselMaterialListItem);
    return this;
  }

   /**
   * 
   * @return carouselMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> getCarouselMaterialList() {
    return carouselMaterialList;
  }


  public void setCarouselMaterialList(List<PromotionCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    this.carouselMaterialList = carouselMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials componentMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsComponentMaterialListInner> componentMaterialList) {
    
    this.componentMaterialList = componentMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addComponentMaterialListItem(PromotionUpdateV30RequestPromotionMaterialsComponentMaterialListInner componentMaterialListItem) {
    if (this.componentMaterialList == null) {
      this.componentMaterialList = new ArrayList<>();
    }
    this.componentMaterialList.add(componentMaterialListItem);
    return this;
  }

   /**
   * 
   * @return componentMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionUpdateV30RequestPromotionMaterialsComponentMaterialListInner> getComponentMaterialList() {
    return componentMaterialList;
  }


  public void setComponentMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsComponentMaterialListInner> componentMaterialList) {
    this.componentMaterialList = componentMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials decorationMaterial(PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial decorationMaterial) {
    
    this.decorationMaterial = decorationMaterial;
    return this;
  }

   /**
   * Get decorationMaterial
   * @return decorationMaterial
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial getDecorationMaterial() {
    return decorationMaterial;
  }


  public void setDecorationMaterial(PromotionUpdateV30RequestPromotionMaterialsDecorationMaterial decorationMaterial) {
    this.decorationMaterial = decorationMaterial;
  }


  public PromotionUpdateV30RequestPromotionMaterials dynamicCreativeSwitch(PromotionUpdateV30PromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch) {
    
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
    return this;
  }

   /**
   * Get dynamicCreativeSwitch
   * @return dynamicCreativeSwitch
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsDynamicCreativeSwitch getDynamicCreativeSwitch() {
    return dynamicCreativeSwitch;
  }


  public void setDynamicCreativeSwitch(PromotionUpdateV30PromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch) {
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
  }


  public PromotionUpdateV30RequestPromotionMaterials externalUrlField(String externalUrlField) {
    
    this.externalUrlField = externalUrlField;
    return this;
  }

   /**
   * 
   * @return externalUrlField
  **/
  @javax.annotation.Nullable
  public String getExternalUrlField() {
    return externalUrlField;
  }


  public void setExternalUrlField(String externalUrlField) {
    this.externalUrlField = externalUrlField;
  }


  public PromotionUpdateV30RequestPromotionMaterials externalUrlMaterialList(List<String> externalUrlMaterialList) {
    
    this.externalUrlMaterialList = externalUrlMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addExternalUrlMaterialListItem(String externalUrlMaterialListItem) {
    if (this.externalUrlMaterialList == null) {
      this.externalUrlMaterialList = new ArrayList<>();
    }
    this.externalUrlMaterialList.add(externalUrlMaterialListItem);
    return this;
  }

   /**
   * 
   * @return externalUrlMaterialList
  **/
  @javax.annotation.Nullable
  public List<String> getExternalUrlMaterialList() {
    return externalUrlMaterialList;
  }


  public void setExternalUrlMaterialList(List<String> externalUrlMaterialList) {
    this.externalUrlMaterialList = externalUrlMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials externalUrlParams(String externalUrlParams) {
    
    this.externalUrlParams = externalUrlParams;
    return this;
  }

   /**
   * 
   * @return externalUrlParams
  **/
  @javax.annotation.Nullable
  public String getExternalUrlParams() {
    return externalUrlParams;
  }


  public void setExternalUrlParams(String externalUrlParams) {
    this.externalUrlParams = externalUrlParams;
  }


  public PromotionUpdateV30RequestPromotionMaterials imageMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInner> imageMaterialList) {
    
    this.imageMaterialList = imageMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addImageMaterialListItem(PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInner imageMaterialListItem) {
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
  public List<PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInner> getImageMaterialList() {
    return imageMaterialList;
  }


  public void setImageMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInner> imageMaterialList) {
    this.imageMaterialList = imageMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials intelligentGeneration(PromotionUpdateV30PromotionMaterialsIntelligentGeneration intelligentGeneration) {
    
    this.intelligentGeneration = intelligentGeneration;
    return this;
  }

   /**
   * Get intelligentGeneration
   * @return intelligentGeneration
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsIntelligentGeneration getIntelligentGeneration() {
    return intelligentGeneration;
  }


  public void setIntelligentGeneration(PromotionUpdateV30PromotionMaterialsIntelligentGeneration intelligentGeneration) {
    this.intelligentGeneration = intelligentGeneration;
  }


  public PromotionUpdateV30RequestPromotionMaterials miniProgramInfo(PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo miniProgramInfo) {
    
    this.miniProgramInfo = miniProgramInfo;
    return this;
  }

   /**
   * Get miniProgramInfo
   * @return miniProgramInfo
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo getMiniProgramInfo() {
    return miniProgramInfo;
  }


  public void setMiniProgramInfo(PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo miniProgramInfo) {
    this.miniProgramInfo = miniProgramInfo;
  }


  public PromotionUpdateV30RequestPromotionMaterials openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public PromotionUpdateV30RequestPromotionMaterials openUrlField(String openUrlField) {
    
    this.openUrlField = openUrlField;
    return this;
  }

   /**
   * 
   * @return openUrlField
  **/
  @javax.annotation.Nullable
  public String getOpenUrlField() {
    return openUrlField;
  }


  public void setOpenUrlField(String openUrlField) {
    this.openUrlField = openUrlField;
  }


  public PromotionUpdateV30RequestPromotionMaterials openUrlParams(String openUrlParams) {
    
    this.openUrlParams = openUrlParams;
    return this;
  }

   /**
   * 
   * @return openUrlParams
  **/
  @javax.annotation.Nullable
  public String getOpenUrlParams() {
    return openUrlParams;
  }


  public void setOpenUrlParams(String openUrlParams) {
    this.openUrlParams = openUrlParams;
  }


  public PromotionUpdateV30RequestPromotionMaterials openUrls(List<String> openUrls) {
    
    this.openUrls = openUrls;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addOpenUrlsItem(String openUrlsItem) {
    if (this.openUrls == null) {
      this.openUrls = new ArrayList<>();
    }
    this.openUrls.add(openUrlsItem);
    return this;
  }

   /**
   * 
   * @return openUrls
  **/
  @javax.annotation.Nullable
  public List<String> getOpenUrls() {
    return openUrls;
  }


  public void setOpenUrls(List<String> openUrls) {
    this.openUrls = openUrls;
  }


  public PromotionUpdateV30RequestPromotionMaterials playableUrlMaterialList(List<String> playableUrlMaterialList) {
    
    this.playableUrlMaterialList = playableUrlMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addPlayableUrlMaterialListItem(String playableUrlMaterialListItem) {
    if (this.playableUrlMaterialList == null) {
      this.playableUrlMaterialList = new ArrayList<>();
    }
    this.playableUrlMaterialList.add(playableUrlMaterialListItem);
    return this;
  }

   /**
   * 
   * @return playableUrlMaterialList
  **/
  @javax.annotation.Nullable
  public List<String> getPlayableUrlMaterialList() {
    return playableUrlMaterialList;
  }


  public void setPlayableUrlMaterialList(List<String> playableUrlMaterialList) {
    this.playableUrlMaterialList = playableUrlMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials productInfo(PromotionUpdateV30RequestPromotionMaterialsProductInfo productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30RequestPromotionMaterialsProductInfo getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(PromotionUpdateV30RequestPromotionMaterialsProductInfo productInfo) {
    this.productInfo = productInfo;
  }


  public PromotionUpdateV30RequestPromotionMaterials textAbstractList(List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> textAbstractList) {
    
    this.textAbstractList = textAbstractList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addTextAbstractListItem(PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner textAbstractListItem) {
    if (this.textAbstractList == null) {
      this.textAbstractList = new ArrayList<>();
    }
    this.textAbstractList.add(textAbstractListItem);
    return this;
  }

   /**
   * 
   * @return textAbstractList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> getTextAbstractList() {
    return textAbstractList;
  }


  public void setTextAbstractList(List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> textAbstractList) {
    this.textAbstractList = textAbstractList;
  }


  public PromotionUpdateV30RequestPromotionMaterials titleMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    
    this.titleMaterialList = titleMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addTitleMaterialListItem(PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner titleMaterialListItem) {
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
  public List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner> getTitleMaterialList() {
    return titleMaterialList;
  }


  public void setTitleMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    this.titleMaterialList = titleMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials ulink(String ulink) {
    
    this.ulink = ulink;
    return this;
  }

   /**
   * 
   * @return ulink
  **/
  @javax.annotation.Nullable
  public String getUlink() {
    return ulink;
  }


  public void setUlink(String ulink) {
    this.ulink = ulink;
  }


  public PromotionUpdateV30RequestPromotionMaterials videoMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    
    this.videoMaterialList = videoMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addVideoMaterialListItem(PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner videoMaterialListItem) {
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
  public List<PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner> getVideoMaterialList() {
    return videoMaterialList;
  }


  public void setVideoMaterialList(List<PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    this.videoMaterialList = videoMaterialList;
  }


  public PromotionUpdateV30RequestPromotionMaterials webUrlMaterialList(List<String> webUrlMaterialList) {
    
    this.webUrlMaterialList = webUrlMaterialList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterials addWebUrlMaterialListItem(String webUrlMaterialListItem) {
    if (this.webUrlMaterialList == null) {
      this.webUrlMaterialList = new ArrayList<>();
    }
    this.webUrlMaterialList.add(webUrlMaterialListItem);
    return this;
  }

   /**
   * 
   * @return webUrlMaterialList
  **/
  @javax.annotation.Nullable
  public List<String> getWebUrlMaterialList() {
    return webUrlMaterialList;
  }


  public void setWebUrlMaterialList(List<String> webUrlMaterialList) {
    this.webUrlMaterialList = webUrlMaterialList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterials promotionUpdateV30RequestPromotionMaterials = (PromotionUpdateV30RequestPromotionMaterials) o;
    return Objects.equals(this.anchorMaterialList, promotionUpdateV30RequestPromotionMaterials.anchorMaterialList) &&
        Objects.equals(this.callToActionButtons, promotionUpdateV30RequestPromotionMaterials.callToActionButtons) &&
        Objects.equals(this.carouselMaterialList, promotionUpdateV30RequestPromotionMaterials.carouselMaterialList) &&
        Objects.equals(this.componentMaterialList, promotionUpdateV30RequestPromotionMaterials.componentMaterialList) &&
        Objects.equals(this.decorationMaterial, promotionUpdateV30RequestPromotionMaterials.decorationMaterial) &&
        Objects.equals(this.dynamicCreativeSwitch, promotionUpdateV30RequestPromotionMaterials.dynamicCreativeSwitch) &&
        Objects.equals(this.externalUrlField, promotionUpdateV30RequestPromotionMaterials.externalUrlField) &&
        Objects.equals(this.externalUrlMaterialList, promotionUpdateV30RequestPromotionMaterials.externalUrlMaterialList) &&
        Objects.equals(this.externalUrlParams, promotionUpdateV30RequestPromotionMaterials.externalUrlParams) &&
        Objects.equals(this.imageMaterialList, promotionUpdateV30RequestPromotionMaterials.imageMaterialList) &&
        Objects.equals(this.intelligentGeneration, promotionUpdateV30RequestPromotionMaterials.intelligentGeneration) &&
        Objects.equals(this.miniProgramInfo, promotionUpdateV30RequestPromotionMaterials.miniProgramInfo) &&
        Objects.equals(this.openUrl, promotionUpdateV30RequestPromotionMaterials.openUrl) &&
        Objects.equals(this.openUrlField, promotionUpdateV30RequestPromotionMaterials.openUrlField) &&
        Objects.equals(this.openUrlParams, promotionUpdateV30RequestPromotionMaterials.openUrlParams) &&
        Objects.equals(this.openUrls, promotionUpdateV30RequestPromotionMaterials.openUrls) &&
        Objects.equals(this.playableUrlMaterialList, promotionUpdateV30RequestPromotionMaterials.playableUrlMaterialList) &&
        Objects.equals(this.productInfo, promotionUpdateV30RequestPromotionMaterials.productInfo) &&
        Objects.equals(this.textAbstractList, promotionUpdateV30RequestPromotionMaterials.textAbstractList) &&
        Objects.equals(this.titleMaterialList, promotionUpdateV30RequestPromotionMaterials.titleMaterialList) &&
        Objects.equals(this.ulink, promotionUpdateV30RequestPromotionMaterials.ulink) &&
        Objects.equals(this.videoMaterialList, promotionUpdateV30RequestPromotionMaterials.videoMaterialList) &&
        Objects.equals(this.webUrlMaterialList, promotionUpdateV30RequestPromotionMaterials.webUrlMaterialList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorMaterialList, callToActionButtons, carouselMaterialList, componentMaterialList, decorationMaterial, dynamicCreativeSwitch, externalUrlField, externalUrlMaterialList, externalUrlParams, imageMaterialList, intelligentGeneration, miniProgramInfo, openUrl, openUrlField, openUrlParams, openUrls, playableUrlMaterialList, productInfo, textAbstractList, titleMaterialList, ulink, videoMaterialList, webUrlMaterialList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterials {\n");
    sb.append("    anchorMaterialList: ").append(toIndentedString(anchorMaterialList)).append("\n");
    sb.append("    callToActionButtons: ").append(toIndentedString(callToActionButtons)).append("\n");
    sb.append("    carouselMaterialList: ").append(toIndentedString(carouselMaterialList)).append("\n");
    sb.append("    componentMaterialList: ").append(toIndentedString(componentMaterialList)).append("\n");
    sb.append("    decorationMaterial: ").append(toIndentedString(decorationMaterial)).append("\n");
    sb.append("    dynamicCreativeSwitch: ").append(toIndentedString(dynamicCreativeSwitch)).append("\n");
    sb.append("    externalUrlField: ").append(toIndentedString(externalUrlField)).append("\n");
    sb.append("    externalUrlMaterialList: ").append(toIndentedString(externalUrlMaterialList)).append("\n");
    sb.append("    externalUrlParams: ").append(toIndentedString(externalUrlParams)).append("\n");
    sb.append("    imageMaterialList: ").append(toIndentedString(imageMaterialList)).append("\n");
    sb.append("    intelligentGeneration: ").append(toIndentedString(intelligentGeneration)).append("\n");
    sb.append("    miniProgramInfo: ").append(toIndentedString(miniProgramInfo)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    openUrlField: ").append(toIndentedString(openUrlField)).append("\n");
    sb.append("    openUrlParams: ").append(toIndentedString(openUrlParams)).append("\n");
    sb.append("    openUrls: ").append(toIndentedString(openUrls)).append("\n");
    sb.append("    playableUrlMaterialList: ").append(toIndentedString(playableUrlMaterialList)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    textAbstractList: ").append(toIndentedString(textAbstractList)).append("\n");
    sb.append("    titleMaterialList: ").append(toIndentedString(titleMaterialList)).append("\n");
    sb.append("    ulink: ").append(toIndentedString(ulink)).append("\n");
    sb.append("    videoMaterialList: ").append(toIndentedString(videoMaterialList)).append("\n");
    sb.append("    webUrlMaterialList: ").append(toIndentedString(webUrlMaterialList)).append("\n");
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
    openapiFields.add("anchor_material_list");
    openapiFields.add("call_to_action_buttons");
    openapiFields.add("carousel_material_list");
    openapiFields.add("component_material_list");
    openapiFields.add("decoration_material");
    openapiFields.add("dynamic_creative_switch");
    openapiFields.add("external_url_field");
    openapiFields.add("external_url_material_list");
    openapiFields.add("external_url_params");
    openapiFields.add("image_material_list");
    openapiFields.add("intelligent_generation");
    openapiFields.add("mini_program_info");
    openapiFields.add("open_url");
    openapiFields.add("open_url_field");
    openapiFields.add("open_url_params");
    openapiFields.add("open_urls");
    openapiFields.add("playable_url_material_list");
    openapiFields.add("product_info");
    openapiFields.add("text_abstract_list");
    openapiFields.add("title_material_list");
    openapiFields.add("ulink");
    openapiFields.add("video_material_list");
    openapiFields.add("web_url_material_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterials.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterials>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterials
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterials
  */
  public static PromotionUpdateV30RequestPromotionMaterials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterials.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

