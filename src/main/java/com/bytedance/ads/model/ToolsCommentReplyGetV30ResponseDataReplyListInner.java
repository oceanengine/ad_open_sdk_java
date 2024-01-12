/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCommentReplyGetV30DataReplyListHideStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ToolsCommentReplyGetV30ResponseDataReplyListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class ToolsCommentReplyGetV30ResponseDataReplyListInner {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_COMMENT_ID = "comment_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private Long commentId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_HIDE_STATUS = "hide_status";
  @SerializedName(SERIALIZED_NAME_HIDE_STATUS)
  private ToolsCommentReplyGetV30DataReplyListHideStatus hideStatus = null;

  public static final String SERIALIZED_NAME_IS_STICK = "is_stick";
  @SerializedName(SERIALIZED_NAME_IS_STICK)
  private Long isStick = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_LIKE_COUNT = "like_count";
  @SerializedName(SERIALIZED_NAME_LIKE_COUNT)
  private Long likeCount = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = null;

  public ToolsCommentReplyGetV30ResponseDataReplyListInner() {
  }

  public ToolsCommentReplyGetV30ResponseDataReplyListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 评论用户抖音号
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 评论用户昵称
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner commentId(Long commentId) {
    
    this.commentId = commentId;
    return this;
  }

   /**
   * 评论id
   * @return commentId
  **/
  @javax.annotation.Nullable
  public Long getCommentId() {
    return commentId;
  }


  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner hideStatus(ToolsCommentReplyGetV30DataReplyListHideStatus hideStatus) {
    
    this.hideStatus = hideStatus;
    return this;
  }

   /**
   * Get hideStatus
   * @return hideStatus
  **/
  @javax.annotation.Nullable
  public ToolsCommentReplyGetV30DataReplyListHideStatus getHideStatus() {
    return hideStatus;
  }


  public void setHideStatus(ToolsCommentReplyGetV30DataReplyListHideStatus hideStatus) {
    this.hideStatus = hideStatus;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner isStick(Long isStick) {
    
    this.isStick = isStick;
    return this;
  }

   /**
   * 该评论是否置顶，0：表示不置顶，1：表示置顶
   * @return isStick
  **/
  @javax.annotation.Nullable
  public Long getIsStick() {
    return isStick;
  }


  public void setIsStick(Long isStick) {
    this.isStick = isStick;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 抖音视频id
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner likeCount(Long likeCount) {
    
    this.likeCount = likeCount;
    return this;
  }

   /**
   * 点赞数
   * @return likeCount
  **/
  @javax.annotation.Nullable
  public Long getLikeCount() {
    return likeCount;
  }


  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }


  public ToolsCommentReplyGetV30ResponseDataReplyListInner text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * 评论内容
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentReplyGetV30ResponseDataReplyListInner toolsCommentReplyGetV30ResponseDataReplyListInner = (ToolsCommentReplyGetV30ResponseDataReplyListInner) o;
    return Objects.equals(this.awemeId, toolsCommentReplyGetV30ResponseDataReplyListInner.awemeId) &&
        Objects.equals(this.awemeName, toolsCommentReplyGetV30ResponseDataReplyListInner.awemeName) &&
        Objects.equals(this.commentId, toolsCommentReplyGetV30ResponseDataReplyListInner.commentId) &&
        Objects.equals(this.createTime, toolsCommentReplyGetV30ResponseDataReplyListInner.createTime) &&
        Objects.equals(this.hideStatus, toolsCommentReplyGetV30ResponseDataReplyListInner.hideStatus) &&
        Objects.equals(this.isStick, toolsCommentReplyGetV30ResponseDataReplyListInner.isStick) &&
        Objects.equals(this.itemId, toolsCommentReplyGetV30ResponseDataReplyListInner.itemId) &&
        Objects.equals(this.likeCount, toolsCommentReplyGetV30ResponseDataReplyListInner.likeCount) &&
        Objects.equals(this.text, toolsCommentReplyGetV30ResponseDataReplyListInner.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, awemeName, commentId, createTime, hideStatus, isStick, itemId, likeCount, text);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentReplyGetV30ResponseDataReplyListInner {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    hideStatus: ").append(toIndentedString(hideStatus)).append("\n");
    sb.append("    isStick: ").append(toIndentedString(isStick)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("comment_id");
    openapiFields.add("create_time");
    openapiFields.add("hide_status");
    openapiFields.add("is_stick");
    openapiFields.add("item_id");
    openapiFields.add("like_count");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentReplyGetV30ResponseDataReplyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentReplyGetV30ResponseDataReplyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentReplyGetV30ResponseDataReplyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentReplyGetV30ResponseDataReplyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentReplyGetV30ResponseDataReplyListInner>() {
           @Override
           public void write(JsonWriter out, ToolsCommentReplyGetV30ResponseDataReplyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentReplyGetV30ResponseDataReplyListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentReplyGetV30ResponseDataReplyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentReplyGetV30ResponseDataReplyListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentReplyGetV30ResponseDataReplyListInner
  */
  public static ToolsCommentReplyGetV30ResponseDataReplyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentReplyGetV30ResponseDataReplyListInner.class);
  }

 /**
  * Convert an instance of ToolsCommentReplyGetV30ResponseDataReplyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

