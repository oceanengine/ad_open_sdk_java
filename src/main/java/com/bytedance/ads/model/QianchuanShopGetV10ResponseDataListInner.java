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
 * QianchuanShopGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanShopGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private Long shopId = null;

  public static final String SERIALIZED_NAME_SHOP_NAME = "shop_name";
  @SerializedName(SERIALIZED_NAME_SHOP_NAME)
  private String shopName = null;

  public QianchuanShopGetV10ResponseDataListInner() {
  }

  public QianchuanShopGetV10ResponseDataListInner shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 
   * @return shopId
  **/
  @javax.annotation.Nullable
  public Long getShopId() {
    return shopId;
  }


  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public QianchuanShopGetV10ResponseDataListInner shopName(String shopName) {
    
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
    QianchuanShopGetV10ResponseDataListInner qianchuanShopGetV10ResponseDataListInner = (QianchuanShopGetV10ResponseDataListInner) o;
    return Objects.equals(this.shopId, qianchuanShopGetV10ResponseDataListInner.shopId) &&
        Objects.equals(this.shopName, qianchuanShopGetV10ResponseDataListInner.shopName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopId, shopName);
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
    sb.append("class QianchuanShopGetV10ResponseDataListInner {\n");
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
    openapiFields.add("shop_id");
    openapiFields.add("shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanShopGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanShopGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanShopGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanShopGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanShopGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanShopGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanShopGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanShopGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanShopGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanShopGetV10ResponseDataListInner
  */
  public static QianchuanShopGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanShopGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanShopGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

