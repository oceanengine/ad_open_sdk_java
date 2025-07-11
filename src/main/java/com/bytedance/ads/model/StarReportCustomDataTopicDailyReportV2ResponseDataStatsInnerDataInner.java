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
import com.bytedance.ads.model.StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic;
import com.bytedance.ads.model.StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInnerMetricsInner;
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
 * StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner {
  public static final String SERIALIZED_NAME_DATA_TOPIC = "data_topic";
  @SerializedName(SERIALIZED_NAME_DATA_TOPIC)
  private StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic dataTopic = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInnerMetricsInner> metrics = null;

  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner() {
  }

  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner dataTopic(StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic dataTopic) {
    
    this.dataTopic = dataTopic;
    return this;
  }

   /**
   * Get dataTopic
   * @return dataTopic
  **/
  @javax.annotation.Nullable
  public StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic getDataTopic() {
    return dataTopic;
  }


  public void setDataTopic(StarReportCustomDataTopicDailyReportV2DataStatsDataDataTopic dataTopic) {
    this.dataTopic = dataTopic;
  }


  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner metrics(List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInnerMetricsInner> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner addMetricsItem(StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInnerMetricsInner metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * 数据主题下的数据指标，一个数据主题对应一个或多个数据指标。不存在的数据指标将缺省。
   * @return metrics
  **/
  @javax.annotation.Nullable
  public List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInnerMetricsInner> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInnerMetricsInner> metrics) {
    this.metrics = metrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner starReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner = (StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner) o;
    return Objects.equals(this.dataTopic, starReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner.dataTopic) &&
        Objects.equals(this.metrics, starReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTopic, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner {\n");
    sb.append("    dataTopic: ").append(toIndentedString(dataTopic)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    openapiFields.add("data_topic");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data_topic");
    openapiRequiredFields.add("metrics");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner>() {
           @Override
           public void write(JsonWriter out, StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner
  * @throws IOException if the JSON string is invalid with respect to StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner
  */
  public static StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner.class);
  }

 /**
  * Convert an instance of StarReportCustomDataTopicDailyReportV2ResponseDataStatsInnerDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

