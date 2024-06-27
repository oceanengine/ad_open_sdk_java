/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
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
 * CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner {
  public static final String SERIALIZED_NAME_WORD_ID = "word_id";
  @SerializedName(SERIALIZED_NAME_WORD_ID)
  private Long wordId = null;

  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner() {
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner wordId(Long wordId) {
    
    this.wordId = wordId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return wordId
  **/
  @javax.annotation.Nonnull
  public Long getWordId() {
    return wordId;
  }


  public void setWordId(Long wordId) {
    this.wordId = wordId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner creativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner = (CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner) o;
    return Objects.equals(this.wordId, creativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner.wordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner {\n");
    sb.append("    wordId: ").append(toIndentedString(wordId)).append("\n");
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
    openapiFields.add("word_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("word_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner
  */
  public static CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

