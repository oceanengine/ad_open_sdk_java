/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalCloseLoopInfo;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalMicroAppInfo;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalWechatMicroAppInfo;
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
 * 普通落地页链接组件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal {
  public static final String SERIALIZED_NAME_CLOSE_LOOP_INFO = "close_loop_info";
  @SerializedName(SERIALIZED_NAME_CLOSE_LOOP_INFO)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalCloseLoopInfo closeLoopInfo = null;

  public static final String SERIALIZED_NAME_EXTERNAL_TITLE = "external_title";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TITLE)
  private String externalTitle = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_IS_DOWNLOAD = "external_url_is_download";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_IS_DOWNLOAD)
  private Long externalUrlIsDownload = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private Long isCommentDisable = null;

  public static final String SERIALIZED_NAME_IS_WEB_VIEW = "is_web_view";
  @SerializedName(SERIALIZED_NAME_IS_WEB_VIEW)
  private Long isWebView = null;

  public static final String SERIALIZED_NAME_MICRO_APP_INFO = "micro_app_info";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_INFO)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalMicroAppInfo microAppInfo = null;

  public static final String SERIALIZED_NAME_MICRO_APP_OPEN_URL_TYPE = "micro_app_open_url_type";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_OPEN_URL_TYPE)
  private Long microAppOpenUrlType = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_OPEN_URL_TEXT = "open_url_text";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_TEXT)
  private String openUrlText = null;

  public static final String SERIALIZED_NAME_WECHAT_MICRO_APP_INFO = "wechat_micro_app_info";
  @SerializedName(SERIALIZED_NAME_WECHAT_MICRO_APP_INFO)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalWechatMicroAppInfo wechatMicroAppInfo = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal closeLoopInfo(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalCloseLoopInfo closeLoopInfo) {
    
    this.closeLoopInfo = closeLoopInfo;
    return this;
  }

   /**
   * Get closeLoopInfo
   * @return closeLoopInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalCloseLoopInfo getCloseLoopInfo() {
    return closeLoopInfo;
  }


  public void setCloseLoopInfo(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalCloseLoopInfo closeLoopInfo) {
    this.closeLoopInfo = closeLoopInfo;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal externalTitle(String externalTitle) {
    
    this.externalTitle = externalTitle;
    return this;
  }

   /**
   * 落地页标题
   * @return externalTitle
  **/
  @javax.annotation.Nullable
  public String getExternalTitle() {
    return externalTitle;
  }


  public void setExternalTitle(String externalTitle) {
    this.externalTitle = externalTitle;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 落地页链接
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal externalUrlIsDownload(Long externalUrlIsDownload) {
    
    this.externalUrlIsDownload = externalUrlIsDownload;
    return this;
  }

   /**
   * 是否下载意图 0：否  1：是
   * @return externalUrlIsDownload
  **/
  @javax.annotation.Nullable
  public Long getExternalUrlIsDownload() {
    return externalUrlIsDownload;
  }


  public void setExternalUrlIsDownload(Long externalUrlIsDownload) {
    this.externalUrlIsDownload = externalUrlIsDownload;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal isCommentDisable(Long isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * 是否关闭评论 0：否  1：是
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public Long getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(Long isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal isWebView(Long isWebView) {
    
    this.isWebView = isWebView;
    return this;
  }

   /**
   * 是否以webview打开 0：否  1：是
   * @return isWebView
  **/
  @javax.annotation.Nullable
  public Long getIsWebView() {
    return isWebView;
  }


  public void setIsWebView(Long isWebView) {
    this.isWebView = isWebView;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal microAppInfo(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalMicroAppInfo microAppInfo) {
    
    this.microAppInfo = microAppInfo;
    return this;
  }

   /**
   * Get microAppInfo
   * @return microAppInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalMicroAppInfo getMicroAppInfo() {
    return microAppInfo;
  }


  public void setMicroAppInfo(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalMicroAppInfo microAppInfo) {
    this.microAppInfo = microAppInfo;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal microAppOpenUrlType(Long microAppOpenUrlType) {
    
    this.microAppOpenUrlType = microAppOpenUrlType;
    return this;
  }

   /**
   * 小程序链接类型 0：默认(抖音) 1：微信
   * @return microAppOpenUrlType
  **/
  @javax.annotation.Nullable
  public Long getMicroAppOpenUrlType() {
    return microAppOpenUrlType;
  }


  public void setMicroAppOpenUrlType(Long microAppOpenUrlType) {
    this.microAppOpenUrlType = microAppOpenUrlType;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 直达链接
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal openUrlText(String openUrlText) {
    
    this.openUrlText = openUrlText;
    return this;
  }

   /**
   * 直达链接文案
   * @return openUrlText
  **/
  @javax.annotation.Nullable
  public String getOpenUrlText() {
    return openUrlText;
  }


  public void setOpenUrlText(String openUrlText) {
    this.openUrlText = openUrlText;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal wechatMicroAppInfo(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalWechatMicroAppInfo wechatMicroAppInfo) {
    
    this.wechatMicroAppInfo = wechatMicroAppInfo;
    return this;
  }

   /**
   * Get wechatMicroAppInfo
   * @return wechatMicroAppInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalWechatMicroAppInfo getWechatMicroAppInfo() {
    return wechatMicroAppInfo;
  }


  public void setWechatMicroAppInfo(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternalWechatMicroAppInfo wechatMicroAppInfo) {
    this.wechatMicroAppInfo = wechatMicroAppInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal) o;
    return Objects.equals(this.closeLoopInfo, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.closeLoopInfo) &&
        Objects.equals(this.externalTitle, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.externalTitle) &&
        Objects.equals(this.externalUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.externalUrl) &&
        Objects.equals(this.externalUrlIsDownload, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.externalUrlIsDownload) &&
        Objects.equals(this.isCommentDisable, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.isCommentDisable) &&
        Objects.equals(this.isWebView, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.isWebView) &&
        Objects.equals(this.microAppInfo, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.microAppInfo) &&
        Objects.equals(this.microAppOpenUrlType, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.microAppOpenUrlType) &&
        Objects.equals(this.openUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.openUrl) &&
        Objects.equals(this.openUrlText, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.openUrlText) &&
        Objects.equals(this.wechatMicroAppInfo, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.wechatMicroAppInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(closeLoopInfo, externalTitle, externalUrl, externalUrlIsDownload, isCommentDisable, isWebView, microAppInfo, microAppOpenUrlType, openUrl, openUrlText, wechatMicroAppInfo);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal {\n");
    sb.append("    closeLoopInfo: ").append(toIndentedString(closeLoopInfo)).append("\n");
    sb.append("    externalTitle: ").append(toIndentedString(externalTitle)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    externalUrlIsDownload: ").append(toIndentedString(externalUrlIsDownload)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    isWebView: ").append(toIndentedString(isWebView)).append("\n");
    sb.append("    microAppInfo: ").append(toIndentedString(microAppInfo)).append("\n");
    sb.append("    microAppOpenUrlType: ").append(toIndentedString(microAppOpenUrlType)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    openUrlText: ").append(toIndentedString(openUrlText)).append("\n");
    sb.append("    wechatMicroAppInfo: ").append(toIndentedString(wechatMicroAppInfo)).append("\n");
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
    openapiFields.add("close_loop_info");
    openapiFields.add("external_title");
    openapiFields.add("external_url");
    openapiFields.add("external_url_is_download");
    openapiFields.add("is_comment_disable");
    openapiFields.add("is_web_view");
    openapiFields.add("micro_app_info");
    openapiFields.add("micro_app_open_url_type");
    openapiFields.add("open_url");
    openapiFields.add("open_url_text");
    openapiFields.add("wechat_micro_app_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCommonExternal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

