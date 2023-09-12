/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner;
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
 * AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_SUPPLEMENTS = "supplements";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTS)
  private List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner> supplements = null;

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner() {
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 投放条件id
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品id
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner productPlatformId(Long productPlatformId) {
    
    this.productPlatformId = productPlatformId;
    return this;
  }

   /**
   * 商品库id
   * @return productPlatformId
  **/
  @javax.annotation.Nullable
  public Long getProductPlatformId() {
    return productPlatformId;
  }


  public void setProductPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner supplements(List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner> supplements) {
    
    this.supplements = supplements;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner addSupplementsItem(AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner supplementsItem) {
    if (this.supplements == null) {
      this.supplements = new ArrayList<>();
    }
    this.supplements.add(supplementsItem);
    return this;
  }

   /**
   * 附属商品信息
   * @return supplements
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner> getSupplements() {
    return supplements;
  }


  public void setSupplements(List<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInner> supplements) {
    this.supplements = supplements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner = (AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner) o;
    return Objects.equals(this.assetId, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner.assetId) &&
        Objects.equals(this.productId, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner.productId) &&
        Objects.equals(this.productPlatformId, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner.productPlatformId) &&
        Objects.equals(this.supplements, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner.supplements);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, productId, productPlatformId, supplements);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
    sb.append("    supplements: ").append(toIndentedString(supplements)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("product_id");
    openapiFields.add("product_platform_id");
    openapiFields.add("supplements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner
  */
  public static AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

