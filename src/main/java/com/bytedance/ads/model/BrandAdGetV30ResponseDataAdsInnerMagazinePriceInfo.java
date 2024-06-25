/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * 刊例价信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo {
  public static final String SERIALIZED_NAME_ACTUAL_MAGAZINE_PRICE = "actual_magazine_price";
  @SerializedName(SERIALIZED_NAME_ACTUAL_MAGAZINE_PRICE)
  private String actualMagazinePrice = null;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private String discount = null;

  public static final String SERIALIZED_NAME_PUBLISH_PRICE = "publish_price";
  @SerializedName(SERIALIZED_NAME_PUBLISH_PRICE)
  private String publishPrice = null;

  public static final String SERIALIZED_NAME_SELL_PRICE = "sell_price";
  @SerializedName(SERIALIZED_NAME_SELL_PRICE)
  private String sellPrice = null;

  public static final String SERIALIZED_NAME_TOTAL_PUBLISH_PRICE = "total_publish_price";
  @SerializedName(SERIALIZED_NAME_TOTAL_PUBLISH_PRICE)
  private String totalPublishPrice = null;

  public static final String SERIALIZED_NAME_TOTAL_SELL_PRICE = "total_sell_price";
  @SerializedName(SERIALIZED_NAME_TOTAL_SELL_PRICE)
  private String totalSellPrice = null;

  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo() {
  }

  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo actualMagazinePrice(String actualMagazinePrice) {
    
    this.actualMagazinePrice = actualMagazinePrice;
    return this;
  }

   /**
   * 实际投放刊例
   * @return actualMagazinePrice
  **/
  @javax.annotation.Nullable
  public String getActualMagazinePrice() {
    return actualMagazinePrice;
  }


  public void setActualMagazinePrice(String actualMagazinePrice) {
    this.actualMagazinePrice = actualMagazinePrice;
  }


  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo discount(String discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * 政策折扣
   * @return discount
  **/
  @javax.annotation.Nullable
  public String getDiscount() {
    return discount;
  }


  public void setDiscount(String discount) {
    this.discount = discount;
  }


  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo publishPrice(String publishPrice) {
    
    this.publishPrice = publishPrice;
    return this;
  }

   /**
   * 刊例单价
   * @return publishPrice
  **/
  @javax.annotation.Nullable
  public String getPublishPrice() {
    return publishPrice;
  }


  public void setPublishPrice(String publishPrice) {
    this.publishPrice = publishPrice;
  }


  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo sellPrice(String sellPrice) {
    
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * 政策单价
   * @return sellPrice
  **/
  @javax.annotation.Nullable
  public String getSellPrice() {
    return sellPrice;
  }


  public void setSellPrice(String sellPrice) {
    this.sellPrice = sellPrice;
  }


  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo totalPublishPrice(String totalPublishPrice) {
    
    this.totalPublishPrice = totalPublishPrice;
    return this;
  }

   /**
   * 刊例总价
   * @return totalPublishPrice
  **/
  @javax.annotation.Nullable
  public String getTotalPublishPrice() {
    return totalPublishPrice;
  }


  public void setTotalPublishPrice(String totalPublishPrice) {
    this.totalPublishPrice = totalPublishPrice;
  }


  public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo totalSellPrice(String totalSellPrice) {
    
    this.totalSellPrice = totalSellPrice;
    return this;
  }

   /**
   * 政策总价
   * @return totalSellPrice
  **/
  @javax.annotation.Nullable
  public String getTotalSellPrice() {
    return totalSellPrice;
  }


  public void setTotalSellPrice(String totalSellPrice) {
    this.totalSellPrice = totalSellPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo brandAdGetV30ResponseDataAdsInnerMagazinePriceInfo = (BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo) o;
    return Objects.equals(this.actualMagazinePrice, brandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.actualMagazinePrice) &&
        Objects.equals(this.discount, brandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.discount) &&
        Objects.equals(this.publishPrice, brandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.publishPrice) &&
        Objects.equals(this.sellPrice, brandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.sellPrice) &&
        Objects.equals(this.totalPublishPrice, brandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.totalPublishPrice) &&
        Objects.equals(this.totalSellPrice, brandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.totalSellPrice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualMagazinePrice, discount, publishPrice, sellPrice, totalPublishPrice, totalSellPrice);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo {\n");
    sb.append("    actualMagazinePrice: ").append(toIndentedString(actualMagazinePrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    publishPrice: ").append(toIndentedString(publishPrice)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    totalPublishPrice: ").append(toIndentedString(totalPublishPrice)).append("\n");
    sb.append("    totalSellPrice: ").append(toIndentedString(totalSellPrice)).append("\n");
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
    openapiFields.add("actual_magazine_price");
    openapiFields.add("discount");
    openapiFields.add("publish_price");
    openapiFields.add("sell_price");
    openapiFields.add("total_publish_price");
    openapiFields.add("total_sell_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo
  */
  public static BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerMagazinePriceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

