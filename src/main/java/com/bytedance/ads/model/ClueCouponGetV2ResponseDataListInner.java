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
import com.bytedance.ads.model.ClueCouponGetV2DataListActivityType;
import com.bytedance.ads.model.ClueCouponGetV2ResponseDataListInnerCoupon;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ClueCouponGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ClueCouponGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private Long activityId = null;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activity_type";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private ClueCouponGetV2DataListActivityType activityType = null;

  public static final String SERIALIZED_NAME_BIND_FORM_ID = "bind_form_id";
  @SerializedName(SERIALIZED_NAME_BIND_FORM_ID)
  private Long bindFormId = null;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private ClueCouponGetV2ResponseDataListInnerCoupon coupon = null;

  public ClueCouponGetV2ResponseDataListInner() {
  }

  public ClueCouponGetV2ResponseDataListInner activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 
   * @return activityId
  **/
  @javax.annotation.Nullable
  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public ClueCouponGetV2ResponseDataListInner activityType(ClueCouponGetV2DataListActivityType activityType) {
    
    this.activityType = activityType;
    return this;
  }

   /**
   * Get activityType
   * @return activityType
  **/
  @javax.annotation.Nullable
  public ClueCouponGetV2DataListActivityType getActivityType() {
    return activityType;
  }


  public void setActivityType(ClueCouponGetV2DataListActivityType activityType) {
    this.activityType = activityType;
  }


  public ClueCouponGetV2ResponseDataListInner bindFormId(Long bindFormId) {
    
    this.bindFormId = bindFormId;
    return this;
  }

   /**
   * 
   * @return bindFormId
  **/
  @javax.annotation.Nullable
  public Long getBindFormId() {
    return bindFormId;
  }


  public void setBindFormId(Long bindFormId) {
    this.bindFormId = bindFormId;
  }


  public ClueCouponGetV2ResponseDataListInner coupon(ClueCouponGetV2ResponseDataListInnerCoupon coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  public ClueCouponGetV2ResponseDataListInnerCoupon getCoupon() {
    return coupon;
  }


  public void setCoupon(ClueCouponGetV2ResponseDataListInnerCoupon coupon) {
    this.coupon = coupon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponGetV2ResponseDataListInner clueCouponGetV2ResponseDataListInner = (ClueCouponGetV2ResponseDataListInner) o;
    return Objects.equals(this.activityId, clueCouponGetV2ResponseDataListInner.activityId) &&
        Objects.equals(this.activityType, clueCouponGetV2ResponseDataListInner.activityType) &&
        Objects.equals(this.bindFormId, clueCouponGetV2ResponseDataListInner.bindFormId) &&
        Objects.equals(this.coupon, clueCouponGetV2ResponseDataListInner.coupon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityType, bindFormId, coupon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponGetV2ResponseDataListInner {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    bindFormId: ").append(toIndentedString(bindFormId)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("activity_type");
    openapiFields.add("bind_form_id");
    openapiFields.add("coupon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponGetV2ResponseDataListInner
  */
  public static ClueCouponGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ClueCouponGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

