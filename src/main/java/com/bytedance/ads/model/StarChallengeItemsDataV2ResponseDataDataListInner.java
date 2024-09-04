/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * StarChallengeItemsDataV2ResponseDataDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class StarChallengeItemsDataV2ResponseDataDataListInner {
  public static final String SERIALIZED_NAME_ANDROID_ACTIVATE_CNT = "android_activate_cnt";
  @SerializedName(SERIALIZED_NAME_ANDROID_ACTIVATE_CNT)
  private Long androidActivateCnt = null;

  public static final String SERIALIZED_NAME_AUTHOR_NICKNAME = "author_nickname";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NICKNAME)
  private String authorNickname = null;

  public static final String SERIALIZED_NAME_COMMENT_CNT = "comment_cnt";
  @SerializedName(SERIALIZED_NAME_COMMENT_CNT)
  private Long commentCnt = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_CNT = "component_click_cnt";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_CNT)
  private Long componentClickCnt = null;

  public static final String SERIALIZED_NAME_IOS_ACTIVATE_CNT = "ios_activate_cnt";
  @SerializedName(SERIALIZED_NAME_IOS_ACTIVATE_CNT)
  private Long iosActivateCnt = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_LIKE_CNT = "like_cnt";
  @SerializedName(SERIALIZED_NAME_LIKE_CNT)
  private Long likeCnt = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_PLAY_VV = "play_vv";
  @SerializedName(SERIALIZED_NAME_PLAY_VV)
  private Long playVv = null;

  public static final String SERIALIZED_NAME_PROMOTE_CNT = "promote_cnt";
  @SerializedName(SERIALIZED_NAME_PROMOTE_CNT)
  private Long promoteCnt = null;

  public static final String SERIALIZED_NAME_RELEASE_TIME = "release_time";
  @SerializedName(SERIALIZED_NAME_RELEASE_TIME)
  private Long releaseTime = null;

  public static final String SERIALIZED_NAME_RELEVANCE_AUDIT_RESULT = "relevance_audit_result";
  @SerializedName(SERIALIZED_NAME_RELEVANCE_AUDIT_RESULT)
  private Long relevanceAuditResult = null;

  public static final String SERIALIZED_NAME_REWARD_AMOUNT = "reward_amount";
  @SerializedName(SERIALIZED_NAME_REWARD_AMOUNT)
  private Long rewardAmount = null;

  public static final String SERIALIZED_NAME_REWARD_LEVEL = "reward_level";
  @SerializedName(SERIALIZED_NAME_REWARD_LEVEL)
  private Long rewardLevel = null;

  public static final String SERIALIZED_NAME_SHARE_CNT = "share_cnt";
  @SerializedName(SERIALIZED_NAME_SHARE_CNT)
  private Long shareCnt = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private Long uid = null;

  public static final String SERIALIZED_NAME_VALID_LIKE_CNT = "valid_like_cnt";
  @SerializedName(SERIALIZED_NAME_VALID_LIKE_CNT)
  private Long validLikeCnt = null;

  public static final String SERIALIZED_NAME_VALID_PLAY_VV = "valid_play_vv";
  @SerializedName(SERIALIZED_NAME_VALID_PLAY_VV)
  private Long validPlayVv = null;

  public StarChallengeItemsDataV2ResponseDataDataListInner() {
  }

  public StarChallengeItemsDataV2ResponseDataDataListInner androidActivateCnt(Long androidActivateCnt) {
    
    this.androidActivateCnt = androidActivateCnt;
    return this;
  }

   /**
   * Android激活数
   * @return androidActivateCnt
  **/
  @javax.annotation.Nullable
  public Long getAndroidActivateCnt() {
    return androidActivateCnt;
  }


  public void setAndroidActivateCnt(Long androidActivateCnt) {
    this.androidActivateCnt = androidActivateCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner authorNickname(String authorNickname) {
    
    this.authorNickname = authorNickname;
    return this;
  }

   /**
   * 作者昵称
   * @return authorNickname
  **/
  @javax.annotation.Nullable
  public String getAuthorNickname() {
    return authorNickname;
  }


  public void setAuthorNickname(String authorNickname) {
    this.authorNickname = authorNickname;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner commentCnt(Long commentCnt) {
    
    this.commentCnt = commentCnt;
    return this;
  }

   /**
   * 评论量
   * @return commentCnt
  **/
  @javax.annotation.Nullable
  public Long getCommentCnt() {
    return commentCnt;
  }


  public void setCommentCnt(Long commentCnt) {
    this.commentCnt = commentCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner componentClickCnt(Long componentClickCnt) {
    
    this.componentClickCnt = componentClickCnt;
    return this;
  }

   /**
   * 组件点击数
   * @return componentClickCnt
  **/
  @javax.annotation.Nullable
  public Long getComponentClickCnt() {
    return componentClickCnt;
  }


  public void setComponentClickCnt(Long componentClickCnt) {
    this.componentClickCnt = componentClickCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner iosActivateCnt(Long iosActivateCnt) {
    
    this.iosActivateCnt = iosActivateCnt;
    return this;
  }

   /**
   * iOS激活数
   * @return iosActivateCnt
  **/
  @javax.annotation.Nullable
  public Long getIosActivateCnt() {
    return iosActivateCnt;
  }


  public void setIosActivateCnt(Long iosActivateCnt) {
    this.iosActivateCnt = iosActivateCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 作品ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner likeCnt(Long likeCnt) {
    
    this.likeCnt = likeCnt;
    return this;
  }

   /**
   * 点赞量
   * @return likeCnt
  **/
  @javax.annotation.Nullable
  public Long getLikeCnt() {
    return likeCnt;
  }


  public void setLikeCnt(Long likeCnt) {
    this.likeCnt = likeCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 作品链接
   * @return link
  **/
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner playVv(Long playVv) {
    
    this.playVv = playVv;
    return this;
  }

   /**
   * 播放量
   * @return playVv
  **/
  @javax.annotation.Nullable
  public Long getPlayVv() {
    return playVv;
  }


  public void setPlayVv(Long playVv) {
    this.playVv = playVv;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner promoteCnt(Long promoteCnt) {
    
    this.promoteCnt = promoteCnt;
    return this;
  }

   /**
   * 促活转化数
   * @return promoteCnt
  **/
  @javax.annotation.Nullable
  public Long getPromoteCnt() {
    return promoteCnt;
  }


  public void setPromoteCnt(Long promoteCnt) {
    this.promoteCnt = promoteCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner releaseTime(Long releaseTime) {
    
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * 发布时间
   * @return releaseTime
  **/
  @javax.annotation.Nullable
  public Long getReleaseTime() {
    return releaseTime;
  }


  public void setReleaseTime(Long releaseTime) {
    this.releaseTime = releaseTime;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner relevanceAuditResult(Long relevanceAuditResult) {
    
    this.relevanceAuditResult = relevanceAuditResult;
    return this;
  }

   /**
   * 1：审核中 2：相关 3：不相关
   * @return relevanceAuditResult
  **/
  @javax.annotation.Nullable
  public Long getRelevanceAuditResult() {
    return relevanceAuditResult;
  }


  public void setRelevanceAuditResult(Long relevanceAuditResult) {
    this.relevanceAuditResult = relevanceAuditResult;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner rewardAmount(Long rewardAmount) {
    
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * 获奖金额（分）
   * @return rewardAmount
  **/
  @javax.annotation.Nullable
  public Long getRewardAmount() {
    return rewardAmount;
  }


  public void setRewardAmount(Long rewardAmount) {
    this.rewardAmount = rewardAmount;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner rewardLevel(Long rewardLevel) {
    
    this.rewardLevel = rewardLevel;
    return this;
  }

   /**
   * 获奖等级
   * @return rewardLevel
  **/
  @javax.annotation.Nullable
  public Long getRewardLevel() {
    return rewardLevel;
  }


  public void setRewardLevel(Long rewardLevel) {
    this.rewardLevel = rewardLevel;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner shareCnt(Long shareCnt) {
    
    this.shareCnt = shareCnt;
    return this;
  }

   /**
   * 分享量
   * @return shareCnt
  **/
  @javax.annotation.Nullable
  public Long getShareCnt() {
    return shareCnt;
  }


  public void setShareCnt(Long shareCnt) {
    this.shareCnt = shareCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 作品标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner uid(Long uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * 作者uid
   * @return uid
  **/
  @javax.annotation.Nullable
  public Long getUid() {
    return uid;
  }


  public void setUid(Long uid) {
    this.uid = uid;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner validLikeCnt(Long validLikeCnt) {
    
    this.validLikeCnt = validLikeCnt;
    return this;
  }

   /**
   * 有效点赞量
   * @return validLikeCnt
  **/
  @javax.annotation.Nullable
  public Long getValidLikeCnt() {
    return validLikeCnt;
  }


  public void setValidLikeCnt(Long validLikeCnt) {
    this.validLikeCnt = validLikeCnt;
  }


  public StarChallengeItemsDataV2ResponseDataDataListInner validPlayVv(Long validPlayVv) {
    
    this.validPlayVv = validPlayVv;
    return this;
  }

   /**
   * 有效播放量
   * @return validPlayVv
  **/
  @javax.annotation.Nullable
  public Long getValidPlayVv() {
    return validPlayVv;
  }


  public void setValidPlayVv(Long validPlayVv) {
    this.validPlayVv = validPlayVv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeItemsDataV2ResponseDataDataListInner starChallengeItemsDataV2ResponseDataDataListInner = (StarChallengeItemsDataV2ResponseDataDataListInner) o;
    return Objects.equals(this.androidActivateCnt, starChallengeItemsDataV2ResponseDataDataListInner.androidActivateCnt) &&
        Objects.equals(this.authorNickname, starChallengeItemsDataV2ResponseDataDataListInner.authorNickname) &&
        Objects.equals(this.commentCnt, starChallengeItemsDataV2ResponseDataDataListInner.commentCnt) &&
        Objects.equals(this.componentClickCnt, starChallengeItemsDataV2ResponseDataDataListInner.componentClickCnt) &&
        Objects.equals(this.iosActivateCnt, starChallengeItemsDataV2ResponseDataDataListInner.iosActivateCnt) &&
        Objects.equals(this.itemId, starChallengeItemsDataV2ResponseDataDataListInner.itemId) &&
        Objects.equals(this.likeCnt, starChallengeItemsDataV2ResponseDataDataListInner.likeCnt) &&
        Objects.equals(this.link, starChallengeItemsDataV2ResponseDataDataListInner.link) &&
        Objects.equals(this.playVv, starChallengeItemsDataV2ResponseDataDataListInner.playVv) &&
        Objects.equals(this.promoteCnt, starChallengeItemsDataV2ResponseDataDataListInner.promoteCnt) &&
        Objects.equals(this.releaseTime, starChallengeItemsDataV2ResponseDataDataListInner.releaseTime) &&
        Objects.equals(this.relevanceAuditResult, starChallengeItemsDataV2ResponseDataDataListInner.relevanceAuditResult) &&
        Objects.equals(this.rewardAmount, starChallengeItemsDataV2ResponseDataDataListInner.rewardAmount) &&
        Objects.equals(this.rewardLevel, starChallengeItemsDataV2ResponseDataDataListInner.rewardLevel) &&
        Objects.equals(this.shareCnt, starChallengeItemsDataV2ResponseDataDataListInner.shareCnt) &&
        Objects.equals(this.title, starChallengeItemsDataV2ResponseDataDataListInner.title) &&
        Objects.equals(this.uid, starChallengeItemsDataV2ResponseDataDataListInner.uid) &&
        Objects.equals(this.validLikeCnt, starChallengeItemsDataV2ResponseDataDataListInner.validLikeCnt) &&
        Objects.equals(this.validPlayVv, starChallengeItemsDataV2ResponseDataDataListInner.validPlayVv);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidActivateCnt, authorNickname, commentCnt, componentClickCnt, iosActivateCnt, itemId, likeCnt, link, playVv, promoteCnt, releaseTime, relevanceAuditResult, rewardAmount, rewardLevel, shareCnt, title, uid, validLikeCnt, validPlayVv);
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
    sb.append("class StarChallengeItemsDataV2ResponseDataDataListInner {\n");
    sb.append("    androidActivateCnt: ").append(toIndentedString(androidActivateCnt)).append("\n");
    sb.append("    authorNickname: ").append(toIndentedString(authorNickname)).append("\n");
    sb.append("    commentCnt: ").append(toIndentedString(commentCnt)).append("\n");
    sb.append("    componentClickCnt: ").append(toIndentedString(componentClickCnt)).append("\n");
    sb.append("    iosActivateCnt: ").append(toIndentedString(iosActivateCnt)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    likeCnt: ").append(toIndentedString(likeCnt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    playVv: ").append(toIndentedString(playVv)).append("\n");
    sb.append("    promoteCnt: ").append(toIndentedString(promoteCnt)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
    sb.append("    relevanceAuditResult: ").append(toIndentedString(relevanceAuditResult)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    rewardLevel: ").append(toIndentedString(rewardLevel)).append("\n");
    sb.append("    shareCnt: ").append(toIndentedString(shareCnt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    validLikeCnt: ").append(toIndentedString(validLikeCnt)).append("\n");
    sb.append("    validPlayVv: ").append(toIndentedString(validPlayVv)).append("\n");
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
    openapiFields.add("android_activate_cnt");
    openapiFields.add("author_nickname");
    openapiFields.add("comment_cnt");
    openapiFields.add("component_click_cnt");
    openapiFields.add("ios_activate_cnt");
    openapiFields.add("item_id");
    openapiFields.add("like_cnt");
    openapiFields.add("link");
    openapiFields.add("play_vv");
    openapiFields.add("promote_cnt");
    openapiFields.add("release_time");
    openapiFields.add("relevance_audit_result");
    openapiFields.add("reward_amount");
    openapiFields.add("reward_level");
    openapiFields.add("share_cnt");
    openapiFields.add("title");
    openapiFields.add("uid");
    openapiFields.add("valid_like_cnt");
    openapiFields.add("valid_play_vv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeItemsDataV2ResponseDataDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeItemsDataV2ResponseDataDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeItemsDataV2ResponseDataDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeItemsDataV2ResponseDataDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeItemsDataV2ResponseDataDataListInner>() {
           @Override
           public void write(JsonWriter out, StarChallengeItemsDataV2ResponseDataDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeItemsDataV2ResponseDataDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeItemsDataV2ResponseDataDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeItemsDataV2ResponseDataDataListInner
  * @throws IOException if the JSON string is invalid with respect to StarChallengeItemsDataV2ResponseDataDataListInner
  */
  public static StarChallengeItemsDataV2ResponseDataDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeItemsDataV2ResponseDataDataListInner.class);
  }

 /**
  * Convert an instance of StarChallengeItemsDataV2ResponseDataDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

