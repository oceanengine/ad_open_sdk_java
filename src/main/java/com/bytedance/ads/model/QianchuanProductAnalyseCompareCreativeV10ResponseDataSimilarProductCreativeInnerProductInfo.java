/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo {
  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName = null;

  public static final String SERIALIZED_NAME_DISCOUNT_PRICE = "discount_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PRICE)
  private Double discountPrice = null;

  public static final String SERIALIZED_NAME_MARKET_PRICE = "market_price";
  @SerializedName(SERIALIZED_NAME_MARKET_PRICE)
  private Double marketPrice = null;

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

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo() {
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo categoryName(String categoryName) {
    
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo discountPrice(Double discountPrice) {
    
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo marketPrice(Double marketPrice) {
    
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo productId(Long productId) {
    
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo productImg(List<String> productImg) {
    
    this.productImg = productImg;
    return this;
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo addProductImgItem(String productImgItem) {
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo productName(String productName) {
    
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo productRate(Double productRate) {
    
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo recommendation(String recommendation) {
    
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


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo saleTime(Long saleTime) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo = (QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo) o;
    return Objects.equals(this.categoryName, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.categoryName) &&
        Objects.equals(this.discountPrice, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.discountPrice) &&
        Objects.equals(this.marketPrice, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.marketPrice) &&
        Objects.equals(this.productId, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.productId) &&
        Objects.equals(this.productImg, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.productImg) &&
        Objects.equals(this.productName, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.productName) &&
        Objects.equals(this.productRate, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.productRate) &&
        Objects.equals(this.recommendation, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.recommendation) &&
        Objects.equals(this.saleTime, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.saleTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, discountPrice, marketPrice, productId, productImg, productName, productRate, recommendation, saleTime);
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
    sb.append("class QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productImg: ").append(toIndentedString(productImg)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productRate: ").append(toIndentedString(productRate)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    saleTime: ").append(toIndentedString(saleTime)).append("\n");
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
    openapiFields.add("discount_price");
    openapiFields.add("market_price");
    openapiFields.add("product_id");
    openapiFields.add("product_img");
    openapiFields.add("product_name");
    openapiFields.add("product_rate");
    openapiFields.add("recommendation");
    openapiFields.add("sale_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo
  */
  public static QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo.class);
  }

 /**
  * Convert an instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

