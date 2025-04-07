/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * ClueCaUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ClueCaUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_USER_IDS = "user_ids";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<String> userIds = null;

  public ClueCaUpdateV2Request() {
  }

  public ClueCaUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueCaUpdateV2Request instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 获客助手组件id
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueCaUpdateV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 获客助手组件名称
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueCaUpdateV2Request userIds(List<String> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public ClueCaUpdateV2Request addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * 客服user_id列表
   * @return userIds
  **/
  @javax.annotation.Nonnull
  public List<String> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCaUpdateV2Request clueCaUpdateV2Request = (ClueCaUpdateV2Request) o;
    return Objects.equals(this.advertiserId, clueCaUpdateV2Request.advertiserId) &&
        Objects.equals(this.instanceId, clueCaUpdateV2Request.instanceId) &&
        Objects.equals(this.name, clueCaUpdateV2Request.name) &&
        Objects.equals(this.userIds, clueCaUpdateV2Request.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, instanceId, name, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCaUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
    openapiFields.add("instance_id");
    openapiFields.add("name");
    openapiFields.add("user_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("instance_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("user_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCaUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCaUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCaUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCaUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCaUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ClueCaUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCaUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCaUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCaUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueCaUpdateV2Request
  */
  public static ClueCaUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCaUpdateV2Request.class);
  }

 /**
  * Convert an instance of ClueCaUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

