/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdRecommendKeywordsGetV10FilteringSuggestReason;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QianchuanAdRecommendKeywordsGetV10Filtering {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_SEARCH_WORD = "search_word";
  @SerializedName(SERIALIZED_NAME_SEARCH_WORD)
  private String searchWord = null;

  public static final String SERIALIZED_NAME_SUGGEST_REASON = "suggest_reason";
  @SerializedName(SERIALIZED_NAME_SUGGEST_REASON)
  private QianchuanAdRecommendKeywordsGetV10FilteringSuggestReason suggestReason = null;

  public QianchuanAdRecommendKeywordsGetV10Filtering() {
  }

  public QianchuanAdRecommendKeywordsGetV10Filtering awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音id，与计划创建时设置的抖音ID一致 注：PC侧创建「直播带货」搜索广告时，默认根据aweme_id获取推荐关键
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAdRecommendKeywordsGetV10Filtering productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品ID，此参数用于获取与商品更为相关的关键词推荐 注：PC侧创建「短视频带货」搜索广告时，默认根据product_id获取推荐关键
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanAdRecommendKeywordsGetV10Filtering searchWord(String searchWord) {
    
    this.searchWord = searchWord;
    return this;
  }

   /**
   * 词根
   * @return searchWord
  **/
  @javax.annotation.Nullable
  public String getSearchWord() {
    return searchWord;
  }


  public void setSearchWord(String searchWord) {
    this.searchWord = searchWord;
  }


  public QianchuanAdRecommendKeywordsGetV10Filtering suggestReason(QianchuanAdRecommendKeywordsGetV10FilteringSuggestReason suggestReason) {
    
    this.suggestReason = suggestReason;
    return this;
  }

   /**
   * Get suggestReason
   * @return suggestReason
  **/
  @javax.annotation.Nullable
  public QianchuanAdRecommendKeywordsGetV10FilteringSuggestReason getSuggestReason() {
    return suggestReason;
  }


  public void setSuggestReason(QianchuanAdRecommendKeywordsGetV10FilteringSuggestReason suggestReason) {
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
    QianchuanAdRecommendKeywordsGetV10Filtering qianchuanAdRecommendKeywordsGetV10Filtering = (QianchuanAdRecommendKeywordsGetV10Filtering) o;
    return Objects.equals(this.awemeId, qianchuanAdRecommendKeywordsGetV10Filtering.awemeId) &&
        Objects.equals(this.productId, qianchuanAdRecommendKeywordsGetV10Filtering.productId) &&
        Objects.equals(this.searchWord, qianchuanAdRecommendKeywordsGetV10Filtering.searchWord) &&
        Objects.equals(this.suggestReason, qianchuanAdRecommendKeywordsGetV10Filtering.suggestReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, productId, searchWord, suggestReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdRecommendKeywordsGetV10Filtering {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    searchWord: ").append(toIndentedString(searchWord)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("product_id");
    openapiFields.add("search_word");
    openapiFields.add("suggest_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdRecommendKeywordsGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdRecommendKeywordsGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdRecommendKeywordsGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdRecommendKeywordsGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdRecommendKeywordsGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanAdRecommendKeywordsGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdRecommendKeywordsGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdRecommendKeywordsGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdRecommendKeywordsGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdRecommendKeywordsGetV10Filtering
  */
  public static QianchuanAdRecommendKeywordsGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdRecommendKeywordsGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanAdRecommendKeywordsGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

