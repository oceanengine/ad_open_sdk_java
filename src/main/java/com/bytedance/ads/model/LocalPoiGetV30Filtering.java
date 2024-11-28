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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class LocalPoiGetV30Filtering {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private List<Long> province = null;

  public static final String SERIALIZED_NAME_SEARCH_KEY_WORD = "search_key_word";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEY_WORD)
  private String searchKeyWord = null;

  public LocalPoiGetV30Filtering() {
  }

  public LocalPoiGetV30Filtering city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public LocalPoiGetV30Filtering addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 根据门店所在城市id筛选
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public LocalPoiGetV30Filtering productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品ID，当需要获取商品适用门店时填入
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public LocalPoiGetV30Filtering province(List<Long> province) {
    
    this.province = province;
    return this;
  }

  public LocalPoiGetV30Filtering addProvinceItem(Long provinceItem) {
    if (this.province == null) {
      this.province = new ArrayList<>();
    }
    this.province.add(provinceItem);
    return this;
  }

   /**
   * 根据门店所在省份id筛选
   * @return province
  **/
  @javax.annotation.Nullable
  public List<Long> getProvince() {
    return province;
  }


  public void setProvince(List<Long> province) {
    this.province = province;
  }


  public LocalPoiGetV30Filtering searchKeyWord(String searchKeyWord) {
    
    this.searchKeyWord = searchKeyWord;
    return this;
  }

   /**
   * 根据门店名称/门店ID筛选，门店名称支持模糊搜索，门店ID支持精确搜索。
   * @return searchKeyWord
  **/
  @javax.annotation.Nullable
  public String getSearchKeyWord() {
    return searchKeyWord;
  }


  public void setSearchKeyWord(String searchKeyWord) {
    this.searchKeyWord = searchKeyWord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPoiGetV30Filtering localPoiGetV30Filtering = (LocalPoiGetV30Filtering) o;
    return Objects.equals(this.city, localPoiGetV30Filtering.city) &&
        Objects.equals(this.productId, localPoiGetV30Filtering.productId) &&
        Objects.equals(this.province, localPoiGetV30Filtering.province) &&
        Objects.equals(this.searchKeyWord, localPoiGetV30Filtering.searchKeyWord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, productId, province, searchKeyWord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalPoiGetV30Filtering {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    searchKeyWord: ").append(toIndentedString(searchKeyWord)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("product_id");
    openapiFields.add("province");
    openapiFields.add("search_key_word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPoiGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPoiGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPoiGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPoiGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPoiGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalPoiGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPoiGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPoiGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPoiGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalPoiGetV30Filtering
  */
  public static LocalPoiGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPoiGetV30Filtering.class);
  }

 /**
  * Convert an instance of LocalPoiGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

