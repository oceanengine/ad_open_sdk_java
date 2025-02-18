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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class DpaDetailGetV2ResponseDataListInnerShopKeeperInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_ID = "shop_keeper_id";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_ID)
  private String shopKeeperId = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_NAME = "shop_keeper_name";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_NAME)
  private String shopKeeperName = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_URL = "shop_keeper_url";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_URL)
  private String shopKeeperUrl = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_URL_ANDROID_APP = "shop_keeper_url_android_app";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_URL_ANDROID_APP)
  private String shopKeeperUrlAndroidApp = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_URL_IOS_APP = "shop_keeper_url_ios_app";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_URL_IOS_APP)
  private String shopKeeperUrlIosApp = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_URL_MOBILE = "shop_keeper_url_mobile";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_URL_MOBILE)
  private String shopKeeperUrlMobile = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_URL_UNIVERSAL_LINK = "shop_keeper_url_universal_link";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_URL_UNIVERSAL_LINK)
  private String shopKeeperUrlUniversalLink = null;

  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo() {
  }

  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperId(String shopKeeperId) {
    
    this.shopKeeperId = shopKeeperId;
    return this;
  }

   /**
   * 
   * @return shopKeeperId
  **/
  @javax.annotation.Nullable
  public String getShopKeeperId() {
    return shopKeeperId;
  }


  public void setShopKeeperId(String shopKeeperId) {
    this.shopKeeperId = shopKeeperId;
  }


  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperName(String shopKeeperName) {
    
    this.shopKeeperName = shopKeeperName;
    return this;
  }

   /**
   * 
   * @return shopKeeperName
  **/
  @javax.annotation.Nullable
  public String getShopKeeperName() {
    return shopKeeperName;
  }


  public void setShopKeeperName(String shopKeeperName) {
    this.shopKeeperName = shopKeeperName;
  }


  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperUrl(String shopKeeperUrl) {
    
    this.shopKeeperUrl = shopKeeperUrl;
    return this;
  }

   /**
   * 
   * @return shopKeeperUrl
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrl() {
    return shopKeeperUrl;
  }


  public void setShopKeeperUrl(String shopKeeperUrl) {
    this.shopKeeperUrl = shopKeeperUrl;
  }


  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperUrlAndroidApp(String shopKeeperUrlAndroidApp) {
    
    this.shopKeeperUrlAndroidApp = shopKeeperUrlAndroidApp;
    return this;
  }

   /**
   * 
   * @return shopKeeperUrlAndroidApp
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrlAndroidApp() {
    return shopKeeperUrlAndroidApp;
  }


  public void setShopKeeperUrlAndroidApp(String shopKeeperUrlAndroidApp) {
    this.shopKeeperUrlAndroidApp = shopKeeperUrlAndroidApp;
  }


  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperUrlIosApp(String shopKeeperUrlIosApp) {
    
    this.shopKeeperUrlIosApp = shopKeeperUrlIosApp;
    return this;
  }

   /**
   * 
   * @return shopKeeperUrlIosApp
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrlIosApp() {
    return shopKeeperUrlIosApp;
  }


  public void setShopKeeperUrlIosApp(String shopKeeperUrlIosApp) {
    this.shopKeeperUrlIosApp = shopKeeperUrlIosApp;
  }


  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperUrlMobile(String shopKeeperUrlMobile) {
    
    this.shopKeeperUrlMobile = shopKeeperUrlMobile;
    return this;
  }

   /**
   * 
   * @return shopKeeperUrlMobile
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrlMobile() {
    return shopKeeperUrlMobile;
  }


  public void setShopKeeperUrlMobile(String shopKeeperUrlMobile) {
    this.shopKeeperUrlMobile = shopKeeperUrlMobile;
  }


  public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo shopKeeperUrlUniversalLink(String shopKeeperUrlUniversalLink) {
    
    this.shopKeeperUrlUniversalLink = shopKeeperUrlUniversalLink;
    return this;
  }

   /**
   * 
   * @return shopKeeperUrlUniversalLink
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrlUniversalLink() {
    return shopKeeperUrlUniversalLink;
  }


  public void setShopKeeperUrlUniversalLink(String shopKeeperUrlUniversalLink) {
    this.shopKeeperUrlUniversalLink = shopKeeperUrlUniversalLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaDetailGetV2ResponseDataListInnerShopKeeperInfo dpaDetailGetV2ResponseDataListInnerShopKeeperInfo = (DpaDetailGetV2ResponseDataListInnerShopKeeperInfo) o;
    return Objects.equals(this.address, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.address) &&
        Objects.equals(this.shopKeeperId, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.shopKeeperId) &&
        Objects.equals(this.shopKeeperName, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.shopKeeperName) &&
        Objects.equals(this.shopKeeperUrl, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.shopKeeperUrl) &&
        Objects.equals(this.shopKeeperUrlAndroidApp, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.shopKeeperUrlAndroidApp) &&
        Objects.equals(this.shopKeeperUrlIosApp, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.shopKeeperUrlIosApp) &&
        Objects.equals(this.shopKeeperUrlMobile, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.shopKeeperUrlMobile) &&
        Objects.equals(this.shopKeeperUrlUniversalLink, dpaDetailGetV2ResponseDataListInnerShopKeeperInfo.shopKeeperUrlUniversalLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, shopKeeperId, shopKeeperName, shopKeeperUrl, shopKeeperUrlAndroidApp, shopKeeperUrlIosApp, shopKeeperUrlMobile, shopKeeperUrlUniversalLink);
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
    sb.append("class DpaDetailGetV2ResponseDataListInnerShopKeeperInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    shopKeeperId: ").append(toIndentedString(shopKeeperId)).append("\n");
    sb.append("    shopKeeperName: ").append(toIndentedString(shopKeeperName)).append("\n");
    sb.append("    shopKeeperUrl: ").append(toIndentedString(shopKeeperUrl)).append("\n");
    sb.append("    shopKeeperUrlAndroidApp: ").append(toIndentedString(shopKeeperUrlAndroidApp)).append("\n");
    sb.append("    shopKeeperUrlIosApp: ").append(toIndentedString(shopKeeperUrlIosApp)).append("\n");
    sb.append("    shopKeeperUrlMobile: ").append(toIndentedString(shopKeeperUrlMobile)).append("\n");
    sb.append("    shopKeeperUrlUniversalLink: ").append(toIndentedString(shopKeeperUrlUniversalLink)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("shop_keeper_id");
    openapiFields.add("shop_keeper_name");
    openapiFields.add("shop_keeper_url");
    openapiFields.add("shop_keeper_url_android_app");
    openapiFields.add("shop_keeper_url_ios_app");
    openapiFields.add("shop_keeper_url_mobile");
    openapiFields.add("shop_keeper_url_universal_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaDetailGetV2ResponseDataListInnerShopKeeperInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaDetailGetV2ResponseDataListInnerShopKeeperInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaDetailGetV2ResponseDataListInnerShopKeeperInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaDetailGetV2ResponseDataListInnerShopKeeperInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaDetailGetV2ResponseDataListInnerShopKeeperInfo>() {
           @Override
           public void write(JsonWriter out, DpaDetailGetV2ResponseDataListInnerShopKeeperInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaDetailGetV2ResponseDataListInnerShopKeeperInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaDetailGetV2ResponseDataListInnerShopKeeperInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaDetailGetV2ResponseDataListInnerShopKeeperInfo
  * @throws IOException if the JSON string is invalid with respect to DpaDetailGetV2ResponseDataListInnerShopKeeperInfo
  */
  public static DpaDetailGetV2ResponseDataListInnerShopKeeperInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaDetailGetV2ResponseDataListInnerShopKeeperInfo.class);
  }

 /**
  * Convert an instance of DpaDetailGetV2ResponseDataListInnerShopKeeperInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

