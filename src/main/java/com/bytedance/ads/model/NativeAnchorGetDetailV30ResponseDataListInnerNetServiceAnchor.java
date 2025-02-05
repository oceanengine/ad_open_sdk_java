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
import com.bytedance.ads.model.NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorAppImagesInner;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorHeadImageListInner;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorIconImagesInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor {
  public static final String SERIALIZED_NAME_ANCHOR_IMAGE_MODE = "anchor_image_mode";
  @SerializedName(SERIALIZED_NAME_ANCHOR_IMAGE_MODE)
  private Long anchorImageMode = null;

  public static final String SERIALIZED_NAME_ANDROID_ANCHOR_TITLE = "android_anchor_title";
  @SerializedName(SERIALIZED_NAME_ANDROID_ANCHOR_TITLE)
  private String androidAnchorTitle = null;

  public static final String SERIALIZED_NAME_ANDROID_DOWNLOAD_URL = "android_download_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_DOWNLOAD_URL)
  private String androidDownloadUrl = null;

  public static final String SERIALIZED_NAME_APP_DESCRIPTION = "app_description";
  @SerializedName(SERIALIZED_NAME_APP_DESCRIPTION)
  private String appDescription = null;

  public static final String SERIALIZED_NAME_APP_IMAGES = "app_images";
  @SerializedName(SERIALIZED_NAME_APP_IMAGES)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorAppImagesInner> appImages = null;

  public static final String SERIALIZED_NAME_APP_OPEN_URL = "app_open_url";
  @SerializedName(SERIALIZED_NAME_APP_OPEN_URL)
  private String appOpenUrl = null;

  public static final String SERIALIZED_NAME_APP_TAGS = "app_tags";
  @SerializedName(SERIALIZED_NAME_APP_TAGS)
  private List<String> appTags = null;

  public static final String SERIALIZED_NAME_GUIDE_TEXT = "guide_text";
  @SerializedName(SERIALIZED_NAME_GUIDE_TEXT)
  private String guideText = null;

  public static final String SERIALIZED_NAME_HEAD_IMAGE_LIST = "head_image_list";
  @SerializedName(SERIALIZED_NAME_HEAD_IMAGE_LIST)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorHeadImageListInner> headImageList = null;

  public static final String SERIALIZED_NAME_ICON_IMAGES = "icon_images";
  @SerializedName(SERIALIZED_NAME_ICON_IMAGES)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorIconImagesInner> iconImages = null;

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

  public static final String SERIALIZED_NAME_MICRO_APP_PATH = "micro_app_path";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_PATH)
  private String microAppPath = null;

  public static final String SERIALIZED_NAME_MICRO_APP_USER_NAME = "micro_app_user_name";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_USER_NAME)
  private String microAppUserName = null;

  public static final String SERIALIZED_NAME_NET_SERVICE_TYPE = "net_service_type";
  @SerializedName(SERIALIZED_NAME_NET_SERVICE_TYPE)
  private NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType netServiceType = null;

  public static final String SERIALIZED_NAME_NOVEL_CHAPTER = "novel_chapter";
  @SerializedName(SERIALIZED_NAME_NOVEL_CHAPTER)
  private String novelChapter = null;

  public static final String SERIALIZED_NAME_PATH_PARAM = "path_param";
  @SerializedName(SERIALIZED_NAME_PATH_PARAM)
  private String pathParam = null;

  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private Long platformType = null;

  public static final String SERIALIZED_NAME_QUICK_APP_ID = "quick_app_id";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_ID)
  private Long quickAppId = null;

  public static final String SERIALIZED_NAME_WECHAT_EXTERNAL_URL = "wechat_external_url";
  @SerializedName(SERIALIZED_NAME_WECHAT_EXTERNAL_URL)
  private String wechatExternalUrl = null;

  public static final String SERIALIZED_NAME_WECHAT_PACKAGE_ID = "wechat_package_id";
  @SerializedName(SERIALIZED_NAME_WECHAT_PACKAGE_ID)
  private Long wechatPackageId = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor anchorImageMode(Long anchorImageMode) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor androidAnchorTitle(String androidAnchorTitle) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor androidDownloadUrl(String androidDownloadUrl) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor appDescription(String appDescription) {
    
    this.appDescription = appDescription;
    return this;
  }

   /**
   * 
   * @return appDescription
  **/
  @javax.annotation.Nullable
  public String getAppDescription() {
    return appDescription;
  }


  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor appImages(List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorAppImagesInner> appImages) {
    
    this.appImages = appImages;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor addAppImagesItem(NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorAppImagesInner appImagesItem) {
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
  public List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorAppImagesInner> getAppImages() {
    return appImages;
  }


  public void setAppImages(List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorAppImagesInner> appImages) {
    this.appImages = appImages;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor appOpenUrl(String appOpenUrl) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor appTags(List<String> appTags) {
    
    this.appTags = appTags;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor addAppTagsItem(String appTagsItem) {
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor guideText(String guideText) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor headImageList(List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorHeadImageListInner> headImageList) {
    
    this.headImageList = headImageList;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor addHeadImageListItem(NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorHeadImageListInner headImageListItem) {
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
  public List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorHeadImageListInner> getHeadImageList() {
    return headImageList;
  }


  public void setHeadImageList(List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorHeadImageListInner> headImageList) {
    this.headImageList = headImageList;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor iconImages(List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorIconImagesInner> iconImages) {
    
    this.iconImages = iconImages;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor addIconImagesItem(NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorIconImagesInner iconImagesItem) {
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
  public List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorIconImagesInner> getIconImages() {
    return iconImages;
  }


  public void setIconImages(List<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchorIconImagesInner> iconImages) {
    this.iconImages = iconImages;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor instanceId(Long instanceId) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor iosAnchorTitle(String iosAnchorTitle) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor iosDownloadUrl(String iosDownloadUrl) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor microAppName(String microAppName) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor microAppPath(String microAppPath) {
    
    this.microAppPath = microAppPath;
    return this;
  }

   /**
   * 
   * @return microAppPath
  **/
  @javax.annotation.Nullable
  public String getMicroAppPath() {
    return microAppPath;
  }


  public void setMicroAppPath(String microAppPath) {
    this.microAppPath = microAppPath;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor microAppUserName(String microAppUserName) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor netServiceType(NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType netServiceType) {
    
    this.netServiceType = netServiceType;
    return this;
  }

   /**
   * Get netServiceType
   * @return netServiceType
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType getNetServiceType() {
    return netServiceType;
  }


  public void setNetServiceType(NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType netServiceType) {
    this.netServiceType = netServiceType;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor novelChapter(String novelChapter) {
    
    this.novelChapter = novelChapter;
    return this;
  }

   /**
   * 
   * @return novelChapter
  **/
  @javax.annotation.Nullable
  public String getNovelChapter() {
    return novelChapter;
  }


  public void setNovelChapter(String novelChapter) {
    this.novelChapter = novelChapter;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor pathParam(String pathParam) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor platformType(Long platformType) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor quickAppId(Long quickAppId) {
    
    this.quickAppId = quickAppId;
    return this;
  }

   /**
   * 
   * @return quickAppId
  **/
  @javax.annotation.Nullable
  public Long getQuickAppId() {
    return quickAppId;
  }


  public void setQuickAppId(Long quickAppId) {
    this.quickAppId = quickAppId;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor wechatExternalUrl(String wechatExternalUrl) {
    
    this.wechatExternalUrl = wechatExternalUrl;
    return this;
  }

   /**
   * 
   * @return wechatExternalUrl
  **/
  @javax.annotation.Nullable
  public String getWechatExternalUrl() {
    return wechatExternalUrl;
  }


  public void setWechatExternalUrl(String wechatExternalUrl) {
    this.wechatExternalUrl = wechatExternalUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor wechatPackageId(Long wechatPackageId) {
    
    this.wechatPackageId = wechatPackageId;
    return this;
  }

   /**
   * 
   * @return wechatPackageId
  **/
  @javax.annotation.Nullable
  public Long getWechatPackageId() {
    return wechatPackageId;
  }


  public void setWechatPackageId(Long wechatPackageId) {
    this.wechatPackageId = wechatPackageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor = (NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor) o;
    return Objects.equals(this.anchorImageMode, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.anchorImageMode) &&
        Objects.equals(this.androidAnchorTitle, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.androidAnchorTitle) &&
        Objects.equals(this.androidDownloadUrl, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.androidDownloadUrl) &&
        Objects.equals(this.appDescription, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.appDescription) &&
        Objects.equals(this.appImages, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.appImages) &&
        Objects.equals(this.appOpenUrl, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.appOpenUrl) &&
        Objects.equals(this.appTags, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.appTags) &&
        Objects.equals(this.guideText, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.guideText) &&
        Objects.equals(this.headImageList, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.headImageList) &&
        Objects.equals(this.iconImages, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.iconImages) &&
        Objects.equals(this.instanceId, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.instanceId) &&
        Objects.equals(this.iosAnchorTitle, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.iosAnchorTitle) &&
        Objects.equals(this.iosDownloadUrl, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.iosDownloadUrl) &&
        Objects.equals(this.microAppName, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.microAppName) &&
        Objects.equals(this.microAppPath, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.microAppPath) &&
        Objects.equals(this.microAppUserName, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.microAppUserName) &&
        Objects.equals(this.netServiceType, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.netServiceType) &&
        Objects.equals(this.novelChapter, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.novelChapter) &&
        Objects.equals(this.pathParam, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.pathParam) &&
        Objects.equals(this.platformType, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.platformType) &&
        Objects.equals(this.quickAppId, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.quickAppId) &&
        Objects.equals(this.wechatExternalUrl, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.wechatExternalUrl) &&
        Objects.equals(this.wechatPackageId, nativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.wechatPackageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorImageMode, androidAnchorTitle, androidDownloadUrl, appDescription, appImages, appOpenUrl, appTags, guideText, headImageList, iconImages, instanceId, iosAnchorTitle, iosDownloadUrl, microAppName, microAppPath, microAppUserName, netServiceType, novelChapter, pathParam, platformType, quickAppId, wechatExternalUrl, wechatPackageId);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor {\n");
    sb.append("    anchorImageMode: ").append(toIndentedString(anchorImageMode)).append("\n");
    sb.append("    androidAnchorTitle: ").append(toIndentedString(androidAnchorTitle)).append("\n");
    sb.append("    androidDownloadUrl: ").append(toIndentedString(androidDownloadUrl)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    appImages: ").append(toIndentedString(appImages)).append("\n");
    sb.append("    appOpenUrl: ").append(toIndentedString(appOpenUrl)).append("\n");
    sb.append("    appTags: ").append(toIndentedString(appTags)).append("\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    headImageList: ").append(toIndentedString(headImageList)).append("\n");
    sb.append("    iconImages: ").append(toIndentedString(iconImages)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    iosAnchorTitle: ").append(toIndentedString(iosAnchorTitle)).append("\n");
    sb.append("    iosDownloadUrl: ").append(toIndentedString(iosDownloadUrl)).append("\n");
    sb.append("    microAppName: ").append(toIndentedString(microAppName)).append("\n");
    sb.append("    microAppPath: ").append(toIndentedString(microAppPath)).append("\n");
    sb.append("    microAppUserName: ").append(toIndentedString(microAppUserName)).append("\n");
    sb.append("    netServiceType: ").append(toIndentedString(netServiceType)).append("\n");
    sb.append("    novelChapter: ").append(toIndentedString(novelChapter)).append("\n");
    sb.append("    pathParam: ").append(toIndentedString(pathParam)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    quickAppId: ").append(toIndentedString(quickAppId)).append("\n");
    sb.append("    wechatExternalUrl: ").append(toIndentedString(wechatExternalUrl)).append("\n");
    sb.append("    wechatPackageId: ").append(toIndentedString(wechatPackageId)).append("\n");
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
    openapiFields.add("app_description");
    openapiFields.add("app_images");
    openapiFields.add("app_open_url");
    openapiFields.add("app_tags");
    openapiFields.add("guide_text");
    openapiFields.add("head_image_list");
    openapiFields.add("icon_images");
    openapiFields.add("instance_id");
    openapiFields.add("ios_anchor_title");
    openapiFields.add("ios_download_url");
    openapiFields.add("micro_app_name");
    openapiFields.add("micro_app_path");
    openapiFields.add("micro_app_user_name");
    openapiFields.add("net_service_type");
    openapiFields.add("novel_chapter");
    openapiFields.add("path_param");
    openapiFields.add("platform_type");
    openapiFields.add("quick_app_id");
    openapiFields.add("wechat_external_url");
    openapiFields.add("wechat_package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerNetServiceAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

