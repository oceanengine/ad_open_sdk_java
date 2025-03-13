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
import com.bytedance.ads.model.ReportAudienceGenderV2ResponseDataMetricsDict;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ReportAudienceGenderV2ResponseData {
  public static final String SERIALIZED_NAME_GENDER_NAME = "gender_name";
  @SerializedName(SERIALIZED_NAME_GENDER_NAME)
  private String genderName = null;

  public static final String SERIALIZED_NAME_METRICS_DICT = "metrics_dict";
  @SerializedName(SERIALIZED_NAME_METRICS_DICT)
  private ReportAudienceGenderV2ResponseDataMetricsDict metricsDict = null;

  public ReportAudienceGenderV2ResponseData() {
  }

  public ReportAudienceGenderV2ResponseData genderName(String genderName) {
    
    this.genderName = genderName;
    return this;
  }

   /**
   * 
   * @return genderName
  **/
  @javax.annotation.Nullable
  public String getGenderName() {
    return genderName;
  }


  public void setGenderName(String genderName) {
    this.genderName = genderName;
  }


  public ReportAudienceGenderV2ResponseData metricsDict(ReportAudienceGenderV2ResponseDataMetricsDict metricsDict) {
    
    this.metricsDict = metricsDict;
    return this;
  }

   /**
   * Get metricsDict
   * @return metricsDict
  **/
  @javax.annotation.Nullable
  public ReportAudienceGenderV2ResponseDataMetricsDict getMetricsDict() {
    return metricsDict;
  }


  public void setMetricsDict(ReportAudienceGenderV2ResponseDataMetricsDict metricsDict) {
    this.metricsDict = metricsDict;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAudienceGenderV2ResponseData reportAudienceGenderV2ResponseData = (ReportAudienceGenderV2ResponseData) o;
    return Objects.equals(this.genderName, reportAudienceGenderV2ResponseData.genderName) &&
        Objects.equals(this.metricsDict, reportAudienceGenderV2ResponseData.metricsDict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genderName, metricsDict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAudienceGenderV2ResponseData {\n");
    sb.append("    genderName: ").append(toIndentedString(genderName)).append("\n");
    sb.append("    metricsDict: ").append(toIndentedString(metricsDict)).append("\n");
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
    openapiFields.add("gender_name");
    openapiFields.add("metrics_dict");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAudienceGenderV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAudienceGenderV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAudienceGenderV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAudienceGenderV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAudienceGenderV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ReportAudienceGenderV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAudienceGenderV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAudienceGenderV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAudienceGenderV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ReportAudienceGenderV2ResponseData
  */
  public static ReportAudienceGenderV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAudienceGenderV2ResponseData.class);
  }

 /**
  * Convert an instance of ReportAudienceGenderV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

