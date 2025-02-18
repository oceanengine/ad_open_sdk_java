/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * 擦前展示动画
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage {
  public static final String SERIALIZED_NAME_D = "d";
  @SerializedName(SERIALIZED_NAME_D)
  private Long d = null;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format = null;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_WEB_URI = "web_uri";
  @SerializedName(SERIALIZED_NAME_WEB_URI)
  private String webUri = null;

  public static final String SERIALIZED_NAME_WEB_URI_SHOW_URL = "web_uri_show_url";
  @SerializedName(SERIALIZED_NAME_WEB_URI_SHOW_URL)
  private String webUriShowUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage() {
  }

  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage d(Long d) {
    
    this.d = d;
    return this;
  }

   /**
   * 动图时长
   * @return d
  **/
  @javax.annotation.Nullable
  public Long getD() {
    return d;
  }


  public void setD(Long d) {
    this.d = d;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * 格式
   * @return format
  **/
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * 
   * @return hash
  **/
  @javax.annotation.Nullable
  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 高
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage webUri(String webUri) {
    
    this.webUri = webUri;
    return this;
  }

   /**
   * 图片URI
   * @return webUri
  **/
  @javax.annotation.Nullable
  public String getWebUri() {
    return webUri;
  }


  public void setWebUri(String webUri) {
    this.webUri = webUri;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage webUriShowUrl(String webUriShowUrl) {
    
    this.webUriShowUrl = webUriShowUrl;
    return this;
  }

   /**
   * 图片URL
   * @return webUriShowUrl
  **/
  @javax.annotation.Nullable
  public String getWebUriShowUrl() {
    return webUriShowUrl;
  }


  public void setWebUriShowUrl(String webUriShowUrl) {
    this.webUriShowUrl = webUriShowUrl;
  }


  public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 宽
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
    BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage = (BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage) o;
    return Objects.equals(this.d, brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.d) &&
        Objects.equals(this.format, brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.format) &&
        Objects.equals(this.hash, brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.hash) &&
        Objects.equals(this.height, brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.height) &&
        Objects.equals(this.webUri, brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.webUri) &&
        Objects.equals(this.webUriShowUrl, brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.webUriShowUrl) &&
        Objects.equals(this.width, brandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d, format, hash, height, webUri, webUriShowUrl, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage {\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    webUri: ").append(toIndentedString(webUri)).append("\n");
    sb.append("    webUriShowUrl: ").append(toIndentedString(webUriShowUrl)).append("\n");
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
    openapiFields.add("d");
    openapiFields.add("format");
    openapiFields.add("hash");
    openapiFields.add("height");
    openapiFields.add("web_uri");
    openapiFields.add("web_uri_show_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage>() {
           @Override
           public void write(JsonWriter out, BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage
  */
  public static BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage.class);
  }

 /**
  * Convert an instance of BrandCreativeUpdateV30RequestAdvancedCreativeInfoExploreOneTimeComponentWipeBeforeImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

