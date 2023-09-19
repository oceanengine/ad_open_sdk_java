/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCommentStickOnTopV30StickType;
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
 * ToolsCommentStickOnTopV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsCommentStickOnTopV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_COMMENT_ID = "comment_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private Long commentId = null;

  public static final String SERIALIZED_NAME_STICK_TYPE = "stick_type";
  @SerializedName(SERIALIZED_NAME_STICK_TYPE)
  private ToolsCommentStickOnTopV30StickType stickType = null;

  public ToolsCommentStickOnTopV30Request() {
  }

  public ToolsCommentStickOnTopV30Request advertiserId(Long advertiserId) {
    
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


  public ToolsCommentStickOnTopV30Request commentId(Long commentId) {
    
    this.commentId = commentId;
    return this;
  }

   /**
   * 评论id
   * @return commentId
  **/
  @javax.annotation.Nonnull
  public Long getCommentId() {
    return commentId;
  }


  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }


  public ToolsCommentStickOnTopV30Request stickType(ToolsCommentStickOnTopV30StickType stickType) {
    
    this.stickType = stickType;
    return this;
  }

   /**
   * Get stickType
   * @return stickType
  **/
  @javax.annotation.Nonnull
  public ToolsCommentStickOnTopV30StickType getStickType() {
    return stickType;
  }


  public void setStickType(ToolsCommentStickOnTopV30StickType stickType) {
    this.stickType = stickType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentStickOnTopV30Request toolsCommentStickOnTopV30Request = (ToolsCommentStickOnTopV30Request) o;
    return Objects.equals(this.advertiserId, toolsCommentStickOnTopV30Request.advertiserId) &&
        Objects.equals(this.commentId, toolsCommentStickOnTopV30Request.commentId) &&
        Objects.equals(this.stickType, toolsCommentStickOnTopV30Request.stickType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, commentId, stickType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentStickOnTopV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    stickType: ").append(toIndentedString(stickType)).append("\n");
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
    openapiFields.add("comment_id");
    openapiFields.add("stick_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("comment_id");
    openapiRequiredFields.add("stick_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentStickOnTopV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentStickOnTopV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentStickOnTopV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentStickOnTopV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentStickOnTopV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsCommentStickOnTopV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentStickOnTopV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentStickOnTopV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentStickOnTopV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentStickOnTopV30Request
  */
  public static ToolsCommentStickOnTopV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentStickOnTopV30Request.class);
  }

 /**
  * Convert an instance of ToolsCommentStickOnTopV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

