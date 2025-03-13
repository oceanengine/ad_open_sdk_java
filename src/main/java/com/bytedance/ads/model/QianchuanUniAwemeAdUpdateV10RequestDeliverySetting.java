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
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10DeliverySettingLiveScheduleType;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode;
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10DeliverySettingVideoScheduleType;
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
public class QianchuanUniAwemeAdUpdateV10RequestDeliverySetting {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_LIVE_SCHEDULE_TYPE = "live_schedule_type";
  @SerializedName(SERIALIZED_NAME_LIVE_SCHEDULE_TYPE)
  private QianchuanUniAwemeAdUpdateV10DeliverySettingLiveScheduleType liveScheduleType = null;

  public static final String SERIALIZED_NAME_QCPX_MODE = "qcpx_mode";
  @SerializedName(SERIALIZED_NAME_QCPX_MODE)
  private QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode qcpxMode = null;

  public static final String SERIALIZED_NAME_ROI2_GOAL = "roi2_goal";
  @SerializedName(SERIALIZED_NAME_ROI2_GOAL)
  private Double roi2Goal = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE = "video_schedule_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE)
  private QianchuanUniAwemeAdUpdateV10DeliverySettingVideoScheduleType videoScheduleType = null;

  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting() {
  }

  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting endTime(String endTime) {
    
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


  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting liveScheduleType(QianchuanUniAwemeAdUpdateV10DeliverySettingLiveScheduleType liveScheduleType) {
    
    this.liveScheduleType = liveScheduleType;
    return this;
  }

   /**
   * Get liveScheduleType
   * @return liveScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10DeliverySettingLiveScheduleType getLiveScheduleType() {
    return liveScheduleType;
  }


  public void setLiveScheduleType(QianchuanUniAwemeAdUpdateV10DeliverySettingLiveScheduleType liveScheduleType) {
    this.liveScheduleType = liveScheduleType;
  }


  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting qcpxMode(QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode qcpxMode) {
    
    this.qcpxMode = qcpxMode;
    return this;
  }

   /**
   * Get qcpxMode
   * @return qcpxMode
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode getQcpxMode() {
    return qcpxMode;
  }


  public void setQcpxMode(QianchuanUniAwemeAdUpdateV10DeliverySettingQcpxMode qcpxMode) {
    this.qcpxMode = qcpxMode;
  }


  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting roi2Goal(Double roi2Goal) {
    
    this.roi2Goal = roi2Goal;
    return this;
  }

   /**
   * 
   * @return roi2Goal
  **/
  @javax.annotation.Nullable
  public Double getRoi2Goal() {
    return roi2Goal;
  }


  public void setRoi2Goal(Double roi2Goal) {
    this.roi2Goal = roi2Goal;
  }


  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting startTime(String startTime) {
    
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


  public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting videoScheduleType(QianchuanUniAwemeAdUpdateV10DeliverySettingVideoScheduleType videoScheduleType) {
    
    this.videoScheduleType = videoScheduleType;
    return this;
  }

   /**
   * Get videoScheduleType
   * @return videoScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10DeliverySettingVideoScheduleType getVideoScheduleType() {
    return videoScheduleType;
  }


  public void setVideoScheduleType(QianchuanUniAwemeAdUpdateV10DeliverySettingVideoScheduleType videoScheduleType) {
    this.videoScheduleType = videoScheduleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniAwemeAdUpdateV10RequestDeliverySetting qianchuanUniAwemeAdUpdateV10RequestDeliverySetting = (QianchuanUniAwemeAdUpdateV10RequestDeliverySetting) o;
    return Objects.equals(this.budget, qianchuanUniAwemeAdUpdateV10RequestDeliverySetting.budget) &&
        Objects.equals(this.endTime, qianchuanUniAwemeAdUpdateV10RequestDeliverySetting.endTime) &&
        Objects.equals(this.liveScheduleType, qianchuanUniAwemeAdUpdateV10RequestDeliverySetting.liveScheduleType) &&
        Objects.equals(this.qcpxMode, qianchuanUniAwemeAdUpdateV10RequestDeliverySetting.qcpxMode) &&
        Objects.equals(this.roi2Goal, qianchuanUniAwemeAdUpdateV10RequestDeliverySetting.roi2Goal) &&
        Objects.equals(this.startTime, qianchuanUniAwemeAdUpdateV10RequestDeliverySetting.startTime) &&
        Objects.equals(this.videoScheduleType, qianchuanUniAwemeAdUpdateV10RequestDeliverySetting.videoScheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, endTime, liveScheduleType, qcpxMode, roi2Goal, startTime, videoScheduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdUpdateV10RequestDeliverySetting {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    liveScheduleType: ").append(toIndentedString(liveScheduleType)).append("\n");
    sb.append("    qcpxMode: ").append(toIndentedString(qcpxMode)).append("\n");
    sb.append("    roi2Goal: ").append(toIndentedString(roi2Goal)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    videoScheduleType: ").append(toIndentedString(videoScheduleType)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("end_time");
    openapiFields.add("live_schedule_type");
    openapiFields.add("qcpx_mode");
    openapiFields.add("roi2_goal");
    openapiFields.add("start_time");
    openapiFields.add("video_schedule_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAdUpdateV10RequestDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdUpdateV10RequestDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdUpdateV10RequestDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdUpdateV10RequestDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdUpdateV10RequestDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdUpdateV10RequestDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdUpdateV10RequestDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdUpdateV10RequestDeliverySetting
  */
  public static QianchuanUniAwemeAdUpdateV10RequestDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdUpdateV10RequestDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdUpdateV10RequestDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

