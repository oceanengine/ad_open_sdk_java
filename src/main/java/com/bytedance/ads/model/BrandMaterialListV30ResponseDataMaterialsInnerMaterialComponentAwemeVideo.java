/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideoVideo;
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
 * 视频组件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private String awemeItemId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_SOURCE = "aweme_item_source";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_SOURCE)
  private Long awemeItemSource = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideoVideo video = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo awemeItemId(String awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 抖音视频ID
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public String getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(String awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo awemeItemSource(Long awemeItemSource) {
    
    this.awemeItemSource = awemeItemSource;
    return this;
  }

   /**
   * 是否塞物料 1为取物料（拉取抖音主页视频） 0为塞物料（上传视频）
   * @return awemeItemSource
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemSource() {
    return awemeItemSource;
  }


  public void setAwemeItemSource(Long awemeItemSource) {
    this.awemeItemSource = awemeItemSource;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 视频标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo video(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideoVideo video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideoVideo getVideo() {
    return video;
  }


  public void setVideo(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideoVideo video) {
    this.video = video;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo) o;
    return Objects.equals(this.awemeItemId, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo.awemeItemId) &&
        Objects.equals(this.awemeItemSource, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo.awemeItemSource) &&
        Objects.equals(this.title, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo.title) &&
        Objects.equals(this.video, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo.video);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, awemeItemSource, title, video);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    awemeItemSource: ").append(toIndentedString(awemeItemSource)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("aweme_item_source");
    openapiFields.add("title");
    openapiFields.add("video");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentAwemeVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

