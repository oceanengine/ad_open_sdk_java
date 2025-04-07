/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsProductInfoProductImageType;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsProductInfoProductNameType;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsProductInfoProductSellingPointType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo {
  public static final String SERIALIZED_NAME_ECHO_IMAGE_IDS = "echo_image_ids";
  @SerializedName(SERIALIZED_NAME_ECHO_IMAGE_IDS)
  private List<String> echoImageIds = null;

  public static final String SERIALIZED_NAME_ECHO_TITLES = "echo_titles";
  @SerializedName(SERIALIZED_NAME_ECHO_TITLES)
  private List<String> echoTitles = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_FIELDS = "product_image_fields";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_FIELDS)
  private List<String> productImageFields = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_TYPE = "product_image_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_TYPE)
  private PromotionListV30DataListPromotionMaterialsProductInfoProductImageType productImageType = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME_FIELDS = "product_name_fields";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_FIELDS)
  private List<String> productNameFields = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME_TYPE = "product_name_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME_TYPE)
  private PromotionListV30DataListPromotionMaterialsProductInfoProductNameType productNameType = null;

  public static final String SERIALIZED_NAME_PRODUCT_SELLING_POINT_FIELDS = "product_selling_point_fields";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SELLING_POINT_FIELDS)
  private List<String> productSellingPointFields = null;

  public static final String SERIALIZED_NAME_PRODUCT_SELLING_POINT_TYPE = "product_selling_point_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SELLING_POINT_TYPE)
  private PromotionListV30DataListPromotionMaterialsProductInfoProductSellingPointType productSellingPointType = null;

  public static final String SERIALIZED_NAME_SELLING_POINTS = "selling_points";
  @SerializedName(SERIALIZED_NAME_SELLING_POINTS)
  private List<String> sellingPoints = null;

  public static final String SERIALIZED_NAME_TITLES = "titles";
  @SerializedName(SERIALIZED_NAME_TITLES)
  private List<String> titles = null;

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo echoImageIds(List<String> echoImageIds) {
    
    this.echoImageIds = echoImageIds;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addEchoImageIdsItem(String echoImageIdsItem) {
    if (this.echoImageIds == null) {
      this.echoImageIds = new ArrayList<>();
    }
    this.echoImageIds.add(echoImageIdsItem);
    return this;
  }

   /**
   * 
   * @return echoImageIds
  **/
  @javax.annotation.Nullable
  public List<String> getEchoImageIds() {
    return echoImageIds;
  }


  public void setEchoImageIds(List<String> echoImageIds) {
    this.echoImageIds = echoImageIds;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo echoTitles(List<String> echoTitles) {
    
    this.echoTitles = echoTitles;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addEchoTitlesItem(String echoTitlesItem) {
    if (this.echoTitles == null) {
      this.echoTitles = new ArrayList<>();
    }
    this.echoTitles.add(echoTitlesItem);
    return this;
  }

   /**
   * 
   * @return echoTitles
  **/
  @javax.annotation.Nullable
  public List<String> getEchoTitles() {
    return echoTitles;
  }


  public void setEchoTitles(List<String> echoTitles) {
    this.echoTitles = echoTitles;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addImageIdsItem(String imageIdsItem) {
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productImageFields(List<String> productImageFields) {
    
    this.productImageFields = productImageFields;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addProductImageFieldsItem(String productImageFieldsItem) {
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productImageType(PromotionListV30DataListPromotionMaterialsProductInfoProductImageType productImageType) {
    
    this.productImageType = productImageType;
    return this;
  }

   /**
   * Get productImageType
   * @return productImageType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsProductInfoProductImageType getProductImageType() {
    return productImageType;
  }


  public void setProductImageType(PromotionListV30DataListPromotionMaterialsProductInfoProductImageType productImageType) {
    this.productImageType = productImageType;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productNameFields(List<String> productNameFields) {
    
    this.productNameFields = productNameFields;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addProductNameFieldsItem(String productNameFieldsItem) {
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productNameType(PromotionListV30DataListPromotionMaterialsProductInfoProductNameType productNameType) {
    
    this.productNameType = productNameType;
    return this;
  }

   /**
   * Get productNameType
   * @return productNameType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsProductInfoProductNameType getProductNameType() {
    return productNameType;
  }


  public void setProductNameType(PromotionListV30DataListPromotionMaterialsProductInfoProductNameType productNameType) {
    this.productNameType = productNameType;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productSellingPointFields(List<String> productSellingPointFields) {
    
    this.productSellingPointFields = productSellingPointFields;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addProductSellingPointFieldsItem(String productSellingPointFieldsItem) {
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo productSellingPointType(PromotionListV30DataListPromotionMaterialsProductInfoProductSellingPointType productSellingPointType) {
    
    this.productSellingPointType = productSellingPointType;
    return this;
  }

   /**
   * Get productSellingPointType
   * @return productSellingPointType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsProductInfoProductSellingPointType getProductSellingPointType() {
    return productSellingPointType;
  }


  public void setProductSellingPointType(PromotionListV30DataListPromotionMaterialsProductInfoProductSellingPointType productSellingPointType) {
    this.productSellingPointType = productSellingPointType;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo sellingPoints(List<String> sellingPoints) {
    
    this.sellingPoints = sellingPoints;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addSellingPointsItem(String sellingPointsItem) {
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo titles(List<String> titles) {
    
    this.titles = titles;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo addTitlesItem(String titlesItem) {
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
    PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo = (PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo) o;
    return Objects.equals(this.echoImageIds, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.echoImageIds) &&
        Objects.equals(this.echoTitles, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.echoTitles) &&
        Objects.equals(this.imageIds, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.imageIds) &&
        Objects.equals(this.productImageFields, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.productImageFields) &&
        Objects.equals(this.productImageType, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.productImageType) &&
        Objects.equals(this.productNameFields, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.productNameFields) &&
        Objects.equals(this.productNameType, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.productNameType) &&
        Objects.equals(this.productSellingPointFields, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.productSellingPointFields) &&
        Objects.equals(this.productSellingPointType, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.productSellingPointType) &&
        Objects.equals(this.sellingPoints, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.sellingPoints) &&
        Objects.equals(this.titles, promotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.titles);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(echoImageIds, echoTitles, imageIds, productImageFields, productImageType, productNameFields, productNameType, productSellingPointFields, productSellingPointType, sellingPoints, titles);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo {\n");
    sb.append("    echoImageIds: ").append(toIndentedString(echoImageIds)).append("\n");
    sb.append("    echoTitles: ").append(toIndentedString(echoTitles)).append("\n");
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
    openapiFields.add("echo_image_ids");
    openapiFields.add("echo_titles");
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
       if (!PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsProductInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

