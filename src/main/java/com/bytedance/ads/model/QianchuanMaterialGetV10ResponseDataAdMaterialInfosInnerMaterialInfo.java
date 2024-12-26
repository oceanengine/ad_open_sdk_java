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
import com.bytedance.ads.model.QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType;
import com.bytedance.ads.model.QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial;
import com.bytedance.ads.model.QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial;
import com.bytedance.ads.model.QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoTitleMaterial;
import com.bytedance.ads.model.QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial;
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
 * 视频素材
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo {
  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial imageMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType materialType = null;

  public static final String SERIALIZED_NAME_ROOM_MATERIAL = "room_material";
  @SerializedName(SERIALIZED_NAME_ROOM_MATERIAL)
  private QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial roomMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial videoMaterial = null;

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo() {
  }

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo imageMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

   /**
   * Get imageMaterial
   * @return imageMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoImageMaterial imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialType(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType materialType) {
    this.materialType = materialType;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo roomMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial roomMaterial) {
    
    this.roomMaterial = roomMaterial;
    return this;
  }

   /**
   * Get roomMaterial
   * @return roomMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial getRoomMaterial() {
    return roomMaterial;
  }


  public void setRoomMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoRoomMaterial roomMaterial) {
    this.roomMaterial = roomMaterial;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo titleMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo videoMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial videoMaterial) {
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
    QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo = (QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo) o;
    return Objects.equals(this.imageMaterial, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.imageMaterial) &&
        Objects.equals(this.materialType, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.materialType) &&
        Objects.equals(this.roomMaterial, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.roomMaterial) &&
        Objects.equals(this.titleMaterial, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.videoMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMaterial, materialType, roomMaterial, titleMaterial, videoMaterial);
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
    sb.append("class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo {\n");
    sb.append("    imageMaterial: ").append(toIndentedString(imageMaterial)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    roomMaterial: ").append(toIndentedString(roomMaterial)).append("\n");
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
    openapiFields.add("image_material");
    openapiFields.add("material_type");
    openapiFields.add("room_material");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo
  */
  public static QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo.class);
  }

 /**
  * Convert an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

