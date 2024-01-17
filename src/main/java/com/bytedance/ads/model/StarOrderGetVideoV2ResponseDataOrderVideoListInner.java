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
import com.bytedance.ads.model.StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner;
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
 * StarOrderGetVideoV2ResponseDataOrderVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class StarOrderGetVideoV2ResponseDataOrderVideoListInner {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_VIDEO_LIST = "video_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_LIST)
  private List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner> videoList = null;

  public StarOrderGetVideoV2ResponseDataOrderVideoListInner() {
  }

  public StarOrderGetVideoV2ResponseDataOrderVideoListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 任务ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderGetVideoV2ResponseDataOrderVideoListInner videoList(List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner> videoList) {
    
    this.videoList = videoList;
    return this;
  }

  public StarOrderGetVideoV2ResponseDataOrderVideoListInner addVideoListItem(StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner videoListItem) {
    if (this.videoList == null) {
      this.videoList = new ArrayList<>();
    }
    this.videoList.add(videoListItem);
    return this;
  }

   /**
   * 视频列表
   * @return videoList
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner> getVideoList() {
    return videoList;
  }


  public void setVideoList(List<StarOrderGetVideoV2ResponseDataOrderVideoListInnerVideoListInner> videoList) {
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
    StarOrderGetVideoV2ResponseDataOrderVideoListInner starOrderGetVideoV2ResponseDataOrderVideoListInner = (StarOrderGetVideoV2ResponseDataOrderVideoListInner) o;
    return Objects.equals(this.orderId, starOrderGetVideoV2ResponseDataOrderVideoListInner.orderId) &&
        Objects.equals(this.videoList, starOrderGetVideoV2ResponseDataOrderVideoListInner.videoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, videoList);
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
    sb.append("class StarOrderGetVideoV2ResponseDataOrderVideoListInner {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("video_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetVideoV2ResponseDataOrderVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetVideoV2ResponseDataOrderVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetVideoV2ResponseDataOrderVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetVideoV2ResponseDataOrderVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetVideoV2ResponseDataOrderVideoListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetVideoV2ResponseDataOrderVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetVideoV2ResponseDataOrderVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetVideoV2ResponseDataOrderVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetVideoV2ResponseDataOrderVideoListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetVideoV2ResponseDataOrderVideoListInner
  */
  public static StarOrderGetVideoV2ResponseDataOrderVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetVideoV2ResponseDataOrderVideoListInner.class);
  }

 /**
  * Convert an instance of StarOrderGetVideoV2ResponseDataOrderVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

