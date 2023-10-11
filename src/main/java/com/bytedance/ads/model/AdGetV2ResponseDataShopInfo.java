/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class AdGetV2ResponseDataShopInfo {
  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId = null;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName = null;

  public AdGetV2ResponseDataShopInfo() {
  }

  public AdGetV2ResponseDataShopInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public AdGetV2ResponseDataShopInfo shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 
   * @return shopId
  **/
  @javax.annotation.Nullable
  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }


  public AdGetV2ResponseDataShopInfo shopName(String shopName) {
    
    this.shopName = shopName;
    return this;
  }

   /**
   * 
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
    AdGetV2ResponseDataShopInfo adGetV2ResponseDataShopInfo = (AdGetV2ResponseDataShopInfo) o;
    return Objects.equals(this.brandName, adGetV2ResponseDataShopInfo.brandName) &&
        Objects.equals(this.shopId, adGetV2ResponseDataShopInfo.shopId) &&
        Objects.equals(this.shopName, adGetV2ResponseDataShopInfo.shopName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, shopId, shopName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGetV2ResponseDataShopInfo {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdGetV2ResponseDataShopInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdGetV2ResponseDataShopInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdGetV2ResponseDataShopInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdGetV2ResponseDataShopInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdGetV2ResponseDataShopInfo>() {
           @Override
           public void write(JsonWriter out, AdGetV2ResponseDataShopInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdGetV2ResponseDataShopInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdGetV2ResponseDataShopInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdGetV2ResponseDataShopInfo
  * @throws IOException if the JSON string is invalid with respect to AdGetV2ResponseDataShopInfo
  */
  public static AdGetV2ResponseDataShopInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdGetV2ResponseDataShopInfo.class);
  }

 /**
  * Convert an instance of AdGetV2ResponseDataShopInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

