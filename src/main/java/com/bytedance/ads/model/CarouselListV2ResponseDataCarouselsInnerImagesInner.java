/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * CarouselListV2ResponseDataCarouselsInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class CarouselListV2ResponseDataCarouselsInnerImagesInner {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_IMAGE_SUBJECT = "image_subject";
  @SerializedName(SERIALIZED_NAME_IMAGE_SUBJECT)
  private CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject imageSubject = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private Double ratio = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public CarouselListV2ResponseDataCarouselsInnerImagesInner() {
  }

  public CarouselListV2ResponseDataCarouselsInnerImagesInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInner imageSubject(CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject imageSubject) {
    
    this.imageSubject = imageSubject;
    return this;
  }

   /**
   * Get imageSubject
   * @return imageSubject
  **/
  @javax.annotation.Nullable
  public CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject getImageSubject() {
    return imageSubject;
  }


  public void setImageSubject(CarouselListV2ResponseDataCarouselsInnerImagesInnerImageSubject imageSubject) {
    this.imageSubject = imageSubject;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInner ratio(Double ratio) {
    
    this.ratio = ratio;
    return this;
  }

   /**
   * 
   * @return ratio
  **/
  @javax.annotation.Nullable
  public Double getRatio() {
    return ratio;
  }


  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CarouselListV2ResponseDataCarouselsInnerImagesInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselListV2ResponseDataCarouselsInnerImagesInner carouselListV2ResponseDataCarouselsInnerImagesInner = (CarouselListV2ResponseDataCarouselsInnerImagesInner) o;
    return Objects.equals(this.height, carouselListV2ResponseDataCarouselsInnerImagesInner.height) &&
        Objects.equals(this.imageId, carouselListV2ResponseDataCarouselsInnerImagesInner.imageId) &&
        Objects.equals(this.imageSubject, carouselListV2ResponseDataCarouselsInnerImagesInner.imageSubject) &&
        Objects.equals(this.materialId, carouselListV2ResponseDataCarouselsInnerImagesInner.materialId) &&
        Objects.equals(this.ratio, carouselListV2ResponseDataCarouselsInnerImagesInner.ratio) &&
        Objects.equals(this.url, carouselListV2ResponseDataCarouselsInnerImagesInner.url) &&
        Objects.equals(this.width, carouselListV2ResponseDataCarouselsInnerImagesInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, imageId, imageSubject, materialId, ratio, url, width);
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
    sb.append("class CarouselListV2ResponseDataCarouselsInnerImagesInner {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageSubject: ").append(toIndentedString(imageSubject)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("image_id");
    openapiFields.add("image_subject");
    openapiFields.add("material_id");
    openapiFields.add("ratio");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselListV2ResponseDataCarouselsInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselListV2ResponseDataCarouselsInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselListV2ResponseDataCarouselsInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselListV2ResponseDataCarouselsInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselListV2ResponseDataCarouselsInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, CarouselListV2ResponseDataCarouselsInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselListV2ResponseDataCarouselsInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselListV2ResponseDataCarouselsInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselListV2ResponseDataCarouselsInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to CarouselListV2ResponseDataCarouselsInnerImagesInner
  */
  public static CarouselListV2ResponseDataCarouselsInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselListV2ResponseDataCarouselsInnerImagesInner.class);
  }

 /**
  * Convert an instance of CarouselListV2ResponseDataCarouselsInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

