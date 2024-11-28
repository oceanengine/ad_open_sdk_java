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
 * 用于生成的元素 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class AicVideoMixcutCreateV30RequestGenElement {
  public static final String SERIALIZED_NAME_BACKGROUND_ELEMENT_ID = "background_element_id";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_ELEMENT_ID)
  private Long backgroundElementId = null;

  public static final String SERIALIZED_NAME_FOREGROUND_ELEMENT_ID = "foreground_element_id";
  @SerializedName(SERIALIZED_NAME_FOREGROUND_ELEMENT_ID)
  private Long foregroundElementId = null;

  public static final String SERIALIZED_NAME_POST_VIDEO_ELEMENT_IDS = "post_video_element_ids";
  @SerializedName(SERIALIZED_NAME_POST_VIDEO_ELEMENT_IDS)
  private List<Long> postVideoElementIds = null;

  public static final String SERIALIZED_NAME_PRE_VIDEO_ELEMENT_IDS = "pre_video_element_ids";
  @SerializedName(SERIALIZED_NAME_PRE_VIDEO_ELEMENT_IDS)
  private List<Long> preVideoElementIds = null;

  public AicVideoMixcutCreateV30RequestGenElement() {
  }

  public AicVideoMixcutCreateV30RequestGenElement backgroundElementId(Long backgroundElementId) {
    
    this.backgroundElementId = backgroundElementId;
    return this;
  }

   /**
   * 视频/图片背景，用于放到视频背后的内容，推荐使用1080p大小图片或者视频，不足部分会用系统默认策略填充
   * @return backgroundElementId
  **/
  @javax.annotation.Nullable
  public Long getBackgroundElementId() {
    return backgroundElementId;
  }


  public void setBackgroundElementId(Long backgroundElementId) {
    this.backgroundElementId = backgroundElementId;
  }


  public AicVideoMixcutCreateV30RequestGenElement foregroundElementId(Long foregroundElementId) {
    
    this.foregroundElementId = foregroundElementId;
    return this;
  }

   /**
   * 视频/图片前景，用于放到视频上层的内容,可用于风险提示图、装饰性包框等，推荐使用1080p大小图片或者视频，不足部分会用系统默认策略填充
   * @return foregroundElementId
  **/
  @javax.annotation.Nullable
  public Long getForegroundElementId() {
    return foregroundElementId;
  }


  public void setForegroundElementId(Long foregroundElementId) {
    this.foregroundElementId = foregroundElementId;
  }


  public AicVideoMixcutCreateV30RequestGenElement postVideoElementIds(List<Long> postVideoElementIds) {
    
    this.postVideoElementIds = postVideoElementIds;
    return this;
  }

  public AicVideoMixcutCreateV30RequestGenElement addPostVideoElementIdsItem(Long postVideoElementIdsItem) {
    if (this.postVideoElementIds == null) {
      this.postVideoElementIds = new ArrayList<>();
    }
    this.postVideoElementIds.add(postVideoElementIdsItem);
    return this;
  }

   /**
   * 视频后贴，会拼接在视频开头； 最多5个，输入多个时，成片随机挑选一个使用
   * @return postVideoElementIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPostVideoElementIds() {
    return postVideoElementIds;
  }


  public void setPostVideoElementIds(List<Long> postVideoElementIds) {
    this.postVideoElementIds = postVideoElementIds;
  }


  public AicVideoMixcutCreateV30RequestGenElement preVideoElementIds(List<Long> preVideoElementIds) {
    
    this.preVideoElementIds = preVideoElementIds;
    return this;
  }

  public AicVideoMixcutCreateV30RequestGenElement addPreVideoElementIdsItem(Long preVideoElementIdsItem) {
    if (this.preVideoElementIds == null) {
      this.preVideoElementIds = new ArrayList<>();
    }
    this.preVideoElementIds.add(preVideoElementIdsItem);
    return this;
  }

   /**
   * 视频前贴，会拼接在视频开头 最多5个，输入多个时，成片随机挑选一个使用
   * @return preVideoElementIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPreVideoElementIds() {
    return preVideoElementIds;
  }


  public void setPreVideoElementIds(List<Long> preVideoElementIds) {
    this.preVideoElementIds = preVideoElementIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicVideoMixcutCreateV30RequestGenElement aicVideoMixcutCreateV30RequestGenElement = (AicVideoMixcutCreateV30RequestGenElement) o;
    return Objects.equals(this.backgroundElementId, aicVideoMixcutCreateV30RequestGenElement.backgroundElementId) &&
        Objects.equals(this.foregroundElementId, aicVideoMixcutCreateV30RequestGenElement.foregroundElementId) &&
        Objects.equals(this.postVideoElementIds, aicVideoMixcutCreateV30RequestGenElement.postVideoElementIds) &&
        Objects.equals(this.preVideoElementIds, aicVideoMixcutCreateV30RequestGenElement.preVideoElementIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundElementId, foregroundElementId, postVideoElementIds, preVideoElementIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicVideoMixcutCreateV30RequestGenElement {\n");
    sb.append("    backgroundElementId: ").append(toIndentedString(backgroundElementId)).append("\n");
    sb.append("    foregroundElementId: ").append(toIndentedString(foregroundElementId)).append("\n");
    sb.append("    postVideoElementIds: ").append(toIndentedString(postVideoElementIds)).append("\n");
    sb.append("    preVideoElementIds: ").append(toIndentedString(preVideoElementIds)).append("\n");
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
    openapiFields.add("background_element_id");
    openapiFields.add("foreground_element_id");
    openapiFields.add("post_video_element_ids");
    openapiFields.add("pre_video_element_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicVideoMixcutCreateV30RequestGenElement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicVideoMixcutCreateV30RequestGenElement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicVideoMixcutCreateV30RequestGenElement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicVideoMixcutCreateV30RequestGenElement.class));

       return (TypeAdapter<T>) new TypeAdapter<AicVideoMixcutCreateV30RequestGenElement>() {
           @Override
           public void write(JsonWriter out, AicVideoMixcutCreateV30RequestGenElement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicVideoMixcutCreateV30RequestGenElement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicVideoMixcutCreateV30RequestGenElement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicVideoMixcutCreateV30RequestGenElement
  * @throws IOException if the JSON string is invalid with respect to AicVideoMixcutCreateV30RequestGenElement
  */
  public static AicVideoMixcutCreateV30RequestGenElement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicVideoMixcutCreateV30RequestGenElement.class);
  }

 /**
  * Convert an instance of AicVideoMixcutCreateV30RequestGenElement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

