/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DpaAssetV2ListV2RequestFiltering;
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
 * DpaAssetV2ListV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class DpaAssetV2ListV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_FILTERING = "filtering";
  @SerializedName(SERIALIZED_NAME_FILTERING)
  private DpaAssetV2ListV2RequestFiltering filtering = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = null;

  public static final String SERIALIZED_NAME_UNIQUE_PRODUCT_IDS = "unique_product_ids";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PRODUCT_IDS)
  private List<Long> uniqueProductIds = null;

  public DpaAssetV2ListV2Request() {
  }

  public DpaAssetV2ListV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DpaAssetV2ListV2Request filtering(DpaAssetV2ListV2RequestFiltering filtering) {
    
    this.filtering = filtering;
    return this;
  }

   /**
   * Get filtering
   * @return filtering
  **/
  @javax.annotation.Nullable
  public DpaAssetV2ListV2RequestFiltering getFiltering() {
    return filtering;
  }


  public void setFiltering(DpaAssetV2ListV2RequestFiltering filtering) {
    this.filtering = filtering;
  }


  public DpaAssetV2ListV2Request page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * 页码， 默认值: 1
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public DpaAssetV2ListV2Request pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页面数据量， 默认值: 10，最大 100
   * minimum: 1
   * maximum: 100
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public DpaAssetV2ListV2Request uniqueProductIds(List<Long> uniqueProductIds) {
    
    this.uniqueProductIds = uniqueProductIds;
    return this;
  }

  public DpaAssetV2ListV2Request addUniqueProductIdsItem(Long uniqueProductIdsItem) {
    if (this.uniqueProductIds == null) {
      this.uniqueProductIds = new ArrayList<>();
    }
    this.uniqueProductIds.add(uniqueProductIdsItem);
    return this;
  }

   /**
   * 新线索商品ID列表，最多传入100个
   * @return uniqueProductIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getUniqueProductIds() {
    return uniqueProductIds;
  }


  public void setUniqueProductIds(List<Long> uniqueProductIds) {
    this.uniqueProductIds = uniqueProductIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaAssetV2ListV2Request dpaAssetV2ListV2Request = (DpaAssetV2ListV2Request) o;
    return Objects.equals(this.advertiserId, dpaAssetV2ListV2Request.advertiserId) &&
        Objects.equals(this.filtering, dpaAssetV2ListV2Request.filtering) &&
        Objects.equals(this.page, dpaAssetV2ListV2Request.page) &&
        Objects.equals(this.pageSize, dpaAssetV2ListV2Request.pageSize) &&
        Objects.equals(this.uniqueProductIds, dpaAssetV2ListV2Request.uniqueProductIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, filtering, page, pageSize, uniqueProductIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaAssetV2ListV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    filtering: ").append(toIndentedString(filtering)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    uniqueProductIds: ").append(toIndentedString(uniqueProductIds)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("filtering");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("unique_product_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("unique_product_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaAssetV2ListV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaAssetV2ListV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaAssetV2ListV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaAssetV2ListV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaAssetV2ListV2Request>() {
           @Override
           public void write(JsonWriter out, DpaAssetV2ListV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaAssetV2ListV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaAssetV2ListV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaAssetV2ListV2Request
  * @throws IOException if the JSON string is invalid with respect to DpaAssetV2ListV2Request
  */
  public static DpaAssetV2ListV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaAssetV2ListV2Request.class);
  }

 /**
  * Convert an instance of DpaAssetV2ListV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

