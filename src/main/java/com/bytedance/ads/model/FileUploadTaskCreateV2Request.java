/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileUploadTaskCreateV2AccountType;
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
 * FileUploadTaskCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class FileUploadTaskCreateV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private FileUploadTaskCreateV2AccountType accountType = null;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_IS_AIGC = "is_aigc";
  @SerializedName(SERIALIZED_NAME_IS_AIGC)
  private Boolean isAigc = null;

  public static final String SERIALIZED_NAME_IS_GUIDE_VIDEO = "is_guide_video";
  @SerializedName(SERIALIZED_NAME_IS_GUIDE_VIDEO)
  private Boolean isGuideVideo = null;

  public static final String SERIALIZED_NAME_IS_NEED_AUTH = "is_need_auth";
  @SerializedName(SERIALIZED_NAME_IS_NEED_AUTH)
  private Boolean isNeedAuth = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public FileUploadTaskCreateV2Request() {
  }

  public FileUploadTaskCreateV2Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户ID
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public FileUploadTaskCreateV2Request accountType(FileUploadTaskCreateV2AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public FileUploadTaskCreateV2AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(FileUploadTaskCreateV2AccountType accountType) {
    this.accountType = accountType;
  }


  public FileUploadTaskCreateV2Request filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 素材的文件名
   * @return filename
  **/
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public FileUploadTaskCreateV2Request isAigc(Boolean isAigc) {
    
    this.isAigc = isAigc;
    return this;
  }

   /**
   * 视频素材是否为AIGC生成
   * @return isAigc
  **/
  @javax.annotation.Nullable
  public Boolean getIsAigc() {
    return isAigc;
  }


  public void setIsAigc(Boolean isAigc) {
    this.isAigc = isAigc;
  }


  public FileUploadTaskCreateV2Request isGuideVideo(Boolean isGuideVideo) {
    
    this.isGuideVideo = isGuideVideo;
    return this;
  }

   /**
   * 上传视频场景是否是引导视频（此功能仅游戏行业白名单客户可用，如需使用请联系运营） 允许值：FALSE，TRUE
   * @return isGuideVideo
  **/
  @javax.annotation.Nullable
  public Boolean getIsGuideVideo() {
    return isGuideVideo;
  }


  public void setIsGuideVideo(Boolean isGuideVideo) {
    this.isGuideVideo = isGuideVideo;
  }


  public FileUploadTaskCreateV2Request isNeedAuth(Boolean isNeedAuth) {
    
    this.isNeedAuth = isNeedAuth;
    return this;
  }

   /**
   * 标注是否允许生效授权保护（前提素材需要是自产！！） 目前只支持true   当account_type&#x3D; AGTENT时，必填
   * @return isNeedAuth
  **/
  @javax.annotation.Nullable
  public Boolean getIsNeedAuth() {
    return isNeedAuth;
  }


  public void setIsNeedAuth(Boolean isNeedAuth) {
    this.isNeedAuth = isNeedAuth;
  }


  public FileUploadTaskCreateV2Request labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public FileUploadTaskCreateV2Request addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * 标签
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public FileUploadTaskCreateV2Request videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频 url地址，如http://xxx.xxx
   * @return videoUrl
  **/
  @javax.annotation.Nonnull
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
    FileUploadTaskCreateV2Request fileUploadTaskCreateV2Request = (FileUploadTaskCreateV2Request) o;
    return Objects.equals(this.accountId, fileUploadTaskCreateV2Request.accountId) &&
        Objects.equals(this.accountType, fileUploadTaskCreateV2Request.accountType) &&
        Objects.equals(this.filename, fileUploadTaskCreateV2Request.filename) &&
        Objects.equals(this.isAigc, fileUploadTaskCreateV2Request.isAigc) &&
        Objects.equals(this.isGuideVideo, fileUploadTaskCreateV2Request.isGuideVideo) &&
        Objects.equals(this.isNeedAuth, fileUploadTaskCreateV2Request.isNeedAuth) &&
        Objects.equals(this.labels, fileUploadTaskCreateV2Request.labels) &&
        Objects.equals(this.videoUrl, fileUploadTaskCreateV2Request.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, filename, isAigc, isGuideVideo, isNeedAuth, labels, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadTaskCreateV2Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    isAigc: ").append(toIndentedString(isAigc)).append("\n");
    sb.append("    isGuideVideo: ").append(toIndentedString(isGuideVideo)).append("\n");
    sb.append("    isNeedAuth: ").append(toIndentedString(isNeedAuth)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("filename");
    openapiFields.add("is_aigc");
    openapiFields.add("is_guide_video");
    openapiFields.add("is_need_auth");
    openapiFields.add("labels");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("video_url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileUploadTaskCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileUploadTaskCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileUploadTaskCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileUploadTaskCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileUploadTaskCreateV2Request>() {
           @Override
           public void write(JsonWriter out, FileUploadTaskCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileUploadTaskCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileUploadTaskCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileUploadTaskCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to FileUploadTaskCreateV2Request
  */
  public static FileUploadTaskCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileUploadTaskCreateV2Request.class);
  }

 /**
  * Convert an instance of FileUploadTaskCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

