/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPhraseWordsInner;
import com.bytedance.ads.model.ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner;
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
 * ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_FAIL_PHRASE_WORDS = "fail_phrase_words";
  @SerializedName(SERIALIZED_NAME_FAIL_PHRASE_WORDS)
  private List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords = null;

  public static final String SERIALIZED_NAME_FAIL_PRECISE_WORDS = "fail_precise_words";
  @SerializedName(SERIALIZED_NAME_FAIL_PRECISE_WORDS)
  private List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner() {
  }

  public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner failPhraseWords(List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords) {
    
    this.failPhraseWords = failPhraseWords;
    return this;
  }

  public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner addFailPhraseWordsItem(ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPhraseWordsInner failPhraseWordsItem) {
    if (this.failPhraseWords == null) {
      this.failPhraseWords = new ArrayList<>();
    }
    this.failPhraseWords.add(failPhraseWordsItem);
    return this;
  }

   /**
   * 
   * @return failPhraseWords
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPhraseWordsInner> getFailPhraseWords() {
    return failPhraseWords;
  }


  public void setFailPhraseWords(List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords) {
    this.failPhraseWords = failPhraseWords;
  }


  public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner failPreciseWords(List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords) {
    
    this.failPreciseWords = failPreciseWords;
    return this;
  }

  public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner addFailPreciseWordsItem(ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner failPreciseWordsItem) {
    if (this.failPreciseWords == null) {
      this.failPreciseWords = new ArrayList<>();
    }
    this.failPreciseWords.add(failPreciseWordsItem);
    return this;
  }

   /**
   * 
   * @return failPreciseWords
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner> getFailPreciseWords() {
    return failPreciseWords;
  }


  public void setFailPreciseWords(List<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords) {
    this.failPreciseWords = failPreciseWords;
  }


  public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
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
    ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner toolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner = (ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner) o;
    return Objects.equals(this.errorMessage, toolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner.errorMessage) &&
        Objects.equals(this.failPhraseWords, toolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner.failPhraseWords) &&
        Objects.equals(this.failPreciseWords, toolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner.failPreciseWords) &&
        Objects.equals(this.promotionId, toolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner.promotionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, failPhraseWords, failPreciseWords, promotionId);
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
    sb.append("class ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    failPhraseWords: ").append(toIndentedString(failPhraseWords)).append("\n");
    sb.append("    failPreciseWords: ").append(toIndentedString(failPreciseWords)).append("\n");
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
    openapiFields.add("error_message");
    openapiFields.add("fail_phrase_words");
    openapiFields.add("fail_precise_words");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner
  */
  public static ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordPromotionUpdateV30ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

