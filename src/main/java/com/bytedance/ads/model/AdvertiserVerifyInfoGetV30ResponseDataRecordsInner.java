/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserVerifyInfoGetV30DataRecordsCheckType;
import com.bytedance.ads.model.AdvertiserVerifyInfoGetV30DataRecordsPlatform;
import com.bytedance.ads.model.AdvertiserVerifyInfoGetV30DataRecordsStatus;
import com.bytedance.ads.model.AdvertiserVerifyInfoGetV30DataRecordsVerifyType;
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
 * AdvertiserVerifyInfoGetV30ResponseDataRecordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class AdvertiserVerifyInfoGetV30ResponseDataRecordsInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTH_TIME = "auth_time";
  @SerializedName(SERIALIZED_NAME_AUTH_TIME)
  private String authTime = null;

  public static final String SERIALIZED_NAME_CHECK_TYPE = "check_type";
  @SerializedName(SERIALIZED_NAME_CHECK_TYPE)
  private AdvertiserVerifyInfoGetV30DataRecordsCheckType checkType = null;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private String expireTime = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private AdvertiserVerifyInfoGetV30DataRecordsPlatform platform = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_SERIAL_NO = "qualification_serial_no";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_SERIAL_NO)
  private String qualificationSerialNo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserVerifyInfoGetV30DataRecordsStatus status = null;

  public static final String SERIALIZED_NAME_VERIFY_TYPE = "verify_type";
  @SerializedName(SERIALIZED_NAME_VERIFY_TYPE)
  private AdvertiserVerifyInfoGetV30DataRecordsVerifyType verifyType = null;

  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner() {
  }

  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner advertiserId(Long advertiserId) {
    
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


  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner authTime(String authTime) {
    
    this.authTime = authTime;
    return this;
  }

   /**
   * 状态变更时间
   * @return authTime
  **/
  @javax.annotation.Nullable
  public String getAuthTime() {
    return authTime;
  }


  public void setAuthTime(String authTime) {
    this.authTime = authTime;
  }


  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner checkType(AdvertiserVerifyInfoGetV30DataRecordsCheckType checkType) {
    
    this.checkType = checkType;
    return this;
  }

   /**
   * Get checkType
   * @return checkType
  **/
  @javax.annotation.Nullable
  public AdvertiserVerifyInfoGetV30DataRecordsCheckType getCheckType() {
    return checkType;
  }


  public void setCheckType(AdvertiserVerifyInfoGetV30DataRecordsCheckType checkType) {
    this.checkType = checkType;
  }


  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner expireTime(String expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 有效期截止时间
   * @return expireTime
  **/
  @javax.annotation.Nullable
  public String getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }


  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner platform(AdvertiserVerifyInfoGetV30DataRecordsPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public AdvertiserVerifyInfoGetV30DataRecordsPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(AdvertiserVerifyInfoGetV30DataRecordsPlatform platform) {
    this.platform = platform;
  }


  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner qualificationSerialNo(String qualificationSerialNo) {
    
    this.qualificationSerialNo = qualificationSerialNo;
    return this;
  }

   /**
   * 资质编号
   * @return qualificationSerialNo
  **/
  @javax.annotation.Nullable
  public String getQualificationSerialNo() {
    return qualificationSerialNo;
  }


  public void setQualificationSerialNo(String qualificationSerialNo) {
    this.qualificationSerialNo = qualificationSerialNo;
  }


  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner status(AdvertiserVerifyInfoGetV30DataRecordsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserVerifyInfoGetV30DataRecordsStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserVerifyInfoGetV30DataRecordsStatus status) {
    this.status = status;
  }


  public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner verifyType(AdvertiserVerifyInfoGetV30DataRecordsVerifyType verifyType) {
    
    this.verifyType = verifyType;
    return this;
  }

   /**
   * Get verifyType
   * @return verifyType
  **/
  @javax.annotation.Nullable
  public AdvertiserVerifyInfoGetV30DataRecordsVerifyType getVerifyType() {
    return verifyType;
  }


  public void setVerifyType(AdvertiserVerifyInfoGetV30DataRecordsVerifyType verifyType) {
    this.verifyType = verifyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserVerifyInfoGetV30ResponseDataRecordsInner advertiserVerifyInfoGetV30ResponseDataRecordsInner = (AdvertiserVerifyInfoGetV30ResponseDataRecordsInner) o;
    return Objects.equals(this.advertiserId, advertiserVerifyInfoGetV30ResponseDataRecordsInner.advertiserId) &&
        Objects.equals(this.authTime, advertiserVerifyInfoGetV30ResponseDataRecordsInner.authTime) &&
        Objects.equals(this.checkType, advertiserVerifyInfoGetV30ResponseDataRecordsInner.checkType) &&
        Objects.equals(this.expireTime, advertiserVerifyInfoGetV30ResponseDataRecordsInner.expireTime) &&
        Objects.equals(this.platform, advertiserVerifyInfoGetV30ResponseDataRecordsInner.platform) &&
        Objects.equals(this.qualificationSerialNo, advertiserVerifyInfoGetV30ResponseDataRecordsInner.qualificationSerialNo) &&
        Objects.equals(this.status, advertiserVerifyInfoGetV30ResponseDataRecordsInner.status) &&
        Objects.equals(this.verifyType, advertiserVerifyInfoGetV30ResponseDataRecordsInner.verifyType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, authTime, checkType, expireTime, platform, qualificationSerialNo, status, verifyType);
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
    sb.append("class AdvertiserVerifyInfoGetV30ResponseDataRecordsInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    authTime: ").append(toIndentedString(authTime)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    qualificationSerialNo: ").append(toIndentedString(qualificationSerialNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    verifyType: ").append(toIndentedString(verifyType)).append("\n");
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
    openapiFields.add("auth_time");
    openapiFields.add("check_type");
    openapiFields.add("expire_time");
    openapiFields.add("platform");
    openapiFields.add("qualification_serial_no");
    openapiFields.add("status");
    openapiFields.add("verify_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("verify_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserVerifyInfoGetV30ResponseDataRecordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserVerifyInfoGetV30ResponseDataRecordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserVerifyInfoGetV30ResponseDataRecordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserVerifyInfoGetV30ResponseDataRecordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserVerifyInfoGetV30ResponseDataRecordsInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserVerifyInfoGetV30ResponseDataRecordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserVerifyInfoGetV30ResponseDataRecordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserVerifyInfoGetV30ResponseDataRecordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserVerifyInfoGetV30ResponseDataRecordsInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserVerifyInfoGetV30ResponseDataRecordsInner
  */
  public static AdvertiserVerifyInfoGetV30ResponseDataRecordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserVerifyInfoGetV30ResponseDataRecordsInner.class);
  }

 /**
  * Convert an instance of AdvertiserVerifyInfoGetV30ResponseDataRecordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

