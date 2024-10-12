/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsRtaStatusUpdateV2AccountType;
import com.bytedance.ads.model.ToolsRtaStatusUpdateV2Status;
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
 * ToolsRtaStatusUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsRtaStatusUpdateV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsRtaStatusUpdateV2AccountType accountType = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_RTA_IDS = "rta_ids";
  @SerializedName(SERIALIZED_NAME_RTA_IDS)
  private List<Long> rtaIds = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsRtaStatusUpdateV2Status status = null;

  public ToolsRtaStatusUpdateV2Request() {
  }

  public ToolsRtaStatusUpdateV2Request accountType(ToolsRtaStatusUpdateV2AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public ToolsRtaStatusUpdateV2AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsRtaStatusUpdateV2AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsRtaStatusUpdateV2Request advertiserId(Long advertiserId) {
    
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


  public ToolsRtaStatusUpdateV2Request rtaIds(List<Long> rtaIds) {
    
    this.rtaIds = rtaIds;
    return this;
  }

  public ToolsRtaStatusUpdateV2Request addRtaIdsItem(Long rtaIdsItem) {
    if (this.rtaIds == null) {
      this.rtaIds = new ArrayList<>();
    }
    this.rtaIds.add(rtaIdsItem);
    return this;
  }

   /**
   * 预期设置的rta策略id
   * @return rtaIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getRtaIds() {
    return rtaIds;
  }


  public void setRtaIds(List<Long> rtaIds) {
    this.rtaIds = rtaIds;
  }


  public ToolsRtaStatusUpdateV2Request status(ToolsRtaStatusUpdateV2Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public ToolsRtaStatusUpdateV2Status getStatus() {
    return status;
  }


  public void setStatus(ToolsRtaStatusUpdateV2Status status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRtaStatusUpdateV2Request toolsRtaStatusUpdateV2Request = (ToolsRtaStatusUpdateV2Request) o;
    return Objects.equals(this.accountType, toolsRtaStatusUpdateV2Request.accountType) &&
        Objects.equals(this.advertiserId, toolsRtaStatusUpdateV2Request.advertiserId) &&
        Objects.equals(this.rtaIds, toolsRtaStatusUpdateV2Request.rtaIds) &&
        Objects.equals(this.status, toolsRtaStatusUpdateV2Request.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, advertiserId, rtaIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsRtaStatusUpdateV2Request {\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    rtaIds: ").append(toIndentedString(rtaIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("rta_ids");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("rta_ids");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRtaStatusUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRtaStatusUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRtaStatusUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRtaStatusUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRtaStatusUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsRtaStatusUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRtaStatusUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRtaStatusUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRtaStatusUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsRtaStatusUpdateV2Request
  */
  public static ToolsRtaStatusUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRtaStatusUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsRtaStatusUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

