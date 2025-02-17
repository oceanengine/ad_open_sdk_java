/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * 商品信息，用于生成脚本文案
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class AicVideoMixcutCreateV30RequestProductInfo {
  public static final String SERIALIZED_NAME_BENEFIT_POINTS = "benefit_points";
  @SerializedName(SERIALIZED_NAME_BENEFIT_POINTS)
  private List<String> benefitPoints = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_SELLING_POINTS = "product_selling_points";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SELLING_POINTS)
  private List<String> productSellingPoints = null;

  public AicVideoMixcutCreateV30RequestProductInfo() {
  }

  public AicVideoMixcutCreateV30RequestProductInfo benefitPoints(List<String> benefitPoints) {
    
    this.benefitPoints = benefitPoints;
    return this;
  }

  public AicVideoMixcutCreateV30RequestProductInfo addBenefitPointsItem(String benefitPointsItem) {
    if (this.benefitPoints == null) {
      this.benefitPoints = new ArrayList<>();
    }
    this.benefitPoints.add(benefitPointsItem);
    return this;
  }

   /**
   * 利益点，总字数上限：100，示例：[七夕全场包邮，满300立减50] 字数14
   * @return benefitPoints
  **/
  @javax.annotation.Nullable
  public List<String> getBenefitPoints() {
    return benefitPoints;
  }


  public void setBenefitPoints(List<String> benefitPoints) {
    this.benefitPoints = benefitPoints;
  }


  public AicVideoMixcutCreateV30RequestProductInfo productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 商品名，尽量简练，且需要包括商品主体，比如插座、空调等，字数上限：20 推荐输入：立白洗衣凝珠 不推荐输入：88rising龙年限定双龙刺绣麂皮绒摇粒绒
   * @return productName
  **/
  @javax.annotation.Nonnull
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public AicVideoMixcutCreateV30RequestProductInfo productSellingPoints(List<String> productSellingPoints) {
    
    this.productSellingPoints = productSellingPoints;
    return this;
  }

  public AicVideoMixcutCreateV30RequestProductInfo addProductSellingPointsItem(String productSellingPointsItem) {
    if (this.productSellingPoints == null) {
      this.productSellingPoints = new ArrayList<>();
    }
    this.productSellingPoints.add(productSellingPointsItem);
    return this;
  }

   /**
   * 商品卖点，总字数上限：100，示例：[加大加厚，吸油锁水] 字数8
   * @return productSellingPoints
  **/
  @javax.annotation.Nonnull
  public List<String> getProductSellingPoints() {
    return productSellingPoints;
  }


  public void setProductSellingPoints(List<String> productSellingPoints) {
    this.productSellingPoints = productSellingPoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicVideoMixcutCreateV30RequestProductInfo aicVideoMixcutCreateV30RequestProductInfo = (AicVideoMixcutCreateV30RequestProductInfo) o;
    return Objects.equals(this.benefitPoints, aicVideoMixcutCreateV30RequestProductInfo.benefitPoints) &&
        Objects.equals(this.productName, aicVideoMixcutCreateV30RequestProductInfo.productName) &&
        Objects.equals(this.productSellingPoints, aicVideoMixcutCreateV30RequestProductInfo.productSellingPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitPoints, productName, productSellingPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicVideoMixcutCreateV30RequestProductInfo {\n");
    sb.append("    benefitPoints: ").append(toIndentedString(benefitPoints)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productSellingPoints: ").append(toIndentedString(productSellingPoints)).append("\n");
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
    openapiFields.add("benefit_points");
    openapiFields.add("product_name");
    openapiFields.add("product_selling_points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("product_name");
    openapiRequiredFields.add("product_selling_points");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicVideoMixcutCreateV30RequestProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicVideoMixcutCreateV30RequestProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicVideoMixcutCreateV30RequestProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicVideoMixcutCreateV30RequestProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AicVideoMixcutCreateV30RequestProductInfo>() {
           @Override
           public void write(JsonWriter out, AicVideoMixcutCreateV30RequestProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicVideoMixcutCreateV30RequestProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicVideoMixcutCreateV30RequestProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicVideoMixcutCreateV30RequestProductInfo
  * @throws IOException if the JSON string is invalid with respect to AicVideoMixcutCreateV30RequestProductInfo
  */
  public static AicVideoMixcutCreateV30RequestProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicVideoMixcutCreateV30RequestProductInfo.class);
  }

 /**
  * Convert an instance of AicVideoMixcutCreateV30RequestProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

