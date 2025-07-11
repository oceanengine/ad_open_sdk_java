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
import com.bytedance.ads.model.QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner;
import com.bytedance.ads.model.QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics;
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
 * QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner {
  public static final String SERIALIZED_NAME_AWEME_CAROUSEL_ID = "aweme_carousel_id";
  @SerializedName(SERIALIZED_NAME_AWEME_CAROUSEL_ID)
  private String awemeCarouselId = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner> images = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics metrics = null;

  public static final String SERIALIZED_NAME_MUSIC_ID = "music_id";
  @SerializedName(SERIALIZED_NAME_MUSIC_ID)
  private String musicId = null;

  public static final String SERIALIZED_NAME_MUSIC_URL = "music_url";
  @SerializedName(SERIALIZED_NAME_MUSIC_URL)
  private String musicUrl = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner() {
  }

  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner awemeCarouselId(String awemeCarouselId) {
    
    this.awemeCarouselId = awemeCarouselId;
    return this;
  }

   /**
   * 图文itemid
   * @return awemeCarouselId
  **/
  @javax.annotation.Nullable
  public String getAwemeCarouselId() {
    return awemeCarouselId;
  }


  public void setAwemeCarouselId(String awemeCarouselId) {
    this.awemeCarouselId = awemeCarouselId;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 图文描述
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner images(List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner addImagesItem(QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 图文图片
   * @return images
  **/
  @javax.annotation.Nullable
  public List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner> getImages() {
    return images;
  }


  public void setImages(List<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner> images) {
    this.images = images;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 主页图文素材mid
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner metrics(QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics metrics) {
    this.metrics = metrics;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner musicId(String musicId) {
    
    this.musicId = musicId;
    return this;
  }

   /**
   * 音乐ID
   * @return musicId
  **/
  @javax.annotation.Nullable
  public String getMusicId() {
    return musicId;
  }


  public void setMusicId(String musicId) {
    this.musicId = musicId;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner musicUrl(String musicUrl) {
    
    this.musicUrl = musicUrl;
    return this;
  }

   /**
   * 音乐播放链接
   * @return musicUrl
  **/
  @javax.annotation.Nullable
  public String getMusicUrl() {
    return musicUrl;
  }


  public void setMusicUrl(String musicUrl) {
    this.musicUrl = musicUrl;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 图文标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner = (QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner) o;
    return Objects.equals(this.awemeCarouselId, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.awemeCarouselId) &&
        Objects.equals(this.description, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.description) &&
        Objects.equals(this.images, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.images) &&
        Objects.equals(this.materialId, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.materialId) &&
        Objects.equals(this.metrics, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.metrics) &&
        Objects.equals(this.musicId, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.musicId) &&
        Objects.equals(this.musicUrl, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.musicUrl) &&
        Objects.equals(this.title, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeCarouselId, description, images, materialId, metrics, musicId, musicUrl, title);
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
    sb.append("class QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner {\n");
    sb.append("    awemeCarouselId: ").append(toIndentedString(awemeCarouselId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    musicId: ").append(toIndentedString(musicId)).append("\n");
    sb.append("    musicUrl: ").append(toIndentedString(musicUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("images");
    openapiFields.add("material_id");
    openapiFields.add("metrics");
    openapiFields.add("music_id");
    openapiFields.add("music_url");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner
  */
  public static QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner.class);
  }

 /**
  * Convert an instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

