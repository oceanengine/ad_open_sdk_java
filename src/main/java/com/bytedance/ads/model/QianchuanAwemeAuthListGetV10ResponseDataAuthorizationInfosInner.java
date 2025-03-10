/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthRange;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthStatus;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInnerAuthVideoInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner {
  public static final String SERIALIZED_NAME_AUTH_RANGE = "auth_range";
  @SerializedName(SERIALIZED_NAME_AUTH_RANGE)
  private QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthRange authRange = null;

  public static final String SERIALIZED_NAME_AUTH_SOURCE = "auth_source";
  @SerializedName(SERIALIZED_NAME_AUTH_SOURCE)
  private QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource authSource = null;

  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthStatus authStatus = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private List<QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType> authType = null;

  public static final String SERIALIZED_NAME_AUTH_VIDEO_INFO = "auth_video_info";
  @SerializedName(SERIALIZED_NAME_AUTH_VIDEO_INFO)
  private QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInnerAuthVideoInfo authVideoInfo = null;

  public static final String SERIALIZED_NAME_AWEME_AVATAR = "aweme_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AVATAR)
  private String awemeAvatar = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_AWEME_SHOW_ID = "aweme_show_id";
  @SerializedName(SERIALIZED_NAME_AWEME_SHOW_ID)
  private String awemeShowId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_IS_CANCELLATION_PROGRESS = "is_cancellation_progress";
  @SerializedName(SERIALIZED_NAME_IS_CANCELLATION_PROGRESS)
  private Boolean isCancellationProgress = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner() {
  }

  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner authRange(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthRange authRange) {
    
    this.authRange = authRange;
    return this;
  }

   /**
   * Get authRange
   * @return authRange
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthRange getAuthRange() {
    return authRange;
  }


  public void setAuthRange(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthRange authRange) {
    this.authRange = authRange;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner authSource(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource authSource) {
    
    this.authSource = authSource;
    return this;
  }

   /**
   * Get authSource
   * @return authSource
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource getAuthSource() {
    return authSource;
  }


  public void setAuthSource(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthSource authSource) {
    this.authSource = authSource;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner authStatus(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthStatus authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

   /**
   * Get authStatus
   * @return authStatus
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthStatus getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthStatus authStatus) {
    this.authStatus = authStatus;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner authType(List<QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType> authType) {
    
    this.authType = authType;
    return this;
  }

  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner addAuthTypeItem(QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType authTypeItem) {
    if (this.authType == null) {
      this.authType = new ArrayList<>();
    }
    this.authType.add(authTypeItem);
    return this;
  }

   /**
   * 
   * @return authType
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType> getAuthType() {
    return authType;
  }


  public void setAuthType(List<QianchuanAwemeAuthListGetV10DataAuthorizationInfosAuthType> authType) {
    this.authType = authType;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner authVideoInfo(QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInnerAuthVideoInfo authVideoInfo) {
    
    this.authVideoInfo = authVideoInfo;
    return this;
  }

   /**
   * Get authVideoInfo
   * @return authVideoInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInnerAuthVideoInfo getAuthVideoInfo() {
    return authVideoInfo;
  }


  public void setAuthVideoInfo(QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInnerAuthVideoInfo authVideoInfo) {
    this.authVideoInfo = authVideoInfo;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner awemeAvatar(String awemeAvatar) {
    
    this.awemeAvatar = awemeAvatar;
    return this;
  }

   /**
   * 
   * @return awemeAvatar
  **/
  @javax.annotation.Nullable
  public String getAwemeAvatar() {
    return awemeAvatar;
  }


  public void setAwemeAvatar(String awemeAvatar) {
    this.awemeAvatar = awemeAvatar;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号uid
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner awemeShowId(String awemeShowId) {
    
    this.awemeShowId = awemeShowId;
    return this;
  }

   /**
   * 
   * @return awemeShowId
  **/
  @javax.annotation.Nullable
  public String getAwemeShowId() {
    return awemeShowId;
  }


  public void setAwemeShowId(String awemeShowId) {
    this.awemeShowId = awemeShowId;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 申请创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner isCancellationProgress(Boolean isCancellationProgress) {
    
    this.isCancellationProgress = isCancellationProgress;
    return this;
  }

   /**
   * 是待确认解除授权
   * @return isCancellationProgress
  **/
  @javax.annotation.Nullable
  public Boolean getIsCancellationProgress() {
    return isCancellationProgress;
  }


  public void setIsCancellationProgress(Boolean isCancellationProgress) {
    this.isCancellationProgress = isCancellationProgress;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
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
    QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner = (QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner) o;
    return Objects.equals(this.authRange, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.authRange) &&
        Objects.equals(this.authSource, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.authSource) &&
        Objects.equals(this.authStatus, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.authStatus) &&
        Objects.equals(this.authType, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.authType) &&
        Objects.equals(this.authVideoInfo, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.authVideoInfo) &&
        Objects.equals(this.awemeAvatar, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.awemeAvatar) &&
        Objects.equals(this.awemeId, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.awemeId) &&
        Objects.equals(this.awemeName, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.awemeName) &&
        Objects.equals(this.awemeShowId, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.awemeShowId) &&
        Objects.equals(this.createTime, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.createTime) &&
        Objects.equals(this.endTime, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.endTime) &&
        Objects.equals(this.isCancellationProgress, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.isCancellationProgress) &&
        Objects.equals(this.startTime, qianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authRange, authSource, authStatus, authType, authVideoInfo, awemeAvatar, awemeId, awemeName, awemeShowId, createTime, endTime, isCancellationProgress, startTime);
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
    sb.append("class QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner {\n");
    sb.append("    authRange: ").append(toIndentedString(authRange)).append("\n");
    sb.append("    authSource: ").append(toIndentedString(authSource)).append("\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    authVideoInfo: ").append(toIndentedString(authVideoInfo)).append("\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    awemeShowId: ").append(toIndentedString(awemeShowId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isCancellationProgress: ").append(toIndentedString(isCancellationProgress)).append("\n");
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
    openapiFields.add("auth_range");
    openapiFields.add("auth_source");
    openapiFields.add("auth_status");
    openapiFields.add("auth_type");
    openapiFields.add("auth_video_info");
    openapiFields.add("aweme_avatar");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("aweme_show_id");
    openapiFields.add("create_time");
    openapiFields.add("end_time");
    openapiFields.add("is_cancellation_progress");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner
  */
  public static QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

