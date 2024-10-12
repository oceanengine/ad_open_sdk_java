/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
 * 视频封面图片
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage() {
  }

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage height(Long height) {
    
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


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage webUrl(String webUrl) {
    
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


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage width(Long width) {
    
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
    QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage = (QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage) o;
    return Objects.equals(this.height, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage.height) &&
        Objects.equals(this.id, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage.id) &&
        Objects.equals(this.webUrl, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage.webUrl) &&
        Objects.equals(this.width, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, id, webUrl, width);
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
    sb.append("class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("web_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage>() {
           @Override
           public void write(JsonWriter out, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage
  * @throws IOException if the JSON string is invalid with respect to QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage
  */
  public static QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage.class);
  }

 /**
  * Convert an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

