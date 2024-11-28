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
public class ToolsSiteCreateV2RequestBricksInnerLocalSource {
  public static final String SERIALIZED_NAME_POSTER = "poster";
  @SerializedName(SERIALIZED_NAME_POSTER)
  private String poster = null;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private String vid = null;

  public ToolsSiteCreateV2RequestBricksInnerLocalSource() {
  }

  public ToolsSiteCreateV2RequestBricksInnerLocalSource poster(String poster) {
    
    this.poster = poster;
    return this;
  }

   /**
   * 
   * @return poster
  **/
  @javax.annotation.Nullable
  public String getPoster() {
    return poster;
  }


  public void setPoster(String poster) {
    this.poster = poster;
  }


  public ToolsSiteCreateV2RequestBricksInnerLocalSource vid(String vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 
   * @return vid
  **/
  @javax.annotation.Nullable
  public String getVid() {
    return vid;
  }


  public void setVid(String vid) {
    this.vid = vid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteCreateV2RequestBricksInnerLocalSource toolsSiteCreateV2RequestBricksInnerLocalSource = (ToolsSiteCreateV2RequestBricksInnerLocalSource) o;
    return Objects.equals(this.poster, toolsSiteCreateV2RequestBricksInnerLocalSource.poster) &&
        Objects.equals(this.vid, toolsSiteCreateV2RequestBricksInnerLocalSource.vid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poster, vid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteCreateV2RequestBricksInnerLocalSource {\n");
    sb.append("    poster: ").append(toIndentedString(poster)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
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
    openapiFields.add("poster");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCreateV2RequestBricksInnerLocalSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCreateV2RequestBricksInnerLocalSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCreateV2RequestBricksInnerLocalSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCreateV2RequestBricksInnerLocalSource.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCreateV2RequestBricksInnerLocalSource>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCreateV2RequestBricksInnerLocalSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCreateV2RequestBricksInnerLocalSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCreateV2RequestBricksInnerLocalSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCreateV2RequestBricksInnerLocalSource
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCreateV2RequestBricksInnerLocalSource
  */
  public static ToolsSiteCreateV2RequestBricksInnerLocalSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCreateV2RequestBricksInnerLocalSource.class);
  }

 /**
  * Convert an instance of ToolsSiteCreateV2RequestBricksInnerLocalSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

