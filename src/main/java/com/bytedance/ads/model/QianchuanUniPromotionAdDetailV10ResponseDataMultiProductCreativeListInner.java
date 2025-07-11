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
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListCreativeType;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerBlockMaterialInner;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerCreativeCard;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerImageMaterialInner;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerTitleMaterialInner;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerVideoMaterialInner;
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
 * QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner {
  public static final String SERIALIZED_NAME_BLOCK_MATERIAL = "block_material";
  @SerializedName(SERIALIZED_NAME_BLOCK_MATERIAL)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerBlockMaterialInner> blockMaterial = null;

  public static final String SERIALIZED_NAME_CREATIVE_CARD = "creative_card";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CARD)
  private QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerCreativeCard creativeCard = null;

  public static final String SERIALIZED_NAME_CREATIVE_TYPE = "creative_type";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TYPE)
  private QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListCreativeType creativeType = null;

  public static final String SERIALIZED_NAME_HIDE_IN_AWEME = "hide_in_aweme";
  @SerializedName(SERIALIZED_NAME_HIDE_IN_AWEME)
  private Boolean hideInAweme = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerImageMaterialInner> imageMaterial = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerTitleMaterialInner> titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerVideoMaterialInner> videoMaterial = null;

  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner() {
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner blockMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerBlockMaterialInner> blockMaterial) {
    
    this.blockMaterial = blockMaterial;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner addBlockMaterialItem(QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerBlockMaterialInner blockMaterialItem) {
    if (this.blockMaterial == null) {
      this.blockMaterial = new ArrayList<>();
    }
    this.blockMaterial.add(blockMaterialItem);
    return this;
  }

   /**
   * 
   * @return blockMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerBlockMaterialInner> getBlockMaterial() {
    return blockMaterial;
  }


  public void setBlockMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerBlockMaterialInner> blockMaterial) {
    this.blockMaterial = blockMaterial;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner creativeCard(QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerCreativeCard creativeCard) {
    
    this.creativeCard = creativeCard;
    return this;
  }

   /**
   * Get creativeCard
   * @return creativeCard
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerCreativeCard getCreativeCard() {
    return creativeCard;
  }


  public void setCreativeCard(QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerCreativeCard creativeCard) {
    this.creativeCard = creativeCard;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner creativeType(QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListCreativeType creativeType) {
    
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListCreativeType getCreativeType() {
    return creativeType;
  }


  public void setCreativeType(QianchuanUniPromotionAdDetailV10DataMultiProductCreativeListCreativeType creativeType) {
    this.creativeType = creativeType;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner hideInAweme(Boolean hideInAweme) {
    
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


  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner imageMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerImageMaterialInner> imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner addImageMaterialItem(QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerImageMaterialInner imageMaterialItem) {
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
  public List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerImageMaterialInner> getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerImageMaterialInner> imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner titleMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerTitleMaterialInner> titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner addTitleMaterialItem(QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerTitleMaterialInner titleMaterialItem) {
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
  public List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerTitleMaterialInner> getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerTitleMaterialInner> titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner videoMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerVideoMaterialInner> videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner addVideoMaterialItem(QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerVideoMaterialInner videoMaterialItem) {
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
  public List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerVideoMaterialInner> getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInnerVideoMaterialInner> videoMaterial) {
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
    QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner = (QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner) o;
    return Objects.equals(this.blockMaterial, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.blockMaterial) &&
        Objects.equals(this.creativeCard, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.creativeCard) &&
        Objects.equals(this.creativeType, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.creativeType) &&
        Objects.equals(this.hideInAweme, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.hideInAweme) &&
        Objects.equals(this.imageMaterial, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.imageMaterial) &&
        Objects.equals(this.productId, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.productId) &&
        Objects.equals(this.titleMaterial, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.videoMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockMaterial, creativeCard, creativeType, hideInAweme, imageMaterial, productId, titleMaterial, videoMaterial);
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
    sb.append("class QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner {\n");
    sb.append("    blockMaterial: ").append(toIndentedString(blockMaterial)).append("\n");
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
    openapiFields.add("block_material");
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
       if (!QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner
  */
  public static QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdDetailV10ResponseDataMultiProductCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

