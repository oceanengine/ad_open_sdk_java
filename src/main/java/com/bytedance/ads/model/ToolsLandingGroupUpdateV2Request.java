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
 * ToolsLandingGroupUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsLandingGroupUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APPEND_SITES = "append_sites";
  @SerializedName(SERIALIZED_NAME_APPEND_SITES)
  private List<String> appendSites = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId = null;

  public static final String SERIALIZED_NAME_GROUP_TITLE = "group_title";
  @SerializedName(SERIALIZED_NAME_GROUP_TITLE)
  private String groupTitle = null;

  public ToolsLandingGroupUpdateV2Request() {
  }

  public ToolsLandingGroupUpdateV2Request advertiserId(Long advertiserId) {
    
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


  public ToolsLandingGroupUpdateV2Request appendSites(List<String> appendSites) {
    
    this.appendSites = appendSites;
    return this;
  }

  public ToolsLandingGroupUpdateV2Request addAppendSitesItem(String appendSitesItem) {
    if (this.appendSites == null) {
      this.appendSites = new ArrayList<>();
    }
    this.appendSites.add(appendSitesItem);
    return this;
  }

   /**
   * 新加站点列表
   * @return appendSites
  **/
  @javax.annotation.Nonnull
  public List<String> getAppendSites() {
    return appendSites;
  }


  public void setAppendSites(List<String> appendSites) {
    this.appendSites = appendSites;
  }


  public ToolsLandingGroupUpdateV2Request groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 落地页组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ToolsLandingGroupUpdateV2Request groupTitle(String groupTitle) {
    
    this.groupTitle = groupTitle;
    return this;
  }

   /**
   * 落地页组名称
   * @return groupTitle
  **/
  @javax.annotation.Nonnull
  public String getGroupTitle() {
    return groupTitle;
  }


  public void setGroupTitle(String groupTitle) {
    this.groupTitle = groupTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLandingGroupUpdateV2Request toolsLandingGroupUpdateV2Request = (ToolsLandingGroupUpdateV2Request) o;
    return Objects.equals(this.advertiserId, toolsLandingGroupUpdateV2Request.advertiserId) &&
        Objects.equals(this.appendSites, toolsLandingGroupUpdateV2Request.appendSites) &&
        Objects.equals(this.groupId, toolsLandingGroupUpdateV2Request.groupId) &&
        Objects.equals(this.groupTitle, toolsLandingGroupUpdateV2Request.groupTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appendSites, groupId, groupTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLandingGroupUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appendSites: ").append(toIndentedString(appendSites)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupTitle: ").append(toIndentedString(groupTitle)).append("\n");
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
    openapiFields.add("append_sites");
    openapiFields.add("group_id");
    openapiFields.add("group_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("append_sites");
    openapiRequiredFields.add("group_id");
    openapiRequiredFields.add("group_title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLandingGroupUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupUpdateV2Request
  */
  public static ToolsLandingGroupUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

