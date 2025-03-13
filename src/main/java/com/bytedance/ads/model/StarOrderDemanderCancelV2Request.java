/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
 * StarOrderDemanderCancelV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarOrderDemanderCancelV2Request {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_REASON_TYPE = "reason_type";
  @SerializedName(SERIALIZED_NAME_REASON_TYPE)
  private Long reasonType = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarOrderDemanderCancelV2Request() {
  }

  public StarOrderDemanderCancelV2Request orderId(Long orderId) {
    
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


  public StarOrderDemanderCancelV2Request reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 其他取消原因 100字内，reason_type&#x3D;0时需提供
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public StarOrderDemanderCancelV2Request reasonType(Long reasonType) {
    
    this.reasonType = reasonType;
    return this;
  }

   /**
   * 取消原因类别 (0)：其他 (1)：信息填错，重新下单 (2)：推广计划改变 (3)：经协商一致 (4)：达人无档期，不接单 (5)：达人不配合 (6)：产出物不符合要求
   * @return reasonType
  **/
  @javax.annotation.Nullable
  public Long getReasonType() {
    return reasonType;
  }


  public void setReasonType(Long reasonType) {
    this.reasonType = reasonType;
  }


  public StarOrderDemanderCancelV2Request starId(Long starId) {
    
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
    StarOrderDemanderCancelV2Request starOrderDemanderCancelV2Request = (StarOrderDemanderCancelV2Request) o;
    return Objects.equals(this.orderId, starOrderDemanderCancelV2Request.orderId) &&
        Objects.equals(this.reason, starOrderDemanderCancelV2Request.reason) &&
        Objects.equals(this.reasonType, starOrderDemanderCancelV2Request.reasonType) &&
        Objects.equals(this.starId, starOrderDemanderCancelV2Request.starId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, reason, reasonType, starId);
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
    sb.append("class StarOrderDemanderCancelV2Request {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reasonType: ").append(toIndentedString(reasonType)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("reason_type");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("reason_type");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderDemanderCancelV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderDemanderCancelV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderDemanderCancelV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderDemanderCancelV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderDemanderCancelV2Request>() {
           @Override
           public void write(JsonWriter out, StarOrderDemanderCancelV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderDemanderCancelV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderDemanderCancelV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderDemanderCancelV2Request
  * @throws IOException if the JSON string is invalid with respect to StarOrderDemanderCancelV2Request
  */
  public static StarOrderDemanderCancelV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderDemanderCancelV2Request.class);
  }

 /**
  * Convert an instance of StarOrderDemanderCancelV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

