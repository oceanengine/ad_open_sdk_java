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
import com.bytedance.ads.model.ClueCouponDetailV2DataCouponNeedPhone;
import com.bytedance.ads.model.ClueCouponDetailV2DataCouponNeedSmsVerify;
import com.bytedance.ads.model.ClueCouponDetailV2DataCouponStatus;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataCouponGlobalLimit;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataCouponResourceListInner;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataCouponUserLimit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
public class ClueCouponDetailV2ResponseDataCoupon {
  public static final String SERIALIZED_NAME_COUPON_ID = "coupon_id";
  @SerializedName(SERIALIZED_NAME_COUPON_ID)
  private Long couponId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DELIVER_END = "deliver_end";
  @SerializedName(SERIALIZED_NAME_DELIVER_END)
  private String deliverEnd = null;

  public static final String SERIALIZED_NAME_DELIVER_START = "deliver_start";
  @SerializedName(SERIALIZED_NAME_DELIVER_START)
  private String deliverStart = null;

  public static final String SERIALIZED_NAME_GLOBAL_LIMIT = "global_limit";
  @SerializedName(SERIALIZED_NAME_GLOBAL_LIMIT)
  private ClueCouponDetailV2ResponseDataCouponGlobalLimit globalLimit = null;

  public static final String SERIALIZED_NAME_NEED_PHONE = "need_phone";
  @SerializedName(SERIALIZED_NAME_NEED_PHONE)
  private ClueCouponDetailV2DataCouponNeedPhone needPhone = null;

  public static final String SERIALIZED_NAME_NEED_SMS_VERIFY = "need_sms_verify";
  @SerializedName(SERIALIZED_NAME_NEED_SMS_VERIFY)
  private ClueCouponDetailV2DataCouponNeedSmsVerify needSmsVerify = null;

  public static final String SERIALIZED_NAME_RESOURCE_LIST = "resource_list";
  @SerializedName(SERIALIZED_NAME_RESOURCE_LIST)
  private List<ClueCouponDetailV2ResponseDataCouponResourceListInner> resourceList = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ClueCouponDetailV2DataCouponStatus status = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_USER_LIMIT = "user_limit";
  @SerializedName(SERIALIZED_NAME_USER_LIMIT)
  private ClueCouponDetailV2ResponseDataCouponUserLimit userLimit = null;

  public ClueCouponDetailV2ResponseDataCoupon() {
  }

  
  public ClueCouponDetailV2ResponseDataCoupon(
     String createTime, 
     String updateTime
  ) {
    this();
    this.createTime = createTime;
    this.updateTime = updateTime;
  }

  public ClueCouponDetailV2ResponseDataCoupon couponId(Long couponId) {
    
    this.couponId = couponId;
    return this;
  }

