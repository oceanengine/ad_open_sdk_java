/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCreativeGetV30DataCreativesCreativeExternalInfoExternalUrlType;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo;
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
 * 落地页链接信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo {
  public static final String SERIALIZED_NAME_EXTERNAL_URL_TYPE = "external_url_type";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_TYPE)
  private BrandCreativeGetV30DataCreativesCreativeExternalInfoExternalUrlType externalUrlType = null;

  public static final String SERIALIZED_NAME_NORMAL_EXTERNAL_INFO = "normal_external_info";
  @SerializedName(SERIALIZED_NAME_NORMAL_EXTERNAL_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo normalExternalInfo = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo externalUrlType(BrandCreativeGetV30DataCreativesCreativeExternalInfoExternalUrlType externalUrlType) {
    
    this.externalUrlType = externalUrlType;
    return this;
  }

   /**
   * Get externalUrlType
   * @return externalUrlType
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30DataCreativesCreativeExternalInfoExternalUrlType getExternalUrlType() {
    return externalUrlType;
  }


  public void setExternalUrlType(BrandCreativeGetV30DataCreativesCreativeExternalInfoExternalUrlType externalUrlType) {
    this.externalUrlType = externalUrlType;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo normalExternalInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo normalExternalInfo) {
    
    this.normalExternalInfo = normalExternalInfo;
    return this;
  }

   /**
   * Get normalExternalInfo
   * @return normalExternalInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo getNormalExternalInfo() {
    return normalExternalInfo;
  }


  public void setNormalExternalInfo(BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfoNormalExternalInfo normalExternalInfo) {
    this.normalExternalInfo = normalExternalInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo) o;
    return Objects.equals(this.externalUrlType, brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo.externalUrlType) &&
        Objects.equals(this.normalExternalInfo, brandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo.normalExternalInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrlType, normalExternalInfo);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo {\n");
    sb.append("    externalUrlType: ").append(toIndentedString(externalUrlType)).append("\n");
    sb.append("    normalExternalInfo: ").append(toIndentedString(normalExternalInfo)).append("\n");
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
    openapiFields.add("external_url_type");
    openapiFields.add("normal_external_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeExternalInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

