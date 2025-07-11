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
import com.bytedance.ads.model.ToolsCommentTermsBannedGetV30ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsCommentTermsBannedGetV30ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsCommentTermsBannedGetV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private List<String> terms = null;

  public ToolsCommentTermsBannedGetV30ResponseData() {
  }

  public ToolsCommentTermsBannedGetV30ResponseData pageInfo(ToolsCommentTermsBannedGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsCommentTermsBannedGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsCommentTermsBannedGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ToolsCommentTermsBannedGetV30ResponseData terms(List<String> terms) {
    
    this.terms = terms;
    return this;
  }

  public ToolsCommentTermsBannedGetV30ResponseData addTermsItem(String termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<>();
    }
    this.terms.add(termsItem);
    return this;
  }

   /**
   * 屏蔽词列表
   * @return terms
  **/
  @javax.annotation.Nullable
  public List<String> getTerms() {
    return terms;
  }


  public void setTerms(List<String> terms) {
    this.terms = terms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentTermsBannedGetV30ResponseData toolsCommentTermsBannedGetV30ResponseData = (ToolsCommentTermsBannedGetV30ResponseData) o;
    return Objects.equals(this.pageInfo, toolsCommentTermsBannedGetV30ResponseData.pageInfo) &&
        Objects.equals(this.terms, toolsCommentTermsBannedGetV30ResponseData.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentTermsBannedGetV30ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("terms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page_info");
    openapiRequiredFields.add("terms");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentTermsBannedGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentTermsBannedGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentTermsBannedGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentTermsBannedGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentTermsBannedGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsCommentTermsBannedGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentTermsBannedGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentTermsBannedGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentTermsBannedGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentTermsBannedGetV30ResponseData
  */
  public static ToolsCommentTermsBannedGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentTermsBannedGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsCommentTermsBannedGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