   /**
   * 
   * @return couponId
  **/
  @javax.annotation.Nullable
  public Long getCouponId() {
    return couponId;
  }


  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }


   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }




  public ClueCouponDetailV2ResponseDataCoupon deliverEnd(String deliverEnd) {
    
    this.deliverEnd = deliverEnd;
    return this;
  }

   /**
   * 
   * @return deliverEnd
  **/
  @javax.annotation.Nullable
  public String getDeliverEnd() {
    return deliverEnd;
  }


  public void setDeliverEnd(String deliverEnd) {
    this.deliverEnd = deliverEnd;
  }


  public ClueCouponDetailV2ResponseDataCoupon deliverStart(String deliverStart) {
    
    this.deliverStart = deliverStart;
    return this;
  }

   /**
   * 
   * @return deliverStart
  **/
  @javax.annotation.Nullable
  public String getDeliverStart() {
    return deliverStart;
  }


  public void setDeliverStart(String deliverStart) {
    this.deliverStart = deliverStart;
  }


  public ClueCouponDetailV2ResponseDataCoupon globalLimit(ClueCouponDetailV2ResponseDataCouponGlobalLimit globalLimit) {
    
    this.globalLimit = globalLimit;
    return this;
  }

   /**
   * Get globalLimit
   * @return globalLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2ResponseDataCouponGlobalLimit getGlobalLimit() {
    return globalLimit;
  }


  public void setGlobalLimit(ClueCouponDetailV2ResponseDataCouponGlobalLimit globalLimit) {
    this.globalLimit = globalLimit;
  }


  public ClueCouponDetailV2ResponseDataCoupon needPhone(ClueCouponDetailV2DataCouponNeedPhone needPhone) {
    
    this.needPhone = needPhone;
    return this;
  }

   /**
   * Get needPhone
   * @return needPhone
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataCouponNeedPhone getNeedPhone() {
    return needPhone;
  }


  public void setNeedPhone(ClueCouponDetailV2DataCouponNeedPhone needPhone) {
    this.needPhone = needPhone;
  }


  public ClueCouponDetailV2ResponseDataCoupon needSmsVerify(ClueCouponDetailV2DataCouponNeedSmsVerify needSmsVerify) {
    
    this.needSmsVerify = needSmsVerify;
    return this;
  }

   /**
   * Get needSmsVerify
   * @return needSmsVerify
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataCouponNeedSmsVerify getNeedSmsVerify() {
    return needSmsVerify;
  }


  public void setNeedSmsVerify(ClueCouponDetailV2DataCouponNeedSmsVerify needSmsVerify) {
    this.needSmsVerify = needSmsVerify;
  }


  public ClueCouponDetailV2ResponseDataCoupon resourceList(List<ClueCouponDetailV2ResponseDataCouponResourceListInner> resourceList) {
    
    this.resourceList = resourceList;
    return this;
  }

  public ClueCouponDetailV2ResponseDataCoupon addResourceListItem(ClueCouponDetailV2ResponseDataCouponResourceListInner resourceListItem) {
    if (this.resourceList == null) {
      this.resourceList = new ArrayList<>();
    }
    this.resourceList.add(resourceListItem);
    return this;
  }

   /**
   * 
   * @return resourceList
  **/
  @javax.annotation.Nullable
  public List<ClueCouponDetailV2ResponseDataCouponResourceListInner> getResourceList() {
    return resourceList;
  }


  public void setResourceList(List<ClueCouponDetailV2ResponseDataCouponResourceListInner> resourceList) {
    this.resourceList = resourceList;
  }


  public ClueCouponDetailV2ResponseDataCoupon status(ClueCouponDetailV2DataCouponStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataCouponStatus getStatus() {
    return status;
  }


  public void setStatus(ClueCouponDetailV2DataCouponStatus status) {
    this.status = status;
  }


  public ClueCouponDetailV2ResponseDataCoupon title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }




  public ClueCouponDetailV2ResponseDataCoupon userLimit(ClueCouponDetailV2ResponseDataCouponUserLimit userLimit) {
    
    this.userLimit = userLimit;
    return this;
  }

   /**
   * Get userLimit
   * @return userLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2ResponseDataCouponUserLimit getUserLimit() {
    return userLimit;
  }


  public void setUserLimit(ClueCouponDetailV2ResponseDataCouponUserLimit userLimit) {
    this.userLimit = userLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponDetailV2ResponseDataCoupon clueCouponDetailV2ResponseDataCoupon = (ClueCouponDetailV2ResponseDataCoupon) o;
    return Objects.equals(this.couponId, clueCouponDetailV2ResponseDataCoupon.couponId) &&
        Objects.equals(this.createTime, clueCouponDetailV2ResponseDataCoupon.createTime) &&
        Objects.equals(this.deliverEnd, clueCouponDetailV2ResponseDataCoupon.deliverEnd) &&
        Objects.equals(this.deliverStart, clueCouponDetailV2ResponseDataCoupon.deliverStart) &&
        Objects.equals(this.globalLimit, clueCouponDetailV2ResponseDataCoupon.globalLimit) &&
        Objects.equals(this.needPhone, clueCouponDetailV2ResponseDataCoupon.needPhone) &&
        Objects.equals(this.needSmsVerify, clueCouponDetailV2ResponseDataCoupon.needSmsVerify) &&
        Objects.equals(this.resourceList, clueCouponDetailV2ResponseDataCoupon.resourceList) &&
        Objects.equals(this.status, clueCouponDetailV2ResponseDataCoupon.status) &&
        Objects.equals(this.title, clueCouponDetailV2ResponseDataCoupon.title) &&
        Objects.equals(this.updateTime, clueCouponDetailV2ResponseDataCoupon.updateTime) &&
        Objects.equals(this.userLimit, clueCouponDetailV2ResponseDataCoupon.userLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponId, createTime, deliverEnd, deliverStart, globalLimit, needPhone, needSmsVerify, resourceList, status, title, updateTime, userLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponDetailV2ResponseDataCoupon {\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deliverEnd: ").append(toIndentedString(deliverEnd)).append("\n");
    sb.append("    deliverStart: ").append(toIndentedString(deliverStart)).append("\n");
    sb.append("    globalLimit: ").append(toIndentedString(globalLimit)).append("\n");
    sb.append("    needPhone: ").append(toIndentedString(needPhone)).append("\n");
    sb.append("    needSmsVerify: ").append(toIndentedString(needSmsVerify)).append("\n");
    sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    userLimit: ").append(toIndentedString(userLimit)).append("\n");
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
    openapiFields.add("coupon_id");
    openapiFields.add("create_time");
    openapiFields.add("deliver_end");
    openapiFields.add("deliver_start");
    openapiFields.add("global_limit");
    openapiFields.add("need_phone");
    openapiFields.add("need_sms_verify");
    openapiFields.add("resource_list");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("update_time");
    openapiFields.add("user_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponDetailV2ResponseDataCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponDetailV2ResponseDataCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponDetailV2ResponseDataCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponDetailV2ResponseDataCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponDetailV2ResponseDataCoupon>() {
           @Override
           public void write(JsonWriter out, ClueCouponDetailV2ResponseDataCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponDetailV2ResponseDataCoupon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponDetailV2ResponseDataCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponDetailV2ResponseDataCoupon
  * @throws IOException if the JSON string is invalid with respect to ClueCouponDetailV2ResponseDataCoupon
  */
  public static ClueCouponDetailV2ResponseDataCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponDetailV2ResponseDataCoupon.class);
  }

 /**
  * Convert an instance of ClueCouponDetailV2ResponseDataCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

