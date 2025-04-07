/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner() {
  }

  public ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 
   * @return channelId
  **/
  @javax.annotation.Nonnull
  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner downloadUrl(String downloadUrl) {
    
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


  public ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner remark(String remark) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner toolsAppManagementExtendPackageUpdateV2RequestChannelListInner = (ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner) o;
    return Objects.equals(this.channelId, toolsAppManagementExtendPackageUpdateV2RequestChannelListInner.channelId) &&
        Objects.equals(this.downloadUrl, toolsAppManagementExtendPackageUpdateV2RequestChannelListInner.downloadUrl) &&
        Objects.equals(this.remark, toolsAppManagementExtendPackageUpdateV2RequestChannelListInner.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, downloadUrl, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner
  */
  public static ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageUpdateV2RequestChannelListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

