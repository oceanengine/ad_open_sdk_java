/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger {
  public static final String SERIALIZED_NAME_TOUCH_SECONDS = "touch_seconds";
  @SerializedName(SERIALIZED_NAME_TOUCH_SECONDS)
  private Long touchSeconds = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger() {
  }

  public ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger touchSeconds(Long touchSeconds) {
    
    this.touchSeconds = touchSeconds;
    return this;
  }

   /**
   * 
   * @return touchSeconds
  **/
  @javax.annotation.Nullable
  public Long getTouchSeconds() {
    return touchSeconds;
  }


  public void setTouchSeconds(Long touchSeconds) {
    this.touchSeconds = touchSeconds;
  }


  public ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger toolsSiteCreateV2RequestBricksInnerEventsInnerTrigger = (ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger) o;
    return Objects.equals(this.touchSeconds, toolsSiteCreateV2RequestBricksInnerEventsInnerTrigger.touchSeconds) &&
        Objects.equals(this.type, toolsSiteCreateV2RequestBricksInnerEventsInnerTrigger.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(touchSeconds, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger {\n");
    sb.append("    touchSeconds: ").append(toIndentedString(touchSeconds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("touch_seconds");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger
  */
  public static ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger.class);
  }

 /**
  * Convert an instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerTrigger to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

