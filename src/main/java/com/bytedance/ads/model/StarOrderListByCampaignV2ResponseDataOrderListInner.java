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
 * StarOrderListByCampaignV2ResponseDataOrderListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class StarOrderListByCampaignV2ResponseDataOrderListInner {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_AVATAR_URI = "avatar_uri";
  @SerializedName(SERIALIZED_NAME_AVATAR_URI)
  private String avatarUri = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private Long orderStatus = null;

  public StarOrderListByCampaignV2ResponseDataOrderListInner() {
  }

  public StarOrderListByCampaignV2ResponseDataOrderListInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 达人ID
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarOrderListByCampaignV2ResponseDataOrderListInner authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 达人昵称
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarOrderListByCampaignV2ResponseDataOrderListInner avatarUri(String avatarUri) {
    
    this.avatarUri = avatarUri;
    return this;
  }

   /**
   * 达人头像
   * @return avatarUri
  **/
  @javax.annotation.Nullable
  public String getAvatarUri() {
    return avatarUri;
  }


  public void setAvatarUri(String avatarUri) {
    this.avatarUri = avatarUri;
  }


  public StarOrderListByCampaignV2ResponseDataOrderListInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 需求ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public StarOrderListByCampaignV2ResponseDataOrderListInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 任务创建时间 unix timestamp
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarOrderListByCampaignV2ResponseDataOrderListInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 任务ID
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarOrderListByCampaignV2ResponseDataOrderListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 任务ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderListByCampaignV2ResponseDataOrderListInner orderStatus(Long orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * 任务状态 待接收 &#x3D; -1 达人已接单 &#x3D; 1 已关闭 &#x3D; 2 已完成 &#x3D; 3 已取消 &#x3D; 4 待付尾款 &#x3D; 10 脚本已上传 &#x3D; 41 脚本已拒绝 &#x3D; 42 脚本已确认 &#x3D; 43 脚本已跳过 &#x3D; 44 视频已上传 &#x3D; 51 视频已拒绝 &#x3D; 52 视频已确认 &#x3D; 53 视频已发布 &#x3D; 54
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  public Long getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(Long orderStatus) {
    this.orderStatus = orderStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderListByCampaignV2ResponseDataOrderListInner starOrderListByCampaignV2ResponseDataOrderListInner = (StarOrderListByCampaignV2ResponseDataOrderListInner) o;
    return Objects.equals(this.authorId, starOrderListByCampaignV2ResponseDataOrderListInner.authorId) &&
        Objects.equals(this.authorName, starOrderListByCampaignV2ResponseDataOrderListInner.authorName) &&
        Objects.equals(this.avatarUri, starOrderListByCampaignV2ResponseDataOrderListInner.avatarUri) &&
        Objects.equals(this.campaignId, starOrderListByCampaignV2ResponseDataOrderListInner.campaignId) &&
        Objects.equals(this.createTime, starOrderListByCampaignV2ResponseDataOrderListInner.createTime) &&
        Objects.equals(this.demandId, starOrderListByCampaignV2ResponseDataOrderListInner.demandId) &&
        Objects.equals(this.orderId, starOrderListByCampaignV2ResponseDataOrderListInner.orderId) &&
        Objects.equals(this.orderStatus, starOrderListByCampaignV2ResponseDataOrderListInner.orderStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorName, avatarUri, campaignId, createTime, demandId, orderId, orderStatus);
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
    sb.append("class StarOrderListByCampaignV2ResponseDataOrderListInner {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    avatarUri: ").append(toIndentedString(avatarUri)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("author_name");
    openapiFields.add("avatar_uri");
    openapiFields.add("campaign_id");
    openapiFields.add("create_time");
    openapiFields.add("demand_id");
    openapiFields.add("order_id");
    openapiFields.add("order_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderListByCampaignV2ResponseDataOrderListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderListByCampaignV2ResponseDataOrderListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderListByCampaignV2ResponseDataOrderListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderListByCampaignV2ResponseDataOrderListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderListByCampaignV2ResponseDataOrderListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderListByCampaignV2ResponseDataOrderListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderListByCampaignV2ResponseDataOrderListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderListByCampaignV2ResponseDataOrderListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderListByCampaignV2ResponseDataOrderListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderListByCampaignV2ResponseDataOrderListInner
  */
  public static StarOrderListByCampaignV2ResponseDataOrderListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderListByCampaignV2ResponseDataOrderListInner.class);
  }

 /**
  * Convert an instance of StarOrderListByCampaignV2ResponseDataOrderListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

