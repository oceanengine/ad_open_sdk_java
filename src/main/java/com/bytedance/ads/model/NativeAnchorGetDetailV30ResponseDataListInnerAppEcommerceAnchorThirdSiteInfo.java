/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo {
  public static final String SERIALIZED_NAME_ANDROID_DOWNLOAD_URL = "android_download_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_DOWNLOAD_URL)
  private String androidDownloadUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_IOS_DOWNLOAD_URL = "ios_download_url";
  @SerializedName(SERIALIZED_NAME_IOS_DOWNLOAD_URL)
  private String iosDownloadUrl = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo androidDownloadUrl(String androidDownloadUrl) {
    
    this.androidDownloadUrl = androidDownloadUrl;
    return this;
  }

   /**
   * 
   * @return androidDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidDownloadUrl() {
    return androidDownloadUrl;
  }


  public void setAndroidDownloadUrl(String androidDownloadUrl) {
    this.androidDownloadUrl = androidDownloadUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo externalUrl(String externalUrl) {
    
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


  public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo iosDownloadUrl(String iosDownloadUrl) {
    
    this.iosDownloadUrl = iosDownloadUrl;
    return this;
  }

   /**
   * 
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
    NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo = (NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo) o;
    return Objects.equals(this.androidDownloadUrl, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo.androidDownloadUrl) &&
        Objects.equals(this.externalUrl, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo.externalUrl) &&
        Objects.equals(this.iosDownloadUrl, nativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo.iosDownloadUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidDownloadUrl, externalUrl, iosDownloadUrl);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo {\n");
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
       if (!NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerAppEcommerceAnchorThirdSiteInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

