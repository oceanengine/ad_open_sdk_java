/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileVideoAgentV2UploadType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
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
 * FileVideoAgentV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class FileVideoAgentV2Request {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_IS_AIGC = "is_aigc";
  @SerializedName(SERIALIZED_NAME_IS_AIGC)
  private Boolean isAigc = null;

  public static final String SERIALIZED_NAME_IS_NEED_AUTH = "is_need_auth";
  @SerializedName(SERIALIZED_NAME_IS_NEED_AUTH)
  private Boolean isNeedAuth = null;

  public static final String SERIALIZED_NAME_UPLOAD_TYPE = "upload_type";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TYPE)
  private FileVideoAgentV2UploadType uploadType = null;

  public static final String SERIALIZED_NAME_VIDEO_FILE = "video_file";
  @SerializedName(SERIALIZED_NAME_VIDEO_FILE)
  private File videoFile = null;

  public static final String SERIALIZED_NAME_VIDEO_SIGNATURE = "video_signature";
  @SerializedName(SERIALIZED_NAME_VIDEO_SIGNATURE)
  private String videoSignature = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public FileVideoAgentV2Request() {
  }

  public FileVideoAgentV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商id
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public FileVideoAgentV2Request fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 视频上传名称
   * @return fileName
  **/
  @javax.annotation.Nonnull
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FileVideoAgentV2Request isAigc(Boolean isAigc) {
    
    this.isAigc = isAigc;
    return this;
  }

   /**
   * 标注是否为AIGC生成,默认false
   * @return isAigc
  **/
  @javax.annotation.Nullable
  public Boolean getIsAigc() {
    return isAigc;
  }


  public void setIsAigc(Boolean isAigc) {
    this.isAigc = isAigc;
  }


  public FileVideoAgentV2Request isNeedAuth(Boolean isNeedAuth) {
    
    this.isNeedAuth = isNeedAuth;
    return this;
  }

   /**
   * 标注是否允许授权(素材搬运)，目前只支持true
   * @return isNeedAuth
  **/
  @javax.annotation.Nonnull
  public Boolean getIsNeedAuth() {
    return isNeedAuth;
  }


  public void setIsNeedAuth(Boolean isNeedAuth) {
    this.isNeedAuth = isNeedAuth;
  }


  public FileVideoAgentV2Request uploadType(FileVideoAgentV2UploadType uploadType) {
    
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @javax.annotation.Nullable
  public FileVideoAgentV2UploadType getUploadType() {
    return uploadType;
  }


  public void setUploadType(FileVideoAgentV2UploadType uploadType) {
    this.uploadType = uploadType;
  }


  public FileVideoAgentV2Request videoFile(File videoFile) {
    
    this.videoFile = videoFile;
    return this;
  }

   /**
   * 文件数据
   * @return videoFile
  **/
  @javax.annotation.Nullable
  public File getVideoFile() {
    return videoFile;
  }


  public void setVideoFile(File videoFile) {
    this.videoFile = videoFile;
  }


  public FileVideoAgentV2Request videoSignature(String videoSignature) {
    
    this.videoSignature = videoSignature;
    return this;
  }

   /**
   * 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填
   * @return videoSignature
  **/
  @javax.annotation.Nullable
  public String getVideoSignature() {
    return videoSignature;
  }


  public void setVideoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
  }


  public FileVideoAgentV2Request videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频URL地址，upload_type为UPLOAD_BY_URL必传 只支持连山tos地址
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoAgentV2Request fileVideoAgentV2Request = (FileVideoAgentV2Request) o;
    return Objects.equals(this.agentId, fileVideoAgentV2Request.agentId) &&
        Objects.equals(this.fileName, fileVideoAgentV2Request.fileName) &&
        Objects.equals(this.isAigc, fileVideoAgentV2Request.isAigc) &&
        Objects.equals(this.isNeedAuth, fileVideoAgentV2Request.isNeedAuth) &&
        Objects.equals(this.uploadType, fileVideoAgentV2Request.uploadType) &&
        Objects.equals(this.videoFile, fileVideoAgentV2Request.videoFile) &&
        Objects.equals(this.videoSignature, fileVideoAgentV2Request.videoSignature) &&
        Objects.equals(this.videoUrl, fileVideoAgentV2Request.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, fileName, isAigc, isNeedAuth, uploadType, videoFile, videoSignature, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoAgentV2Request {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    isAigc: ").append(toIndentedString(isAigc)).append("\n");
    sb.append("    isNeedAuth: ").append(toIndentedString(isNeedAuth)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
    sb.append("    videoFile: ").append(toIndentedString(videoFile)).append("\n");
    sb.append("    videoSignature: ").append(toIndentedString(videoSignature)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("file_name");
    openapiFields.add("is_aigc");
    openapiFields.add("is_need_auth");
    openapiFields.add("upload_type");
    openapiFields.add("video_file");
    openapiFields.add("video_signature");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("file_name");
    openapiRequiredFields.add("is_need_auth");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoAgentV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoAgentV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoAgentV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoAgentV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoAgentV2Request>() {
           @Override
           public void write(JsonWriter out, FileVideoAgentV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoAgentV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoAgentV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoAgentV2Request
  * @throws IOException if the JSON string is invalid with respect to FileVideoAgentV2Request
  */
  public static FileVideoAgentV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoAgentV2Request.class);
  }

 /**
  * Convert an instance of FileVideoAgentV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

