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
import com.bytedance.ads.model.ToolsRtaSetScopeV2AccountType;
import com.bytedance.ads.model.ToolsRtaSetScopeV2TargetType;
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
 * ToolsRtaSetScopeV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsRtaSetScopeV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsRtaSetScopeV2AccountType accountType = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_RTA_ID = "rta_id";
  @SerializedName(SERIALIZED_NAME_RTA_ID)
  private Long rtaId = null;

  public static final String SERIALIZED_NAME_TARGET_IDS = "target_ids";
  @SerializedName(SERIALIZED_NAME_TARGET_IDS)
  private List<Long> targetIds = null;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private ToolsRtaSetScopeV2TargetType targetType = null;

  public ToolsRtaSetScopeV2Request() {
  }

  public ToolsRtaSetScopeV2Request accountType(ToolsRtaSetScopeV2AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsRtaSetScopeV2AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsRtaSetScopeV2AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsRtaSetScopeV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告账户id
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsRtaSetScopeV2Request rtaId(Long rtaId) {
    
    this.rtaId = rtaId;
    return this;
  }

   /**
   * 预期设置的rta策略id
   * minimum: 1
   * @return rtaId
  **/
  @javax.annotation.Nonnull
  public Long getRtaId() {
    return rtaId;
  }


  public void setRtaId(Long rtaId) {
    this.rtaId = rtaId;
  }


  public ToolsRtaSetScopeV2Request targetIds(List<Long> targetIds) {
    
    this.targetIds = targetIds;
    return this;
  }

  public ToolsRtaSetScopeV2Request addTargetIdsItem(Long targetIdsItem) {
    if (this.targetIds == null) {
      this.targetIds = new ArrayList<>();
    }
    this.targetIds.add(targetIdsItem);
    return this;
  }

   /**
   * 生效ID列表，当target_type &#x3D; CAMPAIGN 或 PROJECT 有效
   * @return targetIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTargetIds() {
    return targetIds;
  }


  public void setTargetIds(List<Long> targetIds) {
    this.targetIds = targetIds;
  }


  public ToolsRtaSetScopeV2Request targetType(ToolsRtaSetScopeV2TargetType targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @javax.annotation.Nullable
  public ToolsRtaSetScopeV2TargetType getTargetType() {
    return targetType;
  }


  public void setTargetType(ToolsRtaSetScopeV2TargetType targetType) {
    this.targetType = targetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRtaSetScopeV2Request toolsRtaSetScopeV2Request = (ToolsRtaSetScopeV2Request) o;
    return Objects.equals(this.accountType, toolsRtaSetScopeV2Request.accountType) &&
        Objects.equals(this.advertiserId, toolsRtaSetScopeV2Request.advertiserId) &&
        Objects.equals(this.rtaId, toolsRtaSetScopeV2Request.rtaId) &&
        Objects.equals(this.targetIds, toolsRtaSetScopeV2Request.targetIds) &&
        Objects.equals(this.targetType, toolsRtaSetScopeV2Request.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, advertiserId, rtaId, targetIds, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsRtaSetScopeV2Request {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    rtaId: ").append(toIndentedString(rtaId)).append("\n");
    sb.append("    targetIds: ").append(toIndentedString(targetIds)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("account_type");
    openapiFields.add("advertiser_id");
    openapiFields.add("rta_id");
    openapiFields.add("target_ids");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("rta_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRtaSetScopeV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRtaSetScopeV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRtaSetScopeV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRtaSetScopeV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRtaSetScopeV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsRtaSetScopeV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRtaSetScopeV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRtaSetScopeV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRtaSetScopeV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsRtaSetScopeV2Request
  */
  public static ToolsRtaSetScopeV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRtaSetScopeV2Request.class);
  }

 /**
  * Convert an instance of ToolsRtaSetScopeV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

