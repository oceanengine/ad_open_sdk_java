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
public class LocalAwemeAuthorizedGetV30Filtering {
  public static final String SERIALIZED_NAME_SEARCH_KEY_WORD = "search_key_word";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEY_WORD)
  private String searchKeyWord = null;

  public LocalAwemeAuthorizedGetV30Filtering() {
  }

  public LocalAwemeAuthorizedGetV30Filtering searchKeyWord(String searchKeyWord) {
    
    this.searchKeyWord = searchKeyWord;
    return this;
  }

   /**
   * 根据抖音号id和名称进行搜索
   * @return searchKeyWord
  **/
  @javax.annotation.Nullable
  public String getSearchKeyWord() {
    return searchKeyWord;
  }


  public void setSearchKeyWord(String searchKeyWord) {
    this.searchKeyWord = searchKeyWord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalAwemeAuthorizedGetV30Filtering localAwemeAuthorizedGetV30Filtering = (LocalAwemeAuthorizedGetV30Filtering) o;
    return Objects.equals(this.searchKeyWord, localAwemeAuthorizedGetV30Filtering.searchKeyWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKeyWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalAwemeAuthorizedGetV30Filtering {\n");
    sb.append("    searchKeyWord: ").append(toIndentedString(searchKeyWord)).append("\n");
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
    openapiFields.add("search_key_word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalAwemeAuthorizedGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalAwemeAuthorizedGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalAwemeAuthorizedGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalAwemeAuthorizedGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalAwemeAuthorizedGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalAwemeAuthorizedGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalAwemeAuthorizedGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalAwemeAuthorizedGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalAwemeAuthorizedGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalAwemeAuthorizedGetV30Filtering
  */
  public static LocalAwemeAuthorizedGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalAwemeAuthorizedGetV30Filtering.class);
  }

 /**
  * Convert an instance of LocalAwemeAuthorizedGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
