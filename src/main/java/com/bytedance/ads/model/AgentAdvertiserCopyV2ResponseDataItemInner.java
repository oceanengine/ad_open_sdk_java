/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * AgentAdvertiserCopyV2ResponseDataItemInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class AgentAdvertiserCopyV2ResponseDataItemInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
  @SerializedName(SERIALIZED_NAME_ERROR_MSG)
  private String errorMsg = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success = null;

  public AgentAdvertiserCopyV2ResponseDataItemInner() {
  }

  public AgentAdvertiserCopyV2ResponseDataItemInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AgentAdvertiserCopyV2ResponseDataItemInner errorMsg(String errorMsg) {
    
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * 当失败时，返回的失败原因
   * @return errorMsg
  **/
  @javax.annotation.Nullable
  public String getErrorMsg() {
    return errorMsg;
  }


  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }


  public AgentAdvertiserCopyV2ResponseDataItemInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 广告主账户名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AgentAdvertiserCopyV2ResponseDataItemInner success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * 复制是否成功
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
    AgentAdvertiserCopyV2ResponseDataItemInner agentAdvertiserCopyV2ResponseDataItemInner = (AgentAdvertiserCopyV2ResponseDataItemInner) o;
    return Objects.equals(this.advertiserId, agentAdvertiserCopyV2ResponseDataItemInner.advertiserId) &&
        Objects.equals(this.errorMsg, agentAdvertiserCopyV2ResponseDataItemInner.errorMsg) &&
        Objects.equals(this.name, agentAdvertiserCopyV2ResponseDataItemInner.name) &&
        Objects.equals(this.success, agentAdvertiserCopyV2ResponseDataItemInner.success);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, errorMsg, name, success);
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
    sb.append("class AgentAdvertiserCopyV2ResponseDataItemInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("error_msg");
    openapiFields.add("name");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("success");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserCopyV2ResponseDataItemInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserCopyV2ResponseDataItemInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserCopyV2ResponseDataItemInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserCopyV2ResponseDataItemInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserCopyV2ResponseDataItemInner>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserCopyV2ResponseDataItemInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserCopyV2ResponseDataItemInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserCopyV2ResponseDataItemInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserCopyV2ResponseDataItemInner
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserCopyV2ResponseDataItemInner
  */
  public static AgentAdvertiserCopyV2ResponseDataItemInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserCopyV2ResponseDataItemInner.class);
  }

 /**
  * Convert an instance of AgentAdvertiserCopyV2ResponseDataItemInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

