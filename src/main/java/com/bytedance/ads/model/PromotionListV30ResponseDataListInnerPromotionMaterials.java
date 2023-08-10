/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsDynamicCreativeSwitch;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsIntelligentGeneration;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsOpenUrlType;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsParamsType;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsAnchorMaterialListInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsComponentMaterialListInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsDecorationMaterial;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfo;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsTitleMaterialListInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-08T16:01:24.710+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseDataListInnerPromotionMaterials {
  public static final String SERIALIZED_NAME_ANCHOR_MATERIAL_LIST = "anchor_material_list";
  @SerializedName(SERIALIZED_NAME_ANCHOR_MATERIAL_LIST)
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsAnchorMaterialListInner> anchorMaterialList = null;

  public static final String SERIALIZED_NAME_CALL_TO_ACTION_BUTTONS = "call_to_action_buttons";
  @SerializedName(SERIALIZED_NAME_CALL_TO_ACTION_BUTTONS)
  private List<String> callToActionButtons = null;

  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST = "carousel_material_list";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST)
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner> carouselMaterialList = null;

  public static final String SERIALIZED_NAME_COMPONENT_MATERIAL_LIST = "component_material_list";
  @SerializedName(SERIALIZED_NAME_COMPONENT_MATERIAL_LIST)
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsComponentMaterialListInner> componentMaterialList = null;

  public static final String SERIALIZED_NAME_DECORATION_MATERIAL = "decoration_material";
  @SerializedName(SERIALIZED_NAME_DECORATION_MATERIAL)
  private PromotionListV30ResponseDataListInnerPromotionMaterialsDecorationMaterial decorationMaterial = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH = "dynamic_creative_switch";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH)
  private PromotionListV30DataListPromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch = null;

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
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInner> imageMaterialList = null;

  public static final String SERIALIZED_NAME_INTELLIGENT_GENERATION = "intelligent_generation";
  @SerializedName(SERIALIZED_NAME_INTELLIGENT_GENERATION)
  private PromotionListV30DataListPromotionMaterialsIntelligentGeneration intelligentGeneration = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_INFO = "mini_program_info";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_INFO)
  private PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfo miniProgramInfo = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_OPEN_URL_FIELD = "open_url_field";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_FIELD)
  private String openUrlField = null;

  public static final String SERIALIZED_NAME_OPEN_URL_PARAMS = "open_url_params";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_PARAMS)
  private String openUrlParams = null;

  public static final String SERIALIZED_NAME_OPEN_URL_TYPE = "open_url_type";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_TYPE)
  private PromotionListV30DataListPromotionMaterialsOpenUrlType openUrlType = null;

  public static final String SERIALIZED_NAME_PARAMS_TYPE = "params_type";
  @SerializedName(SERIALIZED_NAME_PARAMS_TYPE)
  private PromotionListV30DataListPromotionMaterialsParamsType paramsType = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL_MATERIAL_LIST = "playable_url_material_list";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL_MATERIAL_LIST)
  private List<String> playableUrlMaterialList = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productInfo = null;

  public static final String SERIALIZED_NAME_TEXT_ABSTRACT_LIST = "text_abstract_list";
  @SerializedName(SERIALIZED_NAME_TEXT_ABSTRACT_LIST)
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner> textAbstractList = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL_LIST = "title_material_list";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL_LIST)
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsTitleMaterialListInner> titleMaterialList = null;

  public static final String SERIALIZED_NAME_ULINK = "ulink";
  @SerializedName(SERIALIZED_NAME_ULINK)
  private String ulink = null;

  public static final String SERIALIZED_NAME_ULINK_URL = "ulink_url";
  @SerializedName(SERIALIZED_NAME_ULINK_URL)
  private String ulinkUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL_LIST = "video_material_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL_LIST)
  private List<PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner> videoMaterialList = null;

  public static final String SERIALIZED_NAME_WEB_URL_MATERIAL_LIST = "web_url_material_list";
  @SerializedName(SERIALIZED_NAME_WEB_URL_MATERIAL_LIST)
  private List<String> webUrlMaterialList = null;

  public PromotionListV30ResponseDataListInnerPromotionMaterials() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials anchorMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsAnchorMaterialListInner> anchorMaterialList) {
    
    this.anchorMaterialList = anchorMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addAnchorMaterialListItem(PromotionListV30ResponseDataListInnerPromotionMaterialsAnchorMaterialListInner anchorMaterialListItem) {
    if (this.anchorMaterialList == null) {
      this.anchorMaterialList = null;
    }
    this.anchorMaterialList.add(anchorMaterialListItem);
    return this;
  }

   /**
   * 
   * @return anchorMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsAnchorMaterialListInner> getAnchorMaterialList() {
    return anchorMaterialList;
  }


  public void setAnchorMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsAnchorMaterialListInner> anchorMaterialList) {
    this.anchorMaterialList = anchorMaterialList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials callToActionButtons(List<String> callToActionButtons) {
    
    this.callToActionButtons = callToActionButtons;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addCallToActionButtonsItem(String callToActionButtonsItem) {
    if (this.callToActionButtons == null) {
      this.callToActionButtons = null;
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials carouselMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    
    this.carouselMaterialList = carouselMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addCarouselMaterialListItem(PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner carouselMaterialListItem) {
    if (this.carouselMaterialList == null) {
      this.carouselMaterialList = null;
    }
    this.carouselMaterialList.add(carouselMaterialListItem);
    return this;
  }

   /**
   * 
   * @return carouselMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner> getCarouselMaterialList() {
    return carouselMaterialList;
  }


  public void setCarouselMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    this.carouselMaterialList = carouselMaterialList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials componentMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsComponentMaterialListInner> componentMaterialList) {
    
    this.componentMaterialList = componentMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addComponentMaterialListItem(PromotionListV30ResponseDataListInnerPromotionMaterialsComponentMaterialListInner componentMaterialListItem) {
    if (this.componentMaterialList == null) {
      this.componentMaterialList = null;
    }
    this.componentMaterialList.add(componentMaterialListItem);
    return this;
  }

   /**
   * 
   * @return componentMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsComponentMaterialListInner> getComponentMaterialList() {
    return componentMaterialList;
  }


  public void setComponentMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsComponentMaterialListInner> componentMaterialList) {
    this.componentMaterialList = componentMaterialList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials decorationMaterial(PromotionListV30ResponseDataListInnerPromotionMaterialsDecorationMaterial decorationMaterial) {
    
    this.decorationMaterial = decorationMaterial;
    return this;
  }

   /**
   * Get decorationMaterial
   * @return decorationMaterial
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerPromotionMaterialsDecorationMaterial getDecorationMaterial() {
    return decorationMaterial;
  }


  public void setDecorationMaterial(PromotionListV30ResponseDataListInnerPromotionMaterialsDecorationMaterial decorationMaterial) {
    this.decorationMaterial = decorationMaterial;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials dynamicCreativeSwitch(PromotionListV30DataListPromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch) {
    
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
    return this;
  }

   /**
   * Get dynamicCreativeSwitch
   * @return dynamicCreativeSwitch
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsDynamicCreativeSwitch getDynamicCreativeSwitch() {
    return dynamicCreativeSwitch;
  }


  public void setDynamicCreativeSwitch(PromotionListV30DataListPromotionMaterialsDynamicCreativeSwitch dynamicCreativeSwitch) {
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials externalUrlField(String externalUrlField) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials externalUrlMaterialList(List<String> externalUrlMaterialList) {
    
    this.externalUrlMaterialList = externalUrlMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addExternalUrlMaterialListItem(String externalUrlMaterialListItem) {
    if (this.externalUrlMaterialList == null) {
      this.externalUrlMaterialList = null;
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials externalUrlParams(String externalUrlParams) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials imageMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInner> imageMaterialList) {
    
    this.imageMaterialList = imageMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addImageMaterialListItem(PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInner imageMaterialListItem) {
    if (this.imageMaterialList == null) {
      this.imageMaterialList = null;
    }
    this.imageMaterialList.add(imageMaterialListItem);
    return this;
  }

   /**
   * 
   * @return imageMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInner> getImageMaterialList() {
    return imageMaterialList;
  }


  public void setImageMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsImageMaterialListInner> imageMaterialList) {
    this.imageMaterialList = imageMaterialList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials intelligentGeneration(PromotionListV30DataListPromotionMaterialsIntelligentGeneration intelligentGeneration) {
    
    this.intelligentGeneration = intelligentGeneration;
    return this;
  }

   /**
   * Get intelligentGeneration
   * @return intelligentGeneration
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsIntelligentGeneration getIntelligentGeneration() {
    return intelligentGeneration;
  }


  public void setIntelligentGeneration(PromotionListV30DataListPromotionMaterialsIntelligentGeneration intelligentGeneration) {
    this.intelligentGeneration = intelligentGeneration;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials miniProgramInfo(PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfo miniProgramInfo) {
    
    this.miniProgramInfo = miniProgramInfo;
    return this;
  }

   /**
   * Get miniProgramInfo
   * @return miniProgramInfo
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfo getMiniProgramInfo() {
    return miniProgramInfo;
  }


  public void setMiniProgramInfo(PromotionListV30ResponseDataListInnerPromotionMaterialsMiniProgramInfo miniProgramInfo) {
    this.miniProgramInfo = miniProgramInfo;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials openUrl(String openUrl) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials openUrlField(String openUrlField) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials openUrlParams(String openUrlParams) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials openUrlType(PromotionListV30DataListPromotionMaterialsOpenUrlType openUrlType) {
    
    this.openUrlType = openUrlType;
    return this;
  }

   /**
   * Get openUrlType
   * @return openUrlType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsOpenUrlType getOpenUrlType() {
    return openUrlType;
  }


  public void setOpenUrlType(PromotionListV30DataListPromotionMaterialsOpenUrlType openUrlType) {
    this.openUrlType = openUrlType;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials paramsType(PromotionListV30DataListPromotionMaterialsParamsType paramsType) {
    
    this.paramsType = paramsType;
    return this;
  }

   /**
   * Get paramsType
   * @return paramsType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsParamsType getParamsType() {
    return paramsType;
  }


  public void setParamsType(PromotionListV30DataListPromotionMaterialsParamsType paramsType) {
    this.paramsType = paramsType;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials playableUrlMaterialList(List<String> playableUrlMaterialList) {
    
    this.playableUrlMaterialList = playableUrlMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addPlayableUrlMaterialListItem(String playableUrlMaterialListItem) {
    if (this.playableUrlMaterialList == null) {
      this.playableUrlMaterialList = null;
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials productInfo(PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productInfo) {
    this.productInfo = productInfo;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials textAbstractList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner> textAbstractList) {
    
    this.textAbstractList = textAbstractList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addTextAbstractListItem(PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner textAbstractListItem) {
    if (this.textAbstractList == null) {
      this.textAbstractList = null;
    }
    this.textAbstractList.add(textAbstractListItem);
    return this;
  }

   /**
   * 
   * @return textAbstractList
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner> getTextAbstractList() {
    return textAbstractList;
  }


  public void setTextAbstractList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner> textAbstractList) {
    this.textAbstractList = textAbstractList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials titleMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    
    this.titleMaterialList = titleMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addTitleMaterialListItem(PromotionListV30ResponseDataListInnerPromotionMaterialsTitleMaterialListInner titleMaterialListItem) {
    if (this.titleMaterialList == null) {
      this.titleMaterialList = null;
    }
    this.titleMaterialList.add(titleMaterialListItem);
    return this;
  }

   /**
   * 
   * @return titleMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsTitleMaterialListInner> getTitleMaterialList() {
    return titleMaterialList;
  }


  public void setTitleMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    this.titleMaterialList = titleMaterialList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials ulink(String ulink) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterials ulinkUrl(String ulinkUrl) {
    
    this.ulinkUrl = ulinkUrl;
    return this;
  }

   /**
   * 
   * @return ulinkUrl
  **/
  @javax.annotation.Nullable
  public String getUlinkUrl() {
    return ulinkUrl;
  }


  public void setUlinkUrl(String ulinkUrl) {
    this.ulinkUrl = ulinkUrl;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials videoMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    
    this.videoMaterialList = videoMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addVideoMaterialListItem(PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner videoMaterialListItem) {
    if (this.videoMaterialList == null) {
      this.videoMaterialList = null;
    }
    this.videoMaterialList.add(videoMaterialListItem);
    return this;
  }

   /**
   * 
   * @return videoMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner> getVideoMaterialList() {
    return videoMaterialList;
  }


  public void setVideoMaterialList(List<PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    this.videoMaterialList = videoMaterialList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterials webUrlMaterialList(List<String> webUrlMaterialList) {
    
    this.webUrlMaterialList = webUrlMaterialList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterials addWebUrlMaterialListItem(String webUrlMaterialListItem) {
    if (this.webUrlMaterialList == null) {
      this.webUrlMaterialList = null;
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
    PromotionListV30ResponseDataListInnerPromotionMaterials promotionListV30ResponseDataListInnerPromotionMaterials = (PromotionListV30ResponseDataListInnerPromotionMaterials) o;
    return Objects.equals(this.anchorMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.anchorMaterialList) &&
        Objects.equals(this.callToActionButtons, promotionListV30ResponseDataListInnerPromotionMaterials.callToActionButtons) &&
        Objects.equals(this.carouselMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.carouselMaterialList) &&
        Objects.equals(this.componentMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.componentMaterialList) &&
        Objects.equals(this.decorationMaterial, promotionListV30ResponseDataListInnerPromotionMaterials.decorationMaterial) &&
        Objects.equals(this.dynamicCreativeSwitch, promotionListV30ResponseDataListInnerPromotionMaterials.dynamicCreativeSwitch) &&
        Objects.equals(this.externalUrlField, promotionListV30ResponseDataListInnerPromotionMaterials.externalUrlField) &&
        Objects.equals(this.externalUrlMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.externalUrlMaterialList) &&
        Objects.equals(this.externalUrlParams, promotionListV30ResponseDataListInnerPromotionMaterials.externalUrlParams) &&
        Objects.equals(this.imageMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.imageMaterialList) &&
        Objects.equals(this.intelligentGeneration, promotionListV30ResponseDataListInnerPromotionMaterials.intelligentGeneration) &&
        Objects.equals(this.miniProgramInfo, promotionListV30ResponseDataListInnerPromotionMaterials.miniProgramInfo) &&
        Objects.equals(this.openUrl, promotionListV30ResponseDataListInnerPromotionMaterials.openUrl) &&
        Objects.equals(this.openUrlField, promotionListV30ResponseDataListInnerPromotionMaterials.openUrlField) &&
        Objects.equals(this.openUrlParams, promotionListV30ResponseDataListInnerPromotionMaterials.openUrlParams) &&
        Objects.equals(this.openUrlType, promotionListV30ResponseDataListInnerPromotionMaterials.openUrlType) &&
        Objects.equals(this.paramsType, promotionListV30ResponseDataListInnerPromotionMaterials.paramsType) &&
        Objects.equals(this.playableUrlMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.playableUrlMaterialList) &&
        Objects.equals(this.productInfo, promotionListV30ResponseDataListInnerPromotionMaterials.productInfo) &&
        Objects.equals(this.textAbstractList, promotionListV30ResponseDataListInnerPromotionMaterials.textAbstractList) &&
        Objects.equals(this.titleMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.titleMaterialList) &&
        Objects.equals(this.ulink, promotionListV30ResponseDataListInnerPromotionMaterials.ulink) &&
        Objects.equals(this.ulinkUrl, promotionListV30ResponseDataListInnerPromotionMaterials.ulinkUrl) &&
        Objects.equals(this.videoMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.videoMaterialList) &&
        Objects.equals(this.webUrlMaterialList, promotionListV30ResponseDataListInnerPromotionMaterials.webUrlMaterialList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorMaterialList, callToActionButtons, carouselMaterialList, componentMaterialList, decorationMaterial, dynamicCreativeSwitch, externalUrlField, externalUrlMaterialList, externalUrlParams, imageMaterialList, intelligentGeneration, miniProgramInfo, openUrl, openUrlField, openUrlParams, openUrlType, paramsType, playableUrlMaterialList, productInfo, textAbstractList, titleMaterialList, ulink, ulinkUrl, videoMaterialList, webUrlMaterialList);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterials {\n");
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
    sb.append("    openUrlType: ").append(toIndentedString(openUrlType)).append("\n");
    sb.append("    paramsType: ").append(toIndentedString(paramsType)).append("\n");
    sb.append("    playableUrlMaterialList: ").append(toIndentedString(playableUrlMaterialList)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    textAbstractList: ").append(toIndentedString(textAbstractList)).append("\n");
    sb.append("    titleMaterialList: ").append(toIndentedString(titleMaterialList)).append("\n");
    sb.append("    ulink: ").append(toIndentedString(ulink)).append("\n");
    sb.append("    ulinkUrl: ").append(toIndentedString(ulinkUrl)).append("\n");
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
    openapiFields.add("open_url_type");
    openapiFields.add("params_type");
    openapiFields.add("playable_url_material_list");
    openapiFields.add("product_info");
    openapiFields.add("text_abstract_list");
    openapiFields.add("title_material_list");
    openapiFields.add("ulink");
    openapiFields.add("ulink_url");
    openapiFields.add("video_material_list");
    openapiFields.add("web_url_material_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionMaterials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterials.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterials>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterials
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterials
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterials.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
