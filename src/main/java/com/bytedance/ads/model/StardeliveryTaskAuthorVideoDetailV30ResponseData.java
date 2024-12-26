/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30ResponseDataCursorInfo;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StardeliveryTaskAuthorVideoDetailV30ResponseData {
  public static final String SERIALIZED_NAME_CURSOR_INFO = "cursor_info";
  @SerializedName(SERIALIZED_NAME_CURSOR_INFO)
  private StardeliveryTaskAuthorVideoDetailV30ResponseDataCursorInfo cursorInfo = null;

  public static final String SERIALIZED_NAME_VALID_AUTHOR_SUBMITTED_VIDEOS = "valid_author_submitted_videos";
  @SerializedName(SERIALIZED_NAME_VALID_AUTHOR_SUBMITTED_VIDEOS)
  private List<StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner> validAuthorSubmittedVideos = null;

  public StardeliveryTaskAuthorVideoDetailV30ResponseData() {
  }

  public StardeliveryTaskAuthorVideoDetailV30ResponseData cursorInfo(StardeliveryTaskAuthorVideoDetailV30ResponseDataCursorInfo cursorInfo) {
    
    this.cursorInfo = cursorInfo;
    return this;
  }

   /**
   * Get cursorInfo
   * @return cursorInfo
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskAuthorVideoDetailV30ResponseDataCursorInfo getCursorInfo() {
    return cursorInfo;
  }


  public void setCursorInfo(StardeliveryTaskAuthorVideoDetailV30ResponseDataCursorInfo cursorInfo) {
    this.cursorInfo = cursorInfo;
  }


  public StardeliveryTaskAuthorVideoDetailV30ResponseData validAuthorSubmittedVideos(List<StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner> validAuthorSubmittedVideos) {
    
    this.validAuthorSubmittedVideos = validAuthorSubmittedVideos;
    return this;
  }

  public StardeliveryTaskAuthorVideoDetailV30ResponseData addValidAuthorSubmittedVideosItem(StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner validAuthorSubmittedVideosItem) {
    if (this.validAuthorSubmittedVideos == null) {
      this.validAuthorSubmittedVideos = new ArrayList<>();
    }
    this.validAuthorSubmittedVideos.add(validAuthorSubmittedVideosItem);
    return this;
  }

   /**
   * 
   * @return validAuthorSubmittedVideos
  **/
  @javax.annotation.Nullable
  public List<StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner> getValidAuthorSubmittedVideos() {
    return validAuthorSubmittedVideos;
  }


  public void setValidAuthorSubmittedVideos(List<StardeliveryTaskAuthorVideoDetailV30ResponseDataValidAuthorSubmittedVideosInner> validAuthorSubmittedVideos) {
    this.validAuthorSubmittedVideos = validAuthorSubmittedVideos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskAuthorVideoDetailV30ResponseData stardeliveryTaskAuthorVideoDetailV30ResponseData = (StardeliveryTaskAuthorVideoDetailV30ResponseData) o;
    return Objects.equals(this.cursorInfo, stardeliveryTaskAuthorVideoDetailV30ResponseData.cursorInfo) &&
        Objects.equals(this.validAuthorSubmittedVideos, stardeliveryTaskAuthorVideoDetailV30ResponseData.validAuthorSubmittedVideos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorInfo, validAuthorSubmittedVideos);
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
    sb.append("class StardeliveryTaskAuthorVideoDetailV30ResponseData {\n");
    sb.append("    cursorInfo: ").append(toIndentedString(cursorInfo)).append("\n");
    sb.append("    validAuthorSubmittedVideos: ").append(toIndentedString(validAuthorSubmittedVideos)).append("\n");
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
    openapiFields.add("cursor_info");
    openapiFields.add("valid_author_submitted_videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskAuthorVideoDetailV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskAuthorVideoDetailV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskAuthorVideoDetailV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskAuthorVideoDetailV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskAuthorVideoDetailV30ResponseData>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskAuthorVideoDetailV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskAuthorVideoDetailV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskAuthorVideoDetailV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskAuthorVideoDetailV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskAuthorVideoDetailV30ResponseData
  */
  public static StardeliveryTaskAuthorVideoDetailV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskAuthorVideoDetailV30ResponseData.class);
  }

 /**
  * Convert an instance of StardeliveryTaskAuthorVideoDetailV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

