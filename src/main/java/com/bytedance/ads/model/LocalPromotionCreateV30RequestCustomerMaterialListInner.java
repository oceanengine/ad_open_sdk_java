/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalPromotionCreateV30CustomerMaterialListImageMode;
import com.bytedance.ads.model.LocalPromotionCreateV30RequestCustomerMaterialListInnerTitleMaterial;
import com.bytedance.ads.model.LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial;
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
 * LocalPromotionCreateV30RequestCustomerMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class LocalPromotionCreateV30RequestCustomerMaterialListInner {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private LocalPromotionCreateV30CustomerMaterialListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private LocalPromotionCreateV30RequestCustomerMaterialListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial videoMaterial = null;

  public LocalPromotionCreateV30RequestCustomerMaterialListInner() {
  }

  public LocalPromotionCreateV30RequestCustomerMaterialListInner imageMode(LocalPromotionCreateV30CustomerMaterialListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public LocalPromotionCreateV30CustomerMaterialListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(LocalPromotionCreateV30CustomerMaterialListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public LocalPromotionCreateV30RequestCustomerMaterialListInner titleMaterial(LocalPromotionCreateV30RequestCustomerMaterialListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public LocalPromotionCreateV30RequestCustomerMaterialListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(LocalPromotionCreateV30RequestCustomerMaterialListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public LocalPromotionCreateV30RequestCustomerMaterialListInner videoMaterial(LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(LocalPromotionCreateV30RequestCustomerMaterialListInnerVideoMaterial videoMaterial) {
    this.videoMaterial = videoMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPromotionCreateV30RequestCustomerMaterialListInner localPromotionCreateV30RequestCustomerMaterialListInner = (LocalPromotionCreateV30RequestCustomerMaterialListInner) o;
    return Objects.equals(this.imageMode, localPromotionCreateV30RequestCustomerMaterialListInner.imageMode) &&
        Objects.equals(this.titleMaterial, localPromotionCreateV30RequestCustomerMaterialListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, localPromotionCreateV30RequestCustomerMaterialListInner.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalPromotionCreateV30RequestCustomerMaterialListInner {\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    titleMaterial: ").append(toIndentedString(titleMaterial)).append("\n");
    sb.append("    videoMaterial: ").append(toIndentedString(videoMaterial)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionCreateV30RequestCustomerMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionCreateV30RequestCustomerMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionCreateV30RequestCustomerMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionCreateV30RequestCustomerMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionCreateV30RequestCustomerMaterialListInner>() {
           @Override
           public void write(JsonWriter out, LocalPromotionCreateV30RequestCustomerMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionCreateV30RequestCustomerMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionCreateV30RequestCustomerMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionCreateV30RequestCustomerMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionCreateV30RequestCustomerMaterialListInner
  */
  public static LocalPromotionCreateV30RequestCustomerMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionCreateV30RequestCustomerMaterialListInner.class);
  }

 /**
  * Convert an instance of LocalPromotionCreateV30RequestCustomerMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

