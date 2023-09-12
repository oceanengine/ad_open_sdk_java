/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdUpdateV10ResponseDataNoticeInfosInnerSearchKeywordError;
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
 * QianchuanAdUpdateV10ResponseDataNoticeInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class QianchuanAdUpdateV10ResponseDataNoticeInfosInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_SEARCH_KEYWORD_ERROR = "search_keyword_error";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEYWORD_ERROR)
  private QianchuanAdUpdateV10ResponseDataNoticeInfosInnerSearchKeywordError searchKeywordError = null;

  public QianchuanAdUpdateV10ResponseDataNoticeInfosInner() {
  }

  public QianchuanAdUpdateV10ResponseDataNoticeInfosInner code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nullable
  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public QianchuanAdUpdateV10ResponseDataNoticeInfosInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public QianchuanAdUpdateV10ResponseDataNoticeInfosInner searchKeywordError(QianchuanAdUpdateV10ResponseDataNoticeInfosInnerSearchKeywordError searchKeywordError) {
    
    this.searchKeywordError = searchKeywordError;
    return this;
  }

   /**
   * Get searchKeywordError
   * @return searchKeywordError
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10ResponseDataNoticeInfosInnerSearchKeywordError getSearchKeywordError() {
    return searchKeywordError;
  }


  public void setSearchKeywordError(QianchuanAdUpdateV10ResponseDataNoticeInfosInnerSearchKeywordError searchKeywordError) {
    this.searchKeywordError = searchKeywordError;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10ResponseDataNoticeInfosInner qianchuanAdUpdateV10ResponseDataNoticeInfosInner = (QianchuanAdUpdateV10ResponseDataNoticeInfosInner) o;
    return Objects.equals(this.code, qianchuanAdUpdateV10ResponseDataNoticeInfosInner.code) &&
        Objects.equals(this.message, qianchuanAdUpdateV10ResponseDataNoticeInfosInner.message) &&
        Objects.equals(this.searchKeywordError, qianchuanAdUpdateV10ResponseDataNoticeInfosInner.searchKeywordError);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, searchKeywordError);
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
    sb.append("class QianchuanAdUpdateV10ResponseDataNoticeInfosInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    searchKeywordError: ").append(toIndentedString(searchKeywordError)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("search_keyword_error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10ResponseDataNoticeInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10ResponseDataNoticeInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10ResponseDataNoticeInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10ResponseDataNoticeInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10ResponseDataNoticeInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10ResponseDataNoticeInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10ResponseDataNoticeInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10ResponseDataNoticeInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10ResponseDataNoticeInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10ResponseDataNoticeInfosInner
  */
  public static QianchuanAdUpdateV10ResponseDataNoticeInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10ResponseDataNoticeInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10ResponseDataNoticeInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

