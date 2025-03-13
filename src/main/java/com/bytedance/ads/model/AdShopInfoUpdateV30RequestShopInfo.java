/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AdShopInfoUpdateV30RequestShopInfo {
  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId = null;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName = null;

  public AdShopInfoUpdateV30RequestShopInfo() {
  }

  public AdShopInfoUpdateV30RequestShopInfo brandName(String brandName) {
    
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


  public AdShopInfoUpdateV30RequestShopInfo shopId(String shopId) {
    
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


  public AdShopInfoUpdateV30RequestShopInfo shopName(String shopName) {
    
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
    AdShopInfoUpdateV30RequestShopInfo adShopInfoUpdateV30RequestShopInfo = (AdShopInfoUpdateV30RequestShopInfo) o;
    return Objects.equals(this.brandName, adShopInfoUpdateV30RequestShopInfo.brandName) &&
        Objects.equals(this.shopId, adShopInfoUpdateV30RequestShopInfo.shopId) &&
        Objects.equals(this.shopName, adShopInfoUpdateV30RequestShopInfo.shopName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, shopId, shopName);
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
    sb.append("class AdShopInfoUpdateV30RequestShopInfo {\n");
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
       if (!AdShopInfoUpdateV30RequestShopInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdShopInfoUpdateV30RequestShopInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdShopInfoUpdateV30RequestShopInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdShopInfoUpdateV30RequestShopInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdShopInfoUpdateV30RequestShopInfo>() {
           @Override
           public void write(JsonWriter out, AdShopInfoUpdateV30RequestShopInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdShopInfoUpdateV30RequestShopInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdShopInfoUpdateV30RequestShopInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdShopInfoUpdateV30RequestShopInfo
  * @throws IOException if the JSON string is invalid with respect to AdShopInfoUpdateV30RequestShopInfo
  */
  public static AdShopInfoUpdateV30RequestShopInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdShopInfoUpdateV30RequestShopInfo.class);
  }

 /**
  * Convert an instance of AdShopInfoUpdateV30RequestShopInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

