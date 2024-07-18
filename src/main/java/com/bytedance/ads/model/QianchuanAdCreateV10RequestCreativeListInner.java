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
import com.bytedance.ads.model.QianchuanAdCreateV10CreativeListImageMode;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestCreativeListInnerCarouselMaterial;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestCreativeListInnerImageMaterial;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestCreativeListInnerPromotionCardMaterial;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestCreativeListInnerTitleMaterial;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestCreativeListInnerVideoMaterial;
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
 * QianchuanAdCreateV10RequestCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class QianchuanAdCreateV10RequestCreativeListInner {
  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL = "carousel_material";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL)
  private QianchuanAdCreateV10RequestCreativeListInnerCarouselMaterial carouselMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private QianchuanAdCreateV10RequestCreativeListInnerImageMaterial imageMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanAdCreateV10CreativeListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_MATERIAL = "promotion_card_material";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_MATERIAL)
  private QianchuanAdCreateV10RequestCreativeListInnerPromotionCardMaterial promotionCardMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private QianchuanAdCreateV10RequestCreativeListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private QianchuanAdCreateV10RequestCreativeListInnerVideoMaterial videoMaterial = null;

  public QianchuanAdCreateV10RequestCreativeListInner() {
  }

  public QianchuanAdCreateV10RequestCreativeListInner carouselMaterial(QianchuanAdCreateV10RequestCreativeListInnerCarouselMaterial carouselMaterial) {
    
    this.carouselMaterial = carouselMaterial;
    return this;
  }

   /**
   * Get carouselMaterial
   * @return carouselMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestCreativeListInnerCarouselMaterial getCarouselMaterial() {
    return carouselMaterial;
  }


  public void setCarouselMaterial(QianchuanAdCreateV10RequestCreativeListInnerCarouselMaterial carouselMaterial) {
    this.carouselMaterial = carouselMaterial;
  }


  public QianchuanAdCreateV10RequestCreativeListInner imageMaterial(QianchuanAdCreateV10RequestCreativeListInnerImageMaterial imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

   /**
   * Get imageMaterial
   * @return imageMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestCreativeListInnerImageMaterial getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(QianchuanAdCreateV10RequestCreativeListInnerImageMaterial imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanAdCreateV10RequestCreativeListInner imageMode(QianchuanAdCreateV10CreativeListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10CreativeListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanAdCreateV10CreativeListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanAdCreateV10RequestCreativeListInner promotionCardMaterial(QianchuanAdCreateV10RequestCreativeListInnerPromotionCardMaterial promotionCardMaterial) {
    
    this.promotionCardMaterial = promotionCardMaterial;
    return this;
  }

   /**
   * Get promotionCardMaterial
   * @return promotionCardMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestCreativeListInnerPromotionCardMaterial getPromotionCardMaterial() {
    return promotionCardMaterial;
  }


  public void setPromotionCardMaterial(QianchuanAdCreateV10RequestCreativeListInnerPromotionCardMaterial promotionCardMaterial) {
    this.promotionCardMaterial = promotionCardMaterial;
  }


  public QianchuanAdCreateV10RequestCreativeListInner titleMaterial(QianchuanAdCreateV10RequestCreativeListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestCreativeListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(QianchuanAdCreateV10RequestCreativeListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanAdCreateV10RequestCreativeListInner videoMaterial(QianchuanAdCreateV10RequestCreativeListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestCreativeListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(QianchuanAdCreateV10RequestCreativeListInnerVideoMaterial videoMaterial) {
    this.videoMaterial = videoMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestCreativeListInner qianchuanAdCreateV10RequestCreativeListInner = (QianchuanAdCreateV10RequestCreativeListInner) o;
    return Objects.equals(this.carouselMaterial, qianchuanAdCreateV10RequestCreativeListInner.carouselMaterial) &&
        Objects.equals(this.imageMaterial, qianchuanAdCreateV10RequestCreativeListInner.imageMaterial) &&
        Objects.equals(this.imageMode, qianchuanAdCreateV10RequestCreativeListInner.imageMode) &&
        Objects.equals(this.promotionCardMaterial, qianchuanAdCreateV10RequestCreativeListInner.promotionCardMaterial) &&
        Objects.equals(this.titleMaterial, qianchuanAdCreateV10RequestCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanAdCreateV10RequestCreativeListInner.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carouselMaterial, imageMaterial, imageMode, promotionCardMaterial, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestCreativeListInner {\n");
    sb.append("    carouselMaterial: ").append(toIndentedString(carouselMaterial)).append("\n");
    sb.append("    imageMaterial: ").append(toIndentedString(imageMaterial)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    promotionCardMaterial: ").append(toIndentedString(promotionCardMaterial)).append("\n");
    sb.append("    titleMaterial: ").append(toIndentedString(titleMaterial)).append("\n");
    sb.append("    videoMaterial: ").append(toIndentedString(videoMaterial)).append("\n");
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
    openapiFields.add("carousel_material");
    openapiFields.add("image_material");
    openapiFields.add("image_mode");
    openapiFields.add("promotion_card_material");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestCreativeListInner
  */
  public static QianchuanAdCreateV10RequestCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

