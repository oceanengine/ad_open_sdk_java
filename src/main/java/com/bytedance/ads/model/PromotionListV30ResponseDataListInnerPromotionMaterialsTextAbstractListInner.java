/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterialBidwordListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner {
  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterialBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<Long> wordList = null;

  public PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner abstractText(String abstractText) {
    
    this.abstractText = abstractText;
    return this;
  }

   /**
   * 
   * @return abstractText
  **/
  @javax.annotation.Nullable
  public String getAbstractText() {
    return abstractText;
  }


  public void setAbstractText(String abstractText) {
    this.abstractText = abstractText;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner bidwordList(List<CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterialBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner addBidwordListItem(CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterialBidwordListInner bidwordListItem) {
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
  public List<CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterialBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterialBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner wordList(List<Long> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner addWordListItem(Long wordListItem) {
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
    PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner promotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner = (PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner) o;
    return Objects.equals(this.abstractText, promotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner.abstractText) &&
        Objects.equals(this.bidwordList, promotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner.bidwordList) &&
        Objects.equals(this.wordList, promotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner.wordList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractText, bidwordList, wordList);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner {\n");
    sb.append("    abstractText: ").append(toIndentedString(abstractText)).append("\n");
    sb.append("    bidwordList: ").append(toIndentedString(bidwordList)).append("\n");
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
    openapiFields.add("abstract_text");
    openapiFields.add("bidword_list");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsTextAbstractListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

