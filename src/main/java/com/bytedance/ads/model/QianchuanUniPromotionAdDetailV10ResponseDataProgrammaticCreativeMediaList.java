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
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListBlockVideoMaterialInner;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListVideoMaterialInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList {
  public static final String SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL = "block_video_material";
  @SerializedName(SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListBlockVideoMaterialInner> blockVideoMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner> titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListVideoMaterialInner> videoMaterial = null;

  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList() {
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList blockVideoMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListBlockVideoMaterialInner> blockVideoMaterial) {
    
    this.blockVideoMaterial = blockVideoMaterial;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList addBlockVideoMaterialItem(QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListBlockVideoMaterialInner blockVideoMaterialItem) {
    if (this.blockVideoMaterial == null) {
      this.blockVideoMaterial = new ArrayList<>();
    }
    this.blockVideoMaterial.add(blockVideoMaterialItem);
    return this;
  }

   /**
   * 
   * @return blockVideoMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListBlockVideoMaterialInner> getBlockVideoMaterial() {
    return blockVideoMaterial;
  }


  public void setBlockVideoMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListBlockVideoMaterialInner> blockVideoMaterial) {
    this.blockVideoMaterial = blockVideoMaterial;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList titleMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner> titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList addTitleMaterialItem(QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner titleMaterialItem) {
    if (this.titleMaterial == null) {
      this.titleMaterial = new ArrayList<>();
    }
    this.titleMaterial.add(titleMaterialItem);
    return this;
  }

   /**
   * 
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner> getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner> titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList videoMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListVideoMaterialInner> videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList addVideoMaterialItem(QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListVideoMaterialInner videoMaterialItem) {
    if (this.videoMaterial == null) {
      this.videoMaterial = new ArrayList<>();
    }
    this.videoMaterial.add(videoMaterialItem);
    return this;
  }

   /**
   * 
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListVideoMaterialInner> getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(List<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListVideoMaterialInner> videoMaterial) {
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
    QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList qianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList = (QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList) o;
    return Objects.equals(this.blockVideoMaterial, qianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList.blockVideoMaterial) &&
        Objects.equals(this.titleMaterial, qianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVideoMaterial, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList {\n");
    sb.append("    blockVideoMaterial: ").append(toIndentedString(blockVideoMaterial)).append("\n");
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
    openapiFields.add("block_video_material");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList
  */
  public static QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

