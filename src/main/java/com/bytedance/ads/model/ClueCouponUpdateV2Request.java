/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponUpdateV2RequestGlobalLimit;
import com.bytedance.ads.model.ClueCouponUpdateV2RequestUserLimit;
import com.bytedance.ads.model.ClueCouponUpdateV2Status;
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
 * ClueCouponUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ClueCouponUpdateV2Request {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private Long activityId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DELIVER_END = "deliver_end";
  @SerializedName(SERIALIZED_NAME_DELIVER_END)
  private String deliverEnd = null;

  public static final String SERIALIZED_NAME_DELIVER_START = "deliver_start";
  @SerializedName(SERIALIZED_NAME_DELIVER_START)
  private String deliverStart = null;

  public static final String SERIALIZED_NAME_GLOBAL_LIMIT = "global_limit";
  @SerializedName(SERIALIZED_NAME_GLOBAL_LIMIT)
  private ClueCouponUpdateV2RequestGlobalLimit globalLimit = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ClueCouponUpdateV2Status status = null;

  public static final String SERIALIZED_NAME_USER_LIMIT = "user_limit";
  @SerializedName(SERIALIZED_NAME_USER_LIMIT)
  private ClueCouponUpdateV2RequestUserLimit userLimit = null;

  public ClueCouponUpdateV2Request() {
  }

  public ClueCouponUpdateV2Request activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return activityId
  **/
  @javax.annotation.Nonnull
  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public ClueCouponUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueCouponUpdateV2Request deliverEnd(String deliverEnd) {
    
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


  public ClueCouponUpdateV2Request deliverStart(String deliverStart) {
    
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


  public ClueCouponUpdateV2Request globalLimit(ClueCouponUpdateV2RequestGlobalLimit globalLimit) {
    
    this.globalLimit = globalLimit;
    return this;
  }

   /**
   * Get globalLimit
   * @return globalLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponUpdateV2RequestGlobalLimit getGlobalLimit() {
    return globalLimit;
  }


  public void setGlobalLimit(ClueCouponUpdateV2RequestGlobalLimit globalLimit) {
    this.globalLimit = globalLimit;
  }


  public ClueCouponUpdateV2Request status(ClueCouponUpdateV2Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ClueCouponUpdateV2Status getStatus() {
    return status;
  }


  public void setStatus(ClueCouponUpdateV2Status status) {
    this.status = status;
  }


  public ClueCouponUpdateV2Request userLimit(ClueCouponUpdateV2RequestUserLimit userLimit) {
    
    this.userLimit = userLimit;
    return this;
  }

   /**
   * Get userLimit
   * @return userLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponUpdateV2RequestUserLimit getUserLimit() {
    return userLimit;
  }


  public void setUserLimit(ClueCouponUpdateV2RequestUserLimit userLimit) {
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
    ClueCouponUpdateV2Request clueCouponUpdateV2Request = (ClueCouponUpdateV2Request) o;
    return Objects.equals(this.activityId, clueCouponUpdateV2Request.activityId) &&
        Objects.equals(this.advertiserId, clueCouponUpdateV2Request.advertiserId) &&
        Objects.equals(this.deliverEnd, clueCouponUpdateV2Request.deliverEnd) &&
        Objects.equals(this.deliverStart, clueCouponUpdateV2Request.deliverStart) &&
        Objects.equals(this.globalLimit, clueCouponUpdateV2Request.globalLimit) &&
        Objects.equals(this.status, clueCouponUpdateV2Request.status) &&
        Objects.equals(this.userLimit, clueCouponUpdateV2Request.userLimit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, advertiserId, deliverEnd, deliverStart, globalLimit, status, userLimit);
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
    sb.append("class ClueCouponUpdateV2Request {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    deliverEnd: ").append(toIndentedString(deliverEnd)).append("\n");
    sb.append("    deliverStart: ").append(toIndentedString(deliverStart)).append("\n");
    sb.append("    globalLimit: ").append(toIndentedString(globalLimit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("deliver_end");
    openapiFields.add("deliver_start");
    openapiFields.add("global_limit");
    openapiFields.add("status");
    openapiFields.add("user_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("activity_id");
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ClueCouponUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueCouponUpdateV2Request
  */
  public static ClueCouponUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponUpdateV2Request.class);
  }

 /**
  * Convert an instance of ClueCouponUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

