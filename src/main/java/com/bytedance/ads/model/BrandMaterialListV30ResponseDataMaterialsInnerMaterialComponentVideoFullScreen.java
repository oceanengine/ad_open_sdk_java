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
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenImageInfoBkListInner;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner;
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
 * 全屏-视频
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen {
  public static final String SERIALIZED_NAME_IMAGE_INFO_BK_LIST = "image_info_bk_list";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO_BK_LIST)
  private List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenImageInfoBkListInner> imageInfoBkList = null;

  public static final String SERIALIZED_NAME_VIDEO_LIST = "video_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_LIST)
  private List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner> videoList = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen imageInfoBkList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenImageInfoBkListInner> imageInfoBkList) {
    
    this.imageInfoBkList = imageInfoBkList;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen addImageInfoBkListItem(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenImageInfoBkListInner imageInfoBkListItem) {
    if (this.imageInfoBkList == null) {
      this.imageInfoBkList = new ArrayList<>();
    }
    this.imageInfoBkList.add(imageInfoBkListItem);
    return this;
  }

   /**
   * 背景图
   * @return imageInfoBkList
  **/
  @javax.annotation.Nullable
  public List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenImageInfoBkListInner> getImageInfoBkList() {
    return imageInfoBkList;
  }


  public void setImageInfoBkList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenImageInfoBkListInner> imageInfoBkList) {
    this.imageInfoBkList = imageInfoBkList;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen videoList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner> videoList) {
    
    this.videoList = videoList;
    return this;
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen addVideoListItem(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner videoListItem) {
    if (this.videoList == null) {
      this.videoList = new ArrayList<>();
    }
    this.videoList.add(videoListItem);
    return this;
  }

   /**
   * 视频信息
   * @return videoList
  **/
  @javax.annotation.Nullable
  public List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner> getVideoList() {
    return videoList;
  }


  public void setVideoList(List<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreenVideoListInner> videoList) {
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
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen) o;
    return Objects.equals(this.imageInfoBkList, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen.imageInfoBkList) &&
        Objects.equals(this.videoList, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen.videoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfoBkList, videoList);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen {\n");
    sb.append("    imageInfoBkList: ").append(toIndentedString(imageInfoBkList)).append("\n");
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
    openapiFields.add("image_info_bk_list");
    openapiFields.add("video_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentVideoFullScreen to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

