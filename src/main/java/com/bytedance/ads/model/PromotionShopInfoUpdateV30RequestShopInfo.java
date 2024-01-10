/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class PromotionShopInfoUpdateV30RequestShopInfo {
  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId = null;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName = null;

  public PromotionShopInfoUpdateV30RequestShopInfo() {
  }

  public PromotionShopInfoUpdateV30RequestShopInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nonnull
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public PromotionShopInfoUpdateV30RequestShopInfo shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 
   * @return shopId
  **/
  @javax.annotation.Nonnull
  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public PromotionShopInfoUpdateV30RequestShopInfo shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 
   * @return shopName
  **/
  @javax.annotation.Nonnull
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
    PromotionShopInfoUpdateV30RequestShopInfo promotionShopInfoUpdateV30RequestShopInfo = (PromotionShopInfoUpdateV30RequestShopInfo) o;
    return Objects.equals(this.brandName, promotionShopInfoUpdateV30RequestShopInfo.brandName) &&
        Objects.equals(this.shopId, promotionShopInfoUpdateV30RequestShopInfo.shopId) &&
        Objects.equals(this.shopName, promotionShopInfoUpdateV30RequestShopInfo.shopName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, shopId, shopName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionShopInfoUpdateV30RequestShopInfo {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("brand_name");
    openapiFields.add("shop_id");
    openapiFields.add("shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brand_name");
    openapiRequiredFields.add("shop_id");
    openapiRequiredFields.add("shop_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionShopInfoUpdateV30RequestShopInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionShopInfoUpdateV30RequestShopInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionShopInfoUpdateV30RequestShopInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionShopInfoUpdateV30RequestShopInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionShopInfoUpdateV30RequestShopInfo>() {
           @Override
           public void write(JsonWriter out, PromotionShopInfoUpdateV30RequestShopInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionShopInfoUpdateV30RequestShopInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionShopInfoUpdateV30RequestShopInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionShopInfoUpdateV30RequestShopInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionShopInfoUpdateV30RequestShopInfo
  */
  public static PromotionShopInfoUpdateV30RequestShopInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionShopInfoUpdateV30RequestShopInfo.class);
  }

 /**
  * Convert an instance of PromotionShopInfoUpdateV30RequestShopInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
