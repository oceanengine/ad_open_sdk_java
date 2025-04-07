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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo {
  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_MICRO_APP_INFO = "micro_app_info";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_INFO)
  private String microAppInfo = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_OPEN_URL_TEXT = "open_url_text";
  @SerializedName(SERIALIZED_NAME_OPEN_URL_TEXT)
  private String openUrlText = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 落地页链接
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo microAppInfo(String microAppInfo) {
    
    this.microAppInfo = microAppInfo;
    return this;
  }

   /**
   * 小程序链接
   * @return microAppInfo
  **/
  @javax.annotation.Nullable
  public String getMicroAppInfo() {
    return microAppInfo;
  }


  public void setMicroAppInfo(String microAppInfo) {
    this.microAppInfo = microAppInfo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 直达链接
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo openUrlText(String openUrlText) {
    
    this.openUrlText = openUrlText;
    return this;
  }

   /**
   * 直达文案
   * @return openUrlText
  **/
  @javax.annotation.Nullable
  public String getOpenUrlText() {
    return openUrlText;
  }


  public void setOpenUrlText(String openUrlText) {
    this.openUrlText = openUrlText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo) o;
    return Objects.equals(this.externalUrl, brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo.externalUrl) &&
        Objects.equals(this.microAppInfo, brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo.microAppInfo) &&
        Objects.equals(this.openUrl, brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo.openUrl) &&
        Objects.equals(this.openUrlText, brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo.openUrlText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrl, microAppInfo, openUrl, openUrlText);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo {\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    microAppInfo: ").append(toIndentedString(microAppInfo)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    openUrlText: ").append(toIndentedString(openUrlText)).append("\n");
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
    openapiFields.add("micro_app_info");
    openapiFields.add("open_url");
    openapiFields.add("open_url_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

