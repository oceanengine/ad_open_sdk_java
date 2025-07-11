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
public class AdvertiserAvatarGetV2ResponseDataAvatarInfo {
  public static final String SERIALIZED_NAME_AUDIT_WEB_URI = "audit_web_uri";
  @SerializedName(SERIALIZED_NAME_AUDIT_WEB_URI)
  private String auditWebUri = null;

  public static final String SERIALIZED_NAME_AUDIT_WEB_URL = "audit_web_url";
  @SerializedName(SERIALIZED_NAME_AUDIT_WEB_URL)
  private String auditWebUrl = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_WEB_URI = "web_uri";
  @SerializedName(SERIALIZED_NAME_WEB_URI)
  private String webUri = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public AdvertiserAvatarGetV2ResponseDataAvatarInfo() {
  }

  public AdvertiserAvatarGetV2ResponseDataAvatarInfo auditWebUri(String auditWebUri) {
    
    this.auditWebUri = auditWebUri;
    return this;
  }

   /**
   * 
   * @return auditWebUri
  **/
  @javax.annotation.Nullable
  public String getAuditWebUri() {
    return auditWebUri;
  }


  public void setAuditWebUri(String auditWebUri) {
    this.auditWebUri = auditWebUri;
  }


  public AdvertiserAvatarGetV2ResponseDataAvatarInfo auditWebUrl(String auditWebUrl) {
    
    this.auditWebUrl = auditWebUrl;
    return this;
  }

   /**
   * 
   * @return auditWebUrl
  **/
  @javax.annotation.Nullable
  public String getAuditWebUrl() {
    return auditWebUrl;
  }


  public void setAuditWebUrl(String auditWebUrl) {
    this.auditWebUrl = auditWebUrl;
  }


  public AdvertiserAvatarGetV2ResponseDataAvatarInfo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public AdvertiserAvatarGetV2ResponseDataAvatarInfo webUri(String webUri) {
    
    this.webUri = webUri;
    return this;
  }

   /**
   * 
   * @return webUri
  **/
  @javax.annotation.Nullable
  public String getWebUri() {
    return webUri;
  }


  public void setWebUri(String webUri) {
    this.webUri = webUri;
  }


  public AdvertiserAvatarGetV2ResponseDataAvatarInfo webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * 
   * @return webUrl
  **/
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public AdvertiserAvatarGetV2ResponseDataAvatarInfo width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserAvatarGetV2ResponseDataAvatarInfo advertiserAvatarGetV2ResponseDataAvatarInfo = (AdvertiserAvatarGetV2ResponseDataAvatarInfo) o;
    return Objects.equals(this.auditWebUri, advertiserAvatarGetV2ResponseDataAvatarInfo.auditWebUri) &&
        Objects.equals(this.auditWebUrl, advertiserAvatarGetV2ResponseDataAvatarInfo.auditWebUrl) &&
        Objects.equals(this.height, advertiserAvatarGetV2ResponseDataAvatarInfo.height) &&
        Objects.equals(this.webUri, advertiserAvatarGetV2ResponseDataAvatarInfo.webUri) &&
        Objects.equals(this.webUrl, advertiserAvatarGetV2ResponseDataAvatarInfo.webUrl) &&
        Objects.equals(this.width, advertiserAvatarGetV2ResponseDataAvatarInfo.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditWebUri, auditWebUrl, height, webUri, webUrl, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserAvatarGetV2ResponseDataAvatarInfo {\n");
    sb.append("    auditWebUri: ").append(toIndentedString(auditWebUri)).append("\n");
    sb.append("    auditWebUrl: ").append(toIndentedString(auditWebUrl)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    webUri: ").append(toIndentedString(webUri)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("audit_web_uri");
    openapiFields.add("audit_web_url");
    openapiFields.add("height");
    openapiFields.add("web_uri");
    openapiFields.add("web_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserAvatarGetV2ResponseDataAvatarInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserAvatarGetV2ResponseDataAvatarInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserAvatarGetV2ResponseDataAvatarInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserAvatarGetV2ResponseDataAvatarInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserAvatarGetV2ResponseDataAvatarInfo>() {
           @Override
           public void write(JsonWriter out, AdvertiserAvatarGetV2ResponseDataAvatarInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserAvatarGetV2ResponseDataAvatarInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserAvatarGetV2ResponseDataAvatarInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserAvatarGetV2ResponseDataAvatarInfo
  * @throws IOException if the JSON string is invalid with respect to AdvertiserAvatarGetV2ResponseDataAvatarInfo
  */
  public static AdvertiserAvatarGetV2ResponseDataAvatarInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserAvatarGetV2ResponseDataAvatarInfo.class);
  }

 /**
  * Convert an instance of AdvertiserAvatarGetV2ResponseDataAvatarInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

