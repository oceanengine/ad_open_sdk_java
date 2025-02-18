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
 * EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner() {
  }

  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 建议
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 明细信息链接
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner eventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner = (EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner) o;
    return Objects.equals(this.message, eventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner.message) &&
        Objects.equals(this.url, eventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, url);
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
    sb.append("class EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner>() {
           @Override
           public void write(JsonWriter out, EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner
  */
  public static EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner.class);
  }

 /**
  * Convert an instance of EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInnerSuggestionInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

