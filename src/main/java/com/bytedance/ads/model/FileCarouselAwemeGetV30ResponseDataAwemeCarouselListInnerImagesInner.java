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
 * FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner() {
  }

  public FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner height(Long height) {
    
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


  public FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner imageId(String imageId) {
    
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


  public FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner width(Long width) {
    
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
    FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner fileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner = (FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner) o;
    return Objects.equals(this.height, fileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner.height) &&
        Objects.equals(this.imageId, fileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner.imageId) &&
        Objects.equals(this.width, fileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, imageId, width);
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
    sb.append("class FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner
  */
  public static FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner.class);
  }

 /**
  * Convert an instance of FileCarouselAwemeGetV30ResponseDataAwemeCarouselListInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

