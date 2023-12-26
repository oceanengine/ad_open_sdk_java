/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CarouselCreateV2CarouselType;
import com.bytedance.ads.model.CarouselCreateV2RequestImagesInner;
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
 * CarouselCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class CarouselCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUDIO_ID = "audio_id";
  @SerializedName(SERIALIZED_NAME_AUDIO_ID)
  private String audioId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_TYPE = "carousel_type";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_TYPE)
  private CarouselCreateV2CarouselType carouselType = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<CarouselCreateV2RequestImagesInner> images = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public CarouselCreateV2Request() {
  }

  public CarouselCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CarouselCreateV2Request audioId(String audioId) {
    
    this.audioId = audioId;
    return this;
  }

   /**
   * 音频 id，可以同过音频上传接口获取（优先使用 audio_id）
   * @return audioId
  **/
  @javax.annotation.Nullable
  public String getAudioId() {
    return audioId;
  }


  public void setAudioId(String audioId) {
    this.audioId = audioId;
  }


  public CarouselCreateV2Request carouselType(CarouselCreateV2CarouselType carouselType) {
    
    this.carouselType = carouselType;
    return this;
  }

   /**
   * Get carouselType
   * @return carouselType
  **/
  @javax.annotation.Nonnull
  public CarouselCreateV2CarouselType getCarouselType() {
    return carouselType;
  }


  public void setCarouselType(CarouselCreateV2CarouselType carouselType) {
    this.carouselType = carouselType;
  }


  public CarouselCreateV2Request description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 千川图文素材描述
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CarouselCreateV2Request fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public CarouselCreateV2Request images(List<CarouselCreateV2RequestImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public CarouselCreateV2Request addImagesItem(CarouselCreateV2RequestImagesInner imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 
   * @return images
  **/
  @javax.annotation.Nonnull
  public List<CarouselCreateV2RequestImagesInner> getImages() {
    return images;
  }


  public void setImages(List<CarouselCreateV2RequestImagesInner> images) {
    this.images = images;
  }


  public CarouselCreateV2Request videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 音频vid，可以同过视频上传接口获取（优先使用 audio_id）
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
    CarouselCreateV2Request carouselCreateV2Request = (CarouselCreateV2Request) o;
    return Objects.equals(this.advertiserId, carouselCreateV2Request.advertiserId) &&
        Objects.equals(this.audioId, carouselCreateV2Request.audioId) &&
        Objects.equals(this.carouselType, carouselCreateV2Request.carouselType) &&
        Objects.equals(this.description, carouselCreateV2Request.description) &&
        Objects.equals(this.fileName, carouselCreateV2Request.fileName) &&
        Objects.equals(this.images, carouselCreateV2Request.images) &&
        Objects.equals(this.videoId, carouselCreateV2Request.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, audioId, carouselType, description, fileName, images, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
    sb.append("    carouselType: ").append(toIndentedString(carouselType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("audio_id");
    openapiFields.add("carousel_type");
    openapiFields.add("description");
    openapiFields.add("file_name");
    openapiFields.add("images");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("carousel_type");
    openapiRequiredFields.add("images");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselCreateV2Request>() {
           @Override
           public void write(JsonWriter out, CarouselCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to CarouselCreateV2Request
  */
  public static CarouselCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselCreateV2Request.class);
  }

 /**
  * Convert an instance of CarouselCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
