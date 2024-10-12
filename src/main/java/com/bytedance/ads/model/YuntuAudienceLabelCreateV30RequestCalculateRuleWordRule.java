/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule;
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
 * 关键词规则。
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule {
  public static final String SERIALIZED_NAME_YUNTU_RULE = "yuntu_rule";
  @SerializedName(SERIALIZED_NAME_YUNTU_RULE)
  private YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule yuntuRule = null;

  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule() {
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule yuntuRule(YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule yuntuRule) {
    
    this.yuntuRule = yuntuRule;
    return this;
  }

   /**
   * Get yuntuRule
   * @return yuntuRule
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule getYuntuRule() {
    return yuntuRule;
  }


  public void setYuntuRule(YuntuAudienceLabelCreateV30RequestCalculateRuleWordRuleYuntuRule yuntuRule) {
    this.yuntuRule = yuntuRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule yuntuAudienceLabelCreateV30RequestCalculateRuleWordRule = (YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule) o;
    return Objects.equals(this.yuntuRule, yuntuAudienceLabelCreateV30RequestCalculateRuleWordRule.yuntuRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yuntuRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule {\n");
    sb.append("    yuntuRule: ").append(toIndentedString(yuntuRule)).append("\n");
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
    openapiFields.add("yuntu_rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("yuntu_rule");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule
  */
  public static YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule.class);
  }

 /**
  * Convert an instance of YuntuAudienceLabelCreateV30RequestCalculateRuleWordRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

