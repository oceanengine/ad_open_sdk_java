/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInnerWordListInner;
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
 * AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInnerWordListInner> wordList = null;

  public AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner() {
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 标题信息
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner wordList(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInnerWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner addWordListItem(AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInnerWordListInner wordListItem) {
    if (this.wordList == null) {
      this.wordList = new ArrayList<>();
    }
    this.wordList.add(wordListItem);
    return this;
  }

   /**
   * 词包信息
   * @return wordList
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInnerWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInnerWordListInner> wordList) {
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
    AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner adlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner = (AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner) o;
    return Objects.equals(this.title, adlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner.title) &&
        Objects.equals(this.wordList, adlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner.wordList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, wordList);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner {\n");
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
    openapiFields.add("title");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner
  */
  public static AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

