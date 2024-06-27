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
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner;
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
 * 文本摘要信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo {
  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList = null;

  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo() {
  }

  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo abstractText(String abstractText) {
    
    this.abstractText = abstractText;
    return this;
  }

   /**
   * 文本摘要内容
   * @return abstractText
  **/
  @javax.annotation.Nullable
  public String getAbstractText() {
    return abstractText;
  }


  public void setAbstractText(String abstractText) {
    this.abstractText = abstractText;
  }


  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo bidwordList(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo addBidwordListItem(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner bidwordListItem) {
    if (this.bidwordList == null) {
      this.bidwordList = new ArrayList<>();
    }
    this.bidwordList.add(bidwordListItem);
    return this;
  }

   /**
   * 搜索关键词列表
   * @return bidwordList
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo wordList(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo addWordListItem(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner wordListItem) {
    if (this.wordList == null) {
      this.wordList = new ArrayList<>();
    }
    this.wordList.add(wordListItem);
    return this;
  }

   /**
   * 动态词包ID列表
   * @return wordList
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
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
    CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo creativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo = (CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo) o;
    return Objects.equals(this.abstractText, creativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo.abstractText) &&
        Objects.equals(this.bidwordList, creativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo.bidwordList) &&
        Objects.equals(this.wordList, creativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo.wordList);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo {\n");
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
       if (!CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo
  */
  public static CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

