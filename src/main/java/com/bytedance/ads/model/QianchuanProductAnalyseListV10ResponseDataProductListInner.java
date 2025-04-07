/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * QianchuanProductAnalyseListV10ResponseDataProductListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QianchuanProductAnalyseListV10ResponseDataProductListInner {
  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_COST = "direct_order_pay_cost";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_COST)
  private Double directOrderPayCost = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_COST_PER_ORDER = "direct_order_pay_cost_per_order";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_COST_PER_ORDER)
  private Double directOrderPayCostPerOrder = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_COUNT = "direct_order_pay_count";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_COUNT)
  private Long directOrderPayCount = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_GMV = "direct_order_pay_gmv";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_GMV)
  private Double directOrderPayGmv = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_RATE = "direct_order_pay_rate";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_RATE)
  private Double directOrderPayRate = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PREPAY_AND_PAY_ROI = "direct_order_prepay_and_pay_roi";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PREPAY_AND_PAY_ROI)
  private Double directOrderPrepayAndPayRoi = null;

  public static final String SERIALIZED_NAME_DISCOUNT_PRICE = "discount_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PRICE)
  private Double discountPrice = null;

  public static final String SERIALIZED_NAME_MARKET_PRICE = "market_price";
  @SerializedName(SERIALIZED_NAME_MARKET_PRICE)
  private Double marketPrice = null;

  public static final String SERIALIZED_NAME_PAY_ORDER_COUPON_AMOUNT = "pay_order_coupon_amount";
  @SerializedName(SERIALIZED_NAME_PAY_ORDER_COUPON_AMOUNT)
  private Double payOrderCouponAmount = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMG = "product_img";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMG)
  private List<String> productImg = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_RATE = "product_rate";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RATE)
  private Double productRate = null;

  public static final String SERIALIZED_NAME_RECOMMENDATION = "recommendation";
  @SerializedName(SERIALIZED_NAME_RECOMMENDATION)
  private String recommendation = null;

  public static final String SERIALIZED_NAME_SALE_TIME = "sale_time";
  @SerializedName(SERIALIZED_NAME_SALE_TIME)
  private Long saleTime = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public QianchuanProductAnalyseListV10ResponseDataProductListInner() {
  }

  public QianchuanProductAnalyseListV10ResponseDataProductListInner categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner directOrderPayCost(Double directOrderPayCost) {
    
    this.directOrderPayCost = directOrderPayCost;
    return this;
  }

   /**
   * 
   * @return directOrderPayCost
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayCost() {
    return directOrderPayCost;
  }


  public void setDirectOrderPayCost(Double directOrderPayCost) {
    this.directOrderPayCost = directOrderPayCost;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner directOrderPayCostPerOrder(Double directOrderPayCostPerOrder) {
    
    this.directOrderPayCostPerOrder = directOrderPayCostPerOrder;
    return this;
  }

   /**
   * 
   * @return directOrderPayCostPerOrder
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayCostPerOrder() {
    return directOrderPayCostPerOrder;
  }


  public void setDirectOrderPayCostPerOrder(Double directOrderPayCostPerOrder) {
    this.directOrderPayCostPerOrder = directOrderPayCostPerOrder;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner directOrderPayCount(Long directOrderPayCount) {
    
    this.directOrderPayCount = directOrderPayCount;
    return this;
  }

   /**
   * 
   * @return directOrderPayCount
  **/
  @javax.annotation.Nullable
  public Long getDirectOrderPayCount() {
    return directOrderPayCount;
  }


  public void setDirectOrderPayCount(Long directOrderPayCount) {
    this.directOrderPayCount = directOrderPayCount;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner directOrderPayGmv(Double directOrderPayGmv) {
    
    this.directOrderPayGmv = directOrderPayGmv;
    return this;
  }

   /**
   * 
   * @return directOrderPayGmv
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayGmv() {
    return directOrderPayGmv;
  }


  public void setDirectOrderPayGmv(Double directOrderPayGmv) {
    this.directOrderPayGmv = directOrderPayGmv;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner directOrderPayRate(Double directOrderPayRate) {
    
    this.directOrderPayRate = directOrderPayRate;
    return this;
  }

   /**
   * 
   * @return directOrderPayRate
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayRate() {
    return directOrderPayRate;
  }


  public void setDirectOrderPayRate(Double directOrderPayRate) {
    this.directOrderPayRate = directOrderPayRate;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner directOrderPrepayAndPayRoi(Double directOrderPrepayAndPayRoi) {
    
    this.directOrderPrepayAndPayRoi = directOrderPrepayAndPayRoi;
    return this;
  }

   /**
   * 
   * @return directOrderPrepayAndPayRoi
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPrepayAndPayRoi() {
    return directOrderPrepayAndPayRoi;
  }


  public void setDirectOrderPrepayAndPayRoi(Double directOrderPrepayAndPayRoi) {
    this.directOrderPrepayAndPayRoi = directOrderPrepayAndPayRoi;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner discountPrice(Double discountPrice) {
    
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * 
   * @return discountPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountPrice() {
    return discountPrice;
  }


  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner marketPrice(Double marketPrice) {
    
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * 
   * @return marketPrice
  **/
  @javax.annotation.Nullable
  public Double getMarketPrice() {
    return marketPrice;
  }


  public void setMarketPrice(Double marketPrice) {
    this.marketPrice = marketPrice;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner payOrderCouponAmount(Double payOrderCouponAmount) {
    
    this.payOrderCouponAmount = payOrderCouponAmount;
    return this;
  }

   /**
   * 
   * @return payOrderCouponAmount
  **/
  @javax.annotation.Nullable
  public Double getPayOrderCouponAmount() {
    return payOrderCouponAmount;
  }


  public void setPayOrderCouponAmount(Double payOrderCouponAmount) {
    this.payOrderCouponAmount = payOrderCouponAmount;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner productImg(List<String> productImg) {
    
    this.productImg = productImg;
    return this;
  }

  public QianchuanProductAnalyseListV10ResponseDataProductListInner addProductImgItem(String productImgItem) {
    if (this.productImg == null) {
      this.productImg = new ArrayList<>();
    }
    this.productImg.add(productImgItem);
    return this;
  }

   /**
   * 
   * @return productImg
  **/
  @javax.annotation.Nullable
  public List<String> getProductImg() {
    return productImg;
  }


  public void setProductImg(List<String> productImg) {
    this.productImg = productImg;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner productRate(Double productRate) {
    
    this.productRate = productRate;
    return this;
  }

   /**
   * 
   * @return productRate
  **/
  @javax.annotation.Nullable
  public Double getProductRate() {
    return productRate;
  }


  public void setProductRate(Double productRate) {
    this.productRate = productRate;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner recommendation(String recommendation) {
    
    this.recommendation = recommendation;
    return this;
  }

   /**
   * 
   * @return recommendation
  **/
  @javax.annotation.Nullable
  public String getRecommendation() {
    return recommendation;
  }


  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner saleTime(Long saleTime) {
    
    this.saleTime = saleTime;
    return this;
  }

   /**
   * 
   * @return saleTime
  **/
  @javax.annotation.Nullable
  public Long getSaleTime() {
    return saleTime;
  }


  public void setSaleTime(Long saleTime) {
    this.saleTime = saleTime;
  }


  public QianchuanProductAnalyseListV10ResponseDataProductListInner statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAnalyseListV10ResponseDataProductListInner qianchuanProductAnalyseListV10ResponseDataProductListInner = (QianchuanProductAnalyseListV10ResponseDataProductListInner) o;
    return Objects.equals(this.categoryName, qianchuanProductAnalyseListV10ResponseDataProductListInner.categoryName) &&
        Objects.equals(this.ctr, qianchuanProductAnalyseListV10ResponseDataProductListInner.ctr) &&
        Objects.equals(this.directOrderPayCost, qianchuanProductAnalyseListV10ResponseDataProductListInner.directOrderPayCost) &&
        Objects.equals(this.directOrderPayCostPerOrder, qianchuanProductAnalyseListV10ResponseDataProductListInner.directOrderPayCostPerOrder) &&
        Objects.equals(this.directOrderPayCount, qianchuanProductAnalyseListV10ResponseDataProductListInner.directOrderPayCount) &&
        Objects.equals(this.directOrderPayGmv, qianchuanProductAnalyseListV10ResponseDataProductListInner.directOrderPayGmv) &&
        Objects.equals(this.directOrderPayRate, qianchuanProductAnalyseListV10ResponseDataProductListInner.directOrderPayRate) &&
        Objects.equals(this.directOrderPrepayAndPayRoi, qianchuanProductAnalyseListV10ResponseDataProductListInner.directOrderPrepayAndPayRoi) &&
        Objects.equals(this.discountPrice, qianchuanProductAnalyseListV10ResponseDataProductListInner.discountPrice) &&
        Objects.equals(this.marketPrice, qianchuanProductAnalyseListV10ResponseDataProductListInner.marketPrice) &&
        Objects.equals(this.payOrderCouponAmount, qianchuanProductAnalyseListV10ResponseDataProductListInner.payOrderCouponAmount) &&
        Objects.equals(this.productId, qianchuanProductAnalyseListV10ResponseDataProductListInner.productId) &&
        Objects.equals(this.productImg, qianchuanProductAnalyseListV10ResponseDataProductListInner.productImg) &&
        Objects.equals(this.productName, qianchuanProductAnalyseListV10ResponseDataProductListInner.productName) &&
        Objects.equals(this.productRate, qianchuanProductAnalyseListV10ResponseDataProductListInner.productRate) &&
        Objects.equals(this.recommendation, qianchuanProductAnalyseListV10ResponseDataProductListInner.recommendation) &&
        Objects.equals(this.saleTime, qianchuanProductAnalyseListV10ResponseDataProductListInner.saleTime) &&
        Objects.equals(this.statCost, qianchuanProductAnalyseListV10ResponseDataProductListInner.statCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, ctr, directOrderPayCost, directOrderPayCostPerOrder, directOrderPayCount, directOrderPayGmv, directOrderPayRate, directOrderPrepayAndPayRoi, discountPrice, marketPrice, payOrderCouponAmount, productId, productImg, productName, productRate, recommendation, saleTime, statCost);
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
    sb.append("class QianchuanProductAnalyseListV10ResponseDataProductListInner {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    directOrderPayCost: ").append(toIndentedString(directOrderPayCost)).append("\n");
    sb.append("    directOrderPayCostPerOrder: ").append(toIndentedString(directOrderPayCostPerOrder)).append("\n");
    sb.append("    directOrderPayCount: ").append(toIndentedString(directOrderPayCount)).append("\n");
    sb.append("    directOrderPayGmv: ").append(toIndentedString(directOrderPayGmv)).append("\n");
    sb.append("    directOrderPayRate: ").append(toIndentedString(directOrderPayRate)).append("\n");
    sb.append("    directOrderPrepayAndPayRoi: ").append(toIndentedString(directOrderPrepayAndPayRoi)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    payOrderCouponAmount: ").append(toIndentedString(payOrderCouponAmount)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productImg: ").append(toIndentedString(productImg)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productRate: ").append(toIndentedString(productRate)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    saleTime: ").append(toIndentedString(saleTime)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
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
    openapiFields.add("category_name");
    openapiFields.add("ctr");
    openapiFields.add("direct_order_pay_cost");
    openapiFields.add("direct_order_pay_cost_per_order");
    openapiFields.add("direct_order_pay_count");
    openapiFields.add("direct_order_pay_gmv");
    openapiFields.add("direct_order_pay_rate");
    openapiFields.add("direct_order_prepay_and_pay_roi");
    openapiFields.add("discount_price");
    openapiFields.add("market_price");
    openapiFields.add("pay_order_coupon_amount");
    openapiFields.add("product_id");
    openapiFields.add("product_img");
    openapiFields.add("product_name");
    openapiFields.add("product_rate");
    openapiFields.add("recommendation");
    openapiFields.add("sale_time");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAnalyseListV10ResponseDataProductListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAnalyseListV10ResponseDataProductListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAnalyseListV10ResponseDataProductListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAnalyseListV10ResponseDataProductListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAnalyseListV10ResponseDataProductListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAnalyseListV10ResponseDataProductListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAnalyseListV10ResponseDataProductListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAnalyseListV10ResponseDataProductListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAnalyseListV10ResponseDataProductListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAnalyseListV10ResponseDataProductListInner
  */
  public static QianchuanProductAnalyseListV10ResponseDataProductListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAnalyseListV10ResponseDataProductListInner.class);
  }

 /**
  * Convert an instance of QianchuanProductAnalyseListV10ResponseDataProductListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

