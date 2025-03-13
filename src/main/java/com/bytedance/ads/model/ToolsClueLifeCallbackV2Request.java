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
import com.bytedance.ads.model.ToolsClueLifeCallbackV2ClueConvertState;
import com.bytedance.ads.model.ToolsClueLifeCallbackV2RequestEventData;
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
 * ToolsClueLifeCallbackV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsClueLifeCallbackV2Request {
  public static final String SERIALIZED_NAME_CLUE_CONVERT_STATE = "clue_convert_state";
  @SerializedName(SERIALIZED_NAME_CLUE_CONVERT_STATE)
  private ToolsClueLifeCallbackV2ClueConvertState clueConvertState = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private String clueId = null;

  public static final String SERIALIZED_NAME_EVENT_DATA = "event_data";
  @SerializedName(SERIALIZED_NAME_EVENT_DATA)
  private ToolsClueLifeCallbackV2RequestEventData eventData = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_IDS = "local_account_ids";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_IDS)
  private List<String> localAccountIds = null;

  public ToolsClueLifeCallbackV2Request() {
  }

  public ToolsClueLifeCallbackV2Request clueConvertState(ToolsClueLifeCallbackV2ClueConvertState clueConvertState) {
    
    this.clueConvertState = clueConvertState;
    return this;
  }

   /**
   * Get clueConvertState
   * @return clueConvertState
  **/
  @javax.annotation.Nonnull
  public ToolsClueLifeCallbackV2ClueConvertState getClueConvertState() {
    return clueConvertState;
  }


  public void setClueConvertState(ToolsClueLifeCallbackV2ClueConvertState clueConvertState) {
    this.clueConvertState = clueConvertState;
  }


  public ToolsClueLifeCallbackV2Request clueId(String clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 
   * @return clueId
  **/
  @javax.annotation.Nonnull
  public String getClueId() {
    return clueId;
  }


  public void setClueId(String clueId) {
    this.clueId = clueId;
  }


  public ToolsClueLifeCallbackV2Request eventData(ToolsClueLifeCallbackV2RequestEventData eventData) {
    
    this.eventData = eventData;
    return this;
  }

   /**
   * Get eventData
   * @return eventData
  **/
  @javax.annotation.Nullable
  public ToolsClueLifeCallbackV2RequestEventData getEventData() {
    return eventData;
  }


  public void setEventData(ToolsClueLifeCallbackV2RequestEventData eventData) {
    this.eventData = eventData;
  }


  public ToolsClueLifeCallbackV2Request localAccountIds(List<String> localAccountIds) {
    
    this.localAccountIds = localAccountIds;
    return this;
  }

  public ToolsClueLifeCallbackV2Request addLocalAccountIdsItem(String localAccountIdsItem) {
    if (this.localAccountIds == null) {
      this.localAccountIds = new ArrayList<>();
    }
    this.localAccountIds.add(localAccountIdsItem);
    return this;
  }

   /**
   * 
   * @return localAccountIds
  **/
  @javax.annotation.Nonnull
  public List<String> getLocalAccountIds() {
    return localAccountIds;
  }


  public void setLocalAccountIds(List<String> localAccountIds) {
    this.localAccountIds = localAccountIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueLifeCallbackV2Request toolsClueLifeCallbackV2Request = (ToolsClueLifeCallbackV2Request) o;
    return Objects.equals(this.clueConvertState, toolsClueLifeCallbackV2Request.clueConvertState) &&
        Objects.equals(this.clueId, toolsClueLifeCallbackV2Request.clueId) &&
        Objects.equals(this.eventData, toolsClueLifeCallbackV2Request.eventData) &&
        Objects.equals(this.localAccountIds, toolsClueLifeCallbackV2Request.localAccountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clueConvertState, clueId, eventData, localAccountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueLifeCallbackV2Request {\n");
    sb.append("    clueConvertState: ").append(toIndentedString(clueConvertState)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    localAccountIds: ").append(toIndentedString(localAccountIds)).append("\n");
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
    openapiFields.add("clue_convert_state");
    openapiFields.add("clue_id");
    openapiFields.add("event_data");
    openapiFields.add("local_account_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clue_convert_state");
    openapiRequiredFields.add("clue_id");
    openapiRequiredFields.add("local_account_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueLifeCallbackV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueLifeCallbackV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueLifeCallbackV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueLifeCallbackV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueLifeCallbackV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueLifeCallbackV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueLifeCallbackV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueLifeCallbackV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueLifeCallbackV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueLifeCallbackV2Request
  */
  public static ToolsClueLifeCallbackV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueLifeCallbackV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueLifeCallbackV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

