/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2CreativeListVideoMaterialDpaVideoTemplateType;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialImageInfo;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialVideoInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TASK_IDS = "dpa_video_task_ids";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TASK_IDS)
  private List<String> dpaVideoTaskIds = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE = "dpa_video_template_type";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE)
  private CreativeCustomCreativeCreateV2CreativeListVideoMaterialDpaVideoTemplateType dpaVideoTemplateType = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialVideoInfo videoInfo = null;

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial() {
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial dpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    
    this.dpaVideoTaskIds = dpaVideoTaskIds;
    return this;
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial addDpaVideoTaskIdsItem(String dpaVideoTaskIdsItem) {
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


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial dpaVideoTemplateType(CreativeCustomCreativeCreateV2CreativeListVideoMaterialDpaVideoTemplateType dpaVideoTemplateType) {
    
    this.dpaVideoTemplateType = dpaVideoTemplateType;
    return this;
  }

   /**
   * Get dpaVideoTemplateType
   * @return dpaVideoTemplateType
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2CreativeListVideoMaterialDpaVideoTemplateType getDpaVideoTemplateType() {
    return dpaVideoTemplateType;
  }


  public void setDpaVideoTemplateType(CreativeCustomCreativeCreateV2CreativeListVideoMaterialDpaVideoTemplateType dpaVideoTemplateType) {
    this.dpaVideoTemplateType = dpaVideoTemplateType;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial imageInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial videoInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterialVideoInfo videoInfo) {
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
    CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial creativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial = (CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial) o;
    return Objects.equals(this.awemeItemId, creativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.awemeItemId) &&
        Objects.equals(this.dpaVideoTaskIds, creativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.dpaVideoTaskIds) &&
        Objects.equals(this.dpaVideoTemplateType, creativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.dpaVideoTemplateType) &&
        Objects.equals(this.imageInfo, creativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.imageInfo) &&
        Objects.equals(this.videoInfo, creativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.videoInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, dpaVideoTaskIds, dpaVideoTemplateType, imageInfo, videoInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    dpaVideoTaskIds: ").append(toIndentedString(dpaVideoTaskIds)).append("\n");
    sb.append("    dpaVideoTemplateType: ").append(toIndentedString(dpaVideoTemplateType)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("dpa_video_task_ids");
    openapiFields.add("dpa_video_template_type");
    openapiFields.add("image_info");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial
  */
  public static CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerVideoMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

