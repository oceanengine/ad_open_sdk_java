/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * StarOrderApproveResourceV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarOrderApproveResourceV2Request {
  public static final String SERIALIZED_NAME_AD_SYNC_DECISION = "ad_sync_decision";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_DECISION)
  private Long adSyncDecision = null;

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

  public StarOrderApproveResourceV2Request() {
  }

  public StarOrderApproveResourceV2Request adSyncDecision(Long adSyncDecision) {
    
    this.adSyncDecision = adSyncDecision;
    return this;
  }

   /**
   * 视频同步广告决策 不传或传0：判断所有审核结果，均通过时才可确认视频。 1：除内容审核外的审核渠道结果为不通过，可以用此参数放弃广告投放，继续发布视频。 2：除内容审核外的审核渠道结果为审核中，可以用此参数先行确认视频进行发布。若其他审核渠道结果为不通过，则无法进行广告投放。
   * @return adSyncDecision
  **/
  @javax.annotation.Nullable
  public Long getAdSyncDecision() {
    return adSyncDecision;
  }


  public void setAdSyncDecision(Long adSyncDecision) {
    this.adSyncDecision = adSyncDecision;
  }


  public StarOrderApproveResourceV2Request orderId(Long orderId) {
    
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


  public StarOrderApproveResourceV2Request resourceId(Long resourceId) {
    
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


  public StarOrderApproveResourceV2Request resourceType(Long resourceType) {
    
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


  public StarOrderApproveResourceV2Request starId(Long starId) {
    
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
    StarOrderApproveResourceV2Request starOrderApproveResourceV2Request = (StarOrderApproveResourceV2Request) o;
    return Objects.equals(this.adSyncDecision, starOrderApproveResourceV2Request.adSyncDecision) &&
        Objects.equals(this.orderId, starOrderApproveResourceV2Request.orderId) &&
        Objects.equals(this.resourceId, starOrderApproveResourceV2Request.resourceId) &&
        Objects.equals(this.resourceType, starOrderApproveResourceV2Request.resourceType) &&
        Objects.equals(this.starId, starOrderApproveResourceV2Request.starId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSyncDecision, orderId, resourceId, resourceType, starId);
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
    sb.append("class StarOrderApproveResourceV2Request {\n");
    sb.append("    adSyncDecision: ").append(toIndentedString(adSyncDecision)).append("\n");
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
    openapiFields.add("ad_sync_decision");
    openapiFields.add("order_id");
    openapiFields.add("resource_id");
    openapiFields.add("resource_type");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("resource_id");
    openapiRequiredFields.add("resource_type");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderApproveResourceV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderApproveResourceV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderApproveResourceV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderApproveResourceV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderApproveResourceV2Request>() {
           @Override
           public void write(JsonWriter out, StarOrderApproveResourceV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderApproveResourceV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderApproveResourceV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderApproveResourceV2Request
  * @throws IOException if the JSON string is invalid with respect to StarOrderApproveResourceV2Request
  */
  public static StarOrderApproveResourceV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderApproveResourceV2Request.class);
  }

 /**
  * Convert an instance of StarOrderApproveResourceV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

