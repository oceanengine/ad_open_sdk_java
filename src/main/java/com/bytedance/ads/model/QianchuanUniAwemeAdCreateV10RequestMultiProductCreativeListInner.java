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
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeType;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerCreativeCard;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerImageMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerTitleMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerVideoMaterialInner;
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
 * QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner {
  public static final String SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL = "block_video_material";
  @SerializedName(SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL)
  private List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> blockVideoMaterial = null;

  public static final String SERIALIZED_NAME_CREATIVE_CARD = "creative_card";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CARD)
  private QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerCreativeCard creativeCard = null;

  public static final String SERIALIZED_NAME_CREATIVE_TYPE = "creative_type";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TYPE)
  private QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeType creativeType = null;

  public static final String SERIALIZED_NAME_HIDE_IN_AWEME = "hide_in_aweme";
  @SerializedName(SERIALIZED_NAME_HIDE_IN_AWEME)
  private Boolean hideInAweme = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerImageMaterialInner> imageMaterial = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerTitleMaterialInner> titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerVideoMaterialInner> videoMaterial = null;

  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner() {
  }

  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner blockVideoMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> blockVideoMaterial) {
    
    this.blockVideoMaterial = blockVideoMaterial;
    return this;
  }

  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner addBlockVideoMaterialItem(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner blockVideoMaterialItem) {
    if (this.blockVideoMaterial == null) {
      this.blockVideoMaterial = new ArrayList<>();
    }
    this.blockVideoMaterial.add(blockVideoMaterialItem);
    return this;
  }

   /**
   * 
   * @return blockVideoMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> getBlockVideoMaterial() {
    return blockVideoMaterial;
  }


  public void setBlockVideoMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> blockVideoMaterial) {
    this.blockVideoMaterial = blockVideoMaterial;
  }


  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner creativeCard(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerCreativeCard creativeCard) {
    
    this.creativeCard = creativeCard;
    return this;
  }

   /**
   * Get creativeCard
   * @return creativeCard
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerCreativeCard getCreativeCard() {
    return creativeCard;
  }


  public void setCreativeCard(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerCreativeCard creativeCard) {
    this.creativeCard = creativeCard;
  }


  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner creativeType(QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeType creativeType) {
    
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeType getCreativeType() {
    return creativeType;
  }


  public void setCreativeType(QianchuanUniAwemeAdCreateV10MultiProductCreativeListCreativeType creativeType) {
    this.creativeType = creativeType;
  }


  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner hideInAweme(Boolean hideInAweme) {
    
    this.hideInAweme = hideInAweme;
    return this;
  }

   /**
   * 
   * @return hideInAweme
  **/
  @javax.annotation.Nullable
  public Boolean getHideInAweme() {
    return hideInAweme;
  }


  public void setHideInAweme(Boolean hideInAweme) {
    this.hideInAweme = hideInAweme;
  }


  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner imageMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerImageMaterialInner> imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner addImageMaterialItem(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerImageMaterialInner imageMaterialItem) {
    if (this.imageMaterial == null) {
      this.imageMaterial = new ArrayList<>();
    }
    this.imageMaterial.add(imageMaterialItem);
    return this;
  }

   /**
   * 
   * @return imageMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerImageMaterialInner> getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerImageMaterialInner> imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * minimum: 0
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner titleMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerTitleMaterialInner> titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner addTitleMaterialItem(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerTitleMaterialInner titleMaterialItem) {
    if (this.titleMaterial == null) {
      this.titleMaterial = new ArrayList<>();
    }
    this.titleMaterial.add(titleMaterialItem);
    return this;
  }

   /**
   * 
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerTitleMaterialInner> getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerTitleMaterialInner> titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner videoMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerVideoMaterialInner> videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

  public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner addVideoMaterialItem(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerVideoMaterialInner videoMaterialItem) {
    if (this.videoMaterial == null) {
      this.videoMaterial = new ArrayList<>();
    }
    this.videoMaterial.add(videoMaterialItem);
    return this;
  }

   /**
   * 
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerVideoMaterialInner> getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(List<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInnerVideoMaterialInner> videoMaterial) {
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
    QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner = (QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner) o;
    return Objects.equals(this.blockVideoMaterial, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.blockVideoMaterial) &&
        Objects.equals(this.creativeCard, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.creativeCard) &&
        Objects.equals(this.creativeType, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.creativeType) &&
        Objects.equals(this.hideInAweme, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.hideInAweme) &&
        Objects.equals(this.imageMaterial, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.imageMaterial) &&
        Objects.equals(this.productId, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.productId) &&
        Objects.equals(this.titleMaterial, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVideoMaterial, creativeCard, creativeType, hideInAweme, imageMaterial, productId, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner {\n");
    sb.append("    blockVideoMaterial: ").append(toIndentedString(blockVideoMaterial)).append("\n");
    sb.append("    creativeCard: ").append(toIndentedString(creativeCard)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    hideInAweme: ").append(toIndentedString(hideInAweme)).append("\n");
    sb.append("    imageMaterial: ").append(toIndentedString(imageMaterial)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
    openapiFields.add("block_video_material");
    openapiFields.add("creative_card");
    openapiFields.add("creative_type");
    openapiFields.add("hide_in_aweme");
    openapiFields.add("image_material");
    openapiFields.add("product_id");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner
  */
  public static QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdCreateV10RequestMultiProductCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

