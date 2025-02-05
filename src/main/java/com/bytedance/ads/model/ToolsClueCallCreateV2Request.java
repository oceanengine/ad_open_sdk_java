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
 * ToolsClueCallCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ToolsClueCallCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CALL_TYPE = "call_type";
  @SerializedName(SERIALIZED_NAME_CALL_TYPE)
  private Integer callType = null;

  public static final String SERIALIZED_NAME_CALLEE_NUMBER = "callee_number";
  @SerializedName(SERIALIZED_NAME_CALLEE_NUMBER)
  private String calleeNumber = null;

  public static final String SERIALIZED_NAME_CALLER_NUMBER = "caller_number";
  @SerializedName(SERIALIZED_NAME_CALLER_NUMBER)
  private String callerNumber = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private Long clueId = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public ToolsClueCallCreateV2Request() {
  }

  public ToolsClueCallCreateV2Request advertiserId(Long advertiserId) {
    
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


  public ToolsClueCallCreateV2Request callType(Integer callType) {
    
    this.callType = callType;
    return this;
  }

   /**
   * 呼叫方式。1表示axb，3表示双呼，4表示网络电话。
   * @return callType
  **/
  @javax.annotation.Nullable
  public Integer getCallType() {
    return callType;
  }


  public void setCallType(Integer callType) {
    this.callType = callType;
  }


  public ToolsClueCallCreateV2Request calleeNumber(String calleeNumber) {
    
    this.calleeNumber = calleeNumber;
    return this;
  }

   /**
   * 线索号码
   * @return calleeNumber
  **/
  @javax.annotation.Nullable
  public String getCalleeNumber() {
    return calleeNumber;
  }


  public void setCalleeNumber(String calleeNumber) {
    this.calleeNumber = calleeNumber;
  }


  public ToolsClueCallCreateV2Request callerNumber(String callerNumber) {
    
    this.callerNumber = callerNumber;
    return this;
  }

   /**
   * 客服电话。当呼叫方式为网络电话时，该字段可不传，其他类型均要传该字段。当呼叫方式为axb时，拨打中间号的手机号必须要与该号码一致。
   * @return callerNumber
  **/
  @javax.annotation.Nullable
  public String getCallerNumber() {
    return callerNumber;
  }


  public void setCallerNumber(String callerNumber) {
    this.callerNumber = callerNumber;
  }


  public ToolsClueCallCreateV2Request clueId(Long clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 线索ID
   * @return clueId
  **/
  @javax.annotation.Nullable
  public Long getClueId() {
    return clueId;
  }


  public void setClueId(Long clueId) {
    this.clueId = clueId;
  }


  public ToolsClueCallCreateV2Request userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 客服ID。平台下客服ID不得重复。
   * @return userId
  **/
  @javax.annotation.Nullable
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueCallCreateV2Request toolsClueCallCreateV2Request = (ToolsClueCallCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsClueCallCreateV2Request.advertiserId) &&
        Objects.equals(this.callType, toolsClueCallCreateV2Request.callType) &&
        Objects.equals(this.calleeNumber, toolsClueCallCreateV2Request.calleeNumber) &&
        Objects.equals(this.callerNumber, toolsClueCallCreateV2Request.callerNumber) &&
        Objects.equals(this.clueId, toolsClueCallCreateV2Request.clueId) &&
        Objects.equals(this.userId, toolsClueCallCreateV2Request.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, callType, calleeNumber, callerNumber, clueId, userId);
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
    sb.append("class ToolsClueCallCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
    sb.append("    calleeNumber: ").append(toIndentedString(calleeNumber)).append("\n");
    sb.append("    callerNumber: ").append(toIndentedString(callerNumber)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("call_type");
    openapiFields.add("callee_number");
    openapiFields.add("caller_number");
    openapiFields.add("clue_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("call_type");
    openapiRequiredFields.add("callee_number");
    openapiRequiredFields.add("clue_id");
    openapiRequiredFields.add("user_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueCallCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueCallCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueCallCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueCallCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueCallCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueCallCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueCallCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueCallCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueCallCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueCallCreateV2Request
  */
  public static ToolsClueCallCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueCallCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueCallCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

