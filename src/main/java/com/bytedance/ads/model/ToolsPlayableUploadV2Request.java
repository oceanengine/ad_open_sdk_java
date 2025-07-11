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
import java.io.File;
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
 * ToolsPlayableUploadV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPlayableUploadV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_PACKAGE = "playable_package";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_PACKAGE)
  private File playablePackage = null;

  public ToolsPlayableUploadV2Request() {
  }

  public ToolsPlayableUploadV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPlayableUploadV2Request playablePackage(File playablePackage) {
    
    this.playablePackage = playablePackage;
    return this;
  }

   /**
   * 试玩素材文件 【格式说明】： 1.格式为zip，大小不超过3M 2.已接入穿山甲JS-SDK，并且调用方式为window.openAppStore(); 3.主html文件需命名为index，且位于一级目录中 4.试玩广告播放方向字段应存储于config.json文件中，位于一级目录中，取值为0,1,2 5.文件名称仅支持大小写字母、数字、减号和下划线 6.素材中不允许使用 mraid.js 格式 7.素材不允许通过外部网络加载动态素材 8.素材中不允许包含JS 重定向 9.素材不允许发出 HTTP 请求 10.素材中不允许存在内容为空的文件
   * @return playablePackage
  **/
  @javax.annotation.Nonnull
  public File getPlayablePackage() {
    return playablePackage;
  }


  public void setPlayablePackage(File playablePackage) {
    this.playablePackage = playablePackage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableUploadV2Request toolsPlayableUploadV2Request = (ToolsPlayableUploadV2Request) o;
    return Objects.equals(this.advertiserId, toolsPlayableUploadV2Request.advertiserId) &&
        Objects.equals(this.playablePackage, toolsPlayableUploadV2Request.playablePackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, playablePackage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPlayableUploadV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    playablePackage: ").append(toIndentedString(playablePackage)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("playable_package");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("playable_package");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableUploadV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableUploadV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableUploadV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableUploadV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableUploadV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableUploadV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableUploadV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableUploadV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableUploadV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableUploadV2Request
  */
  public static ToolsPlayableUploadV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableUploadV2Request.class);
  }

 /**
  * Convert an instance of ToolsPlayableUploadV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

