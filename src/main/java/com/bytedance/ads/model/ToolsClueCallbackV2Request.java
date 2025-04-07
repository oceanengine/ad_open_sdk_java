/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueCallbackV2RequestEventData;
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
 * ToolsClueCallbackV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsClueCallbackV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_CLICK_ID = "click_id";
  @SerializedName(SERIALIZED_NAME_CLICK_ID)
  private String clickId = null;

  public static final String SERIALIZED_NAME_CLUE_CONVERT_STATE = "clue_convert_state";
  @SerializedName(SERIALIZED_NAME_CLUE_CONVERT_STATE)
  private Long clueConvertState = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private String clueId = null;

  public static final String SERIALIZED_NAME_EVENT_DATA = "event_data";
  @SerializedName(SERIALIZED_NAME_EVENT_DATA)
  private ToolsClueCallbackV2RequestEventData eventData = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Long source = null;

  public ToolsClueCallbackV2Request() {
  }

  public ToolsClueCallbackV2Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public ToolsClueCallbackV2Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public ToolsClueCallbackV2Request clickId(String clickId) {
    
    this.clickId = clickId;
    return this;
  }

   /**
   * 
   * @return clickId
  **/
  @javax.annotation.Nullable
  public String getClickId() {
    return clickId;
  }


  public void setClickId(String clickId) {
    this.clickId = clickId;
  }


  public ToolsClueCallbackV2Request clueConvertState(Long clueConvertState) {
    
    this.clueConvertState = clueConvertState;
    return this;
  }

   /**
   * 
   * @return clueConvertState
  **/
  @javax.annotation.Nonnull
  public Long getClueConvertState() {
    return clueConvertState;
  }


  public void setClueConvertState(Long clueConvertState) {
    this.clueConvertState = clueConvertState;
  }


  public ToolsClueCallbackV2Request clueId(String clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 
   * @return clueId
  **/
  @javax.annotation.Nullable
  public String getClueId() {
    return clueId;
  }


  public void setClueId(String clueId) {
    this.clueId = clueId;
  }


  public ToolsClueCallbackV2Request eventData(ToolsClueCallbackV2RequestEventData eventData) {
    
    this.eventData = eventData;
    return this;
  }

   /**
   * Get eventData
   * @return eventData
  **/
  @javax.annotation.Nullable
  public ToolsClueCallbackV2RequestEventData getEventData() {
    return eventData;
  }


  public void setEventData(ToolsClueCallbackV2RequestEventData eventData) {
    this.eventData = eventData;
  }


  public ToolsClueCallbackV2Request source(Long source) {
    
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nonnull
  public Long getSource() {
    return source;
  }


  public void setSource(Long source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueCallbackV2Request toolsClueCallbackV2Request = (ToolsClueCallbackV2Request) o;
    return Objects.equals(this.advertiserIds, toolsClueCallbackV2Request.advertiserIds) &&
        Objects.equals(this.clickId, toolsClueCallbackV2Request.clickId) &&
        Objects.equals(this.clueConvertState, toolsClueCallbackV2Request.clueConvertState) &&
        Objects.equals(this.clueId, toolsClueCallbackV2Request.clueId) &&
        Objects.equals(this.eventData, toolsClueCallbackV2Request.eventData) &&
        Objects.equals(this.source, toolsClueCallbackV2Request.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, clickId, clueConvertState, clueId, eventData, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueCallbackV2Request {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    clickId: ").append(toIndentedString(clickId)).append("\n");
    sb.append("    clueConvertState: ").append(toIndentedString(clueConvertState)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("click_id");
    openapiFields.add("clue_convert_state");
    openapiFields.add("clue_id");
    openapiFields.add("event_data");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("clue_convert_state");
    openapiRequiredFields.add("source");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueCallbackV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueCallbackV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueCallbackV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueCallbackV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueCallbackV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueCallbackV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueCallbackV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueCallbackV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueCallbackV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueCallbackV2Request
  */
  public static ToolsClueCallbackV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueCallbackV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueCallbackV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

