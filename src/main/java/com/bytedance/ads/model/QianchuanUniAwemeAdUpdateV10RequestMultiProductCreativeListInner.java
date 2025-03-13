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
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerCreativeCard;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerImageMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerTitleMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerVideoMaterialInner;
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
 * QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner {
  public static final String SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL = "block_video_material";
  @SerializedName(SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL)
  private List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> blockVideoMaterial = null;

  public static final String SERIALIZED_NAME_CREATIVE_CARD = "creative_card";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CARD)
  private QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerCreativeCard creativeCard = null;

  public static final String SERIALIZED_NAME_CREATIVE_TYPE = "creative_type";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TYPE)
  private QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType creativeType = null;

  public static final String SERIALIZED_NAME_HIDE_IN_AWEME = "hide_in_aweme";
  @SerializedName(SERIALIZED_NAME_HIDE_IN_AWEME)
  private Boolean hideInAweme = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerImageMaterialInner> imageMaterial = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerTitleMaterialInner> titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerVideoMaterialInner> videoMaterial = null;

  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner() {
  }

  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner blockVideoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> blockVideoMaterial) {
    
    this.blockVideoMaterial = blockVideoMaterial;
    return this;
  }

  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner addBlockVideoMaterialItem(QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner blockVideoMaterialItem) {
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
  public List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> getBlockVideoMaterial() {
    return blockVideoMaterial;
  }


  public void setBlockVideoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerBlockVideoMaterialInner> blockVideoMaterial) {
    this.blockVideoMaterial = blockVideoMaterial;
  }


  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner creativeCard(QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerCreativeCard creativeCard) {
    
    this.creativeCard = creativeCard;
    return this;
  }

   /**
   * Get creativeCard
   * @return creativeCard
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerCreativeCard getCreativeCard() {
    return creativeCard;
  }


  public void setCreativeCard(QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerCreativeCard creativeCard) {
    this.creativeCard = creativeCard;
  }


  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner creativeType(QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType creativeType) {
    
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType getCreativeType() {
    return creativeType;
  }


  public void setCreativeType(QianchuanUniAwemeAdUpdateV10MultiProductCreativeListCreativeType creativeType) {
    this.creativeType = creativeType;
  }


  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner hideInAweme(Boolean hideInAweme) {
    
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


  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner imageMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerImageMaterialInner> imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner addImageMaterialItem(QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerImageMaterialInner imageMaterialItem) {
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
  public List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerImageMaterialInner> getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerImageMaterialInner> imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner titleMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerTitleMaterialInner> titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner addTitleMaterialItem(QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerTitleMaterialInner titleMaterialItem) {
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
  public List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerTitleMaterialInner> getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerTitleMaterialInner> titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner videoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerVideoMaterialInner> videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

  public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner addVideoMaterialItem(QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerVideoMaterialInner videoMaterialItem) {
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
  public List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerVideoMaterialInner> getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInnerVideoMaterialInner> videoMaterial) {
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
    QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner = (QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner) o;
    return Objects.equals(this.blockVideoMaterial, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.blockVideoMaterial) &&
        Objects.equals(this.creativeCard, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.creativeCard) &&
        Objects.equals(this.creativeType, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.creativeType) &&
        Objects.equals(this.hideInAweme, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.hideInAweme) &&
        Objects.equals(this.imageMaterial, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.imageMaterial) &&
        Objects.equals(this.productId, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.productId) &&
        Objects.equals(this.titleMaterial, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVideoMaterial, creativeCard, creativeType, hideInAweme, imageMaterial, productId, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner {\n");
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
       if (!QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner
  */
  public static QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdUpdateV10RequestMultiProductCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

