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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo {
  public static final String SERIALIZED_NAME_AD_STATUS = "ad_status";
  @SerializedName(SERIALIZED_NAME_AD_STATUS)
  private Long adStatus = null;

  public static final String SERIALIZED_NAME_EST_PROVIDER_REWARD = "est_provider_reward";
  @SerializedName(SERIALIZED_NAME_EST_PROVIDER_REWARD)
  private Long estProviderReward = null;

  public static final String SERIALIZED_NAME_EST_REAL_TIME_AD_COST = "est_real_time_ad_cost";
  @SerializedName(SERIALIZED_NAME_EST_REAL_TIME_AD_COST)
  private Long estRealTimeAdCost = null;

  public static final String SERIALIZED_NAME_EST_REAL_TIME_NATURAL_COST = "est_real_time_natural_cost";
  @SerializedName(SERIALIZED_NAME_EST_REAL_TIME_NATURAL_COST)
  private Long estRealTimeNaturalCost = null;

  public static final String SERIALIZED_NAME_EST_REAL_TIME_TOTAL_COST = "est_real_time_total_cost";
  @SerializedName(SERIALIZED_NAME_EST_REAL_TIME_TOTAL_COST)
  private Long estRealTimeTotalCost = null;

  public static final String SERIALIZED_NAME_HIGH_POTENTIAL_AUTHOR = "high_potential_author";
  @SerializedName(SERIALIZED_NAME_HIGH_POTENTIAL_AUTHOR)
  private Boolean highPotentialAuthor = null;

  public static final String SERIALIZED_NAME_ITEM_STATUS = "item_status";
  @SerializedName(SERIALIZED_NAME_ITEM_STATUS)
  private Long itemStatus = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_PROVIDER_SETTLED_REWARD = "provider_settled_reward";
  @SerializedName(SERIALIZED_NAME_PROVIDER_SETTLED_REWARD)
  private Long providerSettledReward = null;

  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo() {
  }

  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo adStatus(Long adStatus) {
    
    this.adStatus = adStatus;
    return this;
  }

   /**
   * 投广状态
   * @return adStatus
  **/
  @javax.annotation.Nullable
  public Long getAdStatus() {
    return adStatus;
  }


  public void setAdStatus(Long adStatus) {
    this.adStatus = adStatus;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo estProviderReward(Long estProviderReward) {
    
    this.estProviderReward = estProviderReward;
    return this;
  }

   /**
   * 预估服务商可结算收益
   * @return estProviderReward
  **/
  @javax.annotation.Nullable
  public Long getEstProviderReward() {
    return estProviderReward;
  }


  public void setEstProviderReward(Long estProviderReward) {
    this.estProviderReward = estProviderReward;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo estRealTimeAdCost(Long estRealTimeAdCost) {
    
    this.estRealTimeAdCost = estRealTimeAdCost;
    return this;
  }

   /**
   * 预估实时广告消耗
   * @return estRealTimeAdCost
  **/
  @javax.annotation.Nullable
  public Long getEstRealTimeAdCost() {
    return estRealTimeAdCost;
  }


  public void setEstRealTimeAdCost(Long estRealTimeAdCost) {
    this.estRealTimeAdCost = estRealTimeAdCost;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo estRealTimeNaturalCost(Long estRealTimeNaturalCost) {
    
    this.estRealTimeNaturalCost = estRealTimeNaturalCost;
    return this;
  }

   /**
   * 预估实时自然消耗
   * @return estRealTimeNaturalCost
  **/
  @javax.annotation.Nullable
  public Long getEstRealTimeNaturalCost() {
    return estRealTimeNaturalCost;
  }


  public void setEstRealTimeNaturalCost(Long estRealTimeNaturalCost) {
    this.estRealTimeNaturalCost = estRealTimeNaturalCost;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo estRealTimeTotalCost(Long estRealTimeTotalCost) {
    
    this.estRealTimeTotalCost = estRealTimeTotalCost;
    return this;
  }

   /**
   * 预估实时总消耗
   * @return estRealTimeTotalCost
  **/
  @javax.annotation.Nullable
  public Long getEstRealTimeTotalCost() {
    return estRealTimeTotalCost;
  }


  public void setEstRealTimeTotalCost(Long estRealTimeTotalCost) {
    this.estRealTimeTotalCost = estRealTimeTotalCost;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo highPotentialAuthor(Boolean highPotentialAuthor) {
    
    this.highPotentialAuthor = highPotentialAuthor;
    return this;
  }

   /**
   * 是否高潜达人视频
   * @return highPotentialAuthor
  **/
  @javax.annotation.Nullable
  public Boolean getHighPotentialAuthor() {
    return highPotentialAuthor;
  }


  public void setHighPotentialAuthor(Boolean highPotentialAuthor) {
    this.highPotentialAuthor = highPotentialAuthor;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo itemStatus(Long itemStatus) {
    
    this.itemStatus = itemStatus;
    return this;
  }

   /**
   * 投放状态
   * @return itemStatus
  **/
  @javax.annotation.Nullable
  public Long getItemStatus() {
    return itemStatus;
  }


  public void setItemStatus(Long itemStatus) {
    this.itemStatus = itemStatus;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo providerSettledReward(Long providerSettledReward) {
    
    this.providerSettledReward = providerSettledReward;
    return this;
  }

   /**
   * 服务商已结算收益
   * @return providerSettledReward
  **/
  @javax.annotation.Nullable
  public Long getProviderSettledReward() {
    return providerSettledReward;
  }


  public void setProviderSettledReward(Long providerSettledReward) {
    this.providerSettledReward = providerSettledReward;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo = (StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo) o;
    return Objects.equals(this.adStatus, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.adStatus) &&
        Objects.equals(this.estProviderReward, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.estProviderReward) &&
        Objects.equals(this.estRealTimeAdCost, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.estRealTimeAdCost) &&
        Objects.equals(this.estRealTimeNaturalCost, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.estRealTimeNaturalCost) &&
        Objects.equals(this.estRealTimeTotalCost, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.estRealTimeTotalCost) &&
        Objects.equals(this.highPotentialAuthor, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.highPotentialAuthor) &&
        Objects.equals(this.itemStatus, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.itemStatus) &&
        Objects.equals(this.materialId, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.materialId) &&
        Objects.equals(this.providerSettledReward, starMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.providerSettledReward);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adStatus, estProviderReward, estRealTimeAdCost, estRealTimeNaturalCost, estRealTimeTotalCost, highPotentialAuthor, itemStatus, materialId, providerSettledReward);
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
    sb.append("class StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo {\n");
    sb.append("    adStatus: ").append(toIndentedString(adStatus)).append("\n");
    sb.append("    estProviderReward: ").append(toIndentedString(estProviderReward)).append("\n");
    sb.append("    estRealTimeAdCost: ").append(toIndentedString(estRealTimeAdCost)).append("\n");
    sb.append("    estRealTimeNaturalCost: ").append(toIndentedString(estRealTimeNaturalCost)).append("\n");
    sb.append("    estRealTimeTotalCost: ").append(toIndentedString(estRealTimeTotalCost)).append("\n");
    sb.append("    highPotentialAuthor: ").append(toIndentedString(highPotentialAuthor)).append("\n");
    sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    providerSettledReward: ").append(toIndentedString(providerSettledReward)).append("\n");
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
    openapiFields.add("ad_status");
    openapiFields.add("est_provider_reward");
    openapiFields.add("est_real_time_ad_cost");
    openapiFields.add("est_real_time_natural_cost");
    openapiFields.add("est_real_time_total_cost");
    openapiFields.add("high_potential_author");
    openapiFields.add("item_status");
    openapiFields.add("material_id");
    openapiFields.add("provider_settled_reward");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo>() {
           @Override
           public void write(JsonWriter out, StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo
  * @throws IOException if the JSON string is invalid with respect to StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo
  */
  public static StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo.class);
  }

 /**
  * Convert an instance of StarMcnProviderGetTaskItemListV2ResponseDataItemsInnerStarAdUniteItemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

