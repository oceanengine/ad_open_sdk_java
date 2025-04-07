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
 * CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner {
  public static final String SERIALIZED_NAME_BACKGROUND_IMAGE_ID = "background_image_id";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_IMAGE_ID)
  private String backgroundImageId = null;

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner() {
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner backgroundImageId(String backgroundImageId) {
    
    this.backgroundImageId = backgroundImageId;
    return this;
  }

   /**
   * 
   * @return backgroundImageId
  **/
  @javax.annotation.Nullable
  public String getBackgroundImageId() {
    return backgroundImageId;
  }


  public void setBackgroundImageId(String backgroundImageId) {
    this.backgroundImageId = backgroundImageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner = (CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner) o;
    return Objects.equals(this.backgroundImageId, creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner.backgroundImageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner {\n");
    sb.append("    backgroundImageId: ").append(toIndentedString(backgroundImageId)).append("\n");
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
    openapiFields.add("background_image_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner
  */
  public static CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

