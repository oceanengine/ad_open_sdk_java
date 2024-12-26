/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsSiteUpdateV2RequestBricksInnerSettingButton {
  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "background_color";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  private String backgroundColor = null;

  public static final String SERIALIZED_NAME_BORDER_COLOR = "border_color";
  @SerializedName(SERIALIZED_NAME_BORDER_COLOR)
  private String borderColor = null;

  public static final String SERIALIZED_NAME_BORDER_RADIUS = "border_radius";
  @SerializedName(SERIALIZED_NAME_BORDER_RADIUS)
  private Long borderRadius = null;

  public static final String SERIALIZED_NAME_BORDER_WIDTH = "border_width";
  @SerializedName(SERIALIZED_NAME_BORDER_WIDTH)
  private Long borderWidth = null;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color = null;

  public static final String SERIALIZED_NAME_FONT_SIZE = "font_size";
  @SerializedName(SERIALIZED_NAME_FONT_SIZE)
  private Long fontSize = null;

  public ToolsSiteUpdateV2RequestBricksInnerSettingButton() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerSettingButton backgroundColor(String backgroundColor) {
    
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * 
   * @return backgroundColor
  **/
  @javax.annotation.Nullable
  public String getBackgroundColor() {
    return backgroundColor;
  }


  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSettingButton borderColor(String borderColor) {
    
    this.borderColor = borderColor;
    return this;
  }

   /**
   * 
   * @return borderColor
  **/
  @javax.annotation.Nullable
  public String getBorderColor() {
    return borderColor;
  }


  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSettingButton borderRadius(Long borderRadius) {
    
    this.borderRadius = borderRadius;
    return this;
  }

   /**
   * 
   * @return borderRadius
  **/
  @javax.annotation.Nullable
  public Long getBorderRadius() {
    return borderRadius;
  }


  public void setBorderRadius(Long borderRadius) {
    this.borderRadius = borderRadius;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSettingButton borderWidth(Long borderWidth) {
    
    this.borderWidth = borderWidth;
    return this;
  }

   /**
   * 
   * @return borderWidth
  **/
  @javax.annotation.Nullable
  public Long getBorderWidth() {
    return borderWidth;
  }


  public void setBorderWidth(Long borderWidth) {
    this.borderWidth = borderWidth;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSettingButton color(String color) {
    
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


  public ToolsSiteUpdateV2RequestBricksInnerSettingButton fontSize(Long fontSize) {
    
    this.fontSize = fontSize;
    return this;
  }

   /**
   * 
   * @return fontSize
  **/
  @javax.annotation.Nullable
  public Long getFontSize() {
    return fontSize;
  }


  public void setFontSize(Long fontSize) {
    this.fontSize = fontSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerSettingButton toolsSiteUpdateV2RequestBricksInnerSettingButton = (ToolsSiteUpdateV2RequestBricksInnerSettingButton) o;
    return Objects.equals(this.backgroundColor, toolsSiteUpdateV2RequestBricksInnerSettingButton.backgroundColor) &&
        Objects.equals(this.borderColor, toolsSiteUpdateV2RequestBricksInnerSettingButton.borderColor) &&
        Objects.equals(this.borderRadius, toolsSiteUpdateV2RequestBricksInnerSettingButton.borderRadius) &&
        Objects.equals(this.borderWidth, toolsSiteUpdateV2RequestBricksInnerSettingButton.borderWidth) &&
        Objects.equals(this.color, toolsSiteUpdateV2RequestBricksInnerSettingButton.color) &&
        Objects.equals(this.fontSize, toolsSiteUpdateV2RequestBricksInnerSettingButton.fontSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, borderColor, borderRadius, borderWidth, color, fontSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerSettingButton {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderRadius: ").append(toIndentedString(borderRadius)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
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
    openapiFields.add("background_color");
    openapiFields.add("border_color");
    openapiFields.add("border_radius");
    openapiFields.add("border_width");
    openapiFields.add("color");
    openapiFields.add("font_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerSettingButton.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerSettingButton' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSettingButton> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerSettingButton.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSettingButton>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerSettingButton value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerSettingButton read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerSettingButton given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerSettingButton
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerSettingButton
  */
  public static ToolsSiteUpdateV2RequestBricksInnerSettingButton fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerSettingButton.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerSettingButton to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

