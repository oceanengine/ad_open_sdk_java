/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorBannerImage;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorProductImage;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner;
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
 * 外跳锚点
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor {
  public static final String SERIALIZED_NAME_BANNER_DESCRIPTION = "banner_description";
  @SerializedName(SERIALIZED_NAME_BANNER_DESCRIPTION)
  private String bannerDescription = null;

  public static final String SERIALIZED_NAME_BANNER_IMAGE = "banner_image";
  @SerializedName(SERIALIZED_NAME_BANNER_IMAGE)
  private NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorBannerImage bannerImage = null;

  public static final String SERIALIZED_NAME_CONVERSION_BTN = "conversion_btn";
  @SerializedName(SERIALIZED_NAME_CONVERSION_BTN)
  private NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn conversionBtn = null;

  public static final String SERIALIZED_NAME_DETAIL_URL = "detail_url";
  @SerializedName(SERIALIZED_NAME_DETAIL_URL)
  private String detailUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTIONS = "product_descriptions";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTIONS)
  private List<String> productDescriptions = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE = "product_image";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE)
  private NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorProductImage productImage = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_SERVICE_DESCRIPTION = "product_service_description";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SERVICE_DESCRIPTION)
  private String productServiceDescription = null;

  public static final String SERIALIZED_NAME_PRODUCT_TAGS = "product_tags";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TAGS)
  private List<String> productTags = null;

  public static final String SERIALIZED_NAME_PRODUCT_TITLE = "product_title";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TITLE)
  private String productTitle = null;

  public static final String SERIALIZED_NAME_SINGLE_PRODUCT_INFO = "single_product_info";
  @SerializedName(SERIALIZED_NAME_SINGLE_PRODUCT_INFO)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner> singleProductInfo = null;

  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor bannerDescription(String bannerDescription) {
    
    this.bannerDescription = bannerDescription;
    return this;
  }

   /**
   * 详情介绍，1-18个字
   * @return bannerDescription
  **/
  @javax.annotation.Nullable
  public String getBannerDescription() {
    return bannerDescription;
  }


  public void setBannerDescription(String bannerDescription) {
    this.bannerDescription = bannerDescription;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor bannerImage(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorBannerImage bannerImage) {
    
    this.bannerImage = bannerImage;
    return this;
  }

   /**
   * Get bannerImage
   * @return bannerImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorBannerImage getBannerImage() {
    return bannerImage;
  }


  public void setBannerImage(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorBannerImage bannerImage) {
    this.bannerImage = bannerImage;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor conversionBtn(NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn conversionBtn) {
    
    this.conversionBtn = conversionBtn;
    return this;
  }

   /**
   * Get conversionBtn
   * @return conversionBtn
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn getConversionBtn() {
    return conversionBtn;
  }


  public void setConversionBtn(NativeAnchorGetDetailV30DataListInsuranceEnterpriseAnchorConversionBtn conversionBtn) {
    this.conversionBtn = conversionBtn;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor detailUrl(String detailUrl) {
    
    this.detailUrl = detailUrl;
    return this;
  }

   /**
   * 点击按钮时的跳转链接，此处填写的跳转链接会应用到“转化按钮”与“详情介绍”，以http开头
   * @return detailUrl
  **/
  @javax.annotation.Nullable
  public String getDetailUrl() {
    return detailUrl;
  }


  public void setDetailUrl(String detailUrl) {
    this.detailUrl = detailUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor productDescriptions(List<String> productDescriptions) {
    
    this.productDescriptions = productDescriptions;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor addProductDescriptionsItem(String productDescriptionsItem) {
    if (this.productDescriptions == null) {
      this.productDescriptions = new ArrayList<>();
    }
    this.productDescriptions.add(productDescriptionsItem);
    return this;
  }

   /**
   * 产品描述
   * @return productDescriptions
  **/
  @javax.annotation.Nullable
  public List<String> getProductDescriptions() {
    return productDescriptions;
  }


  public void setProductDescriptions(List<String> productDescriptions) {
    this.productDescriptions = productDescriptions;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor productImage(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorProductImage productImage) {
    
    this.productImage = productImage;
    return this;
  }

   /**
   * Get productImage
   * @return productImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorProductImage getProductImage() {
    return productImage;
  }


  public void setProductImage(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorProductImage productImage) {
    this.productImage = productImage;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 产品详情下的产品名称
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor productServiceDescription(String productServiceDescription) {
    
    this.productServiceDescription = productServiceDescription;
    return this;
  }

   /**
   * 服务描述，1-6字
   * @return productServiceDescription
  **/
  @javax.annotation.Nullable
  public String getProductServiceDescription() {
    return productServiceDescription;
  }


  public void setProductServiceDescription(String productServiceDescription) {
    this.productServiceDescription = productServiceDescription;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor productTags(List<String> productTags) {
    
    this.productTags = productTags;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

   /**
   * 产品特点，最多返回3个
   * @return productTags
  **/
  @javax.annotation.Nullable
  public List<String> getProductTags() {
    return productTags;
  }


  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * 产品名称，1-15字
   * @return productTitle
  **/
  @javax.annotation.Nullable
  public String getProductTitle() {
    return productTitle;
  }


  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor singleProductInfo(List<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner> singleProductInfo) {
    
    this.singleProductInfo = singleProductInfo;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor addSingleProductInfoItem(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner singleProductInfoItem) {
    if (this.singleProductInfo == null) {
      this.singleProductInfo = new ArrayList<>();
    }
    this.singleProductInfo.add(singleProductInfoItem);
    return this;
  }

   /**
   * 单项服务名称，5-10组
   * @return singleProductInfo
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner> getSingleProductInfo() {
    return singleProductInfo;
  }


  public void setSingleProductInfo(List<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchorSingleProductInfoInner> singleProductInfo) {
    this.singleProductInfo = singleProductInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor = (NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor) o;
    return Objects.equals(this.bannerDescription, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.bannerDescription) &&
        Objects.equals(this.bannerImage, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.bannerImage) &&
        Objects.equals(this.conversionBtn, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.conversionBtn) &&
        Objects.equals(this.detailUrl, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.detailUrl) &&
        Objects.equals(this.productDescriptions, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.productDescriptions) &&
        Objects.equals(this.productImage, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.productImage) &&
        Objects.equals(this.productName, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.productName) &&
        Objects.equals(this.productServiceDescription, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.productServiceDescription) &&
        Objects.equals(this.productTags, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.productTags) &&
        Objects.equals(this.productTitle, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.productTitle) &&
        Objects.equals(this.singleProductInfo, nativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.singleProductInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannerDescription, bannerImage, conversionBtn, detailUrl, productDescriptions, productImage, productName, productServiceDescription, productTags, productTitle, singleProductInfo);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor {\n");
    sb.append("    bannerDescription: ").append(toIndentedString(bannerDescription)).append("\n");
    sb.append("    bannerImage: ").append(toIndentedString(bannerImage)).append("\n");
    sb.append("    conversionBtn: ").append(toIndentedString(conversionBtn)).append("\n");
    sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
    sb.append("    productDescriptions: ").append(toIndentedString(productDescriptions)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productServiceDescription: ").append(toIndentedString(productServiceDescription)).append("\n");
    sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    singleProductInfo: ").append(toIndentedString(singleProductInfo)).append("\n");
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
    openapiFields.add("banner_description");
    openapiFields.add("banner_image");
    openapiFields.add("conversion_btn");
    openapiFields.add("detail_url");
    openapiFields.add("product_descriptions");
    openapiFields.add("product_image");
    openapiFields.add("product_name");
    openapiFields.add("product_service_description");
    openapiFields.add("product_tags");
    openapiFields.add("product_title");
    openapiFields.add("single_product_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerInsuranceEnterpriseAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

