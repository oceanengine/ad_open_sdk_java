/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * 线索关联的私信信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class ToolsCluePrivateMessageCallbackV2RequestMsgInfo {
  public static final String SERIALIZED_NAME_CONVERSATION_SHORT_ID = "conversation_short_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_SHORT_ID)
  private String conversationShortId = null;

  public static final String SERIALIZED_NAME_SERVER_MESSAGE_ID = "server_message_id";
  @SerializedName(SERIALIZED_NAME_SERVER_MESSAGE_ID)
  private String serverMessageId = null;

  public ToolsCluePrivateMessageCallbackV2RequestMsgInfo() {
  }

  public ToolsCluePrivateMessageCallbackV2RequestMsgInfo conversationShortId(String conversationShortId) {
    
    this.conversationShortId = conversationShortId;
    return this;
  }

   /**
   * 产生线索的会话 ID
   * @return conversationShortId
  **/
  @javax.annotation.Nullable
  public String getConversationShortId() {
    return conversationShortId;
  }


  public void setConversationShortId(String conversationShortId) {
    this.conversationShortId = conversationShortId;
  }


  public ToolsCluePrivateMessageCallbackV2RequestMsgInfo serverMessageId(String serverMessageId) {
    
    this.serverMessageId = serverMessageId;
    return this;
  }

   /**
   * 产生线索的消息 ID
   * @return serverMessageId
  **/
  @javax.annotation.Nullable
  public String getServerMessageId() {
    return serverMessageId;
  }


  public void setServerMessageId(String serverMessageId) {
    this.serverMessageId = serverMessageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCluePrivateMessageCallbackV2RequestMsgInfo toolsCluePrivateMessageCallbackV2RequestMsgInfo = (ToolsCluePrivateMessageCallbackV2RequestMsgInfo) o;
    return Objects.equals(this.conversationShortId, toolsCluePrivateMessageCallbackV2RequestMsgInfo.conversationShortId) &&
        Objects.equals(this.serverMessageId, toolsCluePrivateMessageCallbackV2RequestMsgInfo.serverMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationShortId, serverMessageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCluePrivateMessageCallbackV2RequestMsgInfo {\n");
    sb.append("    conversationShortId: ").append(toIndentedString(conversationShortId)).append("\n");
    sb.append("    serverMessageId: ").append(toIndentedString(serverMessageId)).append("\n");
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
    openapiFields.add("conversation_short_id");
    openapiFields.add("server_message_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCluePrivateMessageCallbackV2RequestMsgInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCluePrivateMessageCallbackV2RequestMsgInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCluePrivateMessageCallbackV2RequestMsgInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCluePrivateMessageCallbackV2RequestMsgInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCluePrivateMessageCallbackV2RequestMsgInfo>() {
           @Override
           public void write(JsonWriter out, ToolsCluePrivateMessageCallbackV2RequestMsgInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCluePrivateMessageCallbackV2RequestMsgInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCluePrivateMessageCallbackV2RequestMsgInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCluePrivateMessageCallbackV2RequestMsgInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsCluePrivateMessageCallbackV2RequestMsgInfo
  */
  public static ToolsCluePrivateMessageCallbackV2RequestMsgInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCluePrivateMessageCallbackV2RequestMsgInfo.class);
  }

 /**
  * Convert an instance of ToolsCluePrivateMessageCallbackV2RequestMsgInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

