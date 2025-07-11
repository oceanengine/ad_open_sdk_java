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
 * 在线视频内容
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo {
  public static final String SERIALIZED_NAME_ORIGIN_URL = "origin_url";
  @SerializedName(SERIALIZED_NAME_ORIGIN_URL)
  private String originUrl = null;

  public static final String SERIALIZED_NAME_POSTER_URL = "poster_url";
  @SerializedName(SERIALIZED_NAME_POSTER_URL)
  private String posterUrl = null;

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo() {
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo originUrl(String originUrl) {
    
    this.originUrl = originUrl;
    return this;
  }

   /**
   * 视频原始地址，例如https://v.youku.com/v_show/id_xxx.html，当&#x60;online_video&#x60;不为空时，有值
   * @return originUrl
  **/
  @javax.annotation.Nullable
  public String getOriginUrl() {
    return originUrl;
  }


  public void setOriginUrl(String originUrl) {
    this.originUrl = originUrl;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo posterUrl(String posterUrl) {
    
    this.posterUrl = posterUrl;
    return this;
  }

   /**
   * 视频封面图链接，当&#x60;online_video&#x60;不为空时，有值
   * @return posterUrl
  **/
  @javax.annotation.Nullable
  public String getPosterUrl() {
    return posterUrl;
  }


  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo toolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo = (ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo) o;
    return Objects.equals(this.originUrl, toolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo.originUrl) &&
        Objects.equals(this.posterUrl, toolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo.posterUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(originUrl, posterUrl);
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
    sb.append("class ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo {\n");
    sb.append("    originUrl: ").append(toIndentedString(originUrl)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
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
    openapiFields.add("origin_url");
    openapiFields.add("poster_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo
  */
  public static ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideoOnlineVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

