/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ClueCouponUpdateV2RequestUserLimit {
  public static final String SERIALIZED_NAME_DAY_LIMIT = "day_limit";
  @SerializedName(SERIALIZED_NAME_DAY_LIMIT)
  private Long dayLimit = null;

  public static final String SERIALIZED_NAME_TOTAL_LIMIT = "total_limit";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIMIT)
  private Long totalLimit = null;

  public ClueCouponUpdateV2RequestUserLimit() {
  }

  public ClueCouponUpdateV2RequestUserLimit dayLimit(Long dayLimit) {
    
    this.dayLimit = dayLimit;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 2147483647
   * @return dayLimit
  **/
  @javax.annotation.Nullable
  public Long getDayLimit() {
    return dayLimit;
  }


  public void setDayLimit(Long dayLimit) {
    this.dayLimit = dayLimit;
  }


  public ClueCouponUpdateV2RequestUserLimit totalLimit(Long totalLimit) {
    
    this.totalLimit = totalLimit;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 2147483647
   * @return totalLimit
  **/
  @javax.annotation.Nullable
  public Long getTotalLimit() {
    return totalLimit;
  }


  public void setTotalLimit(Long totalLimit) {
    this.totalLimit = totalLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponUpdateV2RequestUserLimit clueCouponUpdateV2RequestUserLimit = (ClueCouponUpdateV2RequestUserLimit) o;
    return Objects.equals(this.dayLimit, clueCouponUpdateV2RequestUserLimit.dayLimit) &&
        Objects.equals(this.totalLimit, clueCouponUpdateV2RequestUserLimit.totalLimit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayLimit, totalLimit);
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
    sb.append("class ClueCouponUpdateV2RequestUserLimit {\n");
    sb.append("    dayLimit: ").append(toIndentedString(dayLimit)).append("\n");
    sb.append("    totalLimit: ").append(toIndentedString(totalLimit)).append("\n");
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
    openapiFields.add("day_limit");
    openapiFields.add("total_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponUpdateV2RequestUserLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponUpdateV2RequestUserLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponUpdateV2RequestUserLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponUpdateV2RequestUserLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponUpdateV2RequestUserLimit>() {
           @Override
           public void write(JsonWriter out, ClueCouponUpdateV2RequestUserLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponUpdateV2RequestUserLimit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponUpdateV2RequestUserLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponUpdateV2RequestUserLimit
  * @throws IOException if the JSON string is invalid with respect to ClueCouponUpdateV2RequestUserLimit
  */
  public static ClueCouponUpdateV2RequestUserLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponUpdateV2RequestUserLimit.class);
  }

 /**
  * Convert an instance of ClueCouponUpdateV2RequestUserLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

