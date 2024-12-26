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
 * QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner {
  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_SEARCH_KEYWORD = "search_keyword";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEYWORD)
  private String searchKeyword = null;

  public QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner() {
  }

  public QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner errorMessage(String errorMessage) {
    
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


  public QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner searchKeyword(String searchKeyword) {
    
    this.searchKeyword = searchKeyword;
    return this;
  }

   /**
   * 
   * @return searchKeyword
  **/
  @javax.annotation.Nullable
  public String getSearchKeyword() {
    return searchKeyword;
  }


  public void setSearchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner qianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner = (QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner) o;
    return Objects.equals(this.errorMessage, qianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner.errorMessage) &&
        Objects.equals(this.searchKeyword, qianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner.searchKeyword);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, searchKeyword);
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
    sb.append("class QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
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
    openapiFields.add("search_keyword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner
  */
  public static QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

