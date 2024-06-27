/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BusinessPlatformPartnerOrganizationListV2FilteringStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class BusinessPlatformPartnerOrganizationListV2Filtering {
  public static final String SERIALIZED_NAME_PARTNER_ORGANIZATION_IDS = "partner_organization_ids";
  @SerializedName(SERIALIZED_NAME_PARTNER_ORGANIZATION_IDS)
  private List<Long> partnerOrganizationIds = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<BusinessPlatformPartnerOrganizationListV2FilteringStatus> status = null;

  public BusinessPlatformPartnerOrganizationListV2Filtering() {
  }

  public BusinessPlatformPartnerOrganizationListV2Filtering partnerOrganizationIds(List<Long> partnerOrganizationIds) {
    
    this.partnerOrganizationIds = partnerOrganizationIds;
    return this;
  }

  public BusinessPlatformPartnerOrganizationListV2Filtering addPartnerOrganizationIdsItem(Long partnerOrganizationIdsItem) {
    if (this.partnerOrganizationIds == null) {
      this.partnerOrganizationIds = new ArrayList<>();
    }
    this.partnerOrganizationIds.add(partnerOrganizationIdsItem);
    return this;
  }

   /**
   * 合作的巨量纵横组织id，最大不超过200
   * @return partnerOrganizationIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPartnerOrganizationIds() {
    return partnerOrganizationIds;
  }


  public void setPartnerOrganizationIds(List<Long> partnerOrganizationIds) {
    this.partnerOrganizationIds = partnerOrganizationIds;
  }


  public BusinessPlatformPartnerOrganizationListV2Filtering status(List<BusinessPlatformPartnerOrganizationListV2FilteringStatus> status) {
    
    this.status = status;
    return this;
  }

  public BusinessPlatformPartnerOrganizationListV2Filtering addStatusItem(BusinessPlatformPartnerOrganizationListV2FilteringStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 合作状态，默认查询绑定成功的状态&lt;br&gt;枚举值：&#x60;BOUND&#x60;（已绑定）、&#x60;BINDING&#x60;（绑定中）、&#x60;INVALID&#x60;（失效）、&#x60;DELETED&#x60;（删除）
   * @return status
  **/
  @javax.annotation.Nullable
  public List<BusinessPlatformPartnerOrganizationListV2FilteringStatus> getStatus() {
    return status;
  }


  public void setStatus(List<BusinessPlatformPartnerOrganizationListV2FilteringStatus> status) {
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
    BusinessPlatformPartnerOrganizationListV2Filtering businessPlatformPartnerOrganizationListV2Filtering = (BusinessPlatformPartnerOrganizationListV2Filtering) o;
    return Objects.equals(this.partnerOrganizationIds, businessPlatformPartnerOrganizationListV2Filtering.partnerOrganizationIds) &&
        Objects.equals(this.status, businessPlatformPartnerOrganizationListV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerOrganizationIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPlatformPartnerOrganizationListV2Filtering {\n");
    sb.append("    partnerOrganizationIds: ").append(toIndentedString(partnerOrganizationIds)).append("\n");
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
    openapiFields.add("partner_organization_ids");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessPlatformPartnerOrganizationListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessPlatformPartnerOrganizationListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessPlatformPartnerOrganizationListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessPlatformPartnerOrganizationListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessPlatformPartnerOrganizationListV2Filtering>() {
           @Override
           public void write(JsonWriter out, BusinessPlatformPartnerOrganizationListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessPlatformPartnerOrganizationListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessPlatformPartnerOrganizationListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessPlatformPartnerOrganizationListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to BusinessPlatformPartnerOrganizationListV2Filtering
  */
  public static BusinessPlatformPartnerOrganizationListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessPlatformPartnerOrganizationListV2Filtering.class);
  }

 /**
  * Convert an instance of BusinessPlatformPartnerOrganizationListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

