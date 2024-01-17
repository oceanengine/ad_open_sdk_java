/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class FileRebateMaterialSearchV2Filtering {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName = null;

  public static final String SERIALIZED_NAME_IS_VALID_VIDEO_MATERIAL = "is_valid_video_material";
  @SerializedName(SERIALIZED_NAME_IS_VALID_VIDEO_MATERIAL)
  private Integer isValidVideoMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_CREATE_END_DATE = "material_create_end_date";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CREATE_END_DATE)
  private String materialCreateEndDate = null;

  public static final String SERIALIZED_NAME_MATERIAL_CREATE_START_DATE = "material_create_start_date";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CREATE_START_DATE)
  private String materialCreateStartDate = null;

  public static final String SERIALIZED_NAME_MATERIAL_IS_EFFECTIVE = "material_is_effective";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IS_EFFECTIVE)
  private Integer materialIsEffective = null;

  public static final String SERIALIZED_NAME_MATERIAL_TAGS = "material_tags";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TAGS)
  private List<String> materialTags = null;

  public static final String SERIALIZED_NAME_OPERATOR_TAG = "operator_tag";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TAG)
  private Integer operatorTag = null;

  public static final String SERIALIZED_NAME_POLICY_COST_MAX = "policy_cost_max";
  @SerializedName(SERIALIZED_NAME_POLICY_COST_MAX)
  private Long policyCostMax = null;

  public static final String SERIALIZED_NAME_POLICY_COST_MIN = "policy_cost_min";
  @SerializedName(SERIALIZED_NAME_POLICY_COST_MIN)
  private Long policyCostMin = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_FIRST_INDUSTRY_NAME = "rebate_calc_first_industry_name";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_FIRST_INDUSTRY_NAME)
  private String rebateCalcFirstIndustryName = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_POLICY_TYPE = "rebate_calc_policy_type";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_POLICY_TYPE)
  private Integer rebateCalcPolicyType = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_SECOND_INDUSTRY_NAME = "rebate_calc_second_industry_name";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_SECOND_INDUSTRY_NAME)
  private String rebateCalcSecondIndustryName = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_SETTLEMENT_STATS_TYPE = "rebate_calc_settlement_stats_type";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_SETTLEMENT_STATS_TYPE)
  private Integer rebateCalcSettlementStatsType = null;

  public FileRebateMaterialSearchV2Filtering() {
  }

  public FileRebateMaterialSearchV2Filtering advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public FileRebateMaterialSearchV2Filtering customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * 客户名称
   * @return customerName
  **/
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public FileRebateMaterialSearchV2Filtering isValidVideoMaterial(Integer isValidVideoMaterial) {
    
    this.isValidVideoMaterial = isValidVideoMaterial;
    return this;
  }

   /**
   * 【政策粒度】是否有效素材 允许值： 1是 2否 默认值：2-否
   * @return isValidVideoMaterial
  **/
  @javax.annotation.Nullable
  public Integer getIsValidVideoMaterial() {
    return isValidVideoMaterial;
  }


  public void setIsValidVideoMaterial(Integer isValidVideoMaterial) {
    this.isValidVideoMaterial = isValidVideoMaterial;
  }


  public FileRebateMaterialSearchV2Filtering materialCreateEndDate(String materialCreateEndDate) {
    
    this.materialCreateEndDate = materialCreateEndDate;
    return this;
  }

   /**
   * 素材创建日期范围结束日期 格式：yyyy-mm-dd
   * @return materialCreateEndDate
  **/
  @javax.annotation.Nullable
  public String getMaterialCreateEndDate() {
    return materialCreateEndDate;
  }


  public void setMaterialCreateEndDate(String materialCreateEndDate) {
    this.materialCreateEndDate = materialCreateEndDate;
  }


  public FileRebateMaterialSearchV2Filtering materialCreateStartDate(String materialCreateStartDate) {
    
    this.materialCreateStartDate = materialCreateStartDate;
    return this;
  }

   /**
   * 素材创建日期范围开始日期 格式：yyyy-mm-dd
   * @return materialCreateStartDate
  **/
  @javax.annotation.Nullable
  public String getMaterialCreateStartDate() {
    return materialCreateStartDate;
  }


  public void setMaterialCreateStartDate(String materialCreateStartDate) {
    this.materialCreateStartDate = materialCreateStartDate;
  }


  public FileRebateMaterialSearchV2Filtering materialIsEffective(Integer materialIsEffective) {
    
    this.materialIsEffective = materialIsEffective;
    return this;
  }

   /**
   * 当月最新一天素材是否在投 允许值： 1是 2否
   * @return materialIsEffective
  **/
  @javax.annotation.Nullable
  public Integer getMaterialIsEffective() {
    return materialIsEffective;
  }


  public void setMaterialIsEffective(Integer materialIsEffective) {
    this.materialIsEffective = materialIsEffective;
  }


  public FileRebateMaterialSearchV2Filtering materialTags(List<String> materialTags) {
    
    this.materialTags = materialTags;
    return this;
  }

  public FileRebateMaterialSearchV2Filtering addMaterialTagsItem(String materialTagsItem) {
    if (this.materialTags == null) {
      this.materialTags = new ArrayList<>();
    }
    this.materialTags.add(materialTagsItem);
    return this;
  }

   /**
   * 素材标签筛选项 允许值： INEFFICIENT_MATERIAL（低效素材） AD_HIGH_QUALITY_MATERIAL（AD 优质素材） FIRST_PUBLISH_MATERIAL（首发素材） - 如果不传标签筛选项，则返回广告主下所有素材 - 如果传入多个标签，取交集
   * @return materialTags
  **/
  @javax.annotation.Nullable
  public List<String> getMaterialTags() {
    return materialTags;
  }


  public void setMaterialTags(List<String> materialTags) {
    this.materialTags = materialTags;
  }


  public FileRebateMaterialSearchV2Filtering operatorTag(Integer operatorTag) {
    
    this.operatorTag = operatorTag;
    return this;
  }

   /**
   * 运营标签 允许值： 1自运营 2走量 3收量
   * @return operatorTag
  **/
  @javax.annotation.Nullable
  public Integer getOperatorTag() {
    return operatorTag;
  }


  public void setOperatorTag(Integer operatorTag) {
    this.operatorTag = operatorTag;
  }


  public FileRebateMaterialSearchV2Filtering policyCostMax(Long policyCostMax) {
    
    this.policyCostMax = policyCostMax;
    return this;
  }

   /**
   * 【政策粒度】消耗范围区间上限 - 格式限制：整数
   * @return policyCostMax
  **/
  @javax.annotation.Nullable
  public Long getPolicyCostMax() {
    return policyCostMax;
  }


  public void setPolicyCostMax(Long policyCostMax) {
    this.policyCostMax = policyCostMax;
  }


  public FileRebateMaterialSearchV2Filtering policyCostMin(Long policyCostMin) {
    
    this.policyCostMin = policyCostMin;
    return this;
  }

   /**
   * 【政策粒度】消耗范围区间下限 - 格式限制：整数
   * @return policyCostMin
  **/
  @javax.annotation.Nullable
  public Long getPolicyCostMin() {
    return policyCostMin;
  }


  public void setPolicyCostMin(Long policyCostMin) {
    this.policyCostMin = policyCostMin;
  }


  public FileRebateMaterialSearchV2Filtering rebateCalcFirstIndustryName(String rebateCalcFirstIndustryName) {
    
    this.rebateCalcFirstIndustryName = rebateCalcFirstIndustryName;
    return this;
  }

   /**
   * 一级结算行业
   * @return rebateCalcFirstIndustryName
  **/
  @javax.annotation.Nullable
  public String getRebateCalcFirstIndustryName() {
    return rebateCalcFirstIndustryName;
  }


  public void setRebateCalcFirstIndustryName(String rebateCalcFirstIndustryName) {
    this.rebateCalcFirstIndustryName = rebateCalcFirstIndustryName;
  }


  public FileRebateMaterialSearchV2Filtering rebateCalcPolicyType(Integer rebateCalcPolicyType) {
    
    this.rebateCalcPolicyType = rebateCalcPolicyType;
    return this;
  }

   /**
   * 政策类型 允许值： 1综代政策 2优代政策
   * @return rebateCalcPolicyType
  **/
  @javax.annotation.Nullable
  public Integer getRebateCalcPolicyType() {
    return rebateCalcPolicyType;
  }


  public void setRebateCalcPolicyType(Integer rebateCalcPolicyType) {
    this.rebateCalcPolicyType = rebateCalcPolicyType;
  }


  public FileRebateMaterialSearchV2Filtering rebateCalcSecondIndustryName(String rebateCalcSecondIndustryName) {
    
    this.rebateCalcSecondIndustryName = rebateCalcSecondIndustryName;
    return this;
  }

   /**
   * 二级结算行业
   * @return rebateCalcSecondIndustryName
  **/
  @javax.annotation.Nullable
  public String getRebateCalcSecondIndustryName() {
    return rebateCalcSecondIndustryName;
  }


  public void setRebateCalcSecondIndustryName(String rebateCalcSecondIndustryName) {
    this.rebateCalcSecondIndustryName = rebateCalcSecondIndustryName;
  }


  public FileRebateMaterialSearchV2Filtering rebateCalcSettlementStatsType(Integer rebateCalcSettlementStatsType) {
    
    this.rebateCalcSettlementStatsType = rebateCalcSettlementStatsType;
    return this;
  }

   /**
   * 结算行业统计类型 允许值： 1行业类目 2引流电商 4任务激励 5微信加粉
   * @return rebateCalcSettlementStatsType
  **/
  @javax.annotation.Nullable
  public Integer getRebateCalcSettlementStatsType() {
    return rebateCalcSettlementStatsType;
  }


  public void setRebateCalcSettlementStatsType(Integer rebateCalcSettlementStatsType) {
    this.rebateCalcSettlementStatsType = rebateCalcSettlementStatsType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRebateMaterialSearchV2Filtering fileRebateMaterialSearchV2Filtering = (FileRebateMaterialSearchV2Filtering) o;
    return Objects.equals(this.advertiserId, fileRebateMaterialSearchV2Filtering.advertiserId) &&
        Objects.equals(this.customerName, fileRebateMaterialSearchV2Filtering.customerName) &&
        Objects.equals(this.isValidVideoMaterial, fileRebateMaterialSearchV2Filtering.isValidVideoMaterial) &&
        Objects.equals(this.materialCreateEndDate, fileRebateMaterialSearchV2Filtering.materialCreateEndDate) &&
        Objects.equals(this.materialCreateStartDate, fileRebateMaterialSearchV2Filtering.materialCreateStartDate) &&
        Objects.equals(this.materialIsEffective, fileRebateMaterialSearchV2Filtering.materialIsEffective) &&
        Objects.equals(this.materialTags, fileRebateMaterialSearchV2Filtering.materialTags) &&
        Objects.equals(this.operatorTag, fileRebateMaterialSearchV2Filtering.operatorTag) &&
        Objects.equals(this.policyCostMax, fileRebateMaterialSearchV2Filtering.policyCostMax) &&
        Objects.equals(this.policyCostMin, fileRebateMaterialSearchV2Filtering.policyCostMin) &&
        Objects.equals(this.rebateCalcFirstIndustryName, fileRebateMaterialSearchV2Filtering.rebateCalcFirstIndustryName) &&
        Objects.equals(this.rebateCalcPolicyType, fileRebateMaterialSearchV2Filtering.rebateCalcPolicyType) &&
        Objects.equals(this.rebateCalcSecondIndustryName, fileRebateMaterialSearchV2Filtering.rebateCalcSecondIndustryName) &&
        Objects.equals(this.rebateCalcSettlementStatsType, fileRebateMaterialSearchV2Filtering.rebateCalcSettlementStatsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, customerName, isValidVideoMaterial, materialCreateEndDate, materialCreateStartDate, materialIsEffective, materialTags, operatorTag, policyCostMax, policyCostMin, rebateCalcFirstIndustryName, rebateCalcPolicyType, rebateCalcSecondIndustryName, rebateCalcSettlementStatsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRebateMaterialSearchV2Filtering {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    isValidVideoMaterial: ").append(toIndentedString(isValidVideoMaterial)).append("\n");
    sb.append("    materialCreateEndDate: ").append(toIndentedString(materialCreateEndDate)).append("\n");
    sb.append("    materialCreateStartDate: ").append(toIndentedString(materialCreateStartDate)).append("\n");
    sb.append("    materialIsEffective: ").append(toIndentedString(materialIsEffective)).append("\n");
    sb.append("    materialTags: ").append(toIndentedString(materialTags)).append("\n");
    sb.append("    operatorTag: ").append(toIndentedString(operatorTag)).append("\n");
    sb.append("    policyCostMax: ").append(toIndentedString(policyCostMax)).append("\n");
    sb.append("    policyCostMin: ").append(toIndentedString(policyCostMin)).append("\n");
    sb.append("    rebateCalcFirstIndustryName: ").append(toIndentedString(rebateCalcFirstIndustryName)).append("\n");
    sb.append("    rebateCalcPolicyType: ").append(toIndentedString(rebateCalcPolicyType)).append("\n");
    sb.append("    rebateCalcSecondIndustryName: ").append(toIndentedString(rebateCalcSecondIndustryName)).append("\n");
    sb.append("    rebateCalcSettlementStatsType: ").append(toIndentedString(rebateCalcSettlementStatsType)).append("\n");
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
    openapiFields.add("customer_name");
    openapiFields.add("is_valid_video_material");
    openapiFields.add("material_create_end_date");
    openapiFields.add("material_create_start_date");
    openapiFields.add("material_is_effective");
    openapiFields.add("material_tags");
    openapiFields.add("operator_tag");
    openapiFields.add("policy_cost_max");
    openapiFields.add("policy_cost_min");
    openapiFields.add("rebate_calc_first_industry_name");
    openapiFields.add("rebate_calc_policy_type");
    openapiFields.add("rebate_calc_second_industry_name");
    openapiFields.add("rebate_calc_settlement_stats_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateMaterialSearchV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateMaterialSearchV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateMaterialSearchV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateMaterialSearchV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateMaterialSearchV2Filtering>() {
           @Override
           public void write(JsonWriter out, FileRebateMaterialSearchV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateMaterialSearchV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateMaterialSearchV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateMaterialSearchV2Filtering
  * @throws IOException if the JSON string is invalid with respect to FileRebateMaterialSearchV2Filtering
  */
  public static FileRebateMaterialSearchV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateMaterialSearchV2Filtering.class);
  }

 /**
  * Convert an instance of FileRebateMaterialSearchV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

