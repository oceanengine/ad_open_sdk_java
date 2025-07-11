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
 * ToolsClueRefundInfoQueryV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsClueRefundInfoQueryV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CLUE_IDS = "clue_ids";
  @SerializedName(SERIALIZED_NAME_CLUE_IDS)
  private List<Long> clueIds = null;

  public ToolsClueRefundInfoQueryV2Request() {
  }

  public ToolsClueRefundInfoQueryV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueRefundInfoQueryV2Request clueIds(List<Long> clueIds) {
    
    this.clueIds = clueIds;
    return this;
  }

  public ToolsClueRefundInfoQueryV2Request addClueIdsItem(Long clueIdsItem) {
    if (this.clueIds == null) {
      this.clueIds = new ArrayList<>();
    }
    this.clueIds.add(clueIdsItem);
    return this;
  }

   /**
   * 线索ID
   * @return clueIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getClueIds() {
    return clueIds;
  }


  public void setClueIds(List<Long> clueIds) {
    this.clueIds = clueIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundInfoQueryV2Request toolsClueRefundInfoQueryV2Request = (ToolsClueRefundInfoQueryV2Request) o;
    return Objects.equals(this.advertiserId, toolsClueRefundInfoQueryV2Request.advertiserId) &&
        Objects.equals(this.clueIds, toolsClueRefundInfoQueryV2Request.clueIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, clueIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueRefundInfoQueryV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    clueIds: ").append(toIndentedString(clueIds)).append("\n");
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
    openapiFields.add("clue_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clue_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundInfoQueryV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundInfoQueryV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundInfoQueryV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundInfoQueryV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundInfoQueryV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundInfoQueryV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundInfoQueryV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundInfoQueryV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundInfoQueryV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundInfoQueryV2Request
  */
  public static ToolsClueRefundInfoQueryV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundInfoQueryV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueRefundInfoQueryV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

