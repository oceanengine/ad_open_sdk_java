/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandAwemeListV30DataAwemeUserInfoListAppName;
import com.bytedance.ads.model.BrandAwemeListV30DataAwemeUserInfoListAuthStatus;
import com.bytedance.ads.model.BrandAwemeListV30DataAwemeUserInfoListAuthType;
import com.bytedance.ads.model.BrandAwemeListV30DataAwemeUserInfoListOperatePlatform;
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
 * BrandAwemeListV30ResponseDataAwemeUserInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class BrandAwemeListV30ResponseDataAwemeUserInfoListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private BrandAwemeListV30DataAwemeUserInfoListAppName appName = null;

  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private BrandAwemeListV30DataAwemeUserInfoListAuthStatus authStatus = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private BrandAwemeListV30DataAwemeUserInfoListAuthType authType = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_BIND_TIME = "bind_time";
  @SerializedName(SERIALIZED_NAME_BIND_TIME)
  private String bindTime = null;

  public static final String SERIALIZED_NAME_LEFT_VALID_DAYS = "left_valid_days";
  @SerializedName(SERIALIZED_NAME_LEFT_VALID_DAYS)
  private Long leftValidDays = null;

  public static final String SERIALIZED_NAME_OPERATE_PLATFORM = "operate_platform";
  @SerializedName(SERIALIZED_NAME_OPERATE_PLATFORM)
  private BrandAwemeListV30DataAwemeUserInfoListOperatePlatform operatePlatform = null;

  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner() {
  }

  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 抖音号
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner appName(BrandAwemeListV30DataAwemeUserInfoListAppName appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  @javax.annotation.Nullable
  public BrandAwemeListV30DataAwemeUserInfoListAppName getAppName() {
    return appName;
  }


  public void setAppName(BrandAwemeListV30DataAwemeUserInfoListAppName appName) {
    this.appName = appName;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner authStatus(BrandAwemeListV30DataAwemeUserInfoListAuthStatus authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

   /**
   * Get authStatus
   * @return authStatus
  **/
  @javax.annotation.Nullable
  public BrandAwemeListV30DataAwemeUserInfoListAuthStatus getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(BrandAwemeListV30DataAwemeUserInfoListAuthStatus authStatus) {
    this.authStatus = authStatus;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner authType(BrandAwemeListV30DataAwemeUserInfoListAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  public BrandAwemeListV30DataAwemeUserInfoListAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(BrandAwemeListV30DataAwemeUserInfoListAuthType authType) {
    this.authType = authType;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号ID
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 抖音号名称
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner bindTime(String bindTime) {
    
    this.bindTime = bindTime;
    return this;
  }

   /**
   * 绑定时间
   * @return bindTime
  **/
  @javax.annotation.Nullable
  public String getBindTime() {
    return bindTime;
  }


  public void setBindTime(String bindTime) {
    this.bindTime = bindTime;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner leftValidDays(Long leftValidDays) {
    
    this.leftValidDays = leftValidDays;
    return this;
  }

   /**
   * 剩余有效天数
   * @return leftValidDays
  **/
  @javax.annotation.Nullable
  public Long getLeftValidDays() {
    return leftValidDays;
  }


  public void setLeftValidDays(Long leftValidDays) {
    this.leftValidDays = leftValidDays;
  }


  public BrandAwemeListV30ResponseDataAwemeUserInfoListInner operatePlatform(BrandAwemeListV30DataAwemeUserInfoListOperatePlatform operatePlatform) {
    
    this.operatePlatform = operatePlatform;
    return this;
  }

   /**
   * Get operatePlatform
   * @return operatePlatform
  **/
  @javax.annotation.Nullable
  public BrandAwemeListV30DataAwemeUserInfoListOperatePlatform getOperatePlatform() {
    return operatePlatform;
  }


  public void setOperatePlatform(BrandAwemeListV30DataAwemeUserInfoListOperatePlatform operatePlatform) {
    this.operatePlatform = operatePlatform;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAwemeListV30ResponseDataAwemeUserInfoListInner brandAwemeListV30ResponseDataAwemeUserInfoListInner = (BrandAwemeListV30ResponseDataAwemeUserInfoListInner) o;
    return Objects.equals(this.advertiserId, brandAwemeListV30ResponseDataAwemeUserInfoListInner.advertiserId) &&
        Objects.equals(this.advertiserName, brandAwemeListV30ResponseDataAwemeUserInfoListInner.advertiserName) &&
        Objects.equals(this.appName, brandAwemeListV30ResponseDataAwemeUserInfoListInner.appName) &&
        Objects.equals(this.authStatus, brandAwemeListV30ResponseDataAwemeUserInfoListInner.authStatus) &&
        Objects.equals(this.authType, brandAwemeListV30ResponseDataAwemeUserInfoListInner.authType) &&
        Objects.equals(this.awemeId, brandAwemeListV30ResponseDataAwemeUserInfoListInner.awemeId) &&
        Objects.equals(this.awemeName, brandAwemeListV30ResponseDataAwemeUserInfoListInner.awemeName) &&
        Objects.equals(this.bindTime, brandAwemeListV30ResponseDataAwemeUserInfoListInner.bindTime) &&
        Objects.equals(this.leftValidDays, brandAwemeListV30ResponseDataAwemeUserInfoListInner.leftValidDays) &&
        Objects.equals(this.operatePlatform, brandAwemeListV30ResponseDataAwemeUserInfoListInner.operatePlatform);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, advertiserName, appName, authStatus, authType, awemeId, awemeName, bindTime, leftValidDays, operatePlatform);
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
    sb.append("class BrandAwemeListV30ResponseDataAwemeUserInfoListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
    sb.append("    leftValidDays: ").append(toIndentedString(leftValidDays)).append("\n");
    sb.append("    operatePlatform: ").append(toIndentedString(operatePlatform)).append("\n");
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
    openapiFields.add("advertiser_name");
    openapiFields.add("app_name");
    openapiFields.add("auth_status");
    openapiFields.add("auth_type");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("bind_time");
    openapiFields.add("left_valid_days");
    openapiFields.add("operate_platform");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAwemeListV30ResponseDataAwemeUserInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAwemeListV30ResponseDataAwemeUserInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAwemeListV30ResponseDataAwemeUserInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAwemeListV30ResponseDataAwemeUserInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAwemeListV30ResponseDataAwemeUserInfoListInner>() {
           @Override
           public void write(JsonWriter out, BrandAwemeListV30ResponseDataAwemeUserInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAwemeListV30ResponseDataAwemeUserInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAwemeListV30ResponseDataAwemeUserInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAwemeListV30ResponseDataAwemeUserInfoListInner
  * @throws IOException if the JSON string is invalid with respect to BrandAwemeListV30ResponseDataAwemeUserInfoListInner
  */
  public static BrandAwemeListV30ResponseDataAwemeUserInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAwemeListV30ResponseDataAwemeUserInfoListInner.class);
  }

 /**
  * Convert an instance of BrandAwemeListV30ResponseDataAwemeUserInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

