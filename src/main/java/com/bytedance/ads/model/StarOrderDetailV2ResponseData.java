/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderDetailV2ResponseDataAuthorInfo;
import com.bytedance.ads.model.StarOrderDetailV2ResponseDataComponentInfoInner;
import com.bytedance.ads.model.StarOrderDetailV2ResponseDataPaymentInfo;
import com.bytedance.ads.model.StarOrderDetailV2ResponseDataScriptListInner;
import com.bytedance.ads.model.StarOrderDetailV2ResponseDataVideoListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class StarOrderDetailV2ResponseData {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private Long auditStatus = null;

  public static final String SERIALIZED_NAME_AUTHOR_CANCEL_REASON = "author_cancel_reason";
  @SerializedName(SERIALIZED_NAME_AUTHOR_CANCEL_REASON)
  private String authorCancelReason = null;

  public static final String SERIALIZED_NAME_AUTHOR_CANCEL_STATUS = "author_cancel_status";
  @SerializedName(SERIALIZED_NAME_AUTHOR_CANCEL_STATUS)
  private Long authorCancelStatus = null;

  public static final String SERIALIZED_NAME_AUTHOR_INFO = "author_info";
  @SerializedName(SERIALIZED_NAME_AUTHOR_INFO)
  private StarOrderDetailV2ResponseDataAuthorInfo authorInfo = null;

  public static final String SERIALIZED_NAME_COMPONENT_INFO = "component_info";
  @SerializedName(SERIALIZED_NAME_COMPONENT_INFO)
  private List<StarOrderDetailV2ResponseDataComponentInfoInner> componentInfo = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_FINISH_TIME = "finish_time";
  @SerializedName(SERIALIZED_NAME_FINISH_TIME)
  private Long finishTime = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PAYMENT_INFO = "payment_info";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INFO)
  private StarOrderDetailV2ResponseDataPaymentInfo paymentInfo = null;

  public static final String SERIALIZED_NAME_SCRIPT_LIST = "script_list";
  @SerializedName(SERIALIZED_NAME_SCRIPT_LIST)
  private List<StarOrderDetailV2ResponseDataScriptListInner> scriptList = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_VIDEO_LIST = "video_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_LIST)
  private List<StarOrderDetailV2ResponseDataVideoListInner> videoList = null;

  public StarOrderDetailV2ResponseData() {
  }

  public StarOrderDetailV2ResponseData auditStatus(Long auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 订单审核状态 未审核 &#x3D; 0 脚本审核失败 &#x3D; 1 脚本审核通过 &#x3D; 2 视频审核失败 &#x3D; 3 视频审核通过 &#x3D; 4 组件审核拒绝 &#x3D; 5 组件审核通过 &#x3D; 6 订单跳过审核 &#x3D; 7
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public Long getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(Long auditStatus) {
    this.auditStatus = auditStatus;
  }


  public StarOrderDetailV2ResponseData authorCancelReason(String authorCancelReason) {
    
    this.authorCancelReason = authorCancelReason;
    return this;
  }

   /**
   * 达人取消原因
   * @return authorCancelReason
  **/
  @javax.annotation.Nullable
  public String getAuthorCancelReason() {
    return authorCancelReason;
  }


  public void setAuthorCancelReason(String authorCancelReason) {
    this.authorCancelReason = authorCancelReason;
  }


  public StarOrderDetailV2ResponseData authorCancelStatus(Long authorCancelStatus) {
    
    this.authorCancelStatus = authorCancelStatus;
    return this;
  }

   /**
   * 达人取消状态 0 &#x3D; 未发起 1 &#x3D; 已发起
   * @return authorCancelStatus
  **/
  @javax.annotation.Nullable
  public Long getAuthorCancelStatus() {
    return authorCancelStatus;
  }


  public void setAuthorCancelStatus(Long authorCancelStatus) {
    this.authorCancelStatus = authorCancelStatus;
  }


  public StarOrderDetailV2ResponseData authorInfo(StarOrderDetailV2ResponseDataAuthorInfo authorInfo) {
    
    this.authorInfo = authorInfo;
    return this;
  }

   /**
   * Get authorInfo
   * @return authorInfo
  **/
  @javax.annotation.Nullable
  public StarOrderDetailV2ResponseDataAuthorInfo getAuthorInfo() {
    return authorInfo;
  }


  public void setAuthorInfo(StarOrderDetailV2ResponseDataAuthorInfo authorInfo) {
    this.authorInfo = authorInfo;
  }


  public StarOrderDetailV2ResponseData componentInfo(List<StarOrderDetailV2ResponseDataComponentInfoInner> componentInfo) {
    
    this.componentInfo = componentInfo;
    return this;
  }

  public StarOrderDetailV2ResponseData addComponentInfoItem(StarOrderDetailV2ResponseDataComponentInfoInner componentInfoItem) {
    if (this.componentInfo == null) {
      this.componentInfo = new ArrayList<>();
    }
    this.componentInfo.add(componentInfoItem);
    return this;
  }

   /**
   * 组件信息
   * @return componentInfo
  **/
  @javax.annotation.Nullable
  public List<StarOrderDetailV2ResponseDataComponentInfoInner> getComponentInfo() {
    return componentInfo;
  }


  public void setComponentInfo(List<StarOrderDetailV2ResponseDataComponentInfoInner> componentInfo) {
    this.componentInfo = componentInfo;
  }


  public StarOrderDetailV2ResponseData createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 任务创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarOrderDetailV2ResponseData finishTime(Long finishTime) {
    
    this.finishTime = finishTime;
    return this;
  }

   /**
   * 任务完结时间
   * @return finishTime
  **/
  @javax.annotation.Nullable
  public Long getFinishTime() {
    return finishTime;
  }


  public void setFinishTime(Long finishTime) {
    this.finishTime = finishTime;
  }


  public StarOrderDetailV2ResponseData orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 任务ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderDetailV2ResponseData paymentInfo(StarOrderDetailV2ResponseDataPaymentInfo paymentInfo) {
    
    this.paymentInfo = paymentInfo;
    return this;
  }

   /**
   * Get paymentInfo
   * @return paymentInfo
  **/
  @javax.annotation.Nullable
  public StarOrderDetailV2ResponseDataPaymentInfo getPaymentInfo() {
    return paymentInfo;
  }


  public void setPaymentInfo(StarOrderDetailV2ResponseDataPaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
  }


  public StarOrderDetailV2ResponseData scriptList(List<StarOrderDetailV2ResponseDataScriptListInner> scriptList) {
    
    this.scriptList = scriptList;
    return this;
  }

  public StarOrderDetailV2ResponseData addScriptListItem(StarOrderDetailV2ResponseDataScriptListInner scriptListItem) {
    if (this.scriptList == null) {
      this.scriptList = new ArrayList<>();
    }
    this.scriptList.add(scriptListItem);
    return this;
  }

   /**
   * 脚本列表
   * @return scriptList
  **/
  @javax.annotation.Nullable
  public List<StarOrderDetailV2ResponseDataScriptListInner> getScriptList() {
    return scriptList;
  }


  public void setScriptList(List<StarOrderDetailV2ResponseDataScriptListInner> scriptList) {
    this.scriptList = scriptList;
  }


  public StarOrderDetailV2ResponseData status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 任务状态 待接收 &#x3D; -1 达人已接单 &#x3D; 1 已关闭 &#x3D; 2 已完成 &#x3D; 3 已取消 &#x3D; 4 待付尾款 &#x3D; 10 脚本已上传 &#x3D; 41 脚本已拒绝 &#x3D; 42 脚本已确认 &#x3D; 43 脚本已跳过 &#x3D; 44 视频已上传 &#x3D; 51 视频已拒绝 &#x3D; 52 视频已确认 &#x3D; 53 视频已发布 &#x3D; 54
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public StarOrderDetailV2ResponseData videoList(List<StarOrderDetailV2ResponseDataVideoListInner> videoList) {
    
    this.videoList = videoList;
    return this;
  }

  public StarOrderDetailV2ResponseData addVideoListItem(StarOrderDetailV2ResponseDataVideoListInner videoListItem) {
    if (this.videoList == null) {
      this.videoList = new ArrayList<>();
    }
    this.videoList.add(videoListItem);
    return this;
  }

   /**
   * 视频列表
   * @return videoList
  **/
  @javax.annotation.Nullable
  public List<StarOrderDetailV2ResponseDataVideoListInner> getVideoList() {
    return videoList;
  }


  public void setVideoList(List<StarOrderDetailV2ResponseDataVideoListInner> videoList) {
    this.videoList = videoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderDetailV2ResponseData starOrderDetailV2ResponseData = (StarOrderDetailV2ResponseData) o;
    return Objects.equals(this.auditStatus, starOrderDetailV2ResponseData.auditStatus) &&
        Objects.equals(this.authorCancelReason, starOrderDetailV2ResponseData.authorCancelReason) &&
        Objects.equals(this.authorCancelStatus, starOrderDetailV2ResponseData.authorCancelStatus) &&
        Objects.equals(this.authorInfo, starOrderDetailV2ResponseData.authorInfo) &&
        Objects.equals(this.componentInfo, starOrderDetailV2ResponseData.componentInfo) &&
        Objects.equals(this.createTime, starOrderDetailV2ResponseData.createTime) &&
        Objects.equals(this.finishTime, starOrderDetailV2ResponseData.finishTime) &&
        Objects.equals(this.orderId, starOrderDetailV2ResponseData.orderId) &&
        Objects.equals(this.paymentInfo, starOrderDetailV2ResponseData.paymentInfo) &&
        Objects.equals(this.scriptList, starOrderDetailV2ResponseData.scriptList) &&
        Objects.equals(this.status, starOrderDetailV2ResponseData.status) &&
        Objects.equals(this.videoList, starOrderDetailV2ResponseData.videoList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, authorCancelReason, authorCancelStatus, authorInfo, componentInfo, createTime, finishTime, orderId, paymentInfo, scriptList, status, videoList);
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
    sb.append("class StarOrderDetailV2ResponseData {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    authorCancelReason: ").append(toIndentedString(authorCancelReason)).append("\n");
    sb.append("    authorCancelStatus: ").append(toIndentedString(authorCancelStatus)).append("\n");
    sb.append("    authorInfo: ").append(toIndentedString(authorInfo)).append("\n");
    sb.append("    componentInfo: ").append(toIndentedString(componentInfo)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    scriptList: ").append(toIndentedString(scriptList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    videoList: ").append(toIndentedString(videoList)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("author_cancel_reason");
    openapiFields.add("author_cancel_status");
    openapiFields.add("author_info");
    openapiFields.add("component_info");
    openapiFields.add("create_time");
    openapiFields.add("finish_time");
    openapiFields.add("order_id");
    openapiFields.add("payment_info");
    openapiFields.add("script_list");
    openapiFields.add("status");
    openapiFields.add("video_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderDetailV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderDetailV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderDetailV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderDetailV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderDetailV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarOrderDetailV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderDetailV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderDetailV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderDetailV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarOrderDetailV2ResponseData
  */
  public static StarOrderDetailV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderDetailV2ResponseData.class);
  }

 /**
  * Convert an instance of StarOrderDetailV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

