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
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo {
  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList = null;

  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo() {
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo abstractText(String abstractText) {
    
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


  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo bidwordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo addBidwordListItem(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner bidwordListItem) {
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
  public List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo wordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo addWordListItem(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner wordListItem) {
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
  public List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
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
    CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo = (CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo) o;
    return Objects.equals(this.abstractText, creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.abstractText) &&
        Objects.equals(this.bidwordList, creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.bidwordList) &&
        Objects.equals(this.wordList, creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractText, bidwordList, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo {\n");
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
    openapiRequiredFields.add("abstract_text");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo
  */
  public static CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

