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
import com.bytedance.ads.model.DpaAssetV2DetailReadV2DataAssetListAssetType;
import com.bytedance.ads.model.DpaAssetV2DetailReadV2DataAssetListAuditStatus;
import com.bytedance.ads.model.DpaAssetV2DetailReadV2DataAssetListSource;
import com.bytedance.ads.model.DpaAssetV2DetailReadV2DataAssetListStatus;
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
 * DpaAssetV2DetailReadV2ResponseDataAssetListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class DpaAssetV2DetailReadV2ResponseDataAssetListInner {
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

  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private DpaAssetV2DetailReadV2DataAssetListAssetType assetType = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private DpaAssetV2DetailReadV2DataAssetListAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private DpaAssetV2DetailReadV2DataAssetListSource source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DpaAssetV2DetailReadV2DataAssetListStatus status = null;

  public static final String SERIALIZED_NAME_UNIQUE_PRODUCT_ID = "unique_product_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PRODUCT_ID)
  private Long uniqueProductId = null;

  public DpaAssetV2DetailReadV2ResponseDataAssetListInner() {
  }

  public DpaAssetV2DetailReadV2ResponseDataAssetListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner assetCreateTime(String assetCreateTime) {
    
    this.assetCreateTime = assetCreateTime;
    return this;
  }

   /**
   * 投放条件创建时间，格式: yyyy-MM-dd HH:mm:ss
   * @return assetCreateTime
  **/
  @javax.annotation.Nullable
  public String getAssetCreateTime() {
    return assetCreateTime;
  }


  public void setAssetCreateTime(String assetCreateTime) {
    this.assetCreateTime = assetCreateTime;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner assetId(Long assetId) {
    
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


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner assetModifyTime(String assetModifyTime) {
    
    this.assetModifyTime = assetModifyTime;
    return this;
  }

   /**
   * 投放条件最近一次修改时间，格式: yyyy-MM-dd HH:mm:ss
   * @return assetModifyTime
  **/
  @javax.annotation.Nullable
  public String getAssetModifyTime() {
    return assetModifyTime;
  }


  public void setAssetModifyTime(String assetModifyTime) {
    this.assetModifyTime = assetModifyTime;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 投放条件名称
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner assetType(DpaAssetV2DetailReadV2DataAssetListAssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nullable
  public DpaAssetV2DetailReadV2DataAssetListAssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(DpaAssetV2DetailReadV2DataAssetListAssetType assetType) {
    this.assetType = assetType;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner auditStatus(DpaAssetV2DetailReadV2DataAssetListAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public DpaAssetV2DetailReadV2DataAssetListAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(DpaAssetV2DetailReadV2DataAssetListAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner source(DpaAssetV2DetailReadV2DataAssetListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public DpaAssetV2DetailReadV2DataAssetListSource getSource() {
    return source;
  }


  public void setSource(DpaAssetV2DetailReadV2DataAssetListSource source) {
    this.source = source;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner status(DpaAssetV2DetailReadV2DataAssetListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DpaAssetV2DetailReadV2DataAssetListStatus getStatus() {
    return status;
  }


  public void setStatus(DpaAssetV2DetailReadV2DataAssetListStatus status) {
    this.status = status;
  }


  public DpaAssetV2DetailReadV2ResponseDataAssetListInner uniqueProductId(Long uniqueProductId) {
    
    this.uniqueProductId = uniqueProductId;
    return this;
  }

   /**
   * 线索商品id
   * @return uniqueProductId
  **/
  @javax.annotation.Nullable
  public Long getUniqueProductId() {
    return uniqueProductId;
  }


  public void setUniqueProductId(Long uniqueProductId) {
    this.uniqueProductId = uniqueProductId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaAssetV2DetailReadV2ResponseDataAssetListInner dpaAssetV2DetailReadV2ResponseDataAssetListInner = (DpaAssetV2DetailReadV2ResponseDataAssetListInner) o;
    return Objects.equals(this.advertiserId, dpaAssetV2DetailReadV2ResponseDataAssetListInner.advertiserId) &&
        Objects.equals(this.assetCreateTime, dpaAssetV2DetailReadV2ResponseDataAssetListInner.assetCreateTime) &&
        Objects.equals(this.assetId, dpaAssetV2DetailReadV2ResponseDataAssetListInner.assetId) &&
        Objects.equals(this.assetModifyTime, dpaAssetV2DetailReadV2ResponseDataAssetListInner.assetModifyTime) &&
        Objects.equals(this.assetName, dpaAssetV2DetailReadV2ResponseDataAssetListInner.assetName) &&
        Objects.equals(this.assetType, dpaAssetV2DetailReadV2ResponseDataAssetListInner.assetType) &&
        Objects.equals(this.auditStatus, dpaAssetV2DetailReadV2ResponseDataAssetListInner.auditStatus) &&
        Objects.equals(this.source, dpaAssetV2DetailReadV2ResponseDataAssetListInner.source) &&
        Objects.equals(this.status, dpaAssetV2DetailReadV2ResponseDataAssetListInner.status) &&
        Objects.equals(this.uniqueProductId, dpaAssetV2DetailReadV2ResponseDataAssetListInner.uniqueProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, assetCreateTime, assetId, assetModifyTime, assetName, assetType, auditStatus, source, status, uniqueProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaAssetV2DetailReadV2ResponseDataAssetListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    assetCreateTime: ").append(toIndentedString(assetCreateTime)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetModifyTime: ").append(toIndentedString(assetModifyTime)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uniqueProductId: ").append(toIndentedString(uniqueProductId)).append("\n");
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
    openapiFields.add("asset_name");
    openapiFields.add("asset_type");
    openapiFields.add("audit_status");
    openapiFields.add("source");
    openapiFields.add("status");
    openapiFields.add("unique_product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("asset_create_time");
    openapiRequiredFields.add("asset_id");
    openapiRequiredFields.add("asset_modify_time");
    openapiRequiredFields.add("asset_name");
    openapiRequiredFields.add("asset_type");
    openapiRequiredFields.add("audit_status");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("unique_product_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaAssetV2DetailReadV2ResponseDataAssetListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaAssetV2DetailReadV2ResponseDataAssetListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaAssetV2DetailReadV2ResponseDataAssetListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaAssetV2DetailReadV2ResponseDataAssetListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaAssetV2DetailReadV2ResponseDataAssetListInner>() {
           @Override
           public void write(JsonWriter out, DpaAssetV2DetailReadV2ResponseDataAssetListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaAssetV2DetailReadV2ResponseDataAssetListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaAssetV2DetailReadV2ResponseDataAssetListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaAssetV2DetailReadV2ResponseDataAssetListInner
  * @throws IOException if the JSON string is invalid with respect to DpaAssetV2DetailReadV2ResponseDataAssetListInner
  */
  public static DpaAssetV2DetailReadV2ResponseDataAssetListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaAssetV2DetailReadV2ResponseDataAssetListInner.class);
  }

 /**
  * Convert an instance of DpaAssetV2DetailReadV2ResponseDataAssetListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

