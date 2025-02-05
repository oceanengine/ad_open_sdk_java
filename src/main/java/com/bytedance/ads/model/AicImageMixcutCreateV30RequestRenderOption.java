/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AicImageMixcutCreateV30RenderOptionTargetRadio;
import com.bytedance.ads.model.AicImageMixcutCreateV30RenderOptionVideoDuration;
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
 * 生成视频渲染设置，不传入时使用默认值
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class AicImageMixcutCreateV30RequestRenderOption {
  public static final String SERIALIZED_NAME_TARGET_RADIO = "target_radio";
  @SerializedName(SERIALIZED_NAME_TARGET_RADIO)
  private AicImageMixcutCreateV30RenderOptionTargetRadio targetRadio = null;

  public static final String SERIALIZED_NAME_VIDEO_DURATION = "video_duration";
  @SerializedName(SERIALIZED_NAME_VIDEO_DURATION)
  private AicImageMixcutCreateV30RenderOptionVideoDuration videoDuration = null;

  public AicImageMixcutCreateV30RequestRenderOption() {
  }

  public AicImageMixcutCreateV30RequestRenderOption targetRadio(AicImageMixcutCreateV30RenderOptionTargetRadio targetRadio) {
    
    this.targetRadio = targetRadio;
    return this;
  }

   /**
   * Get targetRadio
   * @return targetRadio
  **/
  @javax.annotation.Nullable
  public AicImageMixcutCreateV30RenderOptionTargetRadio getTargetRadio() {
    return targetRadio;
  }


  public void setTargetRadio(AicImageMixcutCreateV30RenderOptionTargetRadio targetRadio) {
    this.targetRadio = targetRadio;
  }


  public AicImageMixcutCreateV30RequestRenderOption videoDuration(AicImageMixcutCreateV30RenderOptionVideoDuration videoDuration) {
    
    this.videoDuration = videoDuration;
    return this;
  }

   /**
   * Get videoDuration
   * @return videoDuration
  **/
  @javax.annotation.Nullable
  public AicImageMixcutCreateV30RenderOptionVideoDuration getVideoDuration() {
    return videoDuration;
  }


  public void setVideoDuration(AicImageMixcutCreateV30RenderOptionVideoDuration videoDuration) {
    this.videoDuration = videoDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicImageMixcutCreateV30RequestRenderOption aicImageMixcutCreateV30RequestRenderOption = (AicImageMixcutCreateV30RequestRenderOption) o;
    return Objects.equals(this.targetRadio, aicImageMixcutCreateV30RequestRenderOption.targetRadio) &&
        Objects.equals(this.videoDuration, aicImageMixcutCreateV30RequestRenderOption.videoDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetRadio, videoDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicImageMixcutCreateV30RequestRenderOption {\n");
    sb.append("    targetRadio: ").append(toIndentedString(targetRadio)).append("\n");
    sb.append("    videoDuration: ").append(toIndentedString(videoDuration)).append("\n");
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
    openapiFields.add("target_radio");
    openapiFields.add("video_duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicImageMixcutCreateV30RequestRenderOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicImageMixcutCreateV30RequestRenderOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicImageMixcutCreateV30RequestRenderOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicImageMixcutCreateV30RequestRenderOption.class));

       return (TypeAdapter<T>) new TypeAdapter<AicImageMixcutCreateV30RequestRenderOption>() {
           @Override
           public void write(JsonWriter out, AicImageMixcutCreateV30RequestRenderOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicImageMixcutCreateV30RequestRenderOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicImageMixcutCreateV30RequestRenderOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicImageMixcutCreateV30RequestRenderOption
  * @throws IOException if the JSON string is invalid with respect to AicImageMixcutCreateV30RequestRenderOption
  */
  public static AicImageMixcutCreateV30RequestRenderOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicImageMixcutCreateV30RequestRenderOption.class);
  }

 /**
  * Convert an instance of AicImageMixcutCreateV30RequestRenderOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

