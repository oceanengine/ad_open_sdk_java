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
 * CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner {
  public static final String SERIALIZED_NAME_DEFAULT_WORD = "default_word";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORD)
  private String defaultWord = null;

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner() {
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner defaultWord(String defaultWord) {
    
    this.defaultWord = defaultWord;
    return this;
  }

   /**
   * 
   * @return defaultWord
  **/
  @javax.annotation.Nonnull
  public String getDefaultWord() {
    return defaultWord;
  }


  public void setDefaultWord(String defaultWord) {
    this.defaultWord = defaultWord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner = (CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner) o;
    return Objects.equals(this.defaultWord, creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner.defaultWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner {\n");
    sb.append("    defaultWord: ").append(toIndentedString(defaultWord)).append("\n");
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
    openapiFields.add("default_word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("default_word");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner
  */
  public static CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

