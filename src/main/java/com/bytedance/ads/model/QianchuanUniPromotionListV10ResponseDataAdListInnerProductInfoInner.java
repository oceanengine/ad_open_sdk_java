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
 * QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE = "product_image";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE)
  private String productImage = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_RECOMMEND_REASONS = "recommend_reasons";
  @SerializedName(SERIALIZED_NAME_RECOMMEND_REASONS)
  private List<String> recommendReasons = null;

  public QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner() {
  }

  public QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner productId(Long productId) {
    
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


  public QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner productImage(String productImage) {
    
    this.productImage = productImage;
    return this;
  }

   /**
   * 
   * @return productImage
  **/
  @javax.annotation.Nullable
  public String getProductImage() {
    return productImage;
  }


  public void setProductImage(String productImage) {
    this.productImage = productImage;
  }


  public QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner productName(String productName) {
    
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


  public QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner recommendReasons(List<String> recommendReasons) {
    
    this.recommendReasons = recommendReasons;
    return this;
  }

  public QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner addRecommendReasonsItem(String recommendReasonsItem) {
    if (this.recommendReasons == null) {
      this.recommendReasons = new ArrayList<>();
    }
    this.recommendReasons.add(recommendReasonsItem);
    return this;
  }

   /**
   * 
   * @return recommendReasons
  **/
  @javax.annotation.Nullable
  public List<String> getRecommendReasons() {
    return recommendReasons;
  }


  public void setRecommendReasons(List<String> recommendReasons) {
    this.recommendReasons = recommendReasons;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner qianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner = (QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner) o;
    return Objects.equals(this.productId, qianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner.productId) &&
        Objects.equals(this.productImage, qianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner.productImage) &&
        Objects.equals(this.productName, qianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner.productName) &&
        Objects.equals(this.recommendReasons, qianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner.recommendReasons);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productImage, productName, recommendReasons);
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
    sb.append("class QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    recommendReasons: ").append(toIndentedString(recommendReasons)).append("\n");
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
    openapiFields.add("product_id");
    openapiFields.add("product_image");
    openapiFields.add("product_name");
    openapiFields.add("recommend_reasons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner
  */
  public static QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionListV10ResponseDataAdListInnerProductInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

