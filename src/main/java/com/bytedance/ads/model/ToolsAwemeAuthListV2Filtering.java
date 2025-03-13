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
import com.bytedance.ads.model.ToolsAwemeAuthListV2FilteringAuthStatus;
import com.bytedance.ads.model.ToolsAwemeAuthListV2FilteringAuthType;
import com.bytedance.ads.model.ToolsAwemeAuthListV2FilteringWarningTypes;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsAwemeAuthListV2Filtering {
  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private List<ToolsAwemeAuthListV2FilteringAuthStatus> authStatus = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private List<ToolsAwemeAuthListV2FilteringAuthType> authType = null;

  public static final String SERIALIZED_NAME_AWEME_IDS = "aweme_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_IDS)
  private List<String> awemeIds = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Long> itemIds = null;

  public static final String SERIALIZED_NAME_WARNING_TYPES = "warning_types";
  @SerializedName(SERIALIZED_NAME_WARNING_TYPES)
  private List<ToolsAwemeAuthListV2FilteringWarningTypes> warningTypes = null;

  public ToolsAwemeAuthListV2Filtering() {
  }

  public ToolsAwemeAuthListV2Filtering authStatus(List<ToolsAwemeAuthListV2FilteringAuthStatus> authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

  public ToolsAwemeAuthListV2Filtering addAuthStatusItem(ToolsAwemeAuthListV2FilteringAuthStatus authStatusItem) {
    if (this.authStatus == null) {
      this.authStatus = new ArrayList<>();
    }
    this.authStatus.add(authStatusItem);
    return this;
  }

   /**
   * 授权状态
   * @return authStatus
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeAuthListV2FilteringAuthStatus> getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(List<ToolsAwemeAuthListV2FilteringAuthStatus> authStatus) {
    this.authStatus = authStatus;
  }


  public ToolsAwemeAuthListV2Filtering authType(List<ToolsAwemeAuthListV2FilteringAuthType> authType) {
    
    this.authType = authType;
    return this;
  }

  public ToolsAwemeAuthListV2Filtering addAuthTypeItem(ToolsAwemeAuthListV2FilteringAuthType authTypeItem) {
    if (this.authType == null) {
      this.authType = new ArrayList<>();
    }
    this.authType.add(authTypeItem);
    return this;
  }

   /**
   * 授权类型
   * @return authType
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeAuthListV2FilteringAuthType> getAuthType() {
    return authType;
  }


  public void setAuthType(List<ToolsAwemeAuthListV2FilteringAuthType> authType) {
    this.authType = authType;
  }


  public ToolsAwemeAuthListV2Filtering awemeIds(List<String> awemeIds) {
    
    this.awemeIds = awemeIds;
    return this;
  }

  public ToolsAwemeAuthListV2Filtering addAwemeIdsItem(String awemeIdsItem) {
    if (this.awemeIds == null) {
      this.awemeIds = new ArrayList<>();
    }
    this.awemeIds.add(awemeIdsItem);
    return this;
  }

   /**
   * 抖音号
   * @return awemeIds
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeIds() {
    return awemeIds;
  }


  public void setAwemeIds(List<String> awemeIds) {
    this.awemeIds = awemeIds;
  }


  public ToolsAwemeAuthListV2Filtering itemIds(List<Long> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public ToolsAwemeAuthListV2Filtering addItemIdsItem(Long itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 抖音短视频ID
   * @return itemIds
  **/
  @javax.annotation.Nullable
  public List<Long> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
  }


  public ToolsAwemeAuthListV2Filtering warningTypes(List<ToolsAwemeAuthListV2FilteringWarningTypes> warningTypes) {
    
    this.warningTypes = warningTypes;
    return this;
  }

  public ToolsAwemeAuthListV2Filtering addWarningTypesItem(ToolsAwemeAuthListV2FilteringWarningTypes warningTypesItem) {
    if (this.warningTypes == null) {
      this.warningTypes = new ArrayList<>();
    }
    this.warningTypes.add(warningTypesItem);
    return this;
  }

   /**
   * 筛选警告类型
   * @return warningTypes
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeAuthListV2FilteringWarningTypes> getWarningTypes() {
    return warningTypes;
  }


  public void setWarningTypes(List<ToolsAwemeAuthListV2FilteringWarningTypes> warningTypes) {
    this.warningTypes = warningTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeAuthListV2Filtering toolsAwemeAuthListV2Filtering = (ToolsAwemeAuthListV2Filtering) o;
    return Objects.equals(this.authStatus, toolsAwemeAuthListV2Filtering.authStatus) &&
        Objects.equals(this.authType, toolsAwemeAuthListV2Filtering.authType) &&
        Objects.equals(this.awemeIds, toolsAwemeAuthListV2Filtering.awemeIds) &&
        Objects.equals(this.itemIds, toolsAwemeAuthListV2Filtering.itemIds) &&
        Objects.equals(this.warningTypes, toolsAwemeAuthListV2Filtering.warningTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authStatus, authType, awemeIds, itemIds, warningTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeAuthListV2Filtering {\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    awemeIds: ").append(toIndentedString(awemeIds)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    warningTypes: ").append(toIndentedString(warningTypes)).append("\n");
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
    openapiFields.add("auth_status");
    openapiFields.add("auth_type");
    openapiFields.add("aweme_ids");
    openapiFields.add("item_ids");
    openapiFields.add("warning_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeAuthListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeAuthListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeAuthListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeAuthListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeAuthListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeAuthListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeAuthListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeAuthListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeAuthListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeAuthListV2Filtering
  */
  public static ToolsAwemeAuthListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeAuthListV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsAwemeAuthListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

