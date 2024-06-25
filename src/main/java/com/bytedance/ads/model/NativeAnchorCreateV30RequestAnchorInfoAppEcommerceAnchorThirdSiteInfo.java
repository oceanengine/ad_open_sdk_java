/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * 第三方落地页设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo {
  public static final String SERIALIZED_NAME_ANDROID_DOWNLOAD_URL = "android_download_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_DOWNLOAD_URL)
  private String androidDownloadUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_IOS_DOWNLOAD_URL = "ios_download_url";
  @SerializedName(SERIALIZED_NAME_IOS_DOWNLOAD_URL)
  private String iosDownloadUrl = null;

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo() {
  }

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo androidDownloadUrl(String androidDownloadUrl) {
    
    this.androidDownloadUrl = androidDownloadUrl;
    return this;
  }

   /**
   *  安卓下载链接
   * @return androidDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidDownloadUrl() {
    return androidDownloadUrl;
  }


  public void setAndroidDownloadUrl(String androidDownloadUrl) {
    this.androidDownloadUrl = androidDownloadUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 第三方落地页
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo iosDownloadUrl(String iosDownloadUrl) {
    
    this.iosDownloadUrl = iosDownloadUrl;
    return this;
  }

   /**
   * ios下载链接
   * @return iosDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getIosDownloadUrl() {
    return iosDownloadUrl;
  }


  public void setIosDownloadUrl(String iosDownloadUrl) {
    this.iosDownloadUrl = iosDownloadUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo = (NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo) o;
    return Objects.equals(this.androidDownloadUrl, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo.androidDownloadUrl) &&
        Objects.equals(this.externalUrl, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo.externalUrl) &&
        Objects.equals(this.iosDownloadUrl, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo.iosDownloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidDownloadUrl, externalUrl, iosDownloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo {\n");
    sb.append("    androidDownloadUrl: ").append(toIndentedString(androidDownloadUrl)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    iosDownloadUrl: ").append(toIndentedString(iosDownloadUrl)).append("\n");
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
    openapiFields.add("android_download_url");
    openapiFields.add("external_url");
    openapiFields.add("ios_download_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo
  */
  public static NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

