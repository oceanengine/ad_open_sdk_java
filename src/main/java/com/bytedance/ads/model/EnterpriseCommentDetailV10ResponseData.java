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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EnterpriseCommentDetailV10ResponseData {
  public static final String SERIALIZED_NAME_ITEM_COVER_URL = "item_cover_url";
  @SerializedName(SERIALIZED_NAME_ITEM_COVER_URL)
  private String itemCoverUrl = null;

  public static final String SERIALIZED_NAME_ITEM_CREATE_TIME = "item_create_time";
  @SerializedName(SERIALIZED_NAME_ITEM_CREATE_TIME)
  private String itemCreateTime = null;

  public static final String SERIALIZED_NAME_ITEM_DIGG_COUNT = "item_digg_count";
  @SerializedName(SERIALIZED_NAME_ITEM_DIGG_COUNT)
  private Long itemDiggCount = null;

  public static final String SERIALIZED_NAME_ITEM_DURATION = "item_duration";
  @SerializedName(SERIALIZED_NAME_ITEM_DURATION)
  private Long itemDuration = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ITEM_TITLE = "item_title";
  @SerializedName(SERIALIZED_NAME_ITEM_TITLE)
  private String itemTitle = null;

  public static final String SERIALIZED_NAME_REPLIED_COMMENT_CREATE_TIME = "replied_comment_create_time";
  @SerializedName(SERIALIZED_NAME_REPLIED_COMMENT_CREATE_TIME)
  private String repliedCommentCreateTime = null;

  public static final String SERIALIZED_NAME_REPLIED_COMMENT_ID = "replied_comment_id";
  @SerializedName(SERIALIZED_NAME_REPLIED_COMMENT_ID)
  private Long repliedCommentId = null;

  public static final String SERIALIZED_NAME_REPLIED_COMMENT_IMAGE = "replied_comment_image";
  @SerializedName(SERIALIZED_NAME_REPLIED_COMMENT_IMAGE)
  private List<String> repliedCommentImage = null;

  public static final String SERIALIZED_NAME_REPLIED_COMMENT_TEXT = "replied_comment_text";
  @SerializedName(SERIALIZED_NAME_REPLIED_COMMENT_TEXT)
  private String repliedCommentText = null;

  public static final String SERIALIZED_NAME_REPLIED_OPEN_ID = "replied_open_id";
  @SerializedName(SERIALIZED_NAME_REPLIED_OPEN_ID)
  private String repliedOpenId = null;

  public EnterpriseCommentDetailV10ResponseData() {
  }

  public EnterpriseCommentDetailV10ResponseData itemCoverUrl(String itemCoverUrl) {
    
    this.itemCoverUrl = itemCoverUrl;
    return this;
  }

   /**
   * 
   * @return itemCoverUrl
  **/
  @javax.annotation.Nullable
  public String getItemCoverUrl() {
    return itemCoverUrl;
  }


  public void setItemCoverUrl(String itemCoverUrl) {
    this.itemCoverUrl = itemCoverUrl;
  }


  public EnterpriseCommentDetailV10ResponseData itemCreateTime(String itemCreateTime) {
    
    this.itemCreateTime = itemCreateTime;
    return this;
  }

   /**
   * 
   * @return itemCreateTime
  **/
  @javax.annotation.Nullable
  public String getItemCreateTime() {
    return itemCreateTime;
  }


  public void setItemCreateTime(String itemCreateTime) {
    this.itemCreateTime = itemCreateTime;
  }


  public EnterpriseCommentDetailV10ResponseData itemDiggCount(Long itemDiggCount) {
    
    this.itemDiggCount = itemDiggCount;
    return this;
  }

   /**
   * 
   * @return itemDiggCount
  **/
  @javax.annotation.Nullable
  public Long getItemDiggCount() {
    return itemDiggCount;
  }


  public void setItemDiggCount(Long itemDiggCount) {
    this.itemDiggCount = itemDiggCount;
  }


  public EnterpriseCommentDetailV10ResponseData itemDuration(Long itemDuration) {
    
    this.itemDuration = itemDuration;
    return this;
  }

   /**
   * 
   * @return itemDuration
  **/
  @javax.annotation.Nullable
  public Long getItemDuration() {
    return itemDuration;
  }


  public void setItemDuration(Long itemDuration) {
    this.itemDuration = itemDuration;
  }


  public EnterpriseCommentDetailV10ResponseData itemId(Long itemId) {
    
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


  public EnterpriseCommentDetailV10ResponseData itemTitle(String itemTitle) {
    
    this.itemTitle = itemTitle;
    return this;
  }

   /**
   * 
   * @return itemTitle
  **/
  @javax.annotation.Nullable
  public String getItemTitle() {
    return itemTitle;
  }


  public void setItemTitle(String itemTitle) {
    this.itemTitle = itemTitle;
  }


  public EnterpriseCommentDetailV10ResponseData repliedCommentCreateTime(String repliedCommentCreateTime) {
    
    this.repliedCommentCreateTime = repliedCommentCreateTime;
    return this;
  }

   /**
   * 
   * @return repliedCommentCreateTime
  **/
  @javax.annotation.Nullable
  public String getRepliedCommentCreateTime() {
    return repliedCommentCreateTime;
  }


  public void setRepliedCommentCreateTime(String repliedCommentCreateTime) {
    this.repliedCommentCreateTime = repliedCommentCreateTime;
  }


  public EnterpriseCommentDetailV10ResponseData repliedCommentId(Long repliedCommentId) {
    
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


  public EnterpriseCommentDetailV10ResponseData repliedCommentImage(List<String> repliedCommentImage) {
    
    this.repliedCommentImage = repliedCommentImage;
    return this;
  }

  public EnterpriseCommentDetailV10ResponseData addRepliedCommentImageItem(String repliedCommentImageItem) {
    if (this.repliedCommentImage == null) {
      this.repliedCommentImage = new ArrayList<>();
    }
    this.repliedCommentImage.add(repliedCommentImageItem);
    return this;
  }

   /**
   * 
   * @return repliedCommentImage
  **/
  @javax.annotation.Nullable
  public List<String> getRepliedCommentImage() {
    return repliedCommentImage;
  }


  public void setRepliedCommentImage(List<String> repliedCommentImage) {
    this.repliedCommentImage = repliedCommentImage;
  }


  public EnterpriseCommentDetailV10ResponseData repliedCommentText(String repliedCommentText) {
    
    this.repliedCommentText = repliedCommentText;
    return this;
  }

   /**
   * 
   * @return repliedCommentText
  **/
  @javax.annotation.Nullable
  public String getRepliedCommentText() {
    return repliedCommentText;
  }


  public void setRepliedCommentText(String repliedCommentText) {
    this.repliedCommentText = repliedCommentText;
  }


  public EnterpriseCommentDetailV10ResponseData repliedOpenId(String repliedOpenId) {
    
    this.repliedOpenId = repliedOpenId;
    return this;
  }

   /**
   * 
   * @return repliedOpenId
  **/
  @javax.annotation.Nullable
  public String getRepliedOpenId() {
    return repliedOpenId;
  }


  public void setRepliedOpenId(String repliedOpenId) {
    this.repliedOpenId = repliedOpenId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseCommentDetailV10ResponseData enterpriseCommentDetailV10ResponseData = (EnterpriseCommentDetailV10ResponseData) o;
    return Objects.equals(this.itemCoverUrl, enterpriseCommentDetailV10ResponseData.itemCoverUrl) &&
        Objects.equals(this.itemCreateTime, enterpriseCommentDetailV10ResponseData.itemCreateTime) &&
        Objects.equals(this.itemDiggCount, enterpriseCommentDetailV10ResponseData.itemDiggCount) &&
        Objects.equals(this.itemDuration, enterpriseCommentDetailV10ResponseData.itemDuration) &&
        Objects.equals(this.itemId, enterpriseCommentDetailV10ResponseData.itemId) &&
        Objects.equals(this.itemTitle, enterpriseCommentDetailV10ResponseData.itemTitle) &&
        Objects.equals(this.repliedCommentCreateTime, enterpriseCommentDetailV10ResponseData.repliedCommentCreateTime) &&
        Objects.equals(this.repliedCommentId, enterpriseCommentDetailV10ResponseData.repliedCommentId) &&
        Objects.equals(this.repliedCommentImage, enterpriseCommentDetailV10ResponseData.repliedCommentImage) &&
        Objects.equals(this.repliedCommentText, enterpriseCommentDetailV10ResponseData.repliedCommentText) &&
        Objects.equals(this.repliedOpenId, enterpriseCommentDetailV10ResponseData.repliedOpenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemCoverUrl, itemCreateTime, itemDiggCount, itemDuration, itemId, itemTitle, repliedCommentCreateTime, repliedCommentId, repliedCommentImage, repliedCommentText, repliedOpenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentDetailV10ResponseData {\n");
    sb.append("    itemCoverUrl: ").append(toIndentedString(itemCoverUrl)).append("\n");
    sb.append("    itemCreateTime: ").append(toIndentedString(itemCreateTime)).append("\n");
    sb.append("    itemDiggCount: ").append(toIndentedString(itemDiggCount)).append("\n");
    sb.append("    itemDuration: ").append(toIndentedString(itemDuration)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemTitle: ").append(toIndentedString(itemTitle)).append("\n");
    sb.append("    repliedCommentCreateTime: ").append(toIndentedString(repliedCommentCreateTime)).append("\n");
    sb.append("    repliedCommentId: ").append(toIndentedString(repliedCommentId)).append("\n");
    sb.append("    repliedCommentImage: ").append(toIndentedString(repliedCommentImage)).append("\n");
    sb.append("    repliedCommentText: ").append(toIndentedString(repliedCommentText)).append("\n");
    sb.append("    repliedOpenId: ").append(toIndentedString(repliedOpenId)).append("\n");
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
    openapiFields.add("item_cover_url");
    openapiFields.add("item_create_time");
    openapiFields.add("item_digg_count");
    openapiFields.add("item_duration");
    openapiFields.add("item_id");
    openapiFields.add("item_title");
    openapiFields.add("replied_comment_create_time");
    openapiFields.add("replied_comment_id");
    openapiFields.add("replied_comment_image");
    openapiFields.add("replied_comment_text");
    openapiFields.add("replied_open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentDetailV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentDetailV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentDetailV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentDetailV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentDetailV10ResponseData>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentDetailV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentDetailV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentDetailV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentDetailV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentDetailV10ResponseData
  */
  public static EnterpriseCommentDetailV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentDetailV10ResponseData.class);
  }

 /**
  * Convert an instance of EnterpriseCommentDetailV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

