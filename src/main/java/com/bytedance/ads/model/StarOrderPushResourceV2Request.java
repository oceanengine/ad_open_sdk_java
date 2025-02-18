/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * StarOrderPushResourceV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarOrderPushResourceV2Request {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PUSH_ACCOUNT_IDS = "push_account_ids";
  @SerializedName(SERIALIZED_NAME_PUSH_ACCOUNT_IDS)
  private List<Long> pushAccountIds = null;

  public static final String SERIALIZED_NAME_PUSH_PLATFORM = "push_platform";
  @SerializedName(SERIALIZED_NAME_PUSH_PLATFORM)
  private Long pushPlatform = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarOrderPushResourceV2Request() {
  }

  public StarOrderPushResourceV2Request orderId(Long orderId) {
    
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


  public StarOrderPushResourceV2Request pushAccountIds(List<Long> pushAccountIds) {
    
    this.pushAccountIds = pushAccountIds;
    return this;
  }

  public StarOrderPushResourceV2Request addPushAccountIdsItem(Long pushAccountIdsItem) {
    if (this.pushAccountIds == null) {
      this.pushAccountIds = new ArrayList<>();
    }
    this.pushAccountIds.add(pushAccountIdsItem);
    return this;
  }

   /**
   * 推送账户ID
   * @return pushAccountIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPushAccountIds() {
    return pushAccountIds;
  }


  public void setPushAccountIds(List<Long> pushAccountIds) {
    this.pushAccountIds = pushAccountIds;
  }


  public StarOrderPushResourceV2Request pushPlatform(Long pushPlatform) {
    
    this.pushPlatform = pushPlatform;
    return this;
  }

   /**
   * 推送目标平台 仅限以下 (1)：巨量引擎
   * @return pushPlatform
  **/
  @javax.annotation.Nullable
  public Long getPushPlatform() {
    return pushPlatform;
  }


  public void setPushPlatform(Long pushPlatform) {
    this.pushPlatform = pushPlatform;
  }


  public StarOrderPushResourceV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 星图客户ID
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderPushResourceV2Request starOrderPushResourceV2Request = (StarOrderPushResourceV2Request) o;
    return Objects.equals(this.orderId, starOrderPushResourceV2Request.orderId) &&
        Objects.equals(this.pushAccountIds, starOrderPushResourceV2Request.pushAccountIds) &&
        Objects.equals(this.pushPlatform, starOrderPushResourceV2Request.pushPlatform) &&
        Objects.equals(this.starId, starOrderPushResourceV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, pushAccountIds, pushPlatform, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarOrderPushResourceV2Request {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    pushAccountIds: ").append(toIndentedString(pushAccountIds)).append("\n");
    sb.append("    pushPlatform: ").append(toIndentedString(pushPlatform)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("push_account_ids");
    openapiFields.add("push_platform");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("push_account_ids");
    openapiRequiredFields.add("push_platform");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderPushResourceV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderPushResourceV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderPushResourceV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderPushResourceV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderPushResourceV2Request>() {
           @Override
           public void write(JsonWriter out, StarOrderPushResourceV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderPushResourceV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderPushResourceV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderPushResourceV2Request
  * @throws IOException if the JSON string is invalid with respect to StarOrderPushResourceV2Request
  */
  public static StarOrderPushResourceV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderPushResourceV2Request.class);
  }

 /**
  * Convert an instance of StarOrderPushResourceV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

