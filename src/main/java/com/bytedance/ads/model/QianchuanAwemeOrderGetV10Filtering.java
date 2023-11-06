/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class QianchuanAwemeOrderGetV10Filtering {
  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAwemeOrderGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanAwemeOrderGetV10FilteringStatus status = null;

  public QianchuanAwemeOrderGetV10Filtering() {
  }

  public QianchuanAwemeOrderGetV10Filtering marketingGoal(QianchuanAwemeOrderGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeOrderGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAwemeOrderGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanAwemeOrderGetV10Filtering status(QianchuanAwemeOrderGetV10FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanAwemeOrderGetV10FilteringStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderGetV10Filtering qianchuanAwemeOrderGetV10Filtering = (QianchuanAwemeOrderGetV10Filtering) o;
    return Objects.equals(this.marketingGoal, qianchuanAwemeOrderGetV10Filtering.marketingGoal) &&
        Objects.equals(this.status, qianchuanAwemeOrderGetV10Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingGoal, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeOrderGetV10Filtering {\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("marketing_goal");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderGetV10Filtering
  */
  public static QianchuanAwemeOrderGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

