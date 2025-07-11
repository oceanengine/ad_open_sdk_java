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
import com.bytedance.ads.model.EnterpriseItemListV10DataItemListItemType;
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
 * EnterpriseItemListV10ResponseDataItemListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EnterpriseItemListV10ResponseDataItemListInner {
  public static final String SERIALIZED_NAME_COMMENT_COUNT = "comment_count";
  @SerializedName(SERIALIZED_NAME_COMMENT_COUNT)
  private String commentCount = null;

  public static final String SERIALIZED_NAME_ITEM_COVER_URL = "item_cover_url";
  @SerializedName(SERIALIZED_NAME_ITEM_COVER_URL)
  private String itemCoverUrl = null;

  public static final String SERIALIZED_NAME_ITEM_CREATE_TIME = "item_create_time";
  @SerializedName(SERIALIZED_NAME_ITEM_CREATE_TIME)
  private String itemCreateTime = null;

  public static final String SERIALIZED_NAME_ITEM_DURATION = "item_duration";
  @SerializedName(SERIALIZED_NAME_ITEM_DURATION)
  private Long itemDuration = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ITEM_TITLE = "item_title";
  @SerializedName(SERIALIZED_NAME_ITEM_TITLE)
  private String itemTitle = null;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private EnterpriseItemListV10DataItemListItemType itemType = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public EnterpriseItemListV10ResponseDataItemListInner() {
  }

  public EnterpriseItemListV10ResponseDataItemListInner commentCount(String commentCount) {
    
    this.commentCount = commentCount;
    return this;
  }

   /**
   * 
   * @return commentCount
  **/
  @javax.annotation.Nullable
  public String getCommentCount() {
    return commentCount;
  }


  public void setCommentCount(String commentCount) {
    this.commentCount = commentCount;
  }


  public EnterpriseItemListV10ResponseDataItemListInner itemCoverUrl(String itemCoverUrl) {
    
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


  public EnterpriseItemListV10ResponseDataItemListInner itemCreateTime(String itemCreateTime) {
    
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


  public EnterpriseItemListV10ResponseDataItemListInner itemDuration(Long itemDuration) {
    
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


  public EnterpriseItemListV10ResponseDataItemListInner itemId(Long itemId) {
    
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


  public EnterpriseItemListV10ResponseDataItemListInner itemTitle(String itemTitle) {
    
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


  public EnterpriseItemListV10ResponseDataItemListInner itemType(EnterpriseItemListV10DataItemListItemType itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  public EnterpriseItemListV10DataItemListItemType getItemType() {
    return itemType;
  }


  public void setItemType(EnterpriseItemListV10DataItemListItemType itemType) {
    this.itemType = itemType;
  }


  public EnterpriseItemListV10ResponseDataItemListInner materialId(Long materialId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseItemListV10ResponseDataItemListInner enterpriseItemListV10ResponseDataItemListInner = (EnterpriseItemListV10ResponseDataItemListInner) o;
    return Objects.equals(this.commentCount, enterpriseItemListV10ResponseDataItemListInner.commentCount) &&
        Objects.equals(this.itemCoverUrl, enterpriseItemListV10ResponseDataItemListInner.itemCoverUrl) &&
        Objects.equals(this.itemCreateTime, enterpriseItemListV10ResponseDataItemListInner.itemCreateTime) &&
        Objects.equals(this.itemDuration, enterpriseItemListV10ResponseDataItemListInner.itemDuration) &&
        Objects.equals(this.itemId, enterpriseItemListV10ResponseDataItemListInner.itemId) &&
        Objects.equals(this.itemTitle, enterpriseItemListV10ResponseDataItemListInner.itemTitle) &&
        Objects.equals(this.itemType, enterpriseItemListV10ResponseDataItemListInner.itemType) &&
        Objects.equals(this.materialId, enterpriseItemListV10ResponseDataItemListInner.materialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentCount, itemCoverUrl, itemCreateTime, itemDuration, itemId, itemTitle, itemType, materialId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseItemListV10ResponseDataItemListInner {\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    itemCoverUrl: ").append(toIndentedString(itemCoverUrl)).append("\n");
    sb.append("    itemCreateTime: ").append(toIndentedString(itemCreateTime)).append("\n");
    sb.append("    itemDuration: ").append(toIndentedString(itemDuration)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemTitle: ").append(toIndentedString(itemTitle)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("comment_count");
    openapiFields.add("item_cover_url");
    openapiFields.add("item_create_time");
    openapiFields.add("item_duration");
    openapiFields.add("item_id");
    openapiFields.add("item_title");
    openapiFields.add("item_type");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseItemListV10ResponseDataItemListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseItemListV10ResponseDataItemListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseItemListV10ResponseDataItemListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseItemListV10ResponseDataItemListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseItemListV10ResponseDataItemListInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseItemListV10ResponseDataItemListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseItemListV10ResponseDataItemListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseItemListV10ResponseDataItemListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseItemListV10ResponseDataItemListInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseItemListV10ResponseDataItemListInner
  */
  public static EnterpriseItemListV10ResponseDataItemListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseItemListV10ResponseDataItemListInner.class);
  }

 /**
  * Convert an instance of EnterpriseItemListV10ResponseDataItemListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

