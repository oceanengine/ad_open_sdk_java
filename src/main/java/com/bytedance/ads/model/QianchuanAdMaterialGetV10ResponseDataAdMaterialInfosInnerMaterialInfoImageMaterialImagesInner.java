/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
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
 * QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner() {
  }

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner height(Long height) {
    
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


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner width(Long width) {
    
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
    QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner = (QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner) o;
    return Objects.equals(this.height, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner.height) &&
        Objects.equals(this.id, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner.id) &&
        Objects.equals(this.imageUrl, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner.imageUrl) &&
        Objects.equals(this.width, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, id, imageUrl, width);
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
    sb.append("class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("image_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner
  */
  public static QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner.class);
  }

 /**
  * Convert an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterialImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
