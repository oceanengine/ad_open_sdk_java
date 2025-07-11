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
import com.bytedance.ads.model.KeywordCreateV2V2DataSuccessListBidType;
import com.bytedance.ads.model.KeywordCreateV2V2DataSuccessListMatchType;
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
 * KeywordCreateV2V2ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class KeywordCreateV2V2ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private KeywordCreateV2V2DataSuccessListBidType bidType = null;

  public static final String SERIALIZED_NAME_IS_PAUSE = "is_pause";
  @SerializedName(SERIALIZED_NAME_IS_PAUSE)
  private Long isPause = null;

  public static final String SERIALIZED_NAME_KEYWORD_ID = "keyword_id";
  @SerializedName(SERIALIZED_NAME_KEYWORD_ID)
  private Long keywordId = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private KeywordCreateV2V2DataSuccessListMatchType matchType = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public KeywordCreateV2V2ResponseDataSuccessListInner() {
  }

  public KeywordCreateV2V2ResponseDataSuccessListInner bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public KeywordCreateV2V2ResponseDataSuccessListInner bidType(KeywordCreateV2V2DataSuccessListBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public KeywordCreateV2V2DataSuccessListBidType getBidType() {
    return bidType;
  }


  public void setBidType(KeywordCreateV2V2DataSuccessListBidType bidType) {
    this.bidType = bidType;
  }


  public KeywordCreateV2V2ResponseDataSuccessListInner isPause(Long isPause) {
    
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


  public KeywordCreateV2V2ResponseDataSuccessListInner keywordId(Long keywordId) {
    
    this.keywordId = keywordId;
    return this;
  }

   /**
   * 
   * @return keywordId
  **/
  @javax.annotation.Nullable
  public Long getKeywordId() {
    return keywordId;
  }


  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }


  public KeywordCreateV2V2ResponseDataSuccessListInner matchType(KeywordCreateV2V2DataSuccessListMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  public KeywordCreateV2V2DataSuccessListMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(KeywordCreateV2V2DataSuccessListMatchType matchType) {
    this.matchType = matchType;
  }


  public KeywordCreateV2V2ResponseDataSuccessListInner word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 
   * @return word
  **/
  @javax.annotation.Nonnull
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordCreateV2V2ResponseDataSuccessListInner keywordCreateV2V2ResponseDataSuccessListInner = (KeywordCreateV2V2ResponseDataSuccessListInner) o;
    return Objects.equals(this.bid, keywordCreateV2V2ResponseDataSuccessListInner.bid) &&
        Objects.equals(this.bidType, keywordCreateV2V2ResponseDataSuccessListInner.bidType) &&
        Objects.equals(this.isPause, keywordCreateV2V2ResponseDataSuccessListInner.isPause) &&
        Objects.equals(this.keywordId, keywordCreateV2V2ResponseDataSuccessListInner.keywordId) &&
        Objects.equals(this.matchType, keywordCreateV2V2ResponseDataSuccessListInner.matchType) &&
        Objects.equals(this.word, keywordCreateV2V2ResponseDataSuccessListInner.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, bidType, isPause, keywordId, matchType, word);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordCreateV2V2ResponseDataSuccessListInner {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    isPause: ").append(toIndentedString(isPause)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("word");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeywordCreateV2V2ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordCreateV2V2ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordCreateV2V2ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordCreateV2V2ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordCreateV2V2ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, KeywordCreateV2V2ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordCreateV2V2ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordCreateV2V2ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordCreateV2V2ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to KeywordCreateV2V2ResponseDataSuccessListInner
  */
  public static KeywordCreateV2V2ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordCreateV2V2ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of KeywordCreateV2V2ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

