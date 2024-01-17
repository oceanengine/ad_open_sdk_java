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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo {
  public static final String SERIALIZED_NAME_ABSTRACT_LABEL = "abstract_label";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_LABEL)
  private String abstractLabel = null;

  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo() {
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo abstractLabel(String abstractLabel) {
    
    this.abstractLabel = abstractLabel;
    return this;
  }

   /**
   * 
   * @return abstractLabel
  **/
  @javax.annotation.Nonnull
  public String getAbstractLabel() {
    return abstractLabel;
  }


  public void setAbstractLabel(String abstractLabel) {
    this.abstractLabel = abstractLabel;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo abstractText(String abstractText) {
    
    this.abstractText = abstractText;
    return this;
  }

   /**
   * 
   * @return abstractText
  **/
  @javax.annotation.Nonnull
  public String getAbstractText() {
    return abstractText;
  }


  public void setAbstractText(String abstractText) {
    this.abstractText = abstractText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo = (CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo) o;
    return Objects.equals(this.abstractLabel, creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.abstractLabel) &&
        Objects.equals(this.abstractText, creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.abstractText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractLabel, abstractText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo {\n");
    sb.append("    abstractLabel: ").append(toIndentedString(abstractLabel)).append("\n");
    sb.append("    abstractText: ").append(toIndentedString(abstractText)).append("\n");
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
    openapiFields.add("abstract_label");
    openapiFields.add("abstract_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("abstract_label");
    openapiRequiredFields.add("abstract_text");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo
  */
  public static CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

