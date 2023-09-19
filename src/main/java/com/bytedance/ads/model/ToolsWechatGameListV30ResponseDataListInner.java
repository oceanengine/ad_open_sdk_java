/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsWechatGameListV30DataListAccountType;
import com.bytedance.ads.model.ToolsWechatGameListV30DataListAuditStatus;
import com.bytedance.ads.model.ToolsWechatGameListV30DataListAuthorizationStatus;
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
 * ToolsWechatGameListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsWechatGameListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsWechatGameListV30DataListAccountType accountType = null;

  public static final String SERIALIZED_NAME_AGE_REMIND_URL = "age_remind_url";
  @SerializedName(SERIALIZED_NAME_AGE_REMIND_URL)
  private String ageRemindUrl = null;

  public static final String SERIALIZED_NAME_ANTI_ADDICTION_URL = "anti_addiction_url";
  @SerializedName(SERIALIZED_NAME_ANTI_ADDICTION_URL)
  private String antiAddictionUrl = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ToolsWechatGameListV30DataListAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_AUTHORIZATION_STATUS = "authorization_status";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_STATUS)
  private ToolsWechatGameListV30DataListAuthorizationStatus authorizationStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = null;

  public static final String SERIALIZED_NAME_REAL_NAME_URL = "real_name_url";
  @SerializedName(SERIALIZED_NAME_REAL_NAME_URL)
  private String realNameUrl = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_REASON_UNAUTHORIZE = "reason_unauthorize";
  @SerializedName(SERIALIZED_NAME_REASON_UNAUTHORIZE)
  private String reasonUnauthorize = null;

  public static final String SERIALIZED_NAME_SCREEN_RECORD_URL = "screen_record_url";
  @SerializedName(SERIALIZED_NAME_SCREEN_RECORD_URL)
  private String screenRecordUrl = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName = null;

  public ToolsWechatGameListV30ResponseDataListInner() {
  }

  public ToolsWechatGameListV30ResponseDataListInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsWechatGameListV30ResponseDataListInner accountType(ToolsWechatGameListV30DataListAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsWechatGameListV30DataListAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsWechatGameListV30DataListAccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsWechatGameListV30ResponseDataListInner ageRemindUrl(String ageRemindUrl) {
    
    this.ageRemindUrl = ageRemindUrl;
    return this;
  }

   /**
   * 
   * @return ageRemindUrl
  **/
  @javax.annotation.Nullable
  public String getAgeRemindUrl() {
    return ageRemindUrl;
  }


  public void setAgeRemindUrl(String ageRemindUrl) {
    this.ageRemindUrl = ageRemindUrl;
  }


  public ToolsWechatGameListV30ResponseDataListInner antiAddictionUrl(String antiAddictionUrl) {
    
    this.antiAddictionUrl = antiAddictionUrl;
    return this;
  }

   /**
   * 
   * @return antiAddictionUrl
  **/
  @javax.annotation.Nullable
  public String getAntiAddictionUrl() {
    return antiAddictionUrl;
  }


  public void setAntiAddictionUrl(String antiAddictionUrl) {
    this.antiAddictionUrl = antiAddictionUrl;
  }


  public ToolsWechatGameListV30ResponseDataListInner auditStatus(ToolsWechatGameListV30DataListAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ToolsWechatGameListV30DataListAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ToolsWechatGameListV30DataListAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ToolsWechatGameListV30ResponseDataListInner authorizationStatus(ToolsWechatGameListV30DataListAuthorizationStatus authorizationStatus) {
    
    this.authorizationStatus = authorizationStatus;
    return this;
  }

   /**
   * Get authorizationStatus
   * @return authorizationStatus
  **/
  @javax.annotation.Nullable
  public ToolsWechatGameListV30DataListAuthorizationStatus getAuthorizationStatus() {
    return authorizationStatus;
  }


  public void setAuthorizationStatus(ToolsWechatGameListV30DataListAuthorizationStatus authorizationStatus) {
    this.authorizationStatus = authorizationStatus;
  }


  public ToolsWechatGameListV30ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsWechatGameListV30ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsWechatGameListV30ResponseDataListInner name(String name) {
    
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


  public ToolsWechatGameListV30ResponseDataListInner path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * 
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ToolsWechatGameListV30ResponseDataListInner realNameUrl(String realNameUrl) {
    
    this.realNameUrl = realNameUrl;
    return this;
  }

   /**
   * 
   * @return realNameUrl
  **/
  @javax.annotation.Nullable
  public String getRealNameUrl() {
    return realNameUrl;
  }


  public void setRealNameUrl(String realNameUrl) {
    this.realNameUrl = realNameUrl;
  }


  public ToolsWechatGameListV30ResponseDataListInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ToolsWechatGameListV30ResponseDataListInner reasonUnauthorize(String reasonUnauthorize) {
    
    this.reasonUnauthorize = reasonUnauthorize;
    return this;
  }

   /**
   * 
   * @return reasonUnauthorize
  **/
  @javax.annotation.Nullable
  public String getReasonUnauthorize() {
    return reasonUnauthorize;
  }


  public void setReasonUnauthorize(String reasonUnauthorize) {
    this.reasonUnauthorize = reasonUnauthorize;
  }


  public ToolsWechatGameListV30ResponseDataListInner screenRecordUrl(String screenRecordUrl) {
    
    this.screenRecordUrl = screenRecordUrl;
    return this;
  }

   /**
   * 
   * @return screenRecordUrl
  **/
  @javax.annotation.Nullable
  public String getScreenRecordUrl() {
    return screenRecordUrl;
  }


  public void setScreenRecordUrl(String screenRecordUrl) {
    this.screenRecordUrl = screenRecordUrl;
  }


  public ToolsWechatGameListV30ResponseDataListInner userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @javax.annotation.Nullable
  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsWechatGameListV30ResponseDataListInner toolsWechatGameListV30ResponseDataListInner = (ToolsWechatGameListV30ResponseDataListInner) o;
    return Objects.equals(this.accountId, toolsWechatGameListV30ResponseDataListInner.accountId) &&
        Objects.equals(this.accountType, toolsWechatGameListV30ResponseDataListInner.accountType) &&
        Objects.equals(this.ageRemindUrl, toolsWechatGameListV30ResponseDataListInner.ageRemindUrl) &&
        Objects.equals(this.antiAddictionUrl, toolsWechatGameListV30ResponseDataListInner.antiAddictionUrl) &&
        Objects.equals(this.auditStatus, toolsWechatGameListV30ResponseDataListInner.auditStatus) &&
        Objects.equals(this.authorizationStatus, toolsWechatGameListV30ResponseDataListInner.authorizationStatus) &&
        Objects.equals(this.createTime, toolsWechatGameListV30ResponseDataListInner.createTime) &&
        Objects.equals(this.instanceId, toolsWechatGameListV30ResponseDataListInner.instanceId) &&
        Objects.equals(this.name, toolsWechatGameListV30ResponseDataListInner.name) &&
        Objects.equals(this.path, toolsWechatGameListV30ResponseDataListInner.path) &&
        Objects.equals(this.realNameUrl, toolsWechatGameListV30ResponseDataListInner.realNameUrl) &&
        Objects.equals(this.reason, toolsWechatGameListV30ResponseDataListInner.reason) &&
        Objects.equals(this.reasonUnauthorize, toolsWechatGameListV30ResponseDataListInner.reasonUnauthorize) &&
        Objects.equals(this.screenRecordUrl, toolsWechatGameListV30ResponseDataListInner.screenRecordUrl) &&
        Objects.equals(this.userName, toolsWechatGameListV30ResponseDataListInner.userName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, ageRemindUrl, antiAddictionUrl, auditStatus, authorizationStatus, createTime, instanceId, name, path, realNameUrl, reason, reasonUnauthorize, screenRecordUrl, userName);
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
    sb.append("class ToolsWechatGameListV30ResponseDataListInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    ageRemindUrl: ").append(toIndentedString(ageRemindUrl)).append("\n");
    sb.append("    antiAddictionUrl: ").append(toIndentedString(antiAddictionUrl)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    authorizationStatus: ").append(toIndentedString(authorizationStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    realNameUrl: ").append(toIndentedString(realNameUrl)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reasonUnauthorize: ").append(toIndentedString(reasonUnauthorize)).append("\n");
    sb.append("    screenRecordUrl: ").append(toIndentedString(screenRecordUrl)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("age_remind_url");
    openapiFields.add("anti_addiction_url");
    openapiFields.add("audit_status");
    openapiFields.add("authorization_status");
    openapiFields.add("create_time");
    openapiFields.add("instance_id");
    openapiFields.add("name");
    openapiFields.add("path");
    openapiFields.add("real_name_url");
    openapiFields.add("reason");
    openapiFields.add("reason_unauthorize");
    openapiFields.add("screen_record_url");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatGameListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatGameListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatGameListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatGameListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatGameListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsWechatGameListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatGameListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatGameListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatGameListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatGameListV30ResponseDataListInner
  */
  public static ToolsWechatGameListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatGameListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsWechatGameListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

