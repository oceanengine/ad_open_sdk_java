/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaFeed;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaSearch;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class QianchuanAdQuotaGetV10ResponseData {
  public static final String SERIALIZED_NAME_QUOTA_FEED = "quota_feed";
  @SerializedName(SERIALIZED_NAME_QUOTA_FEED)
  private QianchuanAdQuotaGetV10ResponseDataQuotaFeed quotaFeed = null;

  public static final String SERIALIZED_NAME_QUOTA_SEARCH = "quota_search";
  @SerializedName(SERIALIZED_NAME_QUOTA_SEARCH)
  private QianchuanAdQuotaGetV10ResponseDataQuotaSearch quotaSearch = null;

  public QianchuanAdQuotaGetV10ResponseData() {
  }

  public QianchuanAdQuotaGetV10ResponseData quotaFeed(QianchuanAdQuotaGetV10ResponseDataQuotaFeed quotaFeed) {
    
    this.quotaFeed = quotaFeed;
    return this;
  }

   /**
   * Get quotaFeed
   * @return quotaFeed
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaFeed getQuotaFeed() {
    return quotaFeed;
  }


  public void setQuotaFeed(QianchuanAdQuotaGetV10ResponseDataQuotaFeed quotaFeed) {
    this.quotaFeed = quotaFeed;
  }


  public QianchuanAdQuotaGetV10ResponseData quotaSearch(QianchuanAdQuotaGetV10ResponseDataQuotaSearch quotaSearch) {
    
    this.quotaSearch = quotaSearch;
    return this;
  }

   /**
   * Get quotaSearch
   * @return quotaSearch
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaSearch getQuotaSearch() {
    return quotaSearch;
  }


  public void setQuotaSearch(QianchuanAdQuotaGetV10ResponseDataQuotaSearch quotaSearch) {
    this.quotaSearch = quotaSearch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdQuotaGetV10ResponseData qianchuanAdQuotaGetV10ResponseData = (QianchuanAdQuotaGetV10ResponseData) o;
    return Objects.equals(this.quotaFeed, qianchuanAdQuotaGetV10ResponseData.quotaFeed) &&
        Objects.equals(this.quotaSearch, qianchuanAdQuotaGetV10ResponseData.quotaSearch);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotaFeed, quotaSearch);
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
    sb.append("class QianchuanAdQuotaGetV10ResponseData {\n");
    sb.append("    quotaFeed: ").append(toIndentedString(quotaFeed)).append("\n");
    sb.append("    quotaSearch: ").append(toIndentedString(quotaSearch)).append("\n");
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
    openapiFields.add("quota_feed");
    openapiFields.add("quota_search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdQuotaGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdQuotaGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdQuotaGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdQuotaGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdQuotaGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAdQuotaGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdQuotaGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdQuotaGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdQuotaGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdQuotaGetV10ResponseData
  */
  public static QianchuanAdQuotaGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdQuotaGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAdQuotaGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

