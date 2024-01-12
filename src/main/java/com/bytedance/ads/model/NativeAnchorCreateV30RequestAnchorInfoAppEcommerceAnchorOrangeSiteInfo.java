/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
 * 橙子建站落地页设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo {
  public static final String SERIALIZED_NAME_ANDROID_EXTERNAL_URL = "android_external_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_EXTERNAL_URL)
  private String androidExternalUrl = null;

  public static final String SERIALIZED_NAME_IOS_EXTERNAL_URL = "ios_external_url";
  @SerializedName(SERIALIZED_NAME_IOS_EXTERNAL_URL)
  private String iosExternalUrl = null;

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo() {
  }

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo androidExternalUrl(String androidExternalUrl) {
    
    this.androidExternalUrl = androidExternalUrl;
    return this;
  }

   /**
   * 安卓端落地页链接，内部需要包含应用下载链接
   * @return androidExternalUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidExternalUrl() {
    return androidExternalUrl;
  }


  public void setAndroidExternalUrl(String androidExternalUrl) {
    this.androidExternalUrl = androidExternalUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo iosExternalUrl(String iosExternalUrl) {
    
    this.iosExternalUrl = iosExternalUrl;
    return this;
  }

   /**
   * iOS端落地页链接，内部需要包含应用下载链接
   * @return iosExternalUrl
  **/
  @javax.annotation.Nullable
  public String getIosExternalUrl() {
    return iosExternalUrl;
  }


  public void setIosExternalUrl(String iosExternalUrl) {
    this.iosExternalUrl = iosExternalUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo = (NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo) o;
    return Objects.equals(this.androidExternalUrl, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo.androidExternalUrl) &&
        Objects.equals(this.iosExternalUrl, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo.iosExternalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidExternalUrl, iosExternalUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo {\n");
    sb.append("    androidExternalUrl: ").append(toIndentedString(androidExternalUrl)).append("\n");
    sb.append("    iosExternalUrl: ").append(toIndentedString(iosExternalUrl)).append("\n");
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
    openapiFields.add("android_external_url");
    openapiFields.add("ios_external_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo
  */
  public static NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

