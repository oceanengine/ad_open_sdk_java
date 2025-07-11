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
import com.bytedance.ads.model.DpaAssetsListV2DataListAssetType;
import com.bytedance.ads.model.DpaAssetsListV2DataListAuditStatus;
import com.bytedance.ads.model.DpaAssetsListV2DataListSource;
import com.bytedance.ads.model.DpaAssetsListV2DataListStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * DpaAssetsListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class DpaAssetsListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ASSET_CREATE_TIME = "asset_create_time";
  @SerializedName(SERIALIZED_NAME_ASSET_CREATE_TIME)
  private String assetCreateTime = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_ASSET_MODIFY_TIME = "asset_modify_time";
  @SerializedName(SERIALIZED_NAME_ASSET_MODIFY_TIME)
  private String assetModifyTime = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private DpaAssetsListV2DataListAssetType assetType = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private DpaAssetsListV2DataListAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_PLATFORM_ID = "platform_id";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ID)
  private Long platformId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private DpaAssetsListV2DataListSource source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DpaAssetsListV2DataListStatus status = null;

  public DpaAssetsListV2ResponseDataListInner() {
  }

  public DpaAssetsListV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DpaAssetsListV2ResponseDataListInner assetCreateTime(String assetCreateTime) {
    
    this.assetCreateTime = assetCreateTime;
    return this;
  }

   /**
   * 
   * @return assetCreateTime
  **/
  @javax.annotation.Nullable
  public String getAssetCreateTime() {
    return assetCreateTime;
  }


  public void setAssetCreateTime(String assetCreateTime) {
    this.assetCreateTime = assetCreateTime;
  }


  public DpaAssetsListV2ResponseDataListInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public DpaAssetsListV2ResponseDataListInner assetModifyTime(String assetModifyTime) {
    
    this.assetModifyTime = assetModifyTime;
    return this;
  }

   /**
   * 
   * @return assetModifyTime
  **/
  @javax.annotation.Nullable
  public String getAssetModifyTime() {
    return assetModifyTime;
  }


  public void setAssetModifyTime(String assetModifyTime) {
    this.assetModifyTime = assetModifyTime;
  }


  public DpaAssetsListV2ResponseDataListInner assetType(DpaAssetsListV2DataListAssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
  public DpaAssetsListV2DataListAssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(DpaAssetsListV2DataListAssetType assetType) {
    this.assetType = assetType;
  }


  public DpaAssetsListV2ResponseDataListInner auditStatus(DpaAssetsListV2DataListAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public DpaAssetsListV2DataListAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(DpaAssetsListV2DataListAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public DpaAssetsListV2ResponseDataListInner platformId(Long platformId) {
    
    this.platformId = platformId;
    return this;
  }

   /**
   * 
   * @return platformId
  **/
  @javax.annotation.Nullable
  public Long getPlatformId() {
    return platformId;
  }


  public void setPlatformId(Long platformId) {
    this.platformId = platformId;
  }


  public DpaAssetsListV2ResponseDataListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public DpaAssetsListV2ResponseDataListInner source(DpaAssetsListV2DataListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public DpaAssetsListV2DataListSource getSource() {
    return source;
  }


  public void setSource(DpaAssetsListV2DataListSource source) {
    this.source = source;
  }


  public DpaAssetsListV2ResponseDataListInner status(DpaAssetsListV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DpaAssetsListV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(DpaAssetsListV2DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaAssetsListV2ResponseDataListInner dpaAssetsListV2ResponseDataListInner = (DpaAssetsListV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, dpaAssetsListV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.assetCreateTime, dpaAssetsListV2ResponseDataListInner.assetCreateTime) &&
        Objects.equals(this.assetId, dpaAssetsListV2ResponseDataListInner.assetId) &&
        Objects.equals(this.assetModifyTime, dpaAssetsListV2ResponseDataListInner.assetModifyTime) &&
        Objects.equals(this.assetType, dpaAssetsListV2ResponseDataListInner.assetType) &&
        Objects.equals(this.auditStatus, dpaAssetsListV2ResponseDataListInner.auditStatus) &&
        Objects.equals(this.platformId, dpaAssetsListV2ResponseDataListInner.platformId) &&
        Objects.equals(this.productId, dpaAssetsListV2ResponseDataListInner.productId) &&
        Objects.equals(this.source, dpaAssetsListV2ResponseDataListInner.source) &&
        Objects.equals(this.status, dpaAssetsListV2ResponseDataListInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, assetCreateTime, assetId, assetModifyTime, assetType, auditStatus, platformId, productId, source, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaAssetsListV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    assetCreateTime: ").append(toIndentedString(assetCreateTime)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetModifyTime: ").append(toIndentedString(assetModifyTime)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("asset_create_time");
    openapiFields.add("asset_id");
    openapiFields.add("asset_modify_time");
    openapiFields.add("asset_type");
    openapiFields.add("audit_status");
    openapiFields.add("platform_id");
    openapiFields.add("product_id");
    openapiFields.add("source");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaAssetsListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaAssetsListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaAssetsListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaAssetsListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaAssetsListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, DpaAssetsListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaAssetsListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaAssetsListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaAssetsListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to DpaAssetsListV2ResponseDataListInner
  */
  public static DpaAssetsListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaAssetsListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of DpaAssetsListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

