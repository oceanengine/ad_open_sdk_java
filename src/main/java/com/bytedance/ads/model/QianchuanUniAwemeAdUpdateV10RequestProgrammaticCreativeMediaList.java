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
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList {
  public static final String SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL = "block_video_material";
  @SerializedName(SERIALIZED_NAME_BLOCK_VIDEO_MATERIAL)
  private List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner> blockVideoMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner> titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner> videoMaterial = null;

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList() {
  }

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList blockVideoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner> blockVideoMaterial) {
    
    this.blockVideoMaterial = blockVideoMaterial;
    return this;
  }

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList addBlockVideoMaterialItem(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner blockVideoMaterialItem) {
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
  public List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner> getBlockVideoMaterial() {
    return blockVideoMaterial;
  }


  public void setBlockVideoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner> blockVideoMaterial) {
    this.blockVideoMaterial = blockVideoMaterial;
  }


  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList titleMaterial(List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner> titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList addTitleMaterialItem(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner titleMaterialItem) {
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
  public List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner> getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner> titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList videoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner> videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList addVideoMaterialItem(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner videoMaterialItem) {
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
  public List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner> getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(List<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner> videoMaterial) {
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
    QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList = (QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList) o;
    return Objects.equals(this.blockVideoMaterial, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList.blockVideoMaterial) &&
        Objects.equals(this.titleMaterial, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVideoMaterial, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList {\n");
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
       if (!QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList
  */
  public static QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
