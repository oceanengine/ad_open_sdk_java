/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileVideoUpdateV2ResponseDataVideosInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class FileVideoUpdateV2ResponseData {
  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<FileVideoUpdateV2ResponseDataVideosInner> videos = null;

  public FileVideoUpdateV2ResponseData() {
  }

  public FileVideoUpdateV2ResponseData videos(List<FileVideoUpdateV2ResponseDataVideosInner> videos) {
    
    this.videos = videos;
    return this;
  }

  public FileVideoUpdateV2ResponseData addVideosItem(FileVideoUpdateV2ResponseDataVideosInner videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * 
   * @return videos
  **/
  @javax.annotation.Nullable
  public List<FileVideoUpdateV2ResponseDataVideosInner> getVideos() {
    return videos;
  }


  public void setVideos(List<FileVideoUpdateV2ResponseDataVideosInner> videos) {
    this.videos = videos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoUpdateV2ResponseData fileVideoUpdateV2ResponseData = (FileVideoUpdateV2ResponseData) o;
    return Objects.equals(this.videos, fileVideoUpdateV2ResponseData.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoUpdateV2ResponseData {\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoUpdateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoUpdateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoUpdateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoUpdateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoUpdateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileVideoUpdateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoUpdateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoUpdateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoUpdateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileVideoUpdateV2ResponseData
  */
  public static FileVideoUpdateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoUpdateV2ResponseData.class);
  }

 /**
  * Convert an instance of FileVideoUpdateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

