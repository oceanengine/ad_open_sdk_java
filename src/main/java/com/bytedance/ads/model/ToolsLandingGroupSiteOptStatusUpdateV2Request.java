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
import com.bytedance.ads.model.ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner;
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
 * ToolsLandingGroupSiteOptStatusUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsLandingGroupSiteOptStatusUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner> data = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId = null;

  public ToolsLandingGroupSiteOptStatusUpdateV2Request() {
  }

  public ToolsLandingGroupSiteOptStatusUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsLandingGroupSiteOptStatusUpdateV2Request data(List<ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner> data) {
    
    this.data = data;
    return this;
  }

  public ToolsLandingGroupSiteOptStatusUpdateV2Request addDataItem(ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner> getData() {
    return data;
  }


  public void setData(List<ToolsLandingGroupSiteOptStatusUpdateV2RequestDataInner> data) {
    this.data = data;
  }


  public ToolsLandingGroupSiteOptStatusUpdateV2Request groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 落地页组 ID
   * @return groupId
  **/
  @javax.annotation.Nonnull
  public Long getGroupId() {
    return groupId;
  }


  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLandingGroupSiteOptStatusUpdateV2Request toolsLandingGroupSiteOptStatusUpdateV2Request = (ToolsLandingGroupSiteOptStatusUpdateV2Request) o;
    return Objects.equals(this.advertiserId, toolsLandingGroupSiteOptStatusUpdateV2Request.advertiserId) &&
        Objects.equals(this.data, toolsLandingGroupSiteOptStatusUpdateV2Request.data) &&
        Objects.equals(this.groupId, toolsLandingGroupSiteOptStatusUpdateV2Request.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, data, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLandingGroupSiteOptStatusUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("group_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("group_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLandingGroupSiteOptStatusUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupSiteOptStatusUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupSiteOptStatusUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupSiteOptStatusUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupSiteOptStatusUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupSiteOptStatusUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupSiteOptStatusUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupSiteOptStatusUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupSiteOptStatusUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupSiteOptStatusUpdateV2Request
  */
  public static ToolsLandingGroupSiteOptStatusUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupSiteOptStatusUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupSiteOptStatusUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

