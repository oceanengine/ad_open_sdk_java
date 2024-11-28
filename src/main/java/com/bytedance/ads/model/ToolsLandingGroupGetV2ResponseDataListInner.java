/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsLandingGroupGetV2DataListGroupFlowType;
import com.bytedance.ads.model.ToolsLandingGroupGetV2DataListGroupStatus;
import com.bytedance.ads.model.ToolsLandingGroupGetV2ResponseDataListInnerSitesInner;
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
 * ToolsLandingGroupGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ToolsLandingGroupGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_GROUP_FLOW_TYPE = "group_flow_type";
  @SerializedName(SERIALIZED_NAME_GROUP_FLOW_TYPE)
  private ToolsLandingGroupGetV2DataListGroupFlowType groupFlowType = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId = null;

  public static final String SERIALIZED_NAME_GROUP_STATUS = "group_status";
  @SerializedName(SERIALIZED_NAME_GROUP_STATUS)
  private ToolsLandingGroupGetV2DataListGroupStatus groupStatus = null;

  public static final String SERIALIZED_NAME_GROUP_TITLE = "group_title";
  @SerializedName(SERIALIZED_NAME_GROUP_TITLE)
  private String groupTitle = null;

  public static final String SERIALIZED_NAME_GROUP_URL = "group_url";
  @SerializedName(SERIALIZED_NAME_GROUP_URL)
  private String groupUrl = null;

  public static final String SERIALIZED_NAME_SITES = "sites";
  @SerializedName(SERIALIZED_NAME_SITES)
  private List<ToolsLandingGroupGetV2ResponseDataListInnerSitesInner> sites = null;

  public ToolsLandingGroupGetV2ResponseDataListInner() {
  }

  public ToolsLandingGroupGetV2ResponseDataListInner groupFlowType(ToolsLandingGroupGetV2DataListGroupFlowType groupFlowType) {
    
    this.groupFlowType = groupFlowType;
    return this;
  }

   /**
   * Get groupFlowType
   * @return groupFlowType
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupGetV2DataListGroupFlowType getGroupFlowType() {
    return groupFlowType;
  }


  public void setGroupFlowType(ToolsLandingGroupGetV2DataListGroupFlowType groupFlowType) {
    this.groupFlowType = groupFlowType;
  }


  public ToolsLandingGroupGetV2ResponseDataListInner groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 
   * @return groupId
  **/
  @javax.annotation.Nullable
  public Long getGroupId() {
    return groupId;
  }


  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public ToolsLandingGroupGetV2ResponseDataListInner groupStatus(ToolsLandingGroupGetV2DataListGroupStatus groupStatus) {
    
    this.groupStatus = groupStatus;
    return this;
  }

   /**
   * Get groupStatus
   * @return groupStatus
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupGetV2DataListGroupStatus getGroupStatus() {
    return groupStatus;
  }


  public void setGroupStatus(ToolsLandingGroupGetV2DataListGroupStatus groupStatus) {
    this.groupStatus = groupStatus;
  }


  public ToolsLandingGroupGetV2ResponseDataListInner groupTitle(String groupTitle) {
    
    this.groupTitle = groupTitle;
    return this;
  }

   /**
   * 
   * @return groupTitle
  **/
  @javax.annotation.Nullable
  public String getGroupTitle() {
    return groupTitle;
  }


  public void setGroupTitle(String groupTitle) {
    this.groupTitle = groupTitle;
  }


  public ToolsLandingGroupGetV2ResponseDataListInner groupUrl(String groupUrl) {
    
    this.groupUrl = groupUrl;
    return this;
  }

   /**
   * 
   * @return groupUrl
  **/
  @javax.annotation.Nullable
  public String getGroupUrl() {
    return groupUrl;
  }


  public void setGroupUrl(String groupUrl) {
    this.groupUrl = groupUrl;
  }


  public ToolsLandingGroupGetV2ResponseDataListInner sites(List<ToolsLandingGroupGetV2ResponseDataListInnerSitesInner> sites) {
    
    this.sites = sites;
    return this;
  }

  public ToolsLandingGroupGetV2ResponseDataListInner addSitesItem(ToolsLandingGroupGetV2ResponseDataListInnerSitesInner sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<>();
    }
    this.sites.add(sitesItem);
    return this;
  }

   /**
   * 
   * @return sites
  **/
  @javax.annotation.Nullable
  public List<ToolsLandingGroupGetV2ResponseDataListInnerSitesInner> getSites() {
    return sites;
  }


  public void setSites(List<ToolsLandingGroupGetV2ResponseDataListInnerSitesInner> sites) {
    this.sites = sites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLandingGroupGetV2ResponseDataListInner toolsLandingGroupGetV2ResponseDataListInner = (ToolsLandingGroupGetV2ResponseDataListInner) o;
    return Objects.equals(this.groupFlowType, toolsLandingGroupGetV2ResponseDataListInner.groupFlowType) &&
        Objects.equals(this.groupId, toolsLandingGroupGetV2ResponseDataListInner.groupId) &&
        Objects.equals(this.groupStatus, toolsLandingGroupGetV2ResponseDataListInner.groupStatus) &&
        Objects.equals(this.groupTitle, toolsLandingGroupGetV2ResponseDataListInner.groupTitle) &&
        Objects.equals(this.groupUrl, toolsLandingGroupGetV2ResponseDataListInner.groupUrl) &&
        Objects.equals(this.sites, toolsLandingGroupGetV2ResponseDataListInner.sites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupFlowType, groupId, groupStatus, groupTitle, groupUrl, sites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLandingGroupGetV2ResponseDataListInner {\n");
    sb.append("    groupFlowType: ").append(toIndentedString(groupFlowType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupStatus: ").append(toIndentedString(groupStatus)).append("\n");
    sb.append("    groupTitle: ").append(toIndentedString(groupTitle)).append("\n");
    sb.append("    groupUrl: ").append(toIndentedString(groupUrl)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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
    openapiFields.add("group_flow_type");
    openapiFields.add("group_id");
    openapiFields.add("group_status");
    openapiFields.add("group_title");
    openapiFields.add("group_url");
    openapiFields.add("sites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLandingGroupGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupGetV2ResponseDataListInner
  */
  public static ToolsLandingGroupGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

