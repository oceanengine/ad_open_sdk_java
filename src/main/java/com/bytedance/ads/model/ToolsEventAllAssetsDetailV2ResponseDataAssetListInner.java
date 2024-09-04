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
import com.bytedance.ads.model.ToolsEventAllAssetsDetailV2DataAssetListAppType;
import com.bytedance.ads.model.ToolsEventAllAssetsDetailV2DataAssetListAssetType;
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
 * ToolsEventAllAssetsDetailV2ResponseDataAssetListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsEventAllAssetsDetailV2ResponseDataAssetListInner {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private ToolsEventAllAssetsDetailV2DataAssetListAppType appType = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private ToolsEventAllAssetsDetailV2DataAssetListAssetType assetType = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_MICRO_APP_ID = "micro_app_id";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_ID)
  private String microAppId = null;

  public static final String SERIALIZED_NAME_MICRO_APP_INSTANCE_ID = "micro_app_instance_id";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_INSTANCE_ID)
  private Long microAppInstanceId = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public static final String SERIALIZED_NAME_QUICK_APP_ID = "quick_app_id";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_ID)
  private Long quickAppId = null;

  public static final String SERIALIZED_NAME_QUICK_APP_PACKAGE_NAME = "quick_app_package_name";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_PACKAGE_NAME)
  private String quickAppPackageName = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Long siteId = null;

  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner() {
  }

  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 应用ID，当asset_type &#x3D; APP 时返回
   * @return appId
  **/
  @javax.annotation.Nullable
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称，当asset_type &#x3D; APP 时返回
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner appType(ToolsEventAllAssetsDetailV2DataAssetListAppType appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @javax.annotation.Nullable
  public ToolsEventAllAssetsDetailV2DataAssetListAppType getAppType() {
    return appType;
  }


  public void setAppType(ToolsEventAllAssetsDetailV2DataAssetListAppType appType) {
    this.appType = appType;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 资产id，所有资产均会返回
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 资产名称，所有资产均会返回
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner assetType(ToolsEventAllAssetsDetailV2DataAssetListAssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
  public ToolsEventAllAssetsDetailV2DataAssetListAssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(ToolsEventAllAssetsDetailV2DataAssetListAssetType assetType) {
    this.assetType = assetType;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 应用下载链接，当asset_type &#x3D; APP 时返回
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner microAppId(String microAppId) {
    
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 小程序appid，当asset_type &#x3D; MINI_PROGRAME 时返回
   * @return microAppId
  **/
  @javax.annotation.Nullable
  public String getMicroAppId() {
    return microAppId;
  }


  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner microAppInstanceId(Long microAppInstanceId) {
    
    this.microAppInstanceId = microAppInstanceId;
    return this;
  }

   /**
   * 小程序资产id，当asset_type &#x3D; MINI_PROGRAME 时返回
   * @return microAppInstanceId
  **/
  @javax.annotation.Nullable
  public Long getMicroAppInstanceId() {
    return microAppInstanceId;
  }


  public void setMicroAppInstanceId(Long microAppInstanceId) {
    this.microAppInstanceId = microAppInstanceId;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 应用包id，当asset_type &#x3D; APP 时返回，当调用API创建资产时，Android应用必填，建议获取保存
   * @return packageId
  **/
  @javax.annotation.Nullable
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 应用包名，当asset_type &#x3D; APP 时返回
   * @return packageName
  **/
  @javax.annotation.Nullable
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner quickAppId(Long quickAppId) {
    
    this.quickAppId = quickAppId;
    return this;
  }

   /**
   * 快应用id，当asset_type &#x3D; QUICK_APP 时返回
   * @return quickAppId
  **/
  @javax.annotation.Nullable
  public Long getQuickAppId() {
    return quickAppId;
  }


  public void setQuickAppId(Long quickAppId) {
    this.quickAppId = quickAppId;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner quickAppPackageName(String quickAppPackageName) {
    
    this.quickAppPackageName = quickAppPackageName;
    return this;
  }

   /**
   * 快应用包名，当asset_type &#x3D; QUICK_APP 时返回
   * @return quickAppPackageName
  **/
  @javax.annotation.Nullable
  public String getQuickAppPackageName() {
    return quickAppPackageName;
  }


  public void setQuickAppPackageName(String quickAppPackageName) {
    this.quickAppPackageName = quickAppPackageName;
  }


  public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner siteId(Long siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 橙子落地页站点id，当asset_type &#x3D; TETRIS_EXTERNAL 时返回，表示该资产是基于哪一个橙子落地页站点创建的，在巨量广告-事件资产页面，橙子落地页显示为该站点id
   * @return siteId
  **/
  @javax.annotation.Nullable
  public Long getSiteId() {
    return siteId;
  }


  public void setSiteId(Long siteId) {
    this.siteId = siteId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAllAssetsDetailV2ResponseDataAssetListInner toolsEventAllAssetsDetailV2ResponseDataAssetListInner = (ToolsEventAllAssetsDetailV2ResponseDataAssetListInner) o;
    return Objects.equals(this.appId, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.appId) &&
        Objects.equals(this.appName, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.appName) &&
        Objects.equals(this.appType, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.appType) &&
        Objects.equals(this.assetId, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.assetId) &&
        Objects.equals(this.assetName, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.assetName) &&
        Objects.equals(this.assetType, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.assetType) &&
        Objects.equals(this.downloadUrl, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.downloadUrl) &&
        Objects.equals(this.microAppId, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.microAppId) &&
        Objects.equals(this.microAppInstanceId, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.microAppInstanceId) &&
        Objects.equals(this.packageId, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.packageId) &&
        Objects.equals(this.packageName, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.packageName) &&
        Objects.equals(this.quickAppId, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.quickAppId) &&
        Objects.equals(this.quickAppPackageName, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.quickAppPackageName) &&
        Objects.equals(this.siteId, toolsEventAllAssetsDetailV2ResponseDataAssetListInner.siteId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appName, appType, assetId, assetName, assetType, downloadUrl, microAppId, microAppInstanceId, packageId, packageName, quickAppId, quickAppPackageName, siteId);
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
    sb.append("class ToolsEventAllAssetsDetailV2ResponseDataAssetListInner {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    microAppInstanceId: ").append(toIndentedString(microAppInstanceId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    quickAppId: ").append(toIndentedString(quickAppId)).append("\n");
    sb.append("    quickAppPackageName: ").append(toIndentedString(quickAppPackageName)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("app_name");
    openapiFields.add("app_type");
    openapiFields.add("asset_id");
    openapiFields.add("asset_name");
    openapiFields.add("asset_type");
    openapiFields.add("download_url");
    openapiFields.add("micro_app_id");
    openapiFields.add("micro_app_instance_id");
    openapiFields.add("package_id");
    openapiFields.add("package_name");
    openapiFields.add("quick_app_id");
    openapiFields.add("quick_app_package_name");
    openapiFields.add("site_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAllAssetsDetailV2ResponseDataAssetListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAllAssetsDetailV2ResponseDataAssetListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAllAssetsDetailV2ResponseDataAssetListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAllAssetsDetailV2ResponseDataAssetListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAllAssetsDetailV2ResponseDataAssetListInner>() {
           @Override
           public void write(JsonWriter out, ToolsEventAllAssetsDetailV2ResponseDataAssetListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAllAssetsDetailV2ResponseDataAssetListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAllAssetsDetailV2ResponseDataAssetListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAllAssetsDetailV2ResponseDataAssetListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAllAssetsDetailV2ResponseDataAssetListInner
  */
  public static ToolsEventAllAssetsDetailV2ResponseDataAssetListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAllAssetsDetailV2ResponseDataAssetListInner.class);
  }

 /**
  * Convert an instance of ToolsEventAllAssetsDetailV2ResponseDataAssetListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

