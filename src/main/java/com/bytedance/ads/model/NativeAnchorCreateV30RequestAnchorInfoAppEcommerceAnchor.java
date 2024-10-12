/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorAppIcon;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo;
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
 * 电商下载锚点
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor {
  public static final String SERIALIZED_NAME_ACTIVITIY_INFO = "activitiy_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITIY_INFO)
  private String activitiyInfo = null;

  public static final String SERIALIZED_NAME_ANDROID_ANCHOR_TITLE = "android_anchor_title";
  @SerializedName(SERIALIZED_NAME_ANDROID_ANCHOR_TITLE)
  private String androidAnchorTitle = null;

  public static final String SERIALIZED_NAME_ANDROID_PKG_NAME = "android_pkg_name";
  @SerializedName(SERIALIZED_NAME_ANDROID_PKG_NAME)
  private String androidPkgName = null;

  public static final String SERIALIZED_NAME_APP_ICON = "app_icon";
  @SerializedName(SERIALIZED_NAME_APP_ICON)
  private NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorAppIcon appIcon = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_APP_OPEN_URL = "app_open_url";
  @SerializedName(SERIALIZED_NAME_APP_OPEN_URL)
  private String appOpenUrl = null;

  public static final String SERIALIZED_NAME_DETAIL_INFO = "detail_info";
  @SerializedName(SERIALIZED_NAME_DETAIL_INFO)
  private String detailInfo = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_GUIDE_TEXT = "download_guide_text";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_GUIDE_TEXT)
  private String downloadGuideText = null;

  public static final String SERIALIZED_NAME_EXTERNAL_TYPE = "external_type";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TYPE)
  private Long externalType = null;

  public static final String SERIALIZED_NAME_IOS_ANCHOR_TITLE = "ios_anchor_title";
  @SerializedName(SERIALIZED_NAME_IOS_ANCHOR_TITLE)
  private String iosAnchorTitle = null;

  public static final String SERIALIZED_NAME_OFFICIAL_ACTI_BANNER_IMAGE = "official_acti_banner_image";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_ACTI_BANNER_IMAGE)
  private NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage = null;

  public static final String SERIALIZED_NAME_OFFICIAL_ACTI_TEXT = "official_acti_text";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_ACTI_TEXT)
  private String officialActiText = null;

  public static final String SERIALIZED_NAME_ORANGE_SITE_INFO = "orange_site_info";
  @SerializedName(SERIALIZED_NAME_ORANGE_SITE_INFO)
  private NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE = "product_image";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE)
  private NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage productImage = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_PRICE = "product_price";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PRICE)
  private Double productPrice = null;

  public static final String SERIALIZED_NAME_PRODUCT_TAGS = "product_tags";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TAGS)
  private List<String> productTags = null;

  public static final String SERIALIZED_NAME_SERVICE_INFO = "service_info";
  @SerializedName(SERIALIZED_NAME_SERVICE_INFO)
  private String serviceInfo = null;

  public static final String SERIALIZED_NAME_THIRD_SITE_INFO = "third_site_info";
  @SerializedName(SERIALIZED_NAME_THIRD_SITE_INFO)
  private NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo thirdSiteInfo = null;

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor() {
  }

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor activitiyInfo(String activitiyInfo) {
    
    this.activitiyInfo = activitiyInfo;
    return this;
  }

   /**
   * 活动信息文案，长度：1～20
   * @return activitiyInfo
  **/
  @javax.annotation.Nullable
  public String getActivitiyInfo() {
    return activitiyInfo;
  }


  public void setActivitiyInfo(String activitiyInfo) {
    this.activitiyInfo = activitiyInfo;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor androidAnchorTitle(String androidAnchorTitle) {
    
    this.androidAnchorTitle = androidAnchorTitle;
    return this;
  }

   /**
   * 安卓锚点入口标题字段，长度：1～12
   * @return androidAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getAndroidAnchorTitle() {
    return androidAnchorTitle;
  }


  public void setAndroidAnchorTitle(String androidAnchorTitle) {
    this.androidAnchorTitle = androidAnchorTitle;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor androidPkgName(String androidPkgName) {
    
    this.androidPkgName = androidPkgName;
    return this;
  }

   /**
   * 安卓包名
   * @return androidPkgName
  **/
  @javax.annotation.Nullable
  public String getAndroidPkgName() {
    return androidPkgName;
  }


  public void setAndroidPkgName(String androidPkgName) {
    this.androidPkgName = androidPkgName;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor appIcon(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorAppIcon appIcon) {
    
    this.appIcon = appIcon;
    return this;
  }

   /**
   * Get appIcon
   * @return appIcon
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorAppIcon getAppIcon() {
    return appIcon;
  }


  public void setAppIcon(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorAppIcon appIcon) {
    this.appIcon = appIcon;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称，长度：1～6
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor appOpenUrl(String appOpenUrl) {
    
    this.appOpenUrl = appOpenUrl;
    return this;
  }

   /**
   * 应用吊起链接
   * @return appOpenUrl
  **/
  @javax.annotation.Nullable
  public String getAppOpenUrl() {
    return appOpenUrl;
  }


  public void setAppOpenUrl(String appOpenUrl) {
    this.appOpenUrl = appOpenUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor detailInfo(String detailInfo) {
    
    this.detailInfo = detailInfo;
    return this;
  }

   /**
   * 详情信息文案，长度：1～20
   * @return detailInfo
  **/
  @javax.annotation.Nullable
  public String getDetailInfo() {
    return detailInfo;
  }


  public void setDetailInfo(String detailInfo) {
    this.detailInfo = detailInfo;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor downloadGuideText(String downloadGuideText) {
    
    this.downloadGuideText = downloadGuideText;
    return this;
  }

   /**
   * APP下载引导文案，长度：1～12
   * @return downloadGuideText
  **/
  @javax.annotation.Nullable
  public String getDownloadGuideText() {
    return downloadGuideText;
  }


  public void setDownloadGuideText(String downloadGuideText) {
    this.downloadGuideText = downloadGuideText;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor externalType(Long externalType) {
    
    this.externalType = externalType;
    return this;
  }

   /**
   * 跳转链接类型枚举，1：橙子建站，橙子建站落地页设置字段必填；2：第三方落地页，第三方落地页设置字段必填
   * @return externalType
  **/
  @javax.annotation.Nullable
  public Long getExternalType() {
    return externalType;
  }


  public void setExternalType(Long externalType) {
    this.externalType = externalType;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor iosAnchorTitle(String iosAnchorTitle) {
    
    this.iosAnchorTitle = iosAnchorTitle;
    return this;
  }

   /**
   * ios 锚点入口标题字段，长度：1～12
   * @return iosAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getIosAnchorTitle() {
    return iosAnchorTitle;
  }


  public void setIosAnchorTitle(String iosAnchorTitle) {
    this.iosAnchorTitle = iosAnchorTitle;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor officialActiBannerImage(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage) {
    
    this.officialActiBannerImage = officialActiBannerImage;
    return this;
  }

   /**
   * Get officialActiBannerImage
   * @return officialActiBannerImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage getOfficialActiBannerImage() {
    return officialActiBannerImage;
  }


  public void setOfficialActiBannerImage(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage) {
    this.officialActiBannerImage = officialActiBannerImage;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor officialActiText(String officialActiText) {
    
    this.officialActiText = officialActiText;
    return this;
  }

   /**
   * 官方活动描述详情，长度：1～15
   * @return officialActiText
  **/
  @javax.annotation.Nullable
  public String getOfficialActiText() {
    return officialActiText;
  }


  public void setOfficialActiText(String officialActiText) {
    this.officialActiText = officialActiText;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor orangeSiteInfo(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo) {
    
    this.orangeSiteInfo = orangeSiteInfo;
    return this;
  }

   /**
   * Get orangeSiteInfo
   * @return orangeSiteInfo
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo getOrangeSiteInfo() {
    return orangeSiteInfo;
  }


  public void setOrangeSiteInfo(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo) {
    this.orangeSiteInfo = orangeSiteInfo;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor productImage(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage productImage) {
    
    this.productImage = productImage;
    return this;
  }

   /**
   * Get productImage
   * @return productImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage getProductImage() {
    return productImage;
  }


  public void setProductImage(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage productImage) {
    this.productImage = productImage;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 商品名称，长度1～10
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor productPrice(Double productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * 商品价格（整数或两位小数，单位：元）
   * @return productPrice
  **/
  @javax.annotation.Nullable
  public Double getProductPrice() {
    return productPrice;
  }


  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor productTags(List<String> productTags) {
    
    this.productTags = productTags;
    return this;
  }

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

   /**
   * 商品标签列表，每个标签长度：1～4，标签个数：1～3
   * @return productTags
  **/
  @javax.annotation.Nullable
  public List<String> getProductTags() {
    return productTags;
  }


  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor serviceInfo(String serviceInfo) {
    
    this.serviceInfo = serviceInfo;
    return this;
  }

   /**
   * 服务信息文案，长度：1～20
   * @return serviceInfo
  **/
  @javax.annotation.Nullable
  public String getServiceInfo() {
    return serviceInfo;
  }


  public void setServiceInfo(String serviceInfo) {
    this.serviceInfo = serviceInfo;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor thirdSiteInfo(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo thirdSiteInfo) {
    
    this.thirdSiteInfo = thirdSiteInfo;
    return this;
  }

   /**
   * Get thirdSiteInfo
   * @return thirdSiteInfo
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo getThirdSiteInfo() {
    return thirdSiteInfo;
  }


  public void setThirdSiteInfo(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo thirdSiteInfo) {
    this.thirdSiteInfo = thirdSiteInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor = (NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor) o;
    return Objects.equals(this.activitiyInfo, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.activitiyInfo) &&
        Objects.equals(this.androidAnchorTitle, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.androidAnchorTitle) &&
        Objects.equals(this.androidPkgName, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.androidPkgName) &&
        Objects.equals(this.appIcon, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.appIcon) &&
        Objects.equals(this.appName, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.appName) &&
        Objects.equals(this.appOpenUrl, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.appOpenUrl) &&
        Objects.equals(this.detailInfo, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.detailInfo) &&
        Objects.equals(this.downloadGuideText, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.downloadGuideText) &&
        Objects.equals(this.externalType, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.externalType) &&
        Objects.equals(this.iosAnchorTitle, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.iosAnchorTitle) &&
        Objects.equals(this.officialActiBannerImage, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.officialActiBannerImage) &&
        Objects.equals(this.officialActiText, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.officialActiText) &&
        Objects.equals(this.orangeSiteInfo, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.orangeSiteInfo) &&
        Objects.equals(this.productImage, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.productImage) &&
        Objects.equals(this.productName, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.productName) &&
        Objects.equals(this.productPrice, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.productPrice) &&
        Objects.equals(this.productTags, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.productTags) &&
        Objects.equals(this.serviceInfo, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.serviceInfo) &&
        Objects.equals(this.thirdSiteInfo, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.thirdSiteInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activitiyInfo, androidAnchorTitle, androidPkgName, appIcon, appName, appOpenUrl, detailInfo, downloadGuideText, externalType, iosAnchorTitle, officialActiBannerImage, officialActiText, orangeSiteInfo, productImage, productName, productPrice, productTags, serviceInfo, thirdSiteInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor {\n");
    sb.append("    activitiyInfo: ").append(toIndentedString(activitiyInfo)).append("\n");
    sb.append("    androidAnchorTitle: ").append(toIndentedString(androidAnchorTitle)).append("\n");
    sb.append("    androidPkgName: ").append(toIndentedString(androidPkgName)).append("\n");
    sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appOpenUrl: ").append(toIndentedString(appOpenUrl)).append("\n");
    sb.append("    detailInfo: ").append(toIndentedString(detailInfo)).append("\n");
    sb.append("    downloadGuideText: ").append(toIndentedString(downloadGuideText)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
    sb.append("    iosAnchorTitle: ").append(toIndentedString(iosAnchorTitle)).append("\n");
    sb.append("    officialActiBannerImage: ").append(toIndentedString(officialActiBannerImage)).append("\n");
    sb.append("    officialActiText: ").append(toIndentedString(officialActiText)).append("\n");
    sb.append("    orangeSiteInfo: ").append(toIndentedString(orangeSiteInfo)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
    sb.append("    serviceInfo: ").append(toIndentedString(serviceInfo)).append("\n");
    sb.append("    thirdSiteInfo: ").append(toIndentedString(thirdSiteInfo)).append("\n");
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
    openapiFields.add("activitiy_info");
    openapiFields.add("android_anchor_title");
    openapiFields.add("android_pkg_name");
    openapiFields.add("app_icon");
    openapiFields.add("app_name");
    openapiFields.add("app_open_url");
    openapiFields.add("detail_info");
    openapiFields.add("download_guide_text");
    openapiFields.add("external_type");
    openapiFields.add("ios_anchor_title");
    openapiFields.add("official_acti_banner_image");
    openapiFields.add("official_acti_text");
    openapiFields.add("orange_site_info");
    openapiFields.add("product_image");
    openapiFields.add("product_name");
    openapiFields.add("product_price");
    openapiFields.add("product_tags");
    openapiFields.add("service_info");
    openapiFields.add("third_site_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor
  */
  public static NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

