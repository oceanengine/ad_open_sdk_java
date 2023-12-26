/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class ToolsPrivativeWordGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public ToolsPrivativeWordGetV2Filtering() {
  }

  public ToolsPrivativeWordGetV2Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ToolsPrivativeWordGetV2Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public ToolsPrivativeWordGetV2Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ToolsPrivativeWordGetV2Filtering addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordGetV2Filtering toolsPrivativeWordGetV2Filtering = (ToolsPrivativeWordGetV2Filtering) o;
    return Objects.equals(this.adIds, toolsPrivativeWordGetV2Filtering.adIds) &&
        Objects.equals(this.campaignIds, toolsPrivativeWordGetV2Filtering.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordGetV2Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("campaign_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordGetV2Filtering
  */
  public static ToolsPrivativeWordGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordGetV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
