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
 * StarDataTaskTimelineReportV2ResponseDataTaskDataValue
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class StarDataTaskTimelineReportV2ResponseDataTaskDataValue {
  public static final String SERIALIZED_NAME_COMMENT_CNT = "comment_cnt";
  @SerializedName(SERIALIZED_NAME_COMMENT_CNT)
  private Long commentCnt = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_LIKE_CNT = "like_cnt";
  @SerializedName(SERIALIZED_NAME_LIKE_CNT)
  private Long likeCnt = null;

  public static final String SERIALIZED_NAME_PLAY_CNT = "play_cnt";
  @SerializedName(SERIALIZED_NAME_PLAY_CNT)
  private Long playCnt = null;

  public static final String SERIALIZED_NAME_SHARE_CNT = "share_cnt";
  @SerializedName(SERIALIZED_NAME_SHARE_CNT)
  private Long shareCnt = null;

  public StarDataTaskTimelineReportV2ResponseDataTaskDataValue() {
  }

  public StarDataTaskTimelineReportV2ResponseDataTaskDataValue commentCnt(Long commentCnt) {
    
    this.commentCnt = commentCnt;
    return this;
  }

   /**
   * 评论次数
   * @return commentCnt
  **/
  @javax.annotation.Nullable
  public Long getCommentCnt() {
    return commentCnt;
  }


  public void setCommentCnt(Long commentCnt) {
    this.commentCnt = commentCnt;
  }


  public StarDataTaskTimelineReportV2ResponseDataTaskDataValue itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarDataTaskTimelineReportV2ResponseDataTaskDataValue likeCnt(Long likeCnt) {
    
    this.likeCnt = likeCnt;
    return this;
  }

   /**
   * 点赞次数
   * @return likeCnt
  **/
  @javax.annotation.Nullable
  public Long getLikeCnt() {
    return likeCnt;
  }


  public void setLikeCnt(Long likeCnt) {
    this.likeCnt = likeCnt;
  }


  public StarDataTaskTimelineReportV2ResponseDataTaskDataValue playCnt(Long playCnt) {
    
    this.playCnt = playCnt;
    return this;
  }

   /**
   * 播放次数
   * @return playCnt
  **/
  @javax.annotation.Nullable
  public Long getPlayCnt() {
    return playCnt;
  }


  public void setPlayCnt(Long playCnt) {
    this.playCnt = playCnt;
  }


  public StarDataTaskTimelineReportV2ResponseDataTaskDataValue shareCnt(Long shareCnt) {
    
    this.shareCnt = shareCnt;
    return this;
  }

   /**
   * 分享次数
   * @return shareCnt
  **/
  @javax.annotation.Nullable
  public Long getShareCnt() {
    return shareCnt;
  }


  public void setShareCnt(Long shareCnt) {
    this.shareCnt = shareCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDataTaskTimelineReportV2ResponseDataTaskDataValue starDataTaskTimelineReportV2ResponseDataTaskDataValue = (StarDataTaskTimelineReportV2ResponseDataTaskDataValue) o;
    return Objects.equals(this.commentCnt, starDataTaskTimelineReportV2ResponseDataTaskDataValue.commentCnt) &&
        Objects.equals(this.itemId, starDataTaskTimelineReportV2ResponseDataTaskDataValue.itemId) &&
        Objects.equals(this.likeCnt, starDataTaskTimelineReportV2ResponseDataTaskDataValue.likeCnt) &&
        Objects.equals(this.playCnt, starDataTaskTimelineReportV2ResponseDataTaskDataValue.playCnt) &&
        Objects.equals(this.shareCnt, starDataTaskTimelineReportV2ResponseDataTaskDataValue.shareCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentCnt, itemId, likeCnt, playCnt, shareCnt);
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
    sb.append("class StarDataTaskTimelineReportV2ResponseDataTaskDataValue {\n");
    sb.append("    commentCnt: ").append(toIndentedString(commentCnt)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    likeCnt: ").append(toIndentedString(likeCnt)).append("\n");
    sb.append("    playCnt: ").append(toIndentedString(playCnt)).append("\n");
    sb.append("    shareCnt: ").append(toIndentedString(shareCnt)).append("\n");
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
    openapiFields.add("comment_cnt");
    openapiFields.add("item_id");
    openapiFields.add("like_cnt");
    openapiFields.add("play_cnt");
    openapiFields.add("share_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDataTaskTimelineReportV2ResponseDataTaskDataValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDataTaskTimelineReportV2ResponseDataTaskDataValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDataTaskTimelineReportV2ResponseDataTaskDataValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDataTaskTimelineReportV2ResponseDataTaskDataValue.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDataTaskTimelineReportV2ResponseDataTaskDataValue>() {
           @Override
           public void write(JsonWriter out, StarDataTaskTimelineReportV2ResponseDataTaskDataValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDataTaskTimelineReportV2ResponseDataTaskDataValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDataTaskTimelineReportV2ResponseDataTaskDataValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDataTaskTimelineReportV2ResponseDataTaskDataValue
  * @throws IOException if the JSON string is invalid with respect to StarDataTaskTimelineReportV2ResponseDataTaskDataValue
  */
  public static StarDataTaskTimelineReportV2ResponseDataTaskDataValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDataTaskTimelineReportV2ResponseDataTaskDataValue.class);
  }

 /**
  * Convert an instance of StarDataTaskTimelineReportV2ResponseDataTaskDataValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

