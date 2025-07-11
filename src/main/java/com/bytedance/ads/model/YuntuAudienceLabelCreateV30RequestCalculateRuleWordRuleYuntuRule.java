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
 * 云图的关键词规则协议。
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule {
  public static final String SERIALIZED_NAME_KEYWORDS_LIST = "keywords_list";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_LIST)
  private List<List<String>> keywordsList = null;

  public static final String SERIALIZED_NAME_KEYWORDS_MERGE_RULE = "keywords_merge_rule";
  @SerializedName(SERIALIZED_NAME_KEYWORDS_MERGE_RULE)
  private String keywordsMergeRule = null;

  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule() {
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule keywordsList(List<List<String>> keywordsList) {
    
    this.keywordsList = keywordsList;
    return this;
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule addKeywordsListItem(List<String> keywordsListItem) {
    if (this.keywordsList == null) {
      this.keywordsList = new ArrayList<>();
    }
    this.keywordsList.add(keywordsListItem);
    return this;
  }

   /**
   * 关键词池列表。二维数组，列表中每个元素为一个字符串数组，每个字符串数组代表一个关键词池。
   * @return keywordsList
  **/
  @javax.annotation.Nonnull
  public List<List<String>> getKeywordsList() {
    return keywordsList;
  }


  public void setKeywordsList(List<List<String>> keywordsList) {
    this.keywordsList = keywordsList;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule keywordsMergeRule(String keywordsMergeRule) {
    
    this.keywordsMergeRule = keywordsMergeRule;
    return this;
  }

   /**
   * 关键词池间合并规则，&amp;代表池间交集，~代表池间差集，交差关系不存在层级。数字下标由0开始，单调递增至 keywords_list 长度 - 1。
   * @return keywordsMergeRule
  **/
  @javax.annotation.Nonnull
  public String getKeywordsMergeRule() {
    return keywordsMergeRule;
  }


  public void setKeywordsMergeRule(String keywordsMergeRule) {
    this.keywordsMergeRule = keywordsMergeRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule yuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule = (YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule) o;
    return Objects.equals(this.keywordsList, yuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule.keywordsList) &&
        Objects.equals(this.keywordsMergeRule, yuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule.keywordsMergeRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordsList, keywordsMergeRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule {\n");
    sb.append("    keywordsList: ").append(toIndentedString(keywordsList)).append("\n");
    sb.append("    keywordsMergeRule: ").append(toIndentedString(keywordsMergeRule)).append("\n");
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
    openapiFields.add("keywords_list");
    openapiFields.add("keywords_merge_rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("keywords_list");
    openapiRequiredFields.add("keywords_merge_rule");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule
  */
  public static YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule.class);
  }

 /**
  * Convert an instance of YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

