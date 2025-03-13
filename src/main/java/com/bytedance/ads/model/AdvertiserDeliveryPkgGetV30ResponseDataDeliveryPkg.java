/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserDeliveryPkgGetV30DataDeliveryPkgStatus;
import com.bytedance.ads.model.AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine;
import com.bytedance.ads.model.AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission;
import com.bytedance.ads.model.AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner;
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
 * 推广产品资质信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg {
  public static final String SERIALIZED_NAME_CONFIG_ID = "config_id";
  @SerializedName(SERIALIZED_NAME_CONFIG_ID)
  private Long configId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_ID = "industry_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_ID)
  private List<Long> industryId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_NAME = "industry_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_NAME)
  private List<String> industryName = null;

  public static final String SERIALIZED_NAME_NECESSARY_COMBINE = "necessary_combine";
  @SerializedName(SERIALIZED_NAME_NECESSARY_COMBINE)
  private AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine necessaryCombine = null;

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission permission = null;

  public static final String SERIALIZED_NAME_PKG_ID = "pkg_id";
  @SerializedName(SERIALIZED_NAME_PKG_ID)
  private Long pkgId = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserDeliveryPkgGetV30DataDeliveryPkgStatus status = null;

  public static final String SERIALIZED_NAME_UNNECESSARY_COMBINES = "unnecessary_combines";
  @SerializedName(SERIALIZED_NAME_UNNECESSARY_COMBINES)
  private List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner> unnecessaryCombines = null;

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg() {
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg configId(Long configId) {
    
    this.configId = configId;
    return this;
  }

   /**
   *  来自【推广产品资质规则配置查询接口】，行业的资质规则中的config_id
   * @return configId
  **/
  @javax.annotation.Nullable
  public Long getConfigId() {
    return configId;
  }


  public void setConfigId(Long configId) {
    this.configId = configId;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg industryId(List<Long> industryId) {
    
    this.industryId = industryId;
    return this;
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg addIndustryIdItem(Long industryIdItem) {
    if (this.industryId == null) {
      this.industryId = new ArrayList<>();
    }
    this.industryId.add(industryIdItem);
    return this;
  }

   /**
   * 一级到三级行业id
   * @return industryId
  **/
  @javax.annotation.Nullable
  public List<Long> getIndustryId() {
    return industryId;
  }


  public void setIndustryId(List<Long> industryId) {
    this.industryId = industryId;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg industryName(List<String> industryName) {
    
    this.industryName = industryName;
    return this;
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg addIndustryNameItem(String industryNameItem) {
    if (this.industryName == null) {
      this.industryName = new ArrayList<>();
    }
    this.industryName.add(industryNameItem);
    return this;
  }

   /**
   * 一级到三级行业名称
   * @return industryName
  **/
  @javax.annotation.Nullable
  public List<String> getIndustryName() {
    return industryName;
  }


  public void setIndustryName(List<String> industryName) {
    this.industryName = industryName;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg necessaryCombine(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine necessaryCombine) {
    
    this.necessaryCombine = necessaryCombine;
    return this;
  }

   /**
   * Get necessaryCombine
   * @return necessaryCombine
  **/
  @javax.annotation.Nullable
  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine getNecessaryCombine() {
    return necessaryCombine;
  }


  public void setNecessaryCombine(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgNecessaryCombine necessaryCombine) {
    this.necessaryCombine = necessaryCombine;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg permission(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nullable
  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission getPermission() {
    return permission;
  }


  public void setPermission(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgPermission permission) {
    this.permission = permission;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg pkgId(Long pkgId) {
    
    this.pkgId = pkgId;
    return this;
  }

   /**
   * 推广产品组id
   * @return pkgId
  **/
  @javax.annotation.Nullable
  public Long getPkgId() {
    return pkgId;
  }


  public void setPkgId(Long pkgId) {
    this.pkgId = pkgId;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 用户提交的推广产品名称
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg status(AdvertiserDeliveryPkgGetV30DataDeliveryPkgStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserDeliveryPkgGetV30DataDeliveryPkgStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserDeliveryPkgGetV30DataDeliveryPkgStatus status) {
    this.status = status;
  }


  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg unnecessaryCombines(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner> unnecessaryCombines) {
    
    this.unnecessaryCombines = unnecessaryCombines;
    return this;
  }

  public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg addUnnecessaryCombinesItem(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner unnecessaryCombinesItem) {
    if (this.unnecessaryCombines == null) {
      this.unnecessaryCombines = new ArrayList<>();
    }
    this.unnecessaryCombines.add(unnecessaryCombinesItem);
    return this;
  }

   /**
   * 选填资质模块
   * @return unnecessaryCombines
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner> getUnnecessaryCombines() {
    return unnecessaryCombines;
  }


  public void setUnnecessaryCombines(List<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkgUnnecessaryCombinesInner> unnecessaryCombines) {
    this.unnecessaryCombines = unnecessaryCombines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg = (AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg) o;
    return Objects.equals(this.configId, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.configId) &&
        Objects.equals(this.industryId, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.industryId) &&
        Objects.equals(this.industryName, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.industryName) &&
        Objects.equals(this.necessaryCombine, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.necessaryCombine) &&
        Objects.equals(this.permission, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.permission) &&
        Objects.equals(this.pkgId, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.pkgId) &&
        Objects.equals(this.productName, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.productName) &&
        Objects.equals(this.status, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.status) &&
        Objects.equals(this.unnecessaryCombines, advertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.unnecessaryCombines);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(configId, industryId, industryName, necessaryCombine, permission, pkgId, productName, status, unnecessaryCombines);
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
    sb.append("class AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg {\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    industryId: ").append(toIndentedString(industryId)).append("\n");
    sb.append("    industryName: ").append(toIndentedString(industryName)).append("\n");
    sb.append("    necessaryCombine: ").append(toIndentedString(necessaryCombine)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    pkgId: ").append(toIndentedString(pkgId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unnecessaryCombines: ").append(toIndentedString(unnecessaryCombines)).append("\n");
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
    openapiFields.add("config_id");
    openapiFields.add("industry_id");
    openapiFields.add("industry_name");
    openapiFields.add("necessary_combine");
    openapiFields.add("permission");
    openapiFields.add("pkg_id");
    openapiFields.add("product_name");
    openapiFields.add("status");
    openapiFields.add("unnecessary_combines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("config_id");
    openapiRequiredFields.add("industry_id");
    openapiRequiredFields.add("industry_name");
    openapiRequiredFields.add("permission");
    openapiRequiredFields.add("product_name");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg
  */
  public static AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgGetV30ResponseDataDeliveryPkg to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

