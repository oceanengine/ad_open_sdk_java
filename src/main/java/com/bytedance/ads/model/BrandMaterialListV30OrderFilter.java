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
import com.bytedance.ads.model.BrandMaterialListV30OrderFilterAdForm;
import com.bytedance.ads.model.BrandMaterialListV30OrderFilterAppOrigin;
import com.bytedance.ads.model.BrandMaterialListV30OrderFilterGdSendType;
import com.bytedance.ads.model.BrandMaterialListV30OrderFilterOrderStatus;
import com.bytedance.ads.model.BrandMaterialListV30OrderFilterProType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class BrandMaterialListV30OrderFilter {
  public static final String SERIALIZED_NAME_AD_FORM = "ad_form";
  @SerializedName(SERIALIZED_NAME_AD_FORM)
  private List<BrandMaterialListV30OrderFilterAdForm> adForm = null;

  public static final String SERIALIZED_NAME_APP_ORIGIN = "app_origin";
  @SerializedName(SERIALIZED_NAME_APP_ORIGIN)
  private BrandMaterialListV30OrderFilterAppOrigin appOrigin = null;

  public static final String SERIALIZED_NAME_CREATE_END_TIME = "create_end_time";
  @SerializedName(SERIALIZED_NAME_CREATE_END_TIME)
  private String createEndTime = null;

  public static final String SERIALIZED_NAME_CREATE_START_TIME = "create_start_time";
  @SerializedName(SERIALIZED_NAME_CREATE_START_TIME)
  private String createStartTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_GD_SEND_TYPE = "gd_send_type";
  @SerializedName(SERIALIZED_NAME_GD_SEND_TYPE)
  private BrandMaterialListV30OrderFilterGdSendType gdSendType = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId = null;

  public static final String SERIALIZED_NAME_ORDER_NAME = "order_name";
  @SerializedName(SERIALIZED_NAME_ORDER_NAME)
  private String orderName = null;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private List<BrandMaterialListV30OrderFilterOrderStatus> orderStatus = null;

  public static final String SERIALIZED_NAME_PRO_TYPE = "pro_type";
  @SerializedName(SERIALIZED_NAME_PRO_TYPE)
  private BrandMaterialListV30OrderFilterProType proType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public BrandMaterialListV30OrderFilter() {
  }

  public BrandMaterialListV30OrderFilter adForm(List<BrandMaterialListV30OrderFilterAdForm> adForm) {
    
    this.adForm = adForm;
    return this;
  }

  public BrandMaterialListV30OrderFilter addAdFormItem(BrandMaterialListV30OrderFilterAdForm adFormItem) {
    if (this.adForm == null) {
      this.adForm = new ArrayList<>();
    }
    this.adForm.add(adFormItem);
    return this;
  }

   /**
   * 产品
   * @return adForm
  **/
  @javax.annotation.Nullable
  public List<BrandMaterialListV30OrderFilterAdForm> getAdForm() {
    return adForm;
  }


  public void setAdForm(List<BrandMaterialListV30OrderFilterAdForm> adForm) {
    this.adForm = adForm;
  }


  public BrandMaterialListV30OrderFilter appOrigin(BrandMaterialListV30OrderFilterAppOrigin appOrigin) {
    
    this.appOrigin = appOrigin;
    return this;
  }

   /**
   * Get appOrigin
   * @return appOrigin
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30OrderFilterAppOrigin getAppOrigin() {
    return appOrigin;
  }


  public void setAppOrigin(BrandMaterialListV30OrderFilterAppOrigin appOrigin) {
    this.appOrigin = appOrigin;
  }


  public BrandMaterialListV30OrderFilter createEndTime(String createEndTime) {
    
    this.createEndTime = createEndTime;
    return this;
  }

   /**
   * 预订单创建截止时间
   * @return createEndTime
  **/
  @javax.annotation.Nullable
  public String getCreateEndTime() {
    return createEndTime;
  }


  public void setCreateEndTime(String createEndTime) {
    this.createEndTime = createEndTime;
  }


  public BrandMaterialListV30OrderFilter createStartTime(String createStartTime) {
    
    this.createStartTime = createStartTime;
    return this;
  }

   /**
   * 预订单创建起始时间
   * @return createStartTime
  **/
  @javax.annotation.Nullable
  public String getCreateStartTime() {
    return createStartTime;
  }


  public void setCreateStartTime(String createStartTime) {
    this.createStartTime = createStartTime;
  }


  public BrandMaterialListV30OrderFilter endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 预订单截止投放时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandMaterialListV30OrderFilter gdSendType(BrandMaterialListV30OrderFilterGdSendType gdSendType) {
    
    this.gdSendType = gdSendType;
    return this;
  }

   /**
   * Get gdSendType
   * @return gdSendType
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30OrderFilterGdSendType getGdSendType() {
    return gdSendType;
  }


  public void setGdSendType(BrandMaterialListV30OrderFilterGdSendType gdSendType) {
    this.gdSendType = gdSendType;
  }


  public BrandMaterialListV30OrderFilter orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 预订单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public BrandMaterialListV30OrderFilter orderName(String orderName) {
    
    this.orderName = orderName;
    return this;
  }

   /**
   * 预订单名称
   * @return orderName
  **/
  @javax.annotation.Nullable
  public String getOrderName() {
    return orderName;
  }


  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }


  public BrandMaterialListV30OrderFilter orderStatus(List<BrandMaterialListV30OrderFilterOrderStatus> orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

  public BrandMaterialListV30OrderFilter addOrderStatusItem(BrandMaterialListV30OrderFilterOrderStatus orderStatusItem) {
    if (this.orderStatus == null) {
      this.orderStatus = new ArrayList<>();
    }
    this.orderStatus.add(orderStatusItem);
    return this;
  }

   /**
   * 预订单状态
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  public List<BrandMaterialListV30OrderFilterOrderStatus> getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(List<BrandMaterialListV30OrderFilterOrderStatus> orderStatus) {
    this.orderStatus = orderStatus;
  }


  public BrandMaterialListV30OrderFilter proType(BrandMaterialListV30OrderFilterProType proType) {
    
    this.proType = proType;
    return this;
  }

   /**
   * Get proType
   * @return proType
  **/
  @javax.annotation.Nullable
  public BrandMaterialListV30OrderFilterProType getProType() {
    return proType;
  }


  public void setProType(BrandMaterialListV30OrderFilterProType proType) {
    this.proType = proType;
  }


  public BrandMaterialListV30OrderFilter startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 预订单起始投放时间
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
    BrandMaterialListV30OrderFilter brandMaterialListV30OrderFilter = (BrandMaterialListV30OrderFilter) o;
    return Objects.equals(this.adForm, brandMaterialListV30OrderFilter.adForm) &&
        Objects.equals(this.appOrigin, brandMaterialListV30OrderFilter.appOrigin) &&
        Objects.equals(this.createEndTime, brandMaterialListV30OrderFilter.createEndTime) &&
        Objects.equals(this.createStartTime, brandMaterialListV30OrderFilter.createStartTime) &&
        Objects.equals(this.endTime, brandMaterialListV30OrderFilter.endTime) &&
        Objects.equals(this.gdSendType, brandMaterialListV30OrderFilter.gdSendType) &&
        Objects.equals(this.orderId, brandMaterialListV30OrderFilter.orderId) &&
        Objects.equals(this.orderName, brandMaterialListV30OrderFilter.orderName) &&
        Objects.equals(this.orderStatus, brandMaterialListV30OrderFilter.orderStatus) &&
        Objects.equals(this.proType, brandMaterialListV30OrderFilter.proType) &&
        Objects.equals(this.startTime, brandMaterialListV30OrderFilter.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adForm, appOrigin, createEndTime, createStartTime, endTime, gdSendType, orderId, orderName, orderStatus, proType, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialListV30OrderFilter {\n");
    sb.append("    adForm: ").append(toIndentedString(adForm)).append("\n");
    sb.append("    appOrigin: ").append(toIndentedString(appOrigin)).append("\n");
    sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
    sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    gdSendType: ").append(toIndentedString(gdSendType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    proType: ").append(toIndentedString(proType)).append("\n");
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
    openapiFields.add("ad_form");
    openapiFields.add("app_origin");
    openapiFields.add("create_end_time");
    openapiFields.add("create_start_time");
    openapiFields.add("end_time");
    openapiFields.add("gd_send_type");
    openapiFields.add("order_id");
    openapiFields.add("order_name");
    openapiFields.add("order_status");
    openapiFields.add("pro_type");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30OrderFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30OrderFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30OrderFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30OrderFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30OrderFilter>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30OrderFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30OrderFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30OrderFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30OrderFilter
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30OrderFilter
  */
  public static BrandMaterialListV30OrderFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30OrderFilter.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30OrderFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

