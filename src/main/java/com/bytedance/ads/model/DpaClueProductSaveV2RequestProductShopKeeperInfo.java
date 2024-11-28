/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
 * 商家信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class DpaClueProductSaveV2RequestProductShopKeeperInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_ID = "shop_keeper_id";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_ID)
  private String shopKeeperId = null;

  public static final String SERIALIZED_NAME_SHOP_KEEPER_LOGO = "shop_keeper_logo";
  @SerializedName(SERIALIZED_NAME_SHOP_KEEPER_LOGO)
  private String shopKeeperLogo = null;

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

  public DpaClueProductSaveV2RequestProductShopKeeperInfo() {
  }

  public DpaClueProductSaveV2RequestProductShopKeeperInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 商家地址
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperId(String shopKeeperId) {
    
    this.shopKeeperId = shopKeeperId;
    return this;
  }

   /**
   * 商家ID
   * @return shopKeeperId
  **/
  @javax.annotation.Nullable
  public String getShopKeeperId() {
    return shopKeeperId;
  }


  public void setShopKeeperId(String shopKeeperId) {
    this.shopKeeperId = shopKeeperId;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperLogo(String shopKeeperLogo) {
    
    this.shopKeeperLogo = shopKeeperLogo;
    return this;
  }

   /**
   * 商家logo
   * @return shopKeeperLogo
  **/
  @javax.annotation.Nullable
  public String getShopKeeperLogo() {
    return shopKeeperLogo;
  }


  public void setShopKeeperLogo(String shopKeeperLogo) {
    this.shopKeeperLogo = shopKeeperLogo;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperName(String shopKeeperName) {
    
    this.shopKeeperName = shopKeeperName;
    return this;
  }

   /**
   * 商家名称
   * @return shopKeeperName
  **/
  @javax.annotation.Nullable
  public String getShopKeeperName() {
    return shopKeeperName;
  }


  public void setShopKeeperName(String shopKeeperName) {
    this.shopKeeperName = shopKeeperName;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperUrl(String shopKeeperUrl) {
    
    this.shopKeeperUrl = shopKeeperUrl;
    return this;
  }

   /**
   * 商家落地页
   * @return shopKeeperUrl
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrl() {
    return shopKeeperUrl;
  }


  public void setShopKeeperUrl(String shopKeeperUrl) {
    this.shopKeeperUrl = shopKeeperUrl;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperUrlAndroidApp(String shopKeeperUrlAndroidApp) {
    
    this.shopKeeperUrlAndroidApp = shopKeeperUrlAndroidApp;
    return this;
  }

   /**
   * 商家安卓落地页
   * @return shopKeeperUrlAndroidApp
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrlAndroidApp() {
    return shopKeeperUrlAndroidApp;
  }


  public void setShopKeeperUrlAndroidApp(String shopKeeperUrlAndroidApp) {
    this.shopKeeperUrlAndroidApp = shopKeeperUrlAndroidApp;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperUrlIosApp(String shopKeeperUrlIosApp) {
    
    this.shopKeeperUrlIosApp = shopKeeperUrlIosApp;
    return this;
  }

   /**
   * 商家iOS落地页
   * @return shopKeeperUrlIosApp
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrlIosApp() {
    return shopKeeperUrlIosApp;
  }


  public void setShopKeeperUrlIosApp(String shopKeeperUrlIosApp) {
    this.shopKeeperUrlIosApp = shopKeeperUrlIosApp;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperUrlMobile(String shopKeeperUrlMobile) {
    
    this.shopKeeperUrlMobile = shopKeeperUrlMobile;
    return this;
  }

   /**
   * 商家H5落地页
   * @return shopKeeperUrlMobile
  **/
  @javax.annotation.Nullable
  public String getShopKeeperUrlMobile() {
    return shopKeeperUrlMobile;
  }


  public void setShopKeeperUrlMobile(String shopKeeperUrlMobile) {
    this.shopKeeperUrlMobile = shopKeeperUrlMobile;
  }


  public DpaClueProductSaveV2RequestProductShopKeeperInfo shopKeeperUrlUniversalLink(String shopKeeperUrlUniversalLink) {
    
    this.shopKeeperUrlUniversalLink = shopKeeperUrlUniversalLink;
    return this;
  }

   /**
   * 商家落地页universal link
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
    DpaClueProductSaveV2RequestProductShopKeeperInfo dpaClueProductSaveV2RequestProductShopKeeperInfo = (DpaClueProductSaveV2RequestProductShopKeeperInfo) o;
    return Objects.equals(this.address, dpaClueProductSaveV2RequestProductShopKeeperInfo.address) &&
        Objects.equals(this.shopKeeperId, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperId) &&
        Objects.equals(this.shopKeeperLogo, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperLogo) &&
        Objects.equals(this.shopKeeperName, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperName) &&
        Objects.equals(this.shopKeeperUrl, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperUrl) &&
        Objects.equals(this.shopKeeperUrlAndroidApp, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperUrlAndroidApp) &&
        Objects.equals(this.shopKeeperUrlIosApp, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperUrlIosApp) &&
        Objects.equals(this.shopKeeperUrlMobile, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperUrlMobile) &&
        Objects.equals(this.shopKeeperUrlUniversalLink, dpaClueProductSaveV2RequestProductShopKeeperInfo.shopKeeperUrlUniversalLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, shopKeeperId, shopKeeperLogo, shopKeeperName, shopKeeperUrl, shopKeeperUrlAndroidApp, shopKeeperUrlIosApp, shopKeeperUrlMobile, shopKeeperUrlUniversalLink);
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
    sb.append("class DpaClueProductSaveV2RequestProductShopKeeperInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    shopKeeperId: ").append(toIndentedString(shopKeeperId)).append("\n");
    sb.append("    shopKeeperLogo: ").append(toIndentedString(shopKeeperLogo)).append("\n");
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
    openapiFields.add("shop_keeper_logo");
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
       if (!DpaClueProductSaveV2RequestProductShopKeeperInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductSaveV2RequestProductShopKeeperInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductSaveV2RequestProductShopKeeperInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductSaveV2RequestProductShopKeeperInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductSaveV2RequestProductShopKeeperInfo>() {
           @Override
           public void write(JsonWriter out, DpaClueProductSaveV2RequestProductShopKeeperInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductSaveV2RequestProductShopKeeperInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductSaveV2RequestProductShopKeeperInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductSaveV2RequestProductShopKeeperInfo
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductSaveV2RequestProductShopKeeperInfo
  */
  public static DpaClueProductSaveV2RequestProductShopKeeperInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductSaveV2RequestProductShopKeeperInfo.class);
  }

 /**
  * Convert an instance of DpaClueProductSaveV2RequestProductShopKeeperInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

