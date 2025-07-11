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
 * 创意分类和标签
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandCreativeCreateV30RequestCategoryInfo {
  public static final String SERIALIZED_NAME_AD_KEY_WORD = "ad_key_word";
  @SerializedName(SERIALIZED_NAME_AD_KEY_WORD)
  private List<String> adKeyWord = null;

  public static final String SERIALIZED_NAME_BRAND_NAME_ID = "brand_name_id";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME_ID)
  private Long brandNameId = null;

  public static final String SERIALIZED_NAME_CDP_BRAND_ID = "cdp_brand_id";
  @SerializedName(SERIALIZED_NAME_CDP_BRAND_ID)
  private Long cdpBrandId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_V3 = "industry_v3";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_V3)
  private Long industryV3 = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_IDS = "sub_brand_ids";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_IDS)
  private List<Long> subBrandIds = null;

  public static final String SERIALIZED_NAME_YUNTU_CATEGORY_ID = "yuntu_category_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_CATEGORY_ID)
  private Long yuntuCategoryId = null;

  public static final String SERIALIZED_NAME_YUNTU_INDUSTRY_ID = "yuntu_industry_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_INDUSTRY_ID)
  private Long yuntuIndustryId = null;

  public static final String SERIALIZED_NAME_YUNTU_MAIN_INDUSTRY_ID = "yuntu_main_industry_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_MAIN_INDUSTRY_ID)
  private Long yuntuMainIndustryId = null;

  public static final String SERIALIZED_NAME_YUNTU_SPU_ID = "yuntu_spu_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_SPU_ID)
  private String yuntuSpuId = null;

  public BrandCreativeCreateV30RequestCategoryInfo() {
  }

  public BrandCreativeCreateV30RequestCategoryInfo adKeyWord(List<String> adKeyWord) {
    
    this.adKeyWord = adKeyWord;
    return this;
  }

  public BrandCreativeCreateV30RequestCategoryInfo addAdKeyWordItem(String adKeyWordItem) {
    if (this.adKeyWord == null) {
      this.adKeyWord = new ArrayList<>();
    }
    this.adKeyWord.add(adKeyWordItem);
    return this;
  }

   /**
   * 标签
   * @return adKeyWord
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeyWord() {
    return adKeyWord;
  }


  public void setAdKeyWord(List<String> adKeyWord) {
    this.adKeyWord = adKeyWord;
  }


  public BrandCreativeCreateV30RequestCategoryInfo brandNameId(Long brandNameId) {
    
    this.brandNameId = brandNameId;
    return this;
  }

   /**
   * 品牌名称ID，优化目标为种草时写入
   * @return brandNameId
  **/
  @javax.annotation.Nullable
  public Long getBrandNameId() {
    return brandNameId;
  }


  public void setBrandNameId(Long brandNameId) {
    this.brandNameId = brandNameId;
  }


  public BrandCreativeCreateV30RequestCategoryInfo cdpBrandId(Long cdpBrandId) {
    
    this.cdpBrandId = cdpBrandId;
    return this;
  }

   /**
   * 品牌名称ID，优化目标为非种草时写入
   * @return cdpBrandId
  **/
  @javax.annotation.Nullable
  public Long getCdpBrandId() {
    return cdpBrandId;
  }


  public void setCdpBrandId(Long cdpBrandId) {
    this.cdpBrandId = cdpBrandId;
  }


  public BrandCreativeCreateV30RequestCategoryInfo industryV3(Long industryV3) {
    
    this.industryV3 = industryV3;
    return this;
  }

   /**
   * 广告分类
   * @return industryV3
  **/
  @javax.annotation.Nonnull
  public Long getIndustryV3() {
    return industryV3;
  }


  public void setIndustryV3(Long industryV3) {
    this.industryV3 = industryV3;
  }


  public BrandCreativeCreateV30RequestCategoryInfo subBrandIds(List<Long> subBrandIds) {
    
    this.subBrandIds = subBrandIds;
    return this;
  }

  public BrandCreativeCreateV30RequestCategoryInfo addSubBrandIdsItem(Long subBrandIdsItem) {
    if (this.subBrandIds == null) {
      this.subBrandIds = new ArrayList<>();
    }
    this.subBrandIds.add(subBrandIdsItem);
    return this;
  }

   /**
   * 产品系列
   * @return subBrandIds
  **/
  @javax.annotation.Nullable
  public List<Long> getSubBrandIds() {
    return subBrandIds;
  }


  public void setSubBrandIds(List<Long> subBrandIds) {
    this.subBrandIds = subBrandIds;
  }


  public BrandCreativeCreateV30RequestCategoryInfo yuntuCategoryId(Long yuntuCategoryId) {
    
    this.yuntuCategoryId = yuntuCategoryId;
    return this;
  }

   /**
   * 所属类别三级id
   * @return yuntuCategoryId
  **/
  @javax.annotation.Nullable
  public Long getYuntuCategoryId() {
    return yuntuCategoryId;
  }


  public void setYuntuCategoryId(Long yuntuCategoryId) {
    this.yuntuCategoryId = yuntuCategoryId;
  }


  public BrandCreativeCreateV30RequestCategoryInfo yuntuIndustryId(Long yuntuIndustryId) {
    
    this.yuntuIndustryId = yuntuIndustryId;
    return this;
  }

   /**
   * 所属类别二级id
   * @return yuntuIndustryId
  **/
  @javax.annotation.Nullable
  public Long getYuntuIndustryId() {
    return yuntuIndustryId;
  }


  public void setYuntuIndustryId(Long yuntuIndustryId) {
    this.yuntuIndustryId = yuntuIndustryId;
  }


  public BrandCreativeCreateV30RequestCategoryInfo yuntuMainIndustryId(Long yuntuMainIndustryId) {
    
    this.yuntuMainIndustryId = yuntuMainIndustryId;
    return this;
  }

   /**
   * 所属类别一级id
   * @return yuntuMainIndustryId
  **/
  @javax.annotation.Nullable
  public Long getYuntuMainIndustryId() {
    return yuntuMainIndustryId;
  }


  public void setYuntuMainIndustryId(Long yuntuMainIndustryId) {
    this.yuntuMainIndustryId = yuntuMainIndustryId;
  }


  public BrandCreativeCreateV30RequestCategoryInfo yuntuSpuId(String yuntuSpuId) {
    
    this.yuntuSpuId = yuntuSpuId;
    return this;
  }

   /**
   * 云图SPU ID
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
    BrandCreativeCreateV30RequestCategoryInfo brandCreativeCreateV30RequestCategoryInfo = (BrandCreativeCreateV30RequestCategoryInfo) o;
    return Objects.equals(this.adKeyWord, brandCreativeCreateV30RequestCategoryInfo.adKeyWord) &&
        Objects.equals(this.brandNameId, brandCreativeCreateV30RequestCategoryInfo.brandNameId) &&
        Objects.equals(this.cdpBrandId, brandCreativeCreateV30RequestCategoryInfo.cdpBrandId) &&
        Objects.equals(this.industryV3, brandCreativeCreateV30RequestCategoryInfo.industryV3) &&
        Objects.equals(this.subBrandIds, brandCreativeCreateV30RequestCategoryInfo.subBrandIds) &&
        Objects.equals(this.yuntuCategoryId, brandCreativeCreateV30RequestCategoryInfo.yuntuCategoryId) &&
        Objects.equals(this.yuntuIndustryId, brandCreativeCreateV30RequestCategoryInfo.yuntuIndustryId) &&
        Objects.equals(this.yuntuMainIndustryId, brandCreativeCreateV30RequestCategoryInfo.yuntuMainIndustryId) &&
        Objects.equals(this.yuntuSpuId, brandCreativeCreateV30RequestCategoryInfo.yuntuSpuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeyWord, brandNameId, cdpBrandId, industryV3, subBrandIds, yuntuCategoryId, yuntuIndustryId, yuntuMainIndustryId, yuntuSpuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeCreateV30RequestCategoryInfo {\n");
    sb.append("    adKeyWord: ").append(toIndentedString(adKeyWord)).append("\n");
    sb.append("    brandNameId: ").append(toIndentedString(brandNameId)).append("\n");
    sb.append("    cdpBrandId: ").append(toIndentedString(cdpBrandId)).append("\n");
    sb.append("    industryV3: ").append(toIndentedString(industryV3)).append("\n");
    sb.append("    subBrandIds: ").append(toIndentedString(subBrandIds)).append("\n");
    sb.append("    yuntuCategoryId: ").append(toIndentedString(yuntuCategoryId)).append("\n");
    sb.append("    yuntuIndustryId: ").append(toIndentedString(yuntuIndustryId)).append("\n");
    sb.append("    yuntuMainIndustryId: ").append(toIndentedString(yuntuMainIndustryId)).append("\n");
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
    openapiFields.add("ad_key_word");
    openapiFields.add("brand_name_id");
    openapiFields.add("cdp_brand_id");
    openapiFields.add("industry_v3");
    openapiFields.add("sub_brand_ids");
    openapiFields.add("yuntu_category_id");
    openapiFields.add("yuntu_industry_id");
    openapiFields.add("yuntu_main_industry_id");
    openapiFields.add("yuntu_spu_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("industry_v3");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeCreateV30RequestCategoryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeCreateV30RequestCategoryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeCreateV30RequestCategoryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeCreateV30RequestCategoryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeCreateV30RequestCategoryInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeCreateV30RequestCategoryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeCreateV30RequestCategoryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeCreateV30RequestCategoryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeCreateV30RequestCategoryInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeCreateV30RequestCategoryInfo
  */
  public static BrandCreativeCreateV30RequestCategoryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeCreateV30RequestCategoryInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeCreateV30RequestCategoryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

