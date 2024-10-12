/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsSiteUpdateV2RequestBricksInnerSettingImage {
  public static final String SERIALIZED_NAME_IC_ID = "ic_Id";
  @SerializedName(SERIALIZED_NAME_IC_ID)
  private String icId = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public ToolsSiteUpdateV2RequestBricksInnerSettingImage() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerSettingImage icId(String icId) {
    
    this.icId = icId;
    return this;
  }

   /**
   * 
   * @return icId
  **/
  @javax.annotation.Nullable
  public String getIcId() {
    return icId;
  }


  public void setIcId(String icId) {
    this.icId = icId;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSettingImage imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerSettingImage toolsSiteUpdateV2RequestBricksInnerSettingImage = (ToolsSiteUpdateV2RequestBricksInnerSettingImage) o;
    return Objects.equals(this.icId, toolsSiteUpdateV2RequestBricksInnerSettingImage.icId) &&
        Objects.equals(this.imageUrl, toolsSiteUpdateV2RequestBricksInnerSettingImage.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icId, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerSettingImage {\n");
    sb.append("    icId: ").append(toIndentedString(icId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
    openapiFields.add("ic_Id");
    openapiFields.add("image_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerSettingImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerSettingImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSettingImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerSettingImage.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSettingImage>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerSettingImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerSettingImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerSettingImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerSettingImage
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerSettingImage
  */
  public static ToolsSiteUpdateV2RequestBricksInnerSettingImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerSettingImage.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerSettingImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

