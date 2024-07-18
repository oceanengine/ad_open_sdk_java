/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CarouselCreateV2ResponseDataCarouselAudio;
import com.bytedance.ads.model.CarouselCreateV2ResponseDataCarouselImagesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class CarouselCreateV2ResponseDataCarousel {
  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private CarouselCreateV2ResponseDataCarouselAudio audio = null;

  public static final String SERIALIZED_NAME_CAROUSEL_ID = "carousel_id";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_ID)
  private Long carouselId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_TYPE = "carousel_type";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_TYPE)
  private Long carouselType = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<CarouselCreateV2ResponseDataCarouselImagesInner> images = null;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri = null;

  public CarouselCreateV2ResponseDataCarousel() {
  }

  public CarouselCreateV2ResponseDataCarousel audio(CarouselCreateV2ResponseDataCarouselAudio audio) {
    
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  @javax.annotation.Nullable
  public CarouselCreateV2ResponseDataCarouselAudio getAudio() {
    return audio;
  }


  public void setAudio(CarouselCreateV2ResponseDataCarouselAudio audio) {
    this.audio = audio;
  }


  public CarouselCreateV2ResponseDataCarousel carouselId(Long carouselId) {
    
    this.carouselId = carouselId;
    return this;
  }

   /**
   * 
   * @return carouselId
  **/
  @javax.annotation.Nullable
  public Long getCarouselId() {
    return carouselId;
  }


  public void setCarouselId(Long carouselId) {
    this.carouselId = carouselId;
  }


  public CarouselCreateV2ResponseDataCarousel carouselType(Long carouselType) {
    
    this.carouselType = carouselType;
    return this;
  }

   /**
   * 
   * @return carouselType
  **/
  @javax.annotation.Nullable
  public Long getCarouselType() {
    return carouselType;
  }


  public void setCarouselType(Long carouselType) {
    this.carouselType = carouselType;
  }


  public CarouselCreateV2ResponseDataCarousel fileName(String fileName) {
    
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


  public CarouselCreateV2ResponseDataCarousel images(List<CarouselCreateV2ResponseDataCarouselImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public CarouselCreateV2ResponseDataCarousel addImagesItem(CarouselCreateV2ResponseDataCarouselImagesInner imagesItem) {
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
  @javax.annotation.Nullable
  public List<CarouselCreateV2ResponseDataCarouselImagesInner> getImages() {
    return images;
  }


  public void setImages(List<CarouselCreateV2ResponseDataCarouselImagesInner> images) {
    this.images = images;
  }


  public CarouselCreateV2ResponseDataCarousel uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselCreateV2ResponseDataCarousel carouselCreateV2ResponseDataCarousel = (CarouselCreateV2ResponseDataCarousel) o;
    return Objects.equals(this.audio, carouselCreateV2ResponseDataCarousel.audio) &&
        Objects.equals(this.carouselId, carouselCreateV2ResponseDataCarousel.carouselId) &&
        Objects.equals(this.carouselType, carouselCreateV2ResponseDataCarousel.carouselType) &&
        Objects.equals(this.fileName, carouselCreateV2ResponseDataCarousel.fileName) &&
        Objects.equals(this.images, carouselCreateV2ResponseDataCarousel.images) &&
        Objects.equals(this.uri, carouselCreateV2ResponseDataCarousel.uri);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, carouselId, carouselType, fileName, images, uri);
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
    sb.append("class CarouselCreateV2ResponseDataCarousel {\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    carouselId: ").append(toIndentedString(carouselId)).append("\n");
    sb.append("    carouselType: ").append(toIndentedString(carouselType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("audio");
    openapiFields.add("carousel_id");
    openapiFields.add("carousel_type");
    openapiFields.add("file_name");
    openapiFields.add("images");
    openapiFields.add("uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselCreateV2ResponseDataCarousel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselCreateV2ResponseDataCarousel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselCreateV2ResponseDataCarousel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselCreateV2ResponseDataCarousel.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselCreateV2ResponseDataCarousel>() {
           @Override
           public void write(JsonWriter out, CarouselCreateV2ResponseDataCarousel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselCreateV2ResponseDataCarousel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselCreateV2ResponseDataCarousel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselCreateV2ResponseDataCarousel
  * @throws IOException if the JSON string is invalid with respect to CarouselCreateV2ResponseDataCarousel
  */
  public static CarouselCreateV2ResponseDataCarousel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselCreateV2ResponseDataCarousel.class);
  }

 /**
  * Convert an instance of CarouselCreateV2ResponseDataCarousel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

