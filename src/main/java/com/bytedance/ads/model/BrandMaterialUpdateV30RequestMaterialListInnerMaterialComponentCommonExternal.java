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
import com.bytedance.ads.model.BrandMaterialUpdateV30MaterialListMaterialComponentCommonExternalMicroAppOpenUrlType;
import com.bytedance.ads.model.BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalMicroAppInfo;
import com.bytedance.ads.model.BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalWechatMicroAppInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal {
  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_IS_DOWNLOAD = "external_url_is_download";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_IS_DOWNLOAD)
  private Long externalUrlIsDownload = null;

  public static final String SERIALIZED_NAME_MICRO_APP_INFO = "micro_app_info";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_INFO)
  private BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalMicroAppInfo microAppInfo = null;

  public static final String SERIALIZED_NAME_MICRO_APP_OPEN_URL_TYPE = "micro_app_open_url_type";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_OPEN_URL_TYPE)
  private BrandMaterialUpdateV30MaterialListMaterialComponentCommonExternalMicroAppOpenUrlType microAppOpenUrlType = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_WECHAT_MICRO_APP_INFO = "wechat_micro_app_info";
  @SerializedName(SERIALIZED_NAME_WECHAT_MICRO_APP_INFO)
  private BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalWechatMicroAppInfo wechatMicroAppInfo = null;

  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal() {
  }

  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal externalUrlIsDownload(Long externalUrlIsDownload) {
    
    this.externalUrlIsDownload = externalUrlIsDownload;
    return this;
  }

   /**
   * 
   * @return externalUrlIsDownload
  **/
  @javax.annotation.Nullable
  public Long getExternalUrlIsDownload() {
    return externalUrlIsDownload;
  }


  public void setExternalUrlIsDownload(Long externalUrlIsDownload) {
    this.externalUrlIsDownload = externalUrlIsDownload;
  }


  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal microAppInfo(BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalMicroAppInfo microAppInfo) {
    
    this.microAppInfo = microAppInfo;
    return this;
  }

   /**
   * Get microAppInfo
   * @return microAppInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalMicroAppInfo getMicroAppInfo() {
    return microAppInfo;
  }


  public void setMicroAppInfo(BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalMicroAppInfo microAppInfo) {
    this.microAppInfo = microAppInfo;
  }


  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal microAppOpenUrlType(BrandMaterialUpdateV30MaterialListMaterialComponentCommonExternalMicroAppOpenUrlType microAppOpenUrlType) {
    
    this.microAppOpenUrlType = microAppOpenUrlType;
    return this;
  }

   /**
   * Get microAppOpenUrlType
   * @return microAppOpenUrlType
  **/
  @javax.annotation.Nullable
  public BrandMaterialUpdateV30MaterialListMaterialComponentCommonExternalMicroAppOpenUrlType getMicroAppOpenUrlType() {
    return microAppOpenUrlType;
  }


  public void setMicroAppOpenUrlType(BrandMaterialUpdateV30MaterialListMaterialComponentCommonExternalMicroAppOpenUrlType microAppOpenUrlType) {
    this.microAppOpenUrlType = microAppOpenUrlType;
  }


  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal wechatMicroAppInfo(BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalWechatMicroAppInfo wechatMicroAppInfo) {
    
    this.wechatMicroAppInfo = wechatMicroAppInfo;
    return this;
  }

   /**
   * Get wechatMicroAppInfo
   * @return wechatMicroAppInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalWechatMicroAppInfo getWechatMicroAppInfo() {
    return wechatMicroAppInfo;
  }


  public void setWechatMicroAppInfo(BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternalWechatMicroAppInfo wechatMicroAppInfo) {
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
    BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal = (BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal) o;
    return Objects.equals(this.externalUrl, brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.externalUrl) &&
        Objects.equals(this.externalUrlIsDownload, brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.externalUrlIsDownload) &&
        Objects.equals(this.microAppInfo, brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.microAppInfo) &&
        Objects.equals(this.microAppOpenUrlType, brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.microAppOpenUrlType) &&
        Objects.equals(this.openUrl, brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.openUrl) &&
        Objects.equals(this.wechatMicroAppInfo, brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.wechatMicroAppInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrl, externalUrlIsDownload, microAppInfo, microAppOpenUrlType, openUrl, wechatMicroAppInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal {\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    externalUrlIsDownload: ").append(toIndentedString(externalUrlIsDownload)).append("\n");
    sb.append("    microAppInfo: ").append(toIndentedString(microAppInfo)).append("\n");
    sb.append("    microAppOpenUrlType: ").append(toIndentedString(microAppOpenUrlType)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
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
    openapiFields.add("external_url");
    openapiFields.add("external_url_is_download");
    openapiFields.add("micro_app_info");
    openapiFields.add("micro_app_open_url_type");
    openapiFields.add("open_url");
    openapiFields.add("wechat_micro_app_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal>() {
           @Override
           public void write(JsonWriter out, BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal
  */
  public static BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal.class);
  }

 /**
  * Convert an instance of BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentCommonExternal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

