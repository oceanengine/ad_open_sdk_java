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
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListAuthStatus;
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListAuthType;
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListAwemeUserType;
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListShareType;
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListSubStatus;
import com.bytedance.ads.model.ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo;
import com.bytedance.ads.model.ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo;
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
 * ToolsAwemeAuthListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ToolsAwemeAuthListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private ToolsAwemeAuthListV2DataListAuthStatus authStatus = null;

  public static final String SERIALIZED_NAME_AUTH_THRESHOLD_INFO = "auth_threshold_info";
  @SerializedName(SERIALIZED_NAME_AUTH_THRESHOLD_INFO)
  private ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo authThresholdInfo = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private ToolsAwemeAuthListV2DataListAuthType authType = null;

  public static final String SERIALIZED_NAME_AWEME_CANCEL_IMAGE_LIST = "aweme_cancel_image_list";
  @SerializedName(SERIALIZED_NAME_AWEME_CANCEL_IMAGE_LIST)
  private List<String> awemeCancelImageList = null;

  public static final String SERIALIZED_NAME_AWEME_CANCEL_NOTE = "aweme_cancel_note";
  @SerializedName(SERIALIZED_NAME_AWEME_CANCEL_NOTE)
  private String awemeCancelNote = null;

  public static final String SERIALIZED_NAME_AWEME_CANCEL_REASON = "aweme_cancel_reason";
  @SerializedName(SERIALIZED_NAME_AWEME_CANCEL_REASON)
  private String awemeCancelReason = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_AWEME_USER_TYPE = "aweme_user_type";
  @SerializedName(SERIALIZED_NAME_AWEME_USER_TYPE)
  private ToolsAwemeAuthListV2DataListAwemeUserType awemeUserType = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_HAS_VIDEO_HP_VISIBILITY_LIMIT = "has_video_hp_visibility_limit";
  @SerializedName(SERIALIZED_NAME_HAS_VIDEO_HP_VISIBILITY_LIMIT)
  private Boolean hasVideoHpVisibilityLimit = null;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note = null;

  public static final String SERIALIZED_NAME_SHARE_TYPE = "share_type";
  @SerializedName(SERIALIZED_NAME_SHARE_TYPE)
  private ToolsAwemeAuthListV2DataListShareType shareType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_SUB_STATUS = "sub_status";
  @SerializedName(SERIALIZED_NAME_SUB_STATUS)
  private ToolsAwemeAuthListV2DataListSubStatus subStatus = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoInfo = null;

  public static final String SERIALIZED_NAME_WARNING_CONTENT = "warning_content";
  @SerializedName(SERIALIZED_NAME_WARNING_CONTENT)
  private List<String> warningContent = null;

  public ToolsAwemeAuthListV2ResponseDataListInner() {
  }

  public ToolsAwemeAuthListV2ResponseDataListInner authStatus(ToolsAwemeAuthListV2DataListAuthStatus authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

   /**
   * Get authStatus
   * @return authStatus
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListAuthStatus getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(ToolsAwemeAuthListV2DataListAuthStatus authStatus) {
    this.authStatus = authStatus;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner authThresholdInfo(ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo authThresholdInfo) {
    
    this.authThresholdInfo = authThresholdInfo;
    return this;
  }

   /**
   * Get authThresholdInfo
   * @return authThresholdInfo
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo getAuthThresholdInfo() {
    return authThresholdInfo;
  }


  public void setAuthThresholdInfo(ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo authThresholdInfo) {
    this.authThresholdInfo = authThresholdInfo;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner authType(ToolsAwemeAuthListV2DataListAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(ToolsAwemeAuthListV2DataListAuthType authType) {
    this.authType = authType;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeCancelImageList(List<String> awemeCancelImageList) {
    
    this.awemeCancelImageList = awemeCancelImageList;
    return this;
  }

  public ToolsAwemeAuthListV2ResponseDataListInner addAwemeCancelImageListItem(String awemeCancelImageListItem) {
    if (this.awemeCancelImageList == null) {
      this.awemeCancelImageList = new ArrayList<>();
    }
    this.awemeCancelImageList.add(awemeCancelImageListItem);
    return this;
  }

   /**
   * 抖音号作者发起解除授权时上传的凭证信息（选填项，抖音号作者可能不填，此时该参数返回为null）
   * @return awemeCancelImageList
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeCancelImageList() {
    return awemeCancelImageList;
  }


  public void setAwemeCancelImageList(List<String> awemeCancelImageList) {
    this.awemeCancelImageList = awemeCancelImageList;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeCancelNote(String awemeCancelNote) {
    
    this.awemeCancelNote = awemeCancelNote;
    return this;
  }

   /**
   * 抖音号作者发起解除授权时填写的联系方式（选填项，抖音号作者可能不填，此时该参数返回为null）
   * @return awemeCancelNote
  **/
  @javax.annotation.Nullable
  public String getAwemeCancelNote() {
    return awemeCancelNote;
  }


  public void setAwemeCancelNote(String awemeCancelNote) {
    this.awemeCancelNote = awemeCancelNote;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeCancelReason(String awemeCancelReason) {
    
    this.awemeCancelReason = awemeCancelReason;
    return this;
  }

   /**
   * 抖音号作者发起解除授权的原因，仅当抖音号作者发起解除授权时有值，100字以内，可能包括： - 不知道该授权是怎么建立的，申请解除授权 - 联系不到对方，无法进行合作沟通，申请解除授权 - 与对方合作到期或者有纠纷，申请解除授权 - 其他情况（作者会填写其他文案给到）
   * @return awemeCancelReason
  **/
  @javax.annotation.Nullable
  public String getAwemeCancelReason() {
    return awemeCancelReason;
  }


  public void setAwemeCancelReason(String awemeCancelReason) {
    this.awemeCancelReason = awemeCancelReason;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 抖音账号名称
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeUserType(ToolsAwemeAuthListV2DataListAwemeUserType awemeUserType) {
    
    this.awemeUserType = awemeUserType;
    return this;
  }

   /**
   * Get awemeUserType
   * @return awemeUserType
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListAwemeUserType getAwemeUserType() {
    return awemeUserType;
  }


  public void setAwemeUserType(ToolsAwemeAuthListV2DataListAwemeUserType awemeUserType) {
    this.awemeUserType = awemeUserType;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 授权结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner hasVideoHpVisibilityLimit(Boolean hasVideoHpVisibilityLimit) {
    
    this.hasVideoHpVisibilityLimit = hasVideoHpVisibilityLimit;
    return this;
  }

   /**
   * 发布新视频素材到该抖音号下时，视频主页可见性只能设置「仅单次展示可见」 枚举值： true：是 false：否，表示无此限制  当值返回true时，代表在创建广告时添加新视频素材到该抖音号下推广，视频的主页可见性设置只允许HIDE_VIDEO_ON_HP「仅单次展示可见」 
   * @return hasVideoHpVisibilityLimit
  **/
  @javax.annotation.Nullable
  public Boolean getHasVideoHpVisibilityLimit() {
    return hasVideoHpVisibilityLimit;
  }


  public void setHasVideoHpVisibilityLimit(Boolean hasVideoHpVisibilityLimit) {
    this.hasVideoHpVisibilityLimit = hasVideoHpVisibilityLimit;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * 备注
   * @return note
  **/
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner shareType(ToolsAwemeAuthListV2DataListShareType shareType) {
    
    this.shareType = shareType;
    return this;
  }

   /**
   * Get shareType
   * @return shareType
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListShareType getShareType() {
    return shareType;
  }


  public void setShareType(ToolsAwemeAuthListV2DataListShareType shareType) {
    this.shareType = shareType;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 授权开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner subStatus(ToolsAwemeAuthListV2DataListSubStatus subStatus) {
    
    this.subStatus = subStatus;
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListSubStatus getSubStatus() {
    return subStatus;
  }


  public void setSubStatus(ToolsAwemeAuthListV2DataListSubStatus subStatus) {
    this.subStatus = subStatus;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner videoInfo(ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner warningContent(List<String> warningContent) {
    
    this.warningContent = warningContent;
    return this;
  }

  public ToolsAwemeAuthListV2ResponseDataListInner addWarningContentItem(String warningContentItem) {
    if (this.warningContent == null) {
      this.warningContent = new ArrayList<>();
    }
    this.warningContent.add(warningContentItem);
    return this;
  }

   /**
   * 抖音授权关系警告信息，您可根据该信息及时处理，可能返回 - 不达门槛：表示发起授权的抖音号未达到要求，详细未达门槛信息可通过auth_threshold_info获取 - 即将解除：表示抖音号作者已发起解除授权申请，您需要及时联系作者或同意解除
   * @return warningContent
  **/
  @javax.annotation.Nullable
  public List<String> getWarningContent() {
    return warningContent;
  }


  public void setWarningContent(List<String> warningContent) {
    this.warningContent = warningContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeAuthListV2ResponseDataListInner toolsAwemeAuthListV2ResponseDataListInner = (ToolsAwemeAuthListV2ResponseDataListInner) o;
    return Objects.equals(this.authStatus, toolsAwemeAuthListV2ResponseDataListInner.authStatus) &&
        Objects.equals(this.authThresholdInfo, toolsAwemeAuthListV2ResponseDataListInner.authThresholdInfo) &&
        Objects.equals(this.authType, toolsAwemeAuthListV2ResponseDataListInner.authType) &&
        Objects.equals(this.awemeCancelImageList, toolsAwemeAuthListV2ResponseDataListInner.awemeCancelImageList) &&
        Objects.equals(this.awemeCancelNote, toolsAwemeAuthListV2ResponseDataListInner.awemeCancelNote) &&
        Objects.equals(this.awemeCancelReason, toolsAwemeAuthListV2ResponseDataListInner.awemeCancelReason) &&
        Objects.equals(this.awemeId, toolsAwemeAuthListV2ResponseDataListInner.awemeId) &&
        Objects.equals(this.awemeName, toolsAwemeAuthListV2ResponseDataListInner.awemeName) &&
        Objects.equals(this.awemeUserType, toolsAwemeAuthListV2ResponseDataListInner.awemeUserType) &&
        Objects.equals(this.endTime, toolsAwemeAuthListV2ResponseDataListInner.endTime) &&
        Objects.equals(this.hasVideoHpVisibilityLimit, toolsAwemeAuthListV2ResponseDataListInner.hasVideoHpVisibilityLimit) &&
        Objects.equals(this.note, toolsAwemeAuthListV2ResponseDataListInner.note) &&
        Objects.equals(this.shareType, toolsAwemeAuthListV2ResponseDataListInner.shareType) &&
        Objects.equals(this.startTime, toolsAwemeAuthListV2ResponseDataListInner.startTime) &&
        Objects.equals(this.subStatus, toolsAwemeAuthListV2ResponseDataListInner.subStatus) &&
        Objects.equals(this.videoInfo, toolsAwemeAuthListV2ResponseDataListInner.videoInfo) &&
        Objects.equals(this.warningContent, toolsAwemeAuthListV2ResponseDataListInner.warningContent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authStatus, authThresholdInfo, authType, awemeCancelImageList, awemeCancelNote, awemeCancelReason, awemeId, awemeName, awemeUserType, endTime, hasVideoHpVisibilityLimit, note, shareType, startTime, subStatus, videoInfo, warningContent);
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
    sb.append("class ToolsAwemeAuthListV2ResponseDataListInner {\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authThresholdInfo: ").append(toIndentedString(authThresholdInfo)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    awemeCancelImageList: ").append(toIndentedString(awemeCancelImageList)).append("\n");
    sb.append("    awemeCancelNote: ").append(toIndentedString(awemeCancelNote)).append("\n");
    sb.append("    awemeCancelReason: ").append(toIndentedString(awemeCancelReason)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    awemeUserType: ").append(toIndentedString(awemeUserType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    hasVideoHpVisibilityLimit: ").append(toIndentedString(hasVideoHpVisibilityLimit)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
    sb.append("    warningContent: ").append(toIndentedString(warningContent)).append("\n");
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
    openapiFields.add("auth_status");
    openapiFields.add("auth_threshold_info");
    openapiFields.add("auth_type");
    openapiFields.add("aweme_cancel_image_list");
    openapiFields.add("aweme_cancel_note");
    openapiFields.add("aweme_cancel_reason");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("aweme_user_type");
    openapiFields.add("end_time");
    openapiFields.add("has_video_hp_visibility_limit");
    openapiFields.add("note");
    openapiFields.add("share_type");
    openapiFields.add("start_time");
    openapiFields.add("sub_status");
    openapiFields.add("video_info");
    openapiFields.add("warning_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeAuthListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeAuthListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeAuthListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeAuthListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeAuthListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeAuthListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeAuthListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeAuthListV2ResponseDataListInner
  */
  public static ToolsAwemeAuthListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeAuthListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeAuthListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

