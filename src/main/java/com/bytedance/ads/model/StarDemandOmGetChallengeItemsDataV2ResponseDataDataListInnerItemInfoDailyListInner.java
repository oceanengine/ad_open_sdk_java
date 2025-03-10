/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner {
  public static final String SERIALIZED_NAME_EST_AD_COST = "est_ad_cost";
  @SerializedName(SERIALIZED_NAME_EST_AD_COST)
  private Long estAdCost = null;

  public static final String SERIALIZED_NAME_EST_SALES = "est_sales";
  @SerializedName(SERIALIZED_NAME_EST_SALES)
  private Long estSales = null;

  public static final String SERIALIZED_NAME_P_DATE = "p_date";
  @SerializedName(SERIALIZED_NAME_P_DATE)
  private String pDate = null;

  public static final String SERIALIZED_NAME_SETTLE_AD_SHARE = "settle_ad_share";
  @SerializedName(SERIALIZED_NAME_SETTLE_AD_SHARE)
  private Long settleAdShare = null;

  public static final String SERIALIZED_NAME_SETTLE_CPS = "settle_cps";
  @SerializedName(SERIALIZED_NAME_SETTLE_CPS)
  private Long settleCps = null;

  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner() {
  }

  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner estAdCost(Long estAdCost) {
    
    this.estAdCost = estAdCost;
    return this;
  }

   /**
   * 预估广告消耗金额
   * @return estAdCost
  **/
  @javax.annotation.Nullable
  public Long getEstAdCost() {
    return estAdCost;
  }


  public void setEstAdCost(Long estAdCost) {
    this.estAdCost = estAdCost;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner estSales(Long estSales) {
    
    this.estSales = estSales;
    return this;
  }

   /**
   * 预估付费流水金额
   * @return estSales
  **/
  @javax.annotation.Nullable
  public Long getEstSales() {
    return estSales;
  }


  public void setEstSales(Long estSales) {
    this.estSales = estSales;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner pDate(String pDate) {
    
    this.pDate = pDate;
    return this;
  }

   /**
   * 数据格式&#39;YYYYMMDD&#39;，如：&#39;20240305&#39;
   * @return pDate
  **/
  @javax.annotation.Nullable
  public String getpDate() {
    return pDate;
  }


  public void setpDate(String pDate) {
    this.pDate = pDate;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner settleAdShare(Long settleAdShare) {
    
    this.settleAdShare = settleAdShare;
    return this;
  }

   /**
   * 已发放达人广告分成金额
   * @return settleAdShare
  **/
  @javax.annotation.Nullable
  public Long getSettleAdShare() {
    return settleAdShare;
  }


  public void setSettleAdShare(Long settleAdShare) {
    this.settleAdShare = settleAdShare;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner settleCps(Long settleCps) {
    
    this.settleCps = settleCps;
    return this;
  }

   /**
   * 已发放达人付费分佣金额
   * @return settleCps
  **/
  @javax.annotation.Nullable
  public Long getSettleCps() {
    return settleCps;
  }


  public void setSettleCps(Long settleCps) {
    this.settleCps = settleCps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner starDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner = (StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner) o;
    return Objects.equals(this.estAdCost, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.estAdCost) &&
        Objects.equals(this.estSales, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.estSales) &&
        Objects.equals(this.pDate, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.pDate) &&
        Objects.equals(this.settleAdShare, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.settleAdShare) &&
        Objects.equals(this.settleCps, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.settleCps);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(estAdCost, estSales, pDate, settleAdShare, settleCps);
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
    sb.append("class StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner {\n");
    sb.append("    estAdCost: ").append(toIndentedString(estAdCost)).append("\n");
    sb.append("    estSales: ").append(toIndentedString(estSales)).append("\n");
    sb.append("    pDate: ").append(toIndentedString(pDate)).append("\n");
    sb.append("    settleAdShare: ").append(toIndentedString(settleAdShare)).append("\n");
    sb.append("    settleCps: ").append(toIndentedString(settleCps)).append("\n");
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
    openapiFields.add("est_ad_cost");
    openapiFields.add("est_sales");
    openapiFields.add("p_date");
    openapiFields.add("settle_ad_share");
    openapiFields.add("settle_cps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner
  */
  public static StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInnerItemInfoDailyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

