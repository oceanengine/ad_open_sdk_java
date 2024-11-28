/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class FileAudioAdV2ResponseDataAudioInfo {
  public static final String SERIALIZED_NAME_AUDIO_ID = "audio_id";
  @SerializedName(SERIALIZED_NAME_AUDIO_ID)
  private String audioId = null;

  public static final String SERIALIZED_NAME_AUDIO_SIGNATURE = "audio_signature";
  @SerializedName(SERIALIZED_NAME_AUDIO_SIGNATURE)
  private String audioSignature = null;

  public static final String SERIALIZED_NAME_AUDIO_URL = "audio_url";
  @SerializedName(SERIALIZED_NAME_AUDIO_URL)
  private String audioUrl = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public FileAudioAdV2ResponseDataAudioInfo() {
  }

  public FileAudioAdV2ResponseDataAudioInfo audioId(String audioId) {
    
    this.audioId = audioId;
    return this;
  }

   /**
   * 
   * @return audioId
  **/
  @javax.annotation.Nullable
  public String getAudioId() {
    return audioId;
  }


  public void setAudioId(String audioId) {
    this.audioId = audioId;
  }


  public FileAudioAdV2ResponseDataAudioInfo audioSignature(String audioSignature) {
    
    this.audioSignature = audioSignature;
    return this;
  }

   /**
   * 
   * @return audioSignature
  **/
  @javax.annotation.Nullable
  public String getAudioSignature() {
    return audioSignature;
  }


  public void setAudioSignature(String audioSignature) {
    this.audioSignature = audioSignature;
  }


  public FileAudioAdV2ResponseDataAudioInfo audioUrl(String audioUrl) {
    
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * 
   * @return audioUrl
  **/
  @javax.annotation.Nullable
  public String getAudioUrl() {
    return audioUrl;
  }


  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }


  public FileAudioAdV2ResponseDataAudioInfo materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAudioAdV2ResponseDataAudioInfo fileAudioAdV2ResponseDataAudioInfo = (FileAudioAdV2ResponseDataAudioInfo) o;
    return Objects.equals(this.audioId, fileAudioAdV2ResponseDataAudioInfo.audioId) &&
        Objects.equals(this.audioSignature, fileAudioAdV2ResponseDataAudioInfo.audioSignature) &&
        Objects.equals(this.audioUrl, fileAudioAdV2ResponseDataAudioInfo.audioUrl) &&
        Objects.equals(this.materialId, fileAudioAdV2ResponseDataAudioInfo.materialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioId, audioSignature, audioUrl, materialId);
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
    sb.append("class FileAudioAdV2ResponseDataAudioInfo {\n");
    sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
    sb.append("    audioSignature: ").append(toIndentedString(audioSignature)).append("\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("audio_signature");
    openapiFields.add("audio_url");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileAudioAdV2ResponseDataAudioInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileAudioAdV2ResponseDataAudioInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileAudioAdV2ResponseDataAudioInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileAudioAdV2ResponseDataAudioInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<FileAudioAdV2ResponseDataAudioInfo>() {
           @Override
           public void write(JsonWriter out, FileAudioAdV2ResponseDataAudioInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileAudioAdV2ResponseDataAudioInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileAudioAdV2ResponseDataAudioInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileAudioAdV2ResponseDataAudioInfo
  * @throws IOException if the JSON string is invalid with respect to FileAudioAdV2ResponseDataAudioInfo
  */
  public static FileAudioAdV2ResponseDataAudioInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileAudioAdV2ResponseDataAudioInfo.class);
  }

 /**
  * Convert an instance of FileAudioAdV2ResponseDataAudioInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

