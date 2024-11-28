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
import com.bytedance.ads.model.DouplusOptionalItemsListV30ResponseDataCursorInfo;
import com.bytedance.ads.model.DouplusOptionalItemsListV30ResponseDataVideoListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class DouplusOptionalItemsListV30ResponseData {
  public static final String SERIALIZED_NAME_CURSOR_INFO = "cursor_info";
  @SerializedName(SERIALIZED_NAME_CURSOR_INFO)
  private DouplusOptionalItemsListV30ResponseDataCursorInfo cursorInfo = null;

  public static final String SERIALIZED_NAME_VIDEO_LIST = "video_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_LIST)
  private List<DouplusOptionalItemsListV30ResponseDataVideoListInner> videoList = null;

  public DouplusOptionalItemsListV30ResponseData() {
  }

  public DouplusOptionalItemsListV30ResponseData cursorInfo(DouplusOptionalItemsListV30ResponseDataCursorInfo cursorInfo) {
    
    this.cursorInfo = cursorInfo;
    return this;
  }

   /**
   * Get cursorInfo
   * @return cursorInfo
  **/
  @javax.annotation.Nullable
  public DouplusOptionalItemsListV30ResponseDataCursorInfo getCursorInfo() {
    return cursorInfo;
  }


  public void setCursorInfo(DouplusOptionalItemsListV30ResponseDataCursorInfo cursorInfo) {
    this.cursorInfo = cursorInfo;
  }


  public DouplusOptionalItemsListV30ResponseData videoList(List<DouplusOptionalItemsListV30ResponseDataVideoListInner> videoList) {
    
    this.videoList = videoList;
    return this;
  }

  public DouplusOptionalItemsListV30ResponseData addVideoListItem(DouplusOptionalItemsListV30ResponseDataVideoListInner videoListItem) {
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
  public List<DouplusOptionalItemsListV30ResponseDataVideoListInner> getVideoList() {
    return videoList;
  }


  public void setVideoList(List<DouplusOptionalItemsListV30ResponseDataVideoListInner> videoList) {
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
    DouplusOptionalItemsListV30ResponseData douplusOptionalItemsListV30ResponseData = (DouplusOptionalItemsListV30ResponseData) o;
    return Objects.equals(this.cursorInfo, douplusOptionalItemsListV30ResponseData.cursorInfo) &&
        Objects.equals(this.videoList, douplusOptionalItemsListV30ResponseData.videoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorInfo, videoList);
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
    sb.append("class DouplusOptionalItemsListV30ResponseData {\n");
    sb.append("    cursorInfo: ").append(toIndentedString(cursorInfo)).append("\n");
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
    openapiFields.add("cursor_info");
    openapiFields.add("video_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOptionalItemsListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOptionalItemsListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOptionalItemsListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOptionalItemsListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOptionalItemsListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, DouplusOptionalItemsListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOptionalItemsListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOptionalItemsListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOptionalItemsListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to DouplusOptionalItemsListV30ResponseData
  */
  public static DouplusOptionalItemsListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOptionalItemsListV30ResponseData.class);
  }

 /**
  * Convert an instance of DouplusOptionalItemsListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

