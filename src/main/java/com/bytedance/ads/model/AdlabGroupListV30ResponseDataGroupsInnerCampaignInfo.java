/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsCampaignInfoBudgetMode;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsCampaignInfoLandingType;
import com.bytedance.ads.model.AdlabGroupListV30DataGroupsCampaignInfoMarketingPurpose;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private AdlabGroupListV30DataGroupsCampaignInfoBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_DELIVERY_RELATED_NUM = "delivery_related_num";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RELATED_NUM)
  private AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum deliveryRelatedNum = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private AdlabGroupListV30DataGroupsCampaignInfoLandingType landingType = null;

  public static final String SERIALIZED_NAME_MARKETING_PURPOSE = "marketing_purpose";
  @SerializedName(SERIALIZED_NAME_MARKETING_PURPOSE)
  private AdlabGroupListV30DataGroupsCampaignInfoMarketingPurpose marketingPurpose = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo() {
  }

  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 广告组（管家项目）日预算
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo budgetMode(AdlabGroupListV30DataGroupsCampaignInfoBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsCampaignInfoBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(AdlabGroupListV30DataGroupsCampaignInfoBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo deliveryRelatedNum(AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum deliveryRelatedNum) {
    
    this.deliveryRelatedNum = deliveryRelatedNum;
    return this;
  }

   /**
   * Get deliveryRelatedNum
   * @return deliveryRelatedNum
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum getDeliveryRelatedNum() {
    return deliveryRelatedNum;
  }


  public void setDeliveryRelatedNum(AdlabGroupListV30DataGroupsCampaignInfoDeliveryRelatedNum deliveryRelatedNum) {
    this.deliveryRelatedNum = deliveryRelatedNum;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo landingType(AdlabGroupListV30DataGroupsCampaignInfoLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsCampaignInfoLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(AdlabGroupListV30DataGroupsCampaignInfoLandingType landingType) {
    this.landingType = landingType;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo marketingPurpose(AdlabGroupListV30DataGroupsCampaignInfoMarketingPurpose marketingPurpose) {
    
    this.marketingPurpose = marketingPurpose;
    return this;
  }

   /**
   * Get marketingPurpose
   * @return marketingPurpose
  **/
  @javax.annotation.Nullable
  public AdlabGroupListV30DataGroupsCampaignInfoMarketingPurpose getMarketingPurpose() {
    return marketingPurpose;
  }


  public void setMarketingPurpose(AdlabGroupListV30DataGroupsCampaignInfoMarketingPurpose marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
  }


  public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 广告组(管家项目)名称
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
    AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo adlabGroupListV30ResponseDataGroupsInnerCampaignInfo = (AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo) o;
    return Objects.equals(this.budget, adlabGroupListV30ResponseDataGroupsInnerCampaignInfo.budget) &&
        Objects.equals(this.budgetMode, adlabGroupListV30ResponseDataGroupsInnerCampaignInfo.budgetMode) &&
        Objects.equals(this.deliveryRelatedNum, adlabGroupListV30ResponseDataGroupsInnerCampaignInfo.deliveryRelatedNum) &&
        Objects.equals(this.landingType, adlabGroupListV30ResponseDataGroupsInnerCampaignInfo.landingType) &&
        Objects.equals(this.marketingPurpose, adlabGroupListV30ResponseDataGroupsInnerCampaignInfo.marketingPurpose) &&
        Objects.equals(this.name, adlabGroupListV30ResponseDataGroupsInnerCampaignInfo.name);
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
    sb.append("class AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo
  */
  public static AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupListV30ResponseDataGroupsInnerCampaignInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

