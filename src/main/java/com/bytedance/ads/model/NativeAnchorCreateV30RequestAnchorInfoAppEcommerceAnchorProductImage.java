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
 * 商品大图，推荐比例 1：1
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage() {
  }

  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage height(Long height) {
    
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


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * 
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage width(Long width) {
    
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
    NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage = (NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage) o;
    return Objects.equals(this.height, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage.height) &&
        Objects.equals(this.uri, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage.uri) &&
        Objects.equals(this.width, nativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, uri, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage
  */
  public static NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchorProductImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

