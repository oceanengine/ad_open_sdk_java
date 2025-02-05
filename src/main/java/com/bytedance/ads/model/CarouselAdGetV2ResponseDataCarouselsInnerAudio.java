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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class CarouselAdGetV2ResponseDataCarouselsInnerAudio {
  public static final String SERIALIZED_NAME_AUDIO_ID = "audio_id";
  @SerializedName(SERIALIZED_NAME_AUDIO_ID)
  private String audioId = null;

  public static final String SERIALIZED_NAME_AUDIO_URL = "audio_url";
  @SerializedName(SERIALIZED_NAME_AUDIO_URL)
  private String audioUrl = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public CarouselAdGetV2ResponseDataCarouselsInnerAudio() {
  }

  public CarouselAdGetV2ResponseDataCarouselsInnerAudio audioId(String audioId) {
    
    this.audioId = audioId;
    return this;
  }

   /**
   * 
   * @return audioId
  **/
  @javax.annotation.Nullable
  public String getAudioId() {
    return audioId;
  }


  public void setAudioId(String audioId) {
    this.audioId = audioId;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerAudio audioUrl(String audioUrl) {
    
    this.audioUrl = audioUrl;
    return this;
  }

   /**
   * 
   * @return audioUrl
  **/
  @javax.annotation.Nullable
  public String getAudioUrl() {
    return audioUrl;
  }


  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerAudio url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CarouselAdGetV2ResponseDataCarouselsInnerAudio videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselAdGetV2ResponseDataCarouselsInnerAudio carouselAdGetV2ResponseDataCarouselsInnerAudio = (CarouselAdGetV2ResponseDataCarouselsInnerAudio) o;
    return Objects.equals(this.audioId, carouselAdGetV2ResponseDataCarouselsInnerAudio.audioId) &&
        Objects.equals(this.audioUrl, carouselAdGetV2ResponseDataCarouselsInnerAudio.audioUrl) &&
        Objects.equals(this.url, carouselAdGetV2ResponseDataCarouselsInnerAudio.url) &&
        Objects.equals(this.videoId, carouselAdGetV2ResponseDataCarouselsInnerAudio.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioId, audioUrl, url, videoId);
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
    sb.append("class CarouselAdGetV2ResponseDataCarouselsInnerAudio {\n");
    sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("audio_id");
    openapiFields.add("audio_url");
    openapiFields.add("url");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselAdGetV2ResponseDataCarouselsInnerAudio.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselAdGetV2ResponseDataCarouselsInnerAudio' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselAdGetV2ResponseDataCarouselsInnerAudio> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselAdGetV2ResponseDataCarouselsInnerAudio.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselAdGetV2ResponseDataCarouselsInnerAudio>() {
           @Override
           public void write(JsonWriter out, CarouselAdGetV2ResponseDataCarouselsInnerAudio value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselAdGetV2ResponseDataCarouselsInnerAudio read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselAdGetV2ResponseDataCarouselsInnerAudio given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselAdGetV2ResponseDataCarouselsInnerAudio
  * @throws IOException if the JSON string is invalid with respect to CarouselAdGetV2ResponseDataCarouselsInnerAudio
  */
  public static CarouselAdGetV2ResponseDataCarouselsInnerAudio fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselAdGetV2ResponseDataCarouselsInnerAudio.class);
  }

 /**
  * Convert an instance of CarouselAdGetV2ResponseDataCarouselsInnerAudio to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

