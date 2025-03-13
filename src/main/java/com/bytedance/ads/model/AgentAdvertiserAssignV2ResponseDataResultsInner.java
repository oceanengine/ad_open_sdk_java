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
 * AgentAdvertiserAssignV2ResponseDataResultsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AgentAdvertiserAssignV2ResponseDataResultsInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ERR_MSG = "err_msg";
  @SerializedName(SERIALIZED_NAME_ERR_MSG)
  private String errMsg = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success = null;

  public AgentAdvertiserAssignV2ResponseDataResultsInner() {
  }

  public AgentAdvertiserAssignV2ResponseDataResultsInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AgentAdvertiserAssignV2ResponseDataResultsInner errMsg(String errMsg) {
    
    this.errMsg = errMsg;
    return this;
  }

   /**
   * 分配失败原因
   * @return errMsg
  **/
  @javax.annotation.Nullable
  public String getErrMsg() {
    return errMsg;
  }


  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }


  public AgentAdvertiserAssignV2ResponseDataResultsInner success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * 分配是否成功, true:成功, false:失败
   * @return success
  **/
  @javax.annotation.Nullable
  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserAssignV2ResponseDataResultsInner agentAdvertiserAssignV2ResponseDataResultsInner = (AgentAdvertiserAssignV2ResponseDataResultsInner) o;
    return Objects.equals(this.advertiserId, agentAdvertiserAssignV2ResponseDataResultsInner.advertiserId) &&
        Objects.equals(this.errMsg, agentAdvertiserAssignV2ResponseDataResultsInner.errMsg) &&
        Objects.equals(this.success, agentAdvertiserAssignV2ResponseDataResultsInner.success);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, errMsg, success);
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
    sb.append("class AgentAdvertiserAssignV2ResponseDataResultsInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("err_msg");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserAssignV2ResponseDataResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserAssignV2ResponseDataResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserAssignV2ResponseDataResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserAssignV2ResponseDataResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserAssignV2ResponseDataResultsInner>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserAssignV2ResponseDataResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserAssignV2ResponseDataResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserAssignV2ResponseDataResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserAssignV2ResponseDataResultsInner
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserAssignV2ResponseDataResultsInner
  */
  public static AgentAdvertiserAssignV2ResponseDataResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserAssignV2ResponseDataResultsInner.class);
  }

 /**
  * Convert an instance of AgentAdvertiserAssignV2ResponseDataResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

