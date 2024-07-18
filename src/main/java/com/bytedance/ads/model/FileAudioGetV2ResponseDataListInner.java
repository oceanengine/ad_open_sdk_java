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
import com.bytedance.ads.model.FileAudioGetV2DataListSource;
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
 * FileAudioGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class FileAudioGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIO_ID = "audio_id";
  @SerializedName(SERIALIZED_NAME_AUDIO_ID)
  private String audioId = null;

  public static final String SERIALIZED_NAME_AUDIO_URL = "audio_url";
  @SerializedName(SERIALIZED_NAME_AUDIO_URL)
  private String audioUrl = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private FileAudioGetV2DataListSource source = null;

  public FileAudioGetV2ResponseDataListInner() {
  }

  public FileAudioGetV2ResponseDataListInner audioId(String audioId) {
    
    this.audioId = audioId;
    return this;
  }

   /**
   * 音频id
   * @return audioId
  **/
  @javax.annotation.Nullable
  public String getAudioId() {
    return audioId;
  }


  public void setAudioId(String audioId) {
    this.audioId = audioId;
  }


  public FileAudioGetV2ResponseDataListInner audioUrl(String audioUrl) {
    
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * 音频url
   * @return audioUrl
  **/
  @javax.annotation.Nullable
  public String getAudioUrl() {
    return audioUrl;
  }


  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }


  public FileAudioGetV2ResponseDataListInner duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 音频时长
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public FileAudioGetV2ResponseDataListInner fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 音频文件名称
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public FileAudioGetV2ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 音频素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileAudioGetV2ResponseDataListInner signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * 音频md5值
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public FileAudioGetV2ResponseDataListInner source(FileAudioGetV2DataListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public FileAudioGetV2DataListSource getSource() {
    return source;
  }


  public void setSource(FileAudioGetV2DataListSource source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAudioGetV2ResponseDataListInner fileAudioGetV2ResponseDataListInner = (FileAudioGetV2ResponseDataListInner) o;
    return Objects.equals(this.audioId, fileAudioGetV2ResponseDataListInner.audioId) &&
        Objects.equals(this.audioUrl, fileAudioGetV2ResponseDataListInner.audioUrl) &&
        Objects.equals(this.duration, fileAudioGetV2ResponseDataListInner.duration) &&
        Objects.equals(this.fileName, fileAudioGetV2ResponseDataListInner.fileName) &&
        Objects.equals(this.materialId, fileAudioGetV2ResponseDataListInner.materialId) &&
        Objects.equals(this.signature, fileAudioGetV2ResponseDataListInner.signature) &&
        Objects.equals(this.source, fileAudioGetV2ResponseDataListInner.source);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioId, audioUrl, duration, fileName, materialId, signature, source);
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
    sb.append("class FileAudioGetV2ResponseDataListInner {\n");
    sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("audio_id");
    openapiFields.add("audio_url");
    openapiFields.add("duration");
    openapiFields.add("file_name");
    openapiFields.add("material_id");
    openapiFields.add("signature");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileAudioGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileAudioGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileAudioGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileAudioGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileAudioGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FileAudioGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileAudioGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileAudioGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileAudioGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FileAudioGetV2ResponseDataListInner
  */
  public static FileAudioGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileAudioGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FileAudioGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

