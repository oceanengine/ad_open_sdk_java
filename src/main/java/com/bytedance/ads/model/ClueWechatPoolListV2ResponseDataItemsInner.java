/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueWechatPoolListV2DataItemsAuditStatus;
import com.bytedance.ads.model.ClueWechatPoolListV2DataItemsHasQrCode;
import com.bytedance.ads.model.ClueWechatPoolListV2DataItemsWechatType;
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
 * ClueWechatPoolListV2ResponseDataItemsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class ClueWechatPoolListV2ResponseDataItemsInner {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ClueWechatPoolListV2DataItemsAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CLUE_COUNT = "clue_count";
  @SerializedName(SERIALIZED_NAME_CLUE_COUNT)
  private Long clueCount = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_HAS_QR_CODE = "has_qr_code";
  @SerializedName(SERIALIZED_NAME_HAS_QR_CODE)
  private ClueWechatPoolListV2DataItemsHasQrCode hasQrCode = null;

  public static final String SERIALIZED_NAME_INSTANCE_COUNT = "instance_count";
  @SerializedName(SERIALIZED_NAME_INSTANCE_COUNT)
  private Long instanceCount = null;

  public static final String SERIALIZED_NAME_MOD_TIME = "mod_time";
  @SerializedName(SERIALIZED_NAME_MOD_TIME)
  private String modTime = null;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix = null;

  public static final String SERIALIZED_NAME_WECHAT_NUMBER = "wechat_number";
  @SerializedName(SERIALIZED_NAME_WECHAT_NUMBER)
  private String wechatNumber = null;

  public static final String SERIALIZED_NAME_WECHAT_TYPE = "wechat_type";
  @SerializedName(SERIALIZED_NAME_WECHAT_TYPE)
  private ClueWechatPoolListV2DataItemsWechatType wechatType = null;

  public ClueWechatPoolListV2ResponseDataItemsInner() {
  }

  public ClueWechatPoolListV2ResponseDataItemsInner appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 公众号的开发者ID
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner auditStatus(ClueWechatPoolListV2DataItemsAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ClueWechatPoolListV2DataItemsAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ClueWechatPoolListV2DataItemsAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner clueCount(Long clueCount) {
    
    this.clueCount = clueCount;
    return this;
  }

   /**
   * 复制次数
   * @return clueCount
  **/
  @javax.annotation.Nullable
  public Long getClueCount() {
    return clueCount;
  }


  public void setClueCount(Long clueCount) {
    this.clueCount = clueCount;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间，格式：2022-07-21 15:36:09
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner hasQrCode(ClueWechatPoolListV2DataItemsHasQrCode hasQrCode) {
    
    this.hasQrCode = hasQrCode;
    return this;
  }

   /**
   * Get hasQrCode
   * @return hasQrCode
  **/
  @javax.annotation.Nullable
  public ClueWechatPoolListV2DataItemsHasQrCode getHasQrCode() {
    return hasQrCode;
  }


  public void setHasQrCode(ClueWechatPoolListV2DataItemsHasQrCode hasQrCode) {
    this.hasQrCode = hasQrCode;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner instanceCount(Long instanceCount) {
    
    this.instanceCount = instanceCount;
    return this;
  }

   /**
   * 生效号码包数量
   * @return instanceCount
  **/
  @javax.annotation.Nullable
  public Long getInstanceCount() {
    return instanceCount;
  }


  public void setInstanceCount(Long instanceCount) {
    this.instanceCount = instanceCount;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner modTime(String modTime) {
    
    this.modTime = modTime;
    return this;
  }

   /**
   * 修改时间，格式：2022-07-21 15:36:09
   * @return modTime
  **/
  @javax.annotation.Nullable
  public String getModTime() {
    return modTime;
  }


  public void setModTime(String modTime) {
    this.modTime = modTime;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 微信昵称
   * @return nickName
  **/
  @javax.annotation.Nullable
  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 审核拒绝理由
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 启用状态  0启用 1禁用
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * 尾缀
   * @return suffix
  **/
  @javax.annotation.Nullable
  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner wechatNumber(String wechatNumber) {
    
    this.wechatNumber = wechatNumber;
    return this;
  }

   /**
   * 微信号，企业微信时返回为空
   * @return wechatNumber
  **/
  @javax.annotation.Nullable
  public String getWechatNumber() {
    return wechatNumber;
  }


  public void setWechatNumber(String wechatNumber) {
    this.wechatNumber = wechatNumber;
  }


  public ClueWechatPoolListV2ResponseDataItemsInner wechatType(ClueWechatPoolListV2DataItemsWechatType wechatType) {
    
    this.wechatType = wechatType;
    return this;
  }

   /**
   * Get wechatType
   * @return wechatType
  **/
  @javax.annotation.Nullable
  public ClueWechatPoolListV2DataItemsWechatType getWechatType() {
    return wechatType;
  }


  public void setWechatType(ClueWechatPoolListV2DataItemsWechatType wechatType) {
    this.wechatType = wechatType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatPoolListV2ResponseDataItemsInner clueWechatPoolListV2ResponseDataItemsInner = (ClueWechatPoolListV2ResponseDataItemsInner) o;
    return Objects.equals(this.appId, clueWechatPoolListV2ResponseDataItemsInner.appId) &&
        Objects.equals(this.auditStatus, clueWechatPoolListV2ResponseDataItemsInner.auditStatus) &&
        Objects.equals(this.clueCount, clueWechatPoolListV2ResponseDataItemsInner.clueCount) &&
        Objects.equals(this.createTime, clueWechatPoolListV2ResponseDataItemsInner.createTime) &&
        Objects.equals(this.hasQrCode, clueWechatPoolListV2ResponseDataItemsInner.hasQrCode) &&
        Objects.equals(this.instanceCount, clueWechatPoolListV2ResponseDataItemsInner.instanceCount) &&
        Objects.equals(this.modTime, clueWechatPoolListV2ResponseDataItemsInner.modTime) &&
        Objects.equals(this.nickName, clueWechatPoolListV2ResponseDataItemsInner.nickName) &&
        Objects.equals(this.rejectReason, clueWechatPoolListV2ResponseDataItemsInner.rejectReason) &&
        Objects.equals(this.status, clueWechatPoolListV2ResponseDataItemsInner.status) &&
        Objects.equals(this.suffix, clueWechatPoolListV2ResponseDataItemsInner.suffix) &&
        Objects.equals(this.wechatNumber, clueWechatPoolListV2ResponseDataItemsInner.wechatNumber) &&
        Objects.equals(this.wechatType, clueWechatPoolListV2ResponseDataItemsInner.wechatType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, auditStatus, clueCount, createTime, hasQrCode, instanceCount, modTime, nickName, rejectReason, status, suffix, wechatNumber, wechatType);
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
    sb.append("class ClueWechatPoolListV2ResponseDataItemsInner {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    clueCount: ").append(toIndentedString(clueCount)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    hasQrCode: ").append(toIndentedString(hasQrCode)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    wechatNumber: ").append(toIndentedString(wechatNumber)).append("\n");
    sb.append("    wechatType: ").append(toIndentedString(wechatType)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("audit_status");
    openapiFields.add("clue_count");
    openapiFields.add("create_time");
    openapiFields.add("has_qr_code");
    openapiFields.add("instance_count");
    openapiFields.add("mod_time");
    openapiFields.add("nick_name");
    openapiFields.add("reject_reason");
    openapiFields.add("status");
    openapiFields.add("suffix");
    openapiFields.add("wechat_number");
    openapiFields.add("wechat_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatPoolListV2ResponseDataItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatPoolListV2ResponseDataItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatPoolListV2ResponseDataItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatPoolListV2ResponseDataItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatPoolListV2ResponseDataItemsInner>() {
           @Override
           public void write(JsonWriter out, ClueWechatPoolListV2ResponseDataItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatPoolListV2ResponseDataItemsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatPoolListV2ResponseDataItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatPoolListV2ResponseDataItemsInner
  * @throws IOException if the JSON string is invalid with respect to ClueWechatPoolListV2ResponseDataItemsInner
  */
  public static ClueWechatPoolListV2ResponseDataItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatPoolListV2ResponseDataItemsInner.class);
  }

 /**
  * Convert an instance of ClueWechatPoolListV2ResponseDataItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

