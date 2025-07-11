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
 * 策略基本信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo {
  public static final String SERIALIZED_NAME_COVER_URL = "cover_url";
  @SerializedName(SERIALIZED_NAME_COVER_URL)
  private String coverUrl = null;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private String vid = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo() {
  }

  public PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo coverUrl(String coverUrl) {
    
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * 样例视频封面url
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  public String getCoverUrl() {
    return coverUrl;
  }


  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo vid(String vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 样例视频vid
   * @return vid
  **/
  @javax.annotation.Nullable
  public String getVid() {
    return vid;
  }


  public void setVid(String vid) {
    this.vid = vid;
  }


  public PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 样例视频url
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo promotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo = (PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo) o;
    return Objects.equals(this.coverUrl, promotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo.coverUrl) &&
        Objects.equals(this.vid, promotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo.vid) &&
        Objects.equals(this.videoUrl, promotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo.videoUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverUrl, vid, videoUrl);
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
    sb.append("class PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo {\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("cover_url");
    openapiFields.add("vid");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo>() {
           @Override
           public void write(JsonWriter out, PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo
  */
  public static PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo.class);
  }

 /**
  * Convert an instance of PromotionAutoGenerateConfigGetV30ResponseDataStrategyDataInnerInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

