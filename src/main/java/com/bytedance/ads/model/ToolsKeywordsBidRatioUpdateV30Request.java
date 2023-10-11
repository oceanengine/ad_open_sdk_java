/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
 * ToolsKeywordsBidRatioUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class ToolsKeywordsBidRatioUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BID_RATIO = "bid_ratio";
  @SerializedName(SERIALIZED_NAME_BID_RATIO)
  private Double bidRatio = null;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "project_ids";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = null;

  public static final String SERIALIZED_NAME_PROMOTION_WORD_ID = "promotion_word_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_WORD_ID)
  private String promotionWordId = null;

  public ToolsKeywordsBidRatioUpdateV30Request() {
  }

  public ToolsKeywordsBidRatioUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsKeywordsBidRatioUpdateV30Request bidRatio(Double bidRatio) {
    
    this.bidRatio = bidRatio;
    return this;
  }

   /**
   * 
   * @return bidRatio
  **/
  @javax.annotation.Nullable
  public Double getBidRatio() {
    return bidRatio;
  }


  public void setBidRatio(Double bidRatio) {
    this.bidRatio = bidRatio;
  }


  public ToolsKeywordsBidRatioUpdateV30Request projectIds(List<Long> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public ToolsKeywordsBidRatioUpdateV30Request addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * 
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }


  public ToolsKeywordsBidRatioUpdateV30Request promotionWordId(String promotionWordId) {
    
    this.promotionWordId = promotionWordId;
    return this;
  }

   /**
   * 
   * @return promotionWordId
  **/
  @javax.annotation.Nonnull
  public String getPromotionWordId() {
    return promotionWordId;
  }


  public void setPromotionWordId(String promotionWordId) {
    this.promotionWordId = promotionWordId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsKeywordsBidRatioUpdateV30Request toolsKeywordsBidRatioUpdateV30Request = (ToolsKeywordsBidRatioUpdateV30Request) o;
    return Objects.equals(this.advertiserId, toolsKeywordsBidRatioUpdateV30Request.advertiserId) &&
        Objects.equals(this.bidRatio, toolsKeywordsBidRatioUpdateV30Request.bidRatio) &&
        Objects.equals(this.projectIds, toolsKeywordsBidRatioUpdateV30Request.projectIds) &&
        Objects.equals(this.promotionWordId, toolsKeywordsBidRatioUpdateV30Request.promotionWordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, bidRatio, projectIds, promotionWordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsKeywordsBidRatioUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bidRatio: ").append(toIndentedString(bidRatio)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    promotionWordId: ").append(toIndentedString(promotionWordId)).append("\n");
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
    openapiFields.add("bid_ratio");
    openapiFields.add("project_ids");
    openapiFields.add("promotion_word_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("promotion_word_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsKeywordsBidRatioUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsKeywordsBidRatioUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsKeywordsBidRatioUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsKeywordsBidRatioUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsKeywordsBidRatioUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsKeywordsBidRatioUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsKeywordsBidRatioUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsKeywordsBidRatioUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsKeywordsBidRatioUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsKeywordsBidRatioUpdateV30Request
  */
  public static ToolsKeywordsBidRatioUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsKeywordsBidRatioUpdateV30Request.class);
  }

 /**
  * Convert an instance of ToolsKeywordsBidRatioUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

