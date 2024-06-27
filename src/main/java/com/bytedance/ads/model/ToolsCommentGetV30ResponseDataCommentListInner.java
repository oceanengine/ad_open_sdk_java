/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCommentGetV30DataCommentListCommentPermission;
import com.bytedance.ads.model.ToolsCommentGetV30DataCommentListEmotionType;
import com.bytedance.ads.model.ToolsCommentGetV30DataCommentListHideStatus;
import com.bytedance.ads.model.ToolsCommentGetV30DataCommentListLevelType;
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
 * ToolsCommentGetV30ResponseDataCommentListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class ToolsCommentGetV30ResponseDataCommentListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_COMMENT_ID = "comment_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private Long commentId = null;

  public static final String SERIALIZED_NAME_COMMENT_PERMISSION = "comment_permission";
  @SerializedName(SERIALIZED_NAME_COMMENT_PERMISSION)
  private ToolsCommentGetV30DataCommentListCommentPermission commentPermission = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_EMOTION_TYPE = "emotion_type";
  @SerializedName(SERIALIZED_NAME_EMOTION_TYPE)
  private ToolsCommentGetV30DataCommentListEmotionType emotionType = null;

  public static final String SERIALIZED_NAME_HIDE_STATUS = "hide_status";
  @SerializedName(SERIALIZED_NAME_HIDE_STATUS)
  private ToolsCommentGetV30DataCommentListHideStatus hideStatus = null;

  public static final String SERIALIZED_NAME_IS_STICK = "is_stick";
  @SerializedName(SERIALIZED_NAME_IS_STICK)
  private Integer isStick = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ITEM_TITLE = "item_title";
  @SerializedName(SERIALIZED_NAME_ITEM_TITLE)
  private String itemTitle = null;

  public static final String SERIALIZED_NAME_LEVEL_TYPE = "level_type";
  @SerializedName(SERIALIZED_NAME_LEVEL_TYPE)
  private ToolsCommentGetV30DataCommentListLevelType levelType = null;

  public static final String SERIALIZED_NAME_LIKE_COUNT = "like_count";
  @SerializedName(SERIALIZED_NAME_LIKE_COUNT)
  private Long likeCount = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_REPLY_COUNT = "reply_count";
  @SerializedName(SERIALIZED_NAME_REPLY_COUNT)
  private Long replyCount = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text = null;

  public ToolsCommentGetV30ResponseDataCommentListInner() {
  }

  public ToolsCommentGetV30ResponseDataCommentListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划id，仅1.0平台适用，引流流量会返回，自然流量不会返回
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 计划名称
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner awemeId(String awemeId) {
    
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


  public ToolsCommentGetV30ResponseDataCommentListInner awemeName(String awemeName) {
    
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


  public ToolsCommentGetV30ResponseDataCommentListInner commentId(Long commentId) {
    
    this.commentId = commentId;
    return this;
  }

   /**
   * 评论ID
   * @return commentId
  **/
  @javax.annotation.Nullable
  public Long getCommentId() {
    return commentId;
  }


  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner commentPermission(ToolsCommentGetV30DataCommentListCommentPermission commentPermission) {
    
    this.commentPermission = commentPermission;
    return this;
  }

   /**
   * Get commentPermission
   * @return commentPermission
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30DataCommentListCommentPermission getCommentPermission() {
    return commentPermission;
  }


  public void setCommentPermission(ToolsCommentGetV30DataCommentListCommentPermission commentPermission) {
    this.commentPermission = commentPermission;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 评论创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 广告创意id，1.0：引流流量会返回，自然流量不会返回； 2.0：可能返回，返回值不具参考意义
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner emotionType(ToolsCommentGetV30DataCommentListEmotionType emotionType) {
    
    this.emotionType = emotionType;
    return this;
  }

   /**
   * Get emotionType
   * @return emotionType
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30DataCommentListEmotionType getEmotionType() {
    return emotionType;
  }


  public void setEmotionType(ToolsCommentGetV30DataCommentListEmotionType emotionType) {
    this.emotionType = emotionType;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner hideStatus(ToolsCommentGetV30DataCommentListHideStatus hideStatus) {
    
    this.hideStatus = hideStatus;
    return this;
  }

   /**
   * Get hideStatus
   * @return hideStatus
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30DataCommentListHideStatus getHideStatus() {
    return hideStatus;
  }


  public void setHideStatus(ToolsCommentGetV30DataCommentListHideStatus hideStatus) {
    this.hideStatus = hideStatus;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner isStick(Integer isStick) {
    
    this.isStick = isStick;
    return this;
  }

   /**
   * 该评论是否置顶，0：表示不置顶，1：表示置顶
   * @return isStick
  **/
  @javax.annotation.Nullable
  public Integer getIsStick() {
    return isStick;
  }


  public void setIsStick(Integer isStick) {
    this.isStick = isStick;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 广告视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner itemTitle(String itemTitle) {
    
    this.itemTitle = itemTitle;
    return this;
  }

   /**
   * 视频标题
   * @return itemTitle
  **/
  @javax.annotation.Nullable
  public String getItemTitle() {
    return itemTitle;
  }


  public void setItemTitle(String itemTitle) {
    this.itemTitle = itemTitle;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner levelType(ToolsCommentGetV30DataCommentListLevelType levelType) {
    
    this.levelType = levelType;
    return this;
  }

   /**
   * Get levelType
   * @return levelType
  **/
  @javax.annotation.Nullable
  public ToolsCommentGetV30DataCommentListLevelType getLevelType() {
    return levelType;
  }


  public void setLevelType(ToolsCommentGetV30DataCommentListLevelType levelType) {
    this.levelType = levelType;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner likeCount(Long likeCount) {
    
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


  public ToolsCommentGetV30ResponseDataCommentListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告id，仅2.0平台适用，仅引流流量返回
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner replyCount(Long replyCount) {
    
    this.replyCount = replyCount;
    return this;
  }

   /**
   * 评论的回复数量
   * @return replyCount
  **/
  @javax.annotation.Nullable
  public Long getReplyCount() {
    return replyCount;
  }


  public void setReplyCount(Long replyCount) {
    this.replyCount = replyCount;
  }


  public ToolsCommentGetV30ResponseDataCommentListInner text(String text) {
    
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
    ToolsCommentGetV30ResponseDataCommentListInner toolsCommentGetV30ResponseDataCommentListInner = (ToolsCommentGetV30ResponseDataCommentListInner) o;
    return Objects.equals(this.adId, toolsCommentGetV30ResponseDataCommentListInner.adId) &&
        Objects.equals(this.adName, toolsCommentGetV30ResponseDataCommentListInner.adName) &&
        Objects.equals(this.awemeId, toolsCommentGetV30ResponseDataCommentListInner.awemeId) &&
        Objects.equals(this.awemeName, toolsCommentGetV30ResponseDataCommentListInner.awemeName) &&
        Objects.equals(this.commentId, toolsCommentGetV30ResponseDataCommentListInner.commentId) &&
        Objects.equals(this.commentPermission, toolsCommentGetV30ResponseDataCommentListInner.commentPermission) &&
        Objects.equals(this.createTime, toolsCommentGetV30ResponseDataCommentListInner.createTime) &&
        Objects.equals(this.creativeId, toolsCommentGetV30ResponseDataCommentListInner.creativeId) &&
        Objects.equals(this.emotionType, toolsCommentGetV30ResponseDataCommentListInner.emotionType) &&
        Objects.equals(this.hideStatus, toolsCommentGetV30ResponseDataCommentListInner.hideStatus) &&
        Objects.equals(this.isStick, toolsCommentGetV30ResponseDataCommentListInner.isStick) &&
        Objects.equals(this.itemId, toolsCommentGetV30ResponseDataCommentListInner.itemId) &&
        Objects.equals(this.itemTitle, toolsCommentGetV30ResponseDataCommentListInner.itemTitle) &&
        Objects.equals(this.levelType, toolsCommentGetV30ResponseDataCommentListInner.levelType) &&
        Objects.equals(this.likeCount, toolsCommentGetV30ResponseDataCommentListInner.likeCount) &&
        Objects.equals(this.materialId, toolsCommentGetV30ResponseDataCommentListInner.materialId) &&
        Objects.equals(this.promotionId, toolsCommentGetV30ResponseDataCommentListInner.promotionId) &&
        Objects.equals(this.replyCount, toolsCommentGetV30ResponseDataCommentListInner.replyCount) &&
        Objects.equals(this.text, toolsCommentGetV30ResponseDataCommentListInner.text);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adName, awemeId, awemeName, commentId, commentPermission, createTime, creativeId, emotionType, hideStatus, isStick, itemId, itemTitle, levelType, likeCount, materialId, promotionId, replyCount, text);
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
    sb.append("class ToolsCommentGetV30ResponseDataCommentListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentPermission: ").append(toIndentedString(commentPermission)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    emotionType: ").append(toIndentedString(emotionType)).append("\n");
    sb.append("    hideStatus: ").append(toIndentedString(hideStatus)).append("\n");
    sb.append("    isStick: ").append(toIndentedString(isStick)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemTitle: ").append(toIndentedString(itemTitle)).append("\n");
    sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    replyCount: ").append(toIndentedString(replyCount)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_name");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("comment_id");
    openapiFields.add("comment_permission");
    openapiFields.add("create_time");
    openapiFields.add("creative_id");
    openapiFields.add("emotion_type");
    openapiFields.add("hide_status");
    openapiFields.add("is_stick");
    openapiFields.add("item_id");
    openapiFields.add("item_title");
    openapiFields.add("level_type");
    openapiFields.add("like_count");
    openapiFields.add("material_id");
    openapiFields.add("promotion_id");
    openapiFields.add("reply_count");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentGetV30ResponseDataCommentListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentGetV30ResponseDataCommentListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentGetV30ResponseDataCommentListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentGetV30ResponseDataCommentListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentGetV30ResponseDataCommentListInner>() {
           @Override
           public void write(JsonWriter out, ToolsCommentGetV30ResponseDataCommentListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentGetV30ResponseDataCommentListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentGetV30ResponseDataCommentListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentGetV30ResponseDataCommentListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentGetV30ResponseDataCommentListInner
  */
  public static ToolsCommentGetV30ResponseDataCommentListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentGetV30ResponseDataCommentListInner.class);
  }

 /**
  * Convert an instance of ToolsCommentGetV30ResponseDataCommentListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

