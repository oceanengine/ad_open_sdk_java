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
import com.bytedance.ads.model.QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner {
  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private Long degree = null;

  public static final String SERIALIZED_NAME_KEYWORD_ID = "keyword_id";
  @SerializedName(SERIALIZED_NAME_KEYWORD_ID)
  private Long keywordId = null;

  public static final String SERIALIZED_NAME_KEYWORD_MATCH_TYPE = "keyword_match_type";
  @SerializedName(SERIALIZED_NAME_KEYWORD_MATCH_TYPE)
  private QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType keywordMatchType = null;

  public static final String SERIALIZED_NAME_KEYWORD_NAME = "keyword_name";
  @SerializedName(SERIALIZED_NAME_KEYWORD_NAME)
  private String keywordName = null;

  public static final String SERIALIZED_NAME_SEARCH_SUM = "search_sum";
  @SerializedName(SERIALIZED_NAME_SEARCH_SUM)
  private Long searchSum = null;

  public static final String SERIALIZED_NAME_WORD_PACKAGE_NAME = "word_package_name";
  @SerializedName(SERIALIZED_NAME_WORD_PACKAGE_NAME)
  private String wordPackageName = null;

  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner() {
  }

  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner degree(Long degree) {
    
    this.degree = degree;
    return this;
  }

   /**
   * 
   * @return degree
  **/
  @javax.annotation.Nullable
  public Long getDegree() {
    return degree;
  }


  public void setDegree(Long degree) {
    this.degree = degree;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner keywordId(Long keywordId) {
    
    this.keywordId = keywordId;
    return this;
  }

   /**
   * 
   * @return keywordId
  **/
  @javax.annotation.Nullable
  public Long getKeywordId() {
    return keywordId;
  }


  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner keywordMatchType(QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType keywordMatchType) {
    
    this.keywordMatchType = keywordMatchType;
    return this;
  }

   /**
   * Get keywordMatchType
   * @return keywordMatchType
  **/
  @javax.annotation.Nullable
  public QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }


  public void setKeywordMatchType(QianchuanKeywordPackageGetV10DataWordPackageInfosKeywordInfosKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner keywordName(String keywordName) {
    
    this.keywordName = keywordName;
    return this;
  }

   /**
   * 
   * @return keywordName
  **/
  @javax.annotation.Nullable
  public String getKeywordName() {
    return keywordName;
  }


  public void setKeywordName(String keywordName) {
    this.keywordName = keywordName;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner searchSum(Long searchSum) {
    
    this.searchSum = searchSum;
    return this;
  }

   /**
   * 
   * @return searchSum
  **/
  @javax.annotation.Nullable
  public Long getSearchSum() {
    return searchSum;
  }


  public void setSearchSum(Long searchSum) {
    this.searchSum = searchSum;
  }


  public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner wordPackageName(String wordPackageName) {
    
    this.wordPackageName = wordPackageName;
    return this;
  }

   /**
   * 
   * @return wordPackageName
  **/
  @javax.annotation.Nullable
  public String getWordPackageName() {
    return wordPackageName;
  }


  public void setWordPackageName(String wordPackageName) {
    this.wordPackageName = wordPackageName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner = (QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner) o;
    return Objects.equals(this.degree, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.degree) &&
        Objects.equals(this.keywordId, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.keywordId) &&
        Objects.equals(this.keywordMatchType, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.keywordMatchType) &&
        Objects.equals(this.keywordName, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.keywordName) &&
        Objects.equals(this.searchSum, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.searchSum) &&
        Objects.equals(this.wordPackageName, qianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.wordPackageName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(degree, keywordId, keywordMatchType, keywordName, searchSum, wordPackageName);
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
    sb.append("class QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner {\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    keywordMatchType: ").append(toIndentedString(keywordMatchType)).append("\n");
    sb.append("    keywordName: ").append(toIndentedString(keywordName)).append("\n");
    sb.append("    searchSum: ").append(toIndentedString(searchSum)).append("\n");
    sb.append("    wordPackageName: ").append(toIndentedString(wordPackageName)).append("\n");
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
    openapiFields.add("degree");
    openapiFields.add("keyword_id");
    openapiFields.add("keyword_match_type");
    openapiFields.add("keyword_name");
    openapiFields.add("search_sum");
    openapiFields.add("word_package_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("keyword_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner
  */
  public static QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanKeywordPackageGetV10ResponseDataWordPackageInfosInnerKeywordInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

