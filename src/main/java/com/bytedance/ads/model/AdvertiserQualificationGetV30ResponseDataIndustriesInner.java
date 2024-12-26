/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner;
import com.bytedance.ads.model.AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion;
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
 * AdvertiserQualificationGetV30ResponseDataIndustriesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class AdvertiserQualificationGetV30ResponseDataIndustriesInner {
  public static final String SERIALIZED_NAME_INDUSTRY1_ID = "industry1_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY1_ID)
  private Long industry1Id = null;

  public static final String SERIALIZED_NAME_INDUSTRY1_NAME = "industry1_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY1_NAME)
  private String industry1Name = null;

  public static final String SERIALIZED_NAME_INDUSTRY2_ID = "industry2_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY2_ID)
  private Long industry2Id = null;

  public static final String SERIALIZED_NAME_INDUSTRY2_NAME = "industry2_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY2_NAME)
  private String industry2Name = null;

  public static final String SERIALIZED_NAME_INDUSTRY3_ID = "industry3_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY3_ID)
  private Long industry3Id = null;

  public static final String SERIALIZED_NAME_INDUSTRY3_NAME = "industry3_name";
  @SerializedName(SERIALIZED_NAME_INDUSTRY3_NAME)
  private String industry3Name = null;

  public static final String SERIALIZED_NAME_IS_HISTORY = "is_history";
  @SerializedName(SERIALIZED_NAME_IS_HISTORY)
  private Boolean isHistory = null;

  public static final String SERIALIZED_NAME_OTHERS = "others";
  @SerializedName(SERIALIZED_NAME_OTHERS)
  private List<AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner> others = null;

  public static final String SERIALIZED_NAME_PROMOTION = "promotion";
  @SerializedName(SERIALIZED_NAME_PROMOTION)
  private AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion promotion = null;

  public AdvertiserQualificationGetV30ResponseDataIndustriesInner() {
  }

  public AdvertiserQualificationGetV30ResponseDataIndustriesInner industry1Id(Long industry1Id) {
    
    this.industry1Id = industry1Id;
    return this;
  }

   /**
   * 一级行业ID
   * @return industry1Id
  **/
  @javax.annotation.Nullable
  public Long getIndustry1Id() {
    return industry1Id;
  }


  public void setIndustry1Id(Long industry1Id) {
    this.industry1Id = industry1Id;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner industry1Name(String industry1Name) {
    
    this.industry1Name = industry1Name;
    return this;
  }

   /**
   * 一级行业名称
   * @return industry1Name
  **/
  @javax.annotation.Nullable
  public String getIndustry1Name() {
    return industry1Name;
  }


  public void setIndustry1Name(String industry1Name) {
    this.industry1Name = industry1Name;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner industry2Id(Long industry2Id) {
    
    this.industry2Id = industry2Id;
    return this;
  }

   /**
   * 二级行业ID
   * @return industry2Id
  **/
  @javax.annotation.Nullable
  public Long getIndustry2Id() {
    return industry2Id;
  }


  public void setIndustry2Id(Long industry2Id) {
    this.industry2Id = industry2Id;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner industry2Name(String industry2Name) {
    
    this.industry2Name = industry2Name;
    return this;
  }

   /**
   * 二级行业名称
   * @return industry2Name
  **/
  @javax.annotation.Nullable
  public String getIndustry2Name() {
    return industry2Name;
  }


  public void setIndustry2Name(String industry2Name) {
    this.industry2Name = industry2Name;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner industry3Id(Long industry3Id) {
    
    this.industry3Id = industry3Id;
    return this;
  }

   /**
   * 三级行业ID
   * @return industry3Id
  **/
  @javax.annotation.Nullable
  public Long getIndustry3Id() {
    return industry3Id;
  }


  public void setIndustry3Id(Long industry3Id) {
    this.industry3Id = industry3Id;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner industry3Name(String industry3Name) {
    
    this.industry3Name = industry3Name;
    return this;
  }

   /**
   * 三级行业名称
   * @return industry3Name
  **/
  @javax.annotation.Nullable
  public String getIndustry3Name() {
    return industry3Name;
  }


  public void setIndustry3Name(String industry3Name) {
    this.industry3Name = industry3Name;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner isHistory(Boolean isHistory) {
    
    this.isHistory = isHistory;
    return this;
  }

   /**
   * 是否是历史的补充资质及推广资质，如果是，则行业相关字段无值，重新提交时需归档到具体行业下
   * @return isHistory
  **/
  @javax.annotation.Nullable
  public Boolean getIsHistory() {
    return isHistory;
  }


  public void setIsHistory(Boolean isHistory) {
    this.isHistory = isHistory;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner others(List<AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner> others) {
    
    this.others = others;
    return this;
  }

  public AdvertiserQualificationGetV30ResponseDataIndustriesInner addOthersItem(AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner othersItem) {
    if (this.others == null) {
      this.others = new ArrayList<>();
    }
    this.others.add(othersItem);
    return this;
  }

   /**
   * 开户资质列表，相关字段见下 
   * @return others
  **/
  @javax.annotation.Nullable
  public List<AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner> getOthers() {
    return others;
  }


  public void setOthers(List<AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner> others) {
    this.others = others;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInner promotion(AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion promotion) {
    
    this.promotion = promotion;
    return this;
  }

   /**
   * Get promotion
   * @return promotion
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion getPromotion() {
    return promotion;
  }


  public void setPromotion(AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion promotion) {
    this.promotion = promotion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationGetV30ResponseDataIndustriesInner advertiserQualificationGetV30ResponseDataIndustriesInner = (AdvertiserQualificationGetV30ResponseDataIndustriesInner) o;
    return Objects.equals(this.industry1Id, advertiserQualificationGetV30ResponseDataIndustriesInner.industry1Id) &&
        Objects.equals(this.industry1Name, advertiserQualificationGetV30ResponseDataIndustriesInner.industry1Name) &&
        Objects.equals(this.industry2Id, advertiserQualificationGetV30ResponseDataIndustriesInner.industry2Id) &&
        Objects.equals(this.industry2Name, advertiserQualificationGetV30ResponseDataIndustriesInner.industry2Name) &&
        Objects.equals(this.industry3Id, advertiserQualificationGetV30ResponseDataIndustriesInner.industry3Id) &&
        Objects.equals(this.industry3Name, advertiserQualificationGetV30ResponseDataIndustriesInner.industry3Name) &&
        Objects.equals(this.isHistory, advertiserQualificationGetV30ResponseDataIndustriesInner.isHistory) &&
        Objects.equals(this.others, advertiserQualificationGetV30ResponseDataIndustriesInner.others) &&
        Objects.equals(this.promotion, advertiserQualificationGetV30ResponseDataIndustriesInner.promotion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(industry1Id, industry1Name, industry2Id, industry2Name, industry3Id, industry3Name, isHistory, others, promotion);
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
    sb.append("class AdvertiserQualificationGetV30ResponseDataIndustriesInner {\n");
    sb.append("    industry1Id: ").append(toIndentedString(industry1Id)).append("\n");
    sb.append("    industry1Name: ").append(toIndentedString(industry1Name)).append("\n");
    sb.append("    industry2Id: ").append(toIndentedString(industry2Id)).append("\n");
    sb.append("    industry2Name: ").append(toIndentedString(industry2Name)).append("\n");
    sb.append("    industry3Id: ").append(toIndentedString(industry3Id)).append("\n");
    sb.append("    industry3Name: ").append(toIndentedString(industry3Name)).append("\n");
    sb.append("    isHistory: ").append(toIndentedString(isHistory)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
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
    openapiFields.add("industry1_id");
    openapiFields.add("industry1_name");
    openapiFields.add("industry2_id");
    openapiFields.add("industry2_name");
    openapiFields.add("industry3_id");
    openapiFields.add("industry3_name");
    openapiFields.add("is_history");
    openapiFields.add("others");
    openapiFields.add("promotion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationGetV30ResponseDataIndustriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationGetV30ResponseDataIndustriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationGetV30ResponseDataIndustriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationGetV30ResponseDataIndustriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationGetV30ResponseDataIndustriesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationGetV30ResponseDataIndustriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationGetV30ResponseDataIndustriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationGetV30ResponseDataIndustriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationGetV30ResponseDataIndustriesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationGetV30ResponseDataIndustriesInner
  */
  public static AdvertiserQualificationGetV30ResponseDataIndustriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationGetV30ResponseDataIndustriesInner.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationGetV30ResponseDataIndustriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

