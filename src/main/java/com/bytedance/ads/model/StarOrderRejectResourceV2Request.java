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
 * StarOrderRejectResourceV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class StarOrderRejectResourceV2Request {
  public static final String SERIALIZED_NAME_FEEDBACK_CONTENT = "feedback_content";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_CONTENT)
  private String feedbackContent = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId = null;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private Long resourceType = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarOrderRejectResourceV2Request() {
  }

  public StarOrderRejectResourceV2Request feedbackContent(String feedbackContent) {
    
    this.feedbackContent = feedbackContent;
    return this;
  }

   /**
   * 反馈信息 100字内
   * @return feedbackContent
  **/
  @javax.annotation.Nullable
  public String getFeedbackContent() {
    return feedbackContent;
  }


  public void setFeedbackContent(String feedbackContent) {
    this.feedbackContent = feedbackContent;
  }


  public StarOrderRejectResourceV2Request orderId(Long orderId) {
    
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


  public StarOrderRejectResourceV2Request resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * 产出物ID
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public Long getResourceId() {
    return resourceId;
  }


  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }


  public StarOrderRejectResourceV2Request resourceType(Long resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * 产出物类型 仅限以下 (2)：脚本 (3)：视频
   * @return resourceType
  **/
  @javax.annotation.Nullable
  public Long getResourceType() {
    return resourceType;
  }


  public void setResourceType(Long resourceType) {
    this.resourceType = resourceType;
  }


  public StarOrderRejectResourceV2Request starId(Long starId) {
    
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
    StarOrderRejectResourceV2Request starOrderRejectResourceV2Request = (StarOrderRejectResourceV2Request) o;
    return Objects.equals(this.feedbackContent, starOrderRejectResourceV2Request.feedbackContent) &&
        Objects.equals(this.orderId, starOrderRejectResourceV2Request.orderId) &&
        Objects.equals(this.resourceId, starOrderRejectResourceV2Request.resourceId) &&
        Objects.equals(this.resourceType, starOrderRejectResourceV2Request.resourceType) &&
        Objects.equals(this.starId, starOrderRejectResourceV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackContent, orderId, resourceId, resourceType, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarOrderRejectResourceV2Request {\n");
    sb.append("    feedbackContent: ").append(toIndentedString(feedbackContent)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
    openapiFields.add("feedback_content");
    openapiFields.add("order_id");
    openapiFields.add("resource_id");
    openapiFields.add("resource_type");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("feedback_content");
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("resource_id");
    openapiRequiredFields.add("resource_type");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderRejectResourceV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderRejectResourceV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderRejectResourceV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderRejectResourceV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderRejectResourceV2Request>() {
           @Override
           public void write(JsonWriter out, StarOrderRejectResourceV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderRejectResourceV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderRejectResourceV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderRejectResourceV2Request
  * @throws IOException if the JSON string is invalid with respect to StarOrderRejectResourceV2Request
  */
  public static StarOrderRejectResourceV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderRejectResourceV2Request.class);
  }

 /**
  * Convert an instance of StarOrderRejectResourceV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

