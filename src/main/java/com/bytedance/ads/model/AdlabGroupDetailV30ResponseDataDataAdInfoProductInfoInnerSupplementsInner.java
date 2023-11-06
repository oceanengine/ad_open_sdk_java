/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataAdInfoProductInfoSupplementsSupplementType;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner {
  public static final String SERIALIZED_NAME_AUXILIARY_PRODUCTS = "auxiliary_products";
  @SerializedName(SERIALIZED_NAME_AUXILIARY_PRODUCTS)
  private List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner> auxiliaryProducts = null;

  public static final String SERIALIZED_NAME_SUPPLEMENT_TYPE = "supplement_type";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_TYPE)
  private AdlabGroupDetailV30DataDataAdInfoProductInfoSupplementsSupplementType supplementType = null;

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner() {
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner auxiliaryProducts(List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner> auxiliaryProducts) {
    
    this.auxiliaryProducts = auxiliaryProducts;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner addAuxiliaryProductsItem(AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner auxiliaryProductsItem) {
    if (this.auxiliaryProducts == null) {
      this.auxiliaryProducts = new ArrayList<>();
    }
    this.auxiliaryProducts.add(auxiliaryProductsItem);
    return this;
  }

   /**
   * 附属商品
   * @return auxiliaryProducts
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner> getAuxiliaryProducts() {
    return auxiliaryProducts;
  }


  public void setAuxiliaryProducts(List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner> auxiliaryProducts) {
    this.auxiliaryProducts = auxiliaryProducts;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner supplementType(AdlabGroupDetailV30DataDataAdInfoProductInfoSupplementsSupplementType supplementType) {
    
    this.supplementType = supplementType;
    return this;
  }

   /**
   * Get supplementType
   * @return supplementType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataAdInfoProductInfoSupplementsSupplementType getSupplementType() {
    return supplementType;
  }


  public void setSupplementType(AdlabGroupDetailV30DataDataAdInfoProductInfoSupplementsSupplementType supplementType) {
    this.supplementType = supplementType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner = (AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner) o;
    return Objects.equals(this.auxiliaryProducts, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner.auxiliaryProducts) &&
        Objects.equals(this.supplementType, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner.supplementType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxiliaryProducts, supplementType);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner {\n");
    sb.append("    auxiliaryProducts: ").append(toIndentedString(auxiliaryProducts)).append("\n");
    sb.append("    supplementType: ").append(toIndentedString(supplementType)).append("\n");
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
    openapiFields.add("auxiliary_products");
    openapiFields.add("supplement_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner
  */
  public static AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

