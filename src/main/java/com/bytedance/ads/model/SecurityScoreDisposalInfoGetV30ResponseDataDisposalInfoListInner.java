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
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalAction;
import com.bytedance.ads.model.SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus;
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
 * SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DISPOSAL_ACTION = "disposal_action";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_ACTION)
  private SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalAction disposalAction = null;

  public static final String SERIALIZED_NAME_DISPOSAL_END_TIME = "disposal_end_time";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_END_TIME)
  private String disposalEndTime = null;

  public static final String SERIALIZED_NAME_DISPOSAL_INFO_ID = "disposal_info_id";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_INFO_ID)
  private Long disposalInfoId = null;

  public static final String SERIALIZED_NAME_DISPOSAL_SCORE = "disposal_score";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_SCORE)
  private Long disposalScore = null;

  public static final String SERIALIZED_NAME_DISPOSAL_START_TIME = "disposal_start_time";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_START_TIME)
  private String disposalStartTime = null;

  public static final String SERIALIZED_NAME_DISPOSAL_STATUS = "disposal_status";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_STATUS)
  private SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus disposalStatus = null;

  public static final String SERIALIZED_NAME_DISPOSAL_TERM = "disposal_term";
  @SerializedName(SERIALIZED_NAME_DISPOSAL_TERM)
  private String disposalTerm = null;

  public static final String SERIALIZED_NAME_OUTER_TEXT = "outer_text";
  @SerializedName(SERIALIZED_NAME_OUTER_TEXT)
  private String outerText = null;

  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner() {
  }

  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner disposalAction(SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalAction disposalAction) {
    
    this.disposalAction = disposalAction;
    return this;
  }

   /**
   * Get disposalAction
   * @return disposalAction
  **/
  @javax.annotation.Nullable
  public SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalAction getDisposalAction() {
    return disposalAction;
  }


  public void setDisposalAction(SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalAction disposalAction) {
    this.disposalAction = disposalAction;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner disposalEndTime(String disposalEndTime) {
    
    this.disposalEndTime = disposalEndTime;
    return this;
  }

   /**
   * 处置结束时间
   * @return disposalEndTime
  **/
  @javax.annotation.Nullable
  public String getDisposalEndTime() {
    return disposalEndTime;
  }


  public void setDisposalEndTime(String disposalEndTime) {
    this.disposalEndTime = disposalEndTime;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner disposalInfoId(Long disposalInfoId) {
    
    this.disposalInfoId = disposalInfoId;
    return this;
  }

   /**
   * 处罚单id
   * @return disposalInfoId
  **/
  @javax.annotation.Nullable
  public Long getDisposalInfoId() {
    return disposalInfoId;
  }


  public void setDisposalInfoId(Long disposalInfoId) {
    this.disposalInfoId = disposalInfoId;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner disposalScore(Long disposalScore) {
    
    this.disposalScore = disposalScore;
    return this;
  }

   /**
   * 落罚分值
   * @return disposalScore
  **/
  @javax.annotation.Nullable
  public Long getDisposalScore() {
    return disposalScore;
  }


  public void setDisposalScore(Long disposalScore) {
    this.disposalScore = disposalScore;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner disposalStartTime(String disposalStartTime) {
    
    this.disposalStartTime = disposalStartTime;
    return this;
  }

   /**
   * 处置开始时间
   * @return disposalStartTime
  **/
  @javax.annotation.Nullable
  public String getDisposalStartTime() {
    return disposalStartTime;
  }


  public void setDisposalStartTime(String disposalStartTime) {
    this.disposalStartTime = disposalStartTime;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner disposalStatus(SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus disposalStatus) {
    
    this.disposalStatus = disposalStatus;
    return this;
  }

   /**
   * Get disposalStatus
   * @return disposalStatus
  **/
  @javax.annotation.Nullable
  public SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus getDisposalStatus() {
    return disposalStatus;
  }


  public void setDisposalStatus(SecurityScoreDisposalInfoGetV30DataDisposalInfoListDisposalStatus disposalStatus) {
    this.disposalStatus = disposalStatus;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner disposalTerm(String disposalTerm) {
    
    this.disposalTerm = disposalTerm;
    return this;
  }

   /**
   * 处置时长
   * @return disposalTerm
  **/
  @javax.annotation.Nullable
  public String getDisposalTerm() {
    return disposalTerm;
  }


  public void setDisposalTerm(String disposalTerm) {
    this.disposalTerm = disposalTerm;
  }


  public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner outerText(String outerText) {
    
    this.outerText = outerText;
    return this;
  }

   /**
   * 对外文案
   * @return outerText
  **/
  @javax.annotation.Nullable
  public String getOuterText() {
    return outerText;
  }


  public void setOuterText(String outerText) {
    this.outerText = outerText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner = (SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner) o;
    return Objects.equals(this.advertiserId, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.advertiserId) &&
        Objects.equals(this.disposalAction, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.disposalAction) &&
        Objects.equals(this.disposalEndTime, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.disposalEndTime) &&
        Objects.equals(this.disposalInfoId, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.disposalInfoId) &&
        Objects.equals(this.disposalScore, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.disposalScore) &&
        Objects.equals(this.disposalStartTime, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.disposalStartTime) &&
        Objects.equals(this.disposalStatus, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.disposalStatus) &&
        Objects.equals(this.disposalTerm, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.disposalTerm) &&
        Objects.equals(this.outerText, securityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.outerText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, disposalAction, disposalEndTime, disposalInfoId, disposalScore, disposalStartTime, disposalStatus, disposalTerm, outerText);
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
    sb.append("class SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    disposalAction: ").append(toIndentedString(disposalAction)).append("\n");
    sb.append("    disposalEndTime: ").append(toIndentedString(disposalEndTime)).append("\n");
    sb.append("    disposalInfoId: ").append(toIndentedString(disposalInfoId)).append("\n");
    sb.append("    disposalScore: ").append(toIndentedString(disposalScore)).append("\n");
    sb.append("    disposalStartTime: ").append(toIndentedString(disposalStartTime)).append("\n");
    sb.append("    disposalStatus: ").append(toIndentedString(disposalStatus)).append("\n");
    sb.append("    disposalTerm: ").append(toIndentedString(disposalTerm)).append("\n");
    sb.append("    outerText: ").append(toIndentedString(outerText)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("disposal_action");
    openapiFields.add("disposal_end_time");
    openapiFields.add("disposal_info_id");
    openapiFields.add("disposal_score");
    openapiFields.add("disposal_start_time");
    openapiFields.add("disposal_status");
    openapiFields.add("disposal_term");
    openapiFields.add("outer_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("disposal_action");
    openapiRequiredFields.add("disposal_score");
    openapiRequiredFields.add("disposal_status");
    openapiRequiredFields.add("disposal_term");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner>() {
           @Override
           public void write(JsonWriter out, SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner
  * @throws IOException if the JSON string is invalid with respect to SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner
  */
  public static SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner.class);
  }

 /**
  * Convert an instance of SecurityScoreDisposalInfoGetV30ResponseDataDisposalInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

