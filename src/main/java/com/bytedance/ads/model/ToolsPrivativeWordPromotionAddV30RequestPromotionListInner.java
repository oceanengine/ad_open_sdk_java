/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * ToolsPrivativeWordPromotionAddV30RequestPromotionListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ToolsPrivativeWordPromotionAddV30RequestPromotionListInner {
  public static final String SERIALIZED_NAME_PHRASE_WORDS = "phrase_words";
  @SerializedName(SERIALIZED_NAME_PHRASE_WORDS)
  private List<String> phraseWords = null;

  public static final String SERIALIZED_NAME_PRECISE_WORDS = "precise_words";
  @SerializedName(SERIALIZED_NAME_PRECISE_WORDS)
  private List<String> preciseWords = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public ToolsPrivativeWordPromotionAddV30RequestPromotionListInner() {
  }

  public ToolsPrivativeWordPromotionAddV30RequestPromotionListInner phraseWords(List<String> phraseWords) {
    
    this.phraseWords = phraseWords;
    return this;
  }

  public ToolsPrivativeWordPromotionAddV30RequestPromotionListInner addPhraseWordsItem(String phraseWordsItem) {
    if (this.phraseWords == null) {
      this.phraseWords = new ArrayList<>();
    }
    this.phraseWords.add(phraseWordsItem);
    return this;
  }

   /**
   * 短语否定词列表
   * @return phraseWords
  **/
  @javax.annotation.Nullable
  public List<String> getPhraseWords() {
    return phraseWords;
  }


  public void setPhraseWords(List<String> phraseWords) {
    this.phraseWords = phraseWords;
  }


  public ToolsPrivativeWordPromotionAddV30RequestPromotionListInner preciseWords(List<String> preciseWords) {
    
    this.preciseWords = preciseWords;
    return this;
  }

  public ToolsPrivativeWordPromotionAddV30RequestPromotionListInner addPreciseWordsItem(String preciseWordsItem) {
    if (this.preciseWords == null) {
      this.preciseWords = new ArrayList<>();
    }
    this.preciseWords.add(preciseWordsItem);
    return this;
  }

   /**
   * 精确否定词列表
   * @return preciseWords
  **/
  @javax.annotation.Nullable
  public List<String> getPreciseWords() {
    return preciseWords;
  }


  public void setPreciseWords(List<String> preciseWords) {
    this.preciseWords = preciseWords;
  }


  public ToolsPrivativeWordPromotionAddV30RequestPromotionListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 项目id
   * @return promotionId
  **/
  @javax.annotation.Nonnull
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordPromotionAddV30RequestPromotionListInner toolsPrivativeWordPromotionAddV30RequestPromotionListInner = (ToolsPrivativeWordPromotionAddV30RequestPromotionListInner) o;
    return Objects.equals(this.phraseWords, toolsPrivativeWordPromotionAddV30RequestPromotionListInner.phraseWords) &&
        Objects.equals(this.preciseWords, toolsPrivativeWordPromotionAddV30RequestPromotionListInner.preciseWords) &&
        Objects.equals(this.promotionId, toolsPrivativeWordPromotionAddV30RequestPromotionListInner.promotionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phraseWords, preciseWords, promotionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordPromotionAddV30RequestPromotionListInner {\n");
    sb.append("    phraseWords: ").append(toIndentedString(phraseWords)).append("\n");
    sb.append("    preciseWords: ").append(toIndentedString(preciseWords)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("phrase_words");
    openapiFields.add("precise_words");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("promotion_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordPromotionAddV30RequestPromotionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordPromotionAddV30RequestPromotionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordPromotionAddV30RequestPromotionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordPromotionAddV30RequestPromotionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordPromotionAddV30RequestPromotionListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordPromotionAddV30RequestPromotionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordPromotionAddV30RequestPromotionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordPromotionAddV30RequestPromotionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordPromotionAddV30RequestPromotionListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordPromotionAddV30RequestPromotionListInner
  */
  public static ToolsPrivativeWordPromotionAddV30RequestPromotionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordPromotionAddV30RequestPromotionListInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordPromotionAddV30RequestPromotionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

