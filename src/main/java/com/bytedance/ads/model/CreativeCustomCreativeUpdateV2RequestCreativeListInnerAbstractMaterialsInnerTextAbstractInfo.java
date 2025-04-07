/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo {
  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList = null;

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo() {
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo abstractText(String abstractText) {
    
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


  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo bidwordList(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo addBidwordListItem(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner bidwordListItem) {
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
  public List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo wordList(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo addWordListItem(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner wordListItem) {
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
  public List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
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
    CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo = (CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo) o;
    return Objects.equals(this.abstractText, creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo.abstractText) &&
        Objects.equals(this.bidwordList, creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo.bidwordList) &&
        Objects.equals(this.wordList, creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractText, bidwordList, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo {\n");
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
       if (!CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo
  */
  public static CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

