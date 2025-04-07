/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanMaterialGetV10FilteringAnalysisType;
import com.bytedance.ads.model.QianchuanMaterialGetV10FilteringHavingCost;
import com.bytedance.ads.model.QianchuanMaterialGetV10FilteringImageMode;
import com.bytedance.ads.model.QianchuanMaterialGetV10FilteringMaterialType;
import com.bytedance.ads.model.QianchuanMaterialGetV10FilteringVideoSource;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QianchuanMaterialGetV10Filtering {
  public static final String SERIALIZED_NAME_ANALYSIS_TYPE = "analysis_type";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_TYPE)
  private List<QianchuanMaterialGetV10FilteringAnalysisType> analysisType = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_HAVING_COST = "having_cost";
  @SerializedName(SERIALIZED_NAME_HAVING_COST)
  private QianchuanMaterialGetV10FilteringHavingCost havingCost = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private List<QianchuanMaterialGetV10FilteringImageMode> imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private QianchuanMaterialGetV10FilteringMaterialType materialType = null;

  public static final String SERIALIZED_NAME_SEARCH_KEYWORD = "search_keyword";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEYWORD)
  private String searchKeyword = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_SOURCE = "video_source";
  @SerializedName(SERIALIZED_NAME_VIDEO_SOURCE)
  private List<QianchuanMaterialGetV10FilteringVideoSource> videoSource = null;

  public QianchuanMaterialGetV10Filtering() {
  }

  public QianchuanMaterialGetV10Filtering analysisType(List<QianchuanMaterialGetV10FilteringAnalysisType> analysisType) {
    
    this.analysisType = analysisType;
    return this;
  }

  public QianchuanMaterialGetV10Filtering addAnalysisTypeItem(QianchuanMaterialGetV10FilteringAnalysisType analysisTypeItem) {
    if (this.analysisType == null) {
      this.analysisType = new ArrayList<>();
    }
    this.analysisType.add(analysisTypeItem);
    return this;
  }

   /**
   * 
   * @return analysisType
  **/
  @javax.annotation.Nullable
  public List<QianchuanMaterialGetV10FilteringAnalysisType> getAnalysisType() {
    return analysisType;
  }


  public void setAnalysisType(List<QianchuanMaterialGetV10FilteringAnalysisType> analysisType) {
    this.analysisType = analysisType;
  }


  public QianchuanMaterialGetV10Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanMaterialGetV10Filtering havingCost(QianchuanMaterialGetV10FilteringHavingCost havingCost) {
    
    this.havingCost = havingCost;
    return this;
  }

   /**
   * Get havingCost
   * @return havingCost
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10FilteringHavingCost getHavingCost() {
    return havingCost;
  }


  public void setHavingCost(QianchuanMaterialGetV10FilteringHavingCost havingCost) {
    this.havingCost = havingCost;
  }


  public QianchuanMaterialGetV10Filtering imageMode(List<QianchuanMaterialGetV10FilteringImageMode> imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

  public QianchuanMaterialGetV10Filtering addImageModeItem(QianchuanMaterialGetV10FilteringImageMode imageModeItem) {
    if (this.imageMode == null) {
      this.imageMode = new ArrayList<>();
    }
    this.imageMode.add(imageModeItem);
    return this;
  }

   /**
   * 
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public List<QianchuanMaterialGetV10FilteringImageMode> getImageMode() {
    return imageMode;
  }


  public void setImageMode(List<QianchuanMaterialGetV10FilteringImageMode> imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanMaterialGetV10Filtering materialType(QianchuanMaterialGetV10FilteringMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nonnull
  public QianchuanMaterialGetV10FilteringMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(QianchuanMaterialGetV10FilteringMaterialType materialType) {
    this.materialType = materialType;
  }


  public QianchuanMaterialGetV10Filtering searchKeyword(String searchKeyword) {
    
    this.searchKeyword = searchKeyword;
    return this;
  }

   /**
   * 
   * @return searchKeyword
  **/
  @javax.annotation.Nullable
  public String getSearchKeyword() {
    return searchKeyword;
  }


  public void setSearchKeyword(String searchKeyword) {
    this.searchKeyword = searchKeyword;
  }


  public QianchuanMaterialGetV10Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public QianchuanMaterialGetV10Filtering videoSource(List<QianchuanMaterialGetV10FilteringVideoSource> videoSource) {
    
    this.videoSource = videoSource;
    return this;
  }

  public QianchuanMaterialGetV10Filtering addVideoSourceItem(QianchuanMaterialGetV10FilteringVideoSource videoSourceItem) {
    if (this.videoSource == null) {
      this.videoSource = new ArrayList<>();
    }
    this.videoSource.add(videoSourceItem);
    return this;
  }

   /**
   * 
   * @return videoSource
  **/
  @javax.annotation.Nullable
  public List<QianchuanMaterialGetV10FilteringVideoSource> getVideoSource() {
    return videoSource;
  }


  public void setVideoSource(List<QianchuanMaterialGetV10FilteringVideoSource> videoSource) {
    this.videoSource = videoSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanMaterialGetV10Filtering qianchuanMaterialGetV10Filtering = (QianchuanMaterialGetV10Filtering) o;
    return Objects.equals(this.analysisType, qianchuanMaterialGetV10Filtering.analysisType) &&
        Objects.equals(this.endTime, qianchuanMaterialGetV10Filtering.endTime) &&
        Objects.equals(this.havingCost, qianchuanMaterialGetV10Filtering.havingCost) &&
        Objects.equals(this.imageMode, qianchuanMaterialGetV10Filtering.imageMode) &&
        Objects.equals(this.materialType, qianchuanMaterialGetV10Filtering.materialType) &&
        Objects.equals(this.searchKeyword, qianchuanMaterialGetV10Filtering.searchKeyword) &&
        Objects.equals(this.startTime, qianchuanMaterialGetV10Filtering.startTime) &&
        Objects.equals(this.videoSource, qianchuanMaterialGetV10Filtering.videoSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisType, endTime, havingCost, imageMode, materialType, searchKeyword, startTime, videoSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanMaterialGetV10Filtering {\n");
    sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    havingCost: ").append(toIndentedString(havingCost)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    searchKeyword: ").append(toIndentedString(searchKeyword)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    videoSource: ").append(toIndentedString(videoSource)).append("\n");
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
    openapiFields.add("analysis_type");
    openapiFields.add("end_time");
    openapiFields.add("having_cost");
    openapiFields.add("image_mode");
    openapiFields.add("material_type");
    openapiFields.add("search_keyword");
    openapiFields.add("start_time");
    openapiFields.add("video_source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanMaterialGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanMaterialGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanMaterialGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanMaterialGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanMaterialGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanMaterialGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanMaterialGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanMaterialGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanMaterialGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanMaterialGetV10Filtering
  */
  public static QianchuanMaterialGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanMaterialGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanMaterialGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

