/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
 * 官方互动banner图，推荐尺寸1032*360px
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 图片高度
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * 图片image_id
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 图片宽度
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
    NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage = (NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage) o;
    return Objects.equals(this.height, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage.height) &&
        Objects.equals(this.uri, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage.uri) &&
        Objects.equals(this.width, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, uri, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage {\n");
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
       if (!NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage
  */
  public static NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

