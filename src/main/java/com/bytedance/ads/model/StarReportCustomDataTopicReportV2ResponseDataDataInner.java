/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarReportCustomDataTopicReportV2DataDataDataTopic;
import com.bytedance.ads.model.StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner;
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
 * StarReportCustomDataTopicReportV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class StarReportCustomDataTopicReportV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_DATA_TOPIC = "data_topic";
  @SerializedName(SERIALIZED_NAME_DATA_TOPIC)
  private StarReportCustomDataTopicReportV2DataDataDataTopic dataTopic = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner> metrics = null;

  public StarReportCustomDataTopicReportV2ResponseDataDataInner() {
  }

  public StarReportCustomDataTopicReportV2ResponseDataDataInner dataTopic(StarReportCustomDataTopicReportV2DataDataDataTopic dataTopic) {
    
    this.dataTopic = dataTopic;
    return this;
  }

   /**
   * Get dataTopic
   * @return dataTopic
  **/
  @javax.annotation.Nullable
  public StarReportCustomDataTopicReportV2DataDataDataTopic getDataTopic() {
    return dataTopic;
  }


  public void setDataTopic(StarReportCustomDataTopicReportV2DataDataDataTopic dataTopic) {
    this.dataTopic = dataTopic;
  }


  public StarReportCustomDataTopicReportV2ResponseDataDataInner metrics(List<StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public StarReportCustomDataTopicReportV2ResponseDataDataInner addMetricsItem(StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner metricsItem) {
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
  public List<StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner> metrics) {
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
    StarReportCustomDataTopicReportV2ResponseDataDataInner starReportCustomDataTopicReportV2ResponseDataDataInner = (StarReportCustomDataTopicReportV2ResponseDataDataInner) o;
    return Objects.equals(this.dataTopic, starReportCustomDataTopicReportV2ResponseDataDataInner.dataTopic) &&
        Objects.equals(this.metrics, starReportCustomDataTopicReportV2ResponseDataDataInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTopic, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarReportCustomDataTopicReportV2ResponseDataDataInner {\n");
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
       if (!StarReportCustomDataTopicReportV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportCustomDataTopicReportV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportCustomDataTopicReportV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportCustomDataTopicReportV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportCustomDataTopicReportV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, StarReportCustomDataTopicReportV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportCustomDataTopicReportV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportCustomDataTopicReportV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportCustomDataTopicReportV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to StarReportCustomDataTopicReportV2ResponseDataDataInner
  */
  public static StarReportCustomDataTopicReportV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportCustomDataTopicReportV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of StarReportCustomDataTopicReportV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

