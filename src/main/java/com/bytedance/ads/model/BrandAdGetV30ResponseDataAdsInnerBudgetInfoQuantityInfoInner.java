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
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation;
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
 * BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner {
  public static final String SERIALIZED_NAME_BUSINESS_ID = "business_id";
  @SerializedName(SERIALIZED_NAME_BUSINESS_ID)
  private Long businessId = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private Long city = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_GEOLOCATION = "geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation geolocation = null;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity = null;

  public static final String SERIALIZED_NAME_QUANTITY_TYPE = "quantity_type";
  @SerializedName(SERIALIZED_NAME_QUANTITY_TYPE)
  private Long quantityType = null;

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner() {
  }

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner businessId(Long businessId) {
    
    this.businessId = businessId;
    return this;
  }

   /**
   * 上传商圈Id
   * @return businessId
  **/
  @javax.annotation.Nullable
  public Long getBusinessId() {
    return businessId;
  }


  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner city(Long city) {
    
    this.city = city;
    return this;
  }

   /**
   * 城市
   * @return city
  **/
  @javax.annotation.Nullable
  public Long getCity() {
    return city;
  }


  public void setCity(Long city) {
    this.city = city;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期,格式\&quot;2020-01-01\&quot;
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner geolocation(BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

   /**
   * Get geolocation
   * @return geolocation
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation getGeolocation() {
    return geolocation;
  }


  public void setGeolocation(BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInnerGeolocation geolocation) {
    this.geolocation = geolocation;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * 预定量
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner quantityType(Long quantityType) {
    
    this.quantityType = quantityType;
    return this;
  }

   /**
   * 预定类型
   * @return quantityType
  **/
  @javax.annotation.Nullable
  public Long getQuantityType() {
    return quantityType;
  }


  public void setQuantityType(Long quantityType) {
    this.quantityType = quantityType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner = (BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner) o;
    return Objects.equals(this.businessId, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.businessId) &&
        Objects.equals(this.city, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.city) &&
        Objects.equals(this.date, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.date) &&
        Objects.equals(this.geolocation, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.geolocation) &&
        Objects.equals(this.quantity, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.quantity) &&
        Objects.equals(this.quantityType, brandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.quantityType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, city, date, geolocation, quantity, quantityType);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner {\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityType: ").append(toIndentedString(quantityType)).append("\n");
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
    openapiFields.add("business_id");
    openapiFields.add("city");
    openapiFields.add("date");
    openapiFields.add("geolocation");
    openapiFields.add("quantity");
    openapiFields.add("quantity_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner
  */
  public static BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

