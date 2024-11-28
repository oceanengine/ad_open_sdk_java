/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
 * ToolsAppManagementExtendPackageListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ToolsAppManagementExtendPackageListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_VERSION_NAME = "version_name";
  @SerializedName(SERIALIZED_NAME_VERSION_NAME)
  private String versionName = null;

  public ToolsAppManagementExtendPackageListV2ResponseDataListInner() {
  }

  public ToolsAppManagementExtendPackageListV2ResponseDataListInner channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 
   * @return channelId
  **/
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public ToolsAppManagementExtendPackageListV2ResponseDataListInner downloadUrl(String downloadUrl) {
    
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


  public ToolsAppManagementExtendPackageListV2ResponseDataListInner packageId(String packageId) {
    
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


  public ToolsAppManagementExtendPackageListV2ResponseDataListInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ToolsAppManagementExtendPackageListV2ResponseDataListInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsAppManagementExtendPackageListV2ResponseDataListInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ToolsAppManagementExtendPackageListV2ResponseDataListInner updateTime(String updateTime) {
    
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


  public ToolsAppManagementExtendPackageListV2ResponseDataListInner versionName(String versionName) {
    
    this.versionName = versionName;
    return this;
  }

   /**
   * 
   * @return versionName
  **/
  @javax.annotation.Nullable
  public String getVersionName() {
    return versionName;
  }


  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageListV2ResponseDataListInner toolsAppManagementExtendPackageListV2ResponseDataListInner = (ToolsAppManagementExtendPackageListV2ResponseDataListInner) o;
    return Objects.equals(this.channelId, toolsAppManagementExtendPackageListV2ResponseDataListInner.channelId) &&
        Objects.equals(this.downloadUrl, toolsAppManagementExtendPackageListV2ResponseDataListInner.downloadUrl) &&
        Objects.equals(this.packageId, toolsAppManagementExtendPackageListV2ResponseDataListInner.packageId) &&
        Objects.equals(this.reason, toolsAppManagementExtendPackageListV2ResponseDataListInner.reason) &&
        Objects.equals(this.remark, toolsAppManagementExtendPackageListV2ResponseDataListInner.remark) &&
        Objects.equals(this.status, toolsAppManagementExtendPackageListV2ResponseDataListInner.status) &&
        Objects.equals(this.updateTime, toolsAppManagementExtendPackageListV2ResponseDataListInner.updateTime) &&
        Objects.equals(this.versionName, toolsAppManagementExtendPackageListV2ResponseDataListInner.versionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, downloadUrl, packageId, reason, remark, status, updateTime, versionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageListV2ResponseDataListInner {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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
    openapiFields.add("channel_id");
    openapiFields.add("download_url");
    openapiFields.add("package_id");
    openapiFields.add("reason");
    openapiFields.add("remark");
    openapiFields.add("status");
    openapiFields.add("update_time");
    openapiFields.add("version_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageListV2ResponseDataListInner
  */
  public static ToolsAppManagementExtendPackageListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

