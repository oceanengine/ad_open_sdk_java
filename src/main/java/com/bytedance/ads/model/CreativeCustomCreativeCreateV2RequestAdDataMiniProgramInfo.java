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
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params = null;

  public static final String SERIALIZED_NAME_START_PATH = "start_path";
  @SerializedName(SERIALIZED_NAME_START_PATH)
  private String startPath = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType type = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo() {
  }

  public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nonnull
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo params(String params) {
    
    this.params = params;
    return this;
  }

   /**
   * 
   * @return params
  **/
  @javax.annotation.Nullable
  public String getParams() {
    return params;
  }


  public void setParams(String params) {
    this.params = params;
  }


  public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo startPath(String startPath) {
    
    this.startPath = startPath;
    return this;
  }

   /**
   * 
   * @return startPath
  **/
  @javax.annotation.Nullable
  public String getStartPath() {
    return startPath;
  }


  public void setStartPath(String startPath) {
    this.startPath = startPath;
  }


  public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo type(CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType getType() {
    return type;
  }


  public void setType(CreativeCustomCreativeCreateV2AdDataMiniProgramInfoType type) {
    this.type = type;
  }


  public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo creativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo = (CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo) o;
    return Objects.equals(this.appId, creativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.appId) &&
        Objects.equals(this.params, creativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.params) &&
        Objects.equals(this.startPath, creativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.startPath) &&
        Objects.equals(this.type, creativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.type) &&
        Objects.equals(this.url, creativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, params, startPath, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    startPath: ").append(toIndentedString(startPath)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("params");
    openapiFields.add("start_path");
    openapiFields.add("type");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo
  */
  public static CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

