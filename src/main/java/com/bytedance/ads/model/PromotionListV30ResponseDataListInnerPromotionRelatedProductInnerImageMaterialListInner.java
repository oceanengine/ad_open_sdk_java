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
import com.bytedance.ads.model.PromotionListV30DataListPromotionRelatedProductImageMaterialListImageMode;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInnerImagesInner;
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
 * PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionListV30DataListPromotionRelatedProductImageMaterialListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInnerImagesInner> images = null;

  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner imageMode(PromotionListV30DataListPromotionRelatedProductImageMaterialListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionRelatedProductImageMaterialListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionListV30DataListPromotionRelatedProductImageMaterialListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner images(List<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInnerImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner addImagesItem(PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInnerImagesInner imagesItem) {
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
  public List<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInnerImagesInner> getImages() {
    return images;
  }


  public void setImages(List<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInnerImagesInner> images) {
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
    PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner promotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner = (PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner) o;
    return Objects.equals(this.imageMode, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner.imageMode) &&
        Objects.equals(this.images, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner.images);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, images);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerImageMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

