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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class AicImageMixcutCreateV30RequestProductInfo {
  public static final String SERIALIZED_NAME_BENEFIT_POINTS = "benefit_points";
  @SerializedName(SERIALIZED_NAME_BENEFIT_POINTS)
  private List<String> benefitPoints = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_SELLING_POINTS = "product_selling_points";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SELLING_POINTS)
  private List<String> productSellingPoints = null;

  public AicImageMixcutCreateV30RequestProductInfo() {
  }

  public AicImageMixcutCreateV30RequestProductInfo benefitPoints(List<String> benefitPoints) {
    
    this.benefitPoints = benefitPoints;
    return this;
  }

  public AicImageMixcutCreateV30RequestProductInfo addBenefitPointsItem(String benefitPointsItem) {
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


  public AicImageMixcutCreateV30RequestProductInfo productName(String productName) {
    
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


  public AicImageMixcutCreateV30RequestProductInfo productSellingPoints(List<String> productSellingPoints) {
    
    this.productSellingPoints = productSellingPoints;
    return this;
  }

  public AicImageMixcutCreateV30RequestProductInfo addProductSellingPointsItem(String productSellingPointsItem) {
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
    AicImageMixcutCreateV30RequestProductInfo aicImageMixcutCreateV30RequestProductInfo = (AicImageMixcutCreateV30RequestProductInfo) o;
    return Objects.equals(this.benefitPoints, aicImageMixcutCreateV30RequestProductInfo.benefitPoints) &&
        Objects.equals(this.productName, aicImageMixcutCreateV30RequestProductInfo.productName) &&
        Objects.equals(this.productSellingPoints, aicImageMixcutCreateV30RequestProductInfo.productSellingPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitPoints, productName, productSellingPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicImageMixcutCreateV30RequestProductInfo {\n");
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
       if (!AicImageMixcutCreateV30RequestProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicImageMixcutCreateV30RequestProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicImageMixcutCreateV30RequestProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicImageMixcutCreateV30RequestProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AicImageMixcutCreateV30RequestProductInfo>() {
           @Override
           public void write(JsonWriter out, AicImageMixcutCreateV30RequestProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicImageMixcutCreateV30RequestProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicImageMixcutCreateV30RequestProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicImageMixcutCreateV30RequestProductInfo
  * @throws IOException if the JSON string is invalid with respect to AicImageMixcutCreateV30RequestProductInfo
  */
  public static AicImageMixcutCreateV30RequestProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicImageMixcutCreateV30RequestProductInfo.class);
  }

 /**
  * Convert an instance of AicImageMixcutCreateV30RequestProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

