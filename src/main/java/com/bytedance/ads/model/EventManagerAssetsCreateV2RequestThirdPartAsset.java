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
 * 三方落地页资产信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class EventManagerAssetsCreateV2RequestThirdPartAsset {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public EventManagerAssetsCreateV2RequestThirdPartAsset() {
  }

  public EventManagerAssetsCreateV2RequestThirdPartAsset description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 落地页描述信息，长度限制为&#x60;150&#x60;，一个字符长度为1
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EventManagerAssetsCreateV2RequestThirdPartAsset name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 落地页名称，长度限制为&#x60;25&#x60;，一个字符长度为1
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAssetsCreateV2RequestThirdPartAsset eventManagerAssetsCreateV2RequestThirdPartAsset = (EventManagerAssetsCreateV2RequestThirdPartAsset) o;
    return Objects.equals(this.description, eventManagerAssetsCreateV2RequestThirdPartAsset.description) &&
        Objects.equals(this.name, eventManagerAssetsCreateV2RequestThirdPartAsset.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerAssetsCreateV2RequestThirdPartAsset {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAssetsCreateV2RequestThirdPartAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAssetsCreateV2RequestThirdPartAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAssetsCreateV2RequestThirdPartAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAssetsCreateV2RequestThirdPartAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAssetsCreateV2RequestThirdPartAsset>() {
           @Override
           public void write(JsonWriter out, EventManagerAssetsCreateV2RequestThirdPartAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAssetsCreateV2RequestThirdPartAsset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAssetsCreateV2RequestThirdPartAsset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAssetsCreateV2RequestThirdPartAsset
  * @throws IOException if the JSON string is invalid with respect to EventManagerAssetsCreateV2RequestThirdPartAsset
  */
  public static EventManagerAssetsCreateV2RequestThirdPartAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAssetsCreateV2RequestThirdPartAsset.class);
  }

 /**
  * Convert an instance of EventManagerAssetsCreateV2RequestThirdPartAsset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

