/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * 商品详情页
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage {
  public static final String SERIALIZED_NAME_AWEME_SHOP_ID = "aweme_shop_id";
  @SerializedName(SERIALIZED_NAME_AWEME_SHOP_ID)
  private String awemeShopId = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId = null;

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage() {
  }

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage awemeShopId(String awemeShopId) {
    
    this.awemeShopId = awemeShopId;
    return this;
  }

   /**
   * 抖音小店账号ID
   * @return awemeShopId
  **/
  @javax.annotation.Nullable
  public String getAwemeShopId() {
    return awemeShopId;
  }


  public void setAwemeShopId(String awemeShopId) {
    this.awemeShopId = awemeShopId;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 落地页
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品ID
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage brandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage = (BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage) o;
    return Objects.equals(this.awemeShopId, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage.awemeShopId) &&
        Objects.equals(this.externalUrl, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage.externalUrl) &&
        Objects.equals(this.productId, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeShopId, externalUrl, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage {\n");
    sb.append("    awemeShopId: ").append(toIndentedString(awemeShopId)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
    openapiFields.add("aweme_shop_id");
    openapiFields.add("external_url");
    openapiFields.add("product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage
  */
  public static BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentProductDetailPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

