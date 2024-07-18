/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsProductInfoProductImageType;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsProductInfoProductNameType;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsProductInfoProductSellingPointType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class PromotionUpdateV30RequestPromotionMaterialsProductInfo {
  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_FIELDS = "product_image_fields";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_FIELDS)
  private List<String> productImageFields = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_TYPE = "product_image_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_TYPE)
  private PromotionUpdateV30PromotionMaterialsProductInfoProductImageType productImageType = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME_FIELDS = "product_name_fields";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_FIELDS)
  private List<String> productNameFields = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME_TYPE = "product_name_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_TYPE)
  private PromotionUpdateV30PromotionMaterialsProductInfoProductNameType productNameType = null;

  public static final String SERIALIZED_NAME_PRODUCT_SELLING_POINT_FIELDS = "product_selling_point_fields";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SELLING_POINT_FIELDS)
  private List<String> productSellingPointFields = null;

  public static final String SERIALIZED_NAME_PRODUCT_SELLING_POINT_TYPE = "product_selling_point_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SELLING_POINT_TYPE)
  private PromotionUpdateV30PromotionMaterialsProductInfoProductSellingPointType productSellingPointType = null;

  public static final String SERIALIZED_NAME_SELLING_POINTS = "selling_points";
  @SerializedName(SERIALIZED_NAME_SELLING_POINTS)
  private List<String> sellingPoints = null;

  public static final String SERIALIZED_NAME_TITLES = "titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = null;

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo() {
  }

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo productImageFields(List<String> productImageFields) {
    
    this.productImageFields = productImageFields;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo addProductImageFieldsItem(String productImageFieldsItem) {
    if (this.productImageFields == null) {
      this.productImageFields = new ArrayList<>();
    }
    this.productImageFields.add(productImageFieldsItem);
    return this;
  }

   /**
   * 
   * @return productImageFields
  **/
  @javax.annotation.Nullable
  public List<String> getProductImageFields() {
    return productImageFields;
  }


  public void setProductImageFields(List<String> productImageFields) {
    this.productImageFields = productImageFields;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo productImageType(PromotionUpdateV30PromotionMaterialsProductInfoProductImageType productImageType) {
    
    this.productImageType = productImageType;
    return this;
  }

   /**
   * Get productImageType
   * @return productImageType
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsProductInfoProductImageType getProductImageType() {
    return productImageType;
  }


  public void setProductImageType(PromotionUpdateV30PromotionMaterialsProductInfoProductImageType productImageType) {
    this.productImageType = productImageType;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo productNameFields(List<String> productNameFields) {
    
    this.productNameFields = productNameFields;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo addProductNameFieldsItem(String productNameFieldsItem) {
    if (this.productNameFields == null) {
      this.productNameFields = new ArrayList<>();
    }
    this.productNameFields.add(productNameFieldsItem);
    return this;
  }

   /**
   * 
   * @return productNameFields
  **/
  @javax.annotation.Nullable
  public List<String> getProductNameFields() {
    return productNameFields;
  }


  public void setProductNameFields(List<String> productNameFields) {
    this.productNameFields = productNameFields;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo productNameType(PromotionUpdateV30PromotionMaterialsProductInfoProductNameType productNameType) {
    
    this.productNameType = productNameType;
    return this;
  }

   /**
   * Get productNameType
   * @return productNameType
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsProductInfoProductNameType getProductNameType() {
    return productNameType;
  }


  public void setProductNameType(PromotionUpdateV30PromotionMaterialsProductInfoProductNameType productNameType) {
    this.productNameType = productNameType;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo productSellingPointFields(List<String> productSellingPointFields) {
    
    this.productSellingPointFields = productSellingPointFields;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo addProductSellingPointFieldsItem(String productSellingPointFieldsItem) {
    if (this.productSellingPointFields == null) {
      this.productSellingPointFields = new ArrayList<>();
    }
    this.productSellingPointFields.add(productSellingPointFieldsItem);
    return this;
  }

   /**
   * 
   * @return productSellingPointFields
  **/
  @javax.annotation.Nullable
  public List<String> getProductSellingPointFields() {
    return productSellingPointFields;
  }


  public void setProductSellingPointFields(List<String> productSellingPointFields) {
    this.productSellingPointFields = productSellingPointFields;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo productSellingPointType(PromotionUpdateV30PromotionMaterialsProductInfoProductSellingPointType productSellingPointType) {
    
    this.productSellingPointType = productSellingPointType;
    return this;
  }

   /**
   * Get productSellingPointType
   * @return productSellingPointType
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsProductInfoProductSellingPointType getProductSellingPointType() {
    return productSellingPointType;
  }


  public void setProductSellingPointType(PromotionUpdateV30PromotionMaterialsProductInfoProductSellingPointType productSellingPointType) {
    this.productSellingPointType = productSellingPointType;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo sellingPoints(List<String> sellingPoints) {
    
    this.sellingPoints = sellingPoints;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo addSellingPointsItem(String sellingPointsItem) {
    if (this.sellingPoints == null) {
      this.sellingPoints = new ArrayList<>();
    }
    this.sellingPoints.add(sellingPointsItem);
    return this;
  }

   /**
   * 
   * @return sellingPoints
  **/
  @javax.annotation.Nullable
  public List<String> getSellingPoints() {
    return sellingPoints;
  }


  public void setSellingPoints(List<String> sellingPoints) {
    this.sellingPoints = sellingPoints;
  }


  public PromotionUpdateV30RequestPromotionMaterialsProductInfo titles(List<String> titles) {
    
    this.titles = titles;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsProductInfo addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * 
   * @return titles
  **/
  @javax.annotation.Nullable
  public List<String> getTitles() {
    return titles;
  }


  public void setTitles(List<String> titles) {
    this.titles = titles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterialsProductInfo promotionUpdateV30RequestPromotionMaterialsProductInfo = (PromotionUpdateV30RequestPromotionMaterialsProductInfo) o;
    return Objects.equals(this.imageIds, promotionUpdateV30RequestPromotionMaterialsProductInfo.imageIds) &&
        Objects.equals(this.productImageFields, promotionUpdateV30RequestPromotionMaterialsProductInfo.productImageFields) &&
        Objects.equals(this.productImageType, promotionUpdateV30RequestPromotionMaterialsProductInfo.productImageType) &&
        Objects.equals(this.productNameFields, promotionUpdateV30RequestPromotionMaterialsProductInfo.productNameFields) &&
        Objects.equals(this.productNameType, promotionUpdateV30RequestPromotionMaterialsProductInfo.productNameType) &&
        Objects.equals(this.productSellingPointFields, promotionUpdateV30RequestPromotionMaterialsProductInfo.productSellingPointFields) &&
        Objects.equals(this.productSellingPointType, promotionUpdateV30RequestPromotionMaterialsProductInfo.productSellingPointType) &&
        Objects.equals(this.sellingPoints, promotionUpdateV30RequestPromotionMaterialsProductInfo.sellingPoints) &&
        Objects.equals(this.titles, promotionUpdateV30RequestPromotionMaterialsProductInfo.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageIds, productImageFields, productImageType, productNameFields, productNameType, productSellingPointFields, productSellingPointType, sellingPoints, titles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterialsProductInfo {\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    productImageFields: ").append(toIndentedString(productImageFields)).append("\n");
    sb.append("    productImageType: ").append(toIndentedString(productImageType)).append("\n");
    sb.append("    productNameFields: ").append(toIndentedString(productNameFields)).append("\n");
    sb.append("    productNameType: ").append(toIndentedString(productNameType)).append("\n");
    sb.append("    productSellingPointFields: ").append(toIndentedString(productSellingPointFields)).append("\n");
    sb.append("    productSellingPointType: ").append(toIndentedString(productSellingPointType)).append("\n");
    sb.append("    sellingPoints: ").append(toIndentedString(sellingPoints)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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
    openapiFields.add("image_ids");
    openapiFields.add("product_image_fields");
    openapiFields.add("product_image_type");
    openapiFields.add("product_name_fields");
    openapiFields.add("product_name_type");
    openapiFields.add("product_selling_point_fields");
    openapiFields.add("product_selling_point_type");
    openapiFields.add("selling_points");
    openapiFields.add("titles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterialsProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterialsProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterialsProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsProductInfo>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterialsProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterialsProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterialsProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterialsProductInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterialsProductInfo
  */
  public static PromotionUpdateV30RequestPromotionMaterialsProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterialsProductInfo.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterialsProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

