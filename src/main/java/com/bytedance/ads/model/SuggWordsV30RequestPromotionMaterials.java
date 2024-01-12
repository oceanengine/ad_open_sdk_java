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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class SuggWordsV30RequestPromotionMaterials {
  public static final String SERIALIZED_NAME_ABSTRACTS = "abstracts";
  @SerializedName(SERIALIZED_NAME_ABSTRACTS)
  private List<String> abstracts = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_QUALITY_WORDS = "quality_words";
  @SerializedName(SERIALIZED_NAME_QUALITY_WORDS)
  private List<String> qualityWords = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_TITLES = "titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = null;

  public SuggWordsV30RequestPromotionMaterials() {
  }

  public SuggWordsV30RequestPromotionMaterials abstracts(List<String> abstracts) {
    
    this.abstracts = abstracts;
    return this;
  }

  public SuggWordsV30RequestPromotionMaterials addAbstractsItem(String abstractsItem) {
    if (this.abstracts == null) {
      this.abstracts = new ArrayList<>();
    }
    this.abstracts.add(abstractsItem);
    return this;
  }

   /**
   * 
   * @return abstracts
  **/
  @javax.annotation.Nullable
  public List<String> getAbstracts() {
    return abstracts;
  }


  public void setAbstracts(List<String> abstracts) {
    this.abstracts = abstracts;
  }


  public SuggWordsV30RequestPromotionMaterials appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public SuggWordsV30RequestPromotionMaterials qualityWords(List<String> qualityWords) {
    
    this.qualityWords = qualityWords;
    return this;
  }

  public SuggWordsV30RequestPromotionMaterials addQualityWordsItem(String qualityWordsItem) {
    if (this.qualityWords == null) {
      this.qualityWords = new ArrayList<>();
    }
    this.qualityWords.add(qualityWordsItem);
    return this;
  }

   /**
   * 
   * @return qualityWords
  **/
  @javax.annotation.Nullable
  public List<String> getQualityWords() {
    return qualityWords;
  }


  public void setQualityWords(List<String> qualityWords) {
    this.qualityWords = qualityWords;
  }


  public SuggWordsV30RequestPromotionMaterials source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public SuggWordsV30RequestPromotionMaterials titles(List<String> titles) {
    
    this.titles = titles;
    return this;
  }

  public SuggWordsV30RequestPromotionMaterials addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * 
   * @return titles
  **/
  @javax.annotation.Nullable
  public List<String> getTitles() {
    return titles;
  }


  public void setTitles(List<String> titles) {
    this.titles = titles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggWordsV30RequestPromotionMaterials suggWordsV30RequestPromotionMaterials = (SuggWordsV30RequestPromotionMaterials) o;
    return Objects.equals(this.abstracts, suggWordsV30RequestPromotionMaterials.abstracts) &&
        Objects.equals(this.appName, suggWordsV30RequestPromotionMaterials.appName) &&
        Objects.equals(this.qualityWords, suggWordsV30RequestPromotionMaterials.qualityWords) &&
        Objects.equals(this.source, suggWordsV30RequestPromotionMaterials.source) &&
        Objects.equals(this.titles, suggWordsV30RequestPromotionMaterials.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstracts, appName, qualityWords, source, titles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggWordsV30RequestPromotionMaterials {\n");
    sb.append("    abstracts: ").append(toIndentedString(abstracts)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    qualityWords: ").append(toIndentedString(qualityWords)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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
    openapiFields.add("abstracts");
    openapiFields.add("app_name");
    openapiFields.add("quality_words");
    openapiFields.add("source");
    openapiFields.add("titles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggWordsV30RequestPromotionMaterials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggWordsV30RequestPromotionMaterials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggWordsV30RequestPromotionMaterials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggWordsV30RequestPromotionMaterials.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggWordsV30RequestPromotionMaterials>() {
           @Override
           public void write(JsonWriter out, SuggWordsV30RequestPromotionMaterials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggWordsV30RequestPromotionMaterials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggWordsV30RequestPromotionMaterials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggWordsV30RequestPromotionMaterials
  * @throws IOException if the JSON string is invalid with respect to SuggWordsV30RequestPromotionMaterials
  */
  public static SuggWordsV30RequestPromotionMaterials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggWordsV30RequestPromotionMaterials.class);
  }

 /**
  * Convert an instance of SuggWordsV30RequestPromotionMaterials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

