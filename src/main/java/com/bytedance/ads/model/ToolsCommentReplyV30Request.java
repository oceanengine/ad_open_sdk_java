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
 * ToolsCommentReplyV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsCommentReplyV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_COMMENT_IDS = "comment_ids";
  @SerializedName(SERIALIZED_NAME_COMMENT_IDS)
  private List<Long> commentIds = null;

  public static final String SERIALIZED_NAME_REPLY_TEXT = "reply_text";
  @SerializedName(SERIALIZED_NAME_REPLY_TEXT)
  private String replyText = null;

  public ToolsCommentReplyV30Request() {
  }

  public ToolsCommentReplyV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsCommentReplyV30Request commentIds(List<Long> commentIds) {
    
    this.commentIds = commentIds;
    return this;
  }

  public ToolsCommentReplyV30Request addCommentIdsItem(Long commentIdsItem) {
    if (this.commentIds == null) {
      this.commentIds = new ArrayList<>();
    }
    this.commentIds.add(commentIdsItem);
    return this;
  }

   /**
   * 评论id列表，只允许传入小于等于20个评论id
   * @return commentIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getCommentIds() {
    return commentIds;
  }


  public void setCommentIds(List<Long> commentIds) {
    this.commentIds = commentIds;
  }


  public ToolsCommentReplyV30Request replyText(String replyText) {
    
    this.replyText = replyText;
    return this;
  }

   /**
   * 回复内容，最多支持100字
   * @return replyText
  **/
  @javax.annotation.Nonnull
  public String getReplyText() {
    return replyText;
  }


  public void setReplyText(String replyText) {
    this.replyText = replyText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentReplyV30Request toolsCommentReplyV30Request = (ToolsCommentReplyV30Request) o;
    return Objects.equals(this.advertiserId, toolsCommentReplyV30Request.advertiserId) &&
        Objects.equals(this.commentIds, toolsCommentReplyV30Request.commentIds) &&
        Objects.equals(this.replyText, toolsCommentReplyV30Request.replyText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, commentIds, replyText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentReplyV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    commentIds: ").append(toIndentedString(commentIds)).append("\n");
    sb.append("    replyText: ").append(toIndentedString(replyText)).append("\n");
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
    openapiFields.add("comment_ids");
    openapiFields.add("reply_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("comment_ids");
    openapiRequiredFields.add("reply_text");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentReplyV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentReplyV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentReplyV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentReplyV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentReplyV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsCommentReplyV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentReplyV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentReplyV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentReplyV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentReplyV30Request
  */
  public static ToolsCommentReplyV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentReplyV30Request.class);
  }

 /**
  * Convert an instance of ToolsCommentReplyV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

