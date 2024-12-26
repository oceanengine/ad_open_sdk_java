/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon {
  public static final String SERIALIZED_NAME_BUTTON_NAME = "button_name";
  @SerializedName(SERIALIZED_NAME_BUTTON_NAME)
  private String buttonName = null;

  public static final String SERIALIZED_NAME_COUPON_ID = "coupon_id";
  @SerializedName(SERIALIZED_NAME_COUPON_ID)
  private Long couponId = null;

  public static final String SERIALIZED_NAME_FORM_URL = "form_url";
  @SerializedName(SERIALIZED_NAME_FORM_URL)
  private String formUrl = null;

  public static final String SERIALIZED_NAME_TIMES = "times";
  @SerializedName(SERIALIZED_NAME_TIMES)
  private Long times = null;

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon() {
  }

  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon buttonName(String buttonName) {
    
    this.buttonName = buttonName;
    return this;
  }

   /**
   * 
   * @return buttonName
  **/
  @javax.annotation.Nullable
  public String getButtonName() {
    return buttonName;
  }


  public void setButtonName(String buttonName) {
    this.buttonName = buttonName;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon couponId(Long couponId) {
    
    this.couponId = couponId;
    return this;
  }

   /**
   * 
   * @return couponId
  **/
  @javax.annotation.Nullable
  public Long getCouponId() {
    return couponId;
  }


  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon formUrl(String formUrl) {
    
    this.formUrl = formUrl;
    return this;
  }

   /**
   * 
   * @return formUrl
  **/
  @javax.annotation.Nullable
  public String getFormUrl() {
    return formUrl;
  }


  public void setFormUrl(String formUrl) {
    this.formUrl = formUrl;
  }


  public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon times(Long times) {
    
    this.times = times;
    return this;
  }

   /**
   * 
   * @return times
  **/
  @javax.annotation.Nullable
  public Long getTimes() {
    return times;
  }


  public void setTimes(Long times) {
    this.times = times;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon = (BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon) o;
    return Objects.equals(this.buttonName, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon.buttonName) &&
        Objects.equals(this.couponId, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon.couponId) &&
        Objects.equals(this.formUrl, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon.formUrl) &&
        Objects.equals(this.times, brandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon.times);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonName, couponId, formUrl, times);
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
    sb.append("class BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon {\n");
    sb.append("    buttonName: ").append(toIndentedString(buttonName)).append("\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    formUrl: ").append(toIndentedString(formUrl)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
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
    openapiFields.add("button_name");
    openapiFields.add("coupon_id");
    openapiFields.add("form_url");
    openapiFields.add("times");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon>() {
           @Override
           public void write(JsonWriter out, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon
  */
  public static BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon.class);
  }

 /**
  * Convert an instance of BrandMaterialListV30ResponseDataMaterialsInnerMaterialComponentCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

