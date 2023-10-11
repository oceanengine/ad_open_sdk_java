/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeOrderTerminateV10ResponseDataTerminateQuotaInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class QianchuanAwemeOrderTerminateV10ResponseData {
  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public static final String SERIALIZED_NAME_TERMINATE_QUOTA_INFO = "terminate_quota_info";
  @SerializedName(SERIALIZED_NAME_TERMINATE_QUOTA_INFO)
  private QianchuanAwemeOrderTerminateV10ResponseDataTerminateQuotaInfo terminateQuotaInfo = null;

  public QianchuanAwemeOrderTerminateV10ResponseData() {
  }

  public QianchuanAwemeOrderTerminateV10ResponseData orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public QianchuanAwemeOrderTerminateV10ResponseData addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 终止成功的订单ID
   * @return orderIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  public QianchuanAwemeOrderTerminateV10ResponseData terminateQuotaInfo(QianchuanAwemeOrderTerminateV10ResponseDataTerminateQuotaInfo terminateQuotaInfo) {
    
    this.terminateQuotaInfo = terminateQuotaInfo;
    return this;
  }

   /**
   * Get terminateQuotaInfo
   * @return terminateQuotaInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderTerminateV10ResponseDataTerminateQuotaInfo getTerminateQuotaInfo() {
    return terminateQuotaInfo;
  }


  public void setTerminateQuotaInfo(QianchuanAwemeOrderTerminateV10ResponseDataTerminateQuotaInfo terminateQuotaInfo) {
    this.terminateQuotaInfo = terminateQuotaInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderTerminateV10ResponseData qianchuanAwemeOrderTerminateV10ResponseData = (QianchuanAwemeOrderTerminateV10ResponseData) o;
    return Objects.equals(this.orderIds, qianchuanAwemeOrderTerminateV10ResponseData.orderIds) &&
        Objects.equals(this.terminateQuotaInfo, qianchuanAwemeOrderTerminateV10ResponseData.terminateQuotaInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIds, terminateQuotaInfo);
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
    sb.append("class QianchuanAwemeOrderTerminateV10ResponseData {\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    terminateQuotaInfo: ").append(toIndentedString(terminateQuotaInfo)).append("\n");
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
    openapiFields.add("order_ids");
    openapiFields.add("terminate_quota_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderTerminateV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderTerminateV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderTerminateV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderTerminateV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderTerminateV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderTerminateV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderTerminateV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderTerminateV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderTerminateV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderTerminateV10ResponseData
  */
  public static QianchuanAwemeOrderTerminateV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderTerminateV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderTerminateV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

