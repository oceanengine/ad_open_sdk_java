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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ClueWechatDataGetV2ResponseDataData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel = null;

  public static final String SERIALIZED_NAME_CLICK_ID = "click_id";
  @SerializedName(SERIALIZED_NAME_CLICK_ID)
  private String clickId = null;

  public static final String SERIALIZED_NAME_CONVERT_TIME = "convert_time";
  @SerializedName(SERIALIZED_NAME_CONVERT_TIME)
  private String convertTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_FOLLOW_USER_IDS = "follow_user_ids";
  @SerializedName(SERIALIZED_NAME_FOLLOW_USER_IDS)
  private List<String> followUserIds = null;

  public static final String SERIALIZED_NAME_WECHAT_USER_NAME = "wechat_user_name";
  @SerializedName(SERIALIZED_NAME_WECHAT_USER_NAME)
  private String wechatUserName = null;

  public ClueWechatDataGetV2ResponseDataData() {
  }

  public ClueWechatDataGetV2ResponseDataData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划id
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ClueWechatDataGetV2ResponseDataData channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * 渠道来源
   * @return channel
  **/
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public ClueWechatDataGetV2ResponseDataData clickId(String clickId) {
    
    this.clickId = clickId;
    return this;
  }

   /**
   * 
   * @return clickId
  **/
  @javax.annotation.Nullable
  public String getClickId() {
    return clickId;
  }


  public void setClickId(String clickId) {
    this.clickId = clickId;
  }


  public ClueWechatDataGetV2ResponseDataData convertTime(String convertTime) {
    
    this.convertTime = convertTime;
    return this;
  }

   /**
   * 转化时间，格式\&quot;YYYY-MM-DD hh:mm:ss\&quot;
   * @return convertTime
  **/
  @javax.annotation.Nullable
  public String getConvertTime() {
    return convertTime;
  }


  public void setConvertTime(String convertTime) {
    this.convertTime = convertTime;
  }


  public ClueWechatDataGetV2ResponseDataData creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 创意id
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public ClueWechatDataGetV2ResponseDataData followUserIds(List<String> followUserIds) {
    
    this.followUserIds = followUserIds;
    return this;
  }

  public ClueWechatDataGetV2ResponseDataData addFollowUserIdsItem(String followUserIdsItem) {
    if (this.followUserIds == null) {
      this.followUserIds = new ArrayList<>();
    }
    this.followUserIds.add(followUserIdsItem);
    return this;
  }

   /**
   * 销售人员id
   * @return followUserIds
  **/
  @javax.annotation.Nullable
  public List<String> getFollowUserIds() {
    return followUserIds;
  }


  public void setFollowUserIds(List<String> followUserIds) {
    this.followUserIds = followUserIds;
  }


  public ClueWechatDataGetV2ResponseDataData wechatUserName(String wechatUserName) {
    
    this.wechatUserName = wechatUserName;
    return this;
  }

   /**
   * 加粉用户好友昵称
   * @return wechatUserName
  **/
  @javax.annotation.Nullable
  public String getWechatUserName() {
    return wechatUserName;
  }


  public void setWechatUserName(String wechatUserName) {
    this.wechatUserName = wechatUserName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatDataGetV2ResponseDataData clueWechatDataGetV2ResponseDataData = (ClueWechatDataGetV2ResponseDataData) o;
    return Objects.equals(this.adId, clueWechatDataGetV2ResponseDataData.adId) &&
        Objects.equals(this.channel, clueWechatDataGetV2ResponseDataData.channel) &&
        Objects.equals(this.clickId, clueWechatDataGetV2ResponseDataData.clickId) &&
        Objects.equals(this.convertTime, clueWechatDataGetV2ResponseDataData.convertTime) &&
        Objects.equals(this.creativeId, clueWechatDataGetV2ResponseDataData.creativeId) &&
        Objects.equals(this.followUserIds, clueWechatDataGetV2ResponseDataData.followUserIds) &&
        Objects.equals(this.wechatUserName, clueWechatDataGetV2ResponseDataData.wechatUserName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, channel, clickId, convertTime, creativeId, followUserIds, wechatUserName);
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
    sb.append("class ClueWechatDataGetV2ResponseDataData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    clickId: ").append(toIndentedString(clickId)).append("\n");
    sb.append("    convertTime: ").append(toIndentedString(convertTime)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    followUserIds: ").append(toIndentedString(followUserIds)).append("\n");
    sb.append("    wechatUserName: ").append(toIndentedString(wechatUserName)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("click_id");
    openapiFields.add("convert_time");
    openapiFields.add("creative_id");
    openapiFields.add("follow_user_ids");
    openapiFields.add("wechat_user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatDataGetV2ResponseDataData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatDataGetV2ResponseDataData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatDataGetV2ResponseDataData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatDataGetV2ResponseDataData.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatDataGetV2ResponseDataData>() {
           @Override
           public void write(JsonWriter out, ClueWechatDataGetV2ResponseDataData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatDataGetV2ResponseDataData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatDataGetV2ResponseDataData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatDataGetV2ResponseDataData
  * @throws IOException if the JSON string is invalid with respect to ClueWechatDataGetV2ResponseDataData
  */
  public static ClueWechatDataGetV2ResponseDataData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatDataGetV2ResponseDataData.class);
  }

 /**
  * Convert an instance of ClueWechatDataGetV2ResponseDataData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

