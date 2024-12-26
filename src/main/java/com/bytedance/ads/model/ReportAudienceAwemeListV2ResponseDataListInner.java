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
 * ReportAudienceAwemeListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ReportAudienceAwemeListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIENCE_LEVEL = "audience_level";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_LEVEL)
  private String audienceLevel = null;

  public static final String SERIALIZED_NAME_LABEL_NAME = "label_name";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME)
  private String labelName = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Object metrics = null;

  public static final String SERIALIZED_NAME_SUPERIOR_LABEL_NAME = "superior_label_name";
  @SerializedName(SERIALIZED_NAME_SUPERIOR_LABEL_NAME)
  private String superiorLabelName = null;

  public ReportAudienceAwemeListV2ResponseDataListInner() {
  }

  public ReportAudienceAwemeListV2ResponseDataListInner audienceLevel(String audienceLevel) {
    
    this.audienceLevel = audienceLevel;
    return this;
  }

   /**
   * 
   * @return audienceLevel
  **/
  @javax.annotation.Nullable
  public String getAudienceLevel() {
    return audienceLevel;
  }


  public void setAudienceLevel(String audienceLevel) {
    this.audienceLevel = audienceLevel;
  }


  public ReportAudienceAwemeListV2ResponseDataListInner labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * 
   * @return labelName
  **/
  @javax.annotation.Nullable
  public String getLabelName() {
    return labelName;
  }


  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  public ReportAudienceAwemeListV2ResponseDataListInner metrics(Object metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * 
   * @return metrics
  **/
  @javax.annotation.Nullable
  public Object getMetrics() {
    return metrics;
  }


  public void setMetrics(Object metrics) {
    this.metrics = metrics;
  }


  public ReportAudienceAwemeListV2ResponseDataListInner superiorLabelName(String superiorLabelName) {
    
    this.superiorLabelName = superiorLabelName;
    return this;
  }

   /**
   * 
   * @return superiorLabelName
  **/
  @javax.annotation.Nullable
  public String getSuperiorLabelName() {
    return superiorLabelName;
  }


  public void setSuperiorLabelName(String superiorLabelName) {
    this.superiorLabelName = superiorLabelName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAudienceAwemeListV2ResponseDataListInner reportAudienceAwemeListV2ResponseDataListInner = (ReportAudienceAwemeListV2ResponseDataListInner) o;
    return Objects.equals(this.audienceLevel, reportAudienceAwemeListV2ResponseDataListInner.audienceLevel) &&
        Objects.equals(this.labelName, reportAudienceAwemeListV2ResponseDataListInner.labelName) &&
        Objects.equals(this.metrics, reportAudienceAwemeListV2ResponseDataListInner.metrics) &&
        Objects.equals(this.superiorLabelName, reportAudienceAwemeListV2ResponseDataListInner.superiorLabelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceLevel, labelName, metrics, superiorLabelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAudienceAwemeListV2ResponseDataListInner {\n");
    sb.append("    audienceLevel: ").append(toIndentedString(audienceLevel)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    superiorLabelName: ").append(toIndentedString(superiorLabelName)).append("\n");
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
    openapiFields.add("audience_level");
    openapiFields.add("label_name");
    openapiFields.add("metrics");
    openapiFields.add("superior_label_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAudienceAwemeListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAudienceAwemeListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAudienceAwemeListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAudienceAwemeListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAudienceAwemeListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportAudienceAwemeListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAudienceAwemeListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAudienceAwemeListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAudienceAwemeListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportAudienceAwemeListV2ResponseDataListInner
  */
  public static ReportAudienceAwemeListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAudienceAwemeListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportAudienceAwemeListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

