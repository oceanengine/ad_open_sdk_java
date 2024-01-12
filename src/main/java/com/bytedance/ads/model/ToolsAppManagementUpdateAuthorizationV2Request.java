/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementUpdateAuthorizationV2OperationType;
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
 * ToolsAppManagementUpdateAuthorizationV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class ToolsAppManagementUpdateAuthorizationV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_BASIC_PACKAGE_ID = "basic_package_id";
  @SerializedName(SERIALIZED_NAME_BASIC_PACKAGE_ID)
  private String basicPackageId = null;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private ToolsAppManagementUpdateAuthorizationV2OperationType operationType = null;

  public ToolsAppManagementUpdateAuthorizationV2Request() {
  }

  public ToolsAppManagementUpdateAuthorizationV2Request advertiserId(Long advertiserId) {
    
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


  public ToolsAppManagementUpdateAuthorizationV2Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public ToolsAppManagementUpdateAuthorizationV2Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 共享关系变更的广告主对象id，不允许为空，且数量不允许大于20个。
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public ToolsAppManagementUpdateAuthorizationV2Request basicPackageId(String basicPackageId) {
    
    this.basicPackageId = basicPackageId;
    return this;
  }

   /**
   * 应用资产id
   * @return basicPackageId
  **/
  @javax.annotation.Nullable
  public String getBasicPackageId() {
    return basicPackageId;
  }


  public void setBasicPackageId(String basicPackageId) {
    this.basicPackageId = basicPackageId;
  }


  public ToolsAppManagementUpdateAuthorizationV2Request operationType(ToolsAppManagementUpdateAuthorizationV2OperationType operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementUpdateAuthorizationV2OperationType getOperationType() {
    return operationType;
  }


  public void setOperationType(ToolsAppManagementUpdateAuthorizationV2OperationType operationType) {
    this.operationType = operationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementUpdateAuthorizationV2Request toolsAppManagementUpdateAuthorizationV2Request = (ToolsAppManagementUpdateAuthorizationV2Request) o;
    return Objects.equals(this.advertiserId, toolsAppManagementUpdateAuthorizationV2Request.advertiserId) &&
        Objects.equals(this.advertiserIds, toolsAppManagementUpdateAuthorizationV2Request.advertiserIds) &&
        Objects.equals(this.basicPackageId, toolsAppManagementUpdateAuthorizationV2Request.basicPackageId) &&
        Objects.equals(this.operationType, toolsAppManagementUpdateAuthorizationV2Request.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, advertiserIds, basicPackageId, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementUpdateAuthorizationV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    basicPackageId: ").append(toIndentedString(basicPackageId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("basic_package_id");
    openapiFields.add("operation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("basic_package_id");
    openapiRequiredFields.add("operation_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementUpdateAuthorizationV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementUpdateAuthorizationV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementUpdateAuthorizationV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementUpdateAuthorizationV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementUpdateAuthorizationV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementUpdateAuthorizationV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementUpdateAuthorizationV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementUpdateAuthorizationV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementUpdateAuthorizationV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementUpdateAuthorizationV2Request
  */
  public static ToolsAppManagementUpdateAuthorizationV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementUpdateAuthorizationV2Request.class);
  }

 /**
  * Convert an instance of ToolsAppManagementUpdateAuthorizationV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

