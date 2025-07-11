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
 * android 下载信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp {
  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private Long appType = null;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_START_TIME = "download_start_time";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_START_TIME)
  private Long downloadStartTime = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public static final String SERIALIZED_NAME_WEB_URL_IS_DOWNLOAD = "web_url_is_download";
  @SerializedName(SERIALIZED_NAME_WEB_URL_IS_DOWNLOAD)
  private Boolean webUrlIsDownload = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp appType(Long appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * 应用类型
   * @return appType
  **/
  @javax.annotation.Nullable
  public Long getAppType() {
    return appType;
  }


  public void setAppType(Long appType) {
    this.appType = appType;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 软件简介
   * @return desc
  **/
  @javax.annotation.Nullable
  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp downloadStartTime(Long downloadStartTime) {
    
    this.downloadStartTime = downloadStartTime;
    return this;
  }

   /**
   * 下载开始时间
   * @return downloadStartTime
  **/
  @javax.annotation.Nullable
  public Long getDownloadStartTime() {
    return downloadStartTime;
  }


  public void setDownloadStartTime(Long downloadStartTime) {
    this.downloadStartTime = downloadStartTime;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 下载链接
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp _package(String _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * 应用名
   * @return _package
  **/
  @javax.annotation.Nullable
  public String getPackage() {
    return _package;
  }


  public void setPackage(String _package) {
    this._package = _package;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * 应用下载详情页
   * @return webUrl
  **/
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp webUrlIsDownload(Boolean webUrlIsDownload) {
    
    this.webUrlIsDownload = webUrlIsDownload;
    return this;
  }

   /**
   * 是否下载意图
   * @return webUrlIsDownload
  **/
  @javax.annotation.Nullable
  public Boolean getWebUrlIsDownload() {
    return webUrlIsDownload;
  }


  public void setWebUrlIsDownload(Boolean webUrlIsDownload) {
    this.webUrlIsDownload = webUrlIsDownload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp) o;
    return Objects.equals(this.appName, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.appName) &&
        Objects.equals(this.appType, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.appType) &&
        Objects.equals(this.desc, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.desc) &&
        Objects.equals(this.downloadStartTime, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.downloadStartTime) &&
        Objects.equals(this.downloadUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.downloadUrl) &&
        Objects.equals(this._package, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp._package) &&
        Objects.equals(this.webUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.webUrl) &&
        Objects.equals(this.webUrlIsDownload, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.webUrlIsDownload);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appType, desc, downloadStartTime, downloadUrl, _package, webUrl, webUrlIsDownload);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    downloadStartTime: ").append(toIndentedString(downloadStartTime)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    webUrlIsDownload: ").append(toIndentedString(webUrlIsDownload)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("app_type");
    openapiFields.add("desc");
    openapiFields.add("download_start_time");
    openapiFields.add("download_url");
    openapiFields.add("package");
    openapiFields.add("web_url");
    openapiFields.add("web_url_is_download");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAppDownloadAndroidApp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

