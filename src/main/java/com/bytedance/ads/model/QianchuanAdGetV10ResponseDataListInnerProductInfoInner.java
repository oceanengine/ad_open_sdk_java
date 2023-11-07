/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdGetV10DataListProductInfoChannelType;
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
 * QianchuanAdGetV10ResponseDataListInnerProductInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class QianchuanAdGetV10ResponseDataListInnerProductInfoInner {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private Long channelId = null;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private QianchuanAdGetV10DataListProductInfoChannelType channelType = null;

  public static final String SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE = "discount_higher_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE)
  private Double discountHigherPrice = null;

  public static final String SERIALIZED_NAME_DISCOUNT_LOWER_PRICE = "discount_lower_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LOWER_PRICE)
  private Double discountLowerPrice = null;

  public static final String SERIALIZED_NAME_DISCOUNT_PRICE = "discount_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PRICE)
  private Double discountPrice = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img = null;

  public static final String SERIALIZED_NAME_MARKET_PRICE = "market_price";
  @SerializedName(SERIALIZED_NAME_MARKET_PRICE)
  private Double marketPrice = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner() {
  }

  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner channelId(Long channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 
   * @return channelId
  **/
  @javax.annotation.Nullable
  public Long getChannelId() {
    return channelId;
  }


  public void setChannelId(Long channelId) {
    this.channelId = channelId;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner channelType(QianchuanAdGetV10DataListProductInfoChannelType channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10DataListProductInfoChannelType getChannelType() {
    return channelType;
  }


  public void setChannelType(QianchuanAdGetV10DataListProductInfoChannelType channelType) {
    this.channelType = channelType;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner discountHigherPrice(Double discountHigherPrice) {
    
    this.discountHigherPrice = discountHigherPrice;
    return this;
  }

   /**
   * 
   * @return discountHigherPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountHigherPrice() {
    return discountHigherPrice;
  }


  public void setDiscountHigherPrice(Double discountHigherPrice) {
    this.discountHigherPrice = discountHigherPrice;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner discountLowerPrice(Double discountLowerPrice) {
    
    this.discountLowerPrice = discountLowerPrice;
    return this;
  }

   /**
   * 
   * @return discountLowerPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountLowerPrice() {
    return discountLowerPrice;
  }


  public void setDiscountLowerPrice(Double discountLowerPrice) {
    this.discountLowerPrice = discountLowerPrice;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner discountPrice(Double discountPrice) {
    
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * 
   * @return discountPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountPrice() {
    return discountPrice;
  }


  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner img(String img) {
    
    this.img = img;
    return this;
  }

   /**
   * 
   * @return img
  **/
  @javax.annotation.Nullable
  public String getImg() {
    return img;
  }


  public void setImg(String img) {
    this.img = img;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner marketPrice(Double marketPrice) {
    
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * 
   * @return marketPrice
  **/
  @javax.annotation.Nullable
  public Double getMarketPrice() {
    return marketPrice;
  }


  public void setMarketPrice(Double marketPrice) {
    this.marketPrice = marketPrice;
  }


  public QianchuanAdGetV10ResponseDataListInnerProductInfoInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
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
    QianchuanAdGetV10ResponseDataListInnerProductInfoInner qianchuanAdGetV10ResponseDataListInnerProductInfoInner = (QianchuanAdGetV10ResponseDataListInnerProductInfoInner) o;
    return Objects.equals(this.channelId, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.channelId) &&
        Objects.equals(this.channelType, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.channelType) &&
        Objects.equals(this.discountHigherPrice, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.discountHigherPrice) &&
        Objects.equals(this.discountLowerPrice, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.discountLowerPrice) &&
        Objects.equals(this.discountPrice, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.discountPrice) &&
        Objects.equals(this.id, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.id) &&
        Objects.equals(this.img, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.img) &&
        Objects.equals(this.marketPrice, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.marketPrice) &&
        Objects.equals(this.name, qianchuanAdGetV10ResponseDataListInnerProductInfoInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelType, discountHigherPrice, discountLowerPrice, discountPrice, id, img, marketPrice, name);
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
    sb.append("class QianchuanAdGetV10ResponseDataListInnerProductInfoInner {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    discountHigherPrice: ").append(toIndentedString(discountHigherPrice)).append("\n");
    sb.append("    discountLowerPrice: ").append(toIndentedString(discountLowerPrice)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
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
    openapiFields.add("channel_id");
    openapiFields.add("channel_type");
    openapiFields.add("discount_higher_price");
    openapiFields.add("discount_lower_price");
    openapiFields.add("discount_price");
    openapiFields.add("id");
    openapiFields.add("img");
    openapiFields.add("market_price");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdGetV10ResponseDataListInnerProductInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdGetV10ResponseDataListInnerProductInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdGetV10ResponseDataListInnerProductInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdGetV10ResponseDataListInnerProductInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdGetV10ResponseDataListInnerProductInfoInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdGetV10ResponseDataListInnerProductInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdGetV10ResponseDataListInnerProductInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdGetV10ResponseDataListInnerProductInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdGetV10ResponseDataListInnerProductInfoInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdGetV10ResponseDataListInnerProductInfoInner
  */
  public static QianchuanAdGetV10ResponseDataListInnerProductInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdGetV10ResponseDataListInnerProductInfoInner.class);
  }

 /**
  * Convert an instance of QianchuanAdGetV10ResponseDataListInnerProductInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

