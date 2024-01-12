/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class CarouselCreateV2RequestImagesInnerImageSubject {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand = null;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = null;

  public CarouselCreateV2RequestImagesInnerImageSubject() {
  }

  public CarouselCreateV2RequestImagesInnerImageSubject brand(String brand) {
    
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


  public CarouselCreateV2RequestImagesInnerImageSubject comment(String comment) {
    
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


  public CarouselCreateV2RequestImagesInnerImageSubject description(String description) {
    
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


  public CarouselCreateV2RequestImagesInnerImageSubject text(String text) {
    
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
    CarouselCreateV2RequestImagesInnerImageSubject carouselCreateV2RequestImagesInnerImageSubject = (CarouselCreateV2RequestImagesInnerImageSubject) o;
    return Objects.equals(this.brand, carouselCreateV2RequestImagesInnerImageSubject.brand) &&
        Objects.equals(this.comment, carouselCreateV2RequestImagesInnerImageSubject.comment) &&
        Objects.equals(this.description, carouselCreateV2RequestImagesInnerImageSubject.description) &&
        Objects.equals(this.text, carouselCreateV2RequestImagesInnerImageSubject.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, comment, description, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselCreateV2RequestImagesInnerImageSubject {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselCreateV2RequestImagesInnerImageSubject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselCreateV2RequestImagesInnerImageSubject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselCreateV2RequestImagesInnerImageSubject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselCreateV2RequestImagesInnerImageSubject.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselCreateV2RequestImagesInnerImageSubject>() {
           @Override
           public void write(JsonWriter out, CarouselCreateV2RequestImagesInnerImageSubject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselCreateV2RequestImagesInnerImageSubject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselCreateV2RequestImagesInnerImageSubject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselCreateV2RequestImagesInnerImageSubject
  * @throws IOException if the JSON string is invalid with respect to CarouselCreateV2RequestImagesInnerImageSubject
  */
  public static CarouselCreateV2RequestImagesInnerImageSubject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselCreateV2RequestImagesInnerImageSubject.class);
  }

 /**
  * Convert an instance of CarouselCreateV2RequestImagesInnerImageSubject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

