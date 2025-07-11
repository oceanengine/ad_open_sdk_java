/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdRecommendKeywordsGetV10DataListSuggestReason;
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
 * QianchuanAdRecommendKeywordsGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanAdRecommendKeywordsGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private Long degree = null;

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private String keyword = null;

  public static final String SERIALIZED_NAME_SEARCH_SUM = "search_sum";
  @SerializedName(SERIALIZED_NAME_SEARCH_SUM)
  private Long searchSum = null;

  public static final String SERIALIZED_NAME_SUGGEST_REASON = "suggest_reason";
  @SerializedName(SERIALIZED_NAME_SUGGEST_REASON)
  private QianchuanAdRecommendKeywordsGetV10DataListSuggestReason suggestReason = null;

  public QianchuanAdRecommendKeywordsGetV10ResponseDataListInner() {
  }

  public QianchuanAdRecommendKeywordsGetV10ResponseDataListInner degree(Long degree) {
    
    this.degree = degree;
    return this;
  }

   /**
   * 竞争程度
   * @return degree
  **/
  @javax.annotation.Nullable
  public Long getDegree() {
    return degree;
  }


  public void setDegree(Long degree) {
    this.degree = degree;
  }


  public QianchuanAdRecommendKeywordsGetV10ResponseDataListInner keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * 关键词
   * @return keyword
  **/
  @javax.annotation.Nullable
  public String getKeyword() {
    return keyword;
  }


  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public QianchuanAdRecommendKeywordsGetV10ResponseDataListInner searchSum(Long searchSum) {
    
    this.searchSum = searchSum;
    return this;
  }

   /**
   * 月搜索量
   * @return searchSum
  **/
  @javax.annotation.Nullable
  public Long getSearchSum() {
    return searchSum;
  }


  public void setSearchSum(Long searchSum) {
    this.searchSum = searchSum;
  }


  public QianchuanAdRecommendKeywordsGetV10ResponseDataListInner suggestReason(QianchuanAdRecommendKeywordsGetV10DataListSuggestReason suggestReason) {
    
    this.suggestReason = suggestReason;
    return this;
  }

   /**
   * Get suggestReason
   * @return suggestReason
  **/
  @javax.annotation.Nullable
  public QianchuanAdRecommendKeywordsGetV10DataListSuggestReason getSuggestReason() {
    return suggestReason;
  }


  public void setSuggestReason(QianchuanAdRecommendKeywordsGetV10DataListSuggestReason suggestReason) {
    this.suggestReason = suggestReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdRecommendKeywordsGetV10ResponseDataListInner qianchuanAdRecommendKeywordsGetV10ResponseDataListInner = (QianchuanAdRecommendKeywordsGetV10ResponseDataListInner) o;
    return Objects.equals(this.degree, qianchuanAdRecommendKeywordsGetV10ResponseDataListInner.degree) &&
        Objects.equals(this.keyword, qianchuanAdRecommendKeywordsGetV10ResponseDataListInner.keyword) &&
        Objects.equals(this.searchSum, qianchuanAdRecommendKeywordsGetV10ResponseDataListInner.searchSum) &&
        Objects.equals(this.suggestReason, qianchuanAdRecommendKeywordsGetV10ResponseDataListInner.suggestReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(degree, keyword, searchSum, suggestReason);
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
    sb.append("class QianchuanAdRecommendKeywordsGetV10ResponseDataListInner {\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    searchSum: ").append(toIndentedString(searchSum)).append("\n");
    sb.append("    suggestReason: ").append(toIndentedString(suggestReason)).append("\n");
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
    openapiFields.add("keyword");
    openapiFields.add("search_sum");
    openapiFields.add("suggest_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdRecommendKeywordsGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdRecommendKeywordsGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdRecommendKeywordsGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdRecommendKeywordsGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdRecommendKeywordsGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdRecommendKeywordsGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdRecommendKeywordsGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdRecommendKeywordsGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdRecommendKeywordsGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdRecommendKeywordsGetV10ResponseDataListInner
  */
  public static QianchuanAdRecommendKeywordsGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdRecommendKeywordsGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdRecommendKeywordsGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

