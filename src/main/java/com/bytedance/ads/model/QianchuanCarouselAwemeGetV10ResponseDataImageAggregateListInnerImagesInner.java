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
 * QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_WEB_URI = "web_uri";
  @SerializedName(SERIALIZED_NAME_WEB_URI)
  private String webUri = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner() {
  }

  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner height(Long height) {
    
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


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner webUri(String webUri) {
    
    this.webUri = webUri;
    return this;
  }

   /**
   * 
   * @return webUri
  **/
  @javax.annotation.Nullable
  public String getWebUri() {
    return webUri;
  }


  public void setWebUri(String webUri) {
    this.webUri = webUri;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * 
   * @return webUrl
  **/
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner width(Long width) {
    
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
    QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner = (QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner) o;
    return Objects.equals(this.height, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner.height) &&
        Objects.equals(this.webUri, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner.webUri) &&
        Objects.equals(this.webUrl, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner.webUrl) &&
        Objects.equals(this.width, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, webUri, webUrl, width);
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
    sb.append("class QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    webUri: ").append(toIndentedString(webUri)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
    openapiFields.add("web_uri");
    openapiFields.add("web_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner
  */
  public static QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner.class);
  }

 /**
  * Convert an instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

