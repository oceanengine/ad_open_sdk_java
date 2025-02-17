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
 * 落地页信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class DpaClueProductListV2ResponseDataProductsInnerLandingInfo {
  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl = null;

  public static final String SERIALIZED_NAME_TARGET_URL_ANDROID_APP = "target_url_android_app";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_ANDROID_APP)
  private String targetUrlAndroidApp = null;

  public static final String SERIALIZED_NAME_TARGET_URL_IOS_APP = "target_url_ios_app";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_IOS_APP)
  private String targetUrlIosApp = null;

  public static final String SERIALIZED_NAME_TARGET_URL_MOBILE = "target_url_mobile";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_MOBILE)
  private String targetUrlMobile = null;

  public static final String SERIALIZED_NAME_TARGET_URL_UNIVERSAL_LINK = "target_url_universal_link";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_UNIVERSAL_LINK)
  private String targetUrlUniversalLink = null;

  public DpaClueProductListV2ResponseDataProductsInnerLandingInfo() {
  }

  public DpaClueProductListV2ResponseDataProductsInnerLandingInfo targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * 落地页
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  public String getTargetUrl() {
    return targetUrl;
  }


  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public DpaClueProductListV2ResponseDataProductsInnerLandingInfo targetUrlAndroidApp(String targetUrlAndroidApp) {
    
    this.targetUrlAndroidApp = targetUrlAndroidApp;
    return this;
  }

   /**
   * 安卓落地页
   * @return targetUrlAndroidApp
  **/
  @javax.annotation.Nullable
  public String getTargetUrlAndroidApp() {
    return targetUrlAndroidApp;
  }


  public void setTargetUrlAndroidApp(String targetUrlAndroidApp) {
    this.targetUrlAndroidApp = targetUrlAndroidApp;
  }


  public DpaClueProductListV2ResponseDataProductsInnerLandingInfo targetUrlIosApp(String targetUrlIosApp) {
    
    this.targetUrlIosApp = targetUrlIosApp;
    return this;
  }

   /**
   * iOS落地页
   * @return targetUrlIosApp
  **/
  @javax.annotation.Nullable
  public String getTargetUrlIosApp() {
    return targetUrlIosApp;
  }


  public void setTargetUrlIosApp(String targetUrlIosApp) {
    this.targetUrlIosApp = targetUrlIosApp;
  }


  public DpaClueProductListV2ResponseDataProductsInnerLandingInfo targetUrlMobile(String targetUrlMobile) {
    
    this.targetUrlMobile = targetUrlMobile;
    return this;
  }

   /**
   * H5落地页
   * @return targetUrlMobile
  **/
  @javax.annotation.Nullable
  public String getTargetUrlMobile() {
    return targetUrlMobile;
  }


  public void setTargetUrlMobile(String targetUrlMobile) {
    this.targetUrlMobile = targetUrlMobile;
  }


  public DpaClueProductListV2ResponseDataProductsInnerLandingInfo targetUrlUniversalLink(String targetUrlUniversalLink) {
    
    this.targetUrlUniversalLink = targetUrlUniversalLink;
    return this;
  }

   /**
   * 落地页universal link
   * @return targetUrlUniversalLink
  **/
  @javax.annotation.Nullable
  public String getTargetUrlUniversalLink() {
    return targetUrlUniversalLink;
  }


  public void setTargetUrlUniversalLink(String targetUrlUniversalLink) {
    this.targetUrlUniversalLink = targetUrlUniversalLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaClueProductListV2ResponseDataProductsInnerLandingInfo dpaClueProductListV2ResponseDataProductsInnerLandingInfo = (DpaClueProductListV2ResponseDataProductsInnerLandingInfo) o;
    return Objects.equals(this.targetUrl, dpaClueProductListV2ResponseDataProductsInnerLandingInfo.targetUrl) &&
        Objects.equals(this.targetUrlAndroidApp, dpaClueProductListV2ResponseDataProductsInnerLandingInfo.targetUrlAndroidApp) &&
        Objects.equals(this.targetUrlIosApp, dpaClueProductListV2ResponseDataProductsInnerLandingInfo.targetUrlIosApp) &&
        Objects.equals(this.targetUrlMobile, dpaClueProductListV2ResponseDataProductsInnerLandingInfo.targetUrlMobile) &&
        Objects.equals(this.targetUrlUniversalLink, dpaClueProductListV2ResponseDataProductsInnerLandingInfo.targetUrlUniversalLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetUrl, targetUrlAndroidApp, targetUrlIosApp, targetUrlMobile, targetUrlUniversalLink);
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
    sb.append("class DpaClueProductListV2ResponseDataProductsInnerLandingInfo {\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    targetUrlAndroidApp: ").append(toIndentedString(targetUrlAndroidApp)).append("\n");
    sb.append("    targetUrlIosApp: ").append(toIndentedString(targetUrlIosApp)).append("\n");
    sb.append("    targetUrlMobile: ").append(toIndentedString(targetUrlMobile)).append("\n");
    sb.append("    targetUrlUniversalLink: ").append(toIndentedString(targetUrlUniversalLink)).append("\n");
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
    openapiFields.add("target_url");
    openapiFields.add("target_url_android_app");
    openapiFields.add("target_url_ios_app");
    openapiFields.add("target_url_mobile");
    openapiFields.add("target_url_universal_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaClueProductListV2ResponseDataProductsInnerLandingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductListV2ResponseDataProductsInnerLandingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductListV2ResponseDataProductsInnerLandingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductListV2ResponseDataProductsInnerLandingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductListV2ResponseDataProductsInnerLandingInfo>() {
           @Override
           public void write(JsonWriter out, DpaClueProductListV2ResponseDataProductsInnerLandingInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductListV2ResponseDataProductsInnerLandingInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductListV2ResponseDataProductsInnerLandingInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductListV2ResponseDataProductsInnerLandingInfo
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductListV2ResponseDataProductsInnerLandingInfo
  */
  public static DpaClueProductListV2ResponseDataProductsInnerLandingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductListV2ResponseDataProductsInnerLandingInfo.class);
  }

 /**
  * Convert an instance of DpaClueProductListV2ResponseDataProductsInnerLandingInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

