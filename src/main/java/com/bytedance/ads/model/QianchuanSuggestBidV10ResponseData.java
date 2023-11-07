/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class QianchuanSuggestBidV10ResponseData {
  public static final String SERIALIZED_NAME_SUGGEST_BID_HIGH = "suggest_bid_high";
  @SerializedName(SERIALIZED_NAME_SUGGEST_BID_HIGH)
  private Double suggestBidHigh = null;

  public static final String SERIALIZED_NAME_SUGGEST_BID_LOW = "suggest_bid_low";
  @SerializedName(SERIALIZED_NAME_SUGGEST_BID_LOW)
  private Double suggestBidLow = null;

  public QianchuanSuggestBidV10ResponseData() {
  }

  public QianchuanSuggestBidV10ResponseData suggestBidHigh(Double suggestBidHigh) {
    
    this.suggestBidHigh = suggestBidHigh;
    return this;
  }

   /**
   * 
   * @return suggestBidHigh
  **/
  @javax.annotation.Nullable
  public Double getSuggestBidHigh() {
    return suggestBidHigh;
  }


  public void setSuggestBidHigh(Double suggestBidHigh) {
    this.suggestBidHigh = suggestBidHigh;
  }


  public QianchuanSuggestBidV10ResponseData suggestBidLow(Double suggestBidLow) {
    
    this.suggestBidLow = suggestBidLow;
    return this;
  }

   /**
   * 
   * @return suggestBidLow
  **/
  @javax.annotation.Nullable
  public Double getSuggestBidLow() {
    return suggestBidLow;
  }


  public void setSuggestBidLow(Double suggestBidLow) {
    this.suggestBidLow = suggestBidLow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanSuggestBidV10ResponseData qianchuanSuggestBidV10ResponseData = (QianchuanSuggestBidV10ResponseData) o;
    return Objects.equals(this.suggestBidHigh, qianchuanSuggestBidV10ResponseData.suggestBidHigh) &&
        Objects.equals(this.suggestBidLow, qianchuanSuggestBidV10ResponseData.suggestBidLow);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestBidHigh, suggestBidLow);
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
    sb.append("class QianchuanSuggestBidV10ResponseData {\n");
    sb.append("    suggestBidHigh: ").append(toIndentedString(suggestBidHigh)).append("\n");
    sb.append("    suggestBidLow: ").append(toIndentedString(suggestBidLow)).append("\n");
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
    openapiFields.add("suggest_bid_high");
    openapiFields.add("suggest_bid_low");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanSuggestBidV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanSuggestBidV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanSuggestBidV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanSuggestBidV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanSuggestBidV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanSuggestBidV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanSuggestBidV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanSuggestBidV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanSuggestBidV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanSuggestBidV10ResponseData
  */
  public static QianchuanSuggestBidV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanSuggestBidV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanSuggestBidV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

