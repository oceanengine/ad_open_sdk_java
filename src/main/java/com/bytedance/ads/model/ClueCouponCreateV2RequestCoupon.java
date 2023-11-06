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
import com.bytedance.ads.model.ClueCouponCreateV2CouponNeedPhone;
import com.bytedance.ads.model.ClueCouponCreateV2CouponNeedSmsVerify;
import com.bytedance.ads.model.ClueCouponCreateV2RequestCouponGlobalLimit;
import com.bytedance.ads.model.ClueCouponCreateV2RequestCouponResourceListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class ClueCouponCreateV2RequestCoupon {
  public static final String SERIALIZED_NAME_DELIVER_END = "deliver_end";
  @SerializedName(SERIALIZED_NAME_DELIVER_END)
  private String deliverEnd = null;

  public static final String SERIALIZED_NAME_DELIVER_START = "deliver_start";
  @SerializedName(SERIALIZED_NAME_DELIVER_START)
  private String deliverStart = null;

  public static final String SERIALIZED_NAME_GLOBAL_LIMIT = "global_limit";
  @SerializedName(SERIALIZED_NAME_GLOBAL_LIMIT)
  private ClueCouponCreateV2RequestCouponGlobalLimit globalLimit = null;

  public static final String SERIALIZED_NAME_NEED_PHONE = "need_phone";
  @SerializedName(SERIALIZED_NAME_NEED_PHONE)
  private ClueCouponCreateV2CouponNeedPhone needPhone = null;

  public static final String SERIALIZED_NAME_NEED_SMS_VERIFY = "need_sms_verify";
  @SerializedName(SERIALIZED_NAME_NEED_SMS_VERIFY)
  private ClueCouponCreateV2CouponNeedSmsVerify needSmsVerify = null;

  public static final String SERIALIZED_NAME_RESOURCE_LIST = "resource_list";
  @SerializedName(SERIALIZED_NAME_RESOURCE_LIST)
  private List<ClueCouponCreateV2RequestCouponResourceListInner> resourceList = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_USER_LIMIT = "user_limit";
  @SerializedName(SERIALIZED_NAME_USER_LIMIT)
  private ClueCouponCreateV2RequestCouponGlobalLimit userLimit = null;

  public ClueCouponCreateV2RequestCoupon() {
  }

  public ClueCouponCreateV2RequestCoupon deliverEnd(String deliverEnd) {
    
    this.deliverEnd = deliverEnd;
    return this;
  }

   /**
   * 
   * @return deliverEnd
  **/
  @javax.annotation.Nonnull
  public String getDeliverEnd() {
    return deliverEnd;
  }


  public void setDeliverEnd(String deliverEnd) {
    this.deliverEnd = deliverEnd;
  }


  public ClueCouponCreateV2RequestCoupon deliverStart(String deliverStart) {
    
    this.deliverStart = deliverStart;
    return this;
  }

   /**
   * 
   * @return deliverStart
  **/
  @javax.annotation.Nonnull
  public String getDeliverStart() {
    return deliverStart;
  }


  public void setDeliverStart(String deliverStart) {
    this.deliverStart = deliverStart;
  }


  public ClueCouponCreateV2RequestCoupon globalLimit(ClueCouponCreateV2RequestCouponGlobalLimit globalLimit) {
    
    this.globalLimit = globalLimit;
    return this;
  }

   /**
   * Get globalLimit
   * @return globalLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponCreateV2RequestCouponGlobalLimit getGlobalLimit() {
    return globalLimit;
  }


  public void setGlobalLimit(ClueCouponCreateV2RequestCouponGlobalLimit globalLimit) {
    this.globalLimit = globalLimit;
  }


  public ClueCouponCreateV2RequestCoupon needPhone(ClueCouponCreateV2CouponNeedPhone needPhone) {
    
    this.needPhone = needPhone;
    return this;
  }

   /**
   * Get needPhone
   * @return needPhone
  **/
  @javax.annotation.Nullable
  public ClueCouponCreateV2CouponNeedPhone getNeedPhone() {
    return needPhone;
  }


  public void setNeedPhone(ClueCouponCreateV2CouponNeedPhone needPhone) {
    this.needPhone = needPhone;
  }


  public ClueCouponCreateV2RequestCoupon needSmsVerify(ClueCouponCreateV2CouponNeedSmsVerify needSmsVerify) {
    
    this.needSmsVerify = needSmsVerify;
    return this;
  }

   /**
   * Get needSmsVerify
   * @return needSmsVerify
  **/
  @javax.annotation.Nullable
  public ClueCouponCreateV2CouponNeedSmsVerify getNeedSmsVerify() {
    return needSmsVerify;
  }


  public void setNeedSmsVerify(ClueCouponCreateV2CouponNeedSmsVerify needSmsVerify) {
    this.needSmsVerify = needSmsVerify;
  }


  public ClueCouponCreateV2RequestCoupon resourceList(List<ClueCouponCreateV2RequestCouponResourceListInner> resourceList) {
    
    this.resourceList = resourceList;
    return this;
  }

  public ClueCouponCreateV2RequestCoupon addResourceListItem(ClueCouponCreateV2RequestCouponResourceListInner resourceListItem) {
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
  @javax.annotation.Nonnull
  public List<ClueCouponCreateV2RequestCouponResourceListInner> getResourceList() {
    return resourceList;
  }


  public void setResourceList(List<ClueCouponCreateV2RequestCouponResourceListInner> resourceList) {
    this.resourceList = resourceList;
  }


  public ClueCouponCreateV2RequestCoupon title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ClueCouponCreateV2RequestCoupon userLimit(ClueCouponCreateV2RequestCouponGlobalLimit userLimit) {
    
    this.userLimit = userLimit;
    return this;
  }

   /**
   * Get userLimit
   * @return userLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponCreateV2RequestCouponGlobalLimit getUserLimit() {
    return userLimit;
  }


  public void setUserLimit(ClueCouponCreateV2RequestCouponGlobalLimit userLimit) {
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
    ClueCouponCreateV2RequestCoupon clueCouponCreateV2RequestCoupon = (ClueCouponCreateV2RequestCoupon) o;
    return Objects.equals(this.deliverEnd, clueCouponCreateV2RequestCoupon.deliverEnd) &&
        Objects.equals(this.deliverStart, clueCouponCreateV2RequestCoupon.deliverStart) &&
        Objects.equals(this.globalLimit, clueCouponCreateV2RequestCoupon.globalLimit) &&
        Objects.equals(this.needPhone, clueCouponCreateV2RequestCoupon.needPhone) &&
        Objects.equals(this.needSmsVerify, clueCouponCreateV2RequestCoupon.needSmsVerify) &&
        Objects.equals(this.resourceList, clueCouponCreateV2RequestCoupon.resourceList) &&
        Objects.equals(this.title, clueCouponCreateV2RequestCoupon.title) &&
        Objects.equals(this.userLimit, clueCouponCreateV2RequestCoupon.userLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverEnd, deliverStart, globalLimit, needPhone, needSmsVerify, resourceList, title, userLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponCreateV2RequestCoupon {\n");
    sb.append("    deliverEnd: ").append(toIndentedString(deliverEnd)).append("\n");
    sb.append("    deliverStart: ").append(toIndentedString(deliverStart)).append("\n");
    sb.append("    globalLimit: ").append(toIndentedString(globalLimit)).append("\n");
    sb.append("    needPhone: ").append(toIndentedString(needPhone)).append("\n");
    sb.append("    needSmsVerify: ").append(toIndentedString(needSmsVerify)).append("\n");
    sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("deliver_end");
    openapiFields.add("deliver_start");
    openapiFields.add("global_limit");
    openapiFields.add("need_phone");
    openapiFields.add("need_sms_verify");
    openapiFields.add("resource_list");
    openapiFields.add("title");
    openapiFields.add("user_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("deliver_end");
    openapiRequiredFields.add("deliver_start");
    openapiRequiredFields.add("resource_list");
    openapiRequiredFields.add("title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponCreateV2RequestCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponCreateV2RequestCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponCreateV2RequestCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponCreateV2RequestCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponCreateV2RequestCoupon>() {
           @Override
           public void write(JsonWriter out, ClueCouponCreateV2RequestCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponCreateV2RequestCoupon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponCreateV2RequestCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponCreateV2RequestCoupon
  * @throws IOException if the JSON string is invalid with respect to ClueCouponCreateV2RequestCoupon
  */
  public static ClueCouponCreateV2RequestCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponCreateV2RequestCoupon.class);
  }

 /**
  * Convert an instance of ClueCouponCreateV2RequestCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

