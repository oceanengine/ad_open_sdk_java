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
import com.bytedance.ads.model.QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialImageMode;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner;
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
 * 图片素材
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner> images = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MUSIC_URL = "music_url";
  @SerializedName(SERIALIZED_NAME_MUSIC_URL)
  private String musicUrl = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource source = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial() {
  }

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial description(String description) {
    
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


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial imageMode(QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial images(List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial addImagesItem(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner imagesItem) {
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
  public List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner> getImages() {
    return images;
  }


  public void setImages(List<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner> images) {
    this.images = images;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 更新时需要传，创建时不需要传
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial musicUrl(String musicUrl) {
    
    this.musicUrl = musicUrl;
    return this;
  }

   /**
   * 图文音乐播放链接
   * @return musicUrl
  **/
  @javax.annotation.Nullable
  public String getMusicUrl() {
    return musicUrl;
  }


  public void setMusicUrl(String musicUrl) {
    this.musicUrl = musicUrl;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial source(QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource getSource() {
    return source;
  }


  public void setSource(QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialInfoImageMaterialSource source) {
    this.source = source;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 视频标题
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
    QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial = (QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial) o;
    return Objects.equals(this.description, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.description) &&
        Objects.equals(this.imageMode, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.imageMode) &&
        Objects.equals(this.images, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.images) &&
        Objects.equals(this.materialId, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.materialId) &&
        Objects.equals(this.musicUrl, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.musicUrl) &&
        Objects.equals(this.source, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.source) &&
        Objects.equals(this.title, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, imageMode, images, materialId, musicUrl, source, title);
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
    sb.append("class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    musicUrl: ").append(toIndentedString(musicUrl)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("image_mode");
    openapiFields.add("images");
    openapiFields.add("material_id");
    openapiFields.add("music_url");
    openapiFields.add("source");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial
  */
  public static QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

