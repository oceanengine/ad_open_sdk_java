/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class CarouselListV2ResponseDataCarouselsInnerAudio {
  public static final String SERIALIZED_NAME_AUDIO_ID = "audio_id";
  @SerializedName(SERIALIZED_NAME_AUDIO_ID)
  private String audioId = null;

  public static final String SERIALIZED_NAME_AUDIO_URL = "audio_url";
  @SerializedName(SERIALIZED_NAME_AUDIO_URL)
  private String audioUrl = null;

  public CarouselListV2ResponseDataCarouselsInnerAudio() {
  }

  public CarouselListV2ResponseDataCarouselsInnerAudio audioId(String audioId) {
    
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


  public CarouselListV2ResponseDataCarouselsInnerAudio audioUrl(String audioUrl) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselListV2ResponseDataCarouselsInnerAudio carouselListV2ResponseDataCarouselsInnerAudio = (CarouselListV2ResponseDataCarouselsInnerAudio) o;
    return Objects.equals(this.audioId, carouselListV2ResponseDataCarouselsInnerAudio.audioId) &&
        Objects.equals(this.audioUrl, carouselListV2ResponseDataCarouselsInnerAudio.audioUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioId, audioUrl);
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
    sb.append("class CarouselListV2ResponseDataCarouselsInnerAudio {\n");
    sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
    sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CarouselListV2ResponseDataCarouselsInnerAudio.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CarouselListV2ResponseDataCarouselsInnerAudio' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CarouselListV2ResponseDataCarouselsInnerAudio> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CarouselListV2ResponseDataCarouselsInnerAudio.class));

       return (TypeAdapter<T>) new TypeAdapter<CarouselListV2ResponseDataCarouselsInnerAudio>() {
           @Override
           public void write(JsonWriter out, CarouselListV2ResponseDataCarouselsInnerAudio value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CarouselListV2ResponseDataCarouselsInnerAudio read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CarouselListV2ResponseDataCarouselsInnerAudio given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CarouselListV2ResponseDataCarouselsInnerAudio
  * @throws IOException if the JSON string is invalid with respect to CarouselListV2ResponseDataCarouselsInnerAudio
  */
  public static CarouselListV2ResponseDataCarouselsInnerAudio fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CarouselListV2ResponseDataCarouselsInnerAudio.class);
  }

 /**
  * Convert an instance of CarouselListV2ResponseDataCarouselsInnerAudio to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

