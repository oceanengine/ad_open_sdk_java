/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalFileVideoGetV30ResponseDataPageInfo;
import com.bytedance.ads.model.LocalFileVideoGetV30ResponseDataVideoListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class LocalFileVideoGetV30ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private LocalFileVideoGetV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_VIDEO_LIST = "video_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_LIST)
  private List<LocalFileVideoGetV30ResponseDataVideoListInner> videoList = null;

  public LocalFileVideoGetV30ResponseData() {
  }

  public LocalFileVideoGetV30ResponseData pageInfo(LocalFileVideoGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public LocalFileVideoGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(LocalFileVideoGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public LocalFileVideoGetV30ResponseData videoList(List<LocalFileVideoGetV30ResponseDataVideoListInner> videoList) {
    
    this.videoList = videoList;
    return this;
  }

  public LocalFileVideoGetV30ResponseData addVideoListItem(LocalFileVideoGetV30ResponseDataVideoListInner videoListItem) {
    if (this.videoList == null) {
      this.videoList = new ArrayList<>();
    }
    this.videoList.add(videoListItem);
    return this;
  }

   /**
   * 
   * @return videoList
  **/
  @javax.annotation.Nullable
  public List<LocalFileVideoGetV30ResponseDataVideoListInner> getVideoList() {
    return videoList;
  }


  public void setVideoList(List<LocalFileVideoGetV30ResponseDataVideoListInner> videoList) {
    this.videoList = videoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalFileVideoGetV30ResponseData localFileVideoGetV30ResponseData = (LocalFileVideoGetV30ResponseData) o;
    return Objects.equals(this.pageInfo, localFileVideoGetV30ResponseData.pageInfo) &&
        Objects.equals(this.videoList, localFileVideoGetV30ResponseData.videoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, videoList);
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
    sb.append("class LocalFileVideoGetV30ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    videoList: ").append(toIndentedString(videoList)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("video_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoGetV30ResponseData
  */
  public static LocalFileVideoGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoGetV30ResponseData.class);
  }

 /**
  * Convert an instance of LocalFileVideoGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

