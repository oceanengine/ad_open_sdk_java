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
import com.bytedance.ads.model.ClueWechatInstanceUpdateV2Action;
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
 * ClueWechatInstanceUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ClueWechatInstanceUpdateV2Request {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ClueWechatInstanceUpdateV2Action action = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_WECHAT_LIST = "wechat_list";
  @SerializedName(SERIALIZED_NAME_WECHAT_LIST)
  private List<String> wechatList = null;

  public ClueWechatInstanceUpdateV2Request() {
  }

  public ClueWechatInstanceUpdateV2Request action(ClueWechatInstanceUpdateV2Action action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public ClueWechatInstanceUpdateV2Action getAction() {
    return action;
  }


  public void setAction(ClueWechatInstanceUpdateV2Action action) {
    this.action = action;
  }


  public ClueWechatInstanceUpdateV2Request advertiserId(Long advertiserId) {
    
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


  public ClueWechatInstanceUpdateV2Request instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 微信号码包ID
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueWechatInstanceUpdateV2Request wechatList(List<String> wechatList) {
    
    this.wechatList = wechatList;
    return this;
  }

  public ClueWechatInstanceUpdateV2Request addWechatListItem(String wechatListItem) {
    if (this.wechatList == null) {
      this.wechatList = new ArrayList<>();
    }
    this.wechatList.add(wechatListItem);
    return this;
  }

   /**
   * 要修改的微信列表，最多不超过100个
   * @return wechatList
  **/
  @javax.annotation.Nullable
  public List<String> getWechatList() {
    return wechatList;
  }


  public void setWechatList(List<String> wechatList) {
    this.wechatList = wechatList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatInstanceUpdateV2Request clueWechatInstanceUpdateV2Request = (ClueWechatInstanceUpdateV2Request) o;
    return Objects.equals(this.action, clueWechatInstanceUpdateV2Request.action) &&
        Objects.equals(this.advertiserId, clueWechatInstanceUpdateV2Request.advertiserId) &&
        Objects.equals(this.instanceId, clueWechatInstanceUpdateV2Request.instanceId) &&
        Objects.equals(this.wechatList, clueWechatInstanceUpdateV2Request.wechatList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, advertiserId, instanceId, wechatList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueWechatInstanceUpdateV2Request {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    wechatList: ").append(toIndentedString(wechatList)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("advertiser_id");
    openapiFields.add("instance_id");
    openapiFields.add("wechat_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("instance_id");
    openapiRequiredFields.add("wechat_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatInstanceUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatInstanceUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatInstanceUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatInstanceUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatInstanceUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ClueWechatInstanceUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatInstanceUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatInstanceUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatInstanceUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueWechatInstanceUpdateV2Request
  */
  public static ClueWechatInstanceUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatInstanceUpdateV2Request.class);
  }

 /**
  * Convert an instance of ClueWechatInstanceUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

