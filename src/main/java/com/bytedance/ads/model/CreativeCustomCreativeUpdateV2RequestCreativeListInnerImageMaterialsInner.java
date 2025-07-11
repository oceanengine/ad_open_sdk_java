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
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2CreativeListImageMaterialsImageMode;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerImageInfo;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage;
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
 * CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeCustomCreativeUpdateV2CreativeListImageMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IMAGE = "template_image";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMAGE)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateImage = null;

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner() {
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner imageInfo(CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner imageMode(CreativeCustomCreativeUpdateV2CreativeListImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2CreativeListImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeCustomCreativeUpdateV2CreativeListImageMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner templateImage(CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateImage) {
    
    this.templateImage = templateImage;
    return this;
  }

   /**
   * Get templateImage
   * @return templateImage
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage getTemplateImage() {
    return templateImage;
  }


  public void setTemplateImage(CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateImage) {
    this.templateImage = templateImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner creativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner = (CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner) o;
    return Objects.equals(this.imageInfo, creativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, creativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner.imageMode) &&
        Objects.equals(this.templateImage, creativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner.templateImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode, templateImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner {\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    templateImage: ").append(toIndentedString(templateImage)).append("\n");
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
    openapiFields.add("image_info");
    openapiFields.add("image_mode");
    openapiFields.add("template_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner
  */
  public static CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

