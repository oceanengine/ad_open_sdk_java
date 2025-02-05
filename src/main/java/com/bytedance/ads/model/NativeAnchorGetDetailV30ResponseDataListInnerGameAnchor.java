/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorGetDetailV30DataListGameAnchorGameType;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorAppImagesInner;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorHeadImageListInner;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorIconImagesInner;
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
 * 配置平台（1:不限,2:安卓,3:iOS）
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor {
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
  private List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorAppImagesInner> appImages = null;

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
  private List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner> gamePackageList = null;

  public static final String SERIALIZED_NAME_GAME_TYPE = "game_type";
  @SerializedName(SERIALIZED_NAME_GAME_TYPE)
  private NativeAnchorGetDetailV30DataListGameAnchorGameType gameType = null;

  public static final String SERIALIZED_NAME_GUIDE_TEXT = "guide_text";
  @SerializedName(SERIALIZED_NAME_GUIDE_TEXT)
  private String guideText = null;

  public static final String SERIALIZED_NAME_HEAD_IMAGE_LIST = "head_image_list";
  @SerializedName(SERIALIZED_NAME_HEAD_IMAGE_LIST)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorHeadImageListInner> headImageList = null;

  public static final String SERIALIZED_NAME_ICON_IMAGES = "icon_images";
  @SerializedName(SERIALIZED_NAME_ICON_IMAGES)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorIconImagesInner> iconImages = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_IOS_ANCHOR_TITLE = "ios_anchor_title";
  @SerializedName(SERIALIZED_NAME_IOS_ANCHOR_TITLE)
  private String iosAnchorTitle = null;

  public static final String SERIALIZED_NAME_IOS_DOWNLOAD_URL = "ios_download_url";
  @SerializedName(SERIALIZED_NAME_IOS_DOWNLOAD_URL)
  private String iosDownloadUrl = null;

  public static final String SERIALIZED_NAME_MICRO_APP_NAME = "micro_app_name";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_NAME)
  private String microAppName = null;

  public static final String SERIALIZED_NAME_MICRO_APP_USER_NAME = "micro_app_user_name";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_USER_NAME)
  private String microAppUserName = null;

  public static final String SERIALIZED_NAME_OTHER_DESCRIPTION = "other_description";
  @SerializedName(SERIALIZED_NAME_OTHER_DESCRIPTION)
  private String otherDescription = null;

  public static final String SERIALIZED_NAME_PATH_PARAM = "path_param";
  @SerializedName(SERIALIZED_NAME_PATH_PARAM)
  private String pathParam = null;

  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private Long platformType = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor anchorImageMode(Long anchorImageMode) {
    
    this.anchorImageMode = anchorImageMode;
    return this;
  }

   /**
   * 
   * @return anchorImageMode
  **/
  @javax.annotation.Nullable
  public Long getAnchorImageMode() {
    return anchorImageMode;
  }


  public void setAnchorImageMode(Long anchorImageMode) {
    this.anchorImageMode = anchorImageMode;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor androidAnchorTitle(String androidAnchorTitle) {
    
    this.androidAnchorTitle = androidAnchorTitle;
    return this;
  }

   /**
   * 
   * @return androidAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getAndroidAnchorTitle() {
    return androidAnchorTitle;
  }


  public void setAndroidAnchorTitle(String androidAnchorTitle) {
    this.androidAnchorTitle = androidAnchorTitle;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor androidDownloadUrl(String androidDownloadUrl) {
    
    this.androidDownloadUrl = androidDownloadUrl;
    return this;
  }

   /**
   * 
   * @return androidDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidDownloadUrl() {
    return androidDownloadUrl;
  }


  public void setAndroidDownloadUrl(String androidDownloadUrl) {
    this.androidDownloadUrl = androidDownloadUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor appImages(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorAppImagesInner> appImages) {
    
    this.appImages = appImages;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor addAppImagesItem(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorAppImagesInner appImagesItem) {
    if (this.appImages == null) {
      this.appImages = new ArrayList<>();
    }
    this.appImages.add(appImagesItem);
    return this;
  }

   /**
   * 
   * @return appImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorAppImagesInner> getAppImages() {
    return appImages;
  }


  public void setAppImages(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorAppImagesInner> appImages) {
    this.appImages = appImages;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor appOpenUrl(String appOpenUrl) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor appTags(List<String> appTags) {
    
    this.appTags = appTags;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor addAppTagsItem(String appTagsItem) {
    if (this.appTags == null) {
      this.appTags = new ArrayList<>();
    }
    this.appTags.add(appTagsItem);
    return this;
  }

   /**
   * 
   * @return appTags
  **/
  @javax.annotation.Nullable
  public List<String> getAppTags() {
    return appTags;
  }


  public void setAppTags(List<String> appTags) {
    this.appTags = appTags;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gameBonus(Boolean gameBonus) {
    
    this.gameBonus = gameBonus;
    return this;
  }

   /**
   * 
   * @return gameBonus
  **/
  @javax.annotation.Nullable
  public Boolean getGameBonus() {
    return gameBonus;
  }


  public void setGameBonus(Boolean gameBonus) {
    this.gameBonus = gameBonus;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gameCharatoristic(String gameCharatoristic) {
    
    this.gameCharatoristic = gameCharatoristic;
    return this;
  }

   /**
   * 
   * @return gameCharatoristic
  **/
  @javax.annotation.Nullable
  public String getGameCharatoristic() {
    return gameCharatoristic;
  }


  public void setGameCharatoristic(String gameCharatoristic) {
    this.gameCharatoristic = gameCharatoristic;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gameDescription(String gameDescription) {
    
    this.gameDescription = gameDescription;
    return this;
  }

   /**
   * 
   * @return gameDescription
  **/
  @javax.annotation.Nullable
  public String getGameDescription() {
    return gameDescription;
  }


  public void setGameDescription(String gameDescription) {
    this.gameDescription = gameDescription;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gamePackageList(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner> gamePackageList) {
    
    this.gamePackageList = gamePackageList;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor addGamePackageListItem(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner gamePackageListItem) {
    if (this.gamePackageList == null) {
      this.gamePackageList = new ArrayList<>();
    }
    this.gamePackageList.add(gamePackageListItem);
    return this;
  }

   /**
   * 
   * @return gamePackageList
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner> getGamePackageList() {
    return gamePackageList;
  }


  public void setGamePackageList(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorGamePackageListInner> gamePackageList) {
    this.gamePackageList = gamePackageList;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor gameType(NativeAnchorGetDetailV30DataListGameAnchorGameType gameType) {
    
    this.gameType = gameType;
    return this;
  }

   /**
   * Get gameType
   * @return gameType
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30DataListGameAnchorGameType getGameType() {
    return gameType;
  }


  public void setGameType(NativeAnchorGetDetailV30DataListGameAnchorGameType gameType) {
    this.gameType = gameType;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor guideText(String guideText) {
    
    this.guideText = guideText;
    return this;
  }

   /**
   * 
   * @return guideText
  **/
  @javax.annotation.Nullable
  public String getGuideText() {
    return guideText;
  }


  public void setGuideText(String guideText) {
    this.guideText = guideText;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor headImageList(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorHeadImageListInner> headImageList) {
    
    this.headImageList = headImageList;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor addHeadImageListItem(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorHeadImageListInner headImageListItem) {
    if (this.headImageList == null) {
      this.headImageList = new ArrayList<>();
    }
    this.headImageList.add(headImageListItem);
    return this;
  }

   /**
   * 
   * @return headImageList
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorHeadImageListInner> getHeadImageList() {
    return headImageList;
  }


  public void setHeadImageList(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorHeadImageListInner> headImageList) {
    this.headImageList = headImageList;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor iconImages(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorIconImagesInner> iconImages) {
    
    this.iconImages = iconImages;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor addIconImagesItem(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorIconImagesInner iconImagesItem) {
    if (this.iconImages == null) {
      this.iconImages = new ArrayList<>();
    }
    this.iconImages.add(iconImagesItem);
    return this;
  }

   /**
   * 
   * @return iconImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorIconImagesInner> getIconImages() {
    return iconImages;
  }


  public void setIconImages(List<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchorIconImagesInner> iconImages) {
    this.iconImages = iconImages;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor iosAnchorTitle(String iosAnchorTitle) {
    
    this.iosAnchorTitle = iosAnchorTitle;
    return this;
  }

   /**
   * 
   * @return iosAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getIosAnchorTitle() {
    return iosAnchorTitle;
  }


  public void setIosAnchorTitle(String iosAnchorTitle) {
    this.iosAnchorTitle = iosAnchorTitle;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor iosDownloadUrl(String iosDownloadUrl) {
    
    this.iosDownloadUrl = iosDownloadUrl;
    return this;
  }

   /**
   * 
   * @return iosDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getIosDownloadUrl() {
    return iosDownloadUrl;
  }


  public void setIosDownloadUrl(String iosDownloadUrl) {
    this.iosDownloadUrl = iosDownloadUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor microAppName(String microAppName) {
    
    this.microAppName = microAppName;
    return this;
  }

   /**
   * 
   * @return microAppName
  **/
  @javax.annotation.Nullable
  public String getMicroAppName() {
    return microAppName;
  }


  public void setMicroAppName(String microAppName) {
    this.microAppName = microAppName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor microAppUserName(String microAppUserName) {
    
    this.microAppUserName = microAppUserName;
    return this;
  }

   /**
   * 
   * @return microAppUserName
  **/
  @javax.annotation.Nullable
  public String getMicroAppUserName() {
    return microAppUserName;
  }


  public void setMicroAppUserName(String microAppUserName) {
    this.microAppUserName = microAppUserName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor otherDescription(String otherDescription) {
    
    this.otherDescription = otherDescription;
    return this;
  }

   /**
   * 
   * @return otherDescription
  **/
  @javax.annotation.Nullable
  public String getOtherDescription() {
    return otherDescription;
  }


  public void setOtherDescription(String otherDescription) {
    this.otherDescription = otherDescription;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor pathParam(String pathParam) {
    
    this.pathParam = pathParam;
    return this;
  }

   /**
   * 
   * @return pathParam
  **/
  @javax.annotation.Nullable
  public String getPathParam() {
    return pathParam;
  }


  public void setPathParam(String pathParam) {
    this.pathParam = pathParam;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor platformType(Long platformType) {
    
    this.platformType = platformType;
    return this;
  }

   /**
   * 配置平台（1:不限,2:安卓,3:iOS）
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
    NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor = (NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor) o;
    return Objects.equals(this.anchorImageMode, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.anchorImageMode) &&
        Objects.equals(this.androidAnchorTitle, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.androidAnchorTitle) &&
        Objects.equals(this.androidDownloadUrl, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.androidDownloadUrl) &&
        Objects.equals(this.appImages, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.appImages) &&
        Objects.equals(this.appOpenUrl, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.appOpenUrl) &&
        Objects.equals(this.appTags, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.appTags) &&
        Objects.equals(this.gameBonus, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.gameBonus) &&
        Objects.equals(this.gameCharatoristic, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.gameCharatoristic) &&
        Objects.equals(this.gameDescription, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.gameDescription) &&
        Objects.equals(this.gamePackageList, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.gamePackageList) &&
        Objects.equals(this.gameType, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.gameType) &&
        Objects.equals(this.guideText, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.guideText) &&
        Objects.equals(this.headImageList, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.headImageList) &&
        Objects.equals(this.iconImages, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.iconImages) &&
        Objects.equals(this.instanceId, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.instanceId) &&
        Objects.equals(this.iosAnchorTitle, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.iosAnchorTitle) &&
        Objects.equals(this.iosDownloadUrl, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.iosDownloadUrl) &&
        Objects.equals(this.microAppName, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.microAppName) &&
        Objects.equals(this.microAppUserName, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.microAppUserName) &&
        Objects.equals(this.otherDescription, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.otherDescription) &&
        Objects.equals(this.pathParam, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.pathParam) &&
        Objects.equals(this.platformType, nativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.platformType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorImageMode, androidAnchorTitle, androidDownloadUrl, appImages, appOpenUrl, appTags, gameBonus, gameCharatoristic, gameDescription, gamePackageList, gameType, guideText, headImageList, iconImages, instanceId, iosAnchorTitle, iosDownloadUrl, microAppName, microAppUserName, otherDescription, pathParam, platformType);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor {\n");
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
    sb.append("    headImageList: ").append(toIndentedString(headImageList)).append("\n");
    sb.append("    iconImages: ").append(toIndentedString(iconImages)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    iosAnchorTitle: ").append(toIndentedString(iosAnchorTitle)).append("\n");
    sb.append("    iosDownloadUrl: ").append(toIndentedString(iosDownloadUrl)).append("\n");
    sb.append("    microAppName: ").append(toIndentedString(microAppName)).append("\n");
    sb.append("    microAppUserName: ").append(toIndentedString(microAppUserName)).append("\n");
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
    openapiFields.add("head_image_list");
    openapiFields.add("icon_images");
    openapiFields.add("instance_id");
    openapiFields.add("ios_anchor_title");
    openapiFields.add("ios_download_url");
    openapiFields.add("micro_app_name");
    openapiFields.add("micro_app_user_name");
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
       if (!NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerGameAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

