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
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialAddV10MultiProductCreativeListImageMaterialImageMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner {
  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanUniPromotionAdMaterialAddV10MultiProductCreativeListImageMaterialImageMode imageMode = null;

  public QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner() {
  }

  public QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner imageMode(QianchuanUniPromotionAdMaterialAddV10MultiProductCreativeListImageMaterialImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialAddV10MultiProductCreativeListImageMaterialImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanUniPromotionAdMaterialAddV10MultiProductCreativeListImageMaterialImageMode imageMode) {
    this.imageMode = imageMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner qianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner = (QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner) o;
    return Objects.equals(this.imageIds, qianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner.imageIds) &&
        Objects.equals(this.imageMode, qianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner.imageMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageIds, imageMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner {\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
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
    openapiFields.add("image_ids");
    openapiFields.add("image_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner
  */
  public static QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdMaterialAddV10RequestMultiProductCreativeListInnerImageMaterialInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

