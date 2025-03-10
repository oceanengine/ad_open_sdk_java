/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5 = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner() {
  }

  public ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 渠道号，渠道号ID支持英文、数字、下划线和连字符-，不超过50个字符，超出部分会被截断。示例：oceanengine_ads_sample-12
   * @return channelId
  **/
  @javax.annotation.Nonnull
  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 下载链接，（mode&#x3D;Customize时需指定）渠道包（子包）的下载地址
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * 下载链接对应包体的md5，（mode&#x3D;Customize时需指定）
   * @return md5
  **/
  @javax.annotation.Nullable
  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注，渠道包备注信息，至多20个字符，超出部分会被截断处理
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner toolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner = (ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner) o;
    return Objects.equals(this.channelId, toolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner.channelId) &&
        Objects.equals(this.downloadUrl, toolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner.downloadUrl) &&
        Objects.equals(this.md5, toolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner.md5) &&
        Objects.equals(this.remark, toolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, downloadUrl, md5, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("md5");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner
  */
  public static ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

