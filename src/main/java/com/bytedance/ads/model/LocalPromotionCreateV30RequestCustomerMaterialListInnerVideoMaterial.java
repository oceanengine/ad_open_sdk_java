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
 * 视频素材
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_COVER_WEB_URI = "cover_web_uri";
  @SerializedName(SERIALIZED_NAME_COVER_WEB_URI)
  private String coverWebUri = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial() {
  }

  public LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 抖音短视频ID 注意：如果视频为抖音主页视频，则该字段必填
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial coverWebUri(String coverWebUri) {
    
    this.coverWebUri = coverWebUri;
    return this;
  }

   /**
   * 封面信息设置
   * @return coverWebUri
  **/
  @javax.annotation.Nullable
  public String getCoverWebUri() {
    return coverWebUri;
  }


  public void setCoverWebUri(String coverWebUri) {
    this.coverWebUri = coverWebUri;
  }


  public LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial localPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial = (LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial) o;
    return Objects.equals(this.awemeItemId, localPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial.awemeItemId) &&
        Objects.equals(this.coverWebUri, localPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial.coverWebUri) &&
        Objects.equals(this.videoId, localPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, coverWebUri, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    coverWebUri: ").append(toIndentedString(coverWebUri)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("cover_web_uri");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial>() {
           @Override
           public void write(JsonWriter out, LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial
  */
  public static LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial.class);
  }

 /**
  * Convert an instance of LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

