/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DpaClueProductListV2FilteringAuditStatus;
import com.bytedance.ads.model.DpaClueProductListV2FilteringCompletionStatus;
import com.bytedance.ads.model.DpaClueProductListV2FilteringRels;
import com.bytedance.ads.model.DpaClueProductListV2FilteringStatuses;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class DpaClueProductListV2Filtering {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private List<DpaClueProductListV2FilteringAuditStatus> auditStatus = null;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "category_ids";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<Long> categoryIds = null;

  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName = null;

  public static final String SERIALIZED_NAME_COMPLETION_STATUS = "completion_status";
  @SerializedName(SERIALIZED_NAME_COMPLETION_STATUS)
  private List<DpaClueProductListV2FilteringCompletionStatus> completionStatus = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID_OR_NAME_SEARCH = "product_id_or_name_search";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID_OR_NAME_SEARCH)
  private String productIdOrNameSearch = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_RELS = "rels";
  @SerializedName(SERIALIZED_NAME_RELS)
  private List<DpaClueProductListV2FilteringRels> rels = null;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<DpaClueProductListV2FilteringStatuses> statuses = null;

  public DpaClueProductListV2Filtering() {
  }

  public DpaClueProductListV2Filtering auditStatus(List<DpaClueProductListV2FilteringAuditStatus> auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

  public DpaClueProductListV2Filtering addAuditStatusItem(DpaClueProductListV2FilteringAuditStatus auditStatusItem) {
    if (this.auditStatus == null) {
      this.auditStatus = new ArrayList<>();
    }
    this.auditStatus.add(auditStatusItem);
    return this;
  }

   /**
   * 商品审核状态
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public List<DpaClueProductListV2FilteringAuditStatus> getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(List<DpaClueProductListV2FilteringAuditStatus> auditStatus) {
    this.auditStatus = auditStatus;
  }


  public DpaClueProductListV2Filtering categoryIds(List<Long> categoryIds) {
    
    this.categoryIds = categoryIds;
    return this;
  }

  public DpaClueProductListV2Filtering addCategoryIdsItem(Long categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * 类目id，会级联查询所有叶子类目
   * @return categoryIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCategoryIds() {
    return categoryIds;
  }


  public void setCategoryIds(List<Long> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public DpaClueProductListV2Filtering categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 类目名称，支持模糊搜索
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public DpaClueProductListV2Filtering completionStatus(List<DpaClueProductListV2FilteringCompletionStatus> completionStatus) {
    
    this.completionStatus = completionStatus;
    return this;
  }

  public DpaClueProductListV2Filtering addCompletionStatusItem(DpaClueProductListV2FilteringCompletionStatus completionStatusItem) {
    if (this.completionStatus == null) {
      this.completionStatus = new ArrayList<>();
    }
    this.completionStatus.add(completionStatusItem);
    return this;
  }

   /**
   * 商品必填字段完整性
   * @return completionStatus
  **/
  @javax.annotation.Nullable
  public List<DpaClueProductListV2FilteringCompletionStatus> getCompletionStatus() {
    return completionStatus;
  }


  public void setCompletionStatus(List<DpaClueProductListV2FilteringCompletionStatus> completionStatus) {
    this.completionStatus = completionStatus;
  }


  public DpaClueProductListV2Filtering productIdOrNameSearch(String productIdOrNameSearch) {
    
    this.productIdOrNameSearch = productIdOrNameSearch;
    return this;
  }

   /**
   * 商品ID或商品名称查询
   * @return productIdOrNameSearch
  **/
  @javax.annotation.Nullable
  public String getProductIdOrNameSearch() {
    return productIdOrNameSearch;
  }


  public void setProductIdOrNameSearch(String productIdOrNameSearch) {
    this.productIdOrNameSearch = productIdOrNameSearch;
  }


  public DpaClueProductListV2Filtering productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public DpaClueProductListV2Filtering addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 商品ID精确搜索
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }


  public DpaClueProductListV2Filtering productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 商品名称模糊搜索
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public DpaClueProductListV2Filtering rels(List<DpaClueProductListV2FilteringRels> rels) {
    
    this.rels = rels;
    return this;
  }

  public DpaClueProductListV2Filtering addRelsItem(DpaClueProductListV2FilteringRels relsItem) {
    if (this.rels == null) {
      this.rels = new ArrayList<>();
    }
    this.rels.add(relsItem);
    return this;
  }

   /**
   * 商品权限关系过滤
   * @return rels
  **/
  @javax.annotation.Nullable
  public List<DpaClueProductListV2FilteringRels> getRels() {
    return rels;
  }


  public void setRels(List<DpaClueProductListV2FilteringRels> rels) {
    this.rels = rels;
  }


  public DpaClueProductListV2Filtering statuses(List<DpaClueProductListV2FilteringStatuses> statuses) {
    
    this.statuses = statuses;
    return this;
  }

  public DpaClueProductListV2Filtering addStatusesItem(DpaClueProductListV2FilteringStatuses statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * 可投状态过滤
   * @return statuses
  **/
  @javax.annotation.Nullable
  public List<DpaClueProductListV2FilteringStatuses> getStatuses() {
    return statuses;
  }


  public void setStatuses(List<DpaClueProductListV2FilteringStatuses> statuses) {
    this.statuses = statuses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaClueProductListV2Filtering dpaClueProductListV2Filtering = (DpaClueProductListV2Filtering) o;
    return Objects.equals(this.auditStatus, dpaClueProductListV2Filtering.auditStatus) &&
        Objects.equals(this.categoryIds, dpaClueProductListV2Filtering.categoryIds) &&
        Objects.equals(this.categoryName, dpaClueProductListV2Filtering.categoryName) &&
        Objects.equals(this.completionStatus, dpaClueProductListV2Filtering.completionStatus) &&
        Objects.equals(this.productIdOrNameSearch, dpaClueProductListV2Filtering.productIdOrNameSearch) &&
        Objects.equals(this.productIds, dpaClueProductListV2Filtering.productIds) &&
        Objects.equals(this.productName, dpaClueProductListV2Filtering.productName) &&
        Objects.equals(this.rels, dpaClueProductListV2Filtering.rels) &&
        Objects.equals(this.statuses, dpaClueProductListV2Filtering.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, categoryIds, categoryName, completionStatus, productIdOrNameSearch, productIds, productName, rels, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaClueProductListV2Filtering {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    productIdOrNameSearch: ").append(toIndentedString(productIdOrNameSearch)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    rels: ").append(toIndentedString(rels)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("category_ids");
    openapiFields.add("category_name");
    openapiFields.add("completion_status");
    openapiFields.add("product_id_or_name_search");
    openapiFields.add("product_ids");
    openapiFields.add("product_name");
    openapiFields.add("rels");
    openapiFields.add("statuses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaClueProductListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductListV2Filtering>() {
           @Override
           public void write(JsonWriter out, DpaClueProductListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductListV2Filtering
  */
  public static DpaClueProductListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductListV2Filtering.class);
  }

 /**
  * Convert an instance of DpaClueProductListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

