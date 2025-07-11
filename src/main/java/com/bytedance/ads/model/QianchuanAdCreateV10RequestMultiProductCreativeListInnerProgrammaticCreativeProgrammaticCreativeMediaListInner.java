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
import com.bytedance.ads.model.QianchuanAdCreateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeMediaListImageMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner {
  public static final String SERIALIZED_NAME_AWEME_CAROUSEL_ID = "aweme_carousel_id";
  @SerializedName(SERIALIZED_NAME_AWEME_CAROUSEL_ID)
  private Long awemeCarouselId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_ID = "carousel_id";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_ID)
  private Long carouselId = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanAdCreateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeMediaListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner() {
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner awemeCarouselId(Long awemeCarouselId) {
    
    this.awemeCarouselId = awemeCarouselId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return awemeCarouselId
  **/
  @javax.annotation.Nullable
  public Long getAwemeCarouselId() {
    return awemeCarouselId;
  }


  public void setAwemeCarouselId(Long awemeCarouselId) {
    this.awemeCarouselId = awemeCarouselId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner carouselId(Long carouselId) {
    
    this.carouselId = carouselId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return carouselId
  **/
  @javax.annotation.Nullable
  public Long getCarouselId() {
    return carouselId;
  }


  public void setCarouselId(Long carouselId) {
    this.carouselId = carouselId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner imageMode(QianchuanAdCreateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeMediaListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeMediaListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanAdCreateV10MultiProductCreativeListProgrammaticCreativeProgrammaticCreativeMediaListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner videoCoverId(String videoCoverId) {
    
    this.videoCoverId = videoCoverId;
    return this;
  }

   /**
   * 
   * @return videoCoverId
  **/
  @javax.annotation.Nullable
  public String getVideoCoverId() {
    return videoCoverId;
  }


  public void setVideoCoverId(String videoCoverId) {
    this.videoCoverId = videoCoverId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
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
    QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner = (QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner) o;
    return Objects.equals(this.awemeCarouselId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.awemeCarouselId) &&
        Objects.equals(this.awemeItemId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.awemeItemId) &&
        Objects.equals(this.carouselId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.carouselId) &&
        Objects.equals(this.imageIds, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.imageIds) &&
        Objects.equals(this.imageMode, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.imageMode) &&
        Objects.equals(this.videoCoverId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.videoCoverId) &&
        Objects.equals(this.videoId, qianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeCarouselId, awemeItemId, carouselId, imageIds, imageMode, videoCoverId, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner {\n");
    sb.append("    awemeCarouselId: ").append(toIndentedString(awemeCarouselId)).append("\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    carouselId: ").append(toIndentedString(carouselId)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
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
    openapiFields.add("aweme_carousel_id");
    openapiFields.add("aweme_item_id");
    openapiFields.add("carousel_id");
    openapiFields.add("image_ids");
    openapiFields.add("image_mode");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner
  */
  public static QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreativeProgrammaticCreativeMediaListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

