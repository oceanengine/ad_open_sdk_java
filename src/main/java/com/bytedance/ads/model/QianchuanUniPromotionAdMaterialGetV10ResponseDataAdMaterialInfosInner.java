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
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosAuditStatus;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialSelectType;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialStatus;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerProductInfoInner;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerStatsInfo;
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
 * QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_IS_DELETE = "is_delete";
  @SerializedName(SERIALIZED_NAME_IS_DELETE)
  private Boolean isDelete = null;

  public static final String SERIALIZED_NAME_MATERIAL_INFO = "material_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_INFO)
  private QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo = null;

  public static final String SERIALIZED_NAME_MATERIAL_SELECT_TYPE = "material_select_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_SELECT_TYPE)
  private QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialSelectType materialSelectType = null;

  public static final String SERIALIZED_NAME_MATERIAL_STATUS = "material_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_STATUS)
  private QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialStatus materialStatus = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private List<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerProductInfoInner> productInfo = null;

  public static final String SERIALIZED_NAME_STATS_INFO = "stats_info";
  @SerializedName(SERIALIZED_NAME_STATS_INFO)
  private QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerStatsInfo statsInfo = null;

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner() {
  }

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner auditStatus(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner isDelete(Boolean isDelete) {
    
    this.isDelete = isDelete;
    return this;
  }

   /**
   * 
   * @return isDelete
  **/
  @javax.annotation.Nullable
  public Boolean getIsDelete() {
    return isDelete;
  }


  public void setIsDelete(Boolean isDelete) {
    this.isDelete = isDelete;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner materialInfo(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo) {
    
    this.materialInfo = materialInfo;
    return this;
  }

   /**
   * Get materialInfo
   * @return materialInfo
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo getMaterialInfo() {
    return materialInfo;
  }


  public void setMaterialInfo(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo) {
    this.materialInfo = materialInfo;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner materialSelectType(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialSelectType materialSelectType) {
    
    this.materialSelectType = materialSelectType;
    return this;
  }

   /**
   * Get materialSelectType
   * @return materialSelectType
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialSelectType getMaterialSelectType() {
    return materialSelectType;
  }


  public void setMaterialSelectType(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialSelectType materialSelectType) {
    this.materialSelectType = materialSelectType;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner materialStatus(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialStatus materialStatus) {
    
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Get materialStatus
   * @return materialStatus
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialStatus getMaterialStatus() {
    return materialStatus;
  }


  public void setMaterialStatus(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialStatus materialStatus) {
    this.materialStatus = materialStatus;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner productInfo(List<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerProductInfoInner> productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner addProductInfoItem(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerProductInfoInner productInfoItem) {
    if (this.productInfo == null) {
      this.productInfo = new ArrayList<>();
    }
    this.productInfo.add(productInfoItem);
    return this;
  }

   /**
   * 
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerProductInfoInner> getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(List<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerProductInfoInner> productInfo) {
    this.productInfo = productInfo;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner statsInfo(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerStatsInfo statsInfo) {
    
    this.statsInfo = statsInfo;
    return this;
  }

   /**
   * Get statsInfo
   * @return statsInfo
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerStatsInfo getStatsInfo() {
    return statsInfo;
  }


  public void setStatsInfo(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerStatsInfo statsInfo) {
    this.statsInfo = statsInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner = (QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner) o;
    return Objects.equals(this.auditStatus, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.auditStatus) &&
        Objects.equals(this.isDelete, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.isDelete) &&
        Objects.equals(this.materialInfo, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.materialInfo) &&
        Objects.equals(this.materialSelectType, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.materialSelectType) &&
        Objects.equals(this.materialStatus, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.materialStatus) &&
        Objects.equals(this.productInfo, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.productInfo) &&
        Objects.equals(this.statsInfo, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.statsInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, isDelete, materialInfo, materialSelectType, materialStatus, productInfo, statsInfo);
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
    sb.append("class QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    materialInfo: ").append(toIndentedString(materialInfo)).append("\n");
    sb.append("    materialSelectType: ").append(toIndentedString(materialSelectType)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    statsInfo: ").append(toIndentedString(statsInfo)).append("\n");
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
    openapiFields.add("is_delete");
    openapiFields.add("material_info");
    openapiFields.add("material_select_type");
    openapiFields.add("material_status");
    openapiFields.add("product_info");
    openapiFields.add("stats_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner
  */
  public static QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

