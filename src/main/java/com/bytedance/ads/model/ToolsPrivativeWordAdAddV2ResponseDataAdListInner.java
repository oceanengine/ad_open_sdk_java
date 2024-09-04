/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2ResponseDataAdListInnerDuplicateWords;
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLengthWords;
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLimitWords;
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2ResponseDataAdListInnerHasEmojiWords;
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2ResponseDataAdListInnerSuccessWords;
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
 * ToolsPrivativeWordAdAddV2ResponseDataAdListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordAdAddV2ResponseDataAdListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_DUPLICATE_WORDS = "duplicate_words";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_WORDS)
  private ToolsPrivativeWordAdAddV2ResponseDataAdListInnerDuplicateWords duplicateWords = null;

  public static final String SERIALIZED_NAME_EXCEED_LENGTH_WORDS = "exceed_length_words";
  @SerializedName(SERIALIZED_NAME_EXCEED_LENGTH_WORDS)
  private ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLengthWords exceedLengthWords = null;

  public static final String SERIALIZED_NAME_EXCEED_LIMIT_WORDS = "exceed_limit_words";
  @SerializedName(SERIALIZED_NAME_EXCEED_LIMIT_WORDS)
  private ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLimitWords exceedLimitWords = null;

  public static final String SERIALIZED_NAME_HAS_EMOJI_WORDS = "has_emoji_words";
  @SerializedName(SERIALIZED_NAME_HAS_EMOJI_WORDS)
  private ToolsPrivativeWordAdAddV2ResponseDataAdListInnerHasEmojiWords hasEmojiWords = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public static final String SERIALIZED_NAME_SUCCESS_WORDS = "success_words";
  @SerializedName(SERIALIZED_NAME_SUCCESS_WORDS)
  private ToolsPrivativeWordAdAddV2ResponseDataAdListInnerSuccessWords successWords = null;

  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner() {
  }

  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner duplicateWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerDuplicateWords duplicateWords) {
    
    this.duplicateWords = duplicateWords;
    return this;
  }

   /**
   * Get duplicateWords
   * @return duplicateWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordAdAddV2ResponseDataAdListInnerDuplicateWords getDuplicateWords() {
    return duplicateWords;
  }


  public void setDuplicateWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerDuplicateWords duplicateWords) {
    this.duplicateWords = duplicateWords;
  }


  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner exceedLengthWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLengthWords exceedLengthWords) {
    
    this.exceedLengthWords = exceedLengthWords;
    return this;
  }

   /**
   * Get exceedLengthWords
   * @return exceedLengthWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLengthWords getExceedLengthWords() {
    return exceedLengthWords;
  }


  public void setExceedLengthWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLengthWords exceedLengthWords) {
    this.exceedLengthWords = exceedLengthWords;
  }


  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner exceedLimitWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLimitWords exceedLimitWords) {
    
    this.exceedLimitWords = exceedLimitWords;
    return this;
  }

   /**
   * Get exceedLimitWords
   * @return exceedLimitWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLimitWords getExceedLimitWords() {
    return exceedLimitWords;
  }


  public void setExceedLimitWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerExceedLimitWords exceedLimitWords) {
    this.exceedLimitWords = exceedLimitWords;
  }


  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner hasEmojiWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerHasEmojiWords hasEmojiWords) {
    
    this.hasEmojiWords = hasEmojiWords;
    return this;
  }

   /**
   * Get hasEmojiWords
   * @return hasEmojiWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordAdAddV2ResponseDataAdListInnerHasEmojiWords getHasEmojiWords() {
    return hasEmojiWords;
  }


  public void setHasEmojiWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerHasEmojiWords hasEmojiWords) {
    this.hasEmojiWords = hasEmojiWords;
  }


  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ToolsPrivativeWordAdAddV2ResponseDataAdListInner successWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerSuccessWords successWords) {
    
    this.successWords = successWords;
    return this;
  }

   /**
   * Get successWords
   * @return successWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordAdAddV2ResponseDataAdListInnerSuccessWords getSuccessWords() {
    return successWords;
  }


  public void setSuccessWords(ToolsPrivativeWordAdAddV2ResponseDataAdListInnerSuccessWords successWords) {
    this.successWords = successWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordAdAddV2ResponseDataAdListInner toolsPrivativeWordAdAddV2ResponseDataAdListInner = (ToolsPrivativeWordAdAddV2ResponseDataAdListInner) o;
    return Objects.equals(this.adId, toolsPrivativeWordAdAddV2ResponseDataAdListInner.adId) &&
        Objects.equals(this.duplicateWords, toolsPrivativeWordAdAddV2ResponseDataAdListInner.duplicateWords) &&
        Objects.equals(this.exceedLengthWords, toolsPrivativeWordAdAddV2ResponseDataAdListInner.exceedLengthWords) &&
        Objects.equals(this.exceedLimitWords, toolsPrivativeWordAdAddV2ResponseDataAdListInner.exceedLimitWords) &&
        Objects.equals(this.hasEmojiWords, toolsPrivativeWordAdAddV2ResponseDataAdListInner.hasEmojiWords) &&
        Objects.equals(this.status, toolsPrivativeWordAdAddV2ResponseDataAdListInner.status) &&
        Objects.equals(this.successWords, toolsPrivativeWordAdAddV2ResponseDataAdListInner.successWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, duplicateWords, exceedLengthWords, exceedLimitWords, hasEmojiWords, status, successWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordAdAddV2ResponseDataAdListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    duplicateWords: ").append(toIndentedString(duplicateWords)).append("\n");
    sb.append("    exceedLengthWords: ").append(toIndentedString(exceedLengthWords)).append("\n");
    sb.append("    exceedLimitWords: ").append(toIndentedString(exceedLimitWords)).append("\n");
    sb.append("    hasEmojiWords: ").append(toIndentedString(hasEmojiWords)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successWords: ").append(toIndentedString(successWords)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("duplicate_words");
    openapiFields.add("exceed_length_words");
    openapiFields.add("exceed_limit_words");
    openapiFields.add("has_emoji_words");
    openapiFields.add("status");
    openapiFields.add("success_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordAdAddV2ResponseDataAdListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordAdAddV2ResponseDataAdListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordAdAddV2ResponseDataAdListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordAdAddV2ResponseDataAdListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordAdAddV2ResponseDataAdListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordAdAddV2ResponseDataAdListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordAdAddV2ResponseDataAdListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordAdAddV2ResponseDataAdListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordAdAddV2ResponseDataAdListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordAdAddV2ResponseDataAdListInner
  */
  public static ToolsPrivativeWordAdAddV2ResponseDataAdListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordAdAddV2ResponseDataAdListInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordAdAddV2ResponseDataAdListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

