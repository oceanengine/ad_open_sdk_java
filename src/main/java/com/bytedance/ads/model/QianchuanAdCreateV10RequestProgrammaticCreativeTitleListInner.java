/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdCreateV10ProgrammaticCreativeTitleListTitleType;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner;
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
 * QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner {
  public static final String SERIALIZED_NAME_DYNAMIC_WORDS = "dynamic_words";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_WORDS)
  private List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner> dynamicWords = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_TITLE_TYPE = "title_type";
  @SerializedName(SERIALIZED_NAME_TITLE_TYPE)
  private QianchuanAdCreateV10ProgrammaticCreativeTitleListTitleType titleType = null;

  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner() {
  }

  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner dynamicWords(List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner> dynamicWords) {
    
    this.dynamicWords = dynamicWords;
    return this;
  }

  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner addDynamicWordsItem(QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner dynamicWordsItem) {
    if (this.dynamicWords == null) {
      this.dynamicWords = new ArrayList<>();
    }
    this.dynamicWords.add(dynamicWordsItem);
    return this;
  }

   /**
   * 
   * @return dynamicWords
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner> getDynamicWords() {
    return dynamicWords;
  }


  public void setDynamicWords(List<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner> dynamicWords) {
    this.dynamicWords = dynamicWords;
  }


  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner title(String title) {
    
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


  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner titleType(QianchuanAdCreateV10ProgrammaticCreativeTitleListTitleType titleType) {
    
    this.titleType = titleType;
    return this;
  }

   /**
   * Get titleType
   * @return titleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10ProgrammaticCreativeTitleListTitleType getTitleType() {
    return titleType;
  }


  public void setTitleType(QianchuanAdCreateV10ProgrammaticCreativeTitleListTitleType titleType) {
    this.titleType = titleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner = (QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner) o;
    return Objects.equals(this.dynamicWords, qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner.dynamicWords) &&
        Objects.equals(this.title, qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner.title) &&
        Objects.equals(this.titleType, qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner.titleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicWords, title, titleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner {\n");
    sb.append("    dynamicWords: ").append(toIndentedString(dynamicWords)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleType: ").append(toIndentedString(titleType)).append("\n");
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
    openapiFields.add("dynamic_words");
    openapiFields.add("title");
    openapiFields.add("title_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner
  */
  public static QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
