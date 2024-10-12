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
 * 视频文件 允许格式：mp4、mpeg、3gp、avi（10s超时限制） 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class LocalFileVideoUploadV30RequestVideoFile {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private File data = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public LocalFileVideoUploadV30RequestVideoFile() {
  }

  public LocalFileVideoUploadV30RequestVideoFile data(File data) {
    
    this.data = data;
    return this;
  }

   /**
   * 
   * @return data
  **/
  @javax.annotation.Nonnull
  public File getData() {
    return data;
  }


  public void setData(File data) {
    this.data = data;
  }


  public LocalFileVideoUploadV30RequestVideoFile fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 
   * @return fileName
  **/
  @javax.annotation.Nonnull
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalFileVideoUploadV30RequestVideoFile localFileVideoUploadV30RequestVideoFile = (LocalFileVideoUploadV30RequestVideoFile) o;
    return Objects.equals(this.data, localFileVideoUploadV30RequestVideoFile.data) &&
        Objects.equals(this.fileName, localFileVideoUploadV30RequestVideoFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalFileVideoUploadV30RequestVideoFile {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("file_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("file_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoUploadV30RequestVideoFile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoUploadV30RequestVideoFile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoUploadV30RequestVideoFile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoUploadV30RequestVideoFile.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoUploadV30RequestVideoFile>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoUploadV30RequestVideoFile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoUploadV30RequestVideoFile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoUploadV30RequestVideoFile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoUploadV30RequestVideoFile
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoUploadV30RequestVideoFile
  */
  public static LocalFileVideoUploadV30RequestVideoFile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoUploadV30RequestVideoFile.class);
  }

 /**
  * Convert an instance of LocalFileVideoUploadV30RequestVideoFile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
