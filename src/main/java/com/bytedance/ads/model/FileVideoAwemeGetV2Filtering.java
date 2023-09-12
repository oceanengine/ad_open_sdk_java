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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class FileVideoAwemeGetV2Filtering {
  public static final String SERIALIZED_NAME_AWEME_URL = "aweme_url";
  @SerializedName(SERIALIZED_NAME_AWEME_URL)
  private String awemeUrl = null;

  public FileVideoAwemeGetV2Filtering() {
  }

  public FileVideoAwemeGetV2Filtering awemeUrl(String awemeUrl) {
    
    this.awemeUrl = awemeUrl;
    return this;
  }

   /**
   * 抖音视频链接
   * @return awemeUrl
  **/
  @javax.annotation.Nullable
  public String getAwemeUrl() {
    return awemeUrl;
  }


  public void setAwemeUrl(String awemeUrl) {
    this.awemeUrl = awemeUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoAwemeGetV2Filtering fileVideoAwemeGetV2Filtering = (FileVideoAwemeGetV2Filtering) o;
    return Objects.equals(this.awemeUrl, fileVideoAwemeGetV2Filtering.awemeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoAwemeGetV2Filtering {\n");
    sb.append("    awemeUrl: ").append(toIndentedString(awemeUrl)).append("\n");
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
    openapiFields.add("aweme_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoAwemeGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoAwemeGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoAwemeGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoAwemeGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoAwemeGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, FileVideoAwemeGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoAwemeGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoAwemeGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoAwemeGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to FileVideoAwemeGetV2Filtering
  */
  public static FileVideoAwemeGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoAwemeGetV2Filtering.class);
  }

 /**
  * Convert an instance of FileVideoAwemeGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

