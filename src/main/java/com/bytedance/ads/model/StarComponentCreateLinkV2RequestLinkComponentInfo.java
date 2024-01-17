/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * 组件信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class StarComponentCreateLinkV2RequestLinkComponentInfo {
  public static final String SERIALIZED_NAME_LINK_ANDROID = "link_android";
  @SerializedName(SERIALIZED_NAME_LINK_ANDROID)
  private String linkAndroid = null;

  public static final String SERIALIZED_NAME_LINK_ANDROID_DOWNLOAD = "link_android_download";
  @SerializedName(SERIALIZED_NAME_LINK_ANDROID_DOWNLOAD)
  private String linkAndroidDownload = null;

  public static final String SERIALIZED_NAME_LINK_IOS = "link_ios";
  @SerializedName(SERIALIZED_NAME_LINK_IOS)
  private String linkIos = null;

  public static final String SERIALIZED_NAME_LINK_IOS_DOWNLOAD = "link_ios_download";
  @SerializedName(SERIALIZED_NAME_LINK_IOS_DOWNLOAD)
  private String linkIosDownload = null;

  public static final String SERIALIZED_NAME_LINK_NAME = "link_name";
  @SerializedName(SERIALIZED_NAME_LINK_NAME)
  private String linkName = null;

  public static final String SERIALIZED_NAME_LINK_PAGE_TARGET = "link_page_target";
  @SerializedName(SERIALIZED_NAME_LINK_PAGE_TARGET)
  private Long linkPageTarget = null;

  public static final String SERIALIZED_NAME_LINK_PLATFORM = "link_platform";
  @SerializedName(SERIALIZED_NAME_LINK_PLATFORM)
  private Long linkPlatform = null;

  public static final String SERIALIZED_NAME_LINK_PLATFORM_SOURCE = "link_platform_source";
  @SerializedName(SERIALIZED_NAME_LINK_PLATFORM_SOURCE)
  private Long linkPlatformSource = null;

  public static final String SERIALIZED_NAME_LINK_TITLE = "link_title";
  @SerializedName(SERIALIZED_NAME_LINK_TITLE)
  private String linkTitle = null;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private Long linkType = null;

  public StarComponentCreateLinkV2RequestLinkComponentInfo() {
  }

  public StarComponentCreateLinkV2RequestLinkComponentInfo linkAndroid(String linkAndroid) {
    
    this.linkAndroid = linkAndroid;
    return this;
  }

   /**
   * Android落地页链接 HTTPS URL
   * @return linkAndroid
  **/
  @javax.annotation.Nullable
  public String getLinkAndroid() {
    return linkAndroid;
  }


  public void setLinkAndroid(String linkAndroid) {
    this.linkAndroid = linkAndroid;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkAndroidDownload(String linkAndroidDownload) {
    
    this.linkAndroidDownload = linkAndroidDownload;
    return this;
  }

   /**
   * Android app 下载链接 HTTPS URL，Android下载时需要
   * @return linkAndroidDownload
  **/
  @javax.annotation.Nullable
  public String getLinkAndroidDownload() {
    return linkAndroidDownload;
  }


  public void setLinkAndroidDownload(String linkAndroidDownload) {
    this.linkAndroidDownload = linkAndroidDownload;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkIos(String linkIos) {
    
    this.linkIos = linkIos;
    return this;
  }

   /**
   * iOS落地页链接 HTTPS URL
   * @return linkIos
  **/
  @javax.annotation.Nullable
  public String getLinkIos() {
    return linkIos;
  }


  public void setLinkIos(String linkIos) {
    this.linkIos = linkIos;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkIosDownload(String linkIosDownload) {
    
    this.linkIosDownload = linkIosDownload;
    return this;
  }

   /**
   * iOS app 下载链接 App store 链接，iOS下载时需要
   * @return linkIosDownload
  **/
  @javax.annotation.Nullable
  public String getLinkIosDownload() {
    return linkIosDownload;
  }


  public void setLinkIosDownload(String linkIosDownload) {
    this.linkIosDownload = linkIosDownload;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkName(String linkName) {
    
    this.linkName = linkName;
    return this;
  }

   /**
   * 组件名称 10字内
   * @return linkName
  **/
  @javax.annotation.Nullable
  public String getLinkName() {
    return linkName;
  }


  public void setLinkName(String linkName) {
    this.linkName = linkName;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkPageTarget(Long linkPageTarget) {
    
    this.linkPageTarget = linkPageTarget;
    return this;
  }

   /**
   * 组件投放目标 (1)：应用下载； (2)：线索留资； (3)：其他目标
   * @return linkPageTarget
  **/
  @javax.annotation.Nullable
  public Long getLinkPageTarget() {
    return linkPageTarget;
  }


  public void setLinkPageTarget(Long linkPageTarget) {
    this.linkPageTarget = linkPageTarget;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkPlatform(Long linkPlatform) {
    
    this.linkPlatform = linkPlatform;
    return this;
  }

   /**
   * 适用平台 (0)：不限； (1)：Android； (2)：iOS
   * @return linkPlatform
  **/
  @javax.annotation.Nullable
  public Long getLinkPlatform() {
    return linkPlatform;
  }


  public void setLinkPlatform(Long linkPlatform) {
    this.linkPlatform = linkPlatform;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkPlatformSource(Long linkPlatformSource) {
    
    this.linkPlatformSource = linkPlatformSource;
    return this;
  }

   /**
   * 媒体渠道 仅限以下 (1)：抖音
   * @return linkPlatformSource
  **/
  @javax.annotation.Nullable
  public Long getLinkPlatformSource() {
    return linkPlatformSource;
  }


  public void setLinkPlatformSource(Long linkPlatformSource) {
    this.linkPlatformSource = linkPlatformSource;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkTitle(String linkTitle) {
    
    this.linkTitle = linkTitle;
    return this;
  }

   /**
   * 组件标题（介绍文案） 20字内
   * @return linkTitle
  **/
  @javax.annotation.Nullable
  public String getLinkTitle() {
    return linkTitle;
  }


  public void setLinkTitle(String linkTitle) {
    this.linkTitle = linkTitle;
  }


  public StarComponentCreateLinkV2RequestLinkComponentInfo linkType(Long linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * 组件类型 仅限以下 (1)：落地页
   * @return linkType
  **/
  @javax.annotation.Nullable
  public Long getLinkType() {
    return linkType;
  }


  public void setLinkType(Long linkType) {
    this.linkType = linkType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarComponentCreateLinkV2RequestLinkComponentInfo starComponentCreateLinkV2RequestLinkComponentInfo = (StarComponentCreateLinkV2RequestLinkComponentInfo) o;
    return Objects.equals(this.linkAndroid, starComponentCreateLinkV2RequestLinkComponentInfo.linkAndroid) &&
        Objects.equals(this.linkAndroidDownload, starComponentCreateLinkV2RequestLinkComponentInfo.linkAndroidDownload) &&
        Objects.equals(this.linkIos, starComponentCreateLinkV2RequestLinkComponentInfo.linkIos) &&
        Objects.equals(this.linkIosDownload, starComponentCreateLinkV2RequestLinkComponentInfo.linkIosDownload) &&
        Objects.equals(this.linkName, starComponentCreateLinkV2RequestLinkComponentInfo.linkName) &&
        Objects.equals(this.linkPageTarget, starComponentCreateLinkV2RequestLinkComponentInfo.linkPageTarget) &&
        Objects.equals(this.linkPlatform, starComponentCreateLinkV2RequestLinkComponentInfo.linkPlatform) &&
        Objects.equals(this.linkPlatformSource, starComponentCreateLinkV2RequestLinkComponentInfo.linkPlatformSource) &&
        Objects.equals(this.linkTitle, starComponentCreateLinkV2RequestLinkComponentInfo.linkTitle) &&
        Objects.equals(this.linkType, starComponentCreateLinkV2RequestLinkComponentInfo.linkType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkAndroid, linkAndroidDownload, linkIos, linkIosDownload, linkName, linkPageTarget, linkPlatform, linkPlatformSource, linkTitle, linkType);
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
    sb.append("class StarComponentCreateLinkV2RequestLinkComponentInfo {\n");
    sb.append("    linkAndroid: ").append(toIndentedString(linkAndroid)).append("\n");
    sb.append("    linkAndroidDownload: ").append(toIndentedString(linkAndroidDownload)).append("\n");
    sb.append("    linkIos: ").append(toIndentedString(linkIos)).append("\n");
    sb.append("    linkIosDownload: ").append(toIndentedString(linkIosDownload)).append("\n");
    sb.append("    linkName: ").append(toIndentedString(linkName)).append("\n");
    sb.append("    linkPageTarget: ").append(toIndentedString(linkPageTarget)).append("\n");
    sb.append("    linkPlatform: ").append(toIndentedString(linkPlatform)).append("\n");
    sb.append("    linkPlatformSource: ").append(toIndentedString(linkPlatformSource)).append("\n");
    sb.append("    linkTitle: ").append(toIndentedString(linkTitle)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
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
    openapiFields.add("link_android");
    openapiFields.add("link_android_download");
    openapiFields.add("link_ios");
    openapiFields.add("link_ios_download");
    openapiFields.add("link_name");
    openapiFields.add("link_page_target");
    openapiFields.add("link_platform");
    openapiFields.add("link_platform_source");
    openapiFields.add("link_title");
    openapiFields.add("link_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentCreateLinkV2RequestLinkComponentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentCreateLinkV2RequestLinkComponentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentCreateLinkV2RequestLinkComponentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentCreateLinkV2RequestLinkComponentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentCreateLinkV2RequestLinkComponentInfo>() {
           @Override
           public void write(JsonWriter out, StarComponentCreateLinkV2RequestLinkComponentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentCreateLinkV2RequestLinkComponentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentCreateLinkV2RequestLinkComponentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentCreateLinkV2RequestLinkComponentInfo
  * @throws IOException if the JSON string is invalid with respect to StarComponentCreateLinkV2RequestLinkComponentInfo
  */
  public static StarComponentCreateLinkV2RequestLinkComponentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentCreateLinkV2RequestLinkComponentInfo.class);
  }

 /**
  * Convert an instance of StarComponentCreateLinkV2RequestLinkComponentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

