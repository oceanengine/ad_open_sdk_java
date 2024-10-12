/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalFileVideoAwemeGetV30FilteringAnchorInfo;
import com.bytedance.ads.model.LocalFileVideoAwemeGetV30FilteringItemStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class LocalFileVideoAwemeGetV30Filtering {
  public static final String SERIALIZED_NAME_ANCHOR_INFO = "anchor_info";
  @SerializedName(SERIALIZED_NAME_ANCHOR_INFO)
  private LocalFileVideoAwemeGetV30FilteringAnchorInfo anchorInfo = null;

  public static final String SERIALIZED_NAME_AWEME_IDS = "aweme_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_IDS)
  private List<String> awemeIds = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Long> itemIds = null;

  public static final String SERIALIZED_NAME_ITEM_STATUS = "item_status";
  @SerializedName(SERIALIZED_NAME_ITEM_STATUS)
  private LocalFileVideoAwemeGetV30FilteringItemStatus itemStatus = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public LocalFileVideoAwemeGetV30Filtering() {
  }

  public LocalFileVideoAwemeGetV30Filtering anchorInfo(LocalFileVideoAwemeGetV30FilteringAnchorInfo anchorInfo) {
    
    this.anchorInfo = anchorInfo;
    return this;
  }

   /**
   * Get anchorInfo
   * @return anchorInfo
  **/
  @javax.annotation.Nonnull
  public LocalFileVideoAwemeGetV30FilteringAnchorInfo getAnchorInfo() {
    return anchorInfo;
  }


  public void setAnchorInfo(LocalFileVideoAwemeGetV30FilteringAnchorInfo anchorInfo) {
    this.anchorInfo = anchorInfo;
  }


  public LocalFileVideoAwemeGetV30Filtering awemeIds(List<String> awemeIds) {
    
    this.awemeIds = awemeIds;
    return this;
  }

  public LocalFileVideoAwemeGetV30Filtering addAwemeIdsItem(String awemeIdsItem) {
    if (this.awemeIds == null) {
      this.awemeIds = new ArrayList<>();
    }
    this.awemeIds.add(awemeIdsItem);
    return this;
  }

   /**
   * 抖音号ids筛选,当筛选anchor_types&#x3D;All不限的时候必传
   * @return awemeIds
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeIds() {
    return awemeIds;
  }


  public void setAwemeIds(List<String> awemeIds) {
    this.awemeIds = awemeIds;
  }


  public LocalFileVideoAwemeGetV30Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 根据视频发布时间进行过滤的截止时间，与start_time搭配使用，格式：\&quot;yyyy-MM-dd HH:mm:ss\&quot;
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public LocalFileVideoAwemeGetV30Filtering itemIds(List<Long> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public LocalFileVideoAwemeGetV30Filtering addItemIdsItem(Long itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 主页视频ids筛选，一次最大长度：10
   * @return itemIds
  **/
  @javax.annotation.Nullable
  public List<Long> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
  }


  public LocalFileVideoAwemeGetV30Filtering itemStatus(LocalFileVideoAwemeGetV30FilteringItemStatus itemStatus) {
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * Get itemStatus
   * @return itemStatus
  **/
  @javax.annotation.Nullable
  public LocalFileVideoAwemeGetV30FilteringItemStatus getItemStatus() {
    return itemStatus;
  }


  public void setItemStatus(LocalFileVideoAwemeGetV30FilteringItemStatus itemStatus) {
    this.itemStatus = itemStatus;
  }


  public LocalFileVideoAwemeGetV30Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 根据视频发布时间进行过滤的起始时间，与end_time搭配使用，格式：\&quot;yyyy-MM-dd HH:mm:ss\&quot;
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalFileVideoAwemeGetV30Filtering localFileVideoAwemeGetV30Filtering = (LocalFileVideoAwemeGetV30Filtering) o;
    return Objects.equals(this.anchorInfo, localFileVideoAwemeGetV30Filtering.anchorInfo) &&
        Objects.equals(this.awemeIds, localFileVideoAwemeGetV30Filtering.awemeIds) &&
        Objects.equals(this.endTime, localFileVideoAwemeGetV30Filtering.endTime) &&
        Objects.equals(this.itemIds, localFileVideoAwemeGetV30Filtering.itemIds) &&
        Objects.equals(this.itemStatus, localFileVideoAwemeGetV30Filtering.itemStatus) &&
        Objects.equals(this.startTime, localFileVideoAwemeGetV30Filtering.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorInfo, awemeIds, endTime, itemIds, itemStatus, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalFileVideoAwemeGetV30Filtering {\n");
    sb.append("    anchorInfo: ").append(toIndentedString(anchorInfo)).append("\n");
    sb.append("    awemeIds: ").append(toIndentedString(awemeIds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("anchor_info");
    openapiFields.add("aweme_ids");
    openapiFields.add("end_time");
    openapiFields.add("item_ids");
    openapiFields.add("item_status");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("anchor_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoAwemeGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoAwemeGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoAwemeGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoAwemeGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoAwemeGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoAwemeGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoAwemeGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoAwemeGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoAwemeGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoAwemeGetV30Filtering
  */
  public static LocalFileVideoAwemeGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoAwemeGetV30Filtering.class);
  }

 /**
  * Convert an instance of LocalFileVideoAwemeGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

