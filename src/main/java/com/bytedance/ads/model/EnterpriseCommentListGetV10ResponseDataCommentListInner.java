/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EnterpriseCommentListGetV10DataCommentListLevel;
import com.bytedance.ads.model.EnterpriseCommentListGetV10DataCommentListSource;
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
 * EnterpriseCommentListGetV10ResponseDataCommentListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class EnterpriseCommentListGetV10ResponseDataCommentListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_COMMENT_AWEME_NAME = "comment_aweme_name";
  @SerializedName(SERIALIZED_NAME_COMMENT_AWEME_NAME)
  private String commentAwemeName = null;

  public static final String SERIALIZED_NAME_COMMENT_ID = "comment_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private Long commentId = null;

  public static final String SERIALIZED_NAME_COMMENT_IMAGE = "comment_image";
  @SerializedName(SERIALIZED_NAME_COMMENT_IMAGE)
  private List<String> commentImage = null;

  public static final String SERIALIZED_NAME_COMMENT_OPEN_ID = "comment_open_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_OPEN_ID)
  private String commentOpenId = null;

  public static final String SERIALIZED_NAME_COMMENT_TEXT = "comment_text";
  @SerializedName(SERIALIZED_NAME_COMMENT_TEXT)
  private String commentText = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_DIGG_COUNT = "digg_count";
  @SerializedName(SERIALIZED_NAME_DIGG_COUNT)
  private Long diggCount = null;

  public static final String SERIALIZED_NAME_IS_BANNED_USER = "is_banned_user";
  @SerializedName(SERIALIZED_NAME_IS_BANNED_USER)
  private Long isBannedUser = null;

  public static final String SERIALIZED_NAME_IS_STICK = "is_stick";
  @SerializedName(SERIALIZED_NAME_IS_STICK)
  private Long isStick = null;

  public static final String SERIALIZED_NAME_ITEM_AWEME_NAME = "item_aweme_name";
  @SerializedName(SERIALIZED_NAME_ITEM_AWEME_NAME)
  private String itemAwemeName = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ITEM_OPEN_ID = "item_open_id";
  @SerializedName(SERIALIZED_NAME_ITEM_OPEN_ID)
  private String itemOpenId = null;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private EnterpriseCommentListGetV10DataCommentListLevel level = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_REPLIED_COMMENT_ID = "replied_comment_id";
  @SerializedName(SERIALIZED_NAME_REPLIED_COMMENT_ID)
  private Long repliedCommentId = null;

  public static final String SERIALIZED_NAME_REPLY_COUNT = "reply_count";
  @SerializedName(SERIALIZED_NAME_REPLY_COUNT)
  private Long replyCount = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private EnterpriseCommentListGetV10DataCommentListSource source = null;

  public EnterpriseCommentListGetV10ResponseDataCommentListInner() {
  }

  public EnterpriseCommentListGetV10ResponseDataCommentListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner commentAwemeName(String commentAwemeName) {
    
    this.commentAwemeName = commentAwemeName;
    return this;
  }

   /**
   * 
   * @return commentAwemeName
  **/
  @javax.annotation.Nullable
  public String getCommentAwemeName() {
    return commentAwemeName;
  }


  public void setCommentAwemeName(String commentAwemeName) {
    this.commentAwemeName = commentAwemeName;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner commentId(Long commentId) {
    
    this.commentId = commentId;
    return this;
  }

   /**
   * 
   * @return commentId
  **/
  @javax.annotation.Nullable
  public Long getCommentId() {
    return commentId;
  }


  public void setCommentId(Long commentId) {
    this.commentId = commentId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner commentImage(List<String> commentImage) {
    
    this.commentImage = commentImage;
    return this;
  }

  public EnterpriseCommentListGetV10ResponseDataCommentListInner addCommentImageItem(String commentImageItem) {
    if (this.commentImage == null) {
      this.commentImage = new ArrayList<>();
    }
    this.commentImage.add(commentImageItem);
    return this;
  }

   /**
   * 
   * @return commentImage
  **/
  @javax.annotation.Nullable
  public List<String> getCommentImage() {
    return commentImage;
  }


  public void setCommentImage(List<String> commentImage) {
    this.commentImage = commentImage;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner commentOpenId(String commentOpenId) {
    
    this.commentOpenId = commentOpenId;
    return this;
  }

   /**
   * 
   * @return commentOpenId
  **/
  @javax.annotation.Nullable
  public String getCommentOpenId() {
    return commentOpenId;
  }


  public void setCommentOpenId(String commentOpenId) {
    this.commentOpenId = commentOpenId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner commentText(String commentText) {
    
    this.commentText = commentText;
    return this;
  }

   /**
   * 
   * @return commentText
  **/
  @javax.annotation.Nullable
  public String getCommentText() {
    return commentText;
  }


  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner diggCount(Long diggCount) {
    
    this.diggCount = diggCount;
    return this;
  }

   /**
   * 
   * @return diggCount
  **/
  @javax.annotation.Nullable
  public Long getDiggCount() {
    return diggCount;
  }


  public void setDiggCount(Long diggCount) {
    this.diggCount = diggCount;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner isBannedUser(Long isBannedUser) {
    
    this.isBannedUser = isBannedUser;
    return this;
  }

   /**
   * 
   * @return isBannedUser
  **/
  @javax.annotation.Nullable
  public Long getIsBannedUser() {
    return isBannedUser;
  }


  public void setIsBannedUser(Long isBannedUser) {
    this.isBannedUser = isBannedUser;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner isStick(Long isStick) {
    
    this.isStick = isStick;
    return this;
  }

   /**
   * 
   * @return isStick
  **/
  @javax.annotation.Nullable
  public Long getIsStick() {
    return isStick;
  }


  public void setIsStick(Long isStick) {
    this.isStick = isStick;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner itemAwemeName(String itemAwemeName) {
    
    this.itemAwemeName = itemAwemeName;
    return this;
  }

   /**
   * 
   * @return itemAwemeName
  **/
  @javax.annotation.Nullable
  public String getItemAwemeName() {
    return itemAwemeName;
  }


  public void setItemAwemeName(String itemAwemeName) {
    this.itemAwemeName = itemAwemeName;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner itemOpenId(String itemOpenId) {
    
    this.itemOpenId = itemOpenId;
    return this;
  }

   /**
   * 
   * @return itemOpenId
  **/
  @javax.annotation.Nullable
  public String getItemOpenId() {
    return itemOpenId;
  }


  public void setItemOpenId(String itemOpenId) {
    this.itemOpenId = itemOpenId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner level(EnterpriseCommentListGetV10DataCommentListLevel level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentListGetV10DataCommentListLevel getLevel() {
    return level;
  }


  public void setLevel(EnterpriseCommentListGetV10DataCommentListLevel level) {
    this.level = level;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner materialId(Long materialId) {
    
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


  public EnterpriseCommentListGetV10ResponseDataCommentListInner repliedCommentId(Long repliedCommentId) {
    
    this.repliedCommentId = repliedCommentId;
    return this;
  }

   /**
   * 
   * @return repliedCommentId
  **/
  @javax.annotation.Nullable
  public Long getRepliedCommentId() {
    return repliedCommentId;
  }


  public void setRepliedCommentId(Long repliedCommentId) {
    this.repliedCommentId = repliedCommentId;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner replyCount(Long replyCount) {
    
    this.replyCount = replyCount;
    return this;
  }

   /**
   * 
   * @return replyCount
  **/
  @javax.annotation.Nullable
  public Long getReplyCount() {
    return replyCount;
  }


  public void setReplyCount(Long replyCount) {
    this.replyCount = replyCount;
  }


  public EnterpriseCommentListGetV10ResponseDataCommentListInner source(EnterpriseCommentListGetV10DataCommentListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentListGetV10DataCommentListSource getSource() {
    return source;
  }


  public void setSource(EnterpriseCommentListGetV10DataCommentListSource source) {
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
    EnterpriseCommentListGetV10ResponseDataCommentListInner enterpriseCommentListGetV10ResponseDataCommentListInner = (EnterpriseCommentListGetV10ResponseDataCommentListInner) o;
    return Objects.equals(this.adId, enterpriseCommentListGetV10ResponseDataCommentListInner.adId) &&
        Objects.equals(this.advertiserId, enterpriseCommentListGetV10ResponseDataCommentListInner.advertiserId) &&
        Objects.equals(this.campaignId, enterpriseCommentListGetV10ResponseDataCommentListInner.campaignId) &&
        Objects.equals(this.commentAwemeName, enterpriseCommentListGetV10ResponseDataCommentListInner.commentAwemeName) &&
        Objects.equals(this.commentId, enterpriseCommentListGetV10ResponseDataCommentListInner.commentId) &&
        Objects.equals(this.commentImage, enterpriseCommentListGetV10ResponseDataCommentListInner.commentImage) &&
        Objects.equals(this.commentOpenId, enterpriseCommentListGetV10ResponseDataCommentListInner.commentOpenId) &&
        Objects.equals(this.commentText, enterpriseCommentListGetV10ResponseDataCommentListInner.commentText) &&
        Objects.equals(this.createTime, enterpriseCommentListGetV10ResponseDataCommentListInner.createTime) &&
        Objects.equals(this.creativeId, enterpriseCommentListGetV10ResponseDataCommentListInner.creativeId) &&
        Objects.equals(this.diggCount, enterpriseCommentListGetV10ResponseDataCommentListInner.diggCount) &&
        Objects.equals(this.isBannedUser, enterpriseCommentListGetV10ResponseDataCommentListInner.isBannedUser) &&
        Objects.equals(this.isStick, enterpriseCommentListGetV10ResponseDataCommentListInner.isStick) &&
        Objects.equals(this.itemAwemeName, enterpriseCommentListGetV10ResponseDataCommentListInner.itemAwemeName) &&
        Objects.equals(this.itemId, enterpriseCommentListGetV10ResponseDataCommentListInner.itemId) &&
        Objects.equals(this.itemOpenId, enterpriseCommentListGetV10ResponseDataCommentListInner.itemOpenId) &&
        Objects.equals(this.level, enterpriseCommentListGetV10ResponseDataCommentListInner.level) &&
        Objects.equals(this.materialId, enterpriseCommentListGetV10ResponseDataCommentListInner.materialId) &&
        Objects.equals(this.repliedCommentId, enterpriseCommentListGetV10ResponseDataCommentListInner.repliedCommentId) &&
        Objects.equals(this.replyCount, enterpriseCommentListGetV10ResponseDataCommentListInner.replyCount) &&
        Objects.equals(this.source, enterpriseCommentListGetV10ResponseDataCommentListInner.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, campaignId, commentAwemeName, commentId, commentImage, commentOpenId, commentText, createTime, creativeId, diggCount, isBannedUser, isStick, itemAwemeName, itemId, itemOpenId, level, materialId, repliedCommentId, replyCount, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentListGetV10ResponseDataCommentListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    commentAwemeName: ").append(toIndentedString(commentAwemeName)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentImage: ").append(toIndentedString(commentImage)).append("\n");
    sb.append("    commentOpenId: ").append(toIndentedString(commentOpenId)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    diggCount: ").append(toIndentedString(diggCount)).append("\n");
    sb.append("    isBannedUser: ").append(toIndentedString(isBannedUser)).append("\n");
    sb.append("    isStick: ").append(toIndentedString(isStick)).append("\n");
    sb.append("    itemAwemeName: ").append(toIndentedString(itemAwemeName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemOpenId: ").append(toIndentedString(itemOpenId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    repliedCommentId: ").append(toIndentedString(repliedCommentId)).append("\n");
    sb.append("    replyCount: ").append(toIndentedString(replyCount)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("campaign_id");
    openapiFields.add("comment_aweme_name");
    openapiFields.add("comment_id");
    openapiFields.add("comment_image");
    openapiFields.add("comment_open_id");
    openapiFields.add("comment_text");
    openapiFields.add("create_time");
    openapiFields.add("creative_id");
    openapiFields.add("digg_count");
    openapiFields.add("is_banned_user");
    openapiFields.add("is_stick");
    openapiFields.add("item_aweme_name");
    openapiFields.add("item_id");
    openapiFields.add("item_open_id");
    openapiFields.add("level");
    openapiFields.add("material_id");
    openapiFields.add("replied_comment_id");
    openapiFields.add("reply_count");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentListGetV10ResponseDataCommentListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentListGetV10ResponseDataCommentListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentListGetV10ResponseDataCommentListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentListGetV10ResponseDataCommentListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentListGetV10ResponseDataCommentListInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentListGetV10ResponseDataCommentListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentListGetV10ResponseDataCommentListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentListGetV10ResponseDataCommentListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentListGetV10ResponseDataCommentListInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentListGetV10ResponseDataCommentListInner
  */
  public static EnterpriseCommentListGetV10ResponseDataCommentListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentListGetV10ResponseDataCommentListInner.class);
  }

 /**
  * Convert an instance of EnterpriseCommentListGetV10ResponseDataCommentListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

