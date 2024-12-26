/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner {
  public static final String SERIALIZED_NAME_BACKGROUND_IMAGE_ID = "background_image_id";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_IMAGE_ID)
  private String backgroundImageId = null;

  public PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner() {
  }

  public PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner backgroundImageId(String backgroundImageId) {
    
    this.backgroundImageId = backgroundImageId;
    return this;
  }

   /**
   * 
   * @return backgroundImageId
  **/
  @javax.annotation.Nullable
  public String getBackgroundImageId() {
    return backgroundImageId;
  }


  public void setBackgroundImageId(String backgroundImageId) {
    this.backgroundImageId = backgroundImageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner promotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner = (PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner) o;
    return Objects.equals(this.backgroundImageId, promotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner.backgroundImageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner {\n");
    sb.append("    backgroundImageId: ").append(toIndentedString(backgroundImageId)).append("\n");
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
    openapiFields.add("background_image_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner>() {
           @Override
           public void write(JsonWriter out, PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner
  */
  public static PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner.class);
  }

 /**
  * Convert an instance of PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

