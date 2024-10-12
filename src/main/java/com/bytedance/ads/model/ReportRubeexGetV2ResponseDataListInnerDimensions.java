/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ReportRubeexGetV2ResponseDataListInnerDimensions {
  public static final String SERIALIZED_NAME_CURRENT_SECTION = "current_section";
  @SerializedName(SERIALIZED_NAME_CURRENT_SECTION)
  private String currentSection = null;

  public static final String SERIALIZED_NAME_DATA_MD5 = "data_md5";
  @SerializedName(SERIALIZED_NAME_DATA_MD5)
  private String dataMd5 = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NEXT_SECTION = "next_section";
  @SerializedName(SERIALIZED_NAME_NEXT_SECTION)
  private String nextSection = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId = null;

  public static final String SERIALIZED_NAME_STAT_TIME_DAY = "stat_time_day";
  @SerializedName(SERIALIZED_NAME_STAT_TIME_DAY)
  private String statTimeDay = null;

  public ReportRubeexGetV2ResponseDataListInnerDimensions() {
  }

  public ReportRubeexGetV2ResponseDataListInnerDimensions currentSection(String currentSection) {
    
    this.currentSection = currentSection;
    return this;
  }

   /**
   * 
   * @return currentSection
  **/
  @javax.annotation.Nullable
  public String getCurrentSection() {
    return currentSection;
  }


  public void setCurrentSection(String currentSection) {
    this.currentSection = currentSection;
  }


  public ReportRubeexGetV2ResponseDataListInnerDimensions dataMd5(String dataMd5) {
    
    this.dataMd5 = dataMd5;
    return this;
  }

   /**
   * 
   * @return dataMd5
  **/
  @javax.annotation.Nullable
  public String getDataMd5() {
    return dataMd5;
  }


  public void setDataMd5(String dataMd5) {
    this.dataMd5 = dataMd5;
  }


  public ReportRubeexGetV2ResponseDataListInnerDimensions name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReportRubeexGetV2ResponseDataListInnerDimensions nextSection(String nextSection) {
    
    this.nextSection = nextSection;
    return this;
  }

   /**
   * 
   * @return nextSection
  **/
  @javax.annotation.Nullable
  public String getNextSection() {
    return nextSection;
  }


  public void setNextSection(String nextSection) {
    this.nextSection = nextSection;
  }


  public ReportRubeexGetV2ResponseDataListInnerDimensions playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public ReportRubeexGetV2ResponseDataListInnerDimensions projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ReportRubeexGetV2ResponseDataListInnerDimensions statTimeDay(String statTimeDay) {
    
    this.statTimeDay = statTimeDay;
    return this;
  }

   /**
   * 
   * @return statTimeDay
  **/
  @javax.annotation.Nullable
  public String getStatTimeDay() {
    return statTimeDay;
  }


  public void setStatTimeDay(String statTimeDay) {
    this.statTimeDay = statTimeDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRubeexGetV2ResponseDataListInnerDimensions reportRubeexGetV2ResponseDataListInnerDimensions = (ReportRubeexGetV2ResponseDataListInnerDimensions) o;
    return Objects.equals(this.currentSection, reportRubeexGetV2ResponseDataListInnerDimensions.currentSection) &&
        Objects.equals(this.dataMd5, reportRubeexGetV2ResponseDataListInnerDimensions.dataMd5) &&
        Objects.equals(this.name, reportRubeexGetV2ResponseDataListInnerDimensions.name) &&
        Objects.equals(this.nextSection, reportRubeexGetV2ResponseDataListInnerDimensions.nextSection) &&
        Objects.equals(this.playableUrl, reportRubeexGetV2ResponseDataListInnerDimensions.playableUrl) &&
        Objects.equals(this.projectId, reportRubeexGetV2ResponseDataListInnerDimensions.projectId) &&
        Objects.equals(this.statTimeDay, reportRubeexGetV2ResponseDataListInnerDimensions.statTimeDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentSection, dataMd5, name, nextSection, playableUrl, projectId, statTimeDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRubeexGetV2ResponseDataListInnerDimensions {\n");
    sb.append("    currentSection: ").append(toIndentedString(currentSection)).append("\n");
    sb.append("    dataMd5: ").append(toIndentedString(dataMd5)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextSection: ").append(toIndentedString(nextSection)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    statTimeDay: ").append(toIndentedString(statTimeDay)).append("\n");
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
    openapiFields.add("current_section");
    openapiFields.add("data_md5");
    openapiFields.add("name");
    openapiFields.add("next_section");
    openapiFields.add("playable_url");
    openapiFields.add("project_id");
    openapiFields.add("stat_time_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRubeexGetV2ResponseDataListInnerDimensions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRubeexGetV2ResponseDataListInnerDimensions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRubeexGetV2ResponseDataListInnerDimensions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRubeexGetV2ResponseDataListInnerDimensions.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRubeexGetV2ResponseDataListInnerDimensions>() {
           @Override
           public void write(JsonWriter out, ReportRubeexGetV2ResponseDataListInnerDimensions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRubeexGetV2ResponseDataListInnerDimensions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRubeexGetV2ResponseDataListInnerDimensions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRubeexGetV2ResponseDataListInnerDimensions
  * @throws IOException if the JSON string is invalid with respect to ReportRubeexGetV2ResponseDataListInnerDimensions
  */
  public static ReportRubeexGetV2ResponseDataListInnerDimensions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRubeexGetV2ResponseDataListInnerDimensions.class);
  }

 /**
  * Convert an instance of ReportRubeexGetV2ResponseDataListInnerDimensions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

