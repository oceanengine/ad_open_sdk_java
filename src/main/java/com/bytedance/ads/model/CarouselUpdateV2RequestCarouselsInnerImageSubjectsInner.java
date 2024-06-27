/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = null;

  public CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner() {
  }

  public CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * 
   * @return brand
  **/
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * 
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nonnull
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * 
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner carouselUpdateV2RequestCarouselsInnerImageSubjectsInner = (CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner) o;
    return Objects.equals(this.brand, carouselUpdateV2RequestCarouselsInnerImageSubjectsInner.brand) &&
        Objects.equals(this.comment, carouselUpdateV2RequestCarouselsInnerImageSubjectsInner.comment) &&
        Objects.equals(this.description, carouselUpdateV2RequestCarouselsInnerImageSubjectsInner.description) &&
        Objects.equals(this.imageId, carouselUpdateV2RequestCarouselsInnerImageSubjectsInner.imageId) &&
        Objects.equals(this.text, carouselUpdateV2RequestCarouselsInnerImageSubjectsInner.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, comment, description, imageId, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("comment");
    openapiFields.add("description");
    openapiFields.add("image_id");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner>() {
           @Override
           public void write(JsonWriter out, CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner
  * @throws IOException if the JSON string is invalid with respect to CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner
  */
  public static CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner.class);
  }

 /**
  * Convert an instance of CarouselUpdateV2RequestCarouselsInnerImageSubjectsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

