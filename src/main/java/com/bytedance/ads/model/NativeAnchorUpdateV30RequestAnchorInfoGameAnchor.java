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
import com.bytedance.ads.model.NativeAnchorUpdateV30AnchorInfoGameAnchorGameType;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoGameAnchorAppImagesInner;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoGameAnchorHeadImageListInner;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoGameAnchorIconImagesInner;
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
 * 游戏锚点，当需要更新的锚点类型为anchor_type&#x3D;APP_GAME: 应用下载-游戏锚点时必填
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class NativeAnchorUpdateV30RequestAnchorInfoGameAnchor {
  public static final String SERIALIZED_NAME_ANCHOR_IMAGE_MODE = "anchor_image_mode";
  @SerializedName(SERIALIZED_NAME_ANCHOR_IMAGE_MODE)
  private Long anchorImageMode = null;

  public static final String SERIALIZED_NAME_ANDROID_ANCHOR_TITLE = "android_anchor_title";
  @SerializedName(SERIALIZED_NAME_ANDROID_ANCHOR_TITLE)
  private String androidAnchorTitle = null;

  public static final String SERIALIZED_NAME_ANDROID_DOWNLOAD_URL = "android_download_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_DOWNLOAD_URL)
  private String androidDownloadUrl = null;

  public static final String SERIALIZED_NAME_APP_IMAGES = "app_images";
  @SerializedName(SERIALIZED_NAME_APP_IMAGES)
  private List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorAppImagesInner> appImages = null;

  public static final String SERIALIZED_NAME_APP_OPEN_URL = "app_open_url";
  @SerializedName(SERIALIZED_NAME_APP_OPEN_URL)
  private String appOpenUrl = null;

  public static final String SERIALIZED_NAME_APP_TAGS = "app_tags";
  @SerializedName(SERIALIZED_NAME_APP_TAGS)
  private List<String> appTags = null;

  public static final String SERIALIZED_NAME_GAME_BONUS = "game_bonus";
  @SerializedName(SERIALIZED_NAME_GAME_BONUS)
  private Boolean gameBonus = null;

  public static final String SERIALIZED_NAME_GAME_CHARATORISTIC = "game_charatoristic";
  @SerializedName(SERIALIZED_NAME_GAME_CHARATORISTIC)
  private String gameCharatoristic = null;

  public static final String SERIALIZED_NAME_GAME_DESCRIPTION = "game_description";
  @SerializedName(SERIALIZED_NAME_GAME_DESCRIPTION)
  private String gameDescription = null;

  public static final String SERIALIZED_NAME_GAME_PACKAGE_LIST = "game_package_list";
  @SerializedName(SERIALIZED_NAME_GAME_PACKAGE_LIST)
  private List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner> gamePackageList = null;

  public static final String SERIALIZED_NAME_GAME_TYPE = "game_type";
  @SerializedName(SERIALIZED_NAME_GAME_TYPE)
  private NativeAnchorUpdateV30AnchorInfoGameAnchorGameType gameType = null;

  public static final String SERIALIZED_NAME_GUIDE_TEXT = "guide_text";
  @SerializedName(SERIALIZED_NAME_GUIDE_TEXT)
  private String guideText = null;

  public static final String SERIALIZED_NAME_HARMONY_DOWNLOAD_URL = "harmony_download_url";
  @SerializedName(SERIALIZED_NAME_HARMONY_DOWNLOAD_URL)
  private String harmonyDownloadUrl = null;

  public static final String SERIALIZED_NAME_HEAD_IMAGE_LIST = "head_image_list";
  @SerializedName(SERIALIZED_NAME_HEAD_IMAGE_LIST)
  private List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorHeadImageListInner> headImageList = null;

  public static final String SERIALIZED_NAME_ICON_IMAGES = "icon_images";
  @SerializedName(SERIALIZED_NAME_ICON_IMAGES)
  private List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorIconImagesInner> iconImages = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_IOS_ANCHOR_TITLE = "ios_anchor_title";
  @SerializedName(SERIALIZED_NAME_IOS_ANCHOR_TITLE)
  private String iosAnchorTitle = null;

  public static final String SERIALIZED_NAME_IOS_DOWNLOAD_URL = "ios_download_url";
  @SerializedName(SERIALIZED_NAME_IOS_DOWNLOAD_URL)
  private String iosDownloadUrl = null;

  public static final String SERIALIZED_NAME_OTHER_DESCRIPTION = "other_description";
  @SerializedName(SERIALIZED_NAME_OTHER_DESCRIPTION)
  private String otherDescription = null;

  public static final String SERIALIZED_NAME_PATH_PARAM = "path_param";
  @SerializedName(SERIALIZED_NAME_PATH_PARAM)
  private String pathParam = null;

  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private Long platformType = null;

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor anchorImageMode(Long anchorImageMode) {
    
    this.anchorImageMode = anchorImageMode;
    return this;
  }

   /**
   * 游戏图片比例枚举，100：尺寸为2：1的横图，200：尺寸为3：5的竖图
   * @return anchorImageMode
  **/
  @javax.annotation.Nullable
  public Long getAnchorImageMode() {
    return anchorImageMode;
  }


  public void setAnchorImageMode(Long anchorImageMode) {
    this.anchorImageMode = anchorImageMode;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor androidAnchorTitle(String androidAnchorTitle) {
    
    this.androidAnchorTitle = androidAnchorTitle;
    return this;
  }

   /**
   * 安卓锚点入口标题字段，长度1～12
   * @return androidAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getAndroidAnchorTitle() {
    return androidAnchorTitle;
  }


  public void setAndroidAnchorTitle(String androidAnchorTitle) {
    this.androidAnchorTitle = androidAnchorTitle;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor androidDownloadUrl(String androidDownloadUrl) {
    
    this.androidDownloadUrl = androidDownloadUrl;
    return this;
  }

   /**
   * 安卓下载链接，game_type为微信小游戏场景下不用传入
   * @return androidDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidDownloadUrl() {
    return androidDownloadUrl;
  }


  public void setAndroidDownloadUrl(String androidDownloadUrl) {
    this.androidDownloadUrl = androidDownloadUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor appImages(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorAppImagesInner> appImages) {
    
    this.appImages = appImages;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor addAppImagesItem(NativeAnchorUpdateV30RequestAnchorInfoGameAnchorAppImagesInner appImagesItem) {
    if (this.appImages == null) {
      this.appImages = new ArrayList<>();
    }
    this.appImages.add(appImagesItem);
    return this;
  }

   /**
   * 游戏图片，图片个数 3～8
   * @return appImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorAppImagesInner> getAppImages() {
    return appImages;
  }


  public void setAppImages(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorAppImagesInner> appImages) {
    this.appImages = appImages;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor appOpenUrl(String appOpenUrl) {
    
    this.appOpenUrl = appOpenUrl;
    return this;
  }

   /**
   * 
   * @return appOpenUrl
  **/
  @javax.annotation.Nullable
  public String getAppOpenUrl() {
    return appOpenUrl;
  }


  public void setAppOpenUrl(String appOpenUrl) {
    this.appOpenUrl = appOpenUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor appTags(List<String> appTags) {
    
    this.appTags = appTags;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor addAppTagsItem(String appTagsItem) {
    if (this.appTags == null) {
      this.appTags = new ArrayList<>();
    }
    this.appTags.add(appTagsItem);
    return this;
  }

   /**
   * 游戏标签列表，每个标签长度1～6，标签个数1～2
   * @return appTags
  **/
  @javax.annotation.Nullable
  public List<String> getAppTags() {
    return appTags;
  }


  public void setAppTags(List<String> appTags) {
    this.appTags = appTags;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gameBonus(Boolean gameBonus) {
    
    this.gameBonus = gameBonus;
    return this;
  }

   /**
   * 游戏福利，可选择YES启用、NO不启用
   * @return gameBonus
  **/
  @javax.annotation.Nullable
  public Boolean getGameBonus() {
    return gameBonus;
  }


  public void setGameBonus(Boolean gameBonus) {
    this.gameBonus = gameBonus;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gameCharatoristic(String gameCharatoristic) {
    
    this.gameCharatoristic = gameCharatoristic;
    return this;
  }

   /**
   * 游戏特色，长度 1～45
   * @return gameCharatoristic
  **/
  @javax.annotation.Nullable
  public String getGameCharatoristic() {
    return gameCharatoristic;
  }


  public void setGameCharatoristic(String gameCharatoristic) {
    this.gameCharatoristic = gameCharatoristic;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gameDescription(String gameDescription) {
    
    this.gameDescription = gameDescription;
    return this;
  }

   /**
   * 游戏简介，长度 1～45
   * @return gameDescription
  **/
  @javax.annotation.Nullable
  public String getGameDescription() {
    return gameDescription;
  }


  public void setGameDescription(String gameDescription) {
    this.gameDescription = gameDescription;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gamePackageList(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner> gamePackageList) {
    
    this.gamePackageList = gamePackageList;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor addGamePackageListItem(NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner gamePackageListItem) {
    if (this.gamePackageList == null) {
      this.gamePackageList = new ArrayList<>();
    }
    this.gamePackageList.add(gamePackageListItem);
    return this;
  }

   /**
   * 游戏礼包列表，当game_bonus为YES时必填，数量限制0-3
   * @return gamePackageList
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner> getGamePackageList() {
    return gamePackageList;
  }


  public void setGamePackageList(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner> gamePackageList) {
    this.gamePackageList = gamePackageList;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor gameType(NativeAnchorUpdateV30AnchorInfoGameAnchorGameType gameType) {
    
    this.gameType = gameType;
    return this;
  }

   /**
   * Get gameType
   * @return gameType
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30AnchorInfoGameAnchorGameType getGameType() {
    return gameType;
  }


  public void setGameType(NativeAnchorUpdateV30AnchorInfoGameAnchorGameType gameType) {
    this.gameType = gameType;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor guideText(String guideText) {
    
    this.guideText = guideText;
    return this;
  }

   /**
   * 引导文案，长度1～15
   * @return guideText
  **/
  @javax.annotation.Nullable
  public String getGuideText() {
    return guideText;
  }


  public void setGuideText(String guideText) {
    this.guideText = guideText;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor harmonyDownloadUrl(String harmonyDownloadUrl) {
    
    this.harmonyDownloadUrl = harmonyDownloadUrl;
    return this;
  }

   /**
   * 
   * @return harmonyDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getHarmonyDownloadUrl() {
    return harmonyDownloadUrl;
  }


  public void setHarmonyDownloadUrl(String harmonyDownloadUrl) {
    this.harmonyDownloadUrl = harmonyDownloadUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor headImageList(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorHeadImageListInner> headImageList) {
    
    this.headImageList = headImageList;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor addHeadImageListItem(NativeAnchorUpdateV30RequestAnchorInfoGameAnchorHeadImageListInner headImageListItem) {
    if (this.headImageList == null) {
      this.headImageList = new ArrayList<>();
    }
    this.headImageList.add(headImageListItem);
    return this;
  }

   /**
   * 锚点头部图片list，推荐尺寸为2：1的横图
   * @return headImageList
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorHeadImageListInner> getHeadImageList() {
    return headImageList;
  }


  public void setHeadImageList(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorHeadImageListInner> headImageList) {
    this.headImageList = headImageList;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor iconImages(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorIconImagesInner> iconImages) {
    
    this.iconImages = iconImages;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor addIconImagesItem(NativeAnchorUpdateV30RequestAnchorInfoGameAnchorIconImagesInner iconImagesItem) {
    if (this.iconImages == null) {
      this.iconImages = new ArrayList<>();
    }
    this.iconImages.add(iconImagesItem);
    return this;
  }

   /**
   * 小游戏图片list，当前锚点类型且game_type为MICRO_GAME必填，比例为1：1，最多一个
   * @return iconImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorIconImagesInner> getIconImages() {
    return iconImages;
  }


  public void setIconImages(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorIconImagesInner> iconImages) {
    this.iconImages = iconImages;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 微信小游戏ID，当前锚点类型且game_type为MICRO_GAME必填
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor iosAnchorTitle(String iosAnchorTitle) {
    
    this.iosAnchorTitle = iosAnchorTitle;
    return this;
  }

   /**
   * iOS锚点入口标题字段，长度1～12
   * @return iosAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getIosAnchorTitle() {
    return iosAnchorTitle;
  }


  public void setIosAnchorTitle(String iosAnchorTitle) {
    this.iosAnchorTitle = iosAnchorTitle;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor iosDownloadUrl(String iosDownloadUrl) {
    
    this.iosDownloadUrl = iosDownloadUrl;
    return this;
  }

   /**
   * iOS下载链接，game_type为微信小游戏场景下不用传入
   * @return iosDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getIosDownloadUrl() {
    return iosDownloadUrl;
  }


  public void setIosDownloadUrl(String iosDownloadUrl) {
    this.iosDownloadUrl = iosDownloadUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor otherDescription(String otherDescription) {
    
    this.otherDescription = otherDescription;
    return this;
  }

   /**
   * 其他说明，长度 1～200
   * @return otherDescription
  **/
  @javax.annotation.Nullable
  public String getOtherDescription() {
    return otherDescription;
  }


  public void setOtherDescription(String otherDescription) {
    this.otherDescription = otherDescription;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor pathParam(String pathParam) {
    
    this.pathParam = pathParam;
    return this;
  }

   /**
   * 微信小游戏/小程序路径参数
   * @return pathParam
  **/
  @javax.annotation.Nullable
  public String getPathParam() {
    return pathParam;
  }


  public void setPathParam(String pathParam) {
    this.pathParam = pathParam;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor platformType(Long platformType) {
    
    this.platformType = platformType;
    return this;
  }

   /**
   * 配置平台，game_type为微信小游戏场景下不用传入
   * @return platformType
  **/
  @javax.annotation.Nullable
  public Long getPlatformType() {
    return platformType;
  }


  public void setPlatformType(Long platformType) {
    this.platformType = platformType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorUpdateV30RequestAnchorInfoGameAnchor nativeAnchorUpdateV30RequestAnchorInfoGameAnchor = (NativeAnchorUpdateV30RequestAnchorInfoGameAnchor) o;
    return Objects.equals(this.anchorImageMode, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.anchorImageMode) &&
        Objects.equals(this.androidAnchorTitle, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.androidAnchorTitle) &&
        Objects.equals(this.androidDownloadUrl, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.androidDownloadUrl) &&
        Objects.equals(this.appImages, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.appImages) &&
        Objects.equals(this.appOpenUrl, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.appOpenUrl) &&
        Objects.equals(this.appTags, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.appTags) &&
        Objects.equals(this.gameBonus, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.gameBonus) &&
        Objects.equals(this.gameCharatoristic, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.gameCharatoristic) &&
        Objects.equals(this.gameDescription, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.gameDescription) &&
        Objects.equals(this.gamePackageList, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.gamePackageList) &&
        Objects.equals(this.gameType, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.gameType) &&
        Objects.equals(this.guideText, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.guideText) &&
        Objects.equals(this.harmonyDownloadUrl, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.harmonyDownloadUrl) &&
        Objects.equals(this.headImageList, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.headImageList) &&
        Objects.equals(this.iconImages, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.iconImages) &&
        Objects.equals(this.instanceId, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.instanceId) &&
        Objects.equals(this.iosAnchorTitle, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.iosAnchorTitle) &&
        Objects.equals(this.iosDownloadUrl, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.iosDownloadUrl) &&
        Objects.equals(this.otherDescription, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.otherDescription) &&
        Objects.equals(this.pathParam, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.pathParam) &&
        Objects.equals(this.platformType, nativeAnchorUpdateV30RequestAnchorInfoGameAnchor.platformType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorImageMode, androidAnchorTitle, androidDownloadUrl, appImages, appOpenUrl, appTags, gameBonus, gameCharatoristic, gameDescription, gamePackageList, gameType, guideText, harmonyDownloadUrl, headImageList, iconImages, instanceId, iosAnchorTitle, iosDownloadUrl, otherDescription, pathParam, platformType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfoGameAnchor {\n");
    sb.append("    anchorImageMode: ").append(toIndentedString(anchorImageMode)).append("\n");
    sb.append("    androidAnchorTitle: ").append(toIndentedString(androidAnchorTitle)).append("\n");
    sb.append("    androidDownloadUrl: ").append(toIndentedString(androidDownloadUrl)).append("\n");
    sb.append("    appImages: ").append(toIndentedString(appImages)).append("\n");
    sb.append("    appOpenUrl: ").append(toIndentedString(appOpenUrl)).append("\n");
    sb.append("    appTags: ").append(toIndentedString(appTags)).append("\n");
    sb.append("    gameBonus: ").append(toIndentedString(gameBonus)).append("\n");
    sb.append("    gameCharatoristic: ").append(toIndentedString(gameCharatoristic)).append("\n");
    sb.append("    gameDescription: ").append(toIndentedString(gameDescription)).append("\n");
    sb.append("    gamePackageList: ").append(toIndentedString(gamePackageList)).append("\n");
    sb.append("    gameType: ").append(toIndentedString(gameType)).append("\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    harmonyDownloadUrl: ").append(toIndentedString(harmonyDownloadUrl)).append("\n");
    sb.append("    headImageList: ").append(toIndentedString(headImageList)).append("\n");
    sb.append("    iconImages: ").append(toIndentedString(iconImages)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    iosAnchorTitle: ").append(toIndentedString(iosAnchorTitle)).append("\n");
    sb.append("    iosDownloadUrl: ").append(toIndentedString(iosDownloadUrl)).append("\n");
    sb.append("    otherDescription: ").append(toIndentedString(otherDescription)).append("\n");
    sb.append("    pathParam: ").append(toIndentedString(pathParam)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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
    openapiFields.add("anchor_image_mode");
    openapiFields.add("android_anchor_title");
    openapiFields.add("android_download_url");
    openapiFields.add("app_images");
    openapiFields.add("app_open_url");
    openapiFields.add("app_tags");
    openapiFields.add("game_bonus");
    openapiFields.add("game_charatoristic");
    openapiFields.add("game_description");
    openapiFields.add("game_package_list");
    openapiFields.add("game_type");
    openapiFields.add("guide_text");
    openapiFields.add("harmony_download_url");
    openapiFields.add("head_image_list");
    openapiFields.add("icon_images");
    openapiFields.add("instance_id");
    openapiFields.add("ios_anchor_title");
    openapiFields.add("ios_download_url");
    openapiFields.add("other_description");
    openapiFields.add("path_param");
    openapiFields.add("platform_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorUpdateV30RequestAnchorInfoGameAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfoGameAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoGameAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfoGameAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoGameAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfoGameAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfoGameAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfoGameAnchor
  */
  public static NativeAnchorUpdateV30RequestAnchorInfoGameAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfoGameAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

