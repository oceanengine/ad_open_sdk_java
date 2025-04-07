/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2CreativeVideoMaterialsImageMode;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerImageInfo;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerVideoInfo;
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
 * CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner {
  public static final String SERIALIZED_NAME_DPA_VIDEO_TASK_IDS = "dpa_video_task_ids";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TASK_IDS)
  private List<String> dpaVideoTaskIds = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE = "dpa_video_template_type";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE)
  private CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType dpaVideoTemplateType = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeProceduralCreativeCreateV2CreativeVideoMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerVideoInfo videoInfo = null;

  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner() {
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner dpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    
    this.dpaVideoTaskIds = dpaVideoTaskIds;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner addDpaVideoTaskIdsItem(String dpaVideoTaskIdsItem) {
    if (this.dpaVideoTaskIds == null) {
      this.dpaVideoTaskIds = new ArrayList<>();
    }
    this.dpaVideoTaskIds.add(dpaVideoTaskIdsItem);
    return this;
  }

   /**
   * 
   * @return dpaVideoTaskIds
  **/
  @javax.annotation.Nullable
  public List<String> getDpaVideoTaskIds() {
    return dpaVideoTaskIds;
  }


  public void setDpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    this.dpaVideoTaskIds = dpaVideoTaskIds;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner dpaVideoTemplateType(CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType dpaVideoTemplateType) {
    
    this.dpaVideoTemplateType = dpaVideoTemplateType;
    return this;
  }

   /**
   * Get dpaVideoTemplateType
   * @return dpaVideoTemplateType
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType getDpaVideoTemplateType() {
    return dpaVideoTemplateType;
  }


  public void setDpaVideoTemplateType(CreativeProceduralCreativeCreateV2CreativeVideoMaterialsDpaVideoTemplateType dpaVideoTemplateType) {
    this.dpaVideoTemplateType = dpaVideoTemplateType;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner imageInfo(CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner imageMode(CreativeProceduralCreativeCreateV2CreativeVideoMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2CreativeVideoMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeProceduralCreativeCreateV2CreativeVideoMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner videoInfo(CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner creativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner = (CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner) o;
    return Objects.equals(this.dpaVideoTaskIds, creativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.dpaVideoTaskIds) &&
        Objects.equals(this.dpaVideoTemplateType, creativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.dpaVideoTemplateType) &&
        Objects.equals(this.imageInfo, creativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, creativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.imageMode) &&
        Objects.equals(this.materialId, creativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.materialId) &&
        Objects.equals(this.videoInfo, creativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpaVideoTaskIds, dpaVideoTemplateType, imageInfo, imageMode, materialId, videoInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner {\n");
    sb.append("    dpaVideoTaskIds: ").append(toIndentedString(dpaVideoTaskIds)).append("\n");
    sb.append("    dpaVideoTemplateType: ").append(toIndentedString(dpaVideoTemplateType)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("dpa_video_task_ids");
    openapiFields.add("dpa_video_template_type");
    openapiFields.add("image_info");
    openapiFields.add("image_mode");
    openapiFields.add("material_id");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner
  */
  public static CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

