/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideoVideo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private String awemeItemId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_SOURCE = "aweme_item_source";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_SOURCE)
  private Long awemeItemSource = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideoVideo video = null;

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo() {
  }

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo awemeItemId(String awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 抖音视频id
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public String getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(String awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo awemeItemSource(Long awemeItemSource) {
    
    this.awemeItemSource = awemeItemSource;
    return this;
  }

   /**
   * 是否塞物料 1为塞物料（拉取抖音主页视频），0为取物料（上传视频）
   * @return awemeItemSource
  **/
  @javax.annotation.Nonnull
  public Long getAwemeItemSource() {
    return awemeItemSource;
  }


  public void setAwemeItemSource(Long awemeItemSource) {
    this.awemeItemSource = awemeItemSource;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo video(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideoVideo video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideoVideo getVideo() {
    return video;
  }


  public void setVideo(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideoVideo video) {
    this.video = video;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo = (BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo) o;
    return Objects.equals(this.awemeItemId, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo.awemeItemId) &&
        Objects.equals(this.awemeItemSource, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo.awemeItemSource) &&
        Objects.equals(this.title, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo.title) &&
        Objects.equals(this.video, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, awemeItemSource, title, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    awemeItemSource: ").append(toIndentedString(awemeItemSource)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
    openapiFields.add("aweme_item_source");
    openapiFields.add("title");
    openapiFields.add("video");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aweme_item_source");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo
  */
  public static BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

