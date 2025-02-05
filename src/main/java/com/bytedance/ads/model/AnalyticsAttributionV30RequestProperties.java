/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class AnalyticsAttributionV30RequestProperties {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId = null;

  public static final String SERIALIZED_NAME_ORDER_STATE = "order_state";
  @SerializedName(SERIALIZED_NAME_ORDER_STATE)
  private String orderState = null;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private Long payAmount = null;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAG = "product_imag";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAG)
  private String productImag = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_NUMBER = "product_number";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NUMBER)
  private Long productNumber = null;

  public static final String SERIALIZED_NAME_PRODUCT_PRICE = "product_price";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PRICE)
  private Long productPrice = null;

  public static final String SERIALIZED_NAME_PRODUCT_TITLE = "product_title";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TITLE)
  private String productTitle = null;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "product_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private String productType = null;

  public static final String SERIALIZED_NAME_RECEIVER_CITY = "receiver_city";
  @SerializedName(SERIALIZED_NAME_RECEIVER_CITY)
  private String receiverCity = null;

  public static final String SERIALIZED_NAME_RECEIVER_PROVINCE = "receiver_province";
  @SerializedName(SERIALIZED_NAME_RECEIVER_PROVINCE)
  private String receiverProvince = null;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName = null;

  public AnalyticsAttributionV30RequestProperties() {
  }

  public AnalyticsAttributionV30RequestProperties orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单编号
   * @return orderId
  **/
  @javax.annotation.Nullable
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AnalyticsAttributionV30RequestProperties orderState(String orderState) {
    
    this.orderState = orderState;
    return this;
  }

   /**
   * 订单状态
   * @return orderState
  **/
  @javax.annotation.Nullable
  public String getOrderState() {
    return orderState;
  }


  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }


  public AnalyticsAttributionV30RequestProperties payAmount(Long payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * 下单金额（付款金额，单位为“分”）如下单金额为13.23元，回传数值为1323 下单金额单位为“分”，请注意不要按照元回传⚠️
   * @return payAmount
  **/
  @javax.annotation.Nullable
  public Long getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(Long payAmount) {
    this.payAmount = payAmount;
  }


  public AnalyticsAttributionV30RequestProperties pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 媒体位id，mm_1_2_3
   * @return pid
  **/
  @javax.annotation.Nullable
  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AnalyticsAttributionV30RequestProperties productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品id，按照淘宝的sku_id进行回传。若订单中包含多个sku，则可在此字段中填写全部sku_id，英文逗号分隔
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public AnalyticsAttributionV30RequestProperties productImag(String productImag) {
    
    this.productImag = productImag;
    return this;
  }

   /**
   * 商品图片
   * @return productImag
  **/
  @javax.annotation.Nullable
  public String getProductImag() {
    return productImag;
  }


  public void setProductImag(String productImag) {
    this.productImag = productImag;
  }


  public AnalyticsAttributionV30RequestProperties productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 商品名称
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public AnalyticsAttributionV30RequestProperties productNumber(Long productNumber) {
    
    this.productNumber = productNumber;
    return this;
  }

   /**
   * 商品数量
   * @return productNumber
  **/
  @javax.annotation.Nullable
  public Long getProductNumber() {
    return productNumber;
  }


  public void setProductNumber(Long productNumber) {
    this.productNumber = productNumber;
  }


  public AnalyticsAttributionV30RequestProperties productPrice(Long productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * 商品单价，单位为“元”
   * @return productPrice
  **/
  @javax.annotation.Nullable
  public Long getProductPrice() {
    return productPrice;
  }


  public void setProductPrice(Long productPrice) {
    this.productPrice = productPrice;
  }


  public AnalyticsAttributionV30RequestProperties productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * 商品标题
   * @return productTitle
  **/
  @javax.annotation.Nullable
  public String getProductTitle() {
    return productTitle;
  }


  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public AnalyticsAttributionV30RequestProperties productType(String productType) {
    
    this.productType = productType;
    return this;
  }

   /**
   * 商品类型
   * @return productType
  **/
  @javax.annotation.Nullable
  public String getProductType() {
    return productType;
  }


  public void setProductType(String productType) {
    this.productType = productType;
  }


  public AnalyticsAttributionV30RequestProperties receiverCity(String receiverCity) {
    
    this.receiverCity = receiverCity;
    return this;
  }

   /**
   * 收货人所在的城市（若城市为直辖市仍然填写市，如北京市）；当phone_num_blurred值为*******1234类型时必填
   * @return receiverCity
  **/
  @javax.annotation.Nullable
  public String getReceiverCity() {
    return receiverCity;
  }


  public void setReceiverCity(String receiverCity) {
    this.receiverCity = receiverCity;
  }


  public AnalyticsAttributionV30RequestProperties receiverProvince(String receiverProvince) {
    
    this.receiverProvince = receiverProvince;
    return this;
  }

   /**
   * 收货人所在的省份；当phone_num_blurred值为*******1234类型时必填
   * @return receiverProvince
  **/
  @javax.annotation.Nullable
  public String getReceiverProvince() {
    return receiverProvince;
  }


  public void setReceiverProvince(String receiverProvince) {
    this.receiverProvince = receiverProvince;
  }


  public AnalyticsAttributionV30RequestProperties shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 店铺名称
   * @return shopName
  **/
  @javax.annotation.Nullable
  public String getShopName() {
    return shopName;
  }


  public void setShopName(String shopName) {
    this.shopName = shopName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAttributionV30RequestProperties analyticsAttributionV30RequestProperties = (AnalyticsAttributionV30RequestProperties) o;
    return Objects.equals(this.orderId, analyticsAttributionV30RequestProperties.orderId) &&
        Objects.equals(this.orderState, analyticsAttributionV30RequestProperties.orderState) &&
        Objects.equals(this.payAmount, analyticsAttributionV30RequestProperties.payAmount) &&
        Objects.equals(this.pid, analyticsAttributionV30RequestProperties.pid) &&
        Objects.equals(this.productId, analyticsAttributionV30RequestProperties.productId) &&
        Objects.equals(this.productImag, analyticsAttributionV30RequestProperties.productImag) &&
        Objects.equals(this.productName, analyticsAttributionV30RequestProperties.productName) &&
        Objects.equals(this.productNumber, analyticsAttributionV30RequestProperties.productNumber) &&
        Objects.equals(this.productPrice, analyticsAttributionV30RequestProperties.productPrice) &&
        Objects.equals(this.productTitle, analyticsAttributionV30RequestProperties.productTitle) &&
        Objects.equals(this.productType, analyticsAttributionV30RequestProperties.productType) &&
        Objects.equals(this.receiverCity, analyticsAttributionV30RequestProperties.receiverCity) &&
        Objects.equals(this.receiverProvince, analyticsAttributionV30RequestProperties.receiverProvince) &&
        Objects.equals(this.shopName, analyticsAttributionV30RequestProperties.shopName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderState, payAmount, pid, productId, productImag, productName, productNumber, productPrice, productTitle, productType, receiverCity, receiverProvince, shopName);
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
    sb.append("class AnalyticsAttributionV30RequestProperties {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderState: ").append(toIndentedString(orderState)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productImag: ").append(toIndentedString(productImag)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    receiverCity: ").append(toIndentedString(receiverCity)).append("\n");
    sb.append("    receiverProvince: ").append(toIndentedString(receiverProvince)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
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
    openapiFields.add("order_state");
    openapiFields.add("pay_amount");
    openapiFields.add("pid");
    openapiFields.add("product_id");
    openapiFields.add("product_imag");
    openapiFields.add("product_name");
    openapiFields.add("product_number");
    openapiFields.add("product_price");
    openapiFields.add("product_title");
    openapiFields.add("product_type");
    openapiFields.add("receiver_city");
    openapiFields.add("receiver_province");
    openapiFields.add("shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticsAttributionV30RequestProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticsAttributionV30RequestProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticsAttributionV30RequestProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticsAttributionV30RequestProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticsAttributionV30RequestProperties>() {
           @Override
           public void write(JsonWriter out, AnalyticsAttributionV30RequestProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyticsAttributionV30RequestProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyticsAttributionV30RequestProperties given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticsAttributionV30RequestProperties
  * @throws IOException if the JSON string is invalid with respect to AnalyticsAttributionV30RequestProperties
  */
  public static AnalyticsAttributionV30RequestProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticsAttributionV30RequestProperties.class);
  }

 /**
  * Convert an instance of AnalyticsAttributionV30RequestProperties to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

