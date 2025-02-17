/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10FilteringExternalAction;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10FilteringMarketingGoal;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QianchuanAwemeReportOrderGetV10Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAwemeReportOrderGetV10FilteringExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAwemeReportOrderGetV10FilteringMarketingGoal marketingGoal = null;

  public QianchuanAwemeReportOrderGetV10Filtering() {
  }

  public QianchuanAwemeReportOrderGetV10Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanAwemeReportOrderGetV10Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 计划id列表，最多1000
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public QianchuanAwemeReportOrderGetV10Filtering externalAction(QianchuanAwemeReportOrderGetV10FilteringExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeReportOrderGetV10FilteringExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAwemeReportOrderGetV10FilteringExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAwemeReportOrderGetV10Filtering marketingGoal(QianchuanAwemeReportOrderGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeReportOrderGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAwemeReportOrderGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeReportOrderGetV10Filtering qianchuanAwemeReportOrderGetV10Filtering = (QianchuanAwemeReportOrderGetV10Filtering) o;
    return Objects.equals(this.adIds, qianchuanAwemeReportOrderGetV10Filtering.adIds) &&
        Objects.equals(this.externalAction, qianchuanAwemeReportOrderGetV10Filtering.externalAction) &&
        Objects.equals(this.marketingGoal, qianchuanAwemeReportOrderGetV10Filtering.marketingGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, externalAction, marketingGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeReportOrderGetV10Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("external_action");
    openapiFields.add("marketing_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeReportOrderGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeReportOrderGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeReportOrderGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeReportOrderGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeReportOrderGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeReportOrderGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeReportOrderGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeReportOrderGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeReportOrderGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeReportOrderGetV10Filtering
  */
  public static QianchuanAwemeReportOrderGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeReportOrderGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanAwemeReportOrderGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

