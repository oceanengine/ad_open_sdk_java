/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerBidwordListInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerDpaWordListInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerWordListInner;
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
 * CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner {
  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_DPA_WORD_LIST = "dpa_word_list";
  @SerializedName(SERIALIZED_NAME_DPA_WORD_LIST)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerWordListInner> wordList = null;

  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner() {
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner bidwordList(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner addBidwordListItem(CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerBidwordListInner bidwordListItem) {
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
  public List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner dpaWordList(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList) {
    
    this.dpaWordList = dpaWordList;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner addDpaWordListItem(CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerDpaWordListInner dpaWordListItem) {
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
  public List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> getDpaWordList() {
    return dpaWordList;
  }


  public void setDpaWordList(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList) {
    this.dpaWordList = dpaWordList;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner title(String title) {
    
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


  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner wordList(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner addWordListItem(CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerWordListInner wordListItem) {
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
  public List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInnerWordListInner> wordList) {
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
    CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner creativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner = (CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner) o;
    return Objects.equals(this.bidwordList, creativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.bidwordList) &&
        Objects.equals(this.dpaWordList, creativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.dpaWordList) &&
        Objects.equals(this.materialId, creativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.materialId) &&
        Objects.equals(this.title, creativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.title) &&
        Objects.equals(this.wordList, creativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidwordList, dpaWordList, materialId, title, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner {\n");
    sb.append("    bidwordList: ").append(toIndentedString(bidwordList)).append("\n");
    sb.append("    dpaWordList: ").append(toIndentedString(dpaWordList)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("material_id");
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
       if (!CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner
  */
  public static CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

