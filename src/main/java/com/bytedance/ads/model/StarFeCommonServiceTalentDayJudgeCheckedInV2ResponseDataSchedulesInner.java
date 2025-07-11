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
 * StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_MEETING_NAME = "meeting_name";
  @SerializedName(SERIALIZED_NAME_MEETING_NAME)
  private String meetingName = null;

  public static final String SERIALIZED_NAME_MEETING_TYPE = "meeting_type";
  @SerializedName(SERIALIZED_NAME_MEETING_TYPE)
  private Long meetingType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime = null;

  public StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner() {
  }

  public StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间戳(毫秒)
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 会议ID or 撮合会议ID
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner meetingName(String meetingName) {
    
    this.meetingName = meetingName;
    return this;
  }

   /**
   * 会议名称
   * @return meetingName
  **/
  @javax.annotation.Nullable
  public String getMeetingName() {
    return meetingName;
  }


  public void setMeetingName(String meetingName) {
    this.meetingName = meetingName;
  }


  public StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner meetingType(Long meetingType) {
    
    this.meetingType = meetingType;
    return this;
  }

   /**
   * 会议类型
   * @return meetingType
  **/
  @javax.annotation.Nullable
  public Long getMeetingType() {
    return meetingType;
  }


  public void setMeetingType(Long meetingType) {
    this.meetingType = meetingType;
  }


  public StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间戳(毫秒)
   * @return startTime
  **/
  @javax.annotation.Nullable
  public Long getStartTime() {
    return startTime;
  }


  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner starFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner = (StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner) o;
    return Objects.equals(this.endTime, starFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.endTime) &&
        Objects.equals(this.id, starFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.id) &&
        Objects.equals(this.meetingName, starFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.meetingName) &&
        Objects.equals(this.meetingType, starFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.meetingType) &&
        Objects.equals(this.startTime, starFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, id, meetingName, meetingType, startTime);
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
    sb.append("class StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meetingName: ").append(toIndentedString(meetingName)).append("\n");
    sb.append("    meetingType: ").append(toIndentedString(meetingType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("id");
    openapiFields.add("meeting_name");
    openapiFields.add("meeting_type");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner>() {
           @Override
           public void write(JsonWriter out, StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner
  * @throws IOException if the JSON string is invalid with respect to StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner
  */
  public static StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner.class);
  }

 /**
  * Convert an instance of StarFeCommonServiceTalentDayJudgeCheckedInV2ResponseDataSchedulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

