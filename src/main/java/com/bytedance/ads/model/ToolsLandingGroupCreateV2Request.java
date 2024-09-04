/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsLandingGroupCreateV2ExperimentSiteType;
import com.bytedance.ads.model.ToolsLandingGroupCreateV2GroupFlowType;
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
 * ToolsLandingGroupCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsLandingGroupCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_EXPERIMENT_SITE_TYPE = "experiment_site_type";
  @SerializedName(SERIALIZED_NAME_EXPERIMENT_SITE_TYPE)
  private ToolsLandingGroupCreateV2ExperimentSiteType experimentSiteType = null;

  public static final String SERIALIZED_NAME_GROUP_FLOW_TYPE = "group_flow_type";
  @SerializedName(SERIALIZED_NAME_GROUP_FLOW_TYPE)
  private ToolsLandingGroupCreateV2GroupFlowType groupFlowType = null;

  public static final String SERIALIZED_NAME_GROUP_TITLE = "group_title";
  @SerializedName(SERIALIZED_NAME_GROUP_TITLE)
  private String groupTitle = null;

  public static final String SERIALIZED_NAME_SITE_IDS = "site_ids";
  @SerializedName(SERIALIZED_NAME_SITE_IDS)
  private List<String> siteIds = null;

  public ToolsLandingGroupCreateV2Request() {
  }

  public ToolsLandingGroupCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id，范围：1 &lt;&#x3D; advertiser_id &lt;&#x3D; MAX_INT64
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsLandingGroupCreateV2Request experimentSiteType(ToolsLandingGroupCreateV2ExperimentSiteType experimentSiteType) {
    
    this.experimentSiteType = experimentSiteType;
    return this;
  }

   /**
   * Get experimentSiteType
   * @return experimentSiteType
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupCreateV2ExperimentSiteType getExperimentSiteType() {
    return experimentSiteType;
  }


  public void setExperimentSiteType(ToolsLandingGroupCreateV2ExperimentSiteType experimentSiteType) {
    this.experimentSiteType = experimentSiteType;
  }


  public ToolsLandingGroupCreateV2Request groupFlowType(ToolsLandingGroupCreateV2GroupFlowType groupFlowType) {
    
    this.groupFlowType = groupFlowType;
    return this;
  }

   /**
   * Get groupFlowType
   * @return groupFlowType
  **/
  @javax.annotation.Nonnull
  public ToolsLandingGroupCreateV2GroupFlowType getGroupFlowType() {
    return groupFlowType;
  }


  public void setGroupFlowType(ToolsLandingGroupCreateV2GroupFlowType groupFlowType) {
    this.groupFlowType = groupFlowType;
  }


  public ToolsLandingGroupCreateV2Request groupTitle(String groupTitle) {
    
    this.groupTitle = groupTitle;
    return this;
  }

   /**
   * 落地页组名称，范围：1 &lt;&#x3D; 长度 &lt;&#x3D; 20
   * @return groupTitle
  **/
  @javax.annotation.Nonnull
  public String getGroupTitle() {
    return groupTitle;
  }


  public void setGroupTitle(String groupTitle) {
    this.groupTitle = groupTitle;
  }


  public ToolsLandingGroupCreateV2Request siteIds(List<String> siteIds) {
    
    this.siteIds = siteIds;
    return this;
  }

  public ToolsLandingGroupCreateV2Request addSiteIdsItem(String siteIdsItem) {
    if (this.siteIds == null) {
      this.siteIds = new ArrayList<>();
    }
    this.siteIds.add(siteIdsItem);
    return this;
  }

   /**
   * 橙子建站站点id列表 ：2 &lt;&#x3D; 长度 &lt;&#x3D; 10 可通过【获取橙子建站站点列表】获取应答字段list
   * @return siteIds
  **/
  @javax.annotation.Nullable
  public List<String> getSiteIds() {
    return siteIds;
  }


  public void setSiteIds(List<String> siteIds) {
    this.siteIds = siteIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLandingGroupCreateV2Request toolsLandingGroupCreateV2Request = (ToolsLandingGroupCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsLandingGroupCreateV2Request.advertiserId) &&
        Objects.equals(this.experimentSiteType, toolsLandingGroupCreateV2Request.experimentSiteType) &&
        Objects.equals(this.groupFlowType, toolsLandingGroupCreateV2Request.groupFlowType) &&
        Objects.equals(this.groupTitle, toolsLandingGroupCreateV2Request.groupTitle) &&
        Objects.equals(this.siteIds, toolsLandingGroupCreateV2Request.siteIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, experimentSiteType, groupFlowType, groupTitle, siteIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLandingGroupCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    experimentSiteType: ").append(toIndentedString(experimentSiteType)).append("\n");
    sb.append("    groupFlowType: ").append(toIndentedString(groupFlowType)).append("\n");
    sb.append("    groupTitle: ").append(toIndentedString(groupTitle)).append("\n");
    sb.append("    siteIds: ").append(toIndentedString(siteIds)).append("\n");
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
    openapiFields.add("experiment_site_type");
    openapiFields.add("group_flow_type");
    openapiFields.add("group_title");
    openapiFields.add("site_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("group_flow_type");
    openapiRequiredFields.add("group_title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLandingGroupCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupCreateV2Request
  */
  public static ToolsLandingGroupCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

