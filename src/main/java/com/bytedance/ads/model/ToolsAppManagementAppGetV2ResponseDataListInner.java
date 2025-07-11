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
 * ToolsAppManagementAppGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsAppManagementAppGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_APP_CLOUD_ID = "app_cloud_id";
  @SerializedName(SERIALIZED_NAME_APP_CLOUD_ID)
  private Long appCloudId = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public static final String SERIALIZED_NAME_PUBLISH_TIME = "publish_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_TIME)
  private String publishTime = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version = null;

  public ToolsAppManagementAppGetV2ResponseDataListInner() {
  }

  public ToolsAppManagementAppGetV2ResponseDataListInner appCloudId(Long appCloudId) {
    
    this.appCloudId = appCloudId;
    return this;
  }

   /**
   * 
   * @return appCloudId
  **/
  @javax.annotation.Nullable
  public Long getAppCloudId() {
    return appCloudId;
  }


  public void setAppCloudId(Long appCloudId) {
    this.appCloudId = appCloudId;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner appName(String appName) {
    
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


  public ToolsAppManagementAppGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * 
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 
   * @return packageId
  **/
  @javax.annotation.Nullable
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 
   * @return packageName
  **/
  @javax.annotation.Nullable
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner publishTime(String publishTime) {
    
    this.publishTime = publishTime;
    return this;
  }

   /**
   * 
   * @return publishTime
  **/
  @javax.annotation.Nullable
  public String getPublishTime() {
    return publishTime;
  }


  public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public ToolsAppManagementAppGetV2ResponseDataListInner version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * 
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementAppGetV2ResponseDataListInner toolsAppManagementAppGetV2ResponseDataListInner = (ToolsAppManagementAppGetV2ResponseDataListInner) o;
    return Objects.equals(this.appCloudId, toolsAppManagementAppGetV2ResponseDataListInner.appCloudId) &&
        Objects.equals(this.appName, toolsAppManagementAppGetV2ResponseDataListInner.appName) &&
        Objects.equals(this.createTime, toolsAppManagementAppGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.downloadUrl, toolsAppManagementAppGetV2ResponseDataListInner.downloadUrl) &&
        Objects.equals(this.iconUrl, toolsAppManagementAppGetV2ResponseDataListInner.iconUrl) &&
        Objects.equals(this.packageId, toolsAppManagementAppGetV2ResponseDataListInner.packageId) &&
        Objects.equals(this.packageName, toolsAppManagementAppGetV2ResponseDataListInner.packageName) &&
        Objects.equals(this.publishTime, toolsAppManagementAppGetV2ResponseDataListInner.publishTime) &&
        Objects.equals(this.updateTime, toolsAppManagementAppGetV2ResponseDataListInner.updateTime) &&
        Objects.equals(this.version, toolsAppManagementAppGetV2ResponseDataListInner.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCloudId, appName, createTime, downloadUrl, iconUrl, packageId, packageName, publishTime, updateTime, version);
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
    sb.append("class ToolsAppManagementAppGetV2ResponseDataListInner {\n");
    sb.append("    appCloudId: ").append(toIndentedString(appCloudId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("app_cloud_id");
    openapiFields.add("app_name");
    openapiFields.add("create_time");
    openapiFields.add("download_url");
    openapiFields.add("icon_url");
    openapiFields.add("package_id");
    openapiFields.add("package_name");
    openapiFields.add("publish_time");
    openapiFields.add("update_time");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementAppGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAppGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAppGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAppGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAppGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAppGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAppGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAppGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAppGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAppGetV2ResponseDataListInner
  */
  public static ToolsAppManagementAppGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAppGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAppGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

