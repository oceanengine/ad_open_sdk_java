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
import com.bytedance.ads.model.FileVideoAgentGetV2FilteringSource;
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
public class FileVideoAgentGetV2Filtering {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<String> signatures = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private List<FileVideoAgentGetV2FilteringSource> source = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_IDS = "video_ids";
  @SerializedName(SERIALIZED_NAME_VIDEO_IDS)
  private List<String> videoIds = null;

  public FileVideoAgentGetV2Filtering() {
  }

  public FileVideoAgentGetV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 根据视频上传时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public FileVideoAgentGetV2Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public FileVideoAgentGetV2Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 素材id列表，可以根据material_ids（素材报表使用的id，一个素材唯一对应一个素材id）进行过滤 数量限制：&lt;&#x3D;100 注意：video_ids、material_ids、signatures只能选择一个进行过滤
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public FileVideoAgentGetV2Filtering signatures(List<String> signatures) {
    
    this.signatures = signatures;
    return this;
  }

  public FileVideoAgentGetV2Filtering addSignaturesItem(String signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * md5值列表，可以根据素材的md5进行过滤 数量限制：&lt;&#x3D;100 注意：video_ids、material_ids、signatures只能选择一个进行过滤
   * @return signatures
  **/
  @javax.annotation.Nullable
  public List<String> getSignatures() {
    return signatures;
  }


  public void setSignatures(List<String> signatures) {
    this.signatures = signatures;
  }


  public FileVideoAgentGetV2Filtering source(List<FileVideoAgentGetV2FilteringSource> source) {
    
    this.source = source;
    return this;
  }

  public FileVideoAgentGetV2Filtering addSourceItem(FileVideoAgentGetV2FilteringSource sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * 素材来源枚举 https://open.oceanengine.com/labels/7/docs/1696710760171535
   * @return source
  **/
  @javax.annotation.Nullable
  public List<FileVideoAgentGetV2FilteringSource> getSource() {
    return source;
  }


  public void setSource(List<FileVideoAgentGetV2FilteringSource> source) {
    this.source = source;
  }


  public FileVideoAgentGetV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 根据视频上传时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public FileVideoAgentGetV2Filtering videoIds(List<String> videoIds) {
    
    this.videoIds = videoIds;
    return this;
  }

  public FileVideoAgentGetV2Filtering addVideoIdsItem(String videoIdsItem) {
    if (this.videoIds == null) {
      this.videoIds = new ArrayList<>();
    }
    this.videoIds.add(videoIdsItem);
    return this;
  }

   /**
   * 视频ids，示例: [\&quot;86adb23eaa21229fc04ef932b5089bb8\&quot;] 数量限制：&lt;&#x3D;100 注意：video_ids、material_ids、signatures只能选择一个进行过滤
   * @return videoIds
  **/
  @javax.annotation.Nullable
  public List<String> getVideoIds() {
    return videoIds;
  }


  public void setVideoIds(List<String> videoIds) {
    this.videoIds = videoIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoAgentGetV2Filtering fileVideoAgentGetV2Filtering = (FileVideoAgentGetV2Filtering) o;
    return Objects.equals(this.endTime, fileVideoAgentGetV2Filtering.endTime) &&
        Objects.equals(this.materialIds, fileVideoAgentGetV2Filtering.materialIds) &&
        Objects.equals(this.signatures, fileVideoAgentGetV2Filtering.signatures) &&
        Objects.equals(this.source, fileVideoAgentGetV2Filtering.source) &&
        Objects.equals(this.startTime, fileVideoAgentGetV2Filtering.startTime) &&
        Objects.equals(this.videoIds, fileVideoAgentGetV2Filtering.videoIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, materialIds, signatures, source, startTime, videoIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoAgentGetV2Filtering {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    videoIds: ").append(toIndentedString(videoIds)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("material_ids");
    openapiFields.add("signatures");
    openapiFields.add("source");
    openapiFields.add("start_time");
    openapiFields.add("video_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoAgentGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoAgentGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoAgentGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoAgentGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoAgentGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, FileVideoAgentGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoAgentGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoAgentGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoAgentGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to FileVideoAgentGetV2Filtering
  */
  public static FileVideoAgentGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoAgentGetV2Filtering.class);
  }

 /**
  * Convert an instance of FileVideoAgentGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

