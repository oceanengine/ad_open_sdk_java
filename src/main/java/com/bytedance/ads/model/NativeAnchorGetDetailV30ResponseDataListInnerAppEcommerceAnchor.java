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
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorAppIcon;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOfficialActiBannerImage;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOrangeSiteInfo;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorProductImage;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor {
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
  private NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorAppIcon appIcon = null;

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
  private NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage = null;

  public static final String SERIALIZED_NAME_OFFICIAL_ACTI_TEXT = "official_acti_text";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_ACTI_TEXT)
  private String officialActiText = null;

  public static final String SERIALIZED_NAME_ORANGE_SITE_INFO = "orange_site_info";
  @SerializedName(SERIALIZED_NAME_ORANGE_SITE_INFO)
  private NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE = "product_image";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE)
  private NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorProductImage productImage = null;

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
  private NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo thirdSiteInfo = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor activitiyInfo(String activitiyInfo) {
    
    this.activitiyInfo = activitiyInfo;
    return this;
  }

   /**
   * 
   * @return activitiyInfo
  **/
  @javax.annotation.Nullable
  public String getActivitiyInfo() {
    return activitiyInfo;
  }


  public void setActivitiyInfo(String activitiyInfo) {
    this.activitiyInfo = activitiyInfo;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor androidAnchorTitle(String androidAnchorTitle) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor androidPkgName(String androidPkgName) {
    
    this.androidPkgName = androidPkgName;
    return this;
  }

   /**
   * 
   * @return androidPkgName
  **/
  @javax.annotation.Nullable
  public String getAndroidPkgName() {
    return androidPkgName;
  }


  public void setAndroidPkgName(String androidPkgName) {
    this.androidPkgName = androidPkgName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor appIcon(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorAppIcon appIcon) {
    
    this.appIcon = appIcon;
    return this;
  }

   /**
   * Get appIcon
   * @return appIcon
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorAppIcon getAppIcon() {
    return appIcon;
  }


  public void setAppIcon(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorAppIcon appIcon) {
    this.appIcon = appIcon;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor appOpenUrl(String appOpenUrl) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor detailInfo(String detailInfo) {
    
    this.detailInfo = detailInfo;
    return this;
  }

   /**
   * 
   * @return detailInfo
  **/
  @javax.annotation.Nullable
  public String getDetailInfo() {
    return detailInfo;
  }


  public void setDetailInfo(String detailInfo) {
    this.detailInfo = detailInfo;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor downloadGuideText(String downloadGuideText) {
    
    this.downloadGuideText = downloadGuideText;
    return this;
  }

   /**
   * 
   * @return downloadGuideText
  **/
  @javax.annotation.Nullable
  public String getDownloadGuideText() {
    return downloadGuideText;
  }


  public void setDownloadGuideText(String downloadGuideText) {
    this.downloadGuideText = downloadGuideText;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor externalType(Long externalType) {
    
    this.externalType = externalType;
    return this;
  }

   /**
   * 1-橙子建站 2-第三方落地页
   * @return externalType
  **/
  @javax.annotation.Nullable
  public Long getExternalType() {
    return externalType;
  }


  public void setExternalType(Long externalType) {
    this.externalType = externalType;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor iosAnchorTitle(String iosAnchorTitle) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor officialActiBannerImage(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage) {
    
    this.officialActiBannerImage = officialActiBannerImage;
    return this;
  }

   /**
   * Get officialActiBannerImage
   * @return officialActiBannerImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOfficialActiBannerImage getOfficialActiBannerImage() {
    return officialActiBannerImage;
  }


  public void setOfficialActiBannerImage(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage) {
    this.officialActiBannerImage = officialActiBannerImage;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor officialActiText(String officialActiText) {
    
    this.officialActiText = officialActiText;
    return this;
  }

   /**
   * 
   * @return officialActiText
  **/
  @javax.annotation.Nullable
  public String getOfficialActiText() {
    return officialActiText;
  }


  public void setOfficialActiText(String officialActiText) {
    this.officialActiText = officialActiText;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor orangeSiteInfo(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo) {
    
    this.orangeSiteInfo = orangeSiteInfo;
    return this;
  }

   /**
   * Get orangeSiteInfo
   * @return orangeSiteInfo
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOrangeSiteInfo getOrangeSiteInfo() {
    return orangeSiteInfo;
  }


  public void setOrangeSiteInfo(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo) {
    this.orangeSiteInfo = orangeSiteInfo;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor productImage(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorProductImage productImage) {
    
    this.productImage = productImage;
    return this;
  }

   /**
   * Get productImage
   * @return productImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorProductImage getProductImage() {
    return productImage;
  }


  public void setProductImage(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorProductImage productImage) {
    this.productImage = productImage;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor productPrice(Double productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * 
   * @return productPrice
  **/
  @javax.annotation.Nullable
  public Double getProductPrice() {
    return productPrice;
  }


  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor productTags(List<String> productTags) {
    
    this.productTags = productTags;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

   /**
   * 
   * @return productTags
  **/
  @javax.annotation.Nullable
  public List<String> getProductTags() {
    return productTags;
  }


  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor serviceInfo(String serviceInfo) {
    
    this.serviceInfo = serviceInfo;
    return this;
  }

   /**
   * 
   * @return serviceInfo
  **/
  @javax.annotation.Nullable
  public String getServiceInfo() {
    return serviceInfo;
  }


  public void setServiceInfo(String serviceInfo) {
    this.serviceInfo = serviceInfo;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor thirdSiteInfo(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo thirdSiteInfo) {
    
    this.thirdSiteInfo = thirdSiteInfo;
    return this;
  }

   /**
   * Get thirdSiteInfo
   * @return thirdSiteInfo
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo getThirdSiteInfo() {
    return thirdSiteInfo;
  }


  public void setThirdSiteInfo(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo thirdSiteInfo) {
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
    NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor = (NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor) o;
    return Objects.equals(this.activitiyInfo, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.activitiyInfo) &&
        Objects.equals(this.androidAnchorTitle, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.androidAnchorTitle) &&
        Objects.equals(this.androidPkgName, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.androidPkgName) &&
        Objects.equals(this.appIcon, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.appIcon) &&
        Objects.equals(this.appName, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.appName) &&
        Objects.equals(this.appOpenUrl, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.appOpenUrl) &&
        Objects.equals(this.detailInfo, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.detailInfo) &&
        Objects.equals(this.downloadGuideText, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.downloadGuideText) &&
        Objects.equals(this.externalType, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.externalType) &&
        Objects.equals(this.iosAnchorTitle, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.iosAnchorTitle) &&
        Objects.equals(this.officialActiBannerImage, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.officialActiBannerImage) &&
        Objects.equals(this.officialActiText, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.officialActiText) &&
        Objects.equals(this.orangeSiteInfo, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.orangeSiteInfo) &&
        Objects.equals(this.productImage, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.productImage) &&
        Objects.equals(this.productName, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.productName) &&
        Objects.equals(this.productPrice, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.productPrice) &&
        Objects.equals(this.productTags, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.productTags) &&
        Objects.equals(this.serviceInfo, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.serviceInfo) &&
        Objects.equals(this.thirdSiteInfo, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.thirdSiteInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activitiyInfo, androidAnchorTitle, androidPkgName, appIcon, appName, appOpenUrl, detailInfo, downloadGuideText, externalType, iosAnchorTitle, officialActiBannerImage, officialActiText, orangeSiteInfo, productImage, productName, productPrice, productTags, serviceInfo, thirdSiteInfo);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor {\n");
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
       if (!NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

