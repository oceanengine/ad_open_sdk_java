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
 * LocalPoiGetV30ResponseDataPoiListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class LocalPoiGetV30ResponseDataPoiListInner {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private String district = null;

  public static final String SERIALIZED_NAME_EXISTS_PRODUCT = "exists_product";
  @SerializedName(SERIALIZED_NAME_EXISTS_PRODUCT)
  private Boolean existsProduct = null;

  public static final String SERIALIZED_NAME_POI_ADDRESS = "poi_address";
  @SerializedName(SERIALIZED_NAME_POI_ADDRESS)
  private String poiAddress = null;

  public static final String SERIALIZED_NAME_POI_ID = "poi_id";
  @SerializedName(SERIALIZED_NAME_POI_ID)
  private Long poiId = null;

  public static final String SERIALIZED_NAME_POI_NAME = "poi_name";
  @SerializedName(SERIALIZED_NAME_POI_NAME)
  private String poiName = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province = null;

  public LocalPoiGetV30ResponseDataPoiListInner() {
  }

  public LocalPoiGetV30ResponseDataPoiListInner city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 所在城市
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public LocalPoiGetV30ResponseDataPoiListInner district(String district) {
    
    this.district = district;
    return this;
  }

   /**
   * 所在区
   * @return district
  **/
  @javax.annotation.Nullable
  public String getDistrict() {
    return district;
  }


  public void setDistrict(String district) {
    this.district = district;
  }


  public LocalPoiGetV30ResponseDataPoiListInner existsProduct(Boolean existsProduct) {
    
    this.existsProduct = existsProduct;
    return this;
  }

   /**
   * 门店下有无商品
   * @return existsProduct
  **/
  @javax.annotation.Nullable
  public Boolean getExistsProduct() {
    return existsProduct;
  }


  public void setExistsProduct(Boolean existsProduct) {
    this.existsProduct = existsProduct;
  }


  public LocalPoiGetV30ResponseDataPoiListInner poiAddress(String poiAddress) {
    
    this.poiAddress = poiAddress;
    return this;
  }

   /**
   * 门店地址
   * @return poiAddress
  **/
  @javax.annotation.Nullable
  public String getPoiAddress() {
    return poiAddress;
  }


  public void setPoiAddress(String poiAddress) {
    this.poiAddress = poiAddress;
  }


  public LocalPoiGetV30ResponseDataPoiListInner poiId(Long poiId) {
    
    this.poiId = poiId;
    return this;
  }

   /**
   * 门店ID
   * @return poiId
  **/
  @javax.annotation.Nullable
  public Long getPoiId() {
    return poiId;
  }


  public void setPoiId(Long poiId) {
    this.poiId = poiId;
  }


  public LocalPoiGetV30ResponseDataPoiListInner poiName(String poiName) {
    
    this.poiName = poiName;
    return this;
  }

   /**
   * 门店名称
   * @return poiName
  **/
  @javax.annotation.Nullable
  public String getPoiName() {
    return poiName;
  }


  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }


  public LocalPoiGetV30ResponseDataPoiListInner province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 所在省份
   * @return province
  **/
  @javax.annotation.Nullable
  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPoiGetV30ResponseDataPoiListInner localPoiGetV30ResponseDataPoiListInner = (LocalPoiGetV30ResponseDataPoiListInner) o;
    return Objects.equals(this.city, localPoiGetV30ResponseDataPoiListInner.city) &&
        Objects.equals(this.district, localPoiGetV30ResponseDataPoiListInner.district) &&
        Objects.equals(this.existsProduct, localPoiGetV30ResponseDataPoiListInner.existsProduct) &&
        Objects.equals(this.poiAddress, localPoiGetV30ResponseDataPoiListInner.poiAddress) &&
        Objects.equals(this.poiId, localPoiGetV30ResponseDataPoiListInner.poiId) &&
        Objects.equals(this.poiName, localPoiGetV30ResponseDataPoiListInner.poiName) &&
        Objects.equals(this.province, localPoiGetV30ResponseDataPoiListInner.province);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, district, existsProduct, poiAddress, poiId, poiName, province);
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
    sb.append("class LocalPoiGetV30ResponseDataPoiListInner {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    existsProduct: ").append(toIndentedString(existsProduct)).append("\n");
    sb.append("    poiAddress: ").append(toIndentedString(poiAddress)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
    openapiFields.add("district");
    openapiFields.add("exists_product");
    openapiFields.add("poi_address");
    openapiFields.add("poi_id");
    openapiFields.add("poi_name");
    openapiFields.add("province");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPoiGetV30ResponseDataPoiListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPoiGetV30ResponseDataPoiListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPoiGetV30ResponseDataPoiListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPoiGetV30ResponseDataPoiListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPoiGetV30ResponseDataPoiListInner>() {
           @Override
           public void write(JsonWriter out, LocalPoiGetV30ResponseDataPoiListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPoiGetV30ResponseDataPoiListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPoiGetV30ResponseDataPoiListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPoiGetV30ResponseDataPoiListInner
  * @throws IOException if the JSON string is invalid with respect to LocalPoiGetV30ResponseDataPoiListInner
  */
  public static LocalPoiGetV30ResponseDataPoiListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPoiGetV30ResponseDataPoiListInner.class);
  }

 /**
  * Convert an instance of LocalPoiGetV30ResponseDataPoiListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

