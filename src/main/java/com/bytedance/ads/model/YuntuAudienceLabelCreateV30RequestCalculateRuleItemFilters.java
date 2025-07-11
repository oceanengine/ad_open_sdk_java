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
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30CalculateRuleItemFiltersContentTypeList;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30CalculateRuleItemFiltersOnlySelfBrand;
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
 * 内容条件。
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters {
  public static final String SERIALIZED_NAME_CONTENT_TYPE_LIST = "content_type_list";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE_LIST)
  private List<YuntuAudienceLabelCreateV30CalculateRuleItemFiltersContentTypeList> contentTypeList = null;

  public static final String SERIALIZED_NAME_ECOM_CATEGORIES = "ecom_categories";
  @SerializedName(SERIALIZED_NAME_ECOM_CATEGORIES)
  private List<String> ecomCategories = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType matchType = null;

  public static final String SERIALIZED_NAME_MAX_PRICE = "max_price";
  @SerializedName(SERIALIZED_NAME_MAX_PRICE)
  private Double maxPrice = null;

  public static final String SERIALIZED_NAME_MIN_PRICE = "min_price";
  @SerializedName(SERIALIZED_NAME_MIN_PRICE)
  private Double minPrice = null;

  public static final String SERIALIZED_NAME_ONLY_SELF_BRAND = "only_self_brand";
  @SerializedName(SERIALIZED_NAME_ONLY_SELF_BRAND)
  private YuntuAudienceLabelCreateV30CalculateRuleItemFiltersOnlySelfBrand onlySelfBrand = null;

  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters() {
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters contentTypeList(List<YuntuAudienceLabelCreateV30CalculateRuleItemFiltersContentTypeList> contentTypeList) {
    
    this.contentTypeList = contentTypeList;
    return this;
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters addContentTypeListItem(YuntuAudienceLabelCreateV30CalculateRuleItemFiltersContentTypeList contentTypeListItem) {
    if (this.contentTypeList == null) {
      this.contentTypeList = new ArrayList<>();
    }
    this.contentTypeList.add(contentTypeListItem);
    return this;
  }

   /**
   * 内容类别列表。创建商品人群标签时必传，其他人群标签勿传。其中商品人群标签下场景为不限时，需传入 3、4、5 三个元素。含义详见枚举包。
   * @return contentTypeList
  **/
  @javax.annotation.Nullable
  public List<YuntuAudienceLabelCreateV30CalculateRuleItemFiltersContentTypeList> getContentTypeList() {
    return contentTypeList;
  }


  public void setContentTypeList(List<YuntuAudienceLabelCreateV30CalculateRuleItemFiltersContentTypeList> contentTypeList) {
    this.contentTypeList = contentTypeList;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters ecomCategories(List<String> ecomCategories) {
    
    this.ecomCategories = ecomCategories;
    return this;
  }

  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters addEcomCategoriesItem(String ecomCategoriesItem) {
    if (this.ecomCategories == null) {
      this.ecomCategories = new ArrayList<>();
    }
    this.ecomCategories.add(ecomCategoriesItem);
    return this;
  }

   /**
   * 商品类目列表。字符串数组，每个元素为由英文逗号分隔拼接的、一级类目ID至四级类目ID字符串。
   * @return ecomCategories
  **/
  @javax.annotation.Nullable
  public List<String> getEcomCategories() {
    return ecomCategories;
  }


  public void setEcomCategories(List<String> ecomCategories) {
    this.ecomCategories = ecomCategories;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters matchType(YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(YuntuAudienceLabelCreateV30CalculateRuleItemFiltersMatchType matchType) {
    this.matchType = matchType;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters maxPrice(Double maxPrice) {
    
    this.maxPrice = maxPrice;
    return this;
  }

   /**
   * 商品价格最大值。区间为 [0.02, 9999999.00]。min_price &lt; max_price。
   * minimum: 0.02
   * maximum: 9999999.0
   * @return maxPrice
  **/
  @javax.annotation.Nullable
  public Double getMaxPrice() {
    return maxPrice;
  }


  public void setMaxPrice(Double maxPrice) {
    this.maxPrice = maxPrice;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters minPrice(Double minPrice) {
    
    this.minPrice = minPrice;
    return this;
  }

   /**
   * 商品价格最小值。区间为 [0.01, 9999999.00)
   * minimum: 0.01
   * maximum: 9999999.0
   * @return minPrice
  **/
  @javax.annotation.Nullable
  public Double getMinPrice() {
    return minPrice;
  }


  public void setMinPrice(Double minPrice) {
    this.minPrice = minPrice;
  }


  public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters onlySelfBrand(YuntuAudienceLabelCreateV30CalculateRuleItemFiltersOnlySelfBrand onlySelfBrand) {
    
    this.onlySelfBrand = onlySelfBrand;
    return this;
  }

   /**
   * Get onlySelfBrand
   * @return onlySelfBrand
  **/
  @javax.annotation.Nullable
  public YuntuAudienceLabelCreateV30CalculateRuleItemFiltersOnlySelfBrand getOnlySelfBrand() {
    return onlySelfBrand;
  }


  public void setOnlySelfBrand(YuntuAudienceLabelCreateV30CalculateRuleItemFiltersOnlySelfBrand onlySelfBrand) {
    this.onlySelfBrand = onlySelfBrand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters yuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters = (YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters) o;
    return Objects.equals(this.contentTypeList, yuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.contentTypeList) &&
        Objects.equals(this.ecomCategories, yuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.ecomCategories) &&
        Objects.equals(this.matchType, yuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.matchType) &&
        Objects.equals(this.maxPrice, yuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.maxPrice) &&
        Objects.equals(this.minPrice, yuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.minPrice) &&
        Objects.equals(this.onlySelfBrand, yuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.onlySelfBrand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentTypeList, ecomCategories, matchType, maxPrice, minPrice, onlySelfBrand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters {\n");
    sb.append("    contentTypeList: ").append(toIndentedString(contentTypeList)).append("\n");
    sb.append("    ecomCategories: ").append(toIndentedString(ecomCategories)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    onlySelfBrand: ").append(toIndentedString(onlySelfBrand)).append("\n");
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
    openapiFields.add("content_type_list");
    openapiFields.add("ecom_categories");
    openapiFields.add("match_type");
    openapiFields.add("max_price");
    openapiFields.add("min_price");
    openapiFields.add("only_self_brand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("match_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters
  */
  public static YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters.class);
  }

 /**
  * Convert an instance of YuntuAudienceLabelCreateV30RequestCalculateRuleItemFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

