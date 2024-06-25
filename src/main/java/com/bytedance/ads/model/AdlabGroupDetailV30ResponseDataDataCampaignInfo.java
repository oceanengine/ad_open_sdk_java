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
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataCampaignInfoBudgetMode;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataCampaignInfoLandingType;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataCampaignInfoMarketingPurpose;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * 广告组维度信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataCampaignInfo {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private AdlabGroupDetailV30DataDataCampaignInfoBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_DELIVERY_RELATED_NUM = "delivery_related_num";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RELATED_NUM)
  private AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum deliveryRelatedNum = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private AdlabGroupDetailV30DataDataCampaignInfoLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_PURPOSE = "marketing_purpose";
  @SerializedName(SERIALIZED_NAME_MARKETING_PURPOSE)
  private AdlabGroupDetailV30DataDataCampaignInfoMarketingPurpose marketingPurpose = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public AdlabGroupDetailV30ResponseDataDataCampaignInfo() {
  }

  public AdlabGroupDetailV30ResponseDataDataCampaignInfo budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 项目预算
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public AdlabGroupDetailV30ResponseDataDataCampaignInfo budgetMode(AdlabGroupDetailV30DataDataCampaignInfoBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataCampaignInfoBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(AdlabGroupDetailV30DataDataCampaignInfoBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public AdlabGroupDetailV30ResponseDataDataCampaignInfo deliveryRelatedNum(AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum deliveryRelatedNum) {
    
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

   /**
   * Get deliveryRelatedNum
   * @return deliveryRelatedNum
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum getDeliveryRelatedNum() {
    return deliveryRelatedNum;
  }


  public void setDeliveryRelatedNum(AdlabGroupDetailV30DataDataCampaignInfoDeliveryRelatedNum deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
  }


  public AdlabGroupDetailV30ResponseDataDataCampaignInfo landingType(AdlabGroupDetailV30DataDataCampaignInfoLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataCampaignInfoLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(AdlabGroupDetailV30DataDataCampaignInfoLandingType landingType) {
    this.landingType = landingType;
  }


  public AdlabGroupDetailV30ResponseDataDataCampaignInfo marketingPurpose(AdlabGroupDetailV30DataDataCampaignInfoMarketingPurpose marketingPurpose) {
    
    this.marketingPurpose = marketingPurpose;
    return this;
  }

   /**
   * Get marketingPurpose
   * @return marketingPurpose
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataCampaignInfoMarketingPurpose getMarketingPurpose() {
    return marketingPurpose;
  }


  public void setMarketingPurpose(AdlabGroupDetailV30DataDataCampaignInfoMarketingPurpose marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
  }


  public AdlabGroupDetailV30ResponseDataDataCampaignInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 项目名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupDetailV30ResponseDataDataCampaignInfo adlabGroupDetailV30ResponseDataDataCampaignInfo = (AdlabGroupDetailV30ResponseDataDataCampaignInfo) o;
    return Objects.equals(this.budget, adlabGroupDetailV30ResponseDataDataCampaignInfo.budget) &&
        Objects.equals(this.budgetMode, adlabGroupDetailV30ResponseDataDataCampaignInfo.budgetMode) &&
        Objects.equals(this.deliveryRelatedNum, adlabGroupDetailV30ResponseDataDataCampaignInfo.deliveryRelatedNum) &&
        Objects.equals(this.landingType, adlabGroupDetailV30ResponseDataDataCampaignInfo.landingType) &&
        Objects.equals(this.marketingPurpose, adlabGroupDetailV30ResponseDataDataCampaignInfo.marketingPurpose) &&
        Objects.equals(this.name, adlabGroupDetailV30ResponseDataDataCampaignInfo.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetMode, deliveryRelatedNum, landingType, marketingPurpose, name);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataCampaignInfo {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    deliveryRelatedNum: ").append(toIndentedString(deliveryRelatedNum)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    marketingPurpose: ").append(toIndentedString(marketingPurpose)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("delivery_related_num");
    openapiFields.add("landing_type");
    openapiFields.add("marketing_purpose");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("budget_mode");
    openapiRequiredFields.add("landing_type");
    openapiRequiredFields.add("marketing_purpose");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataCampaignInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataCampaignInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataCampaignInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataCampaignInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataCampaignInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataCampaignInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataCampaignInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataCampaignInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataCampaignInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataCampaignInfo
  */
  public static AdlabGroupDetailV30ResponseDataDataCampaignInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataCampaignInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataCampaignInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

