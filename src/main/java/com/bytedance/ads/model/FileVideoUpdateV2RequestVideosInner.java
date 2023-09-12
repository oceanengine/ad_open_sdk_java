/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
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
 * FileVideoUpdateV2RequestVideosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class FileVideoUpdateV2RequestVideosInner {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public FileVideoUpdateV2RequestVideosInner() {
  }

  public FileVideoUpdateV2RequestVideosInner filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public FileVideoUpdateV2RequestVideosInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nonnull
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoUpdateV2RequestVideosInner fileVideoUpdateV2RequestVideosInner = (FileVideoUpdateV2RequestVideosInner) o;
    return Objects.equals(this.filename, fileVideoUpdateV2RequestVideosInner.filename) &&
        Objects.equals(this.videoId, fileVideoUpdateV2RequestVideosInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoUpdateV2RequestVideosInner {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("video_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoUpdateV2RequestVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoUpdateV2RequestVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoUpdateV2RequestVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoUpdateV2RequestVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoUpdateV2RequestVideosInner>() {
           @Override
           public void write(JsonWriter out, FileVideoUpdateV2RequestVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoUpdateV2RequestVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoUpdateV2RequestVideosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoUpdateV2RequestVideosInner
  * @throws IOException if the JSON string is invalid with respect to FileVideoUpdateV2RequestVideosInner
  */
  public static FileVideoUpdateV2RequestVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoUpdateV2RequestVideosInner.class);
  }

 /**
  * Convert an instance of FileVideoUpdateV2RequestVideosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

