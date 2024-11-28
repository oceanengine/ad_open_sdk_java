/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInnerBidwordListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner {
  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInnerBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_DPA_WORD_LIST = "dpa_word_list";
  @SerializedName(SERIALIZED_NAME_DPA_WORD_LIST)
  private List<Long> dpaWordList = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<Long> wordList = null;

  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner() {
  }

  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner bidwordList(List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInnerBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner addBidwordListItem(PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInnerBidwordListInner bidwordListItem) {
    if (this.bidwordList == null) {
      this.bidwordList = new ArrayList<>();
    }
    this.bidwordList.add(bidwordListItem);
    return this;
  }

   /**
   * 
   * @return bidwordList
  **/
  @javax.annotation.Nullable
  public List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInnerBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInnerBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner dpaWordList(List<Long> dpaWordList) {
    
    this.dpaWordList = dpaWordList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner addDpaWordListItem(Long dpaWordListItem) {
    if (this.dpaWordList == null) {
      this.dpaWordList = new ArrayList<>();
    }
    this.dpaWordList.add(dpaWordListItem);
    return this;
  }

   /**
   * 
   * @return dpaWordList
  **/
  @javax.annotation.Nullable
  public List<Long> getDpaWordList() {
    return dpaWordList;
  }


  public void setDpaWordList(List<Long> dpaWordList) {
    this.dpaWordList = dpaWordList;
  }


  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner wordList(List<Long> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner addWordListItem(Long wordListItem) {
    if (this.wordList == null) {
      this.wordList = new ArrayList<>();
    }
    this.wordList.add(wordListItem);
    return this;
  }

   /**
   * 
   * @return wordList
  **/
  @javax.annotation.Nullable
  public List<Long> getWordList() {
    return wordList;
  }


  public void setWordList(List<Long> wordList) {
    this.wordList = wordList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner promotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner = (PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner) o;
    return Objects.equals(this.bidwordList, promotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner.bidwordList) &&
        Objects.equals(this.dpaWordList, promotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner.dpaWordList) &&
        Objects.equals(this.title, promotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner.title) &&
        Objects.equals(this.wordList, promotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidwordList, dpaWordList, title, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner {\n");
    sb.append("    bidwordList: ").append(toIndentedString(bidwordList)).append("\n");
    sb.append("    dpaWordList: ").append(toIndentedString(dpaWordList)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    wordList: ").append(toIndentedString(wordList)).append("\n");
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
    openapiFields.add("bidword_list");
    openapiFields.add("dpa_word_list");
    openapiFields.add("title");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner
  */
  public static PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterialsTitleMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

