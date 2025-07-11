/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.KeywordFeedadsSuggestV2DataListMatchType;
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
 * KeywordFeedadsSuggestV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class KeywordFeedadsSuggestV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private KeywordFeedadsSuggestV2DataListMatchType matchType = null;

  public KeywordFeedadsSuggestV2ResponseDataListInner() {
  }

  public KeywordFeedadsSuggestV2ResponseDataListInner keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * 
   * @return keyword
  **/
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }


  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public KeywordFeedadsSuggestV2ResponseDataListInner matchType(KeywordFeedadsSuggestV2DataListMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  public KeywordFeedadsSuggestV2DataListMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(KeywordFeedadsSuggestV2DataListMatchType matchType) {
    this.matchType = matchType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordFeedadsSuggestV2ResponseDataListInner keywordFeedadsSuggestV2ResponseDataListInner = (KeywordFeedadsSuggestV2ResponseDataListInner) o;
    return Objects.equals(this.keyword, keywordFeedadsSuggestV2ResponseDataListInner.keyword) &&
        Objects.equals(this.matchType, keywordFeedadsSuggestV2ResponseDataListInner.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, matchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordFeedadsSuggestV2ResponseDataListInner {\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
    openapiFields.add("keyword");
    openapiFields.add("match_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordFeedadsSuggestV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordFeedadsSuggestV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordFeedadsSuggestV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordFeedadsSuggestV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordFeedadsSuggestV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, KeywordFeedadsSuggestV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordFeedadsSuggestV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordFeedadsSuggestV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordFeedadsSuggestV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to KeywordFeedadsSuggestV2ResponseDataListInner
  */
  public static KeywordFeedadsSuggestV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordFeedadsSuggestV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of KeywordFeedadsSuggestV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

