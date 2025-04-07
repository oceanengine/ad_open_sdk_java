/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteCreateV2RequestBricksInnerSettingBackgroundImage;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsSiteCreateV2RequestBricksInnerSettingBackground {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private ToolsSiteCreateV2RequestBricksInnerSettingBackgroundImage image = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public ToolsSiteCreateV2RequestBricksInnerSettingBackground() {
  }

  public ToolsSiteCreateV2RequestBricksInnerSettingBackground color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * 
   * @return color
  **/
  @javax.annotation.Nullable
  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public ToolsSiteCreateV2RequestBricksInnerSettingBackground image(ToolsSiteCreateV2RequestBricksInnerSettingBackgroundImage image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  public ToolsSiteCreateV2RequestBricksInnerSettingBackgroundImage getImage() {
    return image;
  }


  public void setImage(ToolsSiteCreateV2RequestBricksInnerSettingBackgroundImage image) {
    this.image = image;
  }


  public ToolsSiteCreateV2RequestBricksInnerSettingBackground type(String type) {
    
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
    ToolsSiteCreateV2RequestBricksInnerSettingBackground toolsSiteCreateV2RequestBricksInnerSettingBackground = (ToolsSiteCreateV2RequestBricksInnerSettingBackground) o;
    return Objects.equals(this.color, toolsSiteCreateV2RequestBricksInnerSettingBackground.color) &&
        Objects.equals(this.image, toolsSiteCreateV2RequestBricksInnerSettingBackground.image) &&
        Objects.equals(this.type, toolsSiteCreateV2RequestBricksInnerSettingBackground.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, image, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteCreateV2RequestBricksInnerSettingBackground {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
    openapiFields.add("color");
    openapiFields.add("image");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCreateV2RequestBricksInnerSettingBackground.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCreateV2RequestBricksInnerSettingBackground' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCreateV2RequestBricksInnerSettingBackground> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCreateV2RequestBricksInnerSettingBackground.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCreateV2RequestBricksInnerSettingBackground>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCreateV2RequestBricksInnerSettingBackground value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCreateV2RequestBricksInnerSettingBackground read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCreateV2RequestBricksInnerSettingBackground given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCreateV2RequestBricksInnerSettingBackground
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCreateV2RequestBricksInnerSettingBackground
  */
  public static ToolsSiteCreateV2RequestBricksInnerSettingBackground fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCreateV2RequestBricksInnerSettingBackground.class);
  }

 /**
  * Convert an instance of ToolsSiteCreateV2RequestBricksInnerSettingBackground to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

