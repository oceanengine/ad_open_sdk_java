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
import com.bytedance.ads.model.ReportCustomAsyncTaskGetV30DataListDataTopic;
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
 * ReportCustomAsyncTaskGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ReportCustomAsyncTaskGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_DATA_TOPIC = "data_topic";
  @SerializedName(SERIALIZED_NAME_DATA_TOPIC)
  private ReportCustomAsyncTaskGetV30DataListDataTopic dataTopic = null;

  public ReportCustomAsyncTaskGetV30ResponseDataListInner() {
  }

  public ReportCustomAsyncTaskGetV30ResponseDataListInner dataTopic(ReportCustomAsyncTaskGetV30DataListDataTopic dataTopic) {
    
    this.dataTopic = dataTopic;
    return this;
  }

   /**
   * Get dataTopic
   * @return dataTopic
  **/
  @javax.annotation.Nullable
  public ReportCustomAsyncTaskGetV30DataListDataTopic getDataTopic() {
    return dataTopic;
  }


  public void setDataTopic(ReportCustomAsyncTaskGetV30DataListDataTopic dataTopic) {
    this.dataTopic = dataTopic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomAsyncTaskGetV30ResponseDataListInner reportCustomAsyncTaskGetV30ResponseDataListInner = (ReportCustomAsyncTaskGetV30ResponseDataListInner) o;
    return Objects.equals(this.dataTopic, reportCustomAsyncTaskGetV30ResponseDataListInner.dataTopic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTopic);
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
    sb.append("class ReportCustomAsyncTaskGetV30ResponseDataListInner {\n");
    sb.append("    dataTopic: ").append(toIndentedString(dataTopic)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomAsyncTaskGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomAsyncTaskGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomAsyncTaskGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomAsyncTaskGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomAsyncTaskGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomAsyncTaskGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomAsyncTaskGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomAsyncTaskGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomAsyncTaskGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomAsyncTaskGetV30ResponseDataListInner
  */
  public static ReportCustomAsyncTaskGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomAsyncTaskGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportCustomAsyncTaskGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

