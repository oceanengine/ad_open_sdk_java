/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * StarBillGetPendingV2ResponseDataOrderBillListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StarBillGetPendingV2ResponseDataOrderBillListInner {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PLATFORM_FEE = "platform_fee";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE)
  private Long platformFee = null;

  public static final String SERIALIZED_NAME_PRECISE_PLATFORM_FEE = "precise_platform_fee";
  @SerializedName(SERIALIZED_NAME_PRECISE_PLATFORM_FEE)
  private Double precisePlatformFee = null;

  public static final String SERIALIZED_NAME_PRECISE_REMAINING = "precise_remaining";
  @SerializedName(SERIALIZED_NAME_PRECISE_REMAINING)
  private Double preciseRemaining = null;

  public static final String SERIALIZED_NAME_PRECISE_TASK_COST = "precise_task_cost";
  @SerializedName(SERIALIZED_NAME_PRECISE_TASK_COST)
  private Double preciseTaskCost = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL = "precise_total";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL)
  private Double preciseTotal = null;

  public static final String SERIALIZED_NAME_REMAINING = "remaining";
  @SerializedName(SERIALIZED_NAME_REMAINING)
  private Long remaining = null;

  public static final String SERIALIZED_NAME_TASK_COST = "task_cost";
  @SerializedName(SERIALIZED_NAME_TASK_COST)
  private Long taskCost = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total = null;

  public StarBillGetPendingV2ResponseDataOrderBillListInner() {
  }

  public StarBillGetPendingV2ResponseDataOrderBillListInner orderId(Long orderId) {
    
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


  public StarBillGetPendingV2ResponseDataOrderBillListInner platformFee(Long platformFee) {
    
    this.platformFee = platformFee;
    return this;
  }

   /**
   * 服务费
   * @return platformFee
  **/
  @javax.annotation.Nullable
  public Long getPlatformFee() {
    return platformFee;
  }


  public void setPlatformFee(Long platformFee) {
    this.platformFee = platformFee;
  }


  public StarBillGetPendingV2ResponseDataOrderBillListInner precisePlatformFee(Double precisePlatformFee) {
    
    this.precisePlatformFee = precisePlatformFee;
    return this;
  }

   /**
   * 精确服务费
   * @return precisePlatformFee
  **/
  @javax.annotation.Nullable
  public Double getPrecisePlatformFee() {
    return precisePlatformFee;
  }


  public void setPrecisePlatformFee(Double precisePlatformFee) {
    this.precisePlatformFee = precisePlatformFee;
  }


  public StarBillGetPendingV2ResponseDataOrderBillListInner preciseRemaining(Double preciseRemaining) {
    
    this.preciseRemaining = preciseRemaining;
    return this;
  }

   /**
   * 精确待付金额
   * @return preciseRemaining
  **/
  @javax.annotation.Nullable
  public Double getPreciseRemaining() {
    return preciseRemaining;
  }


  public void setPreciseRemaining(Double preciseRemaining) {
    this.preciseRemaining = preciseRemaining;
  }


  public StarBillGetPendingV2ResponseDataOrderBillListInner preciseTaskCost(Double preciseTaskCost) {
    
    this.preciseTaskCost = preciseTaskCost;
    return this;
  }

   /**
   * 精确任务金额
   * @return preciseTaskCost
  **/
  @javax.annotation.Nullable
  public Double getPreciseTaskCost() {
    return preciseTaskCost;
  }


  public void setPreciseTaskCost(Double preciseTaskCost) {
    this.preciseTaskCost = preciseTaskCost;
  }


  public StarBillGetPendingV2ResponseDataOrderBillListInner preciseTotal(Double preciseTotal) {
    
    this.preciseTotal = preciseTotal;
    return this;
  }

   /**
   * 精确总金额（单位元，下同）
   * @return preciseTotal
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotal() {
    return preciseTotal;
  }


  public void setPreciseTotal(Double preciseTotal) {
    this.preciseTotal = preciseTotal;
  }


  public StarBillGetPendingV2ResponseDataOrderBillListInner remaining(Long remaining) {
    
    this.remaining = remaining;
    return this;
  }

   /**
   * 待付金额
   * @return remaining
  **/
  @javax.annotation.Nullable
  public Long getRemaining() {
    return remaining;
  }


  public void setRemaining(Long remaining) {
    this.remaining = remaining;
  }


  public StarBillGetPendingV2ResponseDataOrderBillListInner taskCost(Long taskCost) {
    
    this.taskCost = taskCost;
    return this;
  }

   /**
   * 任务金额
   * @return taskCost
  **/
  @javax.annotation.Nullable
  public Long getTaskCost() {
    return taskCost;
  }


  public void setTaskCost(Long taskCost) {
    this.taskCost = taskCost;
  }


  public StarBillGetPendingV2ResponseDataOrderBillListInner total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * 总金额（单位元，下同）
   * @return total
  **/
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarBillGetPendingV2ResponseDataOrderBillListInner starBillGetPendingV2ResponseDataOrderBillListInner = (StarBillGetPendingV2ResponseDataOrderBillListInner) o;
    return Objects.equals(this.orderId, starBillGetPendingV2ResponseDataOrderBillListInner.orderId) &&
        Objects.equals(this.platformFee, starBillGetPendingV2ResponseDataOrderBillListInner.platformFee) &&
        Objects.equals(this.precisePlatformFee, starBillGetPendingV2ResponseDataOrderBillListInner.precisePlatformFee) &&
        Objects.equals(this.preciseRemaining, starBillGetPendingV2ResponseDataOrderBillListInner.preciseRemaining) &&
        Objects.equals(this.preciseTaskCost, starBillGetPendingV2ResponseDataOrderBillListInner.preciseTaskCost) &&
        Objects.equals(this.preciseTotal, starBillGetPendingV2ResponseDataOrderBillListInner.preciseTotal) &&
        Objects.equals(this.remaining, starBillGetPendingV2ResponseDataOrderBillListInner.remaining) &&
        Objects.equals(this.taskCost, starBillGetPendingV2ResponseDataOrderBillListInner.taskCost) &&
        Objects.equals(this.total, starBillGetPendingV2ResponseDataOrderBillListInner.total);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, platformFee, precisePlatformFee, preciseRemaining, preciseTaskCost, preciseTotal, remaining, taskCost, total);
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
    sb.append("class StarBillGetPendingV2ResponseDataOrderBillListInner {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    platformFee: ").append(toIndentedString(platformFee)).append("\n");
    sb.append("    precisePlatformFee: ").append(toIndentedString(precisePlatformFee)).append("\n");
    sb.append("    preciseRemaining: ").append(toIndentedString(preciseRemaining)).append("\n");
    sb.append("    preciseTaskCost: ").append(toIndentedString(preciseTaskCost)).append("\n");
    sb.append("    preciseTotal: ").append(toIndentedString(preciseTotal)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    taskCost: ").append(toIndentedString(taskCost)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("platform_fee");
    openapiFields.add("precise_platform_fee");
    openapiFields.add("precise_remaining");
    openapiFields.add("precise_task_cost");
    openapiFields.add("precise_total");
    openapiFields.add("remaining");
    openapiFields.add("task_cost");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarBillGetPendingV2ResponseDataOrderBillListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarBillGetPendingV2ResponseDataOrderBillListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarBillGetPendingV2ResponseDataOrderBillListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarBillGetPendingV2ResponseDataOrderBillListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarBillGetPendingV2ResponseDataOrderBillListInner>() {
           @Override
           public void write(JsonWriter out, StarBillGetPendingV2ResponseDataOrderBillListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarBillGetPendingV2ResponseDataOrderBillListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarBillGetPendingV2ResponseDataOrderBillListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarBillGetPendingV2ResponseDataOrderBillListInner
  * @throws IOException if the JSON string is invalid with respect to StarBillGetPendingV2ResponseDataOrderBillListInner
  */
  public static StarBillGetPendingV2ResponseDataOrderBillListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarBillGetPendingV2ResponseDataOrderBillListInner.class);
  }

 /**
  * Convert an instance of StarBillGetPendingV2ResponseDataOrderBillListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

