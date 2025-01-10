/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestCategoryInfo {
  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_BRAND_NAME_ID = "brand_name_id";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME_ID)
  private Long brandNameId = null;

  public static final String SERIALIZED_NAME_CDP_BRAND_ID = "cdp_brand_id";
  @SerializedName(SERIALIZED_NAME_CDP_BRAND_ID)
  private Long cdpBrandId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_V3 = "industry_v3";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_V3)
  private Long industryV3 = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_NAME_IDS = "sub_brand_name_ids";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_NAME_IDS)
  private List<Long> subBrandNameIds = null;

  public static final String SERIALIZED_NAME_YUNTU_CATEGORY_ID = "yuntu_category_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_CATEGORY_ID)
  private Long yuntuCategoryId = null;

  public static final String SERIALIZED_NAME_YUNTU_SPU_ID = "yuntu_spu_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_SPU_ID)
  private String yuntuSpuId = null;

  public BrandMaterialCreateV30RequestCategoryInfo() {
  }

  public BrandMaterialCreateV30RequestCategoryInfo adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public BrandMaterialCreateV30RequestCategoryInfo addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 广告标签，选填
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public BrandMaterialCreateV30RequestCategoryInfo brandNameId(Long brandNameId) {
    
    this.brandNameId = brandNameId;
    return this;
  }

   /**
   * 品牌名称Id，种草必填
   * @return brandNameId
  **/
  @javax.annotation.Nullable
  public Long getBrandNameId() {
    return brandNameId;
  }


  public void setBrandNameId(Long brandNameId) {
    this.brandNameId = brandNameId;
  }


  public BrandMaterialCreateV30RequestCategoryInfo cdpBrandId(Long cdpBrandId) {
    
    this.cdpBrandId = cdpBrandId;
    return this;
  }

   /**
   * cdp返回的品牌名称id，非种草必填，与brand_name_id分别对应对应非种草和种草的品牌名称
   * @return cdpBrandId
  **/
  @javax.annotation.Nullable
  public Long getCdpBrandId() {
    return cdpBrandId;
  }


  public void setCdpBrandId(Long cdpBrandId) {
    this.cdpBrandId = cdpBrandId;
  }


  public BrandMaterialCreateV30RequestCategoryInfo industryV3(Long industryV3) {
    
    this.industryV3 = industryV3;
    return this;
  }

   /**
   * 广告分类（行业3.0版），必填
   * @return industryV3
  **/
  @javax.annotation.Nonnull
  public Long getIndustryV3() {
    return industryV3;
  }


  public void setIndustryV3(Long industryV3) {
    this.industryV3 = industryV3;
  }


  public BrandMaterialCreateV30RequestCategoryInfo subBrandNameIds(List<Long> subBrandNameIds) {
    
    this.subBrandNameIds = subBrandNameIds;
    return this;
  }

  public BrandMaterialCreateV30RequestCategoryInfo addSubBrandNameIdsItem(Long subBrandNameIdsItem) {
    if (this.subBrandNameIds == null) {
      this.subBrandNameIds = new ArrayList<>();
    }
    this.subBrandNameIds.add(subBrandNameIdsItem);
    return this;
  }

   /**
   * 产品系列
   * @return subBrandNameIds
  **/
  @javax.annotation.Nullable
  public List<Long> getSubBrandNameIds() {
    return subBrandNameIds;
  }


  public void setSubBrandNameIds(List<Long> subBrandNameIds) {
    this.subBrandNameIds = subBrandNameIds;
  }


  public BrandMaterialCreateV30RequestCategoryInfo yuntuCategoryId(Long yuntuCategoryId) {
    
    this.yuntuCategoryId = yuntuCategoryId;
    return this;
  }

   /**
   * 所属类别（云图分类），必填
   * @return yuntuCategoryId
  **/
  @javax.annotation.Nonnull
  public Long getYuntuCategoryId() {
    return yuntuCategoryId;
  }


  public void setYuntuCategoryId(Long yuntuCategoryId) {
    this.yuntuCategoryId = yuntuCategoryId;
  }


  public BrandMaterialCreateV30RequestCategoryInfo yuntuSpuId(String yuntuSpuId) {
    
    this.yuntuSpuId = yuntuSpuId;
    return this;
  }

   /**
   * 云图spuid，选填
   * @return yuntuSpuId
  **/
  @javax.annotation.Nullable
  public String getYuntuSpuId() {
    return yuntuSpuId;
  }


  public void setYuntuSpuId(String yuntuSpuId) {
    this.yuntuSpuId = yuntuSpuId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialCreateV30RequestCategoryInfo brandMaterialCreateV30RequestCategoryInfo = (BrandMaterialCreateV30RequestCategoryInfo) o;
    return Objects.equals(this.adKeywords, brandMaterialCreateV30RequestCategoryInfo.adKeywords) &&
        Objects.equals(this.brandNameId, brandMaterialCreateV30RequestCategoryInfo.brandNameId) &&
        Objects.equals(this.cdpBrandId, brandMaterialCreateV30RequestCategoryInfo.cdpBrandId) &&
        Objects.equals(this.industryV3, brandMaterialCreateV30RequestCategoryInfo.industryV3) &&
        Objects.equals(this.subBrandNameIds, brandMaterialCreateV30RequestCategoryInfo.subBrandNameIds) &&
        Objects.equals(this.yuntuCategoryId, brandMaterialCreateV30RequestCategoryInfo.yuntuCategoryId) &&
        Objects.equals(this.yuntuSpuId, brandMaterialCreateV30RequestCategoryInfo.yuntuSpuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeywords, brandNameId, cdpBrandId, industryV3, subBrandNameIds, yuntuCategoryId, yuntuSpuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestCategoryInfo {\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    brandNameId: ").append(toIndentedString(brandNameId)).append("\n");
    sb.append("    cdpBrandId: ").append(toIndentedString(cdpBrandId)).append("\n");
    sb.append("    industryV3: ").append(toIndentedString(industryV3)).append("\n");
    sb.append("    subBrandNameIds: ").append(toIndentedString(subBrandNameIds)).append("\n");
    sb.append("    yuntuCategoryId: ").append(toIndentedString(yuntuCategoryId)).append("\n");
    sb.append("    yuntuSpuId: ").append(toIndentedString(yuntuSpuId)).append("\n");
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
    openapiFields.add("ad_keywords");
    openapiFields.add("brand_name_id");
    openapiFields.add("cdp_brand_id");
    openapiFields.add("industry_v3");
    openapiFields.add("sub_brand_name_ids");
    openapiFields.add("yuntu_category_id");
    openapiFields.add("yuntu_spu_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("industry_v3");
    openapiRequiredFields.add("yuntu_category_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestCategoryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestCategoryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestCategoryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestCategoryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestCategoryInfo>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestCategoryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestCategoryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestCategoryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestCategoryInfo
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestCategoryInfo
  */
  public static BrandMaterialCreateV30RequestCategoryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestCategoryInfo.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestCategoryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
