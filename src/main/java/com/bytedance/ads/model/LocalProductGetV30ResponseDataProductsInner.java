/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * LocalProductGetV30ResponseDataProductsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class LocalProductGetV30ResponseDataProductsInner {
  public static final String SERIALIZED_NAME_APPLICABLE_POI_NUM = "applicable_poi_num";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_POI_NUM)
  private Long applicablePoiNum = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Long price = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_PICS = "product_pics";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PICS)
  private String productPics = null;

  public LocalProductGetV30ResponseDataProductsInner() {
  }

  public LocalProductGetV30ResponseDataProductsInner applicablePoiNum(Long applicablePoiNum) {
    
    this.applicablePoiNum = applicablePoiNum;
    return this;
  }

   /**
   * 商品适用门店数
   * @return applicablePoiNum
  **/
  @javax.annotation.Nullable
  public Long getApplicablePoiNum() {
    return applicablePoiNum;
  }


  public void setApplicablePoiNum(Long applicablePoiNum) {
    this.applicablePoiNum = applicablePoiNum;
  }


  public LocalProductGetV30ResponseDataProductsInner price(Long price) {
    
    this.price = price;
    return this;
  }

   /**
   * 商品价格，单位元
   * @return price
  **/
  @javax.annotation.Nullable
  public Long getPrice() {
    return price;
  }


  public void setPrice(Long price) {
    this.price = price;
  }


  public LocalProductGetV30ResponseDataProductsInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品ID
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public LocalProductGetV30ResponseDataProductsInner productName(String productName) {
    
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


  public LocalProductGetV30ResponseDataProductsInner productPics(String productPics) {
    
    this.productPics = productPics;
    return this;
  }

   /**
   * 商品头图，有效期2h
   * @return productPics
  **/
  @javax.annotation.Nullable
  public String getProductPics() {
    return productPics;
  }


  public void setProductPics(String productPics) {
    this.productPics = productPics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProductGetV30ResponseDataProductsInner localProductGetV30ResponseDataProductsInner = (LocalProductGetV30ResponseDataProductsInner) o;
    return Objects.equals(this.applicablePoiNum, localProductGetV30ResponseDataProductsInner.applicablePoiNum) &&
        Objects.equals(this.price, localProductGetV30ResponseDataProductsInner.price) &&
        Objects.equals(this.productId, localProductGetV30ResponseDataProductsInner.productId) &&
        Objects.equals(this.productName, localProductGetV30ResponseDataProductsInner.productName) &&
        Objects.equals(this.productPics, localProductGetV30ResponseDataProductsInner.productPics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicablePoiNum, price, productId, productName, productPics);
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
    sb.append("class LocalProductGetV30ResponseDataProductsInner {\n");
    sb.append("    applicablePoiNum: ").append(toIndentedString(applicablePoiNum)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPics: ").append(toIndentedString(productPics)).append("\n");
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
    openapiFields.add("applicable_poi_num");
    openapiFields.add("price");
    openapiFields.add("product_id");
    openapiFields.add("product_name");
    openapiFields.add("product_pics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProductGetV30ResponseDataProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProductGetV30ResponseDataProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProductGetV30ResponseDataProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProductGetV30ResponseDataProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProductGetV30ResponseDataProductsInner>() {
           @Override
           public void write(JsonWriter out, LocalProductGetV30ResponseDataProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProductGetV30ResponseDataProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProductGetV30ResponseDataProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProductGetV30ResponseDataProductsInner
  * @throws IOException if the JSON string is invalid with respect to LocalProductGetV30ResponseDataProductsInner
  */
  public static LocalProductGetV30ResponseDataProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProductGetV30ResponseDataProductsInner.class);
  }

 /**
  * Convert an instance of LocalProductGetV30ResponseDataProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

