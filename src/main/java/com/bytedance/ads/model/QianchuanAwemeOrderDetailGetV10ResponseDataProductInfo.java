/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
 * 商品信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo {
  public static final String SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE = "discount_higher_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE)
  private Double discountHigherPrice = null;

  public static final String SERIALIZED_NAME_DISCOUNT_LOWER_PRICE = "discount_lower_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LOWER_PRICE)
  private Double discountLowerPrice = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo discountHigherPrice(Double discountHigherPrice) {
    
    this.discountHigherPrice = discountHigherPrice;
    return this;
  }

   /**
   * 折扣价区间最大值，单位为元
   * @return discountHigherPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountHigherPrice() {
    return discountHigherPrice;
  }


  public void setDiscountHigherPrice(Double discountHigherPrice) {
    this.discountHigherPrice = discountHigherPrice;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo discountLowerPrice(Double discountLowerPrice) {
    
    this.discountLowerPrice = discountLowerPrice;
    return this;
  }

   /**
   * 折扣价区间最小值，单位为元
   * @return discountLowerPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountLowerPrice() {
    return discountLowerPrice;
  }


  public void setDiscountLowerPrice(Double discountLowerPrice) {
    this.discountLowerPrice = discountLowerPrice;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 商品id
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo img(String img) {
    
    this.img = img;
    return this;
  }

   /**
   * 商品主图
   * @return img
  **/
  @javax.annotation.Nullable
  public String getImg() {
    return img;
  }


  public void setImg(String img) {
    this.img = img;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商品名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo qianchuanAwemeOrderDetailGetV10ResponseDataProductInfo = (QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo) o;
    return Objects.equals(this.discountHigherPrice, qianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.discountHigherPrice) &&
        Objects.equals(this.discountLowerPrice, qianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.discountLowerPrice) &&
        Objects.equals(this.id, qianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.id) &&
        Objects.equals(this.img, qianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.img) &&
        Objects.equals(this.name, qianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountHigherPrice, discountLowerPrice, id, img, name);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo {\n");
    sb.append("    discountHigherPrice: ").append(toIndentedString(discountHigherPrice)).append("\n");
    sb.append("    discountLowerPrice: ").append(toIndentedString(discountLowerPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("discount_higher_price");
    openapiFields.add("discount_lower_price");
    openapiFields.add("id");
    openapiFields.add("img");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
