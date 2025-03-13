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
public class CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo {
  public static final String SERIALIZED_NAME_ABSTRACT_LABEL = "abstract_label";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_LABEL)
  private String abstractLabel = null;

  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo() {
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo abstractLabel(String abstractLabel) {
    
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


  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo abstractText(String abstractText) {
    
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
    CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo = (CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo) o;
    return Objects.equals(this.abstractLabel, creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.abstractLabel) &&
        Objects.equals(this.abstractText, creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.abstractText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractLabel, abstractText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo {\n");
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
       if (!CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo
  */
  public static CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

