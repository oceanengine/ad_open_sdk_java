/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionUpdateV30PromotionRelatedProductImageMaterialListImageMode;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInnerImagesInner;
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
 * PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionUpdateV30PromotionRelatedProductImageMaterialListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInnerImagesInner> images = null;

  public PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner() {
  }

  public PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner imageMode(PromotionUpdateV30PromotionRelatedProductImageMaterialListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public PromotionUpdateV30PromotionRelatedProductImageMaterialListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionUpdateV30PromotionRelatedProductImageMaterialListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner images(List<PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInnerImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner addImagesItem(PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInnerImagesInner imagesItem) {
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
  public List<PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInnerImagesInner> getImages() {
    return images;
  }


  public void setImages(List<PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInnerImagesInner> images) {
    this.images = images;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner promotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner = (PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner) o;
    return Objects.equals(this.imageMode, promotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner.imageMode) &&
        Objects.equals(this.images, promotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner {\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("images");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_mode");
    openapiRequiredFields.add("images");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner
  */
  public static PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionRelatedProductInnerImageMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

