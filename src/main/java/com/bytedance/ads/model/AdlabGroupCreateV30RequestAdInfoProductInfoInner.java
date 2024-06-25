/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestAdInfoProductInfoInnerSupplementsInner;
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
 * AdlabGroupCreateV30RequestAdInfoProductInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class AdlabGroupCreateV30RequestAdInfoProductInfoInner {
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
  private List<AdlabGroupCreateV30RequestAdInfoProductInfoInnerSupplementsInner> supplements = null;

  public AdlabGroupCreateV30RequestAdInfoProductInfoInner() {
  }

  public AdlabGroupCreateV30RequestAdInfoProductInfoInner assetId(Long assetId) {
    
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


  public AdlabGroupCreateV30RequestAdInfoProductInfoInner productId(Long productId) {
    
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


  public AdlabGroupCreateV30RequestAdInfoProductInfoInner productPlatformId(Long productPlatformId) {
    
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


  public AdlabGroupCreateV30RequestAdInfoProductInfoInner supplements(List<AdlabGroupCreateV30RequestAdInfoProductInfoInnerSupplementsInner> supplements) {
    
    this.supplements = supplements;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoProductInfoInner addSupplementsItem(AdlabGroupCreateV30RequestAdInfoProductInfoInnerSupplementsInner supplementsItem) {
    if (this.supplements == null) {
      this.supplements = new ArrayList<>();
    }
    this.supplements.add(supplementsItem);
    return this;
  }

   /**
   * 附属商品信息，当推广目的为LINK销售线索收集时可选
   * @return supplements
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30RequestAdInfoProductInfoInnerSupplementsInner> getSupplements() {
    return supplements;
  }


  public void setSupplements(List<AdlabGroupCreateV30RequestAdInfoProductInfoInnerSupplementsInner> supplements) {
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
    AdlabGroupCreateV30RequestAdInfoProductInfoInner adlabGroupCreateV30RequestAdInfoProductInfoInner = (AdlabGroupCreateV30RequestAdInfoProductInfoInner) o;
    return Objects.equals(this.assetId, adlabGroupCreateV30RequestAdInfoProductInfoInner.assetId) &&
        Objects.equals(this.productId, adlabGroupCreateV30RequestAdInfoProductInfoInner.productId) &&
        Objects.equals(this.productPlatformId, adlabGroupCreateV30RequestAdInfoProductInfoInner.productPlatformId) &&
        Objects.equals(this.supplements, adlabGroupCreateV30RequestAdInfoProductInfoInner.supplements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, productId, productPlatformId, supplements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestAdInfoProductInfoInner {\n");
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
       if (!AdlabGroupCreateV30RequestAdInfoProductInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestAdInfoProductInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestAdInfoProductInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestAdInfoProductInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestAdInfoProductInfoInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestAdInfoProductInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestAdInfoProductInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestAdInfoProductInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestAdInfoProductInfoInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestAdInfoProductInfoInner
  */
  public static AdlabGroupCreateV30RequestAdInfoProductInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestAdInfoProductInfoInner.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestAdInfoProductInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

