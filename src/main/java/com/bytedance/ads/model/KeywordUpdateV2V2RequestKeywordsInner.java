/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.KeywordUpdateV2V2KeywordsBidType;
import com.bytedance.ads.model.KeywordUpdateV2V2KeywordsMatchType;
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
 * KeywordUpdateV2V2RequestKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class KeywordUpdateV2V2RequestKeywordsInner {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private KeywordUpdateV2V2KeywordsBidType bidType = null;

  public static final String SERIALIZED_NAME_IS_PAUSE = "is_pause";
  @SerializedName(SERIALIZED_NAME_IS_PAUSE)
  private Long isPause = null;

  public static final String SERIALIZED_NAME_KEYWORD_ID = "keyword_id";
  @SerializedName(SERIALIZED_NAME_KEYWORD_ID)
  private Long keywordId = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private KeywordUpdateV2V2KeywordsMatchType matchType = null;

  public static final String SERIALIZED_NAME_WORD_ID = "word_id";
  @SerializedName(SERIALIZED_NAME_WORD_ID)
  private Long wordId = null;

  public KeywordUpdateV2V2RequestKeywordsInner() {
  }

  public KeywordUpdateV2V2RequestKeywordsInner bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * minimum: 0.0
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public KeywordUpdateV2V2RequestKeywordsInner bidType(KeywordUpdateV2V2KeywordsBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public KeywordUpdateV2V2KeywordsBidType getBidType() {
    return bidType;
  }


  public void setBidType(KeywordUpdateV2V2KeywordsBidType bidType) {
    this.bidType = bidType;
  }


  public KeywordUpdateV2V2RequestKeywordsInner isPause(Long isPause) {
    
    this.isPause = isPause;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 1
   * @return isPause
  **/
  @javax.annotation.Nullable
  public Long getIsPause() {
    return isPause;
  }


  public void setIsPause(Long isPause) {
    this.isPause = isPause;
  }


  public KeywordUpdateV2V2RequestKeywordsInner keywordId(Long keywordId) {
    
    this.keywordId = keywordId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return keywordId
  **/
  @javax.annotation.Nullable
  public Long getKeywordId() {
    return keywordId;
  }


  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }


  public KeywordUpdateV2V2RequestKeywordsInner matchType(KeywordUpdateV2V2KeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  public KeywordUpdateV2V2KeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(KeywordUpdateV2V2KeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public KeywordUpdateV2V2RequestKeywordsInner wordId(Long wordId) {
    
    this.wordId = wordId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return wordId
  **/
  @javax.annotation.Nullable
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
    KeywordUpdateV2V2RequestKeywordsInner keywordUpdateV2V2RequestKeywordsInner = (KeywordUpdateV2V2RequestKeywordsInner) o;
    return Objects.equals(this.bid, keywordUpdateV2V2RequestKeywordsInner.bid) &&
        Objects.equals(this.bidType, keywordUpdateV2V2RequestKeywordsInner.bidType) &&
        Objects.equals(this.isPause, keywordUpdateV2V2RequestKeywordsInner.isPause) &&
        Objects.equals(this.keywordId, keywordUpdateV2V2RequestKeywordsInner.keywordId) &&
        Objects.equals(this.matchType, keywordUpdateV2V2RequestKeywordsInner.matchType) &&
        Objects.equals(this.wordId, keywordUpdateV2V2RequestKeywordsInner.wordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, bidType, isPause, keywordId, matchType, wordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordUpdateV2V2RequestKeywordsInner {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    isPause: ").append(toIndentedString(isPause)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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
    openapiFields.add("bid");
    openapiFields.add("bid_type");
    openapiFields.add("is_pause");
    openapiFields.add("keyword_id");
    openapiFields.add("match_type");
    openapiFields.add("word_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordUpdateV2V2RequestKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordUpdateV2V2RequestKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordUpdateV2V2RequestKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordUpdateV2V2RequestKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordUpdateV2V2RequestKeywordsInner>() {
           @Override
           public void write(JsonWriter out, KeywordUpdateV2V2RequestKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordUpdateV2V2RequestKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordUpdateV2V2RequestKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordUpdateV2V2RequestKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to KeywordUpdateV2V2RequestKeywordsInner
  */
  public static KeywordUpdateV2V2RequestKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordUpdateV2V2RequestKeywordsInner.class);
  }

 /**
  * Convert an instance of KeywordUpdateV2V2RequestKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

